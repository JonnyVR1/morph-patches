package com.p000p1.mobile.putong.feed.newui.camera;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import kotlin.Unit;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.k9j;
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
import l.zvf0;
import p007l.cr10;
import p007l.ebl0;
import p007l.f7m;
import p007l.g7m;
import p007l.h7m;
import p007l.n8i;
import p007l.nv5;
import p007l.uzb0;
import rx.subjects.a;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IVVideoEditFrag extends PutongFrag implements View.OnClickListener, s7m<h7m> {

    /* JADX INFO: renamed from: A */
    public ImageView f745A;

    /* JADX INFO: renamed from: B */
    public ImageView f746B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f747C;

    /* JADX INFO: renamed from: D */
    public ImageView f748D;

    /* JADX INFO: renamed from: E */
    public TextView f749E;

    /* JADX INFO: renamed from: F */
    public ConstraintLayout f751F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f752G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f753H;

    /* JADX INFO: renamed from: I */
    public VButton f754I;

    /* JADX INFO: renamed from: J */
    public ViewStub f755J;

    /* JADX INFO: renamed from: K */
    public ViewStub f756K;

    /* JADX INFO: renamed from: L */
    public ViewStub f757L;

    /* JADX INFO: renamed from: M */
    public MusicContent f758M;

    /* JADX INFO: renamed from: N */
    public IVMusicRangeEditView f759N;

    /* JADX INFO: renamed from: O */
    public cr10 f760O;

    /* JADX INFO: renamed from: P */
    public MusicContent f761P;

    /* JADX INFO: renamed from: Q */
    public IVMusicVolumeEditView f762Q;

    /* JADX INFO: renamed from: R */
    public String f763R;

    /* JADX INFO: renamed from: S */
    public Video f764S;

    /* JADX INFO: renamed from: T */
    public String f765T;

    /* JADX INFO: renamed from: U */
    public p7m f766U;

    /* JADX INFO: renamed from: V */
    public boolean f767V;

    /* JADX INFO: renamed from: Z */
    public v500 f771Z;

    /* JADX INFO: renamed from: k0 */
    public h7m f772k0;

    /* JADX INFO: renamed from: z */
    public TextureView f774z;

    /* JADX INFO: renamed from: W */
    public int f768W = 25;

    /* JADX INFO: renamed from: X */
    public int f769X = 25;

    /* JADX INFO: renamed from: Y */
    public boolean f770Y = true;

    /* JADX INFO: renamed from: p0 */
    public boolean f773p0 = true;

    /* JADX INFO: renamed from: E0 */
    public a f750E0 = a.b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$a */
    public class C1989a implements lmw {
        public C1989a() {
        }

        /* JADX INFO: renamed from: a */
        public void m1946a() {
            if (NullChecker.a(IVVideoEditFrag.this.f761P) && IVVideoEditFrag.this.f761P.isFile()) {
                e51.y(new f7m());
            }
            if (IVVideoEditFrag.this.getActivity() == null || IVVideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            IVVideoEditFrag.this.s4();
            IVVideoEditFrag.this.f750E0.onNext(Unit.INSTANCE);
        }

        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$b */
    public class C1990b implements cr10 {
        public C1990b() {
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: a */
        public void mo1947a(int i, int i2) {
            if (IVVideoEditFrag.this.f771Z.a()) {
                IVVideoEditFrag.this.f771Z.c = i;
                IVVideoEditFrag.this.f771Z.d = i2;
                if (NullChecker.b(IVVideoEditFrag.this.f766U)) {
                    IVVideoEditFrag.this.f766U.m(0L, true);
                }
            }
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: b */
        public void mo1948b(int i) {
            if (IVVideoEditFrag.this.f766U == null) {
                return;
            }
            IVVideoEditFrag.this.f769X = i;
            IVVideoEditFrag.this.f766U.i(IVVideoEditFrag.this.f769X / 100.0f);
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: c */
        public void mo1949c(int i) {
            if (IVVideoEditFrag.this.f766U == null) {
                return;
            }
            IVVideoEditFrag.this.f768W = i;
            IVVideoEditFrag.this.f766U.q(i / 100.0f);
        }

        @Override // p007l.cr10
        /* JADX INFO: renamed from: d */
        public void mo1950d(@Nullable MusicContent musicContent) {
            IVVideoEditFrag.this.f761P = musicContent;
            IVVideoEditFrag.this.f772k0.f8621b = musicContent;
            if (NullChecker.a(IVVideoEditFrag.this.f759N)) {
                IVVideoEditFrag.this.f759N.m1868k(IVVideoEditFrag.this.f764S, musicContent, IVVideoEditFrag.this.f764S.length);
            }
            IVVideoEditFrag.this.f767V = true;
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.f749E.setText(iVVideoEditFrag.f761P.name);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$c */
    public class TextureViewSurfaceTextureListenerC1991c implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC1991c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f764S.width, IVVideoEditFrag.this.f764S.height);
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.m1935n5(iVVideoEditFrag.f764S.width, IVVideoEditFrag.this.f764S.height);
            if (NullChecker.b(surfaceTexture)) {
                IVVideoEditFrag.this.f766U.h(surfaceTexture);
            }
            boolean z = IVVideoEditFrag.this.f770Y;
            IVVideoEditFrag iVVideoEditFrag2 = IVVideoEditFrag.this;
            if (z) {
                iVVideoEditFrag2.f770Y = false;
                IVVideoEditFrag.this.f766U.b(IVVideoEditFrag.this.f771Z);
                IVVideoEditFrag.this.f766U.g();
            } else if (iVVideoEditFrag2.f766U.f()) {
                IVVideoEditFrag.this.f766U.g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.a(IVVideoEditFrag.this.f766U)) {
                return false;
            }
            IVVideoEditFrag.this.f766U.a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f764S.width, IVVideoEditFrag.this.f764S.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f764S.width, IVVideoEditFrag.this.f764S.height);
        }
    }

    /* JADX INFO: renamed from: I5 */
    private void m1885I5(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorP = bt0.p(view, "translationY", 0L, 500L, z ? bt0.b : bt0.a, new float[]{z ? view.getHeight() : 0, z ? 0 : view.getHeight()});
        bt0.b(view, animatorP);
        bt0.f(animatorP, new Runnable() { // from class: l.z6m
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: r5 */
    private void m1911r5() {
        new h7m(this).C(this);
    }

    /* JADX INFO: renamed from: s5 */
    private void m1912s5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: w5 */
    private void m1913w5() {
        this.f747C.setOnClickListener(this);
        this.f746B.setOnClickListener(this);
        this.f754I.setOnClickListener(this);
        this.f774z.setOnClickListener(this);
        this.f753H.setOnClickListener(this);
        this.f752G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m1914A5() {
        this.f772k0.m10556g0(this.f765T);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m1915B5(Object obj) {
        e51.G(new Runnable() { // from class: l.d7m
            @Override // java.lang.Runnable
            public final void run() {
                this.f6863a.m1914A5();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m1916C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m1917C5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f754I.setEnabled(true);
        if (NullChecker.b(this.f766U)) {
            this.f766U.p();
        }
        lsi0.h(R$string.f579o2);
        s4();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m1918D5(final int i, final int i2, final String str) {
        e51.G(new Runnable() { // from class: l.y6m
            @Override // java.lang.Runnable
            public final void run() {
                this.f15280a.m1917C5(i, i2, str);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m1919E5() {
        m1925L5(true);
        m1885I5(this.f759N, false);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m1920F5() {
        m1925L5(true);
        m1885I5(this.f762Q, false);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m1921G5(MusicContent musicContent) {
        if (musicContent == null) {
            v500 v500Var = this.f771Z;
            v500Var.b = null;
            v500Var.c = 0;
            v500Var.d = 0;
            this.f766U.i(0.0f);
        } else {
            this.f766U.i(this.f769X / 100.0f);
            v500 v500Var2 = this.f771Z;
            v500Var2.b = musicContent.path;
            v500Var2.c = musicContent.startMillTime;
            v500Var2.d = musicContent.endMillTime;
        }
        if (NullChecker.b(this.f766U)) {
            this.f766U.m(0L, true);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m1922H5() {
        boolean z = this.f773p0;
        this.f773p0 = !z;
        p7m p7mVar = this.f766U;
        if (z) {
            p7mVar.resume();
            m1941u5();
        } else {
            p7mVar.pause();
            m1929P5();
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m1923J5() {
        int[] iArrM12111e = n8i.m12111e(this.f764S);
        this.f766U.k(iArrM12111e[0], iArrM12111e[1], n8i.m12114h(this.f764S), 5242880);
        this.f766U.n(this.f765T);
        p4(R$string.f599r2, true);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m1924K5() {
        File file = new File(this.f764S.path);
        if (file.exists() && file.length() == this.f764S.size) {
            m1923J5();
        } else {
            lsi0.h(R$string.f593q2);
            m1912s5();
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final void m1925L5(boolean z) {
        m1885I5(this.f751F, z);
    }

    /* JADX INFO: renamed from: M5 */
    public boolean m1926M5() {
        return this.f758M != null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m1927N5() {
        if (this.f761P == null || this.f764S == null) {
            lsi0.h(R$string.f474Z1);
            return;
        }
        if (this.f759N == null) {
            IVMusicRangeEditView iVMusicRangeEditView = (IVMusicRangeEditView) this.f756K.inflate();
            this.f759N = iVMusicRangeEditView;
            iVMusicRangeEditView.f726i = this.f760O;
            iVMusicRangeEditView.setDismissListener(new d30() { // from class: l.v6m
                public final void call() {
                    this.f14080a.m1919E5();
                }
            });
            if (NullChecker.b(this.f761P)) {
                IVMusicRangeEditView iVMusicRangeEditView2 = this.f759N;
                Video video = this.f764S;
                iVMusicRangeEditView2.m1868k(video, this.f761P, video.length);
            }
        }
        this.f759N.m1869l();
        m1925L5(false);
        m1885I5(this.f759N, true);
    }

    /* JADX INFO: renamed from: O5 */
    public final void m1928O5() {
        if (this.f761P == null || this.f764S == null) {
            lsi0.h(R$string.f474Z1);
            return;
        }
        if (this.f762Q == null) {
            IVMusicVolumeEditView iVMusicVolumeEditView = (IVMusicVolumeEditView) this.f757L.inflate();
            this.f762Q = iVMusicVolumeEditView;
            iVMusicVolumeEditView.f740g = this.f760O;
            iVMusicVolumeEditView.setDismissListener(new d30() { // from class: l.w6m
                public final void call() {
                    this.f14433a.m1920F5();
                }
            });
        }
        this.f762Q.setCurrentVolumeValue(this.f769X);
        this.f762Q.m1881l(m1926M5(), this.f761P);
        m1925L5(false);
        m1885I5(this.f762Q, true);
    }

    /* JADX INFO: renamed from: P5 */
    public final void m1929P5() {
        this.f745A.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: g4 */
    public void m1930g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m1913w5();
        m1944y5();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM1932l5 = m1932l5(layoutInflater, viewGroup);
        m1933m5();
        return viewM1932l5;
    }

    /* JADX INFO: renamed from: l5 */
    public View m1932l5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g7m.m10425b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m1933m5() {
        this.f774z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1991c());
    }

    /* JADX INFO: renamed from: n4 */
    public void m1934n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m1912s5();
            return;
        }
        this.f763R = arguments.getString("extra_key_video_path");
        this.f761P = arguments.getParcelable("extra_key_music_content");
        Video videoM1940t5 = m1940t5(this.f763R);
        this.f764S = videoM1940t5;
        this.f758M = videoM1940t5.playingMusic;
        videoM1940t5.psPercent = 50;
        File file = new File(this.f764S.path);
        if (!file.exists() || file.length() <= 0) {
            lsi0.h(R$string.f605s2);
            m1912s5();
            return;
        }
        this.f764S.size = (int) file.length();
        p7m p7mVarB = n500.b();
        this.f766U = p7mVarB;
        p7mVarB.d(true);
        this.f766U.e(false);
        this.f766U.j(new kmw() { // from class: l.x6m
            /* JADX INFO: renamed from: a */
            public final void m16018a(int i, int i2, String str) {
                this.f14783a.m1918D5(i, i2, str);
            }
        });
        this.f766U.o(new C1989a());
        m1911r5();
        h7m h7mVar = this.f772k0;
        MusicContent musicContent = this.f761P;
        h7mVar.f8621b = musicContent;
        h7mVar.m10555f0(musicContent, this.f764S);
        m1942v5();
        m1943x5();
        if (NullChecker.b(nv5.m12335a("current_video", "temp"))) {
            this.f765T = k9j.O("mp4").getAbsolutePath();
        }
        if (this.f765T == null) {
            m1912s5();
        }
        v500 v500Var = new v500();
        this.f771Z = v500Var;
        Video video = this.f764S;
        v500Var.a = video.path;
        v500Var.e = video.osPercent;
        v500Var.f = video.psPercent;
        if (NullChecker.a(this.f761P)) {
            v500 v500Var2 = this.f771Z;
            MusicContent musicContent2 = this.f761P;
            v500Var2.b = musicContent2.path;
            v500Var2.c = musicContent2.startMillTime;
            v500Var2.d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: n5 */
    public final void m1935n5(int i, int i2) {
        int i3;
        int i4;
        int width = this.f774z.getWidth();
        int height = this.f774z.getHeight();
        double d = ((double) i2) / ((double) i);
        int i5 = (int) (((double) width) * d);
        if (height > i5) {
            i4 = i5;
            i3 = width;
        } else {
            i3 = (int) (((double) height) / d);
            i4 = height;
        }
        Matrix matrix = new Matrix();
        this.f774z.getTransform(matrix);
        matrix.setScale(i3 / width, i4 / height);
        matrix.postTranslate((width - i3) / 2, (height - i4) / 2);
        this.f774z.setTransform(matrix);
    }

    /* JADX INFO: renamed from: o */
    public boolean m1936o() {
        m1938p5();
        return true;
    }

    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public void m1931i1(h7m h7mVar) {
        this.f772k0 = h7mVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.a(intent)) {
            this.f760O.mo1950d(intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f754I) {
            view.setEnabled(false);
            m1924K5();
            zvf0.r("e_photo_to_video_edit_next", "p_photo_to_video_edit");
            return;
        }
        if (view == this.f746B) {
            m1936o();
            return;
        }
        if (view == this.f747C) {
            m1939q5();
            return;
        }
        if (view == this.f752G) {
            m1927N5();
        } else if (view == this.f753H) {
            m1928O5();
        } else if (view == this.f774z) {
            m1922H5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final void m1938p5() {
        this.f772k0.m10554e0(this.f764S);
        m1912s5();
    }

    /* JADX INFO: renamed from: q5 */
    public final void m1939q5() {
        startActivityForResult(new Intent((Context) getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(uzb0.f13995i, uzb0.f13993g);
    }

    /* JADX INFO: renamed from: t5 */
    public final Video m1940t5(String str) {
        Video video = new Video(0, str);
        ebl0.m9703c(video);
        video.osPercent = 50;
        video.psPercent = 50;
        return video;
    }

    /* JADX INFO: renamed from: u5 */
    public final void m1941u5() {
        if (this.f745A.getAlpha() > 0.0f) {
            this.f745A.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m1942v5() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.a7m
            public final void call(Object obj) {
                this.f5627a.m1945z5((c) obj);
            }
        }));
        duringCreated(this.f750E0.asObservable()).subscribe(new e30() { // from class: l.b7m
            public final void call(Object obj) {
                this.f6168a.m1915B5(obj);
            }
        }, new e30() { // from class: l.c7m
            public final void call(Object obj) {
                CrashHelper.c(new RuntimeException("OnVideoProcessFinished Error", (Throwable) obj));
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m1943x5() {
        this.f760O = new C1990b();
    }

    /* JADX INFO: renamed from: y5 */
    public final void m1944y5() {
        xdl0.Z(new View[]{this.f746B});
        this.f745A.setAlpha(0.0f);
        MusicContent musicContent = this.f761P;
        if (musicContent != null) {
            this.f749E.setText(musicContent.name);
            xdl0.z(this.f749E);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m1945z5(c cVar) {
        if (cVar == c.i) {
            Video video = this.f764S;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f764S.path).exists()) {
                lsi0.h(R$string.f586p2);
                m1912s5();
                return;
            }
            this.f774z.setVisibility(0);
            if (this.f767V) {
                this.f767V = false;
                m1921G5(this.f761P);
            }
            if (NullChecker.b(this.f766U)) {
                this.f766U.p();
                return;
            }
            return;
        }
        if (cVar == c.j) {
            if (NullChecker.b(this.f766U)) {
                this.f766U.pause();
            }
        } else {
            if (cVar == c.k) {
                this.f774z.setVisibility(8);
                return;
            }
            if (cVar != c.m || this.f764S == null) {
                return;
            }
            if (NullChecker.b(this.f766U)) {
                this.f766U.release();
                this.f766U = null;
            }
            final File fileM12336b = nv5.m12336b();
            if (NullChecker.a(fileM12336b)) {
                e51.y(new Runnable() { // from class: l.e7m
                    @Override // java.lang.Runnable
                    public final void run() {
                        rhi.k(fileM12336b);
                    }
                });
            }
        }
    }
}
