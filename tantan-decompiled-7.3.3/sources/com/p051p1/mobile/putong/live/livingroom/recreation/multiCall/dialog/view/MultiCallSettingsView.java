package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallSettingsViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.bu10;
import p153l.czq;
import p153l.i6t;
import p153l.k0m;
import p153l.th0;
import p153l.wo10;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallSettingsViewBindings;", "Ll/wo10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r0", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "checked", "q0", "(Z)V", "p0", "", "currentDeputyCount", "show", "s0", "(IZ)V", "getCurrentSelectedDeputyCount", "()I", "j", "Lcom/p1/mobile/android/app/Act;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallSettingsView extends LiveMultiCallSettingsViewBindings<wo10> implements k0m {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Act act;

    public /* synthetic */ MultiCallSettingsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m76959i0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((wo10) multiCallSettingsView.f48884d).m207243S3(multiCallSettingsView.f48888h.f48883g.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m76960j0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((wo10) multiCallSettingsView.f48884d).m207244T3(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m76961k0(MultiCallSettingsView multiCallSettingsView, View view) {
        ((wo10) multiCallSettingsView.f48884d).m207242R3();
        ((wo10) multiCallSettingsView.f48884d).m207241P3();
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m76962l0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((wo10) multiCallSettingsView.f48884d).m207244T3(9);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m76963m0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((wo10) multiCallSettingsView.f48884d).m207244T3(6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static Unit m76964n0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((wo10) multiCallSettingsView.f48884d).m207240O3(multiCallSettingsView.f48887g.f48883g.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m76965o0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        multiCallSettingsView.m76966r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m76966r0() {
        boolean zM106416a = bu10.m106416a((i6t) this.f48884d, zrv.f205799a.m207631D0());
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        new th0.C20312a(act).m191151j(xau.m209910t(zM106416a ? R$string.f48344r9 : R$string.f48080f8)).m191159r(xau.m209910t(zM106416a ? R$string.f48322q9 : R$string.f48425v2)).m191156o(new View.OnClickListener() { // from class: l.dp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiCallSettingsView.m76961k0(this.f90022a, view);
            }
        }).m191146e(R$string.f47690N1).m191148g(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m76967t0(MultiCallSettingsView multiCallSettingsView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        multiCallSettingsView.m76970s0(i, z);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public /* bridge */ void mo76875F() {
        super.mo76875F();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        bnl0.m105524M(this.f48887g, !Intrinsics.m88377d("friends", ((wo10) this.f48884d).m213810E2().mo183435j().liveMode));
        MultiCallSettingsItemView multiCallSettingsItemView = this.f48887g;
        String strM209910t = xau.m209910t(R$string.f47823T8);
        strM209910t.getClass();
        multiCallSettingsItemView.setTitle(strM209910t);
        MultiCallSettingsItemView multiCallSettingsItemView2 = this.f48888h;
        String strM209910t2 = xau.m209910t(R$string.f47739P8);
        strM209910t2.getClass();
        multiCallSettingsItemView2.setTitle(strM209910t2);
        VSwitchButton vSwitchButton = this.f48887g.f48883g;
        vSwitchButton.getClass();
        czq.m113347c(vSwitchButton, new Function1() { // from class: l.xo10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76964n0(this.f195551a, (View) obj);
            }
        });
        VSwitchButton vSwitchButton2 = this.f48888h.f48883g;
        vSwitchButton2.getClass();
        czq.m113347c(vSwitchButton2, new Function1() { // from class: l.yo10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76959i0(this.f200943a, (View) obj);
            }
        });
        bnl0.m105524M(this.f48889i, !Intrinsics.m88377d("friends", ((wo10) this.f48884d).m213810E2().mo183435j().liveMode));
        TextView textView = this.f48889i;
        textView.getClass();
        czq.m113347c(textView, new Function1() { // from class: l.zo10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76965o0(this.f205268a, (View) obj);
            }
        });
        VText vText = this.f48886f.f48892f;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.ap10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76960j0(this.f72683a, (View) obj);
            }
        });
        VText vText2 = this.f48886f.f48893g;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.bp10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76963m0(this.f77722a, (View) obj);
            }
        });
        VText vText3 = this.f48886f.f48894h;
        vText3.getClass();
        czq.m113347c(vText3, new Function1() { // from class: l.cp10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m76962l0(this.f82954a, (View) obj);
            }
        });
    }

    public final int getCurrentSelectedDeputyCount() {
        return this.f48886f.getSelectedCount();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76968p0(boolean checked) {
        this.f48888h.setChecked(checked);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76969q0(boolean checked) {
        this.f48887g.setChecked(checked);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76970s0(int currentDeputyCount, boolean show) {
        bnl0.m105524M(this.f48886f, show);
        this.f48886f.setSelectedCount(currentDeputyCount);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallSettingsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
