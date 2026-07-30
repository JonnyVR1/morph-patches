package p002l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserPrivacySettings;
import com.p1.mobile.putong.live.base.data.BLiveConfig;
import com.p1.mobile.putong.live.base.data.BLiveFollowSetting;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import l.e30;
import l.ffw;
import l.roj0;
import l.xdl0;
import l.ypv;
import l.z7c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class odu {

    /* JADX INFO: renamed from: b */
    public final int f16546b = ypv.k().H4();

    /* JADX INFO: renamed from: a */
    public final z7c f16545a = new z7c("live_unban_follow_dialog", 0, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19428a(Runnable runnable, roj0 roj0Var) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m19430c(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m19431d(Runnable runnable, Throwable th) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m19433f(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m19434g() {
        BLiveConfig bLiveConfig;
        BLiveFollowSetting bLiveFollowSetting;
        BLiveSettings bLiveSettingsA3 = ypv.k().A3();
        if (bLiveSettingsA3 == null || (bLiveConfig = bLiveSettingsA3.liveConfig) == null || (bLiveFollowSetting = bLiveConfig.followSetting) == null) {
            return null;
        }
        return bLiveFollowSetting.text;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19435h() {
        Settings settings;
        User userV = ypv.a.V();
        if (userV == null || (settings = userV.settings) == null || settings.hidePublicMoment() == null) {
            return false;
        }
        return userV.settings.hidePublicMoment().booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m19436i(final Runnable runnable, final Dialog dialog, final Runnable runnable2, View view) {
        m19440m(new Runnable() { // from class: l.kdu
            @Override // java.lang.Runnable
            public final void run() {
                odu.m19430c(runnable, dialog);
            }
        }, new Runnable() { // from class: l.ldu
            @Override // java.lang.Runnable
            public final void run() {
                odu.m19433f(runnable2, dialog);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m19437j() {
        return m19435h() && this.f16545a.a(this.f16546b);
    }

    /* JADX INFO: renamed from: k */
    public final void m19438k() {
        this.f16545a.b();
    }

    /* JADX INFO: renamed from: l */
    public Dialog m19439l(Act act, @Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        final Dialog dialogZ0 = act.dialog().M(t6c0.f19797c3).u().B(false).z0();
        m19438k();
        View viewP = dialogZ0.P();
        xdl0.E0(viewP.findViewById(g5c0.f10845G2), new View.OnClickListener() { // from class: l.idu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogZ0.dismiss();
            }
        });
        xdl0.E0(viewP.findViewById(g5c0.f10805B7), new View.OnClickListener() { // from class: l.jdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13701a.m19436i(runnable, dialogZ0, runnable2, view);
            }
        });
        VText vTextFindViewById = viewP.findViewById(g5c0.f10849G6);
        if (!TextUtils.isEmpty(m19434g())) {
            vTextFindViewById.setText(m19434g());
        }
        return dialogZ0;
    }

    /* JADX INFO: renamed from: m */
    public final void m19440m(@Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        User userV = ypv.a.V();
        if (userV == null || !ypv.a.v0()) {
            return;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hidePublicMoments = Boolean.FALSE;
        SettingGroups settingGroupsSubtract = settingGroups.subtract(userV.settings.getSettingGroup());
        if (settingGroupsSubtract != null) {
            ypv.a.b0(settingGroupsSubtract).subscribe(ffw.e(new e30() { // from class: l.mdu
                public final void call(Object obj) {
                    odu.m19428a(runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.ndu
                public final void call(Object obj) {
                    odu.m19431d(runnable2, (Throwable) obj);
                }
            }));
        }
    }
}
