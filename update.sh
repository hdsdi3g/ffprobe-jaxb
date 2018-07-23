#!/bin/sh

LANG="en_US.UTF-8"
xjc -d src/main/java -no-header -encoding UTF-8 -p org.ffmpeg.ffprobe https://raw.githubusercontent.com/FFmpeg/FFmpeg/n4.0.2/doc/ffprobe.xsd

