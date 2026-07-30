package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VListCell;

/* JADX INFO: loaded from: classes13.dex */
public class rzi {

    /* JADX INFO: renamed from: a */
    public static w30 f165538a;

    /* JADX INFO: renamed from: b */
    public static w30 f165539b;

    /* JADX INFO: renamed from: c */
    public static th0 f165540c;

    /* JADX INFO: renamed from: d */
    public static l4g0 f165541d = m183761H("p_explore_feed_more", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public static l4g0 f165542e;

    /* JADX INFO: renamed from: l.rzi$a */
    public class DialogInterfaceOnCancelListenerC19941a implements DialogInterface.OnCancelListener {
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            wf70.m206060l0(false);
        }
    }

    /* JADX INFO: renamed from: l.rzi$b */
    public class C19942b extends ur2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f165543a;

        public C19942b(String str) {
            this.f165543a = str;
        }

        @Override // p153l.e6m
        public String pageId() {
            return this.f165543a;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m183759F(Media media) {
        if (media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !(z && cmg.m111240v0() && ((Picture) media).livePhoto != null) && z;
    }

    /* JADX INFO: renamed from: G */
    public static void m183760G(final Act act, final Media media) {
        if (media == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("保存到本地");
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.myi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rzi.m183764K();
            }
        }).m204667S(new DialogInterface.OnCancelListener() { // from class: l.xyi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                wf70.m206060l0(false);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.izi
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                rzi.m183792p(media, act, vListCell, c22660a, i);
            }
        });
        i4g0.m138526x("e_save_picture", "p_comment_picture_preview");
        w30 w30VarM204654F = c21001b.m204654F();
        f165539b = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: H */
    public static l4g0 m183761H(String str, String str2) {
        return new l4g0(new C19942b(str), str2);
    }

