package app.morphe

import app.morphe.patcher.Patcher
import app.morphe.patcher.PatcherConfig
import app.morphe.patcher.apk.ApkMerger
import app.morphe.patcher.apk.ApkUtils
import app.morphe.patcher.apk.ApkUtils.applyTo
import kotlinx.coroutines.runBlocking
import java.io.File

fun main(args: Array<String>) {
    require(args.size >= 2) {
        "Usage: PatcherMain <input-apk> <output-apk>"
    }

    val inputApk = File(args[0])
    val outputApk = File(args[1])

    require(inputApk.exists()) { "Input APK not found: ${inputApk.absolutePath}" }

    val tempDir = File(System.getProperty("java.io.tmpdir"), "morphe-patcher-${System.currentTimeMillis()}")
    tempDir.mkdirs()

    try {
        val patches = PatchRegistry.allPatches
        println("Loaded ${patches.size} patches from registry")

        println("Patching ${inputApk.name}...")
        val patcherResult = Patcher(
            PatcherConfig(
                apkFile = inputApk,
                temporaryFilesPath = tempDir,
                aaptBinaryPath = "",
                frameworkFileDirectory = tempDir.absolutePath,
            )
        ).use { patcher ->
            patcher += patches

            runBlocking {
                patcher().collect { result ->
                    if (result.exception != null) {
                        System.err.println("  FAILED: ${result.patch.name}")
                        result.exception?.printStackTrace()
                    } else {
                        println("  OK: ${result.patch.name}")
                    }
                }
            }

            patcher.get()
        }

        val rebuiltApk = File(tempDir, "patched.apk")
        inputApk.copyTo(rebuiltApk, overwrite = true)
        patcherResult.applyTo(rebuiltApk)

        val mergedApk = File(tempDir, "merged.apk")
        println("Rebuilding APK to fix ZIP structure...")
        ApkMerger().merge(rebuiltApk, mergedApk)

        val keystoreFile = File(tempDir, "morphe.keystore")
        ApkUtils.signApk(
            mergedApk,
            outputApk,
            "v3",
            ApkUtils.KeyStoreDetails(
                keystoreFile,
                "Morphe",
                "Morphe",
                "",
            )
        )

        println("Patched APK saved to ${outputApk.absolutePath}")
    } finally {
        tempDir.deleteRecursively()
    }
}
