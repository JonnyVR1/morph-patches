package p003l;

import android.animation.Animator;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.RecorderView;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.ShootingResultView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import l.a1c0;
import l.bt0;
import l.c3c0;
import l.e51;
import l.ib1;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.ura;
import l.xdl0;
import l.zqx;
import l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dqy {

    /* JADX INFO: renamed from: b */
    public final guy f3066b;

    /* JADX INFO: renamed from: c */
    public final MessageBarOpt f3067c;

    /* JADX INFO: renamed from: d */
    public boolean f3068d;

    /* JADX INFO: renamed from: g */
    public t2h0 f3071g;

    /* JADX INFO: renamed from: h */
    public MessagesAct f3072h;

    /* JADX INFO: renamed from: i */
    public RecorderView f3073i;

    /* JADX INFO: renamed from: j */
    public fqb f3074j;

    /* JADX INFO: renamed from: k */
    public ShootingResultView f3075k;

    /* JADX INFO: renamed from: l */
    public gji f3076l;

    /* JADX INFO: renamed from: m */
    public upd0 f3077m;

    /* JADX INFO: renamed from: n */
    public String f3078n;

    /* JADX INFO: renamed from: o */
    public boolean f3079o;

    /* JADX INFO: renamed from: p */
    public boolean f3080p;

    /* JADX INFO: renamed from: w */
    public boolean f3087w;

    /* JADX INFO: renamed from: a */
    public int f3065a = 1;

    /* JADX INFO: renamed from: e */
    public boolean f3069e = true;

    /* JADX INFO: renamed from: f */
    public boolean f3070f = true;

    /* JADX INFO: renamed from: r */
    public boolean f3082r = false;

    /* JADX INFO: renamed from: s */
    public Runnable f3083s = new RunnableC0239d();

    /* JADX INFO: renamed from: t */
    public Runnable f3084t = new RunnableC0240e();

    /* JADX INFO: renamed from: u */
    public Runnable f3085u = new Runnable() { // from class: l.hpy
        @Override // java.lang.Runnable
        public final void run() {
            this.f4255a.m3670C();
        }
    };

    /* JADX INFO: renamed from: v */
    public Runnable f3086v = new RunnableC0236a();

    /* JADX INFO: renamed from: q */
    public anx f3081q = new anx();

    /* JADX INFO: renamed from: l.dqy$a */
    public class RunnableC0236a implements Runnable {
        public RunnableC0236a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m3726b() {
            dqy dqyVar = dqy.this;
            dqyVar.m3685K(dqyVar.f3087w, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.g gVarI0 = xdl0.i0(dqy.this.f3067c.getInputRoot());
            xdl0.g gVarI1 = xdl0.i0(dqy.this.f3067c.getSurfaceContainer());
            Rect rect = new Rect();
            int i = gVarI0.a - gVarI1.a;
            rect.left = i;
            int i2 = gVarI0.b - gVarI1.b;
            rect.top = i2;
            rect.right = i + gVarI0.c;
            rect.bottom = i2 + gVarI0.d;
            if (rect.height() <= 0) {
                int i3 = t100.t;
                rect.top = i3;
                rect.bottom = i3 + t100.z;
            }
            dqy.this.f3067c.m2521w0();
            dqy.this.m3668B(false);
            dqy.this.f3067c.getSurfaceContent().m2533a(rect, new d30() { // from class: l.cqy
                @Override // p003l.d30
                public final void call() {
                    this.f2765a.m3726b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.dqy$b */
    public class C0237b implements ShootingResultView.InterfaceC0120b {
        public C0237b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.ShootingResultView.InterfaceC0120b
        /* JADX INFO: renamed from: a */
        public void mo2344a() {
            dqy.this.m3679G0();
            dqy.this.m3692O();
        }
    }

    /* JADX INFO: renamed from: l.dqy$d */
    public class RunnableC0239d implements Runnable {
        public RunnableC0239d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f3067c.getNoticeBubble().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.dqy$e */
    public class RunnableC0240e implements Runnable {
        public RunnableC0240e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f3067c.getNoticeVideo().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.dqy$f */
    public class RunnableC0241f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBarActionItemView f3093a;

        public RunnableC0241f(MessageBarActionItemView messageBarActionItemView) {
            this.f3093a = messageBarActionItemView;
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f3067c.m2520v0(this.f3093a);
        }
    }

    /* JADX INFO: renamed from: l.dqy$g */
    public class C0242g implements d30 {
        public C0242g() {
        }

        @Override // p003l.d30
        public void call() {
            dqy.this.f3067c.mo1920f();
        }
    }

    /* JADX INFO: renamed from: l.dqy$j */
    public class C0245j implements qg50 {
        public C0245j() {
        }

        @Override // p003l.qg50
        /* JADX INFO: renamed from: a */
        public void mo2711a(Exception exc) {
            dqy.this.m3719t0("takePhoto fail Exception= " + exc.getMessage());
        }

        @Override // p003l.qg50
        public void success(String str) {
            dqy.this.m3690M0(str);
        }
    }

    public dqy(MessageBarOpt messageBarOpt, guy guyVar) {
        this.f3067c = messageBarOpt;
        this.f3066b = guyVar;
        this.f3072h = guyVar.act();
        this.f3073i = messageBarOpt.getCameraFunction();
        zvf0.x("e_live_camera", "p_chat_view");
        m3695R();
        m3696S();
        m3697T();
        m3699Y();
        m3693P();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m3635H0(final Act act, final d30 d30Var, String... strArr) {
        if (!PermissionHelper.b(strArr)) {
            PermissionHelper.c().r(strArr).o(new d30() { // from class: l.lpy
                @Override // p003l.d30
                public final void call() {
                    dqy.m3635H0(act, d30Var, new String[0]);
                }
            }).w(false).u(true).i(act);
            return;
        }
        final Dialog dialogProgress = act.progress(act.getString(R.string.g2));
        if (NullChecker.a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
            dialogProgress.show();
        }
        act.duringCreated(CoreModule.N().cameraSdkLoaded()).subscribe((m250) mkd0.H(new e30() { // from class: l.mpy
            @Override // p003l.e30
            public final void call(Object obj) {
                dqy.m3640b(dialogProgress, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.npy
            @Override // p003l.e30
            public final void call(Object obj) {
                dqy.m3643d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static void m3636U(Act act, d30 d30Var, String... strArr) {
        if (m3641b0()) {
            m3663w0(act, d30Var, strArr);
        } else {
            m3635H0(act, d30Var, strArr);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m3637V(Act act, d30 d30Var) {
        m3636U(act, d30Var, zqx.k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: W */
    public static void m3638W(Act act, d30 d30Var) {
        m3636U(act, d30Var, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3640b(Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (NullChecker.a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            if (NullChecker.a(d30Var)) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m3641b0() {
        return CoreModule.N().isCameraSdkLoaded();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3643d(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    public static void m3663w0(final Act act, final d30 d30Var, String... strArr) {
        if (!PermissionHelper.b(strArr)) {
            PermissionHelper.c().r(strArr).o(new d30() { // from class: l.ppy
                @Override // p003l.d30
                public final void call() {
                    dqy.m3663w0(act, d30Var, new String[0]);
                }
            }).w(false).u(true).i(act);
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m3667A0(boolean z) {
        CardView cardView = this.f3075k;
        if (z) {
            xdl0.M(cardView, true);
            xdl0.M(this.f3067c.getSurfaceContainer(), false);
            xdl0.M(this.f3067c.getSwitchCameraView(), false);
        } else {
            xdl0.M(cardView, false);
            xdl0.M(this.f3067c.getSurfaceContainer(), true);
            xdl0.M(this.f3067c.getSwitchCameraView(), true);
            this.f3075k.m2343p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3668B(boolean z) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) this.f3067c.mo1916b(MessageBarActionItemType.SHI_PAI);
        if (messageBarActionItemView == null) {
            return;
        }
        if (z) {
            bt0.s(new Animator[]{bt0.f(bt0.p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), new float[]{-messageBarActionItemView.getWidth(), 0.0f}), new RunnableC0241f(messageBarActionItemView)), bt0.p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), new float[]{0.0f})}).start();
        } else {
            bt0.s(new Animator[]{bt0.f(bt0.z(new Animator[]{bt0.p(this.f3067c.m2485M(), "alpha", 0L, 150L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f3067c.getInputRoot(), "alpha", 0L, 150L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), new float[]{-messageBarActionItemView.getWidth(), 0.0f})}), new Runnable() { // from class: l.opy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6200a.m3705f0();
                }
            }), bt0.z(new Animator[]{bt0.p(this.f3067c.m2485M(), "alpha", 0L, 150L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f3067c.getInputRoot(), "alpha", 0L, 150L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), new float[]{0.0f})})}).start();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: B0 */
    public void m3669B0(RecorderView.StatusInfo statusInfo) {
        if (TextUtils.isEmpty(statusInfo.getPath()) || !new File(statusInfo.getPath()).exists()) {
            return;
        }
        m3719t0("shootingResultView StatusInfo = " + statusInfo.toString());
        zvf0.x("e_camera_chat_cancel", "p_chat_view");
        m3667A0(true);
        this.f3073i.setStatusInfo(statusInfo);
        this.f3075k.m2343p();
        this.f3075k.m2340m(statusInfo.getPath(), statusInfo.isPhoto(), xdl0.w(8.0f));
        this.f3067c.getNoticeVideo().setVisibility(8);
        this.f3067c.getBarWrapper().setVisibility(0);
        this.f3067c.getSwitchCameraView().setVisibility(0);
        this.f3067c.getBarMaskLayer().setVisibility(0);
        this.f3067c.getBar_center_text().setText(statusInfo.getText());
        this.f3067c.getBar_center_text().setSpaceHint(this.f3072h.getString(R.string.A5));
        m3721v0();
    }

    /* JADX INFO: renamed from: C */
    public final void m3670C() {
        xdl0.g gVarI0 = xdl0.i0(this.f3067c.getInputRoot());
        xdl0.g gVarI1 = xdl0.i0(this.f3067c.getSurfaceContainer());
        Rect rect = new Rect();
        int i = gVarI0.a - gVarI1.a;
        rect.left = i;
        int i2 = gVarI0.b - gVarI1.b;
        rect.top = i2;
        rect.right = i + gVarI0.c;
        rect.bottom = i2 + gVarI0.d;
        this.f3067c.getSurfaceContent().m2534b(rect, new d30() { // from class: l.upy
            @Override // p003l.d30
            public final void call() {
                this.f8060a.m3706g0();
            }
        }, new C0242g());
        m3668B(true);
    }

    /* JADX INFO: renamed from: C0 */
    public void m3671C0() {
        m3638W(this.f3072h, new d30() { // from class: l.kpy
            @Override // p003l.d30
            public final void call() {
                this.f5004a.m3701a0();
            }
        });
        this.f3066b.m4830m0();
    }

    /* JADX INFO: renamed from: D */
    public void m3672D() {
        m3667A0(false);
        m3680H();
        m3720u0(1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D0 */
    public void m3673D0() {
        zvf0.A("e_switch_camera", "p_chat_view", new j760[]{new j760("front_back", this.f3081q.m2893h() ? "0" : "1"), new j760("camera_filter_name", this.f3076l.m4577r())});
        if (this.f3069e) {
            return;
        }
        this.f3069e = true;
        this.f3067c.getSingleText().setVisibility(8);
        this.f3067c.getBar_center_text_layout().setVisibility(0);
        this.f3067c.getChangeSizeView().setVisibility(8);
        this.f3067c.getCloseView().setVisibility(8);
        this.f3067c.getExpandView().setVisibility(0);
        int i = this.f3065a;
        if (i == 1 || i == 2) {
            this.f3073i.setVisibility(0);
        } else {
            this.f3067c.getRealShotSend().setVisibility(0);
        }
        this.f3067c.getSwitchCameraView().setVisibility(0);
        this.f3067c.getSwitchCameraView().setClickable(true);
        ViewGroup.LayoutParams aVar = new ConstraintLayout.a(-1, 0);
        ((ConstraintLayout.a) aVar).B = this.f3072h.getString(R.string.u2);
        this.f3067c.getSurfaceViewRooter().setLayoutParams(aVar);
        this.f3076l.m4569B(false);
        m3674E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m3674E(boolean z) {
        this.f3075k.m2343p();
        int i = this.f3065a;
        if (i == 3 || i == 4) {
            m3667A0(true);
            this.f3075k.m2334f(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3675E0(RecorderView.StatusInfo statusInfo) {
        if (!m3702c0()) {
            m3667A0(false);
        } else {
            m3669B0(statusInfo);
            this.f3067c.getSurfaceContainer().setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3676F() {
        m3673D0();
        this.f3067c.getBar_center_text().setFocusable(true);
        this.f3067c.getBar_center_text().setFocusableInTouchMode(true);
        this.f3067c.getBar_center_text().requestFocus();
        e51.H(this.f3072h, new Runnable() { // from class: l.qpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f6667a.m3677F0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m3677F0() {
        this.f3072h.mo2063c0().m6499g0().mo5104f();
    }

    /* JADX INFO: renamed from: G */
    public void m3678G() {
        e51.H(this.f3072h, new Runnable() { // from class: l.spy
            @Override // java.lang.Runnable
            public final void run() {
                this.f7285a.m3707h0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: G0 */
    public void m3679G0() {
        this.f3075k.m2343p();
        if (this.f3069e) {
            this.f3069e = false;
            if (this.f3065a == 2) {
                return;
            }
            this.f3067c.getSingleText().setVisibility(0);
            CharSequence string = this.f3067c.getBar_center_text().getText().toString();
            this.f3067c.getSingleText().setTextColor(-1);
            if (TextUtils.isEmpty(string)) {
                string = this.f3067c.getBar_center_text().getHint().toString();
                this.f3067c.getSingleText().setTextColor(Color.parseColor("#99ffffff"));
            }
            this.f3067c.getSingleText().setText(string);
            this.f3067c.getBar_center_text_layout().setVisibility(8);
            this.f3067c.getChangeSizeView().setVisibility(0);
            this.f3067c.getCloseView().setVisibility(0);
            zvf0.x("e_camera_chat_close", "p_chat_view");
            this.f3067c.getExpandView().setVisibility(8);
            this.f3067c.getNoticeBubble().setVisibility(8);
            this.f3067c.getNoticeVideo().setVisibility(8);
            this.f3073i.setVisibility(8);
            this.f3067c.getRealShotSend().setVisibility(8);
            this.f3067c.getSwitchCameraView().setVisibility(8);
            this.f3067c.getSwitchCameraView().setClickable(false);
            ViewGroup.LayoutParams aVar = new ConstraintLayout.a(-1, 0);
            ((ConstraintLayout.a) aVar).B = "3:1";
            this.f3067c.getSurfaceViewRooter().setLayoutParams(aVar);
            if (NullChecker.a(this.f3076l)) {
                this.f3076l.m4569B(true);
            }
            m3674E(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3680H() {
        this.f3067c.getBar_center_text().setText("");
        this.f3073i.setStatusInfo(null);
        this.f3077m.m8194a();
    }

    /* JADX INFO: renamed from: I */
    public void m3681I(boolean z) {
        m3683J(z, true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m3682I0() {
        boolean z;
        boolean zM2896k;
        try {
            zM2896k = this.f3081q.m2896k(this.f3072h);
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
            zM2896k = false;
        }
        if (zM2896k) {
            this.f3081q.m2900o();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3683J(boolean z, boolean z2) {
        if (!z2) {
            m3685K(z, false);
        } else {
            this.f3087w = z;
            this.f3067c.getSurfaceContent().post(this.f3086v);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m3684J0() {
        zvf0.u("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "0")});
        zvf0.A("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "0")});
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            lsi0.y(audioBusinessTypeC.getBusinessMsg());
            return;
        }
        this.f3067c.getNoticeBubble().setVisibility(8);
        this.f3067c.getNoticeVideo().removeCallbacks(this.f3084t);
        this.f3067c.getNoticeVideo().setText(R.string.t);
        this.f3067c.getNoticeVideo().setVisibility(0);
        this.f3067c.getNoticeVideo().postDelayed(this.f3084t, 3000L);
        this.f3081q.m2901p();
        m3720u0(2);
        m3694Q();
        this.f3067c.getBarWrapper().setVisibility(4);
        this.f3067c.getSwitchCameraView().setVisibility(8);
        this.f3067c.getMessageBarRoot().setVisibility(8);
        this.f3067c.getExpandView().setVisibility(8);
        this.f3067c.getBarMaskLayer().setVisibility(8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: K */
    public final void m3685K(boolean z, boolean z2) {
        this.f3068d = false;
        zvf0.r("e_camera_chat_close", "p_chat_view");
        this.f3067c.m2492T();
        this.f3067c.m2478A0();
        this.f3067c.getBar_center_text().setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f3067c.getSurfaceViewRooter().setVisibility(8);
        this.f3073i.setVisibility(8);
        this.f3067c.getCloseView().setVisibility(8);
        this.f3067c.getSurfaceContent().m2537e();
        this.f3067c.getSingleText().setVisibility(8);
        this.f3067c.getBar_center_text_layout().setVisibility(0);
        this.f3067c.getBar_center_text().setHintTextColor(this.f3072h.getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.W));
        xdl0.M(this.f3067c.getBar_send(), !CoreModule.P().i().t1());
        this.f3067c.getExpandView().setVisibility(8);
        this.f3067c.m2521w0();
        this.f3067c.mo1920f();
        this.f3067c.getBar_center_text().setSpaceHint(this.f3072h.getString(R.string.N0));
        this.f3072h.mo2046A0().m8846x2(3);
        this.f3067c.getNoticeBubble().setVisibility(8);
        this.f3067c.getNoticeVideo().setVisibility(8);
        if (z && NullChecker.a(this.f3073i.getStatusInfo())) {
            m3722x0();
        } else if (NullChecker.a(this.f3073i.getStatusInfo())) {
            m3672D();
        }
        this.f3075k.m2343p();
        if (CoreModule.P().i().hm()) {
            xdl0.M(this.f3067c.getInputAiView(), true);
        }
        if (this.f3079o) {
            this.f3066b.act().mo2066l().m4309t7().m7948p0().setVisibility(0);
            this.f3066b.act().mo2066l().m4309t7().m7887L1(true);
            this.f3066b.act().mo2066l().m4309t7().m7890O1(true);
        }
        if (this.f3080p && NullChecker.a(this.f3066b.act().mo2066l().m4309t7().m7946o0())) {
            xdl0.M(this.f3066b.act().mo2066l().m4309t7().m7946o0(), true);
        }
        this.f3067c.getBar_center_text().setText(this.f3078n);
        if (z2) {
            m3692O();
        }
        this.f3067c.getSurfaceContainer().removeAllViews();
        this.f3071g = null;
        this.f3081q.m2902q();
        this.f3081q.m2897l();
        this.f3067c.getRealShotSend().setVisibility(8);
        CoreModule.c.f0.Z1 = false;
        if (this.f3072h.mo2066l().m4265l3() != MessageWarmingUpHelper.WarmingUpLevel.not) {
            xdl0.M(this.f3067c.getTempInputLayout(), true);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3067c.getEditRootView().getLayoutParams();
            marginLayoutParams.leftMargin = t100.d(59.0f);
            this.f3067c.getEditRootView().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m3686K0() {
        this.f3081q.m2903r();
    }

    /* JADX INFO: renamed from: L */
    public void m3687L() {
        fqb fqbVar = this.f3074j;
        if (fqbVar != null) {
            fqbVar.m4393c();
        }
        this.f3074j = null;
        this.f3067c.getCountDownTimer().setVisibility(8);
    }

    /* JADX INFO: renamed from: L0 */
    public void m3688L0() {
        zvf0.u("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "1")});
        this.f3081q.m2904s(new C0245j());
    }

    /* JADX INFO: renamed from: M */
    public void m3689M() {
        this.f3081q.m2895j();
        this.f3081q.m2889d(new C0244i());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3690M0(final String str) {
        ThreadUtil.i(new Runnable() { // from class: l.rpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f7037a.m3718s0(str);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m3691N(final String str) {
        ThreadUtil.i(new Runnable() { // from class: l.tpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f7582a.m3708i0(str);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m3692O() {
        if (this.f3065a == 2) {
            return;
        }
        this.f3072h.mo2063c0().m6499g0().mo5102d();
    }

    /* JADX INFO: renamed from: P */
    public final void m3693P() {
        this.f3067c.getSwitchCameraView().setOnClickListener(new View.OnClickListener() { // from class: l.xpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8816a.m3714o0(view);
            }
        });
        this.f3067c.getExpandView().setOnClickListener(new View.OnClickListener() { // from class: l.ypy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9112a.m3715p0(view);
            }
        });
        this.f3072h.lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.zpy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9397a.m3709j0((c) obj);
            }
        }));
        this.f3067c.getCloseView().setOnClickListener(new View.OnClickListener() { // from class: l.aqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2261a.m3710k0(view);
            }
        });
        this.f3067c.getChangeSizeView().setOnClickListener(new View.OnClickListener() { // from class: l.bqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2479a.m3711l0(view);
            }
        });
        this.f3067c.getSingleText().setOnClickListener(new View.OnClickListener() { // from class: l.ipy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4455a.m3712m0(view);
            }
        });
        m3698X();
        this.f3067c.getRealShotSend().setOnClickListener(new View.OnClickListener() { // from class: l.jpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4701a.m3713n0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m3694Q() {
        fqb fqbVar = new fqb();
        this.f3074j = fqbVar;
        fqbVar.m4392b(30, new C0238c());
    }

    /* JADX INFO: renamed from: R */
    public final void m3695R() {
        this.f3076l = new gji(this.f3067c, this.f3081q, this);
    }

    /* JADX INFO: renamed from: S */
    public final void m3696S() {
        this.f3066b.act().lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.wpy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8598a.m3716q0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m3697T() {
        this.f3077m = new upd0("l_s_i_i" + this.f3072h.mo2066l().m4250i3());
    }

    /* JADX INFO: renamed from: X */
    public final void m3698X() {
        this.f3073i.setRecorderCallback(new C0243h());
    }

    /* JADX INFO: renamed from: Y */
    public final void m3699Y() {
        ShootingResultView shootingResultView = new ShootingResultView(this.f3072h);
        this.f3075k = shootingResultView;
        shootingResultView.setResultViewListener(new C0237b());
        this.f3067c.getSurfaceViewRooter().addView(this.f3075k);
        xdl0.M(this.f3075k, false);
        this.f3075k.setCancelClickListener(new View.OnClickListener() { // from class: l.vpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8394a.m3717r0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m3700Z() {
        this.f3081q.m2888c();
        this.f3081q.m2902q();
        m3682I0();
        t2h0 t2h0Var = new t2h0(this.f3072h, this.f3081q);
        this.f3071g = t2h0Var;
        t2h0Var.m7699i();
        this.f3067c.getSurfaceContainer().addView(this.f3071g.m7700j());
        this.f3076l.m4574o();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a0 */
    public final void m3701a0() {
        m3700Z();
        zvf0.x("e_close_camera_chat", "p_chat_view");
        zvf0.x("e_camera_chat_close", "p_chat_view");
        if (this.f3065a == 1) {
            zvf0.A("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "1")});
        }
        m3719t0("showBar");
        this.f3068d = true;
        this.f3067c.m2524z0();
        this.f3067c.m2479B0(MessageBarActionItemType.EMOJI, true);
        m3673D0();
        this.f3078n = this.f3067c.getBar_center_text().getText().toString().trim();
        this.f3067c.getBar_center_text().setText("");
        this.f3067c.getBar_center_text().setTextColor(-1);
        this.f3067c.getBar_center_text().setHintTextColor(ura.e().d().I4() ? 1728053247 : -1711276033);
        this.f3067c.getExpandView().setVisibility(0);
        this.f3067c.getSurfaceViewRooter().setVisibility(0);
        this.f3067c.getSurfaceContent().setVisibility(4);
        this.f3073i.setVisibility(0);
        this.f3067c.getEditRootView().setBackgroundColor(0);
        this.f3067c.getBar_send().setVisibility(8);
        this.f3067c.m2486N();
        if (CoreModule.P().i().hm()) {
            xdl0.M(this.f3067c.getInputAiView(), false);
        }
        if (!m3702c0()) {
            this.f3067c.getNoticeBubble().removeCallbacks(this.f3083s);
            this.f3067c.getNoticeBubble().setText(R.string.u);
            this.f3067c.getNoticeBubble().setVisibility(0);
            this.f3067c.getNoticeBubble().postDelayed(this.f3083s, 3000L);
        }
        m3675E0((RecorderView.StatusInfo) this.f3077m.m8195b(RecorderView.StatusInfo.class));
        this.f3067c.getSurfaceContent().removeCallbacks(this.f3085u);
        this.f3067c.getSurfaceContent().post(this.f3085u);
        if (this.f3066b.act().mo2066l().m4309t7().m7948p0().getVisibility() == 0) {
            this.f3066b.act().mo2066l().m4309t7().m7948p0().setVisibility(8);
            this.f3066b.act().mo2066l().m4309t7().m7887L1(false);
            this.f3066b.act().mo2066l().m4309t7().m7890O1(false);
            this.f3079o = true;
        } else {
            this.f3079o = false;
        }
        if (NullChecker.a(this.f3066b.act().mo2066l().m4309t7().m7946o0()) && this.f3066b.act().mo2066l().m4309t7().m7946o0().getVisibility() == 0) {
            xdl0.M(this.f3066b.act().mo2066l().m4309t7().m7946o0(), false);
            this.f3080p = true;
        } else {
            this.f3080p = false;
        }
        this.f3066b.m4772J1(true);
        this.f3067c.getBar_center_text().setSpaceHint(this.f3072h.getString(R.string.B5));
        if (this.f3065a == 3) {
            this.f3067c.getRealShotSend().setVisibility(0);
        }
        xdl0.M(this.f3067c.getTempInputLayout(), false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3067c.getEditRootView().getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        this.f3067c.getEditRootView().setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m3702c0() {
        upd0 upd0Var = this.f3077m;
        return (upd0Var == null || upd0Var.m8195b(RecorderView.StatusInfo.class) == null || TextUtils.isEmpty(((RecorderView.StatusInfo) this.f3077m.m8195b(RecorderView.StatusInfo.class)).getPath()) || !new File(((RecorderView.StatusInfo) this.f3077m.m8195b(RecorderView.StatusInfo.class)).getPath()).exists()) ? false : true;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m3703d0() {
        return this.f3068d;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3704e0(String str, boolean z) {
        this.f3067c.getExpandView().setVisibility(0);
        RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, z);
        statusInfo.setText(this.f3067c.getBar_center_text().getText().toString().trim());
        xdl0.A(this.f3067c.getBar_center_text());
        m3669B0(statusInfo);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m3705f0() {
        this.f3067c.getSingleText().setVisibility(8);
        this.f3067c.getBar_center_text_layout().setVisibility(0);
        this.f3067c.getBar_center_text().setHintTextColor(this.f3072h.getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.W));
        this.f3067c.m2492T();
        this.f3067c.m2478A0();
        this.f3067c.getBar_send().setVisibility(0);
        this.f3067c.mo1920f();
        this.f3067c.getBar_center_text().setSpaceHint(this.f3072h.getString(R.string.N0));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m3706g0() {
        xdl0.M0(this.f3067c.getSurfaceContent(), true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m3707h0() {
        m3673D0();
        this.f3067c.getBar_center_text().setFocusable(true);
        m3677F0();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m3708i0(String str) {
        m3687L();
        this.f3067c.getMessageBarRoot().setVisibility(0);
        m3704e0(str, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m3709j0(c cVar) {
        if (cVar == c.k && m3703d0() && this.f3069e) {
            m3679G0();
            m3692O();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m3710k0(View view) {
        m3681I(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m3711l0(View view) {
        m3676F();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m3712m0(View view) {
        m3676F();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m3713n0(View view) {
        RecorderView.StatusInfo statusInfo = this.f3073i.getStatusInfo();
        if (statusInfo != null) {
            m3723y0(statusInfo.getPath(), statusInfo.isPhoto());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m3714o0(View view) {
        m3686K0();
        zvf0.u("e_switch_camera", "p_chat_view", new j760[]{new j760("front_back", this.f3081q.m2893h() ? "0" : "1"), new j760("camera_filter_name", this.f3076l.m4577r())});
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m3715p0(View view) {
        m3679G0();
        m3692O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m3716q0(c cVar) {
        if (cVar == c.i && (this.f3081q.m2894i() || m3703d0())) {
            this.f3082r = true;
            this.f3081q.m2902q();
            m3682I0();
            return;
        }
        if (cVar != c.j || (!this.f3081q.m2894i() && !m3703d0())) {
            if (cVar == c.m) {
                m3687L();
                m3681I(true);
                if (NullChecker.a(this.f3076l)) {
                    this.f3076l.m4575p();
                    return;
                }
                return;
            }
            return;
        }
        this.f3082r = false;
        this.f3081q.m2902q();
        if (NullChecker.a(this.f3075k)) {
            this.f3075k.m2343p();
        }
        t2h0 t2h0Var = this.f3071g;
        if (t2h0Var != null) {
            t2h0Var.m7701k(true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m3717r0(View view) {
        m3672D();
        zvf0.A("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "1")});
        zvf0.r("e_camera_chat_cancel", "p_chat_view");
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m3718s0(String str) {
        m3704e0(str, true);
    }

    /* JADX INFO: renamed from: u0 */
    public void m3720u0(int i) {
        this.f3065a = i;
        if (i == 1) {
            if (this.f3067c.getRealShotSend().getVisibility() == 0) {
                this.f3067c.getRealShotSend().setVisibility(8);
                this.f3073i.setVisibility(0);
            }
            this.f3073i.setImageResource(ura.e().d().I4() ? c3c0.y3 : c3c0.x3);
            return;
        }
        if (i == 2) {
            this.f3073i.setImageResource(c3c0.z3);
            return;
        }
        if (i == 3) {
            this.f3073i.setVisibility(8);
            this.f3067c.getRealShotSend().setVisibility(0);
            this.f3067c.getRealShotSend().setTextColor(this.f3072h.getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.o));
            this.f3073i.setImageResource(c3c0.v3);
            return;
        }
        if (i != 4) {
            return;
        }
        this.f3073i.setVisibility(8);
        this.f3067c.getRealShotSend().setVisibility(0);
        this.f3067c.getRealShotSend().setTextColor(ura.e().d().I4() ? this.f3072h.getResources().getColor(a1c0.i) : Color.parseColor("#19000000"));
        this.f3073i.setImageResource(c3c0.u3);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3721v0() {
        m3720u0(3);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m3722x0() {
        RecorderView.StatusInfo statusInfo = this.f3073i.getStatusInfo();
        if (statusInfo != null) {
            statusInfo.setText(this.f3067c.getBar_center_text().getText().toString().trim());
            this.f3077m.m8196c(statusInfo);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m3723y0(String str, boolean z) {
        this.f3072h.m2058N2(str, this.f3067c.getBar_center_text().getText().toString().trim(), z);
        m3720u0(1);
        zvf0.A("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "1")});
        m3667A0(false);
        m3680H();
        m3692O();
    }

    /* JADX INFO: renamed from: l.dqy$c */
    public class C0238c implements epl {
        public C0238c() {
        }

        @Override // p003l.epl
        /* JADX INFO: renamed from: a */
        public void mo3727a() {
            dqy.this.m3689M();
        }

        @Override // p003l.epl
        /* JADX INFO: renamed from: b */
        public void mo3728b(Long l2) {
            dqy.this.f3067c.getCountDownTimer().setText(String.format("00:%02d", l2));
        }

        @Override // p003l.epl
        public void onStart() {
            dqy.this.f3067c.getCountDownTimer().setVisibility(0);
        }

        @Override // p003l.epl
        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.dqy$h */
    public class C0243h implements qic0 {
        public C0243h() {
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: b */
        public void mo3730b(String str, boolean z) {
            dqy.this.m3723y0(str, z);
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: c */
        public boolean mo3731c() {
            return false;
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: d */
        public void mo3732d() {
            dqy.this.m3689M();
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: e */
        public void mo3733e() {
            if (dqy.this.f3065a != 2) {
                return;
            }
            xdl0.M(dqy.this.f3067c.getMaskLayer(), true);
            dqy.this.f3067c.getNoticeBubble().setVisibility(8);
            dqy.this.f3067c.getNoticeVideo().setVisibility(8);
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: f */
        public void mo3734f() {
            if (dqy.this.f3065a != 2) {
                return;
            }
            xdl0.M(dqy.this.f3067c.getMaskLayer(), false);
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: g */
        public void mo3735g() {
            dqy.this.m3688L0();
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: h */
        public void mo3736h() {
            dqy.this.m3684J0();
        }

        @Override // p003l.qic0
        public void onCancel() {
            if (dqy.this.f3065a != 2) {
                return;
            }
            xdl0.M(dqy.this.f3067c.getMaskLayer(), false);
            xdl0.M(dqy.this.f3067c.getBarWrapper(), true);
            dqy.this.f3067c.getExpandView().setVisibility(0);
            dqy.this.f3067c.getBarMaskLayer().setVisibility(0);
            dqy.this.f3067c.getSwitchCameraView().setVisibility(0);
            dqy.this.m3720u0(1);
            zvf0.A("e_camera_chat_on", "p_chat_view", new j760[]{new j760("photo_video", "1")});
            dqy.this.f3081q.m2886a();
            dqy.this.f3067c.getMessageBarRoot().setVisibility(0);
            dqy.this.m3687L();
        }

        @Override // p003l.qic0
        /* JADX INFO: renamed from: a */
        public void mo3729a() {
        }
    }

    /* JADX INFO: renamed from: l.dqy$i */
    public class C0244i implements af50 {
        public C0244i() {
        }

        @Override // p003l.af50
        /* JADX INFO: renamed from: c */
        public void mo2849c(String str) {
            dqy.this.m3691N(str);
        }

        @Override // p003l.af50
        /* JADX INFO: renamed from: a */
        public void mo2847a(String str) {
        }

        @Override // p003l.af50
        /* JADX INFO: renamed from: b */
        public void mo2848b(int i) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m3719t0(String str) {
    }

    /* JADX INFO: renamed from: z0 */
    public void m3724z0(boolean z) {
    }
}
