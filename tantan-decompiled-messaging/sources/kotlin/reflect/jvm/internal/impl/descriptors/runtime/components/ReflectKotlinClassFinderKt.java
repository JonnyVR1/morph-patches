package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.C15386d;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: renamed from: b */
    public static final String m88956b(ClassId classId) {
        String strM93478E = C15386d.m93478E(classId.m91039g().m91046a(), '.', '$', false, 4, null);
        if (classId.m91038f().m91048c()) {
            return strM93478E;
        }
        return classId.m91038f() + '.' + strM93478E;
    }
}
