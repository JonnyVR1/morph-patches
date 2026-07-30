package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.p058ui.gift.panel.NewGiftPanelPagerView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPager;

/* JADX INFO: loaded from: classes3.dex */
public class sz20 extends lb2 {

    /* JADX INFO: renamed from: e */
    public b030 f171349e;

    /* JADX INFO: renamed from: f */
    public List<NewGiftInfoPanelWrapper> f171350f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public NewGiftPanelPagerView f171351g;

    /* JADX INFO: renamed from: h */
    public int f171352h;

    public sz20(b030 b030Var) {
        this.f171349e = b030Var;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f171350f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f171350f.get(i).panel.name;
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
        NewGiftPanelPagerView newGiftPanelPagerView = (NewGiftPanelPagerView) p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156902N, viewGroup, false);
        newGiftPanelPagerView.m46729R(this.f171349e);
        newGiftPanelPagerView.m46731T(this.f171350f.get(i), this.f171349e.m101249l());
        newGiftPanelPagerView.setTag(Integer.valueOf(i));
        viewGroup.addView(newGiftPanelPagerView);
        if ((viewGroup instanceof VPager) && ((VPager) viewGroup).getCurrentItem() == i) {
            i4g0.m138492A("e_gift_bar", this.f171349e.m101257v().m174335L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("gift_bar_tab", "default"));
        }
        return newGiftPanelPagerView;
    }

    /* JADX INFO: renamed from: q */
    public void m188619q(List<NewGiftInfoPanelWrapper> list) {
        this.f171350f.clear();
        this.f171350f.addAll(list);
        notifyDataSetChanged();
    }

    @Override // p153l.cf60
    public void setPrimaryItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
        NewGiftPanelPagerView newGiftPanelPagerView = (NewGiftPanelPagerView) obj;
        this.f171351g = newGiftPanelPagerView;
        if (this.f171352h != i) {
            this.f171352h = i;
            this.f171349e.m101260y(newGiftPanelPagerView.getAdapter());
            this.f171351g.f30133c.scrollToPosition(0);
        }
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
