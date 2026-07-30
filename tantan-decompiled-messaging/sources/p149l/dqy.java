package p149l;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.RecorderView;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.ShootingResultView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class dqy {

    /* JADX INFO: renamed from: b */
    public final guy f87520b;

    /* JADX INFO: renamed from: c */
    public final MessageBarOpt f87521c;

    /* JADX INFO: renamed from: d */
    public boolean f87522d;

    /* JADX INFO: renamed from: g */
    public t2h0 f87525g;

    /* JADX INFO: renamed from: h */
    public MessagesAct f87526h;

    /* JADX INFO: renamed from: i */
    public RecorderView f87527i;

    /* JADX INFO: renamed from: j */
    public fqb f87528j;

    /* JADX INFO: renamed from: k */
    public ShootingResultView f87529k;

    /* JADX INFO: renamed from: l */
    public gji f87530l;

    /* JADX INFO: renamed from: m */
    public upd0 f87531m;

    /* JADX INFO: renamed from: n */
    public String f87532n;

    /* JADX INFO: renamed from: o */
    public boolean f87533o;

    /* JADX INFO: renamed from: p */
    public boolean f87534p;

    /* JADX INFO: renamed from: w */
    public boolean f87541w;

    /* JADX INFO: renamed from: a */
    public int f87519a = 1;

    /* JADX INFO: renamed from: e */
    public boolean f87523e = true;

    /* JADX INFO: renamed from: f */
    public boolean f87524f = true;

    /* JADX INFO: renamed from: r */
    public boolean f87536r = false;

    /* JADX INFO: renamed from: s */
    public Runnable f87537s = new RunnableC16439d();

    /* JADX INFO: renamed from: t */
    public Runnable f87538t = new RunnableC16440e();

    /* JADX INFO: renamed from: u */
    public Runnable f87539u = new Runnable() { // from class: l.hpy
        @Override // java.lang.Runnable
        public final void run() {
            this.f109018a.m113187C();
        }
    };

    /* JADX INFO: renamed from: v */
    public Runnable f87540v = new RunnableC16436a();

    /* JADX INFO: renamed from: q */
    public anx f87535q = new anx();

    /* JADX INFO: renamed from: l.dqy$a */
    public class RunnableC16436a implements Runnable {
        public RunnableC16436a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m113243b() {
            dqy dqyVar = dqy.this;
            dqyVar.m113202K(dqyVar.f87541w, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(dqy.this.f87521c.getInputRoot());
            xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(dqy.this.f87521c.getSurfaceContainer());
            Rect rect = new Rect();
            int i = c21104gM208380i0.f192418a - c21104gM208380i1.f192418a;
            rect.left = i;
            int i2 = c21104gM208380i0.f192419b - c21104gM208380i1.f192419b;
            rect.top = i2;
            rect.right = i + c21104gM208380i0.f192420c;
            rect.bottom = i2 + c21104gM208380i0.f192421d;
            if (rect.height() <= 0) {
                int i3 = t100.f167271t;
                rect.top = i3;
                rect.bottom = i3 + t100.f167277z;
            }
            dqy.this.f87521c.m49392w0();
            dqy.this.m113185B(false);
            dqy.this.f87521c.getSurfaceContent().m49404a(rect, new d30() { // from class: l.cqy
                @Override // p149l.d30
                public final void call() {
                    this.f82126a.m113243b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.dqy$b */
    public class C16437b implements ShootingResultView.InterfaceC8537b {
        public C16437b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.ShootingResultView.InterfaceC8537b
        /* JADX INFO: renamed from: a */
        public void mo49225a() {
            dqy.this.m113196G0();
            dqy.this.m113209O();
        }
    }

    /* JADX INFO: renamed from: l.dqy$d */
    public class RunnableC16439d implements Runnable {
        public RunnableC16439d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f87521c.getNoticeBubble().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.dqy$e */
    public class RunnableC16440e implements Runnable {
        public RunnableC16440e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f87521c.getNoticeVideo().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l.dqy$f */
    public class RunnableC16441f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageBarActionItemView f87547a;

        public RunnableC16441f(MessageBarActionItemView messageBarActionItemView) {
            this.f87547a = messageBarActionItemView;
        }

        @Override // java.lang.Runnable
        public void run() {
            dqy.this.f87521c.m49391v0(this.f87547a);
        }
    }

    /* JADX INFO: renamed from: l.dqy$g */
    public class C16442g implements d30 {
        public C16442g() {
        }

        @Override // p149l.d30
        public void call() {
            dqy.this.f87521c.mo48835f();
        }
    }

    /* JADX INFO: renamed from: l.dqy$j */
    public class C16445j implements qg50 {
        public C16445j() {
        }

        @Override // p149l.qg50
        /* JADX INFO: renamed from: a */
        public void mo49562a(Exception exc) {
            dqy.this.m113236t0("takePhoto fail Exception= " + exc.getMessage());
        }

        @Override // p149l.qg50
        public void success(String str) {
            dqy.this.m113207M0(str);
        }
    }

    public dqy(MessageBarOpt messageBarOpt, guy guyVar) {
        this.f87521c = messageBarOpt;
        this.f87520b = guyVar;
        this.f87526h = guyVar.act();
        this.f87527i = messageBarOpt.getCameraFunction();
        zvf0.m220402x("e_live_camera", OMSDialogPositon.p_chat_view);
        m113212R();
        m113213S();
        m113214T();
        m113216Y();
        m113210P();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m113152H0(final Act act, final d30 d30Var, String... strArr) {
        if (!PermissionHelper.m79881b(strArr)) {
            PermissionHelper.m79882c().m79900r(strArr).m79897o(new d30() { // from class: l.lpy
                @Override // p149l.d30
                public final void call() {
                    dqy.m113152H0(act, d30Var, new String[0]);
                }
            }).m79905w(false).m79903u(true).m79891i(act);
            return;
        }
        final Dialog dialogProgress = act.progress(act.getString(R$string.f20973g2));
        if (NullChecker.m81303a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
            dialogProgress.show();
        }
        act.duringCreated(CoreModule.m29934N().cameraSdkLoaded()).subscribe(mkd0.m154956H(new e30() { // from class: l.mpy
            @Override // p149l.e30
            public final void call(Object obj) {
                dqy.m113157b(dialogProgress, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.npy
            @Override // p149l.e30
            public final void call(Object obj) {
                dqy.m113160d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static void m113153U(Act act, d30 d30Var, String... strArr) {
        if (m113158b0()) {
            m113180w0(act, d30Var, strArr);
        } else {
            m113152H0(act, d30Var, strArr);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m113154V(Act act, d30 d30Var) {
        m113153U(act, d30Var, zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: W */
    public static void m113155W(Act act, d30 d30Var) {
        m113153U(act, d30Var, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m113157b(Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (NullChecker.m81303a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m113158b0() {
        return CoreModule.m29934N().isCameraSdkLoaded();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m113160d(Throwable th) {
    }

    /* JADX INFO: renamed from: w0 */
    public static void m113180w0(final Act act, final d30 d30Var, String... strArr) {
        if (!PermissionHelper.m79881b(strArr)) {
            PermissionHelper.m79882c().m79900r(strArr).m79897o(new d30() { // from class: l.ppy
                @Override // p149l.d30
                public final void call() {
                    dqy.m113180w0(act, d30Var, new String[0]);
                }
            }).m79905w(false).m79903u(true).m79891i(act);
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m113184A0(boolean z) {
        ShootingResultView shootingResultView = this.f87529k;
        if (z) {
            xdl0.m208344M(shootingResultView, true);
            xdl0.m208344M(this.f87521c.getSurfaceContainer(), false);
            xdl0.m208344M(this.f87521c.getSwitchCameraView(), false);
        } else {
            xdl0.m208344M(shootingResultView, false);
            xdl0.m208344M(this.f87521c.getSurfaceContainer(), true);
            xdl0.m208344M(this.f87521c.getSwitchCameraView(), true);
            this.f87529k.m49224p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m113185B(boolean z) {
        MessageBarActionItemView messageBarActionItemView = (MessageBarActionItemView) this.f87521c.mo48831b(MessageBarActionItemType.SHI_PAI);
        if (messageBarActionItemView == null) {
            return;
        }
        if (z) {
            bt0.m103746s(bt0.m103733f(bt0.m103743p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), -messageBarActionItemView.getWidth(), 0.0f), new RunnableC16441f(messageBarActionItemView)), bt0.m103743p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), 0.0f)).start();
        } else {
            bt0.m103746s(bt0.m103733f(bt0.m103753z(bt0.m103743p(this.f87521c.m49356M(), "alpha", 0L, 150L, null, 1.0f, 0.0f), bt0.m103743p(this.f87521c.getInputRoot(), "alpha", 0L, 150L, null, 1.0f, 0.0f), bt0.m103743p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), -messageBarActionItemView.getWidth(), 0.0f)), new Runnable() { // from class: l.opy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145068a.m113222f0();
                }
            }), bt0.m103753z(bt0.m103743p(this.f87521c.m49356M(), "alpha", 0L, 150L, null, 0.0f, 1.0f), bt0.m103743p(this.f87521c.getInputRoot(), "alpha", 0L, 150L, null, 0.0f, 1.0f), bt0.m103743p(messageBarActionItemView, "translationX", 0L, 150L, new AccelerateDecelerateInterpolator(), 0.0f))).start();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m113186B0(RecorderView.StatusInfo statusInfo) {
        if (TextUtils.isEmpty(statusInfo.getPath()) || !new File(statusInfo.getPath()).exists()) {
            return;
        }
        m113236t0("shootingResultView StatusInfo = " + statusInfo.toString());
        zvf0.m220402x("e_camera_chat_cancel", OMSDialogPositon.p_chat_view);
        m113184A0(true);
        this.f87527i.setStatusInfo(statusInfo);
        this.f87529k.m49224p();
        this.f87529k.m49221m(statusInfo.getPath(), statusInfo.isPhoto(), xdl0.m208407w(8.0f));
        this.f87521c.getNoticeVideo().setVisibility(8);
        this.f87521c.getBarWrapper().setVisibility(0);
        this.f87521c.getSwitchCameraView().setVisibility(0);
        this.f87521c.getBarMaskLayer().setVisibility(0);
        this.f87521c.getBar_center_text().setText(statusInfo.getText());
        this.f87521c.getBar_center_text().setSpaceHint(this.f87526h.getString(R$string.f20714A5));
        m113238v0();
    }

    /* JADX INFO: renamed from: C */
    public final void m113187C() {
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this.f87521c.getInputRoot());
        xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(this.f87521c.getSurfaceContainer());
        Rect rect = new Rect();
        int i = c21104gM208380i0.f192418a - c21104gM208380i1.f192418a;
        rect.left = i;
        int i2 = c21104gM208380i0.f192419b - c21104gM208380i1.f192419b;
        rect.top = i2;
        rect.right = i + c21104gM208380i0.f192420c;
        rect.bottom = i2 + c21104gM208380i0.f192421d;
        this.f87521c.getSurfaceContent().m49405b(rect, new d30() { // from class: l.upy
            @Override // p149l.d30
            public final void call() {
                this.f177688a.m113223g0();
            }
        }, new C16442g());
        m113185B(true);
    }

    /* JADX INFO: renamed from: C0 */
    public void m113188C0() {
        m113155W(this.f87526h, new d30() { // from class: l.kpy
            @Override // p149l.d30
            public final void call() {
                this.f124203a.m113218a0();
            }
        });
        this.f87520b.m128196m0();
    }

    /* JADX INFO: renamed from: D */
    public void m113189D() {
        m113184A0(false);
        m113197H();
        m113237u0(1);
    }

    /* JADX INFO: renamed from: D0 */
    public void m113190D0() {
        zvf0.m220368A("e_switch_camera", OMSDialogPositon.p_chat_view, new j760("front_back", this.f87535q.m97824h() ? "0" : "1"), new j760("camera_filter_name", this.f87530l.m126528r()));
        if (this.f87523e) {
            return;
        }
        this.f87523e = true;
        this.f87521c.getSingleText().setVisibility(8);
        this.f87521c.getBar_center_text_layout().setVisibility(0);
        this.f87521c.getChangeSizeView().setVisibility(8);
        this.f87521c.getCloseView().setVisibility(8);
        this.f87521c.getExpandView().setVisibility(0);
        int i = this.f87519a;
        if (i == 1 || i == 2) {
            this.f87527i.setVisibility(0);
        } else {
            this.f87521c.getRealShotSend().setVisibility(0);
        }
        this.f87521c.getSwitchCameraView().setVisibility(0);
        this.f87521c.getSwitchCameraView().setClickable(true);
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-1, 0);
        c0220a.f1212B = this.f87526h.getString(R$string.f21095u2);
        this.f87521c.getSurfaceViewRooter().setLayoutParams(c0220a);
        this.f87530l.m126520B(false);
        m113191E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m113191E(boolean z) {
        this.f87529k.m49224p();
        int i = this.f87519a;
        if (i == 3 || i == 4) {
            m113184A0(true);
            this.f87529k.m49215f(z);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m113192E0(RecorderView.StatusInfo statusInfo) {
        if (!m113219c0()) {
            m113184A0(false);
        } else {
            m113186B0(statusInfo);
            this.f87521c.getSurfaceContainer().setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m113193F() {
        m113190D0();
        this.f87521c.getBar_center_text().setFocusable(true);
        this.f87521c.getBar_center_text().setFocusableInTouchMode(true);
        this.f87521c.getBar_center_text().requestFocus();
        e51.m114743H(this.f87526h, new Runnable() { // from class: l.qpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f155837a.m113194F0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: F0 */
    public void m113194F0() {
        this.f87526h.mo48971c0().m156457g0().mo134707f();
    }

    /* JADX INFO: renamed from: G */
    public void m113195G() {
        e51.m114743H(this.f87526h, new Runnable() { // from class: l.spy
            @Override // java.lang.Runnable
            public final void run() {
                this.f165892a.m113224h0();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: G0 */
    public void m113196G0() {
        this.f87529k.m49224p();
        if (this.f87523e) {
            this.f87523e = false;
            if (this.f87519a == 2) {
                return;
            }
            this.f87521c.getSingleText().setVisibility(0);
            String string = this.f87521c.getBar_center_text().getText().toString();
            this.f87521c.getSingleText().setTextColor(-1);
            if (TextUtils.isEmpty(string)) {
                string = this.f87521c.getBar_center_text().getHint().toString();
                this.f87521c.getSingleText().setTextColor(Color.parseColor("#99ffffff"));
            }
            this.f87521c.getSingleText().setText(string);
            this.f87521c.getBar_center_text_layout().setVisibility(8);
            this.f87521c.getChangeSizeView().setVisibility(0);
            this.f87521c.getCloseView().setVisibility(0);
            zvf0.m220402x("e_camera_chat_close", OMSDialogPositon.p_chat_view);
            this.f87521c.getExpandView().setVisibility(8);
            this.f87521c.getNoticeBubble().setVisibility(8);
            this.f87521c.getNoticeVideo().setVisibility(8);
            this.f87527i.setVisibility(8);
            this.f87521c.getRealShotSend().setVisibility(8);
            this.f87521c.getSwitchCameraView().setVisibility(8);
            this.f87521c.getSwitchCameraView().setClickable(false);
            ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-1, 0);
            c0220a.f1212B = "3:1";
            this.f87521c.getSurfaceViewRooter().setLayoutParams(c0220a);
            if (NullChecker.m81303a(this.f87530l)) {
                this.f87530l.m126520B(true);
            }
            m113191E(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m113197H() {
        this.f87521c.getBar_center_text().setText("");
        this.f87527i.setStatusInfo(null);
        this.f87531m.m194852a();
    }

    /* JADX INFO: renamed from: I */
    public void m113198I(boolean z) {
        m113200J(z, true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m113199I0() {
        boolean z;
        boolean zM97827k;
        try {
            zM97827k = this.f87535q.m97827k(this.f87526h);
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
            zM97827k = false;
        }
        if (zM97827k) {
            this.f87535q.m97831o();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m113200J(boolean z, boolean z2) {
        if (!z2) {
            m113202K(z, false);
        } else {
            this.f87541w = z;
            this.f87521c.getSurfaceContent().post(this.f87540v);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m113201J0() {
        zvf0.m220399u("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "0"));
        zvf0.m220368A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "0"));
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        this.f87521c.getNoticeBubble().setVisibility(8);
        this.f87521c.getNoticeVideo().removeCallbacks(this.f87538t);
        this.f87521c.getNoticeVideo().setText(R$string.f21084t);
        this.f87521c.getNoticeVideo().setVisibility(0);
        this.f87521c.getNoticeVideo().postDelayed(this.f87538t, 3000L);
        this.f87535q.m97832p();
        m113237u0(2);
        m113211Q();
        this.f87521c.getBarWrapper().setVisibility(4);
        this.f87521c.getSwitchCameraView().setVisibility(8);
        this.f87521c.getMessageBarRoot().setVisibility(8);
        this.f87521c.getExpandView().setVisibility(8);
        this.f87521c.getBarMaskLayer().setVisibility(8);
    }

    /* JADX INFO: renamed from: K */
    public final void m113202K(boolean z, boolean z2) {
        this.f87522d = false;
        zvf0.m220396r("e_camera_chat_close", OMSDialogPositon.p_chat_view);
        this.f87521c.m49363T();
        this.f87521c.m49349A0();
        this.f87521c.getBar_center_text().setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f87521c.getSurfaceViewRooter().setVisibility(8);
        this.f87527i.setVisibility(8);
        this.f87521c.getCloseView().setVisibility(8);
        this.f87521c.getSurfaceContent().m49408e();
        this.f87521c.getSingleText().setVisibility(8);
        this.f87521c.getBar_center_text_layout().setVisibility(0);
        this.f87521c.getBar_center_text().setHintTextColor(this.f87526h.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67141W));
        xdl0.m208344M(this.f87521c.getBar_send(), !CoreModule.m29935P().m94658i().mo158447t1());
        this.f87521c.getExpandView().setVisibility(8);
        this.f87521c.m49392w0();
        this.f87521c.mo48835f();
        this.f87521c.getBar_center_text().setSpaceHint(this.f87526h.getString(R$string.f20813N0));
        this.f87526h.mo48954A0().m210947x2(3);
        this.f87521c.getNoticeBubble().setVisibility(8);
        this.f87521c.getNoticeVideo().setVisibility(8);
        if (z && NullChecker.m81303a(this.f87527i.getStatusInfo())) {
            m113239x0();
        } else if (NullChecker.m81303a(this.f87527i.getStatusInfo())) {
            m113189D();
        }
        this.f87529k.m49224p();
        if (CoreModule.m29935P().m94658i().mo33514hm()) {
            xdl0.m208344M(this.f87521c.getInputAiView(), true);
        }
        if (this.f87533o) {
            this.f87520b.act().mo48974l().m120842t7().m190322p0().setVisibility(0);
            this.f87520b.act().mo48974l().m120842t7().m190262L1(true);
            this.f87520b.act().mo48974l().m120842t7().m190265O1(true);
        }
        if (this.f87534p && NullChecker.m81303a(this.f87520b.act().mo48974l().m120842t7().m190320o0())) {
            xdl0.m208344M(this.f87520b.act().mo48974l().m120842t7().m190320o0(), true);
        }
        this.f87521c.getBar_center_text().setText(this.f87532n);
        if (z2) {
            m113209O();
        }
        this.f87521c.getSurfaceContainer().removeAllViews();
        this.f87525g = null;
        this.f87535q.m97833q();
        this.f87535q.m97828l();
        this.f87521c.getRealShotSend().setVisibility(8);
        CoreModule.f17545c.f19642f0.f19918Z1 = false;
        if (this.f87526h.mo48974l().m120798l3() != MessageWarmingUpHelper.WarmingUpLevel.not) {
            xdl0.m208344M(this.f87521c.getTempInputLayout(), true);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87521c.getEditRootView().getLayoutParams();
            marginLayoutParams.leftMargin = t100.m186890d(59.0f);
            this.f87521c.getEditRootView().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m113203K0() {
        this.f87535q.m97834r();
    }

    /* JADX INFO: renamed from: L */
    public void m113204L() {
        fqb fqbVar = this.f87528j;
        if (fqbVar != null) {
            fqbVar.m122692c();
        }
        this.f87528j = null;
        this.f87521c.getCountDownTimer().setVisibility(8);
    }

    /* JADX INFO: renamed from: L0 */
    public void m113205L0() {
        zvf0.m220399u("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "1"));
        this.f87535q.m97835s(new C16445j());
    }

    /* JADX INFO: renamed from: M */
    public void m113206M() {
        this.f87535q.m97826j();
        this.f87535q.m97820d(new C16444i());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m113207M0(final String str) {
        ThreadUtil.m81314i(new Runnable() { // from class: l.rpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f160577a.m113235s0(str);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m113208N(final String str) {
        ThreadUtil.m81314i(new Runnable() { // from class: l.tpy
            @Override // java.lang.Runnable
            public final void run() {
                this.f171532a.m113225i0(str);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m113209O() {
        if (this.f87519a == 2) {
            return;
        }
        this.f87526h.mo48971c0().m156457g0().mo134705d();
    }

    /* JADX INFO: renamed from: P */
    public final void m113210P() {
        this.f87521c.getSwitchCameraView().setOnClickListener(new View.OnClickListener() { // from class: l.xpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193967a.m113231o0(view);
            }
        });
        this.f87521c.getExpandView().setOnClickListener(new View.OnClickListener() { // from class: l.ypy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199509a.m113232p0(view);
            }
        });
        this.f87526h.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zpy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204322a.m113226j0((C4319c) obj);
            }
        }));
        this.f87521c.getCloseView().setOnClickListener(new View.OnClickListener() { // from class: l.aqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71219a.m113227k0(view);
            }
        });
        this.f87521c.getChangeSizeView().setOnClickListener(new View.OnClickListener() { // from class: l.bqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76824a.m113228l0(view);
            }
        });
        this.f87521c.getSingleText().setOnClickListener(new View.OnClickListener() { // from class: l.ipy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114362a.m113229m0(view);
            }
        });
        m113215X();
        this.f87521c.getRealShotSend().setOnClickListener(new View.OnClickListener() { // from class: l.jpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119242a.m113230n0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m113211Q() {
        fqb fqbVar = new fqb();
        this.f87528j = fqbVar;
        fqbVar.m122691b(30, new C16438c());
    }

    /* JADX INFO: renamed from: R */
    public final void m113212R() {
        this.f87530l = new gji(this.f87521c, this.f87535q, this);
    }

    /* JADX INFO: renamed from: S */
    public final void m113213S() {
        this.f87520b.act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.wpy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187588a.m113233q0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public final void m113214T() {
        this.f87531m = new upd0("l_s_i_i" + this.f87526h.mo48974l().m120783i3());
    }

    /* JADX INFO: renamed from: X */
    public final void m113215X() {
        this.f87527i.setRecorderCallback(new C16443h());
    }

    /* JADX INFO: renamed from: Y */
    public final void m113216Y() {
        ShootingResultView shootingResultView = new ShootingResultView(this.f87526h);
        this.f87529k = shootingResultView;
        shootingResultView.setResultViewListener(new C16437b());
        this.f87521c.getSurfaceViewRooter().addView(this.f87529k);
        xdl0.m208344M(this.f87529k, false);
        this.f87529k.setCancelClickListener(new View.OnClickListener() { // from class: l.vpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182549a.m113234r0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m113217Z() {
        this.f87535q.m97819c();
        this.f87535q.m97833q();
        m113199I0();
        t2h0 t2h0Var = new t2h0(this.f87526h, this.f87535q);
        this.f87525g = t2h0Var;
        t2h0Var.m186990i();
        this.f87521c.getSurfaceContainer().addView(this.f87525g.m186991j());
        this.f87530l.m126525o();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m113218a0() {
        m113217Z();
        zvf0.m220402x("e_close_camera_chat", OMSDialogPositon.p_chat_view);
        zvf0.m220402x("e_camera_chat_close", OMSDialogPositon.p_chat_view);
        if (this.f87519a == 1) {
            zvf0.m220368A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "1"));
        }
        m113236t0("showBar");
        this.f87522d = true;
        this.f87521c.m49395z0();
        this.f87521c.m49350B0(MessageBarActionItemType.EMOJI, true);
        m113190D0();
        this.f87532n = this.f87521c.getBar_center_text().getText().toString().trim();
        this.f87521c.getBar_center_text().setText("");
        this.f87521c.getBar_center_text().setTextColor(-1);
        this.f87521c.getBar_center_text().setHintTextColor(ura.m195053e().m195057d().mo33699I4() ? 1728053247 : -1711276033);
        this.f87521c.getExpandView().setVisibility(0);
        this.f87521c.getSurfaceViewRooter().setVisibility(0);
        this.f87521c.getSurfaceContent().setVisibility(4);
        this.f87527i.setVisibility(0);
        this.f87521c.getEditRootView().setBackgroundColor(0);
        this.f87521c.getBar_send().setVisibility(8);
        this.f87521c.m49357N();
        if (CoreModule.m29935P().m94658i().mo33514hm()) {
            xdl0.m208344M(this.f87521c.getInputAiView(), false);
        }
        if (!m113219c0()) {
            this.f87521c.getNoticeBubble().removeCallbacks(this.f87537s);
            this.f87521c.getNoticeBubble().setText(R$string.f21092u);
            this.f87521c.getNoticeBubble().setVisibility(0);
            this.f87521c.getNoticeBubble().postDelayed(this.f87537s, 3000L);
        }
        m113192E0((RecorderView.StatusInfo) this.f87531m.m194853b(RecorderView.StatusInfo.class));
        this.f87521c.getSurfaceContent().removeCallbacks(this.f87539u);
        this.f87521c.getSurfaceContent().post(this.f87539u);
        if (this.f87520b.act().mo48974l().m120842t7().m190322p0().getVisibility() == 0) {
            this.f87520b.act().mo48974l().m120842t7().m190322p0().setVisibility(8);
            this.f87520b.act().mo48974l().m120842t7().m190262L1(false);
            this.f87520b.act().mo48974l().m120842t7().m190265O1(false);
            this.f87533o = true;
        } else {
            this.f87533o = false;
        }
        if (NullChecker.m81303a(this.f87520b.act().mo48974l().m120842t7().m190320o0()) && this.f87520b.act().mo48974l().m120842t7().m190320o0().getVisibility() == 0) {
            xdl0.m208344M(this.f87520b.act().mo48974l().m120842t7().m190320o0(), false);
            this.f87534p = true;
        } else {
            this.f87534p = false;
        }
        this.f87520b.m128139J1(true);
        this.f87521c.getBar_center_text().setSpaceHint(this.f87526h.getString(R$string.f20722B5));
        if (this.f87519a == 3) {
            this.f87521c.getRealShotSend().setVisibility(0);
        }
        xdl0.m208344M(this.f87521c.getTempInputLayout(), false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87521c.getEditRootView().getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        this.f87521c.getEditRootView().setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m113219c0() {
        upd0 upd0Var = this.f87531m;
        return (upd0Var == null || upd0Var.m194853b(RecorderView.StatusInfo.class) == null || TextUtils.isEmpty(((RecorderView.StatusInfo) this.f87531m.m194853b(RecorderView.StatusInfo.class)).getPath()) || !new File(((RecorderView.StatusInfo) this.f87531m.m194853b(RecorderView.StatusInfo.class)).getPath()).exists()) ? false : true;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m113220d0() {
        return this.f87522d;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m113221e0(String str, boolean z) {
        this.f87521c.getExpandView().setVisibility(0);
        RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, z);
        statusInfo.setText(this.f87521c.getBar_center_text().getText().toString().trim());
        xdl0.m208320A(this.f87521c.getBar_center_text());
        m113186B0(statusInfo);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m113222f0() {
        this.f87521c.getSingleText().setVisibility(8);
        this.f87521c.getBar_center_text_layout().setVisibility(0);
        this.f87521c.getBar_center_text().setHintTextColor(this.f87526h.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67141W));
        this.f87521c.m49363T();
        this.f87521c.m49349A0();
        this.f87521c.getBar_send().setVisibility(0);
        this.f87521c.mo48835f();
        this.f87521c.getBar_center_text().setSpaceHint(this.f87526h.getString(R$string.f20813N0));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m113223g0() {
        xdl0.m208345M0(this.f87521c.getSurfaceContent(), true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m113224h0() {
        m113190D0();
        this.f87521c.getBar_center_text().setFocusable(true);
        m113194F0();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m113225i0(String str) {
        m113204L();
        this.f87521c.getMessageBarRoot().setVisibility(0);
        m113221e0(str, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m113226j0(C4319c c4319c) {
        if (c4319c == C4319c.f15550k && m113220d0() && this.f87523e) {
            m113196G0();
            m113209O();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m113227k0(View view) {
        m113198I(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m113228l0(View view) {
        m113193F();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m113229m0(View view) {
        m113193F();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m113230n0(View view) {
        RecorderView.StatusInfo statusInfo = this.f87527i.getStatusInfo();
        if (statusInfo != null) {
            m113240y0(statusInfo.getPath(), statusInfo.isPhoto());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m113231o0(View view) {
        m113203K0();
        zvf0.m220399u("e_switch_camera", OMSDialogPositon.p_chat_view, new j760("front_back", this.f87535q.m97824h() ? "0" : "1"), new j760("camera_filter_name", this.f87530l.m126528r()));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m113232p0(View view) {
        m113196G0();
        m113209O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m113233q0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && (this.f87535q.m97825i() || m113220d0())) {
            this.f87536r = true;
            this.f87535q.m97833q();
            m113199I0();
            return;
        }
        if (c4319c != C4319c.f15549j || (!this.f87535q.m97825i() && !m113220d0())) {
            if (c4319c == C4319c.f15552m) {
                m113204L();
                m113198I(true);
                if (NullChecker.m81303a(this.f87530l)) {
                    this.f87530l.m126526p();
                    return;
                }
                return;
            }
            return;
        }
        this.f87536r = false;
        this.f87535q.m97833q();
        if (NullChecker.m81303a(this.f87529k)) {
            this.f87529k.m49224p();
        }
        t2h0 t2h0Var = this.f87525g;
        if (t2h0Var != null) {
            t2h0Var.m186992k(true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m113234r0(View view) {
        m113189D();
        zvf0.m220368A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "1"));
        zvf0.m220396r("e_camera_chat_cancel", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m113235s0(String str) {
        m113221e0(str, true);
    }

    /* JADX INFO: renamed from: u0 */
    public void m113237u0(int i) {
        this.f87519a = i;
        if (i == 1) {
            if (this.f87521c.getRealShotSend().getVisibility() == 0) {
                this.f87521c.getRealShotSend().setVisibility(8);
                this.f87527i.setVisibility(0);
            }
            this.f87527i.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78912y3 : c3c0.f78903x3);
            return;
        }
        if (i == 2) {
            this.f87527i.setImageResource(c3c0.f78921z3);
            return;
        }
        if (i == 3) {
            this.f87527i.setVisibility(8);
            this.f87521c.getRealShotSend().setVisibility(0);
            this.f87521c.getRealShotSend().setTextColor(this.f87526h.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67161o));
            this.f87527i.setImageResource(c3c0.f78885v3);
            return;
        }
        if (i != 4) {
            return;
        }
        this.f87527i.setVisibility(8);
        this.f87521c.getRealShotSend().setVisibility(0);
        this.f87521c.getRealShotSend().setTextColor(ura.m195053e().m195057d().mo33699I4() ? this.f87526h.getResources().getColor(a1c0.f67155i) : Color.parseColor("#19000000"));
        this.f87527i.setImageResource(c3c0.f78876u3);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m113238v0() {
        m113237u0(3);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m113239x0() {
        RecorderView.StatusInfo statusInfo = this.f87527i.getStatusInfo();
        if (statusInfo != null) {
            statusInfo.setText(this.f87521c.getBar_center_text().getText().toString().trim());
            this.f87531m.m194854c(statusInfo);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m113240y0(String str, boolean z) {
        this.f87526h.m48966N2(str, this.f87521c.getBar_center_text().getText().toString().trim(), z);
        m113237u0(1);
        zvf0.m220368A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "1"));
        m113184A0(false);
        m113197H();
        m113209O();
    }

    /* JADX INFO: renamed from: l.dqy$c */
    public class C16438c implements epl {
        public C16438c() {
        }

        @Override // p149l.epl
        /* JADX INFO: renamed from: a */
        public void mo113244a() {
            dqy.this.m113206M();
        }

        @Override // p149l.epl
        /* JADX INFO: renamed from: b */
        public void mo113245b(Long l2) {
            dqy.this.f87521c.getCountDownTimer().setText(String.format("00:%02d", l2));
        }

        @Override // p149l.epl
        public void onStart() {
            dqy.this.f87521c.getCountDownTimer().setVisibility(0);
        }

        @Override // p149l.epl
        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.dqy$h */
    public class C16443h implements qic0 {
        public C16443h() {
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: b */
        public void mo113247b(String str, boolean z) {
            dqy.this.m113240y0(str, z);
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: c */
        public boolean mo113248c() {
            return false;
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: d */
        public void mo113249d() {
            dqy.this.m113206M();
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: e */
        public void mo113250e() {
            if (dqy.this.f87519a != 2) {
                return;
            }
            xdl0.m208344M(dqy.this.f87521c.getMaskLayer(), true);
            dqy.this.f87521c.getNoticeBubble().setVisibility(8);
            dqy.this.f87521c.getNoticeVideo().setVisibility(8);
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: f */
        public void mo113251f() {
            if (dqy.this.f87519a != 2) {
                return;
            }
            xdl0.m208344M(dqy.this.f87521c.getMaskLayer(), false);
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: g */
        public void mo113252g() {
            dqy.this.m113205L0();
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: h */
        public void mo113253h() {
            dqy.this.m113201J0();
        }

        @Override // p149l.qic0
        public void onCancel() {
            if (dqy.this.f87519a != 2) {
                return;
            }
            xdl0.m208344M(dqy.this.f87521c.getMaskLayer(), false);
            xdl0.m208344M(dqy.this.f87521c.getBarWrapper(), true);
            dqy.this.f87521c.getExpandView().setVisibility(0);
            dqy.this.f87521c.getBarMaskLayer().setVisibility(0);
            dqy.this.f87521c.getSwitchCameraView().setVisibility(0);
            dqy.this.m113237u0(1);
            zvf0.m220368A("e_camera_chat_on", OMSDialogPositon.p_chat_view, new j760("photo_video", "1"));
            dqy.this.f87535q.m97817a();
            dqy.this.f87521c.getMessageBarRoot().setVisibility(0);
            dqy.this.m113204L();
        }

        @Override // p149l.qic0
        /* JADX INFO: renamed from: a */
        public void mo113246a() {
        }
    }

    /* JADX INFO: renamed from: l.dqy$i */
    public class C16444i implements af50 {
        public C16444i() {
        }

        @Override // p149l.af50
        /* JADX INFO: renamed from: c */
        public void mo96187c(String str) {
            dqy.this.m113208N(str);
        }

        @Override // p149l.af50
        /* JADX INFO: renamed from: a */
        public void mo96185a(String str) {
        }

        @Override // p149l.af50
        /* JADX INFO: renamed from: b */
        public void mo96186b(int i) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m113236t0(String str) {
    }

    /* JADX INFO: renamed from: z0 */
    public void m113241z0(boolean z) {
    }
}
