package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationRealEcrGuideLayout;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.Calendar;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.upa;
import l.vwb;
import l.w9j;
import l.wi6;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.y9j;
import l.zvf0;
import p009l.jec0;
import p009l.mqi0;
import p009l.q860;
import p009l.wn90;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationRealEcrGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConversationRealEcrGuideLayout f3806c;

    /* JADX INFO: renamed from: d */
    public VFrame f3807d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f3808e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3809f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3810g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3811h;

    /* JADX INFO: renamed from: i */
    public VText_Medium f3812i;

    /* JADX INFO: renamed from: j */
    public VText f3813j;

    public ConversationRealEcrGuideLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m5352P(Act act, xaj0 xaj0Var, View view) {
        new jec0(act).show();
        zvf0.u("e_messages_verify_guide", "p_messages_view", new j760[]{j760.a("match_status", Integer.valueOf(Math.min(((q860) xaj0Var.c).f19068a.size(), upa.Q0())))});
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m5353Q(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ c m5356T(TabName tabName) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m18550o());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return mkd0.s(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")), CoreModule.c.B0.j4(), CoreModule.c.f0.aq(calendar.getTimeInMillis()).onBackpressureDrop(), new y9j() { // from class: l.ui6
            /* JADX INFO: renamed from: a */
            public final Object m23054a(Object obj, Object obj2, Object obj3) {
                return new xaj0((UserPrivilege) obj, (VerificationCenter) obj2, (q860) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m5357V(View view) {
        wi6.a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public void m5358W(final Act act) {
        act.duringCreated(((NewMainAct) act).m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.qi6
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).switchMap(new w9j() { // from class: l.ri6
            public final Object call(Object obj) {
                return ConversationRealEcrGuideLayout.m5356T((TabName) obj);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.si6
            public final void call(Object obj) {
                this.f20275a.m5359X(act, (xaj0) obj);
            }
        }, new e30() { // from class: l.ti6
            public final void call(Object obj) {
                ConversationRealEcrGuideLayout.m5353Q((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m5359X(final Act act, final xaj0 xaj0Var) {
        boolean zM24384R = wn90.m24339F().m24384R();
        VLinear vLinear = this.f3806c;
        if (!zM24384R) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        if (vwb.J(((q860) xaj0Var.c).f19068a) || ((q860) xaj0Var.c).f19068a.size() < upa.Q0()) {
            xdl0.M(this.f3807d, false);
        } else {
            xdl0.M(this.f3807d, true);
            m5360Y(this.f3808e, 0, ((q860) xaj0Var.c).f19068a);
            m5360Y(this.f3809f, 1, ((q860) xaj0Var.c).f19068a);
            m5360Y(this.f3810g, 2, ((q860) xaj0Var.c).f19068a);
        }
        this.f3813j.setText("认证后配对无上限");
        xdl0.E0(this, new View.OnClickListener() { // from class: l.vi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationRealEcrGuideLayout.m5352P(act, xaj0Var, view);
            }
        });
        this.f3812i.setText("未认证每日配对上限" + upa.Q0() + "次");
        zvf0.A("e_messages_verify_guide", "p_messages_view", new j760[]{j760.a("match_status", Integer.valueOf(Math.min(((q860) xaj0Var.c).f19068a.size(), upa.Q0())))});
    }

    /* JADX INFO: renamed from: Y */
    public final void m5360Y(VDraweeView vDraweeView, int i, List<Conversation> list) {
        if (i >= Math.min(list.size(), upa.Q0())) {
            vDraweeView.setImageResource(0);
            vDraweeView.setBackgroundResource(x2c0.w4);
            return;
        }
        User userOa = CoreModule.c.e0.oa(((DbObject) list.get(i)).id);
        vDraweeView.setBackgroundResource(0);
        if (userOa == null || userOa.isBanedOrInactivated()) {
            qib0.G.Y0(vDraweeView, x2c0.h0);
        } else {
            qib0.G.J0(vDraweeView, userOa.fp().profileSmall(), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5357V(this);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRealEcrGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
