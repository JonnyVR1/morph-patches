package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.fz00;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xle0 extends jq2<bme0> {

    /* JADX INFO: renamed from: a */
    public String f22643a;

    /* JADX INFO: renamed from: b */
    public String f22644b;

    /* JADX INFO: renamed from: c */
    public String f22645c;

    public xle0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m24934k0(Bundle bundle) {
        ((bme0) ((jq2) this).viewModel).m12139r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24935a0() {
        super.a0();
        creates(new e30() { // from class: l.sle0
            public final void call(Object obj) {
                this.f20355a.m24934k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m24936j0(String str) {
        this.f22645c = str;
        String strY7 = CoreModule.c.e0.y7(str);
        this.f22644b = strY7;
        this.f22643a = strY7;
        ((bme0) ((jq2) this).viewModel).m12136i(strY7);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m24938m0() {
        act().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m24939n0(roj0 roj0Var) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m24940o0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public void m24941p0() {
        if (NullChecker.a(m24944s0(this.f22644b))) {
            return;
        }
        if (this.f22644b.equals(this.f22643a)) {
            act().finish();
        } else {
            fz00.c(act(), "", act().string(R.string.O3), act().string(R.string.r4), act().string(R.string.a), new d30() { // from class: l.tle0
                public final void call() {
                    this.f20767a.m24937l0();
                }
            }, new d30() { // from class: l.ule0
                public final void call() {
                    this.f21242a.m24938m0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m24937l0() {
        zvf0.r("e_edit_nickname_page_done_button", "p_edit_nickname_page");
        act().progress(R.string.I2);
        duringCreated(CoreModule.c.e0.Ga(this.f22645c, this.f22644b)).subscribe(mkd0.H(new e30() { // from class: l.vle0
            public final void call(Object obj) {
                this.f21639a.m24939n0((roj0) obj);
            }
        }, new e30() { // from class: l.wle0
            public final void call(Object obj) {
                this.f22185a.m24940o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m24943r0(String str) {
        this.f22644b = str;
        ((bme0) ((jq2) this).viewModel).m12138m();
    }

    /* JADX INFO: renamed from: s0 */
    public String m24944s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!User.NAME_PATTERN().matcher(str).matches() || User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return CoreModule.b.getString(com.p1.mobile.putong.common.R.string.g2);
        }
        return null;
    }

    public void destroy() {
    }
}
