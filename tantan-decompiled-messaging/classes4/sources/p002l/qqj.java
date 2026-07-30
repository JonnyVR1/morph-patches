package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l.eb2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qqj extends eb2 {

    /* JADX INFO: renamed from: f */
    public final ahs<?> f18183f;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.u f18185h;

    /* JADX INFO: renamed from: e */
    public final List<nqj> f18182e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftInnerContentView> f18184g = new LinkedList<>();

    public qqj(ahs<?> ahsVar) {
        this.f18183f = ahsVar;
        RecyclerView.u uVar = new RecyclerView.u();
        this.f18185h = uVar;
        uVar.m(0, 16);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        if (obj instanceof GiftInnerContentView) {
            ((GiftInnerContentView) obj).m8079H();
        }
    }

    public int getCount() {
        return this.f18182e.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public void m21506o(ViewGroup viewGroup, int i, Object obj) {
        ?? r3 = (GiftInnerContentView) obj;
        viewGroup.removeView(r3);
        r3.m8079H();
        this.f18184g.add((GiftInnerContentView) r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: p */
    public Object m21507p(ViewGroup viewGroup, int i) {
        nqj nqjVar = this.f18182e.get(i);
        ?? M18974c = vwb.J(this.f18184g) ? nqjVar.m18974c(viewGroup) : this.f18184g.removeFirst();
        M18974c.f6377c.setRecycledViewPool(this.f18185h);
        nqjVar.m18972a(M18974c, this.f18183f);
        M18974c.setTag(Integer.valueOf(i));
        viewGroup.addView(M18974c);
        return M18974c;
    }

    /* JADX INFO: renamed from: q */
    public void m21508q(List<nqj> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f18182e.clear();
        this.f18182e.addAll(list);
        notifyDataSetChanged();
    }
}
