package p149l;

import com.p046p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cat extends bk2<LongLinkLiveMessage.PkItemCardsDetail, BLivePKCardShowListWithBoth> {
    public cat(p3g0<BLivePKCardShowListWithBoth, BLivePKCardShowListWithBoth> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKCardShowListWithBoth mo94461z(String str, LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail) {
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBothNew_ = BLivePKCardShowListWithBoth.new_();
        bLivePKCardShowListWithBothNew_.BLiveUserItemCards = m105937D(pkItemCardsDetail.getUserItemCardsList());
        bLivePKCardShowListWithBothNew_.BLiveOtherUserItemCardsList = m105937D(pkItemCardsDetail.getOtherUserItemCardsList());
        return bLivePKCardShowListWithBothNew_;
    }

    /* JADX INFO: renamed from: D */
    public final List<BLivePKCardItem> m105937D(List<LongLinkLiveMessage.PkItemCard> list) {
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

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkItemCardsDetail> mo94398b() {
        return LongLinkLiveMessage.PkItemCardsDetail.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.pk.itemCards";
    }
}
