package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftInnerContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ftj extends lb2 {

    /* JADX INFO: renamed from: f */
    public final vlu<?> f100751f;

    /* JADX INFO: renamed from: h */
    public final RecyclerView.C0585u f100753h;

    /* JADX INFO: renamed from: e */
    public final List<etj> f100750e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<LiveVChatGiftInnerContentView> f100752g = new LinkedList<>();

    public ftj(vlu<?> vluVar) {
        this.f100751f = vluVar;
        RecyclerView.C0585u c0585u = new RecyclerView.C0585u();
        this.f100753h = c0585u;
        c0585u.m3440m(0, 16);
    }

    @Override // p153l.lb2, p153l.cf60
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        if (obj instanceof LiveVChatGiftInnerContentView) {
            ((LiveVChatGiftInnerContentView) obj).m70597H();
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f100750e.size();
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
        LiveVChatGiftInnerContentView liveVChatGiftInnerContentView = (LiveVChatGiftInnerContentView) obj;
        viewGroup.removeView(liveVChatGiftInnerContentView);
        liveVChatGiftInnerContentView.m70597H();
        this.f100752g.add(liveVChatGiftInnerContentView);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        etj etjVar = this.f100750e.get(i);
        LiveVChatGiftInnerContentView liveVChatGiftInnerContentViewM122461c = jyb.m147479J(this.f100752g) ? etjVar.m122461c(viewGroup) : this.f100752g.removeFirst();
        liveVChatGiftInnerContentViewM122461c.f46024c.setRecycledViewPool(this.f100753h);
        etjVar.m122459a(liveVChatGiftInnerContentViewM122461c, this.f100751f);
        liveVChatGiftInnerContentViewM122461c.setTag(Integer.valueOf(i));
        viewGroup.addView(liveVChatGiftInnerContentViewM122461c);
        return liveVChatGiftInnerContentViewM122461c;
    }

    /* JADX INFO: renamed from: q */
    public void m127323q(List<etj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f100750e.clear();
        this.f100750e.addAll(list);
        notifyDataSetChanged();
    }
}
