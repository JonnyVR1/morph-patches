package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimplePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66284a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TargetPlatformVersion f66285b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m92019a() {
        return m92020b().getDescription();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public TargetPlatformVersion m92020b() {
        return this.f66285b;
    }

    @NotNull
    public String toString() {
        String strM92019a = m92019a();
        int length = strM92019a.length();
        String str = this.f66284a;
        if (length <= 0) {
            return str;
        }
        return str + " (" + strM92019a + ')';
    }
}
