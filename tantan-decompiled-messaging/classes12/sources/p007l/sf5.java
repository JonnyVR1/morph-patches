package p007l;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderFrag;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.g30;
import l.h3x;
import l.hpd0;
import l.j760;
import l.lsi0;
import l.rlw;
import l.s4l0;
import l.s7m;
import l.t100;
import l.xck0;
import l.xdl0;
import l.xh0;
import l.zqx;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sf5 implements s7m<ye5>, hxl, p84 {

    /* JADX INFO: renamed from: C */
    public VideoInfo f12909C;

    /* JADX INFO: renamed from: D */
    public int f12910D;

    /* JADX INFO: renamed from: E */
    public int f12911E;

    /* JADX INFO: renamed from: H */
    public e30<View> f12914H;

    /* JADX INFO: renamed from: I */
    public e30<View> f12915I;

    /* JADX INFO: renamed from: J */
    public e30<Bundle> f12916J;

    /* JADX INFO: renamed from: K */
    public CameraSticker f12917K;

    /* JADX INFO: renamed from: a */
    public SurfaceView f12918a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f12919b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f12920c;

    /* JADX INFO: renamed from: d */
    public TextView f12921d;

    /* JADX INFO: renamed from: e */
    public ImageView f12922e;

    /* JADX INFO: renamed from: f */
    public TextView f12923f;

    /* JADX INFO: renamed from: g */
    public ImageView f12924g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f12925h;

    /* JADX INFO: renamed from: i */
    public ImageView f12926i;

    /* JADX INFO: renamed from: j */
    public TextView f12927j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f12928k;

    /* JADX INFO: renamed from: l */
    public CameraMenuView f12929l;

    /* JADX INFO: renamed from: m */
    public CameraMenuView f12930m;

    /* JADX INFO: renamed from: n */
    public ViewStub f12931n;

    /* JADX INFO: renamed from: o */
    public FeedComicFacePropMenuView f12932o;

    /* JADX INFO: renamed from: p */
    public Context f12933p;

    /* JADX INFO: renamed from: q */
    public ixl f12934q;

    /* JADX INFO: renamed from: r */
    public MusicContent f12935r;

    /* JADX INFO: renamed from: s */
    public ComicFaceRecorderFrag f12936s;

    /* JADX INFO: renamed from: t */
    public ye5 f12937t;

    /* JADX INFO: renamed from: u */
    public FeedComicFacePropMenuView f12938u;

    /* JADX INFO: renamed from: v */
    public xh0 f12939v;

    /* JADX INFO: renamed from: w */
    public int f12940w = 1;

    /* JADX INFO: renamed from: x */
    public int f12941x = 0;

    /* JADX INFO: renamed from: y */
    public int f12942y = 0;

    /* JADX INFO: renamed from: z */
    public boolean f12943z = true;

    /* JADX INFO: renamed from: A */
    public boolean f12907A = true;

    /* JADX INFO: renamed from: B */
    public boolean f12908B = false;

    /* JADX INFO: renamed from: F */
    public ArrayList<MediaMeta> f12912F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public hpd0 f12913G = new hpd0("comic_face_recorder_need_show_tip" + FeedModule.m1139F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l.sf5$b */
    public class C2485b implements FeedCircleProgressBar.InterfaceC2048b {
        public C2485b() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC2048b
        /* JADX INFO: renamed from: a */
        public void mo3096a(int i) {
            sf5.this.f12940w = i;
            if (i == 100) {
                xdl0.M0(sf5.this.f12928k, true);
                xdl0.M0(sf5.this.f12925h, true);
                xdl0.M0(sf5.this.f12924g, true);
                return;
            }
            if (i == 103) {
                if (sf5.this.f12932o.f1668c.m3074N() < sf5.this.m14203f0()) {
                    lsi0.h(R$string.f329B0);
                    return;
                }
                xdl0.M0(sf5.this.f12928k, true);
                xdl0.M0(sf5.this.f12924g, true);
                sf5.this.f12934q.mo13990O();
                return;
            }
            if (i != 102) {
                if (i == 101) {
                    xdl0.M0(sf5.this.f12925h, false);
                    xdl0.M0(sf5.this.f12928k, false);
                    xdl0.M0(sf5.this.f12924g, false);
                    sf5.this.m14170S0();
                    return;
                }
                return;
            }
            xdl0.M0(sf5.this.f12928k, true);
            xdl0.M0(sf5.this.f12924g, true);
            int count = sf5.this.f12932o.f1668c.getCount();
            sf5 sf5Var = sf5.this;
            if (count == 0) {
                xdl0.M0(sf5Var.f12925h, true);
            } else {
                xdl0.M0(sf5Var.f12925h, false);
            }
            sf5.this.m14173U0(true);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC2048b
        public void onEvent(int i, int i2) {
            if (i == 106) {
                xdl0.M0(sf5.this.f12925h, true);
                xdl0.M0(sf5.this.f12924g, true);
                xdl0.M0(sf5.this.f12929l, true);
                sf5.this.f12940w = 100;
                return;
            }
            if (i == 105 || i == 104 || i != 107) {
                return;
            }
            if (sf5.this.f12932o.f1668c.m3074N() < sf5.this.m14203f0()) {
                lsi0.h(R$string.f329B0);
                return;
            }
            xdl0.M0(sf5.this.f12928k, true);
            xdl0.M0(sf5.this.f12924g, true);
            sf5.this.f12934q.mo13990O();
        }
    }

    public sf5(ComicFaceRecorderFrag comicFaceRecorderFrag) {
        this.f12936s = comicFaceRecorderFrag;
        this.f12933p = comicFaceRecorderFrag.getActivity();
    }

    /* JADX INFO: renamed from: K0 */
    private void m14156K0() {
        m14173U0(false);
        mo13823k(false);
        this.f12934q.mo13990O();
    }

    /* JADX INFO: renamed from: L0 */
    private void m14158L0(Runnable runnable) {
        Animator animatorP = bt0.p(this.f12928k, "translationX", 0L, 100L, new LinearInterpolator(), new float[]{0.0f, t100.d(60.0f)});
        bt0.f(animatorP, runnable);
        animatorP.start();
    }

    /* JADX INFO: renamed from: M0 */
    private void m14160M0() {
        this.f12912F.add(m14178a0());
    }

    /* JADX INFO: renamed from: N0 */
    private void m14162N0() {
        if (this.f12912F.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f12912F;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m14166Q0(String str, final d30 d30Var) {
        xh0 xh0VarA = new xh0.a(this.f12936s.act()).g(false).j(str).e(R$string.f606s3).q(R$string.f478a).c(new View.OnClickListener() { // from class: l.bf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).o(new View.OnClickListener() { // from class: l.cf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6617a.m14191D0(view);
            }
        }).a();
        this.f12939v = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: R0 */
    private void m14168R0() {
        boolean z;
        boolean zPrepare;
        try {
            zPrepare = this.f12934q.prepare();
        } catch (Throwable th) {
            boolean z2 = true;
            try {
                System.loadLibrary("c++_shared");
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            try {
                System.loadLibrary("xeengine");
            } catch (Throwable unused2) {
                z2 = false;
            }
            CrashHelper.c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zPrepare = false;
        }
        if (zPrepare) {
            this.f12934q.mo13993g();
        } else {
            lsi0.j("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m14170S0() {
        CameraSticker cameraSticker = this.f12917K;
        zvf0.u("e_kankan_post_shoot", "p_camera_video", new j760[]{new j760("shoot_type", "immersion_cartoon_effects"), new j760("event_type", "MC"), new j760("sticker_id", cameraSticker != null ? cameraSticker.f680id : "0")});
        this.f12913G.put(Boolean.FALSE);
        if (this.f12934q.mo13994h()) {
            return;
        }
        m14175X();
    }

    /* JADX INFO: renamed from: T0 */
    private void m14172T0() {
        this.f12934q.mo14000y(1.0f);
        this.f12934q.mo13995i();
        if (!this.f12908B) {
            m14160M0();
        } else {
            m14173U0(true);
            this.f12908B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public boolean m14173U0(boolean z) {
        if (this.f12934q.mo13994h()) {
            return this.f12934q.mo13987I(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    private void m14174W() {
        this.f12908B = true;
        this.f12934q.mo13996j();
        mo13823k(false);
    }

    /* JADX INFO: renamed from: X */
    private void m14175X() {
        if (this.f12932o.f1668c.m3074N() >= m14180e0()) {
            m14156K0();
        } else {
            m14172T0();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m14176Y() {
        if (PermissionHelper.b(zqx.k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m14202c0();
    }

    /* JADX INFO: renamed from: Z */
    private void m14177Z() {
        CameraSticker cameraSticker = this.f12917K;
        if (cameraSticker != null && cameraSticker.hasModelFile) {
            m14198P0();
        }
        if (this.f12936s.isResumed()) {
            this.f12937t.m17126k0();
            if (this.f12940w != 102) {
                this.f12940w = 100;
            }
            Act act = act();
            if (!NullChecker.b(act) || act.isFinishing()) {
                return;
            }
            m14168R0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    private MediaMeta m14178a0() {
        CameraSticker cameraStickerM17106e = yb4.m17102c().m17106e();
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m14182l0() ? "front" : FeedMakeupPageAdapter.MakeupItem.BACK;
        if (cameraStickerM17106e != null) {
            mediaMeta.sticker = cameraStickerM17106e.f680id;
        }
        return mediaMeta;
    }

    /* JADX INFO: renamed from: d0 */
    private Bundle m14179d0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f12909C == null) {
            this.f12909C = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = true;
        rlw rlwVarMo13989K = this.f12934q.mo13989K();
        if (NullChecker.a(rlwVarMo13989K)) {
            video.rotate = rlwVarMo13989K.v();
        }
        MusicContent musicContentMo11059z = this.f12934q.mo11059z();
        video.isFrontCamera = this.f12934q.mo13992e();
        if (NullChecker.a(musicContentMo11059z)) {
            video.playingMusic = musicContentMo11059z;
        }
        VideoInfo videoInfo = this.f12909C;
        videoInfo.autoMusic = false;
        int i = this.f12940w;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f12941x;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        this.f12909C.maxDuration = m14180e0();
        VideoInfo videoInfo2 = this.f12909C;
        MusicContent musicContent = this.f12935r;
        videoInfo2.hasOriginalSound = musicContent == null;
        videoInfo2.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f12912F);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f12909C);
        bundle.putBoolean("key_is_change_speed", false);
        bundle.putString("extra_from", "immersion_cartoon_effects");
        return bundle;
    }

    /* JADX INFO: renamed from: e0 */
    private long m14180e0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: k0 */
    private void m14181k0() {
        uuv uuvVar = new uuv();
        this.f12934q = uuvVar;
        uuvVar.mo13991a(act(), this);
        if (NullChecker.a(this.f12935r)) {
            this.f12934q.mo11058x(this.f12935r);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m14182l0() {
        return this.f12934q.mo13992e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m14188A0(View view) {
        this.f12915I.call(view);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m14189B0(h3x h3xVar) {
        this.f12934q.mo11037A(h3xVar);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m14190C0() {
        return this.f12933p;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m14191D0(View view) {
        this.f12939v.c();
    }

    /* JADX INFO: renamed from: E0 */
    public void m14192E0() {
        m14176Y();
        xdl0.M(this.f12925h, true);
        m14181k0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m14193G0() {
        if (vb4.m15410i()) {
            this.f12934q.release();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m14194H0() {
        if (this.f12940w == 101) {
            this.f12940w = 102;
            this.f12932o.m3128H(102);
        }
        this.f12934q.onPause();
    }

    /* JADX INFO: renamed from: I0 */
    public void m14195I0() {
        if (this.f12928k.getTranslationX() != 0.0f) {
            this.f12928k.setTranslationX(0.0f);
        }
        m14177Z();
    }

    /* JADX INFO: renamed from: J0 */
    public void m14196J0(MusicContent musicContent) {
        this.f12935r = musicContent;
        VideoInfo videoInfo = this.f12909C;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.a(musicContent)) {
            this.f12927j.setText(musicContent.name);
        }
        this.f12934q.mo11058x(musicContent);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m14197O0() {
        this.f12918a.getHolder().addCallback(new SurfaceHolderCallbackC2484a());
        this.f12914H = xck0.a(500, new e30() { // from class: l.kf5
            public final void call(Object obj) {
                this.f9698a.m14216t0((View) obj);
            }
        });
        this.f12915I = xck0.a(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, new e30() { // from class: l.lf5
            public final void call(Object obj) {
                this.f10019a.m14217u0((View) obj);
            }
        });
        this.f12916J = xck0.a(500, new e30() { // from class: l.mf5
            public final void call(Object obj) {
                this.f10452a.m14220x0((Bundle) obj);
            }
        });
        this.f12924g.setOnClickListener(new View.OnClickListener() { // from class: l.nf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10765a.m14221y0(view);
            }
        });
        this.f12929l.setOnClickListener(new View.OnClickListener() { // from class: l.of5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11463a.m14222z0(view);
            }
        });
        this.f12925h.setOnClickListener(new View.OnClickListener() { // from class: l.pf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11823a.m14188A0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final void m14198P0() {
        final h3x h3xVarA = s4l0.a(m14190C0(), new File(this.f12917K.modelFilePath));
        if (NullChecker.b(h3xVarA)) {
            e51.H(this.f12933p, new Runnable() { // from class: l.rf5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12635a.m14189B0(h3xVarA);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: U */
    public View m14199U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tf5.m14515b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m14207i1(ye5 ye5Var) {
        this.f12937t = ye5Var;
    }

    @Override // p007l.s1m.InterfaceC2480a
    /* JADX INFO: renamed from: a */
    public void mo14001a(String str) {
        lsi0.h(R$string.f414P1);
        this.f12932o.f1668c.m3072L();
        mo13823k(false);
    }

    public Act act() {
        return this.f12933p;
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: b */
    public long mo13819b() {
        return this.f12932o.f1668c.getLastDuration();
    }

    /* JADX INFO: renamed from: b0 */
    public void m14201b0() {
        if (this.f12934q == null) {
            m14202c0();
            return;
        }
        d30 d30Var = new d30() { // from class: l.af5
            public final void call() {
                this.f5730a.m14210n0();
            }
        };
        if (this.f12932o.f1668c.getCount() == 0) {
            m14166Q0(act().getString(R$string.f591q0), new d30() { // from class: l.jf5
                public final void call() {
                    this.f9332a.m14209m0();
                }
            });
        } else {
            m14166Q0(act().getString(R$string.f341D0), d30Var);
        }
    }

    @Override // p007l.s1m.InterfaceC2480a
    /* JADX INFO: renamed from: c */
    public void mo14002c(String str, boolean z) {
        if (this.f12932o.f1668c.m3074N() < 3000) {
            lsi0.h(R$string.f329B0);
            return;
        }
        Video video = new Video(0, str);
        ebl0.m9703c(video);
        this.f12936s.s4();
        if (z && NullChecker.a(this.f12916J)) {
            this.f12916J.call(m14179d0(video));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m14202c0() {
        Act act = act();
        if (!NullChecker.b(act) || act.isFinishing()) {
            return;
        }
        act.finish();
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo13820d() {
        return this.f12918a.getHolder();
    }

    public void destroy() {
        FeedComicFacePropMenuView feedComicFacePropMenuView = this.f12938u;
        if (feedComicFacePropMenuView != null) {
            feedComicFacePropMenuView.m3124D();
        }
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: e */
    public void mo13821e() {
        if (this.f12940w != 100) {
            this.f12932o.f1668c.m3072L();
        }
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: f */
    public void mo12940f(View view) {
        m14166Q0(act().getString(R$string.f323A0), new d30() { // from class: l.qf5
            public final void call() {
                this.f12222a.m14214r0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public long m14203f0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: g0 */
    public long m14204g0() {
        return this.f12932o.f1668c.m3074N();
    }

    @Override // p007l.r1m
    public int getCount() {
        return this.f12932o.f1668c.getCount();
    }

    /* JADX INFO: renamed from: h0 */
    public void m14205h0(List<CameraCategory> list) {
        this.f12932o.setVisibility(0);
        this.f12932o.setCancel(new d30() { // from class: l.ff5
            public final void call() {
                this.f8080a.m14211o0();
            }
        });
        this.f12932o.setOnPropSelect(new g30() { // from class: l.gf5
            /* JADX INFO: renamed from: a */
            public final void m10489a(Object obj, Object obj2, Object obj3) {
                this.f8438a.m14212p0((Integer) obj, (CameraSticker) obj2, (Boolean) obj3);
            }
        });
        this.f12932o.setDelete(new d30() { // from class: l.hf5
            public final void call() {
                this.f8688a.m14213q0();
            }
        });
        this.f12932o.setStateListener(new C2485b());
        this.f12932o.setCategoryData(list);
    }

    /* JADX INFO: renamed from: i0 */
    public void m14206i0(Bundle bundle) {
        this.f12909C = new VideoInfo();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM14199U = m14199U(layoutInflater, viewGroup);
        m14197O0();
        m14208j0();
        return viewM14199U;
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: j */
    public int mo13822j() {
        return this.f12941x;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m14208j0() {
        xdl0.z(this.f12927j);
        if (NullChecker.a(this.f12935r)) {
            this.f12927j.setText(this.f12935r.name);
        }
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: k */
    public void mo13823k(boolean z) {
        this.f12936s.s4();
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: l */
    public void mo13824l() {
        this.f12936s.q4(act().getString(R$string.f599r2), true);
    }

    @Override // p007l.hxl
    /* JADX INFO: renamed from: m */
    public void mo10753m() {
        xdl0.M(this.f12930m, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m14209m0() {
        this.f12934q.mo13986F();
        this.f12934q.release();
        m14202c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m14210n0() {
        xdl0.M0(this.f12925h, true);
        m14173U0(true);
        this.f12934q.mo13986F();
        this.f12932o.m3126F();
        this.f12912F.clear();
        this.f12934q.mo13984D(false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m14211o0() {
        this.f12917K = null;
        yb4.m17102c().m17114m(null);
        this.f12934q.mo11048T();
        this.f12934q.mo11038B();
        this.f12934q.mo11054t();
    }

    @Override // p007l.s1m.InterfaceC2480a
    public void onError(final int i, final int i2) {
        e51.M(new Runnable() { // from class: l.ef5
            @Override // java.lang.Runnable
            public final void run() {
                this.f7339a.m14215s0(i, i2);
            }
        });
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: p */
    public boolean mo12942p() {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m14212p0(Integer num, CameraSticker cameraSticker, Boolean bool) {
        this.f12917K = cameraSticker;
        yb4.m17102c().m17114m(cameraSticker);
        if (bool.booleanValue()) {
            zvf0.u("e_camera_video_sticker", "p_camera_video", new j760[]{new j760("event_type", "MC"), new j760("sticker_id", cameraSticker.f680id)});
        }
        if (cameraSticker.hasModelFile) {
            m14198P0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m14213q0() {
        mo12940f(this.f12932o);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m14214r0() {
        this.f12932o.f1668c.m3071K();
        m14162N0();
        this.f12934q.removeLast();
        if (this.f12932o.f1668c.getCount() <= 0) {
            this.f12934q.mo13984D(false);
            this.f12940w = 100;
            this.f12932o.m3128H(100);
        }
    }

    @Override // p007l.r1m
    public void removeLast() {
        this.f12932o.f1668c.m3071K();
        if (this.f12932o.f1668c.getCount() <= 0) {
            this.f12932o.f1668c.m3072L();
            this.f12934q.mo13984D(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m14215s0(int i, int i2) {
        if (i == -302) {
            m14174W();
            lsi0.h(R$string.f432S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m14174W();
            lsi0.h(R$string.f420Q1);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m14216t0(View view) {
        if (this.f12940w == 101) {
            return;
        }
        if (view == this.f12924g) {
            m14201b0();
        } else if (view == this.f12929l) {
            this.f12934q.mo11050f();
        }
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: u */
    public boolean mo13826u() {
        return m14204g0() >= 3000 || Math.abs(m14204g0() - 3000) < 900;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m14217u0(View view) {
        if (view == this.f12925h && this.f12940w == 100) {
            this.f12936s.startActivityForResult(new Intent((Context) act(), (Class<?>) MusicCenterAct.class), 1001);
            act().overridePendingTransition(uzb0.f13995i, uzb0.f13993g);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m14218v0(Bundle bundle) {
        this.f12936s.startActivity(VideoEditAct.m2168X1(act(), bundle));
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m14219w0(final Bundle bundle) {
        m14158L0(new Runnable() { // from class: l.if5
            @Override // java.lang.Runnable
            public final void run() {
                this.f9003a.m14218v0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m14220x0(final Bundle bundle) {
        e51.M(new Runnable() { // from class: l.df5
            @Override // java.lang.Runnable
            public final void run() {
                this.f6907a.m14219w0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m14221y0(View view) {
        this.f12914H.call(view);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m14222z0(View view) {
        this.f12914H.call(view);
    }

    @Override // p007l.r1m
    public void onFirstFrameRendered() {
    }

    /* JADX INFO: renamed from: l.sf5$a */
    public class SurfaceHolderCallbackC2484a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC2484a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            sf5.this.f12910D = i2;
            sf5.this.f12911E = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: i */
    public void mo12941i(View view) {
    }

    @Override // p007l.p84
    public void onStateChanged(int i) {
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: v */
    public void mo12943v(View view) {
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: q */
    public void mo13825q(String str, Exception exc) {
    }

    @Override // p007l.hxl
    /* JADX INFO: renamed from: s */
    public void mo10754s(float f, int i) {
    }
}
