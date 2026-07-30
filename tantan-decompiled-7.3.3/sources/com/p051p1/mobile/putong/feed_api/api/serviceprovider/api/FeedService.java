package com.p051p1.mobile.putong.feed_api.api.serviceprovider.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VImage;
import p153l.bkj0;
import p153l.byd0;
import p153l.fog;
import p153l.jxd0;
import p153l.keh;
import p153l.pf60;
import p153l.prl;
import p153l.qhk0;
import p153l.skq0;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public interface FeedService extends IProvider, qhk0 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$a */
    public interface InterfaceC11577a {
        /* JADX INFO: renamed from: m */
        void mo64982m(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$b */
    public interface InterfaceC11578b {
        /* JADX INFO: renamed from: E0 */
        void mo64927E0();
    }

    /* JADX INFO: renamed from: Af */
    void mo61442Af(Context context, Media media, ArrayList<Media> arrayList);

    /* JADX INFO: renamed from: Ah */
    boolean mo61443Ah();

    /* JADX INFO: renamed from: At */
    String mo61444At();

    /* JADX INFO: renamed from: Bd */
    boolean mo61445Bd();

    /* JADX INFO: renamed from: Bg */
    C22421c<Envelope> mo61446Bg(String str, String str2);

    /* JADX INFO: renamed from: Bh */
    void mo61447Bh(Act act, boolean z);

    /* JADX INFO: renamed from: Bj */
    boolean mo61448Bj();

    /* JADX INFO: renamed from: C6 */
    fog mo61449C6(FeedMomentListType feedMomentListType);

    /* JADX INFO: renamed from: Ca */
    <T extends ValueObject> List<T> mo61450Ca(Envelope envelope, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Co */
    boolean mo61451Co();

    /* JADX INFO: renamed from: Cr */
    void mo61452Cr(Act act, String str, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: D8 */
    void mo61453D8(String str, String str2);

    /* JADX INFO: renamed from: Dk */
    void mo61454Dk(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: E6 */
    Intent mo61455E6(Context context, String str, String str2);

    /* JADX INFO: renamed from: Ea */
    void mo61456Ea();

    /* JADX INFO: renamed from: Ee */
    void mo61457Ee(Envelope envelope, HashMap<String, List<Media>> map);

    /* JADX INFO: renamed from: Ek */
    boolean mo61458Ek(User user);

    /* JADX INFO: renamed from: Fm */
    void mo61459Fm(String str, boolean z);

    /* JADX INFO: renamed from: Gc */
    BubbleInfo mo61460Gc();

    /* JADX INFO: renamed from: Gk */
    skq0 mo61461Gk(Act act, String str);

    /* JADX INFO: renamed from: Gm */
    List<String> mo61462Gm();

    /* JADX INFO: renamed from: H7 */
    C22508b<pf60<Boolean, Boolean>> mo61463H7();

    /* JADX INFO: renamed from: Ha */
    boolean mo61464Ha();

    /* JADX INFO: renamed from: Hj */
    boolean mo61465Hj();

    /* JADX INFO: renamed from: Ib */
    boolean mo61466Ib(String str);

    /* JADX INFO: renamed from: In */
    void mo61467In(RelativeLayout relativeLayout, VImage vImage);

    /* JADX INFO: renamed from: Jg */
    void mo61468Jg(Act act, String str, String str2);

    /* JADX INFO: renamed from: K8 */
    boolean mo61469K8();

    /* JADX INFO: renamed from: Ka */
    bkj0<Integer, List<String>, Boolean> mo61470Ka(String str);

    /* JADX INFO: renamed from: Ke */
    C22421c<Envelope> mo61471Ke();

    /* JADX INFO: renamed from: Kk */
    boolean mo61472Kk(User user);

    /* JADX INFO: renamed from: Kn */
    C22421c<uxj0> mo61473Kn(String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: Kr */
    void mo61474Kr(Act act, String str, String str2, y20<String> y20Var);

    /* JADX INFO: renamed from: Lj */
    boolean mo61475Lj();

    /* JADX INFO: renamed from: Ll */
    C22421c<Envelope> mo61476Ll(String str, String str2);

    /* JADX INFO: renamed from: Lq */
    boolean mo61477Lq();

    /* JADX INFO: renamed from: M8 */
    boolean mo61478M8();

    /* JADX INFO: renamed from: Mh */
    <T extends ValueObject> T mo61479Mh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Nh */
    Intent mo61480Nh(Context context, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Nj */
    boolean mo61481Nj();

    /* JADX INFO: renamed from: Nr */
    void mo61482Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Ns */
    int mo61483Ns();

    /* JADX INFO: renamed from: Oh */
    <T extends ValueObject> T mo61484Oh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Oj */
    DbLinks mo61485Oj(String str);

    /* JADX INFO: renamed from: Ol */
    C22421c<MusicContent> mo61486Ol(Music music);

    /* JADX INFO: renamed from: P6 */
    Intent mo61487P6(Act act, boolean z, BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: P9 */
    <T extends ValueObject> C22421c<T> mo61488P9(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Pf */
    void mo61489Pf(Act act, User user, boolean z);

    /* JADX INFO: renamed from: Pm */
    boolean mo61490Pm();

    /* JADX INFO: renamed from: Pn */
    List<Followship> mo61491Pn(Envelope envelope);

    /* JADX INFO: renamed from: Qm */
    boolean mo61492Qm(String str);

    /* JADX INFO: renamed from: Qn */
    void mo61493Qn(Act act);

    /* JADX INFO: renamed from: R9 */
    void mo61494R9(View view, float f);

    /* JADX INFO: renamed from: Rc */
    boolean mo61495Rc();

    /* JADX INFO: renamed from: Rd */
    Intent mo61496Rd(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Re */
    void mo61497Re(boolean z);

    /* JADX INFO: renamed from: Rf */
    void mo61498Rf(ArrayList<String> arrayList);

    /* JADX INFO: renamed from: S6 */
    byd0 mo61499S6();

    /* JADX INFO: renamed from: Sd */
    List<String> mo61500Sd();

    /* JADX INFO: renamed from: Sg */
    void mo61501Sg(Act act, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: T7 */
    void mo61502T7(Act act, User user, String str, @Nullable y20<Relationship> y20Var);

    /* JADX INFO: renamed from: Tf */
    void mo61503Tf(Act act, String str);

    /* JADX INFO: renamed from: Tg */
    C22421c<bkj0<String, String, String>> mo61504Tg();

    /* JADX INFO: renamed from: Ti */
    <T extends ValueObject> T mo61505Ti(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Tp */
    boolean mo61506Tp();

    /* JADX INFO: renamed from: U6 */
    void mo61507U6(BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: Ui */
    boolean mo61508Ui(String str);

    /* JADX INFO: renamed from: Um */
    void mo61509Um(String str);

    /* JADX INFO: renamed from: Ur */
    String mo61510Ur(String str);

    /* JADX INFO: renamed from: V9 */
    String mo61511V9();

    /* JADX INFO: renamed from: Vg */
    boolean mo61512Vg();

    /* JADX INFO: renamed from: Vo */
    boolean mo61513Vo();

    /* JADX INFO: renamed from: Vp */
    void mo61514Vp(Act act, User user, String str);

    /* JADX INFO: renamed from: Wd */
    C22421c<Envelope> mo61515Wd(String str);

    /* JADX INFO: renamed from: Wm */
    boolean mo61516Wm();

    /* JADX INFO: renamed from: Yb */
    void mo61517Yb(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Yc */
    void mo61518Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2);

    /* JADX INFO: renamed from: Yr */
    C22421c<List<BubbleInfo>> mo61519Yr();

    /* JADX INFO: renamed from: Z6 */
    C22421c<Envelope> mo61520Z6(String str);

    /* JADX INFO: renamed from: Zk */
    User mo61521Zk(String str);

    /* JADX INFO: renamed from: a6 */
    C22421c<uxj0> mo61522a6();

    Intent argsToMomentActivitiesAct(Context context, String str);

    Intent argsToMomentDetailAct(Context context, String str, String str2, String str3);

    Intent argsToMomentsFeedAct(Context context);

    Intent argsToMomentsFeedPreviewAct(Context context, String str, int i, boolean z, String str2, String str3);

    Intent argsToMomentsInProfileAct(Context context, String str, String str2);

    Intent argsToMomentsSimpleTextAct(Context context, String str, String str2);

    Intent argsToPhotoAlbumActivitiesAct(Context context, String str, boolean z, boolean z2, boolean z3);

    void argsToPhotoAlbumFansAct(Act act, String str, boolean z);

    Intent argsToPhotoAlbumFeedAct(Context context, String str, String str2, int i, @Nullable String str3, int i2);

    /* JADX INFO: renamed from: bb */
    Intent mo61523bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z);

    /* JADX INFO: renamed from: bt */
    boolean mo61524bt();

    C22421c<uxj0> cameraSdkLoaded();

    /* JADX INFO: renamed from: cd */
    boolean mo61525cd();

    /* JADX INFO: renamed from: cg */
    void mo61526cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map);

    /* JADX INFO: renamed from: cj */
    void mo61527cj(Act act, String str);

    C22421c<uxj0> coreMomentActivityPoll();

    <T extends ValueObject> C22421c<vg60<T>> coreMomentCachedMoments(String str, int i, JsonAdapter<T> jsonAdapter);

    boolean coreMomentHasMoments(String str);

    void coreMomentLatest(String str);

    C22421c<Envelope> coreMomentLike(String str, String str2, boolean z);

    <T extends ValueObject> C22421c<vg60<T>> coreMomentMoments(JsonAdapter<T> jsonAdapter);

    <T extends ValueObject> C22421c<vg60<T>> coreMomentMoments(String str, JsonAdapter<T> jsonAdapter);

    prl coreMomentMutedUsers();

    C22421c<uxj0> coreMomentPrevious(String str);

    /* JADX INFO: renamed from: cq */
    <T extends ValueObject> C22421c<pf60<Links, List<T>>> mo61528cq(String str, boolean z, JsonAdapter<T> jsonAdapter, String str2);

    /* JADX INFO: renamed from: d */
    void mo61529d(Throwable th);

    /* JADX INFO: renamed from: di */
    <T extends ValueObject> C22421c<List<T>> mo61530di(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: dr */
    TabName mo61531dr();

    /* JADX INFO: renamed from: el */
    C22421c<uxj0> mo61532el();

    /* JADX INFO: renamed from: et */
    void mo61533et();

    /* JADX INFO: renamed from: f6 */
    void mo61534f6(DbLinks dbLinks);

    /* JADX INFO: renamed from: f9 */
    C22508b<Boolean> mo61535f9();

    /* JADX INFO: renamed from: fc */
    int mo61536fc();

    C22421c<uxj0> filter();

    C22421c<Followship> following(String str, User user, boolean z, String str2, String str3);

    C22421c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: fs */
    boolean mo61537fs();

    keh getFeedMediaHandler(Act act);

    String getMoMoVerificationAppId();

    C22508b<pf60<User, Boolean>> getMomentLikeChangedSub();

    C22508b<uxj0> getMomentsPreviousSub();

    String getTopShowingPageId(Fragment fragment);

    /* JADX INFO: renamed from: gk */
    C22421c<Envelope> mo61538gk(String str);

    /* JADX INFO: renamed from: h8 */
    int mo61539h8();

    /* JADX INFO: renamed from: hk */
    void mo61540hk(Act act, y20<String> y20Var);

    /* JADX INFO: renamed from: hr */
    boolean mo61541hr(Activity activity);

    /* JADX INFO: renamed from: ia */
    View mo61542ia(Context context, User user, int i);

    /* JADX INFO: renamed from: ik */
    Fragment mo61543ik();

    void initCameraSdk(x20 x20Var);

    boolean isCameraSdkLoaded();

    boolean isLiveNeedDisableAudio(Activity activity);

    boolean isMatchedByFollowship(User user);

    boolean isMatchedByRelationship(User user);

    boolean isMomentDetailAct(Activity activity);

    boolean isMomentsFeedAct(Activity activity);

    boolean isPhotoAlbumFrag(Fragment fragment);

    boolean isPostingMoment();

    /* JADX INFO: renamed from: j8 */
    Intent mo61544j8(Context context, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: j9 */
    void mo61545j9(Act act, String str);

    /* JADX INFO: renamed from: jb */
    C22507a<Boolean> mo61546jb();

    /* JADX INFO: renamed from: jk */
    void mo61547jk();

    /* JADX INFO: renamed from: ke */
    boolean mo61548ke();

    /* JADX INFO: renamed from: ko */
    boolean mo61549ko();

    /* JADX INFO: renamed from: kq */
    void mo61550kq(Relationship relationship);

    /* JADX INFO: renamed from: l8 */
    C22421c<Envelope> mo61551l8(String str, String str2);

    /* JADX INFO: renamed from: ld */
    boolean mo61552ld();

    /* JADX INFO: renamed from: le */
    void mo61553le(Act act, boolean z, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: ln */
    jxd0 mo61554ln();

    /* JADX INFO: renamed from: mn */
    boolean mo61555mn(User user);

    <T extends ValueObject> C22421c<T> momentRefresh(String str, String str2, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: mr */
    boolean mo61556mr();

    /* JADX INFO: renamed from: n */
    void mo61557n(y20<List<MMPresetFilter>> y20Var);

    /* JADX INFO: renamed from: n7 */
    boolean mo61558n7();

    /* JADX INFO: renamed from: ni */
    C22421c<Music> mo61559ni(int i);

    /* JADX INFO: renamed from: nm */
    void mo61560nm(Act act, int i);

    /* JADX INFO: renamed from: nq */
    C22508b<Boolean> mo61561nq();

    /* JADX INFO: renamed from: oa */
    <T extends ValueObject> void mo61562oa(Act act, Bundle bundle, T t);

    /* JADX INFO: renamed from: oh */
    String mo61563oh(Fragment fragment);

    /* JADX INFO: renamed from: or */
    C22421c<Followship> mo61564or(String str, User user, boolean z, String str2);

    /* JADX INFO: renamed from: p6 */
    void mo61565p6(boolean z);

    /* JADX INFO: renamed from: pd */
    String mo61566pd();

    <T extends ValueObject> C22421c<pf60<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: po */
    void mo61567po(Act act, String str, y20<Detect> y20Var);

    void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2);

    /* JADX INFO: renamed from: qg */
    boolean mo61568qg();

    /* JADX INFO: renamed from: qn */
    boolean mo61569qn();

    /* JADX INFO: renamed from: qo */
    void mo61570qo(Act act);

    /* JADX INFO: renamed from: s9 */
    C22508b<pf60<User, Boolean>> mo61571s9();

    /* JADX INFO: renamed from: sh */
    boolean mo61572sh();

    /* JADX INFO: renamed from: so */
    boolean mo61573so();

    void startInnerCameraForResult(Act act, String str, int i);

    void startInstaLikePickerAct(Activity activity);

    /* JADX INFO: renamed from: t6 */
    void mo61574t6(Act act, boolean z, String str);

    /* JADX INFO: renamed from: tf */
    byd0 mo61575tf();

    void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str);

    /* JADX INFO: renamed from: u0 */
    boolean mo61576u0(Activity activity);

    /* JADX INFO: renamed from: u6 */
    boolean mo61577u6();

    @WorkerThread
    /* JADX INFO: renamed from: u9 */
    void mo61578u9(String str);

    /* JADX INFO: renamed from: ua */
    boolean mo61579ua();

    /* JADX INFO: renamed from: ud */
    boolean mo61580ud(User user);

    void updateUserOnBlock(String str);

    /* JADX INFO: renamed from: us */
    <T extends ValueObject> T mo61581us(String str, JsonAdapter<T> jsonAdapter);

    boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr);

    /* JADX INFO: renamed from: va */
    void mo61582va(Act act, String str, String str2);

    /* JADX INFO: renamed from: vj */
    boolean mo61583vj(boolean z);

    /* JADX INFO: renamed from: vm */
    C22421c<BubbleInfo> mo61584vm(String str);

    /* JADX INFO: renamed from: xa */
    boolean mo61585xa(String str);

    /* JADX INFO: renamed from: xl */
    C22421c<Envelope> mo61586xl(String str);

    @WorkerThread
    /* JADX INFO: renamed from: xm */
    void mo61587xm(Object obj);

    /* JADX INFO: renamed from: yj */
    void mo61588yj(String str);

    /* JADX INFO: renamed from: yq */
    String mo61589yq();

    /* JADX INFO: renamed from: zd */
    void mo61590zd(Envelope envelope, HashMap<String, String> map);
}
