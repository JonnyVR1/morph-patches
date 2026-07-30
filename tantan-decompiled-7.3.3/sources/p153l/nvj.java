package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class nvj extends lb2 {

    /* JADX INFO: renamed from: e */
    public final bjs<?> f143802e;

    /* JADX INFO: renamed from: f */
    public final List<hzj> f143803f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftOuterContentView> f143804g = new LinkedList<>();

    public nvj(bjs<?> bjsVar) {
        this.f143802e = bjsVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m164875s(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief, jjs jjsVar2) {
        final BLiveGiftItem bLiveGiftItemM145122h = jjsVar2.m145122h();
        if (jjsVar.m145122h().f45225id != bLiveGiftItemM145122h.f45225id) {
            if (!jyb.m147479J(bLiveGivenGiftBrief.discounts) && bLiveGiftItemM145122h.isDiscountCard() && jyb.m147486Q(bLiveGivenGiftBrief.discounts, new qcj() { // from class: l.ivj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((BLiveDiscountItem) obj).f45204id);
                }
            }).contains(Integer.valueOf(bLiveGiftItemM145122h.f45225id))) {
                bLiveGiftItemM145122h.remain = ((BLiveDiscountItem) jyb.m147529r(bLiveGivenGiftBrief.discounts, new qcj() { // from class: l.kvj
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BLiveDiscountItem) obj).f45204id == bLiveGiftItemM145122h.f45225id);
                    }
                })).remain;
                jjsVar2.m145136v(true);
                return;
            }
            return;
        }
        if (bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.isScrapGift()) {
            bLiveGiftItemM145122h.remain = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM145122h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
            bLiveGiftItemM145122h.expiredTimeText = bLiveGivenGiftBrief.expiredTimeText;
        }
        bLiveGiftItemM145122h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        if (bLiveGivenGiftBrief.hasActionRule()) {
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        jjsVar2.m145136v(true);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f143803f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        GiftOuterContentView giftOuterContentView = (GiftOuterContentView) obj;
        viewGroup.removeView(giftOuterContentView);
        l0k.m152353g(giftOuterContentView);
        this.f143804g.add(giftOuterContentView);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        hzj hzjVar = this.f143803f.get(i);
        GiftOuterContentView giftOuterContentViewM137899g = jyb.m147479J(this.f143804g) ? hzjVar.m137899g(viewGroup) : this.f143804g.removeFirst();
        hzjVar.m137893a(giftOuterContentViewM137899g, this.f143802e);
        giftOuterContentViewM137899g.setTag(Integer.valueOf(i));
        viewGroup.addView(giftOuterContentViewM137899g);
        return giftOuterContentViewM137899g;
    }

    /* JADX INFO: renamed from: u */
    public hzj m164877u(int i) {
        if (i < this.f143803f.size()) {
            return this.f143803f.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m164878v(List<hzj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f143803f.clear();
        this.f143803f.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: w */
    public void m164879w(final jjs jjsVar, final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f143803f.isEmpty()) {
            return;
        }
        jyb.m147537z(jyb.m147534w(this.f143803f, new qcj() { // from class: l.evj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((hzj) obj).f112248a;
            }
        }), new y20() { // from class: l.gvj
            @Override // p153l.y20
            public final void call(Object obj) {
                nvj.m164875s(jjsVar, bLiveGivenGiftBrief, (jjs) obj);
            }
        });
    }
}
