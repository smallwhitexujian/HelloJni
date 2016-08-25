//
// Created by 许健 on 16/8/25.
//
#include "com_org_hellojni_HelloJni.h"

JNIEXPORT jstring JNICALL Java_com_org_hellojni_HelloJni_getClanguageString
(JNIEnv *env, jobject obj){
return (*env)->NewStringUTF(env,"HelloWorld!");
}