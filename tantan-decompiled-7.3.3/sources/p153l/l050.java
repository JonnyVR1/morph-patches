package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.notification.NotificationOptAct;
import com.p051p1.mobile.putong.data.MomentNotifyBlockType;
import com.p051p1.mobile.putong.data.NotificationSetting;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPushSettings;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class l050 extends ar2<x150> {

    /* JADX INFO: renamed from: a */
    public NotificationOptAct f129519a;

    /* JADX INFO: renamed from: b */
    public User f129520b;

    /* JADX INFO: renamed from: c */
    public Settings f129521c;

    public l050(ner nerVar) {
        super(nerVar);
        this.f129519a = (NotificationOptAct) nerVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m152280e0(View view) {
        i4g0.m138520r("e_receive_push_switch", "p_set_push_scope_pop");
        iz40.m142756A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m152288o0(User user) {
        this.f129520b = user;
        if (this.f129521c == null) {
            this.f129521c = user.settings.mo225055clone();
        }
        ((x150) this.viewModel).m208969r0(this.f129521c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m152289p0(C4470c c4470c) {
        ((x150) this.viewModel).m208970s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m152290A0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.conversation = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m152291C0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.extremePick = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m152292D0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.greeting = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m152293E0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.group = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: F0 */
    public void m152294F0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.momentLiked = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m152295G0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.match = !z;
        m152301s0();
    }

    /* JADX INFO: renamed from: H0 */
    public void m152296H0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.status = !z;
        m152301s0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20405m0.m32121j9().switchMap(new qcj() { // from class: l.d050
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116596o9();
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.e050
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91413a.m152288o0((User) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.f050
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.g050
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101609a.m152289p0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m152297m0(boolean z) {
        this.f129521c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m152301s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m152298n0() {
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_set_push_scope_pop", "NotificationOptPresenter.class");
        new th0.C20312a(this.f129519a).m191151j("打开系统推送允许接收探探通知，才能设置接收范围").m191159r("打开通知").m191156o(new View.OnClickListener() { // from class: l.j050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l050.m152280e0(view);
            }
        }).m191147f("我知道了").m191149h(false).m191154m(new DialogInterface.OnDismissListener() { // from class: l.k050
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m152299q0(uxj0 uxj0Var) {
        act().progressDismiss();
        ((x150) this.viewModel).m208969r0(this.f129521c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m152300r0(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: s0 */
    public void m152301s0() {
        if (NullChecker.m82486a(this.f129520b) && NullChecker.m82486a(this.f129521c) && CoreModule.m30929H().signedIn_() && !this.f129521c.equals(this.f129520b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f129521c.previewPushMessage();
            settingGroups.noPush = this.f129521c.getSettingGroup().noPush;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f129520b.settings.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f18632L5), true);
                CoreModule.f18264c.f20405m0.m32124k8(settingGroupsSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.h050
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f107271a.m152299q0((uxj0) obj);
                    }
                }, new y20() { // from class: l.i050
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f112330a.m152300r0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m152302t0(List<MomentNotifyBlockType> list) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.momentComment = list;
        m152301s0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m152303u0(List<MomentNotifyBlockType> list) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.momentLike = list;
        m152301s0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m152304x0(List<MomentNotifyBlockType> list) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.momentUpdate = list;
        m152301s0();
    }

    /* JADX INFO: renamed from: y0 */
    public void m152305y0(List<String> list) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.teamAccount = list;
        m152301s0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m152306z0(boolean z) {
        if (this.f129521c.getSettingGroup().noPush == null) {
            this.f129521c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f129521c.getSettingGroup().noPush.chatPartners = !z;
        m152301s0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
