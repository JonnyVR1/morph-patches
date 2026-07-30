package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/kr40;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;", "niceNumberDetail", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;", "niceNumberList", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;)V", "", "e", "()Z", "a", "", "f", "()V", "", "b", "()I", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;", "c", "()Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;", "setNiceNumberDetail", "(Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;", "setNiceNumberList", "(Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kr40 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BLiveNiceNumberDetail niceNumberDetail;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveNiceNumberList niceNumberList;

    public kr40(@Nullable BLiveNiceNumberDetail bLiveNiceNumberDetail, @Nullable BLiveNiceNumberList bLiveNiceNumberList) {
        this.niceNumberDetail = bLiveNiceNumberDetail;
        this.niceNumberList = bLiveNiceNumberList;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m150976a() {
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.niceNumberDetail;
        if (bLiveNiceNumberDetail == null) {
            return false;
        }
        bLiveNiceNumberDetail.getClass();
        return bLiveNiceNumberDetail.remainTimes > 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m150977b() {
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.niceNumberDetail;
        if (bLiveNiceNumberDetail != null) {
            return bLiveNiceNumberDetail.remainTimes;
        }
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BLiveNiceNumberDetail getNiceNumberDetail() {
        return this.niceNumberDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BLiveNiceNumberList getNiceNumberList() {
        return this.niceNumberList;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m150980e() {
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.niceNumberDetail;
        if (bLiveNiceNumberDetail != null) {
            return bLiveNiceNumberDetail.qualified;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m150981f() {
        int i;
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.niceNumberDetail;
        if (bLiveNiceNumberDetail == null || (i = bLiveNiceNumberDetail.remainTimes) <= 0) {
            return;
        }
        bLiveNiceNumberDetail.remainTimes = i - 1;
    }
}
