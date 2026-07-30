package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallMainViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
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
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.gt0;
import p153l.ji10;
import p153l.k0m;
import p153l.ki10;
import p153l.wft;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallMainView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallMainViewBindings;", "Ll/ki10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "type", "", "hasAnim", "o0", "(IZ)V", "lastType", "newType", "q0", "(IIZ)V", "n0", "(II)I", "Landroid/view/View;", "p0", "(I)Landroid/view/View;", "m", "I", "tabType", "n", "Lcom/p1/mobile/android/app/Act;", "Ll/ji10;", "o", "Lkotlin/Lazy;", "getMainAdapter", "()Ll/ji10;", "mainAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallMainView extends LiveMultiCallMainViewBindings<ki10> implements k0m {

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
        this.mainAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.hi10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallMainView.m76934j0(this.f109976a);
            }
        });
    }

    private final ji10 getMainAdapter() {
        return (ji10) this.mainAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m76933i0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m76939o0(1, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static ji10 m76934j0(MultiCallMainView multiCallMainView) {
        Act act = multiCallMainView.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        T t = multiCallMainView.f48854d;
        t.getClass();
        return new ji10(act, (ki10) t);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m76935k0(MultiCallMainView multiCallMainView, int i, int i2, boolean z) {
        bnl0.m105525M0(multiCallMainView.f48861k, true);
        float fM76938n0 = multiCallMainView.m76938n0(i, i2);
        View view = multiCallMainView.f48861k;
        if (z) {
            gt0.m132170p(view, "translationX", 0L, 100L, new LinearInterpolator(), multiCallMainView.f48861k.getTranslationX(), multiCallMainView.f48861k.getTranslationX() + fM76938n0).start();
        } else {
            view.setTranslationX(fM76938n0);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m76936l0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m76939o0(2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m76937m0(MultiCallMainView multiCallMainView, View view) {
        view.getClass();
        multiCallMainView.m76939o0(0, true);
        return Unit.INSTANCE;
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public /* bridge */ void mo76875F() {
        super.mo76875F();
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        ViewPager2 viewPager2 = this.f48862l;
        viewPager2.setAdapter(getMainAdapter());
        viewPager2.setUserInputEnabled(false);
        m76939o0(((ki10) this.f48854d).m149841J3(), false);
        VText vText = this.f48857g;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.ei10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m76937m0(this.f94099a, (View) obj);
            }
        });
        VText vText2 = this.f48858h;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.fi10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m76933i0(this.f99143a, (View) obj);
            }
        });
        VText vText3 = this.f48859i;
        vText3.getClass();
        czq.m113347c(vText3, new Function1() { // from class: l.gi10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallMainView.m76936l0(this.f104189a, (View) obj);
            }
        });
        if (wft.m206159b(2)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f48858h.getLayoutParams();
        layoutParams.getClass();
        ((ConstraintLayout.C0221a) layoutParams).setMarginStart(bnl0.m105587w(20.0f));
        ViewGroup.LayoutParams layoutParams2 = this.f48859i.getLayoutParams();
        layoutParams2.getClass();
        ((ConstraintLayout.C0221a) layoutParams2).setMarginStart(bnl0.m105587w(20.0f));
    }

    /* JADX INFO: renamed from: n0 */
    public final int m76938n0(int lastType, int newType) {
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(m76940p0(newType));
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(m76940p0(lastType));
        return (c16067gM105560i0.f77559a + (c16067gM105560i0.f77561c / 2)) - (c16067gM105560i1.f77559a + (c16067gM105560i1.f77561c / 2));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76939o0(int type, boolean hasAnim) {
        int i = this.tabType;
        if (i == type) {
            return;
        }
        this.tabType = type;
        this.f48857g.setSelected(type == 0);
        this.f48858h.setSelected(type == 1);
        this.f48859i.setSelected(type == 2);
        this.f48862l.m4252j(type, false);
        m76941q0(i, type, hasAnim);
    }

    /* JADX INFO: renamed from: p0 */
    public final View m76940p0(int type) {
        if (type == 1) {
            VText vText = this.f48858h;
            vText.getClass();
            return vText;
        }
        if (type != 2) {
            VText vText2 = this.f48857g;
            vText2.getClass();
            return vText2;
        }
        VText vText3 = this.f48859i;
        vText3.getClass();
        return vText3;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76941q0(final int lastType, final int newType, final boolean hasAnim) {
        this.f48858h.post(new Runnable() { // from class: l.ii10
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallMainView.m76935k0(this.f115043a, lastType, newType, hasAnim);
            }
        });
    }

    public /* synthetic */ MultiCallMainView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
