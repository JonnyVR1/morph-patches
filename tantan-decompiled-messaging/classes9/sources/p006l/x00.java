package p006l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
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
import com.core.glcore.util.BitmapPrivateProtocolUtil;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.CameraBeautyMode;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.data.Video;
import com.p000p1.mobile.putong.account.data.VideoInfo;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountVideoRecordFrag;
import com.p000p1.mobile.putong.account.p002ui.camera.act.AccountCompactMediaPickerAct;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraPhotoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraVideoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountFilterMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMaskMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountVideoRecordProgressView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.MediaMeta;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.a16;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.gf4;
import l.hpd0;
import l.k9j;
import l.lsi0;
import l.mqi0;
import l.rhi;
import l.rlw;
import l.s7m;
import l.t100;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xdl0;
import l.xh0;
import l.zqx;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x00 implements s7m<C0537az>, InterfaceC0851ip, View.OnClickListener, InterfaceC1316to, InterfaceC0508ai {

    /* JADX INFO: renamed from: F1 */
    public static final int f25520F1 = v2c0.f23953E;

    /* JADX INFO: renamed from: G1 */
    public static final int f25521G1 = v2c0.f23950D;

    /* JADX INFO: renamed from: H1 */
    public static final int f25522H1 = v2c0.f23962H;

    /* JADX INFO: renamed from: I1 */
    public static final int f25523I1 = v2c0.f23959G;

    /* JADX INFO: renamed from: J1 */
    public static final float[] f25524J1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: K1 */
    public static final float[] f25525K1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: L1 */
    public static final float[] f25526L1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f25527A;

    /* JADX INFO: renamed from: A1 */
    public xh0 f25528A1;

    /* JADX INFO: renamed from: B */
    public LinearLayout f25529B;

    /* JADX INFO: renamed from: C */
    public AccountCameraMenuView f25531C;

    /* JADX INFO: renamed from: D */
    public AccountCameraMenuView f25533D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f25535E;

    /* JADX INFO: renamed from: F */
    public AccountCameraMenuView f25538F;

    /* JADX INFO: renamed from: G */
    public AccountCameraMenuView f25540G;

    /* JADX INFO: renamed from: H */
    public AccountCameraMenuView f25542H;

    /* JADX INFO: renamed from: I */
    public AccountCameraMenuView f25544I;

    /* JADX INFO: renamed from: J */
    public AccountCameraMenuView f25546J;

    /* JADX INFO: renamed from: J0 */
    public boolean f25547J0;

    /* JADX INFO: renamed from: K */
    public TextView f25548K;

    /* JADX INFO: renamed from: K0 */
    public boolean f25549K0;

    /* JADX INFO: renamed from: L */
    public AccountCameraVideoControlView f25550L;

    /* JADX INFO: renamed from: L0 */
    public String f25551L0;

    /* JADX INFO: renamed from: M */
    public AccountCameraPhotoControlView f25552M;

    /* JADX INFO: renamed from: M0 */
    public boolean f25553M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f25554N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f25555N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f25556O;

    /* JADX INFO: renamed from: O0 */
    public String f25557O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f25558P;

    /* JADX INFO: renamed from: P0 */
    public View f25559P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f25560Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f25561Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f25562R;

    /* JADX INFO: renamed from: R0 */
    public Animator f25563R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f25564S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f25566T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f25567T0;

    /* JADX INFO: renamed from: U */
    public VText f25568U;

    /* JADX INFO: renamed from: U0 */
    public AccountFilterMenuView f25569U0;

    /* JADX INFO: renamed from: V */
    public VText f25570V;

    /* JADX INFO: renamed from: V0 */
    public AccountMaskMenuView f25571V0;

    /* JADX INFO: renamed from: W */
    public Context f25572W;

    /* JADX INFO: renamed from: W0 */
    public AccountMakeUpMenuView f25573W0;

    /* JADX INFO: renamed from: X */
    public AccountVideoRecordFrag f25574X;

    /* JADX INFO: renamed from: Y */
    public C0537az f25576Y;

    /* JADX INFO: renamed from: Y0 */
    public float f25577Y0;

    /* JADX INFO: renamed from: Z */
    public InterfaceC0898jp f25578Z;

    /* JADX INFO: renamed from: Z0 */
    public float f25579Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f25580a;

    /* JADX INFO: renamed from: b */
    public View f25582b;

    /* JADX INFO: renamed from: b1 */
    public float f25583b1;

    /* JADX INFO: renamed from: c */
    public View f25584c;

    /* JADX INFO: renamed from: c1 */
    public float f25585c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f25586d;

    /* JADX INFO: renamed from: d1 */
    public float f25587d1;

    /* JADX INFO: renamed from: e */
    public AccountFilterScrollMoreViewPager f25588e;

    /* JADX INFO: renamed from: e1 */
    public float f25589e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f25590f;

    /* JADX INFO: renamed from: f1 */
    public float f25591f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f25592g;

    /* JADX INFO: renamed from: g1 */
    public Animator f25593g1;

    /* JADX INFO: renamed from: h */
    public TextView f25594h;

    /* JADX INFO: renamed from: h1 */
    public Animator f25595h1;

    /* JADX INFO: renamed from: i */
    public TextView f25596i;

    /* JADX INFO: renamed from: i1 */
    public Animator f25597i1;

    /* JADX INFO: renamed from: j */
    public ImageView f25598j;

    /* JADX INFO: renamed from: j1 */
    public int f25599j1;

    /* JADX INFO: renamed from: k */
    public TextView f25600k;

    /* JADX INFO: renamed from: k0 */
    public C0577bw f25601k0;

    /* JADX INFO: renamed from: k1 */
    public int f25602k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f25603l;

    /* JADX INFO: renamed from: l1 */
    public boolean f25604l1;

    /* JADX INFO: renamed from: m */
    public View f25605m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f25607n;

    /* JADX INFO: renamed from: n1 */
    public VideoInfo f25608n1;

    /* JADX INFO: renamed from: o */
    public TextView f25609o;

    /* JADX INFO: renamed from: p */
    public TextView f25611p;

    /* JADX INFO: renamed from: q */
    public TextView f25614q;

    /* JADX INFO: renamed from: q1 */
    public boolean f25615q1;

    /* JADX INFO: renamed from: r */
    public TextView f25616r;

    /* JADX INFO: renamed from: r1 */
    public boolean f25617r1;

    /* JADX INFO: renamed from: s */
    public TextView f25618s;

    /* JADX INFO: renamed from: s1 */
    public e30<View> f25619s1;

    /* JADX INFO: renamed from: t */
    public TextView f25620t;

    /* JADX INFO: renamed from: t1 */
    public e30<View> f25621t1;

    /* JADX INFO: renamed from: u */
    public AccountVideoRecordProgressView f25622u;

    /* JADX INFO: renamed from: u1 */
    public e30<Bundle> f25623u1;

    /* JADX INFO: renamed from: v */
    public ImageView f25624v;

    /* JADX INFO: renamed from: v1 */
    public MusicContent f25625v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f25626w;

    /* JADX INFO: renamed from: x */
    public ImageView f25628x;

    /* JADX INFO: renamed from: y */
    public TextView f25630y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f25632z;

    /* JADX INFO: renamed from: z1 */
    public CameraSticker f25633z1;

    /* JADX INFO: renamed from: p0 */
    public int f25612p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f25536E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f25539F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f25541G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public hpd0 f25543H0 = new hpd0("account_need_show_tip" + AccountModule.m26F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, tpd0> f25545I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f25565S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f25575X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f25581a1 = 1;

    /* JADX INFO: renamed from: m1 */
    public ArrayList<MediaMeta> f25606m1 = new ArrayList<>();

    /* JADX INFO: renamed from: o1 */
    public int f25610o1 = 0;

    /* JADX INFO: renamed from: p1 */
    public boolean f25613p1 = true;

    /* JADX INFO: renamed from: w1 */
    public float f25627w1 = 1.0f;

    /* JADX INFO: renamed from: x1 */
    public int f25629x1 = 2;

    /* JADX INFO: renamed from: y1 */
    public boolean f25631y1 = true;

    /* JADX INFO: renamed from: B1 */
    public uqd0 f25530B1 = new uqd0("account_camera_filter_id" + AccountModule.m26F().userId(), (String) null);

    /* JADX INFO: renamed from: C1 */
    public boolean f25532C1 = false;

    /* JADX INFO: renamed from: D1 */
    public boolean f25534D1 = true;

    /* JADX INFO: renamed from: E1 */
    public List<MMPresetFilter> f25537E1 = new ArrayList();

    /* JADX INFO: renamed from: l.x00$c */
    public class C1429c extends GestureDetector.SimpleOnGestureListener {
        public C1429c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            x00.this.m27110p2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.x00$d */
    public class C1430d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25639b;

        public C1430d(int i, boolean z) {
            this.f25638a = i;
            this.f25639b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x00.this.m27047R2(this.f25638a, this.f25639b);
            x00.this.f25565S0 = 0.0f;
        }
    }

    public x00(AccountVideoRecordFrag accountVideoRecordFrag) {
        this.f25574X = accountVideoRecordFrag;
        this.f25572W = accountVideoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: H2 */
    private void m26949H2(String str, boolean z) {
        this.f25574X.q4(str, z);
    }

    /* JADX INFO: renamed from: I2 */
    private void m26951I2() {
        this.f25574X.s4();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m26975g0(View view) {
    }

    /* JADX INFO: renamed from: k3 */
    private void m26980k3() {
        boolean z;
        boolean zPrepare;
        if (this.f25536E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f25578Z.prepare();
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
        m27059V2(false);
        this.f25578Z.mo17766g();
        if (NullChecker.a(this.f25633z1) && this.f25633z1.isBeautySticker()) {
            this.f25578Z.mo17712N(new File(this.f25633z1.modelFilePath));
        }
        if (this.f25575X0 > 0) {
            e51.H(act(), new Runnable() { // from class: l.iz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14883a.m27090h2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private void m26983m1() {
        if (this.f25569U0 == null) {
            AccountFilterMenuView accountFilterMenuView = (AccountFilterMenuView) this.f25556O.inflate();
            this.f25569U0 = accountFilterMenuView;
            accountFilterMenuView.setFilterData(this.f25537E1);
            this.f25569U0.m883q(this.f25575X0);
            int size = this.f25537E1.size();
            int i = this.f25575X0;
            int iM27062X0 = (i < 0 || i >= size) ? 50 : (int) (m27062X0(this.f25537E1.get(i).mFilterId) * 100.0f);
            this.f25569U0.f780c.setText(String.valueOf(iM27062X0));
            this.f25569U0.f780c.setProgress(iM27062X0);
            this.f25569U0.setMenuDismissListener(new d30() { // from class: l.sz
                public final void call() {
                    this.f21771a.m27020H1();
                }
            });
            this.f25569U0.setOnItemClickCallback(new e30() { // from class: l.tz
                public final void call(Object obj) {
                    this.f22353a.m27022I1((Integer) obj);
                }
            });
            this.f25569U0.setIntensityChangedCallback(new e30() { // from class: l.uz
                public final void call(Object obj) {
                    this.f23820a.m27024J1((Float) obj);
                }
            });
            this.f25569U0.setIntensityChooseCallback(new f30() { // from class: l.vz
                public final void call(Object obj, Object obj2) {
                    this.f24546a.m27026K1((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f25569U0.setCompareClickCallback(new e30() { // from class: l.wz
                public final void call(Object obj) {
                    this.f25504a.m27029L1((Boolean) obj);
                }
            });
            this.f25569U0.setOnResetCallback(new d30() { // from class: l.xz
                public final void call() {
                    this.f27801a.m27032M1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m26988q1() {
        this.f25588e.setOnVerticalFlingListener(new C1428b());
        this.f25588e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C1429c());
        this.f25588e.setBeforeCheckEnableTouchListener(new AccountFilterScrollMoreViewPager.InterfaceC0080b() { // from class: l.oz
            @Override // com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC0080b
            /* JADX INFO: renamed from: a */
            public final boolean mo779a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m27003A2(this.f25612p0);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m27002A1(int i) {
        this.f25620t.setText(String.valueOf(i));
        this.f25620t.setAlpha(0.0f);
        xdl0.M(this.f25620t, true);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m27003A2(int i) {
        this.f25578Z.setState(this.f25612p0);
        int i2 = this.f25612p0;
        if (i2 == 0) {
            m27085f3(i);
        } else if (i2 == 1) {
            m27091h3(i);
        }
        if (this.f25532C1) {
            xdl0.M(this.f25546J, false);
            xdl0.M0(this.f25531C, false);
        }
        m27107o2(i);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m27004B1() {
        xdl0.M(this.f25620t, false);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m27005B2() {
        if (this.f25537E1.size() <= 1 || !SignUpAiAct.f344c.m22069E()) {
            return;
        }
        this.f25576Y.m12343x0(true);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m27006C0() {
        return this.f25572W;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m27007C1() {
        xdl0.M(this.f25550L, false);
        xdl0.M(this.f25590f, false);
        this.f25617r1 = true;
        if (NullChecker.a(this.f25595h1)) {
            this.f25595h1.cancel();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m27008C2(List<CameraCategory> list) {
        if (NullChecker.a(this.f25571V0)) {
            this.f25571V0.setCameraCategoryData(list);
        }
        m27005B2();
    }

    /* JADX INFO: renamed from: D0 */
    public View m27009D0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y00.m27734b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m27010D2(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorP = bt0.p(view, "translationY", 0L, 500L, z ? bt0.b : bt0.a, new float[]{z ? view.getHeight() : 0, z ? 0 : view.getHeight()});
        bt0.b(view, animatorP);
        bt0.f(animatorP, new Runnable() { // from class: l.rz
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public void m27092i1(C0537az c0537az) {
        this.f25576Y = c0537az;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m27012E1() {
        if (this.f25620t.getTag() == null) {
            m27105n3();
        }
        this.f25620t.setTag(null);
        xdl0.M(this.f25550L, true);
        this.f25617r1 = false;
    }

    /* JADX INFO: renamed from: E2 */
    public final void m27013E2(final boolean z) {
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f25533D, "alpha", 100L, 150L, new LinearInterpolator(), new float[]{z ? 0.0f : 1.0f, z ? 1.0f : 0.0f}), bt0.p(this.f25535E, "translationY", 0L, 300L, bt0.b, new float[]{z ? 0 : t100.d(60.0f), z ? t100.d(60.0f) : 0})});
        bt0.v(animatorZ, new Runnable() { // from class: l.e00
            @Override // java.lang.Runnable
            public final void run() {
                this.f10675a.m27063X1(z);
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.f00
            @Override // java.lang.Runnable
            public final void run() {
                this.f11545a.m27066Y1(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m27014F1() {
        this.f25620t.setTag(Boolean.TRUE);
        m27085f3(0);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m27015F2(final boolean z) {
        int i = !z ? 1 : 0;
        AccountCameraMenuView accountCameraMenuView = this.f25542H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(accountCameraMenuView, "alpha", 0L, 300L, linearInterpolator, new float[]{f, f2}), bt0.p(this.f25544I, "alpha", 0L, 300L, new LinearInterpolator(), new float[]{f, f2})});
        bt0.v(animatorZ, new Runnable() { // from class: l.jz
            @Override // java.lang.Runnable
            public final void run() {
                this.f15500a.m27068Z1();
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f16106a.m27071a2(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m27016G0() {
        if (this.f25581a1 == 1) {
            return;
        }
        if ((this.f25587d1 == 0.0f || this.f25589e1 == 0.0f || this.f25591f1 == 0.0f) && this.f25531C.getMeasuredHeight() != 0) {
            if (NullChecker.b(this.f25531C)) {
                this.f25587d1 = ((int) this.f25531C.getY()) + this.f25531C.getBottom() + t100.d(34.0f) + m27051T0();
            }
            float fY0 = this.f25587d1 + xdl0.y0();
            this.f25589e1 = fY0;
            if (fY0 > this.f25552M.getY() - t100.d(10.0f)) {
                this.f25589e1 = this.f25552M.getY() - t100.d(10.0f);
            }
            float fY1 = (xdl0.y0() * 4) / 3;
            this.f25591f1 = fY1;
            if (fY1 <= this.f25552M.getY() || !(this.f25552M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25552M.getLayoutParams();
            layoutParams.bottomMargin = t100.d(44.0f);
            this.f25552M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m27017G1(View view) {
        int i = this.f25536E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f25624v) {
            zvf0.r("e_signup_camera_back", "p_signup_camera");
            m27039P0();
            return;
        }
        if (view == this.f25540G) {
            m27072a3();
            return;
        }
        if (view == this.f25544I) {
            m27116r3();
            return;
        }
        if (view == this.f25533D) {
            m27124u3();
            return;
        }
        if (view == this.f25538F) {
            if (this.f25569U0 == null) {
                m26983m1();
            }
            m27076c3();
            return;
        }
        if (view == this.f25531C) {
            this.f25578Z.mo17717f();
            return;
        }
        if (view == this.f25542H) {
            m27131x3();
            return;
        }
        View view2 = this.f25559P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m27044Q2(((Integer) this.f25559P0.getTag()).intValue());
            }
        } else if (view == this.f25546J) {
            int i2 = this.f25581a1 + 1;
            this.f25581a1 = i2;
            if (i2 > 3) {
                this.f25581a1 = 1;
            }
            m27127v3(this.f25581a1);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m27018G2(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f25626w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(linearLayout, property, 0L, 200L, linearInterpolator, new float[]{f, f2}), bt0.l(this.f25622u, property, 0L, 200L, new LinearInterpolator(), new float[]{f, f2}), bt0.p(this.f25622u, "translationY", 0L, 200L, new LinearInterpolator(), new float[]{i2, i3}), bt0.l(this.f25550L, property, 0L, 200L, new LinearInterpolator(), new float[]{f, f2}), bt0.l(this.f25552M, property, 0L, 200L, new LinearInterpolator(), new float[]{f2, f}), bt0.l(this.f25546J, property, 0L, 200L, new LinearInterpolator(), new float[]{f2, f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.yz
            @Override // java.lang.Runnable
            public final void run() {
                this.f28507a.m27073b2();
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.zz
            @Override // java.lang.Runnable
            public final void run() {
                this.f29045a.m27075c2(z);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: H0 */
    public final Rect m27019H0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f25578Z.mo17765e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM27034N0 = m27034N0(i - i3, -1000, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iM27034N1 = m27034N0(iM27034N0 + iIntValue, -1000, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iM27034N2 = m27034N0(i2 - i3, -1000, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        return new Rect(iM27034N0, iM27034N2, iM27034N1, m27034N0(iIntValue + iM27034N2, -1000, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m27020H1() {
        m27010D2(this.f25569U0, false);
        m27053T2(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m27021I0() {
        this.f25615q1 = true;
        this.f25550L.setState(2);
        this.f25622u.m1054t();
        this.f25578Z.mo17769j();
        mo18234k(false);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m27022I1(Integer num) {
        m27047R2(num.intValue(), this.f25575X0 - num.intValue() > 0);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m27023J0() {
        if (this.f25622u.getRecordDuration() >= m27065Y0()) {
            m27136z2();
        } else {
            if (m27025K0() <= 0) {
                return;
            }
            if (this.f25541G0 > 0) {
                this.f25561Q0.start();
            } else {
                m27105n3();
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m27024J1(Float f) {
        this.f25578Z.setIntensity(f.floatValue());
    }

    /* JADX INFO: renamed from: K0 */
    public final long m27025K0() {
        long jM27065Y0 = m27065Y0() - m27077d1();
        if (jM27065Y0 > 0) {
            return jM27065Y0;
        }
        lsi0.j("已经录制完成");
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m27026K1(MMPresetFilter mMPresetFilter, Integer num) {
        m27041P2(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: K2 */
    public final void m27027K2() {
        this.f25606m1.add(m27036O0());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m27028L0() {
        if (PermissionHelper.b(zqx.k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m27048S0();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m27029L1(Boolean bool) {
        this.f25578Z.mo17708C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m27030L2(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m27031M0() {
        if (this.f25574X.isResumed()) {
            this.f25576Y.m12342u0();
            if (this.f25536E0 != 5) {
                this.f25536E0 = 2;
            }
            Act act = act();
            if (NullChecker.b(act) && !act.isFinishing()) {
                m26980k3();
            }
            AccountMakeUpMenuView accountMakeUpMenuView = this.f25573W0;
            if (accountMakeUpMenuView != null) {
                accountMakeUpMenuView.m914B(this.f25578Z);
                this.f25573W0.m930S();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m27033M2() {
        int i = 0;
        while (i < this.f25566T.getChildCount()) {
            m27030L2((VText) this.f25566T.getChildAt(i), this.f25612p0 == i);
            i++;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final int m27034N0(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m27035N2() {
        if (this.f25606m1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f25606m1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: O0 */
    public final MediaMeta m27036O0() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m27114r1() ? "front" : AccountMakeupPageAdapter.MakeupItem.BACK;
        mediaMeta.sticker = (this.f25571V0 == null || (cameraSticker = this.f25633z1) == null || TextUtils.equals(cameraSticker.f333id, "empty")) ? null : this.f25633z1.f333id;
        if (this.f25575X0 >= 0) {
            int size = this.f25537E1.size();
            int i = this.f25575X0;
            if (size > i) {
                str = this.f25537E1.get(i).mFilterId;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        mediaMeta.filter = TextUtils.equals(str, "0") ? null : str;
        return mediaMeta;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m27037O1(long j) {
        String str;
        if (this.f25536E0 != 4) {
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
        if (!this.f25632z.isShown()) {
            xdl0.M(this.f25632z, true);
        }
        this.f25527A.setText(str2 + ":" + str);
        if (j >= m27065Y0()) {
            m27136z2();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public final void m27032M1() {
        m27050S2(0, true, false);
        Iterator<tpd0> it = this.f25545I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m27039P0() {
        InterfaceC0898jp interfaceC0898jp;
        if (this.f25622u == null || this.f25550L == null || (interfaceC0898jp = this.f25578Z) == null) {
            m27048S0();
            return;
        }
        if (interfaceC0898jp.mo17767h()) {
            this.f25550L.setState(5);
        }
        d30 d30Var = new d30() { // from class: l.t00
            public final void call() {
                this.f21783a.m27120t1();
            }
        };
        if (this.f25622u.getCount() == 0) {
            m27074b3("确认退出相机？", new d30() { // from class: l.u00
                public final void call() {
                    this.f22373a.m27122u1();
                }
            });
        } else {
            m27074b3("确认放弃拍的视频？", d30Var);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m27040P1() {
        this.f25622u.m1052r();
        m27035N2();
        this.f25578Z.removeLast();
        if (this.f25622u.getCount() <= 0) {
            this.f25578Z.mo17750D(false);
            this.f25550L.setState(2);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m27041P2(String str, int i) {
        tpd0 tpd0Var = this.f25545I0.get("account_current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("account_current_filter_intensity" + AccountModule.m26F().userId() + str, 50);
            this.f25545I0.put("account_current_filter_intensity" + str, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final void m27055U1(File file) {
        if (act().isFinishing()) {
            return;
        }
        Intent intent = new Intent();
        MediaMeta mediaMetaM27036O0 = m27036O0();
        mediaMetaM27036O0.proportion = m27070a1();
        ArrayList arrayList = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = rhi.B(file.getPath());
        ((Media) pictureNew_).mediaType = "image/*";
        ((Media) pictureNew_).uploadStartTime = mqi0.o();
        ((Media) pictureNew_).status = MediaLocalStatus.get("raw");
        ((Media) pictureNew_).meta = mediaMetaM27036O0;
        mediaMetaM27036O0.type = "photo";
        mediaMetaM27036O0.source = "shoot";
        arrayList.add(pictureNew_);
        intent.putExtra("camera_images_path", arrayList);
        act().setResult(-1, intent);
        m27048S0();
        AccountModule.m26F().openLoginUiOptCropAct(act(), rhi.z(file.getPath()), true);
        AccountModule.f24a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m27043Q1(int i, int i2) {
        if (i == -302) {
            m27021I0();
            lsi0.j("录制失败，请为探探开启摄像相机和录音权限");
        } else {
            if (i2 == 100) {
                return;
            }
            m27021I0();
            lsi0.j("录制失败，请重试");
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m27044Q2(int i) {
        int i2 = this.f25612p0;
        this.f25612p0 = i;
        m27003A2(i2);
        m27033M2();
        m27134y3(true);
    }

    /* JADX INFO: renamed from: R0 */
    public final File m27045R0(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileO = k9j.O("jpg");
                fileOutputStream = new FileOutputStream(fileO);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        String strInsertImage = MediaStore.Images.Media.insertImage(act().getContentResolver(), fileO.getAbsolutePath(), fileO.getName(), fileO.getName());
                        if (!TextUtils.isEmpty(strInsertImage)) {
                            try {
                                String[] strArr = {"_id", "_data", "date_added", "_display_name", "mime_type"};
                                Cursor cursorB = a16.b(act().getContentResolver(), Uri.parse(strInsertImage), strArr, (String) null, (String[]) null, "date_modified DESC", new gf4());
                                if (NullChecker.a(cursorB) && cursorB.moveToFirst()) {
                                    fileO = new File(cursorB.getString(cursorB.getColumnIndexOrThrow(strArr[1])));
                                }
                                if (NullChecker.a(cursorB)) {
                                    cursorB.close();
                                }
                            } catch (Exception e) {
                                CrashHelper.c(e);
                                e.getMessage();
                            }
                        }
                        bitmap.recycle();
                        if (NullChecker.a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                CrashHelper.c(e2);
                            }
                        }
                        return fileO;
                    } catch (IOException e3) {
                        e = e3;
                        CrashHelper.c(e);
                        bitmap.recycle();
                        if (NullChecker.a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                CrashHelper.c(e4);
                            }
                        }
                        return null;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.c(e);
                    bitmap.recycle();
                    if (NullChecker.a(fileOutputStream)) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            CrashHelper.c(e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                fileOutputStream = null;
            } catch (OutOfMemoryError e8) {
                e = e8;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                bitmap.recycle();
                if (!NullChecker.a((Object) null)) {
                    throw th2;
                }
                try {
                    fileOutputStream2.close();
                    throw th2;
                } catch (IOException e9) {
                    CrashHelper.c(e9);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m27046R1(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m27062X0(mMPresetFilter.mFilterId);
    }

    /* JADX INFO: renamed from: R2 */
    public final void m27047R2(int i, boolean z) {
        m27050S2(i, z, true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m27048S0() {
        Act act = act();
        if (!NullChecker.b(act) || act.isFinishing()) {
            return;
        }
        act.finish();
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m27049S1() {
        if (NullChecker.a(this.f25569U0)) {
            this.f25569U0.setFilterData(this.f25537E1);
        }
        final String str = (String) this.f25530B1.get();
        int iG = vwb.G(this.f25537E1, new w9j() { // from class: l.q00
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iG > 0) {
            this.f25575X0 = iG;
        }
        m27047R2(this.f25575X0, false);
        m27005B2();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m27050S2(int i, boolean z, boolean z2) {
        if (this.f25537E1.size() <= i || i < 0) {
            return;
        }
        this.f25530B1.put(this.f25537E1.get(i).mFilterId);
        boolean z3 = this.f25575X0 != i && z2;
        this.f25575X0 = i;
        float fM27062X0 = m27062X0(this.f25537E1.get(i).mFilterId);
        this.f25583b1 = fM27062X0;
        this.f25578Z.mo17716S(0, this.f25575X0, true, 0.0f, fM27062X0, -1.0f);
        this.f25578Z.setIntensity(this.f25583b1);
        if (NullChecker.a(this.f25569U0)) {
            int i2 = (int) (this.f25583b1 * 100.0f);
            this.f25569U0.f780c.setText(String.valueOf(i2));
            this.f25569U0.f780c.setProgress(i2);
        }
        if (z3) {
            m27079d3(z);
        }
        if (i == 0) {
            C0537az.f8607c = false;
        } else {
            C0537az.f8607c = true;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m27051T0() {
        if (e51.x() || e51.w()) {
            return xdl0.F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m27052T1(List list) {
        this.f25537E1 = list;
        if (list == null) {
            this.f25537E1 = new ArrayList();
        }
        vwb.z(this.f25537E1, new e30() { // from class: l.m00
            public final void call(Object obj) {
                this.f16732a.m27046R1((MMPresetFilter) obj);
            }
        });
        e51.G(new Runnable() { // from class: l.n00
            @Override // java.lang.Runnable
            public final void run() {
                this.f17425a.m27049S1();
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final void m27053T2(boolean z) {
        int i = this.f25612p0;
        boolean z2 = false;
        if (i == 0) {
            xdl0.M(this.f25550L, z);
            xdl0.M(this.f25603l, z && this.f25604l1);
            xdl0.M(this.f25548K, ((Boolean) this.f25543H0.get()).booleanValue() && !this.f25604l1 && z);
        } else if (i == 1) {
            xdl0.M(this.f25552M, z);
        }
        xdl0.M(this.f25626w, this.f25612p0 == 0 && !this.f25549K0 && z && this.f25622u.getCount() == 0);
        LinearLayout linearLayout = this.f25566T;
        if (!this.f25553M0 && !this.f25549K0 && z && this.f25622u.getCount() == 0) {
            z2 = true;
        }
        xdl0.M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m27054U0() {
        bt0.e(this.f25598j);
        if (NullChecker.a(this.f25563R0)) {
            this.f25563R0.cancel();
        }
        this.f25598j.setVisibility(0);
        ImageView imageView = this.f25598j;
        Property property = bt0.i;
        Interpolator interpolator = bt0.b;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(imageView, property, 0L, 300L, interpolator, new float[]{1.0f, 0.75f}), bt0.p(this.f25598j, "alpha", 0L, 300L, interpolator, new float[]{0.0f, 0.8f}), bt0.p(this.f25598j, "alpha", 400L, 200L, interpolator, new float[]{0.8f, 0.0f})});
        this.f25563R0 = animatorZ;
        bt0.f(animatorZ, new Runnable() { // from class: l.i00
            @Override // java.lang.Runnable
            public final void run() {
                this.f14154a.m27125v1();
            }
        });
        this.f25563R0.start();
    }

    /* JADX INFO: renamed from: U2 */
    public final void m27056U2() {
        this.f25580a.getHolder().addCallback(new SurfaceHolderCallbackC1427a());
        this.f25624v.setOnClickListener(this);
        this.f25531C.setOnClickListener(this);
        this.f25533D.setOnClickListener(this);
        this.f25540G.setOnClickListener(this);
        this.f25538F.setOnClickListener(this);
        this.f25542H.setOnClickListener(this);
        this.f25546J.setOnClickListener(this);
        this.f25544I.setOnClickListener(this);
        m27099l1();
    }

    /* JADX INFO: renamed from: V0 */
    public final Bundle m27057V0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f25608n1 == null) {
            this.f25608n1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f25536E0 == 0;
        rlw rlwVarMo17756K = this.f25578Z.mo17756K();
        if (NullChecker.a(rlwVarMo17756K)) {
            video.rotate = rlwVarMo17756K.v();
        }
        MusicContent musicContentMo17726z = this.f25578Z.mo17726z();
        video.isFrontCamera = this.f25578Z.mo17765e();
        String strMo17715R = this.f25578Z.mo17715R(this.f25575X0);
        if (NullChecker.a(musicContentMo17726z)) {
            video.playingMusic = musicContentMo17726z;
        }
        VideoInfo videoInfo = this.f25608n1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo17715R;
        int i = this.f25536E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f25539F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f25608n1;
        videoInfo2.choseDelayTime = this.f25541G0;
        videoInfo2.maxDuration = m27065Y0();
        VideoInfo videoInfo3 = this.f25608n1;
        videoInfo3.speedIndex = this.f25629x1;
        MusicContent musicContent = this.f25625v1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f25606m1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f25608n1);
        if (this.f25612p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f25622u.m1046l());
        }
        bundle.putString("extra_from", this.f25551L0);
        return bundle;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m27058V1(String str) throws Throwable {
        final File fileM27045R0 = m27045R0(str);
        if (fileM27045R0 == null) {
            lsi0.j("图片处理失败");
        } else {
            e51.G(new Runnable() { // from class: l.j00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14911a.m27055U1(fileM27045R0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m27059V2(boolean z) {
        boolean z2 = this.f25532C1;
        AccountCameraMenuView accountCameraMenuView = this.f25531C;
        boolean z3 = false;
        if (z2) {
            xdl0.M0(accountCameraMenuView, false);
            xdl0.M(this.f25533D, false);
            return;
        }
        xdl0.M(accountCameraMenuView, this.f25578Z.mo17773s());
        if (this.f25578Z.mo17771m() && !m27114r1()) {
            z3 = true;
        }
        if (z3) {
            this.f25578Z.mo17772r(this.f25539F0);
        }
        if (z) {
            m27013E2(z3);
        } else {
            xdl0.M(this.f25533D, z3);
            this.f25535E.setTranslationY(z3 ? t100.d(72.0f) : 0.0f);
        }
        m27061W2();
    }

    /* JADX INFO: renamed from: W0 */
    public final int m27060W0() {
        return this.f25537E1.size();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m27061W2() {
        int i = this.f25539F0;
        if (i == 0) {
            this.f25533D.setImageResource(f25523I1);
        } else {
            if (i != 1) {
                return;
            }
            this.f25533D.setImageResource(f25522H1);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final float m27062X0(String str) {
        tpd0 tpd0Var = this.f25545I0.get("account_current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("account_current_filter_intensity" + AccountModule.m26F().userId() + str, 50);
            this.f25545I0.put("account_current_filter_intensity" + str, tpd0Var);
        }
        return (((Integer) tpd0Var.get()).intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m27063X1(boolean z) {
        xdl0.M(this.f25533D, true);
        this.f25533D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: X2 */
    public void m27064X2(Media media) {
        this.f25550L.m856j(media);
        this.f25552M.m841f(media);
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m27065Y0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m27066Y1(boolean z) {
        xdl0.M(this.f25533D, z);
    }

    /* JADX INFO: renamed from: Z0 */
    public long m27067Z0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m27068Z1() {
        xdl0.M(this.f25542H, true);
        xdl0.M(this.f25544I, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m27069Z2(int i) {
        return (m27101m2() || i == 4 || i == 5 || this.f25622u.getCount() != 0) ? false : true;
    }

    @Override // p006l.InterfaceC0984lp.a
    /* JADX INFO: renamed from: a */
    public void mo18898a(String str) {
        lsi0.j("录制错误，请确保磁盘空间足够，且打开录制音频权限");
        this.f25622u.m1041g();
        mo18234k(false);
    }

    /* JADX INFO: renamed from: a1 */
    public final String m27070a1() {
        int i = this.f25581a1;
        if (i == 1) {
            return xdl0.w0() / xdl0.y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : "1.1";
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m27071a2(boolean z) {
        xdl0.M(this.f25542H, z);
        xdl0.M(this.f25544I, z);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m27072a3() {
        m27010D2(this.f25573W0, true);
        m27053T2(false);
    }

    public Act act() {
        return (AccountCompactMediaPickerAct) this.f25572W;
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: b */
    public long mo18230b() {
        return this.f25622u.getLastSliceDuration();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m27073b2() {
        xdl0.M(this.f25626w, true);
        xdl0.M(this.f25622u, true);
        xdl0.M(this.f25550L, true);
        xdl0.M(this.f25552M, true);
        xdl0.M(this.f25546J, true);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m27074b3(String str, final d30 d30Var) {
        xh0 xh0VarA = new xh0.a(this.f25574X.act()).g(false).j(str).e(R$string.f39B2).q(R$string.f167b).c(new View.OnClickListener() { // from class: l.mz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).o(new View.OnClickListener() { // from class: l.nz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17942a.m27078d2(view);
            }
        }).a();
        this.f25528A1 = xh0VarA;
        xh0VarA.g();
    }

    @Override // p006l.InterfaceC0984lp.a
    /* JADX INFO: renamed from: c */
    public void mo18899c(String str, boolean z) {
        if (this.f25622u.getRecordDuration() < 3000) {
            lsi0.j("时间太短啦，再拍一段吧！");
            return;
        }
        Video video = new Video(0, str);
        z00.m28524a(video);
        m26951I2();
        if (z && NullChecker.a(this.f25623u1)) {
            this.f25623u1.call(m27057V0(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m27075c2(boolean z) {
        this.f25622u.setTranslationY(0.0f);
        this.f25552M.setAlpha(1.0f);
        this.f25550L.setAlpha(1.0f);
        this.f25622u.setAlpha(1.0f);
        if (z) {
            xdl0.M(this.f25552M, false);
            xdl0.M(this.f25546J, false);
        } else {
            xdl0.M(this.f25626w, false);
            xdl0.M(this.f25622u, false);
            xdl0.M(this.f25550L, false);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m27076c3() {
        if (this.f25537E1.size() <= 1) {
            SignUpAiAct.f344c.f19742g.z();
            lsi0.j("滤镜资源正在加载中...");
        }
        this.f25569U0.m882p();
        m27010D2(this.f25569U0, true);
        m27053T2(false);
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo18231d() {
        return this.f25580a.getHolder();
    }

    /* JADX INFO: renamed from: d1 */
    public long m27077d1() {
        return this.f25622u.getRecordDuration();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m27078d2(View view) {
        this.f25528A1.c();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m27079d3(final boolean z) {
        String strMo17713P = this.f25578Z.mo17713P(this.f25575X0);
        if (NullChecker.a(this.f25569U0)) {
            this.f25569U0.m883q(this.f25575X0);
        }
        if (TextUtils.isEmpty(strMo17713P)) {
            return;
        }
        this.f25596i.setText(strMo17713P);
        e51.G(new Runnable() { // from class: l.h00
            @Override // java.lang.Runnable
            public final void run() {
                this.f13617a.m27081e2(z);
            }
        });
    }

    public void destroy() {
        AccountCameraEffectMgr.m597V().m658r();
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: e */
    public void mo18232e() {
        this.f25622u.m1041g();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m27080e1() {
        if (this.f25573W0 == null) {
            AccountMakeUpMenuView accountMakeUpMenuView = (AccountMakeUpMenuView) this.f25558P.inflate();
            this.f25573W0 = accountMakeUpMenuView;
            accountMakeUpMenuView.setVisibility(8);
            this.f25573W0.m958y();
            this.f25573W0.m915D();
            this.f25573W0.setMenuDismissListener(new d30() { // from class: l.hz
                public final void call() {
                    this.f14145a.m27128w1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final void m27081e2(boolean z) {
        bt0.e(this.f25596i);
        if (NullChecker.a(this.f25593g1)) {
            this.f25593g1.cancel();
        }
        Animator animatorP = bt0.p(this.f25596i, "translationX", 0L, 300L, bt0.a, new float[]{z ? -100.0f : 100.0f, 0.0f});
        TextView textView = this.f25596i;
        Interpolator interpolator = bt0.d;
        Animator animatorZ = bt0.z(new Animator[]{animatorP, bt0.p(textView, "alpha", 0L, 300L, interpolator, new float[]{0.0f, 1.2f}), bt0.p(this.f25596i, "alpha", 1800L, 600L, interpolator, new float[]{1.2f, 0.0f})});
        this.f25593g1 = animatorZ;
        bt0.v(animatorZ, new Runnable() { // from class: l.o00
            @Override // java.lang.Runnable
            public final void run() {
                this.f17954a.m27084f2();
            }
        });
        bt0.f(this.f25593g1, new Runnable() { // from class: l.p00
            @Override // java.lang.Runnable
            public final void run() {
                this.f18528a.m27087g2();
            }
        });
        this.f25593g1.start();
    }

    @Override // p006l.InterfaceC0508ai
    /* JADX INFO: renamed from: f */
    public void mo11852f(View view) {
        this.f25622u.m1049o();
        m27074b3("确认删除上一段视频？", new d30() { // from class: l.lz
            public final void call() {
                this.f16720a.m27040P1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m27083f1() {
        xdl0.M0(this.f25568U, false);
        xdl0.M0(this.f25570V, false);
        xdl0.M0(this.f25566T, false);
        m27033M2();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m27084f2() {
        this.f25596i.setScaleY(1.6f);
        this.f25596i.setScaleX(1.6f);
        this.f25596i.setVisibility(0);
        this.f25617r1 = true;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m27085f3(int i) {
        this.f25581a1 = 1;
        m27127v3(1);
        xdl0.M(this.f25529B, true);
        xdl0.M(this.f25603l, this.f25604l1);
        xdl0.M(this.f25624v, true);
        xdl0.M(this.f25632z, false);
        xdl0.M(this.f25548K, !this.f25604l1 && ((Boolean) this.f25543H0.get()).booleanValue());
        if (i == 1) {
            m27018G2(true);
            m27015F2(true);
            return;
        }
        xdl0.M(this.f25552M, false);
        xdl0.M(this.f25546J, false);
        xdl0.M(this.f25542H, true);
        xdl0.M(this.f25544I, true);
        xdl0.M(this.f25550L, true);
        xdl0.M(this.f25622u, true);
        this.f25542H.setAlpha(1.0f);
        this.f25544I.setAlpha(1.0f);
        this.f25550L.setAlpha(1.0f);
        this.f25622u.setAlpha(1.0f);
        this.f25622u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m27086g1() {
        int childCount = this.f25607n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f25607n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.v00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23835a.m27132y1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m27087g2() {
        this.f25617r1 = false;
        this.f25593g1 = null;
    }

    /* JADX INFO: renamed from: g3 */
    public void m27088g3(boolean z) {
        this.f25550L.m865s(z);
        this.f25552M.m846k(z);
    }

    @Override // p006l.InterfaceC0942kp
    public int getCount() {
        return this.f25622u.getCount();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m27089h1() {
        this.f25626w.setOnClickListener(new View.OnClickListener() { // from class: l.w00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24571a.m27135z1(view);
            }
        });
        xdl0.z(this.f25630y);
        this.f25550L.setCallback(this);
        this.f25552M.setCallback(this);
        this.f25576Y.m12344y0();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m27090h2() {
        m27047R2(this.f25575X0, false);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m27091h3(int i) {
        xdl0.M(this.f25529B, true);
        if (i == 0) {
            m27018G2(false);
            m27015F2(false);
        } else {
            this.f25552M.setAlpha(1.0f);
            xdl0.M(this.f25552M, true);
            xdl0.M(this.f25546J, true);
            xdl0.M(this.f25542H, false);
            xdl0.M(this.f25544I, false);
            xdl0.M(this.f25550L, false);
            xdl0.M(this.f25622u, false);
        }
        xdl0.M(this.f25603l, false);
        xdl0.M(this.f25624v, true);
        xdl0.M(this.f25632z, false);
        xdl0.M(this.f25548K, false);
    }

    @Override // p006l.InterfaceC0508ai
    /* JADX INFO: renamed from: i */
    public void mo11853i(View view) {
        this.f25619s1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m27093i2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f25578Z.mo17716S(this.f25612p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m27094i3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.a(this.f25595h1)) {
                this.f25595h1.cancel();
            }
            if (NullChecker.a(this.f25597i1)) {
                this.f25597i1.cancel();
            }
        }
        if (NullChecker.b(this.f25608n1) && !m27104n2()) {
            xdl0.M(this.f25529B, !z2);
            xdl0.M(this.f25624v, !z2);
        }
        xdl0.M(this.f25626w, this.f25612p0 == 0 && !this.f25549K0 && m27069Z2(i));
        xdl0.M(this.f25566T, (this.f25553M0 || this.f25549K0 || !m27069Z2(i)) ? false : true);
        if (!z2) {
            xdl0.M(this.f25632z, false);
        }
        xdl0.M(this.f25533D, (z2 || m27114r1()) ? false : true);
        FrameLayout frameLayout = this.f25603l;
        if (!z2 && !m27101m2() && this.f25604l1 && this.f25612p0 == 0) {
            z = true;
        }
        xdl0.M(frameLayout, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM27009D0 = m27009D0(layoutInflater, viewGroup);
        m27083f1();
        m27056U2();
        m27089h1();
        m27095j1();
        m27086g1();
        m27103n1();
        m27080e1();
        if (NullChecker.a(this.f25625v1)) {
            this.f25630y.setText(this.f25625v1.name);
        }
        xdl0.M(this.f25548K, ((Boolean) this.f25543H0.get()).booleanValue());
        return viewM27009D0;
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: j */
    public int mo18233j() {
        return this.f25539F0;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m27095j1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f25620t;
            Interpolator interpolator = bt0.d;
            Animator animatorZ = bt0.z(new Animator[]{bt0.p(textView, "scaleX", 500L, 500L, interpolator, new float[]{0.3f, 1.2f}), bt0.p(this.f25620t, "scaleY", 500L, 500L, interpolator, new float[]{0.3f, 1.2f}), bt0.p(this.f25620t, "alpha", 500L, 500L, interpolator, new float[]{0.3f, 1.2f})});
            bt0.v(animatorZ, new Runnable() { // from class: l.ez
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11522a.m27002A1(i);
                }
            });
            bt0.f(animatorZ, new Runnable() { // from class: l.pz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19457a.m27004B1();
                }
            });
            arrayList.add(animatorZ);
        }
        Animator animatorS = bt0.s(new Animator[]{(Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2)});
        this.f25561Q0 = animatorS;
        bt0.v(animatorS, new Runnable() { // from class: l.a00
            @Override // java.lang.Runnable
            public final void run() {
                this.f8031a.m27007C1();
            }
        });
        bt0.g(this.f25561Q0, new Runnable() { // from class: l.l00
            @Override // java.lang.Runnable
            public final void run() {
                this.f16121a.m27012E1();
            }
        }, new Runnable() { // from class: l.r00
            @Override // java.lang.Runnable
            public final void run() {
                this.f20210a.m27014F1();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final void m27096j3(int i) {
        bt0.p(this.f25605m, "translationX", 0L, 200L, bt0.b, new float[]{(i - 2) * t100.d(58.0f)}).start();
        ((TextView) this.f25607n.getChildAt(this.f25629x1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f25607n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f25629x1 = i;
        this.f25627w1 = f25524J1[i];
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: k */
    public void mo18234k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f25622u.getRecordDuration() != 0 && i == 2) {
            this.f25622u.m1054t();
            i = 5;
        }
        this.f25550L.setState(i);
        m26951I2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m27097k1(Bundle bundle) {
        if (NullChecker.a(bundle)) {
            this.f25608n1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.a(bundle.getSerializable("extra_music_content"))) {
                this.f25625v1 = bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.a(this.f25608n1)) {
                int i = this.f25608n1.speedIndex;
                this.f25629x1 = i;
                this.f25627w1 = f25524J1[i];
            }
            this.f25547J0 = bundle.getBoolean("extra_has_video", true);
            this.f25549K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f25551L0 = string;
            this.f25532C1 = TextUtils.equals(string, "from_sign_up");
            this.f25553M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.a(bundle.getSerializable("extra_selected_images"))) {
                this.f25555N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f25557O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f25608n1 == null) {
            this.f25608n1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f25608n1;
        MusicContent musicContent = this.f25625v1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m27098k2() {
        this.f25584c.setVisibility(8);
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: l */
    public void mo18235l() {
        m26949H2("视频处理中...", true);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m27099l1() {
        this.f25621t1 = xck0.a(AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, new e30() { // from class: l.fz
            public final void call(Object obj) {
                x00.m26975g0((View) obj);
            }
        });
        this.f25619s1 = xck0.a(500, new e30() { // from class: l.gz
            public final void call(Object obj) {
                this.f13595a.m27017G1((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m27100l2() {
        this.f25582b.setVisibility(8);
    }

    @Override // p006l.InterfaceC0851ip
    /* JADX INFO: renamed from: m */
    public void mo16771m() {
        m27059V2(true);
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m27101m2() {
        AccountMaskMenuView accountMaskMenuView = this.f25571V0;
        if (accountMaskMenuView != null && xdl0.O0(accountMaskMenuView)) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f25569U0;
        if (accountFilterMenuView != null && xdl0.O0(accountFilterMenuView)) {
            return true;
        }
        AccountMakeUpMenuView accountMakeUpMenuView = this.f25573W0;
        return accountMakeUpMenuView != null && xdl0.O0(accountMakeUpMenuView);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m27102m3() {
        this.f25543H0.put(Boolean.FALSE);
        if (this.f25548K.getVisibility() == 0) {
            xdl0.M(this.f25548K, ((Boolean) this.f25543H0.get()).booleanValue());
        }
        if (this.f25578Z.mo17767h()) {
            return;
        }
        m27023J0();
    }

    @Override // p006l.InterfaceC1316to
    /* JADX INFO: renamed from: n */
    public void mo24754n(float f, int i) {
        if (i == 1) {
            this.f25578Z.mo17710L(new float[]{f, f});
            C0537az.f8608d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f25577Y0 = f;
            float[] fArr = f25526L1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f25579Z0 * 0.6f;
            if (!this.f25578Z.mo17709H() && this.f25578Z.mo17714Q()) {
                this.f25578Z.mo17724w(fArr);
            }
            C0537az.f8609e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f25579Z0 = f;
        float[] fArr2 = f25526L1;
        fArr2[0] = this.f25577Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f25578Z.mo17709H() && this.f25578Z.mo17714Q()) {
            this.f25578Z.mo17724w(fArr2);
        }
        C0537az.f8610f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m27103n1() {
        this.f25622u.setListener(new AccountVideoRecordProgressView.InterfaceC0095d() { // from class: l.s00
            @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountVideoRecordProgressView.InterfaceC0095d
            /* JADX INFO: renamed from: a */
            public final void mo1067a(long j) {
                this.f20959a.m27037O1(j);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m27104n2() {
        return !C1063nu.m20203b();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m27105n3() {
        if (this.f25612p0 != 0) {
            this.f25550L.setState(2);
            return;
        }
        this.f25578Z.mo17774y(this.f25627w1);
        this.f25578Z.mo17768i();
        m27113q3();
        if (this.f25615q1) {
            m27111p3(true);
            this.f25615q1 = false;
        } else {
            this.f25622u.setMaxDuration(m27065Y0());
            this.f25622u.m1053s(this.f25627w1);
            m27027K2();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m27106o1() {
        SurfaceHolderCallbackC0899jr surfaceHolderCallbackC0899jr = new SurfaceHolderCallbackC0899jr();
        this.f25578Z = surfaceHolderCallbackC0899jr;
        surfaceHolderCallbackC0899jr.mo17758T(act(), this);
        if (NullChecker.a(this.f25625v1)) {
            this.f25578Z.mo17725x(this.f25625v1);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m27107o2(int i) {
        if (i == this.f25612p0) {
            return;
        }
        int iD = t100.d(64.0f);
        int i2 = (t100.c().widthPixels / 2) - iD;
        int i3 = this.f25612p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f25566T;
        bt0.p(linearLayout, "translationX", 0L, 100L, bt0.c, new float[]{linearLayout.getTranslationX(), i2 + ((i3 * iD) / 2)}).start();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m27108o3() {
        if (!NullChecker.b(this.f25601k0) || this.f25601k0.m12911d()) {
            return;
        }
        this.f25601k0.m12914h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f25619s1.call(view);
    }

    @Override // p006l.InterfaceC0984lp.a
    public void onError(final int i, final int i2) {
        e51.M(new Runnable() { // from class: l.qz
            @Override // java.lang.Runnable
            public final void run() {
                this.f20166a.m27043Q1(i, i2);
            }
        });
    }

    @Override // p006l.InterfaceC0942kp
    public void onFirstFrameRendered() {
        this.f25550L.m855i();
    }

    @Override // p006l.InterfaceC0508ai
    public void onStateChanged(int i) {
        this.f25536E0 = i;
        if (this.f25574X.isResumed() || this.f25574X.lifecycle_() == c.j) {
            m27094i3(i);
        }
        if (i == 3) {
            if (this.f25612p0 != 1) {
                this.f25550L.setState(2);
                return;
            } else {
                m27130w3();
                return;
            }
        }
        if (i == 4) {
            if (this.f25612p0 != 0) {
                this.f25550L.setState(2);
                return;
            } else {
                m27102m3();
                return;
            }
        }
        if (i != 5) {
            return;
        }
        this.f25561Q0.cancel();
        if (this.f25578Z.mo17767h()) {
            m27111p3(true);
        }
        long recordDuration = this.f25622u.getRecordDuration();
        long jM27067Z0 = m27067Z0();
        AccountCameraVideoControlView accountCameraVideoControlView = this.f25550L;
        if (recordDuration < jM27067Z0) {
            accountCameraVideoControlView.f774h.setImageResource(v2c0.f24036g1);
        } else {
            accountCameraVideoControlView.f774h.setImageResource(v2c0.f24033f1);
        }
    }

    @Override // p006l.InterfaceC0508ai
    /* JADX INFO: renamed from: p */
    public boolean mo11854p() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f25573W0;
        if (accountMakeUpMenuView != null && accountMakeUpMenuView.getVisibility() == 0) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f25569U0;
        if (accountFilterMenuView != null && accountFilterMenuView.getVisibility() == 0) {
            return true;
        }
        AccountMaskMenuView accountMaskMenuView = this.f25571V0;
        return (accountMaskMenuView != null && accountMaskMenuView.getVisibility() == 0) || !this.f25574X.lifecycle_().a;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m27109p1() {
        this.f25601k0 = C0577bw.m12909c(act().getApplicationContext());
        C1497yv c1497yv = new C1497yv();
        if (NullChecker.b(this.f25578Z)) {
            c1497yv.m28415q(this.f25578Z.mo17756K());
        }
        this.f25601k0.m12913g(c1497yv);
        this.f25601k0.m12914h();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m27110p2(float f, float f2) {
        ImageView imageView = this.f25598j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f25598j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m27054U0();
        this.f25578Z.mo17755J(m27019H0(this.f25580a.getWidth(), this.f25580a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m27111p3(boolean z) {
        this.f25622u.m1054t();
        boolean zMo17754I = this.f25578Z.mo17754I(z);
        m27108o3();
        return zMo17754I;
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: q */
    public void mo18236q(final String str, Exception exc) {
        zvf0.r("e_signup_camera_take", "p_signup_camera");
        this.f25552M.setEnabled(true);
        if (NullChecker.a(this.f25569U0)) {
            bt0.e(this.f25569U0);
            this.f25569U0.setVisibility(8);
        }
        if (NullChecker.a(this.f25573W0)) {
            bt0.e(this.f25573W0);
            this.f25573W0.setVisibility(8);
        }
        if (NullChecker.a(this.f25571V0)) {
            bt0.e(this.f25571V0);
            this.f25571V0.setVisibility(8);
        }
        m27053T2(true);
        if (exc != null) {
            lsi0.j("拍照失败");
        } else if (C1063nu.m20203b() && NullChecker.a(act())) {
            e51.y(new Runnable() { // from class: l.d00
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f9951a.m27058V1(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m27112q2() {
        this.f25578Z.mo17718n(new e30() { // from class: l.g00
            public final void call(Object obj) {
                this.f13012a.m27052T1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m27113q3() {
        if (NullChecker.b(this.f25601k0) && this.f25601k0.m12911d()) {
            this.f25601k0.m12915i();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m27114r1() {
        return this.f25578Z.mo17765e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m27115r2() {
        m27028L0();
        if (NullChecker.a(this.f25625v1) || TextUtils.equals("immersion", this.f25551L0)) {
            this.f25612p0 = 0;
        } else if (!this.f25547J0) {
            this.f25612p0 = 1;
        }
        xdl0.M(this.f25626w, this.f25612p0 == 0);
        m27107o2(-1);
        m27106o1();
        m27109p1();
        m26988q1();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m27116r3() {
        int i = this.f25541G0;
        if (i == 0) {
            this.f25541G0 = 3;
            this.f25544I.setImageResource(f25521G1);
        } else {
            if (i != 3) {
                return;
            }
            this.f25541G0 = 0;
            this.f25544I.setImageResource(f25520F1);
        }
    }

    @Override // p006l.InterfaceC0942kp
    public void removeLast() {
        this.f25622u.m1054t();
        this.f25622u.m1052r();
        if (this.f25622u.getCount() <= 0) {
            this.f25578Z.mo17750D(false);
            this.f25550L.setState(2);
        }
    }

    @Override // p006l.InterfaceC0851ip
    /* JADX INFO: renamed from: s */
    public void mo16772s(float f, int i) {
        if (NullChecker.a(this.f25573W0)) {
            this.f25573W0.m930S();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m27117s1() {
        ValueAnimator valueAnimator = this.f25567T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: s2 */
    public void m27118s2() {
        if (C1311tj.m24699b()) {
            C0577bw.m12910e();
            this.f25578Z.release();
            this.f25622u.m1051q();
            C0526ap.m12160u();
            C0526ap.m12159j().m12171r();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m27119s3(boolean z, float f) {
        List<MMPresetFilter> list = this.f25537E1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f25575X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f25583b1 = m27062X0(list.get(this.f25575X0).mFilterId);
        float fM27062X0 = m27062X0(list.get(size).mFilterId);
        this.f25585c1 = fM27062X0;
        int i2 = this.f25575X0;
        float f2 = z ? -f : 1.0f - f;
        this.f25565S0 = f2;
        this.f25578Z.mo17716S(0, i2, z, f2, this.f25583b1, fM27062X0);
        this.f25583b1 = this.f25585c1;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m27120t1() {
        m27111p3(true);
        this.f25578Z.mo17752F();
        this.f25622u.m1054t();
        this.f25622u.m1041g();
        this.f25606m1.clear();
        this.f25578Z.mo17750D(false);
        this.f25550L.setState(2);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m27121t3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM27060W0 = m27060W0();
        int i = this.f25575X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM27060W0 - 1;
        } else if (i2 >= iM27060W0) {
            iM27060W0 = i;
            i2 = 0;
        } else {
            iM27060W0 = i;
        }
        if (!z2) {
            m27047R2(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.a(this.f25567T0) && this.f25567T0.isRunning()) {
            this.f25567T0.cancel();
        }
        if (this.f25567T0 == null) {
            this.f25567T0 = new ValueAnimator();
        }
        this.f25567T0.setDuration(j);
        this.f25567T0.setFloatValues(this.f25565S0, i3);
        this.f25567T0.removeAllUpdateListeners();
        this.f25567T0.removeAllListeners();
        this.f25567T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15517a.m27093i2(iM27060W0, z, valueAnimator);
            }
        });
        this.f25567T0.addListener(new C1430d(i2, z));
        this.f25567T0.start();
    }

    @Override // p006l.InterfaceC0942kp
    /* JADX INFO: renamed from: u */
    public boolean mo18237u() {
        return m27077d1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m27122u1() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f25573W0;
        if (accountMakeUpMenuView != null) {
            accountMakeUpMenuView.m945i0();
        }
        this.f25578Z.mo17752F();
        this.f25550L.m863q();
        this.f25578Z.release();
        m27048S0();
    }

    /* JADX INFO: renamed from: u2 */
    public void m27123u2() {
        this.f25536E0 = 1;
        this.f25561Q0.cancel();
        this.f25578Z.onPause();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m27124u3() {
        int i = this.f25539F0 - 1;
        this.f25539F0 = i;
        if (i < 0) {
            this.f25539F0 = 1;
        }
        this.f25578Z.mo17772r(this.f25539F0);
        m27061W2();
    }

    @Override // p006l.InterfaceC0508ai
    /* JADX INFO: renamed from: v */
    public void mo11855v(View view) {
        this.f25621t1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m27125v1() {
        this.f25598j.setVisibility(8);
    }

    /* JADX INFO: renamed from: v2 */
    public void m27126v2() {
        if (this.f25529B.getTranslationX() != 0.0f) {
            this.f25529B.setTranslationX(0.0f);
        }
        m27031M0();
        if (TextUtils.equals(this.f25551L0, "fake2good")) {
            return;
        }
        m27134y3(false);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m27127v3(int i) {
        m27016G0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(180.0f), t100.d(180.0f));
        this.f25552M.f761a.setThemeType(1);
        this.f25531C.setThemeType(1);
        if (i == 1) {
            this.f25546J.setImageResource(v2c0.f23977M);
            layoutParams.gravity = 17;
            this.f25590f.setLayoutParams(layoutParams);
            this.f25534D1 = true;
            bt0.e(this.f25584c);
            View view = this.f25584c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = bt0.b;
            Animator animatorL = bt0.l(view, property, 0L, 300L, interpolator, new float[]{0.0f, view.getHeight()});
            bt0.f(animatorL, new Runnable() { // from class: l.b00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8634a.m27098k2();
                }
            });
            animatorL.start();
            bt0.e(this.f25582b);
            Animator animatorL2 = bt0.l(this.f25582b, property, 0L, 300L, interpolator, new float[]{0.0f, -this.f25584c.getHeight()});
            bt0.f(animatorL2, new Runnable() { // from class: l.c00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9246a.m27100l2();
                }
            });
            animatorL2.start();
        } else if (i == 2) {
            this.f25546J.setImageResource(v2c0.f23983O);
            this.f25582b.setVisibility(8);
            int i2 = xdl0.e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f25591f1;
            this.f25584c.setLayoutParams(layoutParams2);
            this.f25584c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f25591f1 / 2.0f) - (layoutParams.height / 2));
            this.f25590f.setLayoutParams(layoutParams);
            this.f25534D1 = false;
            bt0.e(this.f25584c);
            bt0.l(this.f25584c, View.TRANSLATION_Y, 0L, 300L, bt0.b, new float[]{this.f25591f1, 0.0f}).start();
        } else if (i == 3) {
            this.f25546J.setImageResource(v2c0.f23980N);
            int i3 = xdl0.e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (xdl0.w0() - this.f25587d1);
            this.f25582b.setLayoutParams(layoutParams3);
            this.f25582b.setVisibility(0);
            int i4 = xdl0.e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f25589e1;
            this.f25584c.setLayoutParams(layoutParams4);
            this.f25584c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f25589e1 + this.f25587d1) / 2.0f) - (layoutParams.height / 2));
            this.f25590f.setLayoutParams(layoutParams);
            this.f25534D1 = false;
            bt0.e(this.f25584c);
            View view2 = this.f25584c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = bt0.b;
            bt0.l(view2, property2, 0L, 300L, interpolator2, new float[]{this.f25591f1 - this.f25589e1, 0.0f}).start();
            bt0.e(this.f25582b);
            bt0.l(this.f25582b, property2, 0L, 300L, interpolator2, new float[]{-this.f25584c.getHeight(), 0.0f}).start();
        }
        m27033M2();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m27128w1() {
        m27010D2(this.f25573W0, false);
        m27053T2(true);
    }

    /* JADX INFO: renamed from: w2 */
    public void m27129w2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.a(this.f25573W0)) {
            this.f25573W0.m913A(list, list2);
            this.f25573W0.m930S();
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m27130w3() {
        int i;
        int iW0;
        int i2 = this.f25599j1;
        int i3 = this.f25602k1;
        m27016G0();
        int i4 = this.f25581a1;
        if (i4 == 3) {
            float f = i3;
            iW0 = (int) (f - ((this.f25589e1 / xdl0.w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iW0 = i3 - i;
        } else {
            i = i3;
            iW0 = 0;
        }
        this.f25578Z.mo17751E(0, iW0, i2, i);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m27131x3() {
        boolean z = this.f25604l1;
        this.f25604l1 = !z;
        this.f25542H.setImageResource(!z ? v2c0.f23989Q : v2c0.f23986P);
        xdl0.M(this.f25603l, this.f25604l1);
        xdl0.M(this.f25548K, ((Boolean) this.f25543H0.get()).booleanValue() && !this.f25604l1);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m27132y1(int i, View view) {
        m27096j3(i);
    }

    /* JADX INFO: renamed from: y2 */
    public void m27133y2(MusicContent musicContent) {
        this.f25625v1 = musicContent;
        VideoInfo videoInfo = this.f25608n1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.a(musicContent)) {
            this.f25630y.setText(musicContent.name);
        }
        this.f25578Z.mo17725x(musicContent);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m27135z1(View view) {
        this.f25621t1.call(view);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m27136z2() {
        m27111p3(false);
        mo18234k(false);
        this.f25578Z.mo17757O();
    }

    /* JADX INFO: renamed from: l.x00$a */
    public class SurfaceHolderCallbackC1427a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC1427a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            x00.this.f25599j1 = i2;
            x00.this.f25602k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.x00$b */
    public class C1428b implements AccountFilterScrollMoreViewPager.InterfaceC0081c {

        /* JADX INFO: renamed from: a */
        public boolean f25635a = false;

        public C1428b() {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC0081c
        /* JADX INFO: renamed from: a */
        public void mo780a(float f) {
            if (x00.this.m27104n2() || x00.this.f25578Z.mo17767h() || x00.this.m27117s1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f25635a = z;
            x00.this.m27119s3(z, f);
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC0081c
        /* JADX INFO: renamed from: b */
        public void mo781b(float f) {
            if (x00.this.m27104n2() || x00.this.f25578Z.mo17767h() || x00.this.m27117s1() || x00.this.f25565S0 == 0.0f) {
                return;
            }
            x00.this.m27121t3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC0081c
        public void onCancel() {
            if (x00.this.m27104n2() || x00.this.f25578Z.mo17767h() || x00.this.m27117s1() || x00.this.f25565S0 == 0.0f) {
                return;
            }
            x00.this.m27121t3(!this.f25635a, true, true, 200L);
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC0081c
        /* JADX INFO: renamed from: c */
        public void mo782c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m27134y3(boolean z) {
    }
}
