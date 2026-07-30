package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.C15493d;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: renamed from: b */
    public static final String m89847b(ClassId classId) {
        String strM94369E = C15493d.m94369E(classId.m91930g().m91937a(), '.', '$', false, 4, null);
        if (classId.m91929f().m91939c()) {
            return strM94369E;
        }
        return classId.m91929f() + '.' + strM94369E;
    }
}
