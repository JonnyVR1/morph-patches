package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.verifyemail.EmailSendedAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.DownloadDataCheck;
import com.p1.mobile.putong.data.EmailVerifyData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.gl5;
import l.hpd0;
import l.jq2;
import l.k9j;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.rhi;
import l.roj0;
import l.s4e;
import l.s7m;
import l.sl2;
import l.t0g0;
import l.yij0;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class q3c extends jq2<b4c> {

    /* JADX INFO: renamed from: a */
    public long f19558a;

    /* JADX INFO: renamed from: b */
    public long f19559b;

    /* JADX INFO: renamed from: c */
    public long f19560c;

    public q3c(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ roj0 m21935j0() {
        try {
            k9j.E();
            rhi.b(qib0.m22177t0());
            rhi.b(sl2.d);
            rhi.b(sl2.e);
            rhi.b(new File(c400.f9341d));
            rhi.b(new File(c400.f9342e));
        } catch (IOException unused) {
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
        }
        return roj0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m21938u0(Bundle bundle) {
        this.f19558a = rhi.p(qib0.m22177t0());
        this.f19559b = rhi.p(sl2.d);
        long jP = rhi.p(sl2.e);
        this.f19560c = jP;
        ((b4c) ((jq2) this).viewModel).m12540H(t0g0.k(this.f19558a + this.f19559b + jP));
        if (IntlCountryCodeController.m8i()) {
            ((b4c) ((jq2) this).viewModel).m12547p(true);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m21939A0() {
        CoreModule.f1534c.f3649l0.runnerStop();
    }

    /* JADX INFO: renamed from: C0 */
    public void m21940C0(int i, int i2, Intent intent) {
        if (IntlCountryCodeController.m8i() && i == 1 && i2 == -1) {
            m21944n0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m21941D0(final String str, final d30 d30Var) {
        act().progress(R$string.f1831J5);
        duringCreated(CoreModule.m1850H().downloadDataVerifyEmail(EmailVerifyData.createData(str))).subscribe(mkd0.H(new e30() { // from class: l.m3c
            public final void call(Object obj) {
                this.f16783a.m21951x0(d30Var, str, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.n3c
            public final void call(Object obj) {
                this.f17462a.m21952y0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m21942a0() {
        creates(new e30() { // from class: l.k3c
            public final void call(Object obj) {
                this.f15585a.m21938u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m21943m0(long j) {
        return mqi0.o() - (j * 1000) > 604800000;
    }

    /* JADX INFO: renamed from: n0 */
    public void m21944n0() {
        act().progress(R$string.f1831J5);
        duringCreated(CoreModule.m1850H().checkDownloadData()).subscribe(mkd0.H(new e30() { // from class: l.i3c
            public final void call(Object obj) {
                this.f14218a.m21947q0((DownloadDataCheck) obj);
            }
        }, new e30() { // from class: l.j3c
            public final void call(Object obj) {
                this.f14987a.m21948r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m21945o0() {
        c.fromCallable(new Callable() { // from class: l.o3c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q3c.m21935j0();
            }
        }).compose(mkd0.C()).materialize().subscribe(mkd0.G(new e30() { // from class: l.p3c
            public final void call(Object obj) {
                this.f18582a.m21949s0((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public Dialog.g m21946p0(final int i) {
        return new Dialog.g() { // from class: l.l3c
            /* JADX INFO: renamed from: a */
            public final void m18563a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f16216a.m21950t0(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m21947q0(DownloadDataCheck downloadDataCheck) {
        act().progressDismiss();
        boolean zM21943m0 = m21943m0(downloadDataCheck.last_apply_time);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zM21943m0) {
            ((b4c) s7mVar).m12543L();
        } else {
            ((b4c) s7mVar).m12548q();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m21948r0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m21949s0(Notification notification) {
        ((b4c) ((jq2) this).viewModel).m12550u();
        this.f19560c = 0L;
        this.f19559b = 0L;
        this.f19558a = 0L;
        ((b4c) ((jq2) this).viewModel).m12541I(t0g0.k(0L));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m21950t0(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                hpd0 hpd0Var = gl5.c;
                Boolean bool = Boolean.TRUE;
                hpd0Var.put(bool);
                gl5.a.put(bool);
            } else if (i2 == 1) {
                gl5.c.put(Boolean.FALSE);
                gl5.a.put(Boolean.TRUE);
            } else {
                hpd0 hpd0Var2 = gl5.c;
                Boolean bool2 = Boolean.FALSE;
                hpd0Var2.put(bool2);
                gl5.a.put(bool2);
            }
            ((b4c) ((jq2) this).viewModel).m12539G(i2);
            ej1.m14552b().m14553a().onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m21951x0(d30 d30Var, String str, AccountErrorResponse accountErrorResponse) {
        d30Var.call();
        act().progressDismiss();
        act().startActivityForResult(EmailSendedAct.m9081Y1(act(), str), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m21952y0(d30 d30Var, Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            if (!(th instanceof TantanException.ServerException)) {
                yij0.D(th);
                return;
            } else {
                if (((TantanException.ServerException) th).code == 50001) {
                    lsi0.h(R$string.f1741G5);
                    return;
                }
                return;
            }
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40003) {
            lsi0.h(R$string.f1684E8);
        } else {
            if (i != 40090) {
                return;
            }
            d30Var.call();
            s4e.g(act(), act().string(R$string.f1771H5), act().string(R$string.f3065xr));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m21953z0() {
        CoreModule.f1534c.f3649l0.runnerStart();
    }

    public void destroy() {
    }
}
