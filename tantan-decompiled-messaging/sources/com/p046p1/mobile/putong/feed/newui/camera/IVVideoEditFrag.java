package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.helper.exception.VideoEditProcessErrorException;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import kotlin.Unit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p149l.bt0;
import p149l.cr10;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ebl0;
import p149l.f7m;
import p149l.g7m;
import p149l.h7m;
import p149l.k9j;
import p149l.kmw;
import p149l.lmw;
import p149l.lsi0;
import p149l.mkd0;
import p149l.n500;
import p149l.n8i;
import p149l.nv5;
import p149l.p7m;
import p149l.s7m;
import p149l.uzb0;
import p149l.v500;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class IVVideoEditFrag extends PutongFrag implements View.OnClickListener, s7m<h7m> {

    /* JADX INFO: renamed from: A */
    public ImageView f39284A;

    /* JADX INFO: renamed from: B */
    public ImageView f39285B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f39286C;

    /* JADX INFO: renamed from: D */
    public ImageView f39287D;

    /* JADX INFO: renamed from: E */
    public TextView f39288E;

    /* JADX INFO: renamed from: F */
    public ConstraintLayout f39290F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f39291G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f39292H;

    /* JADX INFO: renamed from: I */
    public VButton f39293I;

    /* JADX INFO: renamed from: J */
    public ViewStub f39294J;

    /* JADX INFO: renamed from: K */
    public ViewStub f39295K;

    /* JADX INFO: renamed from: L */
    public ViewStub f39296L;

    /* JADX INFO: renamed from: M */
    public MusicContent f39297M;

    /* JADX INFO: renamed from: N */
    public IVMusicRangeEditView f39298N;

    /* JADX INFO: renamed from: O */
    public cr10 f39299O;

    /* JADX INFO: renamed from: P */
    public MusicContent f39300P;

    /* JADX INFO: renamed from: Q */
    public IVMusicVolumeEditView f39301Q;

    /* JADX INFO: renamed from: R */
    public String f39302R;

    /* JADX INFO: renamed from: S */
    public Video f39303S;

    /* JADX INFO: renamed from: T */
    public String f39304T;

    /* JADX INFO: renamed from: U */
    public p7m f39305U;

    /* JADX INFO: renamed from: V */
    public boolean f39306V;

    /* JADX INFO: renamed from: Z */
    public v500 f39310Z;

    /* JADX INFO: renamed from: k0 */
    public h7m f39311k0;

    /* JADX INFO: renamed from: z */
    public TextureView f39313z;

    /* JADX INFO: renamed from: W */
    public int f39307W = 25;

    /* JADX INFO: renamed from: X */
    public int f39308X = 25;

    /* JADX INFO: renamed from: Y */
    public boolean f39309Y = true;

    /* JADX INFO: renamed from: p0 */
    public boolean f39312p0 = true;

    /* JADX INFO: renamed from: E0 */
    public C22392a f39289E0 = C22392a.m221512b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$a */
    public class C11145a implements lmw {
        public C11145a() {
        }

        @Override // p149l.lmw
        /* JADX INFO: renamed from: a */
        public void mo61016a() {
            if (NullChecker.m81303a(IVVideoEditFrag.this.f39300P) && IVVideoEditFrag.this.f39300P.isFile()) {
                e51.m114774y(new f7m());
            }
            if (IVVideoEditFrag.this.getActivity() == null || IVVideoEditFrag.this.getActivity().isFinishing()) {
                return;
            }
            IVVideoEditFrag.this.m20599s4();
            IVVideoEditFrag.this.f39289E0.onNext(Unit.INSTANCE);
        }

        @Override // p149l.lmw
        public void onProcessProgress(float f) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$b */
    public class C11146b implements cr10 {
        public C11146b() {
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: a */
        public void mo61017a(int i, int i2) {
            if (IVVideoEditFrag.this.f39310Z.m197095a()) {
                IVVideoEditFrag.this.f39310Z.f179992c = i;
                IVVideoEditFrag.this.f39310Z.f179993d = i2;
                if (NullChecker.m81304b(IVVideoEditFrag.this.f39305U)) {
                    IVVideoEditFrag.this.f39305U.mo129507m(0L, true);
                }
            }
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: b */
        public void mo61018b(int i) {
            if (IVVideoEditFrag.this.f39305U == null) {
                return;
            }
            IVVideoEditFrag.this.f39308X = i;
            IVVideoEditFrag.this.f39305U.mo129503i(IVVideoEditFrag.this.f39308X / 100.0f);
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: c */
        public void mo61019c(int i) {
            if (IVVideoEditFrag.this.f39305U == null) {
                return;
            }
            IVVideoEditFrag.this.f39307W = i;
            IVVideoEditFrag.this.f39305U.mo129511q(i / 100.0f);
        }

        @Override // p149l.cr10
        /* JADX INFO: renamed from: d */
        public void mo61020d(@Nullable MusicContent musicContent) {
            IVVideoEditFrag.this.f39300P = musicContent;
            IVVideoEditFrag.this.f39311k0.f106315b = musicContent;
            if (NullChecker.m81303a(IVVideoEditFrag.this.f39298N)) {
                IVVideoEditFrag.this.f39298N.m60942k(IVVideoEditFrag.this.f39303S, musicContent, IVVideoEditFrag.this.f39303S.length);
            }
            IVVideoEditFrag.this.f39306V = true;
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.f39288E.setText(iVVideoEditFrag.f39300P.name);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.IVVideoEditFrag$c */
    public class TextureViewSurfaceTextureListenerC11147c implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11147c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f39303S.width, IVVideoEditFrag.this.f39303S.height);
            IVVideoEditFrag iVVideoEditFrag = IVVideoEditFrag.this;
            iVVideoEditFrag.m61005n5(iVVideoEditFrag.f39303S.width, IVVideoEditFrag.this.f39303S.height);
            if (NullChecker.m81304b(surfaceTexture)) {
                IVVideoEditFrag.this.f39305U.mo129502h(surfaceTexture);
            }
            boolean z = IVVideoEditFrag.this.f39309Y;
            IVVideoEditFrag iVVideoEditFrag2 = IVVideoEditFrag.this;
            if (z) {
                iVVideoEditFrag2.f39309Y = false;
                IVVideoEditFrag.this.f39305U.mo129496b(IVVideoEditFrag.this.f39310Z);
                IVVideoEditFrag.this.f39305U.mo129501g();
            } else if (iVVideoEditFrag2.f39305U.mo129500f()) {
                IVVideoEditFrag.this.f39305U.mo129501g();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!NullChecker.m81303a(IVVideoEditFrag.this.f39305U)) {
                return false;
            }
            IVVideoEditFrag.this.f39305U.mo129495a();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f39303S.width, IVVideoEditFrag.this.f39303S.height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(IVVideoEditFrag.this.f39303S.width, IVVideoEditFrag.this.f39303S.height);
        }
    }

    /* JADX INFO: renamed from: I5 */
    private void m60959I5(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM103743p = bt0.m103743p(view, "translationY", 0L, 500L, z ? bt0.f77155b : bt0.f77154a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        bt0.m103729b(view, animatorM103743p);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.z6m
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, z);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: r5 */
    private void m60985r5() {
        new h7m(this).mo51532C(this);
    }

    /* JADX INFO: renamed from: s5 */
    private void m60986s5() {
        FragmentActivity activity = getActivity();
        if (NullChecker.m81304b(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: w5 */
    private void m60987w5() {
        this.f39286C.setOnClickListener(this);
        this.f39285B.setOnClickListener(this);
        this.f39293I.setOnClickListener(this);
        this.f39313z.setOnClickListener(this);
        this.f39292H.setOnClickListener(this);
        this.f39291G.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m60988A5() {
        this.f39311k0.m129753g0(this.f39304T);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m60989B5(Object obj) {
        e51.m114742G(new Runnable() { // from class: l.d7m
            @Override // java.lang.Runnable
            public final void run() {
                this.f84751a.m60988A5();
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m60990C5(int i, int i2, String str) {
        VideoEditProcessErrorException.reportVideoEditProcessError(i, i2, str);
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f39293I.setEnabled(true);
        if (NullChecker.m81304b(this.f39305U)) {
            this.f39305U.mo129510p();
        }
        lsi0.m151578h(R$string.f39118o2);
        m20599s4();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m60991D5(final int i, final int i2, final String str) {
        e51.m114742G(new Runnable() { // from class: l.y6m
            @Override // java.lang.Runnable
            public final void run() {
                this.f196578a.m60990C5(i, i2, str);
            }
        });
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m60992E5() {
        m60998L5(true);
        m60959I5(this.f39298N, false);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m60993F5() {
        m60998L5(true);
        m60959I5(this.f39301Q, false);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m60994G5(MusicContent musicContent) {
        if (musicContent == null) {
            v500 v500Var = this.f39310Z;
            v500Var.f179991b = null;
            v500Var.f179992c = 0;
            v500Var.f179993d = 0;
            this.f39305U.mo129503i(0.0f);
        } else {
            this.f39305U.mo129503i(this.f39308X / 100.0f);
            v500 v500Var2 = this.f39310Z;
            v500Var2.f179991b = musicContent.path;
            v500Var2.f179992c = musicContent.startMillTime;
            v500Var2.f179993d = musicContent.endMillTime;
        }
        if (NullChecker.m81304b(this.f39305U)) {
            this.f39305U.mo129507m(0L, true);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m60995H5() {
        boolean z = this.f39312p0;
        this.f39312p0 = !z;
        p7m p7mVar = this.f39305U;
        if (z) {
            p7mVar.resume();
            m61011u5();
        } else {
            p7mVar.pause();
            m61002P5();
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m60996J5() {
        int[] iArrM158498e = n8i.m158498e(this.f39303S);
        this.f39305U.mo129505k(iArrM158498e[0], iArrM158498e[1], n8i.m158501h(this.f39303S), 5242880);
        this.f39305U.mo129508n(this.f39304T);
        m20596p4(R$string.f39138r2, true);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m60997K5() {
        File file = new File(this.f39303S.path);
        if (file.exists() && file.length() == this.f39303S.size) {
            m60996J5();
        } else {
            lsi0.m151578h(R$string.f39132q2);
            m60986s5();
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final void m60998L5(boolean z) {
        m60959I5(this.f39290F, z);
    }

    /* JADX INFO: renamed from: M5 */
    public boolean m60999M5() {
        return this.f39297M != null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m61000N5() {
        if (this.f39300P == null || this.f39303S == null) {
            lsi0.m151578h(R$string.f39013Z1);
            return;
        }
        if (this.f39298N == null) {
            IVMusicRangeEditView iVMusicRangeEditView = (IVMusicRangeEditView) this.f39295K.inflate();
            this.f39298N = iVMusicRangeEditView;
            iVMusicRangeEditView.f39265i = this.f39299O;
            iVMusicRangeEditView.setDismissListener(new d30() { // from class: l.v6m
                @Override // p149l.d30
                public final void call() {
                    this.f180216a.m60992E5();
                }
            });
            if (NullChecker.m81304b(this.f39300P)) {
                IVMusicRangeEditView iVMusicRangeEditView2 = this.f39298N;
                Video video = this.f39303S;
                iVMusicRangeEditView2.m60942k(video, this.f39300P, video.length);
            }
        }
        this.f39298N.m60943l();
        m60998L5(false);
        m60959I5(this.f39298N, true);
    }

    /* JADX INFO: renamed from: O5 */
    public final void m61001O5() {
        if (this.f39300P == null || this.f39303S == null) {
            lsi0.m151578h(R$string.f39013Z1);
            return;
        }
        if (this.f39301Q == null) {
            IVMusicVolumeEditView iVMusicVolumeEditView = (IVMusicVolumeEditView) this.f39296L.inflate();
            this.f39301Q = iVMusicVolumeEditView;
            iVMusicVolumeEditView.f39279g = this.f39299O;
            iVMusicVolumeEditView.setDismissListener(new d30() { // from class: l.w6m
                @Override // p149l.d30
                public final void call() {
                    this.f184933a.m60993F5();
                }
            });
        }
        this.f39301Q.setCurrentVolumeValue(this.f39308X);
        this.f39301Q.m60955l(m60999M5(), this.f39300P);
        m60998L5(false);
        m60959I5(this.f39301Q, true);
    }

    /* JADX INFO: renamed from: P5 */
    public final void m61002P5() {
        this.f39284A.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        m60987w5();
        m61014y5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM61003l5 = m61003l5(layoutInflater, viewGroup);
        m61004m5();
        return viewM61003l5;
    }

    /* JADX INFO: renamed from: l5 */
    public View m61003l5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g7m.m124717b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m61004m5() {
        this.f39313z.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11147c());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            m60986s5();
            return;
        }
        this.f39302R = arguments.getString("extra_key_video_path");
        this.f39300P = (MusicContent) arguments.getParcelable("extra_key_music_content");
        Video videoM61010t5 = m61010t5(this.f39302R);
        this.f39303S = videoM61010t5;
        this.f39297M = videoM61010t5.playingMusic;
        videoM61010t5.psPercent = 50;
        File file = new File(this.f39303S.path);
        if (!file.exists() || file.length() <= 0) {
            lsi0.m151578h(R$string.f39144s2);
            m60986s5();
            return;
        }
        this.f39303S.size = (int) file.length();
        p7m p7mVarM157981b = n500.m157981b();
        this.f39305U = p7mVarM157981b;
        p7mVarM157981b.mo129498d(true);
        this.f39305U.mo129499e(false);
        this.f39305U.mo129504j(new kmw() { // from class: l.x6m
            @Override // p149l.kmw
            /* JADX INFO: renamed from: a */
            public final void mo130269a(int i, int i2, String str) {
                this.f191251a.m60991D5(i, i2, str);
            }
        });
        this.f39305U.mo129509o(new C11145a());
        m60985r5();
        h7m h7mVar = this.f39311k0;
        MusicContent musicContent = this.f39300P;
        h7mVar.f106315b = musicContent;
        h7mVar.m129752f0(musicContent, this.f39303S);
        m61012v5();
        m61013x5();
        if (NullChecker.m81304b(nv5.m161567a("current_video", "temp"))) {
            this.f39304T = k9j.m145083O("mp4").getAbsolutePath();
        }
        if (this.f39304T == null) {
            m60986s5();
        }
        v500 v500Var = new v500();
        this.f39310Z = v500Var;
        Video video = this.f39303S;
        v500Var.f179990a = video.path;
        v500Var.f179994e = video.osPercent;
        v500Var.f179995f = video.psPercent;
        if (NullChecker.m81303a(this.f39300P)) {
            v500 v500Var2 = this.f39310Z;
            MusicContent musicContent2 = this.f39300P;
            v500Var2.f179991b = musicContent2.path;
            v500Var2.f179992c = musicContent2.startMillTime;
            v500Var2.f179993d = musicContent2.endMillTime;
        }
    }

    /* JADX INFO: renamed from: n5 */
    public final void m61005n5(int i, int i2) {
        int i3;
        int i4;
        int width = this.f39313z.getWidth();
        int height = this.f39313z.getHeight();
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
        this.f39313z.getTransform(matrix);
        matrix.setScale(i3 / width, i4 / height);
        matrix.postTranslate((width - i3) / 2, (height - i4) / 2);
        this.f39313z.setTransform(matrix);
    }

    /* JADX INFO: renamed from: o */
    public boolean m61006o() {
        m61008p5();
        return true;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h7m h7mVar) {
        this.f39311k0 = h7mVar;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001 && NullChecker.m81303a(intent)) {
            this.f39299O.mo61020d((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f39293I) {
            view.setEnabled(false);
            m60997K5();
            zvf0.m220396r("e_photo_to_video_edit_next", "p_photo_to_video_edit");
            return;
        }
        if (view == this.f39285B) {
            m61006o();
            return;
        }
        if (view == this.f39286C) {
            m61009q5();
            return;
        }
        if (view == this.f39291G) {
            m61000N5();
        } else if (view == this.f39292H) {
            m61001O5();
        } else if (view == this.f39313z) {
            m60995H5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final void m61008p5() {
        this.f39311k0.m129751e0(this.f39303S);
        m60986s5();
    }

    /* JADX INFO: renamed from: q5 */
    public final void m61009q5() {
        startActivityForResult(new Intent(getActivity(), (Class<?>) MusicCenterAct.class), 1001);
        act().overridePendingTransition(uzb0.f178984i, uzb0.f178982g);
    }

    /* JADX INFO: renamed from: t5 */
    public final Video m61010t5(String str) {
        Video video = new Video(0, str);
        ebl0.m115507c(video);
        video.osPercent = 50;
        video.psPercent = 50;
        return video;
    }

    /* JADX INFO: renamed from: u5 */
    public final void m61011u5() {
        if (this.f39284A.getAlpha() > 0.0f) {
            this.f39284A.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m61012v5() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.a7m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67938a.m61015z5((C4319c) obj);
            }
        }));
        duringCreated((C22306c) this.f39289E0.asObservable()).subscribe(new e30() { // from class: l.b7m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74002a.m60989B5(obj);
            }
        }, new e30() { // from class: l.c7m
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c(new RuntimeException("OnVideoProcessFinished Error", (Throwable) obj));
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m61013x5() {
        this.f39299O = new C11146b();
    }

    /* JADX INFO: renamed from: y5 */
    public final void m61014y5() {
        xdl0.m208362Z(this.f39285B);
        this.f39284A.setAlpha(0.0f);
        MusicContent musicContent = this.f39300P;
        if (musicContent != null) {
            this.f39288E.setText(musicContent.name);
            xdl0.m208413z(this.f39288E);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m61015z5(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            Video video = this.f39303S;
            if (video == null || TextUtils.isEmpty(video.path) || !new File(this.f39303S.path).exists()) {
                lsi0.m151578h(R$string.f39125p2);
                m60986s5();
                return;
            }
            this.f39313z.setVisibility(0);
            if (this.f39306V) {
                this.f39306V = false;
                m60994G5(this.f39300P);
            }
            if (NullChecker.m81304b(this.f39305U)) {
                this.f39305U.mo129510p();
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15549j) {
            if (NullChecker.m81304b(this.f39305U)) {
                this.f39305U.pause();
            }
        } else {
            if (c4319c == C4319c.f15550k) {
                this.f39313z.setVisibility(8);
                return;
            }
            if (c4319c != C4319c.f15552m || this.f39303S == null) {
                return;
            }
            if (NullChecker.m81304b(this.f39305U)) {
                this.f39305U.release();
                this.f39305U = null;
            }
            final File fileM161568b = nv5.m161568b();
            if (NullChecker.m81303a(fileM161568b)) {
                e51.m114774y(new Runnable() { // from class: l.e7m
                    @Override // java.lang.Runnable
                    public final void run() {
                        rhi.m179367k(fileM161568b);
                    }
                });
            }
        }
    }
}
