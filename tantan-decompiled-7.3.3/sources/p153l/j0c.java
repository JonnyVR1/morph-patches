package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveCustomToast;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j0c extends qct<oo2> implements c6m {

    /* JADX INFO: renamed from: i */
    public Dialog f117809i;

    /* JADX INFO: renamed from: l.j0c$a */
    public class DialogInterfaceOnKeyListenerC17837a implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC17837a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    /* JADX INFO: renamed from: l.j0c$b */
    public class RunnableC17838b implements Runnable {
        public RunnableC17838b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialog = j0c.this.f117809i;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            j0c.this.f117809i.dismiss();
            j0c.this.f117809i = null;
        }
    }

    public j0c(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m142963J3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public final void m142965L3(long j) {
        m138879z3(j, new RunnableC17838b());
    }

    /* JADX INFO: renamed from: N3 */
    public void m142967N3(BLiveCustomToast bLiveCustomToast) {
        VDraweeView vDraweeView = (VDraweeView) this.f117809i.m21457P().findViewById(mdc0.f135886A2);
        VText vText = (VText) this.f117809i.m21457P().findViewById(mdc0.f135983L0);
        VText vText2 = (VText) this.f117809i.m21457P().findViewById(mdc0.f135911D0);
        izs.m142868s("context_livingAct", vDraweeView, bLiveCustomToast.icon);
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
    public void m142966M3(BLiveCustomToast bLiveCustomToast) {
        int i;
        if (bLiveCustomToast != null && (i = bLiveCustomToast.displayTime) > 0 && this.f117809i == null) {
            m142965L3(i);
            Dialog dialogM21566z = this.f196919f.dialog().m21516M(yec0.f199199p0).m21558v().m21566z();
            this.f117809i = dialogM21566z;
            Window window = dialogM21566z.getWindow();
            if (nti.m164730d().m164732b(zrv.f205803e)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2005);
                }
            }
            if (!this.f117809i.isShowing() && !this.f196919f.isFinishing()) {
                i4g0.m138526x(bLiveCustomToast.eid, bLiveCustomToast.pid);
                m142967N3(bLiveCustomToast);
                this.f117809i.show();
            }
            window.setWindowAnimations(0);
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags = 8;
            attributes.width = qa00.m175859d(225.0f);
            attributes.height = qa00.m175859d(68.0f);
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
            this.f117809i.setCanceledOnTouchOutside(false);
            this.f117809i.setOnKeyListener(new DialogInterfaceOnKeyListenerC17837a());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        Dialog dialog = this.f117809i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f117809i.dismiss();
        this.f117809i = null;
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        Dialog dialog = this.f117809i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f117809i.dismiss();
        this.f117809i = null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CustomToastEvent.showCustomToast().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.h0c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107282a.m142966M3((BLiveCustomToast) obj);
            }
        }, new y20() { // from class: l.i0c
            @Override // p153l.y20
            public final void call(Object obj) {
                j0c.m142963J3((Throwable) obj);
            }
        }));
    }
}
