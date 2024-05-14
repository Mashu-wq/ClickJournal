plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.clickjournal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.clickjournal"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.google.android.material:material:1.3.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("me.zhanghai.android.materialprogressbar:library:1.6.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("com.google.firebase:firebase-auth:21.0.1")
    implementation("com.google.firebase:firebase-database:20.0.3")
    // Firebase Firestore
    implementation("com.google.firebase:firebase-firestore:24.0.0")

// Firebase Storage
    implementation("com.google.firebase:firebase-storage:20.0.0")
    implementation("com.theartofdev.edmodo:android-image-cropper:2.8.0")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.github.jorgecastilloprz:fabprogresscircle:1.01@aar")
    implementation("com.like:likebutton:0.2.3")





}