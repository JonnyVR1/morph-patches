package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import p147v.VButton;
import p147v.VText;
import p149l.cr10;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ebl0;
import p149l.f7m;
import p149l.g4l0;
import p149l.kmw;
import p149l.lmw;
import p149l.lsi0;
import p149l.m4l0;
import p149l.mkd0;
import p149l.n500;
import p149l.n8i;
import p149l.nv5;
import p149l.p7m;
import p149l.s7m;
import p149l.uzb0;
import p149l.v500;
import p149l.vb4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class VideoEditFrag extends PutongFrag implements View.OnClickListener, s7m<m4l0> {

    /* JADX INFO: renamed from: A */
    public ImageView f39419A;

    /* JADX INFO: renamed from: B */
    public ImageView f39420B;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f39421C;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f39422D;

    /* JADX INFO: renamed from: E */
    public CameraMenuView f39423E;

    /* JADX INFO: renamed from: F */
    public VButton f39425F;

    /* JADX INFO: renamed from: G */
    public VText f39427G;

    /* JADX INFO: renamed from: H */
    public ViewStub f39429H;

    /* JADX INFO: renamed from: H0 */
    public v500 f39430H0;

    /* JADX INFO: renamed from: I */
    public ViewStub f39431I;

    /* JADX INFO: renamed from: I0 */
    public m4l0 f39432I0;

    /* JADX INFO: renamed from: J */
    public ViewStub f39433J;

    /* JADX INFO: renamed from: J0 */
    public boolean f39434J0;

    /* JADX INFO: renamed from: K */
    public MusicContent f39435K;

    /* JADX INFO: renamed from: K0 */
    public boolean f39436K0;

    /* JADX INFO: renamed from: L */
    public MusicRangeEditView f39437L;

    /* JADX INFO: renamed from: M */
    public cr10 f39438M;

    /* JADX INFO: renamed from: N */
    public MusicContent f39439N;

    /* JADX INFO: renamed from: O */
    public MusicVolumeEditView f39440O;

    /* JADX INFO: renamed from: P */
    public ArrayList<MediaMeta> f39441P;

    /* JADX INFO: renamed from: Q */
    public VideoInfo f39442Q;

    /* JADX INFO: renamed from: R */
    public Video f39443R;

    /* JADX INFO: renamed from: S */
    public boolean f39444S;

    /* JADX INFO: renamed from: X */
    public String f39449X;

    /* JADX INFO: renamed from: Y */
    public String f39450Y;

    /* JADX INFO: renamed from: Z */
    public p7m f39451Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f39452k0;

    /* JADX INFO: renamed from: p0 */
    public VideoCut f39453p0;

    /* JADX INFO: renamed from: z */
    public TextureView f39454z;

    /* JADX INFO: renamed from: T */
    public int f39445T = 0;

    /* JADX INFO: renamed from: U */
    public int f39446U = 0;

    /* JADX INFO: renamed from: V */
    public int f39447V = 0;

    /* JADX INFO: renamed from: W */
    public int f39448W = 0;

    /* JADX INFO: renamed from: E0 */
    public int f39424E0 = 25;

    /* JADX INFO: renamed from: F0 */
    public int f39426F0 = 25;

    /* JADX INFO: renamed from: G0 */
    public boolean f39428G0 = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$a */
    public class TextureViewSurfaceTextureListenerC11156a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11156a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f39443R.width, VideoEditFrag.this.f39443R.height);
            if (NullChecker.m81304b(surfaceTexture)) {
                VideoEditFrag.this.f39451Z.mo129502h(surfaceTexture);
            }
            boolean z = VideoEditFrag.this.f39428G0;
            VideoEditFrag videoEditFrag = VideoEditFrag.this;
            if (z) {
                videoEditFrag.f39428G0 = false;
                VideoEditFrag.this.f39451Z.mo129496b(VideoEditFrag.this.f39430H0);
                VideoEditFrag.this.f39451Z.mo129501g();
            } else if (videoEditFrag.f39451Z.mo129500f()) {
                VideoEditFrag.this.f39451Z.mo129501g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m81303a(VideoEditFrag.this.f39451Z)) {
                return false;
            }
            VideoEditFrag.this.f39451Z.mo129495a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f39443R.width, VideoEditFrag.this.f39443R.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f39443R.width, VideoEditFrag.this.f39443R.height);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$b */
    public class C11157b implements lmw {
        public C11157b() {
        }

        @Override // p149l.lmw
        /* JADX INFO: renamed from: a */
        public void mo61016a() {
            if (NullChecker.m81303a(VideoEditFrag.this.f39439N) && VideoEditFrag.this.f39439N.isFile()) {
                e51.m114774y(new f7m());
            }
            if (VideoEditFrag.this.getActivity() == null || VideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            e51.m114742G(new Runnable() { // from class: l.f4l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94833a.m61285c();
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m61285c() {
            VideoEditFrag.this.f39432I0.m153046m0(VideoEditFrag.this.f39449X);
        }

        @Override // p149l.lmw
        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$c */
    public class C11158c implements cr10 {
        public C11158c() {
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: a */
        public void mo61017a(int i, int i2) {
            if (VideoEditFrag.this.f39430H0.m197095a()) {
                VideoEditFrag.this.f39436K0 = true;
                VideoEditFrag.this.f39430H0.f179992c = i;
                VideoEditFrag.this.f39430H0.f179993d = i2;
                if (NullChecker.m81304b(VideoEditFrag.this.f39451Z)) {
                    VideoEditFrag.this.f39451Z.mo129507m(0L, true);
                }
            }
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: b */
        public void mo61018b(int i) {
            VideoEditFrag.this.f39436K0 = true;
            if (VideoEditFrag.this.f39451Z == null) {
                return;
            }
            VideoEditFrag.this.f39426F0 = i;
            VideoEditFrag.this.f39451Z.mo129503i(VideoEditFrag.this.f39426F0 / 100.0f);
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: c */
        public void mo61019c(int i) {
            VideoEditFrag.this.f39436K0 = true;
            if (VideoEditFrag.this.f39451Z == null) {
                return;
            }
            VideoEditFrag.this.f39424E0 = i;
            VideoEditFrag.this.f39451Z.mo129511q(i / 100.0f);
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: d */
        public void mo61020d(@Nullable MusicContent musicContent) {
            VideoEditFrag.this.f39436K0 = true;
            VideoEditFrag.this.f39439N = musicContent;
            VideoEditFrag.this.f39432I0.f131305e = musicContent;
            if (NullChecker.m81303a(VideoEditFrag.this.f39437L)) {
                VideoCut videoCut = VideoEditFrag.this.f39453p0;
                VideoEditFrag videoEditFrag = VideoEditFrag.this;
                if (videoCut == null) {
                    videoEditFrag.f39437L.m61218i(VideoEditFrag.this.f39443R, musicContent, VideoEditFrag.this.f39443R.length);
                } else {
                    videoEditFrag.f39437L.m61218i(VideoEditFrag.this.f39443R, musicContent, VideoEditFrag.this.f39453p0.getEnd() - VideoEditFrag.this.f39453p0.getStart());
                }
            }
            VideoEditFrag.this.f39452k0 = true;
        }
    }

    /* JADX INFO: renamed from: A5 */
    private void m61236A5(MusicContent musicContent) {
        if (musicContent == null) {
            v500 v500Var = this.f39430H0;
            v500Var.f179991b = null;
            v500Var.f179992c = 0;
            v500Var.f179993d = 0;
            this.f39451Z.mo129503i(0.0f);
        } else {
            this.f39451Z.mo129503i(this.f39426F0 / 100.0f);
            v500 v500Var2 = this.f39430H0;
            v500Var2.f179991b = musicContent.path;
            v500Var2.f179992c = musicContent.startMillTime;
            v500Var2.f179993d = musicContent.endMillTime;
        }
        if (NullChecker.m81304b(this.f39451Z)) {
            this.f39451Z.mo129507m(0L, true);
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m61237B5() {
        int[] iArrM158498e = n8i.m158498e(this.f39443R);
        this.f39451Z.mo129505k(iArrM158498e[0], iArrM158498e[1], n8i.m158501h(this.f39443R), 5242880);
        this.f39451Z.mo129508n(this.f39449X);
        m20596p4(R$string.f39138r2, true);
    }

    /* JADX INFO: renamed from: C5 */
    private void m61238C5() {
        File file = new File(this.f39443R.path);
        if (!file.exists() || file.length() != this.f39443R.size) {
            lsi0.m151578h(R$string.f39132q2);
            m61267o5();
        } else if (this.f39434J0 || this.f39436K0) {
            m61237B5();
        } else {
            if (getActivity() == null || getActivity().isFinishing()) {
                return;
            }
            e51.m114742G(new Runnable() { // from class: l.b4l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73384a.m61281x5();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D5 */
    private void m61239D5(boolean z) {
        xdl0.m208344M(this.f39425F, z);
        xdl0.m208344M(this.f39423E, z);
        xdl0.m208344M(this.f39422D, z);
        xdl0.m208344M(this.f39421C, z);
    }

    /* JADX INFO: renamed from: F5 */
    private void m61240F5() {
        if (this.f39439N == null || this.f39443R == null) {
            lsi0.m151578h(R$string.f39013Z1);
            return;
        }
        if (this.f39437L == null) {
            MusicRangeEditView musicRangeEditView = (MusicRangeEditView) this.f39431I.inflate();
            this.f39437L = musicRangeEditView;
            musicRangeEditView.f39397d = this.f39438M;
            musicRangeEditView.setDismissListener(new d30() { // from class: l.a4l0
                @Override // p149l.d30
                public final void call() {
                    this.f67544a.m61282y5();
                }
            });
            if (NullChecker.m81304b(this.f39439N)) {
                VideoCut videoCut = this.f39453p0;
                MusicRangeEditView musicRangeEditView2 = this.f39437L;
                if (videoCut == null) {
                    Video video = this.f39443R;
                    musicRangeEditView2.m61218i(video, this.f39439N, video.length);
                } else {
                    musicRangeEditView2.m61218i(this.f39443R, this.f39439N, videoCut.getEnd() - this.f39453p0.getStart());
                }
            }
        }
        this.f39427G.setVisibility(8);
        this.f39437L.m61219j();
        m61239D5(false);
    }

    /* JADX INFO: renamed from: l5 */
    private void m61264l5() {
        this.f39432I0.m153043i0(this.f39443R);
        m61267o5();
    }

    /* JADX INFO: renamed from: m5 */
    private void m61265m5() {
        startActivityForResult(new Intent(getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(uzb0.f178984i, uzb0.f178982g);
    }

    /* JADX INFO: renamed from: n5 */
    private void m61266n5() {
        new m4l0(this).mo51532C(this);
    }

    /* JADX INFO: renamed from: o5 */
    private void m61267o5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.m81304b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: p5 */
    private void m61268p5() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.d4l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84316a.m61272u5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q5 */
    private void m61269q5() {
        this.f39423E.setOnClickListener(this);
        this.f39425F.setOnClickListener(this);
        this.f39454z.setOnClickListener(this);
        this.f39420B.setOnClickListener(this);
        this.f39422D.setOnClickListener(this);
        this.f39421C.setOnClickListener(this);
        this.f39427G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: r5 */
    private void m61270r5() {
        this.f39438M = new C11158c();
    }

    /* JADX INFO: renamed from: s5 */
    private void m61271s5() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f39447V, this.f39448W);
        marginLayoutParams.setMargins(this.f39445T, this.f39446U, 0, 0);
        this.f39454z.setLayoutParams(new RelativeLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public /* synthetic */ void m61272u5(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            Video video = this.f39443R;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f39443R.path).exists()) {
                lsi0.m151578h(R$string.f39125p2);
                m61267o5();
                return;
            }
            this.f39454z.setVisibility(0);
            if (this.f39452k0) {
                this.f39452k0 = false;
                m61236A5(this.f39439N);
            }
            if (NullChecker.m81304b(this.f39451Z)) {
                this.f39451Z.mo129510p();
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15549j) {
            if (NullChecker.m81304b(this.f39451Z)) {
                this.f39451Z.pause();
            }
        } else {
            if (c4319c == C4319c.f15550k) {
                this.f39454z.setVisibility(8);
                return;
            }
            if (c4319c != C4319c.f15552m || this.f39443R == null) {
                return;
            }
            if (NullChecker.m81304b(this.f39451Z)) {
                this.f39451Z.release();
                this.f39451Z = null;
            }
            final File fileM161568b = nv5.m161568b();
            if (NullChecker.m81303a(fileM161568b)) {
                e51.m114774y(new Runnable() { // from class: l.e4l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        rhi.m179367k(fileM161568b);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public /* synthetic */ void m61273v5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f39425F.setEnabled(true);
        if (NullChecker.m81304b(this.f39451Z)) {
            this.f39451Z.mo129510p();
        }
        lsi0.m151578h(R$string.f39118o2);
        m20599s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m61274w5(final int i, final int i2, final String str) {
        e51.m114742G(new Runnable() { // from class: l.c4l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79278a.m61273v5(i, i2, str);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E5 */
    public boolean m61275E5() {
        return this.f39435K != null;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m61276G5() {
        if (this.f39440O == null) {
            MusicVolumeEditView musicVolumeEditView = (MusicVolumeEditView) this.f39433J.inflate();
            this.f39440O = musicVolumeEditView;
            musicVolumeEditView.f39412h = this.f39438M;
            musicVolumeEditView.setDismissListener(new d30() { // from class: l.y3l0
                @Override // p149l.d30
                public final void call() {
                    this.f195830a.m61283z5();
                }
            });
            this.f39440O.m61228i(this.f39424E0, this.f39426F0);
        }
        this.f39440O.m61229j(m61275E5(), this.f39439N);
        this.f39440O.m61230k();
        m61239D5(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        m61269q5();
        m61271s5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM61277j5 = m61277j5(layoutInflater, viewGroup);
        this.f39454z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11156a());
        return viewM61277j5;
    }

    /* JADX INFO: renamed from: j5 */
    public View m61277j5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g4l0.m124382b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m4l0 m4l0Var) {
        this.f39432I0 = m4l0Var;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m61267o5();
            return;
        }
        VideoInfo videoInfo = (VideoInfo) arguments.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
        this.f39442Q = videoInfo;
        if (NullChecker.m81303a(videoInfo)) {
            this.f39436K0 = !this.f39442Q.hasOriginalSound;
        }
        this.f39443R = (Video) arguments.getParcelable("EXTRA_KEY_VIDEO_DATA");
        this.f39444S = arguments.getBoolean("extra_is_from_album");
        this.f39434J0 = arguments.getBoolean("extra_is_from_video_cut");
        this.f39450Y = arguments.getString("extra_from");
        if (this.f39443R == null) {
            m61267o5();
            return;
        }
        this.f39441P = (ArrayList) arguments.getSerializable("EXTRA_KEY_CAMERA_META_DATA");
        long j = arguments.getLong("extra_start_time", 0L);
        long j2 = arguments.getLong("extra_end_time", 0L);
        if (j != 0 || j2 != 0) {
            this.f39453p0 = new VideoCut(this.f39443R.path, j, j2);
        }
        m61280t5();
        MusicContent musicContent = this.f39443R.playingMusic;
        this.f39435K = musicContent;
        boolean zM81303a = NullChecker.m81303a(musicContent);
        Video video = this.f39443R;
        if (zM81303a) {
            video.osPercent = 0;
            video.psPercent = 50;
        } else {
            video.osPercent = 50;
            video.psPercent = 0;
        }
        File file = new File(this.f39443R.path);
        if (!file.exists() || file.length() <= 0) {
            lsi0.m151578h(R$string.f39144s2);
            m61267o5();
            return;
        }
        this.f39443R.size = (int) file.length();
        if (!vb4.m197675i() || !vb4.m197672f()) {
            m61267o5();
            return;
        }
        p7m p7mVarM157981b = n500.m157981b();
        this.f39451Z = p7mVarM157981b;
        p7mVarM157981b.mo129498d(true);
        this.f39451Z.mo129499e(false);
        this.f39451Z.mo129504j(new kmw() { // from class: l.z3l0
            @Override // p149l.kmw
            /* JADX INFO: renamed from: a */
            public final void mo130269a(int i, int i2, String str) {
                this.f201381a.m61274w5(i, i2, str);
            }
        });
        this.f39451Z.mo129509o(new C11157b());
        if (this.f39442Q == null) {
            this.f39442Q = new VideoInfo();
        }
        this.f39439N = this.f39442Q.musicContent;
        m61266n5();
        m4l0 m4l0Var = this.f39432I0;
        m4l0Var.f131305e = this.f39439N;
        m4l0Var.m153044k0(this.f39441P, this.f39444S, this.f39442Q, this.f39443R, this.f39450Y);
        m61268p5();
        m61270r5();
        File fileM161567a = nv5.m161567a("current_video", "temp");
        if (NullChecker.m81304b(fileM161567a)) {
            this.f39449X = fileM161567a.getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4";
        }
        if (this.f39449X == null) {
            m61267o5();
        }
        v500 v500Var = new v500();
        this.f39430H0 = v500Var;
        Video video2 = this.f39443R;
        v500Var.f179990a = video2.path;
        v500Var.f179994e = video2.osPercent;
        v500Var.f179995f = video2.psPercent;
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(this.f39453p0);
        this.f39430H0.f179996g = videoEffects;
        if (NullChecker.m81303a(this.f39439N)) {
            v500 v500Var2 = this.f39430H0;
            MusicContent musicContent2 = this.f39439N;
            v500Var2.f179991b = musicContent2.path;
            v500Var2.f179992c = musicContent2.startMillTime;
            v500Var2.f179993d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m61279o() {
        m61264l5();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.m81303a(intent)) {
            this.f39438M.mo61020d((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f39425F) {
            view.setEnabled(false);
            m61238C5();
            return;
        }
        if (view == this.f39420B) {
            m61279o();
            return;
        }
        if (view == this.f39423E) {
            m61265m5();
            return;
        }
        if (view == this.f39421C) {
            m61240F5();
        } else if (view == this.f39422D) {
            m61276G5();
        } else if (view == this.f39427G) {
            act().m50458m2();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m61280t5() {
        ebl0.m115505a(this.f39443R);
        Video video = this.f39443R;
        int i = video.width;
        int i2 = video.height;
        int iM208412y0 = xdl0.m208412y0();
        int iM208408w0 = xdl0.m208408w0();
        float f = i;
        float f2 = i2;
        float f3 = iM208412y0;
        float f4 = iM208408w0;
        if (f / f2 >= f3 / f4) {
            this.f39447V = iM208412y0;
            this.f39448W = (int) (f2 * (f3 / f));
        } else {
            this.f39448W = iM208408w0;
            this.f39447V = (int) (f * (f4 / f2));
        }
        this.f39446U = (iM208408w0 - this.f39448W) / 2;
        this.f39445T = (iM208412y0 - this.f39447V) / 2;
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m61281x5() {
        this.f39432I0.m153046m0(this.f39443R.path);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m61282y5() {
        m61239D5(true);
        this.f39427G.setVisibility(0);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m61283z5() {
        m61239D5(true);
    }
}
