package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupRemoveMemberAct;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jek extends jq2<mek> {

    /* JADX INFO: renamed from: a */
    public String f117581a;

    /* JADX INFO: renamed from: b */
    public String f117582b;

    public jek(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m141154i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m141155k0(Bundle bundle) {
        ((mek) this.viewModel).m154235r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m141156m0(roj0 roj0Var) {
        CoreModule.f17545c.f19645g0.m31858X8(this.f117581a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        this.f117582b = intent.getStringExtra("conversation_id");
        this.f117581a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.dek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85803a.m141155k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31837Q8(this.f117581a)).subscribe(mkd0.m154956H(new e30() { // from class: l.eek
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19645g0.f19792n0.m132487l(roj0.f160388a);
            }
        }, new e30() { // from class: l.fek
            @Override // p149l.e30
            public final void call(Object obj) {
                jek.m141154i0((Throwable) obj);
            }
        }));
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19645g0.m31908o6(this.f117581a), CoreModule.f17545c.f19645g0.m31853W6(this.f117581a), new x9j() { // from class: l.gek
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((ChatGroup) obj, (List) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.hek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107374a.m141158l0((Pair) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31856X6()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.iek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112809a.m141156m0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m141157j0() {
        o6j0.m162859c("e_delete_group_person", pageId(), new o6j0.C18854a[0]);
        act().startActivity(GroupRemoveMemberAct.m49110Z1(act(), this.f117581a));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m141158l0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.first;
        List<ChatGroupMember> list = (List) pair.second;
        ((mek) this.viewModel).m154233k(chatGroup);
        ((mek) this.viewModel).m154234l(this.f117582b, chatGroup, list);
    }

    public String pageId() {
        return "p_group_members";
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
