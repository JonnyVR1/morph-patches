package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.u6n;
import l.xi5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ll/qge0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", "result", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;)V", "", "c", "()J", "Ll/pge0;", "requestInfo", "", "a", "(Ll/pge0;)Ljava/lang/String;", "b", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", LiveMessage.LiveMessageType.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "e", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", "d", "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveGiftResult;", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "getAllMikeSendGiftItem", "()Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveSendLiveMultiGiftResultItem;)V", "allMikeSendGiftItem", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final /* data */ class qge0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveSendLiveGiftResult result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveSendLiveMultiGiftResultItem allMikeSendGiftItem;

    public qge0(@NotNull BLiveSendLiveGiftResult bLiveSendLiveGiftResult) {
        bLiveSendLiveGiftResult.getClass();
        this.result = bLiveSendLiveGiftResult;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m21255a(@NotNull pge0 requestInfo) {
        requestInfo.getClass();
        if (!m21259e()) {
            return requestInfo.f17288m.m18093e();
        }
        BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = this.allMikeSendGiftItem;
        if (bLiveSendLiveMultiGiftResultItem != null) {
            return bLiveSendLiveMultiGiftResultItem.toUserId;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m21256b(@NotNull pge0 requestInfo) {
        Object obj;
        requestInfo.getClass();
        if (m21259e()) {
            List<mlj> listM20244e = requestInfo.m20244e();
            listM20244e.getClass();
            Iterator<T> it = listM20244e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((mlj) next).f15446e.a;
                BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem = this.allMikeSendGiftItem;
                if (TextUtils.equals(str, bLiveSendLiveMultiGiftResultItem != null ? bLiveSendLiveMultiGiftResultItem.toUserId : null)) {
                    obj = next;
                    break;
                }
            }
            mlj mljVar = (mlj) obj;
            if (mljVar != null) {
                return mljVar.f15446e.b;
            }
        }
        String strM18094f = requestInfo.f17288m.m18094f();
        return (TextUtils.isEmpty(strM18094f) && NullChecker.a(this.result) && NullChecker.a(this.result.receiveMask) && !TextUtils.isEmpty(this.result.receiveMask.name)) ? this.result.receiveMask.name : strM18094f;
    }

    /* JADX INFO: renamed from: c */
    public final long m21257c() {
        boolean zA = u6n.a();
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.result;
        return zA ? bLiveSendLiveGiftResult.remainingDiamonds : bLiveSendLiveGiftResult.remainingTantanCoins;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BLiveSendLiveGiftResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21259e() {
        return xi5.b(this.allMikeSendGiftItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof qge0) && Intrinsics.d(this.result, ((qge0) other).result);
    }

    /* JADX INFO: renamed from: f */
    public final void m21260f(@Nullable BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem) {
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
