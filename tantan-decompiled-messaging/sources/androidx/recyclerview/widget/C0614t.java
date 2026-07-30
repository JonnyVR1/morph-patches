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
import p149l.C17055gc;
import p149l.C17267hc;
import p149l.C17974kb;
import p149l.gbl0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes.dex */
public class C0614t extends C17974kb {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.t$a */
    public static class a extends C17974kb {

        /* JADX INFO: renamed from: a */
        public final C0614t f2918a;

        /* JADX INFO: renamed from: b */
        public Map<View, C17974kb> f2919b = new WeakHashMap();

        public a(@NonNull C0614t c0614t) {
            this.f2918a = c0614t;
        }

        /* JADX INFO: renamed from: a */
        public C17974kb m3852a(View view) {
            return this.f2919b.remove(view);
        }

        /* JADX INFO: renamed from: b */
        public void m3853b(View view) {
            C17974kb c17974kbM125200j = gbl0.m125200j(view);
            if (c17974kbM125200j == null || c17974kbM125200j == this) {
                return;
            }
            this.f2919b.put(view, c17974kbM125200j);
        }

        @Override // p149l.C17974kb
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C17974kb c17974kb = this.f2919b.get(view);
            return c17974kb != null ? c17974kb.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p149l.C17974kb
        @Nullable
        public C17267hc getAccessibilityNodeProvider(@NonNull View view) {
            C17974kb c17974kb = this.f2919b.get(view);
            return c17974kb != null ? c17974kb.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                c17974kb.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C17055gc c17055gc) {
            if (this.f2918a.shouldIgnore() || this.f2918a.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, c17055gc);
                return;
            }
            this.f2918a.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c17055gc);
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                c17974kb.onInitializeAccessibilityNodeInfo(view, c17055gc);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c17055gc);
            }
        }

        @Override // p149l.C17974kb
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                c17974kb.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p149l.C17974kb
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C17974kb c17974kb = this.f2919b.get(viewGroup);
            return c17974kb != null ? c17974kb.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p149l.C17974kb
        public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f2918a.shouldIgnore() || this.f2918a.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                if (c17974kb.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f2918a.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // p149l.C17974kb
        public void sendAccessibilityEvent(@NonNull View view, int i) {
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                c17974kb.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p149l.C17974kb
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            C17974kb c17974kb = this.f2919b.get(view);
            if (c17974kb != null) {
                c17974kb.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0614t(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C17974kb itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    @NonNull
    public C17974kb getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // p149l.C17974kb
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

    @Override // p149l.C17974kb
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) C17055gc c17055gc) {
        super.onInitializeAccessibilityNodeInfo(view, c17055gc);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c17055gc);
    }

    @Override // p149l.C17974kb
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
