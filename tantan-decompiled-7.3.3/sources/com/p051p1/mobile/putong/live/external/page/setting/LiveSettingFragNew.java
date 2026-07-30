package com.p051p1.mobile.putong.live.external.page.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p051p1.mobile.putong.live.external.page.setting.LiveSettingFragNew;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.ArrayList;
import p151v.navigationbar.VNavigationBar;
import p153l.apt;
import p153l.bk3;
import p153l.cpt;
import p153l.dhw;
import p153l.i4g0;
import p153l.itd0;
import p153l.j0f;
import p153l.jyb;
import p153l.l51;
import p153l.mbs;
import p153l.mqr;
import p153l.nti;
import p153l.pf60;
import p153l.ppi0;
import p153l.qcj;
import p153l.tbs;
import p153l.vxr;
import p153l.wft;
import p153l.wya0;
import p153l.y20;
import p153l.ynp0;
import p153l.zot;
import p153l.zrv;
import p153l.zw80;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSettingFragNew extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public RecyclerView f47015A;

    /* JADX INFO: renamed from: B */
    public final LiveBaseAdapter f47016B = new LiveBaseAdapter();

    /* JADX INFO: renamed from: C */
    public final cpt f47017C = new cpt(tbs.f172988a.getString(R$string.f45025j0), false);

    /* JADX INFO: renamed from: D */
    public final cpt f47018D = new cpt(tbs.f172988a.getString(R$string.f45055t0), false);

    /* JADX INFO: renamed from: E */
    public final cpt f47019E = new cpt(tbs.f172988a.getString(R$string.f44954E1), true);

    /* JADX INFO: renamed from: F */
    public final apt f47020F = new apt(tbs.f172988a.getString(R$string.f45070y0));

    /* JADX INFO: renamed from: G */
    public final apt f47021G = new apt(tbs.f172988a.getString(R$string.f45022i0));

    /* JADX INFO: renamed from: H */
    public final cpt f47022H = new cpt(tbs.f172988a.getString(R$string.f44981S), false);

    /* JADX INFO: renamed from: I */
    public final cpt f47023I = new cpt("切换后台时自动唤起小窗", false);

    /* JADX INFO: renamed from: J */
    @Nullable
    public LiveSettingArgs f47024J = null;

    /* JADX INFO: renamed from: z */
    public VNavigationBar f47025z;

    public LiveSettingFragNew() {
        creates(new y20() { // from class: l.pot
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153427a.m71911k5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public static LiveSettingFragNew m71888D5(Bundle bundle) {
        LiveSettingFragNew liveSettingFragNew = new LiveSettingFragNew();
        liveSettingFragNew.setArguments(bundle);
        return liveSettingFragNew;
    }

    /* JADX INFO: renamed from: F5 */
    public static void m71889F5(boolean z) {
        i4g0.m138523u("e_live_change_profile_entrance", "p_live_setting", jyb.m147494Y("type", z ? BLiveOperationTitleShowType.off : "on"));
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m71891N4(Throwable th) {
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m71892O4(Throwable th) {
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m71909f5(Throwable th) {
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m71910g5(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public void m71911k5(Bundle bundle) {
        m71926n5();
        ynp0.m216934k(act().toolbar());
        duringCreated(mbs.m157881x()).subscribe(dhw.m115826e(new y20() { // from class: l.rot
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164239a.m71929q5((SettingGroups) obj);
            }
        }, new y20() { // from class: l.sot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSettingFragNew.m71909f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m71912z5(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m71913A5(boolean z, SettingGroups settingGroups) {
        wya0.m208478b().m208480c(z);
        this.f47016B.m68544P(this.f47017C, new j0f(z));
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m71914B5(boolean z, SettingGroups settingGroups) {
        this.f47016B.m68544P(this.f47018D, new j0f(z));
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m71915C5(boolean z, SettingGroups settingGroups) {
        this.f47016B.m68544P(this.f47019E, new j0f(z));
    }

    /* JADX INFO: renamed from: E5 */
    public final void m71916E5() {
        ArrayList arrayList = new ArrayList();
        if (wft.m206159b(2) || IntlCountryCodeController.m29122s() || IntlCountryCodeController.m29116m() || mqr.m159596p()) {
            this.f47017C.m111829I(mbs.m157880w().live.hideStoppedRoom.booleanValue());
            arrayList.add(this.f47017C);
        }
        if (tbs.f172989b.m203501Q6()) {
            Boolean bool = mbs.m157880w().live.closeSmallWindow;
            this.f47018D.m111829I((bool == null || bool.booleanValue()) ? false : true);
            arrayList.add(this.f47018D);
        }
        this.f47019E.m111829I(mbs.m157880w().live.voiceWindowEnable.booleanValue());
        arrayList.add(this.f47019E);
        if (tbs.f172989b.m203501Q6() && vxr.m203876d().m170977G1()) {
            this.f47023I.m111829I(zrv.f205799a.m207645P(act()));
            arrayList.add(this.f47023I);
        }
        if (wft.m206159b(2) || IntlCountryCodeController.m29122s()) {
            if (mqr.m159584d()) {
                this.f47022H.m111829I(mbs.m157880w().live.hideVoiceOnCall.booleanValue());
                arrayList.add(this.f47022H);
            }
            if (ppi0.m173207l().m173216k()) {
                arrayList.add(this.f47020F);
            }
        }
        if (zw80.m221860e()) {
            arrayList.add(this.f47021G);
        }
        this.f47016B.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m71917G5(final boolean z) {
        UserLiveSettings userLiveSettingsM71924l5 = m71924l5();
        userLiveSettingsM71924l5.hideStoppedRoom = Boolean.valueOf(z);
        duringCreated(mbs.m157828N(userLiveSettingsM71924l5)).subscribe(dhw.m115826e(new y20() { // from class: l.jot
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122055a.m71913A5(z, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.kot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSettingFragNew.m71892O4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H5 */
    public final void m71918H5(boolean z) {
        ((bk3) tbs.m190077m(itd0.f116822d)).m104791e(z);
    }

    /* JADX INFO: renamed from: I5 */
    public final void m71919I5(final boolean z) {
        UserLiveSettings userLiveSettingsM71924l5 = m71924l5();
        userLiveSettingsM71924l5.closeSmallWindow = Boolean.valueOf(!z);
        duringCreated(mbs.m157828N(userLiveSettingsM71924l5)).subscribe(dhw.m115826e(new y20() { // from class: l.not
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143028a.m71914B5(z, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.oot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSettingFragNew.m71910g5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J5 */
    public final void m71920J5(final boolean z) {
        UserLiveSettings userLiveSettingsM71924l5 = m71924l5();
        userLiveSettingsM71924l5.voiceWindowEnable = Boolean.valueOf(z);
        duringCreated(mbs.m157828N(userLiveSettingsM71924l5)).subscribe(dhw.m115826e(new y20() { // from class: l.lot
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132947a.m71915C5(z, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.mot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSettingFragNew.m71891N4((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        if (getArguments() != null) {
            this.f47024J = (LiveSettingArgs) getArguments().getParcelable("live_setting_frag_arg");
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f47025z.setTitle(act().getString(R$string.f44985U));
        this.f47025z.setLeftIconOnClick(new View.OnClickListener() { // from class: l.eot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94948a.m71912z5(view);
            }
        });
        this.f47015A.setAdapter(this.f47016B);
        m71916E5();
    }

    /* JADX INFO: renamed from: h5 */
    public View m71921h5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zot.m220797b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m71922i5() {
        m71918H5(true);
        this.f47016B.m68544P(this.f47023I, new j0f(true));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71921h5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m71923j5() {
        if (nti.m164730d().m164732b(tbs.f172988a)) {
            m71922i5();
        } else if (nti.m164730d().m164731a(tbs.f172988a)) {
            Act.front().takeFirst(new qcj() { // from class: l.got
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Boolean) obj).booleanValue() && zrv.f205799a.m207699v0());
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.hot
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110949a.m71928p5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l5 */
    public final UserLiveSettings m71924l5() {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.closeSmallWindow = Boolean.valueOf(!this.f47018D.m111828H());
        userLiveSettings.voiceWindowEnable = Boolean.valueOf(this.f47019E.m111828H());
        userLiveSettings.hideStoppedRoom = Boolean.valueOf(this.f47019E.m111828H());
        userLiveSettings.hideVoiceOnCall = Boolean.valueOf(this.f47022H.m111828H());
        return userLiveSettings;
    }

    /* JADX INFO: renamed from: m5 */
    public final void m71925m5(final boolean z) {
        i4g0.m138523u("e_live_setting_hide_voice_status", pageId(), pf60.m172085a("live_setting_switch", z ? "on" : BLiveOperationTitleShowType.off));
        UserLiveSettings userLiveSettingsM71924l5 = m71924l5();
        userLiveSettingsM71924l5.hideVoiceOnCall = Boolean.valueOf(z);
        duringCreated(mbs.m157828N(userLiveSettingsM71924l5)).subscribe(dhw.m115829h(new y20() { // from class: l.iot
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116198a.m71930r5(z, (SettingGroups) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n5 */
    public final void m71926n5() {
        this.f47020F.mo113881A(new View.OnClickListener() { // from class: l.tot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175437a.m71931s5(view);
            }
        });
        this.f47017C.mo113881A(new View.OnClickListener() { // from class: l.uot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180127a.m71932t5(view);
            }
        });
        this.f47018D.mo113881A(new View.OnClickListener() { // from class: l.vot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185159a.m71933u5(view);
            }
        });
        this.f47019E.mo113881A(new View.OnClickListener() { // from class: l.wot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190070a.m71934v5(view);
            }
        });
        this.f47021G.mo113881A(new View.OnClickListener() { // from class: l.xot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195598a.m71935w5(view);
            }
        });
        this.f47022H.mo113881A(new View.OnClickListener() { // from class: l.yot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201011a.m71936x5(view);
            }
        });
        this.f47023I.mo113881A(new View.OnClickListener() { // from class: l.fot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100092a.m71937y5(view);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m71927o5() {
        if (nti.m164730d().m164732b(zrv.f205803e)) {
            m71923j5();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f47023I == null || this.f47016B == null) {
            return;
        }
        boolean zM164732b = nti.m164730d().m164732b(act());
        this.f47016B.m68544P(this.f47023I, new j0f(zM164732b));
        if (zM164732b) {
            return;
        }
        m71918H5(false);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m71928p5(Boolean bool) {
        if (nti.m164730d().m164732b(zrv.f205803e)) {
            m71922i5();
        } else {
            l51.m152888H(zrv.f205803e, new Runnable() { // from class: l.qot
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158756a.m71927o5();
                }
            }, 2000L);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_setting";
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m71929q5(SettingGroups settingGroups) {
        m71916E5();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m71930r5(boolean z, SettingGroups settingGroups) {
        this.f47016B.m68544P(this.f47022H, new j0f(z));
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m71931s5(View view) {
        ppi0.m173207l().m173210C(act());
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m71932t5(View view) {
        boolean zM111828H = this.f47017C.m111828H();
        m71889F5(zM111828H);
        m71917G5(!zM111828H);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m71933u5(View view) {
        m71919I5(!this.f47018D.m111828H());
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m71934v5(View view) {
        m71920J5(!this.f47019E.m111828H());
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m71935w5(View view) {
        act().startActivity(LiveIndependentSettingAct.m71882Z1(act(), "privacy_setting", null));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m71936x5(View view) {
        m71925m5(!this.f47022H.m111828H());
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m71937y5(View view) {
        if (!this.f47023I.m111828H()) {
            m71923j5();
        } else {
            this.f47016B.m68544P(this.f47023I, new j0f(false));
            m71918H5(false);
        }
    }
}
