package com.p046p1.mobile.putong.core_api.api.serviceprovider.api;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.label.LabelStyle;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VImage;
import p149l.d30;
import p149l.e1m;
import p149l.e30;
import p149l.eb2;
import p149l.eqd0;
import p149l.f30;
import p149l.g30;
import p149l.hpd0;
import p149l.j760;
import p149l.k8k0;
import p149l.knb0;
import p149l.kye;
import p149l.l5j0;
import p149l.op8;
import p149l.q860;
import p149l.roj0;
import p149l.s7m;
import p149l.xaj0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes10.dex */
public interface CoreService extends IProvider, k8k0 {
    /* JADX INFO: renamed from: Ap */
    void mo30672Ap(Act act, User user, boolean z, Relationship relationship);

    /* JADX INFO: renamed from: Ar */
    Intent mo30673Ar(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: B6 */
    void mo30674B6();

    /* JADX INFO: renamed from: Ba */
    hpd0 mo30675Ba();

    /* JADX INFO: renamed from: Br */
    boolean mo30676Br();

    /* JADX INFO: renamed from: Cb */
    void mo30677Cb(Envelope envelope);

    /* JADX INFO: renamed from: Ch */
    String mo30678Ch();

    /* JADX INFO: renamed from: Dd */
    void mo30679Dd();

    /* JADX INFO: renamed from: Dh */
    boolean mo30680Dh();

    /* JADX INFO: renamed from: Dm */
    String mo30681Dm();

    /* JADX INFO: renamed from: Dp */
    boolean mo30682Dp();

    /* JADX INFO: renamed from: E5 */
    C22306c<View> mo30683E5(Act act);

    /* JADX INFO: renamed from: F0 */
    String mo30684F0();

    /* JADX INFO: renamed from: F2 */
    String mo30685F2();

    /* JADX INFO: renamed from: Fc */
    void mo30686Fc(Act act, StickerInfo stickerInfo, e30<StickerInfo> e30Var);

    /* JADX INFO: renamed from: Ff */
    void mo30687Ff(Act act, StickerInfo stickerInfo);

    /* JADX INFO: renamed from: Fo */
    void mo30688Fo(Context context);

    /* JADX INFO: renamed from: Gb */
    void mo30689Gb(Context context);

    /* JADX INFO: renamed from: Gn */
    boolean mo30690Gn();

    /* JADX INFO: renamed from: Hp */
    void mo30691Hp(Act act, String str);

    /* JADX INFO: renamed from: I4 */
    boolean mo30692I4();

    /* JADX INFO: renamed from: Ia */
    boolean mo30693Ia(User user);

    /* JADX INFO: renamed from: Ic */
    boolean mo30694Ic();

    /* JADX INFO: renamed from: Id */
    int mo30695Id();

    /* JADX INFO: renamed from: Ij */
    void mo30696Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2);

    /* JADX INFO: renamed from: Io */
    void mo30697Io(String str);

    /* JADX INFO: renamed from: Jn */
    Class<?> mo30698Jn();

    /* JADX INFO: renamed from: Jq */
    void mo30699Jq();

    /* JADX INFO: renamed from: Js */
    C22306c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> mo30700Js();

    /* JADX INFO: renamed from: K9 */
    void mo30701K9(String str, List<String> list, boolean z);

    /* JADX INFO: renamed from: Kg */
    View mo30702Kg(Context context, String str, String str2, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Km */
    void mo30703Km(Act act, SettingGroups settingGroups);

    /* JADX INFO: renamed from: Lk */
    boolean mo30704Lk(String str);

    /* JADX INFO: renamed from: Lo */
    int mo30705Lo();

    /* JADX INFO: renamed from: M2 */
    void mo30706M2(Act act, User user, String str);

    /* JADX INFO: renamed from: M9 */
    C22306c<Boolean> mo30707M9(String str);

    /* JADX INFO: renamed from: Md */
    boolean mo30708Md();

    /* JADX INFO: renamed from: Mq */
    void mo30709Mq(Long l2);

    /* JADX INFO: renamed from: Ne */
    void mo30710Ne(Long l2);

    /* JADX INFO: renamed from: Ng */
    View mo30711Ng(Context context, String str);

    /* JADX INFO: renamed from: Ni */
    void mo30712Ni(Act act, String str, String str2, d30 d30Var);

    /* JADX INFO: renamed from: O1 */
    String mo30713O1();

    /* JADX INFO: renamed from: Oa */
    void mo30714Oa(Act act, String str, String str2, Boolean bool);

    /* JADX INFO: renamed from: P3 */
    C22306c<Boolean> mo30715P3();

    /* JADX INFO: renamed from: Pg */
    List<IntlOperationBanner> mo30716Pg();

    /* JADX INFO: renamed from: Pq */
    void mo30717Pq(Act act, boolean z);

    /* JADX INFO: renamed from: Ps */
    Intent mo30718Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3);

