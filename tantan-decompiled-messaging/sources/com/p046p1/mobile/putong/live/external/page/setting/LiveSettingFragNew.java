package com.p046p1.mobile.putong.live.external.page.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p046p1.mobile.putong.live.external.page.setting.LiveSettingFragNew;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.ArrayList;
import p147v.navigationbar.VNavigationBar;
import p149l.ant;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.fze;
import p149l.gld0;
import p149l.j760;
import p149l.jj3;
import p149l.l9s;
import p149l.lor;
import p149l.pgi0;
import p149l.rqi;
import p149l.s9s;
import p149l.sqa0;
import p149l.uep0;
import p149l.uvr;
import p149l.vdt;
import p149l.vo80;
import p149l.vwb;
import p149l.w9j;
import p149l.xmt;
import p149l.ymt;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSettingFragNew extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public RecyclerView f46167A;

    /* JADX INFO: renamed from: B */
    public final LiveBaseAdapter f46168B = new LiveBaseAdapter();

    /* JADX INFO: renamed from: C */
    public final ant f46169C = new ant(s9s.f163227a.getString(R$string.f44177j0), false);

    /* JADX INFO: renamed from: D */
    public final ant f46170D = new ant(s9s.f163227a.getString(R$string.f44207t0), false);

    /* JADX INFO: renamed from: E */
    public final ant f46171E = new ant(s9s.f163227a.getString(R$string.f44106E1), true);

    /* JADX INFO: renamed from: F */
    public final ymt f46172F = new ymt(s9s.f163227a.getString(R$string.f44222y0));

    /* JADX INFO: renamed from: G */
    public final ymt f46173G = new ymt(s9s.f163227a.getString(R$string.f44174i0));

    /* JADX INFO: renamed from: H */
    public final ant f46174H = new ant(s9s.f163227a.getString(R$string.f44133S), false);

    /* JADX INFO: renamed from: I */
    public final ant f46175I = new ant("切换后台时自动唤起小窗", false);

    /* JADX INFO: renamed from: J */
    @Nullable
    public LiveSettingArgs f46176J = null;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f46177z;

    public LiveSettingFragNew() {
        creates(new e30() { // from class: l.nmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139660a.m70728k5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public static LiveSettingFragNew m70705D5(Bundle bundle) {
        LiveSettingFragNew liveSettingFragNew = new LiveSettingFragNew();
        liveSettingFragNew.setArguments(bundle);
        return liveSettingFragNew;
    }

    /* JADX INFO: renamed from: F5 */
    public static void m70706F5(boolean z) {
        zvf0.m220399u("e_live_change_profile_entrance", "p_live_setting", vwb.m200311Y("type", z ? BLiveOperationTitleShowType.off : "on"));
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m70708N4(Throwable th) {
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m70709O4(Throwable th) {
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m70726f5(Throwable th) {
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m70727g5(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public void m70728k5(Bundle bundle) {
        m70743n5();
        uep0.m193324k(act().toolbar());
        duringCreated(l9s.m149104x()).subscribe(ffw.m121194e(new e30() { // from class: l.pmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150291a.m70746q5((SettingGroups) obj);
            }
        }, new e30() { // from class: l.qmt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSettingFragNew.m70726f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m70729z5(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m70730A5(boolean z, SettingGroups settingGroups) {
        sqa0.m185475b().m185477c(z);
        this.f46168B.m67361P(this.f46169C, new fze(z));
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m70731B5(boolean z, SettingGroups settingGroups) {
        this.f46168B.m67361P(this.f46170D, new fze(z));
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m70732C5(boolean z, SettingGroups settingGroups) {
        this.f46168B.m67361P(this.f46171E, new fze(z));
    }

    /* JADX INFO: renamed from: E5 */
    public final void m70733E5() {
        ArrayList arrayList = new ArrayList();
        if (vdt.m198092b(2) || IntlCountryCodeController.m28123s() || IntlCountryCodeController.m28117m() || lor.m150811p()) {
            this.f46169C.m97814I(l9s.m149103w().live.hideStoppedRoom.booleanValue());
            arrayList.add(this.f46169C);
        }
        if (s9s.f163228b.m195714Q6()) {
            Boolean bool = l9s.m149103w().live.closeSmallWindow;
            this.f46170D.m97814I((bool == null || bool.booleanValue()) ? false : true);
            arrayList.add(this.f46170D);
        }
        this.f46171E.m97814I(l9s.m149103w().live.voiceWindowEnable.booleanValue());
        arrayList.add(this.f46171E);
        if (s9s.f163228b.m195714Q6() && uvr.m196087d().m162670G1()) {
            this.f46175I.m97814I(ypv.f199493a.m199323P(act()));
            arrayList.add(this.f46175I);
        }
        if (vdt.m198092b(2) || IntlCountryCodeController.m28123s()) {
            if (lor.m150799d()) {
                this.f46174H.m97814I(l9s.m149103w().live.hideVoiceOnCall.booleanValue());
                arrayList.add(this.f46174H);
            }
            if (pgi0.m168730l().m168739k()) {
                arrayList.add(this.f46172F);
            }
        }
        if (vo80.m199162e()) {
            arrayList.add(this.f46173G);
        }
        this.f46168B.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m70734G5(final boolean z) {
        UserLiveSettings userLiveSettingsM70741l5 = m70741l5();
        userLiveSettingsM70741l5.hideStoppedRoom = Boolean.valueOf(z);
        duringCreated(l9s.m149051N(userLiveSettingsM70741l5)).subscribe(ffw.m121194e(new e30() { // from class: l.hmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108472a.m70730A5(z, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.imt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSettingFragNew.m70709O4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H5 */
    public final void m70735H5(boolean z) {
        ((jj3) s9s.m182763m(gld0.f103314d)).m141740e(z);
    }

    /* JADX INFO: renamed from: I5 */
    public final void m70736I5(final boolean z) {
        UserLiveSettings userLiveSettingsM70741l5 = m70741l5();
        userLiveSettingsM70741l5.closeSmallWindow = Boolean.valueOf(!z);
        duringCreated(l9s.m149051N(userLiveSettingsM70741l5)).subscribe(ffw.m121194e(new e30() { // from class: l.lmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128820a.m70731B5(z, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.mmt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSettingFragNew.m70727g5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J5 */
    public final void m70737J5(final boolean z) {
        UserLiveSettings userLiveSettingsM70741l5 = m70741l5();
        userLiveSettingsM70741l5.voiceWindowEnable = Boolean.valueOf(z);
        duringCreated(l9s.m149051N(userLiveSettingsM70741l5)).subscribe(ffw.m121194e(new e30() { // from class: l.jmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118710a.m70732C5(z, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.kmt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSettingFragNew.m70708N4((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        if (getArguments() != null) {
            this.f46176J = (LiveSettingArgs) getArguments().getParcelable("live_setting_frag_arg");
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46177z.setTitle(act().getString(R$string.f44137U));
        this.f46177z.setLeftIconOnClick(new View.OnClickListener() { // from class: l.cmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81608a.m70729z5(view);
            }
        });
        this.f46167A.setAdapter(this.f46168B);
        m70733E5();
    }

    /* JADX INFO: renamed from: h5 */
    public View m70738h5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xmt.m210149b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m70739i5() {
        m70735H5(true);
        this.f46168B.m67361P(this.f46175I, new fze(true));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70738h5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m70740j5() {
        if (rqi.m180453d().m180455b(s9s.f163227a)) {
            m70739i5();
        } else if (rqi.m180453d().m180454a(s9s.f163227a)) {
            Act.front().takeFirst(new w9j() { // from class: l.emt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Boolean) obj).booleanValue() && ypv.f199493a.m199377v0());
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.fmt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98372a.m70745p5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l5 */
    public final UserLiveSettings m70741l5() {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.closeSmallWindow = Boolean.valueOf(!this.f46170D.m97813H());
        userLiveSettings.voiceWindowEnable = Boolean.valueOf(this.f46171E.m97813H());
        userLiveSettings.hideStoppedRoom = Boolean.valueOf(this.f46171E.m97813H());
        userLiveSettings.hideVoiceOnCall = Boolean.valueOf(this.f46174H.m97813H());
        return userLiveSettings;
    }

    /* JADX INFO: renamed from: m5 */
    public final void m70742m5(final boolean z) {
        zvf0.m220399u("e_live_setting_hide_voice_status", pageId(), j760.m140076a("live_setting_switch", z ? "on" : BLiveOperationTitleShowType.off));
        UserLiveSettings userLiveSettingsM70741l5 = m70741l5();
        userLiveSettingsM70741l5.hideVoiceOnCall = Boolean.valueOf(z);
        duringCreated(l9s.m149051N(userLiveSettingsM70741l5)).subscribe(ffw.m121197h(new e30() { // from class: l.gmt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103519a.m70747r5(z, (SettingGroups) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n5 */
    public final void m70743n5() {
        this.f46172F.mo109662A(new View.OnClickListener() { // from class: l.rmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160117a.m70748s5(view);
            }
        });
        this.f46169C.mo109662A(new View.OnClickListener() { // from class: l.smt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165379a.m70749t5(view);
            }
        });
        this.f46170D.mo109662A(new View.OnClickListener() { // from class: l.tmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171174a.m70750u5(view);
            }
        });
        this.f46171E.mo109662A(new View.OnClickListener() { // from class: l.umt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177302a.m70751v5(view);
            }
        });
        this.f46173G.mo109662A(new View.OnClickListener() { // from class: l.vmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182149a.m70752w5(view);
            }
        });
        this.f46174H.mo109662A(new View.OnClickListener() { // from class: l.wmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187161a.m70753x5(view);
            }
        });
        this.f46175I.mo109662A(new View.OnClickListener() { // from class: l.dmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86989a.m70754y5(view);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m70744o5() {
        if (rqi.m180453d().m180455b(ypv.f199497e)) {
            m70740j5();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f46175I == null || this.f46168B == null) {
            return;
        }
        boolean zM180455b = rqi.m180453d().m180455b(act());
        this.f46168B.m67361P(this.f46175I, new fze(zM180455b));
        if (zM180455b) {
            return;
        }
        m70735H5(false);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m70745p5(Boolean bool) {
        if (rqi.m180453d().m180455b(ypv.f199497e)) {
            m70739i5();
        } else {
            e51.m114743H(ypv.f199497e, new Runnable() { // from class: l.omt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144687a.m70744o5();
                }
            }, 2000L);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_setting";
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m70746q5(SettingGroups settingGroups) {
        m70733E5();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m70747r5(boolean z, SettingGroups settingGroups) {
        this.f46168B.m67361P(this.f46174H, new fze(z));
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m70748s5(View view) {
        pgi0.m168730l().m168733C(act());
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m70749t5(View view) {
        boolean zM97813H = this.f46169C.m97813H();
        m70706F5(zM97813H);
        m70734G5(!zM97813H);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m70750u5(View view) {
        m70736I5(!this.f46170D.m97813H());
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m70751v5(View view) {
        m70737J5(!this.f46171E.m97813H());
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m70752w5(View view) {
        act().startActivity(LiveIndependentSettingAct.m70699Y1(act(), "privacy_setting", null));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m70753x5(View view) {
        m70742m5(!this.f46174H.m97813H());
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m70754y5(View view) {
        if (!this.f46175I.m97813H()) {
            m70740j5();
        } else {
            this.f46168B.m67361P(this.f46175I, new fze(false));
            m70735H5(false);
        }
    }
}
