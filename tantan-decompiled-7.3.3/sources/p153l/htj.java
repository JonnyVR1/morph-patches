package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftRecyclerItemView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class htj extends lb2 {

    /* JADX INFO: renamed from: e */
    public final int f111551e;

    /* JADX INFO: renamed from: f */
    public final int f111552f;

    /* JADX INFO: renamed from: g */
    public final List<CoreGiftInfo> f111553g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final bwj f111554h;

    public htj(bwj bwjVar, int i, int i2) {
        this.f111554h = bwjVar;
        this.f111551e = i;
        this.f111552f = i2 * i;
    }

    @Override // p153l.lb2, p153l.cf60
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        int size = this.f111553g.size();
        int i = this.f111552f;
        if (i <= 0 || size <= 0) {
            return 0;
        }
        return (int) Math.ceil((size * 1.0f) / i);
    }

    @Override // p153l.cf60
    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((GiftRecyclerItemView) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        GiftRecyclerItemView giftRecyclerItemView = (GiftRecyclerItemView) p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156930R, viewGroup, false);
        viewGroup.addView(giftRecyclerItemView);
        int i2 = this.f111552f;
        int i3 = i * i2;
        List<CoreGiftInfo> list = this.f111553g;
        giftRecyclerItemView.m46705H(list.subList(i3, Math.min(i2 + i3, list.size())), this.f111554h, this.f111551e);
        return giftRecyclerItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m137085q(List<CoreGiftInfo> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f111553g.clear();
        this.f111553g.addAll(list);
        notifyDataSetChanged();
    }
}
