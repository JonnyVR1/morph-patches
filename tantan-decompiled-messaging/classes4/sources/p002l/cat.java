package p002l;

import com.p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import java.util.ArrayList;
import java.util.List;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cat extends bk2<LongLinkLiveMessage.PkItemCardsDetail, BLivePKCardShowListWithBoth> {
    public cat(p3g0<BLivePKCardShowListWithBoth, BLivePKCardShowListWithBoth> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKCardShowListWithBoth mo9251z(String str, LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail) {
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBothNew_ = BLivePKCardShowListWithBoth.new_();
        bLivePKCardShowListWithBothNew_.BLiveUserItemCards = m10921D(pkItemCardsDetail.getUserItemCardsList());
        bLivePKCardShowListWithBothNew_.BLiveOtherUserItemCardsList = m10921D(pkItemCardsDetail.getOtherUserItemCardsList());
        return bLivePKCardShowListWithBothNew_;
    }

    /* JADX INFO: renamed from: D */
    public final List<BLivePKCardItem> m10921D(List<LongLinkLiveMessage.PkItemCard> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BLivePKCardItem bLivePKCardItemNew_ = BLivePKCardItem.new_();
            bLivePKCardItemNew_.name = list.get(i).getName();
            bLivePKCardItemNew_.icon = list.get(i).getIcon();
            bLivePKCardItemNew_.startTs = list.get(i).getStartTs();
            bLivePKCardItemNew_.duration = list.get(i).getDuration();
            bLivePKCardItemNew_.type = list.get(i).getType();
            bLivePKCardItemNew_.text = list.get(i).getText();
            bLivePKCardItemNew_.showCountdown = !list.get(i).getIsResult();
            arrayList.add(bLivePKCardItemNew_);
        }
        return arrayList;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkItemCardsDetail> mo9244b() {
        return LongLinkLiveMessage.PkItemCardsDetail.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.itemCards";
    }
}
