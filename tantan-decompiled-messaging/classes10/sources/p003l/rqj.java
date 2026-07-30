package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftRecyclerItemView;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.o7r;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rqj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final int f7218e;

    /* JADX INFO: renamed from: f */
    public final int f7219f;

    /* JADX INFO: renamed from: g */
    public final List<CoreGiftInfo> f7220g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ltj f7221h;

    public rqj(ltj ltjVar, int i, int i2) {
        this.f7221h = ltjVar;
        this.f7218e = i;
        this.f7219f = i2 * i;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        int size = this.f7220g.size();
        int i = this.f7219f;
        if (i <= 0 || size <= 0) {
            return 0;
        }
        return (int) Math.ceil((size * 1.0f) / i);
    }

    public int getItemPosition(@NotNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m9156o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((GiftRecyclerItemView) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.gift.opt.view.GiftRecyclerItemView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m9157p(ViewGroup viewGroup, int i) {
        ?? r0 = (GiftRecyclerItemView) o7r.a(viewGroup.getContext()).inflate(l6c0.f5883R, viewGroup, false);
        viewGroup.addView(r0);
        int i2 = this.f7219f;
        int i3 = i * i2;
        List<CoreGiftInfo> list = this.f7220g;
        r0.m2858H(list.subList(i3, Math.min(i2 + i3, list.size())), this.f7221h, this.f7218e);
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public void m9158q(List<CoreGiftInfo> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f7220g.clear();
        this.f7220g.addAll(list);
        notifyDataSetChanged();
    }
}
