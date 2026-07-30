package p149l;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class hxe extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f109860a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy("sInstanceLock")
    public static volatile Editable.Factory f109861b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Class<?> f109862c;

    @SuppressLint({"PrivateApi"})
    public hxe() {
        try {
            f109862c = hxe.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f109861b == null) {
            synchronized (f109860a) {
                try {
                    if (f109861b == null) {
                        f109861b = new hxe();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109861b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f109862c;
        return cls != null ? lmf0.m150570c(cls, charSequence) : super.newEditable(charSequence);
    }
}
