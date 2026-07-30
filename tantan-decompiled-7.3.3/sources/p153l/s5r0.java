package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C14867c;
import com.xiaomi.mipush.sdk.C14871l;
import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.push.C14903gu;
import com.xiaomi.push.C14904gv;
import com.xiaomi.push.C14905gw;
import com.xiaomi.push.C14910ha;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14916hg;
import com.xiaomi.push.C14917hh;
import com.xiaomi.push.C14918hi;
import com.xiaomi.push.C14920hk;
import com.xiaomi.push.C14922hm;
import com.xiaomi.push.C14924ho;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.InterfaceC14925hq;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class s5r0 {

    /* JADX INFO: renamed from: l.s5r0$a */
    public static /* synthetic */ class C19992a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f166504a;

        static {
            int[] iArr = new int[EnumC14888gf.values().length];
            f166504a = iArr;
            try {
                iArr[EnumC14888gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f166504a[EnumC14888gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f166504a[EnumC14888gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f166504a[EnumC14888gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f166504a[EnumC14888gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f166504a[EnumC14888gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f166504a[EnumC14888gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f166504a[EnumC14888gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f166504a[EnumC14888gf.Notification.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f166504a[EnumC14888gf.Command.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m184806a(Context context, T t, EnumC14888gf enumC14888gf) {
        return m184807b(context, t, enumC14888gf, !enumC14888gf.equals(EnumC14888gf.Registration), context.getPackageName(), C14867c.m86499c(context).m86502d());
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m184807b(Context context, T t, EnumC14888gf enumC14888gf, boolean z, String str, String str2) {
        return m184808c(context, t, enumC14888gf, z, str, str2, true);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m184808c(Context context, T t, EnumC14888gf enumC14888gf, boolean z, String str, String str2, boolean z2) {
        byte[] bArrM87448e = C14936m.m87448e(t);
        if (bArrM87448e == null) {
            ouq0.m169393m("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        C14911hb c14911hb = new C14911hb();
        if (z) {
            String strM86517t = C14867c.m86499c(context).m86517t();
            if (TextUtils.isEmpty(strM86517t)) {
                ouq0.m169393m("regSecret is empty, return null");
                return null;
            }
            try {
                bArrM87448e = g3r0.m128758c(ptq0.m173774b(strM86517t), bArrM87448e);
            } catch (Exception unused) {
                ouq0.m169378B("encryption error. ");
            }
        }
        C14903gu c14903gu = new C14903gu();
        c14903gu.f63052a = 5L;
        c14903gu.f63053a = "fakeid";
        c14911hb.m87080a(c14903gu);
        c14911hb.m87082a(ByteBuffer.wrap(bArrM87448e));
        c14911hb.m87078a(enumC14888gf);
        c14911hb.m87091b(z2);
        c14911hb.m87090b(str);
        c14911hb.m87083a(z);
        c14911hb.m87081a(str2);
        return c14911hb;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC14925hq m184809d(Context context, C14911hb c14911hb) {
        byte[] bArrM87089a;
        if (c14911hb.m87094b()) {
            byte[] bArrM161138j = n1r0.m161138j(context, c14911hb, EnumC14868d.ASSEMBLE_PUSH_FCM);
            if (bArrM161138j == null) {
                bArrM161138j = ptq0.m173774b(C14867c.m86499c(context).m86517t());
            }
            try {
                bArrM87089a = g3r0.m128757b(bArrM161138j, c14911hb.m87089a());
            } catch (Exception e) {
                throw new C14871l("the aes decrypt failed.", e);
            }
        } else {
            bArrM87089a = c14911hb.m87089a();
        }
        InterfaceC14925hq interfaceC14925hqM184810e = m184810e(c14911hb.m87076a(), c14911hb.f63201b);
        if (interfaceC14925hqM184810e != null) {
            C14936m.m87447d(interfaceC14925hqM184810e, bArrM87089a);
        }
        return interfaceC14925hqM184810e;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC14925hq m184810e(EnumC14888gf enumC14888gf, boolean z) {
        switch (C19992a.f166504a[enumC14888gf.ordinal()]) {
            case 1:
                return new C14916hg();
            case 2:
                return new C14922hm();
            case 3:
                return new C14920hk();
            case 4:
                return new C14924ho();
            case 5:
                return new C14918hi();
            case 6:
                return new C14904gv();
            case 7:
                return new C14910ha();
            case 8:
                return new C14917hh();
            case 9:
                if (z) {
                    return new C14914he();
                }
                C14905gw c14905gw = new C14905gw();
                c14905gw.m86989a(true);
                return c14905gw;
            case 10:
                return new C14910ha();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T extends InterfaceC14925hq<T, ?>> C14911hb m184811f(Context context, T t, EnumC14888gf enumC14888gf, boolean z, String str, String str2) {
        return m184808c(context, t, enumC14888gf, z, str, str2, false);
    }
}
