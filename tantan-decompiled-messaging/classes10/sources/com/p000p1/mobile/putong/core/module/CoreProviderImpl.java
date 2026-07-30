package com.p000p1.mobile.putong.core.module;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.AppealInfo;
import com.p000p1.mobile.putong.core.data.CategorySuggestions;
import com.p000p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p000p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.GPTopicCard;
import com.p000p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p000p1.mobile.putong.core.data.HometownSuggest;
import com.p000p1.mobile.putong.core.data.IPRegion;
import com.p000p1.mobile.putong.core.data.InsertConversationsList;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageChannel;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.UrlTag;
import com.p000p1.mobile.putong.core.data.UserTagData;
import com.p000p1.mobile.putong.core.data.Voice;
import com.p000p1.mobile.putong.core.module.CoreProviderImpl;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p000p1.mobile.putong.core.p001ui.p002gp.C3121a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.account.AccountInactiveTipAct;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.core.ui.messages.redpacket.RedPacketRecordAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.operation.OperationCenterAct;
import com.p1.mobile.putong.core.ui.profile.EditProfileAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.TagGuidePicAct;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.core.ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopFragAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.settings.log.SelectLogTimeAct;
import com.p1.mobile.putong.core.ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p1.mobile.putong.core.ui.vip.VipLocationHistoryAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.vip.privilege.dlg.PurchaseCoinConsumeSayHiView;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinCheckstandAct;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinOtherAct;
import com.p1.mobile.putong.data.CounterConversations;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.az50;
import l.bx6;
import l.co90;
import l.cvm0;
import l.d30;
import l.d8e0;
import l.e2s;
import l.e30;
import l.eqh0;
import l.f4v;
import l.f6c0;
import l.fap;
import l.ffp;
import l.ft4;
import l.h6a;
import l.h7j;
import l.hm7;
import l.i0g0;
import l.i36;
import l.ir9;
import l.irk;
import l.itk;
import l.j760;
import l.ke50;
import l.leh0;
import l.lra0;
import l.lva;
import l.mcr;
import l.ml6;
import l.mqi0;
import l.nah0;
import l.njf0;
import l.nlm0;
import l.nt30;
import l.obe0;
import l.ogl0;
import l.p420;
import l.psm;
import l.psq;
import l.pxz;
import l.q8p;
import l.qer;
import l.qp4;
import l.qp8;
import l.r6n;
import l.rc2;
import l.rgj;
import l.ruy;
import l.rwu;
import l.rxg0;
import l.rza;
import l.sa40;
import l.src0;
import l.sw6;
import l.swh0;
import l.t100;
import l.t7c0;
import l.tbk;
import l.tqm0;
import l.u59;
import l.uc80;
import l.upa;
import l.uq40;
import l.uqd0;
import l.vqx;
import l.vwb;
import l.wc80;
import l.wf6;
import l.wn90;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xi1;
import l.xy50;
import l.y1j;
import l.zb0;
import l.zp90;
import l.zub;
import l.zvf0;
import l.zyc0;
import org.jetbrains.annotations.NotNull;
import p003l.ak50;
import p003l.ark;
import p003l.b1c;
import p003l.ew40;
import p003l.gwp;
import p003l.igj;
import p003l.m73;
import p003l.mah0;
import p003l.opa0;
import p003l.qhe;
import p003l.snm;
import p003l.sth0;
import p003l.x7y;
import p003l.x93;
import p003l.xx0;
import p003l.y19;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreProviderModule", path = "/core_global/service")
public class CoreProviderImpl implements CoreProviderInterface {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$a */
    public class C3066a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f880a;

