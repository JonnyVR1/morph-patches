package p003l;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupRemoveMemberAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import java.util.List;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jek extends jq2<mek> {

    /* JADX INFO: renamed from: a */
    public String f4631a;

    /* JADX INFO: renamed from: b */
    public String f4632b;

    public jek(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m5320i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m5321k0(Bundle bundle) {
        ((mek) ((jq2) this).viewModel).m6374r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m5322m0(roj0 roj0Var) {
        CoreModule.c.g0.X8(this.f4631a);
    }

    /* JADX INFO: renamed from: Z */
    public void m5323Z() {
        super.Z();
        Intent intent = act().getIntent();
        this.f4632b = intent.getStringExtra("conversation_id");
        this.f4631a = intent.getStringExtra("group_id");
    }

    /* JADX INFO: renamed from: a0 */
    public void m5324a0() {
        super.a0();
        creates(new e30() { // from class: l.dek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2947a.m5321k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.g0.Q8(this.f4631a)).subscribe((m250) mkd0.H(new e30() { // from class: l.eek
            @Override // p003l.e30
            public final void call(Object obj) {
                CoreModule.c.g0.n0.onNext(roj0.a);
            }
        }, new e30() { // from class: l.fek
            @Override // p003l.e30
            public final void call(Object obj) {
                jek.m5320i0((Throwable) obj);
            }
        }));
        duringCreated(mkd0.r(CoreModule.c.g0.o6(this.f4631a), CoreModule.c.g0.W6(this.f4631a), new x9j() { // from class: l.gek
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((ChatGroup) obj, (List) obj2);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.hek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4175a.m5326l0((Pair) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.X6()).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.iek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4396a.m5322m0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m5325j0() {
        o6j0.c("e_delete_group_person", pageId(), new o6j0.a[0]);
        act().startActivity(GroupRemoveMemberAct.m2219Z1(act(), this.f4631a));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m5326l0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.first;
        List<ChatGroupMember> list = (List) pair.second;
        ((mek) ((jq2) this).viewModel).m6372k(chatGroup);
        ((mek) ((jq2) this).viewModel).m6373l(this.f4632b, chatGroup, list);
    }

    public String pageId() {
        return "p_group_members";
    }

    public void destroy() {
    }
}
