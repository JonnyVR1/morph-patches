package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class yl3 implements iam<sl3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f200519a;

    /* JADX INFO: renamed from: b */
    public VText f200520b;

    /* JADX INFO: renamed from: c */
    public VText f200521c;

    /* JADX INFO: renamed from: d */
    public VText f200522d;

    /* JADX INFO: renamed from: e */
    public VText f200523e;

    /* JADX INFO: renamed from: f */
    public Act f200524f;

    /* JADX INFO: renamed from: g */
    public sl3 f200525g;

    public yl3(Act act) {
        this.f200524f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m216551j(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m216552k(View view) {
        Act act = this.f200524f;
        act.startActivity(AccessTokenWebViewAct.m81333a2(act, "营业执照", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m216553l(View view) {
        Act act = this.f200524f;
        act.startActivity(AccessTokenWebViewAct.m81333a2(act, "增值电信业务许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=2"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m216554m(View view) {
        Act act = this.f200524f;
        act.startActivity(AccessTokenWebViewAct.m81333a2(act, "广播电视节目经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=3"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m216555n(View view) {
        Act act = this.f200524f;
        act.startActivity(AccessTokenWebViewAct.m81333a2(act, "网络文化经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=4"));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f200524f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f200524f;
    }

    /* JADX INFO: renamed from: f */
    public View m216556f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zl3.m220164b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(sl3 sl3Var) {
        this.f200525g = sl3Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m216556f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m216558r() {
        this.f200519a.setTitle("相关许可证");
        this.f200519a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174783a.m216551j(view);
            }
        });
        bnl0.m105509E0(this.f200520b, new View.OnClickListener() { // from class: l.ul3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179478a.m216552k(view);
            }
        });
        bnl0.m105509E0(this.f200521c, new View.OnClickListener() { // from class: l.vl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184538a.m216553l(view);
            }
        });
        bnl0.m105509E0(this.f200522d, new View.OnClickListener() { // from class: l.wl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189634a.m216554m(view);
            }
        });
        bnl0.m105509E0(this.f200523e, new View.OnClickListener() { // from class: l.xl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194855a.m216555n(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
