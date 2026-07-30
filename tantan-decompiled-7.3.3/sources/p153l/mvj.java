package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class mvj extends lb2 {

    /* JADX INFO: renamed from: e */
    public final vlu<?> f138903e;

    /* JADX INFO: renamed from: f */
    public final List<hzj> f138904f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final LinkedList<LiveVChatGiftOuterContentView> f138905g = new LinkedList<>();

    public mvj(vlu<?> vluVar) {
        this.f138903e = vluVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m160267s(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief, jjs jjsVar2) {
        final BLiveGiftItem bLiveGiftItemM145122h = jjsVar2.m145122h();
        if (jjsVar.m145122h().f45225id != bLiveGiftItemM145122h.f45225id) {
            if (!jyb.m147479J(bLiveGivenGiftBrief.discounts) && bLiveGiftItemM145122h.isDiscountCard() && jyb.m147486Q(bLiveGivenGiftBrief.discounts, new qcj() { // from class: l.jvj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((BLiveDiscountItem) obj).f45204id);
                }
            }).contains(Integer.valueOf(bLiveGiftItemM145122h.f45225id))) {
                bLiveGiftItemM145122h.remain = ((BLiveDiscountItem) jyb.m147529r(bLiveGivenGiftBrief.discounts, new qcj() { // from class: l.lvj
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
        return this.f138904f.size();
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
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentView = (LiveVChatGiftOuterContentView) obj;
        viewGroup.removeView(liveVChatGiftOuterContentView);
        m0k.m156518g(liveVChatGiftOuterContentView);
        this.f138905g.add(liveVChatGiftOuterContentView);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        hzj hzjVar = this.f138904f.get(i);
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewRemoveFirst = jyb.m147479J(this.f138905g) ? (LiveVChatGiftOuterContentView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193765A1, viewGroup, false) : this.f138905g.removeFirst();
        liveVChatGiftOuterContentViewRemoveFirst.m70694s0(null, this.f138903e);
        liveVChatGiftOuterContentViewRemoveFirst.m70687E0(hzjVar);
        liveVChatGiftOuterContentViewRemoveFirst.setTag(Integer.valueOf(i));
        viewGroup.addView(liveVChatGiftOuterContentViewRemoveFirst);
        return liveVChatGiftOuterContentViewRemoveFirst;
    }

    /* JADX INFO: renamed from: u */
    public void m160269u(List<hzj> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f138904f.clear();
        this.f138904f.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: v */
    public void m160270v(final jjs jjsVar, final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f138904f.isEmpty()) {
            return;
        }
        jyb.m147537z(jyb.m147534w(this.f138904f, new qcj() { // from class: l.fvj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((hzj) obj).f112248a;
            }
        }), new y20() { // from class: l.hvj
            @Override // p153l.y20
            public final void call(Object obj) {
                mvj.m160267s(jjsVar, bLiveGivenGiftBrief, (jjs) obj);
            }
        });
    }
}
