package p007l;

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
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.bt0;
import l.d30;
import l.djx;
import l.e30;
import l.e51;
import l.f30;
import l.h3x;
import l.hpd0;
import l.ib1;
import l.lsi0;
import l.qib0;
import l.rlw;
import l.s4l0;
import l.s7m;
import l.t100;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xdl0;
import l.xh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u9l0 implements s7m<t7l0>, hxl, View.OnClickListener, zji, p84 {

    /* JADX INFO: renamed from: I1 */
    public static final int f13663I1 = f3c0.f7780d0;

    /* JADX INFO: renamed from: J1 */
    public static final int f13664J1 = f3c0.f7772c0;

    /* JADX INFO: renamed from: K1 */
    public static final int f13665K1 = f3c0.f7804g0;

    /* JADX INFO: renamed from: L1 */
    public static final int f13666L1 = f3c0.f7796f0;

    /* JADX INFO: renamed from: M1 */
    public static final float[] f13667M1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: N1 */
    public static final float[] f13668N1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: O1 */
    public static final float[] f13669O1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f13670A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f13672B;

    /* JADX INFO: renamed from: B1 */
    public String f13673B1;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f13674C;

    /* JADX INFO: renamed from: C1 */
    public CameraSticker f13675C1;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f13676D;

    /* JADX INFO: renamed from: D1 */
    public xh0 f13677D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f13678E;

    /* JADX INFO: renamed from: F */
    public CameraMenuView f13681F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f13684G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f13687H;

    /* JADX INFO: renamed from: I */
    public CameraMenuView f13690I;

    /* JADX INFO: renamed from: J */
    public CameraMenuView f13692J;

    /* JADX INFO: renamed from: J0 */
    public boolean f13693J0;

    /* JADX INFO: renamed from: K */
    public TextView f13694K;

    /* JADX INFO: renamed from: K0 */
    public boolean f13695K0;

    /* JADX INFO: renamed from: L */
    public CameraVideoControlView f13696L;

    /* JADX INFO: renamed from: L0 */
    public String f13697L0;

    /* JADX INFO: renamed from: M */
    public CameraPhotoControlView f13698M;

    /* JADX INFO: renamed from: M0 */
    public boolean f13699M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f13700N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f13701N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f13702O;

    /* JADX INFO: renamed from: O0 */
    public String f13703O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f13704P;

    /* JADX INFO: renamed from: P0 */
    public View f13705P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f13706Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f13707Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f13708R;

    /* JADX INFO: renamed from: R0 */
    public Animator f13709R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f13710S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f13712T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f13713T0;

    /* JADX INFO: renamed from: U */
    public VText f13714U;

    /* JADX INFO: renamed from: U0 */
    public FilterMenuView f13715U0;

    /* JADX INFO: renamed from: V */
    public VText f13716V;

    /* JADX INFO: renamed from: V0 */
    public MaskMenuView f13717V0;

    /* JADX INFO: renamed from: W */
    public Context f13718W;

    /* JADX INFO: renamed from: W0 */
    public MakeUpMenuView f13719W0;

    /* JADX INFO: renamed from: X */
    public VideoRecordFrag f13720X;

    /* JADX INFO: renamed from: Y */
    public t7l0 f13722Y;

    /* JADX INFO: renamed from: Y0 */
    public float f13723Y0;

    /* JADX INFO: renamed from: Z */
    public ixl f13724Z;

    /* JADX INFO: renamed from: Z0 */
    public float f13725Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f13726a;

    /* JADX INFO: renamed from: b */
    public View f13728b;

    /* JADX INFO: renamed from: b1 */
    public float f13729b1;

    /* JADX INFO: renamed from: c */
    public View f13730c;

    /* JADX INFO: renamed from: c1 */
    public float f13731c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f13732d;

    /* JADX INFO: renamed from: d1 */
    public float f13733d1;

    /* JADX INFO: renamed from: e */
    public FilterScrollMoreViewPager f13734e;

    /* JADX INFO: renamed from: e1 */
    public float f13735e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f13736f;

    /* JADX INFO: renamed from: f1 */
    public float f13737f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f13738g;

    /* JADX INFO: renamed from: g1 */
    public Animator f13739g1;

    /* JADX INFO: renamed from: h */
    public TextView f13740h;

    /* JADX INFO: renamed from: h1 */
    public Animator f13741h1;

    /* JADX INFO: renamed from: i */
    public TextView f13742i;

    /* JADX INFO: renamed from: i1 */
    public Animator f13743i1;

    /* JADX INFO: renamed from: j */
    public ImageView f13744j;

    /* JADX INFO: renamed from: j1 */
    public int f13745j1;

    /* JADX INFO: renamed from: k */
    public TextView f13746k;

    /* JADX INFO: renamed from: k0 */
    public z4e0 f13747k0;

    /* JADX INFO: renamed from: k1 */
    public int f13748k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f13749l;

    /* JADX INFO: renamed from: l1 */
    public h3x f13750l1;

    /* JADX INFO: renamed from: m */
    public View f13751m;

    /* JADX INFO: renamed from: m1 */
    public boolean f13752m1;

    /* JADX INFO: renamed from: n */
    public LinearLayout f13753n;

    /* JADX INFO: renamed from: o */
    public TextView f13755o;

    /* JADX INFO: renamed from: o1 */
    public VideoInfo f13756o1;

    /* JADX INFO: renamed from: p */
    public TextView f13757p;

    /* JADX INFO: renamed from: q */
    public TextView f13760q;

    /* JADX INFO: renamed from: r */
    public TextView f13762r;

    /* JADX INFO: renamed from: r1 */
    public boolean f13763r1;

    /* JADX INFO: renamed from: s */
    public TextView f13764s;

    /* JADX INFO: renamed from: s1 */
    public boolean f13765s1;

    /* JADX INFO: renamed from: t */
    public TextView f13766t;

    /* JADX INFO: renamed from: t1 */
    public e30<View> f13767t1;

    /* JADX INFO: renamed from: u */
    public VideoRecordProgressView f13768u;

    /* JADX INFO: renamed from: u1 */
    public e30<View> f13769u1;

    /* JADX INFO: renamed from: v */
    public ImageView f13770v;

    /* JADX INFO: renamed from: v1 */
    public e30<Bundle> f13771v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f13772w;

    /* JADX INFO: renamed from: w1 */
    public MusicContent f13773w1;

    /* JADX INFO: renamed from: x */
    public ImageView f13774x;

    /* JADX INFO: renamed from: y */
    public TextView f13776y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f13778z;

    /* JADX INFO: renamed from: z1 */
    public boolean f13779z1;

    /* JADX INFO: renamed from: p0 */
    public int f13758p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f13679E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f13682F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f13685G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public hpd0 f13688H0 = new hpd0("need_show_tip" + FeedModule.m1139F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, tpd0> f13691I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f13711S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f13721X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f13727a1 = 1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<MediaMeta> f13754n1 = new ArrayList<>();

    /* JADX INFO: renamed from: p1 */
    public int f13759p1 = 0;

    /* JADX INFO: renamed from: q1 */
    public boolean f13761q1 = true;

    /* JADX INFO: renamed from: x1 */
    public float f13775x1 = 1.0f;

    /* JADX INFO: renamed from: y1 */
    public int f13777y1 = 2;

    /* JADX INFO: renamed from: A1 */
    public boolean f13671A1 = true;

    /* JADX INFO: renamed from: E1 */
    public uqd0 f13680E1 = new uqd0("camera_filter_id" + FeedModule.m1139F().userId(), (String) null);

    /* JADX INFO: renamed from: F1 */
    public boolean f13683F1 = false;

    /* JADX INFO: renamed from: G1 */
    public boolean f13686G1 = true;

    /* JADX INFO: renamed from: H1 */
    public List<MMPresetFilter> f13689H1 = new ArrayList();

    /* JADX INFO: renamed from: l.u9l0$c */
    public class C2510c extends GestureDetector.SimpleOnGestureListener {
        public C2510c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            u9l0.this.m14898O2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.u9l0$d */
    public class C2511d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f13784a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f13785b;

        public C2511d(int i, boolean z) {
            this.f13784a = i;
            this.f13785b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u9l0.this.m14974q3(this.f13784a, this.f13785b);
            u9l0.this.f13711S0 = 0.0f;
        }
    }

    /* JADX INFO: renamed from: l.u9l0$e */
    public class C2512e implements MaskMenuView.InterfaceC2023a {
        public C2512e() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC2023a
        /* JADX INFO: renamed from: a */
        public void mo2642a(int i, boolean z) {
            boolean zMo11045Q = u9l0.this.f13724Z.mo11045Q();
            u9l0.this.f13673B1 = null;
            if (NullChecker.a(u9l0.this.f13675C1)) {
                if (u9l0.this.f13675C1.isBeautySticker()) {
                    u9l0.this.f13724Z.mo11048T();
                }
                u9l0.this.f13675C1 = null;
            }
            u9l0.this.f13696L.f1032c.m2381e();
            u9l0.this.f13698M.f1025c.m2381e();
            if (NullChecker.a(u9l0.this.f13741h1)) {
                u9l0.this.f13741h1.cancel();
            }
            if (NullChecker.a(u9l0.this.f13743i1)) {
                u9l0.this.f13743i1.cancel();
            }
            if (z) {
                return;
            }
            u9l0.this.f13724Z.mo11049U();
            if (zMo11045Q || !u9l0.this.f13724Z.mo11045Q()) {
                return;
            }
            u9l0.this.f13724Z.mo11057w(u9l0.f13669O1);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC2023a
        /* JADX INFO: renamed from: b */
        public void mo2643b(CameraSticker cameraSticker, int i, boolean z) {
            yb4.m17102c().m17114m(cameraSticker);
            u9l0.this.f13717V0.m2641i(i);
            if (!cameraSticker.hasModelFile || z || cameraSticker.f680id.equals(u9l0.this.f13673B1)) {
                return;
            }
            boolean zMo11045Q = u9l0.this.f13724Z.mo11045Q();
            u9l0.this.f13675C1 = cameraSticker;
            u9l0.this.f13673B1 = cameraSticker.f680id;
            if (NullChecker.a(u9l0.this.f13741h1)) {
                u9l0.this.f13741h1.cancel();
            }
            boolean zIsBeautySticker = cameraSticker.isBeautySticker();
            u9l0 u9l0Var = u9l0.this;
            if (zIsBeautySticker) {
                u9l0Var.f13750l1 = null;
                u9l0.this.f13724Z.mo11043N(new File(cameraSticker.modelFilePath));
            } else {
                u9l0Var.f13671A1 = true;
                u9l0.this.f13779z1 = true;
                u9l0.this.f13724Z.mo11048T();
                u9l0.this.f13724Z.mo11038B();
                u9l0 u9l0Var2 = u9l0.this;
                u9l0Var2.f13750l1 = s4l0.a(u9l0Var2.m15002C0(), new File(cameraSticker.modelFilePath));
                if (NullChecker.b(u9l0.this.f13750l1)) {
                    u9l0.this.f13724Z.mo11037A(u9l0.this.f13750l1);
                }
            }
            qib0.G.L0(u9l0.this.f13696L.f1032c.getDraweeView(), cameraSticker.icon);
            qib0.G.L0(u9l0.this.f13698M.f1025c.getDraweeView(), cameraSticker.icon);
            if (NullChecker.a(u9l0.this.f13750l1)) {
                u9l0.this.m14974q3(0, false);
            }
            if (!zMo11045Q && u9l0.this.f13724Z.mo11045Q()) {
                u9l0.this.f13724Z.mo11057w(u9l0.f13669O1);
            }
            if (NullChecker.a(u9l0.this.f13719W0)) {
                u9l0.this.f13719W0.m2616S();
            }
        }
    }

    public u9l0(VideoRecordFrag videoRecordFrag) {
        this.f13720X = videoRecordFrag;
        this.f13718W = videoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: A1 */
    private void m14850A1() {
        this.f13772w.setOnClickListener(new View.OnClickListener() { // from class: l.s9l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12849a.m15033Y1(view);
            }
        });
        xdl0.z(this.f13776y);
        this.f13696L.setCallback(this);
        this.f13698M.setCallback(this);
        this.f13722Y.m14478y0();
    }

    /* JADX INFO: renamed from: B1 */
    private void m14852B1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f13766t;
            Interpolator interpolator = bt0.d;
            Animator animatorZ = bt0.z(new Animator[]{bt0.p(textView, "scaleX", 500L, 500L, interpolator, new float[]{0.3f, 1.2f}), bt0.p(this.f13766t, "scaleY", 500L, 500L, interpolator, new float[]{0.3f, 1.2f}), bt0.p(this.f13766t, "alpha", 500L, 500L, interpolator, new float[]{0.3f, 1.2f})});
            bt0.v(animatorZ, new Runnable() { // from class: l.t8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13232a.m15034Z1(i);
                }
            });
            bt0.f(animatorZ, new Runnable() { // from class: l.e9l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7262a.m14934a2();
                }
            });
            arrayList.add(animatorZ);
        }
        Animator animatorS = bt0.s(new Animator[]{(Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2)});
        this.f13707Q0 = animatorS;
        bt0.v(animatorS, new Runnable() { // from class: l.o9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11397a.m14936b2();
            }
        });
        bt0.g(this.f13707Q0, new Runnable() { // from class: l.p9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11740a.m15036c2();
            }
        }, new Runnable() { // from class: l.q9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12172a.m15037d2();
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private void m14853B3() {
        if (this.f13689H1.size() <= 1) {
            FeedModule.f314b.f653H.z();
            lsi0.h(R$string.f377J0);
        }
        this.f13715U0.m2541p();
        m14937b3(this.f13715U0, true);
        m14979s3(false);
    }

    /* JADX INFO: renamed from: C3 */
    private void m14855C3(final boolean z) {
        String strMo11044P = this.f13724Z.mo11044P(this.f13721X0);
        if (NullChecker.a(this.f13715U0)) {
            this.f13715U0.m2542q(this.f13721X0);
        }
        if (TextUtils.isEmpty(strMo11044P)) {
            return;
        }
        this.f13742i.setText(strMo11044P);
        e51.G(new Runnable() { // from class: l.v8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14104a.m15005D2(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3, reason: merged with bridge method [inline-methods] */
    public void m15005D2(boolean z) {
        bt0.e(this.f13742i);
        if (NullChecker.a(this.f13739g1)) {
            this.f13739g1.cancel();
        }
        Animator animatorP = bt0.p(this.f13742i, "translationX", 0L, 300L, bt0.a, new float[]{z ? -100.0f : 100.0f, 0.0f});
        TextView textView = this.f13742i;
        Interpolator interpolator = bt0.d;
        Animator animatorZ = bt0.z(new Animator[]{animatorP, bt0.p(textView, "alpha", 0L, 300L, interpolator, new float[]{0.0f, 1.2f}), bt0.p(this.f13742i, "alpha", 1800L, 600L, interpolator, new float[]{1.2f, 0.0f})});
        this.f13739g1 = animatorZ;
        bt0.v(animatorZ, new Runnable() { // from class: l.l9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9968a.m14863F2();
            }
        });
        bt0.f(this.f13739g1, new Runnable() { // from class: l.m9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10368a.m15006E2();
            }
        });
        this.f13739g1.start();
    }

    /* JADX INFO: renamed from: E1 */
    private void m14860E1() {
        this.f13769u1 = xck0.a(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, new e30() { // from class: l.b8l0
            public final void call(Object obj) {
                this.f6180a.m14944e2((View) obj);
            }
        });
        this.f13767t1 = xck0.a(500, new e30() { // from class: l.c8l0
            public final void call(Object obj) {
                this.f6567a.m15039f2((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    private void m14862F1() {
        if (this.f13715U0 == null) {
            FilterMenuView filterMenuView = (FilterMenuView) this.f13702O.inflate();
            this.f13715U0 = filterMenuView;
            filterMenuView.setFilterData(this.f13689H1);
            this.f13715U0.m2542q(this.f13721X0);
            int size = this.f13689H1.size();
            int i = this.f13721X0;
            int iM14971p1 = (i < 0 || i >= size) ? 50 : (int) (m14971p1(this.f13689H1.get(i).mFilterId) * 100.0f);
            this.f13715U0.f1138c.setText(String.valueOf(iM14971p1));
            this.f13715U0.f1138c.setProgress(iM14971p1);
            this.f13715U0.setMenuDismissListener(new d30() { // from class: l.y8l0
                public final void call() {
                    this.f15302a.m15040g2();
                }
            });
            this.f13715U0.setOnItemClickCallback(new e30() { // from class: l.z8l0
                public final void call(Object obj) {
                    this.f15662a.m15041h2((Integer) obj);
                }
            });
            this.f13715U0.setIntensityChangedCallback(new e30() { // from class: l.a9l0
                public final void call(Object obj) {
                    this.f5674a.m15043i2((Float) obj);
                }
            });
            this.f13715U0.setIntensityChooseCallback(new f30() { // from class: l.b9l0
                public final void call(Object obj, Object obj2) {
                    this.f6199a.m15046k2((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f13715U0.setCompareClickCallback(new e30() { // from class: l.c9l0
                public final void call(Object obj) {
                    this.f6578a.m15048l2((Boolean) obj);
                }
            });
            this.f13715U0.setOnResetCallback(new d30() { // from class: l.d9l0
                public final void call() {
                    this.f6874a.m15049m2();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m14863F2() {
        this.f13742i.setScaleY(1.6f);
        this.f13742i.setScaleX(1.6f);
        this.f13742i.setVisibility(0);
        this.f13765s1 = true;
    }

    /* JADX INFO: renamed from: F3 */
    private void m14864F3(int i) {
        this.f13727a1 = 1;
        m14918V3(1);
        xdl0.M(this.f13672B, true);
        xdl0.M(this.f13749l, this.f13752m1);
        xdl0.M(this.f13770v, true);
        xdl0.M(this.f13778z, false);
        xdl0.M(this.f13694K, !this.f13752m1 && ((Boolean) this.f13688H0.get()).booleanValue());
        if (i == 1) {
            m14948f3(true);
            m14945e3(true);
            return;
        }
        xdl0.M(this.f13698M, false);
        xdl0.M(this.f13692J, false);
        xdl0.M(this.f13687H, true);
        xdl0.M(this.f13690I, true);
        xdl0.M(this.f13696L, true);
        xdl0.M(this.f13768u, true);
        this.f13687H.setAlpha(1.0f);
        this.f13690I.setAlpha(1.0f);
        this.f13696L.setAlpha(1.0f);
        this.f13768u.setAlpha(1.0f);
        this.f13768u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: H1 */
    private void m14869H1() {
        this.f13768u.setListener(new VideoRecordProgressView.InterfaceC2027d() { // from class: l.t9l0
            @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView.InterfaceC2027d
            /* JADX INFO: renamed from: a */
            public final void mo2691a(long j) {
                this.f13241a.m15053o2(j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    private void m14870H3(int i) {
        xdl0.M(this.f13672B, true);
        if (i == 0) {
            m14948f3(false);
            m14945e3(false);
        } else {
            this.f13698M.setAlpha(1.0f);
            xdl0.M(this.f13698M, true);
            xdl0.M(this.f13692J, true);
            xdl0.M(this.f13687H, false);
            xdl0.M(this.f13690I, false);
            xdl0.M(this.f13696L, false);
            xdl0.M(this.f13768u, false);
        }
        xdl0.M(this.f13749l, false);
        xdl0.M(this.f13770v, true);
        xdl0.M(this.f13778z, false);
        xdl0.M(this.f13694K, false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m14873I1() {
        uuv uuvVar = new uuv();
        this.f13724Z = uuvVar;
        uuvVar.mo13991a(act(), this);
        if (NullChecker.a(this.f13773w1)) {
            this.f13724Z.mo11058x(this.f13773w1);
        }
    }

    /* JADX INFO: renamed from: I3 */
    private void m14874I3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.a(this.f13741h1)) {
                this.f13741h1.cancel();
            }
            if (NullChecker.a(this.f13743i1)) {
                this.f13743i1.cancel();
            }
        }
        if (NullChecker.b(this.f13756o1) && !m14890M2()) {
            xdl0.M(this.f13672B, !z2);
            xdl0.M(this.f13770v, !z2);
        }
        xdl0.M(this.f13772w, this.f13758p0 == 0 && !this.f13695K0 && m14991x3(i));
        xdl0.M(this.f13712T, (this.f13699M0 || this.f13695K0 || !m14991x3(i)) ? false : true);
        if (!z2) {
            xdl0.M(this.f13778z, false);
        }
        xdl0.M(this.f13676D, (z2 || m15014L1()) ? false : true);
        FrameLayout frameLayout = this.f13749l;
        if (!z2 && !m14885L2() && this.f13752m1 && this.f13758p0 == 0) {
            z = true;
        }
        xdl0.M(frameLayout, z);
    }

    /* JADX INFO: renamed from: J1 */
    private void m14877J1() {
        this.f13747k0 = z4e0.m17215c(act().getApplicationContext());
        iic0 iic0Var = new iic0();
        if (NullChecker.b(this.f13724Z)) {
            iic0Var.m10885q(this.f13724Z.mo13989K());
        }
        this.f13747k0.m17219g(iic0Var);
        this.f13747k0.m17220h();
    }

    /* JADX INFO: renamed from: J3 */
    private void m14878J3(int i) {
        bt0.p(this.f13751m, "translationX", 0L, 200L, bt0.b, new float[]{(i - 2) * t100.d(58.0f)}).start();
        ((TextView) this.f13753n.getChildAt(this.f13777y1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f13753n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f13777y1 = i;
        this.f13775x1 = f13667M1[i];
    }

    /* JADX INFO: renamed from: K1 */
    private void m14881K1() {
        this.f13734e.setOnVerticalFlingListener(new C2509b());
        this.f13734e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C2510c());
        this.f13734e.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC2019b() { // from class: l.h8l0
            @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC2019b
            /* JADX INFO: renamed from: a */
            public final boolean mo2555a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m14924X2(this.f13758p0);
    }

    /* JADX INFO: renamed from: K3 */
    private void m14882K3() {
        boolean z;
        boolean zPrepare;
        if (this.f13679E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f13724Z.prepare();
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
        if (!zPrepare) {
            lsi0.j("相机打开失败，请检查系统相机是否可用");
            return;
        }
        m14983u3(false);
        this.f13724Z.mo13993g();
        if (NullChecker.a(this.f13675C1) && this.f13675C1.isBeautySticker()) {
            this.f13724Z.mo11043N(new File(this.f13675C1.modelFilePath));
        }
        if (this.f13721X0 > 0) {
            e51.H(act(), new Runnable() { // from class: l.n8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10709a.m15009G2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: L2 */
    private boolean m14885L2() {
        MaskMenuView maskMenuView = this.f13717V0;
        if (maskMenuView != null && xdl0.O0(maskMenuView)) {
            return true;
        }
        FilterMenuView filterMenuView = this.f13715U0;
        if (filterMenuView != null && xdl0.O0(filterMenuView)) {
            return true;
        }
        MakeUpMenuView makeUpMenuView = this.f13719W0;
        return makeUpMenuView != null && xdl0.O0(makeUpMenuView);
    }

    /* JADX INFO: renamed from: L3 */
    private void m14886L3() {
        this.f13688H0.put(Boolean.FALSE);
        if (this.f13694K.getVisibility() == 0) {
            xdl0.M(this.f13694K, ((Boolean) this.f13688H0.get()).booleanValue());
        }
        if (this.f13724Z.mo13994h()) {
            return;
        }
        m14933a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public boolean m14889M1() {
        ValueAnimator valueAnimator = this.f13713T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public boolean m14890M2() {
        return !vi00.m15428b();
    }

    /* JADX INFO: renamed from: M3 */
    private void m14891M3() {
        if (this.f13758p0 != 0) {
            this.f13696L.setState(2);
            return;
        }
        this.f13724Z.mo14000y(this.f13775x1);
        this.f13724Z.mo13995i();
        m14902P3();
        if (this.f13763r1) {
            m14899O3(true);
            this.f13763r1 = false;
        } else {
            this.f13768u.setMaxDuration(m14973q1());
            this.f13768u.m2677s(this.f13775x1);
            m14956i3();
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m14894N2(int i) {
        if (i == this.f13758p0) {
            return;
        }
        int iD = t100.d(64.0f);
        int i2 = (t100.c().widthPixels / 2) - iD;
        int i3 = this.f13758p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f13712T;
        bt0.p(linearLayout, "translationX", 0L, 100L, bt0.c, new float[]{linearLayout.getTranslationX(), i2 + ((i3 * iD) / 2)}).start();
    }

    /* JADX INFO: renamed from: N3 */
    private void m14895N3() {
        if (!NullChecker.b(this.f13747k0) || this.f13747k0.m17217d()) {
            return;
        }
        this.f13747k0.m17220h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public void m14898O2(float f, float f2) {
        ImageView imageView = this.f13744j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f13744j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m14963m1();
        this.f13724Z.mo13988J(m14927Y0(this.f13726a.getWidth(), this.f13726a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: O3 */
    private boolean m14899O3(boolean z) {
        this.f13768u.m2678t();
        boolean zMo13987I = this.f13724Z.mo13987I(z);
        m14895N3();
        return zMo13987I;
    }

    /* JADX INFO: renamed from: P3 */
    private void m14902P3() {
        if (NullChecker.b(this.f13747k0) && this.f13747k0.m17217d()) {
            this.f13747k0.m17221i();
        }
    }

    /* JADX INFO: renamed from: R3 */
    private void m14907R3() {
        int i = this.f13685G0;
        if (i == 0) {
            this.f13685G0 = 3;
            this.f13690I.setImageResource(f13664J1);
        } else {
            if (i != 3) {
                return;
            }
            this.f13685G0 = 0;
            this.f13690I.setImageResource(f13663I1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m14910S3(boolean z, float f) {
        List<MMPresetFilter> list = this.f13689H1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f13721X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f13729b1 = m14971p1(list.get(this.f13721X0).mFilterId);
        float fM14971p1 = m14971p1(list.get(size).mFilterId);
        this.f13731c1 = fM14971p1;
        int i2 = this.f13721X0;
        float f2 = z ? -f : 1.0f - f;
        this.f13711S0 = f2;
        this.f13724Z.mo11047S(0, i2, z, f2, this.f13729b1, fM14971p1);
        this.f13729b1 = this.f13731c1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m14913T3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM14968o1 = m14968o1();
        int i = this.f13721X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM14968o1 - 1;
        } else if (i2 >= iM14968o1) {
            iM14968o1 = i;
            i2 = 0;
        } else {
            iM14968o1 = i;
        }
        if (!z2) {
            m14974q3(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.a(this.f13713T0) && this.f13713T0.isRunning()) {
            this.f13713T0.cancel();
        }
        if (this.f13713T0 == null) {
            this.f13713T0 = new ValueAnimator();
        }
        this.f13713T0.setDuration(j);
        this.f13713T0.setFloatValues(this.f13711S0, i3);
        this.f13713T0.removeAllUpdateListeners();
        this.f13713T0.removeAllListeners();
        this.f13713T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h9l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8652a.m15011H2(iM14968o1, z, valueAnimator);
            }
        });
        this.f13713T0.addListener(new C2511d(i2, z));
        this.f13713T0.start();
    }

    /* JADX INFO: renamed from: U3 */
    private void m14916U3() {
        int i = this.f13682F0 - 1;
        this.f13682F0 = i;
        if (i < 0) {
            this.f13682F0 = 1;
        }
        this.f13724Z.mo13998r(this.f13682F0);
        m14985v3();
    }

    /* JADX INFO: renamed from: V3 */
    private void m14918V3(int i) {
        m14923X0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(180.0f), t100.d(180.0f));
        this.f13698M.f1025c.setThemeType(1);
        this.f13698M.f1027e.setThemeType(1);
        this.f13698M.f1023a.setThemeType(1);
        this.f13674C.setThemeType(1);
        if (i == 1) {
            this.f13692J.setImageResource(f3c0.f7844l0);
            layoutParams.gravity = 17;
            this.f13736f.setLayoutParams(layoutParams);
            this.f13686G1 = true;
            bt0.e(this.f13730c);
            View view = this.f13730c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = bt0.b;
            Animator animatorL = bt0.l(view, property, 0L, 300L, interpolator, new float[]{0.0f, view.getHeight()});
            bt0.f(animatorL, new Runnable() { // from class: l.k8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9636a.m15012I2();
                }
            });
            animatorL.start();
            bt0.e(this.f13728b);
            Animator animatorL2 = bt0.l(this.f13728b, property, 0L, 300L, interpolator, new float[]{0.0f, -this.f13730c.getHeight()});
            bt0.f(animatorL2, new Runnable() { // from class: l.l8l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9945a.m15013K2();
                }
            });
            animatorL2.start();
        } else if (i == 2) {
            this.f13692J.setImageResource(f3c0.f7860n0);
            this.f13728b.setVisibility(8);
            int i2 = xdl0.e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f13737f1;
            this.f13730c.setLayoutParams(layoutParams2);
            this.f13730c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f13737f1 / 2.0f) - (layoutParams.height / 2));
            this.f13736f.setLayoutParams(layoutParams);
            this.f13686G1 = false;
            bt0.e(this.f13730c);
            bt0.l(this.f13730c, View.TRANSLATION_Y, 0L, 300L, bt0.b, new float[]{this.f13737f1, 0.0f}).start();
        } else if (i == 3) {
            this.f13692J.setImageResource(f3c0.f7852m0);
            int i3 = xdl0.e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (xdl0.w0() - this.f13733d1);
            this.f13728b.setLayoutParams(layoutParams3);
            this.f13728b.setVisibility(0);
            int i4 = xdl0.e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f13735e1;
            this.f13730c.setLayoutParams(layoutParams4);
            this.f13730c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f13735e1 + this.f13733d1) / 2.0f) - (layoutParams.height / 2));
            this.f13736f.setLayoutParams(layoutParams);
            this.f13686G1 = false;
            bt0.e(this.f13730c);
            View view2 = this.f13730c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = bt0.b;
            bt0.l(view2, property2, 0L, 300L, interpolator2, new float[]{this.f13737f1 - this.f13735e1, 0.0f}).start();
            bt0.e(this.f13728b);
            bt0.l(this.f13728b, property2, 0L, 300L, interpolator2, new float[]{-this.f13730c.getHeight(), 0.0f}).start();
        }
        m15047k3();
    }

    /* JADX INFO: renamed from: W2 */
    private void m14920W2() {
        m14899O3(false);
        mo13823k(false);
        this.f13724Z.mo13990O();
    }

    /* JADX INFO: renamed from: W3 */
    private void m14921W3() {
        int i;
        int iW0;
        int i2 = this.f13745j1;
        int i3 = this.f13748k1;
        m14923X0();
        int i4 = this.f13727a1;
        if (i4 == 3) {
            float f = i3;
            iW0 = (int) (f - ((this.f13735e1 / xdl0.w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iW0 = i3 - i;
        } else {
            i = i3;
            iW0 = 0;
        }
        this.f13724Z.mo13985E(0, iW0, i2, i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m14923X0() {
        if (this.f13727a1 == 1) {
            return;
        }
        if ((this.f13733d1 == 0.0f || this.f13735e1 == 0.0f || this.f13737f1 == 0.0f) && this.f13674C.getMeasuredHeight() != 0) {
            if (NullChecker.b(this.f13674C)) {
                this.f13733d1 = ((int) this.f13674C.getY()) + this.f13674C.getBottom() + t100.d(34.0f) + m14961l1();
            }
            float fY0 = this.f13733d1 + xdl0.y0();
            this.f13735e1 = fY0;
            if (fY0 > this.f13698M.getY() - t100.d(10.0f)) {
                this.f13735e1 = this.f13698M.getY() - t100.d(10.0f);
            }
            float fY1 = (xdl0.y0() * 4) / 3;
            this.f13737f1 = fY1;
            if (fY1 <= this.f13698M.getY() || !(this.f13698M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13698M.getLayoutParams();
            layoutParams.bottomMargin = t100.d(44.0f);
            this.f13698M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: X2 */
    private void m14924X2(int i) {
        this.f13724Z.setState(this.f13758p0);
        int i2 = this.f13758p0;
        if (i2 == 0) {
            m14864F3(i);
        } else if (i2 == 1) {
            m14870H3(i);
        }
        if (this.f13683F1) {
            xdl0.M(this.f13692J, false);
            xdl0.M0(this.f13698M.f1027e, false);
            xdl0.M0(this.f13674C, false);
        }
        m14894N2(i);
    }

    /* JADX INFO: renamed from: X3 */
    private void m14925X3() {
        boolean z = this.f13752m1;
        this.f13752m1 = !z;
        this.f13687H.setImageResource(!z ? f3c0.f7876p0 : f3c0.f7868o0);
        xdl0.M(this.f13749l, this.f13752m1);
        xdl0.M(this.f13694K, ((Boolean) this.f13688H0.get()).booleanValue() && !this.f13752m1);
    }

    /* JADX INFO: renamed from: Y0 */
    private Rect m14927Y0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f13724Z.mo13992e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM14950g1 = m14950g1(i - i3, -1000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iM14950g2 = m14950g1(iM14950g1 + iIntValue, -1000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iM14950g3 = m14950g1(i2 - i3, -1000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        return new Rect(iM14950g1, iM14950g3, iM14950g2, m14950g1(iIntValue + iM14950g3, -1000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
    }

    /* JADX INFO: renamed from: Z0 */
    private void m14930Z0() {
        this.f13763r1 = true;
        this.f13696L.setState(2);
        this.f13768u.m2678t();
        this.f13724Z.mo13996j();
        mo13823k(false);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m14931Z2() {
        if (this.f13689H1.size() <= 1 || !FeedModule.f314b.m1449i2()) {
            return;
        }
        this.f13722Y.m14477x0(true);
    }

    /* JADX INFO: renamed from: a1 */
    private void m14933a1() {
        if (this.f13768u.getRecordDuration() >= m14973q1()) {
            m14920W2();
        } else {
            if (m14941d1() <= 0) {
                return;
            }
            if (this.f13685G0 > 0) {
                this.f13707Q0.start();
            } else {
                m14891M3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m14934a2() {
        xdl0.M(this.f13766t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m14936b2() {
        xdl0.M(this.f13696L, false);
        xdl0.M(this.f13736f, false);
        this.f13765s1 = true;
        if (NullChecker.a(this.f13741h1)) {
            this.f13741h1.cancel();
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m14937b3(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorP = bt0.p(view, "translationY", 0L, 500L, z ? bt0.b : bt0.a, new float[]{z ? view.getHeight() : 0, z ? 0 : view.getHeight()});
        bt0.b(view, animatorP);
        bt0.f(animatorP, new Runnable() { // from class: l.g8l0
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: c3 */
    private void m14939c3(final boolean z) {
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f13676D, "alpha", 100L, 150L, new LinearInterpolator(), new float[]{z ? 0.0f : 1.0f, z ? 1.0f : 0.0f}), bt0.p(this.f13678E, "translationY", 0L, 300L, bt0.b, new float[]{z ? 0 : t100.d(60.0f), z ? t100.d(60.0f) : 0})});
        bt0.v(animatorZ, new Runnable() { // from class: l.w8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14469a.m15064v2(z);
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.x8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14810a.m15065w2(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: d1 */
    private long m14941d1() {
        long jM14973q1 = m14973q1() - m15060t1();
        if (jM14973q1 > 0) {
            return jM14973q1;
        }
        lsi0.h(R$string.f408O1);
        return 0L;
    }

    /* JADX INFO: renamed from: e1 */
    private void m14943e1() {
        if (PermissionHelper.b(new String[]{"android.permission.CAMERA"})) {
            return;
        }
        m15045k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m14944e2(View view) {
        int i = this.f13679E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view != this.f13696L.f1034e && view != this.f13698M.f1027e) {
            if (view == this.f13772w && i == 2) {
                this.f13720X.startActivityForResult(new Intent((Context) act(), (Class<?>) MusicCenterAct.class), 1001);
                act().overridePendingTransition(uzb0.f13995i, uzb0.f13993g);
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.f13697L0, "my_states");
        VideoRecordFrag videoRecordFrag = this.f13720X;
        if (zEquals) {
            videoRecordFrag.startActivityForResult(MediaPickerAct.X1(videoRecordFrag.act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        } else {
            videoRecordFrag.startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(true).needAllSelectedMediaPreview().withAlreadySelectedMedia(this.f13701N0).withSelectedFolderPath(this.f13703O0).withFromType(TextUtils.equals(this.f13697L0, "immersion") ? 5 : 2).withMediaPreviewPageId("p_camera_album_picture_preview").build()), 1002);
        }
        act().overridePendingTransition(uzb0.f13995i, uzb0.f13993g);
    }

    /* JADX INFO: renamed from: e3 */
    private void m14945e3(final boolean z) {
        int i = !z ? 1 : 0;
        CameraMenuView cameraMenuView = this.f13687H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(cameraMenuView, "alpha", 0L, 300L, linearInterpolator, new float[]{f, f2}), bt0.p(this.f13690I, "alpha", 0L, 300L, new LinearInterpolator(), new float[]{f, f2})});
        bt0.v(animatorZ, new Runnable() { // from class: l.o8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11389a.m15067y2();
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.p8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11732a.m15068z2(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: f1 */
    private void m14947f1() {
        if (this.f13720X.isResumed()) {
            this.f13722Y.m14476u0();
            if (this.f13679E0 != 5) {
                this.f13679E0 = 2;
            }
            Act act = act();
            if (NullChecker.b(act) && !act.isFinishing()) {
                m14882K3();
            }
            MakeUpMenuView makeUpMenuView = this.f13719W0;
            if (makeUpMenuView != null) {
                makeUpMenuView.m2614B(this.f13724Z);
                this.f13719W0.m2616S();
            }
        }
    }

    /* JADX INFO: renamed from: f3 */
    private void m14948f3(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f13772w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(linearLayout, property, 0L, 200L, linearInterpolator, new float[]{f, f2}), bt0.l(this.f13768u, property, 0L, 200L, new LinearInterpolator(), new float[]{f, f2}), bt0.p(this.f13768u, "translationY", 0L, 200L, new LinearInterpolator(), new float[]{i2, i3}), bt0.l(this.f13696L, property, 0L, 200L, new LinearInterpolator(), new float[]{f, f2}), bt0.l(this.f13698M, property, 0L, 200L, new LinearInterpolator(), new float[]{f2, f}), bt0.l(this.f13692J, property, 0L, 200L, new LinearInterpolator(), new float[]{f2, f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.e8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7253a.m15000A2();
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.f8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8030a.m15001B2(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: g1 */
    private int m14950g1(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: g3 */
    private void m14951g3(String str, boolean z) {
        this.f13720X.q4(str, z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: h1 */
    private MediaMeta m14953h1() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m15014L1() ? "front" : FeedMakeupPageAdapter.MakeupItem.BACK;
        mediaMeta.sticker = (this.f13717V0 == null || (cameraSticker = this.f13675C1) == null || TextUtils.equals(cameraSticker.f680id, "empty")) ? null : this.f13675C1.f680id;
        if (this.f13721X0 >= 0) {
            int size = this.f13689H1.size();
            int i = this.f13721X0;
            if (size > i) {
                str = this.f13689H1.get(i).mFilterId;
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
    private void m14954h3() {
        this.f13720X.s4();
    }

    /* JADX INFO: renamed from: i3 */
    private void m14956i3() {
        this.f13754n1.add(m14953h1());
    }

    /* JADX INFO: renamed from: j3 */
    private void m14958j3(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: l1 */
    private int m14961l1() {
        if (e51.x() || e51.w()) {
            return xdl0.F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    private void m14963m1() {
        bt0.e(this.f13744j);
        if (NullChecker.a(this.f13709R0)) {
            this.f13709R0.cancel();
        }
        this.f13744j.setVisibility(0);
        ImageView imageView = this.f13744j;
        Property property = bt0.i;
        Interpolator interpolator = bt0.b;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(imageView, property, 0L, 300L, interpolator, new float[]{1.0f, 0.75f}), bt0.p(this.f13744j, "alpha", 0L, 300L, interpolator, new float[]{0.0f, 0.8f}), bt0.p(this.f13744j, "alpha", 400L, 200L, interpolator, new float[]{0.8f, 0.0f})});
        this.f13709R0 = animatorZ;
        bt0.f(animatorZ, new Runnable() { // from class: l.k9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9651a.m15018Q1();
            }
        });
        this.f13709R0.start();
    }

    /* JADX INFO: renamed from: m3 */
    private void m14964m3() {
        if (this.f13754n1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f13754n1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void m15049m2() {
        m14976r3(0, true, false);
        Iterator<tpd0> it = this.f13691I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: o1 */
    private int m14968o1() {
        return this.f13689H1.size();
    }

    /* JADX INFO: renamed from: o3 */
    private void m14969o3(String str, int i) {
        tpd0 tpd0Var = this.f13691I0.get("current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("current_filter_intensity" + FeedModule.m1139F().userId() + str, 50);
            this.f13691I0.put("current_filter_intensity" + str, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p1 */
    private float m14971p1(String str) {
        tpd0 tpd0Var = this.f13691I0.get("current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("current_filter_intensity" + FeedModule.m1139F().userId() + str, 50);
            this.f13691I0.put("current_filter_intensity" + str, tpd0Var);
        }
        return (((Integer) tpd0Var.get()).intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: q1 */
    private long m14973q1() {
        return djx.h().a() * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public void m14974q3(int i, boolean z) {
        m14976r3(i, z, true);
    }

    /* JADX INFO: renamed from: r3 */
    private void m14976r3(int i, boolean z, boolean z2) {
        if (this.f13689H1.size() <= i || i < 0) {
            return;
        }
        this.f13680E1.put(this.f13689H1.get(i).mFilterId);
        boolean z3 = this.f13721X0 != i && z2;
        this.f13721X0 = i;
        float fM14971p1 = m14971p1(this.f13689H1.get(i).mFilterId);
        this.f13729b1 = fM14971p1;
        this.f13724Z.mo11047S(0, this.f13721X0, true, 0.0f, fM14971p1, -1.0f);
        this.f13724Z.setIntensity(this.f13729b1);
        if (NullChecker.a(this.f13715U0)) {
            int i2 = (int) (this.f13729b1 * 100.0f);
            this.f13715U0.f1138c.setText(String.valueOf(i2));
            this.f13715U0.f1138c.setProgress(i2);
        }
        if (z3) {
            m14855C3(z);
        }
        if (i == 0) {
            t7l0.f13217c = false;
        } else {
            t7l0.f13217c = true;
        }
    }

    /* JADX INFO: renamed from: s1 */
    private String m14978s1() {
        int i = this.f13727a1;
        if (i == 1) {
            return xdl0.w0() / xdl0.y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : "1.1";
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: s3 */
    private void m14979s3(boolean z) {
        int i = this.f13758p0;
        boolean z2 = false;
        if (i == 0) {
            xdl0.M(this.f13696L, z);
            xdl0.M(this.f13749l, z && this.f13752m1);
            xdl0.M(this.f13694K, ((Boolean) this.f13688H0.get()).booleanValue() && !this.f13752m1 && z);
        } else if (i == 1) {
            xdl0.M(this.f13698M, z);
        }
        xdl0.M(this.f13772w, this.f13758p0 == 0 && !this.f13695K0 && z && this.f13768u.getCount() == 0);
        LinearLayout linearLayout = this.f13712T;
        if (!this.f13699M0 && !this.f13695K0 && z && this.f13768u.getCount() == 0) {
            z2 = true;
        }
        xdl0.M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: t3 */
    private void m14981t3() {
        this.f13726a.getHolder().addCallback(new SurfaceHolderCallbackC2508a());
        this.f13770v.setOnClickListener(this);
        this.f13674C.setOnClickListener(this);
        this.f13676D.setOnClickListener(this);
        this.f13684G.setOnClickListener(this);
        this.f13681F.setOnClickListener(this);
        this.f13687H.setOnClickListener(this);
        this.f13692J.setOnClickListener(this);
        this.f13690I.setOnClickListener(this);
        this.f13771v1 = xck0.a(500, new e30() { // from class: l.y7l0
            public final void call(Object obj) {
                this.f15291a.m15063v1((Bundle) obj);
            }
        });
        m14860E1();
    }

    /* JADX INFO: renamed from: u3 */
    private void m14983u3(boolean z) {
        boolean z2 = this.f13683F1;
        CameraMenuView cameraMenuView = this.f13674C;
        boolean z3 = false;
        if (z2) {
            xdl0.M0(cameraMenuView, false);
            xdl0.M(this.f13676D, false);
            return;
        }
        xdl0.M(cameraMenuView, this.f13724Z.mo13999s());
        if (this.f13724Z.mo13997m() && !m15014L1()) {
            z3 = true;
        }
        if (z3) {
            this.f13724Z.mo13998r(this.f13682F0);
        }
        if (z) {
            m14939c3(z3);
        } else {
            xdl0.M(this.f13676D, z3);
            this.f13678E.setTranslationY(z3 ? t100.d(72.0f) : 0.0f);
        }
        m14985v3();
    }

    /* JADX INFO: renamed from: v3 */
    private void m14985v3() {
        int i = this.f13682F0;
        if (i == 0) {
            this.f13676D.setImageResource(f13666L1);
        } else {
            if (i != 1) {
                return;
            }
            this.f13676D.setImageResource(f13665K1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private void m14988w1() {
        if (this.f13719W0 == null) {
            MakeUpMenuView makeUpMenuView = (MakeUpMenuView) this.f13704P.inflate();
            this.f13719W0 = makeUpMenuView;
            makeUpMenuView.setVisibility(8);
            this.f13719W0.m2628y();
            this.f13719W0.m2615D();
            this.f13719W0.setMenuDismissListener(new d30() { // from class: l.x7l0
                public final void call() {
                    this.f14793a.m15026U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x3 */
    private boolean m14991x3(int i) {
        return (m14885L2() || i == 4 || i == 5 || this.f13768u.getCount() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: y1 */
    private void m14994y1() {
        boolean z = this.f13683F1;
        VText vText = this.f13714U;
        if (z) {
            xdl0.M0(vText, false);
            xdl0.M0(this.f13716V, false);
            xdl0.M0(this.f13712T, false);
            m15047k3();
            return;
        }
        xdl0.M(vText, this.f13693J0);
        xdl0.M(this.f13712T, (this.f13699M0 || this.f13695K0) ? false : true);
        this.f13705P0 = new View(m15002C0());
        for (final int i = 0; i < this.f13712T.getChildCount(); i++) {
            this.f13712T.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.i8l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8962a.m15029V1(i, view);
                }
            });
        }
        m15047k3();
    }

    /* JADX INFO: renamed from: y3 */
    private void m14995y3() {
        m14937b3(this.f13719W0, true);
        m14979s3(false);
    }

    /* JADX INFO: renamed from: z1 */
    private void m14998z1() {
        int childCount = this.f13753n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f13753n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.r9l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12568a.m15032X1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z3 */
    private void m14999z3(String str, final d30 d30Var) {
        xh0 xh0VarA = new xh0.a(this.f13720X.act()).g(false).j(str).e(R$string.f606s3).q(R$string.f478a).c(new View.OnClickListener() { // from class: l.q8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).o(new View.OnClickListener() { // from class: l.r8l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12562a.m15004C2(view);
            }
        }).a();
        this.f13677D1 = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m15000A2() {
        xdl0.M(this.f13772w, true);
        xdl0.M(this.f13768u, true);
        xdl0.M(this.f13696L, true);
        xdl0.M(this.f13698M, true);
        xdl0.M(this.f13692J, true);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m15001B2(boolean z) {
        this.f13768u.setTranslationY(0.0f);
        this.f13698M.setAlpha(1.0f);
        this.f13696L.setAlpha(1.0f);
        this.f13768u.setAlpha(1.0f);
        if (z) {
            xdl0.M(this.f13698M, false);
            xdl0.M(this.f13692J, false);
        } else {
            xdl0.M(this.f13772w, false);
            xdl0.M(this.f13768u, false);
            xdl0.M(this.f13696L, false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15002C0() {
        return this.f13718W;
    }

    /* JADX INFO: renamed from: C1 */
    public void m15003C1(Bundle bundle) {
        if (NullChecker.a(bundle)) {
            this.f13756o1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.a(bundle.getSerializable("extra_music_content"))) {
                this.f13773w1 = bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.a(this.f13756o1)) {
                int i = this.f13756o1.speedIndex;
                this.f13777y1 = i;
                this.f13775x1 = f13667M1[i];
            }
            this.f13693J0 = bundle.getBoolean("extra_has_video", true);
            this.f13695K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f13697L0 = string;
            this.f13683F1 = TextUtils.equals(string, "from_sign_up");
            this.f13699M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.a(bundle.getSerializable("extra_selected_images"))) {
                this.f13701N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f13703O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f13756o1 == null) {
            this.f13756o1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f13756o1;
        MusicContent musicContent = this.f13773w1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m15004C2(View view) {
        this.f13677D1.c();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m15006E2() {
        this.f13765s1 = false;
        this.f13739g1 = null;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m15007E3() {
        m14937b3(this.f13717V0, true);
        m14979s3(false);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m15008G1() {
        if (this.f13717V0 == null) {
            MaskMenuView maskMenuView = (MaskMenuView) this.f13700N.inflate();
            this.f13717V0 = maskMenuView;
            maskMenuView.setMenuDismissListener(new d30() { // from class: l.g9l0
                public final void call() {
                    this.f8400a.m15052n2();
                }
            });
            this.f13717V0.setOnFaceResourceSelectListener(new C2512e());
            this.f13717V0.setCameraCategoryData(pb4.m12961O().m13003M());
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m15009G2() {
        m14974q3(this.f13721X0, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m15010G3(boolean z) {
        this.f13696L.m2415w(z);
        this.f13698M.m2392k(z);
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m15011H2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f13724Z.mo11047S(this.f13758p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m15012I2() {
        this.f13730c.setVisibility(8);
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m15013K2() {
        this.f13728b.setVisibility(8);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m15014L1() {
        return this.f13724Z.mo13992e();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m15015O1() {
        m14899O3(true);
        this.f13724Z.mo13986F();
        this.f13768u.m2678t();
        this.f13768u.m2665g();
        this.f13754n1.clear();
        this.f13724Z.mo13984D(false);
        this.f13696L.setState(2);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m15016P1() {
        MakeUpMenuView makeUpMenuView = this.f13719W0;
        if (makeUpMenuView != null) {
            makeUpMenuView.m2621i0();
        }
        this.f13724Z.mo13986F();
        this.f13696L.m2413u();
        this.f13724Z.release();
        m15045k1();
    }

    /* JADX INFO: renamed from: P2 */
    public void m15017P2() {
        this.f13724Z.mo11051n(new e30() { // from class: l.u8l0
            public final void call(Object obj) {
                this.f13594a.m15062u2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m15018Q1() {
        this.f13744j.setVisibility(8);
    }

    /* JADX INFO: renamed from: Q2 */
    public void m15019Q2() {
        m14943e1();
        if (NullChecker.a(this.f13773w1) || TextUtils.equals("immersion", this.f13697L0)) {
            this.f13758p0 = 0;
        } else if (!this.f13693J0) {
            this.f13758p0 = 1;
        }
        xdl0.M(this.f13772w, this.f13758p0 == 0);
        m14894N2(-1);
        m14873I1();
        m14877J1();
        m14881K1();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m15020R1(Intent intent) {
        this.f13720X.startActivity(intent);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public void m15021R2() {
        if (vb4.m15410i()) {
            ib1.b().e(CameraVideoControlView.f1029m);
            z4e0.m17216e();
            this.f13724Z.release();
            this.f13768u.m2675q();
            hli.m10656u();
            hli.m10655j().m10667r();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m15022S1(Bundle bundle) {
        this.f13720X.startActivity(VideoEditAct.m2168X1(act(), bundle));
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public void m15023S2() {
        this.f13679E0 = 1;
        this.f13707Q0.cancel();
        this.f13724Z.onPause();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m15024T1(final Bundle bundle) {
        m15038d3(new Runnable() { // from class: l.f9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8044a.m15022S1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m15025T2() {
        if (this.f13672B.getTranslationX() != 0.0f) {
            this.f13672B.setTranslationX(0.0f);
        }
        m14947f1();
        if (TextUtils.equals(this.f13697L0, SchemeKey.fake2good)) {
            return;
        }
        m14928Y3(false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m15026U1() {
        m14937b3(this.f13719W0, false);
        m14979s3(true);
    }

    /* JADX INFO: renamed from: U2 */
    public void m15027U2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.a(this.f13719W0)) {
            this.f13719W0.m2613A(list, list2);
            this.f13719W0.m2616S();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public View m15028V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v9l0.m15400b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m15029V1(int i, View view) {
        if (this.f13758p0 == i) {
            return;
        }
        this.f13705P0.setTag(Integer.valueOf(i));
        this.f13767t1.call(this.f13705P0);
    }

    /* JADX INFO: renamed from: V2 */
    public void m15030V2(MusicContent musicContent) {
        this.f13773w1 = musicContent;
        VideoInfo videoInfo = this.f13756o1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.a(musicContent)) {
            this.f13776y.setText(musicContent.name);
        }
        this.f13724Z.mo11058x(musicContent);
    }

    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void m15042i1(t7l0 t7l0Var) {
        this.f13722Y = t7l0Var;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m15032X1(int i, View view) {
        m14878J3(i);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m15033Y1(View view) {
        this.f13769u1.call(view);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m15034Z1(int i) {
        this.f13766t.setText(String.valueOf(i));
        this.f13766t.setAlpha(0.0f);
        xdl0.M(this.f13766t, true);
    }

    @Override // p007l.s1m.InterfaceC2480a
    /* JADX INFO: renamed from: a */
    public void mo14001a(String str) {
        lsi0.h(R$string.f414P1);
        this.f13768u.m2665g();
        mo13823k(false);
    }

    /* JADX INFO: renamed from: a3 */
    public void m15035a3(List<CameraCategory> list) {
        if (NullChecker.a(this.f13717V0)) {
            this.f13717V0.setCameraCategoryData(list);
        }
        m14931Z2();
    }

    public Act act() {
        return (CompactMediaPickerAct) this.f13718W;
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: b */
    public long mo13819b() {
        return this.f13768u.getLastSliceDuration();
    }

    @Override // p007l.s1m.InterfaceC2480a
    /* JADX INFO: renamed from: c */
    public void mo14002c(String str, boolean z) {
        if (this.f13768u.getRecordDuration() < 3000) {
            lsi0.h(R$string.f329B0);
            return;
        }
        Video video = new Video(0, str);
        ebl0.m9703c(video);
        m14954h3();
        if (z && NullChecker.a(this.f13771v1)) {
            this.f13771v1.call(m15051n1(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m15036c2() {
        if (this.f13766t.getTag() == null) {
            m14891M3();
        }
        this.f13766t.setTag(null);
        xdl0.M(this.f13696L, true);
        this.f13765s1 = false;
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo13820d() {
        return this.f13726a.getHolder();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m15037d2() {
        this.f13766t.setTag(Boolean.TRUE);
        m14864F3(0);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m15038d3(Runnable runnable) {
        Animator animatorP = bt0.p(this.f13672B, "translationX", 0L, 100L, new LinearInterpolator(), new float[]{0.0f, t100.d(60.0f)});
        bt0.f(animatorP, runnable);
        animatorP.start();
    }

    public void destroy() {
        CameraEffectMgr.m2289V().m2350r();
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: e */
    public void mo13821e() {
        this.f13768u.m2665g();
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: f */
    public void mo12940f(View view) {
        this.f13768u.m2673o();
        m14999z3(act().getString(R$string.f323A0), new d30() { // from class: l.d8l0
            public final void call() {
                this.f6868a.m15054p2();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m15039f2(View view) {
        int i = this.f13679E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f13770v) {
            m15044j1();
            return;
        }
        if (view == this.f13684G) {
            m14995y3();
            return;
        }
        if (view == this.f13690I) {
            m14907R3();
            return;
        }
        if (view == this.f13676D) {
            m14916U3();
            return;
        }
        if (view == this.f13681F) {
            if (this.f13715U0 == null) {
                m14862F1();
            }
            m14853B3();
            return;
        }
        if (view == this.f13674C) {
            this.f13724Z.mo11050f();
            return;
        }
        if (view == this.f13687H) {
            m14925X3();
            return;
        }
        if (view == this.f13696L.f1032c || view == this.f13698M.f1025c) {
            if (this.f13717V0 == null) {
                m15008G1();
            }
            m15007E3();
            m84.m11844e().m11855l();
            return;
        }
        View view2 = this.f13705P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m15055p3(((Integer) this.f13705P0.getTag()).intValue());
            }
        } else if (view == this.f13692J) {
            int i2 = this.f13727a1 + 1;
            this.f13727a1 = i2;
            if (i2 > 3) {
                this.f13727a1 = 1;
            }
            m14918V3(this.f13727a1);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m15040g2() {
        m14937b3(this.f13715U0, false);
        m14979s3(true);
    }

    @Override // p007l.r1m
    public int getCount() {
        return this.f13768u.getCount();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m15041h2(Integer num) {
        m14974q3(num.intValue(), this.f13721X0 - num.intValue() > 0);
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: i */
    public void mo12941i(View view) {
        this.f13767t1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m15043i2(Float f) {
        this.f13724Z.setIntensity(f.floatValue());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM15028V0 = m15028V0(layoutInflater, viewGroup);
        m14994y1();
        m14981t3();
        m14850A1();
        m14852B1();
        m14998z1();
        m14869H1();
        m14988w1();
        if (NullChecker.a(this.f13773w1)) {
            this.f13776y.setText(this.f13773w1.name);
        }
        xdl0.M(this.f13694K, ((Boolean) this.f13688H0.get()).booleanValue());
        return viewM15028V0;
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: j */
    public int mo13822j() {
        return this.f13682F0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m15044j1() {
        ixl ixlVar;
        if (this.f13768u == null || this.f13696L == null || (ixlVar = this.f13724Z) == null) {
            m15045k1();
            return;
        }
        if (ixlVar.mo13994h()) {
            this.f13696L.setState(5);
        }
        d30 d30Var = new d30() { // from class: l.z7l0
            public final void call() {
                this.f15642a.m15015O1();
            }
        };
        if (this.f13768u.getCount() == 0) {
            m14999z3(act().getString(R$string.f591q0), new d30() { // from class: l.a8l0
                public final void call() {
                    this.f5660a.m15016P1();
                }
            });
        } else {
            m14999z3(act().getString(R$string.f341D0), d30Var);
        }
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: k */
    public void mo13823k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f13768u.getRecordDuration() != 0 && i == 2) {
            this.f13768u.m2678t();
            i = 5;
        }
        this.f13696L.setState(i);
        m14954h3();
    }

    /* JADX INFO: renamed from: k1 */
    public void m15045k1() {
        Act act = act();
        if (!NullChecker.b(act) || act.isFinishing()) {
            return;
        }
        act.finish();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m15046k2(MMPresetFilter mMPresetFilter, Integer num) {
        m14969o3(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: k3 */
    public void m15047k3() {
        int i = 0;
        while (i < this.f13712T.getChildCount()) {
            m14958j3((VText) this.f13712T.getChildAt(i), this.f13758p0 == i);
            i++;
        }
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: l */
    public void mo13824l() {
        m14951g3(act().getString(R$string.f599r2), true);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m15048l2(Boolean bool) {
        this.f13724Z.mo11039C(bool.booleanValue());
    }

    @Override // p007l.hxl
    /* JADX INFO: renamed from: m */
    public void mo10753m() {
        m14983u3(true);
    }

    @Override // p007l.zji
    /* JADX INFO: renamed from: n */
    public void mo15050n(float f, int i) {
        if (i == 1) {
            this.f13724Z.mo11041L(new float[]{f, f});
            t7l0.f13218d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f13723Y0 = f;
            float[] fArr = f13669O1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f13725Z0 * 0.6f;
            if (!this.f13724Z.mo11040H() && this.f13724Z.mo11045Q()) {
                this.f13724Z.mo11057w(fArr);
            }
            t7l0.f13219e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f13725Z0 = f;
        float[] fArr2 = f13669O1;
        fArr2[0] = this.f13723Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f13724Z.mo11040H() && this.f13724Z.mo11045Q()) {
            this.f13724Z.mo11057w(fArr2);
        }
        t7l0.f13220f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final Bundle m15051n1(Video video) {
        Bundle bundle = new Bundle();
        if (this.f13756o1 == null) {
            this.f13756o1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f13679E0 == 0;
        rlw rlwVarMo13989K = this.f13724Z.mo13989K();
        if (NullChecker.a(rlwVarMo13989K)) {
            video.rotate = rlwVarMo13989K.v();
        }
        MusicContent musicContentMo11059z = this.f13724Z.mo11059z();
        video.isFrontCamera = this.f13724Z.mo13992e();
        String strMo11046R = this.f13724Z.mo11046R(this.f13721X0);
        if (NullChecker.a(musicContentMo11059z)) {
            video.playingMusic = musicContentMo11059z;
        }
        VideoInfo videoInfo = this.f13756o1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo11046R;
        int i = this.f13679E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f13682F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f13756o1;
        videoInfo2.choseDelayTime = this.f13685G0;
        videoInfo2.maxDuration = m14973q1();
        VideoInfo videoInfo3 = this.f13756o1;
        videoInfo3.speedIndex = this.f13777y1;
        MusicContent musicContent = this.f13773w1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f13754n1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f13756o1);
        bundle.putString("my_states", this.f13697L0);
        if (this.f13758p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f13768u.m2670l());
        }
        bundle.putString("extra_from", this.f13697L0);
        return bundle;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m15052n2() {
        m14937b3(this.f13717V0, false);
        m14979s3(true);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m15053o2(long j) {
        String str;
        if (this.f13679E0 != 4) {
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
        if (!this.f13778z.isShown()) {
            xdl0.M(this.f13778z, true);
        }
        this.f13670A.setText(str2 + ":" + str);
        if (j >= m14973q1()) {
            m14920W2();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f13767t1.call(view);
    }

    @Override // p007l.s1m.InterfaceC2480a
    public void onError(final int i, final int i2) {
        e51.M(new Runnable() { // from class: l.j8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9259a.m15056q2(i, i2);
            }
        });
    }

    @Override // p007l.r1m
    public void onFirstFrameRendered() {
        this.f13696L.m2405m();
    }

    @Override // p007l.p84
    public void onStateChanged(int i) {
        this.f13679E0 = i;
        if ((this.f13720X.isResumed() || this.f13720X.lifecycle_() == c.j) && !this.f13683F1) {
            m14874I3(i);
        }
        if (i == 3) {
            if (this.f13758p0 != 1) {
                this.f13696L.setState(2);
                return;
            } else {
                m14921W3();
                return;
            }
        }
        if (i == 4) {
            if (this.f13758p0 != 0) {
                this.f13696L.setState(2);
                return;
            } else {
                m14886L3();
                return;
            }
        }
        if (i != 5) {
            if (i != 6) {
                return;
            }
            if (this.f13768u.getRecordDuration() >= m15057r1()) {
                this.f13724Z.mo13990O();
                return;
            } else {
                lsi0.h(R$string.f329B0);
                this.f13696L.setState(5);
                return;
            }
        }
        this.f13707Q0.cancel();
        if (this.f13724Z.mo13994h()) {
            m14899O3(true);
        }
        long recordDuration = this.f13768u.getRecordDuration();
        long jM15057r1 = m15057r1();
        CameraVideoControlView cameraVideoControlView = this.f13696L;
        if (recordDuration < jM15057r1) {
            cameraVideoControlView.f1037h.setImageResource(f3c0.f7831j3);
        } else {
            cameraVideoControlView.f1037h.setImageResource(f3c0.f7823i3);
        }
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: p */
    public boolean mo12942p() {
        MakeUpMenuView makeUpMenuView = this.f13719W0;
        if (makeUpMenuView != null && makeUpMenuView.getVisibility() == 0) {
            return true;
        }
        FilterMenuView filterMenuView = this.f13715U0;
        if (filterMenuView != null && filterMenuView.getVisibility() == 0) {
            return true;
        }
        MaskMenuView maskMenuView = this.f13717V0;
        return (maskMenuView != null && maskMenuView.getVisibility() == 0) || !this.f13720X.lifecycle_().a;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m15054p2() {
        this.f13768u.m2676r();
        m14964m3();
        this.f13724Z.removeLast();
        if (this.f13768u.getCount() <= 0) {
            this.f13724Z.mo13984D(false);
            this.f13696L.setState(2);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m15055p3(int i) {
        int i2 = this.f13758p0;
        this.f13758p0 = i;
        m14924X2(i2);
        m15047k3();
        m14928Y3(true);
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: q */
    public void mo13825q(String str, Exception exc) {
        this.f13698M.setEnabled(true);
        if (NullChecker.a(this.f13715U0)) {
            bt0.e(this.f13715U0);
            this.f13715U0.setVisibility(8);
        }
        if (NullChecker.a(this.f13719W0)) {
            bt0.e(this.f13719W0);
            this.f13719W0.setVisibility(8);
        }
        if (NullChecker.a(this.f13717V0)) {
            bt0.e(this.f13717V0);
            this.f13717V0.setVisibility(8);
        }
        m14979s3(true);
        if (exc != null) {
            lsi0.h(R$string.f336C1);
            return;
        }
        if (!this.f13683F1) {
            if (vi00.m15428b()) {
                m15061u1(str);
            }
        } else if (NullChecker.a(act())) {
            Intent intent = new Intent();
            intent.putExtra("select_image_path", str);
            act().setResult(-1, intent);
            m15045k1();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m15056q2(int i, int i2) {
        if (i == -302) {
            m14930Z0();
            lsi0.h(R$string.f432S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m14930Z0();
            lsi0.h(R$string.f420Q1);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public long m15057r1() {
        return 3000L;
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m15058r2(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m14971p1(mMPresetFilter.mFilterId);
    }

    @Override // p007l.r1m
    public void removeLast() {
        this.f13768u.m2678t();
        this.f13768u.m2676r();
        if (this.f13768u.getCount() <= 0) {
            this.f13724Z.mo13984D(false);
            this.f13696L.setState(2);
        }
    }

    @Override // p007l.hxl
    /* JADX INFO: renamed from: s */
    public void mo10754s(float f, int i) {
        if (NullChecker.a(this.f13719W0)) {
            this.f13719W0.m2616S();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m15059s2() {
        if (NullChecker.a(this.f13715U0)) {
            this.f13715U0.setFilterData(this.f13689H1);
        }
        final String str = (String) this.f13680E1.get();
        int iG = vwb.G(this.f13689H1, new w9j() { // from class: l.n9l0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iG > 0) {
            this.f13721X0 = iG;
        }
        m14974q3(this.f13721X0, false);
        m14931Z2();
    }

    /* JADX INFO: renamed from: t1 */
    public long m15060t1() {
        return this.f13768u.getRecordDuration();
    }

    @Override // p007l.r1m
    /* JADX INFO: renamed from: u */
    public boolean mo13826u() {
        return m15060t1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m15061u1(String str) {
        Photo photo = new Photo(0, str);
        photo.isTakePhoto = true;
        photo.tempPath = str;
        photo.isOriginal = true;
        MediaMeta mediaMetaM14953h1 = m14953h1();
        mediaMetaM14953h1.proportion = m14978s1();
        final Intent intentM1960g2 = ImageEditAct.m1960g2(act(), photo, mediaMetaM14953h1, this.f13697L0, this.f13699M0, this.f13703O0);
        m15038d3(new Runnable() { // from class: l.s8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12836a.m15020R1(intentM1960g2);
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m15062u2(List list) {
        this.f13689H1 = list;
        if (list == null) {
            this.f13689H1 = new ArrayList();
        }
        vwb.z(this.f13689H1, new e30() { // from class: l.i9l0
            public final void call(Object obj) {
                this.f8969a.m15058r2((MMPresetFilter) obj);
            }
        });
        e51.G(new Runnable() { // from class: l.j9l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9290a.m15059s2();
            }
        });
    }

    @Override // p007l.p84
    /* JADX INFO: renamed from: v */
    public void mo12943v(View view) {
        this.f13769u1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m15063v1(final Bundle bundle) {
        e51.M(new Runnable() { // from class: l.m8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10272a.m15024T1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m15064v2(boolean z) {
        xdl0.M(this.f13676D, true);
        this.f13676D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m15065w2(boolean z) {
        xdl0.M(this.f13676D, z);
    }

    /* JADX INFO: renamed from: w3 */
    public void m15066w3(Media media) {
        this.f13696L.m2406n(media);
        this.f13698M.m2387f(media);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m15067y2() {
        xdl0.M(this.f13687H, true);
        xdl0.M(this.f13690I, true);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m15068z2(boolean z) {
        xdl0.M(this.f13687H, z);
        xdl0.M(this.f13690I, z);
    }

    /* JADX INFO: renamed from: l.u9l0$a */
    public class SurfaceHolderCallbackC2508a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC2508a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            u9l0.this.f13745j1 = i2;
            u9l0.this.f13748k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.u9l0$b */
    public class C2509b implements FilterScrollMoreViewPager.InterfaceC2020c {

        /* JADX INFO: renamed from: a */
        public boolean f13781a = false;

        public C2509b() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC2020c
        /* JADX INFO: renamed from: a */
        public void mo2556a(float f) {
            if (u9l0.this.m14890M2() || u9l0.this.f13724Z.mo13994h() || u9l0.this.m14889M1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f13781a = z;
            u9l0.this.m14910S3(z, f);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC2020c
        /* JADX INFO: renamed from: b */
        public void mo2557b(float f) {
            if (u9l0.this.m14890M2() || u9l0.this.f13724Z.mo13994h() || u9l0.this.m14889M1() || u9l0.this.f13711S0 == 0.0f) {
                return;
            }
            u9l0.this.m14913T3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC2020c
        public void onCancel() {
            if (u9l0.this.m14890M2() || u9l0.this.f13724Z.mo13994h() || u9l0.this.m14889M1() || u9l0.this.f13711S0 == 0.0f) {
                return;
            }
            u9l0.this.m14913T3(!this.f13781a, true, true, 200L);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC2020c
        /* JADX INFO: renamed from: c */
        public void mo2558c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m14928Y3(boolean z) {
    }
}
