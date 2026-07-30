package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PatchExecutor extends Thread {
    private static final String ROBUST_PATCH_CACHE_DIR = "patch_cache";
    protected Context context;
    protected PatchManipulate patchManipulate;
    protected RobustCallBack robustCallBack;

    public PatchExecutor(Context context, PatchManipulate patchManipulate, RobustCallBack robustCallBack) {
        this.context = context.getApplicationContext();
        this.patchManipulate = patchManipulate;
        this.robustCallBack = robustCallBack;
    }

    private static File getPatchCacheDirPath(Context context, String str) {
        File dir = context.getDir(ROBUST_PATCH_CACHE_DIR + str, 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }

    public void applyPatchList(List<Patch> list) {
        boolean zPatch;
        if (list == null || list.isEmpty()) {
            return;
        }
        list.size();
        for (Patch patch : list) {
            if (patch.isAppliedSuccess()) {
                patch.getLocalPath();
            } else if (this.patchManipulate.ensurePatchExist(patch)) {
                try {
                    zPatch = patch(this.context, patch);
                } catch (Throwable th) {
                    this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:applyPatchList line:69");
                    zPatch = false;
                }
                if (zPatch) {
                    patch.setAppliedSuccess(true);
                    this.robustCallBack.onPatchApplied(true, patch);
                } else {
                    this.robustCallBack.onPatchApplied(false, patch);
                }
                patch.getLocalPath();
            }
        }
    }

    public List<Patch> fetchPatchList() {
        return this.patchManipulate.fetchPatchList(this.context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public boolean patch(Context context, Patch patch) {
        DexClassLoader dexClassLoader;
        PatchesInfo patchesInfo;
        boolean z;
        Object obj;
        Field field;
        boolean z2 = false;
        if (!this.patchManipulate.verifyPatch(context, patch)) {
            this.robustCallBack.logNotify("verifyPatch failure, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:107");
            return false;
        }
        Object obj2 = null;
        try {
            dexClassLoader = new DexClassLoader(patch.getTempPath(), getPatchCacheDirPath(context, patch.getName() + patch.getMd5()).getAbsolutePath(), null, PatchExecutor.class.getClassLoader());
        } catch (Throwable th) {
            th.printStackTrace();
            dexClassLoader = null;
        }
        if (dexClassLoader == null) {
            return false;
        }
        try {
            patch.getPatchesInfoImplClassFullName();
            patchesInfo = (PatchesInfo) dexClassLoader.loadClass(patch.getPatchesInfoImplClassFullName()).newInstance();
        } catch (Throwable th2) {
            Log.e("robust", "patch failed 188 ", th2);
            patchesInfo = null;
        }
        if (patchesInfo == null) {
            this.robustCallBack.logNotify("patchesInfo is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:114");
            return false;
        }
        List<PatchedClassInfo> patchedClassesInfo = patchesInfo.getPatchedClassesInfo();
        if (patchedClassesInfo != null && !patchedClassesInfo.isEmpty()) {
            boolean z3 = false;
            for (PatchedClassInfo patchedClassInfo : patchedClassesInfo) {
                String str = patchedClassInfo.patchedClassName;
                String str2 = patchedClassInfo.patchClassName;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    z = z2;
                    obj = obj2;
                    this.robustCallBack.logNotify("patchedClasses or patchClassName is empty, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:131");
                } else {
                    try {
                        try {
                            Class<?> clsLoadClass = dexClassLoader.loadClass(str.trim());
                            Field[] declaredFields = clsLoadClass.getDeclaredFields();
                            clsLoadClass.toString();
                            int length = declaredFields.length;
                            int length2 = declaredFields.length;
                            ?? r15 = z2;
                            while (true) {
                                if (r15 >= length2) {
                                    z = z2;
                                    field = null;
                                    break;
                                }
                                Field field2 = declaredFields[r15];
                                z = z2;
                                try {
                                    try {
                                        if (TextUtils.equals(field2.getType().getCanonicalName(), ChangeQuickRedirect.class.getCanonicalName()) && TextUtils.equals(field2.getDeclaringClass().getCanonicalName(), clsLoadClass.getCanonicalName())) {
                                            field = field2;
                                            break;
                                        }
                                        z2 = z;
                                        obj2 = null;
                                        r15++;
                                    } catch (Throwable unused) {
                                        obj = null;
                                        Log.e("robust", "patch failed! ");
                                        obj2 = obj;
                                        z2 = z;
                                    }
                                } catch (Throwable unused2) {
                                    obj = obj2;
                                    Log.e("robust", "patch failed! ");
                                    obj2 = obj;
                                    z2 = z;
                                }
                            }
                            if (field == null) {
                                this.robustCallBack.logNotify("changeQuickRedirectField  is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:147");
                                obj = null;
                            } else {
                                try {
                                    Object objNewInstance = dexClassLoader.loadClass(str2).newInstance();
                                    field.setAccessible(true);
                                    obj = null;
                                    try {
                                        field.set(null, objNewInstance);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            Log.e("robust", "patch failed! ");
                                            this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:patch line:163");
                                        } catch (Throwable unused3) {
                                            Log.e("robust", "patch failed! ");
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = null;
                                }
                            }
                        } catch (Throwable unused4) {
                            z = z2;
                        }
                    } catch (ClassNotFoundException unused5) {
                        z = z2;
                        obj2 = obj2;
                        z3 = true;
                    }
                }
                obj2 = obj;
                z2 = z;
            }
            boolean z4 = z2;
            if (z3) {
                return z4;
            }
        }
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            applyPatchList(fetchPatchList());
        } catch (Throwable th) {
            Log.e("robust", "PatchExecutor run", th);
            this.robustCallBack.exceptionNotify(th, "class:PatchExecutor,method:run,line:36");
        }
    }
}
