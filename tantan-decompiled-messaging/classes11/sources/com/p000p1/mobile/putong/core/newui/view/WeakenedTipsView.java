package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.ahp0;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p009l.i0e;
import p009l.mqi0;
import p009l.p36;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeakenedTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public WeakenedTipsView f5810d;

    /* JADX INFO: renamed from: e */
    public VImage f5811e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f5812f;

    /* JADX INFO: renamed from: g */
    public VImage f5813g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f5814h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f5815i;

    /* JADX INFO: renamed from: j */
    public c4g0 f5816j;

    public WeakenedTipsView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m8063o0(View view) {
        zvf0.u("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "up"), j760.a("weaken_click_type", "off")});
        xdl0.M(this, false);
        if (((Integer) CoreModule.c.e0.E5.get()).intValue() != 1) {
            CoreModule.c.e0.E5.a(1);
        } else {
            CoreModule.c.e0.F5.put(Long.valueOf(mqi0.m18550o() + 2592000000L));
            CoreModule.c.e0.E5.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m8064r() {
        xdl0.E0(this.f5813g, new View.OnClickListener() { // from class: l.ugp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21140a.m8063o0(view);
            }
        });
        if (upa.z()) {
            this.f5811e.setImageResource(x2c0.zh);
            this.f5813g.setImageResource(x2c0.Ff);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8065n0(View view) {
        ahp0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8065n0(this);
        if (upa.z()) {
            this.f5812f.setTextColor(-16777216);
            this.f5814h.setTextColor(Color.parseColor("#66000000"));
            this.f5813g.setImageResource(x2c0.Ff);
        }
        m8064r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8066p0(p36 p36Var, View view) {
        CoreModule.c.f0.cg().put(Boolean.TRUE);
        CoreModule.c.f0.g0.onNext(roj0.a);
        xdl0.M(this, false);
        p36Var.mo5632q();
        osi0.g(upa.k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.c.f0.dq((double) qib0.H.guessedCurrentServerTime());
        zvf0.r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8067q0(final p36 p36Var, View view) {
        zvf0.u("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "up"), j760.a("weaken_click_type", "weaken")});
        CoreModule.c.e0.E5.clear();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_weaken_tips_pop", "weakenDlg");
        i0e.m16065f(cwf0VarM16062c);
        new xh0.a(getContext()).s("弱化未读消息").g(true).b(true).r("确认").o(new View.OnClickListener() { // from class: l.xgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22605a.m8066p0(p36Var, view2);
            }
        }).j(upa.k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").f("取消").c(new View.OnClickListener() { // from class: l.ygp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.r("e_cancel", "p_weaken_tips_pop");
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.zgp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).a().g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8068r0(roj0 roj0Var) {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8069s0(final p36 p36Var, int i) {
        this.f5814h.setText(String.format("你有%s条%s日前未读消息，是否需要弱化展示？", Integer.valueOf(i), Integer.valueOf(upa.k().ignore_msg_days)));
        xdl0.E0(this.f5815i, new View.OnClickListener() { // from class: l.vgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21574a.m8067q0(p36Var, view);
            }
        });
        mkd0.z(this.f5816j);
        this.f5816j = CoreModule.c.f0.g0.subscribe(mkd0.G(new e30() { // from class: l.wgp0
            public final void call(Object obj) {
                this.f22107a.m8068r0((roj0) obj);
            }
        }));
    }

    public WeakenedTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeakenedTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
