package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimplePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65610a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TargetPlatformVersion f65611b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m91128a() {
        return m91129b().getDescription();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public TargetPlatformVersion m91129b() {
        return this.f65611b;
    }

    @NotNull
    public String toString() {
        String strM91128a = m91128a();
        int length = strM91128a.length();
        String str = this.f65610a;
        if (length <= 0) {
            return str;
        }
        return str + " (" + strM91128a + ')';
    }
}
