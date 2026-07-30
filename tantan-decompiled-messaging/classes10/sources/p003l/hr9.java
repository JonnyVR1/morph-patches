package p003l;

import com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p000p1.mobile.putong.core.member.module.CoreMemberInnerServiceHolder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hr9 {

    /* JADX INFO: renamed from: b */
    public static volatile hr9 f4953b;

    /* JADX INFO: renamed from: a */
    public CoreMemberInnerServiceHolder f4954a;

    public hr9() {
        CoreMemberInnerServiceHolder coreMemberInnerServiceHolder = new CoreMemberInnerServiceHolder();
        this.f4954a = coreMemberInnerServiceHolder;
        coreMemberInnerServiceHolder.m823a();
    }

    /* JADX INFO: renamed from: a */
    public static hr9 m7065a() {
        if (f4953b == null) {
            synchronized (hr9.class) {
                try {
                    if (f4953b == null) {
                        f4953b = new hr9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4953b;
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberBusinessService m7066b() {
        return this.f4954a.coreMemberInnerService;
    }
}
