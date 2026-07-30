package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class qug extends RecyclerView.Adapter<C19582a> {

    /* JADX INFO: renamed from: d */
    public static final int[] f156480d = {f3c0.f94657x0, f3c0.f94625t0, f3c0.f94633u0, f3c0.f94641v0, f3c0.f94649w0};

    /* JADX INFO: renamed from: a */
    public Context f156481a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f156482b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public f30<CameraCategory, Integer> f156483c;

    /* JADX INFO: renamed from: l.qug$a */
    public static class C19582a extends RecyclerView.AbstractC0566d0 {
        public C19582a(FeedComicFaceCategoryView feedComicFaceCategoryView) {
            super(feedComicFaceCategoryView);
        }
    }

    public qug(Context context) {
        this.f156481a = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m176600A(CameraCategory cameraCategory, int i, View view) {
        f30<CameraCategory, Integer> f30Var = this.f156483c;
        if (f30Var != null) {
            f30Var.call(cameraCategory, Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C19582a c19582a, final int i) {
        FeedComicFaceCategoryView feedComicFaceCategoryView = (FeedComicFaceCategoryView) c19582a.itemView;
        feedComicFaceCategoryView.f40196b.setImageResource(m176605z(i));
        feedComicFaceCategoryView.f40196b.getBackground().setAlpha(0);
        final CameraCategory cameraCategory = this.f156482b.get(i);
        if (cameraCategory != null) {
            c19582a.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.pug
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151287a.m176600A(cameraCategory, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C19582a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19582a(new FeedComicFaceCategoryView(this.f156481a));
    }

    /* JADX INFO: renamed from: E */
    public void m176603E(List<CameraCategory> list) {
        if (list.equals(this.f156482b)) {
            return;
        }
        this.f156482b.clear();
        this.f156482b.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m176604F(f30<CameraCategory, Integer> f30Var) {
        this.f156483c = f30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CameraCategory> list = this.f156482b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m176605z(int i) {
        return i < 0 ? f156480d[0] : f156480d[i % 5];
    }
}
