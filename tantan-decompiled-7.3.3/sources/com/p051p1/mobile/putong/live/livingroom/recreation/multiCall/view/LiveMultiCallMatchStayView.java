package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallMatchStayViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveMultiCallMatchStayView;
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
import p151v.VRadioButton;
import p151v.VText;
import p153l.czq;
import p153l.htd0;
import p153l.ifv;
import p153l.jgc0;
import p153l.jr10;
import p153l.jxd0;
import p153l.k3t;
import p153l.p7t;
import p153l.pzi0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveMultiCallMatchStayView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallMatchStayViewBindings;", "Ll/p7t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "n0", "Ll/jxd0;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "getMultiCallMatchStayNotShow", "()Ll/jxd0;", "multiCallMatchStayNotShow", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveMultiCallMatchStayView extends LiveMultiCallMatchStayViewBindings<p7t<?>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy multiCallMatchStayNotShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMultiCallMatchStayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.multiCallMatchStayNotShow = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.q7t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveMultiCallMatchStayView.m76971i0();
            }
        });
    }

    private final jxd0 getMultiCallMatchStayNotShow() {
        return (jxd0) this.multiCallMatchStayNotShow.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static jxd0 m76971i0() {
        return ((ifv) zrv.m221194l(htd0.f111523e)).f114697f;
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m76972j0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        VRadioButton vRadioButton = liveMultiCallMatchStayView.f48866g;
        vRadioButton.setSelected(!vRadioButton.isSelected());
        liveMultiCallMatchStayView.getMultiCallMatchStayNotShow().put(Boolean.valueOf(liveMultiCallMatchStayView.f48866g.isSelected()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m76973k0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        Act act = liveMultiCallMatchStayView.act();
        if (act != null) {
            jr10.m146658e(liveMultiCallMatchStayView.f48866g.isSelected());
            k3t.m148164h(act, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m76974l0(LiveMultiCallMatchStayView liveMultiCallMatchStayView, View view) {
        view.getClass();
        Act act = liveMultiCallMatchStayView.act();
        if (act != null) {
            act.finishWithoutCustomAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m76976o0(Act act, DialogInterface dialogInterface) {
        act.onBackPressed();
    }

    /* JADX INFO: renamed from: r */
    private final void m76977r() {
        VText vText = this.f48869j;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.s7t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m76973k0(this.f166709a, (View) obj);
            }
        });
        VText vText2 = this.f48868i;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.t7t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m76974l0(this.f172468a, (View) obj);
            }
        });
        VRadioButton vRadioButton = this.f48866g;
        vRadioButton.getClass();
        czq.m113347c(vRadioButton, new Function1() { // from class: l.u7t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveMultiCallMatchStayView.m76972j0(this.f177936a, (View) obj);
            }
        });
        jr10.INSTANCE.m146671p("no_satisfied");
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76978n0() {
        final Act act = act();
        if (act != null) {
            ((ifv) zrv.m221194l(htd0.f111523e)).f114696e.put(Long.valueOf(pzi0.m174454o()));
            m76977r();
            DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(getContext(), jgc0.f120695b).setView(this).create();
            dialogInterfaceC0075aCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.r7t
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    LiveMultiCallMatchStayView.m76976o0(act, dialogInterface);
                }
            });
            dialogInterfaceC0075aCreate.setCanceledOnTouchOutside(true);
            dialogInterfaceC0075aCreate.show();
        }
    }

    public /* synthetic */ LiveMultiCallMatchStayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
