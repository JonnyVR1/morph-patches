package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.group.C0112b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.vwb;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class shk extends jq2<C0112b> {

    /* JADX INFO: renamed from: a */
    public String f7257a;

    /* JADX INFO: renamed from: b */
    public boolean f7258b;

    /* JADX INFO: renamed from: c */
    public C1185a<roj0> f7259c;

    /* JADX INFO: renamed from: d */
    public C1185a<roj0> f7260d;

    /* JADX INFO: renamed from: e */
    public List<nbk> f7261e;

    /* JADX INFO: renamed from: f */
    public boolean f7262f;

    public shk(mcr mcrVar) {
        super(mcrVar);
        this.f7259c = C1185a.m9969b();
        this.f7260d = C1185a.m9969b();
        this.f7262f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m7598E0(roj0 roj0Var) {
        this.f7259c.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ int m7602h0(nbk nbkVar, nbk nbkVar2) {
        if ((!nbkVar.f5864g.startsWith("#") || nbkVar2.f5864g.startsWith("#")) && (nbkVar.f5864g.startsWith("#") || !nbkVar2.f5864g.startsWith("#"))) {
            return nbkVar.f5864g.compareTo(nbkVar2.f5864g);
        }
        return nbkVar.f5864g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m7612u0(Bundle bundle) {
        ((C0112b) ((jq2) this).viewModel).m2285r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m7613x0() {
        if (this.f7262f) {
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f7257a);
            if (!NullChecker.a(chatGroupS6) || TextUtils.isEmpty(chatGroupS6.localConId)) {
                return;
            }
            CoreModule.c.f0.dn(chatGroupS6.localConId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m7614z0(List list) {
        this.f7259c.onNext(roj0.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a0, please report this as an issue */
    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ List m7615A0(ChatGroup chatGroup, roj0 roj0Var) {
        nbk nbkVar;
        char cCharAt;
        List<ChatGroupMember> listV8 = CoreModule.c.g0.V8(this.f7257a);
        ArrayList arrayList = new ArrayList();
        for (ChatGroupMember chatGroupMember : listV8) {
            if (!NullChecker.a(chatGroup) || !TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId())) {
                if (NullChecker.a(chatGroup)) {
                    if (vwb.J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
                        if (TextUtils.equals(chatGroupMember.userId, chatGroup.ownerUserId)) {
                        }
                    }
                }
                nbkVar = new nbk();
                nbkVar.f5860c = chatGroupMember.avatar;
                nbkVar.f5862e = 0;
                nbkVar.f5864g = chatGroupMember.nickNamePinyin;
                nbkVar.f5859b = chatGroupMember.groupMemberName();
                nbkVar.f5858a = chatGroupMember.userId;
                nbkVar.f5861d = this.f7258b;
                nbkVar.f5865h = chatGroupMember;
                if (TextUtils.isEmpty(nbkVar.f5864g)) {
                    cCharAt = '#';
                } else {
                    cCharAt = nbkVar.f5864g.charAt(0);
                }
                if (!Character.isLetter(cCharAt)) {
                    nbkVar.f5864g = "#" + nbkVar.f5864g;
                }
                arrayList.add(nbkVar);
            } else if (!TextUtils.equals(chatGroupMember.userId, CoreModule.H().userId())) {
                nbkVar = new nbk();
                nbkVar.f5860c = chatGroupMember.avatar;
                nbkVar.f5862e = 0;
                nbkVar.f5864g = chatGroupMember.nickNamePinyin;
                nbkVar.f5859b = chatGroupMember.groupMemberName();
                nbkVar.f5858a = chatGroupMember.userId;
                nbkVar.f5861d = this.f7258b;
                nbkVar.f5865h = chatGroupMember;
                if (TextUtils.isEmpty(nbkVar.f5864g)) {
                    cCharAt = nbkVar.f5864g.charAt(0);
                } else {
                    cCharAt = '#';
                }
                if (!Character.isLetter(cCharAt)) {
                    nbkVar.f5864g = "#" + nbkVar.f5864g;
                }
                arrayList.add(nbkVar);
            }
        }
        vwb.I(arrayList, new Comparator() { // from class: l.rhk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return shk.m7602h0((nbk) obj, (nbk) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        nbk nbkVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            nbk nbkVar3 = (nbk) arrayList.get(i);
            if (nbkVar2 == null || !TextUtils.equals(nbkVar2.f5864g.substring(0, 1), nbkVar3.f5864g.substring(0, 1))) {
                nbk nbkVar4 = new nbk();
                nbkVar4.f5862e = 1;
                nbkVar4.f5863f = nbkVar3.f5864g.substring(0, 1);
                arrayList2.add(nbkVar4);
            }
            arrayList2.add(nbkVar3);
            i++;
            nbkVar2 = nbkVar3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m7616C0(ChatGroup chatGroup) {
        this.f7258b = tbk.m7725s(chatGroup);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m7617D0(List list) {
        ((C0112b) ((jq2) this).viewModel).m2283m(list);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m7618F0(roj0 roj0Var) {
        m7624r0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m7619G0() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int size = this.f7261e.size() - 1;
            List<nbk> list = this.f7261e;
            if (i >= size) {
                sb.append(list.get(list.size() - 1).f5858a);
                o6j0.c("e_delete_group_person_confirm", "p_delete_group_person", new o6j0.a[]{o6j0.a.h("user_id", sb.toString())});
                this.f7260d.onNext(roj0.a);
                return;
            } else {
                sb.append(list.get(i).f5858a);
                sb.append(",");
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m7620H0() {
        if (vwb.J(this.f7261e)) {
            return;
        }
        w3z.m8433E(act(), act().getString(R.string.X, String.valueOf(this.f7261e.size())), new Runnable() { // from class: l.ghk
            @Override // java.lang.Runnable
            public final void run() {
                this.f3882a.m7619G0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public void m7621I0(List<nbk> list) {
        this.f7261e = list;
    }

    /* JADX INFO: renamed from: Z */
    public void m7622Z() {
        super.Z();
        this.f7257a = act().getIntent().getStringExtra("group_id");
    }

    /* JADX INFO: renamed from: a0 */
    public void m7623a0() {
        super.a0();
        creates(new e30() { // from class: l.fhk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3621a.m7612u0((Bundle) obj);
            }
        }, new d30() { // from class: l.jhk
            @Override // p003l.d30
            public final void call() {
                this.f4645a.m7613x0();
            }
        });
        duringCreated(CoreModule.c.g0.o6(this.f7257a)).subscribe((m250) mkd0.G(new e30() { // from class: l.khk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4929a.m7627y0((ChatGroup) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.W6(this.f7257a)).skip(1).subscribe((m250) mkd0.G(new e30() { // from class: l.lhk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5305a.m7614z0((List) obj);
            }
        }));
        final ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f7257a);
        duringCreated(this.f7259c.observeOn(Schedulers.m9950io()).map(new w9j() { // from class: l.mhk
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5649a.m7615A0(chatGroupS6, (roj0) obj);
            }
        })).observeOn(jo0.m5414a()).doOnSubscribe(new d30() { // from class: l.nhk
            @Override // p003l.d30
            public final void call() {
                this.f5899a.m7616C0(chatGroupS6);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.ohk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6161a.m7617D0((List) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.S8()).subscribe((m250) mkd0.G(new e30() { // from class: l.phk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6434a.m7598E0((roj0) obj);
            }
        }));
        duringCreated(this.f7260d).subscribe((m250) mkd0.G(new e30() { // from class: l.qhk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6643a.m7618F0((roj0) obj);
            }
        }));
        this.f7259c.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m7624r0() {
        act().progress("");
        final ArrayList arrayList = new ArrayList(20);
        final ArrayList arrayList2 = new ArrayList(20);
        int iMin = Math.min(this.f7261e.size(), 20);
        for (int i = 0; i < iMin; i++) {
            nbk nbkVar = this.f7261e.get(i);
            arrayList.add(nbkVar);
            arrayList2.add(nbkVar.f5858a);
        }
        duringCreated(CoreModule.c.g0.O8(this.f7257a, arrayList2)).subscribe((m250) mkd0.H(new e30() { // from class: l.hhk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4191a.m7625s0(arrayList, arrayList2, (roj0) obj);
            }
        }, new e30() { // from class: l.ihk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4408a.m7626t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m7625s0(List list, List list2, roj0 roj0Var) {
        this.f7262f = true;
        this.f7261e.removeAll(list);
        ((C0112b) ((jq2) this).viewModel).m2284n(this.f7261e.size());
        ((C0112b) ((jq2) this).viewModel).m2281k(list2);
        if (vwb.J(this.f7261e)) {
            act().progressDismiss();
        } else {
            m7624r0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m7626t0(Throwable th) {
        act().progressDismiss();
        CoreModule.P().i().d(th);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m7627y0(ChatGroup chatGroup) {
        ((C0112b) ((jq2) this).viewModel).m2282l(chatGroup);
    }

    public void destroy() {
    }
}
