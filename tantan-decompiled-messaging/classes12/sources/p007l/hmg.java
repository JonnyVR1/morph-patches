package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupFragment;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hmg extends jq2<img> {

    /* JADX INFO: renamed from: a */
    public int f8773a;

    /* JADX INFO: renamed from: b */
    public FeedAllGroupFragment f8774b;

    public hmg(mcr mcrVar) {
        super(mcrVar);
        this.f8774b = (FeedAllGroupFragment) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m10673j0(Bundle bundle) {
        m10679m0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m10674a0() {
        super.a0();
        creates(new e30() { // from class: l.emg
            public final void call(Object obj) {
                this.f7431a.m10673j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final String m10675h0() {
        return this.f8773a == 0 ? "myGroup" : "hot";
    }

    /* JADX INFO: renamed from: i0 */
    public void m10676i0() {
        this.f8773a = this.f8774b.getArguments().getInt("page_type", -1);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10677k0(List list) {
        ((img) ((jq2) this).viewModel).m10988f();
        ((img) ((jq2) this).viewModel).m10987e(list);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m10678l0(Throwable th) {
        ((img) ((jq2) this).viewModel).m10987e(new ArrayList());
        ((img) ((jq2) this).viewModel).m10988f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m10679m0() {
        this.f8774b.duringCreated(FeedModule.f316d.m16711q7(m10675h0(), 0)).subscribe(mkd0.H(new e30() { // from class: l.fmg
            public final void call(Object obj) {
                this.f8165a.m10677k0((List) obj);
            }
        }, new e30() { // from class: l.gmg
            public final void call(Object obj) {
                this.f8481a.m10678l0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
