package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.marquee;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.fo0;
import p153l.jp3;
import p153l.kcg0;
import p153l.p6w;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.wxw;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0015R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010+\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u0006/"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "e", "()V", "f", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", Constants.INAPP_DATA_TAG, "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "get_auto_rv1", "()Landroidx/recyclerview/widget/RecyclerView;", "set_auto_rv1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_auto_rv1", "b", "get_auto_rv2", "set_auto_rv2", "_auto_rv2", "get_auto_rv3", "set_auto_rv3", "_auto_rv3", "Ll/kcg0;", "Ll/kcg0;", "mSubscribe", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzMarqueeRecyclerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RecyclerView _auto_rv1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _auto_rv2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RecyclerView _auto_rv3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public kcg0 mSubscribe;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView$a */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", OMSTemplateModeType.space, "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "a", "I", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8600a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int space;

        public C8600a(int i) {
            this.space = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int i = this.space;
            outRect.left = i;
            outRect.right = i;
            outRect.bottom = i;
            outRect.top = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzMarqueeRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48447c(layoutInflaterM171370a, this);
        m48448d();
    }

    /* JADX INFO: renamed from: a */
    public static void m48445a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, Long l2) {
        if (NullChecker.m82486a(buzzMarqueeRecyclerView.get_auto_rv1()) && NullChecker.m82486a(buzzMarqueeRecyclerView.get_auto_rv2()) && NullChecker.m82486a(buzzMarqueeRecyclerView.get_auto_rv3())) {
            buzzMarqueeRecyclerView.get_auto_rv1().smoothScrollBy(20, 0);
            buzzMarqueeRecyclerView.get_auto_rv2().smoothScrollBy(25, 0);
            buzzMarqueeRecyclerView.get_auto_rv3().smoothScrollBy(20, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m48446b(Throwable th) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m48447c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM146485b = jp3.m146485b(this, inflater, parent);
        viewM146485b.getClass();
        return viewM146485b;
    }

    /* JADX INFO: renamed from: d */
    public final void m48448d() {
        setOrientation(1);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            C8600a c8600a = new C8600a(qa00.f156317d);
            get_auto_rv1().addItemDecoration(c8600a);
            get_auto_rv2().addItemDecoration(c8600a);
            get_auto_rv3().addItemDecoration(c8600a);
            Gender gender = TEnum.equals(userM116600p9.gender, "male") ? Gender.get("female") : Gender.get("male");
            p6w p6wVar = p6w.INSTANCE;
            gender.getClass();
            ArrayList<BreakIce> arrayListM171077x = p6wVar.m171077x(gender);
            if (arrayListM171077x == null || arrayListM171077x.size() < 6) {
                return;
            }
            RecyclerView recyclerView = get_auto_rv1();
            List<BreakIce> listSubList = arrayListM171077x.subList(0, 3);
            listSubList.getClass();
            recyclerView.setAdapter(new wxw(listSubList));
            RecyclerView recyclerView2 = get_auto_rv2();
            List<BreakIce> listSubList2 = arrayListM171077x.subList(3, 6);
            listSubList2.getClass();
            recyclerView2.setAdapter(new wxw(listSubList2));
            RecyclerView recyclerView3 = get_auto_rv3();
            List<BreakIce> listSubList3 = arrayListM171077x.subList(6, arrayListM171077x.size());
            listSubList3.getClass();
            recyclerView3.setAdapter(new wxw(listSubList3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m48449e() {
        kcg0 kcg0Var = this.mSubscribe;
        if (kcg0Var != null && kcg0Var.isUnsubscribed()) {
            psd0.m173633z(this.mSubscribe);
        }
        this.mSubscribe = C22421c.interval(0L, 20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.hp3
            @Override // p153l.y20
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m48445a(this.f110978a, (Long) obj);
            }
        }, new y20() { // from class: l.ip3
            @Override // p153l.y20
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m48446b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m48450f() {
        if (NullChecker.m82486a(get_auto_rv1()) && NullChecker.m82486a(get_auto_rv2()) && NullChecker.m82486a(get_auto_rv3())) {
            get_auto_rv1().stopScroll();
            get_auto_rv2().stopScroll();
            get_auto_rv3().stopScroll();
        }
        psd0.m173633z(this.mSubscribe);
        this.mSubscribe = null;
    }

    @NotNull
    public final RecyclerView get_auto_rv1() {
        RecyclerView recyclerView = this._auto_rv1;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_auto_rv1");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv2() {
        RecyclerView recyclerView = this._auto_rv2;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_auto_rv2");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv3() {
        RecyclerView recyclerView = this._auto_rv3;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_auto_rv3");
        return null;
    }

    public final void set_auto_rv1(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._auto_rv1 = recyclerView;
    }

    public final void set_auto_rv2(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._auto_rv2 = recyclerView;
    }

    public final void set_auto_rv3(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._auto_rv3 = recyclerView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzMarqueeRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
        m48448d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzMarqueeRecyclerView(@NotNull Context context) {
        this(context, null);
        context.getClass();
        m48448d();
    }
}
