package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexCardFourConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallExtendUser;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.page.swipecard.MultipleLiveFourItem;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020#0\u001dj\b\u0012\u0004\u0012\u00020#`\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010>\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b+\u0010;\"\u0004\b<\u0010=R'\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b?\u0010&R$\u0010G\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Ll/um10;", "", "Landroid/view/View;", "parentView", "data", "<init>", "(Landroid/view/View;Ljava/lang/Object;)V", "", "k", "()V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallExtendUser;", NavigationIntent.voiceChat, "h", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallExtendUser;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;", "voiceFeed", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomFeed;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "live", "g", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;)V", "a", "Landroid/view/View;", "", "b", "Ljava/lang/String;", "SOURCE", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/external/page/swipecard/MultipleLiveFourItem;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "itemList", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCard;", Constants.INAPP_DATA_TAG, "f", "()Ljava/util/ArrayList;", "m", "(Ljava/util/ArrayList;)V", "cardList", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "title", "Lv/VText;", "Lv/VText;", "getSubtitle", "()Lv/VText;", "setSubtitle", "(Lv/VText;)V", "subtitle", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", "Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", "()Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/live/base/data/BLiveComplexCardFourConfig;)V", "cardConfig", "getVideoHolderList", "videoHolderList", "Ll/c4g0;", "Ll/c4g0;", "getSubscription", "()Ll/c4g0;", "setSubscription", "(Ll/c4g0;)V", "subscription", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SuppressLint({"SetTextI18n"})
public final class um10 {

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
    public c4g0 subscription;

