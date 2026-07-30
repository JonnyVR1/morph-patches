package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapTabData;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 02\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u000426\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010/\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u00061"}, m87232d2 = {"Ll/mvj;", "", "<init>", "()V", "", "scenarioType", "roomId", "liveId", "anchorId", "Lrx/c;", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "scrapItemId", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "isGiftScrap", "", "scrapItemPosition", "updatePosition", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "j", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "e", "()Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "source", "targetItemId", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "c", "bLiveEnvelope", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "f", "()Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "setGiftScrapTabData", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;)V", "giftScrapTabData", "b", "g", "setRightScrapTabData", "rightScrapTabData", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mvj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BLiveScrapTabData giftScrapTabData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveScrapTabData rightScrapTabData;

    /* JADX INFO: renamed from: a */
    public static Unit m156516a(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m156517b(mvj mvjVar, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        mvjVar.m156524i(bLiveEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m156518c() {
        this.rightScrapTabData = null;
        this.giftScrapTabData = null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C22306c<BLiveEnvelope> m156519d(@NotNull String source, @NotNull String scrapItemId, @NotNull String targetItemId, @NotNull String scenarioType, @NotNull String roomId, @NotNull String liveId, @NotNull String anchorId) {
        source.getClass();
        scrapItemId.getClass();
        targetItemId.getClass();
        scenarioType.getClass();
        roomId.getClass();
        liveId.getClass();
        anchorId.getClass();
        BLiveScrapCraftReq bLiveScrapCraftReqNew_ = BLiveScrapCraftReq.new_();
        bLiveScrapCraftReqNew_.source = source;
        if (Intrinsics.m87488d(scenarioType, BLiveAbsData.VOICE_LIVE)) {
            scenarioType = BLiveType.voiceLive;
        }
        bLiveScrapCraftReqNew_.scenario = scenarioType;
        bLiveScrapCraftReqNew_.roomId = roomId;
        bLiveScrapCraftReqNew_.liveId = liveId;
        bLiveScrapCraftReqNew_.anchorId = anchorId;
        bLiveScrapCraftReqNew_.targetItemId = targetItemId;
        bLiveScrapCraftReqNew_.originalId = UUID.randomUUID().toString();
        if (w220.m201015b()) {
            bLiveScrapCraftReqNew_.fakeId = w220.m201014a();
        }
        C22306c<BLiveEnvelope> c22306cM218585n0 = zfv.m218585n0(scrapItemId, bLiveScrapCraftReqNew_);
        c22306cM218585n0.getClass();
        return c22306cM218585n0;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final BLiveScrapBrief m156520e() {
        List<BLiveScrapBrief> list;
        BLiveScrapTabData bLiveScrapTabData = this.giftScrapTabData;
        if (bLiveScrapTabData == null || (list = bLiveScrapTabData.scrapBriefs) == null || list.size() <= 0) {
            return null;
        }
        list.get(0).isSelected = true;
        return list.get(0);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final BLiveScrapTabData getGiftScrapTabData() {
        return this.giftScrapTabData;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BLiveScrapTabData getRightScrapTabData() {
        return this.rightScrapTabData;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C22306c<Unit> m156523h(@NotNull String scenarioType, @NotNull String roomId, @NotNull String liveId, @NotNull String anchorId) {
        scenarioType.getClass();
        roomId.getClass();
        liveId.getClass();
        anchorId.getClass();
        if (Intrinsics.m87488d(scenarioType, BLiveAbsData.VOICE_LIVE)) {
            scenarioType = BLiveType.voiceLive;
        }
        C22306c<BLiveEnvelope> c22306cM218518M0 = zfv.m218518M0(scenarioType, roomId, liveId, anchorId);
        final Function1 function1 = new Function1() { // from class: l.kvj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mvj.m156517b(this.f124777a, (BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM218518M0.map(new w9j() { // from class: l.lvj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mvj.m156516a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m156524i(BLiveEnvelope bLiveEnvelope) {
        List<BLiveScrapTabData> list;
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData == null || (list = bLiveData.scrapTabs) == null) {
            return;
        }
        list.getClass();
        for (BLiveScrapTabData bLiveScrapTabData : list) {
            if (Intrinsics.m87488d("gift", bLiveScrapTabData.type)) {
                this.giftScrapTabData = bLiveScrapTabData;
            } else if (Intrinsics.m87488d("right", bLiveScrapTabData.type)) {
                this.rightScrapTabData = bLiveScrapTabData;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final BLiveScrapBrief m156525j(@NotNull String scrapItemId, @NotNull Function2<? super Boolean, ? super Integer, Unit> updatePosition) {
        int iIndexOf;
        List<BLiveScrapBrief> list;
        List<BLiveScrapBrief> list2;
        scrapItemId.getClass();
        updatePosition.getClass();
        BLiveScrapTabData bLiveScrapTabData = this.giftScrapTabData;
        if (bLiveScrapTabData == null || (list2 = bLiveScrapTabData.scrapBriefs) == null) {
            iIndexOf = -1;
        } else {
            iIndexOf = -1;
            for (BLiveScrapBrief bLiveScrapBrief : list2) {
                if (Intrinsics.m87488d(scrapItemId, bLiveScrapBrief.itemId)) {
                    iIndexOf = list2.indexOf(bLiveScrapBrief);
                }
            }
            if (iIndexOf != -1) {
                updatePosition.invoke(Boolean.TRUE, Integer.valueOf(iIndexOf));
                return list2.get(iIndexOf);
            }
        }
        BLiveScrapTabData bLiveScrapTabData2 = this.rightScrapTabData;
        if (bLiveScrapTabData2 != null && (list = bLiveScrapTabData2.scrapBriefs) != null) {
            for (BLiveScrapBrief bLiveScrapBrief2 : list) {
                if (Intrinsics.m87488d(scrapItemId, bLiveScrapBrief2.itemId)) {
                    iIndexOf = list.indexOf(bLiveScrapBrief2);
                }
            }
            if (iIndexOf != -1) {
                updatePosition.invoke(Boolean.FALSE, Integer.valueOf(iIndexOf));
                return list.get(iIndexOf);
            }
        }
        return m156520e();
    }
}
