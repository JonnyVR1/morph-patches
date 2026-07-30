package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class el3 implements s7m<yk3> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f92060a;

    /* JADX INFO: renamed from: b */
    public VText f92061b;

    /* JADX INFO: renamed from: c */
    public VText f92062c;

    /* JADX INFO: renamed from: d */
    public VText f92063d;

    /* JADX INFO: renamed from: e */
    public VText f92064e;

    /* JADX INFO: renamed from: f */
    public Act f92065f;

    /* JADX INFO: renamed from: g */
    public yk3 f92066g;

    public el3(Act act) {
        this.f92065f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m117075j(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m117076k(View view) {
        Act act = this.f92065f;
        act.startActivity(AccessTokenWebViewAct.m80150Z1(act, "营业执照", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m117077l(View view) {
        Act act = this.f92065f;
        act.startActivity(AccessTokenWebViewAct.m80150Z1(act, "增值电信业务许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=2"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m117078m(View view) {
        Act act = this.f92065f;
        act.startActivity(AccessTokenWebViewAct.m80150Z1(act, "广播电视节目经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=3"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m117079n(View view) {
        Act act = this.f92065f;
        act.startActivity(AccessTokenWebViewAct.m80150Z1(act, "网络文化经营许可证", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=4"));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92065f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f92065f;
    }

    /* JADX INFO: renamed from: f */
    public View m117080f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fl3.m121948b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yk3 yk3Var) {
        this.f92066g = yk3Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m117080f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m117082r() {
        this.f92060a.setTitle("相关许可证");
        this.f92060a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.zk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203503a.m117075j(view);
            }
        });
        xdl0.m208329E0(this.f92061b, new View.OnClickListener() { // from class: l.al3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70401a.m117076k(view);
            }
        });
        xdl0.m208329E0(this.f92062c, new View.OnClickListener() { // from class: l.bl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76159a.m117077l(view);
            }
        });
        xdl0.m208329E0(this.f92063d, new View.OnClickListener() { // from class: l.cl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81365a.m117078m(view);
            }
        });
        xdl0.m208329E0(this.f92064e, new View.OnClickListener() { // from class: l.dl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86777a.m117079n(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
