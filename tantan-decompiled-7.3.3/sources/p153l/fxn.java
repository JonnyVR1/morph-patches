package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class fxn extends PopupWindow {

    /* JADX INFO: renamed from: l.fxn$a */
    public static class C17090a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final int f101275a;

        /* JADX INFO: renamed from: b */
        public final int f101276b;

        /* JADX INFO: renamed from: c */
        public final int f101277c;

        public C17090a(int i, int i2, int i3) {
            this.f101275a = i;
            this.f101276b = i2;
            this.f101277c = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            rect.top = this.f101276b;
            if (adapterPosition % this.f101277c != 0) {
                rect.left = this.f101275a;
            }
        }
    }

    public fxn(Context context, List<d3q<?>> list) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(xec0.f193811Q, (ViewGroup) null);
        setContentView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ldc0.f131567k1);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        int i = qa00.f156319f;
        recyclerView.addItemDecoration(new C17090a(i, i, 4));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        recyclerView.setAdapter(liveBaseAdapter);
        liveBaseAdapter.m68554Z(list);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(hgc0.f109395l);
        setBackgroundDrawable(context.getResources().getDrawable(nbc0.f141096D1));
        bnl0.m105509E0(viewInflate.findViewById(ldc0.f131538d0), new View.OnClickListener() { // from class: l.exn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96316a.m127995b(view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m127995b(View view) {
        dismiss();
    }
}
