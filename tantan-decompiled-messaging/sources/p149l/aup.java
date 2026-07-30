package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBannerTab;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/aup;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class aup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.aup$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*"}, m87232d2 = {"Ll/aup$a;", "", "<init>", "()V", "Ll/g6n0;", "voiceFeed", "", "source", "", "Ll/q4s;", "j", "(Ll/g6n0;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;", "cardData", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "e", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;)Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "g", "()Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "model", "rowPos", "models", "", RXScreenCaptureService.KEY_INDEX, "(Ll/q4s;ILjava/util/List;)V", "h", "(Ll/q4s;)I", "", "list", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceFeedBanners;", "listBanner", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static int m99024a(q4s q4sVar, q4s q4sVar2) {
            q4sVar.getClass();
            q4sVar2.getClass();
            return q4sVar.localRowIndex - q4sVar2.localRowIndex;
        }

        /* JADX INFO: renamed from: b */
        public static int m99025b(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: renamed from: c */
        public final List<q4s> m99026c(List<? extends BLiveVoiceFeedBanners> listBanner) {
            ArrayList arrayList = new ArrayList();
            for (BLiveVoiceFeedBanners bLiveVoiceFeedBanners : listBanner) {
                if (!vwb.m200296J(bLiveVoiceFeedBanners.tabs) && bLiveVoiceFeedBanners.cardIndex >= 0) {
                    q4s q4sVarM207516a = x9u.m207516a(1);
                    wur wurVar = new wur();
                    wurVar.m205658e(new ArrayList());
                    List<BLiveVoiceBannerTab> list = bLiveVoiceFeedBanners.tabs;
                    list.getClass();
                    for (BLiveVoiceBannerTab bLiveVoiceBannerTab : list) {
                        List<wur.C20965a> listM205655b = wurVar.m205655b();
                        wur.C20965a c20965a = new wur.C20965a();
                        wurVar.localAutoScroll = true;
                        c20965a.m205667i(bLiveVoiceBannerTab.cardType);
                        c20965a.m205664f(bLiveVoiceBannerTab.cardBackgroundUrl);
                        c20965a.m205665g(bLiveVoiceBannerTab.title);
                        c20965a.m205666h(new LiveCardTrackData());
                        LiveGoAction liveGoAction = new LiveGoAction();
                        liveGoAction.setType(1);
                        String str = bLiveVoiceBannerTab.cardLandpageUrl;
                        str.getClass();
                        boolean zM93483J = C15386d.m93483J(str, "tantanapp", false, 2, null);
                        String str2 = bLiveVoiceBannerTab.cardLandpageUrl;
                        if (!zM93483J) {
                            str2 = "tantanapp://webview?url=" + str2;
                        }
                        liveGoAction.setGoData(str2);
                        c20965a.m205663e(liveGoAction);
                        listM205655b.add(c20965a);
                    }
                    q4sVarM207516a.m172968q(wurVar);
                    q4sVarM207516a.localRowIndex = bLiveVoiceFeedBanners.cardIndex;
                    arrayList.add(q4sVarM207516a);
                }
            }
            final Function2 function2 = new Function2() { // from class: l.ytp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(aup.Companion.m99024a((q4s) obj, (q4s) obj2));
                }
            };
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: l.ztp
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return aup.Companion.m99025b(function2, obj, obj2);
                }
            });
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final List<q4s> m99027d(List<? extends BLiveVoiceRoomFeed> list, String source) {
            String str;
            ArrayList arrayList = new ArrayList();
            for (BLiveVoiceRoomFeed bLiveVoiceRoomFeed : list) {
                q4s q4sVar = new q4s();
                bup bupVar = new bup(bLiveVoiceRoomFeed);
                bupVar.m103984h(aup.INSTANCE.m99029f(bLiveVoiceRoomFeed, source));
                bupVar.m103986j(s9s.f163228b.m195923q7());
                afn afnVarM96259a = afn.m96259a();
                BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
                if (bLiveIntlLiveFrame == null || (str = bLiveIntlLiveFrame.frameId) == null) {
                    str = "";
                }
                bupVar.m103985i(afnVarM96259a.m96261c(str));
                q4sVar.m172970s(bupVar);
                q4sVar.m172969r(fpn0.m122614d());
                arrayList.add(q4sVar);
            }
            return arrayList;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final LiveCardTrackData m99028e(int index, @NotNull BLiveVoiceRoomFeed cardData, @NotNull BLiveVoiceTab voiceTab) {
            cardData.getClass();
            voiceTab.getClass();
            String str = voiceTab.f44513id;
            String str2 = "p_audio_explore_recommend";
            if (!Intrinsics.m87488d(str, xvo0.f194660d) && Intrinsics.m87488d(str, xvo0.f194661e)) {
                str2 = "p_audio_explore_nearby";
            }
            LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
            liveCardTrackData.setPageId(str2);
            liveCardTrackData.setModuleId("e_live_audio_room_enter");
            liveCardTrackData.put("anchorId", cardData.anchorId);
            liveCardTrackData.put("liveId", cardData.liveId);
            liveCardTrackData.put("topic_id", cardData.roomTopicId);
            liveCardTrackData.put("audio_card_type", "recommend_card");
            liveCardTrackData.put("audio_tab_id", voiceTab.f44513id);
            liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
            liveCardTrackData.put("audio_sub_tab_name", cardData.extraInfo.sourceName);
            liveCardTrackData.put("audio_room_type", cardData.maskMode ? "mask_audio" : "normal_audio");
            return liveCardTrackData;
        }

        /* JADX INFO: renamed from: f */
        public final LiveGoAction m99029f(BLiveVoiceRoomFeed cardData, String source) {
            LiveGoAction liveGoAction = new LiveGoAction();
            liveGoAction.setType(5);
            HashMap map = new HashMap();
            liveGoAction.setGoData(cardData.liveId);
            map.put("source", source);
            liveGoAction.setGoExtra(map);
            return liveGoAction;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final LiveCardTrackData m99030g() {
            LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
            liveCardTrackData.setPageId("p_audio_explore_recommend");
            liveCardTrackData.setModuleId("e_audioroom_entertainment");
            liveCardTrackData.put("audioroom_entertainment", "entertainment_version");
            return liveCardTrackData;
        }

        /* JADX INFO: renamed from: h */
        public final int m99031h(q4s cardData) {
            return (cardData.m172955d() == 3002 || cardData.m172955d() == 3001) ? 3 : 6;
        }

        /* JADX INFO: renamed from: i */
        public final void m99032i(q4s model, int rowPos, List<q4s> models) {
            if (rowPos == 0) {
                models.add(0, model);
                return;
            }
            int size = models.size();
            int iM99031h = 0;
            for (int i = 0; i < size; i++) {
                iM99031h += m99031h(models.get(i));
                if (iM99031h >= rowPos * 6) {
                    models.add(i + 1, model);
                    return;
                }
            }
            models.add(model);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final List<q4s> m99033j(@NotNull g6n0 voiceFeed, @NotNull String source) {
            voiceFeed.getClass();
            source.getClass();
            List<BLiveVoiceRoomFeed> list = voiceFeed.f101294a;
            list.getClass();
            List<q4s> listM99027d = m99027d(list, source);
            List<BLiveVoiceFeedBanners> list2 = voiceFeed.f101295b;
            list2.getClass();
            for (q4s q4sVar : m99026c(list2)) {
                m99032i(q4sVar, q4sVar.localRowIndex, listM99027d);
            }
            return listM99027d;
        }

        public Companion() {
        }
    }
}
