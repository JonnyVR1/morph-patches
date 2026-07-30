package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupApplyStatus;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class igk extends jq2<jgk> {

    /* JADX INFO: renamed from: a */
    public Links f113130a;

    public igk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m136051e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m136053g0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m136058l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m136060n0(Throwable th) {
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    /* JADX INFO: renamed from: s0 */
    private void m136062s0() {
        duringCreated(CoreModule.f17545c.f19645g0.m31794C6()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.cgk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80779a.m136071t0((GroupApply) obj);
            }
        }, new e30() { // from class: l.dgk
            @Override // p149l.e30
            public final void call(Object obj) {
                igk.m136060n0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31871c7()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.egk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90956a.m136072u0((Pair) obj);
            }
        }, new e30() { // from class: l.fgk
            @Override // p149l.e30
            public final void call(Object obj) {
                igk.m136058l0((Throwable) obj);
            }
        }));
        ((jgk) this.viewModel).m141306f(true);
        m136066C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m136063x0(Bundle bundle) {
        ((jgk) this.viewModel).m141308r();
        m136062s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m136064z0(Throwable th) {
        lsi0.m151578h(R$string.f20719B2);
        ((jgk) this.viewModel).m141306f(false);
    }

    /* JADX INFO: renamed from: A0 */
    public void m136065A0(GroupNotification groupNotification, GroupApplyStatus groupApplyStatus) {
        String str = groupNotification.groupApplyData.f20404id;
        o6j0.m162861e("e_apply_add_group_notice", pageId(), new j760("groupchat_id", groupNotification.chatGroupData.f56011id), new j760("is_agree", Integer.valueOf(TEnum.equals(groupApplyStatus, "approved") ? 1 : 0)), new j760("is_anonymou_group", Integer.valueOf(tbk.m187872s(groupNotification.chatGroupData) ? 1 : 0)), new j760("notice_id", groupNotification.f20406id), new j760("notice_type", groupNotification.type), new j760("user_id", groupNotification.userData.f56011id));
        C22306c<roj0> c22306cM31817J8 = CoreModule.f17545c.f19645g0.m31817J8(str, groupApplyStatus);
        e30 e30Var = new e30() { // from class: l.xfk
            @Override // p149l.e30
            public final void call(Object obj) {
                igk.m136053g0((roj0) obj);
            }
        };
        CoreBusinessService coreBusinessServiceM94658i = CoreModule.m29935P().m94658i();
        Objects.requireNonNull(coreBusinessServiceM94658i);
        c22306cM31817J8.subscribe(mkd0.m154956H(e30Var, new yfk(coreBusinessServiceM94658i)));
    }

    /* JADX INFO: renamed from: C0 */
    public void m136066C0() {
        duringCreated(CoreModule.f17545c.f19645g0.m31865a7()).subscribe(mkd0.m154956H(new e30() { // from class: l.wfk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186089a.m136073y0((roj0) obj);
            }
        }, new e30() { // from class: l.zfk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202956a.m136064z0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.agk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69377a.m136063x0((Bundle) obj);
            }
        }, new d30() { // from class: l.bgk
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19645g0.m31849U8();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m136067p0(GroupNotification groupNotification) {
        if (groupNotification.chatGroupData == null || groupNotification.userData == null) {
            return;
        }
        o6j0.m162868l("e_apply_add_group_notice", pageId(), new j760("groupchat_id", groupNotification.chatGroupData.f56011id), new j760("is_anonymou_group", Integer.valueOf(tbk.m187872s(groupNotification.chatGroupData) ? 1 : 0)), new j760("notice_id", groupNotification.f20406id), new j760("notice_type", groupNotification.type), new j760("user_id", groupNotification.userData.f56011id));
    }

    /* JADX INFO: renamed from: q0 */
    public void m136068q0(ChatGroup chatGroup, User user) {
        if (NullChecker.m81303a(chatGroup) && NullChecker.m81303a(user)) {
            act().startActivity(tbk.m187858e(act(), user.f56011id, CoreModule.m29935P().m94658i().mo158412n0(tbk.m187872s(chatGroup))));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m136069r() {
        Object obj;
        Pair<Links, List<GroupNotification>> pairM221515e = CoreModule.f17545c.f19645g0.m31797D6().m221515e();
        if (pairM221515e == null || (obj = pairM221515e.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pairM221515e.first;
        this.f113130a = links;
        duringCreated(CoreModule.f17545c.f19645g0.m31868b7(links.next)).subscribe(mkd0.m154956H(new e30() { // from class: l.ggk
            @Override // p149l.e30
            public final void call(Object obj2) {
                igk.m136051e0((roj0) obj2);
            }
        }, new e30() { // from class: l.hgk
            @Override // p149l.e30
            public final void call(Object obj2) {
                lsi0.m151578h(R$string.f20719B2);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m136070r0() {
        return NullChecker.m81303a(this.f113130a) && !TextUtils.isEmpty(this.f113130a.next);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m136071t0(GroupApply groupApply) {
        ((jgk) this.viewModel).m141307i(groupApply);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m136072u0(Pair pair) {
        this.f113130a = (Links) pair.first;
        ((jgk) this.viewModel).m141305e((List) pair.second);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m136073y0(roj0 roj0Var) {
        ((jgk) this.viewModel).m141306f(false);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
