package p153l;

import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.mipush.sdk.EnumC14874v;
import com.xiaomi.push.EnumC14893gk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class u2r0 {

    /* JADX INFO: renamed from: a */
    private static HashMap<EnumC14868d, C20470b> f177236a = new HashMap<>();

    /* JADX INFO: renamed from: l.u2r0$a */
    public static /* synthetic */ class C20469a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f177237a;

        static {
            int[] iArr = new int[EnumC14868d.values().length];
            f177237a = iArr;
            try {
                iArr[EnumC14868d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f177237a[EnumC14868d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f177237a[EnumC14868d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f177237a[EnumC14868d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.u2r0$b */
    public static class C20470b {

        /* JADX INFO: renamed from: a */
        public String f177238a;

        /* JADX INFO: renamed from: b */
        public String f177239b;

        public C20470b(String str, String str2) {
            this.f177238a = str;
            this.f177239b = str2;
        }
    }

    static {
        m194299d(EnumC14868d.ASSEMBLE_PUSH_HUAWEI, new C20470b("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m194299d(EnumC14868d.ASSEMBLE_PUSH_FCM, new C20470b("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m194299d(EnumC14868d.ASSEMBLE_PUSH_COS, new C20470b("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m194299d(EnumC14868d.ASSEMBLE_PUSH_FTOS, new C20470b("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14874v m194296a(EnumC14868d enumC14868d) {
        int i = C20469a.f177237a[enumC14868d.ordinal()];
        if (i == 1) {
            return EnumC14874v.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return EnumC14874v.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return EnumC14874v.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return EnumC14874v.UPLOAD_FTOS_TOKEN;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC14893gk m194297b(EnumC14868d enumC14868d) {
        return EnumC14893gk.AggregatePushSwitch;
    }

    /* JADX INFO: renamed from: c */
    public static C20470b m194298c(EnumC14868d enumC14868d) {
        return f177236a.get(enumC14868d);
    }

    /* JADX INFO: renamed from: d */
    private static void m194299d(EnumC14868d enumC14868d, C20470b c20470b) {
        if (c20470b != null) {
            f177236a.put(enumC14868d, c20470b);
        }
    }
}
