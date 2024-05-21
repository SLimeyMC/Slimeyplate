architectury {
    common(property("enabled_platforms").toString().split(","))
}

loom {
    accessWidenerPath = file("src/main/resources/slimeyplate.accesswidener")
}

repositories {
    // Do some insane thing here
}

dependencies {
    // We depend on fabric loader here to use the fabric @Environment annotations and get the mixin dependencies
    // Do NOT use other classes from fabric loader
    modImplementation(libs.fabric)

    // Architectury API
    modApi(libs.common.architectury)

    // Valkyrien Skies 2
    modApi(libs.common.valkyrienskies)

    // VS Core
    compileOnly(libs.bundles.core.valkyrienskies)

    modImplementation(libs.fabric.obsidianui)

    modImplementation(libs.common.kubejs)
}

publishing {
    publishMods {
        changelog = "# Markdown changelog content"
        type = STABLE
    }
}