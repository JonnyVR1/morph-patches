package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallMatchStayViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRadioButton;
import p147v.VText;
import p149l.cxq;
import p149l.d8c0;
import p149l.fld0;
import p149l.hdv;
import p149l.hpd0;
import p149l.j1t;
import p149l.mqi0;
import p149l.o5t;
import p149l.ypv;
import p149l.zi10;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallMatchStayViewBindings;", "Ll/o5t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "n0", "Ll/hpd0;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "getMultiCallMatchStayNotShow", "()Ll/hpd0;", "multiCallMatchStayNotShow", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveMultiCallMatchStayView extends LiveMultiCallMatchStayViewBindings<o5t<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy multiCallMatchStayNotShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMultiCallMatchStayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.multiCallMatchStayNotShow = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.p5t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveMultiCallMatchStayView.m75788i0();
            }
        });
    }

    private final hpd0 getMultiCallMatchStayNotShow() {
        return (hpd0) this.multiCallMatchStayNotShow.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static hpd0 m75788i0() {
        return ((hdv) ypv.m215673l(fld0.f98150e)).f107300f;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75789j0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        VRadioButton vRadioButton = liveMultiCallMatchStayView.f48018g;
        vRadioButton.setSelected(!vRadioButton.isSelected());
        liveMultiCallMatchStayView.getMultiCallMatchStayNotShow().put(Boolean.valueOf(liveMultiCallMatchStayView.f48018g.isSelected()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m75790k0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        Act act = liveMultiCallMatchStayView.act();
        if (act != null) {
            zi10.m218894e(liveMultiCallMatchStayView.f48018g.isSelected());
            j1t.m139384h(act, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m75791l0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        Act act = liveMultiCallMatchStayView.act();
        if (act != null) {
            act.finishWithoutCustomAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m75793o0(Act act, DialogInterface dialogInterface) {
        act.onBackPressed();
    }

    /* JADX INFO: renamed from: r */
    private final void m75794r() {
        VText vText = this.f48021j;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.r5t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m75790k0(this.f157869a, (View) obj);
            }
        });
        VText vText2 = this.f48020i;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.s5t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m75791l0(this.f162583a, (View) obj);
            }
        });
        VRadioButton vRadioButton = this.f48018g;
        vRadioButton.getClass();
        cxq.m109105c(vRadioButton, new Function1() { // from class: l.t5t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m75789j0(this.f167848a, (View) obj);
            }
        });
        zi10.INSTANCE.m218907p("no_satisfied");
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75795n0() {
        final Act act = act();
        if (act != null) {
            ((hdv) ypv.m215673l(fld0.f98150e)).f107299e.put(Long.valueOf(mqi0.m155944o()));
            m75794r();
            DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(getContext(), d8c0.f84847b).setView(this).create();
            dialogInterfaceC0074aCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.q5t
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LiveMultiCallMatchStayView.m75793o0(act, dialogInterface);
                }
            });
            dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(true);
            dialogInterfaceC0074aCreate.show();
        }
    }

    public /* synthetic */ LiveMultiCallMatchStayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
