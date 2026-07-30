package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12734a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vvj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<uvj> f183231e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final LinkedList<LiveGiftStickerContentView> f183232f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public final C12734a f183233g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0583u f183234h;

    public vvj(C12734a c12734a) {
        this.f183233g = c12734a;
        RecyclerView.C0583u c0583u = new RecyclerView.C0583u();
        this.f183234h = c0583u;
        c0583u.m3431m(0, 16);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f183231e.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        LiveGiftStickerContentView liveGiftStickerContentView = (LiveGiftStickerContentView) obj;
        viewGroup.removeView(liveGiftStickerContentView);
        this.f183232f.add(liveGiftStickerContentView);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        uvj uvjVar = this.f183231e.get(i);
        LiveGiftStickerContentView liveGiftStickerContentViewM196083c = vwb.m200296J(this.f183232f) ? uvjVar.m196083c(viewGroup) : this.f183232f.removeFirst();
        liveGiftStickerContentViewM196083c.f48656c.setRecycledViewPool(this.f183234h);
        uvjVar.m196081a(liveGiftStickerContentViewM196083c, this.f183233g);
        liveGiftStickerContentViewM196083c.setTag(Integer.valueOf(i));
        viewGroup.addView(liveGiftStickerContentViewM196083c);
        return liveGiftStickerContentViewM196083c;
    }

    /* JADX INFO: renamed from: q */
    public List<uvj> m200193q() {
        return this.f183231e;
    }

    /* JADX INFO: renamed from: r */
    public void m200194r(List<uvj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f183231e.clear();
        this.f183231e.addAll(list);
        notifyDataSetChanged();
    }
}
