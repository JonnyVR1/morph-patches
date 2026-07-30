package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class w8b0 extends jq2<d9b0> {
    public w8b0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m202152h0(Bundle bundle) {
        ((d9b0) this.viewModel).m110441r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m202153i0() {
        ((d9b0) this.viewModel).m110435M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m202154j0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((d9b0) this.viewModel).m110432I();
        } else if (c4319c == C4319c.f15549j) {
            ((d9b0) this.viewModel).m110425A();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.t8b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168818a.m202152h0((Bundle) obj);
            }
        }, new d30() { // from class: l.u8b0
            @Override // p149l.d30
            public final void call() {
                this.f175110a.m202153i0();
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.v8b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180460a.m202154j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m202155k0(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, "coin") || TEnum.equals(productCategory, ProductCategory.noneLiveCoin) || TEnum.equals(productCategory, ProductCategory.tttCoin) || TEnum.equals(productCategory, ProductCategory.tttLiveCoin)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else if (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe)) {
            CoreModule.f17545c.f19639e0.m169397H9();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
