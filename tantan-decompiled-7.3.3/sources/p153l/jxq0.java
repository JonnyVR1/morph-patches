package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14905gw;
import com.xiaomi.push.C14908gz;
import com.xiaomi.push.C14910ha;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14880ed;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.InterfaceC14925hq;

/* JADX INFO: loaded from: classes2.dex */
public class jxq0 {

    /* JADX INFO: renamed from: l.jxq0$a */
    public static /* synthetic */ class C18053a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f123069a;

        static {
            int[] iArr = new int[EnumC14888gf.values().length];
            f123069a = iArr;
            try {
                iArr[EnumC14888gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123069a[EnumC14888gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123069a[EnumC14888gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123069a[EnumC14888gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123069a[EnumC14888gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f123069a[EnumC14888gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f123069a[EnumC14888gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f123069a[EnumC14888gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f123069a[EnumC14888gf.MultiConnectionBroadcast.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f123069a[EnumC14888gf.MultiConnectionResult.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f123069a[EnumC14888gf.Notification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f123069a[EnumC14888gf.Command.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m147389a(Context context, int i) {
        int iM170383a = p2r0.m170383a(context);
        if (-1 == iM170383a) {
            return -1;
        }
        return (i * (iM170383a == 0 ? 13 : 11)) / 10;
    }

    /* JADX INFO: renamed from: b */
    public static int m147390b(EnumC14888gf enumC14888gf) {
        return szq0.m188664a(enumC14888gf.m86771a());
    }

    /* JADX INFO: renamed from: c */
    public static int m147391c(InterfaceC14925hq interfaceC14925hq, EnumC14888gf enumC14888gf) {
        int iM188664a;
        switch (C18053a.f123069a[enumC14888gf.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return szq0.m188664a(enumC14888gf.m86771a());
            case 11:
                iM188664a = szq0.m188664a(enumC14888gf.m86771a());
                if (interfaceC14925hq != null) {
                    try {
                        if (interfaceC14925hq instanceof C14905gw) {
                            String str = ((C14905gw) interfaceC14925hq).f63119d;
                            if (!TextUtils.isEmpty(str) && szq0.m188665b(szq0.m188667d(str)) != -1) {
                                return szq0.m188665b(szq0.m188667d(str));
                            }
                        } else if (interfaceC14925hq instanceof C14914he) {
                            String str2 = ((C14914he) interfaceC14925hq).f63234d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (szq0.m188665b(szq0.m188667d(str2)) != -1) {
                                    iM188664a = szq0.m188665b(szq0.m188667d(str2));
                                }
                                if (EnumC14898gp.UploadTinyData.equals(szq0.m188667d(str2))) {
                                    return -1;
                                }
                                return iM188664a;
                            }
                        }
                    } catch (Exception unused) {
                        ouq0.m169378B("PERF_ERROR : parse Notification type error");
                    }
                }
                return iM188664a;
            case 12:
                iM188664a = szq0.m188664a(enumC14888gf.m86771a());
                if (interfaceC14925hq != null) {
                    try {
                        if (interfaceC14925hq instanceof C14910ha) {
                            String strM87063b = ((C14910ha) interfaceC14925hq).m87063b();
                            if (!TextUtils.isEmpty(strM87063b) && EnumC14880ed.m86697a(strM87063b) != -1) {
                                return EnumC14880ed.m86697a(strM87063b);
                            }
                        } else if (interfaceC14925hq instanceof C14908gz) {
                            String strM87022a = ((C14908gz) interfaceC14925hq).m87022a();
                            if (!TextUtils.isEmpty(strM87022a) && EnumC14880ed.m86697a(strM87022a) != -1) {
                                return EnumC14880ed.m86697a(strM87022a);
                            }
                        }
                    } catch (Exception unused2) {
                        ouq0.m169378B("PERF_ERROR : parse Command type error");
                        break;
                    }
                }
                return iM188664a;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147392d(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int iM147389a = m147389a(context, i2);
        if (i != szq0.m188665b(EnumC14898gp.UploadTinyData)) {
            tzq0.m193695a(context.getApplicationContext()).m193697b(str, i, 1L, iM147389a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m147393e(String str, Context context, C14911hb c14911hb, int i) {
        EnumC14888gf enumC14888gfM87076a;
        if (context == null || c14911hb == null || (enumC14888gfM87076a = c14911hb.m87076a()) == null) {
            return;
        }
        int iM147390b = m147390b(enumC14888gfM87076a);
        if (i <= 0) {
            byte[] bArrM87448e = C14936m.m87448e(c14911hb);
            i = bArrM87448e != null ? bArrM87448e.length : 0;
        }
        m147392d(str, context, iM147390b, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m147394f(String str, Context context, InterfaceC14925hq interfaceC14925hq, EnumC14888gf enumC14888gf, int i) {
        m147392d(str, context, m147391c(interfaceC14925hq, enumC14888gf), i);
    }

    /* JADX INFO: renamed from: g */
    public static void m147395g(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        C14911hb c14911hb = new C14911hb();
        try {
            C14936m.m87447d(c14911hb, bArr);
            m147393e(str, context, c14911hb, bArr.length);
        } catch (C14926hu unused) {
            ouq0.m169393m("fail to convert bytes to container");
        }
    }
}
