package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import p147v.VImage;
import p149l.ahp0;
import p149l.c4g0;
import p149l.cwf0;
import p149l.e30;
import p149l.i0e;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.p36;
import p149l.qib0;
import p149l.roj0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class WeakenedTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public WeakenedTipsView f27032d;

    /* JADX INFO: renamed from: e */
    public VImage f27033e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f27034f;

    /* JADX INFO: renamed from: g */
    public VImage f27035g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f27036h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f27037i;

    /* JADX INFO: renamed from: j */
    public c4g0 f27038j;

    public WeakenedTipsView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m43799o0(View view) {
        zvf0.m220399u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "up"), j760.m140076a("weaken_click_type", BLiveOperationTitleShowType.off));
        xdl0.m208344M(this, false);
        if (CoreModule.f17545c.f19639e0.f149167E5.get().intValue() != 1) {
            CoreModule.f17545c.f19639e0.f149167E5.m189988a(1);
        } else {
            CoreModule.f17545c.f19639e0.f149174F5.put(Long.valueOf(mqi0.m155944o() + 2592000000L));
            CoreModule.f17545c.f19639e0.f149167E5.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m43800r() {
        xdl0.m208329E0(this.f27035g, new View.OnClickListener() { // from class: l.ugp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176409a.m43799o0(view);
            }
        });
        if (upa.m194847z()) {
            this.f27033e.setImageResource(x2c0.f190780zh);
            this.f27035g.setImageResource(x2c0.f189329Ff);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m43801n0(View view) {
        ahp0.m96549a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43801n0(this);
        if (upa.m194847z()) {
            this.f27034f.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f27036h.setTextColor(Color.parseColor("#66000000"));
            this.f27035g.setImageResource(x2c0.f189329Ff);
        }
        m43800r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m43802p0(p36 p36Var, View view) {
        CoreModule.f17545c.f19642f0.m32917cg().put(Boolean.TRUE);
        CoreModule.f17545c.f19642f0.f19937g0.onNext(roj0.f160388a);
        xdl0.m208344M(this, false);
        p36Var.mo41523q();
        osi0.m165783g(upa.m194772k().ignore_msg_days + "日前未读消息已弱化提醒，可在设置中更改。");
        CoreModule.f17545c.f19642f0.m32938dq((double) qib0.f154693H.guessedCurrentServerTime());
        zvf0.m220396r("e_confirm", "p_weaken_tips_pop");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m43803q0(final p36 p36Var, View view) {
        zvf0.m220399u("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "up"), j760.m140076a("weaken_click_type", "weaken"));
        CoreModule.f17545c.f19639e0.f149167E5.clear();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_weaken_tips_pop", "weakenDlg");
        i0e.m133797f(cwf0VarM133794c);
        new xh0.C21150a(getContext()).m208740s("弱化未读消息").m208728g(true).m208723b(true).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.xgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f192782a.m43802p0(p36Var, view2);
            }
        }).m208731j(upa.m194772k().ignore_msg_days + "日前未读消息将弱化展示不再记数。可在设置-隐私和通知修改").m208727f("取消").m208724c(new View.OnClickListener() { // from class: l.ygp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.m220396r("e_cancel", "p_weaken_tips_pop");
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.zgp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m43804r0(roj0 roj0Var) {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m43805s0(final p36 p36Var, int i) {
        this.f27036h.setText(String.format("你有%s条%s日前未读消息，是否需要弱化展示？", Integer.valueOf(i), Integer.valueOf(upa.m194772k().ignore_msg_days)));
        xdl0.m208329E0(this.f27037i, new View.OnClickListener() { // from class: l.vgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181416a.m43803q0(p36Var, view);
            }
        });
        mkd0.m154992z(this.f27038j);
        this.f27038j = CoreModule.f17545c.f19642f0.f19937g0.subscribe(mkd0.m154955G(new e30() { // from class: l.wgp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186213a.m43804r0((roj0) obj);
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
