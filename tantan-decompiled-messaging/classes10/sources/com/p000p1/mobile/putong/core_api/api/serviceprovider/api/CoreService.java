package com.p000p1.mobile.putong.core_api.api.serviceprovider.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.label.LabelStyle;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.Banners;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IntlOperationArticles;
import com.p1.mobile.putong.data.IntlOperationBanner;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.StickerInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VisitorCounter;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.d30;
import l.e30;
import l.eb2;
import l.eqd0;
import l.f30;
import l.g30;
import l.hpd0;
import l.j760;
import l.k8k0;
import l.knb0;
import l.kye;
import l.l5j0;
import l.q860;
import l.roj0;
import l.s7m;
import l.xaj0;
import l.zpd0;
import p003l.e1m;
import p003l.op8;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface CoreService extends IProvider, k8k0 {
    /* JADX INFO: renamed from: Ap */
    void m5070Ap(Act act, User user, boolean z, Relationship relationship);

    /* JADX INFO: renamed from: Ar */
    Intent m5071Ar(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: B6 */
    void m5072B6();

    /* JADX INFO: renamed from: Ba */
    hpd0 m5073Ba();

    /* JADX INFO: renamed from: Br */
    boolean m5074Br();

    /* JADX INFO: renamed from: Cb */
    void m5075Cb(Envelope envelope);

    /* JADX INFO: renamed from: Ch */
    String m5076Ch();

    /* JADX INFO: renamed from: Dd */
    void m5077Dd();

    /* JADX INFO: renamed from: Dh */
    boolean m5078Dh();

    /* JADX INFO: renamed from: Dm */
    String m5079Dm();

    /* JADX INFO: renamed from: Dp */
    boolean m5080Dp();

    /* JADX INFO: renamed from: E5 */
    c<View> m5081E5(Act act);

    /* JADX INFO: renamed from: F0 */
    String m5082F0();

    /* JADX INFO: renamed from: F2 */
    String m5083F2();

    /* JADX INFO: renamed from: Fc */
    void m5084Fc(Act act, StickerInfo stickerInfo, e30<StickerInfo> e30Var);

    /* JADX INFO: renamed from: Ff */
    void m5085Ff(Act act, StickerInfo stickerInfo);

    /* JADX INFO: renamed from: Fo */
    void m5086Fo(Context context);

    /* JADX INFO: renamed from: Gb */
    void m5087Gb(Context context);

    /* JADX INFO: renamed from: Gn */
    boolean m5088Gn();

    /* JADX INFO: renamed from: Hp */
    void m5089Hp(Act act, String str);

    /* JADX INFO: renamed from: I4 */
    boolean m5090I4();

    /* JADX INFO: renamed from: Ia */
    boolean m5091Ia(User user);

    /* JADX INFO: renamed from: Ic */
    boolean m5092Ic();

    /* JADX INFO: renamed from: Id */
    int m5093Id();

    /* JADX INFO: renamed from: Ij */
    void m5094Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2);

    /* JADX INFO: renamed from: Io */
    void m5095Io(String str);

    /* JADX INFO: renamed from: Jn */
    Class<?> m5096Jn();

    /* JADX INFO: renamed from: Jq */
    void m5097Jq();

    /* JADX INFO: renamed from: Js */
    c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> m5098Js();

    /* JADX INFO: renamed from: K9 */
    void m5099K9(String str, List<String> list, boolean z);

    /* JADX INFO: renamed from: Kg */
    View m5100Kg(Context context, String str, String str2, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Km */
    void m5101Km(Act act, SettingGroups settingGroups);

    /* JADX INFO: renamed from: Lk */
    boolean m5102Lk(String str);

    /* JADX INFO: renamed from: Lo */
    int m5103Lo();

    /* JADX INFO: renamed from: M2 */
    void m5104M2(Act act, User user, String str);

    /* JADX INFO: renamed from: M9 */
    c<Boolean> m5105M9(String str);

    /* JADX INFO: renamed from: Md */
    boolean m5106Md();

    /* JADX INFO: renamed from: Mq */
    void m5107Mq(Long l2);

    /* JADX INFO: renamed from: Ne */
    void m5108Ne(Long l2);

    /* JADX INFO: renamed from: Ng */
    View m5109Ng(Context context, String str);

    /* JADX INFO: renamed from: Ni */
    void m5110Ni(Act act, String str, String str2, d30 d30Var);

    /* JADX INFO: renamed from: O1 */
    String m5111O1();

    /* JADX INFO: renamed from: Oa */
    void m5112Oa(Act act, String str, String str2, Boolean bool);

    /* JADX INFO: renamed from: P3 */
    c<Boolean> m5113P3();

    /* JADX INFO: renamed from: Pg */
    List<IntlOperationBanner> m5114Pg();

    /* JADX INFO: renamed from: Pq */
    void m5115Pq(Act act, boolean z);

    /* JADX INFO: renamed from: Ps */
    Intent m5116Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3);

    /* JADX INFO: renamed from: Q2 */
    boolean m5117Q2();

    /* JADX INFO: renamed from: Q7 */
    void m5118Q7(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    /* JADX INFO: renamed from: Q9 */
    l5j0 m5119Q9(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user);

    /* JADX INFO: renamed from: Qf */
    boolean m5120Qf();

    /* JADX INFO: renamed from: Rb */
    void m5121Rb(Act act, String str);

    /* JADX INFO: renamed from: Rp */
    void m5122Rp(String str);

    /* JADX INFO: renamed from: Rs */
    void m5123Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2);

    /* JADX INFO: renamed from: Sa */
    void m5124Sa(Act act, String str, String str2);

    /* JADX INFO: renamed from: Sr */
    void m5125Sr(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Ug */
    void m5126Ug(Act act, String str);

    /* JADX INFO: renamed from: Us */
    void m5127Us(Act act);

    /* JADX INFO: renamed from: Vk */
    void m5128Vk(Act act, String str, String str2, String str3, String str4, Channel channel, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Vr */
    void m5129Vr();

    /* JADX INFO: renamed from: W2 */
    c<Boolean> m5130W2();

    /* JADX INFO: renamed from: Wp */
    boolean m5131Wp();

    /* JADX INFO: renamed from: Wq */
    boolean m5132Wq();

    /* JADX INFO: renamed from: Xd */
    void m5133Xd();

    /* JADX INFO: renamed from: Y3 */
    String m5134Y3();

    /* JADX INFO: renamed from: Y6 */
    void m5135Y6(Act act, String str);

    /* JADX INFO: renamed from: Yn */
    void m5136Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5);

    /* JADX INFO: renamed from: Z3 */
    boolean m5137Z3(Activity activity);

    /* JADX INFO: renamed from: Zb */
    void m5138Zb(TabName tabName, boolean z);

    /* JADX INFO: renamed from: Zj */
    ConversationStatus m5139Zj(String str);

    /* JADX INFO: renamed from: a */
    op8 m5140a();

    /* JADX INFO: renamed from: aa */
    void m5141aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6);

    /* JADX INFO: renamed from: ab */
    c<ConversationStatus> m5142ab(String str);

    /* JADX INFO: renamed from: as */
    void m5143as(boolean z);

    /* JADX INFO: renamed from: b3 */
    int m5144b3();

    /* JADX INFO: renamed from: b6 */
    View m5145b6(Act act, EditText editText, boolean z, e30<Boolean> e30Var, boolean z2);

    c<roj0> blocks(String str);

    /* JADX INFO: renamed from: bs */
    void m5146bs(Context context, View view, String str);

    /* JADX INFO: renamed from: c9 */
    void m5147c9(View view, int i);

    /* JADX INFO: renamed from: ci */
    void m5148ci(String str, String str2, String str3, boolean z);

    /* JADX INFO: renamed from: ck */
    boolean m5149ck();

    void clearCounterUnread();

    void clearRequests(String str, int i);

    void clearUnReadLikes();

    void clearUnreadFans();

    void confirmThenUnmatch(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2);

    c<Counter> counter();

    Counter counter_();

    /* JADX INFO: renamed from: cs */
    boolean m5150cs();

    /* JADX INFO: renamed from: d2 */
    eb2 m5151d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.a> arrayList, List<List<String>> list, d30 d30Var);

    /* JADX INFO: renamed from: db */
    int m5152db(LabelStyle labelStyle);

    void deleteConversationAndRelated(String str);

    /* JADX INFO: renamed from: dg */
    HashMap<String, Boolean> m5153dg(Envelope envelope);

    void dismissGpBindPhoneRedDot();

    /* JADX INFO: renamed from: dk */
    void m5154dk(Boolean bool);

    /* JADX INFO: renamed from: dl */
    void m5155dl(Act act, boolean z, d30 d30Var);

    void doGPPayment(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: e9 */
    int m5156e9(LabelStyle labelStyle);

    /* JADX INFO: renamed from: eb */
    c<Boolean> m5157eb();

    /* JADX INFO: renamed from: ec */
    void m5158ec();

    /* JADX INFO: renamed from: ef */
    b<Boolean> m5159ef();

    /* JADX INFO: renamed from: em */
    void m5160em(Act act, String str, String str2);

    /* JADX INFO: renamed from: fp */
    void m5161fp();

    /* JADX INFO: renamed from: g4 */
    boolean m5162g4();

    /* JADX INFO: renamed from: gc */
    void m5163gc();

    a<roj0> getAutoPlayVideoBs();

    c<Banners> getBannersObs(BannerLoc bannerLoc);

    String getCurrencyProductCategory();

    String getGPMemo(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup);

    c<Bundle> getNewMainBundleBs(TabName tabName);

    c<Boolean> getNewMainLiveTabSelectBs();

    c<Boolean> getNewMainMomentTabSelectBs();

    long getSeeLastReadTime();

    Integer getSessionChangedProfile();

    Class<?> getSubscriptionsActClass();

    b<xaj0<Integer, Integer, String>> getTPayResultBs();

    c<SettingGroups> getUserSettings();

    long getUserSwipeCount();

    /* JADX INFO: renamed from: gi */
    BottomSheetDialog m5164gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var);

    /* JADX INFO: renamed from: gp */
    boolean m5165gp(String str);

    c<PaymentData> h5PayCanUseForLive();

    /* JADX INFO: renamed from: hd */
    void m5166hd(Act act, String str, String str2, String str3);

    boolean hideActiveTime(User user);

    boolean hideAge(User user);

    boolean hideLocation(User user);

    void hideTabBarWhenNewUIMomentIsCurrentTab(Act act);

    /* JADX INFO: renamed from: hj */
    void m5167hj(s7m s7mVar, PushMessage pushMessage);

    /* JADX INFO: renamed from: i0 */
    c<View> m5168i0(Act act);

    /* JADX INFO: renamed from: i5 */
    c<Boolean> m5169i5(Act act, @Nullable String str);

    /* JADX INFO: renamed from: i7 */
    PutongFrag m5170i7(String str, BubbleInfo bubbleInfo, int i);

    /* JADX INFO: renamed from: i8 */
    <T extends ValueObject> T m5171i8(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: i9 */
    c<roj0> m5172i9();

    /* JADX INFO: renamed from: ie */
    <T extends ValueObject> c<T> m5173ie(JsonAdapter<T> jsonAdapter, String str, String str2, boolean z);

    /* JADX INFO: renamed from: ii */
    Intent m5174ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2);

    boolean instanceofPersonalDetailsAct(Act act);

    boolean isCurrentMessageBlock(String str);

    boolean isCurrentTabMomentFrag(Act act);

    c<Boolean> isHideRedByNewUser();

    boolean isHttpDnsOpen();

    boolean isLiveNeedDisableAudio(Activity activity);

    boolean isMainPage(Act act);

    c<Boolean> isMatched(String str);

    boolean isMatchedSync(String str);

    boolean isNewMainActContext(Activity activity);

    boolean isPurchaseDialogShowing();

    /* JADX INFO: renamed from: ja */
    zpd0 m5175ja();

    /* JADX INFO: renamed from: jc */
    void m5176jc(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2);

    /* JADX INFO: renamed from: jg */
    void m5177jg(Act act, boolean z);

    /* JADX INFO: renamed from: jp */
    boolean m5178jp(String str, String str2, String str3);

    /* JADX INFO: renamed from: k2 */
    c<String> m5179k2();

    /* JADX INFO: renamed from: k4 */
    boolean m5180k4();

    /* JADX INFO: renamed from: k7 */
    b<Boolean> m5181k7();

    /* JADX INFO: renamed from: k9 */
    Intent m5182k9(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: ki */
    void m5183ki(Activity activity);

    /* JADX INFO: renamed from: kj */
    void m5184kj(Act act, String str, String str2, f30<Boolean, String> f30Var);

    /* JADX INFO: renamed from: kk */
    void m5185kk(Act act);

    /* JADX INFO: renamed from: kn */
    void m5186kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    /* JADX INFO: renamed from: ks */
    c<roj0> m5187ks(String str, String str2, String str3, d30 d30Var);

    /* JADX INFO: renamed from: kt */
    void m5188kt();

    c<roj0> loadLikers(Links links, long j, int i);

    <T extends ValueObject, K extends ValueObject> c<List<T>> localiseMerchandises(Act act, List<K> list, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: m2 */
    boolean m5189m2();

    /* JADX INFO: renamed from: m8 */
    boolean m5190m8(String str);

    /* JADX INFO: renamed from: ma */
    Intent m5191ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7);

    @Nullable
    /* JADX INFO: renamed from: mc */
    VisitorCounter m5192mc();

    /* JADX INFO: renamed from: me */
    c<User> m5193me();

    User me_();

    <T extends ValueObject> c<List<T>> merchandises(String str, boolean z, JsonAdapter<T> jsonAdapter);

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    /* JADX INFO: renamed from: ml */
    void m5194ml(String str);

    /* JADX INFO: renamed from: mm */
    void m5195mm(VImage vImage, boolean z);

    c<q860<User>> momentSeeAbLikers();

    /* JADX INFO: renamed from: mq */
    void m5196mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5);

    /* JADX INFO: renamed from: n6 */
    void m5197n6(String str);

    /* JADX INFO: renamed from: nd */
    boolean m5198nd();

    Intent newMainActClearStack(Context context, boolean z);

    Intent newMainActClearStack(Context context, boolean z, boolean z2);

    eqd0 notificationSettings();

    /* JADX INFO: renamed from: ns */
    int m5199ns();

    /* JADX INFO: renamed from: od */
    <T extends ValueObject> c<List<T>> m5200od(String str, JsonAdapter<T> jsonAdapter);

    void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod);

    j760<Integer, Integer> onlineMatchCaculaterBlur(int i);

    /* JADX INFO: renamed from: p7 */
    void m5201p7(View view, Object obj, Media media);

    /* JADX INFO: renamed from: pa */
    void m5202pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles);

    c<roj0> patch(User user);

    c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings);

    c<roj0> patchSettings(SettingGroups settingGroups);

    /* JADX INFO: renamed from: pe */
    boolean m5203pe();

    /* JADX INFO: renamed from: pm */
    Intent m5204pm(Context context, boolean z, boolean z2);

    c<roj0> pollConversation();

    void pollUserCounters();

    /* JADX INFO: renamed from: pq */
    boolean m5205pq();

    /* JADX INFO: renamed from: ps */
    void m5206ps(String str);

    /* JADX INFO: renamed from: q7 */
    boolean m5207q7();

    /* JADX INFO: renamed from: q8 */
    String m5208q8();

    /* JADX INFO: renamed from: q9 */
    void m5209q9(Act act, String str, d30 d30Var);

    /* JADX INFO: renamed from: qh */
    Object m5210qh(View view);

    /* JADX INFO: renamed from: qp */
    String m5211qp();

    User queryMe();

    c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z);

    c<roj0> refreshUser(String str);

    c<roj0> refreshUser(String str, boolean z);

    void registerPurchaseDialogListener(e1m e1mVar);

    void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2);

    c<roj0> report(String str, String str2, Report report);

    <T extends ValueObject> void resendDialog(Act act, T t);

    /* JADX INFO: renamed from: rg */
    boolean m5212rg();

    /* JADX INFO: renamed from: rr */
    boolean m5213rr();

    /* JADX INFO: renamed from: s0 */
    void m5214s0(Act act, String str);

    /* JADX INFO: renamed from: s2 */
    void m5215s2(Context context, String str);

    /* JADX INFO: renamed from: se */
    c<List<RecommendMessage>> m5216se(String str);

    void setIfShowTabBarInNewUI(Act act, boolean z);

    void setMomentTabDot(Act act, boolean z);

    void setMomentTabNum(Act act, int i);

    void setNewMainActClass(Context context, Intent intent);

    void setTabDot(Act act, TabName tabName, boolean z);

    void setTabNum(Act act, TabName tabName, int i);

    /* JADX INFO: renamed from: sg */
    boolean m5217sg(String str);

    boolean shouldLockComment(String str);

    boolean shouldShowAutoPay();

    void showAutoPayHelp(Act act);

    void showBanner(Act act, ViewGroup viewGroup, Banners banners);

    void showBindPhoneDialog(Act act, d30 d30Var);

    void showLocationPermissionCallbackDlg(Act act, d30 d30Var, d30 d30Var2, boolean z, boolean z2, String str);

    boolean showMomentBanner();

    void showProofAgeDlg(Act act, String str);

    void showSeeDialog(Act act, d30 d30Var, String str);

    void showUserVerificationLogo(Context context, User user, VImage vImage);

    void showVipPurchaseDialog(Act act, String str);

    void skipH5PayActivityFromLive(Act act, String str, boolean z);

    /* JADX INFO: renamed from: sq */
    void m5218sq(Act act, String str, d30 d30Var, d30 d30Var2, d30 d30Var3);

    void startJailedDialogLikeAct();

    Intent startLikersAct(Context context, String str);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i);

    Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6);

    /* JADX INFO: renamed from: te */
    boolean m5219te();

    /* JADX INFO: renamed from: tg */
    int m5220tg();

    Intent toIntlMaps(Context context, int i, boolean z);

    Intent toMessagesActFromPush(Context context, String str, String str2);

    Intent toNewMainAct(Context context, NavigationIntent navigationIntent);

    Intent toNewMainAct(Context context, boolean z, boolean z2);

    Intent toNewMainActFromPush(Context context, String str, String str2);

    Intent toPassWordResetAct(Act act, VerifyData verifyData);

    Intent toReportAct(Context context, String str, boolean z, ResultReceiver resultReceiver);

    void trackBannerMV(Banners banners);

    void triggerCounterFromMemoryCache(Counter counter);

    /* JADX INFO: renamed from: u7 */
    b<j760<Boolean, Integer>> m5221u7();

    /* JADX INFO: renamed from: u8 */
    a<roj0> m5222u8();

    /* JADX INFO: renamed from: uf */
    void m5223uf(String str);

    void unregisterPurchaseDialogListener(e1m e1mVar);

    /* JADX INFO: renamed from: up */
    void m5224up(Act act, e30<Boolean> e30Var);

    void updateUnreadActivitiesByMoment(int i);

    /* JADX INFO: renamed from: ur */
    void m5225ur(Act act, String str, e30<Boolean> e30Var);

    c<User> userObsById(String str);

    Intent userStoryAct(Context context, String str, String str2);

    /* JADX INFO: renamed from: ut */
    void m5226ut();

    /* JADX INFO: renamed from: v8 */
    void m5227v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    void verifyAppealIdentity(Act act, PhoneNumber phoneNumber);

    /* JADX INFO: renamed from: vn */
    long m5228vn(User user);

    /* JADX INFO: renamed from: vq */
    IntlOperationArticles m5229vq();

    /* JADX INFO: renamed from: w7 */
    Intent m5230w7(Context context);

    /* JADX INFO: renamed from: w8 */
    boolean m5231w8(Act act);

    c<roj0> waitPatchSettings();

    /* JADX INFO: renamed from: wb */
    c<roj0> m5232wb();

    /* JADX INFO: renamed from: xf */
    boolean m5233xf();

    /* JADX INFO: renamed from: xs */
    c<roj0> m5234xs(String str);

    /* JADX INFO: renamed from: yd */
    boolean m5235yd(String str);

    /* JADX INFO: renamed from: yf */
    void m5236yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3);

    /* JADX INFO: renamed from: yo */
    View m5237yo(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, boolean z, View view);

    /* JADX INFO: renamed from: yp */
    Intent m5238yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3);

    /* JADX INFO: renamed from: yr */
    c<TabName> m5239yr();

    /* JADX INFO: renamed from: z8 */
    void m5240z8(Act act, String str);

    /* JADX INFO: renamed from: ze */
    void m5241ze(Act act);

    /* JADX INFO: renamed from: zp */
    Intent m5242zp(Context context, IntentParams intentParams);
}
