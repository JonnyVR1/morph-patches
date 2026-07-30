package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Locale;
import p147v.VLinear;
import p149l.c4g0;
import p149l.cwf0;
import p149l.e30;
import p149l.eqh0;
import p149l.i0e;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.p36;
import p149l.qib0;
import p149l.roj0;
import p149l.tgp0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xh0;
import p149l.zl6;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationWeakenView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f25072c;

    /* JADX INFO: renamed from: d */
    public ImageView f25073d;

    /* JADX INFO: renamed from: e */
    public TextView f25074e;

    /* JADX INFO: renamed from: f */
    public TextView f25075f;

    /* JADX INFO: renamed from: g */
    public ImageView f25076g;

    /* JADX INFO: renamed from: h */
    public c4g0 f25077h;

    public ConversationWeakenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: X */
    public final void m41316X(View view) {
        zl6.m219246a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m41317Y(p36 p36Var, j760 j760Var) {
        if (upa.m194777l().enabled) {
            if (j760Var.f116564a == 0) {
                xdl0.m208344M(this.f25072c, false);
                return;
            } else {
                m41323e0(p36Var);
                return;
            }
        }
        if (j760Var.f116564a == 0 || (j760Var.f116565b != 0 && mqi0.m155928C((long) CoreModule.f17545c.f19642f0.m32577Ag(), (long) CoreModule.f17545c.f19642f0.m32976hg()))) {
            xdl0.m208344M(this.f25072c, false);
        } else {
            m41323e0(p36Var);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m41318Z(p36 p36Var, View view) {
        CoreModule.f17545c.f19642f0.m32917cg().put(Boolean.TRUE);
        CoreModule.f17545c.f19642f0.f19937g0.onNext(roj0.f160388a);
        xdl0.m208344M(this.f25072c, false);
        p36Var.mo41523q();
        osi0.m165783g(upa.m194772k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.f17545c.f19642f0.m32938dq((double) qib0.f154693H.guessedCurrentServerTime());
        zvf0.m220396r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m41319a0(final p36 p36Var, View view) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_weaken_tips_pop", "weakenDlg");
        i0e.m133797f(cwf0VarM133794c);
        new xh0.C21150a(getContext()).m208740s("弱化未读消息").m208728g(true).m208723b(true).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.wl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f186875a.m41318Z(p36Var, view2);
            }
        }).m208731j(upa.m194772k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").m208727f("取消").m208724c(new View.OnClickListener() { // from class: l.xl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.m220396r("e_cancel", "p_weaken_tips_pop");
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.yl6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
        zvf0.m220399u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "down"), j760.m140076a("weaken_click_type", "weaken"));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m41320b0(View view) {
        CoreModule.f17545c.f19642f0.f19979u0.put(Long.valueOf(mqi0.m155944o()));
        xdl0.m208344M(this.f25072c, false);
        zvf0.m220399u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "down"), j760.m140076a("weaken_click_type", BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m41321c0(View view) {
        xdl0.m208344M(this.f25072c, false);
        CoreModule.f17545c.f19642f0.m33088pp();
        CoreModule.f17545c.f19642f0.f19973s0.put(Boolean.FALSE);
        zvf0.m220396r("e_old_messages_weakened_tips", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: d0 */
    public void m41322d0(Act act, final p36 p36Var) {
        xdl0.m208344M(this.f25072c, false);
        mkd0.m154992z(this.f25077h);
        this.f25077h = p36Var.mo67374c(act, mkd0.m154984r(CoreModule.f17545c.f19642f0.m32820Ue("fake_conversation_weaken_conversation"), CoreModule.f17545c.f19642f0.m32820Ue("fake_conversation_fold_conversation"), new x9j() { // from class: l.rl6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Conversation) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.sl6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165135a.m41317Y(p36Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public void m41323e0(p36 p36Var) {
        if (CoreModule.f17545c.f19642f0.m32917cg().get().booleanValue()) {
            m41325g0();
        } else {
            m41324f0(p36Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m41324f0(final p36 p36Var) {
        long jM155944o = mqi0.m155944o() - CoreModule.f17545c.f19642f0.f19979u0.get().longValue();
        VLinear vLinear = this.f25072c;
        if (jM155944o < 604800000) {
            xdl0.m208344M(vLinear, false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        xdl0.m208344M(this.f25075f, true);
        this.f25074e.setText(String.format(Locale.CHINESE, "弱化超过%d日的未读消息提醒，", Integer.valueOf(upa.m194772k().ignore_msg_days)));
        this.f25074e.setTypeface(eqh0.m117752c(3), 1);
        this.f25075f.setTypeface(eqh0.m117752c(3), 1);
        if (!tgp0.f170114b) {
            tgp0.f170114b = true;
            zvf0.m220368A("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "down"));
        }
        xdl0.m208329E0(this.f25075f, new View.OnClickListener() { // from class: l.tl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170996a.m41319a0(p36Var, view);
            }
        });
        xdl0.m208329E0(this.f25076g, new View.OnClickListener() { // from class: l.ul6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177015a.m41320b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m41325g0() {
        if (!CoreModule.f17545c.f19642f0.f19973s0.get().booleanValue() || !upa.m194772k().ignore_old_unread_msg) {
            xdl0.m208344M(this.f25072c, false);
            return;
        }
        xdl0.m208344M(this.f25072c, true);
        xdl0.m208344M(this.f25075f, false);
        if (!tgp0.f170113a) {
            tgp0.f170113a = true;
            CoreModule.f17545c.f19642f0.f19976t0.m189988a(1);
            zvf0.m220402x("e_old_messages_weakened_tips", OMSDialogPositon.p_messages_view);
        }
        boolean z = upa.m194777l().enabled;
        TextView textView = this.f25074e;
        if (z) {
            textView.setText("已为你弱化更多早期未读消息提醒");
        } else {
            textView.setText(String.format(Locale.CHINESE, "超过%d天的未读消息已为你弱化提醒", Integer.valueOf(upa.m194772k().ignore_msg_days)));
            this.f25074e.setTypeface(eqh0.m117752c(3), 1);
        }
        xdl0.m208329E0(this.f25076g, new View.OnClickListener() { // from class: l.vl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181918a.m41321c0(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41316X(this);
        if (upa.m194847z()) {
            this.f25076g.setImageResource(x2c0.f189329Ff);
            this.f25073d.setImageResource(x2c0.f190780zh);
        }
    }

    public ConversationWeakenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
