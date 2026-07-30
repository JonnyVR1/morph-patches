package p149l;

import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;
import com.p046p1.mobile.putong.data.Envelope;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/xr80;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;)V", "", "a0", "()V", "destroy", "z0", "A0", "Ll/mma$a;", "privateCustomSuggestData", "", "hasPrivateCustomPrivilege", "x0", "(Ll/mma$a;Z)V", "", "purchaseFrom", "C0", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;", "privateCustomSetting", "u0", "(Lcom/p1/mobile/putong/core/data/PrivateCustomSetting;)V", "a", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "y0", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "", "b", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userList", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xr80 extends jq2<PrivateCustomResultListViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomResultListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends mma.C18499a> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr80(@NotNull PrivateCustomResultListFrag privateCustomResultListFrag) {
        super(privateCustomResultListFrag);
        privateCustomResultListFrag.getClass();
        this.frag = privateCustomResultListFrag;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m210646D0(xr80 xr80Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "p_personalized,default";
        }
        xr80Var.m210664C0(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m210647e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Triple m210648f0(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m210649g0(Boolean bool) {
        CoreModule.f17545c.f19701y2.m155342Q3();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m210650h0(xr80 xr80Var, Bundle bundle) {
        xr80Var.m210668z0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m210651i0(xr80 xr80Var, Throwable th) {
        if (vwb.m200296J(xr80Var.userList)) {
            ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36233H();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m210652j0(xr80 xr80Var, roj0 roj0Var) {
        xr80Var.m210664C0("p_personalized_setting,personalized_start");
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m210653k0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210046I3());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m210654l0(xr80 xr80Var, Throwable th) {
        if (vwb.m200296J(xr80Var.userList)) {
            ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36233H();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Triple m210655m0(Boolean bool, Pair pair, PrivateCustomSetting privateCustomSetting) {
        return new Triple(bool, pair, privateCustomSetting);
    }

    /* JADX INFO: renamed from: n0 */
    public static C22306c m210656n0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static C22306c m210657o0(Envelope envelope) {
        return CoreModule.f17545c.f19701y2.m155341P3();
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m210658p0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210046I3());
    }

    /* JADX INFO: renamed from: q0 */
    public static void m210659q0(xr80 xr80Var) {
        ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36236K();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m210660r0(xr80 xr80Var, Triple triple) {
        ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36232G(false);
        if (!xma.m210046I3()) {
            Object second = triple.getSecond();
            second.getClass();
            if (vwb.m200296J((Collection) ((Pair) second).first)) {
                ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36231F(false, false);
                return;
            }
            Object second2 = triple.getSecond();
            second2.getClass();
            xr80Var.userList = (List) ((Pair) second2).first;
            PrivateCustomResultListViewModel privateCustomResultListViewModel = (PrivateCustomResultListViewModel) xr80Var.viewModel;
            Object second3 = triple.getSecond();
            second3.getClass();
            Object obj = ((Pair) second3).first;
            obj.getClass();
            privateCustomResultListViewModel.m36229C((List) obj, false);
            return;
        }
        if (NullChecker.m81303a(CoreModule.f17545c.f19701y2.m155360w3())) {
            PrivateCustomSetting privateCustomSettingMo223809clone = CoreModule.f17545c.f19701y2.m155360w3().mo223809clone();
            privateCustomSettingMo223809clone.getClass();
            xr80Var.m210665u0(privateCustomSettingMo223809clone);
            CoreModule.f17545c.f19701y2.m155356s3();
        }
        if (!((PrivateCustomSetting) triple.getThird()).hasIdealTypesSelected()) {
            ((PrivateCustomResultListViewModel) xr80Var.viewModel).m36231F(false, true);
            if (CoreModule.f17545c.f19701y2.m155344S3()) {
                xr80Var.frag.m36207S4();
                return;
            }
            return;
        }
        Object second4 = triple.getSecond();
        second4.getClass();
        if (vwb.m200296J((Collection) ((Pair) second4).first)) {
            Object second5 = triple.getSecond();
            second5.getClass();
            boolean zBooleanValue = ((Boolean) ((Pair) second5).second).booleanValue();
            V v2 = xr80Var.viewModel;
            if (zBooleanValue) {
                ((PrivateCustomResultListViewModel) v2).m36230E();
                return;
            } else {
                ((PrivateCustomResultListViewModel) v2).m36231F(true, true);
                return;
            }
        }
        Object second6 = triple.getSecond();
        second6.getClass();
        xr80Var.userList = (List) ((Pair) second6).first;
        PrivateCustomResultListViewModel privateCustomResultListViewModel2 = (PrivateCustomResultListViewModel) xr80Var.viewModel;
        Object second7 = triple.getSecond();
        second7.getClass();
        Object obj2 = ((Pair) second7).first;
        obj2.getClass();
        privateCustomResultListViewModel2.m36229C((List) obj2, true);
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m210661s0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m210662t0(Boolean bool) {
        CoreModule.f17545c.f19701y2.m155342Q3();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m210663A0() {
        m210668z0();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m210664C0(@NotNull String purchaseFrom) {
        purchaseFrom.getClass();
        if (xma.m210043F3()) {
            CoreModule.m29935P().m94656g().mo35058e8(this.frag.act(), purchaseFrom, null, null, null, null, null);
        } else {
            CoreModule.m29935P().m94656g().mo35083x7(this.frag.act(), purchaseFrom, null, null, null, null, null);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210650h0(this.f109187a, (Bundle) obj);
            }
        }, new d30() { // from class: l.sr80
            @Override // p149l.d30
            public final void call() {
                xr80.m210659q0(this.f166053a);
            }
        });
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("privateCustom")));
        final Function1 function1 = new Function1() { // from class: l.tr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xr80.m210658p0((UserPrivilege) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.ur80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xr80.m210647e0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.vr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210649g0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19701y2.m155363z3()).subscribe(mkd0.m154955G(new e30() { // from class: l.wr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210662t0((Boolean) obj);
            }
        }));
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("privateCustom"));
        final Function1 function2 = new Function1() { // from class: l.ir80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xr80.m210653k0((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.jr80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xr80.m210661s0(function2, obj);
            }
        }).distinctUntilChanged();
        C22306c<Pair<List<mma.C18499a>, Boolean>> c22306cM155357t3 = CoreModule.f17545c.f19701y2.m155357t3();
        C22306c<PrivateCustomSetting> c22306cM155361x3 = CoreModule.f17545c.f19701y2.m155361x3();
        final Function3 function3 = new Function3() { // from class: l.kr80
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return xr80.m210655m0((Boolean) obj, (Pair) obj2, (PrivateCustomSetting) obj3);
            }
        };
        duringCreated(mkd0.m154985s(c22306cDistinctUntilChanged, c22306cM155357t3, c22306cM155361x3, new y9j() { // from class: l.lr80
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return xr80.m210648f0(function3, obj, obj2, obj3);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.or80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210660r0(this.f145240a, (Triple) obj);
            }
        }, new e30() { // from class: l.pr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210654l0(this.f150861a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19701y2.m155358u3()).subscribe(mkd0.m154955G(new e30() { // from class: l.qr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210651i0(this.f155972a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19701y2.m155327B3()).subscribe(mkd0.m154955G(new e30() { // from class: l.rr80
            @Override // p149l.e30
            public final void call(Object obj) {
                xr80.m210652j0(this.f160729a, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m210665u0(@NotNull PrivateCustomSetting privateCustomSetting) {
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
        CoreModule.f17545c.f19701y2.m155351Z3();
        C22306c<Envelope> c22306cM155347V3 = CoreModule.f17545c.f19701y2.m155347V3(arrayList, privateCustomSetting.dimensions);
        final Function1 function1 = new Function1() { // from class: l.mr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xr80.m210657o0((Envelope) obj);
            }
        };
        c22306cM155347V3.flatMap(new w9j() { // from class: l.nr80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xr80.m210656n0(function1, obj);
            }
        }).subscribe((z3g0<? super R>) mkd0.m154950B());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m210666x0(@NotNull mma.C18499a privateCustomSuggestData, boolean hasPrivateCustomPrivilege) {
        privateCustomSuggestData.getClass();
        if (!hasPrivateCustomPrivilege) {
            m210646D0(this, null, 1, null);
        } else {
            zvf0.m220399u("e_custom_card", this.frag.pageId(), vwb.m200311Y("other_user_id", privateCustomSuggestData.f134594a.f56011id));
            CoreModule.m29935P().m94651a().mo33466an(this.frag, privateCustomSuggestData.f134594a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final PrivateCustomResultListFrag getFrag() {
        return this.frag;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m210668z0() {
        if (vwb.m200296J(this.userList)) {
            ((PrivateCustomResultListViewModel) this.viewModel).m36232G(true);
        }
        CoreModule.f17545c.f19701y2.m155342Q3();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
