package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 ^2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u001cR$\u0010'\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b&\u0010\u001cR$\u0010+\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u001cR\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R$\u0010<\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0019\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u001cR\"\u0010@\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010-\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\"\u0010\f\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010B\u001a\u0004\b,\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010F\u001a\u0004\b=\u0010\u000b\"\u0004\bG\u0010HR\"\u0010K\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010-\u001a\u0004\b%\u0010/\"\u0004\bJ\u00101R$\u0010N\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0019\u001a\u0004\b\u0018\u0010\u0017\"\u0004\bM\u0010\u001cR\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010-\u001a\u0004\b7\u0010/\"\u0004\bO\u00101R\"\u0010S\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bQ\u0010/\"\u0004\bR\u00101R\"\u0010V\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\b(\u0010Y\"\u0004\bL\u0010ZR\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b3\u0010/\"\u0004\b\\\u00101¨\u0006_"}, m88121d2 = {"Ll/eqx;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)Z", "", "c", "()J", "matched", "", "totalDuration", "remainCount", "selfLike", "", "q", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "m", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45292l, "setUserId", "(Ljava/lang/String;)V", "userId", "b", "getBiz", "setBiz", "biz", "getContentId", "setContentId", "contentId", Constants.INAPP_DATA_TAG, "setChannelToken", "channelToken", "e", "getChannelKey", "setChannelKey", "channelKey", "f", "I", "getInitialDuration", "()I", "setInitialDuration", "(I)V", "initialDuration", "g", RXScreenCaptureService.KEY_INDEX, "setProlongCount", "prolongCount", "h", "k", "setTotalDuration", "getAppId", "setAppId", RemoteConfigConstants.RequestFieldKey.APP_ID, "j", "getVendor", "setVendor", "vendor", "Lcom/p1/mobile/putong/core/ui/lovebuzz/manager/LoveBuzzConstants$MATCH;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/manager/LoveBuzzConstants$MATCH;", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/manager/LoveBuzzConstants$MATCH;", "setMatched", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/manager/LoveBuzzConstants$MATCH;)V", "J", "p", "(J)V", StudentVerRejectedReason.startTime, "setFrozenDuration", "frozenDuration", "n", "setCallEndUserId", "callEndUserId", "o", "progressMax", "getResolutionWidth", "setResolutionWidth", "resolutionWidth", "getResolutionHeight", "setResolutionHeight", "resolutionHeight", "r", "Z", "()Z", "(Z)V", "matchAnimPlay", "setMemojiDuration", "memojiDuration", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class eqx {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String biz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String contentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String channelToken;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String channelKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int initialDuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int totalDuration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String appId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int vendor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public String callEndUserId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int progressMax;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean matchAnimPlay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int prolongCount = 3;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public LoveBuzzConstants$MATCH matched = LoveBuzzConstants$MATCH.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int frozenDuration = 15;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int resolutionWidth = 480;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int resolutionHeight = 640;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int memojiDuration = 8;

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m122071r(eqx eqxVar, Boolean bool, Integer num, Integer num2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        eqxVar.m122088q(bool, num, num2, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCallEndUserId() {
        return this.callEndUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChannelToken() {
        return this.channelToken;
    }

    /* JADX INFO: renamed from: c */
    public final long m122074c() {
        long j = this.startTime;
        return j == 0 ? j : (j + ((long) (this.totalDuration * 1000))) - pzi0.m174454o();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFrozenDuration() {
        return this.frozenDuration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getMatchAnimPlay() {
        return this.matchAnimPlay;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final LoveBuzzConstants$MATCH getMatched() {
        return this.matched;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMemojiDuration() {
        return this.memojiDuration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getProgressMax() {
        return this.progressMax;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getProlongCount() {
        return this.prolongCount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: m */
    public final void m122084m() {
        this.userId = null;
        this.biz = null;
        this.contentId = null;
        this.channelToken = null;
        this.channelKey = null;
        this.initialDuration = 0;
        this.prolongCount = 3;
        this.totalDuration = 0;
        this.appId = null;
        this.vendor = 0;
        this.frozenDuration = 15;
        this.progressMax = 0;
        this.resolutionWidth = 480;
        this.resolutionHeight = 640;
        this.matchAnimPlay = false;
    }

    /* JADX INFO: renamed from: n */
    public final void m122085n(boolean z) {
        this.matchAnimPlay = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m122086o(int i) {
        this.progressMax = i;
    }

    /* JADX INFO: renamed from: p */
    public final void m122087p(long j) {
        this.startTime = j;
    }

    /* JADX INFO: renamed from: q */
    public final void m122088q(@Nullable Boolean matched, @Nullable Integer totalDuration, @Nullable Integer remainCount, @Nullable Boolean selfLike) {
        if (remainCount != null) {
            this.prolongCount = remainCount.intValue();
        }
        if (totalDuration != null) {
            this.totalDuration = totalDuration.intValue();
        }
        if (selfLike != null && selfLike.booleanValue()) {
            this.matched = LoveBuzzConstants$MATCH.ME_LIKE_PEER;
        }
        if (matched == null || !matched.booleanValue()) {
            return;
        }
        this.matched = LoveBuzzConstants$MATCH.MATCHED;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m122089s(@Nullable LoveBuzzPushData data) {
        if (data == null) {
            return false;
        }
        if (!Intrinsics.m88377d(data.buzzIntent, "intl.lovebuzz.invite") && !Intrinsics.m88377d(data.buzzIntent, "intl.lovebuzz.report") && !TextUtils.equals(data.channelToken, this.channelToken)) {
            xa2.INSTANCE.m209831b("MediaBuzzCallData", "want transDataFromPush, but token not equals channelToken " + data.channelToken + " local channelToken " + this.channelToken);
            return false;
        }
        if (!TextUtils.isEmpty(data.biz)) {
            this.biz = data.biz;
        }
        if (!TextUtils.isEmpty(data.channelToken)) {
            this.channelToken = data.channelToken;
        }
        if (!TextUtils.isEmpty(data.channelKey)) {
            this.channelKey = data.channelKey;
        }
        if (!TextUtils.isEmpty(data.appId)) {
            this.appId = data.appId;
        }
        int i = data.vendor;
        if (i > 0) {
            this.vendor = i;
        }
        int i2 = data.initialDuration;
        if (i2 > 0) {
            this.initialDuration = i2;
        }
        int i3 = data.prolongCount;
        if (i3 > 0) {
            this.prolongCount = i3;
        }
        int i4 = data.totalDuration;
        if (i4 > 0) {
            this.totalDuration = i4;
        }
        int i5 = data.frozenDuration;
        if (i5 > 0) {
            this.frozenDuration = i5;
        }
        int i6 = data.memojiDuration;
        if (i6 > 0) {
            this.memojiDuration = i6;
        }
        String str = data.buzzIntent;
        if (str == null) {
            return true;
        }
        switch (str) {
            case "intl.lovebuzz.invite":
                this.totalDuration = this.initialDuration;
                this.startTime = 0L;
                int i7 = data.resolutionWidth;
                if (i7 > 0) {
                    this.resolutionWidth = i7;
                }
                int i8 = data.resolutionHeight;
                if (i8 > 0) {
                    this.resolutionHeight = i8;
                }
                this.matched = LoveBuzzConstants$MATCH.UNKNOWN;
                String str2 = data.userId;
                this.userId = str2;
                this.callEndUserId = str2;
                return true;
            case "intl.lovebuzz.match":
                this.matched = LoveBuzzConstants$MATCH.MATCHED;
                return true;
            case "intl.lovebuzz.like":
                this.matched = LoveBuzzConstants$MATCH.PEER_LIKE_ME;
                return true;
            case "intl.lovebuzz.prolong":
                this.progressMax = (int) m122074c();
                return true;
            default:
                return true;
        }
    }

    @NotNull
    public String toString() {
        return "MediaBuzzCallData(userId=" + this.userId + ", biz=" + this.biz + ", contentId=" + this.contentId + ", channelToken=" + this.channelToken + ", channelKey=" + this.channelKey + ", initialDuration=" + this.initialDuration + ", prolongCount=" + this.prolongCount + ", totalDuration=" + this.totalDuration + ", appId=" + this.appId + ", vendor=" + this.vendor + ", matched=" + this.matched + ", startTime=" + this.startTime + ", frozenDuration=" + this.frozenDuration + ", callEndUserId=" + this.callEndUserId + ", progressMax=" + this.progressMax + ", resolutionWidth=" + this.resolutionWidth + ", resolutionHeight=" + this.resolutionHeight + ")";
    }
}
