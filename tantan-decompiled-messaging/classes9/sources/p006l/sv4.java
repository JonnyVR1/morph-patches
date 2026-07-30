package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import l.j760;
import l.s7m;
import l.tv4;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VLinear;
import v.VListCell;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sv4 implements s7m<pv4> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f21674a;

    /* JADX INFO: renamed from: b */
    public VLinear f21675b;

    /* JADX INFO: renamed from: c */
    public VListCell f21676c;

    /* JADX INFO: renamed from: d */
    public Act f21677d;

    /* JADX INFO: renamed from: e */
    public pv4 f21678e;

    public sv4(Act act) {
        this.f21677d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m24201e(View view) {
        this.f21677d.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m24202f(View view) {
        boolean zT = yij0.T(this.f21676c);
        if (zT) {
            MessagesAct.s.put(Boolean.TRUE);
        }
        zvf0.u("e_keyboard_setting_switch", "p_chat_keyboard_setting", new j760[]{j760.a("push_switch", zT ? "off_on" : "on_off")});
        rs4.f20696e.put(Boolean.valueOf(zT));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24203C0() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m24204c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tv4.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m24206i1(pv4 pv4Var) {
        this.f21678e = pv4Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24204c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m24207r() {
        this.f21674a.setTitle("聊天设置");
        this.f21674a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.qv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20088a.m24201e(view);
            }
        });
        yij0.t(this.f21676c, ((Boolean) rs4.f20696e.get()).booleanValue());
        zvf0.x("e_keyboard_setting_switch", "p_chat_keyboard_setting");
        xdl0.E0(this.f21676c, new View.OnClickListener() { // from class: l.rv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20804a.m24202f(view);
            }
        });
    }

    public void destroy() {
    }
}
