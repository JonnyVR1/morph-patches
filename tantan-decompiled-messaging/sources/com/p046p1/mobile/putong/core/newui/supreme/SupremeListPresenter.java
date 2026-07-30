package com.p046p1.mobile.putong.core.newui.supreme;

import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeListPresenter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.jq2;
import p149l.l5b;
import p149l.mkd0;
import p149l.vwb;
import p149l.x9j;
import p149l.xma;
import p149l.y9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;)V", "", "a0", "()V", "destroy", "p0", "r0", "Ll/l5b$a;", "supremeSuggestData", "", "hasSupremePartner", "n0", "(Ll/l5b$a;Z)V", "q0", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "o0", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SupremeListPresenter extends jq2<SupremeListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremeListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends l5b.C18151a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupremeListPresenter(@NotNull SupremeListFrag supremeListFrag) {
        super(supremeListFrag);
        supremeListFrag.getClass();
        this.frag = supremeListFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m43621e0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (vwb.m200296J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m43650G();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m43622f0(SupremeListPresenter supremeListPresenter, Triple triple) {
        ((SupremeListViewModel) supremeListPresenter.viewModel).m43649F(false);
        if (!xma.m210049N3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (vwb.m200296J((Collection) ((Pair) second).first)) {
                ((SupremeListViewModel) supremeListPresenter.viewModel).m43648E(false, false);
                return;
            }
            Object second2 = triple.getSecond();
            second2.getClass();
            supremeListPresenter.userList = (List) ((Pair) second2).first;
            SupremeListViewModel supremeListViewModel = (SupremeListViewModel) supremeListPresenter.viewModel;
            Object second3 = triple.getSecond();
            second3.getClass();
            Object obj = ((Pair) second3).first;
            obj.getClass();
            supremeListViewModel.m43646B((List) obj, false);
            return;
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m43648E(false, true);
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (vwb.m200296J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            V v2 = supremeListPresenter.viewModel;
            if (zBooleanValue) {
                ((SupremeListViewModel) v2).m43647C();
                return;
            } else {
                ((SupremeListViewModel) v2).m43648E(true, true);
                return;
            }
        }
        Object second6 = triple.getSecond();
        second6.getClass();
        supremeListPresenter.userList = (List) ((Pair) second6).first;
        SupremeListViewModel supremeListViewModel2 = (SupremeListViewModel) supremeListPresenter.viewModel;
        Object second7 = triple.getSecond();
        second7.getClass();
        Object obj2 = ((Pair) second7).first;
        obj2.getClass();
        supremeListViewModel2.m43646B((List) obj2, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m43623g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m43624h0(SupremeListPresenter supremeListPresenter) {
        ((SupremeListViewModel) supremeListPresenter.viewModel).m43653J();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m43625i0(j760 j760Var) {
        CoreModule.f17545c.f19644f2.m148603H3();
    }

    /* JADX INFO: renamed from: j0 */
    public static j760 m43626j0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: k0 */
    public static Triple m43627k0(UserPrivilege userPrivilege, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(userPrivilege, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m43628l0(SupremeListPresenter supremeListPresenter, Bundle bundle) {
        supremeListPresenter.m43632p0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m43629m0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (vwb.m200296J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m43650G();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.n0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListPresenter.m43628l0(this.f136556a, (Bundle) obj);
            }
        }, new d30() { // from class: l.o0h0
            @Override // p149l.d30
            public final void call() {
                SupremeListPresenter.m43624h0(this.f141336a);
            }
        });
        C22306c<UserPrivilege> c22306cDistinctUntilChanged = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        C22306c<Boolean> c22306cM148614v3 = CoreModule.f17545c.f19644f2.m148614v3();
        final SupremeListPresenter$initSubscription$3 supremeListPresenter$initSubscription$3 = SupremeListPresenter$initSubscription$3.INSTANCE;
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged, c22306cM148614v3, new x9j() { // from class: l.p0h0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return SupremeListPresenter.m43626j0(supremeListPresenter$initSubscription$3, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.q0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListPresenter.m43625i0((j760) obj);
            }
        }));
        C22306c<UserPrivilege> c22306cDistinctUntilChanged2 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        C22306c<Pair<List<l5b.C18151a>, Boolean>> c22306cM148609N3 = CoreModule.f17545c.f19644f2.m148609N3();
        C22306c<PrivateCustomSetting> c22306cM148612t3 = CoreModule.f17545c.f19644f2.m148612t3();
        final Function3 function3 = new Function3() { // from class: l.r0h0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m43627k0((UserPrivilege) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(mkd0.m154985s(c22306cDistinctUntilChanged2, c22306cM148609N3, c22306cM148612t3, new y9j() { // from class: l.s0h0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m43623g0(function3, obj, obj2, obj3);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.t0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListPresenter.m43622f0(this.f167188a, (Triple) obj);
            }
        }, new e30() { // from class: l.u0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListPresenter.m43629m0(this.f172914a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19644f2.m148608M3()).subscribe(mkd0.m154955G(new e30() { // from class: l.v0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListPresenter.m43621e0(this.f179115a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public final void m43630n0(@NotNull l5b.C18151a supremeSuggestData, boolean hasSupremePartner) {
        supremeSuggestData.getClass();
        if (!hasSupremePartner) {
            m43633q0();
        } else {
            zvf0.m220399u("e_custom_card", this.frag.pageId(), vwb.m200311Y("other_user_id", supremeSuggestData.f126106a.f56011id));
            CoreModule.m29935P().m94651a().mo33466an(this.frag, supremeSuggestData.f126106a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final SupremeListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m43632p0() {
        if (vwb.m200296J(this.userList)) {
            ((SupremeListViewModel) this.viewModel).m43649F(true);
        }
        CoreModule.f17545c.f19644f2.m148603H3();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m43633q0() {
        CoreModule.f17545c.f19644f2.m148615w3(act());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m43634r0() {
        m43632p0();
    }
}
