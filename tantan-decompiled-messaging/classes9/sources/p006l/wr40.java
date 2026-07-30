package p006l;

import android.content.DialogInterface;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.notification.NotificationOptAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.MomentNotifyBlockType;
import com.p1.mobile.putong.data.NotificationSetting;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPushSettings;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.e30;
import l.i0e;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.uq40;
import l.w9j;
import l.xh0;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wr40 extends jq2<it40> {

    /* JADX INFO: renamed from: a */
    public NotificationOptAct f25321a;

    /* JADX INFO: renamed from: b */
    public User f25322b;

    /* JADX INFO: renamed from: c */
    public Settings f25323c;

    public wr40(mcr mcrVar) {
        super(mcrVar);
        this.f25321a = (NotificationOptAct) mcrVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m26632e0(View view) {
        zvf0.r("e_receive_push_switch", "p_set_push_scope_pop");
        uq40.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m26640o0(User user) {
        this.f25322b = user;
        if (this.f25323c == null) {
            this.f25323c = user.settings.clone();
        }
        ((it40) ((jq2) this).viewModel).m17020r0(this.f25323c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m26641p0(c cVar) {
        ((it40) ((jq2) this).viewModel).m17021s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m26642A0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.conversation = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m26643C0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.extremePick = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m26644D0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.greeting = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m26645E0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.group = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: F0 */
    public void m26646F0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.momentLiked = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m26647G0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.match = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: H0 */
    public void m26648H0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.status = !z;
        m26655s0();
    }

    /* JADX INFO: renamed from: Z */
    public void m26649Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m26650a0() {
        super.a0();
        duringCreated(CoreModule.f1534c.f3652m0.m3048j9().switchMap(new w9j() { // from class: l.or40
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.m21486o9();
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.pr40
            public final void call(Object obj) {
                this.f19268a.m26640o0((User) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.qr40
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.rr40
            public final void call(Object obj) {
                this.f20684a.m26641p0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m26651m0(boolean z) {
        this.f25323c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m26655s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m26652n0() {
        if (NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        final cwf0 cwf0VarC = i0e.c("p_set_push_scope_pop", "NotificationOptPresenter.class");
        new xh0.a(this.f25321a).j("打开系统推送允许接收探探通知，才能设置接收范围").r("打开通知").o(new View.OnClickListener() { // from class: l.ur40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wr40.m26632e0(view);
            }
        }).f("我知道了").h(false).m(new DialogInterface.OnDismissListener() { // from class: l.vr40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).a().g();
        i0e.f(cwf0VarC);
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m26653q0(roj0 roj0Var) {
        act().progressDismiss();
        ((it40) ((jq2) this).viewModel).m17020r0(this.f25323c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m26654r0(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: s0 */
    public void m26655s0() {
        if (NullChecker.a(this.f25322b) && NullChecker.a(this.f25323c) && CoreModule.m1850H().signedIn_() && !this.f25323c.equals(this.f25322b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f25323c.previewPushMessage();
            settingGroups.noPush = this.f25323c.getSettingGroup().noPush;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f25322b.settings.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f1831J5), true);
                CoreModule.f1534c.f3652m0.m3051k8(settingGroupsSubtract).subscribe(mkd0.H(new e30() { // from class: l.sr40
                    public final void call(Object obj) {
                        this.f21601a.m26653q0((roj0) obj);
                    }
                }, new e30() { // from class: l.tr40
                    public final void call(Object obj) {
                        this.f22240a.m26654r0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m26656t0(List<MomentNotifyBlockType> list) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.momentComment = list;
        m26655s0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m26657u0(List<MomentNotifyBlockType> list) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.momentLike = list;
        m26655s0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m26658x0(List<MomentNotifyBlockType> list) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.momentUpdate = list;
        m26655s0();
    }

    /* JADX INFO: renamed from: y0 */
    public void m26659y0(List<String> list) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.teamAccount = list;
        m26655s0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m26660z0(boolean z) {
        if (this.f25323c.getSettingGroup().noPush == null) {
            this.f25323c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f25323c.getSettingGroup().noPush.chatPartners = !z;
        m26655s0();
    }

    public void destroy() {
    }
}
