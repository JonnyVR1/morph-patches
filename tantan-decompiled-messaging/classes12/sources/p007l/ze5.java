package p007l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ze5 {

    /* JADX INFO: renamed from: l.ze5$a */
    public class C2547a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedComicFacePropMenuView.InterfaceC2054f f15703a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f15704b;

        public C2547a(FeedComicFacePropMenuView.InterfaceC2054f interfaceC2054f, boolean z) {
            this.f15703a = interfaceC2054f;
            this.f15704b = z;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                ze5.m17316c(recyclerView, this.f15703a, this.f15704b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m17315b(LinearLayoutManager linearLayoutManager) {
        return new int[]{linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()};
    }

    /* JADX INFO: renamed from: c */
    public static void m17316c(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC2054f interfaceC2054f, boolean z) {
        if (recyclerView != null && recyclerView.isShown() && recyclerView.getGlobalVisibleRect(new Rect())) {
            try {
                int[] iArrM17315b = new int[2];
                LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    iArrM17315b = m17315b(layoutManager);
                }
                if (interfaceC2054f != null) {
                    interfaceC2054f.mo3143b(m17317d(iArrM17315b));
                }
                for (int i = iArrM17315b[0]; i <= iArrM17315b[1]; i++) {
                    m17318e(layoutManager.findViewByPosition(i), i, interfaceC2054f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Integer> m17317d(int[] iArr) {
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
    public static void m17318e(View view, int i, FeedComicFacePropMenuView.InterfaceC2054f interfaceC2054f) {
        if (view != null && view.getVisibility() == 0 && view.isShown()) {
            interfaceC2054f.mo3142a(view.getGlobalVisibleRect(new Rect()), i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m17319f(RecyclerView recyclerView, FeedComicFacePropMenuView.InterfaceC2054f interfaceC2054f, boolean z) {
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        recyclerView.addOnScrollListener(new C2547a(interfaceC2054f, z));
    }
}
