package p009l;

import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p000p1.mobile.putong.util.audio.AudioBusinessType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.osi0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R8\u0010\u0019\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R8\u0010\u001b\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0011R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006%"}, d2 = {"Ll/f5y;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Media;", "video", "", "m", "(Lcom/p1/mobile/putong/data/Media;)V", "Lrx/c;", "q", "()Lrx/c;", "d", "()Lcom/p1/mobile/putong/data/Media;", "", "silent", "p", "(Z)V", "r", "j", "()Z", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "videoPlayState", "b", "videoVoice", "c", "Z", "i", "o", "isVideoPlaying", "Ll/z91;", "Ll/z91;", "callBack", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f5y {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static volatile f5y f12818e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final a<Media> videoPlayState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final a<Boolean> videoVoice;

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
    public static final String f12819f = "NewMeetAct";

    /* JADX INFO: renamed from: l.f5y$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"l/f5y$b", "Ll/z91;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", "d", "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/z91;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0889b implements z91 {
        public C0889b() {
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: b */
        public void mo3116b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            f5y.INSTANCE.m14297f().m14285p(true);
        }

        @Override // p009l.z91
        /* JADX INFO: renamed from: d */
        public void mo3117d(String currentBusinessKey, AudioBusinessType currentType, z91 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                osi0.g(conflictBusinessType.getBusinessMsg());
            } else {
                ib1.m16307b().mo16313g(currentBusinessKey, currentType, currentCallBack);
                f5y.this.videoVoice.onNext(Boolean.FALSE);
            }
        }

        @Override // p009l.z91
        public void success() {
            f5y.this.videoVoice.onNext(Boolean.FALSE);
        }
    }

    public f5y() {
        this.videoPlayState = a.b();
        this.videoVoice = a.b();
        this.callBack = new C0889b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m14273e(@NotNull Media media) {
        return INSTANCE.m14296e(media);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final f5y m14274f() {
        return INSTANCE.m14297f();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final int m14275g() {
        return INSTANCE.m14298g();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m14276h() {
        return INSTANCE.m14299h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m14277k(@NotNull String str) {
        INSTANCE.m14300i(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m14278l(@NotNull String str, @NotNull RelationshipStatus relationshipStatus) {
        INSTANCE.m14301l(str, relationshipStatus);
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m14279n() {
        INSTANCE.m14302n();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Media m14280d() {
        return (Media) this.videoPlayState.e();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsVideoPlaying() {
        return this.isVideoPlaying;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m14282j() {
        Object objE = this.videoVoice.e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m14283m(@NotNull Media video) {
        video.getClass();
        this.videoPlayState.onNext(video);
    }

    /* JADX INFO: renamed from: o */
    public final void m14284o(boolean z) {
        this.isVideoPlaying = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m14285p(boolean silent) {
        if (!silent) {
            ib1.m16307b().mo16312f(f12819f, AudioBusinessType.NORMAL, this.callBack);
        } else {
            ib1.m16307b().mo16308a(f12819f);
            this.videoVoice.onNext(Boolean.valueOf(silent));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final c<Media> m14286q() {
        c<Media> cVarAsObservable = this.videoPlayState.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final c<Boolean> m14287r() {
        c<Boolean> cVarAsObservable = this.videoVoice.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: l.f5y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll/f5y$a;", "", "<init>", "()V", "Ll/f5y;", "f", "()Ll/f5y;", "Lcom/p1/mobile/putong/data/Media;", "media", "", "e", "(Lcom/p1/mobile/putong/data/Media;)Ljava/lang/String;", "userId", "Lcom/p1/mobile/putong/data/RelationshipStatus;", "status", "", "l", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/RelationshipStatus;)V", "i", "(Ljava/lang/String;)V", "n", "", "h", "()I", "g", "instance", "Ll/f5y;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: j */
        public static final Boolean m14292j(String str, MeetLiveItemData meetLiveItemData) {
            return Boolean.valueOf(Intrinsics.d(((DbObject) ((AbsMeetUserItemData) meetLiveItemData).user).id, str));
        }

        /* JADX INFO: renamed from: k */
        public static final Boolean m14293k(String str, AbsMeetListData absMeetListData) {
            return Boolean.valueOf((absMeetListData instanceof AbsMeetUserItemData) && Intrinsics.d(((DbObject) ((AbsMeetUserItemData) absMeetListData).user).id, str));
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX INFO: renamed from: m */
        public static final Boolean m14294m(String str, AbsMeetListData absMeetListData) {
            boolean z;
            if (absMeetListData instanceof MeetFeedUserItemData) {
                MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) absMeetListData;
                if (!Intrinsics.d(((DbObject) ((AbsMeetUserItemData) meetFeedUserItemData).user).id, str) || meetFeedUserItemData.isPicksUser() || meetFeedUserItemData.isLikedUser()) {
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
        public static final Boolean m14295o(AbsMeetListData absMeetListData) {
            return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m14296e(@NotNull Media media) {
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
        public final f5y m14297f() {
            f5y f5yVar;
            f5y f5yVar2 = f5y.f12818e;
            if (f5yVar2 != null) {
                return f5yVar2;
            }
            synchronized (this) {
                f5yVar = f5y.f12818e;
                if (f5yVar == null) {
                    f5yVar = new f5y(null);
                    f5y.f12818e = f5yVar;
                }
            }
            return f5yVar;
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final int m14298g() {
            String strM9623F = RemoteConfig.m9619x().m9623F("meet_feed_limit");
            strM9623F.getClass();
            if (vwb.L(strM9623F)) {
                return 0;
            }
            try {
                return new JSONObject(strM9623F).getInt("clear_feed_num");
            } catch (JSONException unused) {
                return 0;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final int m14299h() {
            String strM9623F = RemoteConfig.m9619x().m9623F("meet_feed_limit");
            strM9623F.getClass();
            if (vwb.L(strM9623F)) {
                return 2;
            }
            try {
                return new JSONObject(strM9623F).getInt("mask_feed_num");
            } catch (JSONException unused) {
                return 2;
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m14300i(@NotNull final String userId) {
            userId.getClass();
            List listT4 = CoreModule.c.m1.t4();
            if (listT4 != null) {
                vwb.d0(listT4, new w9j() { // from class: l.d5y
                    public final Object call(Object obj) {
                        return f5y.Companion.m14292j(userId, (MeetLiveItemData) obj);
                    }
                });
                CoreModule.c.m1.K5(new ArrayList(listT4));
            }
            q860 q860VarL4 = CoreModule.c.m1.L4();
            if (q860VarL4 != null) {
                vwb.d0(q860VarL4.f19068a, new w9j() { // from class: l.e5y
                    public final Object call(Object obj) {
                        return f5y.Companion.m14293k(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.c.m1.N5(new q860(q860VarL4.f19068a, q860VarL4.f19069b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final void m14301l(@NotNull final String userId, @NotNull RelationshipStatus status) {
            userId.getClass();
            status.getClass();
            q860 q860VarL4 = CoreModule.c.m1.L4();
            if (q860VarL4 != null) {
                Iterable<MeetFeedUserItemData> iterable = q860VarL4.f19068a;
                iterable.getClass();
                for (MeetFeedUserItemData meetFeedUserItemData : iterable) {
                    if (meetFeedUserItemData instanceof MeetFeedItemData) {
                        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) meetFeedUserItemData;
                        if (Intrinsics.d(((DbObject) ((AbsMeetUserItemData) meetFeedItemData).user).id, userId)) {
                            if (meetFeedItemData.isLikedUser()) {
                                ((AbsMeetListData) meetFeedItemData).item.relation.status = status;
                            } else if (meetFeedItemData.isPicksUser()) {
                                MyMeetFeedItem myMeetFeedItem = ((AbsMeetListData) meetFeedItemData).item;
                                myMeetFeedItem.relation.status = status;
                                myMeetFeedItem.type = FeedType.get("relationMoment");
                            }
                        }
                    } else {
                        boolean z = meetFeedUserItemData instanceof MeetFeedUserItemData;
                        if (z) {
                            MeetFeedUserItemData meetFeedUserItemData2 = meetFeedUserItemData;
                            if (meetFeedUserItemData2.isMomentLikeUser() || meetFeedUserItemData2.isMomentBeLikeUser()) {
                                MyMeetFeedItem myMeetFeedItem2 = ((AbsMeetListData) meetFeedUserItemData2).item;
                                myMeetFeedItem2.relation.status = status;
                                myMeetFeedItem2.type = FeedType.get("likedUser");
                            }
                        }
                        if (z) {
                            MeetFeedUserItemData meetFeedUserItemData3 = meetFeedUserItemData;
                            if (meetFeedUserItemData3.isPicksUser() || meetFeedUserItemData3.isLikedUserType()) {
                                if (Intrinsics.d(((DbObject) ((AbsMeetUserItemData) meetFeedUserItemData3).user).id, userId)) {
                                    ((AbsMeetListData) meetFeedUserItemData3).item.relation.status = status;
                                }
                            }
                        }
                    }
                }
                vwb.d0(q860VarL4.f19068a, new w9j() { // from class: l.c5y
                    public final Object call(Object obj) {
                        return f5y.Companion.m14294m(userId, (AbsMeetListData) obj);
                    }
                });
                CoreModule.c.m1.N5(new q860(q860VarL4.f19068a, q860VarL4.f19069b));
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m14302n() {
            q860 q860VarL4 = CoreModule.c.m1.L4();
            if (q860VarL4 != null) {
                vwb.d0(q860VarL4.f19068a, new w9j() { // from class: l.b5y
                    public final Object call(Object obj) {
                        return f5y.Companion.m14295o((AbsMeetListData) obj);
                    }
                });
                CoreModule.c.m1.N5(new q860(q860VarL4.f19068a, q860VarL4.f19069b));
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ f5y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
