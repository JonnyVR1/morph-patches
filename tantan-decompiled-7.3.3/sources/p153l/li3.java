package p153l;

import android.text.SpannableStringBuilder;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010\u0010¨\u0006 "}, m88121d2 = {"Ll/li3;", "", "<init>", "()V", "Lcom/p1/mobile/longlink/msg/gift/LongLinkGiftMessage$SystemLiveCommentsMsg;", "message", "Ll/zod;", "defaultParam", "", "userId", "", "c", "(Lcom/p1/mobile/longlink/msg/gift/LongLinkGiftMessage$SystemLiveCommentsMsg;Ll/zod;Ljava/lang/String;)V", "Landroid/text/SpannableStringBuilder;", "spanBuilder", Constants.INAPP_DATA_TAG, "(Landroid/text/SpannableStringBuilder;)V", "Ll/pf2;", "baseBullet", "a", "(Ll/pf2;)V", "", "isFirst", "Ljava/util/LinkedList;", "enqueue", "h", "(Ll/pf2;ZLjava/util/LinkedList;)V", "e", "f", "g", "b", RXScreenCaptureService.KEY_INDEX, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class li3 {

    @NotNull
    public static final li3 INSTANCE = new li3();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m154286a(@NotNull pf2 baseBullet) {
        baseBullet.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletArrive = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m154287b(@NotNull pf2 baseBullet) {
        baseBullet.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletHide = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m154288c(@NotNull LongLinkGiftMessage.SystemLiveCommentsMsg message, @NotNull zod defaultParam, @NotNull String userId) {
        message.getClass();
        defaultParam.getClass();
        userId.getClass();
        LongLinkGiftMessage.SystemLiveCommentBackground background = message.getBackground();
        String str = "headUrl = " + background.getHeaderImgUrl() + "  middleUrl = " + background.getMiddleImgUrl() + "  bottomUrl = " + background.getBottomImgUrl();
        fhw.m125605a("[live]living_bullet", "onBulletMessageNotLegal iconUrl = " + message.getIconUrl() + "   startUrl " + message.getStartColor() + " endUrl = " + message.getEndColor() + "  specialMessage = " + str + "  userId = " + userId + "  roomId = " + message.getRoomID() + "  currentRomId = " + defaultParam.m220733a().room.f45267id + "  duration = " + message.getDisplayDuration());
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m154289d(@NotNull SpannableStringBuilder spanBuilder) {
        spanBuilder.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletMessageParserSuccess = " + ((Object) spanBuilder));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m154290e(@NotNull pf2 baseBullet) {
        baseBullet.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletRender = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m154291f(@NotNull pf2 baseBullet) {
        baseBullet.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletShow = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m154292g(@NotNull pf2 baseBullet) {
        baseBullet.getClass();
        fhw.m125605a("[live]living_bullet", "onBulletStay = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m154293h(@NotNull pf2 baseBullet, boolean isFirst, @NotNull LinkedList<pf2> enqueue) {
        baseBullet.getClass();
        enqueue.getClass();
        fhw.m125605a("[live]living_bullet", "onJoinBulletEnqueue isFirst = " + isFirst + " enqueueSize = " + enqueue.size() + " onBulletShow = " + baseBullet.m172074h());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m154294i(@NotNull SpannableStringBuilder spanBuilder) {
        spanBuilder.getClass();
        fhw.m125605a("[live]living_bullet", "onLuckyGiftBulletParserSuccess = " + ((Object) spanBuilder));
    }
}
