package p002l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.base.data.BLiveCustomToast;
import l.e30;
import l.ffw;
import l.hxs;
import l.l3m;
import l.rqi;
import l.t100;
import l.ypv;
import l.zvf0;
import rx.c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vyb extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public Dialog f21378i;

    /* JADX INFO: renamed from: l.vyb$a */
    public class DialogInterfaceOnKeyListenerC0869a implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC0869a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    /* JADX INFO: renamed from: l.vyb$b */
    public class RunnableC0870b implements Runnable {
        public RunnableC0870b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialog = vyb.this.f21378i;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            vyb.this.f21378i.dismiss();
            vyb.this.f21378i = null;
        }
    }

    public vyb(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m24223J3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public final void m24225L3(long j) {
        m14207z3(j, new RunnableC0870b());
    }

    /* JADX INFO: renamed from: N3 */
    public void m24227N3(BLiveCustomToast bLiveCustomToast) {
        VDraweeView vDraweeViewFindViewById = this.f21378i.P().findViewById(g5c0.f10791A2);
        VText vTextFindViewById = this.f21378i.P().findViewById(g5c0.f10888L0);
        VText vTextFindViewById2 = this.f21378i.P().findViewById(g5c0.f10816D0);
        hxs.s("context_livingAct", vDraweeViewFindViewById, bLiveCustomToast.icon);
        if (!TextUtils.isEmpty(bLiveCustomToast.color)) {
            GradientDrawable gradientDrawable = (GradientDrawable) vDraweeViewFindViewById.getBackground();
            gradientDrawable.setColor(Color.parseColor(bLiveCustomToast.color));
            vDraweeViewFindViewById.setBackground(gradientDrawable);
        }
        if (bLiveCustomToast.count != 0) {
            vTextFindViewById.setVisibility(0);
            vTextFindViewById.setText(String.format("x%s", Integer.valueOf(bLiveCustomToast.count)));
        } else {
            vTextFindViewById.setVisibility(8);
        }
        vTextFindViewById2.setText(bLiveCustomToast.content);
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void m24226M3(BLiveCustomToast bLiveCustomToast) {
        int i;
        if (bLiveCustomToast != null && (i = bLiveCustomToast.displayTime) > 0 && this.f21378i == null) {
            m24225L3(i);
            Dialog dialogZ = this.f22037f.dialog().M(t6c0.f19963p0).v().z();
            this.f21378i = dialogZ;
            Window window = dialogZ.getWindow();
            if (rqi.d().b(ypv.e)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2005);
                }
            }
            if (!this.f21378i.isShowing() && !this.f22037f.isFinishing()) {
                zvf0.x(bLiveCustomToast.eid, bLiveCustomToast.pid);
                m24227N3(bLiveCustomToast);
                this.f21378i.show();
            }
            window.setWindowAnimations(0);
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags = 8;
            attributes.width = t100.d(225.0f);
            attributes.height = t100.d(68.0f);
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
            this.f21378i.setCanceledOnTouchOutside(false);
            this.f21378i.setOnKeyListener(new DialogInterfaceOnKeyListenerC0869a());
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        Dialog dialog = this.f21378i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f21378i.dismiss();
        this.f21378i = null;
    }

    /* JADX INFO: renamed from: s2 */
    public void m24229s2() {
        super.s2();
        Dialog dialog = this.f21378i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f21378i.dismiss();
        this.f21378i = null;
    }

    /* JADX INFO: renamed from: t */
    public void m24230t() {
        super.t();
        duringCreated((c) m25548F2().CustomToastEvent.showCustomToast().g()).subscribe(ffw.e(new e30() { // from class: l.tyb
            public final void call(Object obj) {
                this.f20424a.m24226M3((BLiveCustomToast) obj);
            }
        }, new e30() { // from class: l.uyb
            public final void call(Object obj) {
                vyb.m24223J3((Throwable) obj);
            }
        }));
    }
}
