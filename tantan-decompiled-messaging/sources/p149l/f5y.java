package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001b\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0011R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006%"}, m87232d2 = {"Ll/f5y;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Media;", "video", "", "m", "(Lcom/p1/mobile/putong/data/Media;)V", "Lrx/c;", "q", "()Lrx/c;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/putong/data/Media;", "", NotificationCompat.GROUP_KEY_SILENT, "p", "(Z)V", "r", "j", "()Z", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "videoPlayState", "b", "videoVoice", "c", "Z", RXScreenCaptureService.KEY_INDEX, "o", "isVideoPlaying", "Ll/z91;", "Ll/z91;", "callBack", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f5y {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static volatile f5y f95206e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22392a<Media> videoPlayState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C22392a<Boolean> videoVoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isVideoPlaying;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final z91 callBack;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f95207f = "NewMeetAct";

    /* JADX INFO: renamed from: l.f5y$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"l/f5y$b", "Ll/z91;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/z91;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16765b implements z91 {
        public C16765b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            f5y.INSTANCE.m119566f().m119554p(true);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String currentBusinessKey, AudioBusinessType currentType, z91 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                osi0.m165783g(conflictBusinessType.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(currentBusinessKey, currentType, currentCallBack);
                f5y.this.videoVoice.m132487l(Boolean.FALSE);
            }
        }

        @Override // p149l.z91
        public void success() {
            f5y.this.videoVoice.m132487l(Boolean.FALSE);
        }
    }

    public f5y() {
        this.videoPlayState = C22392a.m221512b();
        this.videoVoice = C22392a.m221512b();
        this.callBack = new C16765b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m119542e(@NotNull Media media) {
        return INSTANCE.m119565e(media);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final f5y m119543f() {
        return INSTANCE.m119566f();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m119544g() {
        return INSTANCE.m119567g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m119545h() {
        return INSTANCE.m119568h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m119546k(@NotNull String str) {
        INSTANCE.m119569i(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m119547l(@NotNull String str, @NotNull RelationshipStatus relationshipStatus) {
        INSTANCE.m119570l(str, relationshipStatus);
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m119548n() {
        INSTANCE.m119571n();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Media m119549d() {
        return this.videoPlayState.m221515e();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsVideoPlaying() {
        return this.isVideoPlaying;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m119551j() {
        Boolean boolM221515e = this.videoVoice.m221515e();
        boolM221515e.getClass();
        return boolM221515e.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m119552m(@NotNull Media video) {
        video.getClass();
        this.videoPlayState.m132487l(video);
    }

    /* JADX INFO: renamed from: o */
    public final void m119553o(boolean z) {
        this.isVideoPlaying = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m119554p(boolean silent) {
        if (!silent) {
            ib1.m135233b().mo135238f(f95207f, AudioBusinessType.NORMAL, this.callBack);
        } else {
            ib1.m135233b().mo135234a(f95207f);
            this.videoVoice.m132487l(Boolean.valueOf(silent));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C22306c<Media> m119555q() {
        C22306c<Media> c22306cAsObservable = this.videoPlayState.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22306c<Boolean> m119556r() {
        C22306c<Boolean> c22306cAsObservable = this.videoVoice.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: l.f5y$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/f5y$a;", "", "<init>", "()V", "Ll/f5y;", "f", "()Ll/f5y;", "Lcom/p1/mobile/putong/data/Media;", "media", "", "e", "(Lcom/p1/mobile/putong/data/Media;)Ljava/lang/String;", "userId", "Lcom/p1/mobile/putong/data/RelationshipStatus;", NotificationCompat.CATEGORY_STATUS, "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Lcom/p1/mobile/putong/data/RelationshipStatus;)V", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "n", "", "h", "()I", "g", "instance", "Ll/f5y;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: j */
        public static final Boolean m119561j(String str, MeetLiveItemData meetLiveItemData) {
            return Boolean.valueOf(Intrinsics.m87488d(meetLiveItemData.user.f56011id, str));
        }

        /* JADX INFO: renamed from: k */
        public static final Boolean m119562k(String str, AbsMeetListData absMeetListData) {
            return Boolean.valueOf((absMeetListData instanceof AbsMeetUserItemData) && Intrinsics.m87488d(((AbsMeetUserItemData) absMeetListData).user.f56011id, str));
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX INFO: renamed from: m */
        public static final Boolean m119563m(String str, AbsMeetListData absMeetListData) {
            boolean z;
            if (absMeetListData instanceof MeetFeedUserItemData) {
                MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) absMeetListData;
                if (!Intrinsics.m87488d(meetFeedUserItemData.user.f56011id, str) || meetFeedUserItemData.isPicksUser() || meetFeedUserItemData.isLikedUser()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: renamed from: o */
        public static final Boolean m119564o(AbsMeetListData absMeetListData) {
            return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m119565e(@NotNull Media media) {
            media.getClass();
            Dimension dimension = media.cover().size;
            dimension.getClass();
            int i = dimension.width;
            int i2 = dimension.height;
            float f = (i * 1.0f) / i2;
            if (f >= 1.33f) {
                return "4:3";
            }
            if (f <= 0.75f) {
                return "3:4";
            }
            return i + ":" + i2;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: f */
        public final f5y m119566f() {
            f5y f5yVar;
            f5y f5yVar2 = f5y.f95206e;
            if (f5yVar2 != null) {
                return f5yVar2;
            }
            synchronized (this) {
                f5yVar = f5y.f95206e;
                if (f5yVar == null) {
                    f5yVar = new f5y(null);
                    f5y.f95206e = f5yVar;
                }
            }
            return f5yVar;
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final int m119567g() {
            String strM79302F = RemoteConfig.m79298x().m79302F("meet_feed_limit");
            strM79302F.getClass();
            if (vwb.m200298L(strM79302F)) {
                return 0;
            }
            try {
                return new JSONObject(strM79302F).getInt("clear_feed_num");
            } catch (JSONException unused) {
                return 0;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final int m119568h() {
            String strM79302F = RemoteConfig.m79298x().m79302F("meet_feed_limit");
            strM79302F.getClass();
            if (vwb.m200298L(strM79302F)) {
                return 2;
            }
            try {
                return new JSONObject(strM79302F).getInt("mask_feed_num");
            } catch (JSONException unused) {
                return 2;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m119569i(@NotNull final String userId) {
            userId.getClass();
            List<MeetLiveItemData> listM34728t4 = CoreModule.f17545c.f19664m1.m34728t4();
            if (listM34728t4 != null) {
                vwb.m200320d0(listM34728t4, new w9j() { // from class: l.d5y
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return f5y.Companion.m119561j(userId, (MeetLiveItemData) obj);
                    }
                });
                CoreModule.f17545c.f19664m1.m34695K5(new ArrayList(listM34728t4));
            }
            q860<AbsMeetListData> q860VarM34696L4 = CoreModule.f17545c.f19664m1.m34696L4();
            if (q860VarM34696L4 != null) {
                vwb.m200320d0(q860VarM34696L4.f153135a, new w9j() { // from class: l.e5y
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return f5y.Companion.m119562k(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.f17545c.f19664m1.m34701N5(new q860<>(q860VarM34696L4.f153135a, q860VarM34696L4.f153136b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final void m119570l(@NotNull final String userId, @NotNull RelationshipStatus status) {
            userId.getClass();
            status.getClass();
            q860<AbsMeetListData> q860VarM34696L4 = CoreModule.f17545c.f19664m1.m34696L4();
            if (q860VarM34696L4 != null) {
                List<AbsMeetListData> list = q860VarM34696L4.f153135a;
                list.getClass();
                for (AbsMeetListData absMeetListData : list) {
                    if (absMeetListData instanceof MeetFeedItemData) {
                        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) absMeetListData;
                        if (Intrinsics.m87488d(meetFeedItemData.user.f56011id, userId)) {
                            if (meetFeedItemData.isLikedUser()) {
                                meetFeedItemData.item.relation.status = status;
                            } else if (meetFeedItemData.isPicksUser()) {
                                MyMeetFeedItem myMeetFeedItem = meetFeedItemData.item;
                                myMeetFeedItem.relation.status = status;
                                myMeetFeedItem.type = FeedType.get(FeedType.relationMoment);
                            }
                        }
                    } else {
                        boolean z = absMeetListData instanceof MeetFeedUserItemData;
                        if (z) {
                            MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) absMeetListData;
                            if (meetFeedUserItemData.isMomentLikeUser() || meetFeedUserItemData.isMomentBeLikeUser()) {
                                MyMeetFeedItem myMeetFeedItem2 = meetFeedUserItemData.item;
                                myMeetFeedItem2.relation.status = status;
                                myMeetFeedItem2.type = FeedType.get("likedUser");
                            }
                        }
                        if (z) {
                            MeetFeedUserItemData meetFeedUserItemData2 = (MeetFeedUserItemData) absMeetListData;
                            if (meetFeedUserItemData2.isPicksUser() || meetFeedUserItemData2.isLikedUserType()) {
                                if (Intrinsics.m87488d(meetFeedUserItemData2.user.f56011id, userId)) {
                                    meetFeedUserItemData2.item.relation.status = status;
                                }
                            }
                        }
                    }
                }
                vwb.m200320d0(q860VarM34696L4.f153135a, new w9j() { // from class: l.c5y
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return f5y.Companion.m119563m(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.f17545c.f19664m1.m34701N5(new q860<>(q860VarM34696L4.f153135a, q860VarM34696L4.f153136b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m119571n() {
            q860<AbsMeetListData> q860VarM34696L4 = CoreModule.f17545c.f19664m1.m34696L4();
            if (q860VarM34696L4 != null) {
                vwb.m200320d0(q860VarM34696L4.f153135a, new w9j() { // from class: l.b5y
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return f5y.Companion.m119564o((AbsMeetListData) obj);
                    }
                });
                CoreModule.f17545c.f19664m1.m34701N5(new q860<>(q860VarM34696L4.f153135a, q860VarM34696L4.f153136b));
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ f5y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
