package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.p1.mobile.putong.live.base.data.BLiveBottomContentTypeEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomWindow;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleHeader;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupRemind;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleRule;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleToast;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iis extends bk2<LongLinkLiveBottomPopup.LiveBottomPopup, BLiveGiftBubbleConfig> {
    public iis(p3g0<BLiveGiftBubbleConfig, BLiveGiftBubbleConfig> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveBottomPopup.LiveBottomPopup liveBottomPopup, String str) {
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m15199G(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m15204L(liveBottomContent));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m15200H(List list, LongLinkLiveBottomPopup.LiveBottomWindown liveBottomWindown) {
        list.add(m15205M(liveBottomWindown));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m15201I(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m15204L(liveBottomContent));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m15202J(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m15204L(liveBottomContent));
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public BLiveGiftBubbleConfig mo9251z(String str, LongLinkLiveBottomPopup.LiveBottomPopup liveBottomPopup) {
        BLiveGiftBubbleConfig bLiveGiftBubbleConfigNew_ = BLiveGiftBubbleConfig.new_();
        bLiveGiftBubbleConfigNew_.isCircle = false;
        bLiveGiftBubbleConfigNew_.isFromLongLink = true;
        bLiveGiftBubbleConfigNew_.bubbleText = liveBottomPopup.getButton().getText();
        bLiveGiftBubbleConfigNew_.iconUrl = liveBottomPopup.getIconUrl();
        bLiveGiftBubbleConfigNew_.title = liveBottomPopup.getTitle();
        bLiveGiftBubbleConfigNew_.content = liveBottomPopup.getContent();
        bLiveGiftBubbleConfigNew_.contentColor = liveBottomPopup.getContentColor();
        bLiveGiftBubbleConfigNew_.type = liveBottomPopup.getType();
        bLiveGiftBubbleConfigNew_.extra = liveBottomPopup.getExtra();
        bLiveGiftBubbleConfigNew_.schema = liveBottomPopup.getButton().getJumpSchema();
        bLiveGiftBubbleConfigNew_.styleType = BLiveBottomPopupStyleTypeEnum.get(liveBottomPopup.getStyleType().name());
        final ArrayList arrayList = new ArrayList();
        if (!vwb.J(liveBottomPopup.getDescriptionsList())) {
            vwb.z(liveBottomPopup.getDescriptionsList(), new e30() { // from class: l.eis
                public final void call(Object obj) {
                    this.f9812a.m15199G(arrayList, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
                }
            });
        }
        bLiveGiftBubbleConfigNew_.descriptions = arrayList;
        final ArrayList arrayList2 = new ArrayList();
        if (!vwb.J(liveBottomPopup.getWindowList())) {
            vwb.z(liveBottomPopup.getWindowList(), new e30() { // from class: l.fis
                public final void call(Object obj) {
                    this.f10417a.m15200H(arrayList2, (LongLinkLiveBottomPopup.LiveBottomWindown) obj);
                }
            });
        }
        bLiveGiftBubbleConfigNew_.window = arrayList2;
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButtonNew_ = BLiveGiftBubblePopupButton.new_();
        bLiveGiftBubblePopupButtonNew_.text = liveBottomPopup.getButton().getText();
        bLiveGiftBubblePopupButtonNew_.startColor = liveBottomPopup.getButton().getStartColor();
        bLiveGiftBubblePopupButtonNew_.endColor = liveBottomPopup.getButton().getEndColor();
        bLiveGiftBubblePopupButtonNew_.jumpSchema = liveBottomPopup.getButton().getJumpSchema();
        bLiveGiftBubblePopupButtonNew_.textColor = liveBottomPopup.getButton().getTextColor();
        bLiveGiftBubblePopupButtonNew_.jumpType = BLiveGiftBubblePopupButtonJumpType.get(liveBottomPopup.getButton().getJumpType().name());
        bLiveGiftBubblePopupButtonNew_.startAfterColor = liveBottomPopup.getButton().getStartAfterColor();
        bLiveGiftBubblePopupButtonNew_.endAfterColor = liveBottomPopup.getButton().getEndAfterColor();
        final ArrayList arrayList3 = new ArrayList();
        if (!vwb.J(liveBottomPopup.getButton().getRichTextList())) {
            vwb.z(liveBottomPopup.getButton().getRichTextList(), new e30() { // from class: l.gis
                public final void call(Object obj) {
                    this.f11457a.m15201I(arrayList3, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
                }
            });
        }
        bLiveGiftBubblePopupButtonNew_.richText = arrayList3;
        bLiveGiftBubbleConfigNew_.button = bLiveGiftBubblePopupButtonNew_;
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemindNew_ = BLiveGiftBubblePopupRemind.new_();
        bLiveGiftBubblePopupRemindNew_.click = liveBottomPopup.getRemind().getClick();
        bLiveGiftBubblePopupRemindNew_.show = liveBottomPopup.getRemind().getShow();
        bLiveGiftBubblePopupRemindNew_.textColor = liveBottomPopup.getRemind().getTextColor();
        bLiveGiftBubbleConfigNew_.remind = bLiveGiftBubblePopupRemindNew_;
        BLiveGiftBubbleRule bLiveGiftBubbleRuleNew_ = BLiveGiftBubbleRule.new_();
        bLiveGiftBubbleRuleNew_.displayDuration = liveBottomPopup.getRemainDuration();
        bLiveGiftBubbleConfigNew_.displayRules = bLiveGiftBubbleRuleNew_;
        BLiveGiftBubbleToast bLiveGiftBubbleToastNew_ = BLiveGiftBubbleToast.new_();
        bLiveGiftBubbleToastNew_.failText = liveBottomPopup.getToast().getFailText();
        bLiveGiftBubbleToastNew_.successText = liveBottomPopup.getToast().getSuccessText();
        bLiveGiftBubbleConfigNew_.toast = bLiveGiftBubbleToastNew_;
        bLiveGiftBubbleConfigNew_.showClose = liveBottomPopup.getShowClose();
        bLiveGiftBubbleConfigNew_.blackClose = liveBottomPopup.getBlankClose();
        bLiveGiftBubbleConfigNew_.backgroundColor = liveBottomPopup.getBackgroundColor();
        BLiveGiftBubbleHeader bLiveGiftBubbleHeaderNew_ = BLiveGiftBubbleHeader.new_();
        bLiveGiftBubbleHeaderNew_.position = BLiveGiftBubblePopupTitlePosition.get(liveBottomPopup.getHeader().getPosition().name());
        bLiveGiftBubbleHeaderNew_.textColor = liveBottomPopup.getHeader().getTextColor();
        bLiveGiftBubbleConfigNew_.header = bLiveGiftBubbleHeaderNew_;
        return bLiveGiftBubbleConfigNew_;
    }

    /* JADX INFO: renamed from: L */
    public final BLiveBottomContent m15204L(LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        BLiveBottomContent bLiveBottomContentNew_ = BLiveBottomContent.new_();
        bLiveBottomContentNew_.type = BLiveBottomContentTypeEnum.get(liveBottomContent.getType().name());
        bLiveBottomContentNew_.text = liveBottomContent.getText();
        bLiveBottomContentNew_.textColor = liveBottomContent.getTextColor();
        bLiveBottomContentNew_.url = liveBottomContent.getUrl();
        bLiveBottomContentNew_.countdownEndTime = liveBottomContent.getCountdownEndTime();
        bLiveBottomContentNew_.countdownCurrentTime = liveBottomContent.getCountdownCurrentTime();
        bLiveBottomContentNew_.countDownOverAction = BLiveBottomCountdownOverActionEnum.get(liveBottomContent.getCountDownOverAction().name());
        return bLiveBottomContentNew_;
    }

    /* JADX INFO: renamed from: M */
    public final BLiveBottomWindow m15205M(LongLinkLiveBottomPopup.LiveBottomWindown liveBottomWindown) {
        BLiveBottomWindow bLiveBottomWindowNew_ = BLiveBottomWindow.new_();
        bLiveBottomWindowNew_.picture = liveBottomWindown.getPicture();
        final ArrayList arrayList = new ArrayList();
        if (!vwb.J(liveBottomWindown.getTextList())) {
            vwb.z(liveBottomWindown.getTextList(), new e30() { // from class: l.his
                public final void call(Object obj) {
                    this.f12057a.m15202J(arrayList, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
                }
            });
        }
        bLiveBottomWindowNew_.text = arrayList;
        bLiveBottomWindowNew_.backgroundColor = liveBottomWindown.getBackgroundColor();
        return bLiveBottomWindowNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveBottomPopup.LiveBottomPopup> mo9244b() {
        return LongLinkLiveBottomPopup.LiveBottomPopup.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.liveBottomPopup";
    }
}
