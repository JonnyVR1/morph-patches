package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.eb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d3i extends eb2 {

    /* JADX INFO: renamed from: e */
    public e30<FeedStateCardView> f6795e;

    /* JADX INFO: renamed from: f */
    public e3i f6796f;

    /* JADX INFO: renamed from: h */
    public boolean f6798h;

    /* JADX INFO: renamed from: g */
    public Map<Integer, FeedStateCardView> f6797g = new HashMap();

    /* JADX INFO: renamed from: i */
    public int f6799i = -1;

    /* JADX INFO: renamed from: j */
    public int f6800j = -1;

    public int getCount() {
        return this.f6796f.m9605c();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m9296o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m9297p(ViewGroup viewGroup, int i) {
        ?? feedStateCardView = new FeedStateCardView(viewGroup.getContext());
        feedStateCardView.m6659m0(this.f6796f.m9606d(i));
        this.f6797g.put(Integer.valueOf(i), (FeedStateCardView) feedStateCardView);
        e30<FeedStateCardView> e30Var = this.f6795e;
        if (e30Var != null) {
            e30Var.call((Object) feedStateCardView);
        }
        if (this.f6798h && i == this.f6799i) {
            m9299r();
            this.f6798h = false;
        }
        viewGroup.addView(feedStateCardView);
        return feedStateCardView;
    }

    /* JADX INFO: renamed from: q */
    public FeedStateCardView m9298q() {
        return this.f6797g.get(Integer.valueOf(this.f6799i));
    }

    /* JADX INFO: renamed from: r */
    public final void m9299r() {
        this.f6797g.get(Integer.valueOf(this.f6799i)).m6657k0();
        int i = this.f6800j;
        if (i != -1 && this.f6799i != i) {
            this.f6797g.get(Integer.valueOf(i)).m6655h0();
        }
        int i2 = this.f6799i;
        if (i2 != -1) {
            this.f6800j = i2;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m9300s(e3i e3iVar) {
        this.f6796f = e3iVar;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m9301t(e3i e3iVar, boolean z) {
        this.f6798h = z;
        m9300s(e3iVar);
    }

    /* JADX INFO: renamed from: u */
    public void m9302u(int i) {
        this.f6799i = i;
        if (this.f6797g.get(Integer.valueOf(i)) == null) {
            this.f6798h = true;
        } else {
            m9299r();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9303v(e30<FeedStateCardView> e30Var) {
        this.f6795e = e30Var;
    }
}
