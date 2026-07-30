package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.Locale;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.eqh0;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xh0;
import l.zl6;
import l.zvf0;
import p009l.i0e;
import p009l.mqi0;
import p009l.p36;
import p009l.tgp0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationWeakenView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f3850c;

    /* JADX INFO: renamed from: d */
    public ImageView f3851d;

    /* JADX INFO: renamed from: e */
    public TextView f3852e;

    /* JADX INFO: renamed from: f */
    public TextView f3853f;

    /* JADX INFO: renamed from: g */
    public ImageView f3854g;

    /* JADX INFO: renamed from: h */
    public c4g0 f3855h;

    public ConversationWeakenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: X */
    public final void m5422X(View view) {
        zl6.a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m5423Y(p36 p36Var, j760 j760Var) {
        if (upa.l().enabled) {
            if (j760Var.a == null) {
                xdl0.M(this.f3850c, false);
                return;
            } else {
                m5429e0(p36Var);
                return;
            }
        }
        if (j760Var.a == null || (j760Var.b != null && mqi0.m18534C((long) CoreModule.c.f0.Ag(), (long) CoreModule.c.f0.hg()))) {
            xdl0.M(this.f3850c, false);
        } else {
            m5429e0(p36Var);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m5424Z(p36 p36Var, View view) {
        CoreModule.c.f0.cg().put(Boolean.TRUE);
        CoreModule.c.f0.g0.onNext(roj0.a);
        xdl0.M(this.f3850c, false);
        p36Var.mo5632q();
        osi0.g(upa.k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.c.f0.dq((double) qib0.H.guessedCurrentServerTime());
        zvf0.r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m5425a0(final p36 p36Var, View view) {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_weaken_tips_pop", "weakenDlg");
        i0e.m16065f(cwf0VarM16062c);
        new xh0.a(getContext()).s("弱化未读消息").g(true).b(true).r("确认").o(new View.OnClickListener() { // from class: l.wl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22182a.m5424Z(p36Var, view2);
            }
        }).j(upa.k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").f("取消").c(new View.OnClickListener() { // from class: l.xl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.r("e_cancel", "p_weaken_tips_pop");
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.yl6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).a().g();
        zvf0.u("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "down"), j760.a("weaken_click_type", "weaken")});
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m5426b0(View view) {
        CoreModule.c.f0.u0.put(Long.valueOf(mqi0.m18550o()));
        xdl0.M(this.f3850c, false);
        zvf0.u("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "down"), j760.a("weaken_click_type", "off")});
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m5427c0(View view) {
        xdl0.M(this.f3850c, false);
        CoreModule.c.f0.pp();
        CoreModule.c.f0.s0.put(Boolean.FALSE);
        zvf0.r("e_old_messages_weakened_tips", "p_messages_view");
    }

    /* JADX INFO: renamed from: d0 */
    public void m5428d0(Act act, final p36 p36Var) {
        xdl0.M(this.f3850c, false);
        mkd0.z(this.f3855h);
        this.f3855h = p36Var.c(act, mkd0.r(CoreModule.c.f0.Ue("fake_conversation_weaken_conversation"), CoreModule.c.f0.Ue("fake_conversation_fold_conversation"), new x9j() { // from class: l.rl6
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Conversation) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.sl6
            public final void call(Object obj) {
                this.f20353a.m5423Y(p36Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public void m5429e0(p36 p36Var) {
        if (((Boolean) CoreModule.c.f0.cg().get()).booleanValue()) {
            m5431g0();
        } else {
            m5430f0(p36Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m5430f0(final p36 p36Var) {
        long jM18550o = mqi0.m18550o() - ((Long) CoreModule.c.f0.u0.get()).longValue();
        VLinear vLinear = this.f3850c;
        if (jM18550o < 604800000) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        xdl0.M(this.f3853f, true);
        this.f3852e.setText(String.format(Locale.CHINESE, "弱化超过%d日的未读消息提醒，", Integer.valueOf(upa.k().ignore_msg_days)));
        this.f3852e.setTypeface(eqh0.c(3), 1);
        this.f3853f.setTypeface(eqh0.c(3), 1);
        if (!tgp0.f20677b) {
            tgp0.f20677b = true;
            zvf0.A("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "down")});
        }
        xdl0.E0(this.f3853f, new View.OnClickListener() { // from class: l.tl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20765a.m5425a0(p36Var, view);
            }
        });
        xdl0.E0(this.f3854g, new View.OnClickListener() { // from class: l.ul6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21241a.m5426b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m5431g0() {
        if (!((Boolean) CoreModule.c.f0.s0.get()).booleanValue() || !upa.k().ignore_old_unread_msg) {
            xdl0.M(this.f3850c, false);
            return;
        }
        xdl0.M(this.f3850c, true);
        xdl0.M(this.f3853f, false);
        if (!tgp0.f20676a) {
            tgp0.f20676a = true;
            CoreModule.c.f0.t0.a(1);
            zvf0.x("e_old_messages_weakened_tips", "p_messages_view");
        }
        boolean z = upa.l().enabled;
        TextView textView = this.f3852e;
        if (z) {
            textView.setText("已为你弱化更多早期未读消息提醒");
        } else {
            textView.setText(String.format(Locale.CHINESE, "超过%d天的未读消息已为你弱化提醒", Integer.valueOf(upa.k().ignore_msg_days)));
            this.f3852e.setTypeface(eqh0.c(3), 1);
        }
        xdl0.E0(this.f3854g, new View.OnClickListener() { // from class: l.vl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21638a.m5427c0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5422X(this);
        if (upa.z()) {
            this.f3854g.setImageResource(x2c0.Ff);
            this.f3851d.setImageResource(x2c0.zh);
        }
    }

    public ConversationWeakenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
