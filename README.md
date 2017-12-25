# NoDamage Plugin
[![SpigotMC 1.12.2](https://img.shields.io/badge/SpigotMC-1.12.2-brightgreen.svg)](https://www.spigotmc.org/wiki/spigot/)
[![Build Status](https://travis-ci.org/frklan/NoDamage.svg?branch=master)](https://travis-ci.org/frklan/NoDamage)
[![GitHub release](https://img.shields.io/github/release/frklan/NoDamage.svg)](https://github.com/frklan/NoDamage/releases)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/frklan/NoDamage/issues)
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](https://github.com/frklan/NoDamage/blob/master/LICENSE)

A SpigotMC server plugin that keeps the player at max health, a quick solution to avoid damage or death on a lobby server.

## Compiling the source

### Prerequisites

* Java 8 SDK
* Apached Maven
* Eclipse Oxygen (not required, but helpfull if you whish to edit the source)

### Compiling

To compile issue the following commands

````
$ git clone git@github.com:frklan/NoDamage.git
$ cd NoDamage
$ mvn package
````
Copy the jar file from ```target``` to your spigot server's plugin folder.

## Running

### Prerequisites

* Java 8
* A [SpigotMC](https://www.spigotmc.org/wiki/spigot/) server

### Installing
Copy the jar file to your server's plugin folder and restart the server.

### Permissions
Health is keept at max without any permission (remove plugin to disable), if the user has ```nodamage.glow``` set to true he/she will be glowing.

## Plugin Stats

The plugin is using the [bStat](https://github.com/BtoBastian/bStats-Metrics) metric classes by [Bastian Oppermann](https://github.com/BtoBastian) to gather a bunch of usage statistics. See this [link](https://bstats.org/plugin/bukkit/NoDamage) for current up to date data.

## Contributing

Contributions are always welcome!

When contributing to this repository, please first discuss the change you wish to make via the issue tracker, email, or any other method with the owner of this repository before making a change.

Please note that we have a code of conduct, you are required to follow it in all your interactions with the project.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/frklan/Teleport2Lobby/tags).

## Authors

* **Fredrik Andersson** - *Initial work* - [frklan](https://github.com/frklan)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* The creators of BungeeCord and SpigotMC
* README based on [PurpleBooth's](https://github.com/PurpleBooth) template
* [bStat](https://github.com/BtoBastian/bStats-Metrics) by [Bastian Oppermann](https://github.com/BtoBastian)




[![HitCount](http://hits.dwyl.io/frklan/NoDamage.svg)]()
