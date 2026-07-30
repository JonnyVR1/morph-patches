package p153l;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ccn0 extends y8s<rwn0, ecn0> {

    /* JADX INFO: renamed from: j */
    public String f80978j;

    public ccn0(dum dumVar) {
        super(dumVar);
        mo52715C(new ecn0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m108730V3(String str) {
        Pair pair = (Pair) m138856F3(new oqj(7012));
        if ((TextUtils.equals((CharSequence) pair.first, "voiceLiveMain") || TextUtils.equals((CharSequence) pair.first, "voiceLiveVice")) && jyb.m147479J((Collection) m138856F3(new vme0(700)))) {
            r1j0.m179420g("请先选择一个收礼人");
        } else {
            ((ecn0) this.viewModel).m73017E();
            m108733X3(str);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m108731U3(List list) {
        ((ecn0) this.viewModel).m120399I(list);
    }

    /* JADX INFO: renamed from: W3 */
    public void m108732W3() {
        ((ecn0) this.viewModel).mo73021p();
        m213811F2().GiftDialogEventGroup.performCpGiftItemClick().mo199273j(this.f80978j);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m108733X3(String str) {
        this.f80978j = str;
        duringCreated(n0m0.m161013c(str)).filter(new z86()).subscribe(dhw.m115829h(new y20() { // from class: l.bcn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76189a.m108731U3((List) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().GiftDialogEventGroup.showCpGiftDetailDialog(), new y20() { // from class: l.acn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69731a.m108730V3((String) obj);
            }
        });
    }
}
