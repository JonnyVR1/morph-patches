package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragPresenter;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.jq2;
import l.lac0;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.w9j;
import l.x9j;
import l.y9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.mqi0;
import p009l.q860;
import p009l.yep;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Ll/jq2;", "Ll/yep;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "o0", "(Lkotlin/Pair;)V", "t0", "()V", "destroy", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "q0", "(IILandroid/content/Intent;)Z", "hidden", "r0", "(Z)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "b", "p0", "()Z", "s0", "skipDefaultTab", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m3515e0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Pair pair) {
        pair.getClass();
        intlTribeMeetFragPresenter.m3525o0(pair);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m3516f0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m3517g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m3518h0() {
        if (IntlCountryCodeController.k()) {
            CoreModule.c.v0.n3();
            CoreModule.c.v0.m3();
            CoreModule.c.u0.c7(CoreLikers.LikersTriggerBy.home_tab_msg);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m3519i0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Boolean bool) {
        if (bool.booleanValue()) {
            intlTribeMeetFragPresenter.skipDefaultTab = true;
            ((yep) ((jq2) intlTribeMeetFragPresenter).viewModel).m25322w(1);
            ((yep) ((jq2) intlTribeMeetFragPresenter).viewModel).m25315l().m3544B0(1);
            CoreModule.c.n1.z3().onNext(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static DoublePair m3520j0(User user) {
        if (user.settings == null) {
            return null;
        }
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m3521k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m3522l0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Bundle bundle) {
        ((yep) ((jq2) intlTribeMeetFragPresenter).viewModel).m25317p();
        ((yep) ((jq2) intlTribeMeetFragPresenter).viewModel).m25322w(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static Pair m3523m0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m3524n0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Triple triple) {
        ((yep) ((jq2) intlTribeMeetFragPresenter).viewModel).m25315l().m3550y0((DoublePair) triple.getFirst(), ((RoamedLocationData) triple.getSecond()).data);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: o0 */
    private final void m3525o0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        if (optional.isPresent() && optional2.isPresent()) {
            int i = 0;
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                Collection collection = q860Var.f19068a;
                collection.getClass();
                if (collection.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f19068a.size();
                }
            } else {
                size = 0;
            }
            if (optional2.isPresent()) {
                q860 q860Var2 = (q860) optional2.get();
                Collection collection2 = q860Var2.f19068a;
                collection2.getClass();
                if (!collection2.isEmpty()) {
                    i = q860Var2.f19069b.total;
                }
            }
            ((yep) ((jq2) this).viewModel).m25318q(size + i);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m3526t0() {
        Long lValueOf = (Long) CoreModule.c.u0.k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m18550o());
        }
        CoreModule.c.u0.m5();
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        CoreModule.c.v0.A3(lValueOf.longValue());
        CoreModule.c.v0.y3("", lValueOf.longValue());
    }

    /* JADX INFO: renamed from: Z */
    public void m3527Z() {
        super.Z();
        if (IntlCountryCodeController.k()) {
            m3526t0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3528a0() {
        super.a0();
        creates(new e30() { // from class: l.fep
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m3522l0(this.f12973a, (Bundle) obj);
            }
        }, new d30() { // from class: l.gep
            public final void call() {
                IntlTribeMeetFragPresenter.m3518h0();
            }
        });
        if (IntlCountryCodeController.k()) {
            c cVarQ3 = CoreModule.c.v0.q3();
            c cVarP3 = CoreModule.c.v0.p3();
            final Function2 function2 = new Function2() { // from class: l.hep
                public final Object invoke(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m3523m0((Optional) obj, (Optional) obj2);
                }
            };
            duringCreated(mkd0.r(cVarQ3, cVarP3, new x9j() { // from class: l.iep
                public final Object call(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m3516f0(function2, obj, obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.jep
                public final void call(Object obj) {
                    IntlTribeMeetFragPresenter.m3515e0(this.f15084a, (Pair) obj);
                }
            }));
        }
        duringCreated(CoreModule.c.n1.z3()).subscribe(mkd0.G(new e30() { // from class: l.kep
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m3519i0(this.f15620a, (Boolean) obj);
            }
        }));
        c cVarO9 = CoreModule.c.e0.o9();
        final Function1 function1 = new Function1() { // from class: l.lep
            public final Object invoke(Object obj) {
                return IntlTribeMeetFragPresenter.m3520j0((User) obj);
            }
        };
        c map = cVarO9.map(new w9j() { // from class: l.mep
            public final Object call(Object obj) {
                return IntlTribeMeetFragPresenter.m3521k0(function1, obj);
            }
        });
        c cVarK = CoreModule.c.k0.R.k();
        c cVarDistinctUntilChanged = lac0.Companion.b() ? CoreModule.c.c2.o3().distinctUntilChanged() : c.just(roj0.a);
        final IntlTribeMeetFragPresenter$initSubscription$7 intlTribeMeetFragPresenter$initSubscription$7 = IntlTribeMeetFragPresenter$initSubscription$7.INSTANCE;
        duringCreated(mkd0.s(map, cVarK, cVarDistinctUntilChanged, new y9j() { // from class: l.nep
            /* JADX INFO: renamed from: a */
            public final Object m18865a(Object obj, Object obj2, Object obj3) {
                return IntlTribeMeetFragPresenter.m3517g0(intlTribeMeetFragPresenter$initSubscription$7, obj, obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.oep
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m3524n0(this.f17941a, (Triple) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getSkipDefaultTab() {
        return this.skipDefaultTab;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: q0 */
    public final boolean m3530q0(int requestCode, int resultCode, @Nullable Intent data) {
        Boolean boolValueOf;
        boolean zK = IntlCountryCodeController.k();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zK) {
            IntlMeetLikersFrag intlMeetLikersFragM25311i = ((yep) s7mVar).getMeetLikersFrag();
            if (intlMeetLikersFragM25311i == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetLikersFragM25311i.isAdded()) {
                    intlMeetLikersFragM25311i = null;
                }
                if (intlMeetLikersFragM25311i != null) {
                    boolValueOf = Boolean.valueOf(intlMeetLikersFragM25311i.m3427T4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        } else {
            IntlMeetFrag2 intlMeetFrag2M25310f = ((yep) s7mVar).getMeetFrag();
            if (intlMeetFrag2M25310f == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetFrag2M25310f.isAdded()) {
                    intlMeetFrag2M25310f = null;
                }
                if (intlMeetFrag2M25310f != null) {
                    boolValueOf = Boolean.valueOf(intlMeetFrag2M25310f.m3485Q4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        }
        if (Intrinsics.d(boolValueOf, Boolean.TRUE)) {
            return true;
        }
        IntlMeetTribeFrag intlMeetTribeFragM25313j = ((yep) ((jq2) this).viewModel).getTribeFrag();
        if (intlMeetTribeFragM25313j == null) {
            return false;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM25313j.isAdded() ? intlMeetTribeFragM25313j : null;
        return intlMeetTribeFrag != null && intlMeetTribeFrag.m3498S4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m3531r0(boolean hidden) {
        IntlMeetTribeFrag intlMeetTribeFragM25313j;
        if (((yep) ((jq2) this).viewModel).m25316m().getCurrentItem() == 0) {
            boolean zK = IntlCountryCodeController.k();
            s7m s7mVar = ((jq2) this).viewModel;
            if (zK) {
                IntlMeetLikersFrag intlMeetLikersFragM25311i = ((yep) s7mVar).getMeetLikersFrag();
                if (intlMeetLikersFragM25311i != null) {
                    if (!intlMeetLikersFragM25311i.isAdded()) {
                        intlMeetLikersFragM25311i = null;
                    }
                    if (intlMeetLikersFragM25311i != null) {
                        intlMeetLikersFragM25311i.onHiddenChanged(hidden);
                    }
                }
                if (!hidden) {
                    m3526t0();
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2M25310f = ((yep) s7mVar).getMeetFrag();
                if (intlMeetFrag2M25310f != null) {
                    if (!intlMeetFrag2M25310f.isAdded()) {
                        intlMeetFrag2M25310f = null;
                    }
                    if (intlMeetFrag2M25310f != null) {
                        intlMeetFrag2M25310f.onHiddenChanged(hidden);
                    }
                }
            }
        }
        if (((yep) ((jq2) this).viewModel).m25316m().getCurrentItem() != 1 || (intlMeetTribeFragM25313j = ((yep) ((jq2) this).viewModel).getTribeFrag()) == null) {
            return;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM25313j.isAdded() ? intlMeetTribeFragM25313j : null;
        if (intlMeetTribeFrag != null) {
            intlMeetTribeFrag.onHiddenChanged(hidden);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3532s0(boolean z) {
        this.skipDefaultTab = z;
    }
}
