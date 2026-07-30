package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Locale;
import p151v.VLinear;
import p153l.bnl0;
import p153l.cn6;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.r1j0;
import p153l.rcj;
import p153l.th0;
import p153l.u46;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.xpp0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationWeakenView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f25814c;

    /* JADX INFO: renamed from: d */
    public ImageView f25815d;

    /* JADX INFO: renamed from: e */
    public TextView f25816e;

    /* JADX INFO: renamed from: f */
    public TextView f25817f;

    /* JADX INFO: renamed from: g */
    public ImageView f25818g;

    /* JADX INFO: renamed from: h */
    public kcg0 f25819h;

    public ConversationWeakenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: X */
    public final void m42327X(View view) {
        cn6.m111451a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m42328Y(u46 u46Var, pf60 pf60Var) {
        if (gra.m131708l().enabled) {
            if (pf60Var.f152156a == 0) {
                bnl0.m105524M(this.f25814c, false);
                return;
            } else {
                m42334e0(u46Var);
                return;
            }
        }
        if (pf60Var.f152156a == 0 || (pf60Var.f152157b != 0 && pzi0.m174438C((long) CoreModule.f18264c.f20384f0.m33580Ag(), (long) CoreModule.f18264c.f20384f0.m33979hg()))) {
            bnl0.m105524M(this.f25814c, false);
        } else {
            m42334e0(u46Var);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m42329Z(u46 u46Var, View view) {
        CoreModule.f18264c.f20384f0.m33920cg().put(Boolean.TRUE);
        CoreModule.f18264c.f20384f0.f20679g0.onNext(uxj0.f181467a);
        bnl0.m105524M(this.f25814c, false);
        u46Var.mo42534q();
        r1j0.m179420g(gra.m131703k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.f18264c.f20384f0.m33941dq((double) uqb0.f180376H.guessedCurrentServerTime());
        i4g0.m138520r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m42330a0(final u46 u46Var, View view) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_weaken_tips_pop", "weakenDlg");
        w1e.m204402f(l4g0VarM204399c);
        new th0.C20312a(getContext()).m191160s("弱化未读消息").m191148g(true).m191143b(true).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.zm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f205040a.m42329Z(u46Var, view2);
            }
        }).m191151j(gra.m131703k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").m191147f("取消").m191144c(new View.OnClickListener() { // from class: l.an6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i4g0.m138520r("e_cancel", "p_weaken_tips_pop");
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.bn6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
        i4g0.m138523u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "down"), pf60.m172085a("weaken_click_type", "weaken"));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m42331b0(View view) {
        CoreModule.f18264c.f20384f0.f20721u0.put(Long.valueOf(pzi0.m174454o()));
        bnl0.m105524M(this.f25814c, false);
        i4g0.m138523u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "down"), pf60.m172085a("weaken_click_type", BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m42332c0(View view) {
        bnl0.m105524M(this.f25814c, false);
        CoreModule.f18264c.f20384f0.m34091pp();
        CoreModule.f18264c.f20384f0.f20715s0.put(Boolean.FALSE);
        i4g0.m138520r("e_old_messages_weakened_tips", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: d0 */
    public void m42333d0(Act act, final u46 u46Var) {
        bnl0.m105524M(this.f25814c, false);
        psd0.m173633z(this.f25819h);
        this.f25819h = u46Var.mo68557c(act, psd0.m173625r(CoreModule.f18264c.f20384f0.m33823Ue("fake_conversation_weaken_conversation"), CoreModule.f18264c.f20384f0.m33823Ue("fake_conversation_fold_conversation"), new rcj() { // from class: l.um6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Conversation) obj, (Conversation) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.vm6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184669a.m42328Y(u46Var, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public void m42334e0(u46 u46Var) {
        if (CoreModule.f18264c.f20384f0.m33920cg().get().booleanValue()) {
            m42336g0();
        } else {
            m42335f0(u46Var);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m42335f0(final u46 u46Var) {
        long jM174454o = pzi0.m174454o() - CoreModule.f18264c.f20384f0.f20721u0.get().longValue();
        VLinear vLinear = this.f25814c;
        if (jM174454o < 604800000) {
            bnl0.m105524M(vLinear, false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        bnl0.m105524M(this.f25817f, true);
        this.f25816e.setText(String.format(Locale.CHINESE, "弱化超过%d日的未读消息提醒，", Integer.valueOf(gra.m131703k().ignore_msg_days)));
        this.f25816e.setTypeface(lyh0.m156283c(3), 1);
        this.f25817f.setTypeface(lyh0.m156283c(3), 1);
        if (!xpp0.f195725b) {
            xpp0.f195725b = true;
            i4g0.m138492A("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "down"));
        }
        bnl0.m105509E0(this.f25817f, new View.OnClickListener() { // from class: l.wm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189772a.m42330a0(u46Var, view);
            }
        });
        bnl0.m105509E0(this.f25818g, new View.OnClickListener() { // from class: l.xm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195048a.m42331b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m42336g0() {
        if (!CoreModule.f18264c.f20384f0.f20715s0.get().booleanValue() || !gra.m131703k().ignore_old_unread_msg) {
            bnl0.m105524M(this.f25814c, false);
            return;
        }
        bnl0.m105524M(this.f25814c, true);
        bnl0.m105524M(this.f25817f, false);
        if (!xpp0.f195724a) {
            xpp0.f195724a = true;
            CoreModule.f18264c.f20384f0.f20718t0.m203841a(1);
            i4g0.m138526x("e_old_messages_weakened_tips", OMSDialogPositon.p_messages_view);
        }
        boolean z = gra.m131708l().enabled;
        TextView textView = this.f25816e;
        if (z) {
            textView.setText("已为你弱化更多早期未读消息提醒");
        } else {
            textView.setText(String.format(Locale.CHINESE, "超过%d天的未读消息已为你弱化提醒", Integer.valueOf(gra.m131703k().ignore_msg_days)));
            this.f25816e.setTypeface(lyh0.m156283c(3), 1);
        }
        bnl0.m105509E0(this.f25818g, new View.OnClickListener() { // from class: l.ym6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200640a.m42332c0(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42327X(this);
        if (gra.m131778z()) {
            this.f25818g.setImageResource(dbc0.f87449tg);
            this.f25815d.setImageResource(dbc0.f87253ni);
        }
    }

    public ConversationWeakenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
