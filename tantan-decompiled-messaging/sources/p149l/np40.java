package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.List;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class np40 implements s7m<bp40> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f139911a;

    /* JADX INFO: renamed from: b */
    public VLinear f139912b;

    /* JADX INFO: renamed from: c */
    public VListCell f139913c;

    /* JADX INFO: renamed from: d */
    public VLinear f139914d;

    /* JADX INFO: renamed from: e */
    public VListCell f139915e;

    /* JADX INFO: renamed from: f */
    public VListCell f139916f;

    /* JADX INFO: renamed from: g */
    public VListCell f139917g;

    /* JADX INFO: renamed from: h */
    public VListCell f139918h;

    /* JADX INFO: renamed from: i */
    public VListCell f139919i;

    /* JADX INFO: renamed from: j */
    public VLinear f139920j;

    /* JADX INFO: renamed from: k */
    public View f139921k;

    /* JADX INFO: renamed from: l */
    public VListCell f139922l;

    /* JADX INFO: renamed from: m */
    public VLinear f139923m;

    /* JADX INFO: renamed from: n */
    public VText f139924n;

    /* JADX INFO: renamed from: o */
    public VText f139925o;

    /* JADX INFO: renamed from: p */
    public Act f139926p;

    /* JADX INFO: renamed from: q */
    public bp40 f139927q;

    public np40(Act act) {
        this.f139926p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m160445A(View view) {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
            uq40.m194951A();
            return;
        }
        yij0.m214942T(this.f139922l);
        boolean zM214965u = yij0.m214965u(this.f139922l);
        VLinear vLinear = this.f139923m;
        if (zM214965u) {
            xdl0.m208344M(vLinear, true);
            this.f139927q.m103039i0("silentSwitch", true);
        } else {
            xdl0.m208344M(vLinear, false);
            this.f139927q.m103039i0("silentSwitch", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m160446C(View view) {
        zvf0.m220402x("e_pushoff_mode_timesetting", "p_push_setting");
        ark.m98457X0(this.f139926p, CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip(), CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip(), new f30() { // from class: l.dp40
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f87235a.m160464B((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m160457m(View view) {
        zvf0.m220396r("e_receive_push_switch", "p_push_setting");
        uq40.m194951A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m160458u(View view) {
        this.f139926p.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m160459v(View view) {
        yij0.m214942T(this.f139915e);
        boolean zM214965u = yij0.m214965u(this.f139915e);
        bp40 bp40Var = this.f139927q;
        if (zM214965u) {
            bp40Var.m103039i0("msgPush", true);
        } else {
            bp40Var.m103039i0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m160460w(View view) {
        yij0.m214942T(this.f139916f);
        boolean zM214965u = yij0.m214965u(this.f139916f);
        bp40 bp40Var = this.f139927q;
        if (zM214965u) {
            bp40Var.m103039i0("momentPush", true);
        } else {
            bp40Var.m103039i0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m160461x(View view) {
        yij0.m214942T(this.f139917g);
        boolean zM214965u = yij0.m214965u(this.f139917g);
        bp40 bp40Var = this.f139927q;
        if (zM214965u) {
            bp40Var.m103039i0("livePush", true);
        } else {
            bp40Var.m103039i0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m160462y(View view) {
        yij0.m214942T(this.f139918h);
        boolean zM214965u = yij0.m214965u(this.f139918h);
        bp40 bp40Var = this.f139927q;
        if (zM214965u) {
            bp40Var.m103039i0("voiceLivePush", true);
        } else {
            bp40Var.m103039i0("voiceLivePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m160463z(View view) {
        yij0.m214942T(this.f139919i);
        boolean zM214965u = yij0.m214965u(this.f139919i);
        bp40 bp40Var = this.f139927q;
        if (zM214965u) {
            bp40Var.m103039i0("recommendPush", true);
        } else {
            bp40Var.m103039i0("recommendPush", false);
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m160464B(Integer num, Integer num2) {
        this.f139927q.m103040j0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f139925o;
        StringBuilder sb = new StringBuilder();
        List<String> list = ark.f71284g;
        sb.append(list.get(num.intValue()));
        sb.append(" - ");
        List<String> list2 = ark.f71285h;
        sb.append(list2.get(num2.intValue()));
        vText.setText(sb.toString());
        zvf0.m220400v("e_pushoff_mode_timesetting", "p_push_setting", vwb.m200311Y("pushoff_time_setting", list.get(num.intValue()) + "-" + list2.get(num2.intValue())));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m160465E() {
        NotificationCheckerCommon.State stateM79220a = NotificationCheckerCommon.m79220a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.opened;
        VLinear vLinear = this.f139912b;
        if (stateM79220a == state) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f139914d, true);
            yij0.m214964t(this.f139922l, CoreModule.f17545c.f19639e0.m169527p9().settings.userSilentSwitchPushTip().booleanValue());
            xdl0.m208344M(this.f139923m, yij0.m214965u(this.f139922l));
            m160466F(false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        xdl0.m208344M(this.f139923m, false);
        xdl0.m208344M(this.f139914d, false);
        yij0.m214964t(this.f139922l, false);
        m160466F(true);
    }

    /* JADX INFO: renamed from: F */
    public void m160466F(boolean z) {
        if (z) {
            zvf0.m220402x("e_receive_push_switch", "p_push_setting");
        } else {
            zvf0.m220402x("e_friend_message_switch", "p_push_setting");
            zvf0.m220402x("e_moment_push_switch", "p_push_setting");
            zvf0.m220402x("e_live_push_switch", "p_push_setting");
            zvf0.m220402x("e_personal_reference_switch", "p_push_setting");
            zvf0.m220402x("e_chatroom_switch", "p_push_setting");
        }
        zvf0.m220402x("e_pushoff_mode_switch", "p_push_setting");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m160467n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m160467n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return op40.m165297b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bp40 bp40Var) {
        this.f139927q = bp40Var;
    }

    /* JADX INFO: renamed from: q */
    public void m160469q() {
        this.f139926p.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.cp40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81900a.m160471s((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public void m160470r() {
        this.f139911a.setTitle("通知设置");
        this.f139911a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ep40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92602a.m160458u(view);
            }
        });
        this.f139915e.setTitleBottomPadding(3);
        this.f139916f.setTitleBottomPadding(3);
        this.f139917g.setTitleBottomPadding(3);
        this.f139918h.setTitleBottomPadding(3);
        this.f139919i.setTitleBottomPadding(3);
        this.f139922l.setTitleBottomPadding(3);
        yij0.m214964t(this.f139915e, CoreModule.f17545c.f19639e0.m169527p9().settings.userMsgPushTip().booleanValue());
        yij0.m214964t(this.f139916f, CoreModule.f17545c.f19639e0.m169527p9().settings.userMomentPushTip().booleanValue());
        yij0.m214964t(this.f139917g, CoreModule.f17545c.f19639e0.m169527p9().settings.userLivePushTip().booleanValue());
        yij0.m214964t(this.f139918h, CoreModule.f17545c.f19639e0.m169527p9().settings.userVoiceLivePushTip().booleanValue());
        yij0.m214964t(this.f139919i, CoreModule.f17545c.f19639e0.m169527p9().settings.userRecommendPushTip().booleanValue());
        this.f139913c.setOnClickListener(new View.OnClickListener() { // from class: l.fp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                np40.m160457m(view);
            }
        });
        this.f139915e.setOnClickListener(new View.OnClickListener() { // from class: l.gp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103759a.m160459v(view);
            }
        });
        this.f139916f.setOnClickListener(new View.OnClickListener() { // from class: l.hp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108894a.m160460w(view);
            }
        });
        this.f139917g.setOnClickListener(new View.OnClickListener() { // from class: l.ip40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114267a.m160461x(view);
            }
        });
        this.f139918h.setOnClickListener(new View.OnClickListener() { // from class: l.jp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119052a.m160462y(view);
            }
        });
        this.f139919i.setOnClickListener(new View.OnClickListener() { // from class: l.kp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124117a.m160463z(view);
            }
        });
        this.f139922l.setOnClickListener(new View.OnClickListener() { // from class: l.lp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129163a.m160445A(view);
            }
        });
        this.f139923m.setOnClickListener(new View.OnClickListener() { // from class: l.mp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135009a.m160446C(view);
            }
        });
        xdl0.m208344M(this.f139923m, yij0.m214965u(this.f139922l));
        if (CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() < 0 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() > 23 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip() < 1 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f139925o.setText(ark.f71284g.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip()) + " - " + ark.f71285h.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip() - 1));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m160471s(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m160465E();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
