package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.CameraBeautyMode;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.account.data.Video;
import com.p051p1.mobile.putong.account.data.VideoInfo;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountVideoRecordFrag;
import com.p051p1.mobile.putong.account.p055ui.camera.act.AccountCompactMediaPickerAct;
import com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraPhotoControlView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraVideoControlView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountFilterMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMaskMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountVideoRecordProgressView;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class r00 implements iam<C20695uy>, InterfaceC16595dp, View.OnClickListener, InterfaceC19171oo, InterfaceC20833vh {

    /* JADX INFO: renamed from: F1 */
    public static final int f160443F1 = bbc0.f75795E;

    /* JADX INFO: renamed from: G1 */
    public static final int f160444G1 = bbc0.f75792D;

    /* JADX INFO: renamed from: H1 */
    public static final int f160445H1 = bbc0.f75804H;

    /* JADX INFO: renamed from: I1 */
    public static final int f160446I1 = bbc0.f75801G;

    /* JADX INFO: renamed from: J1 */
    public static final float[] f160447J1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: K1 */
    public static final float[] f160448K1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: L1 */
    public static final float[] f160449L1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f160450A;

    /* JADX INFO: renamed from: A1 */
    public th0 f160451A1;

    /* JADX INFO: renamed from: B */
    public LinearLayout f160452B;

    /* JADX INFO: renamed from: C */
    public AccountCameraMenuView f160454C;

    /* JADX INFO: renamed from: D */
    public AccountCameraMenuView f160456D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f160458E;

    /* JADX INFO: renamed from: F */
    public AccountCameraMenuView f160461F;

    /* JADX INFO: renamed from: G */
    public AccountCameraMenuView f160463G;

    /* JADX INFO: renamed from: H */
    public AccountCameraMenuView f160465H;

    /* JADX INFO: renamed from: I */
    public AccountCameraMenuView f160467I;

    /* JADX INFO: renamed from: J */
    public AccountCameraMenuView f160469J;

    /* JADX INFO: renamed from: J0 */
    public boolean f160470J0;

    /* JADX INFO: renamed from: K */
    public TextView f160471K;

    /* JADX INFO: renamed from: K0 */
    public boolean f160472K0;

    /* JADX INFO: renamed from: L */
    public AccountCameraVideoControlView f160473L;

    /* JADX INFO: renamed from: L0 */
    public String f160474L0;

    /* JADX INFO: renamed from: M */
    public AccountCameraPhotoControlView f160475M;

    /* JADX INFO: renamed from: M0 */
    public boolean f160476M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f160477N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f160478N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f160479O;

    /* JADX INFO: renamed from: O0 */
    public String f160480O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f160481P;

    /* JADX INFO: renamed from: P0 */
    public View f160482P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f160483Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f160484Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f160485R;

    /* JADX INFO: renamed from: R0 */
    public Animator f160486R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f160487S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f160489T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f160490T0;

    /* JADX INFO: renamed from: U */
    public VText f160491U;

    /* JADX INFO: renamed from: U0 */
    public AccountFilterMenuView f160492U0;

    /* JADX INFO: renamed from: V */
    public VText f160493V;

    /* JADX INFO: renamed from: V0 */
    public AccountMaskMenuView f160494V0;

    /* JADX INFO: renamed from: W */
    public Context f160495W;

    /* JADX INFO: renamed from: W0 */
    public AccountMakeUpMenuView f160496W0;

    /* JADX INFO: renamed from: X */
    public AccountVideoRecordFrag f160497X;

    /* JADX INFO: renamed from: Y */
    public C20695uy f160499Y;

    /* JADX INFO: renamed from: Y0 */
    public float f160500Y0;

    /* JADX INFO: renamed from: Z */
    public InterfaceC16801ep f160501Z;

    /* JADX INFO: renamed from: Z0 */
    public float f160502Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f160503a;

    /* JADX INFO: renamed from: b */
    public View f160505b;

    /* JADX INFO: renamed from: b1 */
    public float f160506b1;

    /* JADX INFO: renamed from: c */
    public View f160507c;

    /* JADX INFO: renamed from: c1 */
    public float f160508c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f160509d;

    /* JADX INFO: renamed from: d1 */
    public float f160510d1;

    /* JADX INFO: renamed from: e */
    public AccountFilterScrollMoreViewPager f160511e;

    /* JADX INFO: renamed from: e1 */
    public float f160512e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f160513f;

    /* JADX INFO: renamed from: f1 */
    public float f160514f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f160515g;

    /* JADX INFO: renamed from: g1 */
    public Animator f160516g1;

    /* JADX INFO: renamed from: h */
    public TextView f160517h;

    /* JADX INFO: renamed from: h1 */
    public Animator f160518h1;

    /* JADX INFO: renamed from: i */
    public TextView f160519i;

    /* JADX INFO: renamed from: i1 */
    public Animator f160520i1;

    /* JADX INFO: renamed from: j */
    public ImageView f160521j;

    /* JADX INFO: renamed from: j1 */
    public int f160522j1;

    /* JADX INFO: renamed from: k */
    public TextView f160523k;

    /* JADX INFO: renamed from: k0 */
    public C20939vv f160524k0;

    /* JADX INFO: renamed from: k1 */
    public int f160525k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f160526l;

    /* JADX INFO: renamed from: l1 */
    public boolean f160527l1;

    /* JADX INFO: renamed from: m */
    public View f160528m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f160530n;

    /* JADX INFO: renamed from: n1 */
    public VideoInfo f160531n1;

    /* JADX INFO: renamed from: o */
    public TextView f160532o;

    /* JADX INFO: renamed from: p */
    public TextView f160534p;

    /* JADX INFO: renamed from: q */
    public TextView f160537q;

    /* JADX INFO: renamed from: q1 */
    public boolean f160538q1;

    /* JADX INFO: renamed from: r */
    public TextView f160539r;

    /* JADX INFO: renamed from: r1 */
    public boolean f160540r1;

    /* JADX INFO: renamed from: s */
    public TextView f160541s;

    /* JADX INFO: renamed from: s1 */
    public y20<View> f160542s1;

    /* JADX INFO: renamed from: t */
    public TextView f160543t;

    /* JADX INFO: renamed from: t1 */
    public y20<View> f160544t1;

    /* JADX INFO: renamed from: u */
    public AccountVideoRecordProgressView f160545u;

    /* JADX INFO: renamed from: u1 */
    public y20<Bundle> f160546u1;

    /* JADX INFO: renamed from: v */
    public ImageView f160547v;

    /* JADX INFO: renamed from: v1 */
    public MusicContent f160548v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f160549w;

    /* JADX INFO: renamed from: x */
    public ImageView f160551x;

    /* JADX INFO: renamed from: y */
    public TextView f160553y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f160555z;

    /* JADX INFO: renamed from: z1 */
    public CameraSticker f160556z1;

    /* JADX INFO: renamed from: p0 */
    public int f160535p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f160459E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f160462F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f160464G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public jxd0 f160466H0 = new jxd0("account_need_show_tip" + AccountModule.m29130F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, vxd0> f160468I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f160488S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f160498X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f160504a1 = 1;

    /* JADX INFO: renamed from: m1 */
    public ArrayList<MediaMeta> f160529m1 = new ArrayList<>();

    /* JADX INFO: renamed from: o1 */
    public int f160533o1 = 0;

    /* JADX INFO: renamed from: p1 */
    public boolean f160536p1 = true;

    /* JADX INFO: renamed from: w1 */
    public float f160550w1 = 1.0f;

    /* JADX INFO: renamed from: x1 */
    public int f160552x1 = 2;

    /* JADX INFO: renamed from: y1 */
    public boolean f160554y1 = true;

    /* JADX INFO: renamed from: B1 */
    public wyd0 f160453B1 = new wyd0("account_camera_filter_id" + AccountModule.m29130F().userId(), null);

    /* JADX INFO: renamed from: C1 */
    public boolean f160455C1 = false;

    /* JADX INFO: renamed from: D1 */
    public boolean f160457D1 = true;

    /* JADX INFO: renamed from: E1 */
    public List<MMPresetFilter> f160460E1 = new ArrayList();

    /* JADX INFO: renamed from: l.r00$c */
    public class C19710c extends GestureDetector.SimpleOnGestureListener {
        public C19710c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            r00.this.m179163p2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.r00$d */
    public class C19711d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f160561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f160562b;

        public C19711d(int i, boolean z) {
            this.f160561a = i;
            this.f160562b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r00.this.m179098R2(this.f160561a, this.f160562b);
            r00.this.f160488S0 = 0.0f;
        }
    }

    public r00(AccountVideoRecordFrag accountVideoRecordFrag) {
        this.f160497X = accountVideoRecordFrag;
        this.f160495W = accountVideoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: H2 */
    private void m179001H2(String str, boolean z) {
        this.f160497X.m21596q4(str, z);
    }

    /* JADX INFO: renamed from: I2 */
    private void m179003I2() {
        this.f160497X.m21598s4();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m179027g0(View view) {
    }

    /* JADX INFO: renamed from: k3 */
    private void m179032k3() {
        boolean z;
        boolean zPrepare;
        if (this.f160459E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f160501Z.prepare();
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
        m179110V2(false);
        this.f160501Z.mo117634g();
        if (NullChecker.m82486a(this.f160556z1) && this.f160556z1.isBeautySticker()) {
            this.f160501Z.mo117619N(new File(this.f160556z1.modelFilePath));
        }
        if (this.f160498X0 > 0) {
            l51.m152888H(getAct(), new Runnable() { // from class: l.cz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84413a.m179142h2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private void m179035m1() {
        if (this.f160492U0 == null) {
            AccountFilterMenuView accountFilterMenuView = (AccountFilterMenuView) this.f160479O.inflate();
            this.f160492U0 = accountFilterMenuView;
            accountFilterMenuView.setFilterData(this.f160460E1);
            this.f160492U0.m29976q(this.f160498X0);
            int size = this.f160460E1.size();
            int i = this.f160498X0;
            int iM179113X0 = (i < 0 || i >= size) ? 50 : (int) (m179113X0(this.f160460E1.get(i).mFilterId) * 100.0f);
            this.f160492U0.f17510c.setText(String.valueOf(iM179113X0));
            this.f160492U0.f17510c.setProgress(iM179113X0);
            this.f160492U0.setMenuDismissListener(new x20() { // from class: l.mz
                @Override // p153l.x20
                public final void call() {
                    this.f139449a.m179071H1();
                }
            });
            this.f160492U0.setOnItemClickCallback(new y20() { // from class: l.nz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144401a.m179073I1((Integer) obj);
                }
            });
            this.f160492U0.setIntensityChangedCallback(new y20() { // from class: l.oz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149835a.m179075J1((Float) obj);
                }
            });
            this.f160492U0.setIntensityChooseCallback(new z20() { // from class: l.pz
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f154701a.m179077K1((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f160492U0.setCompareClickCallback(new y20() { // from class: l.qz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160211a.m179080L1((Boolean) obj);
                }
            });
            this.f160492U0.setOnResetCallback(new x20() { // from class: l.rz
                @Override // p153l.x20
                public final void call() {
                    this.f165478a.m179083M1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m179040q1() {
        this.f160511e.setOnVerticalFlingListener(new C19709b());
        this.f160511e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C19710c());
        this.f160511e.setBeforeCheckEnableTouchListener(new AccountFilterScrollMoreViewPager.InterfaceC4805b() { // from class: l.iz
            @Override // com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4805b
            /* JADX INFO: renamed from: a */
            public final boolean mo29872a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m179055A2(this.f160535p0);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m179054A1(int i) {
        this.f160543t.setText(String.valueOf(i));
        this.f160543t.setAlpha(0.0f);
        bnl0.m105524M(this.f160543t, true);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m179055A2(int i) {
        this.f160501Z.setState(this.f160535p0);
        int i2 = this.f160535p0;
        if (i2 == 0) {
            m179137f3(i);
        } else if (i2 == 1) {
            m179143h3(i);
        }
        if (this.f160455C1) {
            bnl0.m105524M(this.f160469J, false);
            bnl0.m105525M0(this.f160454C, false);
        }
        m179159o2(i);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m179056B1() {
        bnl0.m105524M(this.f160543t, false);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m179057B2() {
        if (this.f160460E1.size() <= 1 || !SignUpAiAct.f17074c.m154178E()) {
            return;
        }
        this.f160499Y.m198575x0(true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160495W;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m179058C1() {
        bnl0.m105524M(this.f160473L, false);
        bnl0.m105524M(this.f160513f, false);
        this.f160540r1 = true;
        if (NullChecker.m82486a(this.f160518h1)) {
            this.f160518h1.cancel();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m179059C2(List<CameraCategory> list) {
        if (NullChecker.m82486a(this.f160494V0)) {
            this.f160494V0.setCameraCategoryData(list);
        }
        m179057B2();
    }

    /* JADX INFO: renamed from: D0 */
    public View m179060D0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s00.m183867b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m179061D2(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM132170p = gt0.m132170p(view, "translationY", 0L, 500L, z ? gt0.f106347b : gt0.f106346a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        gt0.m132156b(view, animatorM132170p);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.lz
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, z);
            }
        });
        animatorM132170p.start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C20695uy c20695uy) {
        this.f160499Y = c20695uy;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m179063E1() {
        if (this.f160543t.getTag() == null) {
            m179157n3();
        }
        this.f160543t.setTag(null);
        bnl0.m105524M(this.f160473L, true);
        this.f160540r1 = false;
    }

    /* JADX INFO: renamed from: E2 */
    public final void m179064E2(final boolean z) {
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f160456D, "alpha", 100L, 150L, new LinearInterpolator(), z ? 0.0f : 1.0f, z ? 1.0f : 0.0f), gt0.m132170p(this.f160458E, "translationY", 0L, 300L, gt0.f106347b, z ? 0 : qa00.m175859d(60.0f), z ? qa00.m175859d(60.0f) : 0));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.yz
            @Override // java.lang.Runnable
            public final void run() {
                this.f202163a.m179114X1(z);
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.zz
            @Override // java.lang.Runnable
            public final void run() {
                this.f206656a.m179117Y1(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m179065F1() {
        this.f160543t.setTag(Boolean.TRUE);
        m179137f3(0);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m179066F2(final boolean z) {
        int i = !z ? 1 : 0;
        AccountCameraMenuView accountCameraMenuView = this.f160465H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(accountCameraMenuView, "alpha", 0L, 300L, linearInterpolator, f, f2), gt0.m132170p(this.f160467I, "alpha", 0L, 300L, new LinearInterpolator(), f, f2));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.dz
            @Override // java.lang.Runnable
            public final void run() {
                this.f91316a.m179119Z1();
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.ez
            @Override // java.lang.Runnable
            public final void run() {
                this.f96547a.m179122a2(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m179067G0() {
        if (this.f160504a1 == 1) {
            return;
        }
        if ((this.f160510d1 == 0.0f || this.f160512e1 == 0.0f || this.f160514f1 == 0.0f) && this.f160454C.getMeasuredHeight() != 0) {
            if (NullChecker.m82487b(this.f160454C)) {
                this.f160510d1 = ((int) this.f160454C.getY()) + this.f160454C.getBottom() + qa00.m175859d(34.0f) + m179102T0();
            }
            float fM105592y0 = this.f160510d1 + bnl0.m105592y0();
            this.f160512e1 = fM105592y0;
            if (fM105592y0 > this.f160475M.getY() - qa00.m175859d(10.0f)) {
                this.f160512e1 = this.f160475M.getY() - qa00.m175859d(10.0f);
            }
            float fM105592y1 = (bnl0.m105592y0() * 4) / 3;
            this.f160514f1 = fM105592y1;
            if (fM105592y1 <= this.f160475M.getY() || !(this.f160475M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160475M.getLayoutParams();
            layoutParams.bottomMargin = qa00.m175859d(44.0f);
            this.f160475M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m179068G1(View view) {
        int i = this.f160459E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f160547v) {
            i4g0.m138520r("e_signup_camera_back", "p_signup_camera");
            m179090P0();
            return;
        }
        if (view == this.f160463G) {
            m179123a3();
            return;
        }
        if (view == this.f160467I) {
            m179169r3();
            return;
        }
        if (view == this.f160456D) {
            m179177u3();
            return;
        }
        if (view == this.f160461F) {
            if (this.f160492U0 == null) {
                m179035m1();
            }
            m179127c3();
            return;
        }
        if (view == this.f160454C) {
            this.f160501Z.mo117633f();
            return;
        }
        if (view == this.f160465H) {
            m179185x3();
            return;
        }
        View view2 = this.f160482P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m179095Q2(((Integer) this.f160482P0.getTag()).intValue());
            }
        } else if (view == this.f160469J) {
            int i2 = this.f160504a1 + 1;
            this.f160504a1 = i2;
            if (i2 > 3) {
                this.f160504a1 = 1;
            }
            m179181v3(this.f160504a1);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m179069G2(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f160549w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(linearLayout, property, 0L, 200L, linearInterpolator, f, f2), gt0.m132166l(this.f160545u, property, 0L, 200L, new LinearInterpolator(), f, f2), gt0.m132170p(this.f160545u, "translationY", 0L, 200L, new LinearInterpolator(), i2, i3), gt0.m132166l(this.f160473L, property, 0L, 200L, new LinearInterpolator(), f, f2), gt0.m132166l(this.f160475M, property, 0L, 200L, new LinearInterpolator(), f2, f), gt0.m132166l(this.f160469J, property, 0L, 200L, new LinearInterpolator(), f2, f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.sz
            @Override // java.lang.Runnable
            public final void run() {
                this.f171345a.m179124b2();
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.tz
            @Override // java.lang.Runnable
            public final void run() {
                this.f176731a.m179126c2(z);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: H0 */
    public final Rect m179070H0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f160501Z.mo117632e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM179085N0 = m179085N0(i - i3, -1000, 1000);
        int iM179085N1 = m179085N0(iM179085N0 + iIntValue, -1000, 1000);
        int iM179085N2 = m179085N0(i2 - i3, -1000, 1000);
        return new Rect(iM179085N0, iM179085N2, iM179085N1, m179085N0(iIntValue + iM179085N2, -1000, 1000));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m179071H1() {
        m179061D2(this.f160492U0, false);
        m179104T2(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m179072I0() {
        this.f160538q1 = true;
        this.f160473L.setState(2);
        this.f160545u.m30147t();
        this.f160501Z.mo117637j();
        mo126510k(false);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m179073I1(Integer num) {
        m179098R2(num.intValue(), this.f160498X0 - num.intValue() > 0);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m179074J0() {
        if (this.f160545u.getRecordDuration() >= m179116Y0()) {
            m179190z2();
        } else {
            if (m179076K0() <= 0) {
                return;
            }
            if (this.f160464G0 > 0) {
                this.f160484Q0.start();
            } else {
                m179157n3();
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m179075J1(Float f) {
        this.f160501Z.setIntensity(f.floatValue());
    }

    /* JADX INFO: renamed from: K0 */
    public final long m179076K0() {
        long jM179116Y0 = m179116Y0() - m179128d1();
        if (jM179116Y0 > 0) {
            return jM179116Y0;
        }
        o1j0.m165636j("已经录制完成");
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m179077K1(MMPresetFilter mMPresetFilter, Integer num) {
        m179092P2(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: K2 */
    public final void m179078K2() {
        this.f160529m1.add(m179087O0());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m179079L0() {
        if (PermissionHelper.m81064b(wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m179099S0();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m179080L1(Boolean bool) {
        this.f160501Z.mo117608C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m179081L2(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m179082M0() {
        if (this.f160497X.isResumed()) {
            this.f160499Y.m198574u0();
            if (this.f160459E0 != 5) {
                this.f160459E0 = 2;
            }
            Act act = getAct();
            if (NullChecker.m82487b(act) && !act.isFinishing()) {
                m179032k3();
            }
            AccountMakeUpMenuView accountMakeUpMenuView = this.f160496W0;
            if (accountMakeUpMenuView != null) {
                accountMakeUpMenuView.m30007B(this.f160501Z);
                this.f160496W0.m30023S();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m179084M2() {
        int i = 0;
        while (i < this.f160489T.getChildCount()) {
            m179081L2((VText) this.f160489T.getChildAt(i), this.f160535p0 == i);
            i++;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final int m179085N0(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m179086N2() {
        if (this.f160529m1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f160529m1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: O0 */
    public final MediaMeta m179087O0() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m179167r1() ? "front" : "back";
        mediaMeta.sticker = (this.f160494V0 == null || (cameraSticker = this.f160556z1) == null || TextUtils.equals(cameraSticker.f17063id, "empty")) ? null : this.f160556z1.f17063id;
        if (this.f160498X0 >= 0) {
            int size = this.f160460E1.size();
            int i = this.f160498X0;
            if (size > i) {
                str = this.f160460E1.get(i).mFilterId;
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
    public final /* synthetic */ void m179088O1(long j) {
        String str;
        if (this.f160459E0 != 4) {
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
        if (!this.f160555z.isShown()) {
            bnl0.m105524M(this.f160555z, true);
        }
        this.f160450A.setText(str2 + ":" + str);
        if (j >= m179116Y0()) {
            m179190z2();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public final void m179083M1() {
        m179101S2(0, true, false);
        Iterator<vxd0> it = this.f160468I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m179090P0() {
        InterfaceC16801ep interfaceC16801ep;
        if (this.f160545u == null || this.f160473L == null || (interfaceC16801ep = this.f160501Z) == null) {
            m179099S0();
            return;
        }
        if (interfaceC16801ep.mo117635h()) {
            this.f160473L.setState(5);
        }
        x20 x20Var = new x20() { // from class: l.n00
            @Override // p153l.x20
            public final void call() {
                this.f139579a.m179173t1();
            }
        };
        if (this.f160545u.getCount() == 0) {
            m179125b3("确认退出相机？", new x20() { // from class: l.o00
                @Override // p153l.x20
                public final void call() {
                    this.f144487a.m179175u1();
                }
            });
        } else {
            m179125b3("确认放弃拍的视频？", x20Var);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m179091P1() {
        this.f160545u.m30145r();
        m179086N2();
        this.f160501Z.removeLast();
        if (this.f160545u.getCount() <= 0) {
            this.f160501Z.mo117609D(false);
            this.f160473L.setState(2);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m179092P2(String str, int i) {
        vxd0 vxd0Var = this.f160468I0.get("account_current_filter_intensity" + str);
        if (vxd0Var == null) {
            vxd0Var = new vxd0("account_current_filter_intensity" + AccountModule.m29130F().userId() + str, 50);
            this.f160468I0.put("account_current_filter_intensity" + str, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final void m179106U1(File file) {
        if (getAct().isFinishing()) {
            return;
        }
        Intent intent = new Intent();
        MediaMeta mediaMetaM179087O0 = m179087O0();
        mediaMetaM179087O0.proportion = m179121a1();
        ArrayList arrayList = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = oki.m168011B(file.getPath());
        pictureNew_.mediaType = "image/*";
        pictureNew_.uploadStartTime = pzi0.m174454o();
        pictureNew_.status = MediaLocalStatus.get("raw");
        pictureNew_.meta = mediaMetaM179087O0;
        mediaMetaM179087O0.type = ReminderAction.photo;
        mediaMetaM179087O0.source = "shoot";
        arrayList.add(pictureNew_);
        intent.putExtra("camera_images_path", arrayList);
        getAct().setResult(-1, intent);
        m179099S0();
        AccountModule.m29130F().openLoginUiOptCropAct(getAct(), oki.m168038z(file.getPath()), true);
        AccountModule.f16754a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m179094Q1(int i, int i2) {
        if (i == -302) {
            m179072I0();
            o1j0.m165636j("录制失败，请为探探开启摄像相机和录音权限");
        } else {
            if (i2 == 100) {
                return;
            }
            m179072I0();
            o1j0.m165636j("录制失败，请重试");
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m179095Q2(int i) {
        int i2 = this.f160535p0;
        this.f160535p0 = i;
        m179055A2(i2);
        m179084M2();
        m179188y3(true);
    }

    /* JADX INFO: renamed from: R0 */
    public final File m179096R0(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileM120381O = ecj.m120381O("jpg");
                fileOutputStream = new FileOutputStream(fileM120381O);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        String strInsertImage = MediaStore.Images.Media.insertImage(getAct().getContentResolver(), fileM120381O.getAbsolutePath(), fileM120381O.getName(), fileM120381O.getName());
                        if (!TextUtils.isEmpty(strInsertImage)) {
                            try {
                                String[] strArr = {"_id", "_data", "date_added", "_display_name", "mime_type"};
                                Cursor cursorM123603b = f26.m123603b(getAct().getContentResolver(), Uri.parse(strInsertImage), strArr, null, null, "date_modified DESC", new fg4());
                                if (NullChecker.m82486a(cursorM123603b) && cursorM123603b.moveToFirst()) {
                                    fileM120381O = new File(cursorM123603b.getString(cursorM123603b.getColumnIndexOrThrow(strArr[1])));
                                }
                                if (NullChecker.m82486a(cursorM123603b)) {
                                    cursorM123603b.close();
                                }
                            } catch (Exception e) {
                                CrashHelper.m82479c(e);
                                e.getMessage();
                            }
                        }
                        bitmap.recycle();
                        if (NullChecker.m82486a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                CrashHelper.m82479c(e2);
                            }
                        }
                        return fileM120381O;
                    } catch (IOException e3) {
                        e = e3;
                        CrashHelper.m82479c(e);
                        bitmap.recycle();
                        if (NullChecker.m82486a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                CrashHelper.m82479c(e4);
                            }
                        }
                        return null;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.m82479c(e);
                    bitmap.recycle();
                    if (NullChecker.m82486a(fileOutputStream)) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            CrashHelper.m82479c(e6);
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
                if (!NullChecker.m82486a(null)) {
                    throw th2;
                }
                try {
                    fileOutputStream2.close();
                    throw th2;
                } catch (IOException e9) {
                    CrashHelper.m82479c(e9);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m179097R1(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m179113X0(mMPresetFilter.mFilterId);
    }

    /* JADX INFO: renamed from: R2 */
    public final void m179098R2(int i, boolean z) {
        m179101S2(i, z, true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m179099S0() {
        Act act = getAct();
        if (!NullChecker.m82487b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m179100S1() {
        if (NullChecker.m82486a(this.f160492U0)) {
            this.f160492U0.setFilterData(this.f160460E1);
        }
        final String str = this.f160453B1.get();
        int iM147476G = jyb.m147476G(this.f160460E1, new qcj() { // from class: l.k00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iM147476G > 0) {
            this.f160498X0 = iM147476G;
        }
        m179098R2(this.f160498X0, false);
        m179057B2();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m179101S2(int i, boolean z, boolean z2) {
        if (this.f160460E1.size() <= i || i < 0) {
            return;
        }
        this.f160453B1.put(this.f160460E1.get(i).mFilterId);
        boolean z3 = this.f160498X0 != i && z2;
        this.f160498X0 = i;
        float fM179113X0 = m179113X0(this.f160460E1.get(i).mFilterId);
        this.f160506b1 = fM179113X0;
        this.f160501Z.mo117624S(0, this.f160498X0, true, 0.0f, fM179113X0, -1.0f);
        this.f160501Z.setIntensity(this.f160506b1);
        if (NullChecker.m82486a(this.f160492U0)) {
            int i2 = (int) (this.f160506b1 * 100.0f);
            this.f160492U0.f17510c.setText(String.valueOf(i2));
            this.f160492U0.f17510c.setProgress(i2);
        }
        if (z3) {
            m179130d3(z);
        }
        if (i == 0) {
            C20695uy.f181524c = false;
        } else {
            C20695uy.f181524c = true;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m179102T0() {
        if (l51.m152918x() || l51.m152917w()) {
            return bnl0.m105511F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m179103T1(List list) {
        this.f160460E1 = list;
        if (list == null) {
            this.f160460E1 = new ArrayList();
        }
        jyb.m147537z(this.f160460E1, new y20() { // from class: l.g00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101572a.m179097R1((MMPresetFilter) obj);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.h00
            @Override // java.lang.Runnable
            public final void run() {
                this.f107263a.m179100S1();
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final void m179104T2(boolean z) {
        int i = this.f160535p0;
        boolean z2 = false;
        if (i == 0) {
            bnl0.m105524M(this.f160473L, z);
            bnl0.m105524M(this.f160526l, z && this.f160527l1);
            bnl0.m105524M(this.f160471K, this.f160466H0.get().booleanValue() && !this.f160527l1 && z);
        } else if (i == 1) {
            bnl0.m105524M(this.f160475M, z);
        }
        bnl0.m105524M(this.f160549w, this.f160535p0 == 0 && !this.f160472K0 && z && this.f160545u.getCount() == 0);
        LinearLayout linearLayout = this.f160489T;
        if (!this.f160476M0 && !this.f160472K0 && z && this.f160545u.getCount() == 0) {
            z2 = true;
        }
        bnl0.m105524M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m179105U0() {
        gt0.m132159e(this.f160521j);
        if (NullChecker.m82486a(this.f160486R0)) {
            this.f160486R0.cancel();
        }
        this.f160521j.setVisibility(0);
        ImageView imageView = this.f160521j;
        Property<View, Float> property = gt0.f106354i;
        Interpolator interpolator = gt0.f106347b;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(imageView, property, 0L, 300L, interpolator, 1.0f, 0.75f), gt0.m132170p(this.f160521j, "alpha", 0L, 300L, interpolator, 0.0f, 0.8f), gt0.m132170p(this.f160521j, "alpha", 400L, 200L, interpolator, 0.8f, 0.0f));
        this.f160486R0 = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.c00
            @Override // java.lang.Runnable
            public final void run() {
                this.f79190a.m179179v1();
            }
        });
        this.f160486R0.start();
    }

    /* JADX INFO: renamed from: U2 */
    public final void m179107U2() {
        this.f160503a.getHolder().addCallback(new SurfaceHolderCallbackC19708a());
        this.f160547v.setOnClickListener(this);
        this.f160454C.setOnClickListener(this);
        this.f160456D.setOnClickListener(this);
        this.f160463G.setOnClickListener(this);
        this.f160461F.setOnClickListener(this);
        this.f160465H.setOnClickListener(this);
        this.f160469J.setOnClickListener(this);
        this.f160467I.setOnClickListener(this);
        m179151l1();
    }

    /* JADX INFO: renamed from: V0 */
    public final Bundle m179108V0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f160531n1 == null) {
            this.f160531n1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f160459E0 == 0;
        qow qowVarMo117616K = this.f160501Z.mo117616K();
        if (NullChecker.m82486a(qowVarMo117616K)) {
            video.rotate = qowVarMo117616K.m177370v();
        }
        MusicContent musicContentMo117651z = this.f160501Z.mo117651z();
        video.isFrontCamera = this.f160501Z.mo117632e();
        String strMo117623R = this.f160501Z.mo117623R(this.f160498X0);
        if (NullChecker.m82486a(musicContentMo117651z)) {
            video.playingMusic = musicContentMo117651z;
        }
        VideoInfo videoInfo = this.f160531n1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo117623R;
        int i = this.f160459E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f160462F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f160531n1;
        videoInfo2.choseDelayTime = this.f160464G0;
        videoInfo2.maxDuration = m179116Y0();
        VideoInfo videoInfo3 = this.f160531n1;
        videoInfo3.speedIndex = this.f160552x1;
        MusicContent musicContent = this.f160548v1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f160529m1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f160531n1);
        if (this.f160535p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f160545u.m30139l());
        }
        bundle.putString("extra_from", this.f160474L0);
        return bundle;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m179109V1(String str) throws Throwable {
        final File fileM179096R0 = m179096R0(str);
        if (fileM179096R0 == null) {
            o1j0.m165636j("图片处理失败");
        } else {
            l51.m152887G(new Runnable() { // from class: l.d00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84515a.m179106U1(fileM179096R0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m179110V2(boolean z) {
        boolean z2 = this.f160455C1;
        AccountCameraMenuView accountCameraMenuView = this.f160454C;
        boolean z3 = false;
        if (z2) {
            bnl0.m105525M0(accountCameraMenuView, false);
            bnl0.m105524M(this.f160456D, false);
            return;
        }
        bnl0.m105524M(accountCameraMenuView, this.f160501Z.mo117644s());
        if (this.f160501Z.mo117639m() && !m179167r1()) {
            z3 = true;
        }
        if (z3) {
            this.f160501Z.mo117643r(this.f160462F0);
        }
        if (z) {
            m179064E2(z3);
        } else {
            bnl0.m105524M(this.f160456D, z3);
            this.f160458E.setTranslationY(z3 ? qa00.m175859d(72.0f) : 0.0f);
        }
        m179112W2();
    }

    /* JADX INFO: renamed from: W0 */
    public final int m179111W0() {
        return this.f160460E1.size();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m179112W2() {
        int i = this.f160462F0;
        if (i == 0) {
            this.f160456D.setImageResource(f160446I1);
        } else {
            if (i != 1) {
                return;
            }
            this.f160456D.setImageResource(f160445H1);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final float m179113X0(String str) {
        vxd0 vxd0Var = this.f160468I0.get("account_current_filter_intensity" + str);
        if (vxd0Var == null) {
            vxd0Var = new vxd0("account_current_filter_intensity" + AccountModule.m29130F().userId() + str, 50);
            this.f160468I0.put("account_current_filter_intensity" + str, vxd0Var);
        }
        return (vxd0Var.get().intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m179114X1(boolean z) {
        bnl0.m105524M(this.f160456D, true);
        this.f160456D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: X2 */
    public void m179115X2(Media media) {
        this.f160473L.m29949j(media);
        this.f160475M.m29934f(media);
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m179116Y0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m179117Y1(boolean z) {
        bnl0.m105524M(this.f160456D, z);
    }

    /* JADX INFO: renamed from: Z0 */
    public long m179118Z0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m179119Z1() {
        bnl0.m105524M(this.f160465H, true);
        bnl0.m105524M(this.f160467I, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m179120Z2(int i) {
        return (m179153m2() || i == 4 || i == 5 || this.f160545u.getCount() != 0) ? false : true;
    }

    @Override // p153l.InterfaceC17269gp.a
    /* JADX INFO: renamed from: a */
    public void mo131195a(String str) {
        o1j0.m165636j("录制错误，请确保磁盘空间足够，且打开录制音频权限");
        this.f160545u.m30134g();
        mo126510k(false);
    }

    /* JADX INFO: renamed from: a1 */
    public final String m179121a1() {
        int i = this.f160504a1;
        if (i == 1) {
            return bnl0.m105588w0() / bnl0.m105592y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : "1.1";
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m179122a2(boolean z) {
        bnl0.m105524M(this.f160465H, z);
        bnl0.m105524M(this.f160467I, z);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m179123a3() {
        m179061D2(this.f160496W0, true);
        m179104T2(false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (AccountCompactMediaPickerAct) this.f160495W;
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: b */
    public long mo126506b() {
        return this.f160545u.getLastSliceDuration();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m179124b2() {
        bnl0.m105524M(this.f160549w, true);
        bnl0.m105524M(this.f160545u, true);
        bnl0.m105524M(this.f160473L, true);
        bnl0.m105524M(this.f160475M, true);
        bnl0.m105524M(this.f160469J, true);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m179125b3(String str, final x20 x20Var) {
        th0 th0VarM191142a = new th0.C20312a(this.f160497X.act()).m191148g(false).m191151j(str).m191146e(R$string.f16769B2).m191158q(R$string.f16897b).m191144c(new View.OnClickListener() { // from class: l.gz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191156o(new View.OnClickListener() { // from class: l.hz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112182a.m179129d2(view);
            }
        }).m191142a();
        this.f160451A1 = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    @Override // p153l.InterfaceC17269gp.a
    /* JADX INFO: renamed from: c */
    public void mo131196c(String str, boolean z) {
        if (this.f160545u.getRecordDuration() < 3000) {
            o1j0.m165636j("时间太短啦，再拍一段吧！");
            return;
        }
        Video video = new Video(0, str);
        t00.m188698a(video);
        m179003I2();
        if (z && NullChecker.m82486a(this.f160546u1)) {
            this.f160546u1.call(m179108V0(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m179126c2(boolean z) {
        this.f160545u.setTranslationY(0.0f);
        this.f160475M.setAlpha(1.0f);
        this.f160473L.setAlpha(1.0f);
        this.f160545u.setAlpha(1.0f);
        if (z) {
            bnl0.m105524M(this.f160475M, false);
            bnl0.m105524M(this.f160469J, false);
        } else {
            bnl0.m105524M(this.f160549w, false);
            bnl0.m105524M(this.f160545u, false);
            bnl0.m105524M(this.f160473L, false);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m179127c3() {
        if (this.f160460E1.size() <= 1) {
            SignUpAiAct.f17074c.f132032g.m159280q();
            o1j0.m165636j("滤镜资源正在加载中...");
        }
        this.f160492U0.m29975p();
        m179061D2(this.f160492U0, true);
        m179104T2(false);
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo126507d() {
        return this.f160503a.getHolder();
    }

    /* JADX INFO: renamed from: d1 */
    public long m179128d1() {
        return this.f160545u.getRecordDuration();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m179129d2(View view) {
        this.f160451A1.m191137c();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m179130d3(final boolean z) {
        String strMo117621P = this.f160501Z.mo117621P(this.f160498X0);
        if (NullChecker.m82486a(this.f160492U0)) {
            this.f160492U0.m29976q(this.f160498X0);
        }
        if (TextUtils.isEmpty(strMo117621P)) {
            return;
        }
        this.f160519i.setText(strMo117621P);
        l51.m152887G(new Runnable() { // from class: l.b00
            @Override // java.lang.Runnable
            public final void run() {
                this.f74243a.m179132e2(z);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
        AccountCameraEffectMgr.m29697V().m29758r();
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: e */
    public void mo126508e() {
        this.f160545u.m30134g();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m179131e1() {
        if (this.f160496W0 == null) {
            AccountMakeUpMenuView accountMakeUpMenuView = (AccountMakeUpMenuView) this.f160481P.inflate();
            this.f160496W0 = accountMakeUpMenuView;
            accountMakeUpMenuView.setVisibility(8);
            this.f160496W0.m30051y();
            this.f160496W0.m30008D();
            this.f160496W0.setMenuDismissListener(new x20() { // from class: l.bz
                @Override // p153l.x20
                public final void call() {
                    this.f79087a.m179182w1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final void m179132e2(boolean z) {
        gt0.m132159e(this.f160519i);
        if (NullChecker.m82486a(this.f160516g1)) {
            this.f160516g1.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f160519i, "translationX", 0L, 300L, gt0.f106346a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f160519i;
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, gt0.m132170p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), gt0.m132170p(this.f160519i, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f160516g1 = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.i00
            @Override // java.lang.Runnable
            public final void run() {
                this.f112320a.m179136f2();
            }
        });
        gt0.m132160f(this.f160516g1, new Runnable() { // from class: l.j00
            @Override // java.lang.Runnable
            public final void run() {
                this.f117770a.m179139g2();
            }
        });
        this.f160516g1.start();
    }

    @Override // p153l.InterfaceC20833vh
    /* JADX INFO: renamed from: f */
    public void mo179134f(View view) {
        this.f160545u.m30142o();
        m179125b3("确认删除上一段视频？", new x20() { // from class: l.fz
            @Override // p153l.x20
            public final void call() {
                this.f101429a.m179091P1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m179135f1() {
        bnl0.m105525M0(this.f160491U, false);
        bnl0.m105525M0(this.f160493V, false);
        bnl0.m105525M0(this.f160489T, false);
        m179084M2();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m179136f2() {
        this.f160519i.setScaleY(1.6f);
        this.f160519i.setScaleX(1.6f);
        this.f160519i.setVisibility(0);
        this.f160540r1 = true;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m179137f3(int i) {
        this.f160504a1 = 1;
        m179181v3(1);
        bnl0.m105524M(this.f160452B, true);
        bnl0.m105524M(this.f160526l, this.f160527l1);
        bnl0.m105524M(this.f160547v, true);
        bnl0.m105524M(this.f160555z, false);
        bnl0.m105524M(this.f160471K, !this.f160527l1 && this.f160466H0.get().booleanValue());
        if (i == 1) {
            m179069G2(true);
            m179066F2(true);
            return;
        }
        bnl0.m105524M(this.f160475M, false);
        bnl0.m105524M(this.f160469J, false);
        bnl0.m105524M(this.f160465H, true);
        bnl0.m105524M(this.f160467I, true);
        bnl0.m105524M(this.f160473L, true);
        bnl0.m105524M(this.f160545u, true);
        this.f160465H.setAlpha(1.0f);
        this.f160467I.setAlpha(1.0f);
        this.f160473L.setAlpha(1.0f);
        this.f160545u.setAlpha(1.0f);
        this.f160545u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m179138g1() {
        int childCount = this.f160530n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f160530n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.p00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149987a.m179186y1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m179139g2() {
        this.f160540r1 = false;
        this.f160516g1 = null;
    }

    /* JADX INFO: renamed from: g3 */
    public void m179140g3(boolean z) {
        this.f160473L.m29958s(z);
        this.f160475M.m29939k(z);
    }

    @Override // p153l.InterfaceC17026fp
    public int getCount() {
        return this.f160545u.getCount();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m179141h1() {
        this.f160549w.setOnClickListener(new View.OnClickListener() { // from class: l.q00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155002a.m179189z1(view);
            }
        });
        bnl0.m105593z(this.f160553y);
        this.f160473L.setCallback(this);
        this.f160475M.setCallback(this);
        this.f160499Y.m198576y0();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m179142h2() {
        m179098R2(this.f160498X0, false);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m179143h3(int i) {
        bnl0.m105524M(this.f160452B, true);
        if (i == 0) {
            m179069G2(false);
            m179066F2(false);
        } else {
            this.f160475M.setAlpha(1.0f);
            bnl0.m105524M(this.f160475M, true);
            bnl0.m105524M(this.f160469J, true);
            bnl0.m105524M(this.f160465H, false);
            bnl0.m105524M(this.f160467I, false);
            bnl0.m105524M(this.f160473L, false);
            bnl0.m105524M(this.f160545u, false);
        }
        bnl0.m105524M(this.f160526l, false);
        bnl0.m105524M(this.f160547v, true);
        bnl0.m105524M(this.f160555z, false);
        bnl0.m105524M(this.f160471K, false);
    }

    @Override // p153l.InterfaceC20833vh
    /* JADX INFO: renamed from: i */
    public void mo179144i(View view) {
        this.f160542s1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m179145i2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f160501Z.mo117624S(this.f160535p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m179146i3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.m82486a(this.f160518h1)) {
                this.f160518h1.cancel();
            }
            if (NullChecker.m82486a(this.f160520i1)) {
                this.f160520i1.cancel();
            }
        }
        if (NullChecker.m82487b(this.f160531n1) && !m179156n2()) {
            bnl0.m105524M(this.f160452B, !z2);
            bnl0.m105524M(this.f160547v, !z2);
        }
        bnl0.m105524M(this.f160549w, this.f160535p0 == 0 && !this.f160472K0 && m179120Z2(i));
        bnl0.m105524M(this.f160489T, (this.f160476M0 || this.f160472K0 || !m179120Z2(i)) ? false : true);
        if (!z2) {
            bnl0.m105524M(this.f160555z, false);
        }
        bnl0.m105524M(this.f160456D, (z2 || m179167r1()) ? false : true);
        FrameLayout frameLayout = this.f160526l;
        if (!z2 && !m179153m2() && this.f160527l1 && this.f160535p0 == 0) {
            z = true;
        }
        bnl0.m105524M(frameLayout, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM179060D0 = m179060D0(layoutInflater, viewGroup);
        m179135f1();
        m179107U2();
        m179141h1();
        m179147j1();
        m179138g1();
        m179155n1();
        m179131e1();
        if (NullChecker.m82486a(this.f160548v1)) {
            this.f160553y.setText(this.f160548v1.name);
        }
        bnl0.m105524M(this.f160471K, this.f160466H0.get().booleanValue());
        return viewM179060D0;
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: j */
    public int mo126509j() {
        return this.f160462F0;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m179147j1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f160543t;
            Interpolator interpolator = gt0.f106349d;
            Animator animatorM132180z = gt0.m132180z(gt0.m132170p(textView, "scaleX", 500L, 500L, interpolator, 0.3f, 1.2f), gt0.m132170p(this.f160543t, "scaleY", 500L, 500L, interpolator, 0.3f, 1.2f), gt0.m132170p(this.f160543t, "alpha", 500L, 500L, interpolator, 0.3f, 1.2f));
            gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.yy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202069a.m179054A1(i);
                }
            });
            gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.jz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123216a.m179056B1();
                }
            });
            arrayList.add(animatorM132180z);
        }
        Animator animatorM132173s = gt0.m132173s((Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2));
        this.f160484Q0 = animatorM132173s;
        gt0.m132176v(animatorM132173s, new Runnable() { // from class: l.uz
            @Override // java.lang.Runnable
            public final void run() {
                this.f181694a.m179058C1();
            }
        });
        gt0.m132161g(this.f160484Q0, new Runnable() { // from class: l.f00
            @Override // java.lang.Runnable
            public final void run() {
                this.f96641a.m179063E1();
            }
        }, new Runnable() { // from class: l.l00
            @Override // java.lang.Runnable
            public final void run() {
                this.f129483a.m179065F1();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final void m179148j3(int i) {
        gt0.m132170p(this.f160528m, "translationX", 0L, 200L, gt0.f106347b, (i - 2) * qa00.m175859d(58.0f)).start();
        ((TextView) this.f160530n.getChildAt(this.f160552x1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f160530n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f160552x1 = i;
        this.f160550w1 = f160447J1[i];
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: k */
    public void mo126510k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f160545u.getRecordDuration() != 0 && i == 2) {
            this.f160545u.m30147t();
            i = 5;
        }
        this.f160473L.setState(i);
        m179003I2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m179149k1(Bundle bundle) {
        if (NullChecker.m82486a(bundle)) {
            this.f160531n1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.m82486a(bundle.getSerializable("extra_music_content"))) {
                this.f160548v1 = (MusicContent) bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.m82486a(this.f160531n1)) {
                int i = this.f160531n1.speedIndex;
                this.f160552x1 = i;
                this.f160550w1 = f160447J1[i];
            }
            this.f160470J0 = bundle.getBoolean("extra_has_video", true);
            this.f160472K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f160474L0 = string;
            this.f160455C1 = TextUtils.equals(string, "from_sign_up");
            this.f160476M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.m82486a(bundle.getSerializable("extra_selected_images"))) {
                this.f160478N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f160480O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f160531n1 == null) {
            this.f160531n1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f160531n1;
        MusicContent musicContent = this.f160548v1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m179150k2() {
        this.f160507c.setVisibility(8);
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: l */
    public void mo126511l() {
        m179001H2("视频处理中...", true);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m179151l1() {
        this.f160544t1 = dmk0.m116962a(1000, new y20() { // from class: l.zy
            @Override // p153l.y20
            public final void call(Object obj) {
                r00.m179027g0((View) obj);
            }
        });
        this.f160542s1 = dmk0.m116962a(500, new y20() { // from class: l.az
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74065a.m179068G1((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m179152l2() {
        this.f160505b.setVisibility(8);
    }

    @Override // p153l.InterfaceC16595dp
    /* JADX INFO: renamed from: m */
    public void mo117368m() {
        m179110V2(true);
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m179153m2() {
        AccountMaskMenuView accountMaskMenuView = this.f160494V0;
        if (accountMaskMenuView != null && bnl0.m105529O0(accountMaskMenuView)) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f160492U0;
        if (accountFilterMenuView != null && bnl0.m105529O0(accountFilterMenuView)) {
            return true;
        }
        AccountMakeUpMenuView accountMakeUpMenuView = this.f160496W0;
        return accountMakeUpMenuView != null && bnl0.m105529O0(accountMakeUpMenuView);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m179154m3() {
        this.f160466H0.put(Boolean.FALSE);
        if (this.f160471K.getVisibility() == 0) {
            bnl0.m105524M(this.f160471K, this.f160466H0.get().booleanValue());
        }
        if (this.f160501Z.mo117635h()) {
            return;
        }
        m179074J0();
    }

    @Override // p153l.InterfaceC19171oo
    /* JADX INFO: renamed from: n */
    public void mo168426n(float f, int i) {
        if (i == 1) {
            this.f160501Z.mo117617L(new float[]{f, f});
            C20695uy.f181525d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f160500Y0 = f;
            float[] fArr = f160449L1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f160502Z0 * 0.6f;
            if (!this.f160501Z.mo117613H() && this.f160501Z.mo117622Q()) {
                this.f160501Z.mo117648w(fArr);
            }
            C20695uy.f181526e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f160502Z0 = f;
        float[] fArr2 = f160449L1;
        fArr2[0] = this.f160500Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f160501Z.mo117613H() && this.f160501Z.mo117622Q()) {
            this.f160501Z.mo117648w(fArr2);
        }
        C20695uy.f181527f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m179155n1() {
        this.f160545u.setListener(new AccountVideoRecordProgressView.InterfaceC4820d() { // from class: l.m00
            @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountVideoRecordProgressView.InterfaceC4820d
            public final void onProgress(long j) {
                this.f134288a.m179088O1(j);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m179156n2() {
        return !C17578hu.m137105b();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m179157n3() {
        if (this.f160535p0 != 0) {
            this.f160473L.setState(2);
            return;
        }
        this.f160501Z.mo117650y(this.f160550w1);
        this.f160501Z.mo117636i();
        m179166q3();
        if (this.f160538q1) {
            m179164p3(true);
            this.f160538q1 = false;
        } else {
            this.f160545u.setMaxDuration(m179116Y0());
            this.f160545u.m30146s(this.f160550w1);
            m179078K2();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m179158o1() {
        SurfaceHolderCallbackC16606dr surfaceHolderCallbackC16606dr = new SurfaceHolderCallbackC16606dr();
        this.f160501Z = surfaceHolderCallbackC16606dr;
        surfaceHolderCallbackC16606dr.mo117625T(getAct(), this);
        if (NullChecker.m82486a(this.f160548v1)) {
            this.f160501Z.mo117649x(this.f160548v1);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m179159o2(int i) {
        if (i == this.f160535p0) {
            return;
        }
        int iM175859d = qa00.m175859d(64.0f);
        int i2 = (qa00.m175858c().widthPixels / 2) - iM175859d;
        int i3 = this.f160535p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f160489T;
        gt0.m132170p(linearLayout, "translationX", 0L, 100L, gt0.f106348c, linearLayout.getTranslationX(), i2 + ((i3 * iM175859d) / 2)).start();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m179160o3() {
        if (!NullChecker.m82487b(this.f160524k0) || this.f160524k0.m202986d()) {
            return;
        }
        this.f160524k0.m202989h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f160542s1.call(view);
    }

    @Override // p153l.InterfaceC17269gp.a
    public void onError(final int i, final int i2) {
        l51.m152893M(new Runnable() { // from class: l.kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f129376a.m179094Q1(i, i2);
            }
        });
    }

    @Override // p153l.InterfaceC17026fp
    public void onFirstFrameRendered() {
        this.f160473L.m29948i();
    }

    @Override // p153l.InterfaceC20833vh
    public void onStateChanged(int i) {
        this.f160459E0 = i;
        if (this.f160497X.isResumed() || this.f160497X.lifecycle_() == C4470c.f16268j) {
            m179146i3(i);
        }
        if (i == 3) {
            if (this.f160535p0 != 1) {
                this.f160473L.setState(2);
                return;
            } else {
                m179184w3();
                return;
            }
        }
        if (i == 4) {
            if (this.f160535p0 != 0) {
                this.f160473L.setState(2);
                return;
            } else {
                m179154m3();
                return;
            }
        }
        if (i != 5) {
            return;
        }
        this.f160484Q0.cancel();
        if (this.f160501Z.mo117635h()) {
            m179164p3(true);
        }
        long recordDuration = this.f160545u.getRecordDuration();
        long jM179118Z0 = m179118Z0();
        AccountCameraVideoControlView accountCameraVideoControlView = this.f160473L;
        if (recordDuration < jM179118Z0) {
            accountCameraVideoControlView.f17504h.setImageResource(bbc0.f75878g1);
        } else {
            accountCameraVideoControlView.f17504h.setImageResource(bbc0.f75875f1);
        }
    }

    @Override // p153l.InterfaceC20833vh
    /* JADX INFO: renamed from: p */
    public boolean mo179161p() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f160496W0;
        if (accountMakeUpMenuView != null && accountMakeUpMenuView.getVisibility() == 0) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f160492U0;
        if (accountFilterMenuView != null && accountFilterMenuView.getVisibility() == 0) {
            return true;
        }
        AccountMaskMenuView accountMaskMenuView = this.f160494V0;
        return (accountMaskMenuView != null && accountMaskMenuView.getVisibility() == 0) || !this.f160497X.lifecycle_().f16274a;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m179162p1() {
        this.f160524k0 = C20939vv.m202984c(getAct().getApplicationContext());
        C20158sv c20158sv = new C20158sv();
        if (NullChecker.m82487b(this.f160501Z)) {
            c20158sv.m188106q(this.f160501Z.mo117616K());
        }
        this.f160524k0.m202988g(c20158sv);
        this.f160524k0.m202989h();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m179163p2(float f, float f2) {
        ImageView imageView = this.f160521j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f160521j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m179105U0();
        this.f160501Z.mo117615J(m179070H0(this.f160503a.getWidth(), this.f160503a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m179164p3(boolean z) {
        this.f160545u.m30147t();
        boolean zMo117614I = this.f160501Z.mo117614I(z);
        m179160o3();
        return zMo117614I;
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: q */
    public void mo126512q(final String str, Exception exc) {
        i4g0.m138520r("e_signup_camera_take", "p_signup_camera");
        this.f160475M.setEnabled(true);
        if (NullChecker.m82486a(this.f160492U0)) {
            gt0.m132159e(this.f160492U0);
            this.f160492U0.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f160496W0)) {
            gt0.m132159e(this.f160496W0);
            this.f160496W0.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f160494V0)) {
            gt0.m132159e(this.f160494V0);
            this.f160494V0.setVisibility(8);
        }
        m179104T2(true);
        if (exc != null) {
            o1j0.m165636j("拍照失败");
        } else if (C17578hu.m137105b() && NullChecker.m82486a(getAct())) {
            l51.m152919y(new Runnable() { // from class: l.xz
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f196805a.m179109V1(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m179165q2() {
        this.f160501Z.mo117640n(new y20() { // from class: l.a00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67673a.m179103T1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m179166q3() {
        if (NullChecker.m82487b(this.f160524k0) && this.f160524k0.m202986d()) {
            this.f160524k0.m202990i();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m179167r1() {
        return this.f160501Z.mo117632e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m179168r2() {
        m179079L0();
        if (NullChecker.m82486a(this.f160548v1) || TextUtils.equals("immersion", this.f160474L0)) {
            this.f160535p0 = 0;
        } else if (!this.f160470J0) {
            this.f160535p0 = 1;
        }
        bnl0.m105524M(this.f160549w, this.f160535p0 == 0);
        m179159o2(-1);
        m179158o1();
        m179162p1();
        m179040q1();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m179169r3() {
        int i = this.f160464G0;
        if (i == 0) {
            this.f160464G0 = 3;
            this.f160467I.setImageResource(f160444G1);
        } else {
            if (i != 3) {
                return;
            }
            this.f160464G0 = 0;
            this.f160467I.setImageResource(f160443F1);
        }
    }

    @Override // p153l.InterfaceC17026fp
    public void removeLast() {
        this.f160545u.m30147t();
        this.f160545u.m30145r();
        if (this.f160545u.getCount() <= 0) {
            this.f160501Z.mo117609D(false);
            this.f160473L.setState(2);
        }
    }

    @Override // p153l.InterfaceC16595dp
    /* JADX INFO: renamed from: s */
    public void mo117369s(float f, int i) {
        if (NullChecker.m82486a(this.f160496W0)) {
            this.f160496W0.m30023S();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m179170s1() {
        ValueAnimator valueAnimator = this.f160490T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: s2 */
    public void m179171s2() {
        if (C19146oj.m167806b()) {
            C20939vv.m202985e();
            this.f160501Z.release();
            this.f160545u.m30144q();
            C20870vo.m202032u();
            C20870vo.m202031j().m202043r();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m179172s3(boolean z, float f) {
        List<MMPresetFilter> list = this.f160460E1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f160498X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f160506b1 = m179113X0(list.get(this.f160498X0).mFilterId);
        float fM179113X0 = m179113X0(list.get(size).mFilterId);
        this.f160508c1 = fM179113X0;
        int i2 = this.f160498X0;
        float f2 = z ? -f : 1.0f - f;
        this.f160488S0 = f2;
        this.f160501Z.mo117624S(0, i2, z, f2, this.f160506b1, fM179113X0);
        this.f160506b1 = this.f160508c1;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m179173t1() {
        m179164p3(true);
        this.f160501Z.mo117611F();
        this.f160545u.m30147t();
        this.f160545u.m30134g();
        this.f160529m1.clear();
        this.f160501Z.mo117609D(false);
        this.f160473L.setState(2);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m179174t3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM179111W0 = m179111W0();
        int i = this.f160498X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM179111W0 - 1;
        } else if (i2 >= iM179111W0) {
            iM179111W0 = i;
            i2 = 0;
        } else {
            iM179111W0 = i;
        }
        if (!z2) {
            m179098R2(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m82486a(this.f160490T0) && this.f160490T0.isRunning()) {
            this.f160490T0.cancel();
        }
        if (this.f160490T0 == null) {
            this.f160490T0 = new ValueAnimator();
        }
        this.f160490T0.setDuration(j);
        this.f160490T0.setFloatValues(this.f160488S0, i3);
        this.f160490T0.removeAllUpdateListeners();
        this.f160490T0.removeAllListeners();
        this.f160490T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f91399a.m179145i2(iM179111W0, z, valueAnimator);
            }
        });
        this.f160490T0.addListener(new C19711d(i2, z));
        this.f160490T0.start();
    }

    @Override // p153l.InterfaceC17026fp
    /* JADX INFO: renamed from: u */
    public boolean mo126513u() {
        return m179128d1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m179175u1() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f160496W0;
        if (accountMakeUpMenuView != null) {
            accountMakeUpMenuView.m30038i0();
        }
        this.f160501Z.mo117611F();
        this.f160473L.m29956q();
        this.f160501Z.release();
        m179099S0();
    }

    /* JADX INFO: renamed from: u2 */
    public void m179176u2() {
        this.f160459E0 = 1;
        this.f160484Q0.cancel();
        this.f160501Z.onPause();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m179177u3() {
        int i = this.f160462F0 - 1;
        this.f160462F0 = i;
        if (i < 0) {
            this.f160462F0 = 1;
        }
        this.f160501Z.mo117643r(this.f160462F0);
        m179112W2();
    }

    @Override // p153l.InterfaceC20833vh
    /* JADX INFO: renamed from: v */
    public void mo179178v(View view) {
        this.f160544t1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m179179v1() {
        this.f160521j.setVisibility(8);
    }

    /* JADX INFO: renamed from: v2 */
    public void m179180v2() {
        if (this.f160452B.getTranslationX() != 0.0f) {
            this.f160452B.setTranslationX(0.0f);
        }
        m179082M0();
        if (TextUtils.equals(this.f160474L0, SchemeKey.fake2good)) {
            return;
        }
        m179188y3(false);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m179181v3(int i) {
        m179067G0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(180.0f), qa00.m175859d(180.0f));
        this.f160475M.f17491a.setThemeType(1);
        this.f160454C.setThemeType(1);
        if (i == 1) {
            this.f160469J.setImageResource(bbc0.f75819M);
            layoutParams.gravity = 17;
            this.f160513f.setLayoutParams(layoutParams);
            this.f160457D1 = true;
            gt0.m132159e(this.f160507c);
            View view = this.f160507c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = gt0.f106347b;
            Animator animatorM132166l = gt0.m132166l(view, property, 0L, 300L, interpolator, 0.0f, view.getHeight());
            gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.vz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186436a.m179150k2();
                }
            });
            animatorM132166l.start();
            gt0.m132159e(this.f160505b);
            Animator animatorM132166l2 = gt0.m132166l(this.f160505b, property, 0L, 300L, interpolator, 0.0f, -this.f160507c.getHeight());
            gt0.m132160f(animatorM132166l2, new Runnable() { // from class: l.wz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191722a.m179152l2();
                }
            });
            animatorM132166l2.start();
        } else if (i == 2) {
            this.f160469J.setImageResource(bbc0.f75825O);
            this.f160505b.setVisibility(8);
            int i2 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f160514f1;
            this.f160507c.setLayoutParams(layoutParams2);
            this.f160507c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f160514f1 / 2.0f) - (layoutParams.height / 2));
            this.f160513f.setLayoutParams(layoutParams);
            this.f160457D1 = false;
            gt0.m132159e(this.f160507c);
            gt0.m132166l(this.f160507c, View.TRANSLATION_Y, 0L, 300L, gt0.f106347b, this.f160514f1, 0.0f).start();
        } else if (i == 3) {
            this.f160469J.setImageResource(bbc0.f75822N);
            int i3 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (bnl0.m105588w0() - this.f160510d1);
            this.f160505b.setLayoutParams(layoutParams3);
            this.f160505b.setVisibility(0);
            int i4 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f160512e1;
            this.f160507c.setLayoutParams(layoutParams4);
            this.f160507c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f160512e1 + this.f160510d1) / 2.0f) - (layoutParams.height / 2));
            this.f160513f.setLayoutParams(layoutParams);
            this.f160457D1 = false;
            gt0.m132159e(this.f160507c);
            View view2 = this.f160507c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = gt0.f106347b;
            gt0.m132166l(view2, property2, 0L, 300L, interpolator2, this.f160514f1 - this.f160512e1, 0.0f).start();
            gt0.m132159e(this.f160505b);
            gt0.m132166l(this.f160505b, property2, 0L, 300L, interpolator2, -this.f160507c.getHeight(), 0.0f).start();
        }
        m179084M2();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m179182w1() {
        m179061D2(this.f160496W0, false);
        m179104T2(true);
    }

    /* JADX INFO: renamed from: w2 */
    public void m179183w2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.m82486a(this.f160496W0)) {
            this.f160496W0.m30006A(list, list2);
            this.f160496W0.m30023S();
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m179184w3() {
        int i;
        int iM105588w0;
        int i2 = this.f160522j1;
        int i3 = this.f160525k1;
        m179067G0();
        int i4 = this.f160504a1;
        if (i4 == 3) {
            float f = i3;
            iM105588w0 = (int) (f - ((this.f160512e1 / bnl0.m105588w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iM105588w0 = i3 - i;
        } else {
            i = i3;
            iM105588w0 = 0;
        }
        this.f160501Z.mo117610E(0, iM105588w0, i2, i);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m179185x3() {
        boolean z = this.f160527l1;
        this.f160527l1 = !z;
        this.f160465H.setImageResource(!z ? bbc0.f75831Q : bbc0.f75828P);
        bnl0.m105524M(this.f160526l, this.f160527l1);
        bnl0.m105524M(this.f160471K, this.f160466H0.get().booleanValue() && !this.f160527l1);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m179186y1(int i, View view) {
        m179148j3(i);
    }

    /* JADX INFO: renamed from: y2 */
    public void m179187y2(MusicContent musicContent) {
        this.f160548v1 = musicContent;
        VideoInfo videoInfo = this.f160531n1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m82486a(musicContent)) {
            this.f160553y.setText(musicContent.name);
        }
        this.f160501Z.mo117649x(musicContent);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m179189z1(View view) {
        this.f160544t1.call(view);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m179190z2() {
        m179164p3(false);
        mo126510k(false);
        this.f160501Z.mo117620O();
    }

    /* JADX INFO: renamed from: l.r00$a */
    public class SurfaceHolderCallbackC19708a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC19708a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            r00.this.f160522j1 = i2;
            r00.this.f160525k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.r00$b */
    public class C19709b implements AccountFilterScrollMoreViewPager.InterfaceC4806c {

        /* JADX INFO: renamed from: a */
        public boolean f160558a = false;

        public C19709b() {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4806c
        /* JADX INFO: renamed from: a */
        public void mo29873a(float f) {
            if (r00.this.m179156n2() || r00.this.f160501Z.mo117635h() || r00.this.m179170s1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f160558a = z;
            r00.this.m179172s3(z, f);
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4806c
        /* JADX INFO: renamed from: b */
        public void mo29874b(float f) {
            if (r00.this.m179156n2() || r00.this.f160501Z.mo117635h() || r00.this.m179170s1() || r00.this.f160488S0 == 0.0f) {
                return;
            }
            r00.this.m179174t3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4806c
        public void onCancel() {
            if (r00.this.m179156n2() || r00.this.f160501Z.mo117635h() || r00.this.m179170s1() || r00.this.f160488S0 == 0.0f) {
                return;
            }
            r00.this.m179174t3(!this.f160558a, true, true, 200L);
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4806c
        /* JADX INFO: renamed from: c */
        public void mo29875c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m179188y3(boolean z) {
    }
}
