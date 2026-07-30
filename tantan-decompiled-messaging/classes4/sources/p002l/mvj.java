package p002l;

import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveScrapBrief;
import com.p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p1.mobile.putong.live.base.data.BLiveScrapTabData;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 02\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u000426\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010/\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u00061"}, d2 = {"Ll/mvj;", "", "<init>", "()V", "", "scenarioType", "roomId", "liveId", "anchorId", "Lrx/c;", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "scrapItemId", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isGiftScrap", "", "scrapItemPosition", "updatePosition", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "j", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "e", "()Lcom/p1/mobile/putong/live/base/data/BLiveScrapBrief;", "source", "targetItemId", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "c", "bLiveEnvelope", "i", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "f", "()Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;", "setGiftScrapTabData", "(Lcom/p1/mobile/putong/live/base/data/BLiveScrapTabData;)V", "giftScrapTabData", "b", "g", "setRightScrapTabData", "rightScrapTabData", "Companion", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class mvj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BLiveScrapTabData giftScrapTabData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveScrapTabData rightScrapTabData;

    /* JADX INFO: renamed from: a */
    public static Unit m18241a(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m18242b(mvj mvjVar, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        mvjVar.m18249i(bLiveEnvelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m18243c() {
        this.rightScrapTabData = null;
        this.giftScrapTabData = null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final c<BLiveEnvelope> m18244d(@NotNull String source, @NotNull String scrapItemId, @NotNull String targetItemId, @NotNull String scenarioType, @NotNull String roomId, @NotNull String liveId, @NotNull String anchorId) {
        source.getClass();
        scrapItemId.getClass();
        targetItemId.getClass();
        scenarioType.getClass();
        roomId.getClass();
        liveId.getClass();
        anchorId.getClass();
        BLiveScrapCraftReq bLiveScrapCraftReqNew_ = BLiveScrapCraftReq.new_();
        bLiveScrapCraftReqNew_.source = source;
        if (Intrinsics.d(scenarioType, "voice-live")) {
            scenarioType = "voiceLive";
        }
        bLiveScrapCraftReqNew_.scenario = scenarioType;
        bLiveScrapCraftReqNew_.roomId = roomId;
        bLiveScrapCraftReqNew_.liveId = liveId;
        bLiveScrapCraftReqNew_.anchorId = anchorId;
        bLiveScrapCraftReqNew_.targetItemId = targetItemId;
        bLiveScrapCraftReqNew_.originalId = UUID.randomUUID().toString();
        if (w220.m24291b()) {
            bLiveScrapCraftReqNew_.fakeId = w220.m24290a();
        }
        c<BLiveEnvelope> cVarM27288n0 = zfv.m27288n0(scrapItemId, bLiveScrapCraftReqNew_);
        cVarM27288n0.getClass();
        return cVarM27288n0;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final BLiveScrapBrief m18245e() {
        List list;
        BLiveScrapTabData bLiveScrapTabData = this.giftScrapTabData;
        if (bLiveScrapTabData == null || (list = bLiveScrapTabData.scrapBriefs) == null || list.size() <= 0) {
            return null;
        }
        ((BLiveScrapBrief) list.get(0)).isSelected = true;
        return (BLiveScrapBrief) list.get(0);
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
    public final c<Unit> m18248h(@NotNull String scenarioType, @NotNull String roomId, @NotNull String liveId, @NotNull String anchorId) {
        scenarioType.getClass();
        roomId.getClass();
        liveId.getClass();
        anchorId.getClass();
        if (Intrinsics.d(scenarioType, "voice-live")) {
            scenarioType = "voiceLive";
        }
        c<BLiveEnvelope> cVarM27221M0 = zfv.m27221M0(scenarioType, roomId, liveId, anchorId);
        final Function1 function1 = new Function1() { // from class: l.kvj
            public final Object invoke(Object obj) {
                return mvj.m18242b(this.f14555a, (BLiveEnvelope) obj);
            }
        };
        c<Unit> map = cVarM27221M0.map(new w9j() { // from class: l.lvj
            public final Object call(Object obj) {
                return mvj.m18241a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m18249i(BLiveEnvelope bLiveEnvelope) {
        List<BLiveScrapTabData> list;
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData == null || (list = bLiveData.scrapTabs) == null) {
            return;
        }
        list.getClass();
        for (BLiveScrapTabData bLiveScrapTabData : list) {
            if (Intrinsics.d("gift", bLiveScrapTabData.type)) {
                this.giftScrapTabData = bLiveScrapTabData;
            } else if (Intrinsics.d("right", bLiveScrapTabData.type)) {
                this.rightScrapTabData = bLiveScrapTabData;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final BLiveScrapBrief m18250j(@NotNull String scrapItemId, @NotNull Function2<? super Boolean, ? super Integer, Unit> updatePosition) {
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
                if (Intrinsics.d(scrapItemId, bLiveScrapBrief.itemId)) {
                    iIndexOf = list2.indexOf(bLiveScrapBrief);
                }
            }
            if (iIndexOf != -1) {
                updatePosition.invoke(Boolean.TRUE, Integer.valueOf(iIndexOf));
                return (BLiveScrapBrief) list2.get(iIndexOf);
            }
        }
        BLiveScrapTabData bLiveScrapTabData2 = this.rightScrapTabData;
        if (bLiveScrapTabData2 != null && (list = bLiveScrapTabData2.scrapBriefs) != null) {
            for (BLiveScrapBrief bLiveScrapBrief2 : list) {
                if (Intrinsics.d(scrapItemId, bLiveScrapBrief2.itemId)) {
                    iIndexOf = list.indexOf(bLiveScrapBrief2);
                }
            }
            if (iIndexOf != -1) {
                updatePosition.invoke(Boolean.FALSE, Integer.valueOf(iIndexOf));
                return (BLiveScrapBrief) list.get(iIndexOf);
            }
        }
        return m18245e();
    }
}
