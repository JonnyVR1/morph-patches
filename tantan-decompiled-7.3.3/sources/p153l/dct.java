package p153l;

import com.p051p1.mobile.longlink.msg.livepkitem.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dct extends jk2<LongLinkLiveMessage.PkItemCardsDetail, BLivePKCardShowListWithBoth> {
    public dct(wbg0<BLivePKCardShowListWithBoth, BLivePKCardShowListWithBoth> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKCardShowListWithBoth mo95993z(String str, LongLinkLiveMessage.PkItemCardsDetail pkItemCardsDetail) {
        BLivePKCardShowListWithBoth bLivePKCardShowListWithBothNew_ = BLivePKCardShowListWithBoth.new_();
        bLivePKCardShowListWithBothNew_.BLiveUserItemCards = m115291D(pkItemCardsDetail.getUserItemCardsList());
        bLivePKCardShowListWithBothNew_.BLiveOtherUserItemCardsList = m115291D(pkItemCardsDetail.getOtherUserItemCardsList());
        return bLivePKCardShowListWithBothNew_;
    }

    /* JADX INFO: renamed from: D */
    public final List<BLivePKCardItem> m115291D(List<LongLinkLiveMessage.PkItemCard> list) {
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

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkItemCardsDetail> mo95510b() {
        return LongLinkLiveMessage.PkItemCardsDetail.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.itemCards";
    }
}
