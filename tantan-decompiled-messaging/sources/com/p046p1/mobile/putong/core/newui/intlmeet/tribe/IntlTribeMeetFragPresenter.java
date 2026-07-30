package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragPresenter;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.d30;
import p149l.e30;
import p149l.jq2;
import p149l.lac0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.roj0;
import p149l.w9j;
import p149l.x9j;
import p149l.y9j;
import p149l.yep;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u001e¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Ll/jq2;", "Ll/yep;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "o0", "(Lkotlin/Pair;)V", "t0", "()V", "destroy", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "q0", "(IILandroid/content/Intent;)Z", "hidden", "r0", "(Z)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "b", "p0", "()Z", "s0", "skipDefaultTab", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlTribeMeetFragPresenter extends jq2<yep> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlTribeMeetFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean skipDefaultTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlTribeMeetFragPresenter(@NotNull IntlTribeMeetFrag intlTribeMeetFrag) {
        super(intlTribeMeetFrag);
        intlTribeMeetFrag.getClass();
        this.frag = intlTribeMeetFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m39457e0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Pair pair) {
        pair.getClass();
        intlTribeMeetFragPresenter.m39467o0(pair);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m39458f0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m39459g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m39460h0() {
        if (IntlCountryCodeController.m28115k()) {
            CoreModule.f17545c.f19690v0.m105764n3();
            CoreModule.f17545c.f19690v0.m105763m3();
            CoreModule.f17545c.f19687u0.m30433c7(CoreLikers.LikersTriggerBy.home_tab_msg);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m39461i0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Boolean bool) {
        if (bool.booleanValue()) {
            intlTribeMeetFragPresenter.skipDefaultTab = true;
            ((yep) intlTribeMeetFragPresenter.viewModel).m214372w(1);
            ((yep) intlTribeMeetFragPresenter.viewModel).m214365l().m39486B0(1);
            CoreModule.f17545c.f19667n1.m34275z3().m132487l(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static DoublePair m39462j0(User user) {
        if (user.settings == null) {
            return null;
        }
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m39463k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m39464l0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Bundle bundle) {
        ((yep) intlTribeMeetFragPresenter.viewModel).m214367p();
        ((yep) intlTribeMeetFragPresenter.viewModel).m214372w(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static Pair m39465m0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m39466n0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Triple triple) {
        ((yep) intlTribeMeetFragPresenter.viewModel).m214365l().m39492y0((DoublePair) triple.getFirst(), ((RoamedLocationData) triple.getSecond()).data);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: o0 */
    private final void m39467o0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional<q860<User>> first = pair.getFirst();
        Optional<q860<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                q860<User> q860Var = first.get();
                List<User> list = q860Var.f153135a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f153135a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                q860<User> q860Var2 = second.get();
                List<User> list2 = q860Var2.f153135a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = q860Var2.f153136b.total;
                }
            }
            ((yep) this.viewModel).m214368q(size + i);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m39468t0() {
        Long lValueOf = CoreModule.f17545c.f19687u0.f19254k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m155944o());
        }
        CoreModule.f17545c.f19687u0.m30456m5();
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19690v0.m105757A3(lValueOf.longValue());
        CoreModule.f17545c.f19690v0.m105775y3("", lValueOf.longValue());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        if (IntlCountryCodeController.m28115k()) {
            m39468t0();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.fep
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m39464l0(this.f97147a, (Bundle) obj);
            }
        }, new d30() { // from class: l.gep
            @Override // p149l.d30
            public final void call() {
                IntlTribeMeetFragPresenter.m39460h0();
            }
        });
        if (IntlCountryCodeController.m28115k()) {
            C22306c<Optional<q860<User>>> c22306cM105767q3 = CoreModule.f17545c.f19690v0.m105767q3();
            C22306c<Optional<q860<User>>> c22306cM105766p3 = CoreModule.f17545c.f19690v0.m105766p3();
            final Function2 function2 = new Function2() { // from class: l.hep
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m39465m0((Optional) obj, (Optional) obj2);
                }
            };
            duringCreated(mkd0.m154984r(c22306cM105767q3, c22306cM105766p3, new x9j() { // from class: l.iep
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m39458f0(function2, obj, obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.jep
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlTribeMeetFragPresenter.m39457e0(this.f117593a, (Pair) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19667n1.m34275z3()).subscribe(mkd0.m154955G(new e30() { // from class: l.kep
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m39461i0(this.f122737a, (Boolean) obj);
            }
        }));
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function1 = new Function1() { // from class: l.lep
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlTribeMeetFragPresenter.m39462j0((User) obj);
            }
        };
        C22306c<R> map = c22306cM169523o9.map(new w9j() { // from class: l.mep
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlTribeMeetFragPresenter.m39463k0(function1, obj);
            }
        });
        C22306c<RoamedLocationData> c22306cM121230k = CoreModule.f17545c.f19657k0.f20088R.m121230k();
        C22306c<Optional<AcceleratePairingStatus>> c22306cDistinctUntilChanged = lac0.INSTANCE.m149147b() ? CoreModule.f17545c.f19635c2.m99143o3().distinctUntilChanged() : C22306c.just(roj0.f160388a);
        final IntlTribeMeetFragPresenter$initSubscription$7 intlTribeMeetFragPresenter$initSubscription$7 = IntlTribeMeetFragPresenter$initSubscription$7.INSTANCE;
        duringCreated(mkd0.m154985s(map, c22306cM121230k, c22306cDistinctUntilChanged, new y9j() { // from class: l.nep
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return IntlTribeMeetFragPresenter.m39459g0(intlTribeMeetFragPresenter$initSubscription$7, obj, obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.oep
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m39466n0(this.f143355a, (Triple) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getSkipDefaultTab() {
        return this.skipDefaultTab;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: q0 */
    public final boolean m39472q0(int requestCode, int resultCode, @Nullable Intent data) {
        Boolean boolValueOf;
        boolean zM28115k = IntlCountryCodeController.m28115k();
        V v2 = this.viewModel;
        if (zM28115k) {
            IntlMeetLikersFrag intlMeetLikersFragM214362i = ((yep) v2).getMeetLikersFrag();
            if (intlMeetLikersFragM214362i == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetLikersFragM214362i.isAdded()) {
                    intlMeetLikersFragM214362i = null;
                }
                if (intlMeetLikersFragM214362i != null) {
                    boolValueOf = Boolean.valueOf(intlMeetLikersFragM214362i.m39382T4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        } else {
            IntlMeetFrag2 intlMeetFrag2M214361f = ((yep) v2).getMeetFrag();
            if (intlMeetFrag2M214361f == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetFrag2M214361f.isAdded()) {
                    intlMeetFrag2M214361f = null;
                }
                if (intlMeetFrag2M214361f != null) {
                    boolValueOf = Boolean.valueOf(intlMeetFrag2M214361f.m39435Q4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        }
        if (Intrinsics.m87488d(boolValueOf, Boolean.TRUE)) {
            return true;
        }
        IntlMeetTribeFrag intlMeetTribeFragM214363j = ((yep) this.viewModel).getTribeFrag();
        if (intlMeetTribeFragM214363j == null) {
            return false;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM214363j.isAdded() ? intlMeetTribeFragM214363j : null;
        return intlMeetTribeFrag != null && intlMeetTribeFrag.m39445S4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m39473r0(boolean hidden) {
        IntlMeetTribeFrag intlMeetTribeFragM214363j;
        if (((yep) this.viewModel).m214366m().getCurrentItem() == 0) {
            boolean zM28115k = IntlCountryCodeController.m28115k();
            V v2 = this.viewModel;
            if (zM28115k) {
                IntlMeetLikersFrag intlMeetLikersFragM214362i = ((yep) v2).getMeetLikersFrag();
                if (intlMeetLikersFragM214362i != null) {
                    if (!intlMeetLikersFragM214362i.isAdded()) {
                        intlMeetLikersFragM214362i = null;
                    }
                    if (intlMeetLikersFragM214362i != null) {
                        intlMeetLikersFragM214362i.onHiddenChanged(hidden);
                    }
                }
                if (!hidden) {
                    m39468t0();
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2M214361f = ((yep) v2).getMeetFrag();
                if (intlMeetFrag2M214361f != null) {
                    if (!intlMeetFrag2M214361f.isAdded()) {
                        intlMeetFrag2M214361f = null;
                    }
                    if (intlMeetFrag2M214361f != null) {
                        intlMeetFrag2M214361f.onHiddenChanged(hidden);
                    }
                }
            }
        }
        if (((yep) this.viewModel).m214366m().getCurrentItem() != 1 || (intlMeetTribeFragM214363j = ((yep) this.viewModel).getTribeFrag()) == null) {
            return;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM214363j.isAdded() ? intlMeetTribeFragM214363j : null;
        if (intlMeetTribeFrag != null) {
            intlMeetTribeFrag.onHiddenChanged(hidden);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m39474s0(boolean z) {
        this.skipDefaultTab = z;
    }
}
