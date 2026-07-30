package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomContentTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomCountdownOverActionEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomWindow;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleHeader;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupRemind;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleRule;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleToast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jks extends jk2<LongLinkLiveBottomPopup.LiveBottomPopup, BLiveGiftBubbleConfig> {
    public jks(wbg0<BLiveGiftBubbleConfig, BLiveGiftBubbleConfig> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveBottomPopup.LiveBottomPopup liveBottomPopup, String str) {
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m145897G(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m145902L(liveBottomContent));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m145898H(List list, LongLinkLiveBottomPopup.LiveBottomWindown liveBottomWindown) {
        list.add(m145903M(liveBottomWindown));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m145899I(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m145902L(liveBottomContent));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m145900J(List list, LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
        list.add(m145902L(liveBottomContent));
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public BLiveGiftBubbleConfig mo95993z(String str, LongLinkLiveBottomPopup.LiveBottomPopup liveBottomPopup) {
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
        if (!jyb.m147479J(liveBottomPopup.getDescriptionsList())) {
            jyb.m147537z(liveBottomPopup.getDescriptionsList(), new y20() { // from class: l.fks
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99558a.m145897G(arrayList, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
                }
            });
        }
        bLiveGiftBubbleConfigNew_.descriptions = arrayList;
        final ArrayList arrayList2 = new ArrayList();
        if (!jyb.m147479J(liveBottomPopup.getWindowList())) {
            jyb.m147537z(liveBottomPopup.getWindowList(), new y20() { // from class: l.gks
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104764a.m145898H(arrayList2, (LongLinkLiveBottomPopup.LiveBottomWindown) obj);
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
        if (!jyb.m147479J(liveBottomPopup.getButton().getRichTextList())) {
            jyb.m147537z(liveBottomPopup.getButton().getRichTextList(), new y20() { // from class: l.hks
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110451a.m145899I(arrayList3, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
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
    public final BLiveBottomContent m145902L(LongLinkLiveBottomPopup.LiveBottomContent liveBottomContent) {
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
    public final BLiveBottomWindow m145903M(LongLinkLiveBottomPopup.LiveBottomWindown liveBottomWindown) {
        BLiveBottomWindow bLiveBottomWindowNew_ = BLiveBottomWindow.new_();
        bLiveBottomWindowNew_.picture = liveBottomWindown.getPicture();
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(liveBottomWindown.getTextList())) {
            jyb.m147537z(liveBottomWindown.getTextList(), new y20() { // from class: l.iks
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115446a.m145900J(arrayList, (LongLinkLiveBottomPopup.LiveBottomContent) obj);
                }
            });
        }
        bLiveBottomWindowNew_.text = arrayList;
        bLiveBottomWindowNew_.backgroundColor = liveBottomWindown.getBackgroundColor();
        return bLiveBottomWindowNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveBottomPopup.LiveBottomPopup> mo95510b() {
        return LongLinkLiveBottomPopup.LiveBottomPopup.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.liveBottomPopup";
    }
}
