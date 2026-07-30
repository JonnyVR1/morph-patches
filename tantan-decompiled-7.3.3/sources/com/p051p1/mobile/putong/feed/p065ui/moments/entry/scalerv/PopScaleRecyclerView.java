package com.p051p1.mobile.putong.feed.p065ui.moments.entry.scalerv;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.feed.p065ui.moments.entry.scalerv.PopScaleRecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l51;
import p153l.m760;
import p153l.v0e0;
import p153l.zk80;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\u0019\u0010$\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0014¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010'R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m88121d2 = {"Lcom/p1/mobile/putong/feed/ui/moments/entry/scalerv/PopScaleRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "init", "()V", "Ll/v0e0;", "adapter", "setAdapterData", "(Ll/v0e0;)V", "", "itemSize", "overlapSize", "colum", "K", "(III)V", "", "", "urls", "", "needBlur", "N", "(Ljava/util/List;Z)V", "", BLiveOperationTitleShowType.duration, "H", "(J)V", "M", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "I", "G", "L", "F", "()I", Constants.INT, "", "J", "(I)F", "a", "b", "c", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Ll/v0e0;", "mAdapter", "e", "Z", "isRunning", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "runnable", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PopScaleRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int itemSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int overlapSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int colum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public v0e0 mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isRunning;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Runnable runnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopScaleRecyclerView(@NotNull Context context) {
        super(context);
        context.getClass();
        init();
    }

    /* JADX INFO: renamed from: E */
    public static void m68258E(PopScaleRecyclerView popScaleRecyclerView, long j) {
        popScaleRecyclerView.m68266M();
        popScaleRecyclerView.m68260G(j);
    }

    private final void init() {
        this.itemSize = (int) m68263J(66);
        this.overlapSize = (int) m68263J(13);
        this.colum = 5;
    }

    private final void setAdapterData(v0e0 adapter) {
        if (getAdapter() == null) {
            m68265L();
            Unit unit = Unit.INSTANCE;
        }
        adapter.m198896D(this.itemSize);
        setAdapter(adapter);
    }

    /* JADX INFO: renamed from: F */
    public final int m68259F() {
        int i = this.colum;
        return ((i + 2) * this.itemSize) - ((i + 1) * this.overlapSize);
    }

    /* JADX INFO: renamed from: G */
    public final void m68260G(final long duration) {
        List<String> listM198897y;
        v0e0 v0e0Var = this.mAdapter;
        Integer numValueOf = (v0e0Var == null || (listM198897y = v0e0Var.m198897y()) == null) ? null : Integer.valueOf(listM198897y.size());
        numValueOf.getClass();
        if (numValueOf.intValue() < 2) {
            this.isRunning = false;
            return;
        }
        if (this.runnable == null) {
            this.runnable = new Runnable() { // from class: l.yk80
                @Override // java.lang.Runnable
                public final void run() {
                    PopScaleRecyclerView.m68258E(this.f200379a, duration);
                }
            };
        }
        l51.m152890J(this.runnable);
        l51.m152888H(getContext(), this.runnable, duration);
    }

    /* JADX INFO: renamed from: H */
    public final void m68261H(long duration) {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        m68260G(duration);
    }

    /* JADX INFO: renamed from: I */
    public final void m68262I() {
        v0e0 v0e0Var = this.mAdapter;
        if (v0e0Var != null) {
            v0e0Var.m198897y().clear();
            v0e0Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: J */
    public final float m68263J(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: K */
    public final void m68264K(int itemSize, int overlapSize, int colum) {
        this.itemSize = itemSize;
        this.overlapSize = overlapSize;
        this.colum = colum;
    }

    /* JADX INFO: renamed from: L */
    public final void m68265L() {
        int iM68259F = m68259F();
        getLayoutParams().width = iM68259F;
        OverlapLinearLayoutManager overlapLinearLayoutManager = new OverlapLinearLayoutManager(getContext());
        setLayoutManager(overlapLinearLayoutManager);
        addItemDecoration(new m760(this.overlapSize));
        addOnScrollListener(new zk80(overlapLinearLayoutManager, iM68259F, this.itemSize, this.overlapSize));
    }

    /* JADX INFO: renamed from: M */
    public final void m68266M() {
        RecyclerView.AbstractC0579o layoutManager = getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition != null) {
            if (viewFindViewByPosition.getRight() + this.overlapSize < 2) {
                viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
            }
            if (viewFindViewByPosition != null) {
                smoothScrollBy((viewFindViewByPosition.getLeft() + this.itemSize) - this.overlapSize, 0, new DecelerateInterpolator(), 900);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m68267N(@NotNull List<String> urls, boolean needBlur) {
        urls.getClass();
        v0e0 v0e0Var = this.mAdapter;
        if (v0e0Var != null) {
            if (v0e0Var != null) {
                setAdapterData(v0e0Var);
                v0e0Var.m198897y().clear();
                v0e0Var.m198897y().addAll(urls);
                v0e0Var.notifyDataSetChanged();
                return;
            }
            return;
        }
        Context context = getContext();
        context.getClass();
        v0e0 v0e0Var2 = new v0e0(context);
        setAdapterData(v0e0Var2);
        v0e0Var2.m198895C(needBlur);
        v0e0Var2.m198897y().clear();
        v0e0Var2.m198897y().addAll(urls);
        v0e0Var2.notifyDataSetChanged();
        this.mAdapter = v0e0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        l51.m152890J(this.runnable);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopScaleRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        init();
    }
}
