package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.Method

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private const val RETURN_VOID = "return-void"

private const val RETURN_MAX_INT = """
    const v0, 0x7fffffff
    return v0
"""

private const val RETURN_MIN_INT = """
    const v0, 0x0
    return v0
"""

@Suppress("unused")
@JvmField
val searchDiscoveryPatch = bytecodePatch(
    name = "Search Discovery",
    description = "Expands search filters: unlimited distance, full age range (18-100)",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        // Patch SearchRadius to allow unlimited distance
        classDefByOrNull("Lcom/p1/mobile/putong/data/SearchRadius;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                
                // Patch getters for allowedMaximum to return max int (unlimited)
                if (method.name == "getAllowedMaximum" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x7fffffff
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
                
                // Patch getters for value to return max int (unlimited distance)
                if (method.name == "getValue" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x7fffffff
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
            }
        }

        // Patch SearchAge to allow full age range (18-100)
        classDefByOrNull("Lcom/p1/mobile/putong/data/SearchAge;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                
                // Patch allowedMinimum to return 18
                if (method.name == "getAllowedMinimum" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x12
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
                
                // Patch allowedMaximum to return 100
                if (method.name == "getAllowedMaximum" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x64
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
                
                // Patch minimum to return 18
                if (method.name == "getMinimum" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x12
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
                
                // Patch maximum to return 100
                if (method.name == "getMaximum" && 
                    method.returnType == "Ljava/lang/Integer;" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, """
                        const v0, 0x64
                        invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
                        move-result-object v0
                        return-object v0
                    """)
                }
            }
        }
    }
}
