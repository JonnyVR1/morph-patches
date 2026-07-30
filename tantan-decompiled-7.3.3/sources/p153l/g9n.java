package p153l;

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
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class g9n implements iam<c9n> {

    /* JADX INFO: renamed from: a */
    public final LiveBaseAdapter f102865a;

    /* JADX INFO: renamed from: b */
    public final View f102866b;

    /* JADX INFO: renamed from: c */
    public c9n f102867c;

    /* JADX INFO: renamed from: l.g9n$a */
    public class C17183a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (recyclerView.getChildAdapterPosition(view) <= 0) {
                rect.left = 0;
            } else {
                rect.left = qa00.m175859d(10.0f);
            }
            rect.top = 0;
            rect.right = 0;
            rect.bottom = 0;
        }
    }

    public g9n(VFrame vFrame, View view) {
        Context context = vFrame.getContext();
        VRecyclerView vRecyclerViewM129593e = m129593e(context);
        vRecyclerViewM129593e.setLayoutManager(new LinearLayoutManager(context, 0, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f102865a = liveBaseAdapter;
        vRecyclerViewM129593e.setAdapter(liveBaseAdapter);
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.topMargin = qa00.m175859d(15.0f);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = qa00.m175859d(17.0f);
        vFrame.addView(vRecyclerViewM129593e, layoutParams);
        this.f102866b = view;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static VRecyclerView m129593e(Context context) {
        VRecyclerView vRecyclerView = new VRecyclerView(context);
        vRecyclerView.addItemDecoration(new C17183a());
        return vRecyclerView;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(c9n c9nVar) {
        this.f102867c = c9nVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m129595f(BLiveDanmakuListItem bLiveDanmakuListItem, ArrayList arrayList, y8n y8nVar, View view) {
        this.f102867c.m108451W3(bLiveDanmakuListItem);
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            return;
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.f9n
            @Override // p153l.y20
            public final void call(Object obj) {
                ((y8n) obj).f198017b = false;
            }
        });
        y8nVar.f198017b = true;
        this.f102865a.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m129596i(BLiveDanmakuListItem bLiveDanmakuListItem, final ArrayList arrayList, final BLiveDanmakuListItem bLiveDanmakuListItem2) {
        final y8n y8nVar = new y8n(bLiveDanmakuListItem2);
        y8nVar.f198017b = bLiveDanmakuListItem != null && TextUtils.equals(bLiveDanmakuListItem2.f45203id, bLiveDanmakuListItem.f45203id);
        arrayList.add(y8nVar);
        if (y8nVar.f198017b) {
            c9n c9nVar = this.f102867c;
            c9nVar.f80506k = bLiveDanmakuListItem2;
            c9nVar.m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(bLiveDanmakuListItem2);
        }
        y8nVar.mo113881A(new View.OnClickListener() { // from class: l.e9n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92659a.m129595f(bLiveDanmakuListItem2, arrayList, y8nVar, view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m129597j(List<BLiveDanmakuListItem> list) {
        boolean zM147479J = jyb.m147479J(list);
        View view = this.f102866b;
        if (zM147479J) {
            bnl0.m105524M(view, false);
            return;
        }
        bnl0.m105524M(view, true);
        final ArrayList arrayList = new ArrayList();
        final BLiveDanmakuListItem bLiveDanmakuListItem = this.f102867c.f80506k;
        jyb.m147537z(list, new y20() { // from class: l.d9n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85797a.m129596i(bLiveDanmakuListItem, arrayList, (BLiveDanmakuListItem) obj);
            }
        });
        this.f102865a.m68554Z(arrayList);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
