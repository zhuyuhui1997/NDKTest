//
// Created by zyh on 16-8-16.
//

#include   "com_example_zyh_ndktest_Ndk.h"
JNIEXPORT jstring JNICALL Java_com_example_zyh_ndktest_Ndk_getCLanguageString(JNIEnv *env ,jobject obj)
{
     return (*env)-> NewStringUTF(env,"hello");


}