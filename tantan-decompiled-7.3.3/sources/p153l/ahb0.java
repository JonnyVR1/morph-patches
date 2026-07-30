package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes12.dex */
public class ahb0 extends ar2<hhb0> {
    public ahb0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m97789h0(Bundle bundle) {
        ((hhb0) this.viewModel).m135057r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m97790i0() {
        ((hhb0) this.viewModel).m135051M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m97791j0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((hhb0) this.viewModel).m135048I();
        } else if (c4470c == C4470c.f16268j) {
            ((hhb0) this.viewModel).m135041A();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xgb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194168a.m97789h0((Bundle) obj);
            }
        }, new x20() { // from class: l.ygb0
            @Override // p153l.x20
            public final void call() {
                this.f199748a.m97790i0();
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.zgb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204286a.m97791j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m97792k0(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, "coin") || TEnum.equals(productCategory, ProductCategory.noneLiveCoin) || TEnum.equals(productCategory, ProductCategory.tttCoin) || TEnum.equals(productCategory, ProductCategory.tttLiveCoin)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else if (TEnum.equals(productCategory, ProductCategory.tttSeeWhoLikedMe)) {
            CoreModule.f18264c.f20381e0.m116470H9();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
