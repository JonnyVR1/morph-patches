package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamCdnInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveUserFeedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0013j\b\u0012\u0004\u0012\u00020\u000b`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/rgn0;", "", "", "isWhiteTheme", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveUserFeedList;", "feedList", "Lcom/p1/mobile/putong/data/User;", "users", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "Ll/rgn0$a;", "b", "()Ljava/util/List;", "Z", "()Z", "c", "(Z)V", "Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "data", "Ljava/util/ArrayList;", "a", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class rgn0 {

    @NotNull
    private final ArrayList<C19695a> data;
    private boolean isWhiteTheme;

    @NotNull
    private final List<User> users;

    /* JADX INFO: renamed from: l.rgn0$a */
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/rgn0$a;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveUserFeedList;", "feedItem", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "goAction", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveUserFeedList;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveUserFeedList;", "a", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceLiveUserFeedList;", "Lcom/p1/mobile/putong/data/User;", "c", "()Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "b", "()Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* data */ class C19695a {

        @NotNull
        private final BLiveVoiceLiveUserFeedList feedItem;

        @NotNull
        private final LiveGoAction goAction;

        @Nullable
        private final User user;

        public C19695a(@NotNull BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList, @Nullable User user, @NotNull LiveGoAction liveGoAction) {
            bLiveVoiceLiveUserFeedList.getClass();
            liveGoAction.getClass();
            this.feedItem = bLiveVoiceLiveUserFeedList;
            this.user = user;
            this.goAction = liveGoAction;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BLiveVoiceLiveUserFeedList getFeedItem() {
            return this.feedItem;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LiveGoAction getGoAction() {
            return this.goAction;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C19695a)) {
                return false;
            }
            C19695a c19695a = (C19695a) other;
            return Intrinsics.m87488d(this.feedItem, c19695a.feedItem) && Intrinsics.m87488d(this.user, c19695a.user) && Intrinsics.m87488d(this.goAction, c19695a.goAction);
        }

        public int hashCode() {
            int iHashCode = this.feedItem.hashCode() * 31;
            User user = this.user;
            return ((iHashCode + (user == null ? 0 : user.hashCode())) * 31) + this.goAction.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShipLinkItemData(feedItem=" + this.feedItem + ", user=" + this.user + ", goAction=" + this.goAction + ")";
        }
    }

    public rgn0(boolean z, @NotNull List<BLiveVoiceLiveUserFeedList> list, @NotNull List<User> list2) {
        list.getClass();
        list2.getClass();
        this.isWhiteTheme = z;
        this.users = list2;
        this.data = new ArrayList<>();
        for (final BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList : list) {
            User user = (User) vwb.m200346r(this.users, new w9j() { // from class: l.qgn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rgn0.m179172a(bLiveVoiceLiveUserFeedList, (User) obj);
                }
            });
            ArrayList<C19695a> arrayList = this.data;
            LiveGoAction liveGoAction = new LiveGoAction();
            liveGoAction.setType(1);
            String str = bLiveVoiceLiveUserFeedList.userId;
            String str2 = user.name;
            String str3 = bLiveVoiceLiveUserFeedList.streamUrl.push;
            BLiveStreamCdnInfo bLiveStreamCdnInfo = bLiveVoiceLiveUserFeedList.streamCdnInfo;
            liveGoAction.setGoData("tantanapp://intlVoiceShipLinkJumpRoom?userId=" + str + "&username=" + str2 + "&streamPushUrl=" + str3 + "&streamCdnProvider=" + bLiveStreamCdnInfo.provider + "&streamCdnBusinessType=" + bLiveStreamCdnInfo.businessType);
            Unit unit = Unit.INSTANCE;
            arrayList.add(new C19695a(bLiveVoiceLiveUserFeedList, user, liveGoAction));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m179172a(BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList, User user) {
        return Boolean.valueOf(Intrinsics.m87488d(user.f56011id, bLiveVoiceLiveUserFeedList.userId));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<C19695a> m179173b() {
        return this.data;
    }

    /* JADX INFO: renamed from: c */
    public final void m179174c(boolean z) {
        this.isWhiteTheme = z;
    }
}
