package com.p046p1.mobile.putong.feed_api.api.serviceprovider.api;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VImage;
import p149l.d30;
import p149l.dpl;
import p149l.e30;
import p149l.hpd0;
import p149l.j760;
import p149l.k8k0;
import p149l.nbq0;
import p149l.q860;
import p149l.qmg;
import p149l.roj0;
import p149l.vch;
import p149l.xaj0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public interface FeedService extends IProvider, k8k0 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$a */
    public interface InterfaceC11414a {
        /* JADX INFO: renamed from: m */
        void mo63799m(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$b */
    public interface InterfaceC11415b {
        /* JADX INFO: renamed from: E0 */
        void mo63744E0();
    }

    /* JADX INFO: renamed from: Af */
    void mo60258Af(Context context, Media media, ArrayList<Media> arrayList);

    /* JADX INFO: renamed from: Ah */
    boolean mo60259Ah();

    /* JADX INFO: renamed from: At */
    String mo60260At();

    /* JADX INFO: renamed from: Bd */
    boolean mo60261Bd();

    /* JADX INFO: renamed from: Bg */
    C22306c<Envelope> mo60262Bg(String str, String str2);

    /* JADX INFO: renamed from: Bh */
    void mo60263Bh(Act act, boolean z);

    /* JADX INFO: renamed from: Bj */
    boolean mo60264Bj();

    /* JADX INFO: renamed from: C6 */
    qmg mo60265C6(FeedMomentListType feedMomentListType);

    /* JADX INFO: renamed from: Ca */
    <T extends ValueObject> List<T> mo60266Ca(Envelope envelope, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Co */
    boolean mo60267Co();

    /* JADX INFO: renamed from: Cr */
    void mo60268Cr(Act act, String str, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: D8 */
    void mo60269D8(String str, String str2);

    /* JADX INFO: renamed from: Dk */
    void mo60270Dk(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: E6 */
    Intent mo60271E6(Context context, String str, String str2);

    /* JADX INFO: renamed from: Ea */
    void mo60272Ea();

    /* JADX INFO: renamed from: Ee */
    void mo60273Ee(Envelope envelope, HashMap<String, List<Media>> map);

    /* JADX INFO: renamed from: Ek */
    boolean mo60274Ek(User user);

    /* JADX INFO: renamed from: Fm */
    void mo60275Fm(String str, boolean z);

    /* JADX INFO: renamed from: Gc */
    BubbleInfo mo60276Gc();

    /* JADX INFO: renamed from: Gk */
    nbq0 mo60277Gk(Act act, String str);

    /* JADX INFO: renamed from: Gm */
    List<String> mo60278Gm();

    /* JADX INFO: renamed from: H7 */
    C22393b<j760<Boolean, Boolean>> mo60279H7();

    /* JADX INFO: renamed from: Ha */
    boolean mo60280Ha();

    /* JADX INFO: renamed from: Hj */
    boolean mo60281Hj();

    /* JADX INFO: renamed from: Ib */
    boolean mo60282Ib(String str);

    /* JADX INFO: renamed from: In */
    void mo60283In(RelativeLayout relativeLayout, VImage vImage);

    /* JADX INFO: renamed from: Jg */
    void mo60284Jg(Act act, String str, String str2);

    /* JADX INFO: renamed from: K8 */
    boolean mo60285K8();

    /* JADX INFO: renamed from: Ka */
    xaj0<Integer, List<String>, Boolean> mo60286Ka(String str);

    /* JADX INFO: renamed from: Ke */
    C22306c<Envelope> mo60287Ke();

    /* JADX INFO: renamed from: Kk */
    boolean mo60288Kk(User user);

    /* JADX INFO: renamed from: Kn */
    C22306c<roj0> mo60289Kn(String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: Kr */
    void mo60290Kr(Act act, String str, String str2, e30<String> e30Var);

    /* JADX INFO: renamed from: Lj */
    boolean mo60291Lj();

    /* JADX INFO: renamed from: Ll */
    C22306c<Envelope> mo60292Ll(String str, String str2);

    /* JADX INFO: renamed from: Lq */
    boolean mo60293Lq();

    /* JADX INFO: renamed from: M8 */
    boolean mo60294M8();

    /* JADX INFO: renamed from: Mh */
    <T extends ValueObject> T mo60295Mh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Nh */
    Intent mo60296Nh(Context context, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Nj */
    boolean mo60297Nj();

    /* JADX INFO: renamed from: Nr */
    void mo60298Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Ns */
    int mo60299Ns();

    /* JADX INFO: renamed from: Oh */
    <T extends ValueObject> T mo60300Oh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Oj */
    DbLinks mo60301Oj(String str);

    /* JADX INFO: renamed from: Ol */
    C22306c<MusicContent> mo60302Ol(Music music);

    /* JADX INFO: renamed from: P6 */
    Intent mo60303P6(Act act, boolean z, BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: P9 */
    <T extends ValueObject> C22306c<T> mo60304P9(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Pf */
    void mo60305Pf(Act act, User user, boolean z);

    /* JADX INFO: renamed from: Pm */
    boolean mo60306Pm();

    /* JADX INFO: renamed from: Pn */
    List<Followship> mo60307Pn(Envelope envelope);

    /* JADX INFO: renamed from: Qm */
    boolean mo60308Qm(String str);

    /* JADX INFO: renamed from: Qn */
    void mo60309Qn(Act act);

    /* JADX INFO: renamed from: R9 */
    void mo60310R9(View view, float f);

    /* JADX INFO: renamed from: Rc */
    boolean mo60311Rc();

    /* JADX INFO: renamed from: Rd */
    Intent mo60312Rd(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Re */
    void mo60313Re(boolean z);

    /* JADX INFO: renamed from: Rf */
    void mo60314Rf(ArrayList<String> arrayList);

    /* JADX INFO: renamed from: S6 */
    zpd0 mo60315S6();

    /* JADX INFO: renamed from: Sd */
    List<String> mo60316Sd();

    /* JADX INFO: renamed from: Sg */
    void mo60317Sg(Act act, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: T7 */
    void mo60318T7(Act act, User user, String str, @Nullable e30<Relationship> e30Var);

    /* JADX INFO: renamed from: Tf */
    void mo60319Tf(Act act, String str);

    /* JADX INFO: renamed from: Tg */
    C22306c<xaj0<String, String, String>> mo60320Tg();

    /* JADX INFO: renamed from: Ti */
    <T extends ValueObject> T mo60321Ti(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Tp */
    boolean mo60322Tp();

    /* JADX INFO: renamed from: U6 */
    void mo60323U6(BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: Ui */
    boolean mo60324Ui(String str);

    /* JADX INFO: renamed from: Um */
    void mo60325Um(String str);

    /* JADX INFO: renamed from: Ur */
    String mo60326Ur(String str);

    /* JADX INFO: renamed from: V9 */
    String mo60327V9();

    /* JADX INFO: renamed from: Vg */
    boolean mo60328Vg();

    /* JADX INFO: renamed from: Vo */
    boolean mo60329Vo();

    /* JADX INFO: renamed from: Vp */
    void mo60330Vp(Act act, User user, String str);

    /* JADX INFO: renamed from: Wd */
    C22306c<Envelope> mo60331Wd(String str);

    /* JADX INFO: renamed from: Wm */
    boolean mo60332Wm();

    /* JADX INFO: renamed from: Yb */
    void mo60333Yb(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Yc */
    void mo60334Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2);

    /* JADX INFO: renamed from: Yr */
    C22306c<List<BubbleInfo>> mo60335Yr();

    /* JADX INFO: renamed from: Z6 */
    C22306c<Envelope> mo60336Z6(String str);

    /* JADX INFO: renamed from: Zk */
    User mo60337Zk(String str);

    /* JADX INFO: renamed from: a6 */
    C22306c<roj0> mo60338a6();

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
    Intent mo60339bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z);

    /* JADX INFO: renamed from: bt */
    boolean mo60340bt();

    C22306c<roj0> cameraSdkLoaded();

    /* JADX INFO: renamed from: cd */
    boolean mo60341cd();

    /* JADX INFO: renamed from: cg */
    void mo60342cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map);

    /* JADX INFO: renamed from: cj */
    void mo60343cj(Act act, String str);

    C22306c<roj0> coreMomentActivityPoll();

    <T extends ValueObject> C22306c<q860<T>> coreMomentCachedMoments(String str, int i, JsonAdapter<T> jsonAdapter);

    boolean coreMomentHasMoments(String str);

    void coreMomentLatest(String str);

    C22306c<Envelope> coreMomentLike(String str, String str2, boolean z);

    <T extends ValueObject> C22306c<q860<T>> coreMomentMoments(JsonAdapter<T> jsonAdapter);

    <T extends ValueObject> C22306c<q860<T>> coreMomentMoments(String str, JsonAdapter<T> jsonAdapter);

    dpl coreMomentMutedUsers();

    C22306c<roj0> coreMomentPrevious(String str);

    /* JADX INFO: renamed from: cq */
    <T extends ValueObject> C22306c<j760<Links, List<T>>> mo60344cq(String str, boolean z, JsonAdapter<T> jsonAdapter, String str2);

    /* JADX INFO: renamed from: d */
    void mo60345d(Throwable th);

    /* JADX INFO: renamed from: di */
    <T extends ValueObject> C22306c<List<T>> mo60346di(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: dr */
    TabName mo60347dr();

    /* JADX INFO: renamed from: el */
    C22306c<roj0> mo60348el();

    /* JADX INFO: renamed from: et */
    void mo60349et();

    /* JADX INFO: renamed from: f6 */
    void mo60350f6(DbLinks dbLinks);

    /* JADX INFO: renamed from: f9 */
    C22393b<Boolean> mo60351f9();

    /* JADX INFO: renamed from: fc */
    int mo60352fc();

    C22306c<roj0> filter();

    C22306c<Followship> following(String str, User user, boolean z, String str2, String str3);

    C22306c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: fs */
    boolean mo60353fs();

    vch getFeedMediaHandler(Act act);

    String getMoMoVerificationAppId();

    C22393b<j760<User, Boolean>> getMomentLikeChangedSub();

    C22393b<roj0> getMomentsPreviousSub();

    String getTopShowingPageId(Fragment fragment);

    /* JADX INFO: renamed from: gk */
    C22306c<Envelope> mo60354gk(String str);

    /* JADX INFO: renamed from: h8 */
    int mo60355h8();

    /* JADX INFO: renamed from: hk */
    void mo60356hk(Act act, e30<String> e30Var);

    /* JADX INFO: renamed from: hr */
    boolean mo60357hr(Activity activity);

    /* JADX INFO: renamed from: ia */
    View mo60358ia(Context context, User user, int i);

    /* JADX INFO: renamed from: ik */
    Fragment mo60359ik();

    void initCameraSdk(d30 d30Var);

    boolean isCameraSdkLoaded();

    boolean isLiveNeedDisableAudio(Activity activity);

    boolean isMatchedByFollowship(User user);

    boolean isMatchedByRelationship(User user);

    boolean isMomentDetailAct(Activity activity);

    boolean isMomentsFeedAct(Activity activity);

    boolean isPhotoAlbumFrag(Fragment fragment);

    boolean isPostingMoment();

    /* JADX INFO: renamed from: j8 */
    Intent mo60360j8(Context context, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: j9 */
    void mo60361j9(Act act, String str);

    /* JADX INFO: renamed from: jb */
    C22392a<Boolean> mo60362jb();

    /* JADX INFO: renamed from: jk */
    void mo60363jk();

    /* JADX INFO: renamed from: ke */
    boolean mo60364ke();

    /* JADX INFO: renamed from: ko */
    boolean mo60365ko();

    /* JADX INFO: renamed from: kq */
    void mo60366kq(Relationship relationship);

    /* JADX INFO: renamed from: l8 */
    C22306c<Envelope> mo60367l8(String str, String str2);

    /* JADX INFO: renamed from: ld */
    boolean mo60368ld();

    /* JADX INFO: renamed from: le */
    void mo60369le(Act act, boolean z, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: ln */
    hpd0 mo60370ln();

    /* JADX INFO: renamed from: mn */
    boolean mo60371mn(User user);

    <T extends ValueObject> C22306c<T> momentRefresh(String str, String str2, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: mr */
    boolean mo60372mr();

    /* JADX INFO: renamed from: n */
    void mo60373n(e30<List<MMPresetFilter>> e30Var);

    /* JADX INFO: renamed from: n7 */
    boolean mo60374n7();

    /* JADX INFO: renamed from: ni */
    C22306c<Music> mo60375ni(int i);

    /* JADX INFO: renamed from: nm */
    void mo60376nm(Act act, int i);

    /* JADX INFO: renamed from: nq */
    C22393b<Boolean> mo60377nq();

    /* JADX INFO: renamed from: oa */
    <T extends ValueObject> void mo60378oa(Act act, Bundle bundle, T t);

    /* JADX INFO: renamed from: oh */
    String mo60379oh(Fragment fragment);

    /* JADX INFO: renamed from: or */
    C22306c<Followship> mo60380or(String str, User user, boolean z, String str2);

    /* JADX INFO: renamed from: p6 */
    void mo60381p6(boolean z);

    /* JADX INFO: renamed from: pd */
    String mo60382pd();

    <T extends ValueObject> C22306c<j760<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: po */
    void mo60383po(Act act, String str, e30<Detect> e30Var);

    void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2);

    /* JADX INFO: renamed from: qg */
    boolean mo60384qg();

    /* JADX INFO: renamed from: qn */
    boolean mo60385qn();

    /* JADX INFO: renamed from: qo */
    void mo60386qo(Act act);

    /* JADX INFO: renamed from: s9 */
    C22393b<j760<User, Boolean>> mo60387s9();

    /* JADX INFO: renamed from: sh */
    boolean mo60388sh();

    /* JADX INFO: renamed from: so */
    boolean mo60389so();

    void startInnerCameraForResult(Act act, String str, int i);

    void startInstaLikePickerAct(Activity activity);

    /* JADX INFO: renamed from: t6 */
    void mo60390t6(Act act, boolean z, String str);

    /* JADX INFO: renamed from: tf */
    zpd0 mo60391tf();

    void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str);

    /* JADX INFO: renamed from: u0 */
    boolean mo60392u0(Activity activity);

    /* JADX INFO: renamed from: u6 */
    boolean mo60393u6();

    @WorkerThread
    /* JADX INFO: renamed from: u9 */
    void mo60394u9(String str);

    /* JADX INFO: renamed from: ua */
    boolean mo60395ua();

    /* JADX INFO: renamed from: ud */
    boolean mo60396ud(User user);

    void updateUserOnBlock(String str);

    /* JADX INFO: renamed from: us */
    <T extends ValueObject> T mo60397us(String str, JsonAdapter<T> jsonAdapter);

    boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr);

    /* JADX INFO: renamed from: va */
    void mo60398va(Act act, String str, String str2);

    /* JADX INFO: renamed from: vj */
    boolean mo60399vj(boolean z);

    /* JADX INFO: renamed from: vm */
    C22306c<BubbleInfo> mo60400vm(String str);

    /* JADX INFO: renamed from: xa */
    boolean mo60401xa(String str);

    /* JADX INFO: renamed from: xl */
    C22306c<Envelope> mo60402xl(String str);

    @WorkerThread
    /* JADX INFO: renamed from: xm */
    void mo60403xm(Object obj);

    /* JADX INFO: renamed from: yj */
    void mo60404yj(String str);

    /* JADX INFO: renamed from: yq */
    String mo60405yq();

    /* JADX INFO: renamed from: zd */
    void mo60406zd(Envelope envelope, HashMap<String, String> map);
}
