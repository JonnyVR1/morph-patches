package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ro00 extends jq2<to00> {

    /* JADX INFO: renamed from: a */
    public String f160342a;

    /* JADX INFO: renamed from: b */
    public int f160343b;

    /* JADX INFO: renamed from: c */
    public boolean f160344c;

    /* JADX INFO: renamed from: d */
    public Moment f160345d;

    public ro00(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m180216i0(Bundle bundle) {
        to00 to00Var = (to00) this.viewModel;
        Moment moment = this.f160345d;
        to00Var.m189840m(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((to00) this.viewModel).m189837j(this.f160343b, this.f160344c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m180217j0() {
        if (NullChecker.m81303a(((to00) this.viewModel).f171310g)) {
            ((to00) this.viewModel).f171310g.m155577C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m180218k0(C4319c c4319c) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81304b(((to00) this.viewModel).f171310g)) {
            ((to00) this.viewModel).f171310g.m155579E();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.no00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139809a.m180216i0((Bundle) obj);
            }
        }, new d30() { // from class: l.oo00
            @Override // p149l.d30
            public final void call() {
                this.f144839a.m180217j0();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.po00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.qo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155530a.m180218k0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m180219l0(String str, int i, boolean z) {
        this.f160342a = str;
        this.f160343b = i;
        this.f160344c = z;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m180220m0() {
        return vwb.m200324f0("moment id", this.f160342a, ag3.f69254c);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
