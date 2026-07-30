package p006l;

import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreInnerServiceHolder;
import com.p000p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p000p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p1.mobile.putong.core.profile.service.CoreProfileInnerService;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a39 {

    /* JADX INFO: renamed from: b */
    public static volatile a39 f8079b;

    /* JADX INFO: renamed from: a */
    public CoreInnerServiceHolder f8080a;

    public a39() {
        CoreInnerServiceHolder coreInnerServiceHolder = new CoreInnerServiceHolder();
        this.f8080a = coreInnerServiceHolder;
        coreInnerServiceHolder.m5582a();
    }

    /* JADX INFO: renamed from: c */
    public static a39 m11705c() {
        if (f8079b == null) {
            synchronized (a39.class) {
                try {
                    if (f8079b == null) {
                        f8079b = new a39();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8079b;
    }

    /* JADX INFO: renamed from: a */
    public CoreBusinessService m11706a() {
        return this.f8080a.coreBusinessService;
    }

    /* JADX INFO: renamed from: b */
    public CoreBuzzInnerService m11707b() {
        return this.f8080a.coreBuzzInnerService;
    }

    /* JADX INFO: renamed from: d */
    public CoreInnovationInnerService m11708d() {
        return this.f8080a.innovationInnerService;
    }

    /* JADX INFO: renamed from: e */
    public CoreMemberInnerService m11709e() {
        return this.f8080a.coreMemberInnerService;
    }

    /* JADX INFO: renamed from: f */
    public CoreMessageInnerService m11710f() {
        return this.f8080a.coreMessageInnerService;
    }

    /* JADX INFO: renamed from: g */
    public CorePayInnerService m11711g() {
        return this.f8080a.corePayInnerService;
    }

    /* JADX INFO: renamed from: h */
    public CoreProfileInnerService m11712h() {
        return this.f8080a.coreProfileInnerService;
    }

    /* JADX INFO: renamed from: i */
    public CoreBusinessService m11713i() {
        return this.f8080a.coreBusinessService;
    }
}
