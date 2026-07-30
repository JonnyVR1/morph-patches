package com.xiaomi.push.service;

import android.content.Context;
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

/* JADX INFO: renamed from: com.xiaomi.push.service.bc */
/* JADX INFO: loaded from: classes2.dex */
public class C15007bc {

    /* JADX INFO: renamed from: com.xiaomi.push.service.bc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f63874a;

        static {
            int[] iArr = new int[EnumC14888gf.values().length];
            f63874a = iArr;
            try {
                iArr[EnumC14888gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63874a[EnumC14888gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63874a[EnumC14888gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63874a[EnumC14888gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63874a[EnumC14888gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63874a[EnumC14888gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63874a[EnumC14888gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63874a[EnumC14888gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63874a[EnumC14888gf.Notification.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63874a[EnumC14888gf.Command.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC14925hq m87800a(EnumC14888gf enumC14888gf, boolean z) {
        switch (AnonymousClass1.f63874a[enumC14888gf.ordinal()]) {
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

    /* JADX INFO: renamed from: a */
    public static InterfaceC14925hq m87799a(Context context, C14911hb c14911hb) {
        if (c14911hb.m87094b()) {
            return null;
        }
        byte[] bArrM87089a = c14911hb.m87089a();
        InterfaceC14925hq interfaceC14925hqM87800a = m87800a(c14911hb.m87076a(), c14911hb.f63201b);
        if (interfaceC14925hqM87800a != null) {
            C14936m.m87447d(interfaceC14925hqM87800a, bArrM87089a);
        }
        return interfaceC14925hqM87800a;
    }
}
