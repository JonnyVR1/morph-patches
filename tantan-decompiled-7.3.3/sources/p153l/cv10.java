package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexCardFourConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallExtendUser;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.page.swipecard.MultipleLiveFourItem;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020#0\u001dj\b\u0012\u0004\u0012\u00020#`\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010>\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b+\u0010;\"\u0004\b<\u0010=R'\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b?\u0010&R$\u0010G\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Ll/cv10;", "", "Landroid/view/View;", "parentView", "data", "<init>", "(Landroid/view/View;Ljava/lang/Object;)V", "", "k", "()V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallExtendUser;", NavigationIntent.voiceChat, "h", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallExtendUser;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;", "voiceFeed", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "live", "g", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;)V", "a", "Landroid/view/View;", "", "b", "Ljava/lang/String;", "SOURCE", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/external/page/swipecard/MultipleLiveFourItem;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "itemList", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCard;", Constants.INAPP_DATA_TAG, "f", "()Ljava/util/ArrayList;", "m", "(Ljava/util/ArrayList;)V", "cardList", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "title", "Lv/VText;", "Lv/VText;", "getSubtitle", "()Lv/VText;", "setSubtitle", "(Lv/VText;)V", "subtitle", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", "()Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;)V", "cardConfig", "getVideoHolderList", "videoHolderList", "Ll/kcg0;", "Ll/kcg0;", "getSubscription", "()Ll/kcg0;", "setSubscription", "(Ll/kcg0;)V", "subscription", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"SetTextI18n"})
public final class cv10 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String SOURCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ArrayList<MultipleLiveFourItem> itemList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ArrayList<BLiveComplexCard> cardList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public TextView title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public VText subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public BLiveComplexCardFourConfig cardConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<MultipleLiveFourItem> videoHolderList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscription;

    /* JADX WARN: Code duplicated, block: B:30:0x015b  */
    public cv10(@NotNull View view, @NotNull Object obj) {
        String str;
        String str2;
        view.getClass();
        obj.getClass();
        this.parentView = view;
        this.SOURCE = "swipe_card_agg";
        this.itemList = new ArrayList<>();
        ArrayList<MultipleLiveFourItem> arrayList = new ArrayList<>();
        this.videoHolderList = arrayList;
        if (obj instanceof BLiveData) {
            BLiveData bLiveData = (BLiveData) obj;
            List<BLiveComplexCard> list = bLiveData.complexCardList;
            list.getClass();
            m112743m((ArrayList) list);
            BLiveComplexCardFourConfig bLiveComplexCardFourConfig = bLiveData.complexCardConfig;
            bLiveComplexCardFourConfig.getClass();
            m112742l(bLiveComplexCardFourConfig);
        }
        arrayList.clear();
        this.itemList.clear();
        View viewFindViewById = view.findViewById(ldc0.f131592q2);
        viewFindViewById.getClass();
        this.title = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(ldc0.f131588p2);
        viewFindViewById2.getClass();
        this.subtitle = (VText) viewFindViewById2;
        this.itemList.add((MultipleLiveFourItem) view.findViewById(ldc0.f131618x0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(ldc0.f131622y0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(ldc0.f131626z0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(ldc0.f131435A0));
        TextView textView = this.title;
        String str3 = m112735e().title;
        str3.getClass();
        if (str3.length() == 0) {
            str = "内容精选";
        } else {
            str = m112735e().title;
            str.getClass();
        }
        textView.setText(str);
        VText vText = this.subtitle;
        String str4 = m112735e().subTitle;
        str4.getClass();
        if (str4.length() == 0) {
            str2 = "实时互动 声临其境";
        } else {
            str2 = m112735e().subTitle;
            str2.getClass();
        }
        vText.setText(str2);
        final int i = 0;
        for (MultipleLiveFourItem multipleLiveFourItem : this.itemList) {
            int i2 = i + 1;
            if (i >= m112736f().size() || m112736f().get(i) == null) {
                multipleLiveFourItem.setVisibility(4);
            } else {
                multipleLiveFourItem.setData(m112736f().get(i));
                String str5 = m112736f().get(i).type;
                int iHashCode = str5.hashCode();
                if (iHashCode != -1019543638) {
                    if (iHashCode == -1019457040 && str5.equals("voiceFeed")) {
                        final BLiveVoiceRoomFeed bLiveVoiceRoomFeed = m112736f().get(i).voiceFeed;
                        bLiveVoiceRoomFeed.getClass();
                        qu10 qu10Var = qu10.INSTANCE;
                        String str6 = bLiveVoiceRoomFeed.liveId;
                        str6.getClass();
                        String str7 = bLiveVoiceRoomFeed.anchorId;
                        str7.getClass();
                        List<BLiveComplexUser> list2 = m112736f().get(i).users;
                        list2.getClass();
                        qu10Var.m178100i(str6, str7, i2, list2, true);
                        multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.yu10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                cv10.m112734d(this.f201563a, i, bLiveVoiceRoomFeed, view2);
                            }
                        });
                    } else {
                        this.videoHolderList.add(multipleLiveFourItem);
                        final BLiveSuggestLive bLiveSuggestLive = m112736f().get(i).live;
                        bLiveSuggestLive.getClass();
                        qu10 qu10Var2 = qu10.INSTANCE;
                        String str8 = bLiveSuggestLive.f45298id;
                        str8.getClass();
                        String str9 = bLiveSuggestLive.anchor.f45299id;
                        str9.getClass();
                        String recommendCategory = bLiveSuggestLive.getRecommendCategory();
                        recommendCategory.getClass();
                        qu10.m178093d(qu10Var2, str8, str9, i2, recommendCategory, false, 16, null);
                        multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.av10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                cv10.m112733c(this.f73576a, bLiveSuggestLive, i, view2);
                            }
                        });
                    }
                } else if (str5.equals(NavigationIntent.voiceChat)) {
                    final BLiveMultiCallExtendUser bLiveMultiCallExtendUser = m112736f().get(i).voiceChat;
                    bLiveMultiCallExtendUser.getClass();
                    qu10 qu10Var3 = qu10.INSTANCE;
                    String str10 = bLiveMultiCallExtendUser.f45251id;
                    str10.getClass();
                    qu10Var3.m178098g(i2, str10, true);
                    multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.zu10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            cv10.m112731a(i, bLiveMultiCallExtendUser, this, view2);
                        }
                    });
                } else {
                    this.videoHolderList.add(multipleLiveFourItem);
                    final BLiveSuggestLive bLiveSuggestLive2 = m112736f().get(i).live;
                    bLiveSuggestLive2.getClass();
                    qu10 qu10Var4 = qu10.INSTANCE;
                    String str11 = bLiveSuggestLive2.f45298id;
                    str11.getClass();
                    String str12 = bLiveSuggestLive2.anchor.f45299id;
                    str12.getClass();
                    String recommendCategory2 = bLiveSuggestLive2.getRecommendCategory();
                    recommendCategory2.getClass();
                    qu10.m178093d(qu10Var4, str11, str12, i2, recommendCategory2, false, 16, null);
                    multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.av10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            cv10.m112733c(this.f73576a, bLiveSuggestLive2, i, view2);
                        }
                    });
                }
            }
            i = i2;
        }
        m112740j();
    }

    /* JADX INFO: renamed from: a */
    public static void m112731a(int i, BLiveMultiCallExtendUser bLiveMultiCallExtendUser, cv10 cv10Var, View view) {
        String str = bLiveMultiCallExtendUser.f45251id;
        str.getClass();
        qu10.INSTANCE.m178097f(i + 1, str, true);
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser2 = cv10Var.m112736f().get(i).voiceChat;
        bLiveMultiCallExtendUser2.getClass();
        cv10Var.m112738h(bLiveMultiCallExtendUser2);
    }

    /* JADX INFO: renamed from: b */
    public static void m112732b(cv10 cv10Var, Long l2) {
        Iterator<MultipleLiveFourItem> it = cv10Var.videoHolderList.iterator();
        it.getClass();
        while (it.hasNext()) {
            MultipleLiveFourItem next = it.next();
            next.getClass();
            next.m71984i0();
        }
        Collections.shuffle(cv10Var.videoHolderList);
        if (cv10Var.videoHolderList.size() > 1) {
            cv10Var.videoHolderList.get(0).m71983h0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m112733c(cv10 cv10Var, BLiveSuggestLive bLiveSuggestLive, int i, View view) {
        cv10Var.m112737g(bLiveSuggestLive);
        qu10 qu10Var = qu10.INSTANCE;
        String str = bLiveSuggestLive.f45298id;
        str.getClass();
        String str2 = bLiveSuggestLive.anchor.f45299id;
        str2.getClass();
        String recommendCategory = bLiveSuggestLive.getRecommendCategory();
        recommendCategory.getClass();
        qu10Var.m178095b(str, str2, i + 1, recommendCategory, false, true);
    }

    /* JADX INFO: renamed from: d */
    public static void m112734d(cv10 cv10Var, int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, View view) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed2 = cv10Var.m112736f().get(i).voiceFeed;
        bLiveVoiceRoomFeed2.getClass();
        cv10Var.m112739i(bLiveVoiceRoomFeed2);
        qu10 qu10Var = qu10.INSTANCE;
        String str = bLiveVoiceRoomFeed.liveId;
        str.getClass();
        String str2 = bLiveVoiceRoomFeed.anchorId;
        str2.getClass();
        List<BLiveComplexUser> list = cv10Var.m112736f().get(i).users;
        list.getClass();
        qu10Var.m178099h(str, str2, i + 1, list, true);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final BLiveComplexCardFourConfig m112735e() {
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = this.cardConfig;
        if (bLiveComplexCardFourConfig != null) {
            return bLiveComplexCardFourConfig;
        }
        Intrinsics.m88391r("cardConfig");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ArrayList<BLiveComplexCard> m112736f() {
        ArrayList<BLiveComplexCard> arrayList = this.cardList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.m88391r("cardList");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m112737g(BLiveSuggestLive live) {
        this.parentView.getContext().startActivity(tbs.f172993f.m143704f(this.parentView.getContext(), AudienceStartData.getBuilder().m68775C(true).m68776D(live.expendToFullLive()).m68787O(this.SOURCE).m68794u()));
    }

    /* JADX INFO: renamed from: h */
    public final void m112738h(BLiveMultiCallExtendUser voiceChat) {
        if (this.parentView.getContext() instanceof Activity) {
            Context context = this.parentView.getContext();
            context.getClass();
            nae0.m162083m((Activity) context, Uri.parse("tantanapp://enterVoiceChat?source=" + this.SOURCE + "&fromUserId=" + voiceChat.f45251id));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m112739i(BLiveVoiceRoomFeed voiceFeed) {
        iqn0.m141678f(this.parentView.getContext(), voiceFeed, "", false);
    }

    /* JADX INFO: renamed from: j */
    public final void m112740j() {
        kcg0 kcg0Var = this.subscription;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.subscription = C22421c.interval(0L, 10L, TimeUnit.SECONDS).onBackpressureDrop().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.bv10
            @Override // p153l.y20
            public final void call(Object obj) {
                cv10.m112732b(this.f78568a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m112741k() {
        kcg0 kcg0Var = this.subscription;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        Iterator<MultipleLiveFourItem> it = this.videoHolderList.iterator();
        it.getClass();
        while (it.hasNext()) {
            MultipleLiveFourItem next = it.next();
            next.getClass();
            next.m71984i0();
        }
        this.videoHolderList.clear();
        this.itemList.clear();
    }

    /* JADX INFO: renamed from: l */
    public final void m112742l(@NotNull BLiveComplexCardFourConfig bLiveComplexCardFourConfig) {
        bLiveComplexCardFourConfig.getClass();
        this.cardConfig = bLiveComplexCardFourConfig;
    }

    /* JADX INFO: renamed from: m */
    public final void m112743m(@NotNull ArrayList<BLiveComplexCard> arrayList) {
        arrayList.getClass();
        this.cardList = arrayList;
    }
}
