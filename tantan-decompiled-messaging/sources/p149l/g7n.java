package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class g7n implements s7m<c7n> {

    /* JADX INFO: renamed from: a */
    public final LiveBaseAdapter f101416a;

    /* JADX INFO: renamed from: b */
    public final View f101417b;

    /* JADX INFO: renamed from: c */
    public c7n f101418c;

    /* JADX INFO: renamed from: l.g7n$a */
    public class C17018a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (recyclerView.getChildAdapterPosition(view) <= 0) {
                rect.left = 0;
            } else {
                rect.left = t100.m186890d(10.0f);
            }
            rect.top = 0;
            rect.right = 0;
            rect.bottom = 0;
        }
    }

    public g7n(VFrame vFrame, View view) {
        Context context = vFrame.getContext();
        VRecyclerView vRecyclerViewM124721e = m124721e(context);
        vRecyclerViewM124721e.setLayoutManager(new LinearLayoutManager(context, 0, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f101416a = liveBaseAdapter;
        vRecyclerViewM124721e.setAdapter(liveBaseAdapter);
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.topMargin = t100.m186890d(15.0f);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = t100.m186890d(17.0f);
        vFrame.addView(vRecyclerViewM124721e, layoutParams);
        this.f101417b = view;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static VRecyclerView m124721e(Context context) {
        VRecyclerView vRecyclerView = new VRecyclerView(context);
        vRecyclerView.addItemDecoration(new C17018a());
        return vRecyclerView;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c7n c7nVar) {
        this.f101418c = c7nVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m124723f(BLiveDanmakuListItem bLiveDanmakuListItem, ArrayList arrayList, y6n y6nVar, View view) {
        this.f101418c.m105613W3(bLiveDanmakuListItem);
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            return;
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.f7n
            @Override // p149l.e30
            public final void call(Object obj) {
                ((y6n) obj).f196584b = false;
            }
        });
        y6nVar.f196584b = true;
        this.f101416a.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m124724i(BLiveDanmakuListItem bLiveDanmakuListItem, final ArrayList arrayList, final BLiveDanmakuListItem bLiveDanmakuListItem2) {
        final y6n y6nVar = new y6n(bLiveDanmakuListItem2);
        y6nVar.f196584b = bLiveDanmakuListItem != null && TextUtils.equals(bLiveDanmakuListItem2.f44355id, bLiveDanmakuListItem.f44355id);
        arrayList.add(y6nVar);
        if (y6nVar.f196584b) {
            c7n c7nVar = this.f101418c;
            c7nVar.f79634k = bLiveDanmakuListItem2;
            c7nVar.m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(bLiveDanmakuListItem2);
        }
        y6nVar.mo109662A(new View.OnClickListener() { // from class: l.e7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89729a.m124723f(bLiveDanmakuListItem2, arrayList, y6nVar, view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m124725j(List<BLiveDanmakuListItem> list) {
        boolean zM200296J = vwb.m200296J(list);
        View view = this.f101417b;
        if (zM200296J) {
            xdl0.m208344M(view, false);
            return;
        }
        xdl0.m208344M(view, true);
        final ArrayList arrayList = new ArrayList();
        final BLiveDanmakuListItem bLiveDanmakuListItem = this.f101418c.f79634k;
        vwb.m200354z(list, new e30() { // from class: l.d7n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84752a.m124724i(bLiveDanmakuListItem, arrayList, (BLiveDanmakuListItem) obj);
            }
        });
        this.f101416a.m67371Z(arrayList);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
