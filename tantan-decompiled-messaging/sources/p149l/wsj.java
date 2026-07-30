package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class wsj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final uju<?> f187943e;

    /* JADX INFO: renamed from: f */
    public final List<rwj> f187944f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<LiveVChatGiftOuterContentView> f187945g = new LinkedList<>();

    public wsj(uju<?> ujuVar) {
        this.f187943e = ujuVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m205516s(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief, ihs ihsVar2) {
        final BLiveGiftItem bLiveGiftItemM136283h = ihsVar2.m136283h();
        if (ihsVar.m136283h().f44377id != bLiveGiftItemM136283h.f44377id) {
            if (!vwb.m200296J(bLiveGivenGiftBrief.discounts) && bLiveGiftItemM136283h.isDiscountCard() && vwb.m200303Q(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.tsj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((BLiveDiscountItem) obj).f44356id);
                }
            }).contains(Integer.valueOf(bLiveGiftItemM136283h.f44377id))) {
                bLiveGiftItemM136283h.remain = ((BLiveDiscountItem) vwb.m200346r(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.vsj
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
        return this.f187944f.size();
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
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentView = (LiveVChatGiftOuterContentView) obj;
        viewGroup.removeView(liveVChatGiftOuterContentView);
        wxj.m206017g(liveVChatGiftOuterContentView);
        this.f187945g.add(liveVChatGiftOuterContentView);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        rwj rwjVar = this.f187944f.get(i);
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewRemoveFirst = vwb.m200296J(this.f187945g) ? (LiveVChatGiftOuterContentView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162651A1, viewGroup, false) : this.f187945g.removeFirst();
        liveVChatGiftOuterContentViewRemoveFirst.m69511s0(null, this.f187943e);
        liveVChatGiftOuterContentViewRemoveFirst.m69504E0(rwjVar);
        liveVChatGiftOuterContentViewRemoveFirst.setTag(Integer.valueOf(i));
        viewGroup.addView(liveVChatGiftOuterContentViewRemoveFirst);
        return liveVChatGiftOuterContentViewRemoveFirst;
    }

    /* JADX INFO: renamed from: u */
    public void m205518u(List<rwj> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f187944f.clear();
        this.f187944f.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: v */
    public void m205519v(final ihs ihsVar, final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f187944f.isEmpty()) {
            return;
        }
        vwb.m200354z(vwb.m200351w(this.f187944f, new w9j() { // from class: l.psj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((rwj) obj).f161338a;
            }
        }), new e30() { // from class: l.rsj
            @Override // p149l.e30
            public final void call(Object obj) {
                wsj.m205516s(ihsVar, bLiveGivenGiftBrief, (ihs) obj);
            }
        });
    }
}
