package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.notification.NotificationOptAct;
import com.p046p1.mobile.putong.data.MomentNotifyBlockType;
import com.p046p1.mobile.putong.data.NotificationSetting;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPushSettings;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class wr40 extends jq2<it40> {

    /* JADX INFO: renamed from: a */
    public NotificationOptAct f187761a;

    /* JADX INFO: renamed from: b */
    public User f187762b;

    /* JADX INFO: renamed from: c */
    public Settings f187763c;

    public wr40(mcr mcrVar) {
        super(mcrVar);
        this.f187761a = (NotificationOptAct) mcrVar;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m205092e0(View view) {
        zvf0.m220396r("e_receive_push_switch", "p_set_push_scope_pop");
        uq40.m194951A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m205100o0(User user) {
        this.f187762b = user;
        if (this.f187763c == null) {
            this.f187763c = user.settings.mo223809clone();
        }
        ((it40) this.viewModel).m138164r0(this.f187763c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m205101p0(C4319c c4319c) {
        ((it40) this.viewModel).m138165s0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m205102A0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.conversation = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: C0 */
    public void m205103C0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.extremePick = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: D0 */
    public void m205104D0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.greeting = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m205105E0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.group = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: F0 */
    public void m205106F0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.momentLiked = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m205107G0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.match = !z;
        m205113s0();
    }

    /* JADX INFO: renamed from: H0 */
    public void m205108H0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.status = !z;
        m205113s0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19663m0.m31118j9().switchMap(new w9j() { // from class: l.or40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169523o9();
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.pr40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150855a.m205100o0((User) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.qr40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.rr40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160724a.m205101p0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m205109m0(boolean z) {
        this.f187763c.getSettingGroup().push.previewMessage = Boolean.valueOf(z);
        m205113s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m205110n0() {
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_set_push_scope_pop", "NotificationOptPresenter.class");
        new xh0.C21150a(this.f187761a).m208731j("打开系统推送允许接收探探通知，才能设置接收范围").m208739r("打开通知").m208736o(new View.OnClickListener() { // from class: l.ur40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wr40.m205092e0(view);
            }
        }).m208727f("我知道了").m208729h(false).m208734m(new DialogInterface.OnDismissListener() { // from class: l.vr40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m205111q0(roj0 roj0Var) {
        act().progressDismiss();
        ((it40) this.viewModel).m138164r0(this.f187763c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m205112r0(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: s0 */
    public void m205113s0() {
        if (NullChecker.m81303a(this.f187762b) && NullChecker.m81303a(this.f187763c) && CoreModule.m29931H().signedIn_() && !this.f187763c.equals(this.f187762b.settings)) {
            SettingGroups settingGroups = new SettingGroups();
            UserPushSettings userPushSettings = new UserPushSettings();
            settingGroups.push = userPushSettings;
            userPushSettings.previewMessage = this.f187763c.previewPushMessage();
            settingGroups.noPush = this.f187763c.getSettingGroup().noPush;
            SettingGroups settingGroupsSubtract = settingGroups.subtract(this.f187762b.settings.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                act().progress(act().getString(R$string.f17842J5), true);
                CoreModule.f17545c.f19663m0.m31121k8(settingGroupsSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.sr40
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f166045a.m205111q0((roj0) obj);
                    }
                }, new e30() { // from class: l.tr40
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f171787a.m205112r0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m205114t0(List<MomentNotifyBlockType> list) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.momentComment = list;
        m205113s0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m205115u0(List<MomentNotifyBlockType> list) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.momentLike = list;
        m205113s0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m205116x0(List<MomentNotifyBlockType> list) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.momentUpdate = list;
        m205113s0();
    }

    /* JADX INFO: renamed from: y0 */
    public void m205117y0(List<String> list) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.teamAccount = list;
        m205113s0();
    }

    /* JADX INFO: renamed from: z0 */
    public void m205118z0(boolean z) {
        if (this.f187763c.getSettingGroup().noPush == null) {
            this.f187763c.getSettingGroup().noPush = NotificationSetting.new_();
        }
        this.f187763c.getSettingGroup().noPush.chatPartners = !z;
        m205113s0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
