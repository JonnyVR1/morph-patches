package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import p151v.VImage;
import p153l.bnl0;
import p153l.dbc0;
import p153l.eqp0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.r1j0;
import p153l.th0;
import p153l.u46;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class WeakenedTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public WeakenedTipsView f27880d;

    /* JADX INFO: renamed from: e */
    public VImage f27881e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f27882f;

    /* JADX INFO: renamed from: g */
    public VImage f27883g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f27884h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f27885i;

    /* JADX INFO: renamed from: j */
    public kcg0 f27886j;

    public WeakenedTipsView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m44985o0(View view) {
        i4g0.m138523u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "up"), pf60.m172085a("weaken_click_type", BLiveOperationTitleShowType.off));
        bnl0.m105524M(this, false);
        if (CoreModule.f18264c.f20381e0.f89024E5.get().intValue() != 1) {
            CoreModule.f18264c.f20381e0.f89024E5.m203841a(1);
        } else {
            CoreModule.f18264c.f20381e0.f89031F5.put(Long.valueOf(pzi0.m174454o() + 2592000000L));
            CoreModule.f18264c.f20381e0.f89024E5.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m44986r() {
        bnl0.m105509E0(this.f27883g, new View.OnClickListener() { // from class: l.ypp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201080a.m44985o0(view);
            }
        });
        if (gra.m131778z()) {
            this.f27881e.setImageResource(dbc0.f87253ni);
            this.f27883g.setImageResource(dbc0.f87449tg);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m44987n0(View view) {
        eqp0.m122028a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44987n0(this);
        if (gra.m131778z()) {
            this.f27882f.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f27884h.setTextColor(Color.parseColor("#66000000"));
            this.f27883g.setImageResource(dbc0.f87449tg);
        }
        m44986r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m44988p0(u46 u46Var, View view) {
        CoreModule.f18264c.f20384f0.m33920cg().put(Boolean.TRUE);
        CoreModule.f18264c.f20384f0.f20679g0.onNext(uxj0.f181467a);
        bnl0.m105524M(this, false);
        u46Var.mo42534q();
        r1j0.m179420g(gra.m131703k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.f18264c.f20384f0.m33941dq((double) uqb0.f180376H.guessedCurrentServerTime());
        i4g0.m138520r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m44989q0(final u46 u46Var, View view) {
        i4g0.m138523u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "up"), pf60.m172085a("weaken_click_type", "weaken"));
        CoreModule.f18264c.f20381e0.f89024E5.clear();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_weaken_tips_pop", "weakenDlg");
        w1e.m204402f(l4g0VarM204399c);
        new th0.C20312a(getContext()).m191160s("弱化未读消息").m191148g(true).m191143b(true).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.bqp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77909a.m44988p0(u46Var, view2);
            }
        }).m191151j(gra.m131703k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").m191147f("取消").m191144c(new View.OnClickListener() { // from class: l.cqp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i4g0.m138520r("e_cancel", "p_weaken_tips_pop");
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.dqp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m44990r0(uxj0 uxj0Var) {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m44991s0(final u46 u46Var, int i) {
        this.f27884h.setText(String.format("你有%s条%s日前未读消息，是否需要弱化展示？", Integer.valueOf(i), Integer.valueOf(gra.m131703k().ignore_msg_days)));
        bnl0.m105509E0(this.f27885i, new View.OnClickListener() { // from class: l.zpp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205515a.m44989q0(u46Var, view);
            }
        });
        psd0.m173633z(this.f27886j);
        this.f27886j = CoreModule.f18264c.f20384f0.f20679g0.subscribe(psd0.m173596G(new y20() { // from class: l.aqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72828a.m44990r0((uxj0) obj);
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
