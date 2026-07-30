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
public class oss extends PopupWindow {

    /* JADX INFO: renamed from: l.oss$a */
    public static class C19028a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final int f145507a;

        /* JADX INFO: renamed from: b */
        public final int f145508b;

        /* JADX INFO: renamed from: c */
        public final int f145509c;

        public C19028a(int i, int i2, int i3) {
            this.f145507a = i;
            this.f145508b = i2;
            this.f145509c = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
            rect.top = this.f145508b;
            if (adapterPosition % this.f145509c != 0) {
                rect.left = this.f145507a;
            }
        }
    }

    public oss(Context context, List<d1q<?>> list) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(s6c0.f162668G0, (ViewGroup) null);
        setContentView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(f5c0.f95110k1);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        int i = t100.f167257f;
        recyclerView.addItemDecoration(new C19028a(i, i, 4));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        recyclerView.setAdapter(liveBaseAdapter);
        liveBaseAdapter.m67371Z(list);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(c8c0.f79747l);
        setBackgroundDrawable(context.getResources().getDrawable(h3c0.f105605D1));
        xdl0.m208329E0(viewInflate.findViewById(f5c0.f95081d0), new View.OnClickListener() { // from class: l.nss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140293a.m165909b(view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m165909b(View view) {
        dismiss();
    }
}
