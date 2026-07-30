package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftOuterPagerItemView;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.tantanapp.common.utils.NullChecker;
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
public class ysj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final ltj f9117e;

    /* JADX INFO: renamed from: f */
    public final List<NewGiftInfoPanelWrapper> f9118f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f9119g = 1;

    public ysj(ltj ltjVar) {
        this.f9117e = ltjVar;
    }

    public int getCount() {
        return this.f9118f.size();
    }

    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = this.f9118f.get(i);
        return (NullChecker.a(newGiftInfoPanelWrapper) && NullChecker.a(newGiftInfoPanelWrapper.panel)) ? this.f9118f.get(i).panel.name : "";
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m11277o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.gift.opt.view.GiftOuterPagerItemView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m11278p(ViewGroup viewGroup, int i) {
        ?? r0 = (GiftOuterPagerItemView) o7r.a(viewGroup.getContext()).inflate(l6c0.f5862O, viewGroup, false);
        r0.m2838q(this.f9117e, this.f9119g);
        r0.m2839z(this.f9118f.get(i));
        r0.setTag(Integer.valueOf(i));
        viewGroup.addView(r0);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            zvf0.A("e_gift_bar", this.f9117e.m7914t().m5635L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("gift_bar_tab", "default")});
        }
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public void m11279q(List<NewGiftInfoPanelWrapper> list, int i) {
        this.f9119g = i;
        if (NullChecker.a(list)) {
            this.f9118f.clear();
            this.f9118f.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void setPrimaryItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        super/*l.w660*/.setPrimaryItem(viewGroup, i, obj);
    }
}
