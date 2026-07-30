package p009l;

import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p000p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IdealTypes;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.mma;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xma;
import l.y9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ll/xr80;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;)V", "", "a0", "()V", "destroy", "z0", "A0", "Ll/mma$a;", "privateCustomSuggestData", "", "hasPrivateCustomPrivilege", "x0", "(Ll/mma$a;Z)V", "", "purchaseFrom", "C0", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", "privateCustomSetting", "u0", "(Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;)V", "a", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "y0", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xr80 extends jq2<PrivateCustomResultListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomResultListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends mma.a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr80(@NotNull PrivateCustomResultListFrag privateCustomResultListFrag) {
        super(privateCustomResultListFrag);
        privateCustomResultListFrag.getClass();
        this.frag = privateCustomResultListFrag;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m24967D0(xr80 xr80Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "p_personalized,default";
        }
        xr80Var.m24985C0(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m24968e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Triple m24969f0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m24970g0(Boolean bool) {
        CoreModule.c.y2.Q3();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m24971h0(xr80 xr80Var, Bundle bundle) {
        xr80Var.m24990z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m24972i0(xr80 xr80Var, Throwable th) {
        if (vwb.J(xr80Var.userList)) {
            ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m142H();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m24973j0(xr80 xr80Var, roj0 roj0Var) {
        xr80Var.m24985C0("p_personalized_setting,personalized_start");
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m24974k0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.I3());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m24975l0(xr80 xr80Var, Throwable th) {
        if (vwb.J(xr80Var.userList)) {
            ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m142H();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Triple m24976m0(Boolean bool, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(bool, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: n0 */
    public static c m24977n0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static c m24978o0(Envelope envelope) {
        return CoreModule.c.y2.P3();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m24979p0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.I3());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m24980q0(xr80 xr80Var) {
        ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m145K();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m24981r0(xr80 xr80Var, Triple triple) {
        ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m141G(false);
        if (!xma.I3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (vwb.J((Collection) ((Pair) second).first)) {
                ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m140F(false, false);
                return;
            }
            Object second2 = triple.getSecond();
            second2.getClass();
            xr80Var.userList = (List) ((Pair) second2).first;
            PrivateCustomResultListViewModel privateCustomResultListViewModel = (PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel;
            Object second3 = triple.getSecond();
            second3.getClass();
            Object obj = ((Pair) second3).first;
            obj.getClass();
            privateCustomResultListViewModel.m137C((List) obj, false);
            return;
        }
        if (NullChecker.a(CoreModule.c.y2.w3())) {
            PrivateCustomSetting privateCustomSettingClone = CoreModule.c.y2.w3().clone();
            privateCustomSettingClone.getClass();
            xr80Var.m24987u0(privateCustomSettingClone);
            CoreModule.c.y2.s3();
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel).m140F(false, true);
            if (CoreModule.c.y2.S3()) {
                xr80Var.frag.m114S4();
                return;
            }
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (vwb.J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            s7m s7mVar = ((jq2) xr80Var).viewModel;
            if (zBooleanValue) {
                ((PrivateCustomResultListViewModel) s7mVar).m139E();
                return;
            } else {
                ((PrivateCustomResultListViewModel) s7mVar).m140F(true, true);
                return;
            }
        }
        Object second6 = triple.getSecond();
        second6.getClass();
        xr80Var.userList = (List) ((Pair) second6).first;
        PrivateCustomResultListViewModel privateCustomResultListViewModel2 = (PrivateCustomResultListViewModel) ((jq2) xr80Var).viewModel;
        Object second7 = triple.getSecond();
        second7.getClass();
        Object obj2 = ((Pair) second7).first;
        obj2.getClass();
        privateCustomResultListViewModel2.m137C((List) obj2, true);
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m24982s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m24983t0(Boolean bool) {
        CoreModule.c.y2.Q3();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m24984A0() {
        m24990z0();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m24985C0(@NotNull String purchaseFrom) {
        purchaseFrom.getClass();
        if (xma.F3()) {
            CoreModule.P().g().e8(this.frag.act(), purchaseFrom, (Privilege) null, (e30) null, (d30) null, (d30) null, (d30) null);
        } else {
            CoreModule.P().g().x7(this.frag.act(), purchaseFrom, (Privilege) null, (e30) null, (d30) null, (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m24986a0() {
        super.a0();
        creates(new e30() { // from class: l.hr80
            public final void call(Object obj) {
                xr80.m24971h0(this.f14228a, (Bundle) obj);
            }
        }, new d30() { // from class: l.sr80
            public final void call() {
                xr80.m24980q0(this.f20434a);
            }
        });
        c cVarDuringCreated = duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("privateCustom")));
        final Function1 function1 = new Function1() { // from class: l.tr80
            public final Object invoke(Object obj) {
                return xr80.m24979p0((UserPrivilege) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.ur80
            public final Object call(Object obj) {
                return xr80.m24968e0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.vr80
            public final void call(Object obj) {
                xr80.m24970g0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.y2.z3()).subscribe(mkd0.G(new e30() { // from class: l.wr80
            public final void call(Object obj) {
                xr80.m24983t0((Boolean) obj);
            }
        }));
        c cVarU3 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("privateCustom"));
        final Function1 function2 = new Function1() { // from class: l.ir80
            public final Object invoke(Object obj) {
                return xr80.m24974k0((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarU3.map(new w9j() { // from class: l.jr80
            public final Object call(Object obj) {
                return xr80.m24982s0(function2, obj);
            }
        }).distinctUntilChanged();
        c cVarT3 = CoreModule.c.y2.t3();
        c cVarX3 = CoreModule.c.y2.x3();
        final Function3 function3 = new Function3() { // from class: l.kr80
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return xr80.m24976m0((Boolean) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(mkd0.s(cVarDistinctUntilChanged, cVarT3, cVarX3, new y9j() { // from class: l.lr80
            /* JADX INFO: renamed from: a */
            public final Object m17986a(Object obj, Object obj2, Object obj3) {
                return xr80.m24969f0(function3, obj, obj2, obj3);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.or80
            public final void call(Object obj) {
                xr80.m24981r0(this.f18216a, (Triple) obj);
            }
        }, new e30() { // from class: l.pr80
            public final void call(Object obj) {
                xr80.m24975l0(this.f18869a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.y2.u3()).subscribe(mkd0.G(new e30() { // from class: l.qr80
            public final void call(Object obj) {
                xr80.m24972i0(this.f19470a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.y2.B3()).subscribe(mkd0.G(new e30() { // from class: l.rr80
            public final void call(Object obj) {
                xr80.m24973j0(this.f19954a, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m24987u0(@NotNull PrivateCustomSetting privateCustomSetting) {
        privateCustomSetting.getClass();
        ArrayList arrayList = new ArrayList();
        int size = privateCustomSetting.idealTypes.size();
        for (int i = 0; i < size; i++) {
            if (((IdealTypes) privateCustomSetting.idealTypes.get(i)).selected) {
                String str = ((IdealTypes) privateCustomSetting.idealTypes.get(i)).value;
                str.getClass();
                arrayList.add(str);
            }
        }
        CoreModule.c.y2.Z3();
        c cVarV3 = CoreModule.c.y2.V3(arrayList, privateCustomSetting.dimensions);
        final Function1 function1 = new Function1() { // from class: l.mr80
            public final Object invoke(Object obj) {
                return xr80.m24978o0((Envelope) obj);
            }
        };
        cVarV3.flatMap(new w9j() { // from class: l.nr80
            public final Object call(Object obj) {
                return xr80.m24977n0(function1, obj);
            }
        }).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m24988x0(@NotNull mma.a privateCustomSuggestData, boolean hasPrivateCustomPrivilege) {
        privateCustomSuggestData.getClass();
        if (!hasPrivateCustomPrivilege) {
            m24967D0(this, null, 1, null);
        } else {
            zvf0.u("e_custom_card", this.frag.pageId(), new j760[]{vwb.Y("other_user_id", ((DbObject) privateCustomSuggestData.a).id)});
            CoreModule.P().a().an(this.frag, privateCustomSuggestData.a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final PrivateCustomResultListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m24990z0() {
        if (vwb.J(this.userList)) {
            ((PrivateCustomResultListViewModel) ((jq2) this).viewModel).m141G(true);
        }
        CoreModule.c.y2.Q3();
    }

    public void destroy() {
    }
}
