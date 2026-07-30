package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationRealEcrGuideLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.Calendar;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.j760;
import p149l.jec0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.qib0;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wi6;
import p149l.wn90;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRealEcrGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConversationRealEcrGuideLayout f25028c;

    /* JADX INFO: renamed from: d */
    public VFrame f25029d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f25030e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25031f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f25032g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25033h;

    /* JADX INFO: renamed from: i */
    public VText_Medium f25034i;

    /* JADX INFO: renamed from: j */
    public VText f25035j;

    public ConversationRealEcrGuideLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m41246P(Act act, xaj0 xaj0Var, View view) {
        new jec0(act).show();
        zvf0.m220399u("e_messages_verify_guide", OMSDialogPositon.p_messages_view, j760.m140076a("match_status", Integer.valueOf(Math.min(((q860) xaj0Var.f191753c).f153135a.size(), upa.m194685Q0()))));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m41247Q(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C22306c m41250T(TabName tabName) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return mkd0.m154985s(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")), CoreModule.f17545c.f19552B0.m31611j4(), CoreModule.f17545c.f19642f0.m32903aq(calendar.getTimeInMillis()).onBackpressureDrop(), new y9j() { // from class: l.ui6
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((UserPrivilege) obj, (VerificationCenter) obj2, (q860) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m41251V(View view) {
        wi6.m203283a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m41252W(final Act act) {
        act.duringCreated((C22306c) ((NewMainAct) act).m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.qi6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).switchMap(new w9j() { // from class: l.ri6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationRealEcrGuideLayout.m41250T((TabName) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.si6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164684a.m41253X(act, (xaj0) obj);
            }
        }, new e30() { // from class: l.ti6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationRealEcrGuideLayout.m41247Q((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m41253X(final Act act, final xaj0 xaj0Var) {
        boolean zM204647R = wn90.m204602F().m204647R();
        ConversationRealEcrGuideLayout conversationRealEcrGuideLayout = this.f25028c;
        if (!zM204647R) {
            xdl0.m208344M(conversationRealEcrGuideLayout, false);
            return;
        }
        xdl0.m208344M(conversationRealEcrGuideLayout, true);
        if (vwb.m200296J(((q860) xaj0Var.f191753c).f153135a) || ((q860) xaj0Var.f191753c).f153135a.size() < upa.m194685Q0()) {
            xdl0.m208344M(this.f25029d, false);
        } else {
            xdl0.m208344M(this.f25029d, true);
            m41254Y(this.f25030e, 0, ((q860) xaj0Var.f191753c).f153135a);
            m41254Y(this.f25031f, 1, ((q860) xaj0Var.f191753c).f153135a);
            m41254Y(this.f25032g, 2, ((q860) xaj0Var.f191753c).f153135a);
        }
        this.f25035j.setText("认证后配对无上限");
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationRealEcrGuideLayout.m41246P(act, xaj0Var, view);
            }
        });
        this.f25034i.setText("未认证每日配对上限" + upa.m194685Q0() + "次");
        zvf0.m220368A("e_messages_verify_guide", OMSDialogPositon.p_messages_view, j760.m140076a("match_status", Integer.valueOf(Math.min(((q860) xaj0Var.f191753c).f153135a.size(), upa.m194685Q0()))));
    }

    /* JADX INFO: renamed from: Y */
    public final void m41254Y(VDraweeView vDraweeView, int i, List<Conversation> list) {
        if (i >= Math.min(list.size(), upa.m194685Q0())) {
            vDraweeView.setImageResource(0);
            vDraweeView.setBackgroundResource(x2c0.f190671w4);
            return;
        }
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(list.get(i).f56011id);
        vDraweeView.setBackgroundResource(0);
        if (userM169524oa == null || userM169524oa.isBanedOrInactivated()) {
            qib0.f154691G.m102354Y0(vDraweeView, x2c0.f190189h0);
        } else {
            qib0.f154691G.m102327J0(vDraweeView, userM169524oa.m60124fp().profileSmall(), true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41251V(this);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
