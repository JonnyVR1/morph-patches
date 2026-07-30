package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import p151v.VLinear;
import p151v.VListCell;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class rw4 implements iam<ow4> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f165099a;

    /* JADX INFO: renamed from: b */
    public VLinear f165100b;

    /* JADX INFO: renamed from: c */
    public VListCell f165101c;

    /* JADX INFO: renamed from: d */
    public Act f165102d;

    /* JADX INFO: renamed from: e */
    public ow4 f165103e;

    public rw4(Act act) {
        this.f165102d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m183337e(View view) {
        this.f165102d.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m183338f(View view) {
        boolean zM106262T = bsj0.m106262T(this.f165101c);
        if (zM106262T) {
            MessagesAct.f32484s.put(Boolean.TRUE);
        }
        i4g0.m138523u("e_keyboard_setting_switch", "p_chat_keyboard_setting", pf60.m172085a("push_switch", zM106262T ? "off_on" : "on_off"));
        qt4.f159383e.put(Boolean.valueOf(zM106262T));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m183339c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sw4.m188237b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ow4 ow4Var) {
        this.f165103e = ow4Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183339c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m183341r() {
        this.f165099a.setTitle("聊天设置");
        this.f165099a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154369a.m183337e(view);
            }
        });
        bsj0.m106284t(this.f165101c, qt4.f159383e.get().booleanValue());
        i4g0.m138526x("e_keyboard_setting_switch", "p_chat_keyboard_setting");
        bnl0.m105509E0(this.f165101c, new View.OnClickListener() { // from class: l.qw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159858a.m183338f(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
