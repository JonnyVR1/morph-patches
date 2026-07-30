package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveCustomToast;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vyb extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public Dialog f183511i;

    /* JADX INFO: renamed from: l.vyb$a */
    public class DialogInterfaceOnKeyListenerC20759a implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC20759a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    /* JADX INFO: renamed from: l.vyb$b */
    public class RunnableC20760b implements Runnable {
        public RunnableC20760b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialog = vyb.this.f183511i;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            vyb.this.f183511i.dismiss();
            vyb.this.f183511i = null;
        }
    }

    public vyb(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m200620J3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public final void m200622L3(long j) {
        m129320z3(j, new RunnableC20760b());
    }

    /* JADX INFO: renamed from: N3 */
    public void m200624N3(BLiveCustomToast bLiveCustomToast) {
        VDraweeView vDraweeView = (VDraweeView) this.f183511i.m20458P().findViewById(g5c0.f100641A2);
        VText vText = (VText) this.f183511i.m20458P().findViewById(g5c0.f100738L0);
        VText vText2 = (VText) this.f183511i.m20458P().findViewById(g5c0.f100666D0);
        hxs.m133406s("context_livingAct", vDraweeView, bLiveCustomToast.icon);
        if (!TextUtils.isEmpty(bLiveCustomToast.color)) {
            GradientDrawable gradientDrawable = (GradientDrawable) vDraweeView.getBackground();
            gradientDrawable.setColor(Color.parseColor(bLiveCustomToast.color));
            vDraweeView.setBackground(gradientDrawable);
        }
        if (bLiveCustomToast.count != 0) {
            vText.setVisibility(0);
            vText.setText(String.format("x%s", Integer.valueOf(bLiveCustomToast.count)));
        } else {
            vText.setVisibility(8);
        }
        vText2.setText(bLiveCustomToast.content);
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void m200623M3(BLiveCustomToast bLiveCustomToast) {
        int i;
        if (bLiveCustomToast != null && (i = bLiveCustomToast.displayTime) > 0 && this.f183511i == null) {
            m200622L3(i);
            Dialog dialogM20567z = this.f188513f.dialog().m20517M(t6c0.f168467p0).m20559v().m20567z();
            this.f183511i = dialogM20567z;
            Window window = dialogM20567z.getWindow();
            if (rqi.m180453d().m180455b(ypv.f199497e)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2005);
                }
            }
            if (!this.f183511i.isShowing() && !this.f188513f.isFinishing()) {
                zvf0.m220402x(bLiveCustomToast.eid, bLiveCustomToast.pid);
                m200624N3(bLiveCustomToast);
                this.f183511i.show();
            }
            window.setWindowAnimations(0);
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags = 8;
            attributes.width = t100.m186890d(225.0f);
            attributes.height = t100.m186890d(68.0f);
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
            this.f183511i.setCanceledOnTouchOutside(false);
            this.f183511i.setOnKeyListener(new DialogInterfaceOnKeyListenerC20759a());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        Dialog dialog = this.f183511i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f183511i.dismiss();
        this.f183511i = null;
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        Dialog dialog = this.f183511i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f183511i.dismiss();
        this.f183511i = null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CustomToastEvent.showCustomToast().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.tyb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172571a.m200623M3((BLiveCustomToast) obj);
            }
        }, new e30() { // from class: l.uyb
            @Override // p149l.e30
            public final void call(Object obj) {
                vyb.m200620J3((Throwable) obj);
            }
        }));
    }
}