    /* JADX INFO: renamed from: I */
    public static void m183762I() {
        l4g0 l4g0Var;
        if (NullChecker.m82486a(f165538a)) {
            f165538a.m204614b();
            f165538a = null;
            if (cmg.m111233s() && (l4g0Var = f165541d) != null) {
                l4g0Var.m152776k();
                f165541d.m152775j();
            }
            l4g0 l4g0Var2 = f165542e;
            if (l4g0Var2 != null) {
                l4g0Var2.m152776k();
                f165542e.m152775j();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m183763J() {
        th0 th0Var = f165540c;
        if (th0Var == null) {
            return;
        }
        th0Var.m191137c();
        f165540c = null;
        wf70.m206060l0(false);
    }

    /* JADX INFO: renamed from: K */
    public static void m183764K() {
        if (NullChecker.m82486a(f165539b)) {
            f165539b.m204614b();
            f165539b = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m183765L(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(qv5.m178247a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&comment_id=" + str4 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: M */
    public static int m183766M(final Act act, List<CharSequence> list) {
        return jyb.m147476G(list, new qcj() { // from class: l.yyi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CharSequence) obj).equals(act.getResources().getString(R$string.f40000t4)));
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static int m183767N(final Act act, List<CharSequence> list) {
        return jyb.m147476G(list, new qcj() { // from class: l.zyi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Act act2 = act;
                CharSequence charSequence = (CharSequence) obj;
                return Boolean.valueOf(charSequence.equals(act2.getResources().getString(R$string.f40005u3)) || charSequence.equals(act2.getResources().getString(R$string.f39821S3)));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static String m183768O(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(qv5.m178247a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: P */
    public static void m183769P(Moment moment, qcj<Moment, C22421c> qcjVar, User user, Act act, String str, boolean z) {
        m183771R(moment, qcjVar, user, act, str, z, null, null, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m183770Q(Moment moment, qcj<Moment, C22421c> qcjVar, User user, Act act, String str, boolean z, Media media) {
        m183771R(moment, qcjVar, user, act, str, z, null, null, null, media);
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
    public static void m183771R(final Moment moment, final qcj<Moment, C22421c> qcjVar, final User user, final Act act, String str, final boolean z, final String str2, final x20 x20Var, final x20 x20Var2, final Media media) {
        String str3;
        String str4;
        boolean z2;
        List<String> listM159277n;
        String strMo133332a;
        pf60 pf60VarM172085a;
        l4g0 l4g0Var;
        String str5;
        String str6;
        final Moment moment2;
        final Act act2;
        String str7;
        x20 x20Var3;
        x20 x20Var4;
        x20 x20Var5;
        final User user2;
        x20 x20Var6;
        String strMo133332a2;
        final String str8 = str;
        ArrayList arrayList = new ArrayList();
        if (!cmg.m111183K() || user.isMe()) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
                arrayList.add(str3);
            }
            if (ksg.m151187V(moment)) {
                return;
            }
            str4 = "";
            z2 = false;
            if (!j4h.m143422f() && NullChecker.m82486a(user) && NullChecker.m82486a(moment) && !user.isTeamAccount() && !moment.owner.equals(FeedModule.m61405F().userId())) {
                if (!cmg.m111183K() || user.isMe()) {
                    if (TextUtils.isEmpty(str3)) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                } else if (hyh.m137735l(user) && (!z || !cmg.m111229q())) {
                    str5 = "取消喜欢";
                } else if (hyh.m137731h(user)) {
                    str5 = "取消关注";
                } else if (!TextUtils.isEmpty(str3) || (z && !cmg.m111229q())) {
                    str5 = "喜欢";
                } else {
                    str5 = null;
                }
                List<String> listM159277n2 = FeedModule.f39702c.f40057M.m159277n();
                final boolean z3 = NullChecker.m82486a(listM159277n2) && listM159277n2.contains(moment.owner);
                if (at0.m100010d(moment)) {
                    str6 = "";
                } else {
                    if (z3) {
                        strMo133332a2 = j1i.m143129p(act).mo133332a();
                    } else {
                        strMo133332a2 = cmg.m111183K() ? "加入黑名单" : j1i.m143129p(act).mo133343l();
                    }
                    str6 = strMo133332a2;
                }
                final Picture.ImageUri imageUriProfileSmall = (!jyb.m147479J(moment.media) && NullChecker.m82486a(moment.media.get(0)) && NullChecker.m82486a(moment.media.get(0).cover()) && NullChecker.m82486a(moment.media.get(0).cover().profileSmall())) ? moment.media.get(0).cover().profileSmall() : user.m61308fp().profileSmall();
                final boolean z4 = (!jyb.m147479J(moment.media) && NullChecker.m82486a(moment.media.get(0)) && TextUtils.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4, moment.media.get(0).mediaType)) ? false : true;
                CoreService coreServiceM61406H = FeedModule.m61406H();
                String str9 = NullChecker.m82486a(moment) ? moment.f56859id : "";
                String str10 = (!z || TextUtils.equals(str8, "p_moment_preview")) ? str8 : "moment_detail";
                x20 x20Var7 = new x20() { // from class: l.kzi
                    @Override // p153l.x20
                    public final void call() {
                        rzi.m183798v(z4, act, user, moment, imageUriProfileSmall);
                    }
                };
                x20 x20Var8 = new x20() { // from class: l.lzi
                    @Override // p153l.x20
                    public final void call() {
                        rzi.m183801y(z4, act, user, moment, imageUriProfileSmall);
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    moment2 = moment;
                    act2 = act;
                    str7 = str5;
                    x20Var3 = null;
                } else {
                    final String str11 = str3;
                    final String str12 = str5;
                    x20Var3 = new x20() { // from class: l.mzi
                        @Override // p153l.x20
                        public final void call() {
                            rzi.m183779c(str11, str12, x20Var, act, user, moment, z, str8);
                        }
                    };
                    str7 = str12;
                    act2 = act;
                    moment2 = moment;
                    str8 = str8;
                }
                if (!pu20.m173798C(str8) || TextUtils.equals(moment2.owner, FeedModule.m61405F().userId())) {
                    x20Var4 = null;
                    x20Var5 = null;
                } else {
                    x20Var4 = new x20() { // from class: l.nzi
                        @Override // p153l.x20
                        public final void call() {
                            rzi.m183785i(x20Var2, moment2);
                        }
                    };
                    x20Var5 = null;
                }
                x20 x20Var9 = new x20() { // from class: l.ozi
                    @Override // p153l.x20
                    public final void call() {
                        Act act3 = act2;
                        Moment moment3 = moment2;
                        rzi.m183776W(act3, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC, moment3.owner, moment3.f56859id);
                    }
                };
                if ((("from_nearby_falls_feed".equals(str8) || pu20.m173798C(str8)) && !z) || "from_moment_detail_album".equals(str8) || at0.m100010d(moment2)) {
                    user2 = user;
                    x20Var6 = x20Var5;
                } else {
                    user2 = user;
                    x20Var6 = new x20() { // from class: l.pzi
                        @Override // p153l.x20
                        public final void call() {
                            rzi.m183782f(act2, moment2, z3, user2);
                        }
                    };
                }
                coreServiceM61406H.mo31724Q9(str9, act2, str10, "discover_discussion", str7, str6, x20Var7, x20Var8, x20Var3, x20Var4, x20Var9, x20Var6, new x20() { // from class: l.qzi
                    @Override // p153l.x20
                    public final void call() {
                        wf70.m206060l0(false);
                    }
                }, !m183759F(media) ? x20Var5 : new x20() { // from class: l.nyi
                    @Override // p153l.x20
                    public final void call() {
                        rzi.m183795s(media, act2);
                    }
                }, user2);
                return;
            }
            if (moment.owner.equals(FeedModule.m61405F().userId())) {
                if (((act instanceof MomentDetailAct) && !"from_moment_detail_album".equals(str8)) || (act instanceof PhotoAlbumFeedAct) || (!cmg.m111214i0() && ("from_mine_tab_album".equals(str8) || OMSDialogPositon.p_navigation_view.equals(str8)))) {
                    arrayList.add(act.getString(R$string.f39902f1));
                    if (cmg.m111190R() && xn00.m212081i(moment)) {
                        arrayList.add(xn00.f195342d);
                    }
                }
                if ((act instanceof PhotoAlbumFeedPreviewAct) && m183759F(media)) {
                    arrayList.add("保存到本地");
                }
                arrayList.add(act.getString(R$string.f40000t4));
            } else if (NullChecker.m82487b(user) && !user.isTeamAccount()) {
                if (pu20.m173798C(str8) && NullChecker.m82487b(moment) && !TextUtils.equals(moment.owner, FeedModule.m61405F().userId())) {
                    arrayList.add("不感兴趣");
                    if (NullChecker.m82486a(moment)) {
                        pf60VarM172085a = pf60.m172085a("moment_id", moment.f56859id);
                    } else {
                        pf60VarM172085a = null;
                    }
                    tfj0.m190942e("e_feed_not_interested", "p_explore_feed_more", pf60VarM172085a);
                }
                if (NullChecker.m82487b(moment)) {
                    arrayList.add(act.getString(R$string.f39821S3));
                }
                if ((("from_nearby_falls_feed".equals(str8) && !pu20.m173798C(str8)) || z) && !"from_moment_detail_album".equals(str8)) {
                    listM159277n = FeedModule.f39702c.f40057M.m159277n();
                    if (listM159277n != null && listM159277n.contains(moment.owner)) {
                        z2 = true;
                    }
                    if (!at0.m100010d(moment)) {
                        if (z2) {
                            strMo133332a = j1i.m143129p(act).mo133332a();
                        } else if (cmg.m111183K()) {
                            strMo133332a = "屏蔽动态并加入黑名单";
                        } else {
                            strMo133332a = j1i.m143129p(act).mo133343l();
                        }
                        str4 = strMo133332a;
                        arrayList.add(str4);
                    }
                }
            }
            final String str13 = str4;
            w30.C21001b c21001b = new w30.C21001b(act);
            w30.C21001b c21001bM204665Q = c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.oyi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rzi.m183762I();
                }
            }).m204667S(new DialogInterfaceOnCancelListenerC19941a()).m204665Q(arrayList);
            int[] iArr = {m183767N(act, arrayList), m183766M(act, arrayList)};
            int i = k9c0.f124497b;
            c21001bM204665Q.m204666R(iArr, new int[]{i, i}).m204670V(new w30.InterfaceC21003d() { // from class: l.pyi
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                    rzi.m183793q(str2, x20Var, act, user, moment, z, str8, qcjVar, str13, x20Var2, media, vListCell, c22660a, i2);
                }
            });
            w30 w30VarM204654F = c21001b.m204654F();
            f165538a = w30VarM204654F;
            w30VarM204654F.m204618f();
            if (cmg.m111233s() && (l4g0Var = f165541d) != null) {
                l4g0Var.m152774i();
                f165541d.m152777l();
            }
            if (f165542e == null) {
                l4g0 l4g0VarM183761H = m183761H(str8, Dialog.class.getName());
                f165542e = l4g0VarM183761H;
                l4g0VarM183761H.m152774i();
                f165542e.m152777l();
            }
            wf70.m206060l0(true);
        }
        if (hyh.m137735l(user) && (!z || !cmg.m111229q())) {
            arrayList.add("取消喜欢");
        } else if (hyh.m137731h(user)) {
            arrayList.add("取消关注");
        } else if (!TextUtils.isEmpty(str2) || (z && !cmg.m111229q())) {
            arrayList.add("喜欢");
        }
        str3 = str2;
        if (ksg.m151187V(moment)) {
            return;
        }
        str4 = "";
        z2 = false;
        if (!j4h.m143422f()) {
        }
        if (moment.owner.equals(FeedModule.m61405F().userId())) {
            if (act instanceof MomentDetailAct) {
                arrayList.add(act.getString(R$string.f39902f1));
                if (cmg.m111190R()) {
                    arrayList.add(xn00.f195342d);
                }
            } else {
                arrayList.add(act.getString(R$string.f39902f1));
                if (cmg.m111190R()) {
                    arrayList.add(xn00.f195342d);
                }
            }
            if (act instanceof PhotoAlbumFeedPreviewAct) {
                arrayList.add("保存到本地");
            }
            arrayList.add(act.getString(R$string.f40000t4));
        } else if (NullChecker.m82487b(user)) {
            if (pu20.m173798C(str8)) {
                arrayList.add("不感兴趣");
                if (NullChecker.m82486a(moment)) {
                    pf60VarM172085a = pf60.m172085a("moment_id", moment.f56859id);
                } else {
                    pf60VarM172085a = null;
                }
                tfj0.m190942e("e_feed_not_interested", "p_explore_feed_more", pf60VarM172085a);
            }
            if (NullChecker.m82487b(moment)) {
                arrayList.add(act.getString(R$string.f39821S3));
            }
            if ("from_nearby_falls_feed".equals(str8)) {
                listM159277n = FeedModule.f39702c.f40057M.m159277n();
                if (listM159277n != null) {
                    z2 = true;
                }
                if (!at0.m100010d(moment)) {
                    if (z2) {
                        strMo133332a = j1i.m143129p(act).mo133332a();
                    } else if (cmg.m111183K()) {
                        strMo133332a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo133332a = j1i.m143129p(act).mo133343l();
                    }
                    str4 = strMo133332a;
                    arrayList.add(str4);
                }
            } else {
                listM159277n = FeedModule.f39702c.f40057M.m159277n();
                if (listM159277n != null) {
                    z2 = true;
                }
                if (!at0.m100010d(moment)) {
                    if (z2) {
                        strMo133332a = j1i.m143129p(act).mo133332a();
                    } else if (cmg.m111183K()) {
                        strMo133332a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo133332a = j1i.m143129p(act).mo133343l();
                    }
                    str4 = strMo133332a;
                    arrayList.add(str4);
                }
            }
        }
        final String str14 = str4;
        w30.C21001b c21001b2 = new w30.C21001b(act);
        w30.C21001b c21001bM204665Q2 = c21001b2.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.oyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rzi.m183762I();
            }
        }).m204667S(new DialogInterfaceOnCancelListenerC19941a()).m204665Q(arrayList);
        int[] iArr2 = {m183767N(act, arrayList), m183766M(act, arrayList)};
        int i2 = k9c0.f124497b;
        c21001bM204665Q2.m204666R(iArr2, new int[]{i2, i2}).m204670V(new w30.InterfaceC21003d() { // from class: l.pyi
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i3) {
                rzi.m183793q(str2, x20Var, act, user, moment, z, str8, qcjVar, str14, x20Var2, media, vListCell, c22660a, i3);
            }
        });
        w30 w30VarM204654F2 = c21001b2.m204654F();
        f165538a = w30VarM204654F2;
        w30VarM204654F2.m204618f();
        if (cmg.m111233s()) {
            l4g0Var.m152774i();
            f165541d.m152777l();
        }
        if (f165542e == null) {
            l4g0 l4g0VarM183761H2 = m183761H(str8, Dialog.class.getName());
            f165542e = l4g0VarM183761H2;
            l4g0VarM183761H2.m152774i();
            f165542e.m152777l();
        }
        wf70.m206060l0(true);
    }

    /* JADX INFO: renamed from: S */
    public static void m183772S(Moment moment, pcj<String> pcjVar, pcj<Boolean> pcjVar2, x20 x20Var, qcj<Moment, C22421c> qcjVar, User user, Act act, String str, boolean z, x20 x20Var2) {
        m183771R(moment, qcjVar, user, act, str, z, (!m183774U(moment, pcjVar2, str) || cmg.m111202c0() || cmg.m111204d0()) ? null : pcjVar.call(), x20Var, x20Var2, null);
    }

    /* JADX INFO: renamed from: T */
    public static void m183773T(Act act, String str, String str2, String str3, final x20 x20Var) {
        th0.C20312a c20312a = new th0.C20312a(act);
        th0.C20312a c20312aM191151j = c20312a.m191151j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R$string.f39983r);
        }
        c20312aM191151j.m191159r(str).m191156o(new View.OnClickListener() { // from class: l.gzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rzi.m183781e(x20Var, view);
            }
        }).m191146e(R$string.f39865a).m191154m(new DialogInterface.OnDismissListener() { // from class: l.hzi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wf70.m206060l0(false);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.jzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rzi.m183763J();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            c20312a.m191160s(str2);
        }
        th0 th0VarM191142a = c20312a.m191142a();
        f165540c = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m183774U(Moment moment, pcj<Boolean> pcjVar, String str) {
        return (moment.owner.equals(FeedModule.m61405F().userId()) || ksg.m151187V(moment) || at0.m100010d(moment) || "from_nearby_focus".equals(str) || !pcjVar.call().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static void m183775V(Act act, String str, String str2, String str3, String str4) {
        ryh.m183606a(act, "", m183765L(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: W */
    public static void m183776W(Act act, String str, String str2, String str3) {
        ryh.m183606a(act, "", m183768O(str, str2, str3));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m183778b(final Act act, final Moment moment, final boolean z) {
        wf70.m206060l0(false);
        act.progress(R$string.f39832U2, true);
        FeedModule.f39702c.f40057M.m61956M(moment.owner, !z).subscribe(psd0.m173597H(new y20() { // from class: l.azi
            @Override // p153l.y20
            public final void call(Object obj) {
                rzi.m183787k(act, z, moment, (uxj0) obj);
            }
        }, new y20() { // from class: l.bzi
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m183779c(String str, String str2, x20 x20Var, Act act, User user, Moment moment, boolean z, String str3) {
        if (TextUtils.equals(str, str2) && NullChecker.m82486a(x20Var)) {
            x20Var.call();
            return;
        }
        if (TextUtils.equals("喜欢", str2)) {
            FeedModule.m61406H().mo31791kn(act, user, true, null, LikeFrom.get("moment"), moment.f56859id, null, null);
            return;
        }
        if (TextUtils.equals("取消喜欢", str2)) {
            i4g0.m138523u("e_unlike", "p_share_pop", jyb.m147494Y("unlike_from", z ? "moment_detail" : BannerLoc.moment_feed), jyb.m147494Y("other_user_id", NullChecker.m82486a(user) ? user.f56859id : ""));
            hyh.m137729f(act, user, str3, null);
        } else if (TextUtils.equals("取消关注", str2)) {
            hyh.m137728e(act, user, str3, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m183781e(x20 x20Var, View view) {
        m183763J();
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m183782f(final Act act, final Moment moment, final boolean z, User user) {
        final x20 x20Var = new x20() { // from class: l.qyi
            @Override // p153l.x20
            public final void call() {
                rzi.m183778b(act, moment, z);
            }
        };
        if (z) {
            if (j1i.m143129p(act).mo133335d()) {
                m183773T(act, act.getString(R$string.f39993s3), j1i.m143129p(act).mo133340i(), j1i.m143129p(act).mo133342k(user.isFemale()), new x20() { // from class: l.ryi
                    @Override // p153l.x20
                    public final void call() {
                        x20Var.call();
                    }
                });
                return;
            } else {
                x20Var.call();
                return;
            }
        }
        if (j1i.m143129p(act).mo133339h()) {
            m183773T(act, act.getString(R$string.f39993s3), j1i.m143129p(act).mo133334c(), j1i.m143129p(act).mo133333b(), new x20() { // from class: l.syi
                @Override // p153l.x20
                public final void call() {
                    x20Var.call();
                }
            });
        } else {
            x20Var.call();
        }
        wf70.m206060l0(true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m183783g(Act act, boolean z, Moment moment, uxj0 uxj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        o1j0.m165643q(z ? j1i.m143129p(act).mo133341j() : j1i.m143129p(act).mo133338g(), act.getResources().getDrawable(lbc0.f130985Z1));
        FeedModule.f39703d.m145678cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m183785i(x20 x20Var, Moment moment) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        tfj0.m190942e("e_feed_not_interested", "p_explore_feed_more", NullChecker.m82486a(moment) ? pf60.m172085a("moment_id", moment.f56859id) : null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m183786j(final Act act, final Moment moment, final boolean z) {
        wf70.m206060l0(false);
        act.progress(R$string.f39832U2, true);
        FeedModule.f39702c.f40057M.m61956M(moment.owner, !z).subscribe(psd0.m173597H(new y20() { // from class: l.ezi
            @Override // p153l.y20
            public final void call(Object obj) {
                rzi.m183783g(act, z, moment, (uxj0) obj);
            }
        }, new y20() { // from class: l.fzi
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m183787k(Act act, boolean z, Moment moment, uxj0 uxj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        o1j0.m165643q(z ? j1i.m143129p(act).mo133341j() : j1i.m143129p(act).mo133338g(), act.getResources().getDrawable(lbc0.f130985Z1));
        FeedModule.f39703d.m145678cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m183792p(Media media, Act act, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        i4g0.m138520r("e_save_picture", "p_comment_picture_preview");
        if (TextUtils.equals(c22660a.f210081a, "保存到本地")) {
            m183764K();
            Picture picture = (Picture) media;
            if (picture != null) {
                Dimension dimension = picture.size;
                if (dimension.width <= 0 || dimension.height <= 0) {
                    return;
                }
                snh.m186928k().m186931i(act, media, true);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m183793q(String str, x20 x20Var, final Act act, User user, final Moment moment, final boolean z, final String str2, final qcj qcjVar, String str3, x20 x20Var2, Media media, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (TextUtils.equals(c22660a.f210081a, str)) {
            m183762I();
            x20Var.call();
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, "喜欢")) {
            m183762I();
            FeedModule.m61406H().mo31791kn(act, user, true, null, LikeFrom.get("moment"), moment.f56859id, null, null);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, "取消喜欢")) {
            m183762I();
            i4g0.m138523u("e_unlike", "p_share_pop", jyb.m147494Y("unlike_from", z ? "moment_detail" : str2), jyb.m147494Y("other_user_id", NullChecker.m82486a(user) ? user.f56859id : ""));
            hyh.m137729f(act, user, str2, null);
            return;
        }
        final boolean z2 = false;
        if (TextUtils.equals(c22660a.f210081a, "取消关注")) {
            m183762I();
            hyh.m137728e(act, user, str2, false);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, act.getString(R$string.f40000t4))) {
            m183762I();
            wf70.m206060l0(true);
            m183773T(act, null, null, act.getString(R$string.f40006u4), new x20() { // from class: l.tyi
                @Override // p153l.x20
                public final void call() {
                    rzi.m183794r(act, qcjVar, moment, str2, z);
                }
            });
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, act.getString(R$string.f39821S3))) {
            m183762I();
            act.startActivity(orb0.m168884a(act, moment.owner, false, null, moment.f56859id));
            k3h.m148049L0(act, moment.owner, moment.f56859id);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, str3)) {
            m183762I();
            List<String> listM159277n = FeedModule.f39702c.f40057M.m159277n();
            if (listM159277n != null && listM159277n.contains(moment.owner)) {
                z2 = true;
            }
            final x20 x20Var3 = new x20() { // from class: l.uyi
                @Override // p153l.x20
                public final void call() {
                    rzi.m183786j(act, moment, z2);
                }
            };
            if (z2) {
                if (j1i.m143129p(act).mo133335d()) {
                    m183773T(act, act.getString(R$string.f39993s3), j1i.m143129p(act).mo133340i(), j1i.m143129p(act).mo133342k(user.isFemale()), new x20() { // from class: l.vyi
                        @Override // p153l.x20
                        public final void call() {
                            x20Var3.call();
                        }
                    });
                    return;
                } else {
                    x20Var3.call();
                    return;
                }
            }
            if (j1i.m143129p(act).mo133339h()) {
                m183773T(act, act.getString(R$string.f39993s3), j1i.m143129p(act).mo133334c(), j1i.m143129p(act).mo133333b(), new x20() { // from class: l.wyi
                    @Override // p153l.x20
                    public final void call() {
                        x20Var3.call();
                    }
                });
            } else {
                x20Var3.call();
            }
            wf70.m206060l0(true);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, act.getString(R$string.f39902f1))) {
            m183762I();
            nt00.m164664k().m164678u(act, moment, nt00.m164664k().m164667i(moment), null);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, "不感兴趣")) {
            m183762I();
            tfj0.m190940c("e_feed_not_interested", "p_explore_feed_more", NullChecker.m82486a(moment) ? pf60.m172085a("moment_id", moment.f56859id) : null);
            if (NullChecker.m82486a(x20Var2)) {
                x20Var2.call();
                return;
            }
            return;
        }
        if (xn00.f195342d.equals(c22660a.f210081a)) {
            xn00.m212080f().m212086k(act, moment);
            m183762I();
        } else if (TextUtils.equals(c22660a.f210081a, "保存到本地")) {
            m183762I();
            if (media == null) {
                return;
            }
            Dimension dimension = ((Picture) media).size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            snh.m186928k().m186931i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m183794r(final Act act, qcj qcjVar, Moment moment, String str, boolean z) {
        wf70.m206060l0(false);
        act.progress(R$string.f39832U2, true);
        ((C22421c) qcjVar.call(moment)).subscribe(psd0.m173597H(new y20() { // from class: l.czi
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, new y20() { // from class: l.dzi
            @Override // p153l.y20
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
    public static /* synthetic */ void m183795s(Media media, Act act) {
        Picture picture = (Picture) media;
        if (picture != null) {
            Dimension dimension = picture.size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            snh.m186928k().m186931i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m183798v(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m61406H().mo31841yf(act, false, user.f56859id, !TextUtils.isEmpty(moment.f56859id) ? moment.f56859id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            o1j0.m165651y("音频暂不支持分享");
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m183801y(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m61406H().mo31841yf(act, true, user.f56859id, !TextUtils.isEmpty(moment.f56859id) ? moment.f56859id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            o1j0.m165651y("音频暂不支持分享");
        }
    }
}
