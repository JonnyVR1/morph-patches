package com.p335p1.mobile.putong.data

import app.morphe.PatchRegistry
import app.morphe.patcher.Patcher
import app.morphe.patcher.PatcherConfig
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertNull

class PatchVerificationTest {

    private val apkFile = File("../tantan-tribe-extracted/com.tantantribe.tribe.apk")

    private val allPatches = PatchRegistry.allPatches

    @Test
    fun `all patches apply successfully to Tantan APK`() {
        assertTrue(apkFile.exists(), "APK file must exist at ${apkFile.absolutePath}")

        val results = mutableMapOf<String, Throwable?>()

        Patcher(PatcherConfig(apkFile = apkFile)).use { patcher ->
            patcher += allPatches

            runBlocking {
                patcher().collect { result ->
                    results[result.patch.name ?: "unknown"] = result.exception
                }
            }
        }

        results.forEach { (name, exception) ->
            assertNull(exception, "Patch '$name' should succeed but failed: ${exception?.message}")
        }

        assertTrue(results.size == allPatches.size, "Expected ${allPatches.size} results but got ${results.size}")
    }

    @Test
    fun `settings patches apply successfully`() {
        assertTrue(apkFile.exists(), "APK file must exist at ${apkFile.absolutePath}")

        val settingsPatches = setOf(
            settingsSupremePartnerPatch,
            settingsPlatinumPatch,
            settingsODiamondPatch,
            settingsDisableAdsPatch,
        )

        val results = mutableMapOf<String, Throwable?>()

        Patcher(PatcherConfig(apkFile = apkFile)).use { patcher ->
            patcher += settingsPatches

            runBlocking {
                patcher().collect { result ->
                    results[result.patch.name ?: "unknown"] = result.exception
                }
            }
        }

        results.forEach { (name, exception) ->
            assertNull(exception, "Settings patch '$name' should succeed but failed: ${exception?.message}")
        }
    }

    @Test
    fun `user patches apply successfully`() {
        assertTrue(apkFile.exists(), "APK file must exist at ${apkFile.absolutePath}")

        val userPatches = setOf(
            userIsVipPatch,
            userIsSvipPatch,
            userIsUltraPremiumPatch,
            userIsSupremePartnerPatch,
            userIsPlatinumPatch,
            userIsODiamondPatch,
            userIsMembershipPatch,
            userIsMembershipUsedPatch,
            userIsVipExpiredPatch,
        )

        val results = mutableMapOf<String, Throwable?>()

        Patcher(PatcherConfig(apkFile = apkFile)).use { patcher ->
            patcher += userPatches

            runBlocking {
                patcher().collect { result ->
                    results[result.patch.name ?: "unknown"] = result.exception
                }
            }
        }

        results.forEach { (name, exception) ->
            assertNull(exception, "User patch '$name' should succeed but failed: ${exception?.message}")
        }
    }
}
