package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftRecyclerItemView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class rqj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final int f160656e;

    /* JADX INFO: renamed from: f */
    public final int f160657f;

    /* JADX INFO: renamed from: g */
    public final List<CoreGiftInfo> f160658g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ltj f160659h;

    public rqj(ltj ltjVar, int i, int i2) {
        this.f160659h = ltjVar;
        this.f160656e = i;
        this.f160657f = i2 * i;
    }

    @Override // p149l.eb2, p149l.w660
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        int size = this.f160658g.size();
        int i = this.f160657f;
        if (i <= 0 || size <= 0) {
            return 0;
        }
        return (int) Math.ceil((size * 1.0f) / i);
    }

    @Override // p149l.w660
    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((GiftRecyclerItemView) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        GiftRecyclerItemView giftRecyclerItemView = (GiftRecyclerItemView) o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126374R, viewGroup, false);
        viewGroup.addView(giftRecyclerItemView);
        int i2 = this.f160657f;
        int i3 = i * i2;
        List<CoreGiftInfo> list = this.f160658g;
        giftRecyclerItemView.m45522H(list.subList(i3, Math.min(i2 + i3, list.size())), this.f160659h, this.f160656e);
        return giftRecyclerItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m180460q(List<CoreGiftInfo> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f160658g.clear();
        this.f160658g.addAll(list);
        notifyDataSetChanged();
    }
}
