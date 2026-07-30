package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class zf5 {

    /* JADX INFO: renamed from: l.zf5$a */
    public class C21799a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedComicFacePropMenuView.InterfaceC11373f f204103a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f204104b;

        public C21799a(FeedComicFacePropMenuView.InterfaceC11373f interfaceC11373f, boolean z) {
            this.f204103a = interfaceC11373f;
            this.f204104b = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                zf5.m219524c(recyclerView, this.f204103a, this.f204104b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m219523b(LinearLayoutManager linearLayoutManager) {
        return new int[]{linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()};
    }

    /* JADX INFO: renamed from: c */
    public static void m219524c(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC11373f interfaceC11373f, boolean z) {
        if (recyclerView != null && recyclerView.isShown() && recyclerView.getGlobalVisibleRect(new Rect())) {
            try {
                int[] iArrM219523b = new int[2];
                RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    iArrM219523b = m219523b((LinearLayoutManager) layoutManager);
                }
                if (interfaceC11373f != null) {
                    interfaceC11373f.mo63344b(m219525d(iArrM219523b));
                }
                for (int i = iArrM219523b[0]; i <= iArrM219523b[1]; i++) {
                    m219526e(layoutManager.findViewByPosition(i), i, interfaceC11373f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Integer> m219525d(int[] iArr) {
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
    public static void m219526e(View view, int i, FeedComicFacePropMenuView.InterfaceC11373f interfaceC11373f) {
        if (view != null && view.getVisibility() == 0 && view.isShown()) {
            interfaceC11373f.mo63343a(view.getGlobalVisibleRect(new Rect()), i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m219527f(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC11373f interfaceC11373f, boolean z) {
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        recyclerView.addOnScrollListener(new C21799a(interfaceC11373f, z));
    }
}
