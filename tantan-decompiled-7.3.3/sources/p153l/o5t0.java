package p153l;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes6.dex */
public final class o5t0 extends PathClassLoader {
    public o5t0(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
