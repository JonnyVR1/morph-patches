package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ze5 {

    /* JADX INFO: renamed from: l.ze5$a */
    public class C21682a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedComicFacePropMenuView.InterfaceC11210f f202779a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f202780b;

        public C21682a(FeedComicFacePropMenuView.InterfaceC11210f interfaceC11210f, boolean z) {
            this.f202779a = interfaceC11210f;
            this.f202780b = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                ze5.m218274c(recyclerView, this.f202779a, this.f202780b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m218273b(LinearLayoutManager linearLayoutManager) {
        return new int[]{linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()};
    }

    /* JADX INFO: renamed from: c */
    public static void m218274c(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC11210f interfaceC11210f, boolean z) {
        if (recyclerView != null && recyclerView.isShown() && recyclerView.getGlobalVisibleRect(new Rect())) {
            try {
                int[] iArrM218273b = new int[2];
                RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    iArrM218273b = m218273b((LinearLayoutManager) layoutManager);
                }
                if (interfaceC11210f != null) {
                    interfaceC11210f.mo62161b(m218275d(iArrM218273b));
                }
                for (int i = iArrM218273b[0]; i <= iArrM218273b[1]; i++) {
                    m218276e(layoutManager.findViewByPosition(i), i, interfaceC11210f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Integer> m218275d(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (iArr != null && iArr.length >= 2) {
            int i = iArr[0];
            int i2 = (iArr[1] - i) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(Integer.valueOf(i + i3));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m218276e(View view, int i, FeedComicFacePropMenuView.InterfaceC11210f interfaceC11210f) {
        if (view != null && view.getVisibility() == 0 && view.isShown()) {
            interfaceC11210f.mo62160a(view.getGlobalVisibleRect(new Rect()), i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m218277f(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC11210f interfaceC11210f, boolean z) {
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        recyclerView.addOnScrollListener(new C21682a(interfaceC11210f, z));
    }
}
