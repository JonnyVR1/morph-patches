package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/bkw;", "", "<init>", "()V", "", "localVersion", "configVersion", "", "a", "(JJ)Z", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class bkw {
    public static final bkw INSTANCE = new bkw();

    private bkw() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m104864a(long localVersion, long configVersion) {
        jzv.m147728a("MKFepUtils", "localVersion: " + localVersion + " configVersion: " + configVersion);
        return localVersion / 10 == configVersion / 10;
    }
}
