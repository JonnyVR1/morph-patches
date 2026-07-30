package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VListCell;

/* JADX INFO: loaded from: classes12.dex */
public class vwi {

    /* JADX INFO: renamed from: a */
    public static c40 f183342a;

    /* JADX INFO: renamed from: b */
    public static c40 f183343b;

    /* JADX INFO: renamed from: c */
    public static xh0 f183344c;

    /* JADX INFO: renamed from: d */
    public static cwf0 f183345d = m200377H("p_explore_feed_more", Dialog.class.getName());

    /* JADX INFO: renamed from: e */
    public static cwf0 f183346e;

    /* JADX INFO: renamed from: l.vwi$a */
    public class DialogInterfaceOnCancelListenerC20746a implements DialogInterface.OnCancelListener {
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            q770.m173197l0(false);
        }
    }

    /* JADX INFO: renamed from: l.vwi$b */
    public class C20747b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f183347a;

        public C20747b(String str) {
            this.f183347a = str;
        }

        @Override // p149l.n3m
        public String pageId() {
            return this.f183347a;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m200375F(Media media) {
        if (media == null) {
            return false;
        }
        boolean z = media instanceof Picture;
        return !(z && nkg.m159911v0() && ((Picture) media).livePhoto != null) && z;
    }

    /* JADX INFO: renamed from: G */
    public static void m200376G(final Act act, final Media media) {
        if (media == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("保存到本地");
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.qvi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m200380K();
            }
        }).m105166S(new DialogInterface.OnCancelListener() { // from class: l.bwi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                q770.m173197l0(false);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.mwi
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                vwi.m200408p(media, act, vListCell, c22545a, i);
            }
        });
        zvf0.m220402x("e_save_picture", "p_comment_picture_preview");
        c40 c40VarM105153F = c16057b.m105153F();
        f183343b = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: H */
    public static cwf0 m200377H(String str, String str2) {
        return new cwf0(new C20747b(str), str2);
    }

    /* JADX INFO: renamed from: I */
    public static void m200378I() {
        cwf0 cwf0Var;
        if (NullChecker.m81303a(f183342a)) {
            f183342a.m105113b();
            f183342a = null;
            if (nkg.m159904s() && (cwf0Var = f183345d) != null) {
                cwf0Var.m109035k();
                f183345d.m109034j();
            }
            cwf0 cwf0Var2 = f183346e;
            if (cwf0Var2 != null) {
                cwf0Var2.m109035k();
                f183346e.m109034j();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m200379J() {
        xh0 xh0Var = f183344c;
        if (xh0Var == null) {
            return;
        }
        xh0Var.m208717c();
        f183344c = null;
        q770.m173197l0(false);
    }

    /* JADX INFO: renamed from: K */
    public static void m200380K() {
        if (NullChecker.m81303a(f183343b)) {
            f183343b.m105113b();
            f183343b = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m200381L(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(mu5.m156376a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&comment_id=" + str4 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: M */
    public static int m200382M(final Act act, List<CharSequence> list) {
        return vwb.m200293G(list, new w9j() { // from class: l.cwi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CharSequence) obj).equals(act.getResources().getString(R$string.f39152t4)));
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static int m200383N(final Act act, List<CharSequence> list) {
        return vwb.m200293G(list, new w9j() { // from class: l.dwi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Act act2 = act;
                CharSequence charSequence = (CharSequence) obj;
                return Boolean.valueOf(charSequence.equals(act2.getResources().getString(R$string.f39157u3)) || charSequence.equals(act2.getResources().getString(R$string.f38973S3)));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static String m200384O(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(mu5.m156376a("m"));
        stringBuffer.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/new-report/index.html?speed=true&_bid=1004033&from=" + str + "&moment_id=" + str3 + "&receive_report_user_id=" + str2 + "&hideNavigationBar=1&hideNotch=1&_offline=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: P */
    public static void m200385P(Moment moment, w9j<Moment, C22306c> w9jVar, User user, Act act, String str, boolean z) {
        m200387R(moment, w9jVar, user, act, str, z, null, null, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m200386Q(Moment moment, w9j<Moment, C22306c> w9jVar, User user, Act act, String str, boolean z, Media media) {
        m200387R(moment, w9jVar, user, act, str, z, null, null, null, media);
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
    public static void m200387R(final Moment moment, final w9j<Moment, C22306c> w9jVar, final User user, final Act act, String str, final boolean z, final String str2, final d30 d30Var, final d30 d30Var2, final Media media) {
        String str3;
        String str4;
        boolean z2;
        List<String> listM121233n;
        String strMo186782a;
        j760 j760VarM140076a;
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
        String strMo186782a2;
        final String str8 = str;
        ArrayList arrayList = new ArrayList();
        if (!nkg.m159854K() || user.isMe()) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
                arrayList.add(str3);
            }
            if (vqg.m199528V(moment)) {
                return;
            }
            str4 = "";
            z2 = false;
            if (!u2h.m191497f() && NullChecker.m81303a(user) && NullChecker.m81303a(moment) && !user.isTeamAccount() && !moment.owner.equals(FeedModule.m60221F().userId())) {
                if (!nkg.m159854K() || user.isMe()) {
                    if (TextUtils.isEmpty(str3)) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                } else if (swh.m186175l(user) && (!z || !nkg.m159900q())) {
                    str5 = "取消喜欢";
                } else if (swh.m186171h(user)) {
                    str5 = "取消关注";
                } else if (!TextUtils.isEmpty(str3) || (z && !nkg.m159900q())) {
                    str5 = "喜欢";
                } else {
                    str5 = null;
                }
                List<String> listM121233n2 = FeedModule.f38854c.f39209M.m121233n();
                final boolean z3 = NullChecker.m81303a(listM121233n2) && listM121233n2.contains(moment.owner);
                if (vs0.m199798d(moment)) {
                    str6 = "";
                } else {
                    if (z3) {
                        strMo186782a2 = uzh.m196413p(act).mo186782a();
                    } else {
                        strMo186782a2 = nkg.m159854K() ? "加入黑名单" : uzh.m196413p(act).mo186793l();
                    }
                    str6 = strMo186782a2;
                }
                final Picture.ImageUri imageUriProfileSmall = (!vwb.m200296J(moment.media) && NullChecker.m81303a(moment.media.get(0)) && NullChecker.m81303a(moment.media.get(0).cover()) && NullChecker.m81303a(moment.media.get(0).cover().profileSmall())) ? moment.media.get(0).cover().profileSmall() : user.m60124fp().profileSmall();
                final boolean z4 = (!vwb.m200296J(moment.media) && NullChecker.m81303a(moment.media.get(0)) && TextUtils.equals(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4, moment.media.get(0).mediaType)) ? false : true;
                CoreService coreServiceM60222H = FeedModule.m60222H();
                String str9 = NullChecker.m81303a(moment) ? moment.f56011id : "";
                String str10 = (!z || TextUtils.equals(str8, "p_moment_preview")) ? str8 : "moment_detail";
                d30 d30Var7 = new d30() { // from class: l.owi
                    @Override // p149l.d30
                    public final void call() {
                        vwi.m200414v(z4, act, user, moment, imageUriProfileSmall);
                    }
                };
                d30 d30Var8 = new d30() { // from class: l.pwi
                    @Override // p149l.d30
                    public final void call() {
                        vwi.m200417y(z4, act, user, moment, imageUriProfileSmall);
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
                        @Override // p149l.d30
                        public final void call() {
                            vwi.m200395c(str11, str12, d30Var, act, user, moment, z, str8);
                        }
                    };
                    str7 = str12;
                    act2 = act;
                    moment2 = moment;
                    str8 = str8;
                }
                if (!fm20.m122110C(str8) || TextUtils.equals(moment2.owner, FeedModule.m60221F().userId())) {
                    d30Var4 = null;
                    d30Var5 = null;
                } else {
                    d30Var4 = new d30() { // from class: l.rwi
                        @Override // p149l.d30
                        public final void call() {
                            vwi.m200401i(d30Var2, moment2);
                        }
                    };
                    d30Var5 = null;
                }
                d30 d30Var9 = new d30() { // from class: l.swi
                    @Override // p149l.d30
                    public final void call() {
                        Act act3 = act2;
                        Moment moment3 = moment2;
                        vwi.m200392W(act3, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC, moment3.owner, moment3.f56011id);
                    }
                };
                if ((("from_nearby_falls_feed".equals(str8) || fm20.m122110C(str8)) && !z) || "from_moment_detail_album".equals(str8) || vs0.m199798d(moment2)) {
                    user2 = user;
                    d30Var6 = d30Var5;
                } else {
                    user2 = user;
                    d30Var6 = new d30() { // from class: l.twi
                        @Override // p149l.d30
                        public final void call() {
                            vwi.m200398f(act2, moment2, z3, user2);
                        }
                    };
                }
                coreServiceM60222H.mo30721Q9(str9, act2, str10, "discover_discussion", str7, str6, d30Var7, d30Var8, d30Var3, d30Var4, d30Var9, d30Var6, new d30() { // from class: l.uwi
                    @Override // p149l.d30
                    public final void call() {
                        q770.m173197l0(false);
                    }
                }, !m200375F(media) ? d30Var5 : new d30() { // from class: l.rvi
                    @Override // p149l.d30
                    public final void call() {
                        vwi.m200411s(media, act2);
                    }
                }, user2);
                return;
            }
            if (moment.owner.equals(FeedModule.m60221F().userId())) {
                if (((act instanceof MomentDetailAct) && !"from_moment_detail_album".equals(str8)) || (act instanceof PhotoAlbumFeedAct) || (!nkg.m159885i0() && ("from_mine_tab_album".equals(str8) || OMSDialogPositon.p_navigation_view.equals(str8)))) {
                    arrayList.add(act.getString(R$string.f39054f1));
                    if (nkg.m159861R() && of00.m164045i(moment)) {
                        arrayList.add(of00.f143608d);
                    }
                }
                if ((act instanceof PhotoAlbumFeedPreviewAct) && m200375F(media)) {
                    arrayList.add("保存到本地");
                }
                arrayList.add(act.getString(R$string.f39152t4));
            } else if (NullChecker.m81304b(user) && !user.isTeamAccount()) {
                if (fm20.m122110C(str8) && NullChecker.m81304b(moment) && !TextUtils.equals(moment.owner, FeedModule.m60221F().userId())) {
                    arrayList.add("不感兴趣");
                    if (NullChecker.m81303a(moment)) {
                        j760VarM140076a = j760.m140076a("moment_id", moment.f56011id);
                    } else {
                        j760VarM140076a = null;
                    }
                    p6j0.m167671e("e_feed_not_interested", "p_explore_feed_more", j760VarM140076a);
                }
                if (NullChecker.m81304b(moment)) {
                    arrayList.add(act.getString(R$string.f38973S3));
                }
                if ((("from_nearby_falls_feed".equals(str8) && !fm20.m122110C(str8)) || z) && !"from_moment_detail_album".equals(str8)) {
                    listM121233n = FeedModule.f38854c.f39209M.m121233n();
                    if (listM121233n != null && listM121233n.contains(moment.owner)) {
                        z2 = true;
                    }
                    if (!vs0.m199798d(moment)) {
                        if (z2) {
                            strMo186782a = uzh.m196413p(act).mo186782a();
                        } else if (nkg.m159854K()) {
                            strMo186782a = "屏蔽动态并加入黑名单";
                        } else {
                            strMo186782a = uzh.m196413p(act).mo186793l();
                        }
                        str4 = strMo186782a;
                        arrayList.add(str4);
                    }
                }
            }
            final String str13 = str4;
            c40.C16057b c16057b = new c40.C16057b(act);
            c40.C16057b c16057bM105164Q = c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.svi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vwi.m200378I();
                }
            }).m105166S(new DialogInterfaceOnCancelListenerC20746a()).m105164Q(arrayList);
            int[] iArr = {m200383N(act, arrayList), m200382M(act, arrayList)};
            int i = e1c0.f88774b;
            c16057bM105164Q.m105165R(iArr, new int[]{i, i}).m105169V(new c40.InterfaceC16059d() { // from class: l.tvi
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                    vwi.m200409q(str2, d30Var, act, user, moment, z, str8, w9jVar, str13, d30Var2, media, vListCell, c22545a, i2);
                }
            });
            c40 c40VarM105153F = c16057b.m105153F();
            f183342a = c40VarM105153F;
            c40VarM105153F.m105117f();
            if (nkg.m159904s() && (cwf0Var = f183345d) != null) {
                cwf0Var.m109033i();
                f183345d.m109036l();
            }
            if (f183346e == null) {
                cwf0 cwf0VarM200377H = m200377H(str8, Dialog.class.getName());
                f183346e = cwf0VarM200377H;
                cwf0VarM200377H.m109033i();
                f183346e.m109036l();
            }
            q770.m173197l0(true);
        }
        if (swh.m186175l(user) && (!z || !nkg.m159900q())) {
            arrayList.add("取消喜欢");
        } else if (swh.m186171h(user)) {
            arrayList.add("取消关注");
        } else if (!TextUtils.isEmpty(str2) || (z && !nkg.m159900q())) {
            arrayList.add("喜欢");
        }
        str3 = str2;
        if (vqg.m199528V(moment)) {
            return;
        }
        str4 = "";
        z2 = false;
        if (!u2h.m191497f()) {
        }
        if (moment.owner.equals(FeedModule.m60221F().userId())) {
            if (act instanceof MomentDetailAct) {
                arrayList.add(act.getString(R$string.f39054f1));
                if (nkg.m159861R()) {
                    arrayList.add(of00.f143608d);
                }
            } else {
                arrayList.add(act.getString(R$string.f39054f1));
                if (nkg.m159861R()) {
                    arrayList.add(of00.f143608d);
                }
            }
            if (act instanceof PhotoAlbumFeedPreviewAct) {
                arrayList.add("保存到本地");
            }
            arrayList.add(act.getString(R$string.f39152t4));
        } else if (NullChecker.m81304b(user)) {
            if (fm20.m122110C(str8)) {
                arrayList.add("不感兴趣");
                if (NullChecker.m81303a(moment)) {
                    j760VarM140076a = j760.m140076a("moment_id", moment.f56011id);
                } else {
                    j760VarM140076a = null;
                }
                p6j0.m167671e("e_feed_not_interested", "p_explore_feed_more", j760VarM140076a);
            }
            if (NullChecker.m81304b(moment)) {
                arrayList.add(act.getString(R$string.f38973S3));
            }
            if ("from_nearby_falls_feed".equals(str8)) {
                listM121233n = FeedModule.f38854c.f39209M.m121233n();
                if (listM121233n != null) {
                    z2 = true;
                }
                if (!vs0.m199798d(moment)) {
                    if (z2) {
                        strMo186782a = uzh.m196413p(act).mo186782a();
                    } else if (nkg.m159854K()) {
                        strMo186782a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo186782a = uzh.m196413p(act).mo186793l();
                    }
                    str4 = strMo186782a;
                    arrayList.add(str4);
                }
            } else {
                listM121233n = FeedModule.f38854c.f39209M.m121233n();
                if (listM121233n != null) {
                    z2 = true;
                }
                if (!vs0.m199798d(moment)) {
                    if (z2) {
                        strMo186782a = uzh.m196413p(act).mo186782a();
                    } else if (nkg.m159854K()) {
                        strMo186782a = "屏蔽动态并加入黑名单";
                    } else {
                        strMo186782a = uzh.m196413p(act).mo186793l();
                    }
                    str4 = strMo186782a;
                    arrayList.add(str4);
                }
            }
        }
        final String str14 = str4;
        c40.C16057b c16057b2 = new c40.C16057b(act);
        c40.C16057b c16057bM105164Q2 = c16057b2.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.svi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m200378I();
            }
        }).m105166S(new DialogInterfaceOnCancelListenerC20746a()).m105164Q(arrayList);
        int[] iArr2 = {m200383N(act, arrayList), m200382M(act, arrayList)};
        int i2 = e1c0.f88774b;
        c16057bM105164Q2.m105165R(iArr2, new int[]{i2, i2}).m105169V(new c40.InterfaceC16059d() { // from class: l.tvi
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i3) {
                vwi.m200409q(str2, d30Var, act, user, moment, z, str8, w9jVar, str14, d30Var2, media, vListCell, c22545a, i3);
            }
        });
        c40 c40VarM105153F2 = c16057b2.m105153F();
        f183342a = c40VarM105153F2;
        c40VarM105153F2.m105117f();
        if (nkg.m159904s()) {
            cwf0Var.m109033i();
            f183345d.m109036l();
        }
        if (f183346e == null) {
            cwf0 cwf0VarM200377H2 = m200377H(str8, Dialog.class.getName());
            f183346e = cwf0VarM200377H2;
            cwf0VarM200377H2.m109033i();
            f183346e.m109036l();
        }
        q770.m173197l0(true);
    }

    /* JADX INFO: renamed from: S */
    public static void m200388S(Moment moment, v9j<String> v9jVar, v9j<Boolean> v9jVar2, d30 d30Var, w9j<Moment, C22306c> w9jVar, User user, Act act, String str, boolean z, d30 d30Var2) {
        m200387R(moment, w9jVar, user, act, str, z, (!m200390U(moment, v9jVar2, str) || nkg.m159873c0() || nkg.m159875d0()) ? null : v9jVar.call(), d30Var, d30Var2, null);
    }

    /* JADX INFO: renamed from: T */
    public static void m200389T(Act act, String str, String str2, String str3, final d30 d30Var) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        xh0.C21150a c21150aM208731j = c21150a.m208731j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R$string.f39135r);
        }
        c21150aM208731j.m208739r(str).m208736o(new View.OnClickListener() { // from class: l.kwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m200397e(d30Var, view);
            }
        }).m208726e(R$string.f39017a).m208734m(new DialogInterface.OnDismissListener() { // from class: l.lwi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m173197l0(false);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.nwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwi.m200379J();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            c21150a.m208740s(str2);
        }
        xh0 xh0VarM208722a = c21150a.m208722a();
        f183344c = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m200390U(Moment moment, v9j<Boolean> v9jVar, String str) {
        return (moment.owner.equals(FeedModule.m60221F().userId()) || vqg.m199528V(moment) || vs0.m199798d(moment) || "from_nearby_focus".equals(str) || !v9jVar.call().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: V */
    public static void m200391V(Act act, String str, String str2, String str3, String str4) {
        cxh.m109099a(act, "", m200381L(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: W */
    public static void m200392W(Act act, String str, String str2, String str3) {
        cxh.m109099a(act, "", m200384O(str, str2, str3));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m200394b(final Act act, final Moment moment, final boolean z) {
        q770.m173197l0(false);
        act.progress(R$string.f38984U2, true);
        FeedModule.f38854c.f39209M.m60772M(moment.owner, !z).subscribe(mkd0.m154956H(new e30() { // from class: l.ewi
            @Override // p149l.e30
            public final void call(Object obj) {
                vwi.m200403k(act, z, moment, (roj0) obj);
            }
        }, new e30() { // from class: l.fwi
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m200395c(String str, String str2, d30 d30Var, Act act, User user, Moment moment, boolean z, String str3) {
        if (TextUtils.equals(str, str2) && NullChecker.m81303a(d30Var)) {
            d30Var.call();
            return;
        }
        if (TextUtils.equals("喜欢", str2)) {
            FeedModule.m60222H().mo30788kn(act, user, true, null, LikeFrom.get("moment"), moment.f56011id, null, null);
            return;
        }
        if (TextUtils.equals("取消喜欢", str2)) {
            zvf0.m220399u("e_unlike", "p_share_pop", vwb.m200311Y("unlike_from", z ? "moment_detail" : BannerLoc.moment_feed), vwb.m200311Y("other_user_id", NullChecker.m81303a(user) ? user.f56011id : ""));
            swh.m186169f(act, user, str3, null);
        } else if (TextUtils.equals("取消关注", str2)) {
            swh.m186168e(act, user, str3, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m200397e(d30 d30Var, View view) {
        m200379J();
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m200398f(final Act act, final Moment moment, final boolean z, User user) {
        final d30 d30Var = new d30() { // from class: l.uvi
            @Override // p149l.d30
            public final void call() {
                vwi.m200394b(act, moment, z);
            }
        };
        if (z) {
            if (uzh.m196413p(act).mo186785d()) {
                m200389T(act, act.getString(R$string.f39145s3), uzh.m196413p(act).mo186790i(), uzh.m196413p(act).mo186792k(user.isFemale()), new d30() { // from class: l.vvi
                    @Override // p149l.d30
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
        if (uzh.m196413p(act).mo186789h()) {
            m200389T(act, act.getString(R$string.f39145s3), uzh.m196413p(act).mo186784c(), uzh.m196413p(act).mo186783b(), new d30() { // from class: l.wvi
                @Override // p149l.d30
                public final void call() {
                    d30Var.call();
                }
            });
        } else {
            d30Var.call();
        }
        q770.m173197l0(true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m200399g(Act act, boolean z, Moment moment, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.m151587q(z ? uzh.m196413p(act).mo186791j() : uzh.m196413p(act).mo186788g(), act.getResources().getDrawable(f3c0.f94467Z1));
        FeedModule.f38855d.m209437cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m200401i(d30 d30Var, Moment moment) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        p6j0.m167671e("e_feed_not_interested", "p_explore_feed_more", NullChecker.m81303a(moment) ? j760.m140076a("moment_id", moment.f56011id) : null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m200402j(final Act act, final Moment moment, final boolean z) {
        q770.m173197l0(false);
        act.progress(R$string.f38984U2, true);
        FeedModule.f38854c.f39209M.m60772M(moment.owner, !z).subscribe(mkd0.m154956H(new e30() { // from class: l.iwi
            @Override // p149l.e30
            public final void call(Object obj) {
                vwi.m200399g(act, z, moment, (roj0) obj);
            }
        }, new e30() { // from class: l.jwi
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m200403k(Act act, boolean z, Moment moment, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        lsi0.m151587q(z ? uzh.m196413p(act).mo186791j() : uzh.m196413p(act).mo186788g(), act.getResources().getDrawable(f3c0.f94467Z1));
        FeedModule.f38855d.m209437cc(moment.owner, !z);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m200408p(Media media, Act act, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        zvf0.m220396r("e_save_picture", "p_comment_picture_preview");
        if (TextUtils.equals(c22545a.f209159a, "保存到本地")) {
            m200380K();
            Picture picture = (Picture) media;
            if (picture != null) {
                Dimension dimension = picture.size;
                if (dimension.width <= 0 || dimension.height <= 0) {
                    return;
                }
                dmh.m112483k().m112486i(act, media, true);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m200409q(String str, d30 d30Var, final Act act, User user, final Moment moment, final boolean z, final String str2, final w9j w9jVar, String str3, d30 d30Var2, Media media, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (TextUtils.equals(c22545a.f209159a, str)) {
            m200378I();
            d30Var.call();
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, "喜欢")) {
            m200378I();
            FeedModule.m60222H().mo30788kn(act, user, true, null, LikeFrom.get("moment"), moment.f56011id, null, null);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, "取消喜欢")) {
            m200378I();
            zvf0.m220399u("e_unlike", "p_share_pop", vwb.m200311Y("unlike_from", z ? "moment_detail" : str2), vwb.m200311Y("other_user_id", NullChecker.m81303a(user) ? user.f56011id : ""));
            swh.m186169f(act, user, str2, null);
            return;
        }
        final boolean z2 = false;
        if (TextUtils.equals(c22545a.f209159a, "取消关注")) {
            m200378I();
            swh.m186168e(act, user, str2, false);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, act.getString(R$string.f39152t4))) {
            m200378I();
            q770.m173197l0(true);
            m200389T(act, null, null, act.getString(R$string.f39158u4), new d30() { // from class: l.xvi
                @Override // p149l.d30
                public final void call() {
                    vwi.m200410r(act, w9jVar, moment, str2, z);
                }
            });
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, act.getString(R$string.f38973S3))) {
            m200378I();
            act.startActivity(kjb0.m146190a(act, moment.owner, false, null, moment.f56011id));
            v1h.m196572L0(act, moment.owner, moment.f56011id);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, str3)) {
            m200378I();
            List<String> listM121233n = FeedModule.f38854c.f39209M.m121233n();
            if (listM121233n != null && listM121233n.contains(moment.owner)) {
                z2 = true;
            }
            final d30 d30Var3 = new d30() { // from class: l.yvi
                @Override // p149l.d30
                public final void call() {
                    vwi.m200402j(act, moment, z2);
                }
            };
            if (z2) {
                if (uzh.m196413p(act).mo186785d()) {
                    m200389T(act, act.getString(R$string.f39145s3), uzh.m196413p(act).mo186790i(), uzh.m196413p(act).mo186792k(user.isFemale()), new d30() { // from class: l.zvi
                        @Override // p149l.d30
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
            if (uzh.m196413p(act).mo186789h()) {
                m200389T(act, act.getString(R$string.f39145s3), uzh.m196413p(act).mo186784c(), uzh.m196413p(act).mo186783b(), new d30() { // from class: l.awi
                    @Override // p149l.d30
                    public final void call() {
                        d30Var3.call();
                    }
                });
            } else {
                d30Var3.call();
            }
            q770.m173197l0(true);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, act.getString(R$string.f39054f1))) {
            m200378I();
            el00.m117022k().m117036u(act, moment, el00.m117022k().m117025i(moment), null);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, "不感兴趣")) {
            m200378I();
            p6j0.m167669c("e_feed_not_interested", "p_explore_feed_more", NullChecker.m81303a(moment) ? j760.m140076a("moment_id", moment.f56011id) : null);
            if (NullChecker.m81303a(d30Var2)) {
                d30Var2.call();
                return;
            }
            return;
        }
        if (of00.f143608d.equals(c22545a.f209159a)) {
            of00.m164044f().m164050k(act, moment);
            m200378I();
        } else if (TextUtils.equals(c22545a.f209159a, "保存到本地")) {
            m200378I();
            if (media == null) {
                return;
            }
            Dimension dimension = ((Picture) media).size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            dmh.m112483k().m112486i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m200410r(final Act act, w9j w9jVar, Moment moment, String str, boolean z) {
        q770.m173197l0(false);
        act.progress(R$string.f38984U2, true);
        ((C22306c) w9jVar.call(moment)).subscribe(mkd0.m154956H(new e30() { // from class: l.gwi
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }, new e30() { // from class: l.hwi
            @Override // p149l.e30
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
    public static /* synthetic */ void m200411s(Media media, Act act) {
        Picture picture = (Picture) media;
        if (picture != null) {
            Dimension dimension = picture.size;
            if (dimension.width <= 0 || dimension.height <= 0) {
                return;
            }
            dmh.m112483k().m112486i(act, media, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m200414v(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m60222H().mo30838yf(act, false, user.f56011id, !TextUtils.isEmpty(moment.f56011id) ? moment.f56011id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            lsi0.m151595y("音频暂不支持分享");
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m200417y(boolean z, Act act, User user, Moment moment, Picture.ImageUri imageUri) {
        if (z) {
            FeedModule.m60222H().mo30838yf(act, true, user.f56011id, !TextUtils.isEmpty(moment.f56011id) ? moment.f56011id : "", imageUri, TextUtils.isEmpty(moment.value) ? "" : moment.value);
        } else {
            lsi0.m151595y("音频暂不支持分享");
        }
    }
}
