package p153l;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class lye extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f134050a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy("sInstanceLock")
    public static volatile Editable.Factory f134051b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Class<?> f134052c;

    @SuppressLint({"PrivateApi"})
    public lye() {
        try {
            f134052c = lye.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f134051b == null) {
            synchronized (f134050a) {
                try {
                    if (f134051b == null) {
                        f134051b = new lye();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f134051b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f134052c;
        return cls != null ? uuf0.m198198c(cls, charSequence) : super.newEditable(charSequence);
    }
}
