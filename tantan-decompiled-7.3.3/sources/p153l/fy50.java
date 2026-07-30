package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.OpenSDKInfo;
import com.p051p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class fy50 extends ar2<iy50> {

    /* JADX INFO: renamed from: a */
    public Act f101339a;

    /* JADX INFO: renamed from: b */
    public String f101340b;

    /* JADX INFO: renamed from: c */
    public String f101341c;

    /* JADX INFO: renamed from: d */
    public String f101342d;

    public fy50(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ C22421c m128062u0() {
        return CoreModule.f18264c.f20336P0.m114715f3(this.f101340b, this.f101341c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m128063y0(Throwable th) {
        this.f101339a.progressDismiss();
        m128064m0(th.toString());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.xx50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196606a.m128071t0((User) obj);
            }
        }));
        m128067p0();
        this.f101339a.progress(R$string.f18632L5);
        duringCreated(new pcj() { // from class: l.yx50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201932a.m128062u0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.zx50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206439a.m128072x0((OpenSDKInfo) obj);
            }
        }, new y20() { // from class: l.ay50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73946a.m128063y0((Throwable) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.by50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.cy50
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138493B("e_tantan_oauth_begin", "", new pf60[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m128064m0(String str) {
        i4g0.m138493B("e_tantan_oauth_failed", "", pf60.m172085a("tantan_oauth_failed_reason", str));
        Intent intent = new Intent();
        intent.putExtra("errorMessage", str);
        this.f101339a.setResult(0, intent);
        this.f101339a.m68056e2();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m128065n0(@NonNull OpenSdkCodeAuth openSdkCodeAuth) {
        i4g0.m138493B("e_tantan_oauth_success", "", new pf60[0]);
        Intent intent = new Intent();
        intent.putExtra("code", openSdkCodeAuth.code);
        intent.putExtra("state", openSdkCodeAuth.state);
        this.f101339a.setResult(-1, intent);
        this.f101339a.m68056e2();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(iy50 iy50Var) {
        super.mo52715C(iy50Var);
        this.f101339a = iy50Var.getAct();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m128067p0() {
        this.f101340b = this.f101339a.getIntent().getStringExtra("clientId");
        this.f101341c = this.f101339a.getIntent().getStringExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        this.f101342d = this.f101339a.getIntent().getStringExtra("state");
    }

    /* JADX INFO: renamed from: q0 */
    public void m128068q0() {
        this.f101339a.progress(R$string.f18632L5);
        CoreModule.f18264c.f20336P0.m114714e3(this.f101340b, "code", "user_profile", "", this.f101342d).subscribe(psd0.m173597H(new y20() { // from class: l.dy50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91136a.m128069r0((OpenSdkCodeAuth) obj);
            }
        }, new y20() { // from class: l.ey50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96401a.m128070s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m128069r0(OpenSdkCodeAuth openSdkCodeAuth) {
        this.f101339a.progressDismiss();
        if (NullChecker.m82486a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code) && openSdkCodeAuth.error == 0) {
            m128065n0(openSdkCodeAuth);
        } else {
            m128064m0(openSdkCodeAuth == null ? "unknow error" : openSdkCodeAuth.message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m128070s0(Throwable th) {
        this.f101339a.progressDismiss();
        m128064m0(th.toString());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m128071t0(User user) {
        ((iy50) this.viewModel).m142616e(user);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m128072x0(OpenSDKInfo openSDKInfo) {
        this.f101339a.progressDismiss();
        if (NullChecker.m82486a(openSDKInfo) && openSDKInfo.error == 0) {
            ((iy50) this.viewModel).m142617j(openSDKInfo);
        } else {
            m128064m0(openSDKInfo == null ? "unknow error" : openSDKInfo.message);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m128073z0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            m128064m0("you have canceled");
            this.f101339a.m68056e2();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
