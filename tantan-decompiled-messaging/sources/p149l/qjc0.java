package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class qjc0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC19519b f154914a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC19519b f154915b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC19519b f154916c;

    /* JADX INFO: renamed from: l.qjc0$a */
    public static class C19518a implements InterfaceC19519b {
        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: a */
        public u5m0 mo174987a(RecyclerView recyclerView) {
            return u5m0.m191871b();
        }

        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: b */
        public IntSet mo174988b(RecyclerView recyclerView, boolean z, float f) {
            return IntSet.emptySet();
        }

        public C19518a() {
        }
    }

    /* JADX INFO: renamed from: l.qjc0$b */
    public interface InterfaceC19519b {
        /* JADX INFO: renamed from: a */
        u5m0 mo174987a(RecyclerView recyclerView);

        /* JADX INFO: renamed from: b */
        IntSet mo174988b(RecyclerView recyclerView, boolean z, float f);
    }

    /* JADX INFO: renamed from: l.qjc0$c */
    public static class C19520c implements InterfaceC19519b {
        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: a */
        public u5m0 mo174987a(RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            return new u5m0(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition());
        }

        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: b */
        public IntSet mo174988b(RecyclerView recyclerView, boolean z, float f) {
            u5m0 u5m0VarMo174987a = mo174987a(recyclerView);
            if (!u5m0VarMo174987a.m191872a()) {
                return IntSet.emptySet();
            }
            int i = u5m0VarMo174987a.f174737a;
            int i2 = u5m0VarMo174987a.f174738b;
            int i3 = u5m0VarMo174987a.f174739c;
            int i4 = u5m0VarMo174987a.f174740d;
            RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
            View viewFindViewByPosition = layoutManager.findViewByPosition(i);
            View viewFindViewByPosition2 = layoutManager.findViewByPosition(i2);
            if (!qjc0.m174983b(viewFindViewByPosition, z, f)) {
                i = i3;
            }
            if (!qjc0.m174983b(viewFindViewByPosition2, z, f)) {
                i2 = i4;
            }
            return IntSet.interval(i, i2);
        }

        public C19520c() {
        }
    }

    /* JADX INFO: renamed from: l.qjc0$d */
    public static class C19521d implements InterfaceC19519b {
        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: a */
        public u5m0 mo174987a(RecyclerView recyclerView) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            int[] iArr = new int[staggeredGridLayoutManager.m3500G()];
            return new u5m0(vwb.m200349u(staggeredGridLayoutManager.m3541t(iArr)), vwb.m200348t(staggeredGridLayoutManager.m3544w(iArr)), vwb.m200349u(staggeredGridLayoutManager.m3536o(iArr)), vwb.m200348t(staggeredGridLayoutManager.m3542u(iArr)));
        }

        @Override // p149l.qjc0.InterfaceC19519b
        /* JADX INFO: renamed from: b */
        public IntSet mo174988b(RecyclerView recyclerView, boolean z, float f) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
            IntSet intSet = new IntSet();
            int iM3500G = staggeredGridLayoutManager.m3500G();
            int[] iArr = new int[iM3500G];
            staggeredGridLayoutManager.m3541t(iArr);
            for (int i = 0; i < iM3500G; i++) {
                int i2 = iArr[i];
                if (qjc0.m174983b(staggeredGridLayoutManager.findViewByPosition(i2), z, f)) {
                    intSet.add(Integer.valueOf(i2));
                }
            }
            int iM200348t = vwb.m200348t(staggeredGridLayoutManager.m3542u(iArr));
            for (int iM200349u = vwb.m200349u(staggeredGridLayoutManager.m3536o(iArr)); iM200349u <= iM200348t; iM200349u++) {
                intSet.add(Integer.valueOf(iM200349u));
            }
            staggeredGridLayoutManager.m3544w(iArr);
            for (int i3 = 0; i3 < iM3500G; i3++) {
                int i4 = iArr[i3];
                if (qjc0.m174983b(staggeredGridLayoutManager.findViewByPosition(i4), z, f)) {
                    intSet.add(Integer.valueOf(i4));
                }
            }
            intSet.remove(-1);
            return intSet;
        }

        public C19521d() {
        }
    }

    static {
        f154914a = new C19518a();
        f154915b = new C19520c();
        f154916c = new C19521d();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m174983b(View view, boolean z, float f) {
        return uep0.m193334u(view, z) >= f;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC19519b m174984c(RecyclerView recyclerView) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof LinearLayoutManager;
        if (z || (layoutManager instanceof StaggeredGridLayoutManager)) {
            return z ? f154915b : f154916c;
        }
        return f154914a;
    }

    /* JADX INFO: renamed from: d */
    public static u5m0 m174985d(@Nullable RecyclerView recyclerView) {
        return recyclerView == null ? u5m0.m191871b() : m174984c(recyclerView).mo174987a(recyclerView);
    }

    /* JADX INFO: renamed from: e */
    public static IntSet m174986e(RecyclerView recyclerView, boolean z, float f) {
        if (recyclerView != null) {
            return m174984c(recyclerView).mo174988b(recyclerView, z, f);
        }
        CrashHelper.m81296c(new NullPointerException("try to getMVIndexSet on a null RecyclerView"));
        return IntSet.emptySet();
    }
}
