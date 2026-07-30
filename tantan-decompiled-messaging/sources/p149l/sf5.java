package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderFrag;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sf5 implements s7m<ye5>, hxl, p84 {

    /* JADX INFO: renamed from: C */
    public VideoInfo f164206C;

    /* JADX INFO: renamed from: D */
    public int f164207D;

    /* JADX INFO: renamed from: E */
    public int f164208E;

    /* JADX INFO: renamed from: H */
    public e30<View> f164211H;

    /* JADX INFO: renamed from: I */
    public e30<View> f164212I;

    /* JADX INFO: renamed from: J */
    public e30<Bundle> f164213J;

    /* JADX INFO: renamed from: K */
    public CameraSticker f164214K;

    /* JADX INFO: renamed from: a */
    public SurfaceView f164215a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f164216b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f164217c;

    /* JADX INFO: renamed from: d */
    public TextView f164218d;

    /* JADX INFO: renamed from: e */
    public ImageView f164219e;

    /* JADX INFO: renamed from: f */
    public TextView f164220f;

    /* JADX INFO: renamed from: g */
    public ImageView f164221g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f164222h;

    /* JADX INFO: renamed from: i */
    public ImageView f164223i;

    /* JADX INFO: renamed from: j */
    public TextView f164224j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f164225k;

    /* JADX INFO: renamed from: l */
    public CameraMenuView f164226l;

    /* JADX INFO: renamed from: m */
    public CameraMenuView f164227m;

    /* JADX INFO: renamed from: n */
    public ViewStub f164228n;

    /* JADX INFO: renamed from: o */
    public FeedComicFacePropMenuView f164229o;

    /* JADX INFO: renamed from: p */
    public Context f164230p;

    /* JADX INFO: renamed from: q */
    public ixl f164231q;

    /* JADX INFO: renamed from: r */
    public MusicContent f164232r;

    /* JADX INFO: renamed from: s */
    public ComicFaceRecorderFrag f164233s;

    /* JADX INFO: renamed from: t */
    public ye5 f164234t;

    /* JADX INFO: renamed from: u */
    public FeedComicFacePropMenuView f164235u;

    /* JADX INFO: renamed from: v */
    public xh0 f164236v;

    /* JADX INFO: renamed from: w */
    public int f164237w = 1;

    /* JADX INFO: renamed from: x */
    public int f164238x = 0;

    /* JADX INFO: renamed from: y */
    public int f164239y = 0;

    /* JADX INFO: renamed from: z */
    public boolean f164240z = true;

    /* JADX INFO: renamed from: A */
    public boolean f164204A = true;

    /* JADX INFO: renamed from: B */
    public boolean f164205B = false;

    /* JADX INFO: renamed from: F */
    public ArrayList<MediaMeta> f164209F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public hpd0 f164210G = new hpd0("comic_face_recorder_need_show_tip" + FeedModule.m60221F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: l.sf5$b */
    public class C19931b implements FeedCircleProgressBar.InterfaceC11204b {
        public C19931b() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11204b
        /* JADX INFO: renamed from: a */
        public void mo62114a(int i) {
            sf5.this.f164237w = i;
            if (i == 100) {
                xdl0.m208345M0(sf5.this.f164225k, true);
                xdl0.m208345M0(sf5.this.f164222h, true);
                xdl0.m208345M0(sf5.this.f164221g, true);
                return;
            }
            if (i == 103) {
                if (sf5.this.f164229o.f40207c.m62092N() < sf5.this.m183851f0()) {
                    lsi0.m151578h(R$string.f38868B0);
                    return;
                }
                xdl0.m208345M0(sf5.this.f164225k, true);
                xdl0.m208345M0(sf5.this.f164221g, true);
                sf5.this.f164231q.mo181992O();
                return;
            }
            if (i != 102) {
                if (i == 101) {
                    xdl0.m208345M0(sf5.this.f164222h, false);
                    xdl0.m208345M0(sf5.this.f164225k, false);
                    xdl0.m208345M0(sf5.this.f164221g, false);
                    sf5.this.m183819S0();
                    return;
                }
                return;
            }
            xdl0.m208345M0(sf5.this.f164225k, true);
            xdl0.m208345M0(sf5.this.f164221g, true);
            int count = sf5.this.f164229o.f40207c.getCount();
            sf5 sf5Var = sf5.this;
            if (count == 0) {
                xdl0.m208345M0(sf5Var.f164222h, true);
            } else {
                xdl0.m208345M0(sf5Var.f164222h, false);
            }
            sf5.this.m183822U0(true);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar.InterfaceC11204b
        public void onEvent(int i, int i2) {
            if (i == 106) {
                xdl0.m208345M0(sf5.this.f164222h, true);
                xdl0.m208345M0(sf5.this.f164221g, true);
                xdl0.m208345M0(sf5.this.f164226l, true);
                sf5.this.f164237w = 100;
                return;
            }
            if (i == 105 || i == 104 || i != 107) {
                return;
            }
            if (sf5.this.f164229o.f40207c.m62092N() < sf5.this.m183851f0()) {
                lsi0.m151578h(R$string.f38868B0);
                return;
            }
            xdl0.m208345M0(sf5.this.f164225k, true);
            xdl0.m208345M0(sf5.this.f164221g, true);
            sf5.this.f164231q.mo181992O();
        }
    }

    public sf5(ComicFaceRecorderFrag comicFaceRecorderFrag) {
        this.f164233s = comicFaceRecorderFrag;
        this.f164230p = comicFaceRecorderFrag.getActivity();
    }

    /* JADX INFO: renamed from: K0 */
    private void m183805K0() {
        m183822U0(false);
        mo177483k(false);
        this.f164231q.mo181992O();
    }

    /* JADX INFO: renamed from: L0 */
    private void m183807L0(Runnable runnable) {
        Animator animatorM103743p = bt0.m103743p(this.f164225k, "translationX", 0L, 100L, new LinearInterpolator(), 0.0f, t100.m186890d(60.0f));
        bt0.m103733f(animatorM103743p, runnable);
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: M0 */
    private void m183809M0() {
        this.f164209F.add(m183827a0());
    }

    /* JADX INFO: renamed from: N0 */
    private void m183811N0() {
        if (this.f164209F.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f164209F;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m183815Q0(String str, final d30 d30Var) {
        xh0 xh0VarM208722a = new xh0.C21150a(this.f164233s.act()).m208728g(false).m208731j(str).m208726e(R$string.f39145s3).m208738q(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.bf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208736o(new View.OnClickListener() { // from class: l.cf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80537a.m183839D0(view);
            }
        }).m208722a();
        this.f164236v = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: R0 */
    private void m183817R0() {
        boolean z;
        boolean zPrepare;
        try {
            zPrepare = this.f164231q.prepare();
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
            CrashHelper.m81296c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zPrepare = false;
        }
        if (zPrepare) {
            this.f164231q.mo181995g();
        } else {
            lsi0.m151580j("相机打开失败，请检查系统相机是否可用");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m183819S0() {
        CameraSticker cameraSticker = this.f164214K;
        zvf0.m220399u("e_kankan_post_shoot", "p_camera_video", new j760("shoot_type", "immersion_cartoon_effects"), new j760("event_type", "MC"), new j760("sticker_id", cameraSticker != null ? cameraSticker.f39219id : "0"));
        this.f164210G.put(Boolean.FALSE);
        if (this.f164231q.mo181996h()) {
            return;
        }
        m183824X();
    }

    /* JADX INFO: renamed from: T0 */
    private void m183821T0() {
        this.f164231q.mo182002y(1.0f);
        this.f164231q.mo181997i();
        if (!this.f164205B) {
            m183809M0();
        } else {
            m183822U0(true);
            this.f164205B = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public boolean m183822U0(boolean z) {
        if (this.f164231q.mo181996h()) {
            return this.f164231q.mo181989I(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    private void m183823W() {
        this.f164205B = true;
        this.f164231q.mo181998j();
        mo177483k(false);
    }

    /* JADX INFO: renamed from: X */
    private void m183824X() {
        if (this.f164229o.f40207c.m62092N() >= m183829e0()) {
            m183805K0();
        } else {
            m183821T0();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m183825Y() {
        if (PermissionHelper.m79881b(zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m183850c0();
    }

    /* JADX INFO: renamed from: Z */
    private void m183826Z() {
        CameraSticker cameraSticker = this.f164214K;
        if (cameraSticker != null && cameraSticker.hasModelFile) {
            m183846P0();
        }
        if (this.f164233s.isResumed()) {
            this.f164234t.m214341k0();
            if (this.f164237w != 102) {
                this.f164237w = 100;
            }
            Act act = getAct();
            if (!NullChecker.m81304b(act) || act.isFinishing()) {
                return;
            }
            m183817R0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    private MediaMeta m183827a0() {
        CameraSticker cameraStickerM213940e = yb4.m213936c().m213940e();
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m183831l0() ? "front" : "back";
        if (cameraStickerM213940e != null) {
            mediaMeta.sticker = cameraStickerM213940e.f39219id;
        }
        return mediaMeta;
    }

    /* JADX INFO: renamed from: d0 */
    private Bundle m183828d0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f164206C == null) {
            this.f164206C = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = true;
        rlw rlwVarMo181991K = this.f164231q.mo181991K();
        if (NullChecker.m81303a(rlwVarMo181991K)) {
            video.rotate = rlwVarMo181991K.m179930v();
        }
        MusicContent musicContentMo138873z = this.f164231q.mo138873z();
        video.isFrontCamera = this.f164231q.mo181994e();
        if (NullChecker.m81303a(musicContentMo138873z)) {
            video.playingMusic = musicContentMo138873z;
        }
        VideoInfo videoInfo = this.f164206C;
        videoInfo.autoMusic = false;
        int i = this.f164237w;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f164238x;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        this.f164206C.maxDuration = m183829e0();
        VideoInfo videoInfo2 = this.f164206C;
        MusicContent musicContent = this.f164232r;
        videoInfo2.hasOriginalSound = musicContent == null;
        videoInfo2.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f164209F);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f164206C);
        bundle.putBoolean("key_is_change_speed", false);
        bundle.putString("extra_from", "immersion_cartoon_effects");
        return bundle;
    }

    /* JADX INFO: renamed from: e0 */
    private long m183829e0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: k0 */
    private void m183830k0() {
        uuv uuvVar = new uuv();
        this.f164231q = uuvVar;
        uuvVar.mo181993a(getAct(), this);
        if (NullChecker.m81303a(this.f164232r)) {
            this.f164231q.mo138872x(this.f164232r);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m183831l0() {
        return this.f164231q.mo181994e();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m183837A0(View view) {
        this.f164212I.call(view);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m183838B0(h3x h3xVar) {
        this.f164231q.mo138851A(h3xVar);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f164230p;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m183839D0(View view) {
        this.f164236v.m208717c();
    }

    /* JADX INFO: renamed from: E0 */
    public void m183840E0() {
        m183825Y();
        xdl0.m208344M(this.f164222h, true);
        m183830k0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m183841G0() {
        if (vb4.m197675i()) {
            this.f164231q.release();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m183842H0() {
        if (this.f164237w == 101) {
            this.f164237w = 102;
            this.f164229o.m62146H(102);
        }
        this.f164231q.onPause();
    }

    /* JADX INFO: renamed from: I0 */
    public void m183843I0() {
        if (this.f164225k.getTranslationX() != 0.0f) {
            this.f164225k.setTranslationX(0.0f);
        }
        m183826Z();
    }

    /* JADX INFO: renamed from: J0 */
    public void m183844J0(MusicContent musicContent) {
        this.f164232r = musicContent;
        VideoInfo videoInfo = this.f164206C;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m81303a(musicContent)) {
            this.f164224j.setText(musicContent.name);
        }
        this.f164231q.mo138872x(musicContent);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m183845O0() {
        this.f164215a.getHolder().addCallback(new SurfaceHolderCallbackC19930a());
        this.f164211H = xck0.m208120a(500, new e30() { // from class: l.kf5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122898a.m183863t0((View) obj);
            }
        });
        this.f164212I = xck0.m208120a(1000, new e30() { // from class: l.lf5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127834a.m183864u0((View) obj);
            }
        });
        this.f164213J = xck0.m208120a(500, new e30() { // from class: l.mf5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133561a.m183867x0((Bundle) obj);
            }
        });
        this.f164221g.setOnClickListener(new View.OnClickListener() { // from class: l.nf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138683a.m183868y0(view);
            }
        });
        this.f164226l.setOnClickListener(new View.OnClickListener() { // from class: l.of5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143626a.m183869z0(view);
            }
        });
        this.f164222h.setOnClickListener(new View.OnClickListener() { // from class: l.pf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148516a.m183837A0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final void m183846P0() {
        final h3x h3xVarM182303a = s4l0.m182303a(getContext(), new File(this.f164214K.modelFilePath));
        if (NullChecker.m81304b(h3xVarM182303a)) {
            e51.m114743H(this.f164230p, new Runnable() { // from class: l.rf5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159102a.m183838B0(h3xVarM182303a);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: U */
    public View m183847U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tf5.m188652b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ye5 ye5Var) {
        this.f164234t = ye5Var;
    }

    @Override // p149l.s1m.InterfaceC19826a
    /* JADX INFO: renamed from: a */
    public void mo182003a(String str) {
        lsi0.m151578h(R$string.f38953P1);
        this.f164229o.f40207c.m62090L();
        mo177483k(false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) this.f164230p;
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: b */
    public long mo177479b() {
        return this.f164229o.f40207c.getLastDuration();
    }

    /* JADX INFO: renamed from: b0 */
    public void m183849b0() {
        if (this.f164231q == null) {
            m183850c0();
            return;
        }
        d30 d30Var = new d30() { // from class: l.af5
            @Override // p149l.d30
            public final void call() {
                this.f69149a.m183857n0();
            }
        };
        if (this.f164229o.f40207c.getCount() == 0) {
            m183815Q0(getAct().getString(R$string.f39130q0), new d30() { // from class: l.jf5
                @Override // p149l.d30
                public final void call() {
                    this.f117634a.m183856m0();
                }
            });
        } else {
            m183815Q0(getAct().getString(R$string.f38880D0), d30Var);
        }
    }

    @Override // p149l.s1m.InterfaceC19826a
    /* JADX INFO: renamed from: c */
    public void mo182004c(String str, boolean z) {
        if (this.f164229o.f40207c.m62092N() < 3000) {
            lsi0.m151578h(R$string.f38868B0);
            return;
        }
        Video video = new Video(0, str);
        ebl0.m115507c(video);
        this.f164233s.m20599s4();
        if (z && NullChecker.m81303a(this.f164213J)) {
            this.f164213J.call(m183828d0(video));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m183850c0() {
        Act act = getAct();
        if (!NullChecker.m81304b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo177480d() {
        return this.f164215a.getHolder();
    }

    @Override // p149l.s7m
    public void destroy() {
        FeedComicFacePropMenuView feedComicFacePropMenuView = this.f164235u;
        if (feedComicFacePropMenuView != null) {
            feedComicFacePropMenuView.m62142D();
        }
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: e */
    public void mo177481e() {
        if (this.f164237w != 100) {
            this.f164229o.f40207c.m62090L();
        }
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: f */
    public void mo167786f(View view) {
        m183815Q0(getAct().getString(R$string.f38862A0), new d30() { // from class: l.qf5
            @Override // p149l.d30
            public final void call() {
                this.f154084a.m183861r0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public long m183851f0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: g0 */
    public long m183852g0() {
        return this.f164229o.f40207c.m62092N();
    }

    @Override // p149l.r1m
    public int getCount() {
        return this.f164229o.f40207c.getCount();
    }

    /* JADX INFO: renamed from: h0 */
    public void m183853h0(List<CameraCategory> list) {
        this.f164229o.setVisibility(0);
        this.f164229o.setCancel(new d30() { // from class: l.ff5
            @Override // p149l.d30
            public final void call() {
                this.f97184a.m183858o0();
            }
        });
        this.f164229o.setOnPropSelect(new g30() { // from class: l.gf5
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f102332a.m183859p0((Integer) obj, (CameraSticker) obj2, (Boolean) obj3);
            }
        });
        this.f164229o.setDelete(new d30() { // from class: l.hf5
            @Override // p149l.d30
            public final void call() {
                this.f107451a.m183860q0();
            }
        });
        this.f164229o.setStateListener(new C19931b());
        this.f164229o.setCategoryData(list);
    }

    /* JADX INFO: renamed from: i0 */
    public void m183854i0(Bundle bundle) {
        this.f164206C = new VideoInfo();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM183847U = m183847U(layoutInflater, viewGroup);
        m183845O0();
        m183855j0();
        return viewM183847U;
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: j */
    public int mo177482j() {
        return this.f164238x;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m183855j0() {
        xdl0.m208413z(this.f164224j);
        if (NullChecker.m81303a(this.f164232r)) {
            this.f164224j.setText(this.f164232r.name);
        }
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: k */
    public void mo177483k(boolean z) {
        this.f164233s.m20599s4();
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: l */
    public void mo177484l() {
        this.f164233s.m20597q4(getAct().getString(R$string.f39138r2), true);
    }

    @Override // p149l.hxl
    /* JADX INFO: renamed from: m */
    public void mo133344m() {
        xdl0.m208344M(this.f164227m, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m183856m0() {
        this.f164231q.mo181988F();
        this.f164231q.release();
        m183850c0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m183857n0() {
        xdl0.m208345M0(this.f164222h, true);
        m183822U0(true);
        this.f164231q.mo181988F();
        this.f164229o.m62144F();
        this.f164209F.clear();
        this.f164231q.mo181986D(false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m183858o0() {
        this.f164214K = null;
        yb4.m213936c().m213948m(null);
        this.f164231q.mo138862T();
        this.f164231q.mo138852B();
        this.f164231q.mo138868t();
    }

    @Override // p149l.s1m.InterfaceC19826a
    public void onError(final int i, final int i2) {
        e51.m114748M(new Runnable() { // from class: l.ef5
            @Override // java.lang.Runnable
            public final void run() {
                this.f90801a.m183862s0(i, i2);
            }
        });
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: p */
    public boolean mo167788p() {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m183859p0(Integer num, CameraSticker cameraSticker, Boolean bool) {
        this.f164214K = cameraSticker;
        yb4.m213936c().m213948m(cameraSticker);
        if (bool.booleanValue()) {
            zvf0.m220399u("e_camera_video_sticker", "p_camera_video", new j760("event_type", "MC"), new j760("sticker_id", cameraSticker.f39219id));
        }
        if (cameraSticker.hasModelFile) {
            m183846P0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m183860q0() {
        mo167786f(this.f164229o);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m183861r0() {
        this.f164229o.f40207c.m62089K();
        m183811N0();
        this.f164231q.removeLast();
        if (this.f164229o.f40207c.getCount() <= 0) {
            this.f164231q.mo181986D(false);
            this.f164237w = 100;
            this.f164229o.m62146H(100);
        }
    }

    @Override // p149l.r1m
    public void removeLast() {
        this.f164229o.f40207c.m62089K();
        if (this.f164229o.f40207c.getCount() <= 0) {
            this.f164229o.f40207c.m62090L();
            this.f164231q.mo181986D(false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m183862s0(int i, int i2) {
        if (i == -302) {
            m183823W();
            lsi0.m151578h(R$string.f38971S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m183823W();
            lsi0.m151578h(R$string.f38959Q1);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m183863t0(View view) {
        if (this.f164237w == 101) {
            return;
        }
        if (view == this.f164221g) {
            m183849b0();
        } else if (view == this.f164226l) {
            this.f164231q.mo138864f();
        }
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: u */
    public boolean mo177486u() {
        return m183852g0() >= 3000 || Math.abs(m183852g0() - 3000) < 900;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m183864u0(View view) {
        if (view == this.f164222h && this.f164237w == 100) {
            this.f164233s.startActivityForResult(new Intent(getAct(), (Class<?>) MusicCenterAct.class), 1001);
            getAct().overridePendingTransition(uzb0.f178984i, uzb0.f178982g);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m183865v0(Bundle bundle) {
        this.f164233s.startActivity(VideoEditAct.m61232X1(getAct(), bundle));
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m183866w0(final Bundle bundle) {
        m183807L0(new Runnable() { // from class: l.if5
            @Override // java.lang.Runnable
            public final void run() {
                this.f112957a.m183865v0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m183867x0(final Bundle bundle) {
        e51.m114748M(new Runnable() { // from class: l.df5
            @Override // java.lang.Runnable
            public final void run() {
                this.f85893a.m183866w0(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m183868y0(View view) {
        this.f164211H.call(view);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m183869z0(View view) {
        this.f164211H.call(view);
    }

    @Override // p149l.r1m
    public void onFirstFrameRendered() {
    }

    /* JADX INFO: renamed from: l.sf5$a */
    public class SurfaceHolderCallbackC19930a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC19930a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            sf5.this.f164207D = i2;
            sf5.this.f164208E = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: i */
    public void mo167787i(View view) {
    }

    @Override // p149l.p84
    public void onStateChanged(int i) {
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: v */
    public void mo167789v(View view) {
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: q */
    public void mo177485q(String str, Exception exc) {
    }

    @Override // p149l.hxl
    /* JADX INFO: renamed from: s */
    public void mo133345s(float f, int i) {
    }
}
