package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftOuterPagerItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class ysj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final ltj f199785e;

    /* JADX INFO: renamed from: f */
    public final List<NewGiftInfoPanelWrapper> f199786f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f199787g = 1;

    public ysj(ltj ltjVar) {
        this.f199785e = ltjVar;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f199786f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = this.f199786f.get(i);
        return (NullChecker.m81303a(newGiftInfoPanelWrapper) && NullChecker.m81303a(newGiftInfoPanelWrapper.panel)) ? this.f199786f.get(i).panel.name : "";
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
        GiftOuterPagerItemView giftOuterPagerItemView = (GiftOuterPagerItemView) o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126353O, viewGroup, false);
        giftOuterPagerItemView.m45502q(this.f199785e, this.f199787g);
        giftOuterPagerItemView.m45503z(this.f199786f.get(i));
        giftOuterPagerItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(giftOuterPagerItemView);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            zvf0.m220368A("e_gift_bar", this.f199785e.m151705t().m98810L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("gift_bar_tab", "default"));
        }
        return giftOuterPagerItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m215912q(List<NewGiftInfoPanelWrapper> list, int i) {
        this.f199787g = i;
        if (NullChecker.m81303a(list)) {
            this.f199786f.clear();
            this.f199786f.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // p149l.w660
    public void setPrimaryItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
