package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14757gw;
import com.xiaomi.push.C14760gz;
import com.xiaomi.push.C14762ha;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14732ed;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.InterfaceC14777hq;

/* JADX INFO: loaded from: classes2.dex */
public class doq0 {

    /* JADX INFO: renamed from: l.doq0$a */
    public static /* synthetic */ class C16419a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f87189a;

        static {
            int[] iArr = new int[EnumC14740gf.values().length];
            f87189a = iArr;
            try {
                iArr[EnumC14740gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87189a[EnumC14740gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87189a[EnumC14740gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87189a[EnumC14740gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87189a[EnumC14740gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87189a[EnumC14740gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87189a[EnumC14740gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f87189a[EnumC14740gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f87189a[EnumC14740gf.MultiConnectionBroadcast.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f87189a[EnumC14740gf.MultiConnectionResult.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f87189a[EnumC14740gf.Notification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f87189a[EnumC14740gf.Command.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m112819a(Context context, int i) {
        int iM143159a = jtq0.m143159a(context);
        if (-1 == iM143159a) {
            return -1;
        }
        return (i * (iM143159a == 0 ? 13 : 11)) / 10;
    }

    /* JADX INFO: renamed from: b */
    public static int m112820b(EnumC14740gf enumC14740gf) {
        return mqq0.m155978a(enumC14740gf.m85600a());
    }

    /* JADX INFO: renamed from: c */
    public static int m112821c(InterfaceC14777hq interfaceC14777hq, EnumC14740gf enumC14740gf) {
        int iM155978a;
        switch (C16419a.f87189a[enumC14740gf.ordinal()]) {
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
                return mqq0.m155978a(enumC14740gf.m85600a());
            case 11:
                iM155978a = mqq0.m155978a(enumC14740gf.m85600a());
                if (interfaceC14777hq != null) {
                    try {
                        if (interfaceC14777hq instanceof C14757gw) {
                            String str = ((C14757gw) interfaceC14777hq).f62272d;
                            if (!TextUtils.isEmpty(str) && mqq0.m155979b(mqq0.m155981d(str)) != -1) {
                                return mqq0.m155979b(mqq0.m155981d(str));
                            }
                        } else if (interfaceC14777hq instanceof C14766he) {
                            String str2 = ((C14766he) interfaceC14777hq).f62387d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (mqq0.m155979b(mqq0.m155981d(str2)) != -1) {
                                    iM155978a = mqq0.m155979b(mqq0.m155981d(str2));
                                }
                                if (EnumC14750gp.UploadTinyData.equals(mqq0.m155981d(str2))) {
                                    return -1;
                                }
                                return iM155978a;
                            }
                        }
                    } catch (Exception unused) {
                        ilq0.m137025B("PERF_ERROR : parse Notification type error");
                    }
                }
                return iM155978a;
            case 12:
                iM155978a = mqq0.m155978a(enumC14740gf.m85600a());
                if (interfaceC14777hq != null) {
                    try {
                        if (interfaceC14777hq instanceof C14762ha) {
                            String strM85892b = ((C14762ha) interfaceC14777hq).m85892b();
                            if (!TextUtils.isEmpty(strM85892b) && EnumC14732ed.m85526a(strM85892b) != -1) {
                                return EnumC14732ed.m85526a(strM85892b);
                            }
                        } else if (interfaceC14777hq instanceof C14760gz) {
                            String strM85851a = ((C14760gz) interfaceC14777hq).m85851a();
                            if (!TextUtils.isEmpty(strM85851a) && EnumC14732ed.m85526a(strM85851a) != -1) {
                                return EnumC14732ed.m85526a(strM85851a);
                            }
                        }
                    } catch (Exception unused2) {
                        ilq0.m137025B("PERF_ERROR : parse Command type error");
                        break;
                    }
                }
                return iM155978a;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m112822d(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int iM112819a = m112819a(context, i2);
        if (i != mqq0.m155979b(EnumC14750gp.UploadTinyData)) {
            nqq0.m160662a(context.getApplicationContext()).m160664b(str, i, 1L, iM112819a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m112823e(String str, Context context, C14763hb c14763hb, int i) {
        EnumC14740gf enumC14740gfM85905a;
        if (context == null || c14763hb == null || (enumC14740gfM85905a = c14763hb.m85905a()) == null) {
            return;
        }
        int iM112820b = m112820b(enumC14740gfM85905a);
        if (i <= 0) {
            byte[] bArrM86277e = C14788m.m86277e(c14763hb);
            i = bArrM86277e != null ? bArrM86277e.length : 0;
        }
        m112822d(str, context, iM112820b, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m112824f(String str, Context context, InterfaceC14777hq interfaceC14777hq, EnumC14740gf enumC14740gf, int i) {
        m112822d(str, context, m112821c(interfaceC14777hq, enumC14740gf), i);
    }

    /* JADX INFO: renamed from: g */
    public static void m112825g(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        C14763hb c14763hb = new C14763hb();
        try {
            C14788m.m86276d(c14763hb, bArr);
            m112823e(str, context, c14763hb, bArr.length);
        } catch (C14778hu unused) {
            ilq0.m137040m("fail to convert bytes to container");
        }
    }
}