    /* JADX WARN: Code duplicated, block: B:30:0x015b  */
    public um10(@NotNull View view, @NotNull Object obj) {
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
            m194300m((ArrayList) list);
            BLiveComplexCardFourConfig bLiveComplexCardFourConfig = bLiveData.complexCardConfig;
            bLiveComplexCardFourConfig.getClass();
            m194299l(bLiveComplexCardFourConfig);
        }
        arrayList.clear();
        this.itemList.clear();
        View viewFindViewById = view.findViewById(f5c0.f95135q2);
        viewFindViewById.getClass();
        this.title = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(f5c0.f95131p2);
        viewFindViewById2.getClass();
        this.subtitle = (VText) viewFindViewById2;
        this.itemList.add((MultipleLiveFourItem) view.findViewById(f5c0.f95161x0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(f5c0.f95165y0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(f5c0.f95169z0));
        this.itemList.add((MultipleLiveFourItem) view.findViewById(f5c0.f94978A0));
        TextView textView = this.title;
        String str3 = m194292e().title;
        str3.getClass();
        if (str3.length() == 0) {
            str = "内容精选";
        } else {
            str = m194292e().title;
            str.getClass();
        }
        textView.setText(str);
        VText vText = this.subtitle;
        String str4 = m194292e().subTitle;
        str4.getClass();
        if (str4.length() == 0) {
            str2 = "实时互动 声临其境";
        } else {
            str2 = m194292e().subTitle;
            str2.getClass();
        }
        vText.setText(str2);
        final int i = 0;
        for (MultipleLiveFourItem multipleLiveFourItem : this.itemList) {
            int i2 = i + 1;
            if (i >= m194293f().size() || m194293f().get(i) == null) {
                multipleLiveFourItem.setVisibility(4);
            } else {
                multipleLiveFourItem.setData(m194293f().get(i));
                String str5 = m194293f().get(i).type;
                int iHashCode = str5.hashCode();
                if (iHashCode != -1019543638) {
                    if (iHashCode == -1019457040 && str5.equals("voiceFeed")) {
                        final BLiveVoiceRoomFeed bLiveVoiceRoomFeed = m194293f().get(i).voiceFeed;
                        bLiveVoiceRoomFeed.getClass();
                        im10 im10Var = im10.INSTANCE;
                        String str6 = bLiveVoiceRoomFeed.liveId;
                        str6.getClass();
                        String str7 = bLiveVoiceRoomFeed.anchorId;
                        str7.getClass();
                        List<BLiveComplexUser> list2 = m194293f().get(i).users;
                        list2.getClass();
                        im10Var.m137066i(str6, str7, i2, list2, true);
                        multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.qm10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                um10.m194291d(this.f155271a, i, bLiveVoiceRoomFeed, view2);
                            }
                        });
                    } else {
                        this.videoHolderList.add(multipleLiveFourItem);
                        final BLiveSuggestLive bLiveSuggestLive = m194293f().get(i).live;
                        bLiveSuggestLive.getClass();
                        im10 im10Var2 = im10.INSTANCE;
                        String str8 = bLiveSuggestLive.f44450id;
                        str8.getClass();
                        String str9 = bLiveSuggestLive.anchor.f44451id;
                        str9.getClass();
                        String recommendCategory = bLiveSuggestLive.getRecommendCategory();
                        recommendCategory.getClass();
                        im10.m137059d(im10Var2, str8, str9, i2, recommendCategory, false, 16, null);
                        multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.sm10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                um10.m194290c(this.f165315a, bLiveSuggestLive, i, view2);
                            }
                        });
                    }
                } else if (str5.equals(NavigationIntent.voiceChat)) {
                    final BLiveMultiCallExtendUser bLiveMultiCallExtendUser = m194293f().get(i).voiceChat;
                    bLiveMultiCallExtendUser.getClass();
                    im10 im10Var3 = im10.INSTANCE;
                    String str10 = bLiveMultiCallExtendUser.f44403id;
                    str10.getClass();
                    im10Var3.m137064g(i2, str10, true);
                    multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.rm10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            um10.m194288a(i, bLiveMultiCallExtendUser, this, view2);
                        }
                    });
                } else {
                    this.videoHolderList.add(multipleLiveFourItem);
                    final BLiveSuggestLive bLiveSuggestLive2 = m194293f().get(i).live;
                    bLiveSuggestLive2.getClass();
                    im10 im10Var4 = im10.INSTANCE;
                    String str11 = bLiveSuggestLive2.f44450id;
                    str11.getClass();
                    String str12 = bLiveSuggestLive2.anchor.f44451id;
                    str12.getClass();
                    String recommendCategory2 = bLiveSuggestLive2.getRecommendCategory();
                    recommendCategory2.getClass();
                    im10.m137059d(im10Var4, str11, str12, i2, recommendCategory2, false, 16, null);
                    multipleLiveFourItem.setOnClickListener(new View.OnClickListener() { // from class: l.sm10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            um10.m194290c(this.f165315a, bLiveSuggestLive2, i, view2);
                        }
                    });
                }
            }
            i = i2;
        }
        m194297j();
    }

    /* JADX INFO: renamed from: a */
    public static void m194288a(int i, BLiveMultiCallExtendUser bLiveMultiCallExtendUser, um10 um10Var, View view) {
        String str = bLiveMultiCallExtendUser.f44403id;
        str.getClass();
        im10.INSTANCE.m137063f(i + 1, str, true);
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser2 = um10Var.m194293f().get(i).voiceChat;
        bLiveMultiCallExtendUser2.getClass();
        um10Var.m194295h(bLiveMultiCallExtendUser2);
    }

    /* JADX INFO: renamed from: b */
    public static void m194289b(um10 um10Var, Long l2) {
        Iterator<MultipleLiveFourItem> it = um10Var.videoHolderList.iterator();
        it.getClass();
        while (it.hasNext()) {
            MultipleLiveFourItem next = it.next();
            next.getClass();
            next.m70801i0();
        }
        Collections.shuffle(um10Var.videoHolderList);
        if (um10Var.videoHolderList.size() > 1) {
            um10Var.videoHolderList.get(0).m70800h0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m194290c(um10 um10Var, BLiveSuggestLive bLiveSuggestLive, int i, View view) {
        um10Var.m194294g(bLiveSuggestLive);
        im10 im10Var = im10.INSTANCE;
        String str = bLiveSuggestLive.f44450id;
        str.getClass();
        String str2 = bLiveSuggestLive.anchor.f44451id;
        str2.getClass();
        String recommendCategory = bLiveSuggestLive.getRecommendCategory();
        recommendCategory.getClass();
        im10Var.m137061b(str, str2, i + 1, recommendCategory, false, true);
    }

    /* JADX INFO: renamed from: d */
    public static void m194291d(um10 um10Var, int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, View view) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed2 = um10Var.m194293f().get(i).voiceFeed;
        bLiveVoiceRoomFeed2.getClass();
        um10Var.m194296i(bLiveVoiceRoomFeed2);
        im10 im10Var = im10.INSTANCE;
        String str = bLiveVoiceRoomFeed.liveId;
        str.getClass();
        String str2 = bLiveVoiceRoomFeed.anchorId;
        str2.getClass();
        List<BLiveComplexUser> list = um10Var.m194293f().get(i).users;
        list.getClass();
        im10Var.m137065h(str, str2, i + 1, list, true);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final BLiveComplexCardFourConfig m194292e() {
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = this.cardConfig;
        if (bLiveComplexCardFourConfig != null) {
            return bLiveComplexCardFourConfig;
        }
        Intrinsics.m87502r("cardConfig");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ArrayList<BLiveComplexCard> m194293f() {
        ArrayList<BLiveComplexCard> arrayList = this.cardList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.m87502r("cardList");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m194294g(BLiveSuggestLive live) {
        this.parentView.getContext().startActivity(s9s.f163232f.m134373f(this.parentView.getContext(), AudienceStartData.getBuilder().m67592C(true).m67593D(live.expendToFullLive()).m67604O(this.SOURCE).m67611u()));
    }

    /* JADX INFO: renamed from: h */
    public final void m194295h(BLiveMultiCallExtendUser voiceChat) {
        if (this.parentView.getContext() instanceof Activity) {
            Context context = this.parentView.getContext();
            context.getClass();
            j2e0.m139446m((Activity) context, Uri.parse("tantanapp://enterVoiceChat?source=" + this.SOURCE + "&fromUserId=" + voiceChat.f44403id));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m194296i(BLiveVoiceRoomFeed voiceFeed) {
        ehn0.m116503f(this.parentView.getContext(), voiceFeed, "", false);
    }

    /* JADX INFO: renamed from: j */
    public final void m194297j() {
        c4g0 c4g0Var = this.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.subscription = C22306c.interval(0L, 10L, TimeUnit.SECONDS).onBackpressureDrop().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.tm10
            @Override // p149l.e30
            public final void call(Object obj) {
                um10.m194289b(this.f171125a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m194298k() {
        c4g0 c4g0Var = this.subscription;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        Iterator<MultipleLiveFourItem> it = this.videoHolderList.iterator();
        it.getClass();
        while (it.hasNext()) {
            MultipleLiveFourItem next = it.next();
            next.getClass();
            next.m70801i0();
        }
        this.videoHolderList.clear();
        this.itemList.clear();
    }

    /* JADX INFO: renamed from: l */
    public final void m194299l(@NotNull BLiveComplexCardFourConfig bLiveComplexCardFourConfig) {
        bLiveComplexCardFourConfig.getClass();
        this.cardConfig = bLiveComplexCardFourConfig;
    }

    /* JADX INFO: renamed from: m */
    public final void m194300m(@NotNull ArrayList<BLiveComplexCard> arrayList) {
        arrayList.getClass();
        this.cardList = arrayList;
    }
}
