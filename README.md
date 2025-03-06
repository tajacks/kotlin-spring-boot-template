# Kotlin + SpringBoot Template Repository

This repository is one of two components demonstrating how to use a git submodule as a parent POM.

It is also a convenient starter for weekend projects and the like.

### Example Usage

The parent POM repository where the versions are defined can be found 
[here](https://github.com/tajacks/kotlin-spring-boot-parent).

After cloning this repository locally, the git submodule must be initialized.

```
git submodule update --init
```

### Upgrading the Parent POM

Once a new release is tagged of the parent POM, it can be upgraded in any child repositories that 
reference it.

```shell
cd maven-parent
git fetch --tags
git checkout $DESIRED_TAG_VERSION
cd ..
# Edit pom.xml version as well
git add maven-parent/ pom.xml
git commit -m 'Bump parent POM version'
```
