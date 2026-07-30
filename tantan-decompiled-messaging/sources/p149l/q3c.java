package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.verifyemail.EmailSendedAct;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.DownloadDataCheck;
import com.p046p1.mobile.putong.data.EmailVerifyData;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes9.dex */
public class q3c extends jq2<b4c> {

    /* JADX INFO: renamed from: a */
    public long f152397a;

    /* JADX INFO: renamed from: b */
    public long f152398b;

    /* JADX INFO: renamed from: c */
    public long f152399c;

    public q3c(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ roj0 m172747j0() {
        try {
            k9j.m145073E();
            rhi.m179358b(qib0.m174833t0());
            rhi.m179358b(sl2.f165095d);
            rhi.m179358b(sl2.f165096e);
            rhi.m179358b(new File(c400.f79142d));
            rhi.m179358b(new File(c400.f79143e));
        } catch (IOException unused) {
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m172750u0(Bundle bundle) {
        this.f152397a = rhi.m179372p(qib0.m174833t0());
        this.f152398b = rhi.m179372p(sl2.f165095d);
        long jM179372p = rhi.m179372p(sl2.f165096e);
        this.f152399c = jM179372p;
        ((b4c) this.viewModel).m100236H(t0g0.m186870k(this.f152397a + this.f152398b + jM179372p));
        if (IntlCountryCodeController.m28113i()) {
            ((b4c) this.viewModel).m100242p(true);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m172751A0() {
        CoreModule.f17545c.f19660l0.runnerStop();
    }

    /* JADX INFO: renamed from: C0 */
    public void m172752C0(int i, int i2, Intent intent) {
        if (IntlCountryCodeController.m28113i() && i == 1 && i2 == -1) {
            m172755n0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m172753D0(final String str, final d30 d30Var) {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.m29931H().downloadDataVerifyEmail(EmailVerifyData.createData(str))).subscribe(mkd0.m154956H(new e30() { // from class: l.m3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131033a.m172762x0(d30Var, str, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.n3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136934a.m172763y0(d30Var, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.k3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120812a.m172750u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m172754m0(long j) {
        return mqi0.m155944o() - (j * 1000) > 604800000;
    }

    /* JADX INFO: renamed from: n0 */
    public void m172755n0() {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.m29931H().checkDownloadData()).subscribe(mkd0.m154956H(new e30() { // from class: l.i3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110636a.m172758q0((DownloadDataCheck) obj);
            }
        }, new e30() { // from class: l.j3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116022a.m172759r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m172756o0() {
        C22306c.fromCallable(new Callable() { // from class: l.o3c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q3c.m172747j0();
            }
        }).compose(mkd0.m154951C()).materialize().subscribe(mkd0.m154955G(new e30() { // from class: l.p3c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146976a.m172760s0((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public Dialog.InterfaceC4311g m172757p0(final int i) {
        return new Dialog.InterfaceC4311g() { // from class: l.l3c
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f125866a.m172761t0(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m172758q0(DownloadDataCheck downloadDataCheck) {
        act().progressDismiss();
        boolean zM172754m0 = m172754m0(downloadDataCheck.last_apply_time);
        V v2 = this.viewModel;
        if (zM172754m0) {
            ((b4c) v2).m100239L();
        } else {
            ((b4c) v2).m100243q();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m172759r0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m172760s0(Notification notification) {
        ((b4c) this.viewModel).m100245u();
        this.f152399c = 0L;
        this.f152398b = 0L;
        this.f152397a = 0L;
        ((b4c) this.viewModel).m100237I(t0g0.m186870k(0L));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m172761t0(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                hpd0 hpd0Var = gl5.f103295c;
                Boolean bool = Boolean.TRUE;
                hpd0Var.put(bool);
                gl5.f103293a.put(bool);
            } else if (i2 == 1) {
                gl5.f103295c.put(Boolean.FALSE);
                gl5.f103293a.put(Boolean.TRUE);
            } else {
                hpd0 hpd0Var2 = gl5.f103295c;
                Boolean bool2 = Boolean.FALSE;
                hpd0Var2.put(bool2);
                gl5.f103293a.put(bool2);
            }
            ((b4c) this.viewModel).m100235G(i2);
            ej1.m116750b().m116751a().onNext(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m172762x0(d30 d30Var, String str, AccountErrorResponse accountErrorResponse) {
        d30Var.call();
        act().progressDismiss();
        act().startActivityForResult(EmailSendedAct.m55684Y1(act(), str), 1);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m172763y0(d30 d30Var, Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            if (!(th instanceof TantanException.ServerException)) {
                yij0.m214926D(th);
                return;
            } else {
                if (((TantanException.ServerException) th).code == 50001) {
                    lsi0.m151578h(R$string.f17752G5);
                    return;
                }
                return;
            }
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40003) {
            lsi0.m151578h(R$string.f17695E8);
        } else {
            if (i != 40090) {
                return;
            }
            d30Var.call();
            s4e.m182217g(act(), act().string(R$string.f17782H5), act().string(R$string.f19076xr));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m172764z0() {
        CoreModule.f17545c.f19660l0.runnerStart();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
