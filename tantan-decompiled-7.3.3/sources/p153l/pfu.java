package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class pfu {

    /* JADX INFO: renamed from: b */
    public final int f152209b = zrv.m221193k().m203427H4();

    /* JADX INFO: renamed from: a */
    public final f9c f152208a = new f9c("live_unban_follow_dialog", 0, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m172143a(Runnable runnable, uxj0 uxj0Var) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m172145c(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m172146d(Runnable runnable, Throwable th) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m172148f(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m172149g() {
        BLiveConfig bLiveConfig;
        BLiveFollowSetting bLiveFollowSetting;
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLiveFollowSetting = bLiveConfig.followSetting) == null) {
            return null;
        }
        return bLiveFollowSetting.text;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m172150h() {
        Settings settings;
        User userM207651V = zrv.f205799a.m207651V();
        if (userM207651V == null || (settings = userM207651V.settings) == null || settings.hidePublicMoment() == null) {
            return false;
        }
        return userM207651V.settings.hidePublicMoment().booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m172151i(final Runnable runnable, final Dialog dialog, final Runnable runnable2, View view) {
        m172155m(new Runnable() { // from class: l.lfu
            @Override // java.lang.Runnable
            public final void run() {
                pfu.m172145c(runnable, dialog);
            }
        }, new Runnable() { // from class: l.mfu
            @Override // java.lang.Runnable
            public final void run() {
                pfu.m172148f(runnable2, dialog);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m172152j() {
        return m172150h() && this.f152208a.m124632a(this.f152209b);
    }

    /* JADX INFO: renamed from: k */
    public final void m172153k() {
        this.f152208a.m124633b();
    }

    /* JADX INFO: renamed from: l */
    public Dialog m172154l(Act act, @Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        final Dialog dialogM21567z0 = act.dialog().m21516M(yec0.f199033c3).m21556u().m21495B(false).m21567z0();
        m172153k();
        View viewM21457P = dialogM21567z0.m21457P();
        bnl0.m105509E0(viewM21457P.findViewById(mdc0.f135940G2), new View.OnClickListener() { // from class: l.jfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM21567z0.dismiss();
            }
        });
        bnl0.m105509E0(viewM21457P.findViewById(mdc0.f135900B7), new View.OnClickListener() { // from class: l.kfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126506a.m172151i(runnable, dialogM21567z0, runnable2, view);
            }
        });
        VText vText = (VText) viewM21457P.findViewById(mdc0.f135944G6);
        if (!TextUtils.isEmpty(m172149g())) {
            vText.setText(m172149g());
        }
        return dialogM21567z0;
    }

    /* JADX INFO: renamed from: m */
    public final void m172155m(@Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        User userM207651V = zrv.f205799a.m207651V();
        if (userM207651V == null || !zrv.f205799a.m207699v0()) {
            return;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hidePublicMoments = Boolean.FALSE;
        SettingGroups settingGroupsSubtract = settingGroups.subtract(userM207651V.settings.getSettingGroup());
        if (settingGroupsSubtract != null) {
            zrv.f205799a.m207659b0(settingGroupsSubtract).subscribe(dhw.m115826e(new y20() { // from class: l.nfu
                @Override // p153l.y20
                public final void call(Object obj) {
                    pfu.m172143a(runnable, (uxj0) obj);
                }
            }, new y20() { // from class: l.ofu
                @Override // p153l.y20
                public final void call(Object obj) {
                    pfu.m172146d(runnable2, (Throwable) obj);
                }
            }));
        }
    }
}
