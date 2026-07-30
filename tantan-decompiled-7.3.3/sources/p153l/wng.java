package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wng extends ar2<xng> {

    /* JADX INFO: renamed from: a */
    public int f189905a;

    /* JADX INFO: renamed from: b */
    public FeedAllGroupFragment f189906b;

    public wng(ner nerVar) {
        super(nerVar);
        this.f189906b = (FeedAllGroupFragment) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m207202j0(Bundle bundle) {
        m207207m0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.tng
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175248a.m207202j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final String m207203h0() {
        return this.f189905a == 0 ? "myGroup" : "hot";
    }

    /* JADX INFO: renamed from: i0 */
    public void m207204i0() {
        this.f189905a = this.f189906b.getArguments().getInt("page_type", -1);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m207205k0(List list) {
        ((xng) this.viewModel).m212208f();
        ((xng) this.viewModel).m212207e(list);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m207206l0(Throwable th) {
        ((xng) this.viewModel).m212207e(new ArrayList());
        ((xng) this.viewModel).m212208f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m207207m0() {
        this.f189906b.duringCreated(FeedModule.f39703d.m145771q7(m207203h0(), 0)).subscribe(psd0.m173597H(new y20() { // from class: l.ung
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179726a.m207205k0((List) obj);
            }
        }, new y20() { // from class: l.vng
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184878a.m207206l0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
