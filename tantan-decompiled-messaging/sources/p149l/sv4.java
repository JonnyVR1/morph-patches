package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import p147v.VLinear;
import p147v.VListCell;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class sv4 implements s7m<pv4> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f166521a;

    /* JADX INFO: renamed from: b */
    public VLinear f166522b;

    /* JADX INFO: renamed from: c */
    public VListCell f166523c;

    /* JADX INFO: renamed from: d */
    public Act f166524d;

    /* JADX INFO: renamed from: e */
    public pv4 f166525e;

    public sv4(Act act) {
        this.f166524d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m186032e(View view) {
        this.f166524d.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m186033f(View view) {
        boolean zM214942T = yij0.m214942T(this.f166523c);
        if (zM214942T) {
            MessagesAct.f31636s.put(Boolean.TRUE);
        }
        zvf0.m220399u("e_keyboard_setting_switch", "p_chat_keyboard_setting", j760.m140076a("push_switch", zM214942T ? "off_on" : "on_off"));
        rs4.f160804e.put(Boolean.valueOf(zM214942T));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m186034c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tv4.m190721b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pv4 pv4Var) {
        this.f166525e = pv4Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186034c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m186036r() {
        this.f166521a.setTitle("聊天设置");
        this.f166521a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.qv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156578a.m186032e(view);
            }
        });
        yij0.m214964t(this.f166523c, rs4.f160804e.get().booleanValue());
        zvf0.m220402x("e_keyboard_setting_switch", "p_chat_keyboard_setting");
        xdl0.m208329E0(this.f166523c, new View.OnClickListener() { // from class: l.rv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161160a.m186033f(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
