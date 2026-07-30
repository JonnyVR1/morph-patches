package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12897a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lyj extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<kyj> f134080e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final LinkedList<LiveGiftStickerContentView> f134081f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public final C12897a f134082g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0585u f134083h;

    public lyj(C12897a c12897a) {
        this.f134082g = c12897a;
        RecyclerView.C0585u c0585u = new RecyclerView.C0585u();
        this.f134083h = c0585u;
        c0585u.m3440m(0, 16);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f134080e.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        LiveGiftStickerContentView liveGiftStickerContentView = (LiveGiftStickerContentView) obj;
        viewGroup.removeView(liveGiftStickerContentView);
        this.f134081f.add(liveGiftStickerContentView);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        kyj kyjVar = this.f134080e.get(i);
        LiveGiftStickerContentView liveGiftStickerContentViewM151979c = jyb.m147479J(this.f134081f) ? kyjVar.m151979c(viewGroup) : this.f134081f.removeFirst();
        liveGiftStickerContentViewM151979c.f49504c.setRecycledViewPool(this.f134083h);
        kyjVar.m151977a(liveGiftStickerContentViewM151979c, this.f134082g);
        liveGiftStickerContentViewM151979c.setTag(Integer.valueOf(i));
        viewGroup.addView(liveGiftStickerContentViewM151979c);
        return liveGiftStickerContentViewM151979c;
    }

    /* JADX INFO: renamed from: q */
    public List<kyj> m156293q() {
        return this.f134080e;
    }

    /* JADX INFO: renamed from: r */
    public void m156294r(List<kyj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f134080e.clear();
        this.f134080e.addAll(list);
        notifyDataSetChanged();
    }
}
