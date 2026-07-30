package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupApplyStatus;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class yik extends ar2<zik> {

    /* JADX INFO: renamed from: a */
    public Links f200093a;

    public yik(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m216092e0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m216094g0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m216099l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m216101n0(Throwable th) {
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    /* JADX INFO: renamed from: s0 */
    private void m216103s0() {
        duringCreated(CoreModule.f18264c.f20387g0.m32797C6()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.sik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168836a.m216112t0((GroupApply) obj);
            }
        }, new y20() { // from class: l.tik
            @Override // p153l.y20
            public final void call(Object obj) {
                yik.m216101n0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32874c7()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.uik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179132a.m216113u0((Pair) obj);
            }
        }, new y20() { // from class: l.vik
            @Override // p153l.y20
            public final void call(Object obj) {
                yik.m216099l0((Throwable) obj);
            }
        }));
        ((zik) this.viewModel).m219919f(true);
        m216107C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m216104x0(Bundle bundle) {
        ((zik) this.viewModel).m219921r();
        m216103s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m216105z0(Throwable th) {
        o1j0.m165634h(R$string.f21461B2);
        ((zik) this.viewModel).m219919f(false);
    }

    /* JADX INFO: renamed from: A0 */
    public void m216106A0(GroupNotification groupNotification, GroupApplyStatus groupApplyStatus) {
        String str = groupNotification.groupApplyData.f21146id;
        sfj0.m185598e("e_apply_add_group_notice", pageId(), new pf60("groupchat_id", groupNotification.chatGroupData.f56859id), new pf60("is_agree", Integer.valueOf(TEnum.equals(groupApplyStatus, "approved") ? 1 : 0)), new pf60("is_anonymou_group", Integer.valueOf(jek.m144587s(groupNotification.chatGroupData) ? 1 : 0)), new pf60("notice_id", groupNotification.f21148id), new pf60("notice_type", groupNotification.type), new pf60("user_id", groupNotification.userData.f56859id));
        C22421c<uxj0> c22421cM32820J8 = CoreModule.f18264c.f20387g0.m32820J8(str, groupApplyStatus);
        y20 y20Var = new y20() { // from class: l.nik
            @Override // p153l.y20
            public final void call(Object obj) {
                yik.m216094g0((uxj0) obj);
            }
        };
        CoreBusinessService coreBusinessServiceM143412i = CoreModule.m30933P().m143412i();
        Objects.requireNonNull(coreBusinessServiceM143412i);
        c22421cM32820J8.subscribe(psd0.m173597H(y20Var, new oik(coreBusinessServiceM143412i)));
    }

    /* JADX INFO: renamed from: C0 */
    public void m216107C0() {
        duringCreated(CoreModule.f18264c.f20387g0.m32868a7()).subscribe(psd0.m173597H(new y20() { // from class: l.mik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136985a.m216114y0((uxj0) obj);
            }
        }, new y20() { // from class: l.pik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152544a.m216105z0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157847a.m216104x0((Bundle) obj);
            }
        }, new x20() { // from class: l.rik
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20387g0.m32852U8();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m216108p0(GroupNotification groupNotification) {
        if (groupNotification.chatGroupData == null || groupNotification.userData == null) {
            return;
        }
        sfj0.m185605l("e_apply_add_group_notice", pageId(), new pf60("groupchat_id", groupNotification.chatGroupData.f56859id), new pf60("is_anonymou_group", Integer.valueOf(jek.m144587s(groupNotification.chatGroupData) ? 1 : 0)), new pf60("notice_id", groupNotification.f21148id), new pf60("notice_type", groupNotification.type), new pf60("user_id", groupNotification.userData.f56859id));
    }

    /* JADX INFO: renamed from: q0 */
    public void m216109q0(ChatGroup chatGroup, User user) {
        if (NullChecker.m82486a(chatGroup) && NullChecker.m82486a(user)) {
            act().startActivity(jek.m144573e(act(), user.f56859id, CoreModule.m30933P().m143412i().mo180504n0(jek.m144587s(chatGroup))));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m216110r() {
        Object obj;
        Pair<Links, List<GroupNotification>> pairM222761e = CoreModule.f18264c.f20387g0.m32800D6().m222761e();
        if (pairM222761e == null || (obj = pairM222761e.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pairM222761e.first;
        this.f200093a = links;
        duringCreated(CoreModule.f18264c.f20387g0.m32871b7(links.next)).subscribe(psd0.m173597H(new y20() { // from class: l.wik
            @Override // p153l.y20
            public final void call(Object obj2) {
                yik.m216092e0((uxj0) obj2);
            }
        }, new y20() { // from class: l.xik
            @Override // p153l.y20
            public final void call(Object obj2) {
                o1j0.m165634h(R$string.f21461B2);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m216111r0() {
        return NullChecker.m82486a(this.f200093a) && !TextUtils.isEmpty(this.f200093a.next);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m216112t0(GroupApply groupApply) {
        ((zik) this.viewModel).m219920i(groupApply);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m216113u0(Pair pair) {
        this.f200093a = (Links) pair.first;
        ((zik) this.viewModel).m219918e((List) pair.second);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m216114y0(uxj0 uxj0Var) {
        ((zik) this.viewModel).m219919f(false);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
