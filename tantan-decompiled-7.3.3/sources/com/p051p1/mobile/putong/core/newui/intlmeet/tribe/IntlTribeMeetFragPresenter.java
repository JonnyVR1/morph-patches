package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFragPresenter;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;
import p153l.ar2;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rcj;
import p153l.ric0;
import p153l.scj;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.ygp;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u001e¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFragPresenter;", "Ll/ar2;", "Ll/ygp;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "o0", "(Lkotlin/Pair;)V", "t0", "()V", "destroy", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "q0", "(IILandroid/content/Intent;)Z", "hidden", "r0", "(Z)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlTribeMeetFrag;", "b", "p0", "()Z", "s0", "skipDefaultTab", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlTribeMeetFragPresenter extends ar2<ygp> {

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
    public static void m40460e0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Pair pair) {
        pair.getClass();
        intlTribeMeetFragPresenter.m40470o0(pair);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m40461f0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m40462g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m40463h0() {
        if (IntlCountryCodeController.m29114k()) {
            CoreModule.f18264c.f20432v0.m153377n3();
            CoreModule.f18264c.f20432v0.m153376m3();
            CoreModule.f18264c.f20429u0.m31443g7(CoreLikers.LikersTriggerBy.home_tab_msg);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m40464i0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Boolean bool) {
        if (bool.booleanValue()) {
            intlTribeMeetFragPresenter.skipDefaultTab = true;
            ((ygp) intlTribeMeetFragPresenter.viewModel).m215869w(1);
            ((ygp) intlTribeMeetFragPresenter.viewModel).m215862l().m40489B0(1);
            CoreModule.f18264c.f20409n1.m35278z3().m137019l(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static DoublePair m40465j0(User user) {
        if (user.settings == null) {
            return null;
        }
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m40466k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m40467l0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Bundle bundle) {
        ((ygp) intlTribeMeetFragPresenter.viewModel).m215864p();
        ((ygp) intlTribeMeetFragPresenter.viewModel).m215869w(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static Pair m40468m0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m40469n0(IntlTribeMeetFragPresenter intlTribeMeetFragPresenter, Triple triple) {
        ((ygp) intlTribeMeetFragPresenter.viewModel).m215862l().m40495y0((DoublePair) triple.getFirst(), ((RoamedLocationData) triple.getSecond()).data);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: o0 */
    private final void m40470o0(Pair<? extends Optional<vg60<User>>, ? extends Optional<vg60<User>>> pair) {
        int size;
        Optional<vg60<User>> first = pair.getFirst();
        Optional<vg60<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                vg60<User> vg60Var = first.get();
                List<User> list = vg60Var.f184001a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = vg60Var.f184001a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                vg60<User> vg60Var2 = second.get();
                List<User> list2 = vg60Var2.f184001a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = vg60Var2.f184002b.total;
                }
            }
            ((ygp) this.viewModel).m215865q(size + i);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m40471t0() {
        Long lValueOf = CoreModule.f18264c.f20429u0.f19996l0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(pzi0.m174454o());
        }
        CoreModule.f18264c.f20429u0.m31458m5();
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20432v0.m153369A3(lValueOf.longValue());
        CoreModule.f18264c.f20432v0.m153388y3("", lValueOf.longValue());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        if (IntlCountryCodeController.m29114k()) {
            m40471t0();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.fgp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m40467l0(this.f98962a, (Bundle) obj);
            }
        }, new x20() { // from class: l.ggp
            @Override // p153l.x20
            public final void call() {
                IntlTribeMeetFragPresenter.m40463h0();
            }
        });
        if (IntlCountryCodeController.m29114k()) {
            C22421c<Optional<vg60<User>>> c22421cM153380q3 = CoreModule.f18264c.f20432v0.m153380q3();
            C22421c<Optional<vg60<User>>> c22421cM153379p3 = CoreModule.f18264c.f20432v0.m153379p3();
            final Function2 function2 = new Function2() { // from class: l.hgp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m40468m0((Optional) obj, (Optional) obj2);
                }
            };
            duringCreated(psd0.m173625r(c22421cM153380q3, c22421cM153379p3, new rcj() { // from class: l.igp
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return IntlTribeMeetFragPresenter.m40461f0(function2, obj, obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.jgp
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlTribeMeetFragPresenter.m40460e0(this.f120754a, (Pair) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20409n1.m35278z3()).subscribe(psd0.m173596G(new y20() { // from class: l.kgp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m40464i0(this.f126638a, (Boolean) obj);
            }
        }));
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function1 = new Function1() { // from class: l.lgp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlTribeMeetFragPresenter.m40465j0((User) obj);
            }
        };
        C22421c<R> map = c22421cM116596o9.map(new qcj() { // from class: l.mgp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlTribeMeetFragPresenter.m40466k0(function1, obj);
            }
        });
        C22421c<RoamedLocationData> c22421cM159274k = CoreModule.f18264c.f20399k0.f20830R.m159274k();
        C22421c<Optional<AcceleratePairingStatus>> c22421cDistinctUntilChanged = ric0.INSTANCE.m181594b() ? CoreModule.f18264c.f20377c2.m118403o3().distinctUntilChanged() : C22421c.just(uxj0.f181467a);
        final IntlTribeMeetFragPresenter$initSubscription$7 intlTribeMeetFragPresenter$initSubscription$7 = IntlTribeMeetFragPresenter$initSubscription$7.INSTANCE;
        duringCreated(psd0.m173626s(map, c22421cM159274k, c22421cDistinctUntilChanged, new scj() { // from class: l.ngp
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return IntlTribeMeetFragPresenter.m40462g0(intlTribeMeetFragPresenter$initSubscription$7, obj, obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ogp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlTribeMeetFragPresenter.m40469n0(this.f147297a, (Triple) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getSkipDefaultTab() {
        return this.skipDefaultTab;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: q0 */
    public final boolean m40475q0(int requestCode, int resultCode, @Nullable Intent data) {
        Boolean boolValueOf;
        boolean zM29114k = IntlCountryCodeController.m29114k();
        V v2 = this.viewModel;
        if (zM29114k) {
            IntlMeetLikersFrag intlMeetLikersFragM215859i = ((ygp) v2).getMeetLikersFrag();
            if (intlMeetLikersFragM215859i == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetLikersFragM215859i.isAdded()) {
                    intlMeetLikersFragM215859i = null;
                }
                if (intlMeetLikersFragM215859i != null) {
                    boolValueOf = Boolean.valueOf(intlMeetLikersFragM215859i.m40385T4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        } else {
            IntlMeetFrag2 intlMeetFrag2M215858f = ((ygp) v2).getMeetFrag();
            if (intlMeetFrag2M215858f == null) {
                boolValueOf = null;
            } else {
                if (!intlMeetFrag2M215858f.isAdded()) {
                    intlMeetFrag2M215858f = null;
                }
                if (intlMeetFrag2M215858f != null) {
                    boolValueOf = Boolean.valueOf(intlMeetFrag2M215858f.m40438Q4(requestCode, resultCode, data));
                } else {
                    boolValueOf = null;
                }
            }
        }
        if (Intrinsics.m88377d(boolValueOf, Boolean.TRUE)) {
            return true;
        }
        IntlMeetTribeFrag intlMeetTribeFragM215860j = ((ygp) this.viewModel).getTribeFrag();
        if (intlMeetTribeFragM215860j == null) {
            return false;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM215860j.isAdded() ? intlMeetTribeFragM215860j : null;
        return intlMeetTribeFrag != null && intlMeetTribeFrag.m40448S4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m40476r0(boolean hidden) {
        IntlMeetTribeFrag intlMeetTribeFragM215860j;
        if (((ygp) this.viewModel).m215863m().getCurrentItem() == 0) {
            boolean zM29114k = IntlCountryCodeController.m29114k();
            V v2 = this.viewModel;
            if (zM29114k) {
                IntlMeetLikersFrag intlMeetLikersFragM215859i = ((ygp) v2).getMeetLikersFrag();
                if (intlMeetLikersFragM215859i != null) {
                    if (!intlMeetLikersFragM215859i.isAdded()) {
                        intlMeetLikersFragM215859i = null;
                    }
                    if (intlMeetLikersFragM215859i != null) {
                        intlMeetLikersFragM215859i.onHiddenChanged(hidden);
                    }
                }
                if (!hidden) {
                    m40471t0();
                }
            } else {
                IntlMeetFrag2 intlMeetFrag2M215858f = ((ygp) v2).getMeetFrag();
                if (intlMeetFrag2M215858f != null) {
                    if (!intlMeetFrag2M215858f.isAdded()) {
                        intlMeetFrag2M215858f = null;
                    }
                    if (intlMeetFrag2M215858f != null) {
                        intlMeetFrag2M215858f.onHiddenChanged(hidden);
                    }
                }
            }
        }
        if (((ygp) this.viewModel).m215863m().getCurrentItem() != 1 || (intlMeetTribeFragM215860j = ((ygp) this.viewModel).getTribeFrag()) == null) {
            return;
        }
        IntlMeetTribeFrag intlMeetTribeFrag = intlMeetTribeFragM215860j.isAdded() ? intlMeetTribeFragM215860j : null;
        if (intlMeetTribeFrag != null) {
            intlMeetTribeFrag.onHiddenChanged(hidden);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m40477s0(boolean z) {
        this.skipDefaultTab = z;
    }
}
