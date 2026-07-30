package p002l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.OpenSDKInfo;
import com.p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.v9j;
import l.w9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zp50 extends jq2<cq50> {

    /* JADX INFO: renamed from: a */
    public Act f23533a;

    /* JADX INFO: renamed from: b */
    public String f23534b;

    /* JADX INFO: renamed from: c */
    public String f23535c;

    /* JADX INFO: renamed from: d */
    public String f23536d;

    public zp50(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ c m27471u0() {
        return CoreModule.c.P0.f3(this.f23534b, this.f23535c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m27472y0(Throwable th) {
        this.f23533a.progressDismiss();
        m27475m0(th.toString());
    }

    /* JADX INFO: renamed from: a0 */
    public void m27474a0() {
        duringCreated(CoreModule.c.e0.o9()).subscribe(mkd0.G(new e30() { // from class: l.rp50
            public final void call(Object obj) {
                this.f18631a.m27482t0((User) obj);
            }
        }));
        m27478p0();
        this.f23533a.progress(R.string.J5);
        duringCreated(new v9j() { // from class: l.sp50
            public final Object call() {
                return this.f19151a.m27471u0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.tp50
            public final void call(Object obj) {
                this.f20330a.m27483x0((OpenSDKInfo) obj);
            }
        }, new e30() { // from class: l.up50
            public final void call(Object obj) {
                this.f20745a.m27472y0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.vp50
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wp50
            public final void call(Object obj) {
                zvf0.B("e_tantan_oauth_begin", "", new j760[0]);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m27475m0(String str) {
        zvf0.B("e_tantan_oauth_failed", "", new j760[]{j760.a("tantan_oauth_failed_reason", str)});
        Intent intent = new Intent();
        intent.putExtra("errorMessage", str);
        this.f23533a.setResult(0, intent);
        this.f23533a.finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m27476n0(@NonNull OpenSdkCodeAuth openSdkCodeAuth) {
        zvf0.B("e_tantan_oauth_success", "", new j760[0]);
        Intent intent = new Intent();
        intent.putExtra("code", openSdkCodeAuth.code);
        intent.putExtra("state", openSdkCodeAuth.state);
        this.f23533a.setResult(-1, intent);
        this.f23533a.finish();
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void m27473C(cq50 cq50Var) {
        super.C(cq50Var);
        this.f23533a = cq50Var.act();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m27478p0() {
        this.f23534b = this.f23533a.getIntent().getStringExtra("clientId");
        this.f23535c = this.f23533a.getIntent().getStringExtra("packageName");
        this.f23536d = this.f23533a.getIntent().getStringExtra("state");
    }

    /* JADX INFO: renamed from: q0 */
    public void m27479q0() {
        this.f23533a.progress(R.string.J5);
        CoreModule.c.P0.e3(this.f23534b, "code", "user_profile", "", this.f23536d).subscribe(mkd0.H(new e30() { // from class: l.xp50
            public final void call(Object obj) {
                this.f22394a.m27480r0((OpenSdkCodeAuth) obj);
            }
        }, new e30() { // from class: l.yp50
            public final void call(Object obj) {
                this.f23014a.m27481s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m27480r0(OpenSdkCodeAuth openSdkCodeAuth) {
        this.f23533a.progressDismiss();
        if (NullChecker.a(openSdkCodeAuth) && !TextUtils.isEmpty(openSdkCodeAuth.code) && openSdkCodeAuth.error == 0) {
            m27476n0(openSdkCodeAuth);
        } else {
            m27475m0(openSdkCodeAuth == null ? "unknow error" : openSdkCodeAuth.message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m27481s0(Throwable th) {
        this.f23533a.progressDismiss();
        m27475m0(th.toString());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m27482t0(User user) {
        ((cq50) ((jq2) this).viewModel).m11323e(user);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m27483x0(OpenSDKInfo openSDKInfo) {
        this.f23533a.progressDismiss();
        if (NullChecker.a(openSDKInfo) && openSDKInfo.error == 0) {
            ((cq50) ((jq2) this).viewModel).m11325j(openSDKInfo);
        } else {
            m27475m0(openSDKInfo == null ? "unknow error" : openSDKInfo.message);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m27484z0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            m27475m0("you have canceled");
            this.f23533a.finish();
        }
    }

    public void destroy() {
    }
}
