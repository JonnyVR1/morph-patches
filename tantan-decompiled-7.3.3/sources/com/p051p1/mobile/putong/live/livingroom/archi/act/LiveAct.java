package com.p051p1.mobile.putong.live.livingroom.archi.act;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.LiveFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p137rx.subjects.C22508b;
import p153l.cmp0;
import p153l.dhw;
import p153l.ere;
import p153l.hlj;
import p153l.ive0;
import p153l.kcg0;
import p153l.l51;
import p153l.mdc0;
import p153l.n9c0;
import p153l.nsh0;
import p153l.o1j0;
import p153l.obc0;
import p153l.pb1;
import p153l.pf60;
import p153l.psd0;
import p153l.pvn;
import p153l.q2f;
import p153l.r230;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v2t;
import p153l.wft;
import p153l.x20;
import p153l.y20;
import p153l.zft;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAct extends LivingBaseAct {

    /* JADX INFO: renamed from: m */
    public static final C22508b<uxj0> f48539m = C22508b.m222767b();

    /* JADX INFO: renamed from: n */
    public static long f48540n = 0;

    /* JADX INFO: renamed from: c */
    public boolean f48541c;

    /* JADX INFO: renamed from: e */
    public kcg0 f48543e;

    /* JADX INFO: renamed from: f */
    public long f48544f;

    /* JADX INFO: renamed from: h */
    public AudienceStartData f48546h;

    /* JADX INFO: renamed from: i */
    public AnchorStartData f48547i;

    /* JADX INFO: renamed from: l */
    public long f48550l;

    /* JADX INFO: renamed from: d */
    public boolean f48542d = false;

    /* JADX INFO: renamed from: g */
    public String f48545g = "type_normal_live";

    /* JADX INFO: renamed from: j */
    public boolean f48548j = true;

    /* JADX INFO: renamed from: k */
    public boolean f48549k = true;

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m72833d2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m72836i2(Bundle bundle) {
        setTransparentStatusBar();
        if (this.f48541c) {
            setSwipeBackEnable(false);
        } else {
            setFullSlide(true);
        }
        if (bundle != null) {
            m72840h2();
        } else {
            f48539m.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public void m72837k2() {
        ere.m122146i().m122149f();
        psd0.m173633z(this.f48543e);
        uqb0.f180374G.m98794j();
        r230.m179477s();
        SVGALoader.clear();
        System.gc();
        r230.m179460G(zrv.f205803e);
        CommonMaskAvatarView.m73300o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m72838n2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            C12622a.m69707b().m69710e(this);
        } else if (c4470c == C4470c.f16271m) {
            cmp0.m111299d().m111307i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m72839o2(uxj0 uxj0Var) {
        m72840h2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return new ArrayList<>();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        hideInput();
        Fragment fragmentM2555h0 = getSupportFragmentManager().m2555h0(mdc0.f135914D3);
        if (fragmentM2555h0 instanceof RoomFrag) {
            ((RoomFrag) fragmentM2555h0).m72981P4();
        }
        super.m68056e2();
        if (wft.m206159b(1)) {
            return;
        }
        pvn.m173967b();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m72840h2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentM2558i0 = supportFragmentManager.m2558i0("LIVE_ACT_FRAG_TAG");
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        if (fragmentM2558i0 != null) {
            abstractC0428kM2568m.mo2716r(fragmentM2558i0);
            abstractC0428kM2568m.mo2709j();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setKeepScreenOn(true);
        if (wft.m206159b(1)) {
            setNavigationBarColor(getResources().getColor(n9c0.f140809a));
            if (m72842m2()) {
                frameLayout.setBackgroundColor(Color.parseColor("#2C2F36"));
            } else {
                frameLayout.setBackgroundResource(obc0.f146017E3);
            }
        } else if (m72841l2()) {
            frameLayout.setBackgroundResource(obc0.f146317e3);
        } else {
            frameLayout.setBackgroundResource(obc0.f146545x3);
        }
        frameLayout.setId(mdc0.f135914D3);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.oqr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148639a.m72836i2((Bundle) obj);
            }
        }, new x20() { // from class: l.pqr
            @Override // p153l.x20
            public final void call() {
                this.f153691a.m72837k2();
            }
        });
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.qqr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159035a.m72838n2((C4470c) obj);
            }
        }));
        this.f48543e = f48539m.asObservable().subscribe(dhw.m115825d(new y20() { // from class: l.rqr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164513a.m72839o2((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m72841l2() {
        return NullChecker.m82486a(this.f48546h) && "type_normal_live".equals(this.f48546h.liveType);
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m72842m2() {
        if (NullChecker.m82486a(this.f48546h) && (this.f48546h.live instanceof BLiveVoice)) {
            return true;
        }
        return NullChecker.m82486a(this.f48547i) && "type_voice_live".equals(this.f48547i.type);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM2555h0 = getSupportFragmentManager().m2555h0(mdc0.f135914D3);
        if ((fragmentM2555h0 instanceof LiveFrag) && ((LiveFrag) fragmentM2555h0).m72975o()) {
            return;
        }
        if ((fragmentM2555h0 instanceof RoomFrag) && ((RoomFrag) fragmentM2555h0).m72988o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f48544f > 20000) {
            this.f48544f = jElapsedRealtime;
            o1j0.m165649w(R$string.f48235ma);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (this.f48548j && ive0.m142298l() && "V3.2".equals(ive0.m142290d()) && SystemClock.elapsedRealtime() - this.f48550l <= 10) {
            this.f48549k = true;
        }
        this.f48550l = SystemClock.elapsedRealtime();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        Serializable serializable;
        AudienceStartData audienceStartData;
        super.onRestoreInstanceState(bundle);
        if (bundle == null || (serializable = bundle.getSerializable("LIVE_RESTORE_DATA")) == null || !(serializable instanceof BLiveAbsData) || (audienceStartData = this.f48546h) == null) {
            return;
        }
        audienceStartData.live = (BLiveAbsData) serializable;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (!this.f48541c) {
            if (this.f48542d) {
                return;
            }
            if (wft.m206159b(2) || !"type_voice_live".equals(this.f48545g)) {
                this.f48542d = true;
                l51.m152887G(new Runnable() { // from class: l.uqr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f180501a.m72845r2();
                    }
                });
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_PHONE_STATE");
            if (!wft.m206159b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
            }
            PermissionHelper.m81065c().m81082q(arrayList).m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.sqr
                @Override // p153l.x20
                public final void call() {
                    this.f170198a.m72843p2();
                }
            }, new y20() { // from class: l.tqr
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveAct.m72833d2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(this.act);
            return;
        }
        if (this.f48548j && this.f48549k) {
            this.f48548j = false;
            this.f48549k = false;
            ArrayList arrayList2 = new ArrayList();
            if (!"type_voice_live".equals(this.f48545g)) {
                arrayList2.add("android.permission.CAMERA");
            } else if (!wft.m206159b(1)) {
                arrayList2.add("android.permission.READ_PHONE_STATE");
            }
            if (!wft.m206159b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList2.add("android.permission.BLUETOOTH_CONNECT");
            }
            arrayList2.add("android.permission.RECORD_AUDIO");
            PermissionHelper.m81065c().m81082q(arrayList2).m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.vqr
                @Override // p153l.x20
                public final void call() {
                    this.f185393a.m72845r2();
                }
            }, new y20() { // from class: l.wqr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190427a.m72844q2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(this.act);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        BLiveAbsData bLiveAbsDataM72982Q4;
        super.onSaveInstanceState(bundle);
        Fragment fragmentM2558i0 = getSupportFragmentManager().m2558i0("LIVE_ACT_FRAG_TAG");
        if (fragmentM2558i0 == null || !(fragmentM2558i0 instanceof RoomFrag) || (bLiveAbsDataM72982Q4 = ((RoomFrag) fragmentM2558i0).m72982Q4()) == null) {
            return;
        }
        bundle.putSerializable("LIVE_RESTORE_DATA", bLiveAbsDataM72982Q4);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
        this.f48549k = true;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m72843p2() {
        this.f48542d = true;
        m72845r2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        WeakReference<Activity> weakReference;
        super.preCreateView(bundle);
        CommonMaskAvatarView.setEnableMask(true);
        CommonMaskAvatarView.setEnableAnimMask(true);
        Intent intent = getIntent();
        this.f48541c = intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false);
        this.f48546h = (AudienceStartData) intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        AnchorStartData anchorStartData = (AnchorStartData) intent.getSerializableExtra("LIVE_ANCHOR_START_DATA");
        this.f48547i = anchorStartData;
        if (this.f48546h == null && anchorStartData == null) {
            m68056e2();
        }
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (System.currentTimeMillis() - f48540n < 500 && c4450rForeground_ != null && (weakReference = c4450rForeground_.f16062a) != null && (weakReference.get() instanceof LiveAct)) {
            m68056e2();
        }
        f48540n = System.currentTimeMillis();
        AnchorStartData anchorStartData2 = this.f48547i;
        if (anchorStartData2 != null) {
            this.f48545g = anchorStartData2.type;
        }
        uqb0.f180374G.m98794j();
        if (this.f48541c) {
            nsh0.m164608j(v2t.f182114d, "live page start " + this.f48547i.type);
        } else {
            nsh0.m164608j(v2t.f182114d, "LiveAct.preCreateView() subscribeEngineSo");
            try {
                hlj.m135756e();
            } catch (Exception unused) {
                String str = " live source is " + this.f48546h.source + ", live category is " + this.f48546h.category + ", live fromLiveSquare is" + this.f48546h.fromLiveSquare + ", live id is " + this.f48546h.live.f45171id;
                nsh0.m164608j(v2t.f182114d, "LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str));
                CrashHelper.m82479c(new Exception("LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str)));
            }
        }
        zft.m219577a();
        hlj.m135753b();
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m72844q2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.GoToSettingPage) {
            this.f48548j = true;
        } else {
            if (wft.m206159b(3)) {
                return;
            }
            m68056e2();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final void m72845r2() {
        Fragment fragmentM73001P4;
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        if (this.f48541c) {
            fragmentM73001P4 = LiveFrag.m72970O4(this.f48547i);
        } else {
            AudienceStartData audienceStartData = this.f48546h;
            fragmentM73001P4 = audienceStartData.isTeenMode ? TeenModeRoomFrag.m73001P4(audienceStartData) : RoomFrag.m72979N4(audienceStartData);
        }
        abstractC0428kM2568m.m2813t(mdc0.f135914D3, fragmentM73001P4, "LIVE_ACT_FRAG_TAG");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: s2 */
    public void m72846s2(AnchorStartData anchorStartData) {
        this.f48541c = true;
        this.f48547i = anchorStartData;
        m72845r2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove(Act.FRAGMENTS_TAG);
            bundle.remove(Act.SUPPORT_FRAGMENTS_TAG);
        }
        if (q2f.m175024a(getIntent())) {
            return true;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c != AudioBusinessType.VIDEO_CHAT) {
            return super.shouldBlockOnCreate(bundle);
        }
        o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
        return true;
    }

    /* JADX INFO: renamed from: u2 */
    public void m72847u2(AudienceStartData audienceStartData) {
        this.f48541c = false;
        this.f48546h = audienceStartData;
        m72845r2();
    }
}
