package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationRealEcrGuideLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.Calendar;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.aw90;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qmc0;
import p153l.scj;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;
import p153l.zj6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRealEcrGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConversationRealEcrGuideLayout f25770c;

    /* JADX INFO: renamed from: d */
    public VFrame f25771d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f25772e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25773f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f25774g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25775h;

    /* JADX INFO: renamed from: i */
    public VText_Medium f25776i;

    /* JADX INFO: renamed from: j */
    public VText f25777j;

    public ConversationRealEcrGuideLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m42257P(Act act, bkj0 bkj0Var, View view) {
        new qmc0(act).show();
        i4g0.m138523u("e_messages_verify_guide", OMSDialogPositon.p_messages_view, pf60.m172085a("match_status", Integer.valueOf(Math.min(((vg60) bkj0Var.f77083c).f184001a.size(), gra.m131616Q0()))));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m42258Q(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C22421c m42261T(TabName tabName) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return psd0.m173626s(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")), CoreModule.f18264c.f20294B0.m32614j4(), CoreModule.f18264c.f20384f0.m33906aq(calendar.getTimeInMillis()).onBackpressureDrop(), new scj() { // from class: l.xj6
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((UserPrivilege) obj, (VerificationCenter) obj2, (vg60) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m42262V(View view) {
        zj6.m219966a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m42263W(final Act act) {
        act.duringCreated((C22421c) ((NewMainAct) act).m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.tj6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).switchMap(new qcj() { // from class: l.uj6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationRealEcrGuideLayout.m42261T((TabName) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.vj6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184356a.m42264X(act, (bkj0) obj);
            }
        }, new y20() { // from class: l.wj6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationRealEcrGuideLayout.m42258Q((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m42264X(final Act act, final bkj0 bkj0Var) {
        boolean zM100607R = aw90.m100562F().m100607R();
        ConversationRealEcrGuideLayout conversationRealEcrGuideLayout = this.f25770c;
        if (!zM100607R) {
            bnl0.m105524M(conversationRealEcrGuideLayout, false);
            return;
        }
        bnl0.m105524M(conversationRealEcrGuideLayout, true);
        if (jyb.m147479J(((vg60) bkj0Var.f77083c).f184001a) || ((vg60) bkj0Var.f77083c).f184001a.size() < gra.m131616Q0()) {
            bnl0.m105524M(this.f25771d, false);
        } else {
            bnl0.m105524M(this.f25771d, true);
            m42265Y(this.f25772e, 0, ((vg60) bkj0Var.f77083c).f184001a);
            m42265Y(this.f25773f, 1, ((vg60) bkj0Var.f77083c).f184001a);
            m42265Y(this.f25774g, 2, ((vg60) bkj0Var.f77083c).f184001a);
        }
        this.f25777j.setText("认证后配对无上限");
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.yj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationRealEcrGuideLayout.m42257P(act, bkj0Var, view);
            }
        });
        this.f25776i.setText("未认证每日配对上限" + gra.m131616Q0() + "次");
        i4g0.m138492A("e_messages_verify_guide", OMSDialogPositon.p_messages_view, pf60.m172085a("match_status", Integer.valueOf(Math.min(((vg60) bkj0Var.f77083c).f184001a.size(), gra.m131616Q0()))));
    }

    /* JADX INFO: renamed from: Y */
    public final void m42265Y(VDraweeView vDraweeView, int i, List<Conversation> list) {
        if (i >= Math.min(list.size(), gra.m131616Q0())) {
            vDraweeView.setImageResource(0);
            vDraweeView.setBackgroundResource(dbc0.f87566x4);
            return;
        }
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(list.get(i).f56859id);
        vDraweeView.setBackgroundResource(0);
        if (userM116597oa == null || userM116597oa.isBanedOrInactivated()) {
            uqb0.f180374G.m127138Y0(vDraweeView, dbc0.f87072i0);
        } else {
            uqb0.f180374G.m127111J0(vDraweeView, userM116597oa.m61308fp().profileSmall(), true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42262V(this);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
