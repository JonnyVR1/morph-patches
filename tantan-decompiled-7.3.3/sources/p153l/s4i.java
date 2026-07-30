package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class s4i extends lb2 {

    /* JADX INFO: renamed from: e */
    public y20<FeedStateCardView> f166240e;

    /* JADX INFO: renamed from: f */
    public t4i f166241f;

    /* JADX INFO: renamed from: h */
    public boolean f166243h;

    /* JADX INFO: renamed from: g */
    public Map<Integer, FeedStateCardView> f166242g = new HashMap();

    /* JADX INFO: renamed from: i */
    public int f166244i = -1;

    /* JADX INFO: renamed from: j */
    public int f166245j = -1;

    @Override // p153l.cf60
    public int getCount() {
        return this.f166241f.m189273c();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        FeedStateCardView feedStateCardView = new FeedStateCardView(viewGroup.getContext());
        feedStateCardView.m66715m0(this.f166241f.m189274d(i));
        this.f166242g.put(Integer.valueOf(i), feedStateCardView);
        y20<FeedStateCardView> y20Var = this.f166240e;
        if (y20Var != null) {
            y20Var.call(feedStateCardView);
        }
        if (this.f166243h && i == this.f166244i) {
            m184559r();
            this.f166243h = false;
        }
        viewGroup.addView(feedStateCardView);
        return feedStateCardView;
    }

    /* JADX INFO: renamed from: q */
    public FeedStateCardView m184558q() {
        return this.f166242g.get(Integer.valueOf(this.f166244i));
    }

    /* JADX INFO: renamed from: r */
    public final void m184559r() {
        this.f166242g.get(Integer.valueOf(this.f166244i)).m66713k0();
        int i = this.f166245j;
        if (i != -1 && this.f166244i != i) {
            this.f166242g.get(Integer.valueOf(i)).m66711h0();
        }
        int i2 = this.f166244i;
        if (i2 != -1) {
            this.f166245j = i2;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m184560s(t4i t4iVar) {
        this.f166241f = t4iVar;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m184561t(t4i t4iVar, boolean z) {
        this.f166243h = z;
        m184560s(t4iVar);
    }

    /* JADX INFO: renamed from: u */
    public void m184562u(int i) {
        this.f166244i = i;
        if (this.f166242g.get(Integer.valueOf(i)) == null) {
            this.f166243h = true;
        } else {
            m184559r();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m184563v(y20<FeedStateCardView> y20Var) {
        this.f166240e = y20Var;
    }
}
