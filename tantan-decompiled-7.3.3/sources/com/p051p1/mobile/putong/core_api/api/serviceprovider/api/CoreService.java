package com.p051p1.mobile.putong.core_api.api.serviceprovider.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.label.LabelStyle;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VImage;
import p153l.a30;
import p153l.bkj0;
import p153l.byd0;
import p153l.gyd0;
import p153l.iam;
import p153l.jxd0;
import p153l.lb2;
import p153l.ovb0;
import p153l.oze;
import p153l.pej0;
import p153l.pf60;
import p153l.qhk0;
import p153l.tq8;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.x3m;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public interface CoreService extends IProvider, qhk0 {
    /* JADX INFO: renamed from: Ap */
    void mo31675Ap(Act act, User user, boolean z, Relationship relationship);

    /* JADX INFO: renamed from: Ar */
    Intent mo31676Ar(Context context, String str, String str2, boolean z);

    /* JADX INFO: renamed from: B6 */
    void mo31677B6();

    /* JADX INFO: renamed from: Ba */
    jxd0 mo31678Ba();

    /* JADX INFO: renamed from: Br */
    boolean mo31679Br();

    /* JADX INFO: renamed from: Cb */
    void mo31680Cb(Envelope envelope);

    /* JADX INFO: renamed from: Ch */
    String mo31681Ch();

    /* JADX INFO: renamed from: Dd */
    void mo31682Dd();

    /* JADX INFO: renamed from: Dh */
    boolean mo31683Dh();

    /* JADX INFO: renamed from: Dm */
    String mo31684Dm();

    /* JADX INFO: renamed from: Dp */
    boolean mo31685Dp();

    /* JADX INFO: renamed from: E5 */
    C22421c<View> mo31686E5(Act act);

    /* JADX INFO: renamed from: F0 */
    String mo31687F0();

    /* JADX INFO: renamed from: F2 */
    String mo31688F2();

    /* JADX INFO: renamed from: Fc */
    void mo31689Fc(Act act, StickerInfo stickerInfo, y20<StickerInfo> y20Var);

    /* JADX INFO: renamed from: Ff */
    void mo31690Ff(Act act, StickerInfo stickerInfo);

    /* JADX INFO: renamed from: Fo */
    void mo31691Fo(Context context);

    /* JADX INFO: renamed from: Gb */
    void mo31692Gb(Context context);

    /* JADX INFO: renamed from: Gn */
    boolean mo31693Gn();

    /* JADX INFO: renamed from: Hp */
    void mo31694Hp(Act act, String str);

    /* JADX INFO: renamed from: I4 */
    boolean mo31695I4();

    /* JADX INFO: renamed from: Ia */
    boolean mo31696Ia(User user);

    /* JADX INFO: renamed from: Ic */
    boolean mo31697Ic();

    /* JADX INFO: renamed from: Id */
    int mo31698Id();

    /* JADX INFO: renamed from: Ij */
    void mo31699Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2);

    /* JADX INFO: renamed from: Io */
    void mo31700Io(String str);

    /* JADX INFO: renamed from: Jn */
    Class<?> mo31701Jn();

    /* JADX INFO: renamed from: Jq */
    void mo31702Jq();

    /* JADX INFO: renamed from: Js */
    C22421c<ovb0<Boolean, Integer, IntlOperationBanner, Boolean>> mo31703Js();

    /* JADX INFO: renamed from: K9 */
    void mo31704K9(String str, List<String> list, boolean z);

    /* JADX INFO: renamed from: Kg */
    View mo31705Kg(Context context, String str, String str2, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: Km */
    void mo31706Km(Act act, SettingGroups settingGroups);

    /* JADX INFO: renamed from: Lk */
    boolean mo31707Lk(String str);

    /* JADX INFO: renamed from: Lo */
    int mo31708Lo();

    /* JADX INFO: renamed from: M2 */
    void mo31709M2(Act act, User user, String str);

    /* JADX INFO: renamed from: M9 */
    C22421c<Boolean> mo31710M9(String str);

    /* JADX INFO: renamed from: Md */
    boolean mo31711Md();

    /* JADX INFO: renamed from: Mq */
    void mo31712Mq(Long l2);

    /* JADX INFO: renamed from: Ne */
    void mo31713Ne(Long l2);

    /* JADX INFO: renamed from: Ng */
    View mo31714Ng(Context context, String str);

    /* JADX INFO: renamed from: Ni */
    void mo31715Ni(Act act, String str, String str2, x20 x20Var);

    /* JADX INFO: renamed from: O1 */
    String mo31716O1();

    /* JADX INFO: renamed from: Oa */
    void mo31717Oa(Act act, String str, String str2, Boolean bool);

    /* JADX INFO: renamed from: P3 */
    C22421c<Boolean> mo31718P3();

    /* JADX INFO: renamed from: Pg */
    List<IntlOperationBanner> mo31719Pg();

    /* JADX INFO: renamed from: Pq */
    void mo31720Pq(Act act, boolean z);

    /* JADX INFO: renamed from: Ps */
    Intent mo31721Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3);

    /* JADX INFO: renamed from: Q2 */
    boolean mo31722Q2();

    /* JADX INFO: renamed from: Q7 */
    void mo31723Q7(boolean z, Act act, User user, y20<Relationship> y20Var, y20<Throwable> y20Var2);

    /* JADX INFO: renamed from: Q9 */
    pej0 mo31724Q9(String str, Act act, String str2, String str3, String str4, String str5, x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7, x20 x20Var8, User user);

    /* JADX INFO: renamed from: Qf */
    boolean mo31725Qf();

    /* JADX INFO: renamed from: Rb */
    void mo31726Rb(Act act, String str);

    /* JADX INFO: renamed from: Rp */
    void mo31727Rp(String str);

    /* JADX INFO: renamed from: Rs */
    void mo31728Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2);

    /* JADX INFO: renamed from: Sa */
    void mo31729Sa(Act act, String str, String str2);

    /* JADX INFO: renamed from: Sr */
    void mo31730Sr(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Ug */
    void mo31731Ug(Act act, String str);

    /* JADX INFO: renamed from: Us */
    void mo31732Us(Act act);

    /* JADX INFO: renamed from: Vk */
    void mo31733Vk(Act act, String str, String str2, String str3, String str4, Channel channel, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: Vr */
    void mo31734Vr();

    /* JADX INFO: renamed from: W2 */
    C22421c<Boolean> mo31735W2();

    /* JADX INFO: renamed from: Wp */
    boolean mo31736Wp();

    /* JADX INFO: renamed from: Wq */
    boolean mo31737Wq();

    /* JADX INFO: renamed from: Xd */
    void mo31738Xd();

    /* JADX INFO: renamed from: Y3 */
    String mo31739Y3();

    /* JADX INFO: renamed from: Y6 */
    void mo31740Y6(Act act, String str);

    /* JADX INFO: renamed from: Yn */
    void mo31741Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5);

    /* JADX INFO: renamed from: Z3 */
    boolean mo31742Z3(Activity activity);

    /* JADX INFO: renamed from: Zb */
    void mo31743Zb(TabName tabName, boolean z);

    /* JADX INFO: renamed from: Zj */
    ConversationStatus mo31744Zj(String str);

    /* JADX INFO: renamed from: a */
    tq8 mo31745a();

    /* JADX INFO: renamed from: aa */
    void mo31746aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6);

    /* JADX INFO: renamed from: ab */
    C22421c<ConversationStatus> mo31747ab(String str);

    /* JADX INFO: renamed from: as */
    void mo31748as(boolean z);

    /* JADX INFO: renamed from: b3 */
    int mo31749b3();

    /* JADX INFO: renamed from: b6 */
    View mo31750b6(Act act, EditText editText, boolean z, y20<Boolean> y20Var, boolean z2);

    C22421c<uxj0> blocks(String str);

    /* JADX INFO: renamed from: bs */
    void mo31751bs(Context context, View view, String str);

    /* JADX INFO: renamed from: c9 */
    void mo31752c9(View view, int i);

    /* JADX INFO: renamed from: ci */
    void mo31753ci(String str, String str2, String str3, boolean z);

    /* JADX INFO: renamed from: ck */
    boolean mo31754ck();

    void clearCounterUnread();

    void clearRequests(String str, int i);

    void clearUnReadLikes();

    void clearUnreadFans();

    void confirmThenUnmatch(Act act, String str, y20<String> y20Var, x20 x20Var, x20 x20Var2, String str2);

    C22421c<Counter> counter();

    Counter counter_();

    /* JADX INFO: renamed from: cs */
    boolean mo31755cs();

    /* JADX INFO: renamed from: d2 */
    lb2 mo31756d2(Act act, y20<String> y20Var, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var);

    /* JADX INFO: renamed from: db */
    int mo31757db(LabelStyle labelStyle);

    void deleteConversationAndRelated(String str);

    /* JADX INFO: renamed from: dg */
    HashMap<String, Boolean> mo31758dg(Envelope envelope);

    void dismissGpBindPhoneRedDot();

    /* JADX INFO: renamed from: dk */
    void mo31759dk(Boolean bool);

    /* JADX INFO: renamed from: dl */
    void mo31760dl(Act act, boolean z, x20 x20Var);

    void doGPPayment(Act act, String str, x20 x20Var, x20 x20Var2);

    /* JADX INFO: renamed from: e9 */
    int mo31761e9(LabelStyle labelStyle);

    /* JADX INFO: renamed from: eb */
    C22421c<Boolean> mo31762eb();

    /* JADX INFO: renamed from: ec */
    void mo31763ec();

    /* JADX INFO: renamed from: ef */
    C22508b<Boolean> mo31764ef();

    /* JADX INFO: renamed from: em */
    void mo31765em(Act act, String str, String str2);

    /* JADX INFO: renamed from: fp */
    void mo31766fp();

    /* JADX INFO: renamed from: g4 */
    boolean mo31767g4();

    /* JADX INFO: renamed from: gc */
    void mo31768gc();

    C22507a<uxj0> getAutoPlayVideoBs();

    C22421c<Banners> getBannersObs(BannerLoc bannerLoc);

    String getCurrencyProductCategory();

    String getGPMemo(String str);

    Intent getMainWithNav(Context context, NavigationIntent navigationIntent);

    RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup);

    C22421c<Bundle> getNewMainBundleBs(TabName tabName);

    C22421c<Boolean> getNewMainLiveTabSelectBs();

    C22421c<Boolean> getNewMainMomentTabSelectBs();

    long getSeeLastReadTime();

    Integer getSessionChangedProfile();

    Class<?> getSubscriptionsActClass();

    C22508b<bkj0<Integer, Integer, String>> getTPayResultBs();

    C22421c<SettingGroups> getUserSettings();

    long getUserSwipeCount();

    /* JADX INFO: renamed from: gi */
    BottomSheetDialog mo31769gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, a30<String, List<String>, Boolean> a30Var);

    /* JADX INFO: renamed from: gp */
    boolean mo31770gp(String str);

    C22421c<PaymentData> h5PayCanUseForLive();

    /* JADX INFO: renamed from: hd */
    void mo31771hd(Act act, String str, String str2, String str3);

    boolean hideActiveTime(User user);

    boolean hideAge(User user);

    boolean hideLocation(User user);

    void hideTabBarWhenNewUIMomentIsCurrentTab(Act act);

    /* JADX INFO: renamed from: hj */
    void mo31772hj(iam iamVar, PushMessage pushMessage);

    /* JADX INFO: renamed from: i0 */
    C22421c<View> mo31773i0(Act act);

    /* JADX INFO: renamed from: i5 */
    C22421c<Boolean> mo31774i5(Act act, @Nullable String str);

    /* JADX INFO: renamed from: i7 */
    PutongFrag mo31775i7(String str, BubbleInfo bubbleInfo, int i);

    /* JADX INFO: renamed from: i8 */
    <T extends ValueObject> T mo31776i8(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: i9 */
    C22421c<uxj0> mo31777i9();

    /* JADX INFO: renamed from: ie */
    <T extends ValueObject> C22421c<T> mo31778ie(JsonAdapter<T> jsonAdapter, String str, String str2, boolean z);

    /* JADX INFO: renamed from: ii */
    Intent mo31779ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2);

    boolean instanceofPersonalDetailsAct(Act act);

    boolean isCurrentMessageBlock(String str);

    boolean isCurrentTabMomentFrag(Act act);

    C22421c<Boolean> isHideRedByNewUser();

    boolean isHttpDnsOpen();

    boolean isLiveNeedDisableAudio(Activity activity);

    boolean isMainPage(Act act);

    C22421c<Boolean> isMatched(String str);

    boolean isMatchedSync(String str);

    boolean isNewMainActContext(Activity activity);

    boolean isPurchaseDialogShowing();

    /* JADX INFO: renamed from: ja */
    byd0 mo31780ja();

    /* JADX INFO: renamed from: jc */
    void mo31781jc(Act act, User user, boolean z, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2);

    /* JADX INFO: renamed from: jg */
    void mo31782jg(Act act, boolean z);

    /* JADX INFO: renamed from: jp */
    boolean mo31783jp(String str, String str2, String str3);

    /* JADX INFO: renamed from: k2 */
    C22421c<String> mo31784k2();

    /* JADX INFO: renamed from: k4 */
    boolean mo31785k4();

    /* JADX INFO: renamed from: k7 */
    C22508b<Boolean> mo31786k7();

    /* JADX INFO: renamed from: k9 */
    Intent mo31787k9(Context context, String str, String str2, String str3);

    /* JADX INFO: renamed from: ki */
    void mo31788ki(Activity activity);

    /* JADX INFO: renamed from: kj */
    void mo31789kj(Act act, String str, String str2, z20<Boolean, String> z20Var);

    /* JADX INFO: renamed from: kk */
    void mo31790kk(Act act);

    /* JADX INFO: renamed from: kn */
    void mo31791kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, y20<Relationship> y20Var, y20<Throwable> y20Var2);

    /* JADX INFO: renamed from: ks */
    C22421c<uxj0> mo31792ks(String str, String str2, String str3, x20 x20Var);

    /* JADX INFO: renamed from: kt */
    void mo31793kt();

    C22421c<uxj0> loadLikers(Links links, long j, int i);

    <T extends ValueObject, K extends ValueObject> C22421c<List<T>> localiseMerchandises(Act act, List<K> list, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: m2 */
    boolean mo31794m2();

    /* JADX INFO: renamed from: m8 */
    boolean mo31795m8(String str);

    /* JADX INFO: renamed from: ma */
    Intent mo31796ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7);

    @Nullable
    /* JADX INFO: renamed from: mc */
    VisitorCounter mo31797mc();

    /* JADX INFO: renamed from: me */
    C22421c<User> mo31798me();

    User me_();

    <T extends ValueObject> C22421c<List<T>> merchandises(String str, boolean z, JsonAdapter<T> jsonAdapter);

    void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var);

    /* JADX INFO: renamed from: ml */
    void mo31799ml(String str);

    /* JADX INFO: renamed from: mm */
    void mo31800mm(VImage vImage, boolean z);

    C22421c<vg60<User>> momentSeeAbLikers();

    /* JADX INFO: renamed from: mq */
    void mo31801mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5);

    /* JADX INFO: renamed from: n6 */
    void mo31802n6(String str);

    /* JADX INFO: renamed from: nd */
    boolean mo31803nd();

    Intent newMainActClearStack(Context context, boolean z);

    Intent newMainActClearStack(Context context, boolean z, boolean z2);

    gyd0 notificationSettings();

    /* JADX INFO: renamed from: ns */
    int mo31804ns();

    /* JADX INFO: renamed from: od */
    <T extends ValueObject> C22421c<List<T>> mo31805od(String str, JsonAdapter<T> jsonAdapter);

    void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod);

    pf60<Integer, Integer> onlineMatchCaculaterBlur(int i);

    /* JADX INFO: renamed from: p7 */
    void mo31806p7(View view, Object obj, Media media);

    /* JADX INFO: renamed from: pa */
    void mo31807pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles);

    C22421c<uxj0> patch(User user);

    C22421c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings);

    C22421c<uxj0> patchSettings(SettingGroups settingGroups);

    /* JADX INFO: renamed from: pe */
    boolean mo31808pe();

    /* JADX INFO: renamed from: pm */
    Intent mo31809pm(Context context, boolean z, boolean z2);

    C22421c<uxj0> pollConversation();

    void pollUserCounters();

    /* JADX INFO: renamed from: pq */
    boolean mo31810pq();

    /* JADX INFO: renamed from: ps */
    void mo31811ps(String str);

    /* JADX INFO: renamed from: q7 */
    boolean mo31812q7();

    /* JADX INFO: renamed from: q8 */
    String mo31813q8();

    /* JADX INFO: renamed from: q9 */
    void mo31814q9(Act act, String str, x20 x20Var);

    /* JADX INFO: renamed from: qh */
    Object mo31815qh(View view);

    /* JADX INFO: renamed from: qp */
    String mo31816qp();

    User queryMe();

    C22421c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z);

    C22421c<uxj0> refreshUser(String str);

    C22421c<uxj0> refreshUser(String str, boolean z);

    void registerPurchaseDialogListener(x3m x3mVar);

    void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2);

    C22421c<uxj0> report(String str, String str2, Report report);

    <T extends ValueObject> void resendDialog(Act act, T t);

    /* JADX INFO: renamed from: rg */
    boolean mo31817rg();

    /* JADX INFO: renamed from: rr */
    boolean mo31818rr();

    /* JADX INFO: renamed from: s0 */
    void mo31819s0(Act act, String str);

    /* JADX INFO: renamed from: s2 */
    void mo31820s2(Context context, String str);

    /* JADX INFO: renamed from: se */
    C22421c<List<RecommendMessage>> mo31821se(String str);

    void setIfShowTabBarInNewUI(Act act, boolean z);

    void setMomentTabDot(Act act, boolean z);

    void setMomentTabNum(Act act, int i);

    void setNewMainActClass(Context context, Intent intent);

    void setTabDot(Act act, TabName tabName, boolean z);

    void setTabNum(Act act, TabName tabName, int i);

    /* JADX INFO: renamed from: sg */
    boolean mo31822sg(String str);

    boolean shouldLockComment(String str);

    boolean shouldShowAutoPay();

    void showAutoPayHelp(Act act);

    void showBanner(Act act, ViewGroup viewGroup, Banners banners);

    void showBindPhoneDialog(Act act, x20 x20Var);

    void showLocationPermissionCallbackDlg(Act act, x20 x20Var, x20 x20Var2, boolean z, boolean z2, String str);

    boolean showMomentBanner();

    void showProofAgeDlg(Act act, String str);

    void showSeeDialog(Act act, x20 x20Var, String str);

    void showUserVerificationLogo(Context context, User user, VImage vImage);

    void showVipPurchaseDialog(Act act, String str);

    void skipH5PayActivityFromLive(Act act, String str, boolean z);

    /* JADX INFO: renamed from: sq */
    void mo31823sq(Act act, String str, x20 x20Var, x20 x20Var2, x20 x20Var3);

    void startJailedDialogLikeAct();

    Intent startLikersAct(Context context, String str);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2);

    Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i);

    Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6);

    /* JADX INFO: renamed from: te */
    boolean mo31824te();

    /* JADX INFO: renamed from: tg */
    int mo31825tg();

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
    C22508b<pf60<Boolean, Integer>> mo31826u7();

    /* JADX INFO: renamed from: u8 */
    C22507a<uxj0> mo31827u8();

    /* JADX INFO: renamed from: uf */
    void mo31828uf(String str);

    void unregisterPurchaseDialogListener(x3m x3mVar);

    /* JADX INFO: renamed from: up */
    void mo31829up(Act act, y20<Boolean> y20Var);

    void updateUnreadActivitiesByMoment(int i);

    /* JADX INFO: renamed from: ur */
    void mo31830ur(Act act, String str, y20<Boolean> y20Var);

    C22421c<User> userObsById(String str);

    Intent userStoryAct(Context context, String str, String str2);

    /* JADX INFO: renamed from: ut */
    void mo31831ut();

    /* JADX INFO: renamed from: v8 */
    void mo31832v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, y20<Relationship> y20Var, y20<Throwable> y20Var2);

    void verifyAppealIdentity(Act act, PhoneNumber phoneNumber);

    /* JADX INFO: renamed from: vn */
    long mo31833vn(User user);

    /* JADX INFO: renamed from: vq */
    IntlOperationArticles mo31834vq();

    /* JADX INFO: renamed from: w7 */
    Intent mo31835w7(Context context);

    /* JADX INFO: renamed from: w8 */
    boolean mo31836w8(Act act);

    C22421c<uxj0> waitPatchSettings();

    /* JADX INFO: renamed from: wb */
    C22421c<uxj0> mo31837wb();

    /* JADX INFO: renamed from: xf */
    boolean mo31838xf();

    /* JADX INFO: renamed from: xs */
    C22421c<uxj0> mo31839xs(String str);

    /* JADX INFO: renamed from: yd */
    boolean mo31840yd(String str);

    /* JADX INFO: renamed from: yf */
    void mo31841yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3);

    /* JADX INFO: renamed from: yo */
    View mo31842yo(Act act, y20<String> y20Var, x20 x20Var, MessageInputEditView messageInputEditView, boolean z, View view);

    /* JADX INFO: renamed from: yp */
    Intent mo31843yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3);

    /* JADX INFO: renamed from: yr */
    C22421c<TabName> mo31844yr();

    /* JADX INFO: renamed from: z8 */
    void mo31845z8(Act act, String str);

    /* JADX INFO: renamed from: ze */
    void mo31846ze(Act act);

    /* JADX INFO: renamed from: zp */
    Intent mo31847zp(Context context, IntentParams intentParams);
}
