package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.wcdb.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u9l0 implements s7m<t7l0>, hxl, View.OnClickListener, zji, p84 {

    /* JADX INFO: renamed from: I1 */
    public static final int f175341I1 = f3c0.f94497d0;

    /* JADX INFO: renamed from: J1 */
    public static final int f175342J1 = f3c0.f94489c0;

    /* JADX INFO: renamed from: K1 */
    public static final int f175343K1 = f3c0.f94521g0;

    /* JADX INFO: renamed from: L1 */
    public static final int f175344L1 = f3c0.f94513f0;

    /* JADX INFO: renamed from: M1 */
    public static final float[] f175345M1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: N1 */
    public static final float[] f175346N1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: O1 */
    public static final float[] f175347O1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f175348A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f175350B;

    /* JADX INFO: renamed from: B1 */
    public String f175351B1;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f175352C;

    /* JADX INFO: renamed from: C1 */
    public CameraSticker f175353C1;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f175354D;

    /* JADX INFO: renamed from: D1 */
    public xh0 f175355D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f175356E;

    /* JADX INFO: renamed from: F */
    public CameraMenuView f175359F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f175362G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f175365H;

    /* JADX INFO: renamed from: I */
    public CameraMenuView f175368I;

    /* JADX INFO: renamed from: J */
    public CameraMenuView f175370J;

    /* JADX INFO: renamed from: J0 */
    public boolean f175371J0;

    /* JADX INFO: renamed from: K */
    public TextView f175372K;

    /* JADX INFO: renamed from: K0 */
    public boolean f175373K0;

    /* JADX INFO: renamed from: L */
    public CameraVideoControlView f175374L;

    /* JADX INFO: renamed from: L0 */
    public String f175375L0;

    /* JADX INFO: renamed from: M */
    public CameraPhotoControlView f175376M;

    /* JADX INFO: renamed from: M0 */
    public boolean f175377M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f175378N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f175379N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f175380O;

    /* JADX INFO: renamed from: O0 */
    public String f175381O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f175382P;

    /* JADX INFO: renamed from: P0 */
    public View f175383P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f175384Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f175385Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f175386R;

    /* JADX INFO: renamed from: R0 */
    public Animator f175387R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f175388S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f175390T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f175391T0;

    /* JADX INFO: renamed from: U */
    public VText f175392U;

    /* JADX INFO: renamed from: U0 */
    public FilterMenuView f175393U0;

    /* JADX INFO: renamed from: V */
    public VText f175394V;

    /* JADX INFO: renamed from: V0 */
    public MaskMenuView f175395V0;

    /* JADX INFO: renamed from: W */
    public Context f175396W;

    /* JADX INFO: renamed from: W0 */
    public MakeUpMenuView f175397W0;

    /* JADX INFO: renamed from: X */
    public VideoRecordFrag f175398X;

    /* JADX INFO: renamed from: Y */
    public t7l0 f175400Y;

    /* JADX INFO: renamed from: Y0 */
    public float f175401Y0;

    /* JADX INFO: renamed from: Z */
    public ixl f175402Z;

    /* JADX INFO: renamed from: Z0 */
    public float f175403Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f175404a;

    /* JADX INFO: renamed from: b */
    public View f175406b;

    /* JADX INFO: renamed from: b1 */
    public float f175407b1;

    /* JADX INFO: renamed from: c */
    public View f175408c;

    /* JADX INFO: renamed from: c1 */
    public float f175409c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f175410d;

    /* JADX INFO: renamed from: d1 */
    public float f175411d1;

    /* JADX INFO: renamed from: e */
    public FilterScrollMoreViewPager f175412e;

    /* JADX INFO: renamed from: e1 */
    public float f175413e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f175414f;

    /* JADX INFO: renamed from: f1 */
    public float f175415f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f175416g;

    /* JADX INFO: renamed from: g1 */
    public Animator f175417g1;

    /* JADX INFO: renamed from: h */
    public TextView f175418h;

    /* JADX INFO: renamed from: h1 */
    public Animator f175419h1;

    /* JADX INFO: renamed from: i */
    public TextView f175420i;

    /* JADX INFO: renamed from: i1 */
    public Animator f175421i1;

    /* JADX INFO: renamed from: j */
    public ImageView f175422j;

    /* JADX INFO: renamed from: j1 */
    public int f175423j1;

    /* JADX INFO: renamed from: k */
    public TextView f175424k;

    /* JADX INFO: renamed from: k0 */
    public z4e0 f175425k0;

    /* JADX INFO: renamed from: k1 */
    public int f175426k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f175427l;

    /* JADX INFO: renamed from: l1 */
    public h3x f175428l1;

    /* JADX INFO: renamed from: m */
    public View f175429m;

    /* JADX INFO: renamed from: m1 */
    public boolean f175430m1;

    /* JADX INFO: renamed from: n */
    public LinearLayout f175431n;

    /* JADX INFO: renamed from: o */
    public TextView f175433o;

    /* JADX INFO: renamed from: o1 */
    public VideoInfo f175434o1;

    /* JADX INFO: renamed from: p */
    public TextView f175435p;

    /* JADX INFO: renamed from: q */
    public TextView f175438q;

    /* JADX INFO: renamed from: r */
    public TextView f175440r;

    /* JADX INFO: renamed from: r1 */
    public boolean f175441r1;

    /* JADX INFO: renamed from: s */
    public TextView f175442s;

    /* JADX INFO: renamed from: s1 */
    public boolean f175443s1;

    /* JADX INFO: renamed from: t */
    public TextView f175444t;

    /* JADX INFO: renamed from: t1 */
    public e30<View> f175445t1;

    /* JADX INFO: renamed from: u */
    public VideoRecordProgressView f175446u;

    /* JADX INFO: renamed from: u1 */
    public e30<View> f175447u1;

    /* JADX INFO: renamed from: v */
    public ImageView f175448v;

    /* JADX INFO: renamed from: v1 */
    public e30<Bundle> f175449v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f175450w;

    /* JADX INFO: renamed from: w1 */
    public MusicContent f175451w1;

    /* JADX INFO: renamed from: x */
    public ImageView f175452x;

    /* JADX INFO: renamed from: y */
    public TextView f175454y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f175456z;

    /* JADX INFO: renamed from: z1 */
    public boolean f175457z1;

    /* JADX INFO: renamed from: p0 */
    public int f175436p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f175357E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f175360F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f175363G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public hpd0 f175366H0 = new hpd0("need_show_tip" + FeedModule.m60221F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, tpd0> f175369I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f175389S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f175399X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f175405a1 = 1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<MediaMeta> f175432n1 = new ArrayList<>();

    /* JADX INFO: renamed from: p1 */
    public int f175437p1 = 0;

    /* JADX INFO: renamed from: q1 */
    public boolean f175439q1 = true;

    /* JADX INFO: renamed from: x1 */
    public float f175453x1 = 1.0f;

    /* JADX INFO: renamed from: y1 */
    public int f175455y1 = 2;

    /* JADX INFO: renamed from: A1 */
    public boolean f175349A1 = true;

    /* JADX INFO: renamed from: E1 */
    public uqd0 f175358E1 = new uqd0("camera_filter_id" + FeedModule.m60221F().userId(), null);

    /* JADX INFO: renamed from: F1 */
    public boolean f175361F1 = false;

    /* JADX INFO: renamed from: G1 */
    public boolean f175364G1 = true;

    /* JADX INFO: renamed from: H1 */
    public List<MMPresetFilter> f175367H1 = new ArrayList();

    /* JADX INFO: renamed from: l.u9l0$c */
    public class C20388c extends GestureDetector.SimpleOnGestureListener {
        public C20388c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            u9l0.this.m192393O2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.u9l0$d */
    public class C20389d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f175462a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f175463b;

        public C20389d(int i, boolean z) {
            this.f175462a = i;
            this.f175463b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u9l0.this.m192469q3(this.f175462a, this.f175463b);
            u9l0.this.f175389S0 = 0.0f;
        }
    }

    /* JADX INFO: renamed from: l.u9l0$e */
    public class C20390e implements MaskMenuView.InterfaceC11179a {
        public C20390e() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC11179a
        /* JADX INFO: renamed from: a */
        public void mo61690a(int i, boolean z) {
            boolean zMo138859Q = u9l0.this.f175402Z.mo138859Q();
            u9l0.this.f175351B1 = null;
            if (NullChecker.m81303a(u9l0.this.f175353C1)) {
                if (u9l0.this.f175353C1.isBeautySticker()) {
                    u9l0.this.f175402Z.mo138862T();
                }
                u9l0.this.f175353C1 = null;
            }
            u9l0.this.f175374L.f39571c.m61431e();
            u9l0.this.f175376M.f39564c.m61431e();
            if (NullChecker.m81303a(u9l0.this.f175419h1)) {
                u9l0.this.f175419h1.cancel();
            }
            if (NullChecker.m81303a(u9l0.this.f175421i1)) {
                u9l0.this.f175421i1.cancel();
            }
            if (z) {
                return;
            }
            u9l0.this.f175402Z.mo138863U();
            if (zMo138859Q || !u9l0.this.f175402Z.mo138859Q()) {
                return;
            }
            u9l0.this.f175402Z.mo138871w(u9l0.f175347O1);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC11179a
        /* JADX INFO: renamed from: b */
        public void mo61691b(CameraSticker cameraSticker, int i, boolean z) {
            yb4.m213936c().m213948m(cameraSticker);
            u9l0.this.f175395V0.m61689i(i);
            if (!cameraSticker.hasModelFile || z || cameraSticker.f39219id.equals(u9l0.this.f175351B1)) {
                return;
            }
            boolean zMo138859Q = u9l0.this.f175402Z.mo138859Q();
            u9l0.this.f175353C1 = cameraSticker;
            u9l0.this.f175351B1 = cameraSticker.f39219id;
            if (NullChecker.m81303a(u9l0.this.f175419h1)) {
                u9l0.this.f175419h1.cancel();
            }
            boolean zIsBeautySticker = cameraSticker.isBeautySticker();
            u9l0 u9l0Var = u9l0.this;
            if (zIsBeautySticker) {
                u9l0Var.f175428l1 = null;
                u9l0.this.f175402Z.mo138857N(new File(cameraSticker.modelFilePath));
            } else {
                u9l0Var.f175349A1 = true;
                u9l0.this.f175457z1 = true;
                u9l0.this.f175402Z.mo138862T();
                u9l0.this.f175402Z.mo138852B();
                u9l0 u9l0Var2 = u9l0.this;
                u9l0Var2.f175428l1 = s4l0.m182303a(u9l0Var2.getContext(), new File(cameraSticker.modelFilePath));
                if (NullChecker.m81304b(u9l0.this.f175428l1)) {
                    u9l0.this.f175402Z.mo138851A(u9l0.this.f175428l1);
                }
            }
            qib0.f154691G.m102331L0(u9l0.this.f175374L.f39571c.getDraweeView(), cameraSticker.icon);
            qib0.f154691G.m102331L0(u9l0.this.f175376M.f39564c.getDraweeView(), cameraSticker.icon);
            if (NullChecker.m81303a(u9l0.this.f175428l1)) {
                u9l0.this.m192469q3(0, false);
            }
            if (!zMo138859Q && u9l0.this.f175402Z.mo138859Q()) {
                u9l0.this.f175402Z.mo138871w(u9l0.f175347O1);
            }
            if (NullChecker.m81303a(u9l0.this.f175397W0)) {
                u9l0.this.f175397W0.m61664S();
            }
        }
    }

    public u9l0(VideoRecordFrag videoRecordFrag) {
        this.f175398X = videoRecordFrag;
        this.f175396W = videoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: A1 */
    private void m192345A1() {
        this.f175450w.setOnClickListener(new View.OnClickListener() { // from class: l.s9l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163197a.m192527Y1(view);
            }
        });
        xdl0.m208413z(this.f175454y);
        this.f175374L.setCallback(this);
        this.f175376M.setCallback(this);
        this.f175400Y.m187486y0();
    }

    /* JADX INFO: renamed from: B1 */
    private void m192347B1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f175444t;
            Interpolator interpolator = bt0.f77157d;
            Animator animatorM103753z = bt0.m103753z(bt0.m103743p(textView, "scaleX", 500L, 500L, interpolator, 0.3f, 1.2f), bt0.m103743p(this.f175444t, "scaleY", 500L, 500L, interpolator, 0.3f, 1.2f), bt0.m103743p(this.f175444t, "alpha", 500L, 500L, interpolator, 0.3f, 1.2f));
            bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.t8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168932a.m192528Z1(i);
                }
            });
            bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.e9l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90110a.m192429a2();
                }
            });
            arrayList.add(animatorM103753z);
        }
        Animator animatorM103746s = bt0.m103746s((Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2));
        this.f175385Q0 = animatorM103746s;
        bt0.m103749v(animatorM103746s, new Runnable() { // from class: l.o9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142721a.m192431b2();
            }
        });
        bt0.m103734g(this.f175385Q0, new Runnable() { // from class: l.p9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147774a.m192530c2();
            }
        }, new Runnable() { // from class: l.q9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153447a.m192531d2();
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private void m192348B3() {
        if (this.f175367H1.size() <= 1) {
            FeedModule.f38853b.f39192H.m121236q();
            lsi0.m151578h(R$string.f38916J0);
        }
        this.f175393U0.m61589p();
        m192432b3(this.f175393U0, true);
        m192474s3(false);
    }

    /* JADX INFO: renamed from: C3 */
    private void m192350C3(final boolean z) {
        String strMo138858P = this.f175402Z.mo138858P(this.f175399X0);
        if (NullChecker.m81303a(this.f175393U0)) {
            this.f175393U0.m61590q(this.f175399X0);
        }
        if (TextUtils.isEmpty(strMo138858P)) {
            return;
        }
        this.f175420i.setText(strMo138858P);
        e51.m114742G(new Runnable() { // from class: l.v8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f180555a.m192499D2(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3, reason: merged with bridge method [inline-methods] */
    public void m192499D2(boolean z) {
        bt0.m103732e(this.f175420i);
        if (NullChecker.m81303a(this.f175417g1)) {
            this.f175417g1.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f175420i, "translationX", 0L, 300L, bt0.f77154a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f175420i;
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, bt0.m103743p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), bt0.m103743p(this.f175420i, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f175417g1 = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.l9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127128a.m192358F2();
            }
        });
        bt0.m103733f(this.f175417g1, new Runnable() { // from class: l.m9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132784a.m192500E2();
            }
        });
        this.f175417g1.start();
    }

    /* JADX INFO: renamed from: E1 */
    private void m192355E1() {
        this.f175447u1 = xck0.m208120a(1000, new e30() { // from class: l.b8l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74135a.m192439e2((View) obj);
            }
        });
        this.f175445t1 = xck0.m208120a(500, new e30() { // from class: l.c8l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79773a.m192533f2((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    private void m192357F1() {
        if (this.f175393U0 == null) {
            FilterMenuView filterMenuView = (FilterMenuView) this.f175380O.inflate();
            this.f175393U0 = filterMenuView;
            filterMenuView.setFilterData(this.f175367H1);
            this.f175393U0.m61590q(this.f175399X0);
            int size = this.f175367H1.size();
            int i = this.f175399X0;
            int iM192466p1 = (i < 0 || i >= size) ? 50 : (int) (m192466p1(this.f175367H1.get(i).mFilterId) * 100.0f);
            this.f175393U0.f39677c.setText(String.valueOf(iM192466p1));
            this.f175393U0.f39677c.setProgress(iM192466p1);
            this.f175393U0.setMenuDismissListener(new d30() { // from class: l.y8l0
                @Override // p149l.d30
                public final void call() {
                    this.f196852a.m192534g2();
                }
            });
            this.f175393U0.setOnItemClickCallback(new e30() { // from class: l.z8l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202188a.m192535h2((Integer) obj);
                }
            });
            this.f175393U0.setIntensityChangedCallback(new e30() { // from class: l.a9l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68190a.m192536i2((Float) obj);
                }
            });
            this.f175393U0.setIntensityChooseCallback(new f30() { // from class: l.b9l0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f74593a.m192539k2((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f175393U0.setCompareClickCallback(new e30() { // from class: l.c9l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79949a.m192541l2((Boolean) obj);
                }
            });
            this.f175393U0.setOnResetCallback(new d30() { // from class: l.d9l0
                @Override // p149l.d30
                public final void call() {
                    this.f85130a.m192542m2();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m192358F2() {
        this.f175420i.setScaleY(1.6f);
        this.f175420i.setScaleX(1.6f);
        this.f175420i.setVisibility(0);
        this.f175443s1 = true;
    }

    /* JADX INFO: renamed from: F3 */
    private void m192359F3(int i) {
        this.f175405a1 = 1;
        m192413V3(1);
        xdl0.m208344M(this.f175350B, true);
        xdl0.m208344M(this.f175427l, this.f175430m1);
        xdl0.m208344M(this.f175448v, true);
        xdl0.m208344M(this.f175456z, false);
        xdl0.m208344M(this.f175372K, !this.f175430m1 && this.f175366H0.get().booleanValue());
        if (i == 1) {
            m192443f3(true);
            m192440e3(true);
            return;
        }
        xdl0.m208344M(this.f175376M, false);
        xdl0.m208344M(this.f175370J, false);
        xdl0.m208344M(this.f175365H, true);
        xdl0.m208344M(this.f175368I, true);
        xdl0.m208344M(this.f175374L, true);
        xdl0.m208344M(this.f175446u, true);
        this.f175365H.setAlpha(1.0f);
        this.f175368I.setAlpha(1.0f);
        this.f175374L.setAlpha(1.0f);
        this.f175446u.setAlpha(1.0f);
        this.f175446u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: H1 */
    private void m192364H1() {
        this.f175446u.setListener(new VideoRecordProgressView.InterfaceC11183d() { // from class: l.t9l0
            @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView.InterfaceC11183d
            /* JADX INFO: renamed from: a */
            public final void mo61739a(long j) {
                this.f169038a.m192546o2(j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    private void m192365H3(int i) {
        xdl0.m208344M(this.f175350B, true);
        if (i == 0) {
            m192443f3(false);
            m192440e3(false);
        } else {
            this.f175376M.setAlpha(1.0f);
            xdl0.m208344M(this.f175376M, true);
            xdl0.m208344M(this.f175370J, true);
            xdl0.m208344M(this.f175365H, false);
            xdl0.m208344M(this.f175368I, false);
            xdl0.m208344M(this.f175374L, false);
            xdl0.m208344M(this.f175446u, false);
        }
        xdl0.m208344M(this.f175427l, false);
        xdl0.m208344M(this.f175448v, true);
        xdl0.m208344M(this.f175456z, false);
        xdl0.m208344M(this.f175372K, false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m192368I1() {
        uuv uuvVar = new uuv();
        this.f175402Z = uuvVar;
        uuvVar.mo181993a(getAct(), this);
        if (NullChecker.m81303a(this.f175451w1)) {
            this.f175402Z.mo138872x(this.f175451w1);
        }
    }

    /* JADX INFO: renamed from: I3 */
    private void m192369I3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.m81303a(this.f175419h1)) {
                this.f175419h1.cancel();
            }
            if (NullChecker.m81303a(this.f175421i1)) {
                this.f175421i1.cancel();
            }
        }
        if (NullChecker.m81304b(this.f175434o1) && !m192385M2()) {
            xdl0.m208344M(this.f175350B, !z2);
            xdl0.m208344M(this.f175448v, !z2);
        }
        xdl0.m208344M(this.f175450w, this.f175436p0 == 0 && !this.f175373K0 && m192486x3(i));
        xdl0.m208344M(this.f175390T, (this.f175377M0 || this.f175373K0 || !m192486x3(i)) ? false : true);
        if (!z2) {
            xdl0.m208344M(this.f175456z, false);
        }
        xdl0.m208344M(this.f175354D, (z2 || m192508L1()) ? false : true);
        FrameLayout frameLayout = this.f175427l;
        if (!z2 && !m192380L2() && this.f175430m1 && this.f175436p0 == 0) {
            z = true;
        }
        xdl0.m208344M(frameLayout, z);
    }

    /* JADX INFO: renamed from: J1 */
    private void m192372J1() {
        this.f175425k0 = z4e0.m217067c(getAct().getApplicationContext());
        iic0 iic0Var = new iic0();
        if (NullChecker.m81304b(this.f175402Z)) {
            iic0Var.m136378q(this.f175402Z.mo181991K());
        }
        this.f175425k0.m217071g(iic0Var);
        this.f175425k0.m217072h();
    }

    /* JADX INFO: renamed from: J3 */
    private void m192373J3(int i) {
        bt0.m103743p(this.f175429m, "translationX", 0L, 200L, bt0.f77155b, (i - 2) * t100.m186890d(58.0f)).start();
        ((TextView) this.f175431n.getChildAt(this.f175455y1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f175431n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f175455y1 = i;
        this.f175453x1 = f175345M1[i];
    }

    /* JADX INFO: renamed from: K1 */
    private void m192376K1() {
        this.f175412e.setOnVerticalFlingListener(new C20387b());
        this.f175412e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C20388c());
        this.f175412e.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC11175b() { // from class: l.h8l0
            @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11175b
            /* JADX INFO: renamed from: a */
            public final boolean mo61603a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m192419X2(this.f175436p0);
    }

    /* JADX INFO: renamed from: K3 */
    private void m192377K3() {
        boolean z;
        boolean zPrepare;
        if (this.f175357E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f175402Z.prepare();
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
        if (!zPrepare) {
            lsi0.m151580j("相机打开失败，请检查系统相机是否可用");
            return;
        }
        m192478u3(false);
        this.f175402Z.mo181995g();
        if (NullChecker.m81303a(this.f175353C1) && this.f175353C1.isBeautySticker()) {
            this.f175402Z.mo138857N(new File(this.f175353C1.modelFilePath));
        }
        if (this.f175399X0 > 0) {
            e51.m114743H(getAct(), new Runnable() { // from class: l.n8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137660a.m192503G2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: L2 */
    private boolean m192380L2() {
        MaskMenuView maskMenuView = this.f175395V0;
        if (maskMenuView != null && xdl0.m208349O0(maskMenuView)) {
            return true;
        }
        FilterMenuView filterMenuView = this.f175393U0;
        if (filterMenuView != null && xdl0.m208349O0(filterMenuView)) {
            return true;
        }
        MakeUpMenuView makeUpMenuView = this.f175397W0;
        return makeUpMenuView != null && xdl0.m208349O0(makeUpMenuView);
    }

    /* JADX INFO: renamed from: L3 */
    private void m192381L3() {
        this.f175366H0.put(Boolean.FALSE);
        if (this.f175372K.getVisibility() == 0) {
            xdl0.m208344M(this.f175372K, this.f175366H0.get().booleanValue());
        }
        if (this.f175402Z.mo181996h()) {
            return;
        }
        m192428a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public boolean m192384M1() {
        ValueAnimator valueAnimator = this.f175391T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public boolean m192385M2() {
        return !vi00.m198490b();
    }

    /* JADX INFO: renamed from: M3 */
    private void m192386M3() {
        if (this.f175436p0 != 0) {
            this.f175374L.setState(2);
            return;
        }
        this.f175402Z.mo182002y(this.f175453x1);
        this.f175402Z.mo181997i();
        m192397P3();
        if (this.f175441r1) {
            m192394O3(true);
            this.f175441r1 = false;
        } else {
            this.f175446u.setMaxDuration(m192468q1());
            this.f175446u.m61725s(this.f175453x1);
            m192451i3();
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m192389N2(int i) {
        if (i == this.f175436p0) {
            return;
        }
        int iM186890d = t100.m186890d(64.0f);
        int i2 = (t100.m186889c().widthPixels / 2) - iM186890d;
        int i3 = this.f175436p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f175390T;
        bt0.m103743p(linearLayout, "translationX", 0L, 100L, bt0.f77156c, linearLayout.getTranslationX(), i2 + ((i3 * iM186890d) / 2)).start();
    }

    /* JADX INFO: renamed from: N3 */
    private void m192390N3() {
        if (!NullChecker.m81304b(this.f175425k0) || this.f175425k0.m217069d()) {
            return;
        }
        this.f175425k0.m217072h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public void m192393O2(float f, float f2) {
        ImageView imageView = this.f175422j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f175422j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m192458m1();
        this.f175402Z.mo181990J(m192422Y0(this.f175404a.getWidth(), this.f175404a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: O3 */
    private boolean m192394O3(boolean z) {
        this.f175446u.m61726t();
        boolean zMo181989I = this.f175402Z.mo181989I(z);
        m192390N3();
        return zMo181989I;
    }

    /* JADX INFO: renamed from: P3 */
    private void m192397P3() {
        if (NullChecker.m81304b(this.f175425k0) && this.f175425k0.m217069d()) {
            this.f175425k0.m217073i();
        }
    }

    /* JADX INFO: renamed from: R3 */
    private void m192402R3() {
        int i = this.f175363G0;
        if (i == 0) {
            this.f175363G0 = 3;
            this.f175368I.setImageResource(f175342J1);
        } else {
            if (i != 3) {
                return;
            }
            this.f175363G0 = 0;
            this.f175368I.setImageResource(f175341I1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m192405S3(boolean z, float f) {
        List<MMPresetFilter> list = this.f175367H1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f175399X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f175407b1 = m192466p1(list.get(this.f175399X0).mFilterId);
        float fM192466p1 = m192466p1(list.get(size).mFilterId);
        this.f175409c1 = fM192466p1;
        int i2 = this.f175399X0;
        float f2 = z ? -f : 1.0f - f;
        this.f175389S0 = f2;
        this.f175402Z.mo138861S(0, i2, z, f2, this.f175407b1, fM192466p1);
        this.f175407b1 = this.f175409c1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m192408T3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM192463o1 = m192463o1();
        int i = this.f175399X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM192463o1 - 1;
        } else if (i2 >= iM192463o1) {
            iM192463o1 = i;
            i2 = 0;
        } else {
            iM192463o1 = i;
        }
        if (!z2) {
            m192469q3(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m81303a(this.f175391T0) && this.f175391T0.isRunning()) {
            this.f175391T0.cancel();
        }
        if (this.f175391T0 == null) {
            this.f175391T0 = new ValueAnimator();
        }
        this.f175391T0.setDuration(j);
        this.f175391T0.setFloatValues(this.f175389S0, i3);
        this.f175391T0.removeAllUpdateListeners();
        this.f175391T0.removeAllListeners();
        this.f175391T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h9l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f106611a.m192505H2(iM192463o1, z, valueAnimator);
            }
        });
        this.f175391T0.addListener(new C20389d(i2, z));
        this.f175391T0.start();
    }

    /* JADX INFO: renamed from: U3 */
    private void m192411U3() {
        int i = this.f175360F0 - 1;
        this.f175360F0 = i;
        if (i < 0) {
            this.f175360F0 = 1;
        }
        this.f175402Z.mo182000r(this.f175360F0);
        m192480v3();
    }

    /* JADX INFO: renamed from: V3 */
    private void m192413V3(int i) {
        m192418X0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(180.0f), t100.m186890d(180.0f));
        this.f175376M.f39564c.setThemeType(1);
        this.f175376M.f39566e.setThemeType(1);
        this.f175376M.f39562a.setThemeType(1);
        this.f175352C.setThemeType(1);
        if (i == 1) {
            this.f175370J.setImageResource(f3c0.f94561l0);
            layoutParams.gravity = 17;
            this.f175414f.setLayoutParams(layoutParams);
            this.f175364G1 = true;
            bt0.m103732e(this.f175408c);
            View view = this.f175408c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = bt0.f77155b;
            Animator animatorM103739l = bt0.m103739l(view, property, 0L, 300L, interpolator, 0.0f, view.getHeight());
            bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.k8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121836a.m192506I2();
                }
            });
            animatorM103739l.start();
            bt0.m103732e(this.f175406b);
            Animator animatorM103739l2 = bt0.m103739l(this.f175406b, property, 0L, 300L, interpolator, 0.0f, -this.f175408c.getHeight());
            bt0.m103733f(animatorM103739l2, new Runnable() { // from class: l.l8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126835a.m192507K2();
                }
            });
            animatorM103739l2.start();
        } else if (i == 2) {
            this.f175370J.setImageResource(f3c0.f94577n0);
            this.f175406b.setVisibility(8);
            int i2 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f175415f1;
            this.f175408c.setLayoutParams(layoutParams2);
            this.f175408c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f175415f1 / 2.0f) - (layoutParams.height / 2));
            this.f175414f.setLayoutParams(layoutParams);
            this.f175364G1 = false;
            bt0.m103732e(this.f175408c);
            bt0.m103739l(this.f175408c, View.TRANSLATION_Y, 0L, 300L, bt0.f77155b, this.f175415f1, 0.0f).start();
        } else if (i == 3) {
            this.f175370J.setImageResource(f3c0.f94569m0);
            int i3 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (xdl0.m208408w0() - this.f175411d1);
            this.f175406b.setLayoutParams(layoutParams3);
            this.f175406b.setVisibility(0);
            int i4 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f175413e1;
            this.f175408c.setLayoutParams(layoutParams4);
            this.f175408c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f175413e1 + this.f175411d1) / 2.0f) - (layoutParams.height / 2));
            this.f175414f.setLayoutParams(layoutParams);
            this.f175364G1 = false;
            bt0.m103732e(this.f175408c);
            View view2 = this.f175408c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = bt0.f77155b;
            bt0.m103739l(view2, property2, 0L, 300L, interpolator2, this.f175415f1 - this.f175413e1, 0.0f).start();
            bt0.m103732e(this.f175406b);
            bt0.m103739l(this.f175406b, property2, 0L, 300L, interpolator2, -this.f175408c.getHeight(), 0.0f).start();
        }
        m192540k3();
    }

    /* JADX INFO: renamed from: W2 */
    private void m192415W2() {
        m192394O3(false);
        mo177483k(false);
        this.f175402Z.mo181992O();
    }

    /* JADX INFO: renamed from: W3 */
    private void m192416W3() {
        int i;
        int iM208408w0;
        int i2 = this.f175423j1;
        int i3 = this.f175426k1;
        m192418X0();
        int i4 = this.f175405a1;
        if (i4 == 3) {
            float f = i3;
            iM208408w0 = (int) (f - ((this.f175413e1 / xdl0.m208408w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iM208408w0 = i3 - i;
        } else {
            i = i3;
            iM208408w0 = 0;
        }
        this.f175402Z.mo181987E(0, iM208408w0, i2, i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m192418X0() {
        if (this.f175405a1 == 1) {
            return;
        }
        if ((this.f175411d1 == 0.0f || this.f175413e1 == 0.0f || this.f175415f1 == 0.0f) && this.f175352C.getMeasuredHeight() != 0) {
            if (NullChecker.m81304b(this.f175352C)) {
                this.f175411d1 = ((int) this.f175352C.getY()) + this.f175352C.getBottom() + t100.m186890d(34.0f) + m192456l1();
            }
            float fM208412y0 = this.f175411d1 + xdl0.m208412y0();
            this.f175413e1 = fM208412y0;
            if (fM208412y0 > this.f175376M.getY() - t100.m186890d(10.0f)) {
                this.f175413e1 = this.f175376M.getY() - t100.m186890d(10.0f);
            }
            float fM208412y1 = (xdl0.m208412y0() * 4) / 3;
            this.f175415f1 = fM208412y1;
            if (fM208412y1 <= this.f175376M.getY() || !(this.f175376M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f175376M.getLayoutParams();
            layoutParams.bottomMargin = t100.m186890d(44.0f);
            this.f175376M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: X2 */
    private void m192419X2(int i) {
        this.f175402Z.setState(this.f175436p0);
        int i2 = this.f175436p0;
        if (i2 == 0) {
            m192359F3(i);
        } else if (i2 == 1) {
            m192365H3(i);
        }
        if (this.f175361F1) {
            xdl0.m208344M(this.f175370J, false);
            xdl0.m208345M0(this.f175376M.f39566e, false);
            xdl0.m208345M0(this.f175352C, false);
        }
        m192389N2(i);
    }

    /* JADX INFO: renamed from: X3 */
    private void m192420X3() {
        boolean z = this.f175430m1;
        this.f175430m1 = !z;
        this.f175365H.setImageResource(!z ? f3c0.f94593p0 : f3c0.f94585o0);
        xdl0.m208344M(this.f175427l, this.f175430m1);
        xdl0.m208344M(this.f175372K, this.f175366H0.get().booleanValue() && !this.f175430m1);
    }

    /* JADX INFO: renamed from: Y0 */
    private Rect m192422Y0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f175402Z.mo181994e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM192445g1 = m192445g1(i - i3, -1000, 1000);
        int iM192445g2 = m192445g1(iM192445g1 + iIntValue, -1000, 1000);
        int iM192445g3 = m192445g1(i2 - i3, -1000, 1000);
        return new Rect(iM192445g1, iM192445g3, iM192445g2, m192445g1(iIntValue + iM192445g3, -1000, 1000));
    }

    /* JADX INFO: renamed from: Z0 */
    private void m192425Z0() {
        this.f175441r1 = true;
        this.f175374L.setState(2);
        this.f175446u.m61726t();
        this.f175402Z.mo181998j();
        mo177483k(false);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m192426Z2() {
        if (this.f175367H1.size() <= 1 || !FeedModule.f38853b.m60523i2()) {
            return;
        }
        this.f175400Y.m187485x0(true);
    }

    /* JADX INFO: renamed from: a1 */
    private void m192428a1() {
        if (this.f175446u.getRecordDuration() >= m192468q1()) {
            m192415W2();
        } else {
            if (m192436d1() <= 0) {
                return;
            }
            if (this.f175363G0 > 0) {
                this.f175385Q0.start();
            } else {
                m192386M3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m192429a2() {
        xdl0.m208344M(this.f175444t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m192431b2() {
        xdl0.m208344M(this.f175374L, false);
        xdl0.m208344M(this.f175414f, false);
        this.f175443s1 = true;
        if (NullChecker.m81303a(this.f175419h1)) {
            this.f175419h1.cancel();
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m192432b3(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM103743p = bt0.m103743p(view, "translationY", 0L, 500L, z ? bt0.f77155b : bt0.f77154a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        bt0.m103729b(view, animatorM103743p);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.g8l0
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, z);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: c3 */
    private void m192434c3(final boolean z) {
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f175354D, "alpha", 100L, 150L, new LinearInterpolator(), z ? 0.0f : 1.0f, z ? 1.0f : 0.0f), bt0.m103743p(this.f175356E, "translationY", 0L, 300L, bt0.f77155b, z ? 0 : t100.m186890d(60.0f), z ? t100.m186890d(60.0f) : 0));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.w8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185231a.m192557v2(z);
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.x8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191529a.m192558w2(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: d1 */
    private long m192436d1() {
        long jM192468q1 = m192468q1() - m192553t1();
        if (jM192468q1 > 0) {
            return jM192468q1;
        }
        lsi0.m151578h(R$string.f38947O1);
        return 0L;
    }

    /* JADX INFO: renamed from: e1 */
    private void m192438e1() {
        if (PermissionHelper.m79881b("android.permission.CAMERA")) {
            return;
        }
        m192538k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m192439e2(View view) {
        int i = this.f175357E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view != this.f175374L.f39573e && view != this.f175376M.f39566e) {
            if (view == this.f175450w && i == 2) {
                this.f175398X.startActivityForResult(new Intent(getAct(), (Class<?>) MusicCenterAct.class), 1001);
                getAct().overridePendingTransition(uzb0.f178984i, uzb0.f178982g);
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.f175375L0, "my_states");
        VideoRecordFrag videoRecordFrag = this.f175398X;
        if (zEquals) {
            videoRecordFrag.startActivityForResult(MediaPickerAct.m78919X1(videoRecordFrag.act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        } else {
            videoRecordFrag.startActivityForResult(MediaPickerAct.m78919X1(getAct(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(true).needAllSelectedMediaPreview().withAlreadySelectedMedia(this.f175379N0).withSelectedFolderPath(this.f175381O0).withFromType(TextUtils.equals(this.f175375L0, "immersion") ? 5 : 2).withMediaPreviewPageId("p_camera_album_picture_preview").build()), 1002);
        }
        getAct().overridePendingTransition(uzb0.f178984i, uzb0.f178982g);
    }

    /* JADX INFO: renamed from: e3 */
    private void m192440e3(final boolean z) {
        int i = !z ? 1 : 0;
        CameraMenuView cameraMenuView = this.f175365H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(cameraMenuView, "alpha", 0L, 300L, linearInterpolator, f, f2), bt0.m103743p(this.f175368I, "alpha", 0L, 300L, new LinearInterpolator(), f, f2));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.o8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142646a.m192560y2();
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.p8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147613a.m192561z2(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: f1 */
    private void m192442f1() {
        if (this.f175398X.isResumed()) {
            this.f175400Y.m187484u0();
            if (this.f175357E0 != 5) {
                this.f175357E0 = 2;
            }
            Act act = getAct();
            if (NullChecker.m81304b(act) && !act.isFinishing()) {
                m192377K3();
            }
            MakeUpMenuView makeUpMenuView = this.f175397W0;
            if (makeUpMenuView != null) {
                makeUpMenuView.m61662B(this.f175402Z);
                this.f175397W0.m61664S();
            }
        }
    }

    /* JADX INFO: renamed from: f3 */
    private void m192443f3(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f175450w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(linearLayout, property, 0L, 200L, linearInterpolator, f, f2), bt0.m103739l(this.f175446u, property, 0L, 200L, new LinearInterpolator(), f, f2), bt0.m103743p(this.f175446u, "translationY", 0L, 200L, new LinearInterpolator(), i2, i3), bt0.m103739l(this.f175374L, property, 0L, 200L, new LinearInterpolator(), f, f2), bt0.m103739l(this.f175376M, property, 0L, 200L, new LinearInterpolator(), f2, f), bt0.m103739l(this.f175370J, property, 0L, 200L, new LinearInterpolator(), f2, f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.e8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89835a.m192495A2();
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.f8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96384a.m192496B2(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: g1 */
    private int m192445g1(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: g3 */
    private void m192446g3(String str, boolean z) {
        this.f175398X.m20597q4(str, z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: h1 */
    private MediaMeta m192448h1() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m192508L1() ? "front" : "back";
        mediaMeta.sticker = (this.f175395V0 == null || (cameraSticker = this.f175353C1) == null || TextUtils.equals(cameraSticker.f39219id, "empty")) ? null : this.f175353C1.f39219id;
        if (this.f175399X0 >= 0) {
            int size = this.f175367H1.size();
            int i = this.f175399X0;
            if (size > i) {
                str = this.f175367H1.get(i).mFilterId;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        mediaMeta.filter = TextUtils.equals(str, "0") ? null : str;
        return mediaMeta;
    }

    /* JADX INFO: renamed from: h3 */
    private void m192449h3() {
        this.f175398X.m20599s4();
    }

    /* JADX INFO: renamed from: i3 */
    private void m192451i3() {
        this.f175432n1.add(m192448h1());
    }

    /* JADX INFO: renamed from: j3 */
    private void m192453j3(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: l1 */
    private int m192456l1() {
        if (e51.m114773x() || e51.m114772w()) {
            return xdl0.m208331F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    private void m192458m1() {
        bt0.m103732e(this.f175422j);
        if (NullChecker.m81303a(this.f175387R0)) {
            this.f175387R0.cancel();
        }
        this.f175422j.setVisibility(0);
        ImageView imageView = this.f175422j;
        Property<View, Float> property = bt0.f77162i;
        Interpolator interpolator = bt0.f77155b;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(imageView, property, 0L, 300L, interpolator, 1.0f, 0.75f), bt0.m103743p(this.f175422j, "alpha", 0L, 300L, interpolator, 0.0f, 0.8f), bt0.m103743p(this.f175422j, "alpha", 400L, 200L, interpolator, 0.8f, 0.0f));
        this.f175387R0 = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.k9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122049a.m192512Q1();
            }
        });
        this.f175387R0.start();
    }

    /* JADX INFO: renamed from: m3 */
    private void m192459m3() {
        if (this.f175432n1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f175432n1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void m192542m2() {
        m192471r3(0, true, false);
        Iterator<tpd0> it = this.f175369I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: o1 */
    private int m192463o1() {
        return this.f175367H1.size();
    }

    /* JADX INFO: renamed from: o3 */
    private void m192464o3(String str, int i) {
        tpd0 tpd0Var = this.f175369I0.get("current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("current_filter_intensity" + FeedModule.m60221F().userId() + str, 50);
            this.f175369I0.put("current_filter_intensity" + str, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p1 */
    private float m192466p1(String str) {
        tpd0 tpd0Var = this.f175369I0.get("current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("current_filter_intensity" + FeedModule.m60221F().userId() + str, 50);
            this.f175369I0.put("current_filter_intensity" + str, tpd0Var);
        }
        return (tpd0Var.get().intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: q1 */
    private long m192468q1() {
        return djx.m112144h().m112145a() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public void m192469q3(int i, boolean z) {
        m192471r3(i, z, true);
    }

    /* JADX INFO: renamed from: r3 */
    private void m192471r3(int i, boolean z, boolean z2) {
        if (this.f175367H1.size() <= i || i < 0) {
            return;
        }
        this.f175358E1.put(this.f175367H1.get(i).mFilterId);
        boolean z3 = this.f175399X0 != i && z2;
        this.f175399X0 = i;
        float fM192466p1 = m192466p1(this.f175367H1.get(i).mFilterId);
        this.f175407b1 = fM192466p1;
        this.f175402Z.mo138861S(0, this.f175399X0, true, 0.0f, fM192466p1, -1.0f);
        this.f175402Z.setIntensity(this.f175407b1);
        if (NullChecker.m81303a(this.f175393U0)) {
            int i2 = (int) (this.f175407b1 * 100.0f);
            this.f175393U0.f39677c.setText(String.valueOf(i2));
            this.f175393U0.f39677c.setProgress(i2);
        }
        if (z3) {
            m192350C3(z);
        }
        if (i == 0) {
            t7l0.f168749c = false;
        } else {
            t7l0.f168749c = true;
        }
    }

    /* JADX INFO: renamed from: s1 */
    private String m192473s1() {
        int i = this.f175405a1;
        if (i == 1) {
            return xdl0.m208408w0() / xdl0.m208412y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : BuildConfig.VERSION_NAME;
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: s3 */
    private void m192474s3(boolean z) {
        int i = this.f175436p0;
        boolean z2 = false;
        if (i == 0) {
            xdl0.m208344M(this.f175374L, z);
            xdl0.m208344M(this.f175427l, z && this.f175430m1);
            xdl0.m208344M(this.f175372K, this.f175366H0.get().booleanValue() && !this.f175430m1 && z);
        } else if (i == 1) {
            xdl0.m208344M(this.f175376M, z);
        }
        xdl0.m208344M(this.f175450w, this.f175436p0 == 0 && !this.f175373K0 && z && this.f175446u.getCount() == 0);
        LinearLayout linearLayout = this.f175390T;
        if (!this.f175377M0 && !this.f175373K0 && z && this.f175446u.getCount() == 0) {
            z2 = true;
        }
        xdl0.m208344M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: t3 */
    private void m192476t3() {
        this.f175404a.getHolder().addCallback(new SurfaceHolderCallbackC20386a());
        this.f175448v.setOnClickListener(this);
        this.f175352C.setOnClickListener(this);
        this.f175354D.setOnClickListener(this);
        this.f175362G.setOnClickListener(this);
        this.f175359F.setOnClickListener(this);
        this.f175365H.setOnClickListener(this);
        this.f175370J.setOnClickListener(this);
        this.f175368I.setOnClickListener(this);
        this.f175449v1 = xck0.m208120a(500, new e30() { // from class: l.y7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196714a.m192556v1((Bundle) obj);
            }
        });
        m192355E1();
    }

    /* JADX INFO: renamed from: u3 */
    private void m192478u3(boolean z) {
        boolean z2 = this.f175361F1;
        CameraMenuView cameraMenuView = this.f175352C;
        boolean z3 = false;
        if (z2) {
            xdl0.m208345M0(cameraMenuView, false);
            xdl0.m208344M(this.f175354D, false);
            return;
        }
        xdl0.m208344M(cameraMenuView, this.f175402Z.mo182001s());
        if (this.f175402Z.mo181999m() && !m192508L1()) {
            z3 = true;
        }
        if (z3) {
            this.f175402Z.mo182000r(this.f175360F0);
        }
        if (z) {
            m192434c3(z3);
        } else {
            xdl0.m208344M(this.f175354D, z3);
            this.f175356E.setTranslationY(z3 ? t100.m186890d(72.0f) : 0.0f);
        }
        m192480v3();
    }

    /* JADX INFO: renamed from: v3 */
    private void m192480v3() {
        int i = this.f175360F0;
        if (i == 0) {
            this.f175354D.setImageResource(f175344L1);
        } else {
            if (i != 1) {
                return;
            }
            this.f175354D.setImageResource(f175343K1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private void m192483w1() {
        if (this.f175397W0 == null) {
            MakeUpMenuView makeUpMenuView = (MakeUpMenuView) this.f175382P.inflate();
            this.f175397W0 = makeUpMenuView;
            makeUpMenuView.setVisibility(8);
            this.f175397W0.m61676y();
            this.f175397W0.m61663D();
            this.f175397W0.setMenuDismissListener(new d30() { // from class: l.x7l0
                @Override // p149l.d30
                public final void call() {
                    this.f191369a.m192520U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x3 */
    private boolean m192486x3(int i) {
        return (m192380L2() || i == 4 || i == 5 || this.f175446u.getCount() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: y1 */
    private void m192489y1() {
        boolean z = this.f175361F1;
        VText vText = this.f175392U;
        if (z) {
            xdl0.m208345M0(vText, false);
            xdl0.m208345M0(this.f175394V, false);
            xdl0.m208345M0(this.f175390T, false);
            m192540k3();
            return;
        }
        xdl0.m208344M(vText, this.f175371J0);
        xdl0.m208344M(this.f175390T, (this.f175377M0 || this.f175373K0) ? false : true);
        this.f175383P0 = new View(getContext());
        for (final int i = 0; i < this.f175390T.getChildCount(); i++) {
            this.f175390T.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.i8l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112051a.m192523V1(i, view);
                }
            });
        }
        m192540k3();
    }

    /* JADX INFO: renamed from: y3 */
    private void m192490y3() {
        m192432b3(this.f175397W0, true);
        m192474s3(false);
    }

    /* JADX INFO: renamed from: z1 */
    private void m192493z1() {
        int childCount = this.f175431n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f175431n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.r9l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158384a.m192526X1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z3 */
    private void m192494z3(String str, final d30 d30Var) {
        xh0 xh0VarM208722a = new xh0.C21150a(this.f175398X.act()).m208728g(false).m208731j(str).m208726e(R$string.f39145s3).m208738q(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.q8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208736o(new View.OnClickListener() { // from class: l.r8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158239a.m192498C2(view);
            }
        }).m208722a();
        this.f175355D1 = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m192495A2() {
        xdl0.m208344M(this.f175450w, true);
        xdl0.m208344M(this.f175446u, true);
        xdl0.m208344M(this.f175374L, true);
        xdl0.m208344M(this.f175376M, true);
        xdl0.m208344M(this.f175370J, true);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m192496B2(boolean z) {
        this.f175446u.setTranslationY(0.0f);
        this.f175376M.setAlpha(1.0f);
        this.f175374L.setAlpha(1.0f);
        this.f175446u.setAlpha(1.0f);
        if (z) {
            xdl0.m208344M(this.f175376M, false);
            xdl0.m208344M(this.f175370J, false);
        } else {
            xdl0.m208344M(this.f175450w, false);
            xdl0.m208344M(this.f175446u, false);
            xdl0.m208344M(this.f175374L, false);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f175396W;
    }

    /* JADX INFO: renamed from: C1 */
    public void m192497C1(Bundle bundle) {
        if (NullChecker.m81303a(bundle)) {
            this.f175434o1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.m81303a(bundle.getSerializable("extra_music_content"))) {
                this.f175451w1 = (MusicContent) bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.m81303a(this.f175434o1)) {
                int i = this.f175434o1.speedIndex;
                this.f175455y1 = i;
                this.f175453x1 = f175345M1[i];
            }
            this.f175371J0 = bundle.getBoolean("extra_has_video", true);
            this.f175373K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f175375L0 = string;
            this.f175361F1 = TextUtils.equals(string, "from_sign_up");
            this.f175377M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.m81303a(bundle.getSerializable("extra_selected_images"))) {
                this.f175379N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f175381O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f175434o1 == null) {
            this.f175434o1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f175434o1;
        MusicContent musicContent = this.f175451w1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m192498C2(View view) {
        this.f175355D1.m208717c();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m192500E2() {
        this.f175443s1 = false;
        this.f175417g1 = null;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m192501E3() {
        m192432b3(this.f175395V0, true);
        m192474s3(false);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m192502G1() {
        if (this.f175395V0 == null) {
            MaskMenuView maskMenuView = (MaskMenuView) this.f175378N.inflate();
            this.f175395V0 = maskMenuView;
            maskMenuView.setMenuDismissListener(new d30() { // from class: l.g9l0
                @Override // p149l.d30
                public final void call() {
                    this.f101576a.m192545n2();
                }
            });
            this.f175395V0.setOnFaceResourceSelectListener(new C20390e());
            this.f175395V0.setCameraCategoryData(pb4.m168142O().m168184M());
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m192503G2() {
        m192469q3(this.f175399X0, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m192504G3(boolean z) {
        this.f175374L.m61465w(z);
        this.f175376M.m61442k(z);
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m192505H2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f175402Z.mo138861S(this.f175436p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m192506I2() {
        this.f175408c.setVisibility(8);
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m192507K2() {
        this.f175406b.setVisibility(8);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m192508L1() {
        return this.f175402Z.mo181994e();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m192509O1() {
        m192394O3(true);
        this.f175402Z.mo181988F();
        this.f175446u.m61726t();
        this.f175446u.m61713g();
        this.f175432n1.clear();
        this.f175402Z.mo181986D(false);
        this.f175374L.setState(2);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m192510P1() {
        MakeUpMenuView makeUpMenuView = this.f175397W0;
        if (makeUpMenuView != null) {
            makeUpMenuView.m61669i0();
        }
        this.f175402Z.mo181988F();
        this.f175374L.m61463u();
        this.f175402Z.release();
        m192538k1();
    }

    /* JADX INFO: renamed from: P2 */
    public void m192511P2() {
        this.f175402Z.mo138865n(new e30() { // from class: l.u8l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175143a.m192555u2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m192512Q1() {
        this.f175422j.setVisibility(8);
    }

    /* JADX INFO: renamed from: Q2 */
    public void m192513Q2() {
        m192438e1();
        if (NullChecker.m81303a(this.f175451w1) || TextUtils.equals("immersion", this.f175375L0)) {
            this.f175436p0 = 0;
        } else if (!this.f175371J0) {
            this.f175436p0 = 1;
        }
        xdl0.m208344M(this.f175450w, this.f175436p0 == 0);
        m192389N2(-1);
        m192368I1();
        m192372J1();
        m192376K1();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m192514R1(Intent intent) {
        this.f175398X.startActivity(intent);
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public void m192515R2() {
        if (vb4.m197675i()) {
            ib1.m135233b().mo135237e(CameraVideoControlView.f39568m);
            z4e0.m217068e();
            this.f175402Z.release();
            this.f175446u.m61723q();
            hli.m131662u();
            hli.m131661j().m131673r();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m192516S1(Bundle bundle) {
        this.f175398X.startActivity(VideoEditAct.m61232X1(getAct(), bundle));
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public void m192517S2() {
        this.f175357E0 = 1;
        this.f175385Q0.cancel();
        this.f175402Z.onPause();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m192518T1(final Bundle bundle) {
        m192532d3(new Runnable() { // from class: l.f9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96493a.m192516S1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m192519T2() {
        if (this.f175350B.getTranslationX() != 0.0f) {
            this.f175350B.setTranslationX(0.0f);
        }
        m192442f1();
        if (TextUtils.equals(this.f175375L0, SchemeKey.fake2good)) {
            return;
        }
        m192423Y3(false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m192520U1() {
        m192432b3(this.f175397W0, false);
        m192474s3(true);
    }

    /* JADX INFO: renamed from: U2 */
    public void m192521U2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.m81303a(this.f175397W0)) {
            this.f175397W0.m61661A(list, list2);
            this.f175397W0.m61664S();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public View m192522V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v9l0.m197577b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m192523V1(int i, View view) {
        if (this.f175436p0 == i) {
            return;
        }
        this.f175383P0.setTag(Integer.valueOf(i));
        this.f175445t1.call(this.f175383P0);
    }

    /* JADX INFO: renamed from: V2 */
    public void m192524V2(MusicContent musicContent) {
        this.f175451w1 = musicContent;
        VideoInfo videoInfo = this.f175434o1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m81303a(musicContent)) {
            this.f175454y.setText(musicContent.name);
        }
        this.f175402Z.mo138872x(musicContent);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(t7l0 t7l0Var) {
        this.f175400Y = t7l0Var;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m192526X1(int i, View view) {
        m192373J3(i);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m192527Y1(View view) {
        this.f175447u1.call(view);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m192528Z1(int i) {
        this.f175444t.setText(String.valueOf(i));
        this.f175444t.setAlpha(0.0f);
        xdl0.m208344M(this.f175444t, true);
    }

    @Override // p149l.s1m.InterfaceC19826a
    /* JADX INFO: renamed from: a */
    public void mo182003a(String str) {
        lsi0.m151578h(R$string.f38953P1);
        this.f175446u.m61713g();
        mo177483k(false);
    }

    /* JADX INFO: renamed from: a3 */
    public void m192529a3(List<CameraCategory> list) {
        if (NullChecker.m81303a(this.f175395V0)) {
            this.f175395V0.setCameraCategoryData(list);
        }
        m192426Z2();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (CompactMediaPickerAct) this.f175396W;
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: b */
    public long mo177479b() {
        return this.f175446u.getLastSliceDuration();
    }

    @Override // p149l.s1m.InterfaceC19826a
    /* JADX INFO: renamed from: c */
    public void mo182004c(String str, boolean z) {
        if (this.f175446u.getRecordDuration() < 3000) {
            lsi0.m151578h(R$string.f38868B0);
            return;
        }
        Video video = new Video(0, str);
        ebl0.m115507c(video);
        m192449h3();
        if (z && NullChecker.m81303a(this.f175449v1)) {
            this.f175449v1.call(m192544n1(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m192530c2() {
        if (this.f175444t.getTag() == null) {
            m192386M3();
        }
        this.f175444t.setTag(null);
        xdl0.m208344M(this.f175374L, true);
        this.f175443s1 = false;
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo177480d() {
        return this.f175404a.getHolder();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m192531d2() {
        this.f175444t.setTag(Boolean.TRUE);
        m192359F3(0);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m192532d3(Runnable runnable) {
        Animator animatorM103743p = bt0.m103743p(this.f175350B, "translationX", 0L, 100L, new LinearInterpolator(), 0.0f, t100.m186890d(60.0f));
        bt0.m103733f(animatorM103743p, runnable);
        animatorM103743p.start();
    }

    @Override // p149l.s7m
    public void destroy() {
        CameraEffectMgr.m61340V().m61401r();
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: e */
    public void mo177481e() {
        this.f175446u.m61713g();
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: f */
    public void mo167786f(View view) {
        this.f175446u.m61721o();
        m192494z3(getAct().getString(R$string.f38862A0), new d30() { // from class: l.d8l0
            @Override // p149l.d30
            public final void call() {
                this.f84876a.m192547p2();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m192533f2(View view) {
        int i = this.f175357E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f175448v) {
            m192537j1();
            return;
        }
        if (view == this.f175362G) {
            m192490y3();
            return;
        }
        if (view == this.f175368I) {
            m192402R3();
            return;
        }
        if (view == this.f175354D) {
            m192411U3();
            return;
        }
        if (view == this.f175359F) {
            if (this.f175393U0 == null) {
                m192357F1();
            }
            m192348B3();
            return;
        }
        if (view == this.f175352C) {
            this.f175402Z.mo138864f();
            return;
        }
        if (view == this.f175365H) {
            m192420X3();
            return;
        }
        if (view == this.f175374L.f39571c || view == this.f175376M.f39564c) {
            if (this.f175395V0 == null) {
                m192502G1();
            }
            m192501E3();
            m84.m153429e().m153440l();
            return;
        }
        View view2 = this.f175383P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m192548p3(((Integer) this.f175383P0.getTag()).intValue());
            }
        } else if (view == this.f175370J) {
            int i2 = this.f175405a1 + 1;
            this.f175405a1 = i2;
            if (i2 > 3) {
                this.f175405a1 = 1;
            }
            m192413V3(this.f175405a1);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m192534g2() {
        m192432b3(this.f175393U0, false);
        m192474s3(true);
    }

    @Override // p149l.r1m
    public int getCount() {
        return this.f175446u.getCount();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m192535h2(Integer num) {
        m192469q3(num.intValue(), this.f175399X0 - num.intValue() > 0);
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: i */
    public void mo167787i(View view) {
        this.f175445t1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m192536i2(Float f) {
        this.f175402Z.setIntensity(f.floatValue());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM192522V0 = m192522V0(layoutInflater, viewGroup);
        m192489y1();
        m192476t3();
        m192345A1();
        m192347B1();
        m192493z1();
        m192364H1();
        m192483w1();
        if (NullChecker.m81303a(this.f175451w1)) {
            this.f175454y.setText(this.f175451w1.name);
        }
        xdl0.m208344M(this.f175372K, this.f175366H0.get().booleanValue());
        return viewM192522V0;
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: j */
    public int mo177482j() {
        return this.f175360F0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m192537j1() {
        ixl ixlVar;
        if (this.f175446u == null || this.f175374L == null || (ixlVar = this.f175402Z) == null) {
            m192538k1();
            return;
        }
        if (ixlVar.mo181996h()) {
            this.f175374L.setState(5);
        }
        d30 d30Var = new d30() { // from class: l.z7l0
            @Override // p149l.d30
            public final void call() {
                this.f202041a.m192509O1();
            }
        };
        if (this.f175446u.getCount() == 0) {
            m192494z3(getAct().getString(R$string.f39130q0), new d30() { // from class: l.a8l0
                @Override // p149l.d30
                public final void call() {
                    this.f68055a.m192510P1();
                }
            });
        } else {
            m192494z3(getAct().getString(R$string.f38880D0), d30Var);
        }
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: k */
    public void mo177483k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f175446u.getRecordDuration() != 0 && i == 2) {
            this.f175446u.m61726t();
            i = 5;
        }
        this.f175374L.setState(i);
        m192449h3();
    }

    /* JADX INFO: renamed from: k1 */
    public void m192538k1() {
        Act act = getAct();
        if (!NullChecker.m81304b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m192539k2(MMPresetFilter mMPresetFilter, Integer num) {
        m192464o3(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: k3 */
    public void m192540k3() {
        int i = 0;
        while (i < this.f175390T.getChildCount()) {
            m192453j3((VText) this.f175390T.getChildAt(i), this.f175436p0 == i);
            i++;
        }
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: l */
    public void mo177484l() {
        m192446g3(getAct().getString(R$string.f39138r2), true);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m192541l2(Boolean bool) {
        this.f175402Z.mo138853C(bool.booleanValue());
    }

    @Override // p149l.hxl
    /* JADX INFO: renamed from: m */
    public void mo133344m() {
        m192478u3(true);
    }

    @Override // p149l.zji
    /* JADX INFO: renamed from: n */
    public void mo192543n(float f, int i) {
        if (i == 1) {
            this.f175402Z.mo138855L(new float[]{f, f});
            t7l0.f168750d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f175401Y0 = f;
            float[] fArr = f175347O1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f175403Z0 * 0.6f;
            if (!this.f175402Z.mo138854H() && this.f175402Z.mo138859Q()) {
                this.f175402Z.mo138871w(fArr);
            }
            t7l0.f168751e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f175403Z0 = f;
        float[] fArr2 = f175347O1;
        fArr2[0] = this.f175401Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f175402Z.mo138854H() && this.f175402Z.mo138859Q()) {
            this.f175402Z.mo138871w(fArr2);
        }
        t7l0.f168752f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final Bundle m192544n1(Video video) {
        Bundle bundle = new Bundle();
        if (this.f175434o1 == null) {
            this.f175434o1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f175357E0 == 0;
        rlw rlwVarMo181991K = this.f175402Z.mo181991K();
        if (NullChecker.m81303a(rlwVarMo181991K)) {
            video.rotate = rlwVarMo181991K.m179930v();
        }
        MusicContent musicContentMo138873z = this.f175402Z.mo138873z();
        video.isFrontCamera = this.f175402Z.mo181994e();
        String strMo138860R = this.f175402Z.mo138860R(this.f175399X0);
        if (NullChecker.m81303a(musicContentMo138873z)) {
            video.playingMusic = musicContentMo138873z;
        }
        VideoInfo videoInfo = this.f175434o1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo138860R;
        int i = this.f175357E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f175360F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f175434o1;
        videoInfo2.choseDelayTime = this.f175363G0;
        videoInfo2.maxDuration = m192468q1();
        VideoInfo videoInfo3 = this.f175434o1;
        videoInfo3.speedIndex = this.f175455y1;
        MusicContent musicContent = this.f175451w1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f175432n1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f175434o1);
        bundle.putString("my_states", this.f175375L0);
        if (this.f175436p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f175446u.m61718l());
        }
        bundle.putString("extra_from", this.f175375L0);
        return bundle;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m192545n2() {
        m192432b3(this.f175395V0, false);
        m192474s3(true);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m192546o2(long j) {
        String str;
        if (this.f175357E0 != 4) {
            return;
        }
        int i = (int) (j / 1000);
        int i2 = i / 60;
        int i3 = i % 60;
        String str2 = i2 + "";
        if (i3 >= 10) {
            str = i3 + "";
        } else {
            str = "0" + i3;
        }
        if (!this.f175456z.isShown()) {
            xdl0.m208344M(this.f175456z, true);
        }
        this.f175348A.setText(str2 + ":" + str);
        if (j >= m192468q1()) {
            m192415W2();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f175445t1.call(view);
    }

    @Override // p149l.s1m.InterfaceC19826a
    public void onError(final int i, final int i2) {
        e51.m114748M(new Runnable() { // from class: l.j8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116724a.m192549q2(i, i2);
            }
        });
    }

    @Override // p149l.r1m
    public void onFirstFrameRendered() {
        this.f175374L.m61455m();
    }

    @Override // p149l.p84
    public void onStateChanged(int i) {
        this.f175357E0 = i;
        if ((this.f175398X.isResumed() || this.f175398X.lifecycle_() == C4319c.f15549j) && !this.f175361F1) {
            m192369I3(i);
        }
        if (i == 3) {
            if (this.f175436p0 != 1) {
                this.f175374L.setState(2);
                return;
            } else {
                m192416W3();
                return;
            }
        }
        if (i == 4) {
            if (this.f175436p0 != 0) {
                this.f175374L.setState(2);
                return;
            } else {
                m192381L3();
                return;
            }
        }
        if (i != 5) {
            if (i != 6) {
                return;
            }
            if (this.f175446u.getRecordDuration() >= m192550r1()) {
                this.f175402Z.mo181992O();
                return;
            } else {
                lsi0.m151578h(R$string.f38868B0);
                this.f175374L.setState(5);
                return;
            }
        }
        this.f175385Q0.cancel();
        if (this.f175402Z.mo181996h()) {
            m192394O3(true);
        }
        long recordDuration = this.f175446u.getRecordDuration();
        long jM192550r1 = m192550r1();
        CameraVideoControlView cameraVideoControlView = this.f175374L;
        if (recordDuration < jM192550r1) {
            cameraVideoControlView.f39576h.setImageResource(f3c0.f94548j3);
        } else {
            cameraVideoControlView.f39576h.setImageResource(f3c0.f94540i3);
        }
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: p */
    public boolean mo167788p() {
        MakeUpMenuView makeUpMenuView = this.f175397W0;
        if (makeUpMenuView != null && makeUpMenuView.getVisibility() == 0) {
            return true;
        }
        FilterMenuView filterMenuView = this.f175393U0;
        if (filterMenuView != null && filterMenuView.getVisibility() == 0) {
            return true;
        }
        MaskMenuView maskMenuView = this.f175395V0;
        return (maskMenuView != null && maskMenuView.getVisibility() == 0) || !this.f175398X.lifecycle_().f15555a;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m192547p2() {
        this.f175446u.m61724r();
        m192459m3();
        this.f175402Z.removeLast();
        if (this.f175446u.getCount() <= 0) {
            this.f175402Z.mo181986D(false);
            this.f175374L.setState(2);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m192548p3(int i) {
        int i2 = this.f175436p0;
        this.f175436p0 = i;
        m192419X2(i2);
        m192540k3();
        m192423Y3(true);
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: q */
    public void mo177485q(String str, Exception exc) {
        this.f175376M.setEnabled(true);
        if (NullChecker.m81303a(this.f175393U0)) {
            bt0.m103732e(this.f175393U0);
            this.f175393U0.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f175397W0)) {
            bt0.m103732e(this.f175397W0);
            this.f175397W0.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f175395V0)) {
            bt0.m103732e(this.f175395V0);
            this.f175395V0.setVisibility(8);
        }
        m192474s3(true);
        if (exc != null) {
            lsi0.m151578h(R$string.f38875C1);
            return;
        }
        if (!this.f175361F1) {
            if (vi00.m198490b()) {
                m192554u1(str);
            }
        } else if (NullChecker.m81303a(getAct())) {
            Intent intent = new Intent();
            intent.putExtra("select_image_path", str);
            getAct().setResult(-1, intent);
            m192538k1();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m192549q2(int i, int i2) {
        if (i == -302) {
            m192425Z0();
            lsi0.m151578h(R$string.f38971S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m192425Z0();
            lsi0.m151578h(R$string.f38959Q1);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public long m192550r1() {
        return 3000L;
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m192551r2(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m192466p1(mMPresetFilter.mFilterId);
    }

    @Override // p149l.r1m
    public void removeLast() {
        this.f175446u.m61726t();
        this.f175446u.m61724r();
        if (this.f175446u.getCount() <= 0) {
            this.f175402Z.mo181986D(false);
            this.f175374L.setState(2);
        }
    }

    @Override // p149l.hxl
    /* JADX INFO: renamed from: s */
    public void mo133345s(float f, int i) {
        if (NullChecker.m81303a(this.f175397W0)) {
            this.f175397W0.m61664S();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m192552s2() {
        if (NullChecker.m81303a(this.f175393U0)) {
            this.f175393U0.setFilterData(this.f175367H1);
        }
        final String str = this.f175358E1.get();
        int iM200293G = vwb.m200293G(this.f175367H1, new w9j() { // from class: l.n9l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iM200293G > 0) {
            this.f175399X0 = iM200293G;
        }
        m192469q3(this.f175399X0, false);
        m192426Z2();
    }

    /* JADX INFO: renamed from: t1 */
    public long m192553t1() {
        return this.f175446u.getRecordDuration();
    }

    @Override // p149l.r1m
    /* JADX INFO: renamed from: u */
    public boolean mo177486u() {
        return m192553t1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m192554u1(String str) {
        Photo photo = new Photo(0, str);
        photo.isTakePhoto = true;
        photo.tempPath = str;
        photo.isOriginal = true;
        MediaMeta mediaMetaM192448h1 = m192448h1();
        mediaMetaM192448h1.proportion = m192473s1();
        final Intent intentM61030g2 = ImageEditAct.m61030g2(getAct(), photo, mediaMetaM192448h1, this.f175375L0, this.f175377M0, this.f175381O0);
        m192532d3(new Runnable() { // from class: l.s8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163089a.m192514R1(intentM61030g2);
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m192555u2(List list) {
        this.f175367H1 = list;
        if (list == null) {
            this.f175367H1 = new ArrayList();
        }
        vwb.m200354z(this.f175367H1, new e30() { // from class: l.i9l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112231a.m192551r2((MMPresetFilter) obj);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.j9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116936a.m192552s2();
            }
        });
    }

    @Override // p149l.p84
    /* JADX INFO: renamed from: v */
    public void mo167789v(View view) {
        this.f175447u1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m192556v1(final Bundle bundle) {
        e51.m114748M(new Runnable() { // from class: l.m8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132586a.m192518T1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m192557v2(boolean z) {
        xdl0.m208344M(this.f175354D, true);
        this.f175354D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m192558w2(boolean z) {
        xdl0.m208344M(this.f175354D, z);
    }

    /* JADX INFO: renamed from: w3 */
    public void m192559w3(Media media) {
        this.f175374L.m61456n(media);
        this.f175376M.m61437f(media);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m192560y2() {
        xdl0.m208344M(this.f175365H, true);
        xdl0.m208344M(this.f175368I, true);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m192561z2(boolean z) {
        xdl0.m208344M(this.f175365H, z);
        xdl0.m208344M(this.f175368I, z);
    }

    /* JADX INFO: renamed from: l.u9l0$a */
    public class SurfaceHolderCallbackC20386a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC20386a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            u9l0.this.f175423j1 = i2;
            u9l0.this.f175426k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.u9l0$b */
    public class C20387b implements FilterScrollMoreViewPager.InterfaceC11176c {

        /* JADX INFO: renamed from: a */
        public boolean f175459a = false;

        public C20387b() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11176c
        /* JADX INFO: renamed from: a */
        public void mo61604a(float f) {
            if (u9l0.this.m192385M2() || u9l0.this.f175402Z.mo181996h() || u9l0.this.m192384M1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f175459a = z;
            u9l0.this.m192405S3(z, f);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11176c
        /* JADX INFO: renamed from: b */
        public void mo61605b(float f) {
            if (u9l0.this.m192385M2() || u9l0.this.f175402Z.mo181996h() || u9l0.this.m192384M1() || u9l0.this.f175389S0 == 0.0f) {
                return;
            }
            u9l0.this.m192408T3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11176c
        public void onCancel() {
            if (u9l0.this.m192385M2() || u9l0.this.f175402Z.mo181996h() || u9l0.this.m192384M1() || u9l0.this.f175389S0 == 0.0f) {
                return;
            }
            u9l0.this.m192408T3(!this.f175459a, true, true, 200L);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11176c
        /* JADX INFO: renamed from: c */
        public void mo61606c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m192423Y3(boolean z) {
    }
}
