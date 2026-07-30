package p007l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;
import java.util.ArrayList;
import java.util.List;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qug extends RecyclerView.Adapter<C2473a> {

    /* JADX INFO: renamed from: d */
    public static final int[] f12393d = {f3c0.f7940x0, f3c0.f7908t0, f3c0.f7916u0, f3c0.f7924v0, f3c0.f7932w0};

    /* JADX INFO: renamed from: a */
    public Context f12394a;

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f12395b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public f30<CameraCategory, Integer> f12396c;

    /* JADX INFO: renamed from: l.qug$a */
    public static class C2473a extends RecyclerView.d0 {
        public C2473a(FeedComicFaceCategoryView feedComicFaceCategoryView) {
            super(feedComicFaceCategoryView);
        }
    }

    public qug(Context context) {
        this.f12394a = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m13731A(CameraCategory cameraCategory, int i, View view) {
        f30<CameraCategory, Integer> f30Var = this.f12396c;
        if (f30Var != null) {
            f30Var.call(cameraCategory, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C2473a c2473a, final int i) {
        FeedComicFaceCategoryView feedComicFaceCategoryView = (FeedComicFaceCategoryView) ((RecyclerView.d0) c2473a).itemView;
        feedComicFaceCategoryView.f1657b.setImageResource(m13736z(i));
        feedComicFaceCategoryView.f1657b.getBackground().setAlpha(0);
        final CameraCategory cameraCategory = this.f12395b.get(i);
        if (cameraCategory != null) {
            ((RecyclerView.d0) c2473a).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.pug
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11981a.m13731A(cameraCategory, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C2473a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2473a(new FeedComicFaceCategoryView(this.f12394a));
    }

    /* JADX INFO: renamed from: E */
    public void m13734E(List<CameraCategory> list) {
        if (list.equals(this.f12395b)) {
            return;
        }
        this.f12395b.clear();
        this.f12395b.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m13735F(f30<CameraCategory, Integer> f30Var) {
        this.f12396c = f30Var;
    }

    public int getItemCount() {
        List<CameraCategory> list = this.f12395b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m13736z(int i) {
        return i < 0 ? f12393d[0] : f12393d[i % 5];
    }
}
