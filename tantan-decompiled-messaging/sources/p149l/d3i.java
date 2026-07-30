package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class d3i extends eb2 {

    /* JADX INFO: renamed from: e */
    public e30<FeedStateCardView> f84221e;

    /* JADX INFO: renamed from: f */
    public e3i f84222f;

    /* JADX INFO: renamed from: h */
    public boolean f84224h;

    /* JADX INFO: renamed from: g */
    public Map<Integer, FeedStateCardView> f84223g = new HashMap();

    /* JADX INFO: renamed from: i */
    public int f84225i = -1;

    /* JADX INFO: renamed from: j */
    public int f84226j = -1;

    @Override // p149l.w660
    public int getCount() {
        return this.f84222f.m114593c();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        FeedStateCardView feedStateCardView = new FeedStateCardView(viewGroup.getContext());
        feedStateCardView.m65532m0(this.f84222f.m114594d(i));
        this.f84223g.put(Integer.valueOf(i), feedStateCardView);
        e30<FeedStateCardView> e30Var = this.f84221e;
        if (e30Var != null) {
            e30Var.call(feedStateCardView);
        }
        if (this.f84224h && i == this.f84225i) {
            m109920r();
            this.f84224h = false;
        }
        viewGroup.addView(feedStateCardView);
        return feedStateCardView;
    }

    /* JADX INFO: renamed from: q */
    public FeedStateCardView m109919q() {
        return this.f84223g.get(Integer.valueOf(this.f84225i));
    }

    /* JADX INFO: renamed from: r */
    public final void m109920r() {
        this.f84223g.get(Integer.valueOf(this.f84225i)).m65530k0();
        int i = this.f84226j;
        if (i != -1 && this.f84225i != i) {
            this.f84223g.get(Integer.valueOf(i)).m65528h0();
        }
        int i2 = this.f84225i;
        if (i2 != -1) {
            this.f84226j = i2;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m109921s(e3i e3iVar) {
        this.f84222f = e3iVar;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m109922t(e3i e3iVar, boolean z) {
        this.f84224h = z;
        m109921s(e3iVar);
    }

    /* JADX INFO: renamed from: u */
    public void m109923u(int i) {
        this.f84225i = i;
        if (this.f84223g.get(Integer.valueOf(i)) == null) {
            this.f84224h = true;
        } else {
            m109920r();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m109924v(e30<FeedStateCardView> e30Var) {
        this.f84221e = e30Var;
    }
}
