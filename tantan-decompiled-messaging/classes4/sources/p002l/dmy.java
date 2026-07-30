package p002l;

import android.os.Bundle;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import l.e30;
import l.emy;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.r9m;
import l.y19;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dmy extends uly<emy> {

    /* JADX INFO: renamed from: d */
    public ChatGroup f9354d;

    /* JADX INFO: renamed from: e */
    public boolean f9355e;

    public dmy(mcr mcrVar) {
        super(mcrVar);
        this.f9355e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m11970F0(Bundle bundle) {
        ((jq2) this).viewModel.d(this);
        if (y19.M()) {
            e0().l().t7().m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.cmy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8757a.m11973E0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m11971G0(ChatGroup chatGroup) {
        this.f9354d = chatGroup;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m11973E0(View view) {
        if (r9m.r().q(mqi0.o())) {
            r9m.r().F(act());
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m11974H0(ChatGroup chatGroup) {
        ((jq2) this).viewModel.w(chatGroup, this.f9355e);
    }

    /* JADX INFO: renamed from: I0 */
    public void m11975I0(ChatGroup chatGroup) {
        if (this.f9355e) {
            return;
        }
        this.f9355e = true;
        o6j0.h("e_group_chat_online", act().pageId(), new o6j0.a[]{o6j0.a.f("online_user_number", chatGroup.onlineCount)});
        ((jq2) this).viewModel.w(chatGroup, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m11976a0() {
        super/*l.jq2*/.a0();
        creates(new e30() { // from class: l.zly
            public final void call(Object obj) {
                this.f23504a.m11970F0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.g0.o6(e0().l().r3())).doOnNext(new e30() { // from class: l.amy
            public final void call(Object obj) {
                this.f7757a.m11971G0((ChatGroup) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bmy
            public final void call(Object obj) {
                this.f8267a.m11974H0((ChatGroup) obj);
            }
        }));
    }

    public void destroy() {
    }
}
