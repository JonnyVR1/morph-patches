package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import com.p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l.e30;
import l.eb2;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xsj extends eb2 {

    /* JADX INFO: renamed from: e */
    public final ahs<?> f22443e;

    /* JADX INFO: renamed from: f */
    public final List<rwj> f22444f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<GiftOuterContentView> f22445g = new LinkedList<>();

    public xsj(ahs<?> ahsVar) {
        this.f22443e = ahsVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m26097s(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief, ihs ihsVar2) {
        final BLiveGiftItem bLiveGiftItemM15160h = ihsVar2.m15160h();
        if (ihsVar.m15160h().id != bLiveGiftItemM15160h.id) {
            if (!vwb.J(bLiveGivenGiftBrief.discounts) && bLiveGiftItemM15160h.isDiscountCard() && vwb.Q(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.ssj
                public final Object call(Object obj) {
                    return Integer.valueOf(((BLiveDiscountItem) obj).id);
                }
            }).contains(Integer.valueOf(bLiveGiftItemM15160h.id))) {
                bLiveGiftItemM15160h.remain = ((BLiveDiscountItem) vwb.r(bLiveGivenGiftBrief.discounts, new w9j() { // from class: l.usj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BLiveDiscountItem) obj).id == bLiveGiftItemM15160h.id);
                    }
                })).remain;
                ihsVar2.m15174v(true);
                return;
            }
            return;
        }
        if (bLiveGiftItemM15160h.isPacketGift() || bLiveGiftItemM15160h.isScrapGift()) {
            bLiveGiftItemM15160h.remain = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM15160h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM15160h.interactRules = bLiveGivenGiftBrief.interactRules;
            bLiveGiftItemM15160h.expiredTimeText = bLiveGivenGiftBrief.expiredTimeText;
        }
        bLiveGiftItemM15160h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        if (bLiveGivenGiftBrief.hasActionRule()) {
            bLiveGiftItemM15160h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        ihsVar2.m15174v(true);
    }

    public int getCount() {
        return this.f22444f.size();
    }

    public int getItemPosition(@NonNull @NotNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public void m26099o(ViewGroup viewGroup, int i, Object obj) {
        ?? r3 = (GiftOuterContentView) obj;
        viewGroup.removeView(r3);
        vxj.m24198g(r3);
        this.f22445g.add((GiftOuterContentView) r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: p */
    public Object m26100p(ViewGroup viewGroup, int i) {
        rwj rwjVar = this.f22444f.get(i);
        ?? M22144g = vwb.J(this.f22445g) ? rwjVar.m22144g(viewGroup) : this.f22445g.removeFirst();
        rwjVar.m22138a(M22144g, this.f22443e);
        M22144g.setTag(Integer.valueOf(i));
        viewGroup.addView(M22144g);
        return M22144g;
    }

    /* JADX INFO: renamed from: u */
    public rwj m26101u(int i) {
        if (i < this.f22444f.size()) {
            return this.f22444f.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m26102v(List<rwj> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f22444f.clear();
        this.f22444f.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: w */
    public void m26103w(final ihs ihsVar, final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f22444f.isEmpty()) {
            return;
        }
        vwb.z(vwb.w(this.f22444f, new w9j() { // from class: l.osj
            public final Object call(Object obj) {
                return ((rwj) obj).f18703a;
            }
        }), new e30() { // from class: l.qsj
            public final void call(Object obj) {
                xsj.m26097s(ihsVar, bLiveGivenGiftBrief, (ihs) obj);
            }
        });
    }
}
