package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.CameraBeautyMode;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.account.data.Video;
import com.p046p1.mobile.putong.account.data.VideoInfo;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountVideoRecordFrag;
import com.p046p1.mobile.putong.account.p050ui.camera.act.AccountCompactMediaPickerAct;
import com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraPhotoControlView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraVideoControlView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountFilterMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMaskMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountVideoRecordProgressView;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.wcdb.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class x00 implements s7m<C15763az>, InterfaceC17593ip, View.OnClickListener, InterfaceC20218to, InterfaceC15629ai {

    /* JADX INFO: renamed from: F1 */
    public static final int f188782F1 = v2c0.f179389E;

    /* JADX INFO: renamed from: G1 */
    public static final int f188783G1 = v2c0.f179386D;

    /* JADX INFO: renamed from: H1 */
    public static final int f188784H1 = v2c0.f179398H;

    /* JADX INFO: renamed from: I1 */
    public static final int f188785I1 = v2c0.f179395G;

    /* JADX INFO: renamed from: J1 */
    public static final float[] f188786J1 = {2.0f, 1.5f, 1.0f, 0.5f, 0.25f};

    /* JADX INFO: renamed from: K1 */
    public static final float[] f188787K1 = {0.5f, 0.66f, 1.0f, 2.0f, 4.0f};

    /* JADX INFO: renamed from: L1 */
    public static final float[] f188788L1 = new float[2];

    /* JADX INFO: renamed from: A */
    public TextView f188789A;

    /* JADX INFO: renamed from: A1 */
    public xh0 f188790A1;

    /* JADX INFO: renamed from: B */
    public LinearLayout f188791B;

    /* JADX INFO: renamed from: C */
    public AccountCameraMenuView f188793C;

    /* JADX INFO: renamed from: D */
    public AccountCameraMenuView f188795D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f188797E;

    /* JADX INFO: renamed from: F */
    public AccountCameraMenuView f188800F;

    /* JADX INFO: renamed from: G */
    public AccountCameraMenuView f188802G;

    /* JADX INFO: renamed from: H */
    public AccountCameraMenuView f188804H;

    /* JADX INFO: renamed from: I */
    public AccountCameraMenuView f188806I;

    /* JADX INFO: renamed from: J */
    public AccountCameraMenuView f188808J;

    /* JADX INFO: renamed from: J0 */
    public boolean f188809J0;

    /* JADX INFO: renamed from: K */
    public TextView f188810K;

    /* JADX INFO: renamed from: K0 */
    public boolean f188811K0;

    /* JADX INFO: renamed from: L */
    public AccountCameraVideoControlView f188812L;

    /* JADX INFO: renamed from: L0 */
    public String f188813L0;

    /* JADX INFO: renamed from: M */
    public AccountCameraPhotoControlView f188814M;

    /* JADX INFO: renamed from: M0 */
    public boolean f188815M0;

    /* JADX INFO: renamed from: N */
    public ViewStub f188816N;

    /* JADX INFO: renamed from: N0 */
    public ArrayList<Media> f188817N0;

    /* JADX INFO: renamed from: O */
    public ViewStub f188818O;

    /* JADX INFO: renamed from: O0 */
    public String f188819O0;

    /* JADX INFO: renamed from: P */
    public ViewStub f188820P;

    /* JADX INFO: renamed from: P0 */
    public View f188821P0;

    /* JADX INFO: renamed from: Q */
    public ViewStub f188822Q;

    /* JADX INFO: renamed from: Q0 */
    public Animator f188823Q0;

    /* JADX INFO: renamed from: R */
    public ViewStub f188824R;

    /* JADX INFO: renamed from: R0 */
    public Animator f188825R0;

    /* JADX INFO: renamed from: S */
    public ViewStub f188826S;

    /* JADX INFO: renamed from: T */
    public LinearLayout f188828T;

    /* JADX INFO: renamed from: T0 */
    public ValueAnimator f188829T0;

    /* JADX INFO: renamed from: U */
    public VText f188830U;

    /* JADX INFO: renamed from: U0 */
    public AccountFilterMenuView f188831U0;

    /* JADX INFO: renamed from: V */
    public VText f188832V;

    /* JADX INFO: renamed from: V0 */
    public AccountMaskMenuView f188833V0;

    /* JADX INFO: renamed from: W */
    public Context f188834W;

    /* JADX INFO: renamed from: W0 */
    public AccountMakeUpMenuView f188835W0;

    /* JADX INFO: renamed from: X */
    public AccountVideoRecordFrag f188836X;

    /* JADX INFO: renamed from: Y */
    public C15763az f188838Y;

    /* JADX INFO: renamed from: Y0 */
    public float f188839Y0;

    /* JADX INFO: renamed from: Z */
    public InterfaceC17833jp f188840Z;

    /* JADX INFO: renamed from: Z0 */
    public float f188841Z0;

    /* JADX INFO: renamed from: a */
    public SurfaceView f188842a;

    /* JADX INFO: renamed from: b */
    public View f188844b;

    /* JADX INFO: renamed from: b1 */
    public float f188845b1;

    /* JADX INFO: renamed from: c */
    public View f188846c;

    /* JADX INFO: renamed from: c1 */
    public float f188847c1;

    /* JADX INFO: renamed from: d */
    public ViewStub f188848d;

    /* JADX INFO: renamed from: d1 */
    public float f188849d1;

    /* JADX INFO: renamed from: e */
    public AccountFilterScrollMoreViewPager f188850e;

    /* JADX INFO: renamed from: e1 */
    public float f188851e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f188852f;

    /* JADX INFO: renamed from: f1 */
    public float f188853f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f188854g;

    /* JADX INFO: renamed from: g1 */
    public Animator f188855g1;

    /* JADX INFO: renamed from: h */
    public TextView f188856h;

    /* JADX INFO: renamed from: h1 */
    public Animator f188857h1;

    /* JADX INFO: renamed from: i */
    public TextView f188858i;

    /* JADX INFO: renamed from: i1 */
    public Animator f188859i1;

    /* JADX INFO: renamed from: j */
    public ImageView f188860j;

    /* JADX INFO: renamed from: j1 */
    public int f188861j1;

    /* JADX INFO: renamed from: k */
    public TextView f188862k;

    /* JADX INFO: renamed from: k0 */
    public C15991bw f188863k0;

    /* JADX INFO: renamed from: k1 */
    public int f188864k1;

    /* JADX INFO: renamed from: l */
    public FrameLayout f188865l;

    /* JADX INFO: renamed from: l1 */
    public boolean f188866l1;

    /* JADX INFO: renamed from: m */
    public View f188867m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f188869n;

    /* JADX INFO: renamed from: n1 */
    public VideoInfo f188870n1;

    /* JADX INFO: renamed from: o */
    public TextView f188871o;

    /* JADX INFO: renamed from: p */
    public TextView f188873p;

    /* JADX INFO: renamed from: q */
    public TextView f188876q;

    /* JADX INFO: renamed from: q1 */
    public boolean f188877q1;

    /* JADX INFO: renamed from: r */
    public TextView f188878r;

    /* JADX INFO: renamed from: r1 */
    public boolean f188879r1;

    /* JADX INFO: renamed from: s */
    public TextView f188880s;

    /* JADX INFO: renamed from: s1 */
    public e30<View> f188881s1;

    /* JADX INFO: renamed from: t */
    public TextView f188882t;

    /* JADX INFO: renamed from: t1 */
    public e30<View> f188883t1;

    /* JADX INFO: renamed from: u */
    public AccountVideoRecordProgressView f188884u;

    /* JADX INFO: renamed from: u1 */
    public e30<Bundle> f188885u1;

    /* JADX INFO: renamed from: v */
    public ImageView f188886v;

    /* JADX INFO: renamed from: v1 */
    public MusicContent f188887v1;

    /* JADX INFO: renamed from: w */
    public LinearLayout f188888w;

    /* JADX INFO: renamed from: x */
    public ImageView f188890x;

    /* JADX INFO: renamed from: y */
    public TextView f188892y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f188894z;

    /* JADX INFO: renamed from: z1 */
    public CameraSticker f188895z1;

    /* JADX INFO: renamed from: p0 */
    public int f188874p0 = 1;

    /* JADX INFO: renamed from: E0 */
    public int f188798E0 = 1;

    /* JADX INFO: renamed from: F0 */
    public int f188801F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f188803G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public hpd0 f188805H0 = new hpd0("account_need_show_tip" + AccountModule.m28131F().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: I0 */
    public HashMap<String, tpd0> f188807I0 = new HashMap<>();

    /* JADX INFO: renamed from: S0 */
    public float f188827S0 = 0.0f;

    /* JADX INFO: renamed from: X0 */
    public int f188837X0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f188843a1 = 1;

    /* JADX INFO: renamed from: m1 */
    public ArrayList<MediaMeta> f188868m1 = new ArrayList<>();

    /* JADX INFO: renamed from: o1 */
    public int f188872o1 = 0;

    /* JADX INFO: renamed from: p1 */
    public boolean f188875p1 = true;

    /* JADX INFO: renamed from: w1 */
    public float f188889w1 = 1.0f;

    /* JADX INFO: renamed from: x1 */
    public int f188891x1 = 2;

    /* JADX INFO: renamed from: y1 */
    public boolean f188893y1 = true;

    /* JADX INFO: renamed from: B1 */
    public uqd0 f188792B1 = new uqd0("account_camera_filter_id" + AccountModule.m28131F().userId(), null);

    /* JADX INFO: renamed from: C1 */
    public boolean f188794C1 = false;

    /* JADX INFO: renamed from: D1 */
    public boolean f188796D1 = true;

    /* JADX INFO: renamed from: E1 */
    public List<MMPresetFilter> f188799E1 = new ArrayList();

    /* JADX INFO: renamed from: l.x00$c */
    public class C21013c extends GestureDetector.SimpleOnGestureListener {
        public C21013c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            x00.this.m206498p2(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* JADX INFO: renamed from: l.x00$d */
    public class C21014d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f188900a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f188901b;

        public C21014d(int i, boolean z) {
            this.f188900a = i;
            this.f188901b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x00.this.m206436R2(this.f188900a, this.f188901b);
            x00.this.f188827S0 = 0.0f;
        }
    }

    public x00(AccountVideoRecordFrag accountVideoRecordFrag) {
        this.f188836X = accountVideoRecordFrag;
        this.f188834W = accountVideoRecordFrag.getActivity();
    }

    /* JADX INFO: renamed from: H2 */
    private void m206339H2(String str, boolean z) {
        this.f188836X.m20597q4(str, z);
    }

    /* JADX INFO: renamed from: I2 */
    private void m206341I2() {
        this.f188836X.m20599s4();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m206365g0(View view) {
    }

    /* JADX INFO: renamed from: k3 */
    private void m206370k3() {
        boolean z;
        boolean zPrepare;
        if (this.f188798E0 < 2) {
            return;
        }
        try {
            zPrepare = this.f188840Z.prepare();
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
        m206448V2(false);
        this.f188840Z.mo142900g();
        if (NullChecker.m81303a(this.f188895z1) && this.f188895z1.isBeautySticker()) {
            this.f188840Z.mo142543N(new File(this.f188895z1.modelFilePath));
        }
        if (this.f188837X0 > 0) {
            e51.m114743H(getAct(), new Runnable() { // from class: l.iz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115523a.m206479h2();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: m1 */
    private void m206373m1() {
        if (this.f188831U0 == null) {
            AccountFilterMenuView accountFilterMenuView = (AccountFilterMenuView) this.f188818O.inflate();
            this.f188831U0 = accountFilterMenuView;
            accountFilterMenuView.setFilterData(this.f188799E1);
            this.f188831U0.m28977q(this.f188837X0);
            int size = this.f188799E1.size();
            int i = this.f188837X0;
            int iM206451X0 = (i < 0 || i >= size) ? 50 : (int) (m206451X0(this.f188799E1.get(i).mFilterId) * 100.0f);
            this.f188831U0.f16791c.setText(String.valueOf(iM206451X0));
            this.f188831U0.f16791c.setProgress(iM206451X0);
            this.f188831U0.setMenuDismissListener(new d30() { // from class: l.sz
                @Override // p149l.d30
                public final void call() {
                    this.f167008a.m206409H1();
                }
            });
            this.f188831U0.setOnItemClickCallback(new e30() { // from class: l.tz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172671a.m206411I1((Integer) obj);
                }
            });
            this.f188831U0.setIntensityChangedCallback(new e30() { // from class: l.uz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178933a.m206413J1((Float) obj);
                }
            });
            this.f188831U0.setIntensityChooseCallback(new f30() { // from class: l.vz
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f183576a.m206415K1((MMPresetFilter) obj, (Integer) obj2);
                }
            });
            this.f188831U0.setCompareClickCallback(new e30() { // from class: l.wz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188698a.m206418L1((Boolean) obj);
                }
            });
            this.f188831U0.setOnResetCallback(new d30() { // from class: l.xz
                @Override // p149l.d30
                public final void call() {
                    this.f195145a.m206421M1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m206378q1() {
        this.f188850e.setOnVerticalFlingListener(new C21012b());
        this.f188850e.setEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(new C21013c());
        this.f188850e.setBeforeCheckEnableTouchListener(new AccountFilterScrollMoreViewPager.InterfaceC4654b() { // from class: l.oz
            @Override // com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4654b
            /* JADX INFO: renamed from: a */
            public final boolean mo28873a(MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        m206393A2(this.f188874p0);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m206392A1(int i) {
        this.f188882t.setText(String.valueOf(i));
        this.f188882t.setAlpha(0.0f);
        xdl0.m208344M(this.f188882t, true);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m206393A2(int i) {
        this.f188840Z.setState(this.f188874p0);
        int i2 = this.f188874p0;
        if (i2 == 0) {
            m206474f3(i);
        } else if (i2 == 1) {
            m206480h3(i);
        }
        if (this.f188794C1) {
            xdl0.m208344M(this.f188808J, false);
            xdl0.m208345M0(this.f188793C, false);
        }
        m206495o2(i);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m206394B1() {
        xdl0.m208344M(this.f188882t, false);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m206395B2() {
        if (this.f188799E1.size() <= 1 || !SignUpAiAct.f16355c.m174485E()) {
            return;
        }
        this.f188838Y.m99609x0(true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188834W;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m206396C1() {
        xdl0.m208344M(this.f188812L, false);
        xdl0.m208344M(this.f188852f, false);
        this.f188879r1 = true;
        if (NullChecker.m81303a(this.f188857h1)) {
            this.f188857h1.cancel();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m206397C2(List<CameraCategory> list) {
        if (NullChecker.m81303a(this.f188833V0)) {
            this.f188833V0.setCameraCategoryData(list);
        }
        m206395B2();
    }

    /* JADX INFO: renamed from: D0 */
    public View m206398D0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y00.m212025b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m206399D2(final View view, final boolean z) {
        view.setVisibility(0);
        Animator animatorM103743p = bt0.m103743p(view, "translationY", 0L, 500L, z ? bt0.f77155b : bt0.f77154a, z ? view.getHeight() : 0, z ? 0 : view.getHeight());
        bt0.m103729b(view, animatorM103743p);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.rz
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, z);
            }
        });
        animatorM103743p.start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C15763az c15763az) {
        this.f188838Y = c15763az;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m206401E1() {
        if (this.f188882t.getTag() == null) {
            m206493n3();
        }
        this.f188882t.setTag(null);
        xdl0.m208344M(this.f188812L, true);
        this.f188879r1 = false;
    }

    /* JADX INFO: renamed from: E2 */
    public final void m206402E2(final boolean z) {
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f188795D, "alpha", 100L, 150L, new LinearInterpolator(), z ? 0.0f : 1.0f, z ? 1.0f : 0.0f), bt0.m103743p(this.f188797E, "translationY", 0L, 300L, bt0.f77155b, z ? 0 : t100.m186890d(60.0f), z ? t100.m186890d(60.0f) : 0));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.e00
            @Override // java.lang.Runnable
            public final void run() {
                this.f88528a.m206452X1(z);
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.f00
            @Override // java.lang.Runnable
            public final void run() {
                this.f93951a.m206455Y1(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m206403F1() {
        this.f188882t.setTag(Boolean.TRUE);
        m206474f3(0);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m206404F2(final boolean z) {
        int i = !z ? 1 : 0;
        AccountCameraMenuView accountCameraMenuView = this.f188804H;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(accountCameraMenuView, "alpha", 0L, 300L, linearInterpolator, f, f2), bt0.m103743p(this.f188806I, "alpha", 0L, 300L, new LinearInterpolator(), f, f2));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.jz
            @Override // java.lang.Runnable
            public final void run() {
                this.f120345a.m206457Z1();
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.kz
            @Override // java.lang.Runnable
            public final void run() {
                this.f125346a.m206460a2(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m206405G0() {
        if (this.f188843a1 == 1) {
            return;
        }
        if ((this.f188849d1 == 0.0f || this.f188851e1 == 0.0f || this.f188853f1 == 0.0f) && this.f188793C.getMeasuredHeight() != 0) {
            if (NullChecker.m81304b(this.f188793C)) {
                this.f188849d1 = ((int) this.f188793C.getY()) + this.f188793C.getBottom() + t100.m186890d(34.0f) + m206440T0();
            }
            float fM208412y0 = this.f188849d1 + xdl0.m208412y0();
            this.f188851e1 = fM208412y0;
            if (fM208412y0 > this.f188814M.getY() - t100.m186890d(10.0f)) {
                this.f188851e1 = this.f188814M.getY() - t100.m186890d(10.0f);
            }
            float fM208412y1 = (xdl0.m208412y0() * 4) / 3;
            this.f188853f1 = fM208412y1;
            if (fM208412y1 <= this.f188814M.getY() || !(this.f188814M.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f188814M.getLayoutParams();
            layoutParams.bottomMargin = t100.m186890d(44.0f);
            this.f188814M.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m206406G1(View view) {
        int i = this.f188798E0;
        if (i == 4 || i == 3) {
            return;
        }
        if (view == this.f188886v) {
            zvf0.m220396r("e_signup_camera_back", "p_signup_camera");
            m206428P0();
            return;
        }
        if (view == this.f188802G) {
            m206461a3();
            return;
        }
        if (view == this.f188806I) {
            m206504r3();
            return;
        }
        if (view == this.f188795D) {
            m206512u3();
            return;
        }
        if (view == this.f188800F) {
            if (this.f188831U0 == null) {
                m206373m1();
            }
            m206465c3();
            return;
        }
        if (view == this.f188793C) {
            this.f188840Z.mo142548f();
            return;
        }
        if (view == this.f188804H) {
            m206519x3();
            return;
        }
        View view2 = this.f188821P0;
        if (view == view2) {
            if (view2.getTag() instanceof Integer) {
                m206433Q2(((Integer) this.f188821P0.getTag()).intValue());
            }
        } else if (view == this.f188808J) {
            int i2 = this.f188843a1 + 1;
            this.f188843a1 = i2;
            if (i2 > 3) {
                this.f188843a1 = 1;
            }
            m206515v3(this.f188843a1);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m206407G2(final boolean z) {
        int i = !z ? 1 : 0;
        int i2 = z ? -20 : 0;
        int i3 = z ? 0 : -20;
        LinearLayout linearLayout = this.f188888w;
        Property property = View.ALPHA;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        float f2 = z ? 1.0f : 0.0f;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(linearLayout, property, 0L, 200L, linearInterpolator, f, f2), bt0.m103739l(this.f188884u, property, 0L, 200L, new LinearInterpolator(), f, f2), bt0.m103743p(this.f188884u, "translationY", 0L, 200L, new LinearInterpolator(), i2, i3), bt0.m103739l(this.f188812L, property, 0L, 200L, new LinearInterpolator(), f, f2), bt0.m103739l(this.f188814M, property, 0L, 200L, new LinearInterpolator(), f2, f), bt0.m103739l(this.f188808J, property, 0L, 200L, new LinearInterpolator(), f2, f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.yz
            @Override // java.lang.Runnable
            public final void run() {
                this.f200838a.m206462b2();
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.zz
            @Override // java.lang.Runnable
            public final void run() {
                this.f205761a.m206464c2(z);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: H0 */
    public final Rect m206408H0(float f, float f2, float f3, float f4, float f5) {
        int iIntValue = Float.valueOf(f5 * 100.0f).intValue();
        int i = (int) (((f4 / f2) * 2000.0f) - 1000.0f);
        int i2 = (int) ((((f - f3) / f) * 2000.0f) - 1000.0f);
        if (this.f188840Z.mo142899e()) {
            i = (int) ((((f2 - f4) / f2) * 2000.0f) - 1000.0f);
        }
        int i3 = iIntValue / 2;
        int iM206423N0 = m206423N0(i - i3, -1000, 1000);
        int iM206423N1 = m206423N0(iM206423N0 + iIntValue, -1000, 1000);
        int iM206423N2 = m206423N0(i2 - i3, -1000, 1000);
        return new Rect(iM206423N0, iM206423N2, iM206423N1, m206423N0(iIntValue + iM206423N2, -1000, 1000));
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m206409H1() {
        m206399D2(this.f188831U0, false);
        m206442T2(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m206410I0() {
        this.f188877q1 = true;
        this.f188812L.setState(2);
        this.f188884u.m29148t();
        this.f188840Z.mo142903j();
        mo146797k(false);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m206411I1(Integer num) {
        m206436R2(num.intValue(), this.f188837X0 - num.intValue() > 0);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m206412J0() {
        if (this.f188884u.getRecordDuration() >= m206454Y0()) {
            m206524z2();
        } else {
            if (m206414K0() <= 0) {
                return;
            }
            if (this.f188803G0 > 0) {
                this.f188823Q0.start();
            } else {
                m206493n3();
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m206413J1(Float f) {
        this.f188840Z.setIntensity(f.floatValue());
    }

    /* JADX INFO: renamed from: K0 */
    public final long m206414K0() {
        long jM206454Y0 = m206454Y0() - m206466d1();
        if (jM206454Y0 > 0) {
            return jM206454Y0;
        }
        lsi0.m151580j("已经录制完成");
        return 0L;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m206415K1(MMPresetFilter mMPresetFilter, Integer num) {
        m206430P2(mMPresetFilter.mFilterId, num.intValue());
    }

    /* JADX INFO: renamed from: K2 */
    public final void m206416K2() {
        this.f188868m1.add(m206425O0());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m206417L0() {
        if (PermissionHelper.m79881b(zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        m206437S0();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m206418L1(Boolean bool) {
        this.f188840Z.mo142539C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m206419L2(VText vText, boolean z) {
        vText.setTextColor(Color.parseColor(z ? "#ffffff" : "#80ffffff"));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m206420M0() {
        if (this.f188836X.isResumed()) {
            this.f188838Y.m99608u0();
            if (this.f188798E0 != 5) {
                this.f188798E0 = 2;
            }
            Act act = getAct();
            if (NullChecker.m81304b(act) && !act.isFinishing()) {
                m206370k3();
            }
            AccountMakeUpMenuView accountMakeUpMenuView = this.f188835W0;
            if (accountMakeUpMenuView != null) {
                accountMakeUpMenuView.m29008B(this.f188840Z);
                this.f188835W0.m29024S();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m206422M2() {
        int i = 0;
        while (i < this.f188828T.getChildCount()) {
            m206419L2((VText) this.f188828T.getChildAt(i), this.f188874p0 == i);
            i++;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final int m206423N0(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m206424N2() {
        if (this.f188868m1.isEmpty()) {
            return;
        }
        ArrayList<MediaMeta> arrayList = this.f188868m1;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: O0 */
    public final MediaMeta m206425O0() {
        String str;
        CameraSticker cameraSticker;
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.camera = m206502r1() ? "front" : "back";
        mediaMeta.sticker = (this.f188833V0 == null || (cameraSticker = this.f188895z1) == null || TextUtils.equals(cameraSticker.f16344id, "empty")) ? null : this.f188895z1.f16344id;
        if (this.f188837X0 >= 0) {
            int size = this.f188799E1.size();
            int i = this.f188837X0;
            if (size > i) {
                str = this.f188799E1.get(i).mFilterId;
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
    public final /* synthetic */ void m206426O1(long j) {
        String str;
        if (this.f188798E0 != 4) {
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
        if (!this.f188894z.isShown()) {
            xdl0.m208344M(this.f188894z, true);
        }
        this.f188789A.setText(str2 + ":" + str);
        if (j >= m206454Y0()) {
            m206524z2();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public final void m206421M1() {
        m206439S2(0, true, false);
        Iterator<tpd0> it = this.f188807I0.values().iterator();
        while (it.hasNext()) {
            it.next().put(50);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m206428P0() {
        InterfaceC17833jp interfaceC17833jp;
        if (this.f188884u == null || this.f188812L == null || (interfaceC17833jp = this.f188840Z) == null) {
            m206437S0();
            return;
        }
        if (interfaceC17833jp.mo142901h()) {
            this.f188812L.setState(5);
        }
        d30 d30Var = new d30() { // from class: l.t00
            @Override // p149l.d30
            public final void call() {
                this.f167089a.m206508t1();
            }
        };
        if (this.f188884u.getCount() == 0) {
            m206463b3("确认退出相机？", new d30() { // from class: l.u00
                @Override // p149l.d30
                public final void call() {
                    this.f172819a.m206510u1();
                }
            });
        } else {
            m206463b3("确认放弃拍的视频？", d30Var);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m206429P1() {
        this.f188884u.m29146r();
        m206424N2();
        this.f188840Z.removeLast();
        if (this.f188884u.getCount() <= 0) {
            this.f188840Z.mo142884D(false);
            this.f188812L.setState(2);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m206430P2(String str, int i) {
        tpd0 tpd0Var = this.f188807I0.get("account_current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("account_current_filter_intensity" + AccountModule.m28131F().userId() + str, 50);
            this.f188807I0.put("account_current_filter_intensity" + str, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final void m206444U1(File file) {
        if (getAct().isFinishing()) {
            return;
        }
        Intent intent = new Intent();
        MediaMeta mediaMetaM206425O0 = m206425O0();
        mediaMetaM206425O0.proportion = m206459a1();
        ArrayList arrayList = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = rhi.m179355B(file.getPath());
        pictureNew_.mediaType = "image/*";
        pictureNew_.uploadStartTime = mqi0.m155944o();
        pictureNew_.status = MediaLocalStatus.get("raw");
        pictureNew_.meta = mediaMetaM206425O0;
        mediaMetaM206425O0.type = ReminderAction.photo;
        mediaMetaM206425O0.source = "shoot";
        arrayList.add(pictureNew_);
        intent.putExtra("camera_images_path", arrayList);
        getAct().setResult(-1, intent);
        m206437S0();
        AccountModule.m28131F().openLoginUiOptCropAct(getAct(), rhi.m179382z(file.getPath()), true);
        AccountModule.f16035a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m206432Q1(int i, int i2) {
        if (i == -302) {
            m206410I0();
            lsi0.m151580j("录制失败，请为探探开启摄像相机和录音权限");
        } else {
            if (i2 == 100) {
                return;
            }
            m206410I0();
            lsi0.m151580j("录制失败，请重试");
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m206433Q2(int i) {
        int i2 = this.f188874p0;
        this.f188874p0 = i;
        m206393A2(i2);
        m206422M2();
        m206522y3(true);
    }

    /* JADX INFO: renamed from: R0 */
    public final File m206434R0(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileM145083O = k9j.m145083O("jpg");
                fileOutputStream = new FileOutputStream(fileM145083O);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        String strInsertImage = MediaStore.Images.Media.insertImage(getAct().getContentResolver(), fileM145083O.getAbsolutePath(), fileM145083O.getName(), fileM145083O.getName());
                        if (!TextUtils.isEmpty(strInsertImage)) {
                            try {
                                String[] strArr = {"_id", "_data", "date_added", "_display_name", "mime_type"};
                                Cursor cursorM94508b = a16.m94508b(getAct().getContentResolver(), Uri.parse(strInsertImage), strArr, null, null, "date_modified DESC", new gf4());
                                if (NullChecker.m81303a(cursorM94508b) && cursorM94508b.moveToFirst()) {
                                    fileM145083O = new File(cursorM94508b.getString(cursorM94508b.getColumnIndexOrThrow(strArr[1])));
                                }
                                if (NullChecker.m81303a(cursorM94508b)) {
                                    cursorM94508b.close();
                                }
                            } catch (Exception e) {
                                CrashHelper.m81296c(e);
                                e.getMessage();
                            }
                        }
                        bitmap.recycle();
                        if (NullChecker.m81303a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                CrashHelper.m81296c(e2);
                            }
                        }
                        return fileM145083O;
                    } catch (IOException e3) {
                        e = e3;
                        CrashHelper.m81296c(e);
                        bitmap.recycle();
                        if (NullChecker.m81303a(fileOutputStream)) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                CrashHelper.m81296c(e4);
                            }
                        }
                        return null;
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    CrashHelper.m81296c(e);
                    bitmap.recycle();
                    if (NullChecker.m81303a(fileOutputStream)) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            CrashHelper.m81296c(e6);
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
                if (!NullChecker.m81303a(null)) {
                    throw th2;
                }
                try {
                    fileOutputStream2.close();
                    throw th2;
                } catch (IOException e9) {
                    CrashHelper.m81296c(e9);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m206435R1(MMPresetFilter mMPresetFilter) {
        mMPresetFilter.mPercent = m206451X0(mMPresetFilter.mFilterId);
    }

    /* JADX INFO: renamed from: R2 */
    public final void m206436R2(int i, boolean z) {
        m206439S2(i, z, true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m206437S0() {
        Act act = getAct();
        if (!NullChecker.m81304b(act) || act.isFinishing()) {
            return;
        }
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m206438S1() {
        if (NullChecker.m81303a(this.f188831U0)) {
            this.f188831U0.setFilterData(this.f188799E1);
        }
        final String str = this.f188792B1.get();
        int iM200293G = vwb.m200293G(this.f188799E1, new w9j() { // from class: l.q00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((MMPresetFilter) obj).mFilterId));
            }
        });
        if (iM200293G > 0) {
            this.f188837X0 = iM200293G;
        }
        m206436R2(this.f188837X0, false);
        m206395B2();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m206439S2(int i, boolean z, boolean z2) {
        if (this.f188799E1.size() <= i || i < 0) {
            return;
        }
        this.f188792B1.put(this.f188799E1.get(i).mFilterId);
        boolean z3 = this.f188837X0 != i && z2;
        this.f188837X0 = i;
        float fM206451X0 = m206451X0(this.f188799E1.get(i).mFilterId);
        this.f188845b1 = fM206451X0;
        this.f188840Z.mo142547S(0, this.f188837X0, true, 0.0f, fM206451X0, -1.0f);
        this.f188840Z.setIntensity(this.f188845b1);
        if (NullChecker.m81303a(this.f188831U0)) {
            int i2 = (int) (this.f188845b1 * 100.0f);
            this.f188831U0.f16791c.setText(String.valueOf(i2));
            this.f188831U0.f16791c.setProgress(i2);
        }
        if (z3) {
            m206468d3(z);
        }
        if (i == 0) {
            C15763az.f72319c = false;
        } else {
            C15763az.f72319c = true;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m206440T0() {
        if (e51.m114773x() || e51.m114772w()) {
            return xdl0.m208331F0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m206441T1(List list) {
        this.f188799E1 = list;
        if (list == null) {
            this.f188799E1 = new ArrayList();
        }
        vwb.m200354z(this.f188799E1, new e30() { // from class: l.m00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130696a.m206435R1((MMPresetFilter) obj);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.n00
            @Override // java.lang.Runnable
            public final void run() {
                this.f136456a.m206438S1();
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final void m206442T2(boolean z) {
        int i = this.f188874p0;
        boolean z2 = false;
        if (i == 0) {
            xdl0.m208344M(this.f188812L, z);
            xdl0.m208344M(this.f188865l, z && this.f188866l1);
            xdl0.m208344M(this.f188810K, this.f188805H0.get().booleanValue() && !this.f188866l1 && z);
        } else if (i == 1) {
            xdl0.m208344M(this.f188814M, z);
        }
        xdl0.m208344M(this.f188888w, this.f188874p0 == 0 && !this.f188811K0 && z && this.f188884u.getCount() == 0);
        LinearLayout linearLayout = this.f188828T;
        if (!this.f188815M0 && !this.f188811K0 && z && this.f188884u.getCount() == 0) {
            z2 = true;
        }
        xdl0.m208344M(linearLayout, z2);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m206443U0() {
        bt0.m103732e(this.f188860j);
        if (NullChecker.m81303a(this.f188825R0)) {
            this.f188825R0.cancel();
        }
        this.f188860j.setVisibility(0);
        ImageView imageView = this.f188860j;
        Property<View, Float> property = bt0.f77162i;
        Interpolator interpolator = bt0.f77155b;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(imageView, property, 0L, 300L, interpolator, 1.0f, 0.75f), bt0.m103743p(this.f188860j, "alpha", 0L, 300L, interpolator, 0.0f, 0.8f), bt0.m103743p(this.f188860j, "alpha", 400L, 200L, interpolator, 0.8f, 0.0f));
        this.f188825R0 = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.i00
            @Override // java.lang.Runnable
            public final void run() {
                this.f110242a.m206513v1();
            }
        });
        this.f188825R0.start();
    }

    /* JADX INFO: renamed from: U2 */
    public final void m206445U2() {
        this.f188842a.getHolder().addCallback(new SurfaceHolderCallbackC21011a());
        this.f188886v.setOnClickListener(this);
        this.f188793C.setOnClickListener(this);
        this.f188795D.setOnClickListener(this);
        this.f188802G.setOnClickListener(this);
        this.f188800F.setOnClickListener(this);
        this.f188804H.setOnClickListener(this);
        this.f188808J.setOnClickListener(this);
        this.f188806I.setOnClickListener(this);
        m206487l1();
    }

    /* JADX INFO: renamed from: V0 */
    public final Bundle m206446V0(Video video) {
        Bundle bundle = new Bundle();
        if (this.f188870n1 == null) {
            this.f188870n1 = new VideoInfo();
        }
        video.isChosenFromLocal = false;
        video.advancedRecordingVideo = this.f188798E0 == 0;
        rlw rlwVarMo142890K = this.f188840Z.mo142890K();
        if (NullChecker.m81303a(rlwVarMo142890K)) {
            video.rotate = rlwVarMo142890K.m179930v();
        }
        MusicContent musicContentMo142557z = this.f188840Z.mo142557z();
        video.isFrontCamera = this.f188840Z.mo142899e();
        String strMo142546R = this.f188840Z.mo142546R(this.f188837X0);
        if (NullChecker.m81303a(musicContentMo142557z)) {
            video.playingMusic = musicContentMo142557z;
        }
        VideoInfo videoInfo = this.f188870n1;
        videoInfo.autoMusic = false;
        videoInfo.filterKeyId = strMo142546R;
        int i = this.f188798E0;
        videoInfo.shootMode = i;
        videoInfo.flashMode = this.f188801F0;
        videoInfo.fromState = i;
        videoInfo.isFragment = getCount() > 1;
        VideoInfo videoInfo2 = this.f188870n1;
        videoInfo2.choseDelayTime = this.f188803G0;
        videoInfo2.maxDuration = m206454Y0();
        VideoInfo videoInfo3 = this.f188870n1;
        videoInfo3.speedIndex = this.f188891x1;
        MusicContent musicContent = this.f188887v1;
        videoInfo3.hasOriginalSound = musicContent == null;
        videoInfo3.hasMusic = musicContent != null;
        bundle.putSerializable("EXTRA_KEY_CAMERA_META_DATA", this.f188868m1);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putParcelable("EXTRA_KEY_VIDEO_TRANS_INFO", this.f188870n1);
        if (this.f188874p0 == 0) {
            bundle.putBoolean("key_is_change_speed", this.f188884u.m29140l());
        }
        bundle.putString("extra_from", this.f188813L0);
        return bundle;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m206447V1(String str) throws Throwable {
        final File fileM206434R0 = m206434R0(str);
        if (fileM206434R0 == null) {
            lsi0.m151580j("图片处理失败");
        } else {
            e51.m114742G(new Runnable() { // from class: l.j00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115610a.m206444U1(fileM206434R0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m206448V2(boolean z) {
        boolean z2 = this.f188794C1;
        AccountCameraMenuView accountCameraMenuView = this.f188793C;
        boolean z3 = false;
        if (z2) {
            xdl0.m208345M0(accountCameraMenuView, false);
            xdl0.m208344M(this.f188795D, false);
            return;
        }
        xdl0.m208344M(accountCameraMenuView, this.f188840Z.mo142907s());
        if (this.f188840Z.mo142905m() && !m206502r1()) {
            z3 = true;
        }
        if (z3) {
            this.f188840Z.mo142906r(this.f188801F0);
        }
        if (z) {
            m206402E2(z3);
        } else {
            xdl0.m208344M(this.f188795D, z3);
            this.f188797E.setTranslationY(z3 ? t100.m186890d(72.0f) : 0.0f);
        }
        m206450W2();
    }

    /* JADX INFO: renamed from: W0 */
    public final int m206449W0() {
        return this.f188799E1.size();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m206450W2() {
        int i = this.f188801F0;
        if (i == 0) {
            this.f188795D.setImageResource(f188785I1);
        } else {
            if (i != 1) {
                return;
            }
            this.f188795D.setImageResource(f188784H1);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final float m206451X0(String str) {
        tpd0 tpd0Var = this.f188807I0.get("account_current_filter_intensity" + str);
        if (tpd0Var == null) {
            tpd0Var = new tpd0("account_current_filter_intensity" + AccountModule.m28131F().userId() + str, 50);
            this.f188807I0.put("account_current_filter_intensity" + str, tpd0Var);
        }
        return (tpd0Var.get().intValue() * 1.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m206452X1(boolean z) {
        xdl0.m208344M(this.f188795D, true);
        this.f188795D.setAlpha(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: renamed from: X2 */
    public void m206453X2(Media media) {
        this.f188812L.m28950j(media);
        this.f188814M.m28935f(media);
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m206454Y0() {
        return 15000L;
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m206455Y1(boolean z) {
        xdl0.m208344M(this.f188795D, z);
    }

    /* JADX INFO: renamed from: Z0 */
    public long m206456Z0() {
        return 3000L;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m206457Z1() {
        xdl0.m208344M(this.f188804H, true);
        xdl0.m208344M(this.f188806I, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m206458Z2(int i) {
        return (m206489m2() || i == 4 || i == 5 || this.f188884u.getCount() != 0) ? false : true;
    }

    @Override // p149l.InterfaceC18275lp.a
    /* JADX INFO: renamed from: a */
    public void mo150816a(String str) {
        lsi0.m151580j("录制错误，请确保磁盘空间足够，且打开录制音频权限");
        this.f188884u.m29135g();
        mo146797k(false);
    }

    /* JADX INFO: renamed from: a1 */
    public final String m206459a1() {
        int i = this.f188843a1;
        if (i == 1) {
            return xdl0.m208408w0() / xdl0.m208412y0() == 1 ? "9.16" : "full";
        }
        if (i != 2) {
            return i != 3 ? "full" : BuildConfig.VERSION_NAME;
        }
        return "3.4";
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m206460a2(boolean z) {
        xdl0.m208344M(this.f188804H, z);
        xdl0.m208344M(this.f188806I, z);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m206461a3() {
        m206399D2(this.f188835W0, true);
        m206442T2(false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (AccountCompactMediaPickerAct) this.f188834W;
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: b */
    public long mo146793b() {
        return this.f188884u.getLastSliceDuration();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m206462b2() {
        xdl0.m208344M(this.f188888w, true);
        xdl0.m208344M(this.f188884u, true);
        xdl0.m208344M(this.f188812L, true);
        xdl0.m208344M(this.f188814M, true);
        xdl0.m208344M(this.f188808J, true);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m206463b3(String str, final d30 d30Var) {
        xh0 xh0VarM208722a = new xh0.C21150a(this.f188836X.act()).m208728g(false).m208731j(str).m208726e(R$string.f16050B2).m208738q(R$string.f16178b).m208724c(new View.OnClickListener() { // from class: l.mz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208736o(new View.OnClickListener() { // from class: l.nz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141174a.m206467d2(view);
            }
        }).m208722a();
        this.f188790A1 = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    @Override // p149l.InterfaceC18275lp.a
    /* JADX INFO: renamed from: c */
    public void mo150817c(String str, boolean z) {
        if (this.f188884u.getRecordDuration() < 3000) {
            lsi0.m151580j("时间太短啦，再拍一段吧！");
            return;
        }
        Video video = new Video(0, str);
        z00.m216712a(video);
        m206341I2();
        if (z && NullChecker.m81303a(this.f188885u1)) {
            this.f188885u1.call(m206446V0(video));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m206464c2(boolean z) {
        this.f188884u.setTranslationY(0.0f);
        this.f188814M.setAlpha(1.0f);
        this.f188812L.setAlpha(1.0f);
        this.f188884u.setAlpha(1.0f);
        if (z) {
            xdl0.m208344M(this.f188814M, false);
            xdl0.m208344M(this.f188808J, false);
        } else {
            xdl0.m208344M(this.f188888w, false);
            xdl0.m208344M(this.f188884u, false);
            xdl0.m208344M(this.f188812L, false);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m206465c3() {
        if (this.f188799E1.size() <= 1) {
            SignUpAiAct.f16355c.f154408g.m121236q();
            lsi0.m151580j("滤镜资源正在加载中...");
        }
        this.f188831U0.m28976p();
        m206399D2(this.f188831U0, true);
        m206442T2(false);
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: d */
    public SurfaceHolder mo146794d() {
        return this.f188842a.getHolder();
    }

    /* JADX INFO: renamed from: d1 */
    public long m206466d1() {
        return this.f188884u.getRecordDuration();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m206467d2(View view) {
        this.f188790A1.m208717c();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m206468d3(final boolean z) {
        String strMo142544P = this.f188840Z.mo142544P(this.f188837X0);
        if (NullChecker.m81303a(this.f188831U0)) {
            this.f188831U0.m28977q(this.f188837X0);
        }
        if (TextUtils.isEmpty(strMo142544P)) {
            return;
        }
        this.f188858i.setText(strMo142544P);
        e51.m114742G(new Runnable() { // from class: l.h00
            @Override // java.lang.Runnable
            public final void run() {
                this.f105196a.m206470e2(z);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
        AccountCameraEffectMgr.m28698V().m28759r();
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: e */
    public void mo146795e() {
        this.f188884u.m29135g();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m206469e1() {
        if (this.f188835W0 == null) {
            AccountMakeUpMenuView accountMakeUpMenuView = (AccountMakeUpMenuView) this.f188820P.inflate();
            this.f188835W0 = accountMakeUpMenuView;
            accountMakeUpMenuView.setVisibility(8);
            this.f188835W0.m29052y();
            this.f188835W0.m29009D();
            this.f188835W0.setMenuDismissListener(new d30() { // from class: l.hz
                @Override // p149l.d30
                public final void call() {
                    this.f110162a.m206516w1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final void m206470e2(boolean z) {
        bt0.m103732e(this.f188858i);
        if (NullChecker.m81303a(this.f188855g1)) {
            this.f188855g1.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f188858i, "translationX", 0L, 300L, bt0.f77154a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f188858i;
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, bt0.m103743p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), bt0.m103743p(this.f188858i, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f188855g1 = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.o00
            @Override // java.lang.Runnable
            public final void run() {
                this.f141273a.m206473f2();
            }
        });
        bt0.m103733f(this.f188855g1, new Runnable() { // from class: l.p00
            @Override // java.lang.Runnable
            public final void run() {
                this.f146521a.m206476g2();
            }
        });
        this.f188855g1.start();
    }

    @Override // p149l.InterfaceC15629ai
    /* JADX INFO: renamed from: f */
    public void mo96767f(View view) {
        this.f188884u.m29143o();
        m206463b3("确认删除上一段视频？", new d30() { // from class: l.lz
            @Override // p149l.d30
            public final void call() {
                this.f130616a.m206429P1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m206472f1() {
        xdl0.m208345M0(this.f188830U, false);
        xdl0.m208345M0(this.f188832V, false);
        xdl0.m208345M0(this.f188828T, false);
        m206422M2();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m206473f2() {
        this.f188858i.setScaleY(1.6f);
        this.f188858i.setScaleX(1.6f);
        this.f188858i.setVisibility(0);
        this.f188879r1 = true;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m206474f3(int i) {
        this.f188843a1 = 1;
        m206515v3(1);
        xdl0.m208344M(this.f188791B, true);
        xdl0.m208344M(this.f188865l, this.f188866l1);
        xdl0.m208344M(this.f188886v, true);
        xdl0.m208344M(this.f188894z, false);
        xdl0.m208344M(this.f188810K, !this.f188866l1 && this.f188805H0.get().booleanValue());
        if (i == 1) {
            m206407G2(true);
            m206404F2(true);
            return;
        }
        xdl0.m208344M(this.f188814M, false);
        xdl0.m208344M(this.f188808J, false);
        xdl0.m208344M(this.f188804H, true);
        xdl0.m208344M(this.f188806I, true);
        xdl0.m208344M(this.f188812L, true);
        xdl0.m208344M(this.f188884u, true);
        this.f188804H.setAlpha(1.0f);
        this.f188806I.setAlpha(1.0f);
        this.f188812L.setAlpha(1.0f);
        this.f188884u.setAlpha(1.0f);
        this.f188884u.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m206475g1() {
        int childCount = this.f188869n.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            this.f188869n.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: l.v00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179046a.m206520y1(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m206476g2() {
        this.f188879r1 = false;
        this.f188855g1 = null;
    }

    /* JADX INFO: renamed from: g3 */
    public void m206477g3(boolean z) {
        this.f188812L.m28959s(z);
        this.f188814M.m28940k(z);
    }

    @Override // p149l.InterfaceC18057kp
    public int getCount() {
        return this.f188884u.getCount();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m206478h1() {
        this.f188888w.setOnClickListener(new View.OnClickListener() { // from class: l.w00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183698a.m206523z1(view);
            }
        });
        xdl0.m208413z(this.f188892y);
        this.f188812L.setCallback(this);
        this.f188814M.setCallback(this);
        this.f188838Y.m99610y0();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m206479h2() {
        m206436R2(this.f188837X0, false);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m206480h3(int i) {
        xdl0.m208344M(this.f188791B, true);
        if (i == 0) {
            m206407G2(false);
            m206404F2(false);
        } else {
            this.f188814M.setAlpha(1.0f);
            xdl0.m208344M(this.f188814M, true);
            xdl0.m208344M(this.f188808J, true);
            xdl0.m208344M(this.f188804H, false);
            xdl0.m208344M(this.f188806I, false);
            xdl0.m208344M(this.f188812L, false);
            xdl0.m208344M(this.f188884u, false);
        }
        xdl0.m208344M(this.f188865l, false);
        xdl0.m208344M(this.f188886v, true);
        xdl0.m208344M(this.f188894z, false);
        xdl0.m208344M(this.f188810K, false);
    }

    @Override // p149l.InterfaceC15629ai
    /* JADX INFO: renamed from: i */
    public void mo96768i(View view) {
        this.f188881s1.call(view);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m206481i2(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f188840Z.mo142547S(this.f188874p0, i, !z, fFloatValue, -1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m206482i3(int i) {
        boolean z = false;
        boolean z2 = i == 4;
        if (z2) {
            if (NullChecker.m81303a(this.f188857h1)) {
                this.f188857h1.cancel();
            }
            if (NullChecker.m81303a(this.f188859i1)) {
                this.f188859i1.cancel();
            }
        }
        if (NullChecker.m81304b(this.f188870n1) && !m206492n2()) {
            xdl0.m208344M(this.f188791B, !z2);
            xdl0.m208344M(this.f188886v, !z2);
        }
        xdl0.m208344M(this.f188888w, this.f188874p0 == 0 && !this.f188811K0 && m206458Z2(i));
        xdl0.m208344M(this.f188828T, (this.f188815M0 || this.f188811K0 || !m206458Z2(i)) ? false : true);
        if (!z2) {
            xdl0.m208344M(this.f188894z, false);
        }
        xdl0.m208344M(this.f188795D, (z2 || m206502r1()) ? false : true);
        FrameLayout frameLayout = this.f188865l;
        if (!z2 && !m206489m2() && this.f188866l1 && this.f188874p0 == 0) {
            z = true;
        }
        xdl0.m208344M(frameLayout, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM206398D0 = m206398D0(layoutInflater, viewGroup);
        m206472f1();
        m206445U2();
        m206478h1();
        m206483j1();
        m206475g1();
        m206491n1();
        m206469e1();
        if (NullChecker.m81303a(this.f188887v1)) {
            this.f188892y.setText(this.f188887v1.name);
        }
        xdl0.m208344M(this.f188810K, this.f188805H0.get().booleanValue());
        return viewM206398D0;
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: j */
    public int mo146796j() {
        return this.f188801F0;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m206483j1() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 3; i > 0; i--) {
            TextView textView = this.f188882t;
            Interpolator interpolator = bt0.f77157d;
            Animator animatorM103753z = bt0.m103753z(bt0.m103743p(textView, "scaleX", 500L, 500L, interpolator, 0.3f, 1.2f), bt0.m103743p(this.f188882t, "scaleY", 500L, 500L, interpolator, 0.3f, 1.2f), bt0.m103743p(this.f188882t, "alpha", 500L, 500L, interpolator, 0.3f, 1.2f));
            bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.ez
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93836a.m206392A1(i);
                }
            });
            bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.pz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151912a.m206394B1();
                }
            });
            arrayList.add(animatorM103753z);
        }
        Animator animatorM103746s = bt0.m103746s((Animator) arrayList.get(0), (Animator) arrayList.get(1), (Animator) arrayList.get(2));
        this.f188823Q0 = animatorM103746s;
        bt0.m103749v(animatorM103746s, new Runnable() { // from class: l.a00
            @Override // java.lang.Runnable
            public final void run() {
                this.f66999a.m206396C1();
            }
        });
        bt0.m103734g(this.f188823Q0, new Runnable() { // from class: l.l00
            @Override // java.lang.Runnable
            public final void run() {
                this.f125436a.m206401E1();
            }
        }, new Runnable() { // from class: l.r00
            @Override // java.lang.Runnable
            public final void run() {
                this.f157123a.m206403F1();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final void m206484j3(int i) {
        bt0.m103743p(this.f188867m, "translationX", 0L, 200L, bt0.f77155b, (i - 2) * t100.m186890d(58.0f)).start();
        ((TextView) this.f188869n.getChildAt(this.f188891x1)).setTextColor(Color.parseColor("#b2ffffff"));
        ((TextView) this.f188869n.getChildAt(i)).setTextColor(Color.parseColor("#383e46"));
        this.f188891x1 = i;
        this.f188889w1 = f188786J1[i];
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: k */
    public void mo146797k(boolean z) {
        int i = z ? 4 : 2;
        if (this.f188884u.getRecordDuration() != 0 && i == 2) {
            this.f188884u.m29148t();
            i = 5;
        }
        this.f188812L.setState(i);
        m206341I2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m206485k1(Bundle bundle) {
        if (NullChecker.m81303a(bundle)) {
            this.f188870n1 = (VideoInfo) bundle.getParcelable("EXTRA_KEY_VIDEO_TRANS_INFO");
            if (NullChecker.m81303a(bundle.getSerializable("extra_music_content"))) {
                this.f188887v1 = (MusicContent) bundle.getSerializable("extra_music_content");
            }
            if (NullChecker.m81303a(this.f188870n1)) {
                int i = this.f188870n1.speedIndex;
                this.f188891x1 = i;
                this.f188889w1 = f188786J1[i];
            }
            this.f188809J0 = bundle.getBoolean("extra_has_video", true);
            this.f188811K0 = bundle.getBoolean("extra_is_add_image", false);
            String string = bundle.getString("extra_from", "");
            this.f188813L0 = string;
            this.f188794C1 = TextUtils.equals(string, "from_sign_up");
            this.f188815M0 = bundle.getBoolean("extra_show_only_photo", false);
            if (NullChecker.m81303a(bundle.getSerializable("extra_selected_images"))) {
                this.f188817N0 = (ArrayList) bundle.getSerializable("extra_selected_images");
            }
            this.f188819O0 = bundle.getString("extra_selected_folder_path", "");
        }
        if (this.f188870n1 == null) {
            this.f188870n1 = new VideoInfo();
        }
        VideoInfo videoInfo = this.f188870n1;
        MusicContent musicContent = this.f188887v1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = musicContent != null;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m206486k2() {
        this.f188846c.setVisibility(8);
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: l */
    public void mo146798l() {
        m206339H2("视频处理中...", true);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m206487l1() {
        this.f188883t1 = xck0.m208120a(1000, new e30() { // from class: l.fz
            @Override // p149l.e30
            public final void call(Object obj) {
                x00.m206365g0((View) obj);
            }
        });
        this.f188881s1 = xck0.m208120a(500, new e30() { // from class: l.gz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105073a.m206406G1((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m206488l2() {
        this.f188844b.setVisibility(8);
    }

    @Override // p149l.InterfaceC17593ip
    /* JADX INFO: renamed from: m */
    public void mo137410m() {
        m206448V2(true);
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m206489m2() {
        AccountMaskMenuView accountMaskMenuView = this.f188833V0;
        if (accountMaskMenuView != null && xdl0.m208349O0(accountMaskMenuView)) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f188831U0;
        if (accountFilterMenuView != null && xdl0.m208349O0(accountFilterMenuView)) {
            return true;
        }
        AccountMakeUpMenuView accountMakeUpMenuView = this.f188835W0;
        return accountMakeUpMenuView != null && xdl0.m208349O0(accountMakeUpMenuView);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m206490m3() {
        this.f188805H0.put(Boolean.FALSE);
        if (this.f188810K.getVisibility() == 0) {
            xdl0.m208344M(this.f188810K, this.f188805H0.get().booleanValue());
        }
        if (this.f188840Z.mo142901h()) {
            return;
        }
        m206412J0();
    }

    @Override // p149l.InterfaceC20218to
    /* JADX INFO: renamed from: n */
    public void mo189829n(float f, int i) {
        if (i == 1) {
            this.f188840Z.mo142541L(new float[]{f, f});
            C15763az.f72320d = f != 0.0f;
            return;
        }
        if (i == 2) {
            this.f188839Y0 = f;
            float[] fArr = f188788L1;
            fArr[0] = f * 0.6f;
            fArr[1] = this.f188841Z0 * 0.6f;
            if (!this.f188840Z.mo142540H() && this.f188840Z.mo142545Q()) {
                this.f188840Z.mo142555w(fArr);
            }
            C15763az.f72321e = f != 0.0f;
            return;
        }
        if (i != 3) {
            return;
        }
        this.f188841Z0 = f;
        float[] fArr2 = f188788L1;
        fArr2[0] = this.f188839Y0 * 0.6f;
        fArr2[1] = 0.6f * f;
        if (!this.f188840Z.mo142540H() && this.f188840Z.mo142545Q()) {
            this.f188840Z.mo142555w(fArr2);
        }
        C15763az.f72322f = f != 0.0f;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m206491n1() {
        this.f188884u.setListener(new AccountVideoRecordProgressView.InterfaceC4669d() { // from class: l.s00
            @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountVideoRecordProgressView.InterfaceC4669d
            /* JADX INFO: renamed from: a */
            public final void mo29161a(long j) {
                this.f161712a.m206426O1(j);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m206492n2() {
        return !C18775nu.m161422b();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m206493n3() {
        if (this.f188874p0 != 0) {
            this.f188812L.setState(2);
            return;
        }
        this.f188840Z.mo142908y(this.f188889w1);
        this.f188840Z.mo142902i();
        m206501q3();
        if (this.f188877q1) {
            m206499p3(true);
            this.f188877q1 = false;
        } else {
            this.f188884u.setMaxDuration(m206454Y0());
            this.f188884u.m29147s(this.f188889w1);
            m206416K2();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m206494o1() {
        SurfaceHolderCallbackC17847jr surfaceHolderCallbackC17847jr = new SurfaceHolderCallbackC17847jr();
        this.f188840Z = surfaceHolderCallbackC17847jr;
        surfaceHolderCallbackC17847jr.mo142892T(getAct(), this);
        if (NullChecker.m81303a(this.f188887v1)) {
            this.f188840Z.mo142556x(this.f188887v1);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m206495o2(int i) {
        if (i == this.f188874p0) {
            return;
        }
        int iM186890d = t100.m186890d(64.0f);
        int i2 = (t100.m186889c().widthPixels / 2) - iM186890d;
        int i3 = this.f188874p0 > 0 ? -1 : 1;
        LinearLayout linearLayout = this.f188828T;
        bt0.m103743p(linearLayout, "translationX", 0L, 100L, bt0.f77156c, linearLayout.getTranslationX(), i2 + ((i3 * iM186890d) / 2)).start();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m206496o3() {
        if (!NullChecker.m81304b(this.f188863k0) || this.f188863k0.m104106d()) {
            return;
        }
        this.f188863k0.m104109h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f188881s1.call(view);
    }

    @Override // p149l.InterfaceC18275lp.a
    public void onError(final int i, final int i2) {
        e51.m114748M(new Runnable() { // from class: l.qz
            @Override // java.lang.Runnable
            public final void run() {
                this.f156982a.m206432Q1(i, i2);
            }
        });
    }

    @Override // p149l.InterfaceC18057kp
    public void onFirstFrameRendered() {
        this.f188812L.m28949i();
    }

    @Override // p149l.InterfaceC15629ai
    public void onStateChanged(int i) {
        this.f188798E0 = i;
        if (this.f188836X.isResumed() || this.f188836X.lifecycle_() == C4319c.f15549j) {
            m206482i3(i);
        }
        if (i == 3) {
            if (this.f188874p0 != 1) {
                this.f188812L.setState(2);
                return;
            } else {
                m206518w3();
                return;
            }
        }
        if (i == 4) {
            if (this.f188874p0 != 0) {
                this.f188812L.setState(2);
                return;
            } else {
                m206490m3();
                return;
            }
        }
        if (i != 5) {
            return;
        }
        this.f188823Q0.cancel();
        if (this.f188840Z.mo142901h()) {
            m206499p3(true);
        }
        long recordDuration = this.f188884u.getRecordDuration();
        long jM206456Z0 = m206456Z0();
        AccountCameraVideoControlView accountCameraVideoControlView = this.f188812L;
        if (recordDuration < jM206456Z0) {
            accountCameraVideoControlView.f16785h.setImageResource(v2c0.f179472g1);
        } else {
            accountCameraVideoControlView.f16785h.setImageResource(v2c0.f179469f1);
        }
    }

    @Override // p149l.InterfaceC15629ai
    /* JADX INFO: renamed from: p */
    public boolean mo96769p() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f188835W0;
        if (accountMakeUpMenuView != null && accountMakeUpMenuView.getVisibility() == 0) {
            return true;
        }
        AccountFilterMenuView accountFilterMenuView = this.f188831U0;
        if (accountFilterMenuView != null && accountFilterMenuView.getVisibility() == 0) {
            return true;
        }
        AccountMaskMenuView accountMaskMenuView = this.f188833V0;
        return (accountMaskMenuView != null && accountMaskMenuView.getVisibility() == 0) || !this.f188836X.lifecycle_().f15555a;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m206497p1() {
        this.f188863k0 = C15991bw.m104104c(getAct().getApplicationContext());
        C21519yv c21519yv = new C21519yv();
        if (NullChecker.m81304b(this.f188840Z)) {
            c21519yv.m216171q(this.f188840Z.mo142890K());
        }
        this.f188863k0.m104108g(c21519yv);
        this.f188863k0.m104109h();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m206498p2(float f, float f2) {
        ImageView imageView = this.f188860j;
        imageView.setX(f - (imageView.getWidth() >> 1));
        ImageView imageView2 = this.f188860j;
        imageView2.setY(f2 - (imageView2.getHeight() >> 1));
        m206443U0();
        this.f188840Z.mo142889J(m206408H0(this.f188842a.getWidth(), this.f188842a.getHeight(), f, f2, 1.0f));
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m206499p3(boolean z) {
        this.f188884u.m29148t();
        boolean zMo142888I = this.f188840Z.mo142888I(z);
        m206496o3();
        return zMo142888I;
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: q */
    public void mo146799q(final String str, Exception exc) {
        zvf0.m220396r("e_signup_camera_take", "p_signup_camera");
        this.f188814M.setEnabled(true);
        if (NullChecker.m81303a(this.f188831U0)) {
            bt0.m103732e(this.f188831U0);
            this.f188831U0.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f188835W0)) {
            bt0.m103732e(this.f188835W0);
            this.f188835W0.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f188833V0)) {
            bt0.m103732e(this.f188833V0);
            this.f188833V0.setVisibility(8);
        }
        m206442T2(true);
        if (exc != null) {
            lsi0.m151580j("拍照失败");
        } else if (C18775nu.m161422b() && NullChecker.m81303a(getAct())) {
            e51.m114774y(new Runnable() { // from class: l.d00
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f83141a.m206447V1(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m206500q2() {
        this.f188840Z.mo142549n(new e30() { // from class: l.g00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100016a.m206441T1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m206501q3() {
        if (NullChecker.m81304b(this.f188863k0) && this.f188863k0.m104106d()) {
            this.f188863k0.m104110i();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m206502r1() {
        return this.f188840Z.mo142899e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m206503r2() {
        m206417L0();
        if (NullChecker.m81303a(this.f188887v1) || TextUtils.equals("immersion", this.f188813L0)) {
            this.f188874p0 = 0;
        } else if (!this.f188809J0) {
            this.f188874p0 = 1;
        }
        xdl0.m208344M(this.f188888w, this.f188874p0 == 0);
        m206495o2(-1);
        m206494o1();
        m206497p1();
        m206378q1();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m206504r3() {
        int i = this.f188803G0;
        if (i == 0) {
            this.f188803G0 = 3;
            this.f188806I.setImageResource(f188783G1);
        } else {
            if (i != 3) {
                return;
            }
            this.f188803G0 = 0;
            this.f188806I.setImageResource(f188782F1);
        }
    }

    @Override // p149l.InterfaceC18057kp
    public void removeLast() {
        this.f188884u.m29148t();
        this.f188884u.m29146r();
        if (this.f188884u.getCount() <= 0) {
            this.f188840Z.mo142884D(false);
            this.f188812L.setState(2);
        }
    }

    @Override // p149l.InterfaceC17593ip
    /* JADX INFO: renamed from: s */
    public void mo137411s(float f, int i) {
        if (NullChecker.m81303a(this.f188835W0)) {
            this.f188835W0.m29024S();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m206505s1() {
        ValueAnimator valueAnimator = this.f188829T0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: s2 */
    public void m206506s2() {
        if (C20183tj.m189234b()) {
            C15991bw.m104105e();
            this.f188840Z.release();
            this.f188884u.m29145q();
            C15686ap.m98010u();
            C15686ap.m98009j().m98021r();
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m206507s3(boolean z, float f) {
        List<MMPresetFilter> list = this.f188799E1;
        if (list.size() <= 0) {
            return;
        }
        int i = this.f188837X0;
        int size = z ? i + 1 : i - 1;
        if (size < 0) {
            size = list.size() - 1;
        }
        if (size >= list.size()) {
            size = 0;
        }
        this.f188845b1 = m206451X0(list.get(this.f188837X0).mFilterId);
        float fM206451X0 = m206451X0(list.get(size).mFilterId);
        this.f188847c1 = fM206451X0;
        int i2 = this.f188837X0;
        float f2 = z ? -f : 1.0f - f;
        this.f188827S0 = f2;
        this.f188840Z.mo142547S(0, i2, z, f2, this.f188845b1, fM206451X0);
        this.f188845b1 = this.f188847c1;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m206508t1() {
        m206499p3(true);
        this.f188840Z.mo142886F();
        this.f188884u.m29148t();
        this.f188884u.m29135g();
        this.f188868m1.clear();
        this.f188840Z.mo142884D(false);
        this.f188812L.setState(2);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m206509t3(final boolean z, boolean z2, boolean z3, long j) {
        final int iM206449W0 = m206449W0();
        int i = this.f188837X0;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = iM206449W0 - 1;
        } else if (i2 >= iM206449W0) {
            iM206449W0 = i;
            i2 = 0;
        } else {
            iM206449W0 = i;
        }
        if (!z2) {
            m206436R2(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m81303a(this.f188829T0) && this.f188829T0.isRunning()) {
            this.f188829T0.cancel();
        }
        if (this.f188829T0 == null) {
            this.f188829T0 = new ValueAnimator();
        }
        this.f188829T0.setDuration(j);
        this.f188829T0.setFloatValues(this.f188827S0, i3);
        this.f188829T0.removeAllUpdateListeners();
        this.f188829T0.removeAllListeners();
        this.f188829T0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f120433a.m206481i2(iM206449W0, z, valueAnimator);
            }
        });
        this.f188829T0.addListener(new C21014d(i2, z));
        this.f188829T0.start();
    }

    @Override // p149l.InterfaceC18057kp
    /* JADX INFO: renamed from: u */
    public boolean mo146800u() {
        return m206466d1() >= 3000;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m206510u1() {
        AccountMakeUpMenuView accountMakeUpMenuView = this.f188835W0;
        if (accountMakeUpMenuView != null) {
            accountMakeUpMenuView.m29039i0();
        }
        this.f188840Z.mo142886F();
        this.f188812L.m28957q();
        this.f188840Z.release();
        m206437S0();
    }

    /* JADX INFO: renamed from: u2 */
    public void m206511u2() {
        this.f188798E0 = 1;
        this.f188823Q0.cancel();
        this.f188840Z.onPause();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m206512u3() {
        int i = this.f188801F0 - 1;
        this.f188801F0 = i;
        if (i < 0) {
            this.f188801F0 = 1;
        }
        this.f188840Z.mo142906r(this.f188801F0);
        m206450W2();
    }

    @Override // p149l.InterfaceC15629ai
    /* JADX INFO: renamed from: v */
    public void mo96770v(View view) {
        this.f188883t1.call(view);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m206513v1() {
        this.f188860j.setVisibility(8);
    }

    /* JADX INFO: renamed from: v2 */
    public void m206514v2() {
        if (this.f188791B.getTranslationX() != 0.0f) {
            this.f188791B.setTranslationX(0.0f);
        }
        m206420M0();
        if (TextUtils.equals(this.f188813L0, SchemeKey.fake2good)) {
            return;
        }
        m206522y3(false);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m206515v3(int i) {
        m206405G0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(180.0f), t100.m186890d(180.0f));
        this.f188814M.f16772a.setThemeType(1);
        this.f188793C.setThemeType(1);
        if (i == 1) {
            this.f188808J.setImageResource(v2c0.f179413M);
            layoutParams.gravity = 17;
            this.f188852f.setLayoutParams(layoutParams);
            this.f188796D1 = true;
            bt0.m103732e(this.f188846c);
            View view = this.f188846c;
            Property property = View.TRANSLATION_Y;
            Interpolator interpolator = bt0.f77155b;
            Animator animatorM103739l = bt0.m103739l(view, property, 0L, 300L, interpolator, 0.0f, view.getHeight());
            bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.b00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72397a.m206486k2();
                }
            });
            animatorM103739l.start();
            bt0.m103732e(this.f188844b);
            Animator animatorM103739l2 = bt0.m103739l(this.f188844b, property, 0L, 300L, interpolator, 0.0f, -this.f188846c.getHeight());
            bt0.m103733f(animatorM103739l2, new Runnable() { // from class: l.c00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78096a.m206488l2();
                }
            });
            animatorM103739l2.start();
        } else if (i == 2) {
            this.f188808J.setImageResource(v2c0.f179419O);
            this.f188844b.setVisibility(8);
            int i2 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.topMargin = (int) this.f188853f1;
            this.f188846c.setLayoutParams(layoutParams2);
            this.f188846c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) ((this.f188853f1 / 2.0f) - (layoutParams.height / 2));
            this.f188852f.setLayoutParams(layoutParams);
            this.f188796D1 = false;
            bt0.m103732e(this.f188846c);
            bt0.m103739l(this.f188846c, View.TRANSLATION_Y, 0L, 300L, bt0.f77155b, this.f188853f1, 0.0f).start();
        } else if (i == 3) {
            this.f188808J.setImageResource(v2c0.f179416N);
            int i3 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            layoutParams3.bottomMargin = (int) (xdl0.m208408w0() - this.f188849d1);
            this.f188844b.setLayoutParams(layoutParams3);
            this.f188844b.setVisibility(0);
            int i4 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams4.topMargin = (int) this.f188851e1;
            this.f188846c.setLayoutParams(layoutParams4);
            this.f188846c.setVisibility(0);
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) (((this.f188851e1 + this.f188849d1) / 2.0f) - (layoutParams.height / 2));
            this.f188852f.setLayoutParams(layoutParams);
            this.f188796D1 = false;
            bt0.m103732e(this.f188846c);
            View view2 = this.f188846c;
            Property property2 = View.TRANSLATION_Y;
            Interpolator interpolator2 = bt0.f77155b;
            bt0.m103739l(view2, property2, 0L, 300L, interpolator2, this.f188853f1 - this.f188851e1, 0.0f).start();
            bt0.m103732e(this.f188844b);
            bt0.m103739l(this.f188844b, property2, 0L, 300L, interpolator2, -this.f188846c.getHeight(), 0.0f).start();
        }
        m206422M2();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m206516w1() {
        m206399D2(this.f188835W0, false);
        m206442T2(true);
    }

    /* JADX INFO: renamed from: w2 */
    public void m206517w2(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        if (NullChecker.m81303a(this.f188835W0)) {
            this.f188835W0.m29007A(list, list2);
            this.f188835W0.m29024S();
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m206518w3() {
        int i;
        int iM208408w0;
        int i2 = this.f188861j1;
        int i3 = this.f188864k1;
        m206405G0();
        int i4 = this.f188843a1;
        if (i4 == 3) {
            float f = i3;
            iM208408w0 = (int) (f - ((this.f188851e1 / xdl0.m208408w0()) * f));
            i = i2;
        } else if (i4 == 2) {
            i = (i2 * 4) / 3;
            iM208408w0 = i3 - i;
        } else {
            i = i3;
            iM208408w0 = 0;
        }
        this.f188840Z.mo142885E(0, iM208408w0, i2, i);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m206519x3() {
        boolean z = this.f188866l1;
        this.f188866l1 = !z;
        this.f188804H.setImageResource(!z ? v2c0.f179425Q : v2c0.f179422P);
        xdl0.m208344M(this.f188865l, this.f188866l1);
        xdl0.m208344M(this.f188810K, this.f188805H0.get().booleanValue() && !this.f188866l1);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m206520y1(int i, View view) {
        m206484j3(i);
    }

    /* JADX INFO: renamed from: y2 */
    public void m206521y2(MusicContent musicContent) {
        this.f188887v1 = musicContent;
        VideoInfo videoInfo = this.f188870n1;
        videoInfo.musicContent = musicContent;
        videoInfo.isSameMusic = false;
        if (NullChecker.m81303a(musicContent)) {
            this.f188892y.setText(musicContent.name);
        }
        this.f188840Z.mo142556x(musicContent);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m206523z1(View view) {
        this.f188883t1.call(view);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m206524z2() {
        m206499p3(false);
        mo146797k(false);
        this.f188840Z.mo142891O();
    }

    /* JADX INFO: renamed from: l.x00$a */
    public class SurfaceHolderCallbackC21011a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC21011a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            x00.this.f188861j1 = i2;
            x00.this.f188864k1 = i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: renamed from: l.x00$b */
    public class C21012b implements AccountFilterScrollMoreViewPager.InterfaceC4655c {

        /* JADX INFO: renamed from: a */
        public boolean f188897a = false;

        public C21012b() {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4655c
        /* JADX INFO: renamed from: a */
        public void mo28874a(float f) {
            if (x00.this.m206492n2() || x00.this.f188840Z.mo142901h() || x00.this.m206505s1()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f188897a = z;
            x00.this.m206507s3(z, f);
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4655c
        /* JADX INFO: renamed from: b */
        public void mo28875b(float f) {
            if (x00.this.m206492n2() || x00.this.f188840Z.mo142901h() || x00.this.m206505s1() || x00.this.f188827S0 == 0.0f) {
                return;
            }
            x00.this.m206509t3(f > 0.0f, true, false, 200L);
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4655c
        public void onCancel() {
            if (x00.this.m206492n2() || x00.this.f188840Z.mo142901h() || x00.this.m206505s1() || x00.this.f188827S0 == 0.0f) {
                return;
            }
            x00.this.m206509t3(!this.f188897a, true, true, 200L);
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.pager.AccountFilterScrollMoreViewPager.InterfaceC4655c
        /* JADX INFO: renamed from: c */
        public void mo28876c(boolean z) {
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m206522y3(boolean z) {
    }
}
