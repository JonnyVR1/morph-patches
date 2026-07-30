package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBannerTab;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/awp;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class awp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.awp$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*"}, m88121d2 = {"Ll/awp$a;", "", "<init>", "()V", "Ll/kfn0;", "voiceFeed", "", "source", "", "Ll/r6s;", "j", "(Ll/kfn0;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;", "cardData", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "e", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;)Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "g", "()Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "model", "rowPos", "models", "", RXScreenCaptureService.KEY_INDEX, "(Ll/r6s;ILjava/util/List;)V", "h", "(Ll/r6s;)I", "", "list", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceFeedBanners;", "listBanner", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/apibean/LiveGoAction;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static int m100677a(r6s r6sVar, r6s r6sVar2) {
            r6sVar.getClass();
            r6sVar2.getClass();
            return r6sVar.localRowIndex - r6sVar2.localRowIndex;
        }

        /* JADX INFO: renamed from: b */
        public static int m100678b(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: renamed from: c */
        public final List<r6s> m100679c(List<? extends BLiveVoiceFeedBanners> listBanner) {
            ArrayList arrayList = new ArrayList();
            for (BLiveVoiceFeedBanners bLiveVoiceFeedBanners : listBanner) {
                if (!jyb.m147479J(bLiveVoiceFeedBanners.tabs) && bLiveVoiceFeedBanners.cardIndex >= 0) {
                    r6s r6sVarM215110a = ybu.m215110a(1);
                    xwr xwrVar = new xwr();
                    xwrVar.m213426e(new ArrayList());
                    List<BLiveVoiceBannerTab> list = bLiveVoiceFeedBanners.tabs;
                    list.getClass();
                    for (BLiveVoiceBannerTab bLiveVoiceBannerTab : list) {
                        List<xwr.C21468a> listM213423b = xwrVar.m213423b();
                        xwr.C21468a c21468a = new xwr.C21468a();
                        xwrVar.localAutoScroll = true;
                        c21468a.m213435i(bLiveVoiceBannerTab.cardType);
                        c21468a.m213432f(bLiveVoiceBannerTab.cardBackgroundUrl);
                        c21468a.m213433g(bLiveVoiceBannerTab.title);
                        c21468a.m213434h(new LiveCardTrackData());
                        LiveGoAction liveGoAction = new LiveGoAction();
                        liveGoAction.setType(1);
                        String str = bLiveVoiceBannerTab.cardLandpageUrl;
                        str.getClass();
                        boolean zM94374J = C15493d.m94374J(str, "tantanapp", false, 2, null);
                        String str2 = bLiveVoiceBannerTab.cardLandpageUrl;
                        if (!zM94374J) {
                            str2 = "tantanapp://webview?url=" + str2;
                        }
                        liveGoAction.setGoData(str2);
                        c21468a.m213431e(liveGoAction);
                        listM213423b.add(c21468a);
                    }
                    r6sVarM215110a.m180033q(xwrVar);
                    r6sVarM215110a.localRowIndex = bLiveVoiceFeedBanners.cardIndex;
                    arrayList.add(r6sVarM215110a);
                }
            }
            final Function2 function2 = new Function2() { // from class: l.yvp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(awp.Companion.m100677a((r6s) obj, (r6s) obj2));
                }
            };
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: l.zvp
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return awp.Companion.m100678b(function2, obj, obj2);
                }
            });
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final List<r6s> m100680d(List<? extends BLiveVoiceRoomFeed> list, String source) {
            String str;
            ArrayList arrayList = new ArrayList();
            for (BLiveVoiceRoomFeed bLiveVoiceRoomFeed : list) {
                r6s r6sVar = new r6s();
                bwp bwpVar = new bwp(bLiveVoiceRoomFeed);
                bwpVar.m106735h(awp.INSTANCE.m100682f(bLiveVoiceRoomFeed, source));
                bwpVar.m106737j(tbs.f172989b.m203710q7());
                ahn ahnVarM97854a = ahn.m97854a();
                BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
                if (bLiveIntlLiveFrame == null || (str = bLiveIntlLiveFrame.frameId) == null) {
                    str = "";
                }
                bwpVar.m106736i(ahnVarM97854a.m97856c(str));
                r6sVar.m180035s(bwpVar);
                r6sVar.m180034r(jyn0.m147607d());
                arrayList.add(r6sVar);
            }
            return arrayList;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final LiveCardTrackData m100681e(int index, @NotNull BLiveVoiceRoomFeed cardData, @NotNull BLiveVoiceTab voiceTab) {
            cardData.getClass();
            voiceTab.getClass();
            String str = voiceTab.f45361id;
            String str2 = "p_audio_explore_recommend";
            if (!Intrinsics.m88377d(str, b5p0.f75083d) && Intrinsics.m88377d(str, b5p0.f75084e)) {
                str2 = "p_audio_explore_nearby";
            }
            LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
            liveCardTrackData.setPageId(str2);
            liveCardTrackData.setModuleId("e_live_audio_room_enter");
            liveCardTrackData.put("anchorId", cardData.anchorId);
            liveCardTrackData.put("liveId", cardData.liveId);
            liveCardTrackData.put("topic_id", cardData.roomTopicId);
            liveCardTrackData.put("audio_card_type", "recommend_card");
            liveCardTrackData.put("audio_tab_id", voiceTab.f45361id);
            liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(index));
            liveCardTrackData.put("audio_sub_tab_name", cardData.extraInfo.sourceName);
            liveCardTrackData.put("audio_room_type", cardData.maskMode ? "mask_audio" : "normal_audio");
            return liveCardTrackData;
        }

        /* JADX INFO: renamed from: f */
        public final LiveGoAction m100682f(BLiveVoiceRoomFeed cardData, String source) {
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
        public final LiveCardTrackData m100683g() {
            LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
            liveCardTrackData.setPageId("p_audio_explore_recommend");
            liveCardTrackData.setModuleId("e_audioroom_entertainment");
            liveCardTrackData.put("audioroom_entertainment", "entertainment_version");
            return liveCardTrackData;
        }

        /* JADX INFO: renamed from: h */
        public final int m100684h(r6s cardData) {
            return (cardData.m180020d() == 3002 || cardData.m180020d() == 3001) ? 3 : 6;
        }

        /* JADX INFO: renamed from: i */
        public final void m100685i(r6s model, int rowPos, List<r6s> models) {
            if (rowPos == 0) {
                models.add(0, model);
                return;
            }
            int size = models.size();
            int iM100684h = 0;
            for (int i = 0; i < size; i++) {
                iM100684h += m100684h(models.get(i));
                if (iM100684h >= rowPos * 6) {
                    models.add(i + 1, model);
                    return;
                }
            }
            models.add(model);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final List<r6s> m100686j(@NotNull kfn0 voiceFeed, @NotNull String source) {
            voiceFeed.getClass();
            source.getClass();
            List<BLiveVoiceRoomFeed> list = voiceFeed.f126460a;
            list.getClass();
            List<r6s> listM100680d = m100680d(list, source);
            List<BLiveVoiceFeedBanners> list2 = voiceFeed.f126461b;
            list2.getClass();
            for (r6s r6sVar : m100679c(list2)) {
                m100685i(r6sVar, r6sVar.localRowIndex, listM100680d);
            }
            return listM100680d;
        }

        public Companion() {
        }
    }
}
