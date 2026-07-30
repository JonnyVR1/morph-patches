package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.longlink.msg.liveright.liveRight;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveChatShadingConfig;
import com.p1.mobile.putong.live.base.data.BLiveChatShadingContentConfig;
import com.p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p1.mobile.putong.live.base.data.BLiveOperationActionAfterClick;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawer;
import com.p1.mobile.putong.live.base.data.BLiveOperationLoadingType;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p1.mobile.putong.live.base.data.BLiveOperationTextDrawerConfig;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveUserMedal;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSing;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dfe0;
import l.e30;
import l.rxn0;
import l.tzo0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e5t {
    /* JADX INFO: renamed from: A */
    public static LiveMessage.ExtInfo m12194A(Template.TemplateData templateData, BLiveTemplate bLiveTemplate) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        m12201f(templateData, bLiveTemplate, extInfo);
        m12202g(templateData, bLiveTemplate, extInfo);
        m12204i(templateData, bLiveTemplate, extInfo);
        m12203h(templateData, bLiveTemplate, extInfo);
        return extInfo;
    }

    /* JADX INFO: renamed from: B */
    public static int m12195B(BLiveTemplate bLiveTemplate, final String str) {
        BLiveTemplateItem bLiveTemplateItem;
        int i;
        if (bLiveTemplate == null || (bLiveTemplateItem = (BLiveTemplateItem) vwb.r(bLiveTemplate.format, new w9j() { // from class: l.b5t
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveTemplateItem) obj).type));
            }
        })) == null || (i = bLiveTemplateItem.index) <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveDynamicEffectExtend m12196a(LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
        BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
        bLiveDynamicEffectExtendNew_.key = dynamicEffectExtend.getKey();
        bLiveDynamicEffectExtendNew_.value = dynamicEffectExtend.getValueList();
        return bLiveDynamicEffectExtendNew_;
    }

    /* JADX INFO: renamed from: f */
    public static void m12201f(Template.TemplateData templateData, BLiveTemplate bLiveTemplate, LiveMessage.ExtInfo extInfo) {
        int iM12195B = m12195B(bLiveTemplate, "atUserId");
        if (iM12195B != -1) {
            BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
            bLiveAtUserInfoNew_.userId = templateData.getFields(iM12195B);
            extInfo.atUserInfo = bLiveAtUserInfoNew_;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12202g(Template.TemplateData templateData, BLiveTemplate bLiveTemplate, LiveMessage.ExtInfo extInfo) {
        int iM12195B = m12195B(bLiveTemplate, "buttonUserId");
        if (iM12195B == -1 || templateData.getFieldsCount() <= iM12195B) {
            return;
        }
        BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
        bLiveAtUserInfoNew_.userId = templateData.getFields(iM12195B);
        extInfo.buttonUserInfo = bLiveAtUserInfoNew_;
    }

    /* JADX INFO: renamed from: h */
    public static void m12203h(Template.TemplateData templateData, BLiveTemplate bLiveTemplate, LiveMessage.ExtInfo extInfo) {
        int iM12195B = m12195B(bLiveTemplate, "buttonSchema");
        if (iM12195B != -1) {
            extInfo.buttonSchema = templateData.getFields(iM12195B);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12204i(Template.TemplateData templateData, BLiveTemplate bLiveTemplate, LiveMessage.ExtInfo extInfo) {
        int iM12195B = m12195B(bLiveTemplate, "profileUserId");
        if (iM12195B != -1) {
            BLiveAtUserInfo bLiveAtUserInfoNew_ = BLiveAtUserInfo.new_();
            bLiveAtUserInfoNew_.userId = templateData.getFields(iM12195B);
            extInfo.atUserInfo = bLiveAtUserInfoNew_;
        }
    }

    /* JADX INFO: renamed from: j */
    public static LongLinkChatMessage.LiveBackgroundColorConfig m12205j(BLiveChatShadingConfig bLiveChatShadingConfig, boolean z) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        try {
            BLiveChatShadingContentConfig bLiveChatShadingContentConfig = z ? bLiveChatShadingConfig.backgroundColorConfig : bLiveChatShadingConfig.borderColorConfig;
            for (int i = 0; i < bLiveChatShadingContentConfig.colors.size(); i++) {
                builderNewBuilder.addColors((String) bLiveChatShadingContentConfig.colors.get(i));
            }
            builderNewBuilder.setGradientDirection(bLiveChatShadingContentConfig.gradientDirection);
            builderNewBuilder.setTransparency(bLiveChatShadingContentConfig.transparency);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: k */
    public static LongLinkChatMessage.LiveChatShadingConfig m12206k(BLiveChatShadingConfig bLiveChatShadingConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        if (bLiveChatShadingConfig.hasChatShadingConfig()) {
            builderNewBuilder.setBackgroundColorConfig(m12205j(bLiveChatShadingConfig, true));
        }
        if (bLiveChatShadingConfig.hasBorderConfig()) {
            builderNewBuilder.setBorderColorConfig(m12205j(bLiveChatShadingConfig, false));
        }
        if (bLiveChatShadingConfig.hasCornerConfig()) {
            builderNewBuilder.setCornerConfig(m12207l(bLiveChatShadingConfig));
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: l */
    public static LongLinkChatMessage.LiveCornerConfig m12207l(BLiveChatShadingConfig bLiveChatShadingConfig) {
        LongLinkChatMessage.LiveCornerConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveCornerConfig.newBuilder();
        builderNewBuilder.setPictureUrl(bLiveChatShadingConfig.cornerConfig.pictureUrl);
        builderNewBuilder.setPosition(bLiveChatShadingConfig.cornerConfig.position);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: m */
    public static LongLinkChatMessage.MedalMessage m12208m(BLiveChatMessage bLiveChatMessage) {
        List<LongLinkChatMessage.Medal> listM12221z = m12221z(bLiveChatMessage.medal.singleRoomMedals);
        return LongLinkChatMessage.MedalMessage.newBuilder().setVersion(bLiveChatMessage.medal.version).addAllIds(bLiveChatMessage.medal.getAllId()).addAllSingleRoomMedals(listM12221z).addAllMultiRoomMedals(m12221z(bLiveChatMessage.medal.multiRoomMedals)).build();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public static BLiveVoiceSingTogether m12209n(voiceSingTogether.VoiceSing voiceSing) {
        BLiveVoiceSingTogether bLiveVoiceSingTogetherNew_ = BLiveVoiceSingTogether.new_();
        bLiveVoiceSingTogetherNew_.id = voiceSing.getId();
        if (voiceSing.getCurrentSing() != null) {
            bLiveVoiceSingTogetherNew_.currentSing = m12211p(voiceSing.getCurrentSing());
        }
        if (voiceSing.getNextSing() != null) {
            BLiveVoiceSing bLiveVoiceSingNew_ = BLiveVoiceSing.new_();
            voiceSingTogether.NextSing nextSing = voiceSing.getNextSing();
            bLiveVoiceSingNew_.countDownSeconds = nextSing.getCountDownSeconds();
            bLiveVoiceSingNew_.remainSeconds = nextSing.getRemainSeconds();
            bLiveVoiceSingNew_.accompany = nextSing.getAccompany();
            bLiveVoiceSingNew_.mask = e1t.m12109c(nextSing.getMask());
            bLiveVoiceSingNew_.userId = nextSing.getUserId();
            bLiveVoiceSingNew_.title = nextSing.getTitle();
            bLiveVoiceSingTogetherNew_.nextSing = bLiveVoiceSingNew_;
        }
        bLiveVoiceSingTogetherNew_.status = BLiveVoiceSingTogehterState.get(voiceSing.getStatus());
        bLiveVoiceSingTogetherNew_.toast = voiceSing.getToast();
        return bLiveVoiceSingTogetherNew_;
    }

    /* JADX INFO: renamed from: o */
    public static BLiveCallEffectConfig m12210o(liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
        if (!acquireUserLiveRightMsg.getUserLiveRight().getAttribute().hasCallEffectConfig()) {
            return null;
        }
        liveRight.CallEffectConfig callEffectConfig = acquireUserLiveRightMsg.getUserLiveRight().getAttribute().getCallEffectConfig();
        BLiveCallEffectConfig bLiveCallEffectConfigNew_ = BLiveCallEffectConfig.new_();
        bLiveCallEffectConfigNew_.defaultIcon = callEffectConfig.getDefaultIcon();
        bLiveCallEffectConfigNew_.muteIcon = callEffectConfig.getMuteIcon();
        bLiveCallEffectConfigNew_.verticalBg = callEffectConfig.getVerticalBg();
        bLiveCallEffectConfigNew_.horizontalBg = callEffectConfig.getHorizontalBg();
        bLiveCallEffectConfigNew_.verticalVoicingUrl = callEffectConfig.getVerticalVoicingUrl();
        bLiveCallEffectConfigNew_.horizontalVoicingUrl = callEffectConfig.getHorizontalVoicingUrl();
        bLiveCallEffectConfigNew_.circleVoicingUrl = callEffectConfig.getCircleVoicingUrl();
        return bLiveCallEffectConfigNew_;
    }

    /* JADX INFO: renamed from: p */
    public static BLiveVoiceSing m12211p(voiceSingTogether.CurrentSing currentSing) {
        BLiveVoiceSing bLiveVoiceSingNew_ = BLiveVoiceSing.new_();
        bLiveVoiceSingNew_.userId = currentSing.getUserId();
        bLiveVoiceSingNew_.mask = rxn0.a(currentSing.getMask());
        bLiveVoiceSingNew_.accompany = currentSing.getAccompany();
        bLiveVoiceSingNew_.orderId = String.valueOf(currentSing.getOrderId());
        bLiveVoiceSingNew_.title = currentSing.getTitle();
        bLiveVoiceSingNew_.progressMilliseconds = String.valueOf(currentSing.getProgressMilliseconds());
        bLiveVoiceSingNew_.cover = currentSing.getCover();
        bLiveVoiceSingNew_.lyricType = currentSing.getLyricType();
        bLiveVoiceSingNew_.lyricUrl = currentSing.getLyricUrl();
        bLiveVoiceSingNew_.songCode = currentSing.getSongCode();
        return bLiveVoiceSingNew_;
    }

    /* JADX INFO: renamed from: q */
    public static tzo0 m12212q(liveRight.AcquireUserLiveRightMsg acquireUserLiveRightMsg) {
        liveRight.UserLiveRight userLiveRight = acquireUserLiveRightMsg.getUserLiveRight();
        String userId = userLiveRight.getUserId();
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        bLiveAvatarFrameConfigNew_.staticUrl = userLiveRight.getAttribute().getAvatarConfig().getFrameConfig().getStaticUrl();
        bLiveAvatarFrameConfigNew_.dynamicUrl = userLiveRight.getAttribute().getAvatarConfig().getFrameConfig().getDynamicUrl();
        tzo0 tzo0Var = new tzo0(acquireUserLiveRightMsg.getAction() == liveRight.AcquireUserLiveRightMsg.AcquireUserLiveRightAction.unequip ? 1 : 0, userId, bLiveAvatarFrameConfigNew_);
        tzo0Var.b(m12210o(acquireUserLiveRightMsg));
        tzo0Var.e = userLiveRight.getRightType().name();
        return tzo0Var;
    }

    /* JADX INFO: renamed from: r */
    public static BLiveGivenGiftBrief m12213r(LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg, String str) {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = new BLiveGivenGiftBrief();
        LongLinkGiftMessage.GiftItemBrief giftItemBrief = liveGiftReceivedMsg.getGiftItemBrief();
        bLiveGivenGiftBrief.userName = giftItemBrief.getUserName();
        bLiveGivenGiftBrief.fpUrl = giftItemBrief.getUserUrl();
        bLiveGivenGiftBrief.id = (int) giftItemBrief.getId();
        bLiveGivenGiftBrief.combos = (int) giftItemBrief.getCombos();
        bLiveGivenGiftBrief.num = (int) giftItemBrief.getGiftNum();
        bLiveGivenGiftBrief.comboId = giftItemBrief.getComboId();
        bLiveGivenGiftBrief.stickFacePositionType = (int) giftItemBrief.getStickFacePositionType();
        bLiveGivenGiftBrief.giftSource = (int) giftItemBrief.getGiftSource();
        bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId = (int) giftItemBrief.getLuckyPrizeGiftInfoItemId();
        bLiveGivenGiftBrief.lotteryGiftId = (int) giftItemBrief.getLotteryGiftId();
        if (liveGiftReceivedMsg.hasMultiCall()) {
            bLiveGivenGiftBrief.briefType = "extra_type_multi_call";
            BLiveGiftMultiCall bLiveGiftMultiCallNew_ = BLiveGiftMultiCall.new_();
            bLiveGiftMultiCallNew_.callId = liveGiftReceivedMsg.getMultiCall().getCallId();
            bLiveGiftMultiCallNew_.receiveGiftRole.position = liveGiftReceivedMsg.getMultiCall().getReceiveGiftRole().getPosition();
            bLiveGiftMultiCallNew_.receiveGiftRole.name = liveGiftReceivedMsg.getMultiCall().getReceiveGiftRole().getName();
            bLiveGivenGiftBrief.multiCall = bLiveGiftMultiCallNew_;
        } else {
            bLiveGivenGiftBrief.briefType = TextUtils.isEmpty(liveGiftReceivedMsg.getAnchorUserName()) ? "extra_type_normal" : "extra_type_lian_mai";
        }
        bLiveGivenGiftBrief.sendGiftExtraInfo = new dfe0(liveGiftReceivedMsg.getUserId(), liveGiftReceivedMsg.getAnchorId(), liveGiftReceivedMsg.getAnchorUserName(), str);
        LongLinkGiftMessage.LiveGiftExtraInfo extraInfo = giftItemBrief.getExtraInfo();
        LongLinkGiftMessage.LiveGiftDrawInfo drawInfo = extraInfo.getDrawInfo();
        List<LongLinkGiftMessage.LiveCoordinate> coordinatesList = drawInfo.getCoordinatesList();
        if (!vwb.J(coordinatesList)) {
            BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = new BLiveGiftExtraDrawInfo();
            bLiveGiftExtraDrawInfo.width = (int) drawInfo.getWidth();
            bLiveGiftExtraDrawInfo.length = (int) drawInfo.getLength();
            bLiveGiftExtraDrawInfo.coordinates = new ArrayList();
            for (LongLinkGiftMessage.LiveCoordinate liveCoordinate : coordinatesList) {
                BLivePosition bLivePosition = new BLivePosition();
                bLivePosition.x = (int) liveCoordinate.getX();
                bLivePosition.y = (int) liveCoordinate.getY();
                bLiveGiftExtraDrawInfo.coordinates.add(bLivePosition);
            }
            bLiveGivenGiftBrief.drawParam = bLiveGiftExtraDrawInfo;
        }
        bLiveGivenGiftBrief.hasVoiceMode = extraInfo.getMaskMode();
        bLiveGivenGiftBrief.liveUserMask = e1t.m12108b(extraInfo.getUserMask());
        List<LongLinkGiftMessage.VideoEffectExtra> arrayList = vwb.J(giftItemBrief.getExtraInfo().getVideoEffectExtrasList()) ? new ArrayList() : giftItemBrief.getExtraInfo().getVideoEffectExtrasList();
        ArrayList arrayList2 = new ArrayList();
        for (LongLinkGiftMessage.VideoEffectExtra videoEffectExtra : arrayList) {
            arrayList2.add(new BLiveSpecialEffectResources(videoEffectExtra.getId(), (int) videoEffectExtra.getType(), videoEffectExtra.getValue()));
        }
        bLiveGivenGiftBrief.videoEffectExtras = arrayList2;
        bLiveGivenGiftBrief.effectExt = extraInfo.getEffectExt();
        bLiveGivenGiftBrief.isGear = giftItemBrief.getIsGear();
        bLiveGivenGiftBrief.threshold = giftItemBrief.getThreshold();
        bLiveGivenGiftBrief.step = giftItemBrief.getStep();
        bLiveGivenGiftBrief.isNamed = giftItemBrief.getIsNamed();
        if (giftItemBrief.getTray() != null) {
            BLiveGivenGiftBriefTray bLiveGivenGiftBriefTrayNew_ = BLiveGivenGiftBriefTray.new_();
            bLiveGivenGiftBriefTrayNew_.background = giftItemBrief.getTray().getBackground();
            bLiveGivenGiftBriefTrayNew_.svg = giftItemBrief.getTray().getSvg();
            bLiveGivenGiftBrief.tray = bLiveGivenGiftBriefTrayNew_;
        }
        if (liveGiftReceivedMsg.getVideoChat() != null) {
            bLiveGivenGiftBrief.videoChatId = liveGiftReceivedMsg.getVideoChat().getChatId();
        }
        bLiveGivenGiftBrief.avatarTag = liveGiftReceivedMsg.getGiftItemBrief().getAvatarTag();
        bLiveGivenGiftBrief.giftBottomTag = liveGiftReceivedMsg.getGiftItemBrief().getGiftBottomTag();
        if (extraInfo.hasPreviewMask() && extraInfo.getPreviewMask().isInitialized()) {
            bLiveGivenGiftBrief.previewUserMask = e1t.m12108b(extraInfo.getPreviewMask());
        }
        if (extraInfo.hasSenderShowMask() && extraInfo.getSenderShowMask().isInitialized()) {
            bLiveGivenGiftBrief.senderShowMask = e1t.m12108b(extraInfo.getSenderShowMask());
        }
        if (extraInfo.hasReceiverShowMask() && extraInfo.getReceiverShowMask().isInitialized()) {
            bLiveGivenGiftBrief.receiverShowMask = e1t.m12108b(extraInfo.getReceiverShowMask());
        }
        return bLiveGivenGiftBrief;
    }

    /* JADX INFO: renamed from: s */
    public static BLiveEnterRoom m12214s(LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect) {
        BLiveEnterRoom bLiveEnterRoomNew_ = BLiveEnterRoom.new_();
        bLiveEnterRoomNew_.roomId = userEnterRoomEffect.getRoomId();
        bLiveEnterRoomNew_.uid = userEnterRoomEffect.getUserId();
        bLiveEnterRoomNew_.userName = userEnterRoomEffect.getUserName();
        bLiveEnterRoomNew_.userNameColor = userEnterRoomEffect.getUserNameColor();
        bLiveEnterRoomNew_.userNameGradientColors = userEnterRoomEffect.getUserNameGradientColorsList();
        bLiveEnterRoomNew_.userImage = userEnterRoomEffect.getUserImage();
        bLiveEnterRoomNew_.userGrade = userEnterRoomEffect.getHierarchys().getWealthHierarchy().getGrade();
        bLiveEnterRoomNew_.userGradeIcon = userEnterRoomEffect.getHierarchys().getWealthHierarchy().getIcon();
        bLiveEnterRoomNew_.contentText = m12218w(userEnterRoomEffect.getText(), userEnterRoomEffect.getInternalText());
        bLiveEnterRoomNew_.contentTextColor = userEnterRoomEffect.getTextColor();
        bLiveEnterRoomNew_.bgUrl = userEnterRoomEffect.getBackgroundUrl();
        bLiveEnterRoomNew_.floatBgUrl = userEnterRoomEffect.getFloatingUrl();
        bLiveEnterRoomNew_.resourceId = userEnterRoomEffect.getResourceId();
        bLiveEnterRoomNew_.showDuration = userEnterRoomEffect.getShowDuration();
        bLiveEnterRoomNew_.isWealthHierarchy = userEnterRoomEffect.getIsWealthHierarchy();
        bLiveEnterRoomNew_.backgroundGradients = userEnterRoomEffect.getBackgroundGradientsList();
        bLiveEnterRoomNew_.backgroundGradientDirection = userEnterRoomEffect.getBackgroundGradientDirectionValue();
        bLiveEnterRoomNew_.avatarGradients = userEnterRoomEffect.getAvatarGradientsList();
        bLiveEnterRoomNew_.avatarGradientDirection = userEnterRoomEffect.getAvatarGradientDirectionValue();
        bLiveEnterRoomNew_.enterRoomEffectId = userEnterRoomEffect.getEffectId();
        bLiveEnterRoomNew_.effectId = userEnterRoomEffect.getEffectId();
        bLiveEnterRoomNew_.backgroundUrlEndMargin = userEnterRoomEffect.getBackgroundUrlEndMargin();
        bLiveEnterRoomNew_.fixedBackgroundUrl = userEnterRoomEffect.getFixedBackgroundUrl();
        bLiveEnterRoomNew_.animationSizeType = userEnterRoomEffect.getAnimationSizeType();
        bLiveEnterRoomNew_.enterVersion = userEnterRoomEffect.getEnterVersion();
        bLiveEnterRoomNew_.newFloatingUrl = userEnterRoomEffect.getNewFloatingUrl();
        bLiveEnterRoomNew_.newResourceId = userEnterRoomEffect.getNewResourceId();
        List<LongLinkEnterRoomMessage.VideoEffectExtra> arrayList = vwb.J(userEnterRoomEffect.getVideoEffectExtrasList()) ? new ArrayList() : userEnterRoomEffect.getVideoEffectExtrasList();
        ArrayList arrayList2 = new ArrayList();
        for (LongLinkEnterRoomMessage.VideoEffectExtra videoEffectExtra : arrayList) {
            arrayList2.add(new BLiveSpecialEffectResources(videoEffectExtra.getId(), (int) videoEffectExtra.getType(), videoEffectExtra.getValue()));
        }
        bLiveEnterRoomNew_.videoEffectExtras = arrayList2;
        bLiveEnterRoomNew_.dynamicEffectExtends = vwb.Q(userEnterRoomEffect.getDynamicEffectExtendsList(), new w9j() { // from class: l.c5t
            public final Object call(Object obj) {
                return e5t.m12196a((LongLinkGiftMessage.DynamicEffectExtend) obj);
            }
        });
        return bLiveEnterRoomNew_;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: t */
    public static BLiveOperationItem m12215t(LongLinkSocketMessage.OperationPopupNotice operationPopupNotice) {
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = operationPopupNotice.getOperationType();
        BLiveOperationItemPopUp bLiveOperationItemPopUpNew_ = BLiveOperationItemPopUp.new_();
        bLiveOperationItemPopUpNew_.popupType = BLiveOperationPopupType.get(operationPopupNotice.getPopupType().name());
        if (NullChecker.a(operationPopupNotice.getTextDrawer())) {
            BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawerNew_ = BLiveOperationItemPopUpTextDrawer.new_();
            bLiveOperationItemPopUpTextDrawerNew_.iconUrl = operationPopupNotice.getTextDrawer().getIconUrl();
            bLiveOperationItemPopUpTextDrawerNew_.content.templateFields = operationPopupNotice.getTextDrawer().getContent().getTemplateFieldsList();
            bLiveOperationItemPopUpTextDrawerNew_.content.templateId = (int) operationPopupNotice.getTextDrawer().getContent().getTemplateId();
            bLiveOperationItemPopUpTextDrawerNew_.content.hierarchy.userHierarchy = (int) operationPopupNotice.getTextDrawer().getContent().getHierarchy().getUserHierarchy();
            BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfigNew_ = BLiveOperationTextDrawerConfig.new_();
            bLiveOperationTextDrawerConfigNew_.startColor = operationPopupNotice.getTextDrawer().getShading().getStartColor();
            bLiveOperationTextDrawerConfigNew_.endColor = operationPopupNotice.getTextDrawer().getShading().getEndColor();
            bLiveOperationTextDrawerConfigNew_.imageUrl = operationPopupNotice.getTextDrawer().getShading().getImageUrl();
            bLiveOperationTextDrawerConfigNew_.transparency = (int) operationPopupNotice.getTextDrawer().getShading().getTransparency();
            bLiveOperationTextDrawerConfigNew_.loadingType = BLiveOperationLoadingType.get(operationPopupNotice.getTextDrawer().getShading().getShadingType());
            bLiveOperationItemPopUpTextDrawerNew_.shading = bLiveOperationTextDrawerConfigNew_;
            bLiveOperationItemPopUpTextDrawerNew_.jumpScheme = operationPopupNotice.getTextDrawer().getJumpScheme();
            bLiveOperationItemPopUpTextDrawerNew_.actionAfterClick = BLiveOperationActionAfterClick.get(operationPopupNotice.getTextDrawer().getActionAfterClick());
            bLiveOperationItemPopUpNew_.textDrawer = bLiveOperationItemPopUpTextDrawerNew_;
        }
        if (NullChecker.a(operationPopupNotice.getH5PopUp())) {
            BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawerNew_ = BLiveOperationItemPopUpDrawer.new_();
            bLiveOperationItemPopUpDrawerNew_.jumpScheme = operationPopupNotice.getH5PopUp().getJumpScheme();
            bLiveOperationItemPopUpNew_.h5PopUp = bLiveOperationItemPopUpDrawerNew_;
        }
        if (NullChecker.a(operationPopupNotice.getDrawer())) {
            BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawerNew_2 = BLiveOperationItemPopUpDrawer.new_();
            bLiveOperationItemPopUpDrawerNew_2.h5Url = operationPopupNotice.getDrawer().getH5Url();
            bLiveOperationItemPopUpDrawerNew_2.height = (float) operationPopupNotice.getDrawer().getHeight();
            bLiveOperationItemPopUpDrawerNew_2.width = (float) operationPopupNotice.getDrawer().getWidth();
            bLiveOperationItemPopUpDrawerNew_2.closeButtonUrl = operationPopupNotice.getDrawer().getCloseButtonUrl();
            bLiveOperationItemPopUpDrawerNew_2.fadingSeconds = (int) operationPopupNotice.getDrawer().getFadingSeconds();
            if (NullChecker.a(operationPopupNotice.getDrawer().getLoading())) {
                BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfigNew_2 = BLiveOperationTextDrawerConfig.new_();
                bLiveOperationTextDrawerConfigNew_2.startColor = operationPopupNotice.getDrawer().getLoading().getStartColor();
                bLiveOperationTextDrawerConfigNew_2.endColor = operationPopupNotice.getDrawer().getLoading().getEndColor();
                bLiveOperationTextDrawerConfigNew_2.transparency = (int) operationPopupNotice.getDrawer().getLoading().getTransparency();
                bLiveOperationTextDrawerConfigNew_2.imageUrl = operationPopupNotice.getDrawer().getLoading().getImageUrl();
                bLiveOperationTextDrawerConfigNew_2.loadingType = BLiveOperationLoadingType.get(operationPopupNotice.getDrawer().getLoading().getLoadingType());
                bLiveOperationItemPopUpDrawerNew_2.loading = bLiveOperationTextDrawerConfigNew_2;
            }
            bLiveOperationItemPopUpNew_.h5Drawer = bLiveOperationItemPopUpDrawerNew_2;
        }
        bLiveOperationItemNew_.popup = bLiveOperationItemPopUpNew_;
        return bLiveOperationItemNew_;
    }

    /* JADX INFO: renamed from: u */
    public static BLiveUserUpgrade m12216u(LongLinkLiveUserLevel.UserHierarchyGrade userHierarchyGrade) {
        BLiveUserUpgrade bLiveUserUpgrade = new BLiveUserUpgrade();
        bLiveUserUpgrade.uid = userHierarchyGrade.getUserId();
        bLiveUserUpgrade.userName = userHierarchyGrade.getUserName();
        bLiveUserUpgrade.avatarUrl = userHierarchyGrade.getUserImageUrl();
        bLiveUserUpgrade.grade = userHierarchyGrade.getGrade();
        bLiveUserUpgrade.superGrade = userHierarchyGrade.getSuperGrade();
        return bLiveUserUpgrade;
    }

    /* JADX INFO: renamed from: v */
    public static LiveUserInfo m12217v(LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        LongLinkChatMessage.LiveChatMessageExtInfo extInfo = liveChatMessage.getExtInfo();
        if (extInfo == null) {
            return new LiveUserInfo(liveChatMessage.getUserId(), liveChatMessage.getUsername());
        }
        if (extInfo.getUserMask() == null) {
            return new LiveUserInfo(liveChatMessage.getUserId(), liveChatMessage.getUsername(), extInfo.getImageUrl());
        }
        LiveUserInfo liveUserInfo = new LiveUserInfo(liveChatMessage.getUserId(), liveChatMessage.getUsername(), rxn0.a(extInfo.getUserMask()));
        liveUserInfo.isMaskMode = extInfo.getMaskMode();
        return liveUserInfo;
    }

    /* JADX INFO: renamed from: w */
    public static String m12218w(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : mmj.m18043D(str2);
    }

    /* JADX INFO: renamed from: x */
    public static String m12219x(BLiveTemplate bLiveTemplate) {
        BLiveTemplateItem bLiveTemplateItem;
        return (bLiveTemplate == null || (bLiveTemplateItem = (BLiveTemplateItem) vwb.r(bLiveTemplate.format, new w9j() { // from class: l.z4t
            public final Object call(Object obj) {
                return Boolean.valueOf("button".equals(((BLiveTemplateItem) obj).type));
            }
        })) == null) ? "" : bLiveTemplateItem.scene;
    }

    /* JADX INFO: renamed from: y */
    public static LongLinkChatMessage.LiveChatMessage m12220y(BLiveChatMessage bLiveChatMessage, boolean z) {
        LongLinkChatMessage.LiveChatMessage.Builder chatShadingConfig = LongLinkChatMessage.LiveChatMessage.newBuilder().setRoomId(bLiveChatMessage.roomId).setSeq(bLiveChatMessage.seq).setUserId(bLiveChatMessage.userId).setUsername(bLiveChatMessage.username).setValue(bLiveChatMessage.value).setPreSeq(bLiveChatMessage.preSeq).setCreatedTime(bLiveChatMessage.createdTime).setPreTimestamp(bLiveChatMessage.preTimestamp).setTypeValue(Integer.parseInt(bLiveChatMessage.type)).setUserIdentity(bLiveChatMessage.userIdentity).setSharedVoiceLiveInfo(LongLinkChatMessage.SharedVoiceLiveInfo.newBuilder().setAudienceCount(bLiveChatMessage.sharedVoiceLiveInfo.audienceCount).setDescription(bLiveChatMessage.sharedVoiceLiveInfo.description).setLiveId(bLiveChatMessage.sharedVoiceLiveInfo.liveId).setRoomId(bLiveChatMessage.sharedVoiceLiveInfo.roomId).setAnchorId(bLiveChatMessage.sharedVoiceLiveInfo.anchorId).setVoiceCallCount(bLiveChatMessage.sharedVoiceLiveInfo.voiceCallCount)).setGift(LongLinkChatMessage.GiftMessage.newBuilder().setId(bLiveChatMessage.gift.id).setUrl(bLiveChatMessage.gift.url).setType(String.valueOf(bLiveChatMessage.gift.type)).setCount(bLiveChatMessage.gift.count).setName(bLiveChatMessage.gift.name)).setH5(bLiveChatMessage.h5).setTemplate(Template.TemplateData.newBuilder().setId(bLiveChatMessage.template.id).addAllFields(bLiveChatMessage.template.fields)).setMedal(m12208m(bLiveChatMessage)).setHierarchy(LongLinkChatMessage.HierarchyMessage.newBuilder().setGrade(bLiveChatMessage.hierarchy.grade).build()).setChatShadingConfig(m12206k(bLiveChatMessage.chatShadingConfig));
        BLiveStarlightHierarchy bLiveStarlightHierarchy = bLiveChatMessage.starlightHierarchy;
        if (bLiveStarlightHierarchy != null && !TextUtils.isEmpty(bLiveStarlightHierarchy.imageUrl)) {
            chatShadingConfig.setStarlightHierarchy(LongLinkChatMessage.HierarchyMessage.newBuilder().setImageUrl(bLiveStarlightHierarchy.imageUrl).setGrade(bLiveStarlightHierarchy.grade).build());
        }
        final LongLinkChatMessage.LiveChatMessageExtInfo.Builder maskMode = LongLinkChatMessage.LiveChatMessageExtInfo.newBuilder().setImageUrl(bLiveChatMessage.extInfo.imageUrl).setSenderCityID(bLiveChatMessage.extInfo.senderCityID).setColorfulMode(bLiveChatMessage.extInfo.colorfulMode).setMaskMode(z);
        BLiveUserMask bLiveUserMask = bLiveChatMessage.extInfo.userMask;
        userMaskConfig.UserMask.Builder avatarConfig = userMaskConfig.UserMask.newBuilder().setVoiceMaskModeAddition(userMaskConfig.VoiceMaskModeAddition.newBuilder().setColor(bLiveUserMask.color).setGender(bLiveUserMask.gender).build()).setAvatar(bLiveUserMask.avatar).setUserId(bLiveUserMask.userId).setAvatarConfig(userMaskConfig.AvatarConfig.newBuilder().setFrameConfig(userMaskConfig.PictureConfig.newBuilder().setStaticUrl(bLiveUserMask.avatarConfig.frameConfig.staticUrl).setDynamicUrl(bLiveUserMask.avatarConfig.frameConfig.dynamicUrl).setMediumDynamicUrl(bLiveUserMask.avatarConfig.frameConfig.mediumDynamicUrl).setSmallDynamicUrl(bLiveUserMask.avatarConfig.frameConfig.smallDynamicUrl).build()).build());
        if (!vwb.J(bLiveUserMask.userNameGradientColors)) {
            avatarConfig.addAllUserNameGradientColors(bLiveUserMask.userNameGradientColors);
        }
        maskMode.setUserMask(avatarConfig.build()).setGroupControl(bLiveChatMessage.extInfo.groupControl).setGroupType(bLiveChatMessage.extInfo.groupType);
        if (!vwb.J(bLiveChatMessage.extInfo.atUserInfos)) {
            vwb.z(bLiveChatMessage.extInfo.atUserInfos, new e30() { // from class: l.a5t
                public final void call(Object obj) {
                    BLiveAtUserInfo bLiveAtUserInfo = (BLiveAtUserInfo) obj;
                    maskMode.addAtUserInfos(LongLinkChatMessage.AtUserInfo.newBuilder().setUserId(bLiveAtUserInfo.userId).setUserName(bLiveAtUserInfo.userName).build());
                }
            });
        }
        chatShadingConfig.setExtInfo(maskMode.build());
        return chatShadingConfig.build();
    }

    /* JADX INFO: renamed from: z */
    public static List<LongLinkChatMessage.Medal> m12221z(List<BLiveUserMedal> list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.d5t
            public final void call(Object obj) {
                BLiveUserMedal bLiveUserMedal = (BLiveUserMedal) obj;
                arrayList.add(LongLinkChatMessage.Medal.newBuilder().setId(bLiveUserMedal.id).setFanbaseGrade(bLiveUserMedal.fanbaseGrade).setFamilyGrade(bLiveUserMedal.familyGrade).setFamilyText(bLiveUserMedal.familyText).setVoiceFanbaseColor(bLiveUserMedal.voiceFanbaseColor).setVoiceFanbaseGrade(bLiveUserMedal.voiceFanbaseGrade).setVoiceFanbaseText(bLiveUserMedal.voiceFanbaseText).setFamilyLight(bLiveUserMedal.familyLight).build());
            }
        });
        return arrayList;
    }
}
