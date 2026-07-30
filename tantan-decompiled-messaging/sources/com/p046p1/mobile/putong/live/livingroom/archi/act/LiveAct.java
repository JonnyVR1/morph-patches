package com.p046p1.mobile.putong.live.livingroom.archi.act;

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
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.LiveFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p133rx.subjects.C22393b;
import p149l.aqe;
import p149l.bne0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.g5c0;
import p149l.gkh0;
import p149l.h1c0;
import p149l.hu20;
import p149l.i3c0;
import p149l.ib1;
import p149l.j760;
import p149l.l1f;
import p149l.lsi0;
import p149l.mkd0;
import p149l.oij;
import p149l.ptn;
import p149l.qib0;
import p149l.roj0;
import p149l.u0t;
import p149l.vdt;
import p149l.ycp0;
import p149l.ydt;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAct extends LivingBaseAct {

    /* JADX INFO: renamed from: m */
    public static final C22393b<roj0> f47691m = C22393b.m221521b();

    /* JADX INFO: renamed from: n */
    public static long f47692n = 0;

    /* JADX INFO: renamed from: c */
    public boolean f47693c;

    /* JADX INFO: renamed from: e */
    public c4g0 f47695e;

    /* JADX INFO: renamed from: f */
    public long f47696f;

    /* JADX INFO: renamed from: h */
    public AudienceStartData f47698h;

    /* JADX INFO: renamed from: i */
    public AnchorStartData f47699i;

    /* JADX INFO: renamed from: l */
    public long f47702l;

    /* JADX INFO: renamed from: d */
    public boolean f47694d = false;

    /* JADX INFO: renamed from: g */
    public String f47697g = "type_normal_live";

    /* JADX INFO: renamed from: j */
    public boolean f47700j = true;

    /* JADX INFO: renamed from: k */
    public boolean f47701k = true;

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m71650c2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public void m71653h2(Bundle bundle) {
        setTransparentStatusBar();
        if (this.f47693c) {
            setSwipeBackEnable(false);
        } else {
            setFullSlide(true);
        }
        if (bundle != null) {
            m71657g2();
        } else {
            f47691m.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m71654i2() {
        aqe.m98261i().m98264f();
        mkd0.m154992z(this.f47695e);
        qib0.f154691G.m184721j();
        hu20.m132972s();
        SVGALoader.clear();
        System.gc();
        hu20.m132955G(ypv.f199497e);
        CommonMaskAvatarView.m72117o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m71655m2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            C12459a.m68524b().m68527e(this);
        } else if (c4319c == C4319c.f15552m) {
            ycp0.m214190d().m214198i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m71656n2(roj0 roj0Var) {
        m71657g2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return new ArrayList<>();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        hideInput();
        Fragment fragmentM2554h0 = getSupportFragmentManager().m2554h0(g5c0.f100669D3);
        if (fragmentM2554h0 instanceof RoomFrag) {
            ((RoomFrag) fragmentM2554h0).m71798P4();
        }
        super.m66873d2();
        if (vdt.m198092b(1)) {
            return;
        }
        ptn.m171362b();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m71657g2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("LIVE_ACT_FRAG_TAG");
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        if (fragmentM2557i0 != null) {
            abstractC0427kM2567m.mo2715r(fragmentM2557i0);
            abstractC0427kM2567m.mo2708j();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setKeepScreenOn(true);
        if (vdt.m198092b(1)) {
            setNavigationBarColor(getResources().getColor(h1c0.f105348a));
            if (m71659l2()) {
                frameLayout.setBackgroundColor(Color.parseColor("#2C2F36"));
            } else {
                frameLayout.setBackgroundResource(i3c0.f110689E3);
            }
        } else if (m71658k2()) {
            frameLayout.setBackgroundResource(i3c0.f110989e3);
        } else {
            frameLayout.setBackgroundResource(i3c0.f111217x3);
        }
        frameLayout.setId(g5c0.f100669D3);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.nor
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139865a.m71653h2((Bundle) obj);
            }
        }, new d30() { // from class: l.oor
            @Override // p149l.d30
            public final void call() {
                this.f144904a.m71654i2();
            }
        });
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.por
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150556a.m71655m2((C4319c) obj);
            }
        }));
        this.f47695e = f47691m.asObservable().subscribe(ffw.m121193d(new e30() { // from class: l.qor
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155627a.m71656n2((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m71658k2() {
        return NullChecker.m81303a(this.f47698h) && "type_normal_live".equals(this.f47698h.liveType);
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m71659l2() {
        if (NullChecker.m81303a(this.f47698h) && (this.f47698h.live instanceof BLiveVoice)) {
            return true;
        }
        return NullChecker.m81303a(this.f47699i) && "type_voice_live".equals(this.f47699i.type);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m71660o2() {
        this.f47694d = true;
        m71662q2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM2554h0 = getSupportFragmentManager().m2554h0(g5c0.f100669D3);
        if ((fragmentM2554h0 instanceof LiveFrag) && ((LiveFrag) fragmentM2554h0).m71792o()) {
            return;
        }
        if ((fragmentM2554h0 instanceof RoomFrag) && ((RoomFrag) fragmentM2554h0).m71805o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f47696f > 20000) {
            this.f47696f = jElapsedRealtime;
            lsi0.m151593w(R$string.f47387ma);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (this.f47700j && bne0.m102783l() && "V3.2".equals(bne0.m102775d()) && SystemClock.elapsedRealtime() - this.f47702l <= 10) {
            this.f47701k = true;
        }
        this.f47702l = SystemClock.elapsedRealtime();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        Serializable serializable;
        AudienceStartData audienceStartData;
        super.onRestoreInstanceState(bundle);
        if (bundle == null || (serializable = bundle.getSerializable("LIVE_RESTORE_DATA")) == null || !(serializable instanceof BLiveAbsData) || (audienceStartData = this.f47698h) == null) {
            return;
        }
        audienceStartData.live = (BLiveAbsData) serializable;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (!this.f47693c) {
            if (this.f47694d) {
                return;
            }
            if (vdt.m198092b(2) || !"type_voice_live".equals(this.f47697g)) {
                this.f47694d = true;
                e51.m114742G(new Runnable() { // from class: l.tor
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f171405a.m71662q2();
                    }
                });
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_PHONE_STATE");
            if (!vdt.m198092b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
            }
            PermissionHelper.m79882c().m79899q(arrayList).m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.ror
                @Override // p149l.d30
                public final void call() {
                    this.f160411a.m71660o2();
                }
            }, new e30() { // from class: l.sor
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveAct.m71650c2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(this.act);
            return;
        }
        if (this.f47700j && this.f47701k) {
            this.f47700j = false;
            this.f47701k = false;
            ArrayList arrayList2 = new ArrayList();
            if (!"type_voice_live".equals(this.f47697g)) {
                arrayList2.add("android.permission.CAMERA");
            } else if (!vdt.m198092b(1)) {
                arrayList2.add("android.permission.READ_PHONE_STATE");
            }
            if (!vdt.m198092b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList2.add("android.permission.BLUETOOTH_CONNECT");
            }
            arrayList2.add("android.permission.RECORD_AUDIO");
            PermissionHelper.m79882c().m79899q(arrayList2).m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.uor
                @Override // p149l.d30
                public final void call() {
                    this.f177530a.m71662q2();
                }
            }, new e30() { // from class: l.vor
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182412a.m71661p2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(this.act);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        BLiveAbsData bLiveAbsDataM71799Q4;
        super.onSaveInstanceState(bundle);
        Fragment fragmentM2557i0 = getSupportFragmentManager().m2557i0("LIVE_ACT_FRAG_TAG");
        if (fragmentM2557i0 == null || !(fragmentM2557i0 instanceof RoomFrag) || (bLiveAbsDataM71799Q4 = ((RoomFrag) fragmentM2557i0).m71799Q4()) == null) {
            return;
        }
        bundle.putSerializable("LIVE_RESTORE_DATA", bLiveAbsDataM71799Q4);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
        this.f47701k = true;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m71661p2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.GoToSettingPage) {
            this.f47700j = true;
        } else {
            if (vdt.m198092b(3)) {
                return;
            }
            m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        WeakReference<Activity> weakReference;
        super.preCreateView(bundle);
        CommonMaskAvatarView.setEnableMask(true);
        CommonMaskAvatarView.setEnableAnimMask(true);
        Intent intent = getIntent();
        this.f47693c = intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false);
        this.f47698h = (AudienceStartData) intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        AnchorStartData anchorStartData = (AnchorStartData) intent.getSerializableExtra("LIVE_ANCHOR_START_DATA");
        this.f47699i = anchorStartData;
        if (this.f47698h == null && anchorStartData == null) {
            m66873d2();
        }
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (System.currentTimeMillis() - f47692n < 500 && c4299rForeground_ != null && (weakReference = c4299rForeground_.f15343a) != null && (weakReference.get() instanceof LiveAct)) {
            m66873d2();
        }
        f47692n = System.currentTimeMillis();
        AnchorStartData anchorStartData2 = this.f47699i;
        if (anchorStartData2 != null) {
            this.f47697g = anchorStartData2.type;
        }
        qib0.f154691G.m184721j();
        if (this.f47693c) {
            gkh0.m126627j(u0t.f172945d, "live page start " + this.f47699i.type);
        } else {
            gkh0.m126627j(u0t.f172945d, "LiveAct.preCreateView() subscribeEngineSo");
            try {
                oij.m164529e();
            } catch (Exception unused) {
                String str = " live source is " + this.f47698h.source + ", live category is " + this.f47698h.category + ", live fromLiveSquare is" + this.f47698h.fromLiveSquare + ", live id is " + this.f47698h.live.f44323id;
                gkh0.m126627j(u0t.f172945d, "LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str));
                CrashHelper.m81296c(new Exception("LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str)));
            }
        }
        ydt.m214324a();
        oij.m164526b();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m71662q2() {
        Fragment fragmentM71818P4;
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        if (this.f47693c) {
            fragmentM71818P4 = LiveFrag.m71787O4(this.f47699i);
        } else {
            AudienceStartData audienceStartData = this.f47698h;
            fragmentM71818P4 = audienceStartData.isTeenMode ? TeenModeRoomFrag.m71818P4(audienceStartData) : RoomFrag.m71796N4(audienceStartData);
        }
        abstractC0427kM2567m.m2812t(g5c0.f100669D3, fragmentM71818P4, "LIVE_ACT_FRAG_TAG");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: r2 */
    public void m71663r2(AnchorStartData anchorStartData) {
        this.f47693c = true;
        this.f47699i = anchorStartData;
        m71662q2();
    }

    /* JADX INFO: renamed from: s2 */
    public void m71664s2(AudienceStartData audienceStartData) {
        this.f47693c = false;
        this.f47698h = audienceStartData;
        m71662q2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove(Act.FRAGMENTS_TAG);
            bundle.remove(Act.SUPPORT_FRAGMENTS_TAG);
        }
        if (l1f.m148173a(getIntent())) {
            return true;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c != AudioBusinessType.VIDEO_CHAT) {
            return super.shouldBlockOnCreate(bundle);
        }
        lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
        return true;
    }
}
