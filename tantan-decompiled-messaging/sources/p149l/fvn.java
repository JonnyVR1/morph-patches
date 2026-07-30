package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class fvn extends PopupWindow {

    /* JADX INFO: renamed from: l.fvn$a */
    public static class C16930a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final int f99463a;

        /* JADX INFO: renamed from: b */
        public final int f99464b;

        /* JADX INFO: renamed from: c */
        public final int f99465c;

        public C16930a(int i, int i2, int i3) {
            this.f99463a = i;
            this.f99464b = i2;
            this.f99465c = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            rect.top = this.f99464b;
            if (adapterPosition % this.f99465c != 0) {
                rect.left = this.f99463a;
            }
        }
    }

    public fvn(Context context, List<d1q<?>> list) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(s6c0.f162697Q, (ViewGroup) null);
        setContentView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(f5c0.f95110k1);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        int i = t100.f167257f;
        recyclerView.addItemDecoration(new C16930a(i, i, 4));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        recyclerView.setAdapter(liveBaseAdapter);
        liveBaseAdapter.m67371Z(list);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(c8c0.f79747l);
        setBackgroundDrawable(context.getResources().getDrawable(h3c0.f105605D1));
        xdl0.m208329E0(viewInflate.findViewById(f5c0.f95081d0), new View.OnClickListener() { // from class: l.evn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93363a.m123345b(view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m123345b(View view) {
        dismiss();
    }
}
