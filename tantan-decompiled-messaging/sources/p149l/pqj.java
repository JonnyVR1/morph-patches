package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftInnerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pqj extends eb2 {

    /* JADX INFO: renamed from: f */
    public final uju<?> f150796f;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0583u f150798h;

    /* JADX INFO: renamed from: e */
    public final List<oqj> f150795e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<LiveVChatGiftInnerContentView> f150797g = new LinkedList<>();

    public pqj(uju<?> ujuVar) {
        this.f150796f = ujuVar;
        RecyclerView.C0583u c0583u = new RecyclerView.C0583u();
        this.f150798h = c0583u;
        c0583u.m3431m(0, 16);
    }

    @Override // p149l.eb2, p149l.w660
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        if (obj instanceof LiveVChatGiftInnerContentView) {
            ((LiveVChatGiftInnerContentView) obj).m69414H();
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f150795e.size();
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
        LiveVChatGiftInnerContentView liveVChatGiftInnerContentView = (LiveVChatGiftInnerContentView) obj;
        viewGroup.removeView(liveVChatGiftInnerContentView);
        liveVChatGiftInnerContentView.m69414H();
        this.f150797g.add(liveVChatGiftInnerContentView);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        oqj oqjVar = this.f150795e.get(i);
        LiveVChatGiftInnerContentView liveVChatGiftInnerContentViewM165461c = vwb.m200296J(this.f150797g) ? oqjVar.m165461c(viewGroup) : this.f150797g.removeFirst();
        liveVChatGiftInnerContentViewM165461c.f45176c.setRecycledViewPool(this.f150798h);
        oqjVar.m165459a(liveVChatGiftInnerContentViewM165461c, this.f150796f);
        liveVChatGiftInnerContentViewM165461c.setTag(Integer.valueOf(i));
        viewGroup.addView(liveVChatGiftInnerContentViewM165461c);
        return liveVChatGiftInnerContentViewM165461c;
    }

    /* JADX INFO: renamed from: q */
    public void m170924q(List<oqj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f150795e.clear();
        this.f150795e.addAll(list);
        notifyDataSetChanged();
    }
}
