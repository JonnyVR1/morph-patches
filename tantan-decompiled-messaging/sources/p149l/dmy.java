package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;

/* JADX INFO: loaded from: classes4.dex */
public class dmy extends uly<emy> {

    /* JADX INFO: renamed from: d */
    public ChatGroup f87007d;

    /* JADX INFO: renamed from: e */
    public boolean f87008e;

    public dmy(mcr mcrVar) {
        super(mcrVar);
        this.f87008e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m112571F0(Bundle bundle) {
        ((emy) this.viewModel).m215318d(this);
        if (y19.m212153M()) {
            m156455e0().mo48974l().m120842t7().m190316m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.cmy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81626a.m112574E0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m112572G0(ChatGroup chatGroup) {
        this.f87007d = chatGroup;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m112574E0(View view) {
        if (r9m.m178395r().m178402q(mqi0.m155944o())) {
            r9m.m178395r().m178401F(act());
        } else {
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m112575H0(ChatGroup chatGroup) {
        ((emy) this.viewModel).m117248w(chatGroup, this.f87008e);
    }

    /* JADX INFO: renamed from: I0 */
    public void m112576I0(ChatGroup chatGroup) {
        if (this.f87008e) {
            return;
        }
        this.f87008e = true;
        o6j0.m162864h("e_group_chat_online", act().pageId(), o6j0.C18854a.m162876f("online_user_number", chatGroup.onlineCount));
        ((emy) this.viewModel).m117248w(chatGroup, true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.zly
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203676a.m112571F0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(m156455e0().mo48974l().mo120828r3())).doOnNext(new e30() { // from class: l.amy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70690a.m112572G0((ChatGroup) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bmy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76355a.m112575H0((ChatGroup) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
