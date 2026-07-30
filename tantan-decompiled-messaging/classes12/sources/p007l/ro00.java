package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ag3;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ro00 extends jq2<to00> {

    /* JADX INFO: renamed from: a */
    public String f12701a;

    /* JADX INFO: renamed from: b */
    public int f12702b;

    /* JADX INFO: renamed from: c */
    public boolean f12703c;

    /* JADX INFO: renamed from: d */
    public Moment f12704d;

    public ro00(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m13935i0(Bundle bundle) {
        to00 to00Var = (to00) ((jq2) this).viewModel;
        Moment moment = this.f12704d;
        to00Var.m14595m(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((to00) ((jq2) this).viewModel).m14592j(this.f12702b, this.f12703c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m13936j0() {
        if (NullChecker.a(((to00) ((jq2) this).viewModel).f13364g)) {
            ((to00) ((jq2) this).viewModel).f13364g.m11980C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m13937k0(c cVar) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.b(((to00) ((jq2) this).viewModel).f13364g)) {
            ((to00) ((jq2) this).viewModel).f13364g.m11982E();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13938a0() {
        creates(new e30() { // from class: l.no00
            public final void call(Object obj) {
                this.f10841a.m13935i0((Bundle) obj);
            }
        }, new d30() { // from class: l.oo00
            public final void call() {
                this.f11544a.m13936j0();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.po00
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.qo00
            public final void call(Object obj) {
                this.f12333a.m13937k0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m13939l0(String str, int i, boolean z) {
        this.f12701a = str;
        this.f12702b = i;
        this.f12703c = z;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m13940m0() {
        return vwb.f0(new Object[]{"moment id", this.f12701a, ag3.c});
    }

    public void destroy() {
    }
}
