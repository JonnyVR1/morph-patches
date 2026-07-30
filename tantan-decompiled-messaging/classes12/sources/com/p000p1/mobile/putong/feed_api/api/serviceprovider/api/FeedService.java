package com.p000p1.mobile.putong.feed_api.api.serviceprovider.api;

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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.hpd0;
import l.j760;
import l.k8k0;
import l.q860;
import l.roj0;
import l.xaj0;
import l.zpd0;
import p007l.dpl;
import p007l.nbq0;
import p007l.qmg;
import p007l.vch;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface FeedService extends IProvider, k8k0 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$a */
    public interface InterfaceC2258a {
        /* JADX INFO: renamed from: m */
        void mo4825m(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService$b */
    public interface InterfaceC2259b {
        /* JADX INFO: renamed from: E0 */
        void mo4767E0();
    }

    /* JADX INFO: renamed from: Af */
    void mo1184Af(Context context, Media media, ArrayList<Media> arrayList);

    /* JADX INFO: renamed from: Ah */
    boolean mo1185Ah();

    /* JADX INFO: renamed from: At */
    String mo1186At();

    /* JADX INFO: renamed from: Bd */
    boolean mo1187Bd();

    /* JADX INFO: renamed from: Bg */
    c<Envelope> mo1188Bg(String str, String str2);

    /* JADX INFO: renamed from: Bh */
    void mo1189Bh(Act act, boolean z);

    /* JADX INFO: renamed from: Bj */
    boolean mo1190Bj();

    /* JADX INFO: renamed from: C6 */
    qmg mo1191C6(FeedMomentListType feedMomentListType);

    /* JADX INFO: renamed from: Ca */
    <T extends ValueObject> List<T> mo1192Ca(Envelope envelope, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Co */
    boolean mo1193Co();

    /* JADX INFO: renamed from: Cr */
    void mo1194Cr(Act act, String str, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: D8 */
    void mo1195D8(String str, String str2);

    /* JADX INFO: renamed from: Dk */
    void mo1196Dk(Act act, String str, String str2, String str3);

    /* JADX INFO: renamed from: E6 */
    Intent mo1197E6(Context context, String str, String str2);

    /* JADX INFO: renamed from: Ea */
    void mo1198Ea();

    /* JADX INFO: renamed from: Ee */
    void mo1199Ee(Envelope envelope, HashMap<String, List<Media>> map);

    /* JADX INFO: renamed from: Ek */
    boolean mo1200Ek(User user);

    /* JADX INFO: renamed from: Fm */
    void mo1201Fm(String str, boolean z);

    /* JADX INFO: renamed from: Gc */
    BubbleInfo mo1202Gc();

    /* JADX INFO: renamed from: Gk */
    nbq0 mo1203Gk(Act act, String str);

    /* JADX INFO: renamed from: Gm */
    List<String> mo1204Gm();

    /* JADX INFO: renamed from: H7 */
    b<j760<Boolean, Boolean>> mo1205H7();

    /* JADX INFO: renamed from: Ha */
    boolean mo1206Ha();

    /* JADX INFO: renamed from: Hj */
    boolean mo1207Hj();

    /* JADX INFO: renamed from: Ib */
    boolean mo1208Ib(String str);

    /* JADX INFO: renamed from: In */
    void mo1209In(RelativeLayout relativeLayout, VImage vImage);

    /* JADX INFO: renamed from: Jg */
    void mo1210Jg(Act act, String str, String str2);

    /* JADX INFO: renamed from: K8 */
    boolean mo1211K8();

    /* JADX INFO: renamed from: Ka */
    xaj0<Integer, List<String>, Boolean> mo1212Ka(String str);

    /* JADX INFO: renamed from: Ke */
    c<Envelope> mo1213Ke();

    /* JADX INFO: renamed from: Kk */
    boolean mo1214Kk(User user);

    /* JADX INFO: renamed from: Kn */
    c<roj0> mo1215Kn(String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: Kr */
    void mo1216Kr(Act act, String str, String str2, e30<String> e30Var);

    /* JADX INFO: renamed from: Lj */
    boolean mo1217Lj();

    /* JADX INFO: renamed from: Ll */
    c<Envelope> mo1218Ll(String str, String str2);

    /* JADX INFO: renamed from: Lq */
    boolean mo1219Lq();

    /* JADX INFO: renamed from: M8 */
    boolean mo1220M8();

    /* JADX INFO: renamed from: Mh */
    <T extends ValueObject> T mo1221Mh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Nh */
    Intent mo1222Nh(Context context, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Nj */
    boolean mo1223Nj();

    /* JADX INFO: renamed from: Nr */
    void mo1224Nr(Act act, ArrayList<Media> arrayList, boolean z, String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Ns */
    int mo1225Ns();

    /* JADX INFO: renamed from: Oh */
    <T extends ValueObject> T mo1226Oh(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Oj */
    DbLinks mo1227Oj(String str);

    /* JADX INFO: renamed from: Ol */
    c<MusicContent> mo1228Ol(Music music);

    /* JADX INFO: renamed from: P6 */
    Intent mo1229P6(Act act, boolean z, BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: P9 */
    <T extends ValueObject> c<T> mo1230P9(String str, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Pf */
    void mo1231Pf(Act act, User user, boolean z);

    /* JADX INFO: renamed from: Pm */
    boolean mo1232Pm();

    /* JADX INFO: renamed from: Pn */
    List<Followship> mo1233Pn(Envelope envelope);

    /* JADX INFO: renamed from: Qm */
    boolean mo1234Qm(String str);

    /* JADX INFO: renamed from: Qn */
    void mo1235Qn(Act act);

    /* JADX INFO: renamed from: R9 */
    void mo1236R9(View view, float f);

    /* JADX INFO: renamed from: Rc */
    boolean mo1237Rc();

    /* JADX INFO: renamed from: Rd */
    Intent mo1238Rd(Act act, String str, String str2, boolean z);

    /* JADX INFO: renamed from: Re */
    void mo1239Re(boolean z);

    /* JADX INFO: renamed from: Rf */
    void mo1240Rf(ArrayList<String> arrayList);

    /* JADX INFO: renamed from: S6 */
    zpd0 mo1241S6();

    /* JADX INFO: renamed from: Sd */
    List<String> mo1242Sd();

    /* JADX INFO: renamed from: Sg */
    void mo1243Sg(Act act, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: T7 */
    void mo1244T7(Act act, User user, String str, @Nullable e30<Relationship> e30Var);

    /* JADX INFO: renamed from: Tf */
    void mo1245Tf(Act act, String str);

    /* JADX INFO: renamed from: Tg */
    c<xaj0<String, String, String>> mo1246Tg();

    /* JADX INFO: renamed from: Ti */
    <T extends ValueObject> T mo1247Ti(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: Tp */
    boolean mo1248Tp();

    /* JADX INFO: renamed from: U6 */
    void mo1249U6(BubbleInfo bubbleInfo, String str);

    /* JADX INFO: renamed from: Ui */
    boolean mo1250Ui(String str);

    /* JADX INFO: renamed from: Um */
    void mo1251Um(String str);

    /* JADX INFO: renamed from: Ur */
    String mo1252Ur(String str);

    /* JADX INFO: renamed from: V9 */
    String mo1253V9();

    /* JADX INFO: renamed from: Vg */
    boolean mo1254Vg();

    /* JADX INFO: renamed from: Vo */
    boolean mo1255Vo();

    /* JADX INFO: renamed from: Vp */
    void mo1256Vp(Act act, User user, String str);

    /* JADX INFO: renamed from: Wd */
    c<Envelope> mo1257Wd(String str);

    /* JADX INFO: renamed from: Wm */
    boolean mo1258Wm();

    /* JADX INFO: renamed from: Yb */
    void mo1259Yb(Act act, String str, boolean z);

    /* JADX INFO: renamed from: Yc */
    void mo1260Yc(ValueObject valueObject, String str, boolean z, int i, boolean z2);

    /* JADX INFO: renamed from: Yr */
    c<List<BubbleInfo>> mo1261Yr();

    /* JADX INFO: renamed from: Z6 */
    c<Envelope> mo1262Z6(String str);

    /* JADX INFO: renamed from: Zk */
    User mo1263Zk(String str);

    /* JADX INFO: renamed from: a6 */
    c<roj0> mo1264a6();

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
    Intent mo1265bb(Context context, String str, String str2, int i, @Nullable String str3, int i2, String str4, boolean z);

    /* JADX INFO: renamed from: bt */
    boolean mo1266bt();

    c<roj0> cameraSdkLoaded();

    /* JADX INFO: renamed from: cd */
    boolean mo1267cd();

    /* JADX INFO: renamed from: cg */
    void mo1268cg(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map);

    /* JADX INFO: renamed from: cj */
    void mo1269cj(Act act, String str);

    c<roj0> coreMomentActivityPoll();

    <T extends ValueObject> c<q860<T>> coreMomentCachedMoments(String str, int i, JsonAdapter<T> jsonAdapter);

    boolean coreMomentHasMoments(String str);

    void coreMomentLatest(String str);

    c<Envelope> coreMomentLike(String str, String str2, boolean z);

    <T extends ValueObject> c<q860<T>> coreMomentMoments(JsonAdapter<T> jsonAdapter);

    <T extends ValueObject> c<q860<T>> coreMomentMoments(String str, JsonAdapter<T> jsonAdapter);

    dpl coreMomentMutedUsers();

    c<roj0> coreMomentPrevious(String str);

    /* JADX INFO: renamed from: cq */
    <T extends ValueObject> c<j760<Links, List<T>>> mo1270cq(String str, boolean z, JsonAdapter<T> jsonAdapter, String str2);

    /* JADX INFO: renamed from: d */
    void mo1271d(Throwable th);

    /* JADX INFO: renamed from: di */
    <T extends ValueObject> c<List<T>> mo1272di(JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: dr */
    TabName mo1273dr();

    /* JADX INFO: renamed from: el */
    c<roj0> mo1274el();

    /* JADX INFO: renamed from: et */
    void mo1275et();

    /* JADX INFO: renamed from: f6 */
    void mo1276f6(DbLinks dbLinks);

    /* JADX INFO: renamed from: f9 */
    b<Boolean> mo1277f9();

    /* JADX INFO: renamed from: fc */
    int mo1278fc();

    c<roj0> filter();

    c<Followship> following(String str, User user, boolean z, String str2, String str3);

    c<Followship> followingWithExtra(String str, User user, boolean z, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: fs */
    boolean mo1279fs();

    vch getFeedMediaHandler(Act act);

    String getMoMoVerificationAppId();

    b<j760<User, Boolean>> getMomentLikeChangedSub();

    b<roj0> getMomentsPreviousSub();

    String getTopShowingPageId(Fragment fragment);

    /* JADX INFO: renamed from: gk */
    c<Envelope> mo1280gk(String str);

    /* JADX INFO: renamed from: h8 */
    int mo1281h8();

    /* JADX INFO: renamed from: hk */
    void mo1282hk(Act act, e30<String> e30Var);

    /* JADX INFO: renamed from: hr */
    boolean mo1283hr(Activity activity);

    /* JADX INFO: renamed from: ia */
    View mo1284ia(Context context, User user, int i);

    /* JADX INFO: renamed from: ik */
    Fragment mo1285ik();

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
    Intent mo1286j8(Context context, String str, String str2, boolean z, String str3);

    /* JADX INFO: renamed from: j9 */
    void mo1287j9(Act act, String str);

    /* JADX INFO: renamed from: jb */
    a<Boolean> mo1288jb();

    /* JADX INFO: renamed from: jk */
    void mo1289jk();

    /* JADX INFO: renamed from: ke */
    boolean mo1290ke();

    /* JADX INFO: renamed from: ko */
    boolean mo1291ko();

    /* JADX INFO: renamed from: kq */
    void mo1292kq(Relationship relationship);

    /* JADX INFO: renamed from: l8 */
    c<Envelope> mo1293l8(String str, String str2);

    /* JADX INFO: renamed from: ld */
    boolean mo1294ld();

    /* JADX INFO: renamed from: le */
    void mo1295le(Act act, boolean z, String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: renamed from: ln */
    hpd0 mo1296ln();

    /* JADX INFO: renamed from: mn */
    boolean mo1297mn(User user);

    <T extends ValueObject> c<T> momentRefresh(String str, String str2, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: mr */
    boolean mo1298mr();

    /* JADX INFO: renamed from: n */
    void mo1299n(e30<List<MMPresetFilter>> e30Var);

    /* JADX INFO: renamed from: n7 */
    boolean mo1300n7();

    /* JADX INFO: renamed from: ni */
    c<Music> mo1301ni(int i);

    /* JADX INFO: renamed from: nm */
    void mo1302nm(Act act, int i);

    /* JADX INFO: renamed from: nq */
    b<Boolean> mo1303nq();

    /* JADX INFO: renamed from: oa */
    <T extends ValueObject> void mo1304oa(Act act, Bundle bundle, T t);

    /* JADX INFO: renamed from: oh */
    String mo1305oh(Fragment fragment);

    /* JADX INFO: renamed from: or */
    c<Followship> mo1306or(String str, User user, boolean z, String str2);

    /* JADX INFO: renamed from: p6 */
    void mo1307p6(boolean z);

    /* JADX INFO: renamed from: pd */
    String mo1308pd();

    <T extends ValueObject> c<j760<Links, List<T>>> personalMediaMomentsFeedPrevious(String str, boolean z, JsonAdapter<T> jsonAdapter);

    /* JADX INFO: renamed from: po */
    void mo1309po(Act act, String str, e30<Detect> e30Var);

    void processMomentLikeStatusChanged(Relationship relationship, User user, boolean z, boolean z2);

    /* JADX INFO: renamed from: qg */
    boolean mo1310qg();

    /* JADX INFO: renamed from: qn */
    boolean mo1311qn();

    /* JADX INFO: renamed from: qo */
    void mo1312qo(Act act);

    /* JADX INFO: renamed from: s9 */
    b<j760<User, Boolean>> mo1313s9();

    /* JADX INFO: renamed from: sh */
    boolean mo1314sh();

    /* JADX INFO: renamed from: so */
    boolean mo1315so();

    void startInnerCameraForResult(Act act, String str, int i);

    void startInstaLikePickerAct(Activity activity);

    /* JADX INFO: renamed from: t6 */
    void mo1316t6(Act act, boolean z, String str);

    /* JADX INFO: renamed from: tf */
    zpd0 mo1317tf();

    void toCaptionPage(Act act, ArrayList<Media> arrayList, boolean z, String str);

    /* JADX INFO: renamed from: u0 */
    boolean mo1318u0(Activity activity);

    /* JADX INFO: renamed from: u6 */
    boolean mo1319u6();

    @WorkerThread
    /* JADX INFO: renamed from: u9 */
    void mo1320u9(String str);

    /* JADX INFO: renamed from: ua */
    boolean mo1321ua();

    /* JADX INFO: renamed from: ud */
    boolean mo1322ud(User user);

    void updateUserOnBlock(String str);

    /* JADX INFO: renamed from: us */
    <T extends ValueObject> T mo1323us(String str, JsonAdapter<T> jsonAdapter);

    boolean useFeedInsertViewProxy(Act act, int i, Map map, View... viewArr);

    /* JADX INFO: renamed from: va */
    void mo1324va(Act act, String str, String str2);

    /* JADX INFO: renamed from: vj */
    boolean mo1325vj(boolean z);

    /* JADX INFO: renamed from: vm */
    c<BubbleInfo> mo1326vm(String str);

    /* JADX INFO: renamed from: xa */
    boolean mo1327xa(String str);

    /* JADX INFO: renamed from: xl */
    c<Envelope> mo1328xl(String str);

    @WorkerThread
    /* JADX INFO: renamed from: xm */
    void mo1329xm(Object obj);

    /* JADX INFO: renamed from: yj */
    void mo1330yj(String str);

    /* JADX INFO: renamed from: yq */
    String mo1331yq();

    /* JADX INFO: renamed from: zd */
    void mo1332zd(Envelope envelope, HashMap<String, String> map);
}
