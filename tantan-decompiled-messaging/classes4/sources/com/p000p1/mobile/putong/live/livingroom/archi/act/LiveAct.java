package com.p000p1.mobile.putong.live.livingroom.archi.act;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.LiveFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.mmsdk.player.a;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.bne0;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.ffw;
import l.gkh0;
import l.hu20;
import l.ib1;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ptn;
import l.qib0;
import l.roj0;
import l.u0t;
import l.vdt;
import l.ycp0;
import l.ydt;
import l.ypv;
import p002l.aqe;
import p002l.g5c0;
import p002l.h1c0;
import p002l.i3c0;
import p002l.l1f;
import p002l.oij;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveAct extends LivingBaseAct {

    /* JADX INFO: renamed from: m */
    public static final b<roj0> f3733m = b.b();

    /* JADX INFO: renamed from: n */
    public static long f3734n = 0;

    /* JADX INFO: renamed from: c */
    public boolean f3735c;

    /* JADX INFO: renamed from: e */
    public c4g0 f3737e;

    /* JADX INFO: renamed from: f */
    public long f3738f;

    /* JADX INFO: renamed from: h */
    public AudienceStartData f3740h;

    /* JADX INFO: renamed from: i */
    public AnchorStartData f3741i;

    /* JADX INFO: renamed from: l */
    public long f3744l;

    /* JADX INFO: renamed from: d */
    public boolean f3736d = false;

    /* JADX INFO: renamed from: g */
    public String f3739g = "type_normal_live";

    /* JADX INFO: renamed from: j */
    public boolean f3742j = true;

    /* JADX INFO: renamed from: k */
    public boolean f3743k = true;

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m5016c2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public void m5019h2(Bundle bundle) {
        setTransparentStatusBar();
        if (this.f3735c) {
            setSwipeBackEnable(false);
        } else {
            setFullSlide(true);
        }
        if (bundle != null) {
            m5023g2();
        } else {
            f3733m.onNext(roj0.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m5020i2() {
        aqe.m10039i().m10042f();
        mkd0.z(this.f3737e);
        qib0.G.j();
        hu20.s();
        SVGALoader.clear();
        System.gc();
        hu20.G(ypv.e);
        CommonMaskAvatarView.m5590o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m5021m2(c cVar) {
        if (cVar == c.i) {
            a.b().e(this);
        } else if (cVar == c.m) {
            ycp0.d().i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m5022n2(roj0 roj0Var) {
        m5023g2();
    }

    public ArrayList<j760<String, d30>> debugItems() {
        return new ArrayList<>();
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        hideInput();
        RoomFrag roomFragH0 = getSupportFragmentManager().h0(g5c0.f10819D3);
        if (roomFragH0 instanceof RoomFrag) {
            roomFragH0.m5167P4();
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (vdt.b(1)) {
            return;
        }
        ptn.b();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m5023g2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentI0 = supportFragmentManager.i0("LIVE_ACT_FRAG_TAG");
        k kVarM = supportFragmentManager.m();
        if (fragmentI0 != null) {
            kVarM.r(fragmentI0);
            kVarM.j();
        }
    }

    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setKeepScreenOn(true);
        if (vdt.b(1)) {
            setNavigationBarColor(getResources().getColor(h1c0.f11768a));
            if (m5025l2()) {
                frameLayout.setBackgroundColor(Color.parseColor("#2C2F36"));
            } else {
                frameLayout.setBackgroundResource(i3c0.f12474E3);
            }
        } else if (m5024k2()) {
            frameLayout.setBackgroundResource(i3c0.f12774e3);
        } else {
            frameLayout.setBackgroundResource(i3c0.f13002x3);
        }
        frameLayout.setId(g5c0.f10819D3);
        return frameLayout;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.nor
            public final void call(Object obj) {
                this.f16138a.m5019h2((Bundle) obj);
            }
        }, new d30() { // from class: l.oor
            public final void call() {
                this.f16734a.m5020i2();
            }
        });
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.por
            public final void call(Object obj) {
                this.f17561a.m5021m2((c) obj);
            }
        }));
        this.f3737e = f3733m.asObservable().subscribe(ffw.d(new e30() { // from class: l.qor
            public final void call(Object obj) {
                this.f18110a.m5022n2((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m5024k2() {
        return NullChecker.a(this.f3740h) && "type_normal_live".equals(this.f3740h.liveType);
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m5025l2() {
        if (NullChecker.a(this.f3740h) && (this.f3740h.live instanceof BLiveVoice)) {
            return true;
        }
        return NullChecker.a(this.f3741i) && "type_voice_live".equals(this.f3741i.type);
    }

    public boolean needBindBillingService() {
        return true;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m5026o2() {
        this.f3736d = true;
        m5028q2();
    }

    public void onBackPressed() {
        Fragment fragmentH0 = getSupportFragmentManager().h0(g5c0.f10819D3);
        if ((fragmentH0 instanceof LiveFrag) && ((LiveFrag) fragmentH0).m5161o()) {
            return;
        }
        if ((fragmentH0 instanceof RoomFrag) && ((RoomFrag) fragmentH0).m5176o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onLowMemory() {
        super/*androidx.fragment.app.FragmentActivity*/.onLowMemory();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f3738f > 20000) {
            this.f3738f = jElapsedRealtime;
            lsi0.w(R$string.f3429ma);
        }
    }

    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (this.f3742j && bne0.l() && "V3.2".equals(bne0.d()) && SystemClock.elapsedRealtime() - this.f3744l <= 10) {
            this.f3743k = true;
        }
        this.f3744l = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        BLiveAbsData serializable;
        AudienceStartData audienceStartData;
        super/*android.app.Activity*/.onRestoreInstanceState(bundle);
        if (bundle == null || (serializable = bundle.getSerializable("LIVE_RESTORE_DATA")) == null || !(serializable instanceof BLiveAbsData) || (audienceStartData = this.f3740h) == null) {
            return;
        }
        audienceStartData.live = serializable;
    }

    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (!this.f3735c) {
            if (this.f3736d) {
                return;
            }
            if (vdt.b(2) || !"type_voice_live".equals(this.f3739g)) {
                this.f3736d = true;
                e51.G(new Runnable() { // from class: l.tor
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20326a.m5028q2();
                    }
                });
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_PHONE_STATE");
            if (!vdt.b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
            }
            PermissionHelper.c().q(arrayList).w(false).u(true).j(true).m(new d30() { // from class: l.ror
                public final void call() {
                    this.f18629a.m5026o2();
                }
            }, new e30() { // from class: l.sor
                public final void call(Object obj) {
                    LiveAct.m5016c2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(((Act) this).act);
            return;
        }
        if (this.f3742j && this.f3743k) {
            this.f3742j = false;
            this.f3743k = false;
            ArrayList arrayList2 = new ArrayList();
            if (!"type_voice_live".equals(this.f3739g)) {
                arrayList2.add("android.permission.CAMERA");
            } else if (!vdt.b(1)) {
                arrayList2.add("android.permission.READ_PHONE_STATE");
            }
            if (!vdt.b(2) && Build.VERSION.SDK_INT > 30) {
                arrayList2.add("android.permission.BLUETOOTH_CONNECT");
            }
            arrayList2.add("android.permission.RECORD_AUDIO");
            PermissionHelper.c().q(arrayList2).w(false).u(true).j(true).m(new d30() { // from class: l.uor
                public final void call() {
                    this.f20742a.m5028q2();
                }
            }, new e30() { // from class: l.vor
                public final void call(Object obj) {
                    this.f21254a.m5027p2((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(((Act) this).act);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        BLiveAbsData bLiveAbsDataM5168Q4;
        super.onSaveInstanceState(bundle);
        RoomFrag roomFragI0 = getSupportFragmentManager().i0("LIVE_ACT_FRAG_TAG");
        if (roomFragI0 == null || !(roomFragI0 instanceof RoomFrag) || (bLiveAbsDataM5168Q4 = roomFragI0.m5168Q4()) == null) {
            return;
        }
        bundle.putSerializable("LIVE_RESTORE_DATA", bLiveAbsDataM5168Q4);
    }

    public void onStopLifecycle() {
        super.onStopLifecycle();
        this.f3743k = true;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m5027p2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.GoToSettingPage) {
            this.f3742j = true;
        } else {
            if (vdt.b(3)) {
                return;
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        WeakReference weakReference;
        super.preCreateView(bundle);
        CommonMaskAvatarView.setEnableMask(true);
        CommonMaskAvatarView.setEnableAnimMask(true);
        Intent intent = getIntent();
        this.f3735c = intent.getBooleanExtra("jump_to_tag", false);
        this.f3740h = intent.getSerializableExtra("LIVE_AUDIENCE_START_DATA");
        AnchorStartData serializableExtra = intent.getSerializableExtra("LIVE_ANCHOR_START_DATA");
        this.f3741i = serializableExtra;
        if (this.f3740h == null && serializableExtra == null) {
            finish();
        }
        Act.r rVarForeground_ = Act.foreground_();
        if (System.currentTimeMillis() - f3734n < 500 && rVarForeground_ != null && (weakReference = rVarForeground_.a) != null && (weakReference.get() instanceof LiveAct)) {
            finish();
        }
        f3734n = System.currentTimeMillis();
        AnchorStartData anchorStartData = this.f3741i;
        if (anchorStartData != null) {
            this.f3739g = anchorStartData.type;
        }
        qib0.G.j();
        if (this.f3735c) {
            gkh0.j(u0t.d, "live page start " + this.f3741i.type);
        } else {
            gkh0.j(u0t.d, "LiveAct.preCreateView() subscribeEngineSo");
            try {
                oij.m19550e();
            } catch (Exception unused) {
                String str = " live source is " + this.f3740h.source + ", live category is " + this.f3740h.category + ", live fromLiveSquare is" + this.f3740h.fromLiveSquare + ", live id is " + this.f3740h.live.id;
                gkh0.j(u0t.d, "LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str));
                CrashHelper.c(new Exception("LiveAct.preCreateView() LivingRoomModule.livingRoomBridge is null.".concat(str)));
            }
        }
        ydt.a();
        oij.m19547b();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m5028q2() {
        Fragment fragmentM5189P4;
        k kVarM = getSupportFragmentManager().m();
        if (this.f3735c) {
            fragmentM5189P4 = LiveFrag.m5155O4(this.f3741i);
        } else {
            AudienceStartData audienceStartData = this.f3740h;
            fragmentM5189P4 = audienceStartData.isTeenMode ? TeenModeRoomFrag.m5189P4(audienceStartData) : RoomFrag.m5165N4(audienceStartData);
        }
        kVarM.t(g5c0.f10819D3, fragmentM5189P4, "LIVE_ACT_FRAG_TAG");
        kVarM.j();
    }

    /* JADX INFO: renamed from: r2 */
    public void m5029r2(AnchorStartData anchorStartData) {
        this.f3735c = true;
        this.f3741i = anchorStartData;
        m5028q2();
    }

    /* JADX INFO: renamed from: s2 */
    public void m5030s2(AudienceStartData audienceStartData) {
        this.f3735c = false;
        this.f3740h = audienceStartData;
        m5028q2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:fragments");
            bundle.remove("android:support:fragments");
        }
        if (l1f.m16934a(getIntent())) {
            return true;
        }
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (audioBusinessTypeC != AudioBusinessType.VIDEO_CHAT) {
            return super.shouldBlockOnCreate(bundle);
        }
        lsi0.y(audioBusinessTypeC.getBusinessMsg());
        return true;
    }
}
