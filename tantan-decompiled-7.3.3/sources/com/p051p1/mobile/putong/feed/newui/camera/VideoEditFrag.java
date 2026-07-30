package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import p151v.VButton;
import p151v.VText;
import p153l.a8c0;
import p153l.be00;
import p153l.bnl0;
import p153l.cai;
import p153l.fam;
import p153l.fe00;
import p153l.iam;
import p153l.ikl0;
import p153l.jpw;
import p153l.kdl0;
import p153l.kpw;
import p153l.kz10;
import p153l.l51;
import p153l.o1j0;
import p153l.psd0;
import p153l.qdl0;
import p153l.sw5;
import p153l.uc4;
import p153l.v9m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEditFrag extends PutongFrag implements View.OnClickListener, iam<qdl0> {

    /* JADX INFO: renamed from: A */
    public ImageView f40267A;

    /* JADX INFO: renamed from: B */
    public ImageView f40268B;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f40269C;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f40270D;

    /* JADX INFO: renamed from: E */
    public CameraMenuView f40271E;

    /* JADX INFO: renamed from: F */
    public VButton f40273F;

    /* JADX INFO: renamed from: G */
    public VText f40275G;

    /* JADX INFO: renamed from: H */
    public ViewStub f40277H;

    /* JADX INFO: renamed from: H0 */
    public fe00 f40278H0;

    /* JADX INFO: renamed from: I */
    public ViewStub f40279I;

    /* JADX INFO: renamed from: I0 */
    public qdl0 f40280I0;

    /* JADX INFO: renamed from: J */
    public ViewStub f40281J;

    /* JADX INFO: renamed from: J0 */
    public boolean f40282J0;

    /* JADX INFO: renamed from: K */
    public MusicContent f40283K;

    /* JADX INFO: renamed from: K0 */
    public boolean f40284K0;

    /* JADX INFO: renamed from: L */
    public MusicRangeEditView f40285L;

    /* JADX INFO: renamed from: M */
    public kz10 f40286M;

    /* JADX INFO: renamed from: N */
    public MusicContent f40287N;

    /* JADX INFO: renamed from: O */
    public MusicVolumeEditView f40288O;

    /* JADX INFO: renamed from: P */
    public ArrayList<MediaMeta> f40289P;

    /* JADX INFO: renamed from: Q */
    public VideoInfo f40290Q;

    /* JADX INFO: renamed from: R */
    public Video f40291R;

    /* JADX INFO: renamed from: S */
    public boolean f40292S;

    /* JADX INFO: renamed from: X */
    public String f40297X;

    /* JADX INFO: renamed from: Y */
    public String f40298Y;

    /* JADX INFO: renamed from: Z */
    public fam f40299Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f40300k0;

    /* JADX INFO: renamed from: p0 */
    public VideoCut f40301p0;

    /* JADX INFO: renamed from: z */
    public TextureView f40302z;

    /* JADX INFO: renamed from: T */
    public int f40293T = 0;

    /* JADX INFO: renamed from: U */
    public int f40294U = 0;

    /* JADX INFO: renamed from: V */
    public int f40295V = 0;

    /* JADX INFO: renamed from: W */
    public int f40296W = 0;

    /* JADX INFO: renamed from: E0 */
    public int f40272E0 = 25;

    /* JADX INFO: renamed from: F0 */
    public int f40274F0 = 25;

    /* JADX INFO: renamed from: G0 */
    public boolean f40276G0 = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$a */
    public class TextureViewSurfaceTextureListenerC11319a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11319a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f40291R.width, VideoEditFrag.this.f40291R.height);
            if (NullChecker.m82487b(surfaceTexture)) {
                VideoEditFrag.this.f40299Z.mo124756h(surfaceTexture);
            }
            boolean z = VideoEditFrag.this.f40276G0;
            VideoEditFrag videoEditFrag = VideoEditFrag.this;
            if (z) {
                videoEditFrag.f40276G0 = false;
                VideoEditFrag.this.f40299Z.mo124750b(VideoEditFrag.this.f40278H0);
                VideoEditFrag.this.f40299Z.mo124755g();
            } else if (videoEditFrag.f40299Z.mo124754f()) {
                VideoEditFrag.this.f40299Z.mo124755g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m82486a(VideoEditFrag.this.f40299Z)) {
                return false;
            }
            VideoEditFrag.this.f40299Z.mo124749a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f40291R.width, VideoEditFrag.this.f40291R.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f40291R.width, VideoEditFrag.this.f40291R.height);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$b */
    public class C11320b implements kpw {
        public C11320b() {
        }

        @Override // p153l.kpw
        /* JADX INFO: renamed from: a */
        public void mo62200a() {
            if (NullChecker.m82486a(VideoEditFrag.this.f40287N) && VideoEditFrag.this.f40287N.isFile()) {
                l51.m152919y(new v9m());
            }
            if (VideoEditFrag.this.getActivity() == null || VideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            l51.m152887G(new Runnable() { // from class: l.jdl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120277a.m62469c();
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m62469c() {
            VideoEditFrag.this.f40280I0.m176177m0(VideoEditFrag.this.f40297X);
        }

        @Override // p153l.kpw
        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$c */
    public class C11321c implements kz10 {
        public C11321c() {
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: a */
        public void mo62201a(int i, int i2) {
            if (VideoEditFrag.this.f40278H0.m125154a()) {
                VideoEditFrag.this.f40284K0 = true;
                VideoEditFrag.this.f40278H0.f98535c = i;
                VideoEditFrag.this.f40278H0.f98536d = i2;
                if (NullChecker.m82487b(VideoEditFrag.this.f40299Z)) {
                    VideoEditFrag.this.f40299Z.mo124760m(0L, true);
                }
            }
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: b */
        public void mo62202b(int i) {
            VideoEditFrag.this.f40284K0 = true;
            if (VideoEditFrag.this.f40299Z == null) {
                return;
            }
            VideoEditFrag.this.f40274F0 = i;
            VideoEditFrag.this.f40299Z.mo124757i(VideoEditFrag.this.f40274F0 / 100.0f);
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: c */
        public void mo62203c(int i) {
            VideoEditFrag.this.f40284K0 = true;
            if (VideoEditFrag.this.f40299Z == null) {
                return;
            }
            VideoEditFrag.this.f40272E0 = i;
            VideoEditFrag.this.f40299Z.mo124764q(i / 100.0f);
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: d */
        public void mo62204d(@Nullable MusicContent musicContent) {
            VideoEditFrag.this.f40284K0 = true;
            VideoEditFrag.this.f40287N = musicContent;
            VideoEditFrag.this.f40280I0.f156745e = musicContent;
            if (NullChecker.m82486a(VideoEditFrag.this.f40285L)) {
                VideoCut videoCut = VideoEditFrag.this.f40301p0;
                VideoEditFrag videoEditFrag = VideoEditFrag.this;
                if (videoCut == null) {
                    videoEditFrag.f40285L.m62402i(VideoEditFrag.this.f40291R, musicContent, VideoEditFrag.this.f40291R.length);
                } else {
                    videoEditFrag.f40285L.m62402i(VideoEditFrag.this.f40291R, musicContent, VideoEditFrag.this.f40301p0.getEnd() - VideoEditFrag.this.f40301p0.getStart());
                }
            }
            VideoEditFrag.this.f40300k0 = true;
        }
    }

    /* JADX INFO: renamed from: A5 */
    private void m62420A5(MusicContent musicContent) {
        if (musicContent == null) {
            fe00 fe00Var = this.f40278H0;
            fe00Var.f98534b = null;
            fe00Var.f98535c = 0;
            fe00Var.f98536d = 0;
            this.f40299Z.mo124757i(0.0f);
        } else {
            this.f40299Z.mo124757i(this.f40274F0 / 100.0f);
            fe00 fe00Var2 = this.f40278H0;
            fe00Var2.f98534b = musicContent.path;
            fe00Var2.f98535c = musicContent.startMillTime;
            fe00Var2.f98536d = musicContent.endMillTime;
        }
        if (NullChecker.m82487b(this.f40299Z)) {
            this.f40299Z.mo124760m(0L, true);
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m62421B5() {
        int[] iArrM108497e = cai.m108497e(this.f40291R);
        this.f40299Z.mo124759k(iArrM108497e[0], iArrM108497e[1], cai.m108500h(this.f40291R), 5242880);
        this.f40299Z.mo124761n(this.f40297X);
        m21595p4(R$string.f39986r2, true);
    }

    /* JADX INFO: renamed from: C5 */
    private void m62422C5() {
        File file = new File(this.f40291R.path);
        if (!file.exists() || file.length() != this.f40291R.size) {
            o1j0.m165634h(R$string.f39980q2);
            m62451o5();
        } else if (this.f40282J0 || this.f40284K0) {
            m62421B5();
        } else {
            if (getActivity() == null || getActivity().isFinishing()) {
                return;
            }
            l51.m152887G(new Runnable() { // from class: l.fdl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98485a.m62465x5();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D5 */
    private void m62423D5(boolean z) {
        bnl0.m105524M(this.f40273F, z);
        bnl0.m105524M(this.f40271E, z);
        bnl0.m105524M(this.f40270D, z);
        bnl0.m105524M(this.f40269C, z);
    }

    /* JADX INFO: renamed from: F5 */
    private void m62424F5() {
        if (this.f40287N == null || this.f40291R == null) {
            o1j0.m165634h(R$string.f39861Z1);
            return;
        }
        if (this.f40285L == null) {
            MusicRangeEditView musicRangeEditView = (MusicRangeEditView) this.f40279I.inflate();
            this.f40285L = musicRangeEditView;
            musicRangeEditView.f40245d = this.f40286M;
            musicRangeEditView.setDismissListener(new x20() { // from class: l.edl0
                @Override // p153l.x20
                public final void call() {
                    this.f93530a.m62466y5();
                }
            });
            if (NullChecker.m82487b(this.f40287N)) {
                VideoCut videoCut = this.f40301p0;
                MusicRangeEditView musicRangeEditView2 = this.f40285L;
                if (videoCut == null) {
                    Video video = this.f40291R;
                    musicRangeEditView2.m62402i(video, this.f40287N, video.length);
                } else {
                    musicRangeEditView2.m62402i(this.f40291R, this.f40287N, videoCut.getEnd() - this.f40301p0.getStart());
                }
            }
        }
        this.f40275G.setVisibility(8);
        this.f40285L.m62403j();
        m62423D5(false);
    }

    /* JADX INFO: renamed from: l5 */
    private void m62448l5() {
        this.f40280I0.m176174i0(this.f40291R);
        m62451o5();
    }

    /* JADX INFO: renamed from: m5 */
    private void m62449m5() {
        startActivityForResult(new Intent(getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(a8c0.f68909i, a8c0.f68907g);
    }

    /* JADX INFO: renamed from: n5 */
    private void m62450n5() {
        new qdl0(this).mo52715C(this);
    }

    /* JADX INFO: renamed from: o5 */
    private void m62451o5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.m82487b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: p5 */
    private void m62452p5() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.hdl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109010a.m62456u5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q5 */
    private void m62453q5() {
        this.f40271E.setOnClickListener(this);
        this.f40273F.setOnClickListener(this);
        this.f40302z.setOnClickListener(this);
        this.f40268B.setOnClickListener(this);
        this.f40270D.setOnClickListener(this);
        this.f40269C.setOnClickListener(this);
        this.f40275G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: r5 */
    private void m62454r5() {
        this.f40286M = new C11321c();
    }

    /* JADX INFO: renamed from: s5 */
    private void m62455s5() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f40295V, this.f40296W);
        marginLayoutParams.setMargins(this.f40293T, this.f40294U, 0, 0);
        this.f40302z.setLayoutParams(new RelativeLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public /* synthetic */ void m62456u5(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            Video video = this.f40291R;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f40291R.path).exists()) {
                o1j0.m165634h(R$string.f39973p2);
                m62451o5();
                return;
            }
            this.f40302z.setVisibility(0);
            if (this.f40300k0) {
                this.f40300k0 = false;
                m62420A5(this.f40287N);
            }
            if (NullChecker.m82487b(this.f40299Z)) {
                this.f40299Z.mo124763p();
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16268j) {
            if (NullChecker.m82487b(this.f40299Z)) {
                this.f40299Z.pause();
            }
        } else {
            if (c4470c == C4470c.f16269k) {
                this.f40302z.setVisibility(8);
                return;
            }
            if (c4470c != C4470c.f16271m || this.f40291R == null) {
                return;
            }
            if (NullChecker.m82487b(this.f40299Z)) {
                this.f40299Z.release();
                this.f40299Z = null;
            }
            final File fileM188239b = sw5.m188239b();
            if (NullChecker.m82486a(fileM188239b)) {
                l51.m152919y(new Runnable() { // from class: l.idl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        oki.m168023k(fileM188239b);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public /* synthetic */ void m62457v5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f40273F.setEnabled(true);
        if (NullChecker.m82487b(this.f40299Z)) {
            this.f40299Z.mo124763p();
        }
        o1j0.m165634h(R$string.f39966o2);
        m21598s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m62458w5(final int i, final int i2, final String str) {
        l51.m152887G(new Runnable() { // from class: l.gdl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103722a.m62457v5(i, i2, str);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E5 */
    public boolean m62459E5() {
        return this.f40283K != null;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m62460G5() {
        if (this.f40288O == null) {
            MusicVolumeEditView musicVolumeEditView = (MusicVolumeEditView) this.f40281J.inflate();
            this.f40288O = musicVolumeEditView;
            musicVolumeEditView.f40260h = this.f40286M;
            musicVolumeEditView.setDismissListener(new x20() { // from class: l.cdl0
                @Override // p153l.x20
                public final void call() {
                    this.f81243a.m62467z5();
                }
            });
            this.f40288O.m62412i(this.f40272E0, this.f40274F0);
        }
        this.f40288O.m62413j(m62459E5(), this.f40287N);
        this.f40288O.m62414k();
        m62423D5(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        m62453q5();
        m62455s5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM62461j5 = m62461j5(layoutInflater, viewGroup);
        this.f40302z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11319a());
        return viewM62461j5;
    }

    /* JADX INFO: renamed from: j5 */
    public View m62461j5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kdl0.m149211b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qdl0 qdl0Var) {
        this.f40280I0 = qdl0Var;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m62451o5();
            return;
        }
        VideoInfo videoInfo = (VideoInfo) arguments.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
        this.f40290Q = videoInfo;
        if (NullChecker.m82486a(videoInfo)) {
            this.f40284K0 = !this.f40290Q.hasOriginalSound;
        }
        this.f40291R = (Video) arguments.getParcelable("EXTRA_KEY_VIDEO_DATA");
        this.f40292S = arguments.getBoolean("extra_is_from_album");
        this.f40282J0 = arguments.getBoolean("extra_is_from_video_cut");
        this.f40298Y = arguments.getString("extra_from");
        if (this.f40291R == null) {
            m62451o5();
            return;
        }
        this.f40289P = (ArrayList) arguments.getSerializable("EXTRA_KEY_CAMERA_META_DATA");
        long j = arguments.getLong("extra_start_time", 0L);
        long j2 = arguments.getLong("extra_end_time", 0L);
        if (j != 0 || j2 != 0) {
            this.f40301p0 = new VideoCut(this.f40291R.path, j, j2);
        }
        m62464t5();
        MusicContent musicContent = this.f40291R.playingMusic;
        this.f40283K = musicContent;
        boolean zM82486a = NullChecker.m82486a(musicContent);
        Video video = this.f40291R;
        if (zM82486a) {
            video.osPercent = 0;
            video.psPercent = 50;
        } else {
            video.osPercent = 50;
            video.psPercent = 0;
        }
        File file = new File(this.f40291R.path);
        if (!file.exists() || file.length() <= 0) {
            o1j0.m165634h(R$string.f39992s2);
            m62451o5();
            return;
        }
        this.f40291R.size = (int) file.length();
        if (!uc4.m195359i() || !uc4.m195356f()) {
            m62451o5();
            return;
        }
        fam famVarM103675b = be00.m103675b();
        this.f40299Z = famVarM103675b;
        famVarM103675b.mo124752d(true);
        this.f40299Z.mo124753e(false);
        this.f40299Z.mo124758j(new jpw() { // from class: l.ddl0
            @Override // p153l.jpw
            /* JADX INFO: renamed from: a */
            public final void mo115360a(int i, int i2, String str) {
                this.f87946a.m62458w5(i, i2, str);
            }
        });
        this.f40299Z.mo124762o(new C11320b());
        if (this.f40290Q == null) {
            this.f40290Q = new VideoInfo();
        }
        this.f40287N = this.f40290Q.musicContent;
        m62450n5();
        qdl0 qdl0Var = this.f40280I0;
        qdl0Var.f156745e = this.f40287N;
        qdl0Var.m176175k0(this.f40289P, this.f40292S, this.f40290Q, this.f40291R, this.f40298Y);
        m62452p5();
        m62454r5();
        File fileM188238a = sw5.m188238a("current_video", "temp");
        if (NullChecker.m82487b(fileM188238a)) {
            this.f40297X = fileM188238a.getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4";
        }
        if (this.f40297X == null) {
            m62451o5();
        }
        fe00 fe00Var = new fe00();
        this.f40278H0 = fe00Var;
        Video video2 = this.f40291R;
        fe00Var.f98533a = video2.path;
        fe00Var.f98537e = video2.osPercent;
        fe00Var.f98538f = video2.psPercent;
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(this.f40301p0);
        this.f40278H0.f98539g = videoEffects;
        if (NullChecker.m82486a(this.f40287N)) {
            fe00 fe00Var2 = this.f40278H0;
            MusicContent musicContent2 = this.f40287N;
            fe00Var2.f98534b = musicContent2.path;
            fe00Var2.f98535c = musicContent2.startMillTime;
            fe00Var2.f98536d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m62463o() {
        m62448l5();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.m82486a(intent)) {
            this.f40286M.mo62204d((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f40273F) {
            view.setEnabled(false);
            m62422C5();
            return;
        }
        if (view == this.f40268B) {
            m62463o();
            return;
        }
        if (view == this.f40271E) {
            m62449m5();
            return;
        }
        if (view == this.f40269C) {
            m62424F5();
        } else if (view == this.f40270D) {
            m62460G5();
        } else if (view == this.f40275G) {
            act().m51642n2();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m62464t5() {
        ikl0.m140409a(this.f40291R);
        Video video = this.f40291R;
        int i = video.width;
        int i2 = video.height;
        int iM105592y0 = bnl0.m105592y0();
        int iM105588w0 = bnl0.m105588w0();
        float f = i;
        float f2 = i2;
        float f3 = iM105592y0;
        float f4 = iM105588w0;
        if (f / f2 >= f3 / f4) {
            this.f40295V = iM105592y0;
            this.f40296W = (int) (f2 * (f3 / f));
        } else {
            this.f40296W = iM105588w0;
            this.f40295V = (int) (f * (f4 / f2));
        }
        this.f40294U = (iM105588w0 - this.f40296W) / 2;
        this.f40293T = (iM105592y0 - this.f40295V) / 2;
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m62465x5() {
        this.f40280I0.m176177m0(this.f40291R.path);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m62466y5() {
        m62423D5(true);
        this.f40275G.setVisibility(0);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m62467z5() {
        m62423D5(true);
    }
}
