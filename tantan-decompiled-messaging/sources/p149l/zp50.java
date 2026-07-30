package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.OpenSDKInfo;
import com.p046p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class zp50 extends jq2<cq50> {

    /* JADX INFO: renamed from: a */
    public Act f204176a;

    /* JADX INFO: renamed from: b */
    public String f204177b;

    /* JADX INFO: renamed from: c */
    public String f204178c;

    /* JADX INFO: renamed from: d */
    public String f204179d;

    public zp50(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ C22306c m219617u0() {
        return CoreModule.f17545c.f19594P0.m177887f3(this.f204177b, this.f204178c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m219618y0(Throwable th) {
        this.f204176a.progressDismiss();
        m219619m0(th.toString());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.rp50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160478a.m219626t0((User) obj);
            }
        }));
        m219622p0();
        this.f204176a.progress(R$string.f17842J5);
        duringCreated(new v9j() { // from class: l.sp50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165750a.m219617u0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tp50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171443a.m219627x0((OpenSDKInfo) obj);
            }
        }, new e30() { // from class: l.up50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177575a.m219618y0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.vp50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wp50
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220369B("e_tantan_oauth_begin", "", new j760[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m219619m0(String str) {
        zvf0.m220369B("e_tantan_oauth_failed", "", j760.m140076a("tantan_oauth_failed_reason", str));
        Intent intent = new Intent();
        intent.putExtra("errorMessage", str);
        this.f204176a.setResult(0, intent);
        this.f204176a.m66873d2();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m219620n0(@NonNull OpenSdkCodeAuth openSdkCodeAuth) {
        zvf0.m220369B("e_tantan_oauth_success", "", new j760[0]);
        Intent intent = new Intent();
        intent.putExtra("code", openSdkCodeAuth.code);
        intent.putExtra("state", openSdkCodeAuth.state);
        this.f204176a.setResult(-1, intent);
        this.f204176a.m66873d2();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(cq50 cq50Var) {
        super.mo51532C(cq50Var);
        this.f204176a = cq50Var.getAct();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m219622p0() {
        this.f204177b = this.f204176a.getIntent().getStringExtra("clientId");
        this.f204178c = this.f204176a.getIntent().getStringExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        this.f204179d = this.f204176a.getIntent().getStringExtra("state");
    }

    /* JADX INFO: renamed from: q0 */
    public void m219623q0() {
        this.f204176a.progress(R$string.f17842J5);
        CoreModule.f17545c.f19594P0.m177886e3(this.f204177b, "code", "user_profile", "", this.f204179d).subscribe(mkd0.m154956H(new e30() { // from class: l.xp50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193896a.m219624r0((OpenSdkCodeAuth) obj);
            }
        }, new e30() { // from class: l.yp50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199397a.m219625s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m219624r0(OpenSdkCodeAuth openSdkCodeAuth) {
        this.f204176a.progressDismiss();
        if (NullChecker.m81303a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code) && openSdkCodeAuth.error == 0) {
            m219620n0(openSdkCodeAuth);
        } else {
            m219619m0(openSdkCodeAuth == null ? "unknow error" : openSdkCodeAuth.message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m219625s0(Throwable th) {
        this.f204176a.progressDismiss();
        m219619m0(th.toString());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m219626t0(User user) {
        ((cq50) this.viewModel).m108231e(user);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m219627x0(OpenSDKInfo openSDKInfo) {
        this.f204176a.progressDismiss();
        if (NullChecker.m81303a(openSDKInfo) && openSDKInfo.error == 0) {
            ((cq50) this.viewModel).m108232j(openSDKInfo);
        } else {
            m219619m0(openSDKInfo == null ? "unknow error" : openSDKInfo.message);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m219628z0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            m219619m0("you have canceled");
            this.f204176a.m66873d2();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
