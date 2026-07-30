package com.xiaomi.push.service;

import android.content.Context;
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

/* JADX INFO: renamed from: com.xiaomi.push.service.bc */
/* JADX INFO: loaded from: classes2.dex */
public class C14859bc {

    /* JADX INFO: renamed from: com.xiaomi.push.service.bc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f63027a;

        static {
            int[] iArr = new int[EnumC14740gf.values().length];
            f63027a = iArr;
            try {
                iArr[EnumC14740gf.Registration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63027a[EnumC14740gf.UnRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63027a[EnumC14740gf.Subscription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63027a[EnumC14740gf.UnSubscription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63027a[EnumC14740gf.SendMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63027a[EnumC14740gf.AckMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63027a[EnumC14740gf.SetConfig.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63027a[EnumC14740gf.ReportFeedback.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63027a[EnumC14740gf.Notification.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63027a[EnumC14740gf.Command.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC14777hq m86629a(EnumC14740gf enumC14740gf, boolean z) {
        switch (AnonymousClass1.f63027a[enumC14740gf.ordinal()]) {
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

    /* JADX INFO: renamed from: a */
    public static InterfaceC14777hq m86628a(Context context, C14763hb c14763hb) {
        if (c14763hb.m85923b()) {
            return null;
        }
        byte[] bArrM85918a = c14763hb.m85918a();
        InterfaceC14777hq interfaceC14777hqM86629a = m86629a(c14763hb.m85905a(), c14763hb.f62354b);
        if (interfaceC14777hqM86629a != null) {
            C14788m.m86276d(interfaceC14777hqM86629a, bArrM85918a);
        }
        return interfaceC14777hqM86629a;
    }
}
