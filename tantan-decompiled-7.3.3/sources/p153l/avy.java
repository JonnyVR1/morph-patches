package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;

/* JADX INFO: loaded from: classes4.dex */
public class avy extends ruy<bvy> {

    /* JADX INFO: renamed from: d */
    public ChatGroup f73679d;

    /* JADX INFO: renamed from: e */
    public boolean f73680e;

    public avy(ner nerVar) {
        super(nerVar);
        this.f73680e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m100550F0(Bundle bundle) {
        ((bvy) this.viewModel).m202976d(this);
        if (h39.m133424M()) {
            m143372e0().mo50158l().m111048t7().m178960m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.zuy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f206175a.m100553E0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m100551G0(ChatGroup chatGroup) {
        this.f73679d = chatGroup;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m100553E0(View view) {
        if (hcm.m134472r().m134479q(pzi0.m174454o())) {
            hcm.m134472r().m134478F(act());
        } else {
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m100554H0(ChatGroup chatGroup) {
        ((bvy) this.viewModel).m106634w(chatGroup, this.f73680e);
    }

    /* JADX INFO: renamed from: I0 */
    public void m100555I0(ChatGroup chatGroup) {
        if (this.f73680e) {
            return;
        }
        this.f73680e = true;
        sfj0.m185601h("e_group_chat_online", act().pageId(), sfj0.C20032a.m185613f("online_user_number", chatGroup.onlineCount));
        ((bvy) this.viewModel).m106634w(chatGroup, true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wuy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190896a.m100550F0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(m143372e0().mo50158l().mo111034r3())).doOnNext(new y20() { // from class: l.xuy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196333a.m100551G0((ChatGroup) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yuy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201671a.m100554H0((ChatGroup) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
