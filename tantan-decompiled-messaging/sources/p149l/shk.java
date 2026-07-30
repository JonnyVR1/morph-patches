package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.group.C8529b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class shk extends jq2<C8529b> {

    /* JADX INFO: renamed from: a */
    public String f164589a;

    /* JADX INFO: renamed from: b */
    public boolean f164590b;

    /* JADX INFO: renamed from: c */
    public C22392a<roj0> f164591c;

    /* JADX INFO: renamed from: d */
    public C22392a<roj0> f164592d;

    /* JADX INFO: renamed from: e */
    public List<nbk> f164593e;

    /* JADX INFO: renamed from: f */
    public boolean f164594f;

    public shk(mcr mcrVar) {
        super(mcrVar);
        this.f164591c = C22392a.m221512b();
        this.f164592d = C22392a.m221512b();
        this.f164594f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m184212E0(roj0 roj0Var) {
        this.f164591c.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ int m184216h0(nbk nbkVar, nbk nbkVar2) {
        if ((!nbkVar.f138044g.startsWith("#") || nbkVar2.f138044g.startsWith("#")) && (nbkVar.f138044g.startsWith("#") || !nbkVar2.f138044g.startsWith("#"))) {
            return nbkVar.f138044g.compareTo(nbkVar2.f138044g);
        }
        return nbkVar.f138044g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m184226u0(Bundle bundle) {
        ((C8529b) this.viewModel).m49166r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m184227x0() {
        if (this.f164594f) {
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f164589a);
            if (!NullChecker.m81303a(chatGroupM31920s6) || TextUtils.isEmpty(chatGroupM31920s6.localConId)) {
                return;
            }
            CoreModule.f17545c.f19642f0.m33210zj(chatGroupM31920s6.localConId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m184228z0(List list) {
        this.f164591c.onNext(roj0.f160388a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a0, please report this as an issue */
    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ List m184229A0(ChatGroup chatGroup, roj0 roj0Var) {
        nbk nbkVar;
        char cCharAt;
        List<ChatGroupMember> listM31852V8 = CoreModule.f17545c.f19645g0.m31852V8(this.f164589a);
        ArrayList arrayList = new ArrayList();
        for (ChatGroupMember chatGroupMember : listM31852V8) {
            if (!NullChecker.m81303a(chatGroup) || !TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId())) {
                if (NullChecker.m81303a(chatGroup)) {
                    if (vwb.m200296J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
                        if (TextUtils.equals(chatGroupMember.userId, chatGroup.ownerUserId)) {
                        }
                    }
                }
                nbkVar = new nbk();
                nbkVar.f138040c = chatGroupMember.avatar;
                nbkVar.f138042e = 0;
                nbkVar.f138044g = chatGroupMember.nickNamePinyin;
                nbkVar.f138039b = chatGroupMember.groupMemberName();
                nbkVar.f138038a = chatGroupMember.userId;
                nbkVar.f138041d = this.f164590b;
                nbkVar.f138045h = chatGroupMember;
                if (TextUtils.isEmpty(nbkVar.f138044g)) {
                    cCharAt = '#';
                } else {
                    cCharAt = nbkVar.f138044g.charAt(0);
                }
                if (!Character.isLetter(cCharAt)) {
                    nbkVar.f138044g = "#" + nbkVar.f138044g;
                }
                arrayList.add(nbkVar);
            } else if (!TextUtils.equals(chatGroupMember.userId, CoreModule.m29931H().userId())) {
                nbkVar = new nbk();
                nbkVar.f138040c = chatGroupMember.avatar;
                nbkVar.f138042e = 0;
                nbkVar.f138044g = chatGroupMember.nickNamePinyin;
                nbkVar.f138039b = chatGroupMember.groupMemberName();
                nbkVar.f138038a = chatGroupMember.userId;
                nbkVar.f138041d = this.f164590b;
                nbkVar.f138045h = chatGroupMember;
                if (TextUtils.isEmpty(nbkVar.f138044g)) {
                    cCharAt = nbkVar.f138044g.charAt(0);
                } else {
                    cCharAt = '#';
                }
                if (!Character.isLetter(cCharAt)) {
                    nbkVar.f138044g = "#" + nbkVar.f138044g;
                }
                arrayList.add(nbkVar);
            }
        }
        vwb.m200295I(arrayList, new Comparator() { // from class: l.rhk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return shk.m184216h0((nbk) obj, (nbk) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        nbk nbkVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            nbk nbkVar3 = (nbk) arrayList.get(i);
            if (nbkVar2 == null || !TextUtils.equals(nbkVar2.f138044g.substring(0, 1), nbkVar3.f138044g.substring(0, 1))) {
                nbk nbkVar4 = new nbk();
                nbkVar4.f138042e = 1;
                nbkVar4.f138043f = nbkVar3.f138044g.substring(0, 1);
                arrayList2.add(nbkVar4);
            }
            arrayList2.add(nbkVar3);
            i++;
            nbkVar2 = nbkVar3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m184230C0(ChatGroup chatGroup) {
        this.f164590b = tbk.m187872s(chatGroup);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m184231D0(List list) {
        ((C8529b) this.viewModel).m49164m(list);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m184232F0(roj0 roj0Var) {
        m184236r0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m184233G0() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int size = this.f164593e.size() - 1;
            List<nbk> list = this.f164593e;
            if (i >= size) {
                sb.append(list.get(list.size() - 1).f138038a);
                o6j0.m162859c("e_delete_group_person_confirm", "p_delete_group_person", o6j0.C18854a.m162878h("user_id", sb.toString()));
                this.f164592d.onNext(roj0.f160388a);
                return;
            } else {
                sb.append(list.get(i).f138038a);
                sb.append(Constants.SEPARATOR_COMMA);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m184234H0() {
        if (vwb.m200296J(this.f164593e)) {
            return;
        }
        w3z.m201399E(act(), act().getString(R$string.f20892X, String.valueOf(this.f164593e.size())), new Runnable() { // from class: l.ghk
            @Override // java.lang.Runnable
            public final void run() {
                this.f102663a.m184233G0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public void m184235I0(List<nbk> list) {
        this.f164593e = list;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f164589a = act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.fhk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97507a.m184226u0((Bundle) obj);
            }
        }, new d30() { // from class: l.jhk
            @Override // p149l.d30
            public final void call() {
                this.f117953a.m184227x0();
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(this.f164589a)).subscribe(mkd0.m154955G(new e30() { // from class: l.khk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123173a.m184239y0((ChatGroup) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31853W6(this.f164589a)).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.lhk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128115a.m184228z0((List) obj);
            }
        }));
        final ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f164589a);
        duringCreated((C22306c) this.f164591c.observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.mhk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133825a.m184229A0(chatGroupM31920s6, (roj0) obj);
            }
        })).observeOn(jo0.m142408a()).doOnSubscribe(new d30() { // from class: l.nhk
            @Override // p149l.d30
            public final void call() {
                this.f139000a.m184230C0(chatGroupM31920s6);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ohk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144006a.m184231D0((List) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31843S8()).subscribe(mkd0.m154955G(new e30() { // from class: l.phk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148937a.m184212E0((roj0) obj);
            }
        }));
        duringCreated(this.f164592d).subscribe(mkd0.m154955G(new e30() { // from class: l.qhk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154472a.m184232F0((roj0) obj);
            }
        }));
        this.f164591c.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m184236r0() {
        act().progress("");
        final ArrayList arrayList = new ArrayList(20);
        final ArrayList arrayList2 = new ArrayList(20);
        int iMin = Math.min(this.f164593e.size(), 20);
        for (int i = 0; i < iMin; i++) {
            nbk nbkVar = this.f164593e.get(i);
            arrayList.add(nbkVar);
            arrayList2.add(nbkVar.f138038a);
        }
        duringCreated(CoreModule.f17545c.f19645g0.m31831O8(this.f164589a, arrayList2)).subscribe(mkd0.m154956H(new e30() { // from class: l.hhk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107725a.m184237s0(arrayList, arrayList2, (roj0) obj);
            }
        }, new e30() { // from class: l.ihk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113259a.m184238t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m184237s0(List list, List list2, roj0 roj0Var) {
        this.f164594f = true;
        this.f164593e.removeAll(list);
        ((C8529b) this.viewModel).m49165n(this.f164593e.size());
        ((C8529b) this.viewModel).m49162k(list2);
        if (vwb.m200296J(this.f164593e)) {
            act().progressDismiss();
        } else {
            m184236r0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m184238t0(Throwable th) {
        act().progressDismiss();
        CoreModule.m29935P().m94658i().mo158360d(th);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m184239y0(ChatGroup chatGroup) {
        ((C8529b) this.viewModel).m49163l(chatGroup);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
