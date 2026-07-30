package com.p000p1.mobile.putong.core.newui.supreme;

import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeListPresenter;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.data.DbObject;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.l5b;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.x9j;
import l.xma;
import l.y9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;)V", "", "a0", "()V", "destroy", "p0", "r0", "Ll/l5b$a;", "supremeSuggestData", "", "hasSupremePartner", "n0", "(Ll/l5b$a;Z)V", "q0", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "o0", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremeListPresenter extends jq2<SupremeListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremeListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends l5b.a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupremeListPresenter(@NotNull SupremeListFrag supremeListFrag) {
        super(supremeListFrag);
        supremeListFrag.getClass();
        this.frag = supremeListFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m7874e0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (vwb.J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7905G();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m7875f0(SupremeListPresenter supremeListPresenter, Triple triple) {
        ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7904F(false);
        if (!xma.N3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (vwb.J((Collection) ((Pair) second).first)) {
                ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7903E(false, false);
                return;
            }
            Object second2 = triple.getSecond();
            second2.getClass();
            supremeListPresenter.userList = (List) ((Pair) second2).first;
            SupremeListViewModel supremeListViewModel = (SupremeListViewModel) ((jq2) supremeListPresenter).viewModel;
            Object second3 = triple.getSecond();
            second3.getClass();
            Object obj = ((Pair) second3).first;
            obj.getClass();
            supremeListViewModel.m7900B((List) obj, false);
            return;
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7903E(false, true);
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (vwb.J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            s7m s7mVar = ((jq2) supremeListPresenter).viewModel;
            if (zBooleanValue) {
                ((SupremeListViewModel) s7mVar).m7901C();
                return;
            } else {
                ((SupremeListViewModel) s7mVar).m7903E(true, true);
                return;
            }
        }
        Object second6 = triple.getSecond();
        second6.getClass();
        supremeListPresenter.userList = (List) ((Pair) second6).first;
        SupremeListViewModel supremeListViewModel2 = (SupremeListViewModel) ((jq2) supremeListPresenter).viewModel;
        Object second7 = triple.getSecond();
        second7.getClass();
        Object obj2 = ((Pair) second7).first;
        obj2.getClass();
        supremeListViewModel2.m7900B((List) obj2, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m7876g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m7877h0(SupremeListPresenter supremeListPresenter) {
        ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7908J();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m7878i0(j760 j760Var) {
        CoreModule.c.f2.H3();
    }

    /* JADX INFO: renamed from: j0 */
    public static j760 m7879j0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: k0 */
    public static Triple m7880k0(UserPrivilege userPrivilege, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(userPrivilege, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m7881l0(SupremeListPresenter supremeListPresenter, Bundle bundle) {
        supremeListPresenter.m7886p0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m7882m0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (vwb.J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) ((jq2) supremeListPresenter).viewModel).m7905G();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m7883a0() {
        super.a0();
        creates(new e30() { // from class: l.n0h0
            public final void call(Object obj) {
                SupremeListPresenter.m7881l0(this.f17176a, (Bundle) obj);
            }
        }, new d30() { // from class: l.o0h0
            public final void call() {
                SupremeListPresenter.m7877h0(this.f17794a);
            }
        });
        c cVarDistinctUntilChanged = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("supremePartner")).distinctUntilChanged();
        c cVarV3 = CoreModule.c.f2.v3();
        final SupremeListPresenter$initSubscription$3 supremeListPresenter$initSubscription$3 = SupremeListPresenter$initSubscription$3.INSTANCE;
        duringCreated(mkd0.r(cVarDistinctUntilChanged, cVarV3, new x9j() { // from class: l.p0h0
            public final Object call(Object obj, Object obj2) {
                return SupremeListPresenter.m7879j0(supremeListPresenter$initSubscription$3, obj, obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.q0h0
            public final void call(Object obj) {
                SupremeListPresenter.m7878i0((j760) obj);
            }
        }));
        c cVarDistinctUntilChanged2 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("supremePartner")).distinctUntilChanged();
        c cVarN3 = CoreModule.c.f2.N3();
        c cVarT3 = CoreModule.c.f2.t3();
        final Function3 function3 = new Function3() { // from class: l.r0h0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m7880k0((UserPrivilege) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(mkd0.s(cVarDistinctUntilChanged2, cVarN3, cVarT3, new y9j() { // from class: l.s0h0
            /* JADX INFO: renamed from: a */
            public final Object m21980a(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m7876g0(function3, obj, obj2, obj3);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.t0h0
            public final void call(Object obj) {
                SupremeListPresenter.m7875f0(this.f20511a, (Triple) obj);
            }
        }, new e30() { // from class: l.u0h0
            public final void call(Object obj) {
                SupremeListPresenter.m7882m0(this.f20947a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.f2.M3()).subscribe(mkd0.G(new e30() { // from class: l.v0h0
            public final void call(Object obj) {
                SupremeListPresenter.m7874e0(this.f21408a, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public final void m7884n0(@NotNull l5b.a supremeSuggestData, boolean hasSupremePartner) {
        supremeSuggestData.getClass();
        if (!hasSupremePartner) {
            m7887q0();
        } else {
            zvf0.u("e_custom_card", this.frag.pageId(), new j760[]{vwb.Y("other_user_id", ((DbObject) supremeSuggestData.a).id)});
            CoreModule.P().a().an(this.frag, supremeSuggestData.a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final SupremeListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7886p0() {
        if (vwb.J(this.userList)) {
            ((SupremeListViewModel) ((jq2) this).viewModel).m7904F(true);
        }
        CoreModule.c.f2.H3();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m7887q0() {
        CoreModule.c.f2.w3(act());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m7888r0() {
        m7886p0();
    }
}
