package com.p046p1.mobile.putong.feed.p060ui.moments.entry.scalerv;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.feed.p060ui.moments.entry.scalerv.PopScaleRecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e51;
import p149l.hz50;
import p149l.tc80;
import p149l.tsd0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\u0019\u0010$\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0014¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010'R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m87232d2 = {"Lcom/p1/mobile/putong/feed/ui/moments/entry/scalerv/PopScaleRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "init", "()V", "Ll/tsd0;", "adapter", "setAdapterData", "(Ll/tsd0;)V", "", "itemSize", "overlapSize", "colum", "K", "(III)V", "", "", "urls", "", "needBlur", "N", "(Ljava/util/List;Z)V", "", BLiveOperationTitleShowType.duration, "H", "(J)V", "M", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "I", "G", "L", "F", "()I", Constants.INT, "", "J", "(I)F", "a", "b", "c", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Ll/tsd0;", "mAdapter", "e", "Z", "isRunning", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "runnable", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PopScaleRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int itemSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int overlapSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int colum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public tsd0 mAdapter;

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
    public static void m67075E(PopScaleRecyclerView popScaleRecyclerView, long j) {
        popScaleRecyclerView.m67083M();
        popScaleRecyclerView.m67077G(j);
    }

    private final void init() {
        this.itemSize = (int) m67080J(66);
        this.overlapSize = (int) m67080J(13);
        this.colum = 5;
    }

    private final void setAdapterData(tsd0 adapter) {
        if (getAdapter() == null) {
            m67082L();
            Unit unit = Unit.INSTANCE;
        }
        adapter.m190529D(this.itemSize);
        setAdapter(adapter);
    }

    /* JADX INFO: renamed from: F */
    public final int m67076F() {
        int i = this.colum;
        return ((i + 2) * this.itemSize) - ((i + 1) * this.overlapSize);
    }

    /* JADX INFO: renamed from: G */
    public final void m67077G(final long duration) {
        List<String> listM190530y;
        tsd0 tsd0Var = this.mAdapter;
        Integer numValueOf = (tsd0Var == null || (listM190530y = tsd0Var.m190530y()) == null) ? null : Integer.valueOf(listM190530y.size());
        numValueOf.getClass();
        if (numValueOf.intValue() < 2) {
            this.isRunning = false;
            return;
        }
        if (this.runnable == null) {
            this.runnable = new Runnable() { // from class: l.sc80
                @Override // java.lang.Runnable
                public final void run() {
                    PopScaleRecyclerView.m67075E(this.f163713a, duration);
                }
            };
        }
        e51.m114745J(this.runnable);
        e51.m114743H(getContext(), this.runnable, duration);
    }

    /* JADX INFO: renamed from: H */
    public final void m67078H(long duration) {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        m67077G(duration);
    }

    /* JADX INFO: renamed from: I */
    public final void m67079I() {
        tsd0 tsd0Var = this.mAdapter;
        if (tsd0Var != null) {
            tsd0Var.m190530y().clear();
            tsd0Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: J */
    public final float m67080J(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: K */
    public final void m67081K(int itemSize, int overlapSize, int colum) {
        this.itemSize = itemSize;
        this.overlapSize = overlapSize;
        this.colum = colum;
    }

    /* JADX INFO: renamed from: L */
    public final void m67082L() {
        int iM67076F = m67076F();
        getLayoutParams().width = iM67076F;
        OverlapLinearLayoutManager overlapLinearLayoutManager = new OverlapLinearLayoutManager(getContext());
        setLayoutManager(overlapLinearLayoutManager);
        addItemDecoration(new hz50(this.overlapSize));
        addOnScrollListener(new tc80(overlapLinearLayoutManager, iM67076F, this.itemSize, this.overlapSize));
    }

    /* JADX INFO: renamed from: M */
    public final void m67083M() {
        RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
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
    public final void m67084N(@NotNull List<String> urls, boolean needBlur) {
        urls.getClass();
        tsd0 tsd0Var = this.mAdapter;
        if (tsd0Var != null) {
            if (tsd0Var != null) {
                setAdapterData(tsd0Var);
                tsd0Var.m190530y().clear();
                tsd0Var.m190530y().addAll(urls);
                tsd0Var.notifyDataSetChanged();
                return;
            }
            return;
        }
        Context context = getContext();
        context.getClass();
        tsd0 tsd0Var2 = new tsd0(context);
        setAdapterData(tsd0Var2);
        tsd0Var2.m190528C(needBlur);
        tsd0Var2.m190530y().clear();
        tsd0Var2.m190530y().addAll(urls);
        tsd0Var2.notifyDataSetChanged();
        this.mAdapter = tsd0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e51.m114745J(this.runnable);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopScaleRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        init();
    }
}
