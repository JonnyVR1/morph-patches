package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class xsj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final ahs<?> f194277e;

    /* JADX INFO: renamed from: f */
    public final List<rwj> f194278f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftOuterContentView> f194279g = new LinkedList<>();

    public xsj(ahs<?> ahsVar) {
        this.f194277e = ahsVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m210772s(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief, ihs ihsVar2) {
        final BLiveGiftItem bLiveGiftItemM136283h = ihsVar2.m136283h();
        if (ihsVar.m136283h().f44377id != bLiveGiftItemM136283h.f44377id) {
            if (!vwb.m200296J(bLiveGivenGiftBrief.discounts) && bLiveGiftItemM136283h.isDiscountCard() && vwb.m200303Q(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.ssj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((BLiveDiscountItem) obj).f44356id);
                }
            }).contains(Integer.valueOf(bLiveGiftItemM136283h.f44377id))) {
                bLiveGiftItemM136283h.remain = ((BLiveDiscountItem) vwb.m200346r(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.usj
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BLiveDiscountItem) obj).f44356id == bLiveGiftItemM136283h.f44377id);
                    }
                })).remain;
                ihsVar2.m136297v(true);
                return;
            }
            return;
        }
        if (bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.isScrapGift()) {
            bLiveGiftItemM136283h.remain = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM136283h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
            bLiveGiftItemM136283h.expiredTimeText = bLiveGivenGiftBrief.expiredTimeText;
        }
        bLiveGiftItemM136283h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        if (bLiveGivenGiftBrief.hasActionRule()) {
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        ihsVar2.m136297v(true);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f194278f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        GiftOuterContentView giftOuterContentView = (GiftOuterContentView) obj;
        viewGroup.removeView(giftOuterContentView);
        vxj.m200567g(giftOuterContentView);
        this.f194279g.add(giftOuterContentView);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        rwj rwjVar = this.f194278f.get(i);
        GiftOuterContentView giftOuterContentViewM181400g = vwb.m200296J(this.f194279g) ? rwjVar.m181400g(viewGroup) : this.f194279g.removeFirst();
        rwjVar.m181394a(giftOuterContentViewM181400g, this.f194277e);
        giftOuterContentViewM181400g.setTag(Integer.valueOf(i));
        viewGroup.addView(giftOuterContentViewM181400g);
        return giftOuterContentViewM181400g;
    }

    /* JADX INFO: renamed from: u */
    public rwj m210774u(int i) {
        if (i < this.f194278f.size()) {
            return this.f194278f.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m210775v(List<rwj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f194278f.clear();
        this.f194278f.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: w */
    public void m210776w(final ihs ihsVar, final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f194278f.isEmpty()) {
            return;
        }
        vwb.m200354z(vwb.m200351w(this.f194278f, new w9j() { // from class: l.osj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((rwj) obj).f161338a;
            }
        }), new e30() { // from class: l.qsj
            @Override // p149l.e30
            public final void call(Object obj) {
                xsj.m210772s(ihsVar, bLiveGivenGiftBrief, (ihs) obj);
            }
        });
    }
}
