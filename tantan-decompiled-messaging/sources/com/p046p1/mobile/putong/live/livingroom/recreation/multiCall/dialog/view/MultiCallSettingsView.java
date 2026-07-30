package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallSettingsViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.cxq;
import p149l.h4t;
import p149l.mg10;
import p149l.rl10;
import p149l.rxl;
import p149l.w8u;
import p149l.xdl0;
import p149l.xh0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallSettingsView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallSettingsViewBindings;", "Ll/mg10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r0", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "checked", "q0", "(Z)V", "p0", "", "currentDeputyCount", "show", "s0", "(IZ)V", "getCurrentSelectedDeputyCount", "()I", "j", "Lcom/p1/mobile/android/app/Act;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallSettingsView extends LiveMultiCallSettingsViewBindings<mg10> implements rxl {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Act act;

    public /* synthetic */ MultiCallSettingsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m75776i0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((mg10) multiCallSettingsView.f48036d).m154488S3(multiCallSettingsView.f48040h.f48035g.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75777j0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((mg10) multiCallSettingsView.f48036d).m154489T3(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m75778k0(MultiCallSettingsView multiCallSettingsView, View view) {
        ((mg10) multiCallSettingsView.f48036d).m154487R3();
        ((mg10) multiCallSettingsView.f48036d).m154486P3();
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m75779l0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((mg10) multiCallSettingsView.f48036d).m154489T3(9);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m75780m0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((mg10) multiCallSettingsView.f48036d).m154489T3(6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static Unit m75781n0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        ((mg10) multiCallSettingsView.f48036d).m154485O3(multiCallSettingsView.f48039g.f48035g.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m75782o0(MultiCallSettingsView multiCallSettingsView, View view) {
        view.getClass();
        multiCallSettingsView.m75783r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m75783r0() {
        boolean zM179774a = rl10.m179774a((h4t) this.f48036d, ypv.f199493a.m199309D0());
        Act act = this.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        new xh0.C21150a(act).m208731j(w8u.m202217t(zM179774a ? R$string.f47496r9 : R$string.f47232f8)).m208739r(w8u.m202217t(zM179774a ? R$string.f47474q9 : R$string.f47577v2)).m208736o(new View.OnClickListener() { // from class: l.tg10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiCallSettingsView.m75778k0(this.f170042a, view);
            }
        }).m208726e(R$string.f46842N1).m208728g(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m75784t0(MultiCallSettingsView multiCallSettingsView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        multiCallSettingsView.m75787s0(i, z);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public /* bridge */ void mo75692F() {
        super.mo75692F();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        xdl0.m208344M(this.f48039g, !Intrinsics.m87488d("friends", ((mg10) this.f48036d).m206027E2().mo149813j().liveMode));
        MultiCallSettingsItemView multiCallSettingsItemView = this.f48039g;
        String strM202217t = w8u.m202217t(R$string.f46975T8);
        strM202217t.getClass();
        multiCallSettingsItemView.setTitle(strM202217t);
        MultiCallSettingsItemView multiCallSettingsItemView2 = this.f48040h;
        String strM202217t2 = w8u.m202217t(R$string.f46891P8);
        strM202217t2.getClass();
        multiCallSettingsItemView2.setTitle(strM202217t2);
        VSwitchButton vSwitchButton = this.f48039g.f48035g;
        vSwitchButton.getClass();
        cxq.m109105c(vSwitchButton, new Function1() { // from class: l.ng10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75781n0(this.f138832a, (View) obj);
            }
        });
        VSwitchButton vSwitchButton2 = this.f48040h.f48035g;
        vSwitchButton2.getClass();
        cxq.m109105c(vSwitchButton2, new Function1() { // from class: l.og10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75776i0(this.f143797a, (View) obj);
            }
        });
        xdl0.m208344M(this.f48041i, !Intrinsics.m87488d("friends", ((mg10) this.f48036d).m206027E2().mo149813j().liveMode));
        TextView textView = this.f48041i;
        textView.getClass();
        cxq.m109105c(textView, new Function1() { // from class: l.pg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75782o0(this.f148606a, (View) obj);
            }
        });
        VText vText = this.f48038f.f48044f;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.qg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75777j0(this.f154304a, (View) obj);
            }
        });
        VText vText2 = this.f48038f.f48045g;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.rg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75780m0(this.f159221a, (View) obj);
            }
        });
        VText vText3 = this.f48038f.f48046h;
        vText3.getClass();
        cxq.m109105c(vText3, new Function1() { // from class: l.sg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallSettingsView.m75779l0(this.f164361a, (View) obj);
            }
        });
    }

    public final int getCurrentSelectedDeputyCount() {
        return this.f48038f.getSelectedCount();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75785p0(boolean checked) {
        this.f48040h.setChecked(checked);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75786q0(boolean checked) {
        this.f48039g.setChecked(checked);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75787s0(int currentDeputyCount, boolean show) {
        xdl0.m208344M(this.f48038f, show);
        this.f48038f.setSelectedCount(currentDeputyCount);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallSettingsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
