package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSettingManagerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import java.util.List;
import l.j760;
import l.jq2;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class blk extends jq2<dlk> {

    /* JADX INFO: renamed from: a */
    public final Act f2405a;

    /* JADX INFO: renamed from: b */
    public String f2406b;

    public blk(Act act) {
        super(act);
        this.f2405a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m2964g0(Bundle bundle) {
        ((dlk) ((jq2) this).viewModel).m3605r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m2965h0(j760 j760Var) {
        ((dlk) ((jq2) this).viewModel).m3604m((ChatGroup) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: Z */
    public void m2966Z() {
        super.Z();
        this.f2406b = this.f2405a.getIntent().getStringExtra(GroupSettingManagerAct.f1693f);
    }

    /* JADX INFO: renamed from: a0 */
    public void m2967a0() {
        super.a0();
        creates(new e30() { // from class: l.ykk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9079a.m2964g0((Bundle) obj);
            }
        });
        duringCreated(mkd0.r(CoreModule.c.g0.o6(this.f2406b), CoreModule.c.g0.W6(this.f2406b), new x9j() { // from class: l.zkk
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((ChatGroup) obj, (List) obj2);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.alk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2235a.m2965h0((j760) obj);
            }
        }));
    }

    public void destroy() {
    }
}