        public C3066a(Act act) {
            this.f880a = act;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1646a(int i, int i2, Intent intent) {
            Act act = this.f880a;
            act.startActivity(NewMainAct.I5(act, NavigationIntent.get("menu")));
            this.f880a.finish();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$b */
    public class C3067b implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f882a;

        public C3067b(Act act) {
            this.f882a = act;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1647a(int i, int i2, Intent intent) {
            Act act = this.f882a;
            act.startActivity(NewMainAct.I5(act, NavigationIntent.get("menu")));
            this.f882a.finish();
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m1321F(d30 d30Var, x7y x7yVar) {
        zvf0.u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", new j760[]{vwb.Y("is_shown_next_time", Boolean.valueOf(!swh0.p0().f1()))});
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m1322H(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m1323J(Runnable runnable, x7y x7yVar) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m1325L() {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m1326M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m1327N(Relationship relationship) {
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1328P(Runnable runnable, x7y x7yVar) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m1329Q(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m1330R(d30 d30Var, x7y x7yVar) {
        swh0.M1(PurchaseType.TYPE_SAY_HI_PKG);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m1332A(Act act) {
        ark.m5556T0(act);
    }

    /* JADX INFO: renamed from: A8 */
    public void m1333A8(Act act, String str, String str2, String str3) {
        wn90.F().P(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: Aa */
    public boolean m1334Aa(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.h(tantanForbidden);
    }

    /* JADX INFO: renamed from: Ac */
    public CharSequence m1335Ac(Message message) {
        return rza.H0(message);
    }

    /* JADX INFO: renamed from: Ae */
    public boolean m1336Ae(CoreSuggested.UserInfo userInfo) {
        return itk.g(userInfo);
    }

    /* JADX INFO: renamed from: Aj */
    public boolean m1337Aj(Conversation conversation) {
        return fap.l(conversation);
    }

    /* JADX INFO: renamed from: As */
    public boolean m1338As() {
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean m1339B() {
        return u59.f0();
    }

    /* JADX INFO: renamed from: B8 */
    public uqd0 m1340B8() {
        return r6n.f().f;
    }

    /* JADX INFO: renamed from: Bf */
    public void m1341Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        xy50.d().c(str, map, map2);
    }

    /* JADX INFO: renamed from: Bm */
    public void m1342Bm(AppealInfo appealInfo) {
        rc2.e().h(appealInfo);
    }

    /* JADX INFO: renamed from: Bo */
    public void m1343Bo(Act act) {
        act.startActivity(new Intent((Context) act, (Class<?>) PrivacyAndPremissonAct.class));
    }

    /* JADX INFO: renamed from: Bt */
    public boolean m1344Bt() {
        return upa.E3();
    }

    /* JADX INFO: renamed from: C */
    public boolean m1345C(int i) {
        return hm7.a(i);
    }

    /* JADX INFO: renamed from: Ce */
    public boolean m1346Ce(Activity activity) {
        return activity instanceof LikersAct;
    }

    /* JADX INFO: renamed from: Cf */
    public void m1347Cf(List<UrlTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UrlTag> it = list.iterator();
        while (it.hasNext()) {
            for (UserTagData userTagData : it.next().tags) {
                NewTags newTagsNew_ = NewTags.new_();
                newTagsNew_.f119id = userTagData.f189id;
                newTagsNew_.name = userTagData.title;
                newTagsNew_.icon = userTagData.icon;
                int i = userTagData.count;
                newTagsNew_.localTagUserCounts = i > 0 ? i : 1L;
                newTagsNew_.categories = userTagData.categories;
                newTagsNew_.status = userTagData.status;
                if (upa.L3()) {
                    newTagsNew_.isPictureTag = true;
                }
                arrayList.add(newTagsNew_);
            }
        }
        sa40.o().M(arrayList);
    }

    /* JADX INFO: renamed from: Cn */
    public boolean m1348Cn() {
        return upa.H3();
    }

    /* JADX INFO: renamed from: Cq */
    public int m1349Cq() {
        return upa.Q0();
    }

    /* JADX INFO: renamed from: Ct */
    public boolean m1350Ct(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.f(tantanForbidden);
    }

    /* JADX INFO: renamed from: D */
    public boolean m1351D() {
        return false;
    }

    /* JADX INFO: renamed from: Db */
    public void m1352Db(boolean z) {
        leh0.J0(z);
    }

    /* JADX INFO: renamed from: Df */
    public boolean m1353Df(User user) {
        return ruy.g().j(user);
    }

    /* JADX INFO: renamed from: Dg */
    public void m1354Dg(String str) {
        y1j.g(str);
    }

    /* JADX INFO: renamed from: Di */
    public Picture m1355Di(User user) {
        return sw6.a(user);
    }

    /* JADX INFO: renamed from: Dt */
    public int m1356Dt() {
        CollapsibleConversationConfig collapsibleConversationConfigK = upa.k();
        if (collapsibleConversationConfigK == null) {
            return Integer.MAX_VALUE;
        }
        return collapsibleConversationConfigK.ignorable_unread_msg_days;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1357E() {
        return upa.V1();
    }

    /* JADX INFO: renamed from: E7 */
    public int m1358E7(CounterConversations counterConversations) {
        return counterConversations.unseen;
    }

    /* JADX INFO: renamed from: E8 */
    public void m1359E8(HashMap<String, Integer> map) {
        map.put("CHAT_GROUP_QUNJINGAO", Integer.valueOf(R.string.B1));
        map.put("CHAT_GROUP_QUNJIESHAN", Integer.valueOf(R.string.A1));
        map.put("CHAT_GROUP_BEIQUNZUJINYAN", Integer.valueOf(R.string.m1));
        map.put("CHAT_GROUP_YICHUQUNZU", Integer.valueOf(R.string.E1));
        map.put("CHAT_GROUP_YAOQINGGRUQUN", Integer.valueOf(R.string.D1));
        map.put("CHAT_GROUP_NIBEI_YICHUQUN", Integer.valueOf(R.string.u1));
        map.put("CHAT_GROUP_HUANYINGRUQUN", Integer.valueOf(R.string.n1));
        map.put("CHAT_GROUP_JIANQUN_CHENGGONG", Integer.valueOf(R.string.p1));
        map.put("CHAT_GROUP_QUANYUANJINYAN", Integer.valueOf(R.string.y1));
        map.put("CHAT_GROUP_JIECHUJINYAN", Integer.valueOf(R.string.q1));
        map.put("CHAT_GROUP_ADMINISTRATOR", Integer.valueOf(R.string.l1));
    }

    /* JADX INFO: renamed from: Eg */
    public void m1360Eg(Act act) {
        qp4.q(act);
    }

    /* JADX INFO: renamed from: El */
    public String m1361El(int i) {
        return h7j.U(((LoopSelectFillData) h7j.p.get(i)).c());
    }

    /* JADX INFO: renamed from: Er */
    public boolean m1362Er() {
        return false;
    }

    /* JADX INFO: renamed from: F4 */
    public boolean m1363F4() {
        return false;
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m1364F6() {
        return true;
    }

    /* JADX INFO: renamed from: F7 */
    public boolean m1365F7() {
        return false;
    }

    /* JADX INFO: renamed from: Fa */
    public void m1366Fa(Act act, String str) {
        new opa0(act, str).m8578K(5, null);
    }

    /* JADX INFO: renamed from: Fk */
    public void m1367Fk() {
        y1j.d().i();
    }

    /* JADX INFO: renamed from: Fl */
    public boolean m1368Fl() {
        return upa.H2();
    }

    /* JADX INFO: renamed from: G */
    public com.p1.mobile.putong.app.a m1369G(PutongAct putongAct) {
        return new vqx(putongAct);
    }

    /* JADX INFO: renamed from: Ga */
    public void m1370Ga(String str) {
        if (upa.r1()) {
            i36.g().f(str);
        }
    }

    /* JADX INFO: renamed from: Ge */
    public Intent m1371Ge(Act act) {
        return MediaPickerAct.i2(act, 1, false, true, true, (String) null, MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender, "", true);
    }

    /* JADX INFO: renamed from: Gh */
    public NewTags m1372Gh(String str) {
        return sa40.o().O(str);
    }

    /* JADX INFO: renamed from: Gi */
    public boolean m1373Gi() {
        return upa.x2();
    }

    /* JADX INFO: renamed from: Gp */
    public ArrayList<LoopSelectFillData> m1374Gp(User user) {
        return h7j.r(user);
    }

    /* JADX INFO: renamed from: H6 */
    public boolean m1375H6(Activity activity) {
        return activity instanceof RedPacketRecordAct;
    }

    /* JADX INFO: renamed from: Hb */
    public void m1376Hb(Act act, boolean z, String str, d30 d30Var) {
        if (CoreModule.c.J0.F3()) {
            m73.m7995k(act);
        } else {
            x93.m10707h(act, z, d30Var, false, str);
        }
    }

    /* JADX INFO: renamed from: Hf */
    public boolean m1377Hf() {
        return com.p1.mobile.putong.core.ui.match.a.w().v();
    }

    /* JADX INFO: renamed from: Hg */
    public boolean m1378Hg() {
        return u59.S();
    }

    /* JADX INFO: renamed from: Hq */
    public void m1379Hq(String str, ValueObject valueObject, ValueObject valueObject2) {
        f4v.f().e(str, valueObject, valueObject2, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: I4 */
    public boolean m1380I4() {
        return upa.z();
    }

    /* JADX INFO: renamed from: I5 */
    public boolean m1381I5() {
        return ogl0.U();
    }

    /* JADX INFO: renamed from: Ih */
    public int m1382Ih() {
        if (NullChecker.a(upa.E0())) {
            return upa.E0().new_tag_exposure_after_max_minutes;
        }
        return 3;
    }

    /* JADX INFO: renamed from: Ik */
    public QualificationType m1383Ik(String str) {
        return h7j.H(str);
    }

    /* JADX INFO: renamed from: Ip */
    public void m1384Ip(Act act, boolean z, String str, String str2) {
        if (CoreModule.c.e0.p9().isBanned()) {
            JailedDialogLikeAct.o2(true);
        } else if (CoreModule.c.e0.p9().isProfileJailed()) {
            xx0.m10979i(act, false);
        } else {
            sth0.m9484b().m9488e(CoreModule.c.e0.na().clone());
            act.startActivity(TagGuidePicAct.Y1(act, z, str, str2));
        }
    }

    /* JADX INFO: renamed from: Is */
    public boolean m1385Is() {
        return upa.k3();
    }

    /* JADX INFO: renamed from: J8 */
    public int m1386J8() {
        return swh0.v0();
    }

    /* JADX INFO: renamed from: J9 */
    public int m1387J9() {
        return x2c0.Rp;
    }

    /* JADX INFO: renamed from: Jc */
    public int m1388Jc(Act act) {
        return wn90.F().C(act, wn90.F().a, true);
    }

    /* JADX INFO: renamed from: Jd */
    public String m1389Jd() {
        return pxz.c();
    }

    /* JADX INFO: renamed from: Je */
    public boolean m1390Je() {
        return upa.e();
    }

    /* JADX INFO: renamed from: Ji */
    public boolean m1391Ji(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.l(tantanForbidden);
    }

    /* JADX INFO: renamed from: Jk */
    public void m1392Jk(Act act, User user) {
        qer.n(act, user, true, false, false, "logout_ab", (x9j) null, new e30() { // from class: l.pra
            public final void call(Object obj) {
                CoreProviderImpl.m1327N((Relationship) obj);
            }
        }, new e30() { // from class: l.qra
            public final void call(Object obj) {
                CoreProviderImpl.m1326M((Throwable) obj);
            }
        }, "p_delete_account_chat_block", (LikeExtraData) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: Jo */
    public void m1393Jo(Act act, @Nullable d30 d30Var) {
        ark.m5548P0(act, "", new d30() { // from class: l.jra
            public final void call() {
                CoreProviderImpl.m1325L();
            }
        }, false, false, d30Var);
    }

    /* JADX INFO: renamed from: K4 */
    public boolean m1394K4() {
        return false;
    }

    /* JADX INFO: renamed from: Kl */
    public boolean m1395Kl() {
        return upa.c3();
    }

    /* JADX INFO: renamed from: Kq */
    public boolean m1396Kq(User user) {
        return wn90.F().h0(user);
    }

    /* JADX INFO: renamed from: Lc */
    public boolean m1397Lc() {
        return false;
    }

    /* JADX INFO: renamed from: Li */
    public boolean m1398Li() {
        CollapsibleConversationConfig collapsibleConversationConfigK = upa.k();
        if (collapsibleConversationConfigK == null) {
            return false;
        }
        return collapsibleConversationConfigK.ignore_old_unread_msg;
    }

    /* JADX INFO: renamed from: Ln */
    public boolean m1399Ln() {
        return false;
    }

    /* JADX INFO: renamed from: Mg */
    public int m1400Mg() {
        return upa.C3();
    }

    /* JADX INFO: renamed from: Mk */
    public CategorySuggestions m1401Mk() {
        return ProfileListFrag.I4;
    }

    /* JADX INFO: renamed from: Mm */
    public boolean m1402Mm(Act act) {
        return act instanceof EditProfileAct;
    }

    /* JADX INFO: renamed from: Mo */
    public boolean m1403Mo() {
        return false;
    }

    /* JADX INFO: renamed from: N6 */
    public HometownSuggest m1404N6() {
        return co90.h();
    }

    /* JADX INFO: renamed from: Na */
    public boolean m1405Na() {
        return h6a.c();
    }

    /* JADX INFO: renamed from: Nb */
    public String m1406Nb(Profile profile) {
        return zp90.V(profile);
    }

    /* JADX INFO: renamed from: Nc */
    public void m1407Nc(String str) {
        HomeStatisticsHelper.F(str);
    }

    /* JADX INFO: renamed from: Nd */
    public boolean m1408Nd(Conversation conversation) {
        return ml6.a(conversation);
    }

    /* JADX INFO: renamed from: Nl */
    public boolean m1409Nl(User user) {
        return d8e0.a(user);
    }

    /* JADX INFO: renamed from: Nq */
    public void m1410Nq(boolean z) {
        xi1.a(z);
    }

    /* JADX INFO: renamed from: O */
    public boolean m1411O() {
        return false;
    }

    /* JADX INFO: renamed from: Oc */
    public boolean m1412Oc() {
        return wf6.f();
    }

    /* JADX INFO: renamed from: Od */
    public boolean m1413Od() {
        return y19.m11087K();
    }

    /* JADX INFO: renamed from: Oe */
    public void m1414Oe(Envelope envelope, String str, boolean z) {
        wf6.b(envelope, str, z);
    }

    /* JADX INFO: renamed from: Oi */
    public boolean m1415Oi() {
        return true;
    }

    /* JADX INFO: renamed from: Oq */
    public boolean m1416Oq() {
        return true;
    }

    /* JADX INFO: renamed from: Or */
    public boolean m1417Or() {
        return u59.J();
    }

    /* JADX INFO: renamed from: Os */
    public List<String> m1418Os(String str) {
        return h7j.A(str);
    }

    /* JADX INFO: renamed from: Pa */
    public void m1419Pa(Context context) {
        Activity activityD = xdl0.D(context);
        zvf0.r("e_advanced_filter_location", "p_advanced_filter_page");
        activityD.startActivity(VipLocationHistoryAct.V1(activityD, ""));
    }

    /* JADX INFO: renamed from: Pi */
    public List<String> m1420Pi(String str) {
        return h7j.F(str);
    }

    /* JADX INFO: renamed from: Q6 */
    public rx.subjects.a<List<Merchandise>> m1421Q6() {
        return igj.f5133b;
    }

    /* JADX INFO: renamed from: Qg */
    public void m1422Qg(Act act, boolean z, d30 d30Var) {
        m1376Hb(act, z, "", d30Var);
    }

    /* JADX INFO: renamed from: Qi */
    public boolean m1423Qi() {
        return u59.a0();
    }

    /* JADX INFO: renamed from: Ql */
    public boolean m1424Ql(String str) {
        return u59.x(str);
    }

    /* JADX INFO: renamed from: Qq */
    public boolean m1425Qq() {
        return u59.Z();
    }

    /* JADX INFO: renamed from: R8 */
    public boolean m1426R8() {
        return u59.d0();
    }

    /* JADX INFO: renamed from: Rg */
    public String m1427Rg(String str, String str2) {
        return b.k(str, str2);
    }

    /* JADX INFO: renamed from: Rk */
    public boolean m1428Rk() {
        return u59.T();
    }

    /* JADX INFO: renamed from: Ro */
    public int m1429Ro() {
        return upa.m();
    }

    /* JADX INFO: renamed from: Rq */
    public boolean m1430Rq(Act act) {
        return act instanceof NewMainAct;
    }

    /* JADX INFO: renamed from: Si */
    public void m1431Si(Act act) {
        act.startActivityForResult(DropDownAct.Z1(act), new C3067b(act));
    }

    /* JADX INFO: renamed from: T */
    public final View m1432T(Act act, ViewGroup viewGroup, boolean z) {
        PurchaseCoinConsumeSayHiView purchaseCoinConsumeSayHiViewInflate = LayoutInflater.from(act).inflate(f6c0.ab, viewGroup, false);
        purchaseCoinConsumeSayHiViewInflate.b(z);
        return purchaseCoinConsumeSayHiViewInflate;
    }

    /* JADX INFO: renamed from: T8 */
    public Pair<List<String>, List<String>> m1433T8(String str) {
        return h7j.x(str);
    }

    /* JADX INFO: renamed from: Te */
    public boolean m1434Te(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.j(tantanForbidden);
    }

    /* JADX INFO: renamed from: U */
    public boolean m1435U() {
        return false;
    }

    /* JADX INFO: renamed from: U8 */
    public void m1436U8(Act act) {
        qp4.p(act);
    }

    /* JADX INFO: renamed from: U9 */
    public boolean m1437U9() {
        return false;
    }

    /* JADX INFO: renamed from: Ua */
    public boolean m1438Ua() {
        return upa.s1();
    }

    /* JADX INFO: renamed from: Uc */
    public User m1439Uc() {
        return wn90.F().a;
    }

    /* JADX INFO: renamed from: Ud */
    public void m1440Ud(Act act) {
        new ffp(act).show();
    }

    /* JADX INFO: renamed from: Uj */
    public void m1441Uj(Act act, e30<Media> e30Var) {
        wn90.F().v0(act, e30Var);
    }

    /* JADX INFO: renamed from: Ul */
    public rx.subjects.a<InsertConversationsList> m1442Ul() {
        return r6n.f().b;
    }

    /* JADX INFO: renamed from: Uo */
    public boolean m1443Uo(String str) {
        return h7j.R(str);
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m1444V6() {
        return true;
    }

    /* JADX INFO: renamed from: V8 */
    public boolean m1445V8(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.e(tantanForbidden);
    }

    /* JADX INFO: renamed from: Vb */
    public boolean m1446Vb() {
        return upa.l().enabled;
    }

    /* JADX INFO: renamed from: Vc */
    public void m1447Vc() {
        JailedDialogLikeAct.n2();
    }

    /* JADX INFO: renamed from: Vd */
    public boolean m1448Vd() {
        return u59.U();
    }

    /* JADX INFO: renamed from: Ve */
    public boolean m1449Ve() {
        return u59.R();
    }

    /* JADX INFO: renamed from: Vi */
    public void m1450Vi(Act act, int i, final Runnable runnable, final Runnable runnable2, final d30 d30Var) {
        x7y x7yVarM10690t = new x7y.C3477a(act).m10684A(false).m10687D("抢先告白").m10686C(i0g0.b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), "抢先告白"), vwb.f0(new String[]{String.valueOf(i)}), Color.parseColor("#fe7e1d"), eqh0.c(3))).m10694x(act.string(R.string.Cp), new e30() { // from class: l.rra
            public final void call(Object obj) {
                CoreProviderImpl.m1321F(d30Var, (x7y) obj);
            }
        }).m10692v(act.string(R.string.c), new e30() { // from class: l.sra
            public final void call(Object obj) {
                CoreProviderImpl.m1323J(runnable2, (x7y) obj);
            }
        }).m10696z(swh0.p0().C0()).m10693w(R.string.Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.tra
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.p0().P0(z);
            }
        }).m10685B(new DialogInterface.OnDismissListener() { // from class: l.kra
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m1329Q(runnable, dialogInterface);
            }
        }).m10690t();
        x7yVarM10690t.m10659g().m2500m0(t100.d(4.0f)).m2475G(m1432T(act, x7yVarM10690t.m10659g(), true));
        x7yVarM10690t.m10659g().m2473E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", t100.d(311.0f), t100.d(253.0f));
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: Vj */
    public Intent m1451Vj(Context context, String str) {
        return TanTanCoinCheckstandAct.X1(context, str);
    }

    /* JADX INFO: renamed from: Vn */
    public void m1452Vn(mcr mcrVar, d30 d30Var) {
        src0.r().K(mcrVar, d30Var);
    }

    /* JADX INFO: renamed from: Vq */
    public boolean m1453Vq(String str) {
        return ruy.g().e(str);
    }

    /* JADX INFO: renamed from: W7 */
    public String m1454W7() {
        return MessageChannel.group;
    }

    /* JADX INFO: renamed from: W8 */
    public boolean m1455W8() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
        if (chatRoundsDisplayedExternallyConfigP == null) {
            return false;
        }
        return chatRoundsDisplayedExternallyConfigP.enabled;
    }

    /* JADX INFO: renamed from: Wb */
    public void m1456Wb(Act act) {
        act.startActivity(AppealProgressAct.Z1(act, false));
    }

    /* JADX INFO: renamed from: Wc */
    public boolean m1457Wc(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && CoreGiftPanelName.chat.equals(userInfo.payCardStyle)) || az50.Companion.k(userInfo);
    }

    /* JADX INFO: renamed from: Wg */
    public int m1458Wg() {
        return h7j.p.size();
    }

    /* JADX INFO: renamed from: Wj */
    public String m1459Wj() {
        return com.p1.mobile.putong.core.ui.onlinematch.a.a;
    }

    /* JADX INFO: renamed from: Wk */
    public int m1460Wk() {
        return 20;
    }

    /* JADX INFO: renamed from: X5 */
    public boolean m1461X5() {
        return upa.X2();
    }

    /* JADX INFO: renamed from: X9 */
    public boolean m1462X9() {
        return upa.r3();
    }

    /* JADX INFO: renamed from: Xb */
    public void m1463Xb(int i) {
        C3121a.m2899j().m2912t(i);
    }

    /* JADX INFO: renamed from: Xf */
    public Picture.ImageUri m1464Xf(Media media) {
        return zub.f(media);
    }

    /* JADX INFO: renamed from: Xj */
    public void m1465Xj(String str) {
        lra0.f(str);
    }

    /* JADX INFO: renamed from: Xk */
    public boolean m1466Xk() {
        return upa.J2();
    }

    /* JADX INFO: renamed from: Xl */
    public boolean m1467Xl(int i) {
        return bx6.i(i);
    }

    /* JADX INFO: renamed from: Xs */
    public void m1468Xs(Act act, Throwable th, d30 d30Var) {
        p420.r(act, th, d30Var);
    }

    /* JADX INFO: renamed from: Y7 */
    public void m1469Y7(Envelope envelope, String str) {
    }

    /* JADX INFO: renamed from: Ye */
    public int m1470Ye() {
        return upa.k().ignore_msg_days;
    }

    /* JADX INFO: renamed from: Yh */
    public boolean m1471Yh() {
        return false;
    }

    /* JADX INFO: renamed from: Ym */
    public String m1472Ym(Profile profile) {
        return zp90.X(profile);
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m1473Z5(User user) {
        return obe0.k(user);
    }

    /* JADX INFO: renamed from: Zc */
    public void m1474Zc(Act act, String str) {
        ak50.m5396O().m5423H(act, str);
    }

    /* JADX INFO: renamed from: Ze */
    public boolean m1475Ze() {
        return false;
    }

    /* JADX INFO: renamed from: Zg */
    public List<String> m1476Zg() {
        return h7j.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ac */
    public String m1477ac(Activity activity) {
        if (activity instanceof MessagesAct) {
            return ((MessagesAct) activity).l().r3();
        }
        if (activity instanceof GreetAct) {
            return ((GreetAct) activity).m2920d2().m3204R0();
        }
        return null;
    }

    /* JADX INFO: renamed from: af */
    public String m1478af() {
        return tbk.m();
    }

    /* JADX INFO: renamed from: ag */
    public void m1479ag(Activity activity) {
        if ((activity instanceof ProfileAct) || (activity instanceof ProfileInfoLoopEditAct) || (activity instanceof ProfileLoopFragAct) || (activity instanceof MarryProfileEditAct)) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: ak */
    public boolean m1480ak() {
        return upa.G2();
    }

    /* JADX INFO: renamed from: am */
    public boolean m1481am() {
        return b1c.m5664f();
    }

    /* JADX INFO: renamed from: aq */
    public boolean m1482aq() {
        return com.p1.mobile.putong.core.ui.match.a.w().n();
    }

    /* JADX INFO: renamed from: ar */
    public boolean m1483ar() {
        return mah0.m8064m0();
    }

    /* JADX INFO: renamed from: b */
    public boolean m1484b() {
        return qp8.b();
    }

    /* JADX INFO: renamed from: bh */
    public void m1485bh(HeartbeatPushInfo heartbeatPushInfo) {
        snm.m9401b0(heartbeatPushInfo);
    }

    /* JADX INFO: renamed from: bm */
    public boolean m1486bm() {
        return ir9.d();
    }

    /* JADX INFO: renamed from: bn */
    public boolean m1487bn() {
        return b1c.m5665g();
    }

    /* JADX INFO: renamed from: bp */
    public void m1488bp(Act act, String str, String str2) {
        wn90.F().P(act, str, str2, (String) null);
    }

    /* JADX INFO: renamed from: bq */
    public boolean m1489bq() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1490c() {
        return false;
    }

    /* JADX INFO: renamed from: cp */
    public void m1491cp() {
        mah0.m8073s0().m8104V0();
    }

    /* JADX INFO: renamed from: ct */
    public Integer m1492ct() {
        return Integer.valueOf(t7c0.b);
    }

    /* JADX INFO: renamed from: d */
    public void m1493d(Throwable th) {
        bx6.b(th);
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m1494d4() {
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public boolean m1495d7() {
        return upa.v1();
    }

    /* JADX INFO: renamed from: da */
    public CoreInnerPush.a m1496da(User user, Message message) {
        return psm.c(user, message);
    }

    /* JADX INFO: renamed from: df */
    public boolean m1497df() {
        return upa.l3();
    }

    /* JADX INFO: renamed from: dq */
    public int m1498dq() {
        return swh0.x0();
    }

    /* JADX INFO: renamed from: e */
    public boolean m1499e() {
        return false;
    }

    /* JADX INFO: renamed from: ed */
    public boolean m1500ed() {
        return u59.M();
    }

    /* JADX INFO: renamed from: ee */
    public boolean m1501ee(Act act) {
        return (act instanceof ProfileAct) && ((ProfileAct) act).H2();
    }

    /* JADX INFO: renamed from: ep */
    public boolean m1502ep() {
        return u59.p();
    }

    /* JADX INFO: renamed from: er */
    public boolean m1503er() {
        return q8p.i();
    }

    /* JADX INFO: renamed from: f */
    public boolean m1504f() {
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public void m1505f7() {
        snm.m9415i0();
    }

    /* JADX INFO: renamed from: f8 */
    public boolean m1506f8() {
        return upa.D3();
    }

    /* JADX INFO: renamed from: fa */
    public List<String> m1507fa(String str) {
        return h7j.q(str);
    }

    /* JADX INFO: renamed from: fd */
    public int m1508fd() {
        return upa.G();
    }

    /* JADX INFO: renamed from: fi */
    public String m1509fi() {
        return (String) zyc0.b.get();
    }

    /* JADX INFO: renamed from: g */
    public boolean m1510g() {
        return nlm0.c();
    }

    /* JADX INFO: renamed from: g5 */
    public c<List<Merchandise>> m1511g5(@NonNull @NotNull Context context, @NonNull @NotNull List<Merchandise> list) {
        return igj.m7194M(context, list);
    }

    /* JADX INFO: renamed from: g7 */
    public ArrayList<LoopSelectFillData> m1512g7(User user) {
        return h7j.y(user);
    }

    /* JADX INFO: renamed from: g8 */
    public boolean m1513g8() {
        return nt30.X0;
    }

    /* JADX INFO: renamed from: gb */
    public boolean m1514gb() {
        return false;
    }

    public Intent getMainActIntent(Context context) {
        return lva.e(context);
    }

    /* JADX INFO: renamed from: gf */
    public ArrayList<LoopSelectFillData> m1515gf(User user) {
        return h7j.u(user);
    }

    /* JADX INFO: renamed from: gm */
    public AtomicBoolean m1516gm() {
        return u59.r;
    }

    /* JADX INFO: renamed from: gn */
    public boolean m1517gn() {
        return upa.F0();
    }

    /* JADX INFO: renamed from: go */
    public Double m1518go() {
        return ke50.c();
    }

    /* JADX INFO: renamed from: gq */
    public boolean m1519gq() {
        return ir9.c();
    }

    /* JADX INFO: renamed from: gs */
    public void m1520gs() {
        snm.m9413h0();
    }

    /* JADX INFO: renamed from: gt */
    public ArrayList<LoopSelectFillData> m1521gt(User user) {
        return h7j.B(user);
    }

    /* JADX INFO: renamed from: h */
    public String m1522h() {
        return rwu.h();
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m1523h5() {
        return false;
    }

    /* JADX INFO: renamed from: h6 */
    public void m1524h6(String str) {
        tqm0.p().w(str);
    }

    /* JADX INFO: renamed from: hf */
    public boolean m1525hf(String str) {
        return h7j.O(str);
    }

    /* JADX INFO: renamed from: hh */
    public void m1526hh(List<CoreSuggested.UserInfo> list) {
        mah0.m8073s0().m8132x0(list);
    }

    /* JADX INFO: renamed from: hi */
    public boolean m1527hi(Act act) {
        return (act instanceof NewMainAct) || (act instanceof ProfileAct) || (act instanceof MediaPreviewAct) || (act instanceof CommonMediaPreviewAct) || (act instanceof IntlTribeSwipeAct) || (act instanceof com.p1.mobile.putong.core.ui.mediapicker.MediaPreviewAct);
    }

    /* JADX INFO: renamed from: hs */
    public Intent m1528hs(Context context) {
        return OperationCenterAct.Y1(context);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1529i() {
        return false;
    }

    /* JADX INFO: renamed from: ib */
    public boolean m1530ib() {
        return ogl0.k();
    }

    /* JADX INFO: renamed from: ic */
    public boolean m1531ic() {
        return true;
    }

    /* JADX INFO: renamed from: id */
    public void m1532id(Act act) {
        com.p1.mobile.putong.core.ui.purchase.c.n1(act, "p_home_filter,advanced", Privilege.advanced_filter);
    }

    /* JADX INFO: renamed from: ig */
    public boolean m1533ig() {
        return swh0.L1();
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ip */
    public void m1534ip(Act act, String str, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.n1(act, str, privilege);
    }

    /* JADX INFO: renamed from: iq */
    public boolean m1535iq() {
        return u59.w();
    }

    /* JADX INFO: renamed from: ir */
    public boolean m1536ir() {
        return true;
    }

    /* JADX INFO: renamed from: is */
    public boolean m1537is() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m1538j() {
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m1539j3() {
        return false;
    }

    /* JADX INFO: renamed from: j6 */
    public Intent m1540j6(Act act, String str) {
        return NewCropperAct.F1(act, str, true);
    }

    /* JADX INFO: renamed from: jd */
    public void m1541jd(int i) {
        C3121a.m2899j().m2911s(1);
    }

    /* JADX INFO: renamed from: jf */
    public void m1542jf(Act act, int i, final Runnable runnable, final Runnable runnable2, final d30 d30Var) {
        String str = CoreModule.o.d().I5() ? "抢先告白" : "打招呼";
        x7y x7yVarM10690t = new x7y.C3477a(act).m10684A(false).m10687D(str).m10686C(i0g0.b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), str), vwb.f0(new String[]{String.valueOf(i)}), Color.parseColor("#fe7e1d"), eqh0.c(3))).m10694x(act.string(R.string.Cp), new e30() { // from class: l.lra
            public final void call(Object obj) {
                CoreProviderImpl.m1330R(d30Var, (x7y) obj);
            }
        }).m10692v(act.string(R.string.c), new e30() { // from class: l.mra
            public final void call(Object obj) {
                CoreProviderImpl.m1328P(runnable2, (x7y) obj);
            }
        }).m10696z(swh0.p0().I0()).m10693w(R.string.Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.nra
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.p0().R0(z);
            }
        }).m10685B(new DialogInterface.OnDismissListener() { // from class: l.ora
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m1322H(runnable, dialogInterface);
            }
        }).m10690t();
        x7yVarM10690t.m10659g().m2500m0(t100.d(4.0f)).m2475G(m1432T(act, x7yVarM10690t.m10659g(), false));
        if (ogl0.U()) {
            x7yVarM10690t.m10659g().m2473E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", t100.d(311.0f), t100.d(253.0f));
        } else {
            x7yVarM10690t.m10659g().m2471B(x2c0.Ko);
        }
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: jm */
    public int m1543jm() {
        return com.p1.mobile.putong.core.ui.match.a.w().B();
    }

    /* JADX INFO: renamed from: jo */
    public void m1544jo(List<CoreSuggested.UserInfo> list) {
        mah0.m8073s0().m8111e1(list);
    }

    /* JADX INFO: renamed from: jq */
    public void m1545jq(boolean z) {
        com.p1.mobile.putong.core.ui.match.a.w().Q(z);
    }

    /* JADX INFO: renamed from: js */
    public boolean m1546js() {
        return irk.b();
    }

    /* JADX INFO: renamed from: jt */
    public int m1547jt(Long l2) {
        return uq40.t(mqi0.o(), l2.longValue());
    }

    /* JADX INFO: renamed from: k */
    public boolean m1548k() {
        return false;
    }

    /* JADX INFO: renamed from: k6 */
    public boolean m1549k6() {
        return false;
    }

    /* JADX INFO: renamed from: k8 */
    public boolean m1550k8() {
        return upa.H1();
    }

    /* JADX INFO: renamed from: ka */
    public boolean m1551ka() {
        return wf6.e();
    }

    /* JADX INFO: renamed from: kc */
    public boolean m1552kc() {
        return com.p1.mobile.putong.core.newui.fake.b.r().n();
    }

    /* JADX INFO: renamed from: kd */
    public Throwable m1553kd(Throwable th) {
        return bx6.a(th);
    }

    /* JADX INFO: renamed from: kf */
    public boolean m1554kf(List<String> list, List<String> list2) {
        return h7j.Q(list, list2);
    }

    /* JADX INFO: renamed from: kl */
    public boolean m1555kl() {
        return wn90.F().b;
    }

    /* JADX INFO: renamed from: km */
    public boolean m1556km() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m1557l() {
        return false;
    }

    /* JADX INFO: renamed from: l7 */
    public void m1558l7(Act act, String str) {
        act.startActivityForResult(MessagesAct.i2(act, str, false, false), new C3066a(act));
    }

    /* JADX INFO: renamed from: lb */
    public void m1559lb() {
    }

    /* JADX INFO: renamed from: lj */
    public void m1560lj(long j) {
        snm.m9394W(j);
    }

    /* JADX INFO: renamed from: lk */
    public boolean m1561lk() {
        return upa.Z2();
    }

    /* JADX INFO: renamed from: ll */
    public void m1562ll(List<CoreSuggested.UserInfo> list) {
        mah0.m8073s0().m8110d1(list);
    }

    /* JADX INFO: renamed from: m */
    public String m1563m(List<String> list, List<String> list2) {
        return h7j.M(list, list2);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m1564m3() {
        return false;
    }

    /* JADX INFO: renamed from: md */
    public Intent m1565md(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return lva.A(context, str, str2, z, z2, z3);
    }

    /* JADX INFO: renamed from: mj */
    public boolean m1566mj() {
        return upa.r1();
    }

    /* JADX INFO: renamed from: mk */
    public List<GPTopicCard> m1567mk(List<GPTopicCard> list) {
        return rgj.b(list);
    }

    public Intent newMainActClearStack(Context context, boolean z) {
        return NewMainAct.O5(context, z);
    }

    /* JADX INFO: renamed from: nj */
    public void m1568nj(List<CoreSuggested.UserInfo> list, List<Live> list2) {
        if (vwb.J(list)) {
            return;
        }
        e2s.b(list, list2);
    }

    /* JADX INFO: renamed from: nn */
    public List<Purpose> m1569nn(String str) {
        return h7j.E(str);
    }

    /* JADX INFO: renamed from: no */
    public void m1570no(boolean z) {
        wn90.F().b = z;
    }

    /* JADX INFO: renamed from: np */
    public void m1571np(Act act, e30<Media> e30Var) {
        wn90.F().u0(act, e30Var);
    }

    /* JADX INFO: renamed from: o */
    public boolean m1572o() {
        return upa.A1();
    }

    /* JADX INFO: renamed from: o8 */
    public CoreInnerPush.a m1573o8(User user, Message message) {
        return psm.a(user, message);
    }

    /* JADX INFO: renamed from: o9 */
    public boolean m1574o9() {
        return false;
    }

    /* JADX INFO: renamed from: ob */
    public String m1575ob(String str) {
        return ProfileListFrag.bd(str);
    }

    /* JADX INFO: renamed from: oe */
    public boolean m1576oe() {
        return njf0.g();
    }

    /* JADX INFO: renamed from: ol */
    public String m1577ol() {
        return CoreModule.c.q2.Z;
    }

    /* JADX INFO: renamed from: oq */
    public boolean m1578oq() {
        return OnlineMatchManager.z().m0();
    }

    /* JADX INFO: renamed from: os */
    public double m1579os() {
        return 0.0d;
    }

    /* JADX INFO: renamed from: p */
    public boolean m1580p() {
        return upa.a2();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m1581p0() {
        return upa.y2();
    }

    /* JADX INFO: renamed from: pb */
    public boolean m1582pb() {
        return ew40.m6339h().m6349g();
    }

    /* JADX INFO: renamed from: ph */
    public String m1583ph(Act.r rVar) {
        return MessagesAct.r2(rVar);
    }

    /* JADX INFO: renamed from: pn */
    public boolean m1584pn() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1585q() {
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m1586q0() {
        return upa.J3();
    }

    /* JADX INFO: renamed from: qa */
    public void m1587qa(Act act, String str) {
        act.startActivity(b1c.m5667i(act, str));
    }

    /* JADX INFO: renamed from: qc */
    public String m1588qc(String str) {
        return com.p1.mobile.putong.core.ui.onlinematch.a.R(str);
    }

    /* JADX INFO: renamed from: qe */
    public boolean m1589qe() {
        return upa.F3() || upa.o2();
    }

    /* JADX INFO: renamed from: qf */
    public boolean m1590qf() {
        return wn90.F().S();
    }

    /* JADX INFO: renamed from: qi */
    public int m1591qi() {
        return upa.Q();
    }

    /* JADX INFO: renamed from: qq */
    public boolean m1592qq() {
        return u59.K();
    }

    /* JADX INFO: renamed from: qr */
    public boolean m1593qr(String str) {
        return TextUtils.equals(str, rxg0.j().m);
    }

    /* JADX INFO: renamed from: r */
    public void m1594r(Act act) {
        act.startActivity(new Intent((Context) act, (Class<?>) SelectLogTimeAct.class));
    }

    /* JADX INFO: renamed from: r7 */
    public void m1595r7(Act act) {
        wc80.e().q(uc80.a(new gwp(act)));
    }

    /* JADX INFO: renamed from: rf */
    public Intent m1596rf(Context context, String str) {
        return TanTanCoinOtherAct.a2(context, str);
    }

    /* JADX INFO: renamed from: rm */
    public void m1597rm(Act act, String str) {
        act.startActivity(NewMainAct.I5(act, NavigationIntent.get(str)));
    }

    /* JADX INFO: renamed from: rs */
    public int m1598rs() {
        return swh0.x0();
    }

    /* JADX INFO: renamed from: rt */
    public boolean m1599rt() {
        return leh0.z0();
    }

    /* JADX INFO: renamed from: s */
    public boolean m1600s() {
        return upa.h3();
    }

    /* JADX INFO: renamed from: s3 */
    public boolean m1601s3() {
        return false;
    }

    /* JADX INFO: renamed from: sa */
    public boolean m1602sa() {
        return upa.S2();
    }

    /* JADX INFO: renamed from: sn */
    public boolean m1603sn() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m1604t() {
        return false;
    }

    /* JADX INFO: renamed from: t8 */
    public boolean m1605t8() {
        return psq.I();
    }

    /* JADX INFO: renamed from: t9 */
    public boolean m1606t9() {
        return upa.O();
    }

    /* JADX INFO: renamed from: tb */
    public void m1607tb(List<CoreGiftInfo> list) {
        qhe.m8996b().m9000e(list);
    }

    /* JADX INFO: renamed from: th */
    public Intent m1608th(Act act) {
        return NewMainAct.P5(act, false, true);
    }

    /* JADX INFO: renamed from: ti */
    public boolean m1609ti(String str) {
        return h7j.P(str);
    }

    /* JADX INFO: renamed from: tl */
    public boolean m1610tl() {
        return false;
    }

    /* JADX INFO: renamed from: tm */
    public ArrayList<LoopSelectFillData> m1611tm(User user) {
        return h7j.G(user);
    }

    /* JADX INFO: renamed from: tp */
    public boolean m1612tp() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m1613u() {
        return false;
    }

    /* JADX INFO: renamed from: uc */
    public int m1614uc() {
        return upa.A3();
    }

    /* JADX INFO: renamed from: ui */
    public boolean m1615ui() {
        return upa.m2();
    }

    /* JADX INFO: renamed from: uj */
    public String m1616uj() {
        return lra0.z;
    }

    /* JADX INFO: renamed from: v */
    public boolean m1617v() {
        return false;
    }

    /* JADX INFO: renamed from: vd */
    public boolean m1618vd(Frag frag) {
        return (frag instanceof NewNewHomeFrag) || (frag instanceof ProfileListFrag);
    }

    /* JADX INFO: renamed from: ve */
    public boolean m1619ve(User user) {
        return u59.V(user);
    }

    /* JADX INFO: renamed from: vi */
    public boolean m1620vi() {
        return false;
    }

    /* JADX INFO: renamed from: vp */
    public boolean m1621vp() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public boolean m1622w() {
        return upa.L3();
    }

    /* JADX INFO: renamed from: wl */
    public String m1623wl() {
        return "VirtualCard";
    }

    /* JADX INFO: renamed from: x */
    public boolean m1624x() {
        return false;
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m1625x3() {
        return CoreModule.P().b().x3();
    }

    /* JADX INFO: renamed from: xc */
    public void m1626xc(User user) {
        wn90.F().a = user;
    }

    /* JADX INFO: renamed from: xd */
    public void m1627xd(boolean z) {
        ew40.m6339h().m6352n(z);
    }

    /* JADX INFO: renamed from: xe */
    public void m1628xe() {
        nah0.c().j();
    }

    /* JADX INFO: renamed from: xh */
    public boolean m1629xh() {
        return upa.Y1();
    }

    /* JADX INFO: renamed from: xi */
    public boolean m1630xi() {
        return false;
    }

    /* JADX INFO: renamed from: xq */
    public Intent m1631xq(Context context, String str, String str2, String str3, String str4, String str5) {
        return IntlTribeSwipeAct.X1(context, str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: xr */
    public Class m1632xr() {
        return AccountInactiveTipAct.class;
    }

    /* JADX INFO: renamed from: y */
    public boolean m1633y() {
        return upa.P1();
    }

    /* JADX INFO: renamed from: y6 */
    public int m1634y6() {
        return upa.j1();
    }

    /* JADX INFO: renamed from: yg */
    public boolean m1635yg() {
        return false;
    }

    /* JADX INFO: renamed from: yh */
    public boolean m1636yh() {
        return mah0.m8073s0().m8103T0();
    }

    /* JADX INFO: renamed from: ym */
    public boolean m1637ym() {
        return ft4.b().h();
    }

    /* JADX INFO: renamed from: ys */
    public boolean m1638ys() {
        return false;
    }

    /* JADX INFO: renamed from: yt */
    public boolean m1639yt() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m1640z(String str) {
        return zb0.h(str);
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m1641z1() {
        return false;
    }

    /* JADX INFO: renamed from: zk */
    public void m1642zk() {
        src0.r().J();
    }

    /* JADX INFO: renamed from: zm */
    public Intent m1643zm(Context context, boolean z, boolean z2) {
        return NewMainAct.P5(context, z, z2);
    }

    /* JADX INFO: renamed from: zs */
    public void m1644zs(List<CoreSuggested.UserInfo> list, List<Voice> list2) {
        if (vwb.J(list)) {
            return;
        }
        cvm0.b(list, list2);
    }

    /* JADX INFO: renamed from: zt */
    public String m1645zt() {
        return CoreModule.b.getString(R.string.hh);
    }
}
