package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gtj extends lb2 {

    /* JADX INFO: renamed from: f */
    public final bjs<?> f106422f;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0585u f106424h;

    /* JADX INFO: renamed from: e */
    public final List<dtj> f106421e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftInnerContentView> f106423g = new LinkedList<>();

    public gtj(bjs<?> bjsVar) {
        this.f106422f = bjsVar;
        RecyclerView.C0585u c0585u = new RecyclerView.C0585u();
        this.f106424h = c0585u;
        c0585u.m3440m(0, 16);
    }

    @Override // p153l.lb2, p153l.cf60
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        if (obj instanceof GiftInnerContentView) {
            ((GiftInnerContentView) obj).m75675H();
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f106421e.size();
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
        GiftInnerContentView giftInnerContentView = (GiftInnerContentView) obj;
        viewGroup.removeView(giftInnerContentView);
        giftInnerContentView.m75675H();
        this.f106423g.add(giftInnerContentView);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        dtj dtjVar = this.f106421e.get(i);
        GiftInnerContentView giftInnerContentViewM117881c = jyb.m147479J(this.f106423g) ? dtjVar.m117881c(viewGroup) : this.f106423g.removeFirst();
        giftInnerContentViewM117881c.f51183c.setRecycledViewPool(this.f106424h);
        dtjVar.m117879a(giftInnerContentViewM117881c, this.f106422f);
        giftInnerContentViewM117881c.setTag(Integer.valueOf(i));
        viewGroup.addView(giftInnerContentViewM117881c);
        return giftInnerContentViewM117881c;
    }

    /* JADX INFO: renamed from: q */
    public void m132240q(List<dtj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f106421e.clear();
        this.f106421e.addAll(list);
        notifyDataSetChanged();
    }
}
