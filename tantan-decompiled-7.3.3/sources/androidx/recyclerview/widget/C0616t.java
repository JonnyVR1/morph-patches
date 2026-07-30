package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.WeakHashMap;
import p153l.C15967bc;
import p153l.C16226cc;
import p153l.C16932fb;
import p153l.kkl0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes.dex */
public class C0616t extends C16932fb {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.t$a */
    public static class a extends C16932fb {

        /* JADX INFO: renamed from: a */
        public final C0616t f2918a;

        /* JADX INFO: renamed from: b */
        public Map<View, C16932fb> f2919b = new WeakHashMap();

        public a(@NonNull C0616t c0616t) {
            this.f2918a = c0616t;
        }

        /* JADX INFO: renamed from: a */
        public C16932fb m3853a(View view) {
            return this.f2919b.remove(view);
        }

        /* JADX INFO: renamed from: b */
        public void m3854b(View view) {
            C16932fb c16932fbM150163j = kkl0.m150163j(view);
            if (c16932fbM150163j == null || c16932fbM150163j == this) {
                return;
            }
            this.f2919b.put(view, c16932fbM150163j);
        }

        @Override // p153l.C16932fb
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C16932fb c16932fb = this.f2919b.get(view);
            return c16932fb != null ? c16932fb.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p153l.C16932fb
        @Nullable
        public C16226cc getAccessibilityNodeProvider(@NonNull View view) {
            C16932fb c16932fb = this.f2919b.get(view);
            return c16932fb != null ? c16932fb.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                c16932fb.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C15967bc c15967bc) {
            if (this.f2918a.shouldIgnore() || this.f2918a.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, c15967bc);
                return;
            }
            this.f2918a.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c15967bc);
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                c16932fb.onInitializeAccessibilityNodeInfo(view, c15967bc);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c15967bc);
            }
        }

        @Override // p153l.C16932fb
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                c16932fb.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p153l.C16932fb
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C16932fb c16932fb = this.f2919b.get(viewGroup);
            return c16932fb != null ? c16932fb.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p153l.C16932fb
        public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f2918a.shouldIgnore() || this.f2918a.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                if (c16932fb.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f2918a.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // p153l.C16932fb
        public void sendAccessibilityEvent(@NonNull View view, int i) {
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                c16932fb.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p153l.C16932fb
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C16932fb c16932fb = this.f2919b.get(view);
            if (c16932fb != null) {
                c16932fb.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0616t(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C16932fb itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    @NonNull
    public C16932fb getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // p153l.C16932fb
    public void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // p153l.C16932fb
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C15967bc c15967bc) {
        super.onInitializeAccessibilityNodeInfo(view, c15967bc);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c15967bc);
    }

    @Override // p153l.C16932fb
    public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
