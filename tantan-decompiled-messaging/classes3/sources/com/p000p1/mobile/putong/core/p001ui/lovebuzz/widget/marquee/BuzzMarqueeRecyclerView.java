package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.marquee;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.jo3;
import l.mkd0;
import l.o7r;
import l.r4w;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.c4g0;
import p003l.e30;
import p003l.jo0;
import p003l.m250;
import p003l.xuw;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0015R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010+\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u0006/"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "e", "()V", "f", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "d", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "get_auto_rv1", "()Landroidx/recyclerview/widget/RecyclerView;", "set_auto_rv1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_auto_rv1", "b", "get_auto_rv2", "set_auto_rv2", "_auto_rv2", "get_auto_rv3", "set_auto_rv3", "_auto_rv3", "Ll/c4g0;", "Ll/c4g0;", "mSubscribe", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "space", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "a", "I", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0020a extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int space;

        public C0020a(int i) {
            this.space = i;
        }

        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
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
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m294c(layoutInflaterA, this);
        m295d();
    }

    /* JADX INFO: renamed from: a */
    public static void m292a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, Long l2) {
        if (NullChecker.a(buzzMarqueeRecyclerView.get_auto_rv1()) && NullChecker.a(buzzMarqueeRecyclerView.get_auto_rv2()) && NullChecker.a(buzzMarqueeRecyclerView.get_auto_rv3())) {
            buzzMarqueeRecyclerView.get_auto_rv1().smoothScrollBy(20, 0);
            buzzMarqueeRecyclerView.get_auto_rv2().smoothScrollBy(25, 0);
            buzzMarqueeRecyclerView.get_auto_rv3().smoothScrollBy(20, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m293b(Throwable th) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m294c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = jo3.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d */
    public final void m295d() {
        setOrientation(1);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            C0020a c0020a = new C0020a(t100.d);
            get_auto_rv1().addItemDecoration(c0020a);
            get_auto_rv2().addItemDecoration(c0020a);
            get_auto_rv3().addItemDecoration(c0020a);
            Gender gender = TEnum.equals(userP9.gender, "male") ? Gender.get("female") : Gender.get("male");
            r4w r4wVar = r4w.INSTANCE;
            gender.getClass();
            ArrayList arrayListX = r4wVar.x(gender);
            if (arrayListX == null || arrayListX.size() < 6) {
                return;
            }
            RecyclerView recyclerView = get_auto_rv1();
            List listSubList = arrayListX.subList(0, 3);
            listSubList.getClass();
            recyclerView.setAdapter(new xuw(listSubList));
            RecyclerView recyclerView2 = get_auto_rv2();
            List listSubList2 = arrayListX.subList(3, 6);
            listSubList2.getClass();
            recyclerView2.setAdapter(new xuw(listSubList2));
            RecyclerView recyclerView3 = get_auto_rv3();
            List listSubList3 = arrayListX.subList(6, arrayListX.size());
            listSubList3.getClass();
            recyclerView3.setAdapter(new xuw(listSubList3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m296e() {
        c4g0 c4g0Var = this.mSubscribe;
        if (c4g0Var != null && c4g0Var.isUnsubscribed()) {
            mkd0.z(this.mSubscribe);
        }
        this.mSubscribe = C1099c.interval(0L, 20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.H(new e30() { // from class: l.ho3
            @Override // p003l.e30
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m292a(this.f4239a, (Long) obj);
            }
        }, new e30() { // from class: l.io3
            @Override // p003l.e30
            public final void call(Object obj) {
                BuzzMarqueeRecyclerView.m293b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m297f() {
        if (NullChecker.a(get_auto_rv1()) && NullChecker.a(get_auto_rv2()) && NullChecker.a(get_auto_rv3())) {
            get_auto_rv1().stopScroll();
            get_auto_rv2().stopScroll();
            get_auto_rv3().stopScroll();
        }
        mkd0.z(this.mSubscribe);
        this.mSubscribe = null;
    }

    @NotNull
    public final RecyclerView get_auto_rv1() {
        RecyclerView recyclerView = this._auto_rv1;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_auto_rv1");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv2() {
        RecyclerView recyclerView = this._auto_rv2;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_auto_rv2");
        return null;
    }

    @NotNull
    public final RecyclerView get_auto_rv3() {
        RecyclerView recyclerView = this._auto_rv3;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_auto_rv3");
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
        m295d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzMarqueeRecyclerView(@NotNull Context context) {
        this(context, null);
        context.getClass();
        m295d();
    }
}
