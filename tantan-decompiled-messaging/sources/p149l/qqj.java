package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qqj extends eb2 {

    /* JADX INFO: renamed from: f */
    public final ahs<?> f155905f;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0583u f155907h;

    /* JADX INFO: renamed from: e */
    public final List<nqj> f155904e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftInnerContentView> f155906g = new LinkedList<>();

    public qqj(ahs<?> ahsVar) {
        this.f155905f = ahsVar;
        RecyclerView.C0583u c0583u = new RecyclerView.C0583u();
        this.f155907h = c0583u;
        c0583u.m3431m(0, 16);
    }

    @Override // p149l.eb2, p149l.w660
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        if (obj instanceof GiftInnerContentView) {
            ((GiftInnerContentView) obj).m74492H();
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f155904e.size();
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
        GiftInnerContentView giftInnerContentView = (GiftInnerContentView) obj;
        viewGroup.removeView(giftInnerContentView);
        giftInnerContentView.m74492H();
        this.f155906g.add(giftInnerContentView);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        nqj nqjVar = this.f155904e.get(i);
        GiftInnerContentView giftInnerContentViewM160624c = vwb.m200296J(this.f155906g) ? nqjVar.m160624c(viewGroup) : this.f155906g.removeFirst();
        giftInnerContentViewM160624c.f50335c.setRecycledViewPool(this.f155907h);
        nqjVar.m160622a(giftInnerContentViewM160624c, this.f155905f);
        giftInnerContentViewM160624c.setTag(Integer.valueOf(i));
        viewGroup.addView(giftInnerContentViewM160624c);
        return giftInnerContentViewM160624c;
    }

    /* JADX INFO: renamed from: q */
    public void m175943q(List<nqj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f155904e.clear();
        this.f155904e.addAll(list);
        notifyDataSetChanged();
    }
}
