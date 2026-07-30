package p153l;

import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreInnerServiceHolder;
import com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p051p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService;

/* JADX INFO: loaded from: classes9.dex */
public class j49 {

    /* JADX INFO: renamed from: b */
    public static volatile j49 f118275b;

    /* JADX INFO: renamed from: a */
    public CoreInnerServiceHolder f118276a;

    public j49() {
        CoreInnerServiceHolder coreInnerServiceHolder = new CoreInnerServiceHolder();
        this.f118276a = coreInnerServiceHolder;
        coreInnerServiceHolder.m34648a();
    }

    /* JADX INFO: renamed from: c */
    public static j49 m143404c() {
        if (f118275b == null) {
            synchronized (j49.class) {
                try {
                    if (f118275b == null) {
                        f118275b = new j49();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f118275b;
    }

    /* JADX INFO: renamed from: a */
    public CoreBusinessService m143405a() {
        return this.f118276a.coreBusinessService;
    }

    /* JADX INFO: renamed from: b */
    public CoreBuzzInnerService m143406b() {
        return this.f118276a.coreBuzzInnerService;
    }

    /* JADX INFO: renamed from: d */
    public CoreInnovationInnerService m143407d() {
        return this.f118276a.innovationInnerService;
    }

    /* JADX INFO: renamed from: e */
    public CoreMemberInnerService m143408e() {
        return this.f118276a.coreMemberInnerService;
    }

    /* JADX INFO: renamed from: f */
    public CoreMessageInnerService m143409f() {
        return this.f118276a.coreMessageInnerService;
    }

    /* JADX INFO: renamed from: g */
    public CorePayInnerService m143410g() {
        return this.f118276a.corePayInnerService;
    }

    /* JADX INFO: renamed from: h */
    public CoreProfileInnerService m143411h() {
        return this.f118276a.coreProfileInnerService;
    }

    /* JADX INFO: renamed from: i */
    public CoreBusinessService m143412i() {
        return this.f118276a.coreBusinessService;
    }
}