    /* JADX INFO: renamed from: Q2 */
    boolean mo30719Q2();

    /* JADX INFO: renamed from: Q7 */
    void mo30720Q7(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    /* JADX INFO: renamed from: Q9 */
    l5j0 mo30721Q9(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user);

    /* JADX INFO: renamed from: Qf */
    boolean mo30722Qf();

    /* JADX INFO: renamed from: Rb */
    void mo30723Rb(Act act, String str);

    /* JADX INFO: renamed from: Rp */
    void mo30724Rp(String str);

    /* JADX INFO: renamed from: Rs */
    void mo30725Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2);

    /* JADX INFO: renamed from: Sa */
    void mo30726Sa(Act act, String str, String str2);

    /* JADX INFO: renamed from: Sr */
    void mo30727Sr(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Ug */
    void mo30728Ug(Act act, String str);

    /* JADX INFO: renamed from: Us */
    void mo30729Us(Act act);

    /* JADX INFO: renamed from: Vk */
    void mo30730Vk(Act act, String str, String str2, String str3, String str4, Channel channel, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: Vr */
    void mo30731Vr();

    /* JADX INFO: renamed from: W2 */
    C22306c<Boolean> mo30732W2();

    /* JADX INFO: renamed from: Wp */
    boolean mo30733Wp();

    /* JADX INFO: renamed from: Wq */
    boolean mo30734Wq();

    /* JADX INFO: renamed from: Xd */
    void mo30735Xd();

    /* JADX INFO: renamed from: Y3 */
    String mo30736Y3();

    /* JADX INFO: renamed from: Y6 */
    void mo30737Y6(Act act, String str);

    /* JADX INFO: renamed from: Yn */
    void mo30738Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5);

    /* JADX INFO: renamed from: Z3 */
    boolean mo30739Z3(Activity activity);

    /* JADX INFO: renamed from: Zb */
    void mo30740Zb(TabName tabName, boolean z);

    /* JADX INFO: renamed from: Zj */
    ConversationStatus mo30741Zj(String str);

    /* JADX INFO: renamed from: a */
    op8 mo30742a();

    /* JADX INFO: renamed from: aa */
    void mo30743aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6);

    /* JADX INFO: renamed from: ab */
    C22306c<ConversationStatus> mo30744ab(String str);

    /* JADX INFO: renamed from: as */
    void mo30745as(boolean z);

    /* JADX INFO: renamed from: b3 */
    int mo30746b3();

    /* JADX INFO: renamed from: b6 */
    View mo30747b6(Act act, EditText editText, boolean z, e30<Boolean> e30Var, boolean z2);

    C22306c<roj0> blocks(String str);

    /* JADX INFO: renamed from: bs */
    void mo30748bs(Context context, View view, String str);

    /* JADX INFO: renamed from: c9 */
    void mo30749c9(View view, int i);

    /* JADX INFO: renamed from: ci */
    void mo30750ci(String str, String str2, String str3, boolean z);

    /* JADX INFO: renamed from: ck */
    boolean mo30751ck();

    void clearCounterUnread();

    void clearRequests(String str, int i);

    void clearUnReadLikes();

    void clearUnreadFans();

    void confirmThenUnmatch(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2);

    C22306c<Counter> counter();

    Counter counter_();

    /* JADX INFO: renamed from: cs */
    boolean mo30752cs();

