package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cia0 extends jq2<eia0> {
    public cia0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m11057i0(List list) {
        ((eia0) ((jq2) this).viewModel).m12556i();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11058a0() {
        super.a0();
        final LoopInputType loopInputType = (LoopInputType) ((eia0) ((jq2) this).viewModel).m12554d().getSerializable("loop_input_type");
        creates(new e30() { // from class: l.zha0
            public final void call(Object obj) {
                this.f23424a.m11059h0(loopInputType, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.aia0
            public final Object call(Object obj) {
                return ((User) obj).profile.extensions.basic.mbti;
            }
        }).distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.bia0
            public final void call(Object obj) {
                this.f8152a.m11057i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11059h0(LoopInputType loopInputType, Bundle bundle) {
        ((eia0) ((jq2) this).viewModel).m12555e(loopInputType);
    }

    public void destroy() {
    }
}
