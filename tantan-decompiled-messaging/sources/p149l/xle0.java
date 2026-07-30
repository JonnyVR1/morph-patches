package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xle0 extends jq2<bme0> {

    /* JADX INFO: renamed from: a */
    public String f193409a;

    /* JADX INFO: renamed from: b */
    public String f193410b;

    /* JADX INFO: renamed from: c */
    public String f193411c;

    public xle0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m209877k0(Bundle bundle) {
        ((bme0) this.viewModel).m102653r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.sle0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165189a.m209877k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m209878j0(String str) {
        this.f193411c = str;
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(str);
        this.f193410b = strM169561y7;
        this.f193409a = strM169561y7;
        ((bme0) this.viewModel).m102651i(strM169561y7);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m209880m0() {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m209881n0(roj0 roj0Var) {
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m209882o0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public void m209883p0() {
        if (NullChecker.m81303a(m209886s0(this.f193410b))) {
            return;
        }
        if (this.f193410b.equals(this.f193409a)) {
            act().lambda$debugItems$19();
        } else {
            fz00.m123814c(act(), "", act().string(R$string.f20824O3), act().string(R$string.f21073r4), act().string(R$string.f20916a), new d30() { // from class: l.tle0
                @Override // p149l.d30
                public final void call() {
                    this.f171017a.m209879l0();
                }
            }, new d30() { // from class: l.ule0
                @Override // p149l.d30
                public final void call() {
                    this.f177061a.m209880m0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m209879l0() {
        zvf0.m220396r("e_edit_nickname_page_done_button", "p_edit_nickname_page");
        act().progress(R$string.f20775I2);
        duringCreated(CoreModule.f17545c.f19639e0.m169394Ga(this.f193411c, this.f193410b)).subscribe(mkd0.m154956H(new e30() { // from class: l.vle0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181944a.m209881n0((roj0) obj);
            }
        }, new e30() { // from class: l.wle0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186893a.m209882o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m209885r0(String str) {
        this.f193410b = str;
        ((bme0) this.viewModel).m102652m();
    }

    /* JADX INFO: renamed from: s0 */
    public String m209886s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!User.NAME_PATTERN().matcher(str).matches() || User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return CoreModule.f17544b.getString(com.p046p1.mobile.putong.common.R$string.f17438g2);
        }
        return null;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
