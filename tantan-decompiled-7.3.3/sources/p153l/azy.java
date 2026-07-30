package p153l;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.RecorderView;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.ShootingResultView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class azy {

    /* JADX INFO: renamed from: b */
    public final d3z f74204b;

    /* JADX INFO: renamed from: c */
    public final MessageBarOpt f74205c;

    /* JADX INFO: renamed from: d */
    public boolean f74206d;

    /* JADX INFO: renamed from: g */
    public bbh0 f74209g;

    /* JADX INFO: renamed from: h */
    public MessagesAct f74210h;

    /* JADX INFO: renamed from: i */
    public RecorderView f74211i;

    /* JADX INFO: renamed from: j */
    public trb f74212j;

    /* JADX INFO: renamed from: k */
    public ShootingResultView f74213k;

    /* JADX INFO: renamed from: l */
    public cmi f74214l;

    /* JADX INFO: renamed from: m */
    public wxd0 f74215m;

    /* JADX INFO: renamed from: n */
    public String f74216n;

    /* JADX INFO: renamed from: o */
    public boolean f74217o;

    /* JADX INFO: renamed from: p */
    public boolean f74218p;

    /* JADX INFO: renamed from: w */
    public boolean f74225w;

    /* JADX INFO: renamed from: a */
    public int f74203a = 1;

    /* JADX INFO: renamed from: e */
    public boolean f74207e = true;

    /* JADX INFO: renamed from: f */
    public boolean f74208f = true;

    /* JADX INFO: renamed from: r */
    public boolean f74220r = false;

    /* JADX INFO: renamed from: s */
    public Runnable f74221s = new RunnableC15871d();

    /* JADX INFO: renamed from: t */
    public Runnable f74222t = new RunnableC15872e();

    /* JADX INFO: renamed from: u */
    public Runnable f74223u = new Runnable() { // from class: l.eyy
        @Override // java.lang.Runnable
        public final void run() {
            this.f96544a.m101166C();
        }
    };

    /* JADX INFO: renamed from: v */
    public Runnable f74224v = new RunnableC15868a();

    /* JADX INFO: renamed from: q */
    public xvx f74219q = new xvx();

    /* JADX INFO: renamed from: l.azy$a */
    public class RunnableC15868a implements Runnable {
        public RunnableC15868a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m101222b() {
            azy azyVar = azy.this;
            azyVar.m101181K(azyVar.f74225w, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(azy.this.f74205c.getInputRoot());
            bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(azy.this.f74205c.getSurfaceContainer());
            Rect rect = new Rect();
            int i = c16067gM105560i0.f77559a - c16067gM105560i1.f77559a;
            rect.left = i;
            int i2 = c16067gM105560i0.f77560b - c16067gM105560i1.f77560b;
            rect.top = i2;
            rect.right = i + c16067gM105560i0.f77561c;
            rect.bottom = i2 + c16067gM105560i0.f77562d;
            if (rect.height() <= 0) {
                int i3 = qa00.f156333t;
                rect.top = i3;
                rect.bottom = i3 + qa00.f156339z;
            }
            azy.this.f74205c.m50575w0();
            azy.this.m101164B(false);
            azy.this.f74205c.getSurfaceContent().m50587a(rect, new x20() { // from class: l.zyy
                @Override // p153l.x20
                public final void call() {
                    this.f206655a.m101222b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.azy$b */
    public class C15869b implements ShootingResultView.InterfaceC8700b {
        public C15869b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.ShootingResultView.InterfaceC8700b
        /* JADX INFO: renamed from: a */
        public void mo50408a() {
            azy.this.m101175G0();
            azy.this.m101188O();
        }
    }

    /* JADX INFO: renamed from: l.azy$d */
    public class RunnableC15871d implements Runnable {
        public RunnableC15871d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            azy.this.f74205c.getNoticeBubble().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.azy$e */
    public class RunnableC15872e implements Runnable {
        public RunnableC15872e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            azy.this.f74205c.getNoticeVideo().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.azy$f */
    public class RunnableC15873f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBarActionItemView f74231a;

        public RunnableC15873f(MessageBarActionItemView messageBarActionItemView) {
            this.f74231a = messageBarActionItemView;
        }

        @Override // java.lang.Runnable
        public void run() {
            azy.this.f74205c.m50574v0(this.f74231a);
        }
    }

    /* JADX INFO: renamed from: l.azy$g */
    public class C15874g implements x20 {
        public C15874g() {
        }

        @Override // p153l.x20
        public void call() {
            azy.this.f74205c.mo50018f();
        }
    }

    /* JADX INFO: renamed from: l.azy$j */
    public class C15877j implements wo50 {
        public C15877j() {
        }

        @Override // p153l.wo50
        /* JADX INFO: renamed from: a */
        public void mo50745a(Exception exc) {
            azy.this.m101215t0("takePhoto fail Exception= " + exc.getMessage());
        }

        @Override // p153l.wo50
        public void success(String str) {
            azy.this.m101186M0(str);
        }
    }

    public azy(MessageBarOpt messageBarOpt, d3z d3zVar) {
        this.f74205c = messageBarOpt;
        this.f74204b = d3zVar;
        this.f74210h = d3zVar.act();
        this.f74211i = messageBarOpt.getCameraFunction();
        i4g0.m138526x("e_live_camera", OMSDialogPositon.p_chat_view);
        m101191R();
        m101192S();
        m101193T();
        m101195Y();
        m101189P();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m101131H0(final Act act, final x20 x20Var, String... strArr) {
        if (!PermissionHelper.m81064b(strArr)) {
            PermissionHelper.m81065c().m81083r(strArr).m81080o(new x20() { // from class: l.iyy
                @Override // p153l.x20
                public final void call() {
                    azy.m101131H0(act, x20Var, new String[0]);
                }
            }).m81088w(false).m81086u(true).m81074i(act);
            return;
        }
        final Dialog dialogProgress = act.progress(act.getString(R$string.f21715g2));
        if (NullChecker.m82486a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
            dialogProgress.show();
        }
        act.duringCreated(CoreModule.m30932N().cameraSdkLoaded()).subscribe(psd0.m173597H(new y20() { // from class: l.jyy
            @Override // p153l.y20
            public final void call(Object obj) {
                azy.m101136b(dialogProgress, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.kyy
            @Override // p153l.y20
            public final void call(Object obj) {
                azy.m101139d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static void m101132U(Act act, x20 x20Var, String... strArr) {
        if (m101137b0()) {
            m101159w0(act, x20Var, strArr);
        } else {
            m101131H0(act, x20Var, strArr);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m101133V(Act act, x20 x20Var) {
        m101132U(act, x20Var, wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: W */
    public static void m101134W(Act act, x20 x20Var) {
        m101132U(act, x20Var, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m101136b(Dialog dialog, x20 x20Var, uxj0 uxj0Var) {
        if (NullChecker.m82486a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m101137b0() {
        return CoreModule.m30932N().isCameraSdkLoaded();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m101139d(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    public static void m101159w0(final Act act, final x20 x20Var, String... strArr) {
        if (!PermissionHelper.m81064b(strArr)) {
            PermissionHelper.m81065c().m81083r(strArr).m81080o(new x20() { // from class: l.myy
                @Override // p153l.x20
                public final void call() {
                    azy.m101159w0(act, x20Var, new String[0]);
                }
            }).m81088w(false).m81086u(true).m81074i(act);
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m101163A0(boolean z) {
        ShootingResultView shootingResultView = this.f74213k;
        if (z) {
            bnl0.m105524M(shootingResultView, true);
            bnl0.m105524M(this.f74205c.getSurfaceContainer(), false);
            bnl0.m105524M(this.f74205c.getSwitchCameraView(), false);
        } else {
            bnl0.m105524M(shootingResultView, false);
            bnl0.m105524M(this.f74205c.getSurfaceContainer(), true);
            bnl0.m105524M(this.f74205c.getSwitchCameraView(), true);
            this.f74213k.m50407p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m101164B(boolean z) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) this.f74205c.mo50014b(MessageBarActionItemType.SHI_PAI);
        if (messageBarActionItemView == null) {
            return;
        }
        if (z) {
            gt0.m132173s(gt0.m132160f(gt0.m132170p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), -messageBarActionItemView.getWidth(), 0.0f), new RunnableC15873f(messageBarActionItemView)), gt0.m132170p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), 0.0f)).start();
        } else {
            gt0.m132173s(gt0.m132160f(gt0.m132180z(gt0.m132170p(this.f74205c.m50539M(), "alpha", 0L, 150L, null, 1.0f, 0.0f), gt0.m132170p(this.f74205c.getInputRoot(), "alpha", 0L, 150L, null, 1.0f, 0.0f), gt0.m132170p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), -messageBarActionItemView.getWidth(), 0.0f)), new Runnable() { // from class: l.lyy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134148a.m101201f0();
                }
            }), gt0.m132180z(gt0.m132170p(this.f74205c.m50539M(), "alpha", 0L, 150L, null, 0.0f, 1.0f), gt0.m132170p(this.f74205c.getInputRoot(), "alpha", 0L, 150L, null, 0.0f, 1.0f), gt0.m132170p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), 0.0f))).start();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m101165B0(RecorderView.StatusInfo statusInfo) {
        if (TextUtils.isEmpty(statusInfo.getPath()) || !new File(statusInfo.getPath()).exists()) {
            return;
        }
        m101215t0("shootingResultView StatusInfo = " + statusInfo.toString());
        i4g0.m138526x("e_camera_chat_cancel", OMSDialogPositon.p_chat_view);
        m101163A0(true);
        this.f74211i.setStatusInfo(statusInfo);
        this.f74213k.m50407p();
        this.f74213k.m50404m(statusInfo.getPath(), statusInfo.isPhoto(), bnl0.m105587w(8.0f));
        this.f74205c.getNoticeVideo().setVisibility(8);
        this.f74205c.getBarWrapper().setVisibility(0);
        this.f74205c.getSwitchCameraView().setVisibility(0);
        this.f74205c.getBarMaskLayer().setVisibility(0);
        this.f74205c.getBar_center_text().setText(statusInfo.getText());
        this.f74205c.getBar_center_text().setSpaceHint(this.f74210h.getString(R$string.f21456A5));
        m101217v0();
    }

    /* JADX INFO: renamed from: C */
    public final void m101166C() {
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.f74205c.getInputRoot());
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(this.f74205c.getSurfaceContainer());
        Rect rect = new Rect();
        int i = c16067gM105560i0.f77559a - c16067gM105560i1.f77559a;
        rect.left = i;
        int i2 = c16067gM105560i0.f77560b - c16067gM105560i1.f77560b;
        rect.top = i2;
        rect.right = i + c16067gM105560i0.f77561c;
        rect.bottom = i2 + c16067gM105560i0.f77562d;
        this.f74205c.getSurfaceContent().m50588b(rect, new x20() { // from class: l.ryy
            @Override // p153l.x20
            public final void call() {
                this.f165476a.m101202g0();
            }
        }, new C15874g());
        m101164B(true);
    }

    /* JADX INFO: renamed from: C0 */
    public void m101167C0() {
        m101134W(this.f74210h, new x20() { // from class: l.hyy
            @Override // p153l.x20
            public final void call() {
                this.f112179a.m101197a0();
            }
        });
        this.f74204b.m114027m0();
    }

    /* JADX INFO: renamed from: D */
    public void m101168D() {
        m101163A0(false);
        m101176H();
        m101216u0(1);
    }

    /* JADX INFO: renamed from: D0 */
    public void m101169D0() {
        i4g0.m138492A("e_switch_camera", OMSDialogPositon.p_chat_view, new pf60("front_back", this.f74219q.m213269h() ? "0" : "1"), new pf60("camera_filter_name", this.f74214l.m111272r()));
        if (this.f74207e) {
            return;
        }
        this.f74207e = true;
        this.f74205c.getSingleText().setVisibility(8);
        this.f74205c.getBar_center_text_layout().setVisibility(0);
        this.f74205c.getChangeSizeView().setVisibility(8);
        this.f74205c.getCloseView().setVisibility(8);
        this.f74205c.getExpandView().setVisibility(0);
        int i = this.f74203a;
        if (i == 1 || i == 2) {
            this.f74211i.setVisibility(0);
        } else {
            this.f74205c.getRealShotSend().setVisibility(0);
        }
        this.f74205c.getSwitchCameraView().setVisibility(0);
        this.f74205c.getSwitchCameraView().setClickable(true);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, 0);
        c0221a.f1212B = this.f74210h.getString(R$string.f21837u2);
        this.f74205c.getSurfaceViewRooter().setLayoutParams(c0221a);
        this.f74214l.m111264B(false);
        m101170E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m101170E(boolean z) {
        this.f74213k.m50407p();
        int i = this.f74203a;
        if (i == 3 || i == 4) {
            m101163A0(true);
            this.f74213k.m50398f(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m101171E0(RecorderView.StatusInfo statusInfo) {
        if (!m101198c0()) {
            m101163A0(false);
        } else {
            m101165B0(statusInfo);
            this.f74205c.getSurfaceContainer().setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m101172F() {
        m101169D0();
        this.f74205c.getBar_center_text().setFocusable(true);
        this.f74205c.getBar_center_text().setFocusableInTouchMode(true);
        this.f74205c.getBar_center_text().requestFocus();
        l51.m152888H(this.f74210h, new Runnable() { // from class: l.nyy
            @Override // java.lang.Runnable
            public final void run() {
                this.f144399a.m101173F0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m101173F0() {
        this.f74210h.mo50155d0().m143374g0().mo125462f();
    }

    /* JADX INFO: renamed from: G */
    public void m101174G() {
        l51.m152888H(this.f74210h, new Runnable() { // from class: l.pyy
            @Override // java.lang.Runnable
            public final void run() {
                this.f154698a.m101203h0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: G0 */
    public void m101175G0() {
        this.f74213k.m50407p();
        if (this.f74207e) {
            this.f74207e = false;
            if (this.f74203a == 2) {
                return;
            }
            this.f74205c.getSingleText().setVisibility(0);
            String string = this.f74205c.getBar_center_text().getText().toString();
            this.f74205c.getSingleText().setTextColor(-1);
            if (TextUtils.isEmpty(string)) {
                string = this.f74205c.getBar_center_text().getHint().toString();
                this.f74205c.getSingleText().setTextColor(Color.parseColor("#99ffffff"));
            }
            this.f74205c.getSingleText().setText(string);
            this.f74205c.getBar_center_text_layout().setVisibility(8);
            this.f74205c.getChangeSizeView().setVisibility(0);
            this.f74205c.getCloseView().setVisibility(0);
            i4g0.m138526x("e_camera_chat_close", OMSDialogPositon.p_chat_view);
            this.f74205c.getExpandView().setVisibility(8);
            this.f74205c.getNoticeBubble().setVisibility(8);
            this.f74205c.getNoticeVideo().setVisibility(8);
            this.f74211i.setVisibility(8);
            this.f74205c.getRealShotSend().setVisibility(8);
            this.f74205c.getSwitchCameraView().setVisibility(8);
            this.f74205c.getSwitchCameraView().setClickable(false);
            ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, 0);
            c0221a.f1212B = "3:1";
            this.f74205c.getSurfaceViewRooter().setLayoutParams(c0221a);
            if (NullChecker.m82486a(this.f74214l)) {
                this.f74214l.m111264B(true);
            }
            m101170E(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m101176H() {
        this.f74205c.getBar_center_text().setText("");
        this.f74211i.setStatusInfo(null);
        this.f74215m.m208401a();
    }

    /* JADX INFO: renamed from: I */
    public void m101177I(boolean z) {
        m101179J(z, true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m101178I0() {
        boolean z;
        boolean zM213272k;
        try {
            zM213272k = this.f74219q.m213272k(this.f74210h);
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
            zM213272k = false;
        }
        if (zM213272k) {
            this.f74219q.m213276o();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m101179J(boolean z, boolean z2) {
        if (!z2) {
            m101181K(z, false);
        } else {
            this.f74225w = z;
            this.f74205c.getSurfaceContent().post(this.f74224v);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m101180J0() {
        i4g0.m138523u("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "0"));
        i4g0.m138492A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "0"));
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        this.f74205c.getNoticeBubble().setVisibility(8);
        this.f74205c.getNoticeVideo().removeCallbacks(this.f74222t);
        this.f74205c.getNoticeVideo().setText(R$string.f21826t);
        this.f74205c.getNoticeVideo().setVisibility(0);
        this.f74205c.getNoticeVideo().postDelayed(this.f74222t, 3000L);
        this.f74219q.m213277p();
        m101216u0(2);
        m101190Q();
        this.f74205c.getBarWrapper().setVisibility(4);
        this.f74205c.getSwitchCameraView().setVisibility(8);
        this.f74205c.getMessageBarRoot().setVisibility(8);
        this.f74205c.getExpandView().setVisibility(8);
        this.f74205c.getBarMaskLayer().setVisibility(8);
    }

    /* JADX INFO: renamed from: K */
    public final void m101181K(boolean z, boolean z2) {
        this.f74206d = false;
        i4g0.m138520r("e_camera_chat_close", OMSDialogPositon.p_chat_view);
        this.f74205c.m50546T();
        this.f74205c.m50532A0();
        this.f74205c.getBar_center_text().setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f74205c.getSurfaceViewRooter().setVisibility(8);
        this.f74211i.setVisibility(8);
        this.f74205c.getCloseView().setVisibility(8);
        this.f74205c.getSurfaceContent().m50591e();
        this.f74205c.getSingleText().setVisibility(8);
        this.f74205c.getBar_center_text_layout().setVisibility(0);
        this.f74205c.getBar_center_text().setHintTextColor(this.f74210h.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102805W));
        bnl0.m105524M(this.f74205c.getBar_send(), !CoreModule.m30933P().m143412i().mo180539t1());
        this.f74205c.getExpandView().setVisibility(8);
        this.f74205c.m50575w0();
        this.f74205c.mo50018f();
        this.f74205c.getBar_center_text().setSpaceHint(this.f74210h.getString(R$string.f21555N0));
        this.f74210h.mo50138B0().m194225x2(3);
        this.f74205c.getNoticeBubble().setVisibility(8);
        this.f74205c.getNoticeVideo().setVisibility(8);
        if (z && NullChecker.m82486a(this.f74211i.getStatusInfo())) {
            m101218x0();
        } else if (NullChecker.m82486a(this.f74211i.getStatusInfo())) {
            m101168D();
        }
        this.f74213k.m50407p();
        if (CoreModule.m30933P().m143412i().mo34517hm()) {
            bnl0.m105524M(this.f74205c.getInputAiView(), true);
        }
        if (this.f74217o) {
            this.f74204b.act().mo50158l().m111048t7().m178966p0().setVisibility(0);
            this.f74204b.act().mo50158l().m111048t7().m178903L1(true);
            this.f74204b.act().mo50158l().m111048t7().m178907O1(true);
        }
        if (this.f74218p && NullChecker.m82486a(this.f74204b.act().mo50158l().m111048t7().m178964o0())) {
            bnl0.m105524M(this.f74204b.act().mo50158l().m111048t7().m178964o0(), true);
        }
        this.f74205c.getBar_center_text().setText(this.f74216n);
        if (z2) {
            m101188O();
        }
        this.f74205c.getSurfaceContainer().removeAllViews();
        this.f74209g = null;
        this.f74219q.m213278q();
        this.f74219q.m213273l();
        this.f74205c.getRealShotSend().setVisibility(8);
        CoreModule.f18264c.f20384f0.f20660Z1 = false;
        if (this.f74210h.mo50158l().m111004l3() != MessageWarmingUpHelper.WarmingUpLevel.not) {
            bnl0.m105524M(this.f74205c.getTempInputLayout(), true);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f74205c.getEditRootView().getLayoutParams();
            marginLayoutParams.leftMargin = qa00.m175859d(59.0f);
            this.f74205c.getEditRootView().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m101182K0() {
        this.f74219q.m213279r();
    }

    /* JADX INFO: renamed from: L */
    public void m101183L() {
        trb trbVar = this.f74212j;
        if (trbVar != null) {
            trbVar.m192467c();
        }
        this.f74212j = null;
        this.f74205c.getCountDownTimer().setVisibility(8);
    }

    /* JADX INFO: renamed from: L0 */
    public void m101184L0() {
        i4g0.m138523u("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "1"));
        this.f74219q.m213280s(new C15877j());
    }

    /* JADX INFO: renamed from: M */
    public void m101185M() {
        this.f74219q.m213271j();
        this.f74219q.m213265d(new C15876i());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m101186M0(final String str) {
        ThreadUtil.m82497i(new Runnable() { // from class: l.oyy
            @Override // java.lang.Runnable
            public final void run() {
                this.f149833a.m101214s0(str);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m101187N(final String str) {
        ThreadUtil.m82497i(new Runnable() { // from class: l.qyy
            @Override // java.lang.Runnable
            public final void run() {
                this.f160200a.m101204i0(str);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m101188O() {
        if (this.f74203a == 2) {
            return;
        }
        this.f74210h.mo50155d0().m143374g0().mo125460d();
    }

    /* JADX INFO: renamed from: P */
    public final void m101189P() {
        this.f74205c.getSwitchCameraView().setOnClickListener(new View.OnClickListener() { // from class: l.uyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181691a.m101210o0(view);
            }
        });
        this.f74205c.getExpandView().setOnClickListener(new View.OnClickListener() { // from class: l.vyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186434a.m101211p0(view);
            }
        });
        this.f74210h.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.wyy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191715a.m101205j0((C4470c) obj);
            }
        }));
        this.f74205c.getCloseView().setOnClickListener(new View.OnClickListener() { // from class: l.xyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196800a.m101206k0(view);
            }
        });
        this.f74205c.getChangeSizeView().setOnClickListener(new View.OnClickListener() { // from class: l.yyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202160a.m101207l0(view);
            }
        });
        this.f74205c.getSingleText().setOnClickListener(new View.OnClickListener() { // from class: l.fyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101427a.m101208m0(view);
            }
        });
        m101194X();
        this.f74205c.getRealShotSend().setOnClickListener(new View.OnClickListener() { // from class: l.gyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107131a.m101209n0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m101190Q() {
        trb trbVar = new trb();
        this.f74212j = trbVar;
        trbVar.m192466b(30, new C15870c());
    }

    /* JADX INFO: renamed from: R */
    public final void m101191R() {
        this.f74214l = new cmi(this.f74205c, this.f74219q, this);
    }

    /* JADX INFO: renamed from: S */
    public final void m101192S() {
        this.f74204b.act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.tyy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176726a.m101212q0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m101193T() {
        this.f74215m = new wxd0("l_s_i_i" + this.f74210h.mo50158l().m110989i3());
    }

    /* JADX INFO: renamed from: X */
    public final void m101194X() {
        this.f74211i.setRecorderCallback(new C15875h());
    }

    /* JADX INFO: renamed from: Y */
    public final void m101195Y() {
        ShootingResultView shootingResultView = new ShootingResultView(this.f74210h);
        this.f74213k = shootingResultView;
        shootingResultView.setResultViewListener(new C15869b());
        this.f74205c.getSurfaceViewRooter().addView(this.f74213k);
        bnl0.m105524M(this.f74213k, false);
        this.f74213k.setCancelClickListener(new View.OnClickListener() { // from class: l.syy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171340a.m101213r0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m101196Z() {
        this.f74219q.m213264c();
        this.f74219q.m213278q();
        m101178I0();
        bbh0 bbh0Var = new bbh0(this.f74210h, this.f74219q);
        this.f74209g = bbh0Var;
        bbh0Var.m103280i();
        this.f74205c.getSurfaceContainer().addView(this.f74209g.m103281j());
        this.f74214l.m111269o();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m101197a0() {
        m101196Z();
        i4g0.m138526x("e_close_camera_chat", OMSDialogPositon.p_chat_view);
        i4g0.m138526x("e_camera_chat_close", OMSDialogPositon.p_chat_view);
        if (this.f74203a == 1) {
            i4g0.m138492A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "1"));
        }
        m101215t0("showBar");
        this.f74206d = true;
        this.f74205c.m50578z0();
        this.f74205c.m50533B0(MessageBarActionItemType.EMOJI, true);
        m101169D0();
        this.f74216n = this.f74205c.getBar_center_text().getText().toString().trim();
        this.f74205c.getBar_center_text().setText("");
        this.f74205c.getBar_center_text().setTextColor(-1);
        this.f74205c.getBar_center_text().setHintTextColor(gta.m132210e().m132214d().mo34702I4() ? 1728053247 : -1711276033);
        this.f74205c.getExpandView().setVisibility(0);
        this.f74205c.getSurfaceViewRooter().setVisibility(0);
        this.f74205c.getSurfaceContent().setVisibility(4);
        this.f74211i.setVisibility(0);
        this.f74205c.getEditRootView().setBackgroundColor(0);
        this.f74205c.getBar_send().setVisibility(8);
        this.f74205c.m50540N();
        if (CoreModule.m30933P().m143412i().mo34517hm()) {
            bnl0.m105524M(this.f74205c.getInputAiView(), false);
        }
        if (!m101198c0()) {
            this.f74205c.getNoticeBubble().removeCallbacks(this.f74221s);
            this.f74205c.getNoticeBubble().setText(R$string.f21834u);
            this.f74205c.getNoticeBubble().setVisibility(0);
            this.f74205c.getNoticeBubble().postDelayed(this.f74221s, 3000L);
        }
        m101171E0((RecorderView.StatusInfo) this.f74215m.m208402b(RecorderView.StatusInfo.class));
        this.f74205c.getSurfaceContent().removeCallbacks(this.f74223u);
        this.f74205c.getSurfaceContent().post(this.f74223u);
        if (this.f74204b.act().mo50158l().m111048t7().m178966p0().getVisibility() == 0) {
            this.f74204b.act().mo50158l().m111048t7().m178966p0().setVisibility(8);
            this.f74204b.act().mo50158l().m111048t7().m178903L1(false);
            this.f74204b.act().mo50158l().m111048t7().m178907O1(false);
            this.f74217o = true;
        } else {
            this.f74217o = false;
        }
        if (NullChecker.m82486a(this.f74204b.act().mo50158l().m111048t7().m178964o0()) && this.f74204b.act().mo50158l().m111048t7().m178964o0().getVisibility() == 0) {
            bnl0.m105524M(this.f74204b.act().mo50158l().m111048t7().m178964o0(), false);
            this.f74218p = true;
        } else {
            this.f74218p = false;
        }
        this.f74204b.m113967J1(true);
        this.f74205c.getBar_center_text().setSpaceHint(this.f74210h.getString(R$string.f21464B5));
        if (this.f74203a == 3) {
            this.f74205c.getRealShotSend().setVisibility(0);
        }
        bnl0.m105524M(this.f74205c.getTempInputLayout(), false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f74205c.getEditRootView().getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        this.f74205c.getEditRootView().setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m101198c0() {
        wxd0 wxd0Var = this.f74215m;
        return (wxd0Var == null || wxd0Var.m208402b(RecorderView.StatusInfo.class) == null || TextUtils.isEmpty(((RecorderView.StatusInfo) this.f74215m.m208402b(RecorderView.StatusInfo.class)).getPath()) || !new File(((RecorderView.StatusInfo) this.f74215m.m208402b(RecorderView.StatusInfo.class)).getPath()).exists()) ? false : true;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m101199d0() {
        return this.f74206d;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m101200e0(String str, boolean z) {
        this.f74205c.getExpandView().setVisibility(0);
        RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, z);
        statusInfo.setText(this.f74205c.getBar_center_text().getText().toString().trim());
        bnl0.m105500A(this.f74205c.getBar_center_text());
        m101165B0(statusInfo);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m101201f0() {
        this.f74205c.getSingleText().setVisibility(8);
        this.f74205c.getBar_center_text_layout().setVisibility(0);
        this.f74205c.getBar_center_text().setHintTextColor(this.f74210h.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102805W));
        this.f74205c.m50546T();
        this.f74205c.m50532A0();
        this.f74205c.getBar_send().setVisibility(0);
        this.f74205c.mo50018f();
        this.f74205c.getBar_center_text().setSpaceHint(this.f74210h.getString(R$string.f21555N0));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m101202g0() {
        bnl0.m105525M0(this.f74205c.getSurfaceContent(), true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m101203h0() {
        m101169D0();
        this.f74205c.getBar_center_text().setFocusable(true);
        m101173F0();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m101204i0(String str) {
        m101183L();
        this.f74205c.getMessageBarRoot().setVisibility(0);
        m101200e0(str, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m101205j0(C4470c c4470c) {
        if (c4470c == C4470c.f16269k && m101199d0() && this.f74207e) {
            m101175G0();
            m101188O();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m101206k0(View view) {
        m101177I(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m101207l0(View view) {
        m101172F();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m101208m0(View view) {
        m101172F();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m101209n0(View view) {
        RecorderView.StatusInfo statusInfo = this.f74211i.getStatusInfo();
        if (statusInfo != null) {
            m101219y0(statusInfo.getPath(), statusInfo.isPhoto());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m101210o0(View view) {
        m101182K0();
        i4g0.m138523u("e_switch_camera", OMSDialogPositon.p_chat_view, new pf60("front_back", this.f74219q.m213269h() ? "0" : "1"), new pf60("camera_filter_name", this.f74214l.m111272r()));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m101211p0(View view) {
        m101175G0();
        m101188O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m101212q0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && (this.f74219q.m213270i() || m101199d0())) {
            this.f74220r = true;
            this.f74219q.m213278q();
            m101178I0();
            return;
        }
        if (c4470c != C4470c.f16268j || (!this.f74219q.m213270i() && !m101199d0())) {
            if (c4470c == C4470c.f16271m) {
                m101183L();
                m101177I(true);
                if (NullChecker.m82486a(this.f74214l)) {
                    this.f74214l.m111270p();
                    return;
                }
                return;
            }
            return;
        }
        this.f74220r = false;
        this.f74219q.m213278q();
        if (NullChecker.m82486a(this.f74213k)) {
            this.f74213k.m50407p();
        }
        bbh0 bbh0Var = this.f74209g;
        if (bbh0Var != null) {
            bbh0Var.m103282k(true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m101213r0(View view) {
        m101168D();
        i4g0.m138492A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "1"));
        i4g0.m138520r("e_camera_chat_cancel", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m101214s0(String str) {
        m101200e0(str, true);
    }

    /* JADX INFO: renamed from: u0 */
    public void m101216u0(int i) {
        this.f74203a = i;
        if (i == 1) {
            if (this.f74205c.getRealShotSend().getVisibility() == 0) {
                this.f74205c.getRealShotSend().setVisibility(8);
                this.f74211i.setVisibility(0);
            }
            this.f74211i.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114187y3 : ibc0.f114178x3);
            return;
        }
        if (i == 2) {
            this.f74211i.setImageResource(ibc0.f114196z3);
            return;
        }
        if (i == 3) {
            this.f74211i.setVisibility(8);
            this.f74205c.getRealShotSend().setVisibility(0);
            this.f74205c.getRealShotSend().setTextColor(this.f74210h.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102825o));
            this.f74211i.setImageResource(ibc0.f114160v3);
            return;
        }
        if (i != 4) {
            return;
        }
        this.f74211i.setVisibility(8);
        this.f74205c.getRealShotSend().setVisibility(0);
        this.f74205c.getRealShotSend().setTextColor(gta.m132210e().m132214d().mo34702I4() ? this.f74210h.getResources().getColor(g9c0.f102819i) : Color.parseColor("#19000000"));
        this.f74211i.setImageResource(ibc0.f114151u3);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m101217v0() {
        m101216u0(3);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m101218x0() {
        RecorderView.StatusInfo statusInfo = this.f74211i.getStatusInfo();
        if (statusInfo != null) {
            statusInfo.setText(this.f74205c.getBar_center_text().getText().toString().trim());
            this.f74215m.m208403c(statusInfo);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m101219y0(String str, boolean z) {
        this.f74210h.m50150Q2(str, this.f74205c.getBar_center_text().getText().toString().trim(), z);
        m101216u0(1);
        i4g0.m138492A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "1"));
        m101163A0(false);
        m101176H();
        m101188O();
    }

    /* JADX INFO: renamed from: l.azy$c */
    public class C15870c implements qrl {
        public C15870c() {
        }

        @Override // p153l.qrl
        /* JADX INFO: renamed from: a */
        public void mo101223a() {
            azy.this.m101185M();
        }

        @Override // p153l.qrl
        /* JADX INFO: renamed from: b */
        public void mo101224b(Long l2) {
            azy.this.f74205c.getCountDownTimer().setText(String.format("00:%02d", l2));
        }

        @Override // p153l.qrl
        public void onStart() {
            azy.this.f74205c.getCountDownTimer().setVisibility(0);
        }

        @Override // p153l.qrl
        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.azy$h */
    public class C15875h implements xqc0 {
        public C15875h() {
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: b */
        public void mo101226b(String str, boolean z) {
            azy.this.m101219y0(str, z);
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: c */
        public boolean mo101227c() {
            return false;
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: d */
        public void mo101228d() {
            azy.this.m101185M();
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: e */
        public void mo101229e() {
            if (azy.this.f74203a != 2) {
                return;
            }
            bnl0.m105524M(azy.this.f74205c.getMaskLayer(), true);
            azy.this.f74205c.getNoticeBubble().setVisibility(8);
            azy.this.f74205c.getNoticeVideo().setVisibility(8);
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: f */
        public void mo101230f() {
            if (azy.this.f74203a != 2) {
                return;
            }
            bnl0.m105524M(azy.this.f74205c.getMaskLayer(), false);
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: g */
        public void mo101231g() {
            azy.this.m101184L0();
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: h */
        public void mo101232h() {
            azy.this.m101180J0();
        }

        @Override // p153l.xqc0
        public void onCancel() {
            if (azy.this.f74203a != 2) {
                return;
            }
            bnl0.m105524M(azy.this.f74205c.getMaskLayer(), false);
            bnl0.m105524M(azy.this.f74205c.getBarWrapper(), true);
            azy.this.f74205c.getExpandView().setVisibility(0);
            azy.this.f74205c.getBarMaskLayer().setVisibility(0);
            azy.this.f74205c.getSwitchCameraView().setVisibility(0);
            azy.this.m101216u0(1);
            i4g0.m138492A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new pf60("photo_video", "1"));
            azy.this.f74219q.m213262a();
            azy.this.f74205c.getMessageBarRoot().setVisibility(0);
            azy.this.m101183L();
        }

        @Override // p153l.xqc0
        /* JADX INFO: renamed from: a */
        public void mo101225a() {
        }
    }

    /* JADX INFO: renamed from: l.azy$i */
    public class C15876i implements hn50 {
        public C15876i() {
        }

        @Override // p153l.hn50
        /* JADX INFO: renamed from: c */
        public void mo101235c(String str) {
            azy.this.m101187N(str);
        }

        @Override // p153l.hn50
        /* JADX INFO: renamed from: a */
        public void mo101233a(String str) {
        }

        @Override // p153l.hn50
        /* JADX INFO: renamed from: b */
        public void mo101234b(int i) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m101215t0(String str) {
    }

    /* JADX INFO: renamed from: z0 */
    public void m101220z0(boolean z) {
    }
}
