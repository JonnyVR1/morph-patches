package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w8b0 extends jq2<d9b0> {
    public w8b0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m26242h0(Bundle bundle) {
        ((d9b0) ((jq2) this).viewModel).m13854r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m26243i0() {
        ((d9b0) ((jq2) this).viewModel).m13847M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m26244j0(c cVar) {
        if (cVar == c.i) {
            ((d9b0) ((jq2) this).viewModel).m13844I();
        } else if (cVar == c.j) {
            ((d9b0) ((jq2) this).viewModel).m13836A();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m26245a0() {
        super.a0();
        creates(new e30() { // from class: l.t8b0
            public final void call(Object obj) {
                this.f21952a.m26242h0((Bundle) obj);
            }
        }, new d30() { // from class: l.u8b0
            public final void call() {
                this.f23429a.m26243i0();
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.v8b0
            public final void call(Object obj) {
                this.f24219a.m26244j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m26246k0(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, "coin") || TEnum.equals(productCategory, "noneLiveCoin") || TEnum.equals(productCategory, "tttCoin") || TEnum.equals(productCategory, "tttLiveCoin")) {
            CoreModule.f1534c.f3559H0.m27536k5();
        } else if (TEnum.equals(productCategory, "tttSeeWhoLikedMe")) {
            CoreModule.f1534c.f3628e0.m21360H9();
        }
    }

    public void destroy() {
    }
}
