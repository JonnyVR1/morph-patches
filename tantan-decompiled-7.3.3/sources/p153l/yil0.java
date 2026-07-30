package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.CompactMediaPickerAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class yil0 implements iam<xgl0>, a0m, View.OnClickListener, vmi, o94 {

    /* JADX INFO: renamed from: I1 */
    public static final int f200096I1 = lbc0.f131015d0;

    /* JADX INFO: renamed from: J1 */
    public static final int f200097J1 = lbc0.f131007c0;

    /* JADX INFO: renamed from: K1 */
    public static final int f200098K1 = lbc0.f131039g0;

    /* JADX INFO: renamed from: L1 */
    public static final int f200099L1 = lbc0.f131031f0;

    /* JADX INFO: renamed from: M1 */
    public static final float[] f200100M1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: N1 */
    public static final float[] f200101N1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: O1 */
    public static final float[] f200102O1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f200103A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f200105B;

    /* JADX INFO: renamed from: B1 */
    public String f200106B1;

    /* JADX INFO: renamed from: C */
    public CameraMenuView f200107C;

    /* JADX INFO: renamed from: C1 */
    public CameraSticker f200108C1;

    /* JADX INFO: renamed from: D */
    public CameraMenuView f200109D;

    /* JADX INFO: renamed from: D1 */
    public th0 f200110D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f200111E;

    /* JADX INFO: renamed from: F */
    public CameraMenuView f200114F;

    /* JADX INFO: renamed from: G */
    public CameraMenuView f200117G;

    /* JADX INFO: renamed from: H */
    public CameraMenuView f200120H;

    /* JADX INFO: renamed from: I */
    public CameraMenuView f200123I;

    /* JADX INFO: renamed from: J */
    public CameraMenuView f200125J;

    /* JADX INFO: renamed from: J0 */
    public boolean f200126J0;

    /* JADX INFO: renamed from: K */
    public TextView f200127K;

    /* JADX INFO: renamed from: K0 */
    public boolean f200128K0;

    /* JADX INFO: renamed from: L */
    public CameraVideoControlView f200129L;

    /* JADX INFO: renamed from: L0 */
    public String f200130L0;

    /* JADX INFO: renamed from: M */
    public CameraPhotoControlView f200131M;

    /* JADX INFO: renamed from: M0 */
    public boolean f200132M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f200133N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f200134N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f200135O;

    /* JADX INFO: renamed from: O0 */
    public String f200136O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f200137P;

    /* JADX INFO: renamed from: P0 */
    public View f200138P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f200139Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f200140Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f200141R;

    /* JADX INFO: renamed from: R0 */
    public Animator f200142R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f200143S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f200145T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f200146T0;

    /* JADX INFO: renamed from: U */
    public VText f200147U;

    /* JADX INFO: renamed from: U0 */
    public FilterMenuView f200148U0;

    /* JADX INFO: renamed from: V */
    public VText f200149V;

    /* JADX INFO: renamed from: V0 */
    public MaskMenuView f200150V0;

    /* JADX INFO: renamed from: W */
    public Context f200151W;

    /* JADX INFO: renamed from: W0 */
    public MakeUpMenuView f200152W0;

    /* JADX INFO: renamed from: X */
    public VideoRecordFrag f200153X;

    /* JADX INFO: renamed from: Y */
    public xgl0 f200155Y;

    /* JADX INFO: renamed from: Y0 */
    public float f200156Y0;

    /* JADX INFO: renamed from: Z */
    public b0m f200157Z;

    /* JADX INFO: renamed from: Z0 */
    public float f200158Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f200159a;

    /* JADX INFO: renamed from: b */
    public View f200161b;

    /* JADX INFO: renamed from: b1 */
    public float f200162b1;

    /* JADX INFO: renamed from: c */
    public View f200163c;

    /* JADX INFO: renamed from: c1 */
    public float f200164c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f200165d;

    /* JADX INFO: renamed from: d1 */
    public float f200166d1;

    /* JADX INFO: renamed from: e */
    public FilterScrollMoreViewPager f200167e;

    /* JADX INFO: renamed from: e1 */
    public float f200168e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f200169f;

    /* JADX INFO: renamed from: f1 */
    public float f200170f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f200171g;

    /* JADX INFO: renamed from: g1 */
    public Animator f200172g1;

    /* JADX INFO: renamed from: h */
    public TextView f200173h;

    /* JADX INFO: renamed from: h1 */
    public Animator f200174h1;

    /* JADX INFO: renamed from: i */
    public TextView f200175i;

    /* JADX INFO: renamed from: i1 */
    public Animator f200176i1;

    /* JADX INFO: renamed from: j */
    public ImageView f200177j;

    /* JADX INFO: renamed from: j1 */
    public int f200178j1;

    /* JADX INFO: renamed from: k */
    public TextView f200179k;

    /* JADX INFO: renamed from: k0 */
    public dde0 f200180k0;

    /* JADX INFO: renamed from: k1 */
    public int f200181k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f200182l;

    /* JADX INFO: renamed from: l1 */
    public g6x f200183l1;

    /* JADX INFO: renamed from: m */
    public View f200184m;

    /* JADX INFO: renamed from: m1 */
    public boolean f200185m1;

    /* JADX INFO: renamed from: n */
    public LinearLayout f200186n;

    /* JADX INFO: renamed from: o */
    public TextView f200188o;

    /* JADX INFO: renamed from: o1 */
    public VideoInfo f200189o1;

    /* JADX INFO: renamed from: p */
    public TextView f200190p;

    /* JADX INFO: renamed from: q */
    public TextView f200193q;

    /* JADX INFO: renamed from: r */
    public TextView f200195r;

    /* JADX INFO: renamed from: r1 */
    public boolean f200196r1;

    /* JADX INFO: renamed from: s */
    public TextView f200197s;

    /* JADX INFO: renamed from: s1 */
    public boolean f200198s1;

    /* JADX INFO: renamed from: t */
    public TextView f200199t;

    /* JADX INFO: renamed from: t1 */
    public y20<View> f200200t1;

    /* JADX INFO: renamed from: u */
    public VideoRecordProgressView f200201u;

    /* JADX INFO: renamed from: u1 */
    public y20<View> f200202u1;

    /* JADX INFO: renamed from: v */
    public ImageView f200203v;

    /* JADX INFO: renamed from: v1 */
    public y20<Bundle> f200204v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f200205w;

    /* JADX INFO: renamed from: w1 */
    public MusicContent f200206w1;

    /* JADX INFO: renamed from: x */
    public ImageView f200207x;

    /* JADX INFO: renamed from: y */
    public TextView f200209y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f200211z;

    /* JADX INFO: renamed from: z1 */
    public boolean f200212z1;

    /* JADX INFO: renamed from: p0 */
    public int f200191p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f200112E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f200115F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f200118G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public jxd0 f200121H0 = new jxd0("need_show_tip" + FeedModule.m61405F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, vxd0> f200124I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f200144S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f200154X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f200160a1 = 1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<MediaMeta> f200187n1 = new ArrayList<>();

    /* JADX INFO: renamed from: p1 */
    public int f200192p1 = 0;

    /* JADX INFO: renamed from: q1 */
    public boolean f200194q1 = true;

    /* JADX INFO: renamed from: x1 */
    public float f200208x1 = 1.0f;

    /* JADX INFO: renamed from: y1 */
    public int f200210y1 = 2;

    /* JADX INFO: renamed from: A1 */
    public boolean f200104A1 = true;

    /* JADX INFO: renamed from: E1 */
    public wyd0 f200113E1 = new wyd0("camera_filter_id" + FeedModule.m61405F().userId(), null);

    /* JADX INFO: renamed from: F1 */
    public boolean f200116F1 = false;

    /* JADX INFO: renamed from: G1 */
    public boolean f200119G1 = true;

    /* JADX INFO: renamed from: H1 */
    public List<MMPresetFilter> f200122H1 = new ArrayList();

    /* JADX INFO: renamed from: l.yil0$c */
    public class C21607c extends GestureDetector.SimpleOnGestureListener {
        public C21607c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            yil0.this.m216165O2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.yil0$d */
    public class C21608d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f200217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f200218b;

        public C21608d(int i, boolean z) {
            this.f200217a = i;
            this.f200218b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            yil0.this.m216241q3(this.f200217a, this.f200218b);
            yil0.this.f200144S0 = 0.0f;
        }
    }

    /* JADX INFO: renamed from: l.yil0$e */
    public class C21609e implements MaskMenuView.InterfaceC11342a {
        public C21609e() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC11342a
        /* JADX INFO: renamed from: a */
        public void mo62874a(int i, boolean z) {
            boolean zMo101314Q = yil0.this.f200157Z.mo101314Q();
            yil0.this.f200106B1 = null;
            if (NullChecker.m82486a(yil0.this.f200108C1)) {
                if (yil0.this.f200108C1.isBeautySticker()) {
                    yil0.this.f200157Z.mo101317T();
                }
                yil0.this.f200108C1 = null;
            }
            yil0.this.f200129L.f40419c.m62615e();
            yil0.this.f200131M.f40412c.m62615e();
            if (NullChecker.m82486a(yil0.this.f200174h1)) {
                yil0.this.f200174h1.cancel();
            }
            if (NullChecker.m82486a(yil0.this.f200176i1)) {
                yil0.this.f200176i1.cancel();
            }
            if (z) {
                return;
            }
            yil0.this.f200157Z.mo101318U();
            if (zMo101314Q || !yil0.this.f200157Z.mo101314Q()) {
                return;
            }
            yil0.this.f200157Z.mo101326w(yil0.f200102O1);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.MaskMenuView.InterfaceC11342a
        /* JADX INFO: renamed from: b */
        public void mo62875b(CameraSticker cameraSticker, int i, boolean z) {
            xc4.m210114c().m210126m(cameraSticker);
            yil0.this.f200150V0.m62873i(i);
            if (!cameraSticker.hasModelFile || z || cameraSticker.f40067id.equals(yil0.this.f200106B1)) {
                return;
            }
            boolean zMo101314Q = yil0.this.f200157Z.mo101314Q();
            yil0.this.f200108C1 = cameraSticker;
            yil0.this.f200106B1 = cameraSticker.f40067id;
            if (NullChecker.m82486a(yil0.this.f200174h1)) {
                yil0.this.f200174h1.cancel();
            }
            boolean zIsBeautySticker = cameraSticker.isBeautySticker();
            yil0 yil0Var = yil0.this;
            if (zIsBeautySticker) {
                yil0Var.f200183l1 = null;
                yil0.this.f200157Z.mo101312N(new File(cameraSticker.modelFilePath));
            } else {
                yil0Var.f200104A1 = true;
                yil0.this.f200212z1 = true;
                yil0.this.f200157Z.mo101317T();
                yil0.this.f200157Z.mo101307B();
                yil0 yil0Var2 = yil0.this;
                yil0Var2.f200183l1 = wdl0.m205969a(yil0Var2.getContext(), new File(cameraSticker.modelFilePath));
                if (NullChecker.m82487b(yil0.this.f200183l1)) {
                    yil0.this.f200157Z.mo101306A(yil0.this.f200183l1);
                }
            }
            uqb0.f180374G.m127115L0(yil0.this.f200129L.f40419c.getDraweeView(), cameraSticker.icon);
            uqb0.f180374G.m127115L0(yil0.this.f200131M.f40412c.getDraweeView(), cameraSticker.icon);
            if (NullChecker.m82486a(yil0.this.f200183l1)) {
                yil0.this.m216241q3(0, false);
            }
            if (!zMo101314Q && yil0.this.f200157Z.mo101314Q()) {
                yil0.this.f200157Z.mo101326w(yil0.f200102O1);
            }
            if (NullChecker.m82486a(yil0.this.f200152W0)) {
                yil0.this.f200152W0.m62848S();
            }
        }
    }

    public yil0(VideoRecordFrag videoRecordFrag) {
        this.f200153X = videoRecordFrag;
        this.f200151W = videoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: A1 */
    private void m216117A1() {
        this.f200205w.setOnClickListener(new View.OnClickListener() { // from class: l.wil0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189372a.m216299Y1(view);
            }
        });
        bnl0.m105593z(this.f200209y);
        this.f200129L.setCallback(this);
        this.f200131M.setCallback(this);
        this.f200155Y.m210925y0();
    }

    /* JADX INFO: renamed from: B1 */
    private void m216119B1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f200199t;
            Interpolator interpolator = gt0.f106349d;
            Animator animatorM132180z = gt0.m132180z(gt0.m132170p(textView, "scaleX", 500L, 500L, interpolator, 0.3f, 1.2f), gt0.m132170p(this.f200199t, "scaleY", 500L, 500L, interpolator, 0.3f, 1.2f), gt0.m132170p(this.f200199t, "alpha", 500L, 500L, interpolator, 0.3f, 1.2f));
            gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.xhl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194373a.m216300Z1(i);
                }
            });
            gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.iil0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115108a.m216201a2();
                }
            });
            arrayList.add(animatorM132180z);
        }
        Animator animatorM132173s = gt0.m132173s((Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2));
        this.f200140Q0 = animatorM132173s;
        gt0.m132176v(animatorM132173s, new Runnable() { // from class: l.sil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168837a.m216203b2();
            }
        });
        gt0.m132161g(this.f200140Q0, new Runnable() { // from class: l.til0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174471a.m216302c2();
            }
        }, new Runnable() { // from class: l.uil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179133a.m216303d2();
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private void m216120B3() {
        if (this.f200122H1.size() <= 1) {
            FeedModule.f39701b.f40040H.m159280q();
            o1j0.m165634h(R$string.f39764J0);
        }
        this.f200148U0.m62773p();
        m216204b3(this.f200148U0, true);
        m216246s3(false);
    }

    /* JADX INFO: renamed from: C3 */
    private void m216122C3(final boolean z) {
        String strMo101313P = this.f200157Z.mo101313P(this.f200154X0);
        if (NullChecker.m82486a(this.f200148U0)) {
            this.f200148U0.m62774q(this.f200154X0);
        }
        if (TextUtils.isEmpty(strMo101313P)) {
            return;
        }
        this.f200175i.setText(strMo101313P);
        l51.m152887G(new Runnable() { // from class: l.zhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204432a.m216271D2(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3, reason: merged with bridge method [inline-methods] */
    public void m216271D2(boolean z) {
        gt0.m132159e(this.f200175i);
        if (NullChecker.m82486a(this.f200172g1)) {
            this.f200172g1.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f200175i, "translationX", 0L, 300L, gt0.f106346a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f200175i;
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, gt0.m132170p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), gt0.m132170p(this.f200175i, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f200172g1 = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.pil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152545a.m216130F2();
            }
        });
        gt0.m132160f(this.f200172g1, new Runnable() { // from class: l.qil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157850a.m216272E2();
            }
        });
        this.f200172g1.start();
    }

    /* JADX INFO: renamed from: E1 */
    private void m216127E1() {
        this.f200202u1 = dmk0.m116962a(1000, new y20() { // from class: l.fhl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99082a.m216211e2((View) obj);
            }
        });
        this.f200200t1 = dmk0.m116962a(500, new y20() { // from class: l.ghl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104131a.m216305f2((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    private void m216129F1() {
        if (this.f200148U0 == null) {
            FilterMenuView filterMenuView = (FilterMenuView) this.f200135O.inflate();
            this.f200148U0 = filterMenuView;
            filterMenuView.setFilterData(this.f200122H1);
            this.f200148U0.m62774q(this.f200154X0);
            int size = this.f200122H1.size();
            int i = this.f200154X0;
            int iM216238p1 = (i < 0 || i >= size) ? 50 : (int) (m216238p1(this.f200122H1.get(i).mFilterId) * 100.0f);
            this.f200148U0.f40525c.setText(String.valueOf(iM216238p1));
            this.f200148U0.f40525c.setProgress(iM216238p1);
            this.f200148U0.setMenuDismissListener(new x20() { // from class: l.cil0
                @Override // p153l.x20
                public final void call() {
                    this.f81966a.m216306g2();
                }
            });
            this.f200148U0.setOnItemClickCallback(new y20() { // from class: l.dil0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88665a.m216307h2((Integer) obj);
                }
            });
            this.f200148U0.setIntensityChangedCallback(new y20() { // from class: l.eil0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94181a.m216308i2((Float) obj);
                }
            });
            this.f200148U0.setIntensityChooseCallback(new z20() { // from class: l.fil0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f99207a.m216311k2((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f200148U0.setCompareClickCallback(new y20() { // from class: l.gil0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104505a.m216313l2((Boolean) obj);
                }
            });
            this.f200148U0.setOnResetCallback(new x20() { // from class: l.hil0
                @Override // p153l.x20
                public final void call() {
                    this.f110035a.m216314m2();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ void m216130F2() {
        this.f200175i.setScaleY(1.6f);
        this.f200175i.setScaleX(1.6f);
        this.f200175i.setVisibility(0);
        this.f200198s1 = true;
    }

    /* JADX INFO: renamed from: F3 */
    private void m216131F3(int i) {
        this.f200160a1 = 1;
        m216185V3(1);
        bnl0.m105524M(this.f200105B, true);
        bnl0.m105524M(this.f200182l, this.f200185m1);
        bnl0.m105524M(this.f200203v, true);
        bnl0.m105524M(this.f200211z, false);
        bnl0.m105524M(this.f200127K, !this.f200185m1 && this.f200121H0.get().booleanValue());
        if (i == 1) {
            m216215f3(true);
            m216212e3(true);
            return;
        }
        bnl0.m105524M(this.f200131M, false);
        bnl0.m105524M(this.f200125J, false);
        bnl0.m105524M(this.f200120H, true);
        bnl0.m105524M(this.f200123I, true);
        bnl0.m105524M(this.f200129L, true);
        bnl0.m105524M(this.f200201u, true);
        this.f200120H.setAlpha(1.0f);
        this.f200123I.setAlpha(1.0f);
        this.f200129L.setAlpha(1.0f);
        this.f200201u.setAlpha(1.0f);
        this.f200201u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: H1 */
    private void m216136H1() {
        this.f200201u.setListener(new VideoRecordProgressView.InterfaceC11346d() { // from class: l.xil0
            @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView.InterfaceC11346d
            public final void onProgress(long j) {
                this.f194469a.m216317o2(j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    private void m216137H3(int i) {
        bnl0.m105524M(this.f200105B, true);
        if (i == 0) {
            m216215f3(false);
            m216212e3(false);
        } else {
            this.f200131M.setAlpha(1.0f);
            bnl0.m105524M(this.f200131M, true);
            bnl0.m105524M(this.f200125J, true);
            bnl0.m105524M(this.f200120H, false);
            bnl0.m105524M(this.f200123I, false);
            bnl0.m105524M(this.f200129L, false);
            bnl0.m105524M(this.f200201u, false);
        }
        bnl0.m105524M(this.f200182l, false);
        bnl0.m105524M(this.f200203v, true);
        bnl0.m105524M(this.f200211z, false);
        bnl0.m105524M(this.f200127K, false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m216140I1() {
        vwv vwvVar = new vwv();
        this.f200157Z = vwvVar;
        vwvVar.mo152797a(getAct(), this);
        if (NullChecker.m82486a(this.f200206w1)) {
            this.f200157Z.mo101327x(this.f200206w1);
        }
    }

    /* JADX INFO: renamed from: I3 */
    private void m216141I3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.m82486a(this.f200174h1)) {
                this.f200174h1.cancel();
            }
            if (NullChecker.m82486a(this.f200176i1)) {
                this.f200176i1.cancel();
            }
        }
        if (NullChecker.m82487b(this.f200189o1) && !m216157M2()) {
            bnl0.m105524M(this.f200105B, !z2);
            bnl0.m105524M(this.f200203v, !z2);
        }
        bnl0.m105524M(this.f200205w, this.f200191p0 == 0 && !this.f200128K0 && m216258x3(i));
        bnl0.m105524M(this.f200145T, (this.f200132M0 || this.f200128K0 || !m216258x3(i)) ? false : true);
        if (!z2) {
            bnl0.m105524M(this.f200211z, false);
        }
        bnl0.m105524M(this.f200109D, (z2 || m216280L1()) ? false : true);
        FrameLayout frameLayout = this.f200182l;
        if (!z2 && !m216152L2() && this.f200185m1 && this.f200191p0 == 0) {
            z = true;
        }
        bnl0.m105524M(frameLayout, z);
    }

    /* JADX INFO: renamed from: J1 */
    private void m216144J1() {
        this.f200180k0 = dde0.m115331c(getAct().getApplicationContext());
        pqc0 pqc0Var = new pqc0();
        if (NullChecker.m82487b(this.f200157Z)) {
            pqc0Var.m173345q(this.f200157Z.mo152795K());
        }
        this.f200180k0.m115335g(pqc0Var);
        this.f200180k0.m115336h();
    }

    /* JADX INFO: renamed from: J3 */
    private void m216145J3(int i) {
        gt0.m132170p(this.f200184m, "translationX", 0L, 200L, gt0.f106347b, (i - 2) * qa00.m175859d(58.0f)).start();
        ((TextView) this.f200186n.getChildAt(this.f200210y1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f200186n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f200210y1 = i;
        this.f200208x1 = f200100M1[i];
    }

    /* JADX INFO: renamed from: K1 */
    private void m216148K1() {
        this.f200167e.setOnVerticalFlingListener(new C21606b());
        this.f200167e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C21607c());
        this.f200167e.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC11338b() { // from class: l.lhl0
            @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11338b
            /* JADX INFO: renamed from: a */
            public final boolean mo62787a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m216191X2(this.f200191p0);
    }

    /* JADX INFO: renamed from: K3 */
    private void m216149K3() {
        boolean z;
        boolean zPrepare;
        if (this.f200112E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f200157Z.prepare();
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
        if (!zPrepare) {
            o1j0.m165636j("相机打开失败，请检查系统相机是否可用");
            return;
        }
        m216250u3(false);
        this.f200157Z.mo152799g();
        if (NullChecker.m82486a(this.f200108C1) && this.f200108C1.isBeautySticker()) {
            this.f200157Z.mo101312N(new File(this.f200108C1.modelFilePath));
        }
        if (this.f200154X0 > 0) {
            l51.m152888H(getAct(), new Runnable() { // from class: l.rhl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163183a.m216275G2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: L2 */
    private boolean m216152L2() {
        MaskMenuView maskMenuView = this.f200150V0;
        if (maskMenuView != null && bnl0.m105529O0(maskMenuView)) {
            return true;
        }
        FilterMenuView filterMenuView = this.f200148U0;
        if (filterMenuView != null && bnl0.m105529O0(filterMenuView)) {
            return true;
        }
        MakeUpMenuView makeUpMenuView = this.f200152W0;
        return makeUpMenuView != null && bnl0.m105529O0(makeUpMenuView);
    }

    /* JADX INFO: renamed from: L3 */
    private void m216153L3() {
        this.f200121H0.put(Boolean.FALSE);
        if (this.f200127K.getVisibility() == 0) {
            bnl0.m105524M(this.f200127K, this.f200121H0.get().booleanValue());
        }
        if (this.f200157Z.mo152800h()) {
            return;
        }
        m216200a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public boolean m216156M1() {
        ValueAnimator valueAnimator = this.f200146T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public boolean m216157M2() {
        return !er00.m122093b();
    }

    /* JADX INFO: renamed from: M3 */
    private void m216158M3() {
        if (this.f200191p0 != 0) {
            this.f200129L.setState(2);
            return;
        }
        this.f200157Z.mo152806y(this.f200208x1);
        this.f200157Z.mo152801i();
        m216169P3();
        if (this.f200196r1) {
            m216166O3(true);
            this.f200196r1 = false;
        } else {
            this.f200201u.setMaxDuration(m216240q1());
            this.f200201u.m62909s(this.f200208x1);
            m216223i3();
        }
    }

    /* JADX INFO: renamed from: N2 */
    private void m216161N2(int i) {
        if (i == this.f200191p0) {
            return;
        }
        int iM175859d = qa00.m175859d(64.0f);
        int i2 = (qa00.m175858c().widthPixels / 2) - iM175859d;
        int i3 = this.f200191p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f200145T;
        gt0.m132170p(linearLayout, "translationX", 0L, 100L, gt0.f106348c, linearLayout.getTranslationX(), i2 + ((i3 * iM175859d) / 2)).start();
    }

    /* JADX INFO: renamed from: N3 */
    private void m216162N3() {
        if (!NullChecker.m82487b(this.f200180k0) || this.f200180k0.m115333d()) {
            return;
        }
        this.f200180k0.m115336h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public void m216165O2(float f, float f2) {
        ImageView imageView = this.f200177j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f200177j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m216230m1();
        this.f200157Z.mo152794J(m216194Y0(this.f200159a.getWidth(), this.f200159a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: O3 */
    private boolean m216166O3(boolean z) {
        this.f200201u.m62910t();
        boolean zMo152793I = this.f200157Z.mo152793I(z);
        m216162N3();
        return zMo152793I;
    }

    /* JADX INFO: renamed from: P3 */
    private void m216169P3() {
        if (NullChecker.m82487b(this.f200180k0) && this.f200180k0.m115333d()) {
            this.f200180k0.m115337i();
        }
    }

    /* JADX INFO: renamed from: R3 */
    private void m216174R3() {
        int i = this.f200118G0;
        if (i == 0) {
            this.f200118G0 = 3;
            this.f200123I.setImageResource(f200097J1);
        } else {
            if (i != 3) {
                return;
            }
            this.f200118G0 = 0;
            this.f200123I.setImageResource(f200096I1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m216177S3(boolean z, float f) {
        List<MMPresetFilter> list = this.f200122H1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f200154X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f200162b1 = m216238p1(list.get(this.f200154X0).mFilterId);
        float fM216238p1 = m216238p1(list.get(size).mFilterId);
        this.f200164c1 = fM216238p1;
        int i2 = this.f200154X0;
        float f2 = z ? -f : 1.0f - f;
        this.f200144S0 = f2;
        this.f200157Z.mo101316S(0, i2, z, f2, this.f200162b1, fM216238p1);
        this.f200162b1 = this.f200164c1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m216180T3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM216235o1 = m216235o1();
        int i = this.f200154X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM216235o1 - 1;
        } else if (i2 >= iM216235o1) {
            iM216235o1 = i;
            i2 = 0;
        } else {
            iM216235o1 = i;
        }
        if (!z2) {
            m216241q3(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m82486a(this.f200146T0) && this.f200146T0.isRunning()) {
            this.f200146T0.cancel();
        }
        if (this.f200146T0 == null) {
            this.f200146T0 = new ValueAnimator();
        }
        this.f200146T0.setDuration(j);
        this.f200146T0.setFloatValues(this.f200144S0, i3);
        this.f200146T0.removeAllUpdateListeners();
        this.f200146T0.removeAllListeners();
        this.f200146T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lil0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f132238a.m216277H2(iM216235o1, z, valueAnimator);
            }
        });
        this.f200146T0.addListener(new C21608d(i2, z));
        this.f200146T0.start();
    }

    /* JADX INFO: renamed from: U3 */
    private void m216183U3() {
        int i = this.f200115F0 - 1;
        this.f200115F0 = i;
        if (i < 0) {
            this.f200115F0 = 1;
        }
        this.f200157Z.mo152804r(this.f200115F0);
        m216252v3();
    }

    /* JADX INFO: renamed from: V3 */
    private void m216185V3(int i) {
        m216190X0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(180.0f), qa00.m175859d(180.0f));
        this.f200131M.f40412c.setThemeType(1);
        this.f200131M.f40414e.setThemeType(1);
        this.f200131M.f40410a.setThemeType(1);
        this.f200107C.setThemeType(1);
        if (i == 1) {
            this.f200125J.setImageResource(lbc0.f131079l0);
            layoutParams.gravity = 17;
            this.f200169f.setLayoutParams(layoutParams);
            this.f200119G1 = true;
            gt0.m132159e(this.f200163c);
            View view = this.f200163c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = gt0.f106347b;
            Animator animatorM132166l = gt0.m132166l(view, property, 0L, 300L, interpolator, 0.0f, view.getHeight());
            gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.ohl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147458a.m216278I2();
                }
            });
            animatorM132166l.start();
            gt0.m132159e(this.f200161b);
            Animator animatorM132166l2 = gt0.m132166l(this.f200161b, property, 0L, 300L, interpolator, 0.0f, -this.f200163c.getHeight());
            gt0.m132160f(animatorM132166l2, new Runnable() { // from class: l.phl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152446a.m216279K2();
                }
            });
            animatorM132166l2.start();
        } else if (i == 2) {
            this.f200125J.setImageResource(lbc0.f131095n0);
            this.f200161b.setVisibility(8);
            int i2 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f200170f1;
            this.f200163c.setLayoutParams(layoutParams2);
            this.f200163c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f200170f1 / 2.0f) - (layoutParams.height / 2));
            this.f200169f.setLayoutParams(layoutParams);
            this.f200119G1 = false;
            gt0.m132159e(this.f200163c);
            gt0.m132166l(this.f200163c, View.TRANSLATION_Y, 0L, 300L, gt0.f106347b, this.f200170f1, 0.0f).start();
        } else if (i == 3) {
            this.f200125J.setImageResource(lbc0.f131087m0);
            int i3 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (bnl0.m105588w0() - this.f200166d1);
            this.f200161b.setLayoutParams(layoutParams3);
            this.f200161b.setVisibility(0);
            int i4 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f200168e1;
            this.f200163c.setLayoutParams(layoutParams4);
            this.f200163c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f200168e1 + this.f200166d1) / 2.0f) - (layoutParams.height / 2));
            this.f200169f.setLayoutParams(layoutParams);
            this.f200119G1 = false;
            gt0.m132159e(this.f200163c);
            View view2 = this.f200163c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = gt0.f106347b;
            gt0.m132166l(view2, property2, 0L, 300L, interpolator2, this.f200170f1 - this.f200168e1, 0.0f).start();
            gt0.m132159e(this.f200161b);
            gt0.m132166l(this.f200161b, property2, 0L, 300L, interpolator2, -this.f200163c.getHeight(), 0.0f).start();
        }
        m216312k3();
    }

    /* JADX INFO: renamed from: W2 */
    private void m216187W2() {
        m216166O3(false);
        mo148263k(false);
        this.f200157Z.mo152796O();
    }

    /* JADX INFO: renamed from: W3 */
    private void m216188W3() {
        int i;
        int iM105588w0;
        int i2 = this.f200178j1;
        int i3 = this.f200181k1;
        m216190X0();
        int i4 = this.f200160a1;
        if (i4 == 3) {
            float f = i3;
            iM105588w0 = (int) (f - ((this.f200168e1 / bnl0.m105588w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iM105588w0 = i3 - i;
        } else {
            i = i3;
            iM105588w0 = 0;
        }
        this.f200157Z.mo152791E(0, iM105588w0, i2, i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m216190X0() {
        if (this.f200160a1 == 1) {
            return;
        }
        if ((this.f200166d1 == 0.0f || this.f200168e1 == 0.0f || this.f200170f1 == 0.0f) && this.f200107C.getMeasuredHeight() != 0) {
            if (NullChecker.m82487b(this.f200107C)) {
                this.f200166d1 = ((int) this.f200107C.getY()) + this.f200107C.getBottom() + qa00.m175859d(34.0f) + m216228l1();
            }
            float fM105592y0 = this.f200166d1 + bnl0.m105592y0();
            this.f200168e1 = fM105592y0;
            if (fM105592y0 > this.f200131M.getY() - qa00.m175859d(10.0f)) {
                this.f200168e1 = this.f200131M.getY() - qa00.m175859d(10.0f);
            }
            float fM105592y1 = (bnl0.m105592y0() * 4) / 3;
            this.f200170f1 = fM105592y1;
            if (fM105592y1 <= this.f200131M.getY() || !(this.f200131M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f200131M.getLayoutParams();
            layoutParams.bottomMargin = qa00.m175859d(44.0f);
            this.f200131M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: X2 */
    private void m216191X2(int i) {
        this.f200157Z.setState(this.f200191p0);
        int i2 = this.f200191p0;
        if (i2 == 0) {
            m216131F3(i);
        } else if (i2 == 1) {
            m216137H3(i);
        }
        if (this.f200116F1) {
            bnl0.m105524M(this.f200125J, false);
            bnl0.m105525M0(this.f200131M.f40414e, false);
            bnl0.m105525M0(this.f200107C, false);
        }
        m216161N2(i);
    }

    /* JADX INFO: renamed from: X3 */
    private void m216192X3() {
        boolean z = this.f200185m1;
        this.f200185m1 = !z;
        this.f200120H.setImageResource(!z ? lbc0.f131111p0 : lbc0.f131103o0);
        bnl0.m105524M(this.f200182l, this.f200185m1);
        bnl0.m105524M(this.f200127K, this.f200121H0.get().booleanValue() && !this.f200185m1);
    }

    /* JADX INFO: renamed from: Y0 */
    private Rect m216194Y0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f200157Z.mo152798e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM216217g1 = m216217g1(i - i3, -1000, 1000);
        int iM216217g2 = m216217g1(iM216217g1 + iIntValue, -1000, 1000);
        int iM216217g3 = m216217g1(i2 - i3, -1000, 1000);
        return new Rect(iM216217g1, iM216217g3, iM216217g2, m216217g1(iIntValue + iM216217g3, -1000, 1000));
    }

    /* JADX INFO: renamed from: Z0 */
    private void m216197Z0() {
        this.f200196r1 = true;
        this.f200129L.setState(2);
        this.f200201u.m62910t();
        this.f200157Z.mo152802j();
        mo148263k(false);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m216198Z2() {
        if (this.f200122H1.size() <= 1 || !FeedModule.f39701b.m61707i2()) {
            return;
        }
        this.f200155Y.m210924x0(true);
    }

    /* JADX INFO: renamed from: a1 */
    private void m216200a1() {
        if (this.f200201u.getRecordDuration() >= m216240q1()) {
            m216187W2();
        } else {
            if (m216208d1() <= 0) {
                return;
            }
            if (this.f200118G0 > 0) {
                this.f200140Q0.start();
            } else {
                m216158M3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m216201a2() {
        bnl0.m105524M(this.f200199t, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m216203b2() {
        bnl0.m105524M(this.f200129L, false);
        bnl0.m105524M(this.f200169f, false);
        this.f200198s1 = true;
        if (NullChecker.m82486a(this.f200174h1)) {
            this.f200174h1.cancel();
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m216204b3(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM132170p = gt0.m132170p(view, "translationY", 0L, 500L, z ? gt0.f106347b : gt0.f106346a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        gt0.m132156b(view, animatorM132170p);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.khl0
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, z);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: c3 */
    private void m216206c3(final boolean z) {
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f200109D, "alpha", 100L, 150L, new LinearInterpolator(), z ? 0.0f : 1.0f, z ? 1.0f : 0.0f), gt0.m132170p(this.f200111E, "translationY", 0L, 300L, gt0.f106347b, z ? 0 : qa00.m175859d(60.0f), z ? qa00.m175859d(60.0f) : 0));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.ail0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71545a.m216328v2(z);
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.bil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76894a.m216329w2(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: d1 */
    private long m216208d1() {
        long jM216240q1 = m216240q1() - m216324t1();
        if (jM216240q1 > 0) {
            return jM216240q1;
        }
        o1j0.m165634h(R$string.f39795O1);
        return 0L;
    }

    /* JADX INFO: renamed from: e1 */
    private void m216210e1() {
        if (PermissionHelper.m81064b("android.permission.CAMERA")) {
            return;
        }
        m216310k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m216211e2(View view) {
        int i = this.f200112E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view != this.f200129L.f40421e && view != this.f200131M.f40414e) {
            if (view == this.f200205w && i == 2) {
                this.f200153X.startActivityForResult(new Intent(getAct(), (Class<?>) MusicCenterAct.class), 1001);
                getAct().overridePendingTransition(a8c0.f68909i, a8c0.f68907g);
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.f200130L0, "my_states");
        VideoRecordFrag videoRecordFrag = this.f200153X;
        if (zEquals) {
            videoRecordFrag.startActivityForResult(MediaPickerAct.m80102Y1(videoRecordFrag.act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.730198f).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(7).withMediaPreviewPageId("p_camera_album_picture_preview").needAllSelectedMediaPreview().build()), 66);
        } else {
            videoRecordFrag.startActivityForResult(MediaPickerAct.m80102Y1(getAct(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(9).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFadeFinishAnim(true).needAllSelectedMediaPreview().withAlreadySelectedMedia(this.f200134N0).withSelectedFolderPath(this.f200136O0).withFromType(TextUtils.equals(this.f200130L0, "immersion") ? 5 : 2).withMediaPreviewPageId("p_camera_album_picture_preview").build()), 1002);
        }
        getAct().overridePendingTransition(a8c0.f68909i, a8c0.f68907g);
    }

    /* JADX INFO: renamed from: e3 */
    private void m216212e3(final boolean z) {
        int i = !z ? 1 : 0;
        CameraMenuView cameraMenuView = this.f200120H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(cameraMenuView, "alpha", 0L, 300L, linearInterpolator, f, f2), gt0.m132170p(this.f200123I, "alpha", 0L, 300L, new LinearInterpolator(), f, f2));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.shl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168719a.m216331y2();
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.thl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174393a.m216332z2(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: f1 */
    private void m216214f1() {
        if (this.f200153X.isResumed()) {
            this.f200155Y.m210923u0();
            if (this.f200112E0 != 5) {
                this.f200112E0 = 2;
            }
            Act act = getAct();
            if (NullChecker.m82487b(act) && !act.isFinishing()) {
                m216149K3();
            }
            MakeUpMenuView makeUpMenuView = this.f200152W0;
            if (makeUpMenuView != null) {
                makeUpMenuView.m62846B(this.f200157Z);
                this.f200152W0.m62848S();
            }
        }
    }

    /* JADX INFO: renamed from: f3 */
    private void m216215f3(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f200205w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(linearLayout, property, 0L, 200L, linearInterpolator, f, f2), gt0.m132166l(this.f200201u, property, 0L, 200L, new LinearInterpolator(), f, f2), gt0.m132170p(this.f200201u, "translationY", 0L, 200L, new LinearInterpolator(), i2, i3), gt0.m132166l(this.f200129L, property, 0L, 200L, new LinearInterpolator(), f, f2), gt0.m132166l(this.f200131M, property, 0L, 200L, new LinearInterpolator(), f2, f), gt0.m132166l(this.f200125J, property, 0L, 200L, new LinearInterpolator(), f2, f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.ihl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114980a.m216267A2();
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.jhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120982a.m216268B2(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: g1 */
    private int m216217g1(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: g3 */
    private void m216218g3(String str, boolean z) {
        this.f200153X.m21596q4(str, z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: h1 */
    private MediaMeta m216220h1() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m216280L1() ? "front" : "back";
        mediaMeta.sticker = (this.f200150V0 == null || (cameraSticker = this.f200108C1) == null || TextUtils.equals(cameraSticker.f40067id, "empty")) ? null : this.f200108C1.f40067id;
        if (this.f200154X0 >= 0) {
            int size = this.f200122H1.size();
            int i = this.f200154X0;
            if (size > i) {
                str = this.f200122H1.get(i).mFilterId;
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
    private void m216221h3() {
        this.f200153X.m21598s4();
    }

    /* JADX INFO: renamed from: i3 */
    private void m216223i3() {
        this.f200187n1.add(m216220h1());
    }

    /* JADX INFO: renamed from: j3 */
    private void m216225j3(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: l1 */
    private int m216228l1() {
        if (l51.m152918x() || l51.m152917w()) {
            return bnl0.m105511F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    private void m216230m1() {
        gt0.m132159e(this.f200177j);
        if (NullChecker.m82486a(this.f200142R0)) {
            this.f200142R0.cancel();
        }
        this.f200177j.setVisibility(0);
        ImageView imageView = this.f200177j;
        Property<View, Float> property = gt0.f106354i;
        Interpolator interpolator = gt0.f106347b;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(imageView, property, 0L, 300L, interpolator, 1.0f, 0.75f), gt0.m132170p(this.f200177j, "alpha", 0L, 300L, interpolator, 0.0f, 0.8f), gt0.m132170p(this.f200177j, "alpha", 400L, 200L, interpolator, 0.8f, 0.0f));
        this.f200142R0 = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.oil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147555a.m216284Q1();
            }
        });
        this.f200142R0.start();
    }

    /* JADX INFO: renamed from: m3 */
    private void m216231m3() {
        if (this.f200187n1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f200187n1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void m216314m2() {
        m216243r3(0, true, false);
        Iterator<vxd0> it = this.f200124I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: o1 */
    private int m216235o1() {
        return this.f200122H1.size();
    }

    /* JADX INFO: renamed from: o3 */
    private void m216236o3(String str, int i) {
        vxd0 vxd0Var = this.f200124I0.get("current_filter_intensity" + str);
        if (vxd0Var == null) {
            vxd0Var = new vxd0("current_filter_intensity" + FeedModule.m61405F().userId() + str, 50);
            this.f200124I0.put("current_filter_intensity" + str, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p1 */
    private float m216238p1(String str) {
        vxd0 vxd0Var = this.f200124I0.get("current_filter_intensity" + str);
        if (vxd0Var == null) {
            vxd0Var = new vxd0("current_filter_intensity" + FeedModule.m61405F().userId() + str, 50);
            this.f200124I0.put("current_filter_intensity" + str, vxd0Var);
        }
        return (vxd0Var.get().intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: q1 */
    private long m216240q1() {
        return asx.m99990h().m99991a() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public void m216241q3(int i, boolean z) {
        m216243r3(i, z, true);
    }

    /* JADX INFO: renamed from: r3 */
    private void m216243r3(int i, boolean z, boolean z2) {
        if (this.f200122H1.size() <= i || i < 0) {
            return;
        }
        this.f200113E1.put(this.f200122H1.get(i).mFilterId);
        boolean z3 = this.f200154X0 != i && z2;
        this.f200154X0 = i;
        float fM216238p1 = m216238p1(this.f200122H1.get(i).mFilterId);
        this.f200162b1 = fM216238p1;
        this.f200157Z.mo101316S(0, this.f200154X0, true, 0.0f, fM216238p1, -1.0f);
        this.f200157Z.setIntensity(this.f200162b1);
        if (NullChecker.m82486a(this.f200148U0)) {
            int i2 = (int) (this.f200162b1 * 100.0f);
            this.f200148U0.f40525c.setText(String.valueOf(i2));
            this.f200148U0.f40525c.setProgress(i2);
        }
        if (z3) {
            m216122C3(z);
        }
        if (i == 0) {
            xgl0.f194204c = false;
        } else {
            xgl0.f194204c = true;
        }
    }

    /* JADX INFO: renamed from: s1 */
    private String m216245s1() {
        int i = this.f200160a1;
        if (i == 1) {
            return bnl0.m105588w0() / bnl0.m105592y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : "1.1";
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: s3 */
    private void m216246s3(boolean z) {
        int i = this.f200191p0;
        boolean z2 = false;
        if (i == 0) {
            bnl0.m105524M(this.f200129L, z);
            bnl0.m105524M(this.f200182l, z && this.f200185m1);
            bnl0.m105524M(this.f200127K, this.f200121H0.get().booleanValue() && !this.f200185m1 && z);
        } else if (i == 1) {
            bnl0.m105524M(this.f200131M, z);
        }
        bnl0.m105524M(this.f200205w, this.f200191p0 == 0 && !this.f200128K0 && z && this.f200201u.getCount() == 0);
        LinearLayout linearLayout = this.f200145T;
        if (!this.f200132M0 && !this.f200128K0 && z && this.f200201u.getCount() == 0) {
            z2 = true;
        }
        bnl0.m105524M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: t3 */
    private void m216248t3() {
        this.f200159a.getHolder().addCallback(new SurfaceHolderCallbackC21605a());
        this.f200203v.setOnClickListener(this);
        this.f200107C.setOnClickListener(this);
        this.f200109D.setOnClickListener(this);
        this.f200117G.setOnClickListener(this);
        this.f200114F.setOnClickListener(this);
        this.f200120H.setOnClickListener(this);
        this.f200125J.setOnClickListener(this);
        this.f200123I.setOnClickListener(this);
        this.f200204v1 = dmk0.m116962a(500, new y20() { // from class: l.chl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81848a.m216327v1((Bundle) obj);
            }
        });
        m216127E1();
    }

    /* JADX INFO: renamed from: u3 */
    private void m216250u3(boolean z) {
        boolean z2 = this.f200116F1;
        CameraMenuView cameraMenuView = this.f200107C;
        boolean z3 = false;
        if (z2) {
            bnl0.m105525M0(cameraMenuView, false);
            bnl0.m105524M(this.f200109D, false);
            return;
        }
        bnl0.m105524M(cameraMenuView, this.f200157Z.mo152805s());
        if (this.f200157Z.mo152803m() && !m216280L1()) {
            z3 = true;
        }
        if (z3) {
            this.f200157Z.mo152804r(this.f200115F0);
        }
        if (z) {
            m216206c3(z3);
        } else {
            bnl0.m105524M(this.f200109D, z3);
            this.f200111E.setTranslationY(z3 ? qa00.m175859d(72.0f) : 0.0f);
        }
        m216252v3();
    }

    /* JADX INFO: renamed from: v3 */
    private void m216252v3() {
        int i = this.f200115F0;
        if (i == 0) {
            this.f200109D.setImageResource(f200099L1);
        } else {
            if (i != 1) {
                return;
            }
            this.f200109D.setImageResource(f200098K1);
        }
    }

    /* JADX INFO: renamed from: w1 */
    private void m216255w1() {
        if (this.f200152W0 == null) {
            MakeUpMenuView makeUpMenuView = (MakeUpMenuView) this.f200137P.inflate();
            this.f200152W0 = makeUpMenuView;
            makeUpMenuView.setVisibility(8);
            this.f200152W0.m62860y();
            this.f200152W0.m62847D();
            this.f200152W0.setMenuDismissListener(new x20() { // from class: l.bhl0
                @Override // p153l.x20
                public final void call() {
                    this.f76794a.m216292U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x3 */
    private boolean m216258x3(int i) {
        return (m216152L2() || i == 4 || i == 5 || this.f200201u.getCount() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: y1 */
    private void m216261y1() {
        boolean z = this.f200116F1;
        VText vText = this.f200147U;
        if (z) {
            bnl0.m105525M0(vText, false);
            bnl0.m105525M0(this.f200149V, false);
            bnl0.m105525M0(this.f200145T, false);
            m216312k3();
            return;
        }
        bnl0.m105524M(vText, this.f200126J0);
        bnl0.m105524M(this.f200145T, (this.f200132M0 || this.f200128K0) ? false : true);
        this.f200138P0 = new View(getContext());
        for (final int i = 0; i < this.f200145T.getChildCount(); i++) {
            this.f200145T.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.mhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136858a.m216295V1(i, view);
                }
            });
        }
        m216312k3();
    }

    /* JADX INFO: renamed from: y3 */
    private void m216262y3() {
        m216204b3(this.f200152W0, true);
        m216246s3(false);
    }

    /* JADX INFO: renamed from: z1 */
    private void m216265z1() {
        int childCount = this.f200186n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f200186n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.vil0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184256a.m216298X1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z3 */
    private void m216266z3(String str, final x20 x20Var) {
        th0 th0VarM191142a = new th0.C20312a(this.f200153X.act()).m191148g(false).m191151j(str).m191146e(R$string.f39993s3).m191158q(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.uhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191156o(new View.OnClickListener() { // from class: l.vhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184174a.m216270C2(view);
            }
        }).m191142a();
        this.f200110D1 = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m216267A2() {
        bnl0.m105524M(this.f200205w, true);
        bnl0.m105524M(this.f200201u, true);
        bnl0.m105524M(this.f200129L, true);
        bnl0.m105524M(this.f200131M, true);
        bnl0.m105524M(this.f200125J, true);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m216268B2(boolean z) {
        this.f200201u.setTranslationY(0.0f);
        this.f200131M.setAlpha(1.0f);
        this.f200129L.setAlpha(1.0f);
        this.f200201u.setAlpha(1.0f);
        if (z) {
            bnl0.m105524M(this.f200131M, false);
            bnl0.m105524M(this.f200125J, false);
        } else {
            bnl0.m105524M(this.f200205w, false);
            bnl0.m105524M(this.f200201u, false);
            bnl0.m105524M(this.f200129L, false);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f200151W;
    }

    /* JADX INFO: renamed from: C1 */
    public void m216269C1(Bundle bundle) {
        if (NullChecker.m82486a(bundle)) {
            this.f200189o1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.m82486a(bundle.getSerializable("extra_music_content"))) {
                this.f200206w1 = (MusicContent) bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.m82486a(this.f200189o1)) {
                int i = this.f200189o1.speedIndex;
                this.f200210y1 = i;
                this.f200208x1 = f200100M1[i];
            }
            this.f200126J0 = bundle.getBoolean("extra_has_video", true);
            this.f200128K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f200130L0 = string;
            this.f200116F1 = TextUtils.equals(string, "from_sign_up");
            this.f200132M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.m82486a(bundle.getSerializable("extra_selected_images"))) {
                this.f200134N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f200136O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f200189o1 == null) {
            this.f200189o1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f200189o1;
        MusicContent musicContent = this.f200206w1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m216270C2(View view) {
        this.f200110D1.m191137c();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m216272E2() {
        this.f200198s1 = false;
        this.f200172g1 = null;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m216273E3() {
        m216204b3(this.f200150V0, true);
        m216246s3(false);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m216274G1() {
        if (this.f200150V0 == null) {
            MaskMenuView maskMenuView = (MaskMenuView) this.f200133N.inflate();
            this.f200150V0 = maskMenuView;
            maskMenuView.setMenuDismissListener(new x20() { // from class: l.kil0
                @Override // p153l.x20
                public final void call() {
                    this.f127007a.m216316n2();
                }
            });
            this.f200150V0.setOnFaceResourceSelectListener(new C21609e());
            this.f200150V0.setCameraCategoryData(oc4.m167081O().m167123M());
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m216275G2() {
        m216241q3(this.f200154X0, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m216276G3(boolean z) {
        this.f200129L.m62649w(z);
        this.f200131M.m62626k(z);
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m216277H2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f200157Z.mo101316S(this.f200191p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m216278I2() {
        this.f200163c.setVisibility(8);
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m216279K2() {
        this.f200161b.setVisibility(8);
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m216280L1() {
        return this.f200157Z.mo152798e();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m216281O1() {
        m216166O3(true);
        this.f200157Z.mo152792F();
        this.f200201u.m62910t();
        this.f200201u.m62897g();
        this.f200187n1.clear();
        this.f200157Z.mo152790D(false);
        this.f200129L.setState(2);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m216282P1() {
        MakeUpMenuView makeUpMenuView = this.f200152W0;
        if (makeUpMenuView != null) {
            makeUpMenuView.m62853i0();
        }
        this.f200157Z.mo152792F();
        this.f200129L.m62647u();
        this.f200157Z.release();
        m216310k1();
    }

    /* JADX INFO: renamed from: P2 */
    public void m216283P2() {
        this.f200157Z.mo101320n(new y20() { // from class: l.yhl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199975a.m216326u2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m216284Q1() {
        this.f200177j.setVisibility(8);
    }

    /* JADX INFO: renamed from: Q2 */
    public void m216285Q2() {
        m216210e1();
        if (NullChecker.m82486a(this.f200206w1) || TextUtils.equals("immersion", this.f200130L0)) {
            this.f200191p0 = 0;
        } else if (!this.f200126J0) {
            this.f200191p0 = 1;
        }
        bnl0.m105524M(this.f200205w, this.f200191p0 == 0);
        m216161N2(-1);
        m216140I1();
        m216144J1();
        m216148K1();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m216286R1(Intent intent) {
        this.f200153X.startActivity(intent);
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public void m216287R2() {
        if (uc4.m195359i()) {
            pb1.m171472b().mo171476e(CameraVideoControlView.f40416m);
            dde0.m115332e();
            this.f200157Z.release();
            this.f200201u.m62907q();
            doi.m117278u();
            doi.m117277j().m117289r();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m216288S1(Bundle bundle) {
        this.f200153X.startActivity(VideoEditAct.m62416Y1(getAct(), bundle));
        getAct().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public void m216289S2() {
        this.f200112E0 = 1;
        this.f200140Q0.cancel();
        this.f200157Z.onPause();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m216290T1(final Bundle bundle) {
        m216304d3(new Runnable() { // from class: l.jil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121099a.m216288S1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m216291T2() {
        if (this.f200105B.getTranslationX() != 0.0f) {
            this.f200105B.setTranslationX(0.0f);
        }
        m216214f1();
        if (TextUtils.equals(this.f200130L0, SchemeKey.fake2good)) {
            return;
        }
        m216195Y3(false);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m216292U1() {
        m216204b3(this.f200152W0, false);
        m216246s3(true);
    }

    /* JADX INFO: renamed from: U2 */
    public void m216293U2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.m82486a(this.f200152W0)) {
            this.f200152W0.m62845A(list, list2);
            this.f200152W0.m62848S();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public View m216294V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zil0.m219926b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m216295V1(int i, View view) {
        if (this.f200191p0 == i) {
            return;
        }
        this.f200138P0.setTag(Integer.valueOf(i));
        this.f200200t1.call(this.f200138P0);
    }

    /* JADX INFO: renamed from: V2 */
    public void m216296V2(MusicContent musicContent) {
        this.f200206w1 = musicContent;
        VideoInfo videoInfo = this.f200189o1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m82486a(musicContent)) {
            this.f200209y.setText(musicContent.name);
        }
        this.f200157Z.mo101327x(musicContent);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xgl0 xgl0Var) {
        this.f200155Y = xgl0Var;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m216298X1(int i, View view) {
        m216145J3(i);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m216299Y1(View view) {
        this.f200202u1.call(view);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m216300Z1(int i) {
        this.f200199t.setText(String.valueOf(i));
        this.f200199t.setAlpha(0.0f);
        bnl0.m105524M(this.f200199t, true);
    }

    @Override // p153l.l4m.InterfaceC18346a
    /* JADX INFO: renamed from: a */
    public void mo152807a(String str) {
        o1j0.m165634h(R$string.f39801P1);
        this.f200201u.m62897g();
        mo148263k(false);
    }

    /* JADX INFO: renamed from: a3 */
    public void m216301a3(List<CameraCategory> list) {
        if (NullChecker.m82486a(this.f200150V0)) {
            this.f200150V0.setCameraCategoryData(list);
        }
        m216198Z2();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (CompactMediaPickerAct) this.f200151W;
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: b */
    public long mo148259b() {
        return this.f200201u.getLastSliceDuration();
    }

    @Override // p153l.l4m.InterfaceC18346a
    /* JADX INFO: renamed from: c */
    public void mo152808c(String str, boolean z) {
        if (this.f200201u.getRecordDuration() < 3000) {
            o1j0.m165634h(R$string.f39716B0);
            return;
        }
        Video video = new Video(0, str);
        ikl0.m140411c(video);
        m216221h3();
        if (z && NullChecker.m82486a(this.f200204v1)) {
            this.f200204v1.call(m216315n1(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m216302c2() {
        if (this.f200199t.getTag() == null) {
            m216158M3();
        }
        this.f200199t.setTag(null);
        bnl0.m105524M(this.f200129L, true);
        this.f200198s1 = false;
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo148260d() {
        return this.f200159a.getHolder();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m216303d2() {
        this.f200199t.setTag(Boolean.TRUE);
        m216131F3(0);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m216304d3(Runnable runnable) {
        Animator animatorM132170p = gt0.m132170p(this.f200105B, "translationX", 0L, 100L, new LinearInterpolator(), 0.0f, qa00.m175859d(60.0f));
        gt0.m132160f(animatorM132170p, runnable);
        animatorM132170p.start();
    }

    @Override // p153l.iam
    public void destroy() {
        CameraEffectMgr.m62524V().m62585r();
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: e */
    public void mo148261e() {
        this.f200201u.m62897g();
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: f */
    public void mo166672f(View view) {
        this.f200201u.m62905o();
        m216266z3(getAct().getString(R$string.f39710A0), new x20() { // from class: l.hhl0
            @Override // p153l.x20
            public final void call() {
                this.f109905a.m216318p2();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m216305f2(View view) {
        int i = this.f200112E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f200203v) {
            m216309j1();
            return;
        }
        if (view == this.f200117G) {
            m216262y3();
            return;
        }
        if (view == this.f200123I) {
            m216174R3();
            return;
        }
        if (view == this.f200109D) {
            m216183U3();
            return;
        }
        if (view == this.f200114F) {
            if (this.f200148U0 == null) {
                m216129F1();
            }
            m216120B3();
            return;
        }
        if (view == this.f200107C) {
            this.f200157Z.mo101319f();
            return;
        }
        if (view == this.f200120H) {
            m216192X3();
            return;
        }
        if (view == this.f200129L.f40419c || view == this.f200131M.f40412c) {
            if (this.f200150V0 == null) {
                m216274G1();
            }
            m216273E3();
            l94.m153309e().m153320l();
            return;
        }
        View view2 = this.f200138P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m216319p3(((Integer) this.f200138P0.getTag()).intValue());
            }
        } else if (view == this.f200125J) {
            int i2 = this.f200160a1 + 1;
            this.f200160a1 = i2;
            if (i2 > 3) {
                this.f200160a1 = 1;
            }
            m216185V3(this.f200160a1);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m216306g2() {
        m216204b3(this.f200148U0, false);
        m216246s3(true);
    }

    @Override // p153l.k4m
    public int getCount() {
        return this.f200201u.getCount();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m216307h2(Integer num) {
        m216241q3(num.intValue(), this.f200154X0 - num.intValue() > 0);
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: i */
    public void mo166673i(View view) {
        this.f200200t1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m216308i2(Float f) {
        this.f200157Z.setIntensity(f.floatValue());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM216294V0 = m216294V0(layoutInflater, viewGroup);
        m216261y1();
        m216248t3();
        m216117A1();
        m216119B1();
        m216265z1();
        m216136H1();
        m216255w1();
        if (NullChecker.m82486a(this.f200206w1)) {
            this.f200209y.setText(this.f200206w1.name);
        }
        bnl0.m105524M(this.f200127K, this.f200121H0.get().booleanValue());
        return viewM216294V0;
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: j */
    public int mo148262j() {
        return this.f200115F0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m216309j1() {
        b0m b0mVar;
        if (this.f200201u == null || this.f200129L == null || (b0mVar = this.f200157Z) == null) {
            m216310k1();
            return;
        }
        if (b0mVar.mo152800h()) {
            this.f200129L.setState(5);
        }
        x20 x20Var = new x20() { // from class: l.dhl0
            @Override // p153l.x20
            public final void call() {
                this.f88541a.m216281O1();
            }
        };
        if (this.f200201u.getCount() == 0) {
            m216266z3(getAct().getString(R$string.f39978q0), new x20() { // from class: l.ehl0
                @Override // p153l.x20
                public final void call() {
                    this.f94049a.m216282P1();
                }
            });
        } else {
            m216266z3(getAct().getString(R$string.f39728D0), x20Var);
        }
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: k */
    public void mo148263k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f200201u.getRecordDuration() != 0 && i == 2) {
            this.f200201u.m62910t();
            i = 5;
        }
        this.f200129L.setState(i);
        m216221h3();
    }

    /* JADX INFO: renamed from: k1 */
    public void m216310k1() {
        Act act = getAct();
        if (!NullChecker.m82487b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m216311k2(MMPresetFilter mMPresetFilter, Integer num) {
        m216236o3(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: k3 */
    public void m216312k3() {
        int i = 0;
        while (i < this.f200145T.getChildCount()) {
            m216225j3((VText) this.f200145T.getChildAt(i), this.f200191p0 == i);
            i++;
        }
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: l */
    public void mo148264l() {
        m216218g3(getAct().getString(R$string.f39986r2), true);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m216313l2(Boolean bool) {
        this.f200157Z.mo101308C(bool.booleanValue());
    }

    @Override // p153l.a0m
    /* JADX INFO: renamed from: m */
    public void mo95404m() {
        m216250u3(true);
    }

    @Override // p153l.vmi
    /* JADX INFO: renamed from: n */
    public void mo201743n(float f, int i) {
        if (i == 1) {
            this.f200157Z.mo101310L(new float[]{f, f});
            xgl0.f194205d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f200156Y0 = f;
            float[] fArr = f200102O1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f200158Z0 * 0.6f;
            if (!this.f200157Z.mo101309H() && this.f200157Z.mo101314Q()) {
                this.f200157Z.mo101326w(fArr);
            }
            xgl0.f194206e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f200158Z0 = f;
        float[] fArr2 = f200102O1;
        fArr2[0] = this.f200156Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f200157Z.mo101309H() && this.f200157Z.mo101314Q()) {
            this.f200157Z.mo101326w(fArr2);
        }
        xgl0.f194207f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final Bundle m216315n1(Video video) {
        Bundle bundle = new Bundle();
        if (this.f200189o1 == null) {
            this.f200189o1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f200112E0 == 0;
        qow qowVarMo152795K = this.f200157Z.mo152795K();
        if (NullChecker.m82486a(qowVarMo152795K)) {
            video.rotate = qowVarMo152795K.m177370v();
        }
        MusicContent musicContentMo101328z = this.f200157Z.mo101328z();
        video.isFrontCamera = this.f200157Z.mo152798e();
        String strMo101315R = this.f200157Z.mo101315R(this.f200154X0);
        if (NullChecker.m82486a(musicContentMo101328z)) {
            video.playingMusic = musicContentMo101328z;
        }
        VideoInfo videoInfo = this.f200189o1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo101315R;
        int i = this.f200112E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f200115F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f200189o1;
        videoInfo2.choseDelayTime = this.f200118G0;
        videoInfo2.maxDuration = m216240q1();
        VideoInfo videoInfo3 = this.f200189o1;
        videoInfo3.speedIndex = this.f200210y1;
        MusicContent musicContent = this.f200206w1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f200187n1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f200189o1);
        bundle.putString("my_states", this.f200130L0);
        if (this.f200191p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f200201u.m62902l());
        }
        bundle.putString("extra_from", this.f200130L0);
        return bundle;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m216316n2() {
        m216204b3(this.f200150V0, false);
        m216246s3(true);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m216317o2(long j) {
        String str;
        if (this.f200112E0 != 4) {
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
        if (!this.f200211z.isShown()) {
            bnl0.m105524M(this.f200211z, true);
        }
        this.f200103A.setText(str2 + ":" + str);
        if (j >= m216240q1()) {
            m216187W2();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f200200t1.call(view);
    }

    @Override // p153l.l4m.InterfaceC18346a
    public void onError(final int i, final int i2) {
        l51.m152893M(new Runnable() { // from class: l.nhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142002a.m216320q2(i, i2);
            }
        });
    }

    @Override // p153l.k4m
    public void onFirstFrameRendered() {
        this.f200129L.m62639m();
    }

    @Override // p153l.o94
    public void onStateChanged(int i) {
        this.f200112E0 = i;
        if ((this.f200153X.isResumed() || this.f200153X.lifecycle_() == C4470c.f16268j) && !this.f200116F1) {
            m216141I3(i);
        }
        if (i == 3) {
            if (this.f200191p0 != 1) {
                this.f200129L.setState(2);
                return;
            } else {
                m216188W3();
                return;
            }
        }
        if (i == 4) {
            if (this.f200191p0 != 0) {
                this.f200129L.setState(2);
                return;
            } else {
                m216153L3();
                return;
            }
        }
        if (i != 5) {
            if (i != 6) {
                return;
            }
            if (this.f200201u.getRecordDuration() >= m216321r1()) {
                this.f200157Z.mo152796O();
                return;
            } else {
                o1j0.m165634h(R$string.f39716B0);
                this.f200129L.setState(5);
                return;
            }
        }
        this.f200140Q0.cancel();
        if (this.f200157Z.mo152800h()) {
            m216166O3(true);
        }
        long recordDuration = this.f200201u.getRecordDuration();
        long jM216321r1 = m216321r1();
        CameraVideoControlView cameraVideoControlView = this.f200129L;
        if (recordDuration < jM216321r1) {
            cameraVideoControlView.f40424h.setImageResource(lbc0.f131066j3);
        } else {
            cameraVideoControlView.f40424h.setImageResource(lbc0.f131058i3);
        }
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: p */
    public boolean mo166674p() {
        MakeUpMenuView makeUpMenuView = this.f200152W0;
        if (makeUpMenuView != null && makeUpMenuView.getVisibility() == 0) {
            return true;
        }
        FilterMenuView filterMenuView = this.f200148U0;
        if (filterMenuView != null && filterMenuView.getVisibility() == 0) {
            return true;
        }
        MaskMenuView maskMenuView = this.f200150V0;
        return (maskMenuView != null && maskMenuView.getVisibility() == 0) || !this.f200153X.lifecycle_().f16274a;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m216318p2() {
        this.f200201u.m62908r();
        m216231m3();
        this.f200157Z.removeLast();
        if (this.f200201u.getCount() <= 0) {
            this.f200157Z.mo152790D(false);
            this.f200129L.setState(2);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m216319p3(int i) {
        int i2 = this.f200191p0;
        this.f200191p0 = i;
        m216191X2(i2);
        m216312k3();
        m216195Y3(true);
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: q */
    public void mo148265q(String str, Exception exc) {
        this.f200131M.setEnabled(true);
        if (NullChecker.m82486a(this.f200148U0)) {
            gt0.m132159e(this.f200148U0);
            this.f200148U0.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f200152W0)) {
            gt0.m132159e(this.f200152W0);
            this.f200152W0.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f200150V0)) {
            gt0.m132159e(this.f200150V0);
            this.f200150V0.setVisibility(8);
        }
        m216246s3(true);
        if (exc != null) {
            o1j0.m165634h(R$string.f39723C1);
            return;
        }
        if (!this.f200116F1) {
            if (er00.m122093b()) {
                m216325u1(str);
            }
        } else if (NullChecker.m82486a(getAct())) {
            Intent intent = new Intent();
            intent.putExtra("select_image_path", str);
            getAct().setResult(-1, intent);
            m216310k1();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m216320q2(int i, int i2) {
        if (i == -302) {
            m216197Z0();
            o1j0.m165634h(R$string.f39819S1);
        } else {
            if (i2 == 100) {
                return;
            }
            m216197Z0();
            o1j0.m165634h(R$string.f39807Q1);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public long m216321r1() {
        return 3000L;
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m216322r2(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m216238p1(mMPresetFilter.mFilterId);
    }

    @Override // p153l.k4m
    public void removeLast() {
        this.f200201u.m62910t();
        this.f200201u.m62908r();
        if (this.f200201u.getCount() <= 0) {
            this.f200157Z.mo152790D(false);
            this.f200129L.setState(2);
        }
    }

    @Override // p153l.a0m
    /* JADX INFO: renamed from: s */
    public void mo95405s(float f, int i) {
        if (NullChecker.m82486a(this.f200152W0)) {
            this.f200152W0.m62848S();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m216323s2() {
        if (NullChecker.m82486a(this.f200148U0)) {
            this.f200148U0.setFilterData(this.f200122H1);
        }
        final String str = this.f200113E1.get();
        int iM147476G = jyb.m147476G(this.f200122H1, new qcj() { // from class: l.ril0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iM147476G > 0) {
            this.f200154X0 = iM147476G;
        }
        m216241q3(this.f200154X0, false);
        m216198Z2();
    }

    /* JADX INFO: renamed from: t1 */
    public long m216324t1() {
        return this.f200201u.getRecordDuration();
    }

    @Override // p153l.k4m
    /* JADX INFO: renamed from: u */
    public boolean mo148266u() {
        return m216324t1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m216325u1(String str) {
        Photo photo = new Photo(0, str);
        photo.isTakePhoto = true;
        photo.tempPath = str;
        photo.isOriginal = true;
        MediaMeta mediaMetaM216220h1 = m216220h1();
        mediaMetaM216220h1.proportion = m216245s1();
        final Intent intentM62214h2 = ImageEditAct.m62214h2(getAct(), photo, mediaMetaM216220h1, this.f200130L0, this.f200132M0, this.f200136O0);
        m216304d3(new Runnable() { // from class: l.whl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f189171a.m216286R1(intentM62214h2);
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m216326u2(List list) {
        this.f200122H1 = list;
        if (list == null) {
            this.f200122H1 = new ArrayList();
        }
        jyb.m147537z(this.f200122H1, new y20() { // from class: l.mil0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136987a.m216322r2((MMPresetFilter) obj);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.nil0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142138a.m216323s2();
            }
        });
    }

    @Override // p153l.o94
    /* JADX INFO: renamed from: v */
    public void mo166675v(View view) {
        this.f200202u1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m216327v1(final Bundle bundle) {
        l51.m152893M(new Runnable() { // from class: l.qhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157722a.m216290T1(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m216328v2(boolean z) {
        bnl0.m105524M(this.f200109D, true);
        this.f200109D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m216329w2(boolean z) {
        bnl0.m105524M(this.f200109D, z);
    }

    /* JADX INFO: renamed from: w3 */
    public void m216330w3(Media media) {
        this.f200129L.m62640n(media);
        this.f200131M.m62621f(media);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m216331y2() {
        bnl0.m105524M(this.f200120H, true);
        bnl0.m105524M(this.f200123I, true);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m216332z2(boolean z) {
        bnl0.m105524M(this.f200120H, z);
        bnl0.m105524M(this.f200123I, z);
    }

    /* JADX INFO: renamed from: l.yil0$a */
    public class SurfaceHolderCallbackC21605a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC21605a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            yil0.this.f200178j1 = i2;
            yil0.this.f200181k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.yil0$b */
    public class C21606b implements FilterScrollMoreViewPager.InterfaceC11339c {

        /* JADX INFO: renamed from: a */
        public boolean f200214a = false;

        public C21606b() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11339c
        /* JADX INFO: renamed from: a */
        public void mo62788a(float f) {
            if (yil0.this.m216157M2() || yil0.this.f200157Z.mo152800h() || yil0.this.m216156M1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f200214a = z;
            yil0.this.m216177S3(z, f);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11339c
        /* JADX INFO: renamed from: b */
        public void mo62789b(float f) {
            if (yil0.this.m216157M2() || yil0.this.f200157Z.mo152800h() || yil0.this.m216156M1() || yil0.this.f200144S0 == 0.0f) {
                return;
            }
            yil0.this.m216180T3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11339c
        public void onCancel() {
            if (yil0.this.m216157M2() || yil0.this.f200157Z.mo152800h() || yil0.this.m216156M1() || yil0.this.f200144S0 == 0.0f) {
                return;
            }
            yil0.this.m216180T3(!this.f200214a, true, true, 200L);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager.InterfaceC11339c
        /* JADX INFO: renamed from: c */
        public void mo62790c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m216195Y3(boolean z) {
    }
}
