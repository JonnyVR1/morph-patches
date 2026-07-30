package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001b\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0011R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006%"}, m88121d2 = {"Ll/cey;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Media;", "video", "", "m", "(Lcom/p1/mobile/putong/data/Media;)V", "Lrx/c;", "q", "()Lrx/c;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/putong/data/Media;", "", NotificationCompat.GROUP_KEY_SILENT, "p", "(Z)V", "r", "j", "()Z", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "videoPlayState", "b", "videoVoice", "c", "Z", RXScreenCaptureService.KEY_INDEX, "o", "isVideoPlaying", "Ll/ga1;", "Ll/ga1;", "callBack", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cey {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static volatile cey f81436e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C22507a<Media> videoPlayState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C22507a<Boolean> videoVoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isVideoPlaying;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ga1 callBack;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f81437f = "NewMeetAct";

    /* JADX INFO: renamed from: l.cey$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"l/cey$b", "Ll/ga1;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/ga1;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16242b implements ga1 {
        public C16242b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            cey.INSTANCE.m109496f().m109484p(true);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String currentBusinessKey, AudioBusinessType currentType, ga1 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                r1j0.m179420g(conflictBusinessType.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(currentBusinessKey, currentType, currentCallBack);
                cey.this.videoVoice.m137019l(Boolean.FALSE);
            }
        }

        @Override // p153l.ga1
        public void success() {
            cey.this.videoVoice.m137019l(Boolean.FALSE);
        }
    }

    public cey() {
        this.videoPlayState = C22507a.m222758b();
        this.videoVoice = C22507a.m222758b();
        this.callBack = new C16242b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m109472e(@NotNull Media media) {
        return INSTANCE.m109495e(media);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final cey m109473f() {
        return INSTANCE.m109496f();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m109474g() {
        return INSTANCE.m109497g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m109475h() {
        return INSTANCE.m109498h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m109476k(@NotNull String str) {
        INSTANCE.m109499i(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m109477l(@NotNull String str, @NotNull RelationshipStatus relationshipStatus) {
        INSTANCE.m109500l(str, relationshipStatus);
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m109478n() {
        INSTANCE.m109501n();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Media m109479d() {
        return this.videoPlayState.m222761e();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsVideoPlaying() {
        return this.isVideoPlaying;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m109481j() {
        Boolean boolM222761e = this.videoVoice.m222761e();
        boolM222761e.getClass();
        return boolM222761e.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m109482m(@NotNull Media video) {
        video.getClass();
        this.videoPlayState.m137019l(video);
    }

    /* JADX INFO: renamed from: o */
    public final void m109483o(boolean z) {
        this.isVideoPlaying = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m109484p(boolean silent) {
        if (!silent) {
            pb1.m171472b().mo171477f(f81437f, AudioBusinessType.NORMAL, this.callBack);
        } else {
            pb1.m171472b().mo171473a(f81437f);
            this.videoVoice.m137019l(Boolean.valueOf(silent));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C22421c<Media> m109485q() {
        C22421c<Media> c22421cAsObservable = this.videoPlayState.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22421c<Boolean> m109486r() {
        C22421c<Boolean> c22421cAsObservable = this.videoVoice.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: l.cey$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/cey$a;", "", "<init>", "()V", "Ll/cey;", "f", "()Ll/cey;", "Lcom/p1/mobile/putong/data/Media;", "media", "", "e", "(Lcom/p1/mobile/putong/data/Media;)Ljava/lang/String;", "userId", "Lcom/p1/mobile/putong/data/RelationshipStatus;", NotificationCompat.CATEGORY_STATUS, "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Lcom/p1/mobile/putong/data/RelationshipStatus;)V", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "n", "", "h", "()I", "g", "instance", "Ll/cey;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: j */
        public static final Boolean m109491j(String str, MeetLiveItemData meetLiveItemData) {
            return Boolean.valueOf(Intrinsics.m88377d(meetLiveItemData.user.f56859id, str));
        }

        /* JADX INFO: renamed from: k */
        public static final Boolean m109492k(String str, AbsMeetListData absMeetListData) {
            return Boolean.valueOf((absMeetListData instanceof AbsMeetUserItemData) && Intrinsics.m88377d(((AbsMeetUserItemData) absMeetListData).user.f56859id, str));
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX INFO: renamed from: m */
        public static final Boolean m109493m(String str, AbsMeetListData absMeetListData) {
            boolean z;
            if (absMeetListData instanceof MeetFeedUserItemData) {
                MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) absMeetListData;
                if (!Intrinsics.m88377d(meetFeedUserItemData.user.f56859id, str) || meetFeedUserItemData.isPicksUser() || meetFeedUserItemData.isLikedUser()) {
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
        public static final Boolean m109494o(AbsMeetListData absMeetListData) {
            return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m109495e(@NotNull Media media) {
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
        public final cey m109496f() {
            cey ceyVar;
            cey ceyVar2 = cey.f81436e;
            if (ceyVar2 != null) {
                return ceyVar2;
            }
            synchronized (this) {
                ceyVar = cey.f81436e;
                if (ceyVar == null) {
                    ceyVar = new cey(null);
                    cey.f81436e = ceyVar;
                }
            }
            return ceyVar;
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final int m109497g() {
            String strM80485F = RemoteConfig.m80481x().m80485F("meet_feed_limit");
            strM80485F.getClass();
            if (jyb.m147481L(strM80485F)) {
                return 0;
            }
            try {
                return new JSONObject(strM80485F).getInt("clear_feed_num");
            } catch (JSONException unused) {
                return 0;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final int m109498h() {
            String strM80485F = RemoteConfig.m80481x().m80485F("meet_feed_limit");
            strM80485F.getClass();
            if (jyb.m147481L(strM80485F)) {
                return 2;
            }
            try {
                return new JSONObject(strM80485F).getInt("mask_feed_num");
            } catch (JSONException unused) {
                return 2;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m109499i(@NotNull final String userId) {
            userId.getClass();
            List<MeetLiveItemData> listM35731t4 = CoreModule.f18264c.f20406m1.m35731t4();
            if (listM35731t4 != null) {
                jyb.m147503d0(listM35731t4, new qcj() { // from class: l.aey
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return cey.Companion.m109491j(userId, (MeetLiveItemData) obj);
                    }
                });
                CoreModule.f18264c.f20406m1.m35698K5(new ArrayList(listM35731t4));
            }
            vg60<AbsMeetListData> vg60VarM35699L4 = CoreModule.f18264c.f20406m1.m35699L4();
            if (vg60VarM35699L4 != null) {
                jyb.m147503d0(vg60VarM35699L4.f184001a, new qcj() { // from class: l.bey
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return cey.Companion.m109492k(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.f18264c.f20406m1.m35704N5(new vg60<>(vg60VarM35699L4.f184001a, vg60VarM35699L4.f184002b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final void m109500l(@NotNull final String userId, @NotNull RelationshipStatus status) {
            userId.getClass();
            status.getClass();
            vg60<AbsMeetListData> vg60VarM35699L4 = CoreModule.f18264c.f20406m1.m35699L4();
            if (vg60VarM35699L4 != null) {
                List<AbsMeetListData> list = vg60VarM35699L4.f184001a;
                list.getClass();
                for (AbsMeetListData absMeetListData : list) {
                    if (absMeetListData instanceof MeetFeedItemData) {
                        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) absMeetListData;
                        if (Intrinsics.m88377d(meetFeedItemData.user.f56859id, userId)) {
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
                                if (Intrinsics.m88377d(meetFeedUserItemData2.user.f56859id, userId)) {
                                    meetFeedUserItemData2.item.relation.status = status;
                                }
                            }
                        }
                    }
                }
                jyb.m147503d0(vg60VarM35699L4.f184001a, new qcj() { // from class: l.zdy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return cey.Companion.m109493m(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.f18264c.f20406m1.m35704N5(new vg60<>(vg60VarM35699L4.f184001a, vg60VarM35699L4.f184002b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m109501n() {
            vg60<AbsMeetListData> vg60VarM35699L4 = CoreModule.f18264c.f20406m1.m35699L4();
            if (vg60VarM35699L4 != null) {
                jyb.m147503d0(vg60VarM35699L4.f184001a, new qcj() { // from class: l.ydy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return cey.Companion.m109494o((AbsMeetListData) obj);
                    }
                });
                CoreModule.f18264c.f20406m1.m35704N5(new vg60<>(vg60VarM35699L4.f184001a, vg60VarM35699L4.f184002b));
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ cey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
