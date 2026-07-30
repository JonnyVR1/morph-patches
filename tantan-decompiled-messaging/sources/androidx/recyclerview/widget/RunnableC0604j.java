package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p149l.ig3;
import p149l.qkq0;
import p149l.y4j0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0604j implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<RunnableC0604j> f2827e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static Comparator<c> f2828f = new a();

    /* JADX INFO: renamed from: b */
    public long f2830b;

    /* JADX INFO: renamed from: c */
    public long f2831c;

    /* JADX INFO: renamed from: a */
    public ArrayList<RecyclerView> f2829a = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ArrayList<c> f2832d = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$a */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f2840d;
            if ((recyclerView == null) != (cVar2.f2840d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f2837a;
            if (z != cVar2.f2837a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2838b - cVar.f2838b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f2839c - cVar2.f2839c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$b */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.AbstractC0577o.c {

        /* JADX INFO: renamed from: a */
        public int f2833a;

        /* JADX INFO: renamed from: b */
        public int f2834b;

        /* JADX INFO: renamed from: c */
        public int[] f2835c;

        /* JADX INFO: renamed from: d */
        public int f2836d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o.c
        /* JADX INFO: renamed from: a */
        public void mo3406a(int i, int i2) {
            if (i < 0) {
                ig3.m135964a("Layout positions must be non-negative");
                return;
            }
            if (i2 < 0) {
                ig3.m135964a("Pixel distance must be non-negative");
                return;
            }
            int i3 = this.f2836d;
            int i4 = i3 * 2;
            int[] iArr = this.f2835c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2835c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f2835c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2835c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f2836d++;
        }

        /* JADX INFO: renamed from: b */
        public void m3738b() {
            int[] iArr = this.f2835c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2836d = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m3739c(RecyclerView recyclerView, boolean z) {
            this.f2836d = 0;
            int[] iArr = this.f2835c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0577o abstractC0577o = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC0577o == null || !abstractC0577o.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.m3619p()) {
                    abstractC0577o.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC0577o.collectAdjacentPrefetchPositions(this.f2833a, this.f2834b, recyclerView.mState, this);
            }
            int i = this.f2836d;
            if (i > abstractC0577o.mPrefetchMaxCountObserved) {
                abstractC0577o.mPrefetchMaxCountObserved = i;
                abstractC0577o.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.m3449P();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m3740d(int i) {
            if (this.f2835c != null) {
                int i2 = this.f2836d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2835c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m3741e(int i, int i2) {
            this.f2833a = i;
            this.f2834b = i2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f2837a;

        /* JADX INFO: renamed from: b */
        public int f2838b;

        /* JADX INFO: renamed from: c */
        public int f2839c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f2840d;

        /* JADX INFO: renamed from: e */
        public int f2841e;

        /* JADX INFO: renamed from: a */
        public void m3742a() {
            this.f2837a = false;
            this.f2838b = 0;
            this.f2839c = 0;
            this.f2840d = null;
            this.f2841e = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3727e(RecyclerView recyclerView, int i) {
        int iM3660j = recyclerView.mChildHelper.m3660j();
        for (int i2 = 0; i2 < iM3660j; i2++) {
            RecyclerView.AbstractC0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m3659i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m3728a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f2829a.contains(recyclerView)) {
            qkq0.m175383a("RecyclerView already present in worker list!");
        } else {
            this.f2829a.add(recyclerView);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3729b() {
        c cVar;
        int size = this.f2829a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2829a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m3739c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f2836d;
            }
        }
        this.f2832d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2829a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f2833a) + Math.abs(bVar.f2834b);
                for (int i5 = 0; i5 < bVar.f2836d * 2; i5 += 2) {
                    if (i3 >= this.f2832d.size()) {
                        cVar = new c();
                        this.f2832d.add(cVar);
                    } else {
                        cVar = this.f2832d.get(i3);
                    }
                    int[] iArr = bVar.f2835c;
                    int i6 = iArr[i5 + 1];
                    cVar.f2837a = i6 <= iAbs;
                    cVar.f2838b = iAbs;
                    cVar.f2839c = i6;
                    cVar.f2840d = recyclerView2;
                    cVar.f2841e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2832d, f2828f);
    }

    /* JADX INFO: renamed from: c */
    public final void m3730c(c cVar, long j) {
        RecyclerView.AbstractC0566d0 abstractC0566d0M3735i = m3735i(cVar.f2840d, cVar.f2841e, cVar.f2837a ? Long.MAX_VALUE : j);
        if (abstractC0566d0M3735i == null || abstractC0566d0M3735i.mNestedRecyclerView == null || !abstractC0566d0M3735i.isBound() || abstractC0566d0M3735i.isInvalid()) {
            return;
        }
        m3734h(abstractC0566d0M3735i.mNestedRecyclerView.get(), j);
    }

    /* JADX INFO: renamed from: d */
    public final void m3731d(long j) {
        for (int i = 0; i < this.f2832d.size(); i++) {
            c cVar = this.f2832d.get(i);
            if (cVar.f2840d == null) {
                return;
            }
            m3730c(cVar, j);
            cVar.m3742a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3732f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f2829a.contains(recyclerView)) {
                qkq0.m175383a("attempting to post unregistered view!");
                return;
            } else if (this.f2830b == 0) {
                this.f2830b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.m3741e(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public void m3733g(long j) {
        m3729b();
        m3731d(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m3734h(@Nullable RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m3660j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.m3739c(recyclerView, true);
        if (bVar.f2836d != 0) {
            try {
                y4j0.m212916a("RV Nested Prefetch");
                recyclerView.mState.m3491g(recyclerView.mAdapter);
                for (int i = 0; i < bVar.f2836d * 2; i += 2) {
                    m3735i(recyclerView, bVar.f2835c[i], j);
                }
                y4j0.m212917b();
            } catch (Throwable th) {
                y4j0.m212917b();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final RecyclerView.AbstractC0566d0 m3735i(RecyclerView recyclerView, int i, long j) {
        if (m3727e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0584v c0584v = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0566d0 abstractC0566d0M3447N = c0584v.m3447N(i, false, j);
            if (abstractC0566d0M3447N != null) {
                if (!abstractC0566d0M3447N.isBound() || abstractC0566d0M3447N.isInvalid()) {
                    c0584v.m3452a(abstractC0566d0M3447N, false);
                } else {
                    c0584v.m3440G(abstractC0566d0M3447N.itemView);
                }
            }
            return abstractC0566d0M3447N;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3736j(RecyclerView recyclerView) {
        boolean zRemove = this.f2829a.remove(recyclerView);
        if (!RecyclerView.sDebugAssertionsEnabled || zRemove) {
            return;
        }
        qkq0.m175383a("RecyclerView removal failed!");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y4j0.m212916a("RV Prefetch");
            if (!this.f2829a.isEmpty()) {
                int size = this.f2829a.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2829a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m3733g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2831c);
                }
            }
        } finally {
            this.f2830b = 0L;
            y4j0.m212917b();
        }
    }
}
