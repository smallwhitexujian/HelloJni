#!/usr/bin/env bash

NDK_PROJECT_PATH=../

function build_so(){
    ANDROID_MK=Android.mk
    APPLICATION_MK=Application.mk
    /Users/xujian/Documents/Android_eclipse/android_DEV/android-ndk-r12b/ndk-build -j8 NDK_TOOLCHAIN_VERSION=clang NDK_DEBUG=$1
    #-platforms
}
#set_env
DEBUG=1
RELEASE=0;
build_so $RELEASE
