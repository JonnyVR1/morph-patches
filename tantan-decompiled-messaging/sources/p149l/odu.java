package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserPrivacySettings;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class odu {

    /* JADX INFO: renamed from: b */
    public final int f143243b = ypv.m215672k().m195640H4();

    /* JADX INFO: renamed from: a */
    public final z7c f143242a = new z7c("live_unban_follow_dialog", 0, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m163714a(Runnable runnable, roj0 roj0Var) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m163716c(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m163717d(Runnable runnable, Throwable th) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m163719f(Runnable runnable, Dialog dialog) {
        if (runnable != null) {
            runnable.run();
        }
        dialog.dismiss();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m163720g() {
        BLiveConfig bLiveConfig;
        BLiveFollowSetting bLiveFollowSetting;
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLiveFollowSetting = bLiveConfig.followSetting) == null) {
            return null;
        }
        return bLiveFollowSetting.text;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m163721h() {
        Settings settings;
        User userM199329V = ypv.f199493a.m199329V();
        if (userM199329V == null || (settings = userM199329V.settings) == null || settings.hidePublicMoment() == null) {
            return false;
        }
        return userM199329V.settings.hidePublicMoment().booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m163722i(final Runnable runnable, final Dialog dialog, final Runnable runnable2, View view) {
        m163726m(new Runnable() { // from class: l.kdu
            @Override // java.lang.Runnable
            public final void run() {
                odu.m163716c(runnable, dialog);
            }
        }, new Runnable() { // from class: l.ldu
            @Override // java.lang.Runnable
            public final void run() {
                odu.m163719f(runnable2, dialog);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public boolean m163723j() {
        return m163721h() && this.f143242a.m217451a(this.f143243b);
    }

    /* JADX INFO: renamed from: k */
    public final void m163724k() {
        this.f143242a.m217452b();
    }

    /* JADX INFO: renamed from: l */
    public Dialog m163725l(Act act, @Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        final Dialog dialogM20568z0 = act.dialog().m20517M(t6c0.f168301c3).m20557u().m20496B(false).m20568z0();
        m163724k();
        View viewM20458P = dialogM20568z0.m20458P();
        xdl0.m208329E0(viewM20458P.findViewById(g5c0.f100695G2), new View.OnClickListener() { // from class: l.idu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM20568z0.dismiss();
            }
        });
        xdl0.m208329E0(viewM20458P.findViewById(g5c0.f100655B7), new View.OnClickListener() { // from class: l.jdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117437a.m163722i(runnable, dialogM20568z0, runnable2, view);
            }
        });
        VText vText = (VText) viewM20458P.findViewById(g5c0.f100699G6);
        if (!TextUtils.isEmpty(m163720g())) {
            vText.setText(m163720g());
        }
        return dialogM20568z0;
    }

    /* JADX INFO: renamed from: m */
    public final void m163726m(@Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        User userM199329V = ypv.f199493a.m199329V();
        if (userM199329V == null || !ypv.f199493a.m199377v0()) {
            return;
        }
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.hidePublicMoments = Boolean.FALSE;
        SettingGroups settingGroupsSubtract = settingGroups.subtract(userM199329V.settings.getSettingGroup());
        if (settingGroupsSubtract != null) {
            ypv.f199493a.m199337b0(settingGroupsSubtract).subscribe(ffw.m121194e(new e30() { // from class: l.mdu
                @Override // p149l.e30
                public final void call(Object obj) {
                    odu.m163714a(runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.ndu
                @Override // p149l.e30
                public final void call(Object obj) {
                    odu.m163717d(runnable2, (Throwable) obj);
                }
            }));
        }
    }
}
