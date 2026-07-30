package p007l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.data.BannerLoc;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.er2;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mu5;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xh0;
import l.zvf0;
import rx.c;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vwi {

    /* JADX INFO: renamed from: a */
    public static c40 f14315a;

    /* JADX INFO: renamed from: b */
    public static c40 f14316b;

    /* JADX INFO: renamed from: c */
    public static xh0 f14317c;

    /* JADX INFO: renamed from: d */
    public static cwf0 f14318d = m15593H("p_explore_feed_more", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public static cwf0 f14319e;

    /* JADX INFO: renamed from: l.vwi$a */
    public class DialogInterfaceOnCancelListenerC2524a implements DialogInterface.OnCancelListener {
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            q770.m13441l0(false);
        }
    }

    /* JADX INFO: renamed from: l.vwi$b */
    public class C2525b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14320a;

        public C2525b(String str) {
            this.f14320a = str;
        }

        public String pageId() {
            return this.f14320a;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m15591F(Media media) {
        if (media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !(z && nkg.m12270v0() && ((Picture) media).livePhoto != null) && z;
    }

    /* JADX INFO: renamed from: G */
    public static void m15592G(final Act act, final Media media) {
        if (media == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("保存到本地");
        c40.b bVar = new c40.b(act);
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.qvi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m15596K();
            }
        }).S(new DialogInterface.OnCancelListener() { // from class: l.bwi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                q770.m13441l0(false);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.mwi
            /* JADX INFO: renamed from: a */
            public final void m12061a(VListCell vListCell, VListCell.a aVar, int i) {
                vwi.m15624p(media, act, vListCell, aVar, i);
            }
        });
        zvf0.x("e_save_picture", "p_comment_picture_preview");
        c40 c40VarF = bVar.F();
        f14316b = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: H */
    public static cwf0 m15593H(String str, String str2) {
        return new cwf0(new C2525b(str), str2);
    }

    /* JADX INFO: renamed from: I */
    public static void m15594I() {
        cwf0 cwf0Var;
        if (NullChecker.a(f14315a)) {
            f14315a.b();
            f14315a = null;
            if (nkg.m12263s() && (cwf0Var = f14318d) != null) {
                cwf0Var.k();
                f14318d.j();
            }
            cwf0 cwf0Var2 = f14319e;
            if (cwf0Var2 != null) {
                cwf0Var2.k();
                f14319e.j();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m15595J() {
        xh0 xh0Var = f14317c;
        if (xh0Var == null) {
            return;
        }
        xh0Var.c();
        f14317c = null;
        q770.m13441l0(false);
    }

    /* JADX INFO: renamed from: K */
    public static void m15596K() {
        if (NullChecker.a(f14316b)) {
            f14316b.b();
            f14316b = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m15597L(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(mu5.a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&comment_id=" + str4 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: M */
    public static int m15598M(final Act act, List<CharSequence> list) {
        return vwb.G(list, new w9j() { // from class: l.cwi
            public final Object call(Object obj) {
                return Boolean.valueOf(((CharSequence) obj).equals(act.getResources().getString(R$string.f613t4)));
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static int m15599N(final Act act, List<CharSequence> list) {
        return vwb.G(list, new w9j() { // from class: l.dwi
            public final Object call(Object obj) {
                Act act2 = act;
                CharSequence charSequence = (CharSequence) obj;
                return Boolean.valueOf(charSequence.equals(act2.getResources().getString(R$string.f618u3)) || charSequence.equals(act2.getResources().getString(R$string.f434S3)));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static String m15600O(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(mu5.a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: P */
    public static void m15601P(Moment moment, w9j<Moment, c> w9jVar, User user, Act act, String str, boolean z) {
        m15603R(moment, w9jVar, user, act, str, z, null, null, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m15602Q(Moment moment, w9j<Moment, c> w9jVar, User user, Act act, String str, boolean z, Media media) {
        m15603R(moment, w9jVar, user, act, str, z, null, null, null, media);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x026f  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x0303  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:185:0x033e  */
    /* JADX WARN: Code duplicated, block: B:190:0x034d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x034f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0355  */
    /* JADX WARN: Code duplicated, block: B:194:0x0358  */
    /* JADX WARN: Code duplicated, block: B:196:0x0362  */
    /* JADX WARN: Code duplicated, block: B:205:0x03db  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX INFO: renamed from: R */
    public static void m15603R(final Moment moment, final w9j<Moment, c> w9jVar, final User user, final Act act, String str, final boolean z, final String str2, final d30 d30Var, final d30 d30Var2, final Media media) {
        String str3;
        String str4;
        boolean z2;
        List list;
        String strMo14408a;
        j760 j760VarA;
        cwf0 cwf0Var;
        String str5;
        String str6;
        final Moment moment2;
        final Act act2;
        String str7;
        d30 d30Var3;
        d30 d30Var4;
        d30 d30Var5;
        final User user2;
        d30 d30Var6;
        String strMo14408a2;
        final String str8 = str;
        ArrayList arrayList = new ArrayList();
        if (!nkg.m12213K() || user.isMe()) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
                arrayList.add(str3);
            }
            if (vqg.m15498V(moment)) {
                return;
            }
            str4 = "";
            z2 = false;
            if (!u2h.m14721f() && NullChecker.a(user) && NullChecker.a(moment) && !user.isTeamAccount() && !moment.owner.equals(FeedModule.m1139F().userId())) {
                if (!nkg.m12213K() || user.isMe()) {
                    if (TextUtils.isEmpty(str3)) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                } else if (swh.m14344l(user) && (!z || !nkg.m12259q())) {
                    str5 = "取消喜欢";
                } else if (swh.m14340h(user)) {
                    str5 = "取消关注";
                } else if (!TextUtils.isEmpty(str3) || (z && !nkg.m12259q())) {
                    str5 = "喜欢";
                } else {
                    str5 = null;
                }
                List list2 = (List) FeedModule.f315c.f670M.n();
                final boolean z3 = NullChecker.a(list2) && list2.contains(moment.owner);
                if (vs0.m15566d(moment)) {
                    str6 = "";
                } else {
                    if (z3) {
                        strMo14408a2 = uzh.m15183p(act).mo14408a();
                    } else {
                        strMo14408a2 = nkg.m12213K() ? "加入黑名单" : uzh.m15183p(act).mo14419l();
                    }
                    str6 = strMo14408a2;
                }
                final Picture.ImageUri imageUriProfileSmall = (!vwb.J(moment.media) && NullChecker.a(moment.media.get(0)) && NullChecker.a(moment.media.get(0).cover()) && NullChecker.a(moment.media.get(0).cover().profileSmall())) ? moment.media.get(0).cover().profileSmall() : user.m1042fp().profileSmall();
                final boolean z4 = (!vwb.J(moment.media) && NullChecker.a(moment.media.get(0)) && TextUtils.equals("audio/mp4", moment.media.get(0).mediaType)) ? false : true;
                CoreService coreServiceM1140H = FeedModule.m1140H();
                String str9 = NullChecker.a(moment) ? ((DbObject) moment).id : "";
                String str10 = (!z || TextUtils.equals(str8, "p_moment_preview")) ? str8 : "moment_detail";
                d30 d30Var7 = new d30() { // from class: l.owi
                    public final void call() {
                        vwi.m15630v(z4, act, user, moment, imageUriProfileSmall);
                    }
                };
                d30 d30Var8 = new d30() { // from class: l.pwi
                    public final void call() {
                        vwi.m15633y(z4, act, user, moment, imageUriProfileSmall);
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    moment2 = moment;
                    act2 = act;
                    str7 = str5;
                    d30Var3 = null;
                } else {
                    final String str11 = str3;
                    final String str12 = str5;
                    d30Var3 = new d30() { // from class: l.qwi
                        public final void call() {
                            vwi.m15611c(str11, str12, d30Var, act, user, moment, z, str8);
                        }
                    };
                    str7 = str12;
                    act2 = act;
                    moment2 = moment;
                    str8 = str8;
                }
                if (!fm20.m10213C(str8) || TextUtils.equals(moment2.owner, FeedModule.m1139F().userId())) {
                    d30Var4 = null;
                    d30Var5 = null;
                } else {
                    d30Var4 = new d30() { // from class: l.rwi
                        public final void call() {
                            vwi.m15617i(d30Var2, moment2);
                        }
                    };
                    d30Var5 = null;
                }
                d30 d30Var9 = new d30() { // from class: l.swi
                    public final void call() {
                        Act act3 = act2;
                        Moment moment3 = moment2;
                        vwi.m15608W(act3, "dynamic", moment3.owner, ((DbObject) moment3).id);
                    }
                };
                if ((("from_nearby_falls_feed".equals(str8) || fm20.m10213C(str8)) && !z) || "from_moment_detail_album".equals(str8) || vs0.m15566d(moment2)) {
                    user2 = user;
                    d30Var6 = d30Var5;
                } else {
                    user2 = user;
                    d30Var6 = new d30() { // from class: l.twi
                        public final void call() {
                            vwi.m15614f(act2, moment2, z3, user2);
                        }
                    };
                }
                coreServiceM1140H.Q9(str9, act2, str10, "discover_discussion", str7, str6, d30Var7, d30Var8, d30Var3, d30Var4, d30Var9, d30Var6, new d30() { // from class: l.uwi
                    public final void call() {
                        q770.m13441l0(false);
                    }
                }, !m15591F(media) ? d30Var5 : new d30() { // from class: l.rvi
                    public final void call() {
                        vwi.m15627s(media, act2);
                    }
                }, user2);
                return;
            }
            if (moment.owner.equals(FeedModule.m1139F().userId())) {
                if (((act instanceof MomentDetailAct) && !"from_moment_detail_album".equals(str8)) || (act instanceof PhotoAlbumFeedAct) || (!nkg.m12244i0() && ("from_mine_tab_album".equals(str8) || OMSDialogPositon.p_navigation_view.equals(str8)))) {
                    arrayList.add(act.getString(R$string.f515f1));
                    if (nkg.m12220R() && of00.m12619i(moment)) {
                        arrayList.add(of00.f11454d);
                    }
                }
                if ((act instanceof PhotoAlbumFeedPreviewAct) && m15591F(media)) {
                    arrayList.add("保存到本地");
                }
                arrayList.add(act.getString(R$string.f613t4));
            } else if (NullChecker.b(user) && !user.isTeamAccount()) {
                if (fm20.m10213C(str8) && NullChecker.b(moment) && !TextUtils.equals(moment.owner, FeedModule.m1139F().userId())) {
                    arrayList.add("不感兴趣");
                    if (NullChecker.a(moment)) {
                        j760VarA = j760.a("moment_id", ((DbObject) moment).id);
                    } else {
                        j760VarA = null;
                    }
                    p6j0.m12915e("e_feed_not_interested", "p_explore_feed_more", j760VarA);
                }
                if (NullChecker.b(moment)) {
                    arrayList.add(act.getString(R$string.f434S3));
                }
                if ((("from_nearby_falls_feed".equals(str8) && !fm20.m10213C(str8)) || z) && !"from_moment_detail_album".equals(str8)) {
                    list = (List) FeedModule.f315c.f670M.n();
                    if (list != null && list.contains(moment.owner)) {
                        z2 = true;
                    }
                    if (!vs0.m15566d(moment)) {
                        if (z2) {
                            strMo14408a = uzh.m15183p(act).mo14408a();
                        } else if (nkg.m12213K()) {
                            strMo14408a = "屏蔽动态并加入黑名单";
                        } else {
                            strMo14408a = uzh.m15183p(act).mo14419l();
                        }
                        str4 = strMo14408a;
                        arrayList.add(str4);
                    }
                }
            }
            final String str13 = str4;
            c40.b bVar = new c40.b(act);
            c40.b bVarQ = bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.svi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vwi.m15594I();
                }
            }).S(new DialogInterfaceOnCancelListenerC2524a()).Q(arrayList);
            int[] iArr = {m15599N(act, arrayList), m15598M(act, arrayList)};
            int i = e1c0.f7130b;
            bVarQ.R(iArr, new int[]{i, i}).V(new c40.d() { // from class: l.tvi
                /* JADX INFO: renamed from: a */
                public final void m14672a(VListCell vListCell, VListCell.a aVar, int i2) {
                    vwi.m15625q(str2, d30Var, act, user, moment, z, str8, w9jVar, str13, d30Var2, media, vListCell, aVar, i2);
                }
            });
            c40 c40VarF = bVar.F();
            f14315a = c40VarF;
            c40VarF.f();
            if (nkg.m12263s() && (cwf0Var = f14318d) != null) {
                cwf0Var.i();
                f14318d.l();
            }
            if (f14319e == null) {
                cwf0 cwf0VarM15593H = m15593H(str8, Dialog.class.getName());
                f14319e = cwf0VarM15593H;
                cwf0VarM15593H.i();
                f14319e.l();
            }
            q770.m13441l0(true);
        }
        if (swh.m14344l(user) && (!z || !nkg.m12259q())) {
            arrayList.add("取消喜欢");
        } else if (swh.m14340h(user)) {
            arrayList.add("取消关注");
        } else if (!TextUtils.isEmpty(str2) || (z && !nkg.m12259q())) {
            arrayList.add("喜欢");
        }
        str3 = str2;
        if (vqg.m15498V(moment)) {
            return;
        }
        str4 = "";
        z2 = false;
        if (!u2h.m14721f()) {
        }
        if (moment.owner.equals(FeedModule.m1139F().userId())) {
            if (act instanceof MomentDetailAct) {
                arrayList.add(act.getString(R$string.f515f1));
                if (nkg.m12220R()) {
                    arrayList.add(of00.f11454d);
                }
            } else {
                arrayList.add(act.getString(R$string.f515f1));
                if (nkg.m12220R()) {
                    arrayList.add(of00.f11454d);
                }
            }
            if (act instanceof PhotoAlbumFeedPreviewAct) {
                arrayList.add("保存到本地");
            }
            arrayList.add(act.getString(R$string.f613t4));
        } else if (NullChecker.b(user)) {
            if (fm20.m10213C(str8)) {
                arrayList.add("不感兴趣");
                if (NullChecker.a(moment)) {
                    j760VarA = j760.a("moment_id", ((DbObject) moment).id);
                } else {
                    j760VarA = null;
                }
                p6j0.m12915e("e_feed_not_interested", "p_explore_feed_more", j760VarA);
            }
            if (NullChecker.b(moment)) {
                arrayList.add(act.getString(R$string.f434S3));
            }
            if ("from_nearby_falls_feed".equals(str8)) {
                list = (List) FeedModule.f315c.f670M.n();
                if (list != null) {
                    z2 = true;
                }
                if (!vs0.m15566d(moment)) {
                    if (z2) {
                        strMo14408a = uzh.m15183p(act).mo14408a();
                    } else if (nkg.m12213K()) {
                        strMo14408a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo14408a = uzh.m15183p(act).mo14419l();
                    }
                    str4 = strMo14408a;
                    arrayList.add(str4);
                }
            } else {
                list = (List) FeedModule.f315c.f670M.n();
                if (list != null) {
                    z2 = true;
                }
                if (!vs0.m15566d(moment)) {
                    if (z2) {
                        strMo14408a = uzh.m15183p(act).mo14408a();
                    } else if (nkg.m12213K()) {
                        strMo14408a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo14408a = uzh.m15183p(act).mo14419l();
                    }
                    str4 = strMo14408a;
                    arrayList.add(str4);
                }
            }
        }
        final String str14 = str4;
        c40.b bVar2 = new c40.b(act);
        c40.b bVarQ2 = bVar2.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.svi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m15594I();
            }
        }).S(new DialogInterfaceOnCancelListenerC2524a()).Q(arrayList);
        int[] iArr2 = {m15599N(act, arrayList), m15598M(act, arrayList)};
        int i2 = e1c0.f7130b;
        bVarQ2.R(iArr2, new int[]{i2, i2}).V(new c40.d() { // from class: l.tvi
            /* JADX INFO: renamed from: a */
            public final void m14672a(VListCell vListCell, VListCell.a aVar, int i3) {
                vwi.m15625q(str2, d30Var, act, user, moment, z, str8, w9jVar, str14, d30Var2, media, vListCell, aVar, i3);
            }
        });
        c40 c40VarF2 = bVar2.F();
        f14315a = c40VarF2;
        c40VarF2.f();
        if (nkg.m12263s()) {
            cwf0Var.i();
            f14318d.l();
        }
        if (f14319e == null) {
            cwf0 cwf0VarM15593H2 = m15593H(str8, Dialog.class.getName());
            f14319e = cwf0VarM15593H2;
            cwf0VarM15593H2.i();
            f14319e.l();
        }
        q770.m13441l0(true);
    }

    /* JADX INFO: renamed from: S */
    public static void m15604S(Moment moment, v9j<String> v9jVar, v9j<Boolean> v9jVar2, d30 d30Var, w9j<Moment, c> w9jVar, User user, Act act, String str, boolean z, d30 d30Var2) {
        m15603R(moment, w9jVar, user, act, str, z, (!m15606U(moment, v9jVar2, str) || nkg.m12232c0() || nkg.m12234d0()) ? null : (String) v9jVar.call(), d30Var, d30Var2, null);
    }

    /* JADX INFO: renamed from: T */
    public static void m15605T(Act act, String str, String str2, String str3, final d30 d30Var) {
        xh0.a aVar = new xh0.a(act);
        xh0.a aVarJ = aVar.j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R$string.f596r);
        }
        aVarJ.r(str).o(new View.OnClickListener() { // from class: l.kwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m15613e(d30Var, view);
            }
        }).e(R$string.f478a).m(new DialogInterface.OnDismissListener() { // from class: l.lwi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m13441l0(false);
            }
        }).c(new View.OnClickListener() { // from class: l.nwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m15595J();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            aVar.s(str2);
        }
        xh0 xh0VarA = aVar.a();
        f14317c = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m15606U(Moment moment, v9j<Boolean> v9jVar, String str) {
        return (moment.owner.equals(FeedModule.m1139F().userId()) || vqg.m15498V(moment) || vs0.m15566d(moment) || "from_nearby_focus".equals(str) || !((Boolean) v9jVar.call()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static void m15607V(Act act, String str, String str2, String str3, String str4) {
        cxh.m9251a(act, "", m15597L(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: W */
    public static void m15608W(Act act, String str, String str2, String str3) {
        cxh.m9251a(act, "", m15600O(str, str2, str3));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15610b(final Act act, final Moment moment, final boolean z) {
        q770.m13441l0(false);
        act.progress(R$string.f445U2, true);
        FeedModule.f315c.f670M.m1698M(moment.owner, !z).subscribe(mkd0.H(new e30() { // from class: l.ewi
            public final void call(Object obj) {
                vwi.m15619k(act, z, moment, (roj0) obj);
            }
        }, new e30() { // from class: l.fwi
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15611c(String str, String str2, d30 d30Var, Act act, User user, Moment moment, boolean z, String str3) {
        if (TextUtils.equals(str, str2) && NullChecker.a(d30Var)) {
            d30Var.call();
            return;
        }
        if (TextUtils.equals("喜欢", str2)) {
            FeedModule.m1140H().kn(act, user, true, (String) null, LikeFrom.get("moment"), ((DbObject) moment).id, (e30) null, (e30) null);
            return;
        }
        if (TextUtils.equals("取消喜欢", str2)) {
            zvf0.u("e_unlike", "p_share_pop", new j760[]{vwb.Y("unlike_from", z ? "moment_detail" : BannerLoc.moment_feed), vwb.Y("other_user_id", NullChecker.a(user) ? ((DbObject) user).id : "")});
            swh.m14338f(act, user, str3, null);
        } else if (TextUtils.equals("取消关注", str2)) {
            swh.m14337e(act, user, str3, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15613e(d30 d30Var, View view) {
        m15595J();
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15614f(final Act act, final Moment moment, final boolean z, User user) {
        final d30 d30Var = new d30() { // from class: l.uvi
            public final void call() {
                vwi.m15610b(act, moment, z);
            }
        };
        if (z) {
            if (uzh.m15183p(act).mo14411d()) {
                m15605T(act, act.getString(R$string.f606s3), uzh.m15183p(act).mo14416i(), uzh.m15183p(act).mo14418k(user.isFemale()), new d30() { // from class: l.vvi
                    public final void call() {
                        d30Var.call();
                    }
                });
                return;
            } else {
                d30Var.call();
                return;
            }
        }
        if (uzh.m15183p(act).mo14415h()) {
            m15605T(act, act.getString(R$string.f606s3), uzh.m15183p(act).mo14410c(), uzh.m15183p(act).mo14409b(), new d30() { // from class: l.wvi
                public final void call() {
                    d30Var.call();
                }
            });
        } else {
            d30Var.call();
        }
        q770.m13441l0(true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15615g(Act act, boolean z, Moment moment, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.q(z ? uzh.m15183p(act).mo14417j() : uzh.m15183p(act).mo14414g(), act.getResources().getDrawable(f3c0.f7750Z1));
        FeedModule.f316d.m16618cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15617i(d30 d30Var, Moment moment) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        p6j0.m12915e("e_feed_not_interested", "p_explore_feed_more", NullChecker.a(moment) ? j760.a("moment_id", ((DbObject) moment).id) : null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15618j(final Act act, final Moment moment, final boolean z) {
        q770.m13441l0(false);
        act.progress(R$string.f445U2, true);
        FeedModule.f315c.f670M.m1698M(moment.owner, !z).subscribe(mkd0.H(new e30() { // from class: l.iwi
            public final void call(Object obj) {
                vwi.m15615g(act, z, moment, (roj0) obj);
            }
        }, new e30() { // from class: l.jwi
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15619k(Act act, boolean z, Moment moment, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.q(z ? uzh.m15183p(act).mo14417j() : uzh.m15183p(act).mo14414g(), act.getResources().getDrawable(f3c0.f7750Z1));
        FeedModule.f316d.m16618cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m15624p(Media media, Act act, VListCell vListCell, VListCell.a aVar, int i) {
        zvf0.r("e_save_picture", "p_comment_picture_preview");
        if (TextUtils.equals(aVar.a, "保存到本地")) {
            m15596K();
            Picture picture = (Picture) media;
            if (picture != null) {
                Dimension dimension = picture.size;
                if (dimension.width <= 0 || dimension.height <= 0) {
                    return;
                }
                dmh.m9487k().m9490i(act, media, true);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15625q(String str, d30 d30Var, final Act act, User user, final Moment moment, final boolean z, final String str2, final w9j w9jVar, String str3, d30 d30Var2, Media media, VListCell vListCell, VListCell.a aVar, int i) {
        if (TextUtils.equals(aVar.a, str)) {
            m15594I();
            d30Var.call();
            return;
        }
        if (TextUtils.equals(aVar.a, "喜欢")) {
            m15594I();
            FeedModule.m1140H().kn(act, user, true, (String) null, LikeFrom.get("moment"), ((DbObject) moment).id, (e30) null, (e30) null);
            return;
        }
        if (TextUtils.equals(aVar.a, "取消喜欢")) {
            m15594I();
            zvf0.u("e_unlike", "p_share_pop", new j760[]{vwb.Y("unlike_from", z ? "moment_detail" : str2), vwb.Y("other_user_id", NullChecker.a(user) ? ((DbObject) user).id : "")});
            swh.m14338f(act, user, str2, null);
            return;
        }
        final boolean z2 = false;
        if (TextUtils.equals(aVar.a, "取消关注")) {
            m15594I();
            swh.m14337e(act, user, str2, false);
            return;
        }
        if (TextUtils.equals(aVar.a, act.getString(R$string.f613t4))) {
            m15594I();
            q770.m13441l0(true);
            m15605T(act, null, null, act.getString(R$string.f619u4), new d30() { // from class: l.xvi
                public final void call() {
                    vwi.m15626r(act, w9jVar, moment, str2, z);
                }
            });
            return;
        }
        if (TextUtils.equals(aVar.a, act.getString(R$string.f434S3))) {
            m15594I();
            act.startActivity(kjb0.m11449a(act, moment.owner, false, null, ((DbObject) moment).id));
            v1h.m15211L0(act, moment.owner, ((DbObject) moment).id);
            return;
        }
        if (TextUtils.equals(aVar.a, str3)) {
            m15594I();
            List list = (List) FeedModule.f315c.f670M.n();
            if (list != null && list.contains(moment.owner)) {
                z2 = true;
            }
            final d30 d30Var3 = new d30() { // from class: l.yvi
                public final void call() {
                    vwi.m15618j(act, moment, z2);
                }
            };
            if (z2) {
                if (uzh.m15183p(act).mo14411d()) {
                    m15605T(act, act.getString(R$string.f606s3), uzh.m15183p(act).mo14416i(), uzh.m15183p(act).mo14418k(user.isFemale()), new d30() { // from class: l.zvi
                        public final void call() {
                            d30Var3.call();
                        }
                    });
                    return;
                } else {
                    d30Var3.call();
                    return;
                }
            }
            if (uzh.m15183p(act).mo14415h()) {
                m15605T(act, act.getString(R$string.f606s3), uzh.m15183p(act).mo14410c(), uzh.m15183p(act).mo14409b(), new d30() { // from class: l.awi
                    public final void call() {
                        d30Var3.call();
                    }
                });
            } else {
                d30Var3.call();
            }
            q770.m13441l0(true);
            return;
        }
        if (TextUtils.equals(aVar.a, act.getString(R$string.f515f1))) {
            m15594I();
            el00.m9903k().m9917u(act, moment, el00.m9903k().m9906i(moment), null);
            return;
        }
        if (TextUtils.equals(aVar.a, "不感兴趣")) {
            m15594I();
            p6j0.m12913c("e_feed_not_interested", "p_explore_feed_more", NullChecker.a(moment) ? j760.a("moment_id", ((DbObject) moment).id) : null);
            if (NullChecker.a(d30Var2)) {
                d30Var2.call();
                return;
            }
            return;
        }
        if (of00.f11454d.equals(aVar.a)) {
            of00.m12618f().m12624k(act, moment);
            m15594I();
        } else if (TextUtils.equals(aVar.a, "保存到本地")) {
            m15594I();
            if (media == null) {
                return;
            }
            Dimension dimension = ((Picture) media).size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            dmh.m9487k().m9490i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m15626r(final Act act, w9j w9jVar, Moment moment, String str, boolean z) {
        q770.m13441l0(false);
        act.progress(R$string.f445U2, true);
        ((c) w9jVar.call(moment)).subscribe(mkd0.H(new e30() { // from class: l.gwi
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, new e30() { // from class: l.hwi
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
        if ("from_activities_moment".equals(str) || (z && !(act instanceof FeedVideoFlowAct))) {
            act.setResult(-1);
            act.finishWithoutCustomAnimation();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m15627s(Media media, Act act) {
        Picture picture = (Picture) media;
        if (picture != null) {
            Dimension dimension = picture.size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            dmh.m9487k().m9490i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m15630v(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m1140H().yf(act, false, ((DbObject) user).id, !TextUtils.isEmpty(((DbObject) moment).id) ? ((DbObject) moment).id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            lsi0.y("音频暂不支持分享");
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m15633y(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m1140H().yf(act, true, ((DbObject) user).id, !TextUtils.isEmpty(((DbObject) moment).id) ? ((DbObject) moment).id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            lsi0.y("音频暂不支持分享");
        }
    }
}
