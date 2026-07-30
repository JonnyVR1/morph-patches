package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.marquee;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.jo0;
import p149l.jo3;
import p149l.mkd0;
import p149l.o7r;
import p149l.r4w;
import p149l.t100;
import p149l.xuw;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0015R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010+\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u0006/"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "e", "()V", "f", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", Constants.INAPP_DATA_TAG, "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "get_auto_rv1", "()Landroidx/recyclerview/widget/RecyclerView;", "set_auto_rv1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_auto_rv1", "b", "get_auto_rv2", "set_auto_rv2", "_auto_rv2", "get_auto_rv3", "set_auto_rv3", "_auto_rv3", "Ll/c4g0;", "Ll/c4g0;", "mSubscribe", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzMarqueeRecyclerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RecyclerView _auto_rv1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _auto_rv2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RecyclerView _auto_rv3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public c4g0 mSubscribe;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView$a */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", OMSTemplateModeType.space, "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "a", "I", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8437a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int space;

        public C8437a(int i) {
            this.space = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0588z state) {
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
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47264c(layoutInflaterM163037a, this);
        m47265d();
    }

    /* JADX INFO: renamed from: a */
    public static void m47262a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, Long l2) {
        if (NullChecker.m81303a(buzzMarqueeRecyclerView.get_auto_rv1()) && NullChecker.m81303a(buzzMarqueeRecyclerView.get_auto_rv2()) && NullChecker.m81303a(buzzMarqueeRecyclerView.get_auto_rv3())) {
            buzzMarqueeRecyclerView.get_auto_rv1().smoothScrollBy(20, 0);
            buzzMarqueeRecyclerView.get_auto_rv2().smoothScrollBy(25, 0);
            buzzMarqueeRecyclerView.get_auto_rv3().smoothScrollBy(20, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m47263b(Throwable th) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m47264c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM142414b = jo3.m142414b(this, inflater, parent);
        viewM142414b.getClass();
        return viewM142414b;
    }

    /* JADX INFO: renamed from: d */
    public final void m47265d() {
        setOrientation(1);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            C8437a c8437a = new C8437a(t100.f167255d);
            get_auto_rv1().addItemDecoration(c8437a);
            get_auto_rv2().addItemDecoration(c8437a);
            get_auto_rv3().addItemDecoration(c8437a);
            Gender gender = TEnum.equals(userM169527p9.gender, "male") ? Gender.get("female") : Gender.get("male");
            r4w r4wVar = r4w.INSTANCE;
            gender.getClass();
            ArrayList<BreakIce> arrayListM177870x = r4wVar.m177870x(gender);
            if (arrayListM177870x == null || arrayListM177870x.size() < 6) {
                return;
            }
            RecyclerView recyclerView = get_auto_rv1();
            List<BreakIce> listSubList = arrayListM177870x.subList(0, 3);
            listSubList.getClass();
            recyclerView.setAdapter(new xuw(listSubList));
            RecyclerView recyclerView2 = get_auto_rv2();
            List<BreakIce> listSubList2 = arrayListM177870x.subList(3, 6);
            listSubList2.getClass();
            recyclerView2.setAdapter(new xuw(listSubList2));
            RecyclerView recyclerView3 = get_auto_rv3();
            List<BreakIce> listSubList3 = arrayListM177870x.subList(6, arrayListM177870x.size());
            listSubList3.getClass();
            recyclerView3.setAdapter(new xuw(listSubList3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m47266e() {
        c4g0 c4g0Var = this.mSubscribe;
        if (c4g0Var != null && c4g0Var.isUnsubscribed()) {
            mkd0.m154992z(this.mSubscribe);
        }
        this.mSubscribe = C22306c.interval(0L, 20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ho3
            @Override // p149l.e30
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m47262a(this.f108771a, (Long) obj);
            }
        }, new e30() { // from class: l.io3
            @Override // p149l.e30
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m47263b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m47267f() {
        if (NullChecker.m81303a(get_auto_rv1()) && NullChecker.m81303a(get_auto_rv2()) && NullChecker.m81303a(get_auto_rv3())) {
            get_auto_rv1().stopScroll();
            get_auto_rv2().stopScroll();
            get_auto_rv3().stopScroll();
        }
        mkd0.m154992z(this.mSubscribe);
        this.mSubscribe = null;
    }

    @NotNull
    public final RecyclerView get_auto_rv1() {
        RecyclerView recyclerView = this._auto_rv1;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_auto_rv1");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv2() {
        RecyclerView recyclerView = this._auto_rv2;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_auto_rv2");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv3() {
        RecyclerView recyclerView = this._auto_rv3;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_auto_rv3");
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
        m47265d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzMarqueeRecyclerView(@NotNull Context context) {
        this(context, null);
        context.getClass();
        m47265d();
    }
}
