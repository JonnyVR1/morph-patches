package p153l;

import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Ll/b090;", "Ll/ar2;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;)V", "", "a0", "()V", "destroy", "z0", "A0", "Ll/yna$a;", "privateCustomSuggestData", "", "hasPrivateCustomPrivilege", "x0", "(Ll/yna$a;Z)V", "", "purchaseFrom", "C0", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", "privateCustomSetting", "u0", "(Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;)V", "a", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "y0", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b090 extends ar2<PrivateCustomResultListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomResultListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends yna.C21645a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b090(@NotNull PrivateCustomResultListFrag privateCustomResultListFrag) {
        super(privateCustomResultListFrag);
        privateCustomResultListFrag.getClass();
        this.frag = privateCustomResultListFrag;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m101264D0(b090 b090Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "p_personalized,default";
        }
        b090Var.m101282C0(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m101265e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Triple m101266f0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m101267g0(Boolean bool) {
        CoreModule.f18264c.f20443y2.m216811Q3();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m101268h0(b090 b090Var, Bundle bundle) {
        b090Var.m101286z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m101269i0(b090 b090Var, Throwable th) {
        if (jyb.m147479J(b090Var.userList)) {
            ((PrivateCustomResultListViewModel) b090Var.viewModel).m37236H();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m101270j0(b090 b090Var, uxj0 uxj0Var) {
        b090Var.m101282C0("p_personalized_setting,personalized_start");
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m101271k0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146360J3());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m101272l0(b090 b090Var, Throwable th) {
        if (jyb.m147479J(b090Var.userList)) {
            ((PrivateCustomResultListViewModel) b090Var.viewModel).m37236H();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Triple m101273m0(Boolean bool, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(bool, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: n0 */
    public static C22421c m101274n0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static C22421c m101275o0(Envelope envelope) {
        return CoreModule.f18264c.f20443y2.m216810P3();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m101276p0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146360J3());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m101277q0(b090 b090Var) {
        ((PrivateCustomResultListViewModel) b090Var.viewModel).m37239K();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m101278r0(b090 b090Var, Triple triple) {
        ((PrivateCustomResultListViewModel) b090Var.viewModel).m37235G(false);
        if (!joa.m146360J3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (jyb.m147479J((Collection) ((Pair) second).first)) {
                ((PrivateCustomResultListViewModel) b090Var.viewModel).m37234F(false, false);
                return;
            }
            Object second2 = triple.getSecond();
            second2.getClass();
            b090Var.userList = (List) ((Pair) second2).first;
            PrivateCustomResultListViewModel privateCustomResultListViewModel = (PrivateCustomResultListViewModel) b090Var.viewModel;
            Object second3 = triple.getSecond();
            second3.getClass();
            Object obj = ((Pair) second3).first;
            obj.getClass();
            privateCustomResultListViewModel.m37232C((List) obj, false);
            return;
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20443y2.m216829w3())) {
            PrivateCustomSetting privateCustomSettingMo225055clone = CoreModule.f18264c.f20443y2.m216829w3().mo225055clone();
            privateCustomSettingMo225055clone.getClass();
            b090Var.m101283u0(privateCustomSettingMo225055clone);
            CoreModule.f18264c.f20443y2.m216825s3();
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((PrivateCustomResultListViewModel) b090Var.viewModel).m37234F(false, true);
            if (CoreModule.f18264c.f20443y2.m216813S3()) {
                b090Var.frag.m37210S4();
                return;
            }
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (jyb.m147479J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            V v2 = b090Var.viewModel;
            if (zBooleanValue) {
                ((PrivateCustomResultListViewModel) v2).m37233E();
                return;
            } else {
                ((PrivateCustomResultListViewModel) v2).m37234F(true, true);
                return;
            }
        }
        Object second6 = triple.getSecond();
        second6.getClass();
        b090Var.userList = (List) ((Pair) second6).first;
        PrivateCustomResultListViewModel privateCustomResultListViewModel2 = (PrivateCustomResultListViewModel) b090Var.viewModel;
        Object second7 = triple.getSecond();
        second7.getClass();
        Object obj2 = ((Pair) second7).first;
        obj2.getClass();
        privateCustomResultListViewModel2.m37232C((List) obj2, true);
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m101279s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m101280t0(Boolean bool) {
        CoreModule.f18264c.f20443y2.m216811Q3();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m101281A0() {
        m101286z0();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m101282C0(@NotNull String purchaseFrom) {
        purchaseFrom.getClass();
        if (joa.m146357G3()) {
            CoreModule.m30933P().m143410g().mo36061e8(this.frag.act(), purchaseFrom, null, null, null, null, null);
        } else {
            CoreModule.m30933P().m143410g().mo36086x7(this.frag.act(), purchaseFrom, null, null, null, null, null);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101268h0(this.f134164a, (Bundle) obj);
            }
        }, new x20() { // from class: l.wz80
            @Override // p153l.x20
            public final void call() {
                b090.m101277q0(this.f191735a);
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("privateCustom")));
        final Function1 function1 = new Function1() { // from class: l.xz80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b090.m101276p0((UserPrivilege) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.yz80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b090.m101265e0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.zz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101267g0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20443y2.m216832z3()).subscribe(psd0.m173596G(new y20() { // from class: l.a090
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101280t0((Boolean) obj);
            }
        }));
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("privateCustom"));
        final Function1 function2 = new Function1() { // from class: l.mz80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b090.m101271k0((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.nz80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b090.m101279s0(function2, obj);
            }
        }).distinctUntilChanged();
        C22421c<Pair<List<yna.C21645a>, Boolean>> c22421cM216826t3 = CoreModule.f18264c.f20443y2.m216826t3();
        C22421c<PrivateCustomSetting> c22421cM216830x3 = CoreModule.f18264c.f20443y2.m216830x3();
        final Function3 function3 = new Function3() { // from class: l.oz80
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return b090.m101273m0((Boolean) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(psd0.m173626s(c22421cDistinctUntilChanged, c22421cM216826t3, c22421cM216830x3, new scj() { // from class: l.pz80
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return b090.m101266f0(function3, obj, obj2, obj3);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.sz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101278r0(this.f171364a, (Triple) obj);
            }
        }, new y20() { // from class: l.tz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101272l0(this.f176747a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20443y2.m216827u3()).subscribe(psd0.m173596G(new y20() { // from class: l.uz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101269i0(this.f181711a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20443y2.m216796B3()).subscribe(psd0.m173596G(new y20() { // from class: l.vz80
            @Override // p153l.y20
            public final void call(Object obj) {
                b090.m101270j0(this.f186453a, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m101283u0(@NotNull PrivateCustomSetting privateCustomSetting) {
        privateCustomSetting.getClass();
        ArrayList arrayList = new ArrayList();
        int size = privateCustomSetting.idealTypes.size();
        for (int i = 0; i < size; i++) {
            if (privateCustomSetting.idealTypes.get(i).selected) {
                String str = privateCustomSetting.idealTypes.get(i).value;
                str.getClass();
                arrayList.add(str);
            }
        }
        CoreModule.f18264c.f20443y2.m216820Z3();
        C22421c<Envelope> c22421cM216816V3 = CoreModule.f18264c.f20443y2.m216816V3(arrayList, privateCustomSetting.dimensions);
        final Function1 function1 = new Function1() { // from class: l.qz80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b090.m101275o0((Envelope) obj);
            }
        };
        c22421cM216816V3.flatMap(new qcj() { // from class: l.rz80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b090.m101274n0(function1, obj);
            }
        }).subscribe((gcg0<? super R>) psd0.m173591B());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m101284x0(@NotNull yna.C21645a privateCustomSuggestData, boolean hasPrivateCustomPrivilege) {
        privateCustomSuggestData.getClass();
        if (!hasPrivateCustomPrivilege) {
            m101264D0(this, null, 1, null);
        } else {
            i4g0.m138523u("e_custom_card", this.frag.pageId(), jyb.m147494Y("other_user_id", privateCustomSuggestData.f200816a.f56859id));
            CoreModule.m30933P().m143405a().mo34469an(this.frag, privateCustomSuggestData.f200816a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final PrivateCustomResultListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m101286z0() {
        if (jyb.m147479J(this.userList)) {
            ((PrivateCustomResultListViewModel) this.viewModel).m37235G(true);
        }
        CoreModule.f18264c.f20443y2.m216811Q3();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
