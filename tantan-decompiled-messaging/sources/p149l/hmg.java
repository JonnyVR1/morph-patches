package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class hmg extends jq2<img> {

    /* JADX INFO: renamed from: a */
    public int f108422a;

    /* JADX INFO: renamed from: b */
    public FeedAllGroupFragment f108423b;

    public hmg(mcr mcrVar) {
        super(mcrVar);
        this.f108423b = (FeedAllGroupFragment) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m131727j0(Bundle bundle) {
        m131732m0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.emg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92209a.m131727j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final String m131728h0() {
        return this.f108422a == 0 ? "myGroup" : "hot";
    }

    /* JADX INFO: renamed from: i0 */
    public void m131729i0() {
        this.f108422a = this.f108423b.getArguments().getInt("page_type", -1);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m131730k0(List list) {
        ((img) this.viewModel).m137075f();
        ((img) this.viewModel).m137074e(list);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m131731l0(Throwable th) {
        ((img) this.viewModel).m137074e(new ArrayList());
        ((img) this.viewModel).m137075f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m131732m0() {
        this.f108423b.duringCreated(FeedModule.f38855d.m209530q7(m131728h0(), 0)).subscribe(mkd0.m154956H(new e30() { // from class: l.fmg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98301a.m131730k0((List) obj);
            }
        }, new e30() { // from class: l.gmg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103464a.m131731l0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
