package p149l;

import com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p046p1.mobile.putong.core.member.module.CoreMemberInnerServiceHolder;

/* JADX INFO: loaded from: classes10.dex */
public class hr9 {

    /* JADX INFO: renamed from: b */
    public static volatile hr9 f109188b;

    /* JADX INFO: renamed from: a */
    public CoreMemberInnerServiceHolder f109189a;

    public hr9() {
        CoreMemberInnerServiceHolder coreMemberInnerServiceHolder = new CoreMemberInnerServiceHolder();
        this.f109189a = coreMemberInnerServiceHolder;
        coreMemberInnerServiceHolder.m36000a();
    }

    /* JADX INFO: renamed from: a */
    public static hr9 m132650a() {
        if (f109188b == null) {
            synchronized (hr9.class) {
                try {
                    if (f109188b == null) {
                        f109188b = new hr9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109188b;
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberBusinessService m132651b() {
        return this.f109189a.coreMemberInnerService;
    }
}
