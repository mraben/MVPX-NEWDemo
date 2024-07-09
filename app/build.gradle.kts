plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mvpxnew"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mvpxnew"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava:2.3.0")
    implementation ("io.reactivex:rxjava:1.3.0")
    implementation ("io.reactivex:rxandroid:1.2.1")
    implementation ("com.squareup.okhttp3:okhttp:3.12.11")
    implementation ("com.squareup.okio:okio:2.6.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:3.4.1")
    implementation ("com.squareup.okhttp3:okhttp-urlconnection:3.2.0")
    implementation ("com.google.code.gson:gson:2.10")
    implementation ("io.github.h07000223:flycoTabLayout:3.0.0")
}