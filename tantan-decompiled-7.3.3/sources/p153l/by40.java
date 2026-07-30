package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.List;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class by40 implements iam<px40> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f78970a;

    /* JADX INFO: renamed from: b */
    public VLinear f78971b;

    /* JADX INFO: renamed from: c */
    public VListCell f78972c;

    /* JADX INFO: renamed from: d */
    public VLinear f78973d;

    /* JADX INFO: renamed from: e */
    public VListCell f78974e;

    /* JADX INFO: renamed from: f */
    public VListCell f78975f;

    /* JADX INFO: renamed from: g */
    public VListCell f78976g;

    /* JADX INFO: renamed from: h */
    public VListCell f78977h;

    /* JADX INFO: renamed from: i */
    public VListCell f78978i;

    /* JADX INFO: renamed from: j */
    public VLinear f78979j;

    /* JADX INFO: renamed from: k */
    public View f78980k;

    /* JADX INFO: renamed from: l */
    public VListCell f78981l;

    /* JADX INFO: renamed from: m */
    public VLinear f78982m;

    /* JADX INFO: renamed from: n */
    public VText f78983n;

    /* JADX INFO: renamed from: o */
    public VText f78984o;

    /* JADX INFO: renamed from: p */
    public Act f78985p;

    /* JADX INFO: renamed from: q */
    public px40 f78986q;

    public by40(Act act) {
        this.f78985p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m106964A(View view) {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
            iz40.m142756A();
            return;
        }
        bsj0.m106262T(this.f78981l);
        boolean zM106285u = bsj0.m106285u(this.f78981l);
        VLinear vLinear = this.f78982m;
        if (zM106285u) {
            bnl0.m105524M(vLinear, true);
            this.f78986q.m174110i0("silentSwitch", true);
        } else {
            bnl0.m105524M(vLinear, false);
            this.f78986q.m174110i0("silentSwitch", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m106965C(View view) {
        i4g0.m138526x("e_pushoff_mode_timesetting", "p_push_setting");
        qtk.m178007X0(this.f78985p, CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip(), CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip(), new z20() { // from class: l.rx40
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f165297a.m106983B((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m106976m(View view) {
        i4g0.m138520r("e_receive_push_switch", "p_push_setting");
        iz40.m142756A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m106977u(View view) {
        this.f78985p.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m106978v(View view) {
        bsj0.m106262T(this.f78974e);
        boolean zM106285u = bsj0.m106285u(this.f78974e);
        px40 px40Var = this.f78986q;
        if (zM106285u) {
            px40Var.m174110i0("msgPush", true);
        } else {
            px40Var.m174110i0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m106979w(View view) {
        bsj0.m106262T(this.f78975f);
        boolean zM106285u = bsj0.m106285u(this.f78975f);
        px40 px40Var = this.f78986q;
        if (zM106285u) {
            px40Var.m174110i0("momentPush", true);
        } else {
            px40Var.m174110i0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m106980x(View view) {
        bsj0.m106262T(this.f78976g);
        boolean zM106285u = bsj0.m106285u(this.f78976g);
        px40 px40Var = this.f78986q;
        if (zM106285u) {
            px40Var.m174110i0("livePush", true);
        } else {
            px40Var.m174110i0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m106981y(View view) {
        bsj0.m106262T(this.f78977h);
        boolean zM106285u = bsj0.m106285u(this.f78977h);
        px40 px40Var = this.f78986q;
        if (zM106285u) {
            px40Var.m174110i0("voiceLivePush", true);
        } else {
            px40Var.m174110i0("voiceLivePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m106982z(View view) {
        bsj0.m106262T(this.f78978i);
        boolean zM106285u = bsj0.m106285u(this.f78978i);
        px40 px40Var = this.f78986q;
        if (zM106285u) {
            px40Var.m174110i0("recommendPush", true);
        } else {
            px40Var.m174110i0("recommendPush", false);
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m106983B(Integer num, Integer num2) {
        this.f78986q.m174111j0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f78984o;
        StringBuilder sb = new StringBuilder();
        List<String> list = qtk.f159454g;
        sb.append(list.get(num.intValue()));
        sb.append(" - ");
        List<String> list2 = qtk.f159455h;
        sb.append(list2.get(num2.intValue()));
        vText.setText(sb.toString());
        i4g0.m138524v("e_pushoff_mode_timesetting", "p_push_setting", jyb.m147494Y("pushoff_time_setting", list.get(num.intValue()) + "-" + list2.get(num2.intValue())));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m106984E() {
        NotificationCheckerCommon.State stateM80403a = NotificationCheckerCommon.m80403a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.opened;
        VLinear vLinear = this.f78971b;
        if (stateM80403a == state) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f78973d, true);
            bsj0.m106284t(this.f78981l, CoreModule.f18264c.f20381e0.m116600p9().settings.userSilentSwitchPushTip().booleanValue());
            bnl0.m105524M(this.f78982m, bsj0.m106285u(this.f78981l));
            m106985F(false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        bnl0.m105524M(this.f78982m, false);
        bnl0.m105524M(this.f78973d, false);
        bsj0.m106284t(this.f78981l, false);
        m106985F(true);
    }

    /* JADX INFO: renamed from: F */
    public void m106985F(boolean z) {
        if (z) {
            i4g0.m138526x("e_receive_push_switch", "p_push_setting");
        } else {
            i4g0.m138526x("e_friend_message_switch", "p_push_setting");
            i4g0.m138526x("e_moment_push_switch", "p_push_setting");
            i4g0.m138526x("e_live_push_switch", "p_push_setting");
            i4g0.m138526x("e_personal_reference_switch", "p_push_setting");
            i4g0.m138526x("e_chatroom_switch", "p_push_setting");
        }
        i4g0.m138526x("e_pushoff_mode_switch", "p_push_setting");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106986n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m106986n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cy40.m113097b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(px40 px40Var) {
        this.f78986q = px40Var;
    }

    /* JADX INFO: renamed from: q */
    public void m106988q() {
        this.f78985p.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.qx40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160010a.m106990s((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public void m106989r() {
        this.f78970a.setTitle("通知设置");
        this.f78970a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171081a.m106977u(view);
            }
        });
        this.f78974e.setTitleBottomPadding(3);
        this.f78975f.setTitleBottomPadding(3);
        this.f78976g.setTitleBottomPadding(3);
        this.f78977h.setTitleBottomPadding(3);
        this.f78978i.setTitleBottomPadding(3);
        this.f78981l.setTitleBottomPadding(3);
        bsj0.m106284t(this.f78974e, CoreModule.f18264c.f20381e0.m116600p9().settings.userMsgPushTip().booleanValue());
        bsj0.m106284t(this.f78975f, CoreModule.f18264c.f20381e0.m116600p9().settings.userMomentPushTip().booleanValue());
        bsj0.m106284t(this.f78976g, CoreModule.f18264c.f20381e0.m116600p9().settings.userLivePushTip().booleanValue());
        bsj0.m106284t(this.f78977h, CoreModule.f18264c.f20381e0.m116600p9().settings.userVoiceLivePushTip().booleanValue());
        bsj0.m106284t(this.f78978i, CoreModule.f18264c.f20381e0.m116600p9().settings.userRecommendPushTip().booleanValue());
        this.f78972c.setOnClickListener(new View.OnClickListener() { // from class: l.tx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                by40.m106976m(view);
            }
        });
        this.f78974e.setOnClickListener(new View.OnClickListener() { // from class: l.ux40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181342a.m106978v(view);
            }
        });
        this.f78975f.setOnClickListener(new View.OnClickListener() { // from class: l.vx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186234a.m106979w(view);
            }
        });
        this.f78976g.setOnClickListener(new View.OnClickListener() { // from class: l.wx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191366a.m106980x(view);
            }
        });
        this.f78977h.setOnClickListener(new View.OnClickListener() { // from class: l.xx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196604a.m106981y(view);
            }
        });
        this.f78978i.setOnClickListener(new View.OnClickListener() { // from class: l.yx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201930a.m106982z(view);
            }
        });
        this.f78981l.setOnClickListener(new View.OnClickListener() { // from class: l.zx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206436a.m106964A(view);
            }
        });
        this.f78982m.setOnClickListener(new View.OnClickListener() { // from class: l.ay40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73945a.m106965C(view);
            }
        });
        bnl0.m105524M(this.f78982m, bsj0.m106285u(this.f78981l));
        if (CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() < 0 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() > 23 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip() < 1 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f78984o.setText(qtk.f159454g.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip()) + " - " + qtk.f159455h.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip() - 1));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m106990s(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m106984E();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
