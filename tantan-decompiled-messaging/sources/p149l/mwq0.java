package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14723l;
import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.push.C14755gu;
import com.xiaomi.push.C14756gv;
import com.xiaomi.push.C14757gw;
import com.xiaomi.push.C14762ha;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14768hg;
import com.xiaomi.push.C14769hh;
import com.xiaomi.push.C14770hi;
import com.xiaomi.push.C14772hk;
import com.xiaomi.push.C14774hm;
import com.xiaomi.push.C14776ho;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.InterfaceC14777hq;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class mwq0 {

    /* JADX INFO: renamed from: l.mwq0$a */
    public static /* synthetic */ class C18579a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f136082a;

        static {
            int[] iArr = new int[EnumC14740gf.values().length];
            f136082a = iArr;
            try {
                iArr[EnumC14740gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136082a[EnumC14740gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136082a[EnumC14740gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f136082a[EnumC14740gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f136082a[EnumC14740gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f136082a[EnumC14740gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f136082a[EnumC14740gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f136082a[EnumC14740gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f136082a[EnumC14740gf.Notification.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f136082a[EnumC14740gf.Command.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m156759a(Context context, T t, EnumC14740gf enumC14740gf) {
        return m156760b(context, t, enumC14740gf, !enumC14740gf.equals(EnumC14740gf.Registration), context.getPackageName(), C14719c.m85328c(context).m85331d());
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m156760b(Context context, T t, EnumC14740gf enumC14740gf, boolean z, String str, String str2) {
        return m156761c(context, t, enumC14740gf, z, str, str2, true);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m156761c(Context context, T t, EnumC14740gf enumC14740gf, boolean z, String str, String str2, boolean z2) {
        byte[] bArrM86277e = C14788m.m86277e(t);
        if (bArrM86277e == null) {
            ilq0.m137040m("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        C14763hb c14763hb = new C14763hb();
        if (z) {
            String strM85346t = C14719c.m85328c(context).m85346t();
            if (TextUtils.isEmpty(strM85346t)) {
                ilq0.m137040m("regSecret is empty, return null");
                return null;
            }
            try {
                bArrM86277e = auq0.m99036c(jkq0.m141908b(strM85346t), bArrM86277e);
            } catch (Exception unused) {
                ilq0.m137025B("encryption error. ");
            }
        }
        C14755gu c14755gu = new C14755gu();
        c14755gu.f62205a = 5L;
        c14755gu.f62206a = "fakeid";
        c14763hb.m85909a(c14755gu);
        c14763hb.m85911a(ByteBuffer.wrap(bArrM86277e));
        c14763hb.m85907a(enumC14740gf);
        c14763hb.m85920b(z2);
        c14763hb.m85919b(str);
        c14763hb.m85912a(z);
        c14763hb.m85910a(str2);
        return c14763hb;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC14777hq m156762d(Context context, C14763hb c14763hb) {
        byte[] bArrM85918a;
        if (c14763hb.m85923b()) {
            byte[] bArrM132796j = hsq0.m132796j(context, c14763hb, EnumC14720d.ASSEMBLE_PUSH_FCM);
            if (bArrM132796j == null) {
                bArrM132796j = jkq0.m141908b(C14719c.m85328c(context).m85346t());
            }
            try {
                bArrM85918a = auq0.m99035b(bArrM132796j, c14763hb.m85918a());
            } catch (Exception e) {
                throw new C14723l("the aes decrypt failed.", e);
            }
        } else {
            bArrM85918a = c14763hb.m85918a();
        }
        InterfaceC14777hq interfaceC14777hqM156763e = m156763e(c14763hb.m85905a(), c14763hb.f62354b);
        if (interfaceC14777hqM156763e != null) {
            C14788m.m86276d(interfaceC14777hqM156763e, bArrM85918a);
        }
        return interfaceC14777hqM156763e;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC14777hq m156763e(EnumC14740gf enumC14740gf, boolean z) {
        switch (C18579a.f136082a[enumC14740gf.ordinal()]) {
            case 1:
                return new C14768hg();
            case 2:
                return new C14774hm();
            case 3:
                return new C14772hk();
            case 4:
                return new C14776ho();
            case 5:
                return new C14770hi();
            case 6:
                return new C14756gv();
            case 7:
                return new C14762ha();
            case 8:
                return new C14769hh();
            case 9:
                if (z) {
                    return new C14766he();
                }
                C14757gw c14757gw = new C14757gw();
                c14757gw.m85818a(true);
                return c14757gw;
            case 10:
                return new C14762ha();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T extends InterfaceC14777hq<T, ?>> C14763hb m156764f(Context context, T t, EnumC14740gf enumC14740gf, boolean z, String str, String str2) {
        return m156761c(context, t, enumC14740gf, z, str, str2, false);
    }
}
