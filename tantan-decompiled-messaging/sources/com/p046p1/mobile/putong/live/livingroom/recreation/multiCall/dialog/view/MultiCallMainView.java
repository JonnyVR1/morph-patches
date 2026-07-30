package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallMainViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.aa10;
import p149l.bt0;
import p149l.cxq;
import p149l.rxl;
import p149l.vdt;
import p149l.xdl0;
import p149l.z910;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallMainView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallMainViewBindings;", "Ll/aa10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "type", "", "hasAnim", "o0", "(IZ)V", "lastType", "newType", "q0", "(IIZ)V", "n0", "(II)I", "Landroid/view/View;", "p0", "(I)Landroid/view/View;", "m", "I", "tabType", "n", "Lcom/p1/mobile/android/app/Act;", "Ll/z910;", "o", "Lkotlin/Lazy;", "getMainAdapter", "()Ll/z910;", "mainAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallMainView extends LiveMultiCallMainViewBindings<aa10> implements rxl {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int tabType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallMainView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.tabType = -1;
        this.mainAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.x910
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallMainView.m75751j0(this.f191568a);
            }
        });
    }

    private final z910 getMainAdapter() {
        return (z910) this.mainAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m75750i0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m75756o0(1, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static z910 m75751j0(MultiCallMainView multiCallMainView) {
        Act act = multiCallMainView.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        T t = multiCallMainView.f48006d;
        t.getClass();
        return new z910(act, (aa10) t);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m75752k0(MultiCallMainView multiCallMainView, int i, int i2, boolean z) {
        xdl0.m208345M0(multiCallMainView.f48013k, true);
        float fM75755n0 = multiCallMainView.m75755n0(i, i2);
        View view = multiCallMainView.f48013k;
        if (z) {
            bt0.m103743p(view, "translationX", 0L, 100L, new LinearInterpolator(), multiCallMainView.f48013k.getTranslationX(), multiCallMainView.f48013k.getTranslationX() + fM75755n0).start();
        } else {
            view.setTranslationX(fM75755n0);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m75753l0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m75756o0(2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m75754m0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m75756o0(0, true);
        return Unit.INSTANCE;
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public /* bridge */ void mo75692F() {
        super.mo75692F();
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        ViewPager2 viewPager2 = this.f48014l;
        viewPager2.setAdapter(getMainAdapter());
        viewPager2.setUserInputEnabled(false);
        m75756o0(((aa10) this.f48006d).m95515J3(), false);
        VText vText = this.f48009g;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.u910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m75754m0(this.f175187a, (View) obj);
            }
        });
        VText vText2 = this.f48010h;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.v910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m75750i0(this.f180601a, (View) obj);
            }
        });
        VText vText3 = this.f48011i;
        vText3.getClass();
        cxq.m109105c(vText3, new Function1() { // from class: l.w910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m75753l0(this.f185291a, (View) obj);
            }
        });
        if (vdt.m198092b(2)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f48010h.getLayoutParams();
        layoutParams.getClass();
        ((ConstraintLayout.C0220a) layoutParams).setMarginStart(xdl0.m208407w(20.0f));
        ViewGroup.LayoutParams layoutParams2 = this.f48011i.getLayoutParams();
        layoutParams2.getClass();
        ((ConstraintLayout.C0220a) layoutParams2).setMarginStart(xdl0.m208407w(20.0f));
    }

    /* JADX INFO: renamed from: n0 */
    public final int m75755n0(int lastType, int newType) {
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(m75757p0(newType));
        xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(m75757p0(lastType));
        return (c21104gM208380i0.f192418a + (c21104gM208380i0.f192420c / 2)) - (c21104gM208380i1.f192418a + (c21104gM208380i1.f192420c / 2));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75756o0(int type, boolean hasAnim) {
        int i = this.tabType;
        if (i == type) {
            return;
        }
        this.tabType = type;
        this.f48009g.setSelected(type == 0);
        this.f48010h.setSelected(type == 1);
        this.f48011i.setSelected(type == 2);
        this.f48014l.m4250j(type, false);
        m75758q0(i, type, hasAnim);
    }

    /* JADX INFO: renamed from: p0 */
    public final View m75757p0(int type) {
        if (type == 1) {
            VText vText = this.f48010h;
            vText.getClass();
            return vText;
        }
        if (type != 2) {
            VText vText2 = this.f48009g;
            vText2.getClass();
            return vText2;
        }
        VText vText3 = this.f48011i;
        vText3.getClass();
        return vText3;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75758q0(final int lastType, final int newType, final boolean hasAnim) {
        this.f48010h.post(new Runnable() { // from class: l.y910
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallMainView.m75752k0(this.f196926a, lastType, newType, hasAnim);
            }
        });
    }

    public /* synthetic */ MultiCallMainView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
