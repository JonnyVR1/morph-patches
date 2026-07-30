package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/voe0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", LovePlanetStage.result, "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;)V", "", "c", "()J", "Ll/uoe0;", "requestInfo", "", "a", "(Ll/uoe0;)Ljava/lang/String;", "b", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "getAllMikeSendGiftItem", "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;)V", "allMikeSendGiftItem", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final /* data */ class voe0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveSendLiveGiftResult result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveSendLiveMultiGiftResultItem allMikeSendGiftItem;

    public voe0(@NotNull BLiveSendLiveGiftResult bLiveSendLiveGiftResult) {
        bLiveSendLiveGiftResult.getClass();
        this.result = bLiveSendLiveGiftResult;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m202111a(@NotNull uoe0 requestInfo) {
        requestInfo.getClass();
        if (!m202115e()) {
            return requestInfo.f180065m.m111916e();
        }
        BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = this.allMikeSendGiftItem;
        if (bLiveSendLiveMultiGiftResultItem != null) {
            return bLiveSendLiveMultiGiftResultItem.toUserId;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m202112b(@NotNull uoe0 requestInfo) {
        Object obj;
        requestInfo.getClass();
        if (m202115e()) {
            List<coj> listM196978e = requestInfo.m196978e();
            listM196978e.getClass();
            Iterator<T> it = listM196978e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((coj) next).f82889e.f107997a;
                BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = this.allMikeSendGiftItem;
                if (TextUtils.equals(str, bLiveSendLiveMultiGiftResultItem != null ? bLiveSendLiveMultiGiftResultItem.toUserId : null)) {
                    obj = next;
                    break;
                }
            }
            coj cojVar = (coj) obj;
            if (cojVar != null) {
                return cojVar.f82889e.f107998b;
            }
        }
        String strM111917f = requestInfo.f180065m.m111917f();
        return (TextUtils.isEmpty(strM111917f) && NullChecker.m82486a(this.result) && NullChecker.m82486a(this.result.receiveMask) && !TextUtils.isEmpty(this.result.receiveMask.name)) ? this.result.receiveMask.name : strM111917f;
    }

    /* JADX INFO: renamed from: c */
    public final long m202113c() {
        boolean zM195065a = u8n.m195065a();
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.result;
        return zM195065a ? bLiveSendLiveGiftResult.remainingDiamonds : bLiveSendLiveGiftResult.remainingTantanCoins;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BLiveSendLiveGiftResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m202115e() {
        return yj5.m216389b(this.allMikeSendGiftItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof voe0) && Intrinsics.m88377d(this.result, ((voe0) other).result);
    }

    /* JADX INFO: renamed from: f */
    public final void m202116f(@Nullable BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem) {
        this.allMikeSendGiftItem = bLiveSendLiveMultiGiftResultItem;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "SendGiftResultWrapper(result=" + this.result + ")";
    }
}
