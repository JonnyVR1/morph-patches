package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.group.C8692b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class ikk extends ar2<C8692b> {

    /* JADX INFO: renamed from: a */
    public String f115428a;

    /* JADX INFO: renamed from: b */
    public boolean f115429b;

    /* JADX INFO: renamed from: c */
    public C22507a<uxj0> f115430c;

    /* JADX INFO: renamed from: d */
    public C22507a<uxj0> f115431d;

    /* JADX INFO: renamed from: e */
    public List<dek> f115432e;

    /* JADX INFO: renamed from: f */
    public boolean f115433f;

    public ikk(ner nerVar) {
        super(nerVar);
        this.f115430c = C22507a.m222758b();
        this.f115431d = C22507a.m222758b();
        this.f115433f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m140380E0(uxj0 uxj0Var) {
        this.f115430c.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ int m140384h0(dek dekVar, dek dekVar2) {
        if ((!dekVar.f88042g.startsWith("#") || dekVar2.f88042g.startsWith("#")) && (dekVar.f88042g.startsWith("#") || !dekVar2.f88042g.startsWith("#"))) {
            return dekVar.f88042g.compareTo(dekVar2.f88042g);
        }
        return dekVar.f88042g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m140394u0(Bundle bundle) {
        ((C8692b) this.viewModel).m50349r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m140395x0() {
        if (this.f115433f) {
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f115428a);
            if (!NullChecker.m82486a(chatGroupM32923s6) || TextUtils.isEmpty(chatGroupM32923s6.localConId)) {
                return;
            }
            CoreModule.f18264c.f20384f0.m34213zj(chatGroupM32923s6.localConId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m140396z0(List list) {
        this.f115430c.onNext(uxj0.f181467a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a0, please report this as an issue */
    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ List m140397A0(ChatGroup chatGroup, uxj0 uxj0Var) {
        dek dekVar;
        char cCharAt;
        List<ChatGroupMember> listM32855V8 = CoreModule.f18264c.f20387g0.m32855V8(this.f115428a);
        ArrayList arrayList = new ArrayList();
        for (ChatGroupMember chatGroupMember : listM32855V8) {
            if (!NullChecker.m82486a(chatGroup) || !TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId())) {
                if (NullChecker.m82486a(chatGroup)) {
                    if (jyb.m147479J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
                        if (TextUtils.equals(chatGroupMember.userId, chatGroup.ownerUserId)) {
                        }
                    }
                }
                dekVar = new dek();
                dekVar.f88038c = chatGroupMember.avatar;
                dekVar.f88040e = 0;
                dekVar.f88042g = chatGroupMember.nickNamePinyin;
                dekVar.f88037b = chatGroupMember.groupMemberName();
                dekVar.f88036a = chatGroupMember.userId;
                dekVar.f88039d = this.f115429b;
                dekVar.f88043h = chatGroupMember;
                if (TextUtils.isEmpty(dekVar.f88042g)) {
                    cCharAt = '#';
                } else {
                    cCharAt = dekVar.f88042g.charAt(0);
                }
                if (!Character.isLetter(cCharAt)) {
                    dekVar.f88042g = "#" + dekVar.f88042g;
                }
                arrayList.add(dekVar);
            } else if (!TextUtils.equals(chatGroupMember.userId, CoreModule.m30929H().userId())) {
                dekVar = new dek();
                dekVar.f88038c = chatGroupMember.avatar;
                dekVar.f88040e = 0;
                dekVar.f88042g = chatGroupMember.nickNamePinyin;
                dekVar.f88037b = chatGroupMember.groupMemberName();
                dekVar.f88036a = chatGroupMember.userId;
                dekVar.f88039d = this.f115429b;
                dekVar.f88043h = chatGroupMember;
                if (TextUtils.isEmpty(dekVar.f88042g)) {
                    cCharAt = dekVar.f88042g.charAt(0);
                } else {
                    cCharAt = '#';
                }
                if (!Character.isLetter(cCharAt)) {
                    dekVar.f88042g = "#" + dekVar.f88042g;
                }
                arrayList.add(dekVar);
            }
        }
        jyb.m147478I(arrayList, new Comparator() { // from class: l.hkk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ikk.m140384h0((dek) obj, (dek) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        dek dekVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            dek dekVar3 = (dek) arrayList.get(i);
            if (dekVar2 == null || !TextUtils.equals(dekVar2.f88042g.substring(0, 1), dekVar3.f88042g.substring(0, 1))) {
                dek dekVar4 = new dek();
                dekVar4.f88040e = 1;
                dekVar4.f88041f = dekVar3.f88042g.substring(0, 1);
                arrayList2.add(dekVar4);
            }
            arrayList2.add(dekVar3);
            i++;
            dekVar2 = dekVar3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m140398C0(ChatGroup chatGroup) {
        this.f115429b = jek.m144587s(chatGroup);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m140399D0(List list) {
        ((C8692b) this.viewModel).m50347m(list);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m140400F0(uxj0 uxj0Var) {
        m140404r0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m140401G0() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int size = this.f115432e.size() - 1;
            List<dek> list = this.f115432e;
            if (i >= size) {
                sb.append(list.get(list.size() - 1).f88036a);
                sfj0.m185596c("e_delete_group_person_confirm", "p_delete_group_person", sfj0.C20032a.m185615h("user_id", sb.toString()));
                this.f115431d.onNext(uxj0.f181467a);
                return;
            } else {
                sb.append(list.get(i).f88036a);
                sb.append(Constants.SEPARATOR_COMMA);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m140402H0() {
        if (jyb.m147479J(this.f115432e)) {
            return;
        }
        tcz.m190527E(act(), act().getString(R$string.f21634X, String.valueOf(this.f115432e.size())), new Runnable() { // from class: l.wjk
            @Override // java.lang.Runnable
            public final void run() {
                this.f189467a.m140401G0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public void m140403I0(List<dek> list) {
        this.f115432e = list;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f115428a = act().getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vjk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184404a.m140394u0((Bundle) obj);
            }
        }, new x20() { // from class: l.zjk
            @Override // p153l.x20
            public final void call() {
                this.f204674a.m140395x0();
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(this.f115428a)).subscribe(psd0.m173596G(new y20() { // from class: l.akk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72017a.m140407y0((ChatGroup) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32856W6(this.f115428a)).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.bkk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77084a.m140396z0((List) obj);
            }
        }));
        final ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f115428a);
        duringCreated((C22421c) this.f115430c.observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.ckk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82293a.m140397A0(chatGroupM32923s6, (uxj0) obj);
            }
        })).observeOn(fo0.m126432a()).doOnSubscribe(new x20() { // from class: l.dkk
            @Override // p153l.x20
            public final void call() {
                this.f89408a.m140398C0(chatGroupM32923s6);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ekk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94382a.m140399D0((List) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32846S8()).subscribe(psd0.m173596G(new y20() { // from class: l.fkk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99521a.m140380E0((uxj0) obj);
            }
        }));
        duringCreated(this.f115431d).subscribe(psd0.m173596G(new y20() { // from class: l.gkk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104747a.m140400F0((uxj0) obj);
            }
        }));
        this.f115430c.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m140404r0() {
        act().progress("");
        final ArrayList arrayList = new ArrayList(20);
        final ArrayList arrayList2 = new ArrayList(20);
        int iMin = Math.min(this.f115432e.size(), 20);
        for (int i = 0; i < iMin; i++) {
            dek dekVar = this.f115432e.get(i);
            arrayList.add(dekVar);
            arrayList2.add(dekVar.f88036a);
        }
        duringCreated(CoreModule.f18264c.f20387g0.m32834O8(this.f115428a, arrayList2)).subscribe(psd0.m173597H(new y20() { // from class: l.xjk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194582a.m140405s0(arrayList, arrayList2, (uxj0) obj);
            }
        }, new y20() { // from class: l.yjk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200306a.m140406t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m140405s0(List list, List list2, uxj0 uxj0Var) {
        this.f115433f = true;
        this.f115432e.removeAll(list);
        ((C8692b) this.viewModel).m50348n(this.f115432e.size());
        ((C8692b) this.viewModel).m50345k(list2);
        if (jyb.m147479J(this.f115432e)) {
            act().progressDismiss();
        } else {
            m140404r0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m140406t0(Throwable th) {
        act().progressDismiss();
        CoreModule.m30933P().m143412i().mo180452d(th);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m140407y0(ChatGroup chatGroup) {
        ((C8692b) this.viewModel).m50346l(chatGroup);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
