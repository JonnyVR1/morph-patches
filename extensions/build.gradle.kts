plugins {
    id("com.android.library")
}

android {
    namespace = "com.p1.mobile.putong.data.extension"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    compileOnly("com.google.android:android:4.1.1.4")
}
