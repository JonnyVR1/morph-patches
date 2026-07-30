package com.p000p1.mobile.putong.feed.newui.camera;

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
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.e51;
import l.kmw;
import l.lmw;
import l.lsi0;
import l.mkd0;
import l.n500;
import l.p7m;
import l.rhi;
import l.s7m;
import l.v500;
import l.xdl0;
import p007l.cr10;
import p007l.ebl0;
import p007l.f7m;
import p007l.g4l0;
import p007l.m4l0;
import p007l.n8i;
import p007l.nv5;
import p007l.uzb0;
import p007l.vb4;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VideoEditFrag extends PutongFrag implements View.OnClickListener, s7m<m4l0> {

    /* JADX INFO: renamed from: A */
    public ImageView f880A;

    /* JADX INFO: renamed from: B */
    public ImageView f881B;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f882C;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f883D;

    /* JADX INFO: renamed from: E */
    public CameraMenuView f884E;

    /* JADX INFO: renamed from: F */
    public VButton f886F;

    /* JADX INFO: renamed from: G */
    public VText f888G;

    /* JADX INFO: renamed from: H */
    public ViewStub f890H;

    /* JADX INFO: renamed from: H0 */
    public v500 f891H0;

    /* JADX INFO: renamed from: I */
    public ViewStub f892I;

    /* JADX INFO: renamed from: I0 */
    public m4l0 f893I0;

    /* JADX INFO: renamed from: J */
    public ViewStub f894J;

    /* JADX INFO: renamed from: J0 */
    public boolean f895J0;

    /* JADX INFO: renamed from: K */
    public MusicContent f896K;

    /* JADX INFO: renamed from: K0 */
    public boolean f897K0;

    /* JADX INFO: renamed from: L */
    public MusicRangeEditView f898L;

    /* JADX INFO: renamed from: M */
    public cr10 f899M;

    /* JADX INFO: renamed from: N */
    public MusicContent f900N;

    /* JADX INFO: renamed from: O */
    public MusicVolumeEditView f901O;

    /* JADX INFO: renamed from: P */
    public ArrayList<MediaMeta> f902P;

    /* JADX INFO: renamed from: Q */
    public VideoInfo f903Q;

    /* JADX INFO: renamed from: R */
    public Video f904R;

    /* JADX INFO: renamed from: S */
    public boolean f905S;

    /* JADX INFO: renamed from: X */
    public String f910X;

    /* JADX INFO: renamed from: Y */
    public String f911Y;

    /* JADX INFO: renamed from: Z */
    public p7m f912Z;

    /* JADX INFO: renamed from: k0 */
    public boolean f913k0;

    /* JADX INFO: renamed from: p0 */
    public VideoCut f914p0;

    /* JADX INFO: renamed from: z */
    public TextureView f915z;

    /* JADX INFO: renamed from: T */
    public int f906T = 0;

    /* JADX INFO: renamed from: U */
    public int f907U = 0;

    /* JADX INFO: renamed from: V */
    public int f908V = 0;

    /* JADX INFO: renamed from: W */
    public int f909W = 0;

    /* JADX INFO: renamed from: E0 */
    public int f885E0 = 25;

    /* JADX INFO: renamed from: F0 */
    public int f887F0 = 25;

    /* JADX INFO: renamed from: G0 */
    public boolean f889G0 = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$a */
    public class TextureViewSurfaceTextureListenerC2000a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC2000a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f904R.width, VideoEditFrag.this.f904R.height);
            if (NullChecker.b(surfaceTexture)) {
                VideoEditFrag.this.f912Z.h(surfaceTexture);
            }
            boolean z = VideoEditFrag.this.f889G0;
            VideoEditFrag videoEditFrag = VideoEditFrag.this;
            if (z) {
                videoEditFrag.f889G0 = false;
                VideoEditFrag.this.f912Z.b(VideoEditFrag.this.f891H0);
                VideoEditFrag.this.f912Z.g();
            } else if (videoEditFrag.f912Z.f()) {
                VideoEditFrag.this.f912Z.g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.a(VideoEditFrag.this.f912Z)) {
                return false;
            }
            VideoEditFrag.this.f912Z.a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f904R.width, VideoEditFrag.this.f904R.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(VideoEditFrag.this.f904R.width, VideoEditFrag.this.f904R.height);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$b */
    public class C2001b implements lmw {
        public C2001b() {
        }

        /* JADX INFO: renamed from: a */
        public void m2225a() {
            if (NullChecker.a(VideoEditFrag.this.f900N) && VideoEditFrag.this.f900N.isFile()) {
                e51.y(new f7m());
            }
            if (VideoEditFrag.this.getActivity() == null || VideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            e51.G(new Runnable() { // from class: l.f4l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7985a.m2226c();
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m2226c() {
            VideoEditFrag.this.f893I0.m11813m0(VideoEditFrag.this.f910X);
        }

        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.VideoEditFrag$c */
    public class C2002c implements cr10 {
        public C2002c() {
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: a */
        public void mo1947a(int i, int i2) {
            if (VideoEditFrag.this.f891H0.a()) {
                VideoEditFrag.this.f897K0 = true;
                VideoEditFrag.this.f891H0.c = i;
                VideoEditFrag.this.f891H0.d = i2;
                if (NullChecker.b(VideoEditFrag.this.f912Z)) {
                    VideoEditFrag.this.f912Z.m(0L, true);
                }
            }
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: b */
        public void mo1948b(int i) {
            VideoEditFrag.this.f897K0 = true;
            if (VideoEditFrag.this.f912Z == null) {
                return;
            }
            VideoEditFrag.this.f887F0 = i;
            VideoEditFrag.this.f912Z.i(VideoEditFrag.this.f887F0 / 100.0f);
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: c */
        public void mo1949c(int i) {
            VideoEditFrag.this.f897K0 = true;
            if (VideoEditFrag.this.f912Z == null) {
                return;
            }
            VideoEditFrag.this.f885E0 = i;
            VideoEditFrag.this.f912Z.q(i / 100.0f);
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: d */
        public void mo1950d(@Nullable MusicContent musicContent) {
            VideoEditFrag.this.f897K0 = true;
            VideoEditFrag.this.f900N = musicContent;
            VideoEditFrag.this.f893I0.f10228e = musicContent;
            if (NullChecker.a(VideoEditFrag.this.f898L)) {
                VideoCut videoCut = VideoEditFrag.this.f914p0;
                VideoEditFrag videoEditFrag = VideoEditFrag.this;
                if (videoCut == null) {
                    videoEditFrag.f898L.m2154i(VideoEditFrag.this.f904R, musicContent, VideoEditFrag.this.f904R.length);
                } else {
                    videoEditFrag.f898L.m2154i(VideoEditFrag.this.f904R, musicContent, VideoEditFrag.this.f914p0.getEnd() - VideoEditFrag.this.f914p0.getStart());
                }
            }
            VideoEditFrag.this.f913k0 = true;
        }
    }

    /* JADX INFO: renamed from: A5 */
    private void m2172A5(MusicContent musicContent) {
        if (musicContent == null) {
            v500 v500Var = this.f891H0;
            v500Var.b = null;
            v500Var.c = 0;
            v500Var.d = 0;
            this.f912Z.i(0.0f);
        } else {
            this.f912Z.i(this.f887F0 / 100.0f);
            v500 v500Var2 = this.f891H0;
            v500Var2.b = musicContent.path;
            v500Var2.c = musicContent.startMillTime;
            v500Var2.d = musicContent.endMillTime;
        }
        if (NullChecker.b(this.f912Z)) {
            this.f912Z.m(0L, true);
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m2173B5() {
        int[] iArrM12111e = n8i.m12111e(this.f904R);
        this.f912Z.k(iArrM12111e[0], iArrM12111e[1], n8i.m12114h(this.f904R), 5242880);
        this.f912Z.n(this.f910X);
        p4(R$string.f599r2, true);
    }

    /* JADX INFO: renamed from: C5 */
    private void m2174C5() {
        File file = new File(this.f904R.path);
        if (!file.exists() || file.length() != this.f904R.size) {
            lsi0.h(R$string.f593q2);
            m2203o5();
        } else if (this.f895J0 || this.f897K0) {
            m2173B5();
        } else {
            if (getActivity() == null || getActivity().isFinishing()) {
                return;
            }
            e51.G(new Runnable() { // from class: l.b4l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5929a.m2221x5();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D5 */
    private void m2175D5(boolean z) {
        xdl0.M(this.f886F, z);
        xdl0.M(this.f884E, z);
        xdl0.M(this.f883D, z);
        xdl0.M(this.f882C, z);
    }

    /* JADX INFO: renamed from: F5 */
    private void m2176F5() {
        if (this.f900N == null || this.f904R == null) {
            lsi0.h(R$string.f474Z1);
            return;
        }
        if (this.f898L == null) {
            MusicRangeEditView musicRangeEditView = (MusicRangeEditView) this.f892I.inflate();
            this.f898L = musicRangeEditView;
            musicRangeEditView.f858d = this.f899M;
            musicRangeEditView.setDismissListener(new d30() { // from class: l.a4l0
                public final void call() {
                    this.f5584a.m2222y5();
                }
            });
            if (NullChecker.b(this.f900N)) {
                VideoCut videoCut = this.f914p0;
                MusicRangeEditView musicRangeEditView2 = this.f898L;
                if (videoCut == null) {
                    Video video = this.f904R;
                    musicRangeEditView2.m2154i(video, this.f900N, video.length);
                } else {
                    musicRangeEditView2.m2154i(this.f904R, this.f900N, videoCut.getEnd() - this.f914p0.getStart());
                }
            }
        }
        this.f888G.setVisibility(8);
        this.f898L.m2155j();
        m2175D5(false);
    }

    /* JADX INFO: renamed from: l5 */
    private void m2200l5() {
        this.f893I0.m11810i0(this.f904R);
        m2203o5();
    }

    /* JADX INFO: renamed from: m5 */
    private void m2201m5() {
        startActivityForResult(new Intent((Context) getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(uzb0.f13995i, uzb0.f13993g);
    }

    /* JADX INFO: renamed from: n5 */
    private void m2202n5() {
        new m4l0(this).C(this);
    }

    /* JADX INFO: renamed from: o5 */
    private void m2203o5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: p5 */
    private void m2204p5() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.d4l0
            public final void call(Object obj) {
                this.f6821a.m2208u5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q5 */
    private void m2205q5() {
        this.f884E.setOnClickListener(this);
        this.f886F.setOnClickListener(this);
        this.f915z.setOnClickListener(this);
        this.f881B.setOnClickListener(this);
        this.f883D.setOnClickListener(this);
        this.f882C.setOnClickListener(this);
        this.f888G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: r5 */
    private void m2206r5() {
        this.f899M = new C2002c();
    }

    /* JADX INFO: renamed from: s5 */
    private void m2207s5() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f908V, this.f909W);
        marginLayoutParams.setMargins(this.f906T, this.f907U, 0, 0);
        this.f915z.setLayoutParams(new RelativeLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public /* synthetic */ void m2208u5(c cVar) {
        if (cVar == c.i) {
            Video video = this.f904R;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f904R.path).exists()) {
                lsi0.h(R$string.f586p2);
                m2203o5();
                return;
            }
            this.f915z.setVisibility(0);
            if (this.f913k0) {
                this.f913k0 = false;
                m2172A5(this.f900N);
            }
            if (NullChecker.b(this.f912Z)) {
                this.f912Z.p();
                return;
            }
            return;
        }
        if (cVar == c.j) {
            if (NullChecker.b(this.f912Z)) {
                this.f912Z.pause();
            }
        } else {
            if (cVar == c.k) {
                this.f915z.setVisibility(8);
                return;
            }
            if (cVar != c.m || this.f904R == null) {
                return;
            }
            if (NullChecker.b(this.f912Z)) {
                this.f912Z.release();
                this.f912Z = null;
            }
            final File fileM12336b = nv5.m12336b();
            if (NullChecker.a(fileM12336b)) {
                e51.y(new Runnable() { // from class: l.e4l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        rhi.k(fileM12336b);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public /* synthetic */ void m2209v5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f886F.setEnabled(true);
        if (NullChecker.b(this.f912Z)) {
            this.f912Z.p();
        }
        lsi0.h(R$string.f579o2);
        s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m2210w5(final int i, final int i2, final String str) {
        e51.G(new Runnable() { // from class: l.c4l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6534a.m2209v5(i, i2, str);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2211C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E5 */
    public boolean m2212E5() {
        return this.f896K != null;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m2213G5() {
        if (this.f901O == null) {
            MusicVolumeEditView musicVolumeEditView = (MusicVolumeEditView) this.f894J.inflate();
            this.f901O = musicVolumeEditView;
            musicVolumeEditView.f873h = this.f899M;
            musicVolumeEditView.setDismissListener(new d30() { // from class: l.y3l0
                public final void call() {
                    this.f15246a.m2223z5();
                }
            });
            this.f901O.m2164i(this.f885E0, this.f887F0);
        }
        this.f901O.m2165j(m2212E5(), this.f900N);
        this.f901O.m2166k();
        m2175D5(false);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: g4 */
    public void m2214g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m2205q5();
        m2207s5();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2216j5 = m2216j5(layoutInflater, viewGroup);
        this.f915z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2000a());
        return viewM2216j5;
    }

    /* JADX INFO: renamed from: j5 */
    public View m2216j5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g4l0.m10415b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5, reason: merged with bridge method [inline-methods] */
    public void m2215i1(m4l0 m4l0Var) {
        this.f893I0 = m4l0Var;
    }

    /* JADX INFO: renamed from: n4 */
    public void m2218n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m2203o5();
            return;
        }
        VideoInfo videoInfo = (VideoInfo) arguments.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
        this.f903Q = videoInfo;
        if (NullChecker.a(videoInfo)) {
            this.f897K0 = !this.f903Q.hasOriginalSound;
        }
        this.f904R = (Video) arguments.getParcelable("EXTRA_KEY_VIDEO_DATA");
        this.f905S = arguments.getBoolean("extra_is_from_album");
        this.f895J0 = arguments.getBoolean("extra_is_from_video_cut");
        this.f911Y = arguments.getString("extra_from");
        if (this.f904R == null) {
            m2203o5();
            return;
        }
        this.f902P = (ArrayList) arguments.getSerializable("EXTRA_KEY_CAMERA_META_DATA");
        long j = arguments.getLong("extra_start_time", 0L);
        long j2 = arguments.getLong("extra_end_time", 0L);
        if (j != 0 || j2 != 0) {
            this.f914p0 = new VideoCut(this.f904R.path, j, j2);
        }
        m2220t5();
        MusicContent musicContent = this.f904R.playingMusic;
        this.f896K = musicContent;
        boolean zA = NullChecker.a(musicContent);
        Video video = this.f904R;
        if (zA) {
            video.osPercent = 0;
            video.psPercent = 50;
        } else {
            video.osPercent = 50;
            video.psPercent = 0;
        }
        File file = new File(this.f904R.path);
        if (!file.exists() || file.length() <= 0) {
            lsi0.h(R$string.f605s2);
            m2203o5();
            return;
        }
        this.f904R.size = (int) file.length();
        if (!vb4.m15410i() || !vb4.m15407f()) {
            m2203o5();
            return;
        }
        p7m p7mVarB = n500.b();
        this.f912Z = p7mVarB;
        p7mVarB.d(true);
        this.f912Z.e(false);
        this.f912Z.j(new kmw() { // from class: l.z3l0
            /* JADX INFO: renamed from: a */
            public final void m17212a(int i, int i2, String str) {
                this.f15580a.m2210w5(i, i2, str);
            }
        });
        this.f912Z.o(new C2001b());
        if (this.f903Q == null) {
            this.f903Q = new VideoInfo();
        }
        this.f900N = this.f903Q.musicContent;
        m2202n5();
        m4l0 m4l0Var = this.f893I0;
        m4l0Var.f10228e = this.f900N;
        m4l0Var.m11811k0(this.f902P, this.f905S, this.f903Q, this.f904R, this.f911Y);
        m2204p5();
        m2206r5();
        File fileM12335a = nv5.m12335a("current_video", "temp");
        if (NullChecker.b(fileM12335a)) {
            this.f910X = fileM12335a.getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4";
        }
        if (this.f910X == null) {
            m2203o5();
        }
        v500 v500Var = new v500();
        this.f891H0 = v500Var;
        Video video2 = this.f904R;
        v500Var.a = video2.path;
        v500Var.e = video2.osPercent;
        v500Var.f = video2.psPercent;
        VideoEffects videoEffects = new VideoEffects();
        videoEffects.setVideoCuts(new VideoCut[]{this.f914p0});
        this.f891H0.g = videoEffects;
        if (NullChecker.a(this.f900N)) {
            v500 v500Var2 = this.f891H0;
            MusicContent musicContent2 = this.f900N;
            v500Var2.b = musicContent2.path;
            v500Var2.c = musicContent2.startMillTime;
            v500Var2.d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m2219o() {
        m2200l5();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.a(intent)) {
            this.f899M.mo1950d((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f886F) {
            view.setEnabled(false);
            m2174C5();
            return;
        }
        if (view == this.f881B) {
            m2219o();
            return;
        }
        if (view == this.f884E) {
            m2201m5();
            return;
        }
        if (view == this.f882C) {
            m2176F5();
        } else if (view == this.f883D) {
            m2213G5();
        } else if (view == this.f888G) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m2220t5() {
        ebl0.m9701a(this.f904R);
        Video video = this.f904R;
        int i = video.width;
        int i2 = video.height;
        int iY0 = xdl0.y0();
        int iW0 = xdl0.w0();
        float f = i;
        float f2 = i2;
        float f3 = iY0;
        float f4 = iW0;
        if (f / f2 >= f3 / f4) {
            this.f908V = iY0;
            this.f909W = (int) (f2 * (f3 / f));
        } else {
            this.f909W = iW0;
            this.f908V = (int) (f * (f4 / f2));
        }
        this.f907U = (iW0 - this.f909W) / 2;
        this.f906T = (iY0 - this.f908V) / 2;
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m2221x5() {
        this.f893I0.m11813m0(this.f904R.path);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m2222y5() {
        m2175D5(true);
        this.f888G.setVisibility(0);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m2223z5() {
        m2175D5(true);
    }
}
