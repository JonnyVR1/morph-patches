package com.p051p1.mobile.putong.feed.newui.camera;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import kotlin.Unit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p153l.a8c0;
import p153l.be00;
import p153l.bnl0;
import p153l.cai;
import p153l.ecj;
import p153l.fam;
import p153l.fe00;
import p153l.gt0;
import p153l.i4g0;
import p153l.iam;
import p153l.ikl0;
import p153l.jpw;
import p153l.kpw;
import p153l.kz10;
import p153l.l51;
import p153l.o1j0;
import p153l.psd0;
import p153l.sw5;
import p153l.v9m;
import p153l.w9m;
import p153l.x20;
import p153l.x9m;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class IVVideoEditFrag extends PutongFrag implements View.OnClickListener, iam<x9m> {

    /* JADX INFO: renamed from: A */
    public ImageView f40132A;

    /* JADX INFO: renamed from: B */
    public ImageView f40133B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f40134C;

    /* JADX INFO: renamed from: D */
    public ImageView f40135D;

    /* JADX INFO: renamed from: E */
    public TextView f40136E;

    /* JADX INFO: renamed from: F */
    public ConstraintLayout f40138F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f40139G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f40140H;

    /* JADX INFO: renamed from: I */
    public VButton f40141I;

    /* JADX INFO: renamed from: J */
    public ViewStub f40142J;

    /* JADX INFO: renamed from: K */
    public ViewStub f40143K;

    /* JADX INFO: renamed from: L */
    public ViewStub f40144L;

    /* JADX INFO: renamed from: M */
    public MusicContent f40145M;

    /* JADX INFO: renamed from: N */
    public IVMusicRangeEditView f40146N;

    /* JADX INFO: renamed from: O */
    public kz10 f40147O;

    /* JADX INFO: renamed from: P */
    public MusicContent f40148P;

    /* JADX INFO: renamed from: Q */
    public IVMusicVolumeEditView f40149Q;

    /* JADX INFO: renamed from: R */
    public String f40150R;

    /* JADX INFO: renamed from: S */
    public Video f40151S;

    /* JADX INFO: renamed from: T */
    public String f40152T;

    /* JADX INFO: renamed from: U */
    public fam f40153U;

    /* JADX INFO: renamed from: V */
    public boolean f40154V;

    /* JADX INFO: renamed from: Z */
    public fe00 f40158Z;

    /* JADX INFO: renamed from: k0 */
    public x9m f40159k0;

    /* JADX INFO: renamed from: z */
    public TextureView f40161z;

    /* JADX INFO: renamed from: W */
    public int f40155W = 25;

    /* JADX INFO: renamed from: X */
    public int f40156X = 25;

    /* JADX INFO: renamed from: Y */
    public boolean f40157Y = true;

    /* JADX INFO: renamed from: p0 */
    public boolean f40160p0 = true;

    /* JADX INFO: renamed from: E0 */
    public C22507a f40137E0 = C22507a.m222758b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$a */
    public class C11308a implements kpw {
        public C11308a() {
        }

        @Override // p153l.kpw
        /* JADX INFO: renamed from: a */
        public void mo62200a() {
            if (NullChecker.m82486a(IVVideoEditFrag.this.f40148P) && IVVideoEditFrag.this.f40148P.isFile()) {
                l51.m152919y(new v9m());
            }
            if (IVVideoEditFrag.this.getActivity() == null || IVVideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            IVVideoEditFrag.this.m21598s4();
            IVVideoEditFrag.this.f40137E0.onNext(Unit.INSTANCE);
        }

        @Override // p153l.kpw
        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$b */
    public class C11309b implements kz10 {
        public C11309b() {
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: a */
        public void mo62201a(int i, int i2) {
            if (IVVideoEditFrag.this.f40158Z.m125154a()) {
                IVVideoEditFrag.this.f40158Z.f98535c = i;
                IVVideoEditFrag.this.f40158Z.f98536d = i2;
                if (NullChecker.m82487b(IVVideoEditFrag.this.f40153U)) {
                    IVVideoEditFrag.this.f40153U.mo124760m(0L, true);
                }
            }
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: b */
        public void mo62202b(int i) {
            if (IVVideoEditFrag.this.f40153U == null) {
                return;
            }
            IVVideoEditFrag.this.f40156X = i;
            IVVideoEditFrag.this.f40153U.mo124757i(IVVideoEditFrag.this.f40156X / 100.0f);
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: c */
        public void mo62203c(int i) {
            if (IVVideoEditFrag.this.f40153U == null) {
                return;
            }
            IVVideoEditFrag.this.f40155W = i;
            IVVideoEditFrag.this.f40153U.mo124764q(i / 100.0f);
        }

        @Override // p153l.kz10
        /* JADX INFO: renamed from: d */
        public void mo62204d(@Nullable MusicContent musicContent) {
            IVVideoEditFrag.this.f40148P = musicContent;
            IVVideoEditFrag.this.f40159k0.f192950b = musicContent;
            if (NullChecker.m82486a(IVVideoEditFrag.this.f40146N)) {
                IVVideoEditFrag.this.f40146N.m62126k(IVVideoEditFrag.this.f40151S, musicContent, IVVideoEditFrag.this.f40151S.length);
            }
            IVVideoEditFrag.this.f40154V = true;
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.f40136E.setText(iVVideoEditFrag.f40148P.name);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$c */
    public class TextureViewSurfaceTextureListenerC11310c implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11310c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f40151S.width, IVVideoEditFrag.this.f40151S.height);
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.m62189n5(iVVideoEditFrag.f40151S.width, IVVideoEditFrag.this.f40151S.height);
            if (NullChecker.m82487b(surfaceTexture)) {
                IVVideoEditFrag.this.f40153U.mo124756h(surfaceTexture);
            }
            boolean z = IVVideoEditFrag.this.f40157Y;
            IVVideoEditFrag iVVideoEditFrag2 = IVVideoEditFrag.this;
            if (z) {
                iVVideoEditFrag2.f40157Y = false;
                IVVideoEditFrag.this.f40153U.mo124750b(IVVideoEditFrag.this.f40158Z);
                IVVideoEditFrag.this.f40153U.mo124755g();
            } else if (iVVideoEditFrag2.f40153U.mo124754f()) {
                IVVideoEditFrag.this.f40153U.mo124755g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m82486a(IVVideoEditFrag.this.f40153U)) {
                return false;
            }
            IVVideoEditFrag.this.f40153U.mo124749a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f40151S.width, IVVideoEditFrag.this.f40151S.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f40151S.width, IVVideoEditFrag.this.f40151S.height);
        }
    }

    /* JADX INFO: renamed from: I5 */
    private void m62143I5(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM132170p = gt0.m132170p(view, "translationY", 0L, 500L, z ? gt0.f106347b : gt0.f106346a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        gt0.m132156b(view, animatorM132170p);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.p9m
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, z);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: r5 */
    private void m62169r5() {
        new x9m(this).mo52715C(this);
    }

    /* JADX INFO: renamed from: s5 */
    private void m62170s5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.m82487b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: w5 */
    private void m62171w5() {
        this.f40134C.setOnClickListener(this);
        this.f40133B.setOnClickListener(this);
        this.f40141I.setOnClickListener(this);
        this.f40161z.setOnClickListener(this);
        this.f40140H.setOnClickListener(this);
        this.f40139G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m62172A5() {
        this.f40159k0.m209805g0(this.f40152T);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m62173B5(Object obj) {
        l51.m152887G(new Runnable() { // from class: l.t9m
            @Override // java.lang.Runnable
            public final void run() {
                this.f172649a.m62172A5();
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m62174C5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f40141I.setEnabled(true);
        if (NullChecker.m82487b(this.f40153U)) {
            this.f40153U.mo124763p();
        }
        o1j0.m165634h(R$string.f39966o2);
        m21598s4();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m62175D5(final int i, final int i2, final String str) {
        l51.m152887G(new Runnable() { // from class: l.o9m
            @Override // java.lang.Runnable
            public final void run() {
                this.f145609a.m62174C5(i, i2, str);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m62176E5() {
        m62182L5(true);
        m62143I5(this.f40146N, false);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m62177F5() {
        m62182L5(true);
        m62143I5(this.f40149Q, false);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m62178G5(MusicContent musicContent) {
        if (musicContent == null) {
            fe00 fe00Var = this.f40158Z;
            fe00Var.f98534b = null;
            fe00Var.f98535c = 0;
            fe00Var.f98536d = 0;
            this.f40153U.mo124757i(0.0f);
        } else {
            this.f40153U.mo124757i(this.f40156X / 100.0f);
            fe00 fe00Var2 = this.f40158Z;
            fe00Var2.f98534b = musicContent.path;
            fe00Var2.f98535c = musicContent.startMillTime;
            fe00Var2.f98536d = musicContent.endMillTime;
        }
        if (NullChecker.m82487b(this.f40153U)) {
            this.f40153U.mo124760m(0L, true);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m62179H5() {
        boolean z = this.f40160p0;
        this.f40160p0 = !z;
        fam famVar = this.f40153U;
        if (z) {
            famVar.resume();
            m62195u5();
        } else {
            famVar.pause();
            m62186P5();
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m62180J5() {
        int[] iArrM108497e = cai.m108497e(this.f40151S);
        this.f40153U.mo124759k(iArrM108497e[0], iArrM108497e[1], cai.m108500h(this.f40151S), 5242880);
        this.f40153U.mo124761n(this.f40152T);
        m21595p4(R$string.f39986r2, true);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m62181K5() {
        File file = new File(this.f40151S.path);
        if (file.exists() && file.length() == this.f40151S.size) {
            m62180J5();
        } else {
            o1j0.m165634h(R$string.f39980q2);
            m62170s5();
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final void m62182L5(boolean z) {
        m62143I5(this.f40138F, z);
    }

    /* JADX INFO: renamed from: M5 */
    public boolean m62183M5() {
        return this.f40145M != null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m62184N5() {
        if (this.f40148P == null || this.f40151S == null) {
            o1j0.m165634h(R$string.f39861Z1);
            return;
        }
        if (this.f40146N == null) {
            IVMusicRangeEditView iVMusicRangeEditView = (IVMusicRangeEditView) this.f40143K.inflate();
            this.f40146N = iVMusicRangeEditView;
            iVMusicRangeEditView.f40113i = this.f40147O;
            iVMusicRangeEditView.setDismissListener(new x20() { // from class: l.l9m
                @Override // p153l.x20
                public final void call() {
                    this.f130613a.m62176E5();
                }
            });
            if (NullChecker.m82487b(this.f40148P)) {
                IVMusicRangeEditView iVMusicRangeEditView2 = this.f40146N;
                Video video = this.f40151S;
                iVMusicRangeEditView2.m62126k(video, this.f40148P, video.length);
            }
        }
        this.f40146N.m62127l();
        m62182L5(false);
        m62143I5(this.f40146N, true);
    }

    /* JADX INFO: renamed from: O5 */
    public final void m62185O5() {
        if (this.f40148P == null || this.f40151S == null) {
            o1j0.m165634h(R$string.f39861Z1);
            return;
        }
        if (this.f40149Q == null) {
            IVMusicVolumeEditView iVMusicVolumeEditView = (IVMusicVolumeEditView) this.f40144L.inflate();
            this.f40149Q = iVMusicVolumeEditView;
            iVMusicVolumeEditView.f40127g = this.f40147O;
            iVMusicVolumeEditView.setDismissListener(new x20() { // from class: l.m9m
                @Override // p153l.x20
                public final void call() {
                    this.f135425a.m62177F5();
                }
            });
        }
        this.f40149Q.setCurrentVolumeValue(this.f40156X);
        this.f40149Q.m62139l(m62183M5(), this.f40148P);
        m62182L5(false);
        m62143I5(this.f40149Q, true);
    }

    /* JADX INFO: renamed from: P5 */
    public final void m62186P5() {
        this.f40132A.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        m62171w5();
        m62198y5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM62187l5 = m62187l5(layoutInflater, viewGroup);
        m62188m5();
        return viewM62187l5;
    }

    /* JADX INFO: renamed from: l5 */
    public View m62187l5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w9m.m205604b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m62188m5() {
        this.f40161z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11310c());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m62170s5();
            return;
        }
        this.f40150R = arguments.getString("extra_key_video_path");
        this.f40148P = (MusicContent) arguments.getParcelable("extra_key_music_content");
        Video videoM62194t5 = m62194t5(this.f40150R);
        this.f40151S = videoM62194t5;
        this.f40145M = videoM62194t5.playingMusic;
        videoM62194t5.psPercent = 50;
        File file = new File(this.f40151S.path);
        if (!file.exists() || file.length() <= 0) {
            o1j0.m165634h(R$string.f39992s2);
            m62170s5();
            return;
        }
        this.f40151S.size = (int) file.length();
        fam famVarM103675b = be00.m103675b();
        this.f40153U = famVarM103675b;
        famVarM103675b.mo124752d(true);
        this.f40153U.mo124753e(false);
        this.f40153U.mo124758j(new jpw() { // from class: l.n9m
            @Override // p153l.jpw
            /* JADX INFO: renamed from: a */
            public final void mo115360a(int i, int i2, String str) {
                this.f140925a.m62175D5(i, i2, str);
            }
        });
        this.f40153U.mo124762o(new C11308a());
        m62169r5();
        x9m x9mVar = this.f40159k0;
        MusicContent musicContent = this.f40148P;
        x9mVar.f192950b = musicContent;
        x9mVar.m209804f0(musicContent, this.f40151S);
        m62196v5();
        m62197x5();
        if (NullChecker.m82487b(sw5.m188238a("current_video", "temp"))) {
            this.f40152T = ecj.m120381O("mp4").getAbsolutePath();
        }
        if (this.f40152T == null) {
            m62170s5();
        }
        fe00 fe00Var = new fe00();
        this.f40158Z = fe00Var;
        Video video = this.f40151S;
        fe00Var.f98533a = video.path;
        fe00Var.f98537e = video.osPercent;
        fe00Var.f98538f = video.psPercent;
        if (NullChecker.m82486a(this.f40148P)) {
            fe00 fe00Var2 = this.f40158Z;
            MusicContent musicContent2 = this.f40148P;
            fe00Var2.f98534b = musicContent2.path;
            fe00Var2.f98535c = musicContent2.startMillTime;
            fe00Var2.f98536d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: n5 */
    public final void m62189n5(int i, int i2) {
        int i3;
        int i4;
        int width = this.f40161z.getWidth();
        int height = this.f40161z.getHeight();
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
        this.f40161z.getTransform(matrix);
        matrix.setScale(i3 / width, i4 / height);
        matrix.postTranslate((width - i3) / 2, (height - i4) / 2);
        this.f40161z.setTransform(matrix);
    }

    /* JADX INFO: renamed from: o */
    public boolean m62190o() {
        m62192p5();
        return true;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x9m x9mVar) {
        this.f40159k0 = x9mVar;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.m82486a(intent)) {
            this.f40147O.mo62204d((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f40141I) {
            view.setEnabled(false);
            m62181K5();
            i4g0.m138520r("e_photo_to_video_edit_next", "p_photo_to_video_edit");
            return;
        }
        if (view == this.f40133B) {
            m62190o();
            return;
        }
        if (view == this.f40134C) {
            m62193q5();
            return;
        }
        if (view == this.f40139G) {
            m62184N5();
        } else if (view == this.f40140H) {
            m62185O5();
        } else if (view == this.f40161z) {
            m62179H5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final void m62192p5() {
        this.f40159k0.m209803e0(this.f40151S);
        m62170s5();
    }

    /* JADX INFO: renamed from: q5 */
    public final void m62193q5() {
        startActivityForResult(new Intent(getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(a8c0.f68909i, a8c0.f68907g);
    }

    /* JADX INFO: renamed from: t5 */
    public final Video m62194t5(String str) {
        Video video = new Video(0, str);
        ikl0.m140411c(video);
        video.osPercent = 50;
        video.psPercent = 50;
        return video;
    }

    /* JADX INFO: renamed from: u5 */
    public final void m62195u5() {
        if (this.f40132A.getAlpha() > 0.0f) {
            this.f40132A.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m62196v5() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.q9m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156247a.m62199z5((C4470c) obj);
            }
        }));
        duringCreated((C22421c) this.f40137E0.asObservable()).subscribe(new y20() { // from class: l.r9m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161835a.m62173B5(obj);
            }
        }, new y20() { // from class: l.s9m
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c(new RuntimeException("OnVideoProcessFinished Error", (Throwable) obj));
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m62197x5() {
        this.f40147O = new C11309b();
    }

    /* JADX INFO: renamed from: y5 */
    public final void m62198y5() {
        bnl0.m105542Z(this.f40133B);
        this.f40132A.setAlpha(0.0f);
        MusicContent musicContent = this.f40148P;
        if (musicContent != null) {
            this.f40136E.setText(musicContent.name);
            bnl0.m105593z(this.f40136E);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m62199z5(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            Video video = this.f40151S;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f40151S.path).exists()) {
                o1j0.m165634h(R$string.f39973p2);
                m62170s5();
                return;
            }
            this.f40161z.setVisibility(0);
            if (this.f40154V) {
                this.f40154V = false;
                m62178G5(this.f40148P);
            }
            if (NullChecker.m82487b(this.f40153U)) {
                this.f40153U.mo124763p();
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16268j) {
            if (NullChecker.m82487b(this.f40153U)) {
                this.f40153U.pause();
            }
        } else {
            if (c4470c == C4470c.f16269k) {
                this.f40161z.setVisibility(8);
                return;
            }
            if (c4470c != C4470c.f16271m || this.f40151S == null) {
                return;
            }
            if (NullChecker.m82487b(this.f40153U)) {
                this.f40153U.release();
                this.f40153U = null;
            }
            final File fileM188239b = sw5.m188239b();
            if (NullChecker.m82486a(fileM188239b)) {
                l51.m152919y(new Runnable() { // from class: l.u9m
                    @Override // java.lang.Runnable
                    public final void run() {
                        oki.m168023k(fileM188239b);
                    }
                });
            }
        }
    }
}
