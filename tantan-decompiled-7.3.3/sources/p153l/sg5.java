package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderFrag;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class sg5 implements iam<yf5>, a0m, o94 {

    /* JADX INFO: renamed from: C */
    public VideoInfo f167797C;

    /* JADX INFO: renamed from: D */
    public int f167798D;

    /* JADX INFO: renamed from: E */
    public int f167799E;

    /* JADX INFO: renamed from: H */
    public y20<View> f167802H;

    /* JADX INFO: renamed from: I */
    public y20<View> f167803I;

    /* JADX INFO: renamed from: J */
    public y20<Bundle> f167804J;

    /* JADX INFO: renamed from: K */
    public CameraSticker f167805K;

    /* JADX INFO: renamed from: a */
    public SurfaceView f167806a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f167807b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f167808c;

    /* JADX INFO: renamed from: d */
    public TextView f167809d;

    /* JADX INFO: renamed from: e */
    public ImageView f167810e;

    /* JADX INFO: renamed from: f */
    public TextView f167811f;

    /* JADX INFO: renamed from: g */
    public ImageView f167812g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f167813h;

    /* JADX INFO: renamed from: i */
    public ImageView f167814i;

    /* JADX INFO: renamed from: j */
    public TextView f167815j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f167816k;

    /* JADX INFO: renamed from: l */
    public CameraMenuView f167817l;

    /* JADX INFO: renamed from: m */
    public CameraMenuView f167818m;

    /* JADX INFO: renamed from: n */
    public ViewStub f167819n;

    /* JADX INFO: renamed from: o */
    public FeedComicFacePropMenuView f167820o;

    /* JADX INFO: renamed from: p */
    public Context f167821p;

    /* JADX INFO: renamed from: q */
    public b0m f167822q;

    /* JADX INFO: renamed from: r */
    public MusicContent f167823r;

    /* JADX INFO: renamed from: s */
    public ComicFaceRecorderFrag f167824s;

    /* JADX INFO: renamed from: t */
    public yf5 f167825t;

    /* JADX INFO: renamed from: u */
    public FeedComicFacePropMenuView f167826u;

    /* JADX INFO: renamed from: v */
    public th0 f167827v;

    /* JADX INFO: renamed from: w */
    public int f167828w = 1;

    /* JADX INFO: renamed from: x */
    public int f167829x = 0;

    /* JADX INFO: renamed from: y */
    public int f167830y = 0;

    /* JADX INFO: renamed from: z */
    public boolean f167831z = true;

    /* JADX INFO: renamed from: A */
    public boolean f167795A = true;

    /* JADX INFO: renamed from: B */
    public boolean f167796B = false;

    /* JADX INFO: renamed from: F */
    public ArrayList<MediaMeta> f167800F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public jxd0 f167801G = new jxd0("comic_face_recorder_need_show_tip" + FeedModule.m61405F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l.sg5$b */
    public class C20039b implements FeedCircleProgressBar.InterfaceC11367b {
        public C20039b() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11367b
        /* JADX INFO: renamed from: a */
        public void mo63297a(int i) {
            sg5.this.f167828w = i;
            if (i == 100) {
                bnl0.m105525M0(sg5.this.f167816k, true);
                bnl0.m105525M0(sg5.this.f167813h, true);
                bnl0.m105525M0(sg5.this.f167812g, true);
                return;
            }
            if (i == 103) {
                if (sg5.this.f167820o.f41055c.m63275N() < sg5.this.m185748f0()) {
                    o1j0.m165634h(R$string.f39716B0);
                    return;
                }
                bnl0.m105525M0(sg5.this.f167816k, true);
                bnl0.m105525M0(sg5.this.f167812g, true);
                sg5.this.f167822q.mo152796O();
                return;
            }
            if (i != 102) {
                if (i == 101) {
                    bnl0.m105525M0(sg5.this.f167813h, false);
                    bnl0.m105525M0(sg5.this.f167816k, false);
                    bnl0.m105525M0(sg5.this.f167812g, false);
                    sg5.this.m185716S0();
                    return;
                }
                return;
            }
            bnl0.m105525M0(sg5.this.f167816k, true);
            bnl0.m105525M0(sg5.this.f167812g, true);
            int count = sg5.this.f167820o.f41055c.getCount();
            sg5 sg5Var = sg5.this;
            if (count == 0) {
                bnl0.m105525M0(sg5Var.f167813h, true);
            } else {
                bnl0.m105525M0(sg5Var.f167813h, false);
            }
            sg5.this.m185719U0(true);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11367b
        public void onEvent(int i, int i2) {
            if (i == 106) {
                bnl0.m105525M0(sg5.this.f167813h, true);
                bnl0.m105525M0(sg5.this.f167812g, true);
                bnl0.m105525M0(sg5.this.f167817l, true);
                sg5.this.f167828w = 100;
                return;
            }
            if (i == 105 || i == 104 || i != 107) {
                return;
            }
            if (sg5.this.f167820o.f41055c.m63275N() < sg5.this.m185748f0()) {
                o1j0.m165634h(R$string.f39716B0);
                return;
            }
            bnl0.m105525M0(sg5.this.f167816k, true);
            bnl0.m105525M0(sg5.this.f167812g, true);
            sg5.this.f167822q.mo152796O();
        }
    }

    public sg5(ComicFaceRecorderFrag comicFaceRecorderFrag) {
        this.f167824s = comicFaceRecorderFrag;
        this.f167821p = comicFaceRecorderFrag.getActivity();
    }

    /* JADX INFO: renamed from: K0 */
    private void m185702K0() {
        m185719U0(false);
        mo148263k(false);
        this.f167822q.mo152796O();
    }

    /* JADX INFO: renamed from: L0 */
    private void m185704L0(Runnable runnable) {
        Animator animatorM132170p = gt0.m132170p(this.f167816k, "translationX", 0L, 100L, new LinearInterpolator(), 0.0f, qa00.m175859d(60.0f));
        gt0.m132160f(animatorM132170p, runnable);
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: M0 */
    private void m185706M0() {
        this.f167800F.add(m185724a0());
    }

    /* JADX INFO: renamed from: N0 */
    private void m185708N0() {
        if (this.f167800F.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f167800F;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m185712Q0(String str, final x20 x20Var) {
        th0 th0VarM191142a = new th0.C20312a(this.f167824s.act()).m191148g(false).m191151j(str).m191146e(R$string.f39993s3).m191158q(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.bg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191156o(new View.OnClickListener() { // from class: l.cg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81631a.m185736D0(view);
            }
        }).m191142a();
        this.f167827v = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: R0 */
    private void m185714R0() {
        boolean z;
        boolean zPrepare;
        try {
            zPrepare = this.f167822q.prepare();
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
            CrashHelper.m82479c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zPrepare = false;
        }
        if (zPrepare) {
            this.f167822q.mo152799g();
        } else {
            o1j0.m165636j("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m185716S0() {
        CameraSticker cameraSticker = this.f167805K;
        i4g0.m138523u("e_kankan_post_shoot", "p_camera_video", new pf60("shoot_type", "immersion_cartoon_effects"), new pf60("event_type", "MC"), new pf60("sticker_id", cameraSticker != null ? cameraSticker.f40067id : "0"));
        this.f167801G.put(Boolean.FALSE);
        if (this.f167822q.mo152800h()) {
            return;
        }
        m185721X();
    }

    /* JADX INFO: renamed from: T0 */
    private void m185718T0() {
        this.f167822q.mo152806y(1.0f);
        this.f167822q.mo152801i();
        if (!this.f167796B) {
            m185706M0();
        } else {
            m185719U0(true);
            this.f167796B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public boolean m185719U0(boolean z) {
        if (this.f167822q.mo152800h()) {
            return this.f167822q.mo152793I(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    private void m185720W() {
        this.f167796B = true;
        this.f167822q.mo152802j();
        mo148263k(false);
    }

    /* JADX INFO: renamed from: X */
    private void m185721X() {
        if (this.f167820o.f41055c.m63275N() >= m185726e0()) {
            m185702K0();
        } else {
            m185718T0();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m185722Y() {
        if (PermissionHelper.m81064b(wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m185747c0();
    }

    /* JADX INFO: renamed from: Z */
    private void m185723Z() {
        CameraSticker cameraSticker = this.f167805K;
        if (cameraSticker != null && cameraSticker.hasModelFile) {
            m185743P0();
        }
        if (this.f167824s.isResumed()) {
            this.f167825t.m215523k0();
            if (this.f167828w != 102) {
                this.f167828w = 100;
            }
            Act act = getAct();
            if (!NullChecker.m82487b(act) || act.isFinishing()) {
                return;
            }
            m185714R0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    private MediaMeta m185724a0() {
        CameraSticker cameraStickerM210118e = xc4.m210114c().m210118e();
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m185728l0() ? "front" : "back";
        if (cameraStickerM210118e != null) {
            mediaMeta.sticker = cameraStickerM210118e.f40067id;
        }
        return mediaMeta;
    }

    /* JADX INFO: renamed from: d0 */
    private Bundle m185725d0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f167797C == null) {
            this.f167797C = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = true;
        qow qowVarMo152795K = this.f167822q.mo152795K();
        if (NullChecker.m82486a(qowVarMo152795K)) {
            video.rotate = qowVarMo152795K.m177370v();
        }
        MusicContent musicContentMo101328z = this.f167822q.mo101328z();
        video.isFrontCamera = this.f167822q.mo152798e();
        if (NullChecker.m82486a(musicContentMo101328z)) {
            video.playingMusic = musicContentMo101328z;
        }
        VideoInfo videoInfo = this.f167797C;
        videoInfo.autoMusic = false;
        int i = this.f167828w;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f167829x;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        this.f167797C.maxDuration = m185726e0();
        VideoInfo videoInfo2 = this.f167797C;
        MusicContent musicContent = this.f167823r;
        videoInfo2.hasOriginalSound = musicContent == null;
        videoInfo2.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f167800F);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f167797C);
        bundle.putBoolean("key_is_change_speed", false);
        bundle.putString("extra_from", "immersion_cartoon_effects");
        return bundle;
    }

    /* JADX INFO: renamed from: e0 */
    private long m185726e0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: k0 */
    private void m185727k0() {
        vwv vwvVar = new vwv();
        this.f167822q = vwvVar;
        vwvVar.mo152797a(getAct(), this);
        if (NullChecker.m82486a(this.f167823r)) {
            this.f167822q.mo101327x(this.f167823r);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m185728l0() {
        return this.f167822q.mo152798e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m185734A0(View view) {
        this.f167803I.call(view);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m185735B0(g6x g6xVar) {
        this.f167822q.mo101306A(g6xVar);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f167821p;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m185736D0(View view) {
        this.f167827v.m191137c();
    }

    /* JADX INFO: renamed from: E0 */
    public void m185737E0() {
        m185722Y();
        bnl0.m105524M(this.f167813h, true);
        m185727k0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m185738G0() {
        if (uc4.m195359i()) {
            this.f167822q.release();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m185739H0() {
        if (this.f167828w == 101) {
            this.f167828w = 102;
            this.f167820o.m63329H(102);
        }
        this.f167822q.onPause();
    }

    /* JADX INFO: renamed from: I0 */
    public void m185740I0() {
        if (this.f167816k.getTranslationX() != 0.0f) {
            this.f167816k.setTranslationX(0.0f);
        }
        m185723Z();
    }

    /* JADX INFO: renamed from: J0 */
    public void m185741J0(MusicContent musicContent) {
        this.f167823r = musicContent;
        VideoInfo videoInfo = this.f167797C;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m82486a(musicContent)) {
            this.f167815j.setText(musicContent.name);
        }
        this.f167822q.mo101327x(musicContent);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m185742O0() {
        this.f167806a.getHolder().addCallback(new SurfaceHolderCallbackC20038a());
        this.f167802H = dmk0.m116962a(500, new y20() { // from class: l.kg5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126574a.m185760t0((View) obj);
            }
        });
        this.f167803I = dmk0.m116962a(1000, new y20() { // from class: l.lg5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131930a.m185761u0((View) obj);
            }
        });
        this.f167804J = dmk0.m116962a(500, new y20() { // from class: l.mg5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136694a.m185764x0((Bundle) obj);
            }
        });
        this.f167812g.setOnClickListener(new View.OnClickListener() { // from class: l.ng5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141790a.m185765y0(view);
            }
        });
        this.f167817l.setOnClickListener(new View.OnClickListener() { // from class: l.og5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147192a.m185766z0(view);
            }
        });
        this.f167813h.setOnClickListener(new View.OnClickListener() { // from class: l.pg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152234a.m185734A0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final void m185743P0() {
        final g6x g6xVarM205969a = wdl0.m205969a(getContext(), new File(this.f167805K.modelFilePath));
        if (NullChecker.m82487b(g6xVarM205969a)) {
            l51.m152888H(this.f167821p, new Runnable() { // from class: l.rg5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162904a.m185735B0(g6xVarM205969a);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: U */
    public View m185744U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tg5.m191015b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yf5 yf5Var) {
        this.f167825t = yf5Var;
    }

    @Override // p153l.l4m.InterfaceC18346a
    /* JADX INFO: renamed from: a */
    public void mo152807a(String str) {
        o1j0.m165634h(R$string.f39801P1);
        this.f167820o.f41055c.m63273L();
        mo148263k(false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) this.f167821p;
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: b */
    public long mo148259b() {
        return this.f167820o.f41055c.getLastDuration();
    }

    /* JADX INFO: renamed from: b0 */
    public void m185746b0() {
        if (this.f167822q == null) {
            m185747c0();
            return;
        }
        x20 x20Var = new x20() { // from class: l.ag5
            @Override // p153l.x20
            public final void call() {
                this.f71084a.m185754n0();
            }
        };
        if (this.f167820o.f41055c.getCount() == 0) {
            m185712Q0(getAct().getString(R$string.f39978q0), new x20() { // from class: l.jg5
                @Override // p153l.x20
                public final void call() {
                    this.f120670a.m185753m0();
                }
            });
        } else {
            m185712Q0(getAct().getString(R$string.f39728D0), x20Var);
        }
    }

    @Override // p153l.l4m.InterfaceC18346a
    /* JADX INFO: renamed from: c */
    public void mo152808c(String str, boolean z) {
        if (this.f167820o.f41055c.m63275N() < 3000) {
            o1j0.m165634h(R$string.f39716B0);
            return;
        }
        Video video = new Video(0, str);
        ikl0.m140411c(video);
        this.f167824s.m21598s4();
        if (z && NullChecker.m82486a(this.f167804J)) {
            this.f167804J.call(m185725d0(video));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m185747c0() {
        Act act = getAct();
        if (!NullChecker.m82487b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo148260d() {
        return this.f167806a.getHolder();
    }

    @Override // p153l.iam
    public void destroy() {
        FeedComicFacePropMenuView feedComicFacePropMenuView = this.f167826u;
        if (feedComicFacePropMenuView != null) {
            feedComicFacePropMenuView.m63325D();
        }
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: e */
    public void mo148261e() {
        if (this.f167828w != 100) {
            this.f167820o.f41055c.m63273L();
        }
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: f */
    public void mo166672f(View view) {
        m185712Q0(getAct().getString(R$string.f39710A0), new x20() { // from class: l.qg5
            @Override // p153l.x20
            public final void call() {
                this.f157382a.m185758r0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public long m185748f0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: g0 */
    public long m185749g0() {
        return this.f167820o.f41055c.m63275N();
    }

    @Override // p153l.k4m
    public int getCount() {
        return this.f167820o.f41055c.getCount();
    }

    /* JADX INFO: renamed from: h0 */
    public void m185750h0(List<CameraCategory> list) {
        this.f167820o.setVisibility(0);
        this.f167820o.setCancel(new x20() { // from class: l.fg5
            @Override // p153l.x20
            public final void call() {
                this.f98886a.m185755o0();
            }
        });
        this.f167820o.setOnPropSelect(new a30() { // from class: l.gg5
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f103992a.m185756p0((Integer) obj, (CameraSticker) obj2, (Boolean) obj3);
            }
        });
        this.f167820o.setDelete(new x20() { // from class: l.hg5
            @Override // p153l.x20
            public final void call() {
                this.f109368a.m185757q0();
            }
        });
        this.f167820o.setStateListener(new C20039b());
        this.f167820o.setCategoryData(list);
    }

    /* JADX INFO: renamed from: i0 */
    public void m185751i0(Bundle bundle) {
        this.f167797C = new VideoInfo();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM185744U = m185744U(layoutInflater, viewGroup);
        m185742O0();
        m185752j0();
        return viewM185744U;
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: j */
    public int mo148262j() {
        return this.f167829x;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m185752j0() {
        bnl0.m105593z(this.f167815j);
        if (NullChecker.m82486a(this.f167823r)) {
            this.f167815j.setText(this.f167823r.name);
        }
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: k */
    public void mo148263k(boolean z) {
        this.f167824s.m21598s4();
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: l */
    public void mo148264l() {
        this.f167824s.m21596q4(getAct().getString(R$string.f39986r2), true);
    }

    @Override // p153l.a0m
    /* JADX INFO: renamed from: m */
    public void mo95404m() {
        bnl0.m105524M(this.f167818m, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m185753m0() {
        this.f167822q.mo152792F();
        this.f167822q.release();
        m185747c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m185754n0() {
        bnl0.m105525M0(this.f167813h, true);
        m185719U0(true);
        this.f167822q.mo152792F();
        this.f167820o.m63327F();
        this.f167800F.clear();
        this.f167822q.mo152790D(false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m185755o0() {
        this.f167805K = null;
        xc4.m210114c().m210126m(null);
        this.f167822q.mo101317T();
        this.f167822q.mo101307B();
        this.f167822q.mo101323t();
    }

    @Override // p153l.l4m.InterfaceC18346a
    public void onError(final int i, final int i2) {
        l51.m152893M(new Runnable() { // from class: l.eg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f93901a.m185759s0(i, i2);
            }
        });
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: p */
    public boolean mo166674p() {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m185756p0(Integer num, CameraSticker cameraSticker, Boolean bool) {
        this.f167805K = cameraSticker;
        xc4.m210114c().m210126m(cameraSticker);
        if (bool.booleanValue()) {
            i4g0.m138523u("e_camera_video_sticker", "p_camera_video", new pf60("event_type", "MC"), new pf60("sticker_id", cameraSticker.f40067id));
        }
        if (cameraSticker.hasModelFile) {
            m185743P0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m185757q0() {
        mo166672f(this.f167820o);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m185758r0() {
        this.f167820o.f41055c.m63272K();
        m185708N0();
        this.f167822q.removeLast();
        if (this.f167820o.f41055c.getCount() <= 0) {
            this.f167822q.mo152790D(false);
            this.f167828w = 100;
            this.f167820o.m63329H(100);
        }
    }

    @Override // p153l.k4m
    public void removeLast() {
        this.f167820o.f41055c.m63272K();
        if (this.f167820o.f41055c.getCount() <= 0) {
            this.f167820o.f41055c.m63273L();
            this.f167822q.mo152790D(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m185759s0(int i, int i2) {
        if (i == -302) {
            m185720W();
            o1j0.m165634h(R$string.f39819S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m185720W();
            o1j0.m165634h(R$string.f39807Q1);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m185760t0(View view) {
        if (this.f167828w == 101) {
            return;
        }
        if (view == this.f167812g) {
            m185746b0();
        } else if (view == this.f167817l) {
            this.f167822q.mo101319f();
        }
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: u */
    public boolean mo148266u() {
        return m185749g0() >= 3000 || Math.abs(m185749g0() - 3000) < 900;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m185761u0(View view) {
        if (view == this.f167813h && this.f167828w == 100) {
            this.f167824s.startActivityForResult(new Intent(getAct(), (Class<?>) MusicCenterAct.class), 1001);
            getAct().overridePendingTransition(a8c0.f68909i, a8c0.f68907g);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m185762v0(Bundle bundle) {
        this.f167824s.startActivity(VideoEditAct.m62416Y1(getAct(), bundle));
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m185763w0(final Bundle bundle) {
        m185704L0(new Runnable() { // from class: l.ig5
            @Override // java.lang.Runnable
            public final void run() {
                this.f114745a.m185762v0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m185764x0(final Bundle bundle) {
        l51.m152893M(new Runnable() { // from class: l.dg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f88259a.m185763w0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m185765y0(View view) {
        this.f167802H.call(view);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m185766z0(View view) {
        this.f167802H.call(view);
    }

    @Override // p153l.k4m
    public void onFirstFrameRendered() {
    }

    /* JADX INFO: renamed from: l.sg5$a */
    public class SurfaceHolderCallbackC20038a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC20038a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            sg5.this.f167798D = i2;
            sg5.this.f167799E = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: i */
    public void mo166673i(View view) {
    }

    @Override // p153l.o94
    public void onStateChanged(int i) {
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: v */
    public void mo166675v(View view) {
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: q */
    public void mo148265q(String str, Exception exc) {
    }

    @Override // p153l.a0m
    /* JADX INFO: renamed from: s */
    public void mo95405s(float f, int i) {
    }
}
