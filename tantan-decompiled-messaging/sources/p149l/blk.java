package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSettingManagerAct;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class blk extends jq2<dlk> {

    /* JADX INFO: renamed from: a */
    public final Act f76193a;

    /* JADX INFO: renamed from: b */
    public String f76194b;

    public blk(Act act) {
        super(act);
        this.f76193a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m102546g0(Bundle bundle) {
        ((dlk) this.viewModel).m112368r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m102547h0(j760 j760Var) {
        ((dlk) this.viewModel).m112367m((ChatGroup) j760Var.f116564a, (List) j760Var.f116565b);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f76194b = this.f76193a.getIntent().getStringExtra(GroupSettingManagerAct.f31802f);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ykk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198770a.m102546g0((Bundle) obj);
            }
        });
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19645g0.m31908o6(this.f76194b), CoreModule.f17545c.f19645g0.m31853W6(this.f76194b), new x9j() { // from class: l.zkk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((ChatGroup) obj, (List) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.alk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70447a.m102547h0((j760) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
