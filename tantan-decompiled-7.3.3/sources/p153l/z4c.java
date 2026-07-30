package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.verifyemail.EmailSendedAct;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.DownloadDataCheck;
import com.p051p1.mobile.putong.data.EmailVerifyData;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes12.dex */
public class z4c extends ar2<k5c> {

    /* JADX INFO: renamed from: a */
    public long f202922a;

    /* JADX INFO: renamed from: b */
    public long f202923b;

    /* JADX INFO: renamed from: c */
    public long f202924c;

    public z4c(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ uxj0 m218555j0() {
        try {
            ecj.m120371E();
            oki.m168014b(uqb0.m197287t0());
            oki.m168014b(am2.f72187d);
            oki.m168014b(am2.f72188e);
            oki.m168014b(new File(uc00.f178394a));
            oki.m168014b(new File(uc00.f178395b));
        } catch (IOException unused) {
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m218558u0(Bundle bundle) {
        this.f202922a = oki.m168028p(uqb0.m197287t0());
        this.f202923b = oki.m168028p(am2.f72187d);
        long jM168028p = oki.m168028p(am2.f72188e);
        this.f202924c = jM168028p;
        ((k5c) this.viewModel).m148337H(a9g0.m96576k(this.f202922a + this.f202923b + jM168028p));
        if (IntlCountryCodeController.m29112i()) {
            ((k5c) this.viewModel).m148343p(true);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m218559A0() {
        CoreModule.f18264c.f20402l0.runnerStop();
    }

    /* JADX INFO: renamed from: C0 */
    public void m218560C0(int i, int i2, Intent intent) {
        if (IntlCountryCodeController.m29112i() && i == 1 && i2 == -1) {
            m218563n0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m218561D0(final String str, final x20 x20Var) {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.m30929H().downloadDataVerifyEmail(EmailVerifyData.createData(str))).subscribe(psd0.m173597H(new y20() { // from class: l.v4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182346a.m218570x0(x20Var, str, (AccountErrorResponse) obj);
            }
        }, new y20() { // from class: l.w4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187365a.m218571y0(x20Var, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.t4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172061a.m218558u0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m218562m0(long j) {
        return pzi0.m174454o() - (j * 1000) > 604800000;
    }

    /* JADX INFO: renamed from: n0 */
    public void m218563n0() {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.m30929H().checkDownloadData()).subscribe(psd0.m173597H(new y20() { // from class: l.r4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161188a.m218566q0((DownloadDataCheck) obj);
            }
        }, new y20() { // from class: l.s4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166184a.m218567r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m218564o0() {
        C22421c.fromCallable(new Callable() { // from class: l.x4c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z4c.m218555j0();
            }
        }).compose(psd0.m173592C()).materialize().subscribe(psd0.m173596G(new y20() { // from class: l.y4c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197446a.m218568s0((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public Dialog.InterfaceC4462g m218565p0(final int i) {
        return new Dialog.InterfaceC4462g() { // from class: l.u4c
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i2, CharSequence charSequence) {
                this.f177456a.m218569t0(i, dialog, view, i2, charSequence);
            }
        };
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m218566q0(DownloadDataCheck downloadDataCheck) {
        act().progressDismiss();
        boolean zM218562m0 = m218562m0(downloadDataCheck.last_apply_time);
        V v2 = this.viewModel;
        if (zM218562m0) {
            ((k5c) v2).m148340L();
        } else {
            ((k5c) v2).m148344q();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m218567r0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m218568s0(Notification notification) {
        ((k5c) this.viewModel).m148346u();
        this.f202924c = 0L;
        this.f202923b = 0L;
        this.f202922a = 0L;
        ((k5c) this.viewModel).m148338I(a9g0.m96576k(0L));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m218569t0(int i, Dialog dialog, View view, int i2, CharSequence charSequence) {
        if (i != i2) {
            if (i2 == 0) {
                jxd0 jxd0Var = jm5.f121640c;
                Boolean bool = Boolean.TRUE;
                jxd0Var.put(bool);
                jm5.f121638a.put(bool);
            } else if (i2 == 1) {
                jm5.f121640c.put(Boolean.FALSE);
                jm5.f121638a.put(Boolean.TRUE);
            } else {
                jxd0 jxd0Var2 = jm5.f121640c;
                Boolean bool2 = Boolean.FALSE;
                jxd0Var2.put(bool2);
                jm5.f121638a.put(bool2);
            }
            ((k5c) this.viewModel).m148336G(i2);
            lj1.m154454b().m154455a().onNext(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m218570x0(x20 x20Var, String str, AccountErrorResponse accountErrorResponse) {
        x20Var.call();
        act().progressDismiss();
        act().startActivityForResult(EmailSendedAct.m56867Z1(act(), str), 1);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m218571y0(x20 x20Var, Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            if (!(th instanceof TantanException.ServerException)) {
                bsj0.m106246D(th);
                return;
            } else {
                if (((TantanException.ServerException) th).code == 50001) {
                    o1j0.m165634h(R$string.f18539I5);
                    return;
                }
                return;
            }
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40003) {
            o1j0.m165634h(R$string.f18480G8);
        } else {
            if (i != 40090) {
                return;
            }
            x20Var.call();
            g6e.m129245g(act(), act().string(R$string.f18570J5), act().string(R$string.f18894Tr));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m218572z0() {
        CoreModule.f18264c.f20402l0.runnerStart();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
