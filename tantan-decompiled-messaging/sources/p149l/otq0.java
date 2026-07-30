package p149l;

import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.mipush.sdk.EnumC14726v;
import com.xiaomi.push.EnumC14745gk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class otq0 {

    /* JADX INFO: renamed from: a */
    private static HashMap<EnumC14720d, C19042b> f145613a = new HashMap<>();

    /* JADX INFO: renamed from: l.otq0$a */
    public static /* synthetic */ class C19041a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f145614a;

        static {
            int[] iArr = new int[EnumC14720d.values().length];
            f145614a = iArr;
            try {
                iArr[EnumC14720d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f145614a[EnumC14720d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f145614a[EnumC14720d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f145614a[EnumC14720d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.otq0$b */
    public static class C19042b {

        /* JADX INFO: renamed from: a */
        public String f145615a;

        /* JADX INFO: renamed from: b */
        public String f145616b;

        public C19042b(String str, String str2) {
            this.f145615a = str;
            this.f145616b = str2;
        }
    }

    static {
        m165967d(EnumC14720d.ASSEMBLE_PUSH_HUAWEI, new C19042b("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m165967d(EnumC14720d.ASSEMBLE_PUSH_FCM, new C19042b("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m165967d(EnumC14720d.ASSEMBLE_PUSH_COS, new C19042b("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m165967d(EnumC14720d.ASSEMBLE_PUSH_FTOS, new C19042b("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14726v m165964a(EnumC14720d enumC14720d) {
        int i = C19041a.f145614a[enumC14720d.ordinal()];
        if (i == 1) {
            return EnumC14726v.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return EnumC14726v.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return EnumC14726v.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return EnumC14726v.UPLOAD_FTOS_TOKEN;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC14745gk m165965b(EnumC14720d enumC14720d) {
        return EnumC14745gk.AggregatePushSwitch;
    }

    /* JADX INFO: renamed from: c */
    public static C19042b m165966c(EnumC14720d enumC14720d) {
        return f145613a.get(enumC14720d);
    }

    /* JADX INFO: renamed from: d */
    private static void m165967d(EnumC14720d enumC14720d, C19042b c19042b) {
        if (c19042b != null) {
            f145613a.put(enumC14720d, c19042b);
        }
    }
}
