package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftOuterPagerItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPager;

/* JADX INFO: loaded from: classes3.dex */
public class ovj extends lb2 {

    /* JADX INFO: renamed from: e */
    public final bwj f149272e;

    /* JADX INFO: renamed from: f */
    public final List<NewGiftInfoPanelWrapper> f149273f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f149274g = 1;

    public ovj(bwj bwjVar) {
        this.f149272e = bwjVar;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f149273f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = this.f149273f.get(i);
        return (NullChecker.m82486a(newGiftInfoPanelWrapper) && NullChecker.m82486a(newGiftInfoPanelWrapper.panel)) ? this.f149273f.get(i).panel.name : "";
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
        GiftOuterPagerItemView giftOuterPagerItemView = (GiftOuterPagerItemView) p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156909O, viewGroup, false);
        giftOuterPagerItemView.m46685q(this.f149272e, this.f149274g);
        giftOuterPagerItemView.m46686z(this.f149273f.get(i));
        giftOuterPagerItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(giftOuterPagerItemView);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            i4g0.m138492A("e_gift_bar", this.f149272e.m106714t().m178298L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("gift_bar_tab", "default"));
        }
        return giftOuterPagerItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m169452q(List<NewGiftInfoPanelWrapper> list, int i) {
        this.f149274g = i;
        if (NullChecker.m82486a(list)) {
            this.f149273f.clear();
            this.f149273f.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // p153l.cf60
    public void setPrimaryItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
