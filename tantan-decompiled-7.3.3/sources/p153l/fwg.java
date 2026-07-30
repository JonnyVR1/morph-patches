package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class fwg extends RecyclerView.Adapter<C17086a> {

    /* JADX INFO: renamed from: d */
    public static final int[] f101159d = {lbc0.f131175x0, lbc0.f131143t0, lbc0.f131151u0, lbc0.f131159v0, lbc0.f131167w0};

    /* JADX INFO: renamed from: a */
    public Context f101160a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f101161b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public z20<CameraCategory, Integer> f101162c;

    /* JADX INFO: renamed from: l.fwg$a */
    public static class C17086a extends RecyclerView.AbstractC0569e0 {
        public C17086a(FeedComicFaceCategoryView feedComicFaceCategoryView) {
            super(feedComicFaceCategoryView);
        }
    }

    public fwg(Context context) {
        this.f101160a = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m127762A(CameraCategory cameraCategory, int i, View view) {
        z20<CameraCategory, Integer> z20Var = this.f101162c;
        if (z20Var != null) {
            z20Var.call(cameraCategory, Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C17086a c17086a, final int i) {
        FeedComicFaceCategoryView feedComicFaceCategoryView = (FeedComicFaceCategoryView) c17086a.itemView;
        feedComicFaceCategoryView.f41044b.setImageResource(m127767z(i));
        feedComicFaceCategoryView.f41044b.getBackground().setAlpha(0);
        final CameraCategory cameraCategory = this.f101161b.get(i);
        if (cameraCategory != null) {
            c17086a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ewg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96155a.m127762A(cameraCategory, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C17086a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17086a(new FeedComicFaceCategoryView(this.f101160a));
    }

    /* JADX INFO: renamed from: E */
    public void m127765E(List<CameraCategory> list) {
        if (list.equals(this.f101161b)) {
            return;
        }
        this.f101161b.clear();
        this.f101161b.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m127766F(z20<CameraCategory, Integer> z20Var) {
        this.f101162c = z20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CameraCategory> list = this.f101161b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m127767z(int i) {
        return i < 0 ? f101159d[0] : f101159d[i % 5];
    }
}
