# JarJar
I think Gradle and Maven are far too slow for simple tinly projects, so this is just an example project to show how to build a project into a jar that itself depends on jars in one step.

Run:
`chmod +x build.sh`
You can now build:
`./build.sh`
Clean:
`chmod +x clean.sh`
`./clean.sh`

Add jar dependencies into libs folder.

Add a `build/com` directory because git won't pay attention to the empty folder.
