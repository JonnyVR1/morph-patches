package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.List;
import l.ark;
import l.e30;
import l.f30;
import l.j760;
import l.mkd0;
import l.op40;
import l.s7m;
import l.uq40;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VLinear;
import v.VListCell;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class np40 implements s7m<bp40> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f17770a;

    /* JADX INFO: renamed from: b */
    public VLinear f17771b;

    /* JADX INFO: renamed from: c */
    public VListCell f17772c;

    /* JADX INFO: renamed from: d */
    public VLinear f17773d;

    /* JADX INFO: renamed from: e */
    public VListCell f17774e;

    /* JADX INFO: renamed from: f */
    public VListCell f17775f;

    /* JADX INFO: renamed from: g */
    public VListCell f17776g;

    /* JADX INFO: renamed from: h */
    public VListCell f17777h;

    /* JADX INFO: renamed from: i */
    public VListCell f17778i;

    /* JADX INFO: renamed from: j */
    public VLinear f17779j;

    /* JADX INFO: renamed from: k */
    public View f17780k;

    /* JADX INFO: renamed from: l */
    public VListCell f17781l;

    /* JADX INFO: renamed from: m */
    public VLinear f17782m;

    /* JADX INFO: renamed from: n */
    public VText f17783n;

    /* JADX INFO: renamed from: o */
    public VText f17784o;

    /* JADX INFO: renamed from: p */
    public Act f17785p;

    /* JADX INFO: renamed from: q */
    public bp40 f17786q;

    public np40(Act act) {
        this.f17785p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m20169A(View view) {
        if (NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed) {
            uq40.A();
            return;
        }
        yij0.T(this.f17781l);
        boolean zU = yij0.u(this.f17781l);
        VLinear vLinear = this.f17782m;
        if (zU) {
            xdl0.M(vLinear, true);
            this.f17786q.m12832i0("silentSwitch", true);
        } else {
            xdl0.M(vLinear, false);
            this.f17786q.m12832i0("silentSwitch", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m20170C(View view) {
        zvf0.x("e_pushoff_mode_timesetting", "p_push_setting");
        ark.X0(this.f17785p, CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip(), CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip(), new f30() { // from class: l.dp40
            public final void call(Object obj, Object obj2) {
                this.f10507a.m20188B((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m20181m(View view) {
        zvf0.r("e_receive_push_switch", "p_push_setting");
        uq40.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m20182u(View view) {
        this.f17785p.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m20183v(View view) {
        yij0.T(this.f17774e);
        boolean zU = yij0.u(this.f17774e);
        bp40 bp40Var = this.f17786q;
        if (zU) {
            bp40Var.m12832i0("msgPush", true);
        } else {
            bp40Var.m12832i0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m20184w(View view) {
        yij0.T(this.f17775f);
        boolean zU = yij0.u(this.f17775f);
        bp40 bp40Var = this.f17786q;
        if (zU) {
            bp40Var.m12832i0("momentPush", true);
        } else {
            bp40Var.m12832i0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m20185x(View view) {
        yij0.T(this.f17776g);
        boolean zU = yij0.u(this.f17776g);
        bp40 bp40Var = this.f17786q;
        if (zU) {
            bp40Var.m12832i0("livePush", true);
        } else {
            bp40Var.m12832i0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m20186y(View view) {
        yij0.T(this.f17777h);
        boolean zU = yij0.u(this.f17777h);
        bp40 bp40Var = this.f17786q;
        if (zU) {
            bp40Var.m12832i0("voiceLivePush", true);
        } else {
            bp40Var.m12832i0("voiceLivePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m20187z(View view) {
        yij0.T(this.f17778i);
        boolean zU = yij0.u(this.f17778i);
        bp40 bp40Var = this.f17786q;
        if (zU) {
            bp40Var.m12832i0("recommendPush", true);
        } else {
            bp40Var.m12832i0("recommendPush", false);
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m20188B(Integer num, Integer num2) {
        this.f17786q.m12833j0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f17784o;
        StringBuilder sb = new StringBuilder();
        List list = ark.g;
        sb.append((String) list.get(num.intValue()));
        sb.append(" - ");
        List list2 = ark.h;
        sb.append((String) list2.get(num2.intValue()));
        vText.setText(sb.toString());
        zvf0.v("e_pushoff_mode_timesetting", "p_push_setting", new j760[]{vwb.Y("pushoff_time_setting", ((String) list.get(num.intValue())) + "-" + ((String) list2.get(num2.intValue())))});
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20189C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m20190E() {
        NotificationCheckerCommon.State stateA = NotificationCheckerCommon.a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.opened;
        VLinear vLinear = this.f17771b;
        if (stateA == state) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f17773d, true);
            yij0.t(this.f17781l, CoreModule.f1534c.f3628e0.m21490p9().settings.userSilentSwitchPushTip().booleanValue());
            xdl0.M(this.f17782m, yij0.u(this.f17781l));
            m20191F(false);
            return;
        }
        xdl0.M(vLinear, true);
        xdl0.M(this.f17782m, false);
        xdl0.M(this.f17773d, false);
        yij0.t(this.f17781l, false);
        m20191F(true);
    }

    /* JADX INFO: renamed from: F */
    public void m20191F(boolean z) {
        if (z) {
            zvf0.x("e_receive_push_switch", "p_push_setting");
        } else {
            zvf0.x("e_friend_message_switch", "p_push_setting");
            zvf0.x("e_moment_push_switch", "p_push_setting");
            zvf0.x("e_live_push_switch", "p_push_setting");
            zvf0.x("e_personal_reference_switch", "p_push_setting");
            zvf0.x("e_chatroom_switch", "p_push_setting");
        }
        zvf0.x("e_pushoff_mode_switch", "p_push_setting");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20193n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m20193n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return op40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m20192i1(bp40 bp40Var) {
        this.f17786q = bp40Var;
    }

    /* JADX INFO: renamed from: q */
    public void m20195q() {
        this.f17785p.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.cp40
            public final void call(Object obj) {
                this.f9773a.m20197s((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public void m20196r() {
        this.f17770a.setTitle("通知设置");
        this.f17770a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ep40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11382a.m20182u(view);
            }
        });
        this.f17774e.setTitleBottomPadding(3);
        this.f17775f.setTitleBottomPadding(3);
        this.f17776g.setTitleBottomPadding(3);
        this.f17777h.setTitleBottomPadding(3);
        this.f17778i.setTitleBottomPadding(3);
        this.f17781l.setTitleBottomPadding(3);
        yij0.t(this.f17774e, CoreModule.f1534c.f3628e0.m21490p9().settings.userMsgPushTip().booleanValue());
        yij0.t(this.f17775f, CoreModule.f1534c.f3628e0.m21490p9().settings.userMomentPushTip().booleanValue());
        yij0.t(this.f17776g, CoreModule.f1534c.f3628e0.m21490p9().settings.userLivePushTip().booleanValue());
        yij0.t(this.f17777h, CoreModule.f1534c.f3628e0.m21490p9().settings.userVoiceLivePushTip().booleanValue());
        yij0.t(this.f17778i, CoreModule.f1534c.f3628e0.m21490p9().settings.userRecommendPushTip().booleanValue());
        this.f17772c.setOnClickListener(new View.OnClickListener() { // from class: l.fp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                np40.m20181m(view);
            }
        });
        this.f17774e.setOnClickListener(new View.OnClickListener() { // from class: l.gp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13422a.m20183v(view);
            }
        });
        this.f17775f.setOnClickListener(new View.OnClickListener() { // from class: l.hp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14001a.m20184w(view);
            }
        });
        this.f17776g.setOnClickListener(new View.OnClickListener() { // from class: l.ip40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14621a.m20185x(view);
            }
        });
        this.f17777h.setOnClickListener(new View.OnClickListener() { // from class: l.jp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15312a.m20186y(view);
            }
        });
        this.f17778i.setOnClickListener(new View.OnClickListener() { // from class: l.kp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15950a.m20187z(view);
            }
        });
        this.f17781l.setOnClickListener(new View.OnClickListener() { // from class: l.lp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16548a.m20169A(view);
            }
        });
        this.f17782m.setOnClickListener(new View.OnClickListener() { // from class: l.mp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17174a.m20170C(view);
            }
        });
        xdl0.M(this.f17782m, yij0.u(this.f17781l));
        if (CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() < 0 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() > 23 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip() < 1 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f17784o.setText(((String) ark.g.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip())) + " - " + ((String) ark.h.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip() - 1)));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m20197s(c cVar) {
        if (cVar == c.i) {
            m20190E();
        }
    }

    public void destroy() {
    }
}
