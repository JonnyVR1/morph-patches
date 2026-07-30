package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0323a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l.eb2;
import l.vwb;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vvj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<uvj> f21343e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final LinkedList<LiveGiftStickerContentView> f21344f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public final C0323a f21345g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.u f21346h;

    public vvj(C0323a c0323a) {
        this.f21345g = c0323a;
        RecyclerView.u uVar = new RecyclerView.u();
        this.f21346h = uVar;
        uVar.m(0, 16);
    }

    public int getCount() {
        return this.f21343e.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m24175o(ViewGroup viewGroup, int i, Object obj) {
        VRecyclerView vRecyclerView = (LiveGiftStickerContentView) obj;
        viewGroup.removeView(vRecyclerView);
        this.f21344f.add((LiveGiftStickerContentView) vRecyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: p */
    public Object m24176p(ViewGroup viewGroup, int i) {
        uvj uvjVar = this.f21343e.get(i);
        ?? M23646c = vwb.J(this.f21344f) ? uvjVar.m23646c(viewGroup) : this.f21344f.removeFirst();
        M23646c.f4698c.setRecycledViewPool(this.f21346h);
        uvjVar.m23644a(M23646c, this.f21345g);
        M23646c.setTag(Integer.valueOf(i));
        viewGroup.addView(M23646c);
        return M23646c;
    }

    /* JADX INFO: renamed from: q */
    public List<uvj> m24177q() {
        return this.f21343e;
    }

    /* JADX INFO: renamed from: r */
    public void m24178r(List<uvj> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f21343e.clear();
        this.f21343e.addAll(list);
        notifyDataSetChanged();
    }
}
