package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupApplyStatus;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.tbk;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class igk extends jq2<jgk> {

    /* JADX INFO: renamed from: a */
    public Links f14621a;

    public igk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m16523e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m16525g0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m16530l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m16532n0(Throwable th) {
    }

    private String pageId() {
        return act().pageId();
    }

    /* JADX INFO: renamed from: s0 */
    private void m16534s0() {
        duringCreated(CoreModule.c.g0.C6()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.cgk
            public final void call(Object obj) {
                this.f10583a.m16544t0((GroupApply) obj);
            }
        }, new e30() { // from class: l.dgk
            public final void call(Object obj) {
                igk.m16532n0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.c7()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.egk
            public final void call(Object obj) {
                this.f12556a.m16545u0((Pair) obj);
            }
        }, new e30() { // from class: l.fgk
            public final void call(Object obj) {
                igk.m16530l0((Throwable) obj);
            }
        }));
        ((jgk) ((jq2) this).viewModel).m16995f(true);
        m16538C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m16535x0(Bundle bundle) {
        ((jgk) ((jq2) this).viewModel).m16999r();
        m16534s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m16536z0(Throwable th) {
        lsi0.h(R.string.B2);
        ((jgk) ((jq2) this).viewModel).m16995f(false);
    }

    /* JADX INFO: renamed from: A0 */
    public void m16537A0(GroupNotification groupNotification, GroupApplyStatus groupApplyStatus) {
        String str = groupNotification.groupApplyData.id;
        o6j0.e("e_apply_add_group_notice", pageId(), new j760[]{new j760("groupchat_id", ((DbObject) groupNotification.chatGroupData).id), new j760("is_agree", Integer.valueOf(TEnum.equals(groupApplyStatus, "approved") ? 1 : 0)), new j760("is_anonymou_group", Integer.valueOf(tbk.s(groupNotification.chatGroupData) ? 1 : 0)), new j760("notice_id", groupNotification.id), new j760("notice_type", groupNotification.type), new j760("user_id", ((DbObject) groupNotification.userData).id)});
        c cVarJ8 = CoreModule.c.g0.J8(str, groupApplyStatus);
        e30 e30Var = new e30() { // from class: l.xfk
            public final void call(Object obj) {
                igk.m16525g0((roj0) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceI = CoreModule.P().i();
        Objects.requireNonNull(coreBusinessServiceI);
        cVarJ8.subscribe(mkd0.H(e30Var, new e30() { // from class: l.yfk
            public final void call(Object obj) {
                coreBusinessServiceI.d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public void m16538C0() {
        duringCreated(CoreModule.c.g0.a7()).subscribe(mkd0.H(new e30() { // from class: l.wfk
            public final void call(Object obj) {
                this.f22092a.m16546y0((roj0) obj);
            }
        }, new e30() { // from class: l.zfk
            public final void call(Object obj) {
                this.f23642a.m16536z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m16539a0() {
        super.a0();
        creates(new e30() { // from class: l.agk
            public final void call(Object obj) {
                this.f9495a.m16535x0((Bundle) obj);
            }
        }, new d30() { // from class: l.bgk
            public final void call() {
                CoreModule.c.g0.U8();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m16540p0(GroupNotification groupNotification) {
        if (groupNotification.chatGroupData == null || groupNotification.userData == null) {
            return;
        }
        o6j0.l("e_apply_add_group_notice", pageId(), new j760[]{new j760("groupchat_id", ((DbObject) groupNotification.chatGroupData).id), new j760("is_anonymou_group", Integer.valueOf(tbk.s(groupNotification.chatGroupData) ? 1 : 0)), new j760("notice_id", groupNotification.id), new j760("notice_type", groupNotification.type), new j760("user_id", ((DbObject) groupNotification.userData).id)});
    }

    /* JADX INFO: renamed from: q0 */
    public void m16541q0(ChatGroup chatGroup, User user) {
        if (NullChecker.a(chatGroup) && NullChecker.a(user)) {
            act().startActivity(tbk.e(act(), ((DbObject) user).id, CoreModule.P().i().n0(tbk.s(chatGroup))));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m16542r() {
        Object obj;
        Pair pair = (Pair) CoreModule.c.g0.D6().e();
        if (pair == null || (obj = pair.first) == null || TextUtils.isEmpty(((Links) obj).next)) {
            return;
        }
        Links links = (Links) pair.first;
        this.f14621a = links;
        duringCreated(CoreModule.c.g0.b7(links.next)).subscribe(mkd0.H(new e30() { // from class: l.ggk
            public final void call(Object obj2) {
                igk.m16523e0((roj0) obj2);
            }
        }, new e30() { // from class: l.hgk
            public final void call(Object obj2) {
                lsi0.h(R.string.B2);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m16543r0() {
        return NullChecker.a(this.f14621a) && !TextUtils.isEmpty(this.f14621a.next);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m16544t0(GroupApply groupApply) {
        ((jgk) ((jq2) this).viewModel).m16996i(groupApply);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m16545u0(Pair pair) {
        this.f14621a = (Links) pair.first;
        ((jgk) ((jq2) this).viewModel).m16994e((List) pair.second);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m16546y0(roj0 roj0Var) {
        ((jgk) ((jq2) this).viewModel).m16995f(false);
    }

    public void destroy() {
    }
}
