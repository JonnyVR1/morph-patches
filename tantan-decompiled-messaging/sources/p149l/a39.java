package p149l;

import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreInnerServiceHolder;
import com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p046p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService;

/* JADX INFO: loaded from: classes9.dex */
public class a39 {

    /* JADX INFO: renamed from: b */
    public static volatile a39 f67335b;

    /* JADX INFO: renamed from: a */
    public CoreInnerServiceHolder f67336a;

    public a39() {
        CoreInnerServiceHolder coreInnerServiceHolder = new CoreInnerServiceHolder();
        this.f67336a = coreInnerServiceHolder;
        coreInnerServiceHolder.m33645a();
    }

    /* JADX INFO: renamed from: c */
    public static a39 m94650c() {
        if (f67335b == null) {
            synchronized (a39.class) {
                try {
                    if (f67335b == null) {
                        f67335b = new a39();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f67335b;
    }

    /* JADX INFO: renamed from: a */
    public CoreBusinessService m94651a() {
        return this.f67336a.coreBusinessService;
    }

    /* JADX INFO: renamed from: b */
    public CoreBuzzInnerService m94652b() {
        return this.f67336a.coreBuzzInnerService;
    }

    /* JADX INFO: renamed from: d */
    public CoreInnovationInnerService m94653d() {
        return this.f67336a.innovationInnerService;
    }

    /* JADX INFO: renamed from: e */
    public CoreMemberInnerService m94654e() {
        return this.f67336a.coreMemberInnerService;
    }

    /* JADX INFO: renamed from: f */
    public CoreMessageInnerService m94655f() {
        return this.f67336a.coreMessageInnerService;
    }

    /* JADX INFO: renamed from: g */
    public CorePayInnerService m94656g() {
        return this.f67336a.corePayInnerService;
    }

    /* JADX INFO: renamed from: h */
    public CoreProfileInnerService m94657h() {
        return this.f67336a.coreProfileInnerService;
    }

    /* JADX INFO: renamed from: i */
    public CoreBusinessService m94658i() {
        return this.f67336a.coreBusinessService;
    }
}
