package p153l;

import com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p051p1.mobile.putong.core.member.module.CoreMemberInnerServiceHolder;

/* JADX INFO: loaded from: classes10.dex */
public class ss9 {

    /* JADX INFO: renamed from: b */
    public static volatile ss9 f170441b;

    /* JADX INFO: renamed from: a */
    public CoreMemberInnerServiceHolder f170442a;

    public ss9() {
        CoreMemberInnerServiceHolder coreMemberInnerServiceHolder = new CoreMemberInnerServiceHolder();
        this.f170442a = coreMemberInnerServiceHolder;
        coreMemberInnerServiceHolder.m37003a();
    }

    /* JADX INFO: renamed from: a */
    public static ss9 m187692a() {
        if (f170441b == null) {
            synchronized (ss9.class) {
                try {
                    if (f170441b == null) {
                        f170441b = new ss9();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f170441b;
    }

    /* JADX INFO: renamed from: b */
    public CoreMemberBusinessService m187693b() {
        return this.f170442a.coreMemberInnerService;
    }
}
