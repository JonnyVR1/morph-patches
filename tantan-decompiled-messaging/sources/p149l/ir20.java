package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.p053ui.gift.panel.NewGiftPanelPagerView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class ir20 extends eb2 {

    /* JADX INFO: renamed from: e */
    public rr20 f114579e;

    /* JADX INFO: renamed from: f */
    public List<NewGiftInfoPanelWrapper> f114580f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public NewGiftPanelPagerView f114581g;

    /* JADX INFO: renamed from: h */
    public int f114582h;

    public ir20(rr20 rr20Var) {
        this.f114579e = rr20Var;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f114580f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f114580f.get(i).panel.name;
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
        NewGiftPanelPagerView newGiftPanelPagerView = (NewGiftPanelPagerView) o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126346N, viewGroup, false);
        newGiftPanelPagerView.m45546R(this.f114579e);
        newGiftPanelPagerView.m45548T(this.f114580f.get(i), this.f114579e.m180530l());
        newGiftPanelPagerView.setTag(Integer.valueOf(i));
        viewGroup.addView(newGiftPanelPagerView);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            zvf0.m220368A("e_gift_bar", this.f114579e.m180538v().m122799L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("gift_bar_tab", "default"));
        }
        return newGiftPanelPagerView;
    }

    /* JADX INFO: renamed from: q */
    public void m137819q(List<NewGiftInfoPanelWrapper> list) {
        this.f114580f.clear();
        this.f114580f.addAll(list);
        notifyDataSetChanged();
    }

    @Override // p149l.w660
    public void setPrimaryItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
        NewGiftPanelPagerView newGiftPanelPagerView = (NewGiftPanelPagerView) obj;
        this.f114581g = newGiftPanelPagerView;
        if (this.f114582h != i) {
            this.f114582h = i;
            this.f114579e.m180541y(newGiftPanelPagerView.getAdapter());
            this.f114581g.f29285c.scrollToPosition(0);
        }
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
