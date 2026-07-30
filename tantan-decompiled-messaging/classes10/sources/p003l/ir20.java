package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.gift.panel.NewGiftPanelPagerView;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.j760;
import l.o7r;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ir20 extends eb2 {

    /* JADX INFO: renamed from: e */
    public rr20 f5199e;

    /* JADX INFO: renamed from: f */
    public List<NewGiftInfoPanelWrapper> f5200f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public NewGiftPanelPagerView f5201g;

    /* JADX INFO: renamed from: h */
    public int f5202h;

    public ir20(rr20 rr20Var) {
        this.f5199e = rr20Var;
    }

    public int getCount() {
        return this.f5200f.size();
    }

    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f5200f.get(i).panel.name;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m7288o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.gift.panel.NewGiftPanelPagerView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m7289p(ViewGroup viewGroup, int i) {
        ?? r0 = (NewGiftPanelPagerView) o7r.a(viewGroup.getContext()).inflate(l6c0.f5855N, viewGroup, false);
        r0.m2882R(this.f5199e);
        r0.m2884T(this.f5200f.get(i), this.f5199e.m9167l());
        r0.setTag(Integer.valueOf(i));
        viewGroup.addView(r0);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            zvf0.A("e_gift_bar", this.f5199e.m9175v().m6500L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("gift_bar_tab", "default")});
        }
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public void m7290q(List<NewGiftInfoPanelWrapper> list) {
        this.f5200f.clear();
        this.f5200f.addAll(list);
        notifyDataSetChanged();
    }

    public void setPrimaryItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
        NewGiftPanelPagerView newGiftPanelPagerView = (NewGiftPanelPagerView) obj;
        this.f5201g = newGiftPanelPagerView;
        if (this.f5202h != i) {
            this.f5202h = i;
            this.f5199e.m9178y(newGiftPanelPagerView.getAdapter());
            this.f5201g.f1679c.scrollToPosition(0);
        }
        super/*l.w660*/.setPrimaryItem(viewGroup, i, obj);
    }
}
