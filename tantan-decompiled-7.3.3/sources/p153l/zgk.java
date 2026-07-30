package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupRemoveMemberAct;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zgk extends ar2<chk> {

    /* JADX INFO: renamed from: a */
    public String f204317a;

    /* JADX INFO: renamed from: b */
    public String f204318b;

    public zgk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m219644i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m219645k0(Bundle bundle) {
        ((chk) this.viewModel).m109833r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m219646m0(uxj0 uxj0Var) {
        CoreModule.f18264c.f20387g0.m32861X8(this.f204317a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        this.f204318b = intent.getStringExtra("conversation_id");
        this.f204317a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.tgk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174096a.m219645k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32840Q8(this.f204317a)).subscribe(psd0.m173597H(new y20() { // from class: l.ugk
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20387g0.f20534n0.m137019l(uxj0.f181467a);
            }
        }, new y20() { // from class: l.vgk
            @Override // p153l.y20
            public final void call(Object obj) {
                zgk.m219644i0((Throwable) obj);
            }
        }));
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20387g0.m32911o6(this.f204317a), CoreModule.f18264c.f20387g0.m32856W6(this.f204317a), new rcj() { // from class: l.wgk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((ChatGroup) obj, (List) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.xgk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194200a.m219648l0((Pair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32859X6()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ygk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199843a.m219646m0((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m219647j0() {
        sfj0.m185596c("e_delete_group_person", pageId(), new sfj0.C20032a[0]);
        act().startActivity(GroupRemoveMemberAct.m50293a2(act(), this.f204317a));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m219648l0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.first;
        List<ChatGroupMember> list = (List) pair.second;
        ((chk) this.viewModel).m109831k(chatGroup);
        ((chk) this.viewModel).m109832l(this.f204318b, chatGroup, list);
    }

    public String pageId() {
        return "p_group_members";
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
