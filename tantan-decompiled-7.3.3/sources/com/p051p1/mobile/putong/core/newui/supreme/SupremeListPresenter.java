package com.p051p1.mobile.putong.core.newui.supreme;

import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeListPresenter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.ar2;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.rcj;
import p153l.scj;
import p153l.x20;
import p153l.y20;
import p153l.y6b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Ll/ar2;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;)V", "", "a0", "()V", "destroy", "p0", "r0", "Ll/y6b$a;", "supremeSuggestData", "", "hasSupremePartner", "n0", "(Ll/y6b$a;Z)V", "q0", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "o0", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SupremeListPresenter extends ar2<SupremeListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremeListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends y6b.C21531a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupremeListPresenter(@NotNull SupremeListFrag supremeListFrag) {
        super(supremeListFrag);
        supremeListFrag.getClass();
        this.frag = supremeListFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m44807e0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (jyb.m147479J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m44836G();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m44808f0(SupremeListPresenter supremeListPresenter, Triple triple) {
        ((SupremeListViewModel) supremeListPresenter.viewModel).m44835F(false);
        if (!joa.m146363O3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (jyb.m147479J((Collection) ((Pair) second).first)) {
                ((SupremeListViewModel) supremeListPresenter.viewModel).m44834E(false, false);
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
            supremeListViewModel.m44832B((List) obj, false);
            return;
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m44834E(false, true);
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (jyb.m147479J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            V v2 = supremeListPresenter.viewModel;
            if (zBooleanValue) {
                ((SupremeListViewModel) v2).m44833C();
                return;
            } else {
                ((SupremeListViewModel) v2).m44834E(true, true);
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
        supremeListViewModel2.m44832B((List) obj2, true);
    }

    /* JADX INFO: renamed from: g0 */
    public static Triple m44809g0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m44810h0(SupremeListPresenter supremeListPresenter) {
        ((SupremeListViewModel) supremeListPresenter.viewModel).m44839J();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m44811i0(pf60 pf60Var) {
        CoreModule.f18264c.f20386f2.m214431H3();
    }

    /* JADX INFO: renamed from: j0 */
    public static pf60 m44812j0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: k0 */
    public static Triple m44813k0(UserPrivilege userPrivilege, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(userPrivilege, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m44814l0(SupremeListPresenter supremeListPresenter, Bundle bundle) {
        supremeListPresenter.m44818p0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m44815m0(SupremeListPresenter supremeListPresenter, Throwable th) {
        if (jyb.m147479J(supremeListPresenter.userList)) {
            ((SupremeListViewModel) supremeListPresenter.viewModel).m44836G();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.v8h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SupremeListPresenter.m44814l0(this.f182876a, (Bundle) obj);
            }
        }, new x20() { // from class: l.w8h0
            @Override // p153l.x20
            public final void call() {
                SupremeListPresenter.m44810h0(this.f187854a);
            }
        });
        C22421c<UserPrivilege> c22421cDistinctUntilChanged = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        C22421c<Boolean> c22421cM214442v3 = CoreModule.f18264c.f20386f2.m214442v3();
        final SupremeListPresenter$initSubscription$3 supremeListPresenter$initSubscription$3 = SupremeListPresenter$initSubscription$3.INSTANCE;
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged, c22421cM214442v3, new rcj() { // from class: l.x8h0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return SupremeListPresenter.m44812j0(supremeListPresenter$initSubscription$3, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.y8h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SupremeListPresenter.m44811i0((pf60) obj);
            }
        }));
        C22421c<UserPrivilege> c22421cDistinctUntilChanged2 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        C22421c<Pair<List<y6b.C21531a>, Boolean>> c22421cM214437N3 = CoreModule.f18264c.f20386f2.m214437N3();
        C22421c<PrivateCustomSetting> c22421cM214440t3 = CoreModule.f18264c.f20386f2.m214440t3();
        final Function3 function3 = new Function3() { // from class: l.z8h0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m44813k0((UserPrivilege) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(psd0.m173626s(c22421cDistinctUntilChanged2, c22421cM214437N3, c22421cM214440t3, new scj() { // from class: l.a9h0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return SupremeListPresenter.m44809g0(function3, obj, obj2, obj3);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.b9h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SupremeListPresenter.m44808f0(this.f75582a, (Triple) obj);
            }
        }, new y20() { // from class: l.c9h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SupremeListPresenter.m44815m0(this.f80486a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20386f2.m214436M3()).subscribe(psd0.m173596G(new y20() { // from class: l.d9h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SupremeListPresenter.m44807e0(this.f85776a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n0 */
    public final void m44816n0(@NotNull y6b.C21531a supremeSuggestData, boolean hasSupremePartner) {
        supremeSuggestData.getClass();
        if (!hasSupremePartner) {
            m44819q0();
        } else {
            i4g0.m138523u("e_custom_card", this.frag.pageId(), jyb.m147494Y("other_user_id", supremeSuggestData.f197670a.f56859id));
            CoreModule.m30933P().m143405a().mo34469an(this.frag, supremeSuggestData.f197670a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final SupremeListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m44818p0() {
        if (jyb.m147479J(this.userList)) {
            ((SupremeListViewModel) this.viewModel).m44835F(true);
        }
        CoreModule.f18264c.f20386f2.m214431H3();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m44819q0() {
        CoreModule.f18264c.f20386f2.m214443w3(act());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m44820r0() {
        m44818p0();
    }
}
