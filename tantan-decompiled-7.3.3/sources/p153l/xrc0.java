package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class xrc0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC21426b f195894a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC21426b f195895b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC21426b f195896c;

    /* JADX INFO: renamed from: l.xrc0$a */
    public static class C21425a implements InterfaceC21426b {
        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: a */
        public yem0 mo212810a(RecyclerView recyclerView) {
            return yem0.m215421b();
        }

        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: b */
        public IntSet mo212811b(RecyclerView recyclerView, boolean z, float f) {
            return IntSet.emptySet();
        }

        public C21425a() {
        }
    }

    /* JADX INFO: renamed from: l.xrc0$b */
    public interface InterfaceC21426b {
        /* JADX INFO: renamed from: a */
        yem0 mo212810a(RecyclerView recyclerView);

        /* JADX INFO: renamed from: b */
        IntSet mo212811b(RecyclerView recyclerView, boolean z, float f);
    }

    /* JADX INFO: renamed from: l.xrc0$c */
    public static class C21427c implements InterfaceC21426b {
        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: a */
        public yem0 mo212810a(RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            return new yem0(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition());
        }

        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: b */
        public IntSet mo212811b(RecyclerView recyclerView, boolean z, float f) {
            yem0 yem0VarMo212810a = mo212810a(recyclerView);
            if (!yem0VarMo212810a.m215422a()) {
                return IntSet.emptySet();
            }
            int i = yem0VarMo212810a.f199381a;
            int i2 = yem0VarMo212810a.f199382b;
            int i3 = yem0VarMo212810a.f199383c;
            int i4 = yem0VarMo212810a.f199384d;
            RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
            View viewFindViewByPosition = layoutManager.findViewByPosition(i);
            View viewFindViewByPosition2 = layoutManager.findViewByPosition(i2);
            if (!xrc0.m212806b(viewFindViewByPosition, z, f)) {
                i = i3;
            }
            if (!xrc0.m212806b(viewFindViewByPosition2, z, f)) {
                i2 = i4;
            }
            return IntSet.interval(i, i2);
        }

        public C21427c() {
        }
    }

    /* JADX INFO: renamed from: l.xrc0$d */
    public static class C21428d implements InterfaceC21426b {
        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: a */
        public yem0 mo212810a(RecyclerView recyclerView) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            int[] iArr = new int[staggeredGridLayoutManager.m3501G()];
            return new yem0(jyb.m147532u(staggeredGridLayoutManager.m3542t(iArr)), jyb.m147531t(staggeredGridLayoutManager.m3545w(iArr)), jyb.m147532u(staggeredGridLayoutManager.m3537o(iArr)), jyb.m147531t(staggeredGridLayoutManager.m3543u(iArr)));
        }

        @Override // p153l.xrc0.InterfaceC21426b
        /* JADX INFO: renamed from: b */
        public IntSet mo212811b(RecyclerView recyclerView, boolean z, float f) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            IntSet intSet = new IntSet();
            int iM3501G = staggeredGridLayoutManager.m3501G();
            int[] iArr = new int[iM3501G];
            staggeredGridLayoutManager.m3542t(iArr);
            for (int i = 0; i < iM3501G; i++) {
                int i2 = iArr[i];
                if (xrc0.m212806b(staggeredGridLayoutManager.findViewByPosition(i2), z, f)) {
                    intSet.add(Integer.valueOf(i2));
                }
            }
            int iM147531t = jyb.m147531t(staggeredGridLayoutManager.m3543u(iArr));
            for (int iM147532u = jyb.m147532u(staggeredGridLayoutManager.m3537o(iArr)); iM147532u <= iM147531t; iM147532u++) {
                intSet.add(Integer.valueOf(iM147532u));
            }
            staggeredGridLayoutManager.m3545w(iArr);
            for (int i3 = 0; i3 < iM3501G; i3++) {
                int i4 = iArr[i3];
                if (xrc0.m212806b(staggeredGridLayoutManager.findViewByPosition(i4), z, f)) {
                    intSet.add(Integer.valueOf(i4));
                }
            }
            intSet.remove(-1);
            return intSet;
        }

        public C21428d() {
        }
    }

    static {
        f195894a = new C21425a();
        f195895b = new C21427c();
        f195896c = new C21428d();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m212806b(View view, boolean z, float f) {
        return ynp0.m216944u(view, z) >= f;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC21426b m212807c(RecyclerView recyclerView) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof LinearLayoutManager;
        if (z || (layoutManager instanceof StaggeredGridLayoutManager)) {
            return z ? f195895b : f195896c;
        }
        return f195894a;
    }

    /* JADX INFO: renamed from: d */
    public static yem0 m212808d(@Nullable RecyclerView recyclerView) {
        return recyclerView == null ? yem0.m215421b() : m212807c(recyclerView).mo212810a(recyclerView);
    }

    /* JADX INFO: renamed from: e */
    public static IntSet m212809e(RecyclerView recyclerView, boolean z, float f) {
        if (recyclerView != null) {
            return m212807c(recyclerView).mo212811b(recyclerView, z, f);
        }
        CrashHelper.m82479c(new NullPointerException("try to getMVIndexSet on a null RecyclerView"));
        return IntSet.emptySet();
    }
}