    /* JADX INFO: renamed from: d2 */
    eb2 mo30753d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var);

    /* JADX INFO: renamed from: db */
    int mo30754db(LabelStyle labelStyle);

    void deleteConversationAndRelated(String str);

    /* JADX INFO: renamed from: dg */
    HashMap<String, Boolean> mo30755dg(Envelope envelope);

    void dismissGpBindPhoneRedDot();

    /* JADX INFO: renamed from: dk */
    void mo30756dk(Boolean bool);

    /* JADX INFO: renamed from: dl */
    void mo30757dl(Act act, boolean z, d30 d30Var);

    void doGPPayment(Act act, String str, d30 d30Var, d30 d30Var2);

    /* JADX INFO: renamed from: e9 */
    int mo30758e9(LabelStyle labelStyle);

    /* JADX INFO: renamed from: eb */
    C22306c<Boolean> mo30759eb();

    /* JADX INFO: renamed from: ec */
    void mo30760ec();

    /* JADX INFO: renamed from: ef */
    C22393b<Boolean> mo30761ef();

    /* JADX INFO: renamed from: em */
    void mo30762em(Act act, String str, String str2);

    /* JADX INFO: renamed from: fp */
    void mo30763fp();

    /* JADX INFO: renamed from: g4 */
    boolean mo30764g4();

    /* JADX INFO: renamed from: gc */
    void mo30765gc();

    C22392a<roj0> getAutoPlayVideoBs();

    C22306c<Banners> getBannersObs(BannerLoc bannerLoc);

    String getCurrencyProductCategory();

    String getGPMemo(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup);

    C22306c<Bundle> getNewMainBundleBs(TabName tabName);

    C22306c<Boolean> getNewMainLiveTabSelectBs();

    C22306c<Boolean> getNewMainMomentTabSelectBs();

    long getSeeLastReadTime();

    Integer getSessionChangedProfile();

    Class<?> getSubscriptionsActClass();

    C22393b<xaj0<Integer, Integer, String>> getTPayResultBs();

    C22306c<SettingGroups> getUserSettings();

    long getUserSwipeCount();

    /* JADX INFO: renamed from: gi */
    BottomSheetDialog mo30766gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var);

    /* JADX INFO: renamed from: gp */
    boolean mo30767gp(String str);

    C22306c<PaymentData> h5PayCanUseForLive();

    /* JADX INFO: renamed from: hd */
    void mo30768hd(Act act, String str, String str2, String str3);

    boolean hideActiveTime(User user);

    boolean hideAge(User user);

    boolean hideLocation(User user);

    void hideTabBarWhenNewUIMomentIsCurrentTab(Act act);

    /* JADX INFO: renamed from: hj */
    void mo30769hj(s7m s7mVar, PushMessage pushMessage);

    /* JADX INFO: renamed from: i0 */
    C22306c<View> mo30770i0(Act act);

    /* JADX INFO: renamed from: i5 */
    C22306c<Boolean> mo30771i5(Act act, @Nullable String str);

    /* JADX INFO: renamed from: i7 */
    PutongFrag mo30772i7(String str, BubbleInfo bubbleInfo, int i);

    /* JADX INFO: renamed from: i8 */
    <T extends ValueObject> T mo30773i8(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: i9 */
    C22306c<roj0> mo30774i9();

    /* JADX INFO: renamed from: ie */
    <T extends ValueObject> C22306c<T> mo30775ie(JsonAdapter<T> jsonAdapter, String str, String str2, boolean z);

    /* JADX INFO: renamed from: ii */
    Intent mo30776ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2);

    boolean instanceofPersonalDetailsAct(Act act);

    boolean isCurrentMessageBlock(String str);

    boolean isCurrentTabMomentFrag(Act act);

    C22306c<Boolean> isHideRedByNewUser();

    boolean isHttpDnsOpen();

    boolean isLiveNeedDisableAudio(Activity activity);

    boolean isMainPage(Act act);

    C22306c<Boolean> isMatched(String str);

    boolean isMatchedSync(String str);

    boolean isNewMainActContext(Activity activity);

    boolean isPurchaseDialogShowing();

    /* JADX INFO: renamed from: ja */
    zpd0 mo30777ja();

    /* JADX INFO: renamed from: jc */
    void mo30778jc(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2);

    /* JADX INFO: renamed from: jg */
    void mo30779jg(Act act, boolean z);

    /* JADX INFO: renamed from: jp */
    boolean mo30780jp(String str, String str2, String str3);

    /* JADX INFO: renamed from: k2 */
    C22306c<String> mo30781k2();

    /* JADX INFO: renamed from: k4 */
    boolean mo30782k4();

    /* JADX INFO: renamed from: k7 */
    C22393b<Boolean> mo30783k7();

    /* JADX INFO: renamed from: k9 */
    Intent mo30784k9(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: ki */
    void mo30785ki(Activity activity);

    /* JADX INFO: renamed from: kj */
    void mo30786kj(Act act, String str, String str2, f30<Boolean, String> f30Var);

    /* JADX INFO: renamed from: kk */
    void mo30787kk(Act act);

    /* JADX INFO: renamed from: kn */
    void mo30788kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    /* JADX INFO: renamed from: ks */
    C22306c<roj0> mo30789ks(String str, String str2, String str3, d30 d30Var);

    /* JADX INFO: renamed from: kt */
    void mo30790kt();

    C22306c<roj0> loadLikers(Links links, long j, int i);

    <T extends ValueObject, K extends ValueObject> C22306c<List<T>> localiseMerchandises(Act act, List<K> list, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: m2 */
    boolean mo30791m2();

    /* JADX INFO: renamed from: m8 */
    boolean mo30792m8(String str);

    /* JADX INFO: renamed from: ma */
    Intent mo30793ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7);

    @Nullable
    /* JADX INFO: renamed from: mc */
    VisitorCounter mo30794mc();

    /* JADX INFO: renamed from: me */
    C22306c<User> mo30795me();

    User me_();

    <T extends ValueObject> C22306c<List<T>> merchandises(String str, boolean z, JsonAdapter<T> jsonAdapter);

    void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var);

    /* JADX INFO: renamed from: ml */
    void mo30796ml(String str);

    /* JADX INFO: renamed from: mm */
    void mo30797mm(VImage vImage, boolean z);

    C22306c<q860<User>> momentSeeAbLikers();

    /* JADX INFO: renamed from: mq */
    void mo30798mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5);

    /* JADX INFO: renamed from: n6 */
    void mo30799n6(String str);

    /* JADX INFO: renamed from: nd */
    boolean mo30800nd();

    Intent newMainActClearStack(Context context, boolean z);

    Intent newMainActClearStack(Context context, boolean z, boolean z2);

    eqd0 notificationSettings();

    /* JADX INFO: renamed from: ns */
    int mo30801ns();

    /* JADX INFO: renamed from: od */
    <T extends ValueObject> C22306c<List<T>> mo30802od(String str, JsonAdapter<T> jsonAdapter);

    void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod);

    j760<Integer, Integer> onlineMatchCaculaterBlur(int i);

    /* JADX INFO: renamed from: p7 */
    void mo30803p7(View view, Object obj, Media media);

    /* JADX INFO: renamed from: pa */
    void mo30804pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles);

    C22306c<roj0> patch(User user);

    C22306c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings);

    C22306c<roj0> patchSettings(SettingGroups settingGroups);

    /* JADX INFO: renamed from: pe */
    boolean mo30805pe();

    /* JADX INFO: renamed from: pm */
    Intent mo30806pm(Context context, boolean z, boolean z2);

    C22306c<roj0> pollConversation();

    void pollUserCounters();

    /* JADX INFO: renamed from: pq */
    boolean mo30807pq();

    /* JADX INFO: renamed from: ps */
    void mo30808ps(String str);

    /* JADX INFO: renamed from: q7 */
    boolean mo30809q7();

    /* JADX INFO: renamed from: q8 */
    String mo30810q8();

    /* JADX INFO: renamed from: q9 */
    void mo30811q9(Act act, String str, d30 d30Var);

    /* JADX INFO: renamed from: qh */
    Object mo30812qh(View view);

    /* JADX INFO: renamed from: qp */
    String mo30813qp();

    User queryMe();

    C22306c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z);

    C22306c<roj0> refreshUser(String str);

    C22306c<roj0> refreshUser(String str, boolean z);

    void registerPurchaseDialogListener(e1m e1mVar);

    void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2);

    C22306c<roj0> report(String str, String str2, Report report);

    <T extends ValueObject> void resendDialog(Act act, T t);

    /* JADX INFO: renamed from: rg */
    boolean mo30814rg();

    /* JADX INFO: renamed from: rr */
    boolean mo30815rr();

    /* JADX INFO: renamed from: s0 */
    void mo30816s0(Act act, String str);

    /* JADX INFO: renamed from: s2 */
    void mo30817s2(Context context, String str);

    /* JADX INFO: renamed from: se */
    C22306c<List<RecommendMessage>> mo30818se(String str);

    void setIfShowTabBarInNewUI(Act act, boolean z);

    void setMomentTabDot(Act act, boolean z);

    void setMomentTabNum(Act act, int i);

    void setNewMainActClass(Context context, Intent intent);

    void setTabDot(Act act, TabName tabName, boolean z);

    void setTabNum(Act act, TabName tabName, int i);

    /* JADX INFO: renamed from: sg */
    boolean mo30819sg(String str);

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
    void mo30820sq(Act act, String str, d30 d30Var, d30 d30Var2, d30 d30Var3);

    void startJailedDialogLikeAct();

    Intent startLikersAct(Context context, String str);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i);

    Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6);

    /* JADX INFO: renamed from: te */
    boolean mo30821te();

    /* JADX INFO: renamed from: tg */
    int mo30822tg();

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
    C22393b<j760<Boolean, Integer>> mo30823u7();

    /* JADX INFO: renamed from: u8 */
    C22392a<roj0> mo30824u8();

    /* JADX INFO: renamed from: uf */
    void mo30825uf(String str);

    void unregisterPurchaseDialogListener(e1m e1mVar);

    /* JADX INFO: renamed from: up */
    void mo30826up(Act act, e30<Boolean> e30Var);

    void updateUnreadActivitiesByMoment(int i);

    /* JADX INFO: renamed from: ur */
    void mo30827ur(Act act, String str, e30<Boolean> e30Var);

    C22306c<User> userObsById(String str);

    Intent userStoryAct(Context context, String str, String str2);

    /* JADX INFO: renamed from: ut */
    void mo30828ut();

    /* JADX INFO: renamed from: v8 */
    void mo30829v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, e30<Relationship> e30Var, e30<Throwable> e30Var2);

    void verifyAppealIdentity(Act act, PhoneNumber phoneNumber);

    /* JADX INFO: renamed from: vn */
    long mo30830vn(User user);

    /* JADX INFO: renamed from: vq */
    IntlOperationArticles mo30831vq();

    /* JADX INFO: renamed from: w7 */
    Intent mo30832w7(Context context);

    /* JADX INFO: renamed from: w8 */
    boolean mo30833w8(Act act);

    C22306c<roj0> waitPatchSettings();

    /* JADX INFO: renamed from: wb */
    C22306c<roj0> mo30834wb();

    /* JADX INFO: renamed from: xf */
    boolean mo30835xf();

    /* JADX INFO: renamed from: xs */
    C22306c<roj0> mo30836xs(String str);

    /* JADX INFO: renamed from: yd */
    boolean mo30837yd(String str);

    /* JADX INFO: renamed from: yf */
    void mo30838yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3);

    /* JADX INFO: renamed from: yo */
    View mo30839yo(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, boolean z, View view);

    /* JADX INFO: renamed from: yp */
    Intent mo30840yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3);

    /* JADX INFO: renamed from: yr */
    C22306c<TabName> mo30841yr();

    /* JADX INFO: renamed from: z8 */
    void mo30842z8(Act act, String str);

    /* JADX INFO: renamed from: ze */
    void mo30843ze(Act act);

    /* JADX INFO: renamed from: zp */
    Intent mo30844zp(Context context, IntentParams intentParams);
}
