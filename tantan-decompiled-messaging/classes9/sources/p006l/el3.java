package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import l.fl3;
import l.s7m;
import l.xdl0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class el3 implements s7m<yk3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f11221a;

    /* JADX INFO: renamed from: b */
    public VText f11222b;

    /* JADX INFO: renamed from: c */
    public VText f11223c;

    /* JADX INFO: renamed from: d */
    public VText f11224d;

    /* JADX INFO: renamed from: e */
    public VText f11225e;

    /* JADX INFO: renamed from: f */
    public Act f11226f;

    /* JADX INFO: renamed from: g */
    public yk3 f11227g;

    public el3(Act act) {
        this.f11226f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m14670j(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m14671k(View view) {
        Act act = this.f11226f;
        act.startActivity(AccessTokenWebViewAct.Z1(act, "营业执照", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m14672l(View view) {
        Act act = this.f11226f;
        act.startActivity(AccessTokenWebViewAct.Z1(act, "增值电信业务许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=2"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m14673m(View view) {
        Act act = this.f11226f;
        act.startActivity(AccessTokenWebViewAct.Z1(act, "广播电视节目经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=3"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m14674n(View view) {
        Act act = this.f11226f;
        act.startActivity(AccessTokenWebViewAct.Z1(act, "网络文化经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=4"));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14675C0() {
        return this.f11226f;
    }

    @Nullable
    public Act act() {
        return this.f11226f;
    }

    /* JADX INFO: renamed from: f */
    public View m14676f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fl3.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m14678i1(yk3 yk3Var) {
        this.f11227g = yk3Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14676f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m14679r() {
        this.f11221a.setTitle("相关许可证");
        this.f11221a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.zk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28783a.m14670j(view);
            }
        });
        xdl0.E0(this.f11222b, new View.OnClickListener() { // from class: l.al3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8306a.m14671k(view);
            }
        });
        xdl0.E0(this.f11223c, new View.OnClickListener() { // from class: l.bl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8965a.m14672l(view);
            }
        });
        xdl0.E0(this.f11224d, new View.OnClickListener() { // from class: l.cl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9708a.m14673m(view);
            }
        });
        xdl0.E0(this.f11225e, new View.OnClickListener() { // from class: l.dl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10455a.m14674n(view);
            }
        });
    }

    public void destroy() {
    }
}
