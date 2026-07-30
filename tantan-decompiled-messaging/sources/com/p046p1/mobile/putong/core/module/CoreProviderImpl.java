package com.p046p1.mobile.putong.core.module;

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
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.data.IPRegion;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UrlTag;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.Voice;
import com.p046p1.mobile.putong.core.module.CoreProviderImpl;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveTipAct;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketRecordAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.operation.OperationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.core.p053ui.profile.EditProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopFragAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.settings.log.SelectLogTimeAct;
import com.p046p1.mobile.putong.core.p053ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.PurchaseCoinConsumeSayHiView;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinCheckstandAct;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinOtherAct;
import com.p046p1.mobile.putong.data.CounterConversations;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ak50;
import p149l.ark;
import p149l.az50;
import p149l.b1c;
import p149l.bx6;
import p149l.co90;
import p149l.cvm0;
import p149l.d30;
import p149l.d8e0;
import p149l.e2s;
import p149l.e30;
import p149l.eqh0;
import p149l.ew40;
import p149l.f4v;
import p149l.f6c0;
import p149l.fap;
import p149l.ffp;
import p149l.ft4;
import p149l.gwp;
import p149l.h6a;
import p149l.h7j;
import p149l.hm7;
import p149l.i0g0;
import p149l.i36;
import p149l.igj;
import p149l.ir9;
import p149l.irk;
import p149l.itk;
import p149l.ke50;
import p149l.leh0;
import p149l.lra0;
import p149l.lva;
import p149l.m73;
import p149l.mah0;
import p149l.mcr;
import p149l.ml6;
import p149l.mqi0;
import p149l.nah0;
import p149l.njf0;
import p149l.nlm0;
import p149l.nt30;
import p149l.obe0;
import p149l.ogl0;
import p149l.opa0;
import p149l.p420;
import p149l.psm;
import p149l.psq;
import p149l.pxz;
import p149l.q8p;
import p149l.qer;
import p149l.qhe;
import p149l.qp4;
import p149l.qp8;
import p149l.r6n;
import p149l.rc2;
import p149l.rgj;
import p149l.ruy;
import p149l.rwu;
import p149l.rxg0;
import p149l.rza;
import p149l.sa40;
import p149l.snm;
import p149l.src0;
import p149l.sth0;
import p149l.sw6;
import p149l.swh0;
import p149l.t100;
import p149l.t7c0;
import p149l.tbk;
import p149l.tqm0;
import p149l.u59;
import p149l.uc80;
import p149l.upa;
import p149l.uq40;
import p149l.uqd0;
import p149l.vqx;
import p149l.vwb;
import p149l.wc80;
import p149l.wf6;
import p149l.wn90;
import p149l.x2c0;
import p149l.x7y;
import p149l.x93;
import p149l.xdl0;
import p149l.xi1;
import p149l.xx0;
import p149l.xy50;
import p149l.y19;
import p149l.y1j;
import p149l.zb0;
import p149l.zp90;
import p149l.zub;
import p149l.zvf0;
import p149l.zyc0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreProviderModule", path = "/core_global/service")
public class CoreProviderImpl implements CoreProviderInterface {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$a */
    public class C7834a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f21218a;

        public C7834a(Act act) {
            this.f21218a = act;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            Act act = this.f21218a;
            act.startActivity(NewMainAct.m39685I5(act, NavigationIntent.get(NavigationIntent.menu)));
            this.f21218a.m66873d2();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$b */
    public class C7835b implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f21220a;

        public C7835b(Act act) {
            this.f21220a = act;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            Act act = this.f21220a;
            act.startActivity(NewMainAct.m39685I5(act, NavigationIntent.get(NavigationIntent.menu)));
            this.f21220a.m66873d2();
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m36091F(d30 d30Var, x7y x7yVar) {
        zvf0.m220399u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", vwb.m200311Y("is_shown_next_time", Boolean.valueOf(!swh0.m186255p0().m186312f1())));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m36092H(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m36093J(Runnable runnable, x7y x7yVar) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m36095L() {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m36096M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m36097N(Relationship relationship) {
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m36098P(Runnable runnable, x7y x7yVar) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m36099Q(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m36100R(d30 d30Var, x7y x7yVar) {
        swh0.m186205M1(PurchaseType.TYPE_SAY_HI_PKG);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: A */
    public void mo33651A(Act act) {
        ark.m98449T0(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: A8 */
    public void mo33652A8(Act act, String str, String str2, String str3) {
        wn90.m204602F().m204646P(act, str, str2, str3);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Aa */
    public boolean mo33653Aa(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104289h(tantanForbidden);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ac */
    public CharSequence mo33654Ac(Message message) {
        return rza.m181728H0(message);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ae */
    public boolean mo33655Ae(CoreSuggested.UserInfo userInfo) {
        return itk.m138207g(userInfo);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Aj */
    public boolean mo33656Aj(Conversation conversation) {
        return fap.m120258l(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: As */
    public boolean mo33657As() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: B */
    public boolean mo33658B() {
        return u59.m191827f0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: B8 */
    public uqd0 mo33659B8() {
        return r6n.m178067f().f157958f;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bf */
    public void mo33660Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        xy50.m211730d().m211731c(str, map, map2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bm */
    public void mo33661Bm(AppealInfo appealInfo) {
        rc2.m178723e().m178730h(appealInfo);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bo */
    public void mo33662Bo(Act act) {
        act.startActivity(new Intent(act, (Class<?>) PrivacyAndPremissonAct.class));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bt */
    public boolean mo33663Bt() {
        return upa.m194630E3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: C */
    public boolean mo33664C(int i) {
        return hm7.m131699a(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ce */
    public boolean mo33665Ce(Activity activity) {
        return activity instanceof LikersAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cf */
    public void mo33666Cf(List<UrlTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UrlTag> it = list.iterator();
        while (it.hasNext()) {
            for (UserTagData userTagData : it.next().tags) {
                NewTags newTagsNew_ = NewTags.new_();
                newTagsNew_.f20457id = userTagData.f20527id;
                newTagsNew_.name = userTagData.title;
                newTagsNew_.icon = userTagData.icon;
                int i = userTagData.count;
                newTagsNew_.localTagUserCounts = i > 0 ? i : 1L;
                newTagsNew_.categories = userTagData.categories;
                newTagsNew_.status = userTagData.status;
                if (upa.m194665L3()) {
                    newTagsNew_.isPictureTag = true;
                }
                arrayList.add(newTagsNew_);
            }
        }
        sa40.m182802o().m182815M(arrayList);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cn */
    public boolean mo33667Cn() {
        return upa.m194645H3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cq */
    public int mo33668Cq() {
        return upa.m194685Q0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ct */
    public boolean mo33669Ct(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104287f(tantanForbidden);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: D */
    public boolean mo33670D() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Db */
    public void mo33671Db(boolean z) {
        leh0.m149516J0(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Df */
    public boolean mo33672Df(User user) {
        return ruy.m181215g().m181222j(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Dg */
    public void mo33673Dg(String str) {
        y1j.m212198g(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Di */
    public Picture mo33674Di(User user) {
        return sw6.m186126a(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Dt */
    public int mo33675Dt() {
        CollapsibleConversationConfig collapsibleConversationConfigM194772k = upa.m194772k();
        return collapsibleConversationConfigM194772k == null ? Api.BaseClientBuilder.API_PRIORITY_OTHER : collapsibleConversationConfigM194772k.ignorable_unread_msg_days;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E */
    public boolean mo33676E() {
        return upa.m194706V1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E7 */
    public int mo33677E7(CounterConversations counterConversations) {
        return counterConversations.unseen;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E8 */
    public void mo33678E8(HashMap<String, Integer> map) {
        map.put("CHAT_GROUP_QUNJINGAO", Integer.valueOf(R$string.f17598B1));
        map.put("CHAT_GROUP_QUNJIESHAN", Integer.valueOf(R$string.f17568A1));
        map.put("CHAT_GROUP_BEIQUNZUJINYAN", Integer.valueOf(R$string.f18717m1));
        map.put("CHAT_GROUP_YICHUQUNZU", Integer.valueOf(R$string.f17688E1));
        map.put("CHAT_GROUP_YAOQINGGRUQUN", Integer.valueOf(R$string.f17658D1));
        map.put("CHAT_GROUP_NIBEI_YICHUQUN", Integer.valueOf(R$string.f18960u1));
        map.put("CHAT_GROUP_HUANYINGRUQUN", Integer.valueOf(R$string.f18748n1));
        map.put("CHAT_GROUP_JIANQUN_CHENGGONG", Integer.valueOf(R$string.f18810p1));
        map.put("CHAT_GROUP_QUANYUANJINYAN", Integer.valueOf(R$string.f19080y1));
        map.put("CHAT_GROUP_JIECHUJINYAN", Integer.valueOf(R$string.f18840q1));
        map.put("CHAT_GROUP_ADMINISTRATOR", Integer.valueOf(R$string.f18686l1));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Eg */
    public void mo33679Eg(Act act) {
        qp4.m175811q(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: El */
    public String mo33680El(int i) {
        return h7j.m129709U(h7j.f106298p.get(i).m51577c());
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Er */
    public boolean mo33681Er() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F4 */
    public boolean mo33682F4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F6 */
    public boolean mo33683F6() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F7 */
    public boolean mo33684F7() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fa */
    public void mo33685Fa(Act act, String str) {
        new opa0(act, str).m165327K(5, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fk */
    public void mo33686Fk() {
        y1j.m212196d().m212204i();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fl */
    public boolean mo33687Fl() {
        return upa.m194644H2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: G */
    public C4699a mo33688G(PutongAct putongAct) {
        return new vqx(putongAct);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ga */
    public void mo33689Ga(String str) {
        if (upa.m194809r1()) {
            i36.m134149g().m134152f(str);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ge */
    public Intent mo33690Ge(Act act) {
        return MediaPickerAct.m47787i2(act, 1, false, true, true, null, MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender, "", true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gh */
    public NewTags mo33691Gh(String str) {
        return sa40.m182802o().m182817O(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gi */
    public boolean mo33692Gi() {
        return upa.m194840x2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gp */
    public ArrayList<LoopSelectFillData> mo33693Gp(User user) {
        return h7j.m129734r(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: H6 */
    public boolean mo33694H6(Activity activity) {
        return activity instanceof RedPacketRecordAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hb */
    public void mo33695Hb(Act act, boolean z, String str, d30 d30Var) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            m73.m153331k(act);
        } else {
            x93.m207472h(act, z, d30Var, false, str);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hf */
    public boolean mo33696Hf() {
        return C8455a.m47588w().m47616v();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hg */
    public boolean mo33697Hg() {
        return u59.m191810S();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hq */
    public void mo33698Hq(String str, ValueObject valueObject, ValueObject valueObject2) {
        f4v.m119459f().m119460e(str, valueObject, valueObject2, Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: I4 */
    public boolean mo33699I4() {
        return upa.m194847z();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: I5 */
    public boolean mo33700I5() {
        return ogl0.m164242U();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ih */
    public int mo33701Ih() {
        if (NullChecker.m81303a(upa.m194627E0())) {
            return upa.m194627E0().new_tag_exposure_after_max_minutes;
        }
        return 3;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ik */
    public QualificationType mo33702Ik(String str) {
        return h7j.m129696H(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ip */
    public void mo33703Ip(Act act, boolean z, String str, String str2) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
        } else if (CoreModule.f17545c.f19639e0.m169527p9().isProfileJailed()) {
            xx0.m211440i(act, false);
        } else {
            sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
            act.startActivity(TagGuidePicAct.m50772Y1(act, z, str, str2));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Is */
    public boolean mo33704Is() {
        return upa.m194776k3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: J8 */
    public int mo33705J8() {
        return swh0.m186270v0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: J9 */
    public int mo33706J9() {
        return x2c0.f189712Rp;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jc */
    public int mo33707Jc(Act act) {
        return wn90.m204602F().m204635C(act, wn90.m204602F().f187269a, true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jd */
    public String mo33708Jd() {
        return pxz.m171966c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Je */
    public boolean mo33709Je() {
        return upa.m194742e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ji */
    public boolean mo33710Ji(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104293l(tantanForbidden);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jk */
    public void mo33711Jk(Act act, User user) {
        qer.m174243n(act, user, true, false, false, "logout_ab", null, new e30() { // from class: l.pra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36097N((Relationship) obj);
            }
        }, new e30() { // from class: l.qra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36096M((Throwable) obj);
            }
        }, "p_delete_account_chat_block", null, null, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jo */
    public void mo33712Jo(Act act, @Nullable d30 d30Var) {
        ark.m98441P0(act, "", new d30() { // from class: l.jra
            @Override // p149l.d30
            public final void call() {
                CoreProviderImpl.m36095L();
            }
        }, false, false, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: K4 */
    public boolean mo33713K4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Kl */
    public boolean mo33714Kl() {
        return upa.m194736c3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Kq */
    public boolean mo33715Kq(User user) {
        return wn90.m204602F().m204660h0(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Lc */
    public boolean mo33716Lc() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Li */
    public boolean mo33717Li() {
        CollapsibleConversationConfig collapsibleConversationConfigM194772k = upa.m194772k();
        if (collapsibleConversationConfigM194772k == null) {
            return false;
        }
        return collapsibleConversationConfigM194772k.ignore_old_unread_msg;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ln */
    public boolean mo33718Ln() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mg */
    public int mo33719Mg() {
        return upa.m194620C3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mk */
    public CategorySuggestions mo33720Mk() {
        return ProfileListFrag.f33610I4;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mm */
    public boolean mo33721Mm(Act act) {
        return act instanceof EditProfileAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mo */
    public boolean mo33722Mo() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: N6 */
    public HometownSuggest mo33723N6() {
        return co90.m107947h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Na */
    public boolean mo33724Na() {
        return h6a.m129470c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nb */
    public String mo33725Nb(Profile profile) {
        return zp90.m219656V(profile);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nc */
    public void mo33726Nc(String str) {
        HomeStatisticsHelper.m36692F(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nd */
    public boolean mo33727Nd(Conversation conversation) {
        return ml6.m155116a(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nl */
    public boolean mo33728Nl(User user) {
        return d8e0.m110322a(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nq */
    public void mo33729Nq(boolean z) {
        xi1.m208910a(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: O */
    public boolean mo33730O() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oc */
    public boolean mo33731Oc() {
        return wf6.m202951f();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Od */
    public boolean mo33732Od() {
        return y19.m212151K();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oe */
    public void mo33733Oe(Envelope envelope, String str, boolean z) {
        wf6.m202947b(envelope, str, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oi */
    public boolean mo33734Oi() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oq */
    public boolean mo33735Oq() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Or */
    public boolean mo33736Or() {
        return u59.m191801J();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Os */
    public List<String> mo33737Os(String str) {
        return h7j.m129689A(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Pa */
    public void mo33738Pa(Context context) {
        Activity activityM208326D = xdl0.m208326D(context);
        zvf0.m220396r("e_advanced_filter_location", "p_advanced_filter_page");
        activityM208326D.startActivity(VipLocationHistoryAct.m56276V1(activityM208326D, ""));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Pi */
    public List<String> mo33739Pi(String str) {
        return h7j.m129694F(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Q6 */
    public C22392a<List<Merchandise>> mo33740Q6() {
        return igj.f113124b;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qg */
    public void mo33741Qg(Act act, boolean z, d30 d30Var) {
        mo33695Hb(act, z, "", d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qi */
    public boolean mo33742Qi() {
        return u59.m191818a0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ql */
    public boolean mo33743Ql(String str) {
        return u59.m191853x(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qq */
    public boolean mo33744Qq() {
        return u59.m191817Z();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: R8 */
    public boolean mo33745R8() {
        return u59.m191823d0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rg */
    public String mo33746Rg(String str, String str2) {
        return C8524b.m49059k(str, str2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rk */
    public boolean mo33747Rk() {
        return u59.m191811T();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ro */
    public int mo33748Ro() {
        return upa.m194782m();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rq */
    public boolean mo33749Rq(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Si */
    public void mo33750Si(Act act) {
        act.startActivityForResult(DropDownAct.m54446Z1(act), new C7835b(act));
    }

    /* JADX INFO: renamed from: T */
    public final View m36102T(Act act, ViewGroup viewGroup, boolean z) {
        PurchaseCoinConsumeSayHiView purchaseCoinConsumeSayHiView = (PurchaseCoinConsumeSayHiView) LayoutInflater.from(act).inflate(f6c0.f95694ab, viewGroup, false);
        purchaseCoinConsumeSayHiView.m57405b(z);
        return purchaseCoinConsumeSayHiView;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: T8 */
    public Pair<List<String>, List<String>> mo33751T8(String str) {
        return h7j.m129740x(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Te */
    public boolean mo33752Te(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104291j(tantanForbidden);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U */
    public boolean mo33753U() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U8 */
    public void mo33754U8(Act act) {
        qp4.m175810p(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U9 */
    public boolean mo33755U9() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ua */
    public boolean mo33756Ua() {
        return upa.m194814s1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uc */
    public User mo33757Uc() {
        return wn90.m204602F().f187269a;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ud */
    public void mo33758Ud(Act act) {
        new ffp(act).show();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uj */
    public void mo33759Uj(Act act, e30<Media> e30Var) {
        wn90.m204602F().m204672v0(act, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ul */
    public C22392a<InsertConversationsList> mo33760Ul() {
        return r6n.m178067f().f157954b;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uo */
    public boolean mo33761Uo(String str) {
        return h7j.m129706R(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: V6 */
    public boolean mo33762V6() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: V8 */
    public boolean mo33763V8(TantanException.Client.TantanForbidden tantanForbidden) {
        return bx6.m104286e(tantanForbidden);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vb */
    public boolean mo33764Vb() {
        return upa.m194777l().enabled;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vc */
    public void mo33765Vc() {
        JailedDialogLikeAct.m44185n2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vd */
    public boolean mo33766Vd() {
        return u59.m191812U();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ve */
    public boolean mo33767Ve() {
        return u59.m191809R();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vi */
    public void mo33768Vi(Act act, int i, final Runnable runnable, final Runnable runnable2, final d30 d30Var) {
        x7y x7yVarM207348t = new x7y.C21039a(act).m207342A(false).m207345D("抢先告白").m207344C(i0g0.m133861b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), "抢先告白"), vwb.m200324f0(String.valueOf(i)), Color.parseColor("#fe7e1d"), eqh0.m117752c(3))).m207352x(act.string(R$string.f17652Cp), new e30() { // from class: l.rra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36091F(d30Var, (x7y) obj);
            }
        }).m207350v(act.string(R$string.f18408c), new e30() { // from class: l.sra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36093J(runnable2, (x7y) obj);
            }
        }).m207354z(swh0.m186255p0().m186283C0()).m207351w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.tra
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186293P0(z);
            }
        }).m207343B(new DialogInterface.OnDismissListener() { // from class: l.kra
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m36099Q(runnable, dialogInterface);
            }
        }).m207348t();
        x7yVarM207348t.m207317g().m45183m0(t100.m186890d(4.0f)).m45158G(m36102T(act, x7yVarM207348t.m207317g(), true));
        x7yVarM207348t.m207317g().m45156E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", t100.m186890d(311.0f), t100.m186890d(253.0f));
        x7yVarM207348t.m207324n();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vj */
    public Intent mo33769Vj(Context context, String str) {
        return TanTanCoinCheckstandAct.m58080X1(context, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vn */
    public void mo33770Vn(mcr mcrVar, d30 d30Var) {
        src0.m185656r().m185668K(mcrVar, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vq */
    public boolean mo33771Vq(String str) {
        return ruy.m181215g().m181218e(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: W7 */
    public String mo33772W7() {
        return "group";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: W8 */
    public boolean mo33773W8() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
        if (chatRoundsDisplayedExternallyConfigM194680P == null) {
            return false;
        }
        return chatRoundsDisplayedExternallyConfigM194680P.enabled;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wb */
    public void mo33774Wb(Act act) {
        act.startActivity(AppealProgressAct.m36172Z1(act, false));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wc */
    public boolean mo33775Wc(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && "chat".equals(userInfo.payCardStyle)) || az50.INSTANCE.m99631k(userInfo);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wg */
    public int mo33776Wg() {
        return h7j.f106298p.size();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wj */
    public String mo33777Wj() {
        return C8609a.f32665a;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wk */
    public int mo33778Wk() {
        return 20;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: X5 */
    public boolean mo33779X5() {
        return upa.m194715X2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: X9 */
    public boolean mo33780X9() {
        return upa.m194811r3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xb */
    public void mo33781Xb(int i) {
        C8346a.m45563j().m45576t(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xf */
    public Picture.ImageUri mo33782Xf(Media media) {
        return zub.m220207f(media);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xj */
    public void mo33783Xj(String str) {
        lra0.m151147f(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xk */
    public boolean mo33784Xk() {
        return upa.m194654J2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xl */
    public boolean mo33785Xl(int i) {
        return bx6.m104290i(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xs */
    public void mo33786Xs(Act act, Throwable th, d30 d30Var) {
        p420.m167352r(act, th, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Y7 */
    public void mo33787Y7(Envelope envelope, String str) {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ye */
    public int mo33788Ye() {
        return upa.m194772k().ignore_msg_days;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Yh */
    public boolean mo33789Yh() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ym */
    public String mo33790Ym(Profile profile) {
        return zp90.m219658X(profile);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Z5 */
    public boolean mo33791Z5(User user) {
        return obe0.m163429k(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Zc */
    public void mo33792Zc(Act act, String str) {
        ak50.m97109O().m97136H(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ze */
    public boolean mo33793Ze() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Zg */
    public List<String> mo33794Zg() {
        return h7j.m129738v();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ac */
    public String mo33795ac(Activity activity) {
        if (activity instanceof MessagesAct) {
            return ((MessagesAct) activity).mo48974l().mo120828r3();
        }
        if (activity instanceof GreetAct) {
            return ((GreetAct) activity).m45584d2().m45860R0();
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: af */
    public String mo33796af() {
        return tbk.m187866m();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ag */
    public void mo33797ag(Activity activity) {
        if ((activity instanceof ProfileAct) || (activity instanceof ProfileInfoLoopEditAct) || (activity instanceof ProfileLoopFragAct) || (activity instanceof MarryProfileEditAct)) {
            activity.finish();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ak */
    public boolean mo33798ak() {
        return upa.m194639G2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: am */
    public boolean mo33799am() {
        return b1c.m99817f();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: aq */
    public boolean mo33800aq() {
        return C8455a.m47588w().m47608n();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ar */
    public boolean mo33801ar() {
        return mah0.m153720m0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: b */
    public boolean mo33802b() {
        return qp8.m175817b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bh */
    public void mo33803bh(HeartbeatPushInfo heartbeatPushInfo) {
        snm.m185099b0(heartbeatPushInfo);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bm */
    public boolean mo33804bm() {
        return ir9.m137824d();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bn */
    public boolean mo33805bn() {
        return b1c.m99818g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bp */
    public void mo33806bp(Act act, String str, String str2) {
        wn90.m204602F().m204646P(act, str, str2, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bq */
    public boolean mo33807bq() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: c */
    public boolean mo33808c() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: cp */
    public void mo33809cp() {
        mah0.m153729s0().m153760V0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ct */
    public Integer mo33810ct() {
        return Integer.valueOf(t7c0.f168688b);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d */
    public void mo33811d(Throwable th) {
        bx6.m104283b(th);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d4 */
    public boolean mo33812d4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d7 */
    public boolean mo33813d7() {
        return upa.m194829v1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: da */
    public CoreInnerPush.C4716a mo33814da(User user, Message message) {
        return psm.m171183c(user, message);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: df */
    public boolean mo33815df() {
        return upa.m194781l3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: dq */
    public int mo33816dq() {
        return swh0.m186276x0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: e */
    public boolean mo33817e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ed */
    public boolean mo33818ed() {
        return u59.m191804M();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ee */
    public boolean mo33819ee(Act act) {
        return (act instanceof ProfileAct) && ((ProfileAct) act).m50752H2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ep */
    public boolean mo33820ep() {
        return u59.m191845p();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: er */
    public boolean mo33821er() {
        return q8p.m173425i();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f */
    public boolean mo33822f() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f7 */
    public void mo33823f7() {
        snm.m185113i0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f8 */
    public boolean mo33824f8() {
        return upa.m194625D3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fa */
    public List<String> mo33825fa(String str) {
        return h7j.m129733q(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fd */
    public int mo33826fd() {
        return upa.m194636G();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fi */
    public String mo33827fi() {
        return zyc0.f205672b.get();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g */
    public boolean mo33828g() {
        return nlm0.m160070c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g5 */
    public C22306c<List<Merchandise>> mo33829g5(@NonNull @NotNull Context context, @NonNull @NotNull List<Merchandise> list) {
        return igj.m136009M(context, list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g7 */
    public ArrayList<LoopSelectFillData> mo33830g7(User user) {
        return h7j.m129741y(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g8 */
    public boolean mo33831g8() {
        return nt30.f140338X0;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gb */
    public boolean mo33832gb() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    public Intent getMainActIntent(Context context) {
        return lva.m151849e(context);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gf */
    public ArrayList<LoopSelectFillData> mo33833gf(User user) {
        return h7j.m129737u(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gm */
    public AtomicBoolean mo33834gm() {
        return u59.f174678r;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gn */
    public boolean mo33835gn() {
        return upa.m194632F0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: go */
    public Double mo33836go() {
        return ke50.m145716c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gq */
    public boolean mo33837gq() {
        return ir9.m137823c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gs */
    public void mo33838gs() {
        snm.m185111h0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gt */
    public ArrayList<LoopSelectFillData> mo33839gt(User user) {
        return h7j.m129690B(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h */
    public String mo33840h() {
        return rwu.m181459h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h5 */
    public boolean mo33841h5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h6 */
    public void mo33842h6(String str) {
        tqm0.m190131p().m190150w(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hf */
    public boolean mo33843hf(String str) {
        return h7j.m129703O(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hh */
    public void mo33844hh(List<CoreSuggested.UserInfo> list) {
        mah0.m153729s0().m153788x0(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hi */
    public boolean mo33845hi(Act act) {
        return (act instanceof NewMainAct) || (act instanceof ProfileAct) || (act instanceof MediaPreviewAct) || (act instanceof CommonMediaPreviewAct) || (act instanceof IntlTribeSwipeAct) || (act instanceof com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPreviewAct);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hs */
    public Intent mo33846hs(Context context) {
        return OperationCenterAct.m50413Y1(context);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: i */
    public boolean mo33847i() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ib */
    public boolean mo33848ib() {
        return ogl0.m164258k();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ic */
    public boolean mo33849ic() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: id */
    public void mo33850id(Act act) {
        C8764c.m53476n1(act, "p_home_filter,advanced", Privilege.advanced_filter);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ig */
    public boolean mo33851ig() {
        return swh0.m186203L1();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ip */
    public void mo33852ip(Act act, String str, Privilege privilege) {
        C8764c.m53476n1(act, str, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: iq */
    public boolean mo33853iq() {
        return u59.m191852w();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ir */
    public boolean mo33854ir() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: is */
    public boolean mo33855is() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j */
    public boolean mo33856j() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j3 */
    public boolean mo33857j3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j6 */
    public Intent mo33858j6(Act act, String str) {
        return NewCropperAct.m36193F1(act, str, true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jd */
    public void mo33859jd(int i) {
        C8346a.m45563j().m45575s(1);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jf */
    public void mo33860jf(Act act, int i, final Runnable runnable, final Runnable runnable2, final d30 d30Var) {
        String str = CoreModule.f17557o.m195057d().mo33700I5() ? "抢先告白" : "打招呼";
        x7y x7yVarM207348t = new x7y.C21039a(act).m207342A(false).m207345D(str).m207344C(i0g0.m133861b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), str), vwb.m200324f0(String.valueOf(i)), Color.parseColor("#fe7e1d"), eqh0.m117752c(3))).m207352x(act.string(R$string.f17652Cp), new e30() { // from class: l.lra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36100R(d30Var, (x7y) obj);
            }
        }).m207350v(act.string(R$string.f18408c), new e30() { // from class: l.mra
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreProviderImpl.m36098P(runnable2, (x7y) obj);
            }
        }).m207354z(swh0.m186255p0().m186285I0()).m207351w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.nra
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186297R0(z);
            }
        }).m207343B(new DialogInterface.OnDismissListener() { // from class: l.ora
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m36092H(runnable, dialogInterface);
            }
        }).m207348t();
        x7yVarM207348t.m207317g().m45183m0(t100.m186890d(4.0f)).m45158G(m36102T(act, x7yVarM207348t.m207317g(), false));
        if (ogl0.m164242U()) {
            x7yVarM207348t.m207317g().m45156E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", t100.m186890d(311.0f), t100.m186890d(253.0f));
        } else {
            x7yVarM207348t.m207317g().m45154B(x2c0.f189494Ko);
        }
        x7yVarM207348t.m207324n();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jm */
    public int mo33861jm() {
        return C8455a.m47588w().m47590B();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jo */
    public void mo33862jo(List<CoreSuggested.UserInfo> list) {
        mah0.m153729s0().m153767e1(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jq */
    public void mo33863jq(boolean z) {
        C8455a.m47588w().m47604Q(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: js */
    public boolean mo33864js() {
        return irk.m137900b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jt */
    public int mo33865jt(Long l2) {
        return uq40.m194978t(mqi0.m155944o(), l2.longValue());
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k */
    public boolean mo33866k() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k6 */
    public boolean mo33867k6() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k8 */
    public boolean mo33868k8() {
        return upa.m194643H1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ka */
    public boolean mo33869ka() {
        return wf6.m202950e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kc */
    public boolean mo33870kc() {
        return C7846b.m36420r().m36431n();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kd */
    public Throwable mo33871kd(Throwable th) {
        return bx6.m104282a(th);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kf */
    public boolean mo33872kf(List<String> list, List<String> list2) {
        return h7j.m129705Q(list, list2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kl */
    public boolean mo33873kl() {
        return wn90.m204602F().f187270b;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: km */
    public boolean mo33874km() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: l */
    public boolean mo33875l() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: l7 */
    public void mo33876l7(Act act, String str) {
        act.startActivityForResult(MessagesAct.m48943i2(act, str, false, false), new C7834a(act));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lb */
    public void mo33877lb() {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lj */
    public void mo33878lj(long j) {
        snm.m185092W(j);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lk */
    public boolean mo33879lk() {
        return upa.m194723Z2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ll */
    public void mo33880ll(List<CoreSuggested.UserInfo> list) {
        mah0.m153729s0().m153766d1(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: m */
    public String mo33881m(List<String> list, List<String> list2) {
        return h7j.m129701M(list, list2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: m3 */
    public boolean mo33882m3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: md */
    public Intent mo33883md(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return lva.m151840A(context, str, str2, z, z2, z3);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: mj */
    public boolean mo33884mj() {
        return upa.m194809r1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: mk */
    public List<GPTopicCard> mo33885mk(List<GPTopicCard> list) {
        return rgj.m179168b(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    public Intent newMainActClearStack(Context context, boolean z) {
        return NewMainAct.m39700O5(context, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: nj */
    public void mo33886nj(List<CoreSuggested.UserInfo> list, List<Live> list2) {
        if (vwb.m200296J(list)) {
            return;
        }
        e2s.m114522b(list, list2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: nn */
    public List<Purpose> mo33887nn(String str) {
        return h7j.m129693E(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: no */
    public void mo33888no(boolean z) {
        wn90.m204602F().f187270b = z;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: np */
    public void mo33889np(Act act, e30<Media> e30Var) {
        wn90.m204602F().m204671u0(act, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o */
    public boolean mo33890o() {
        return upa.m194608A1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o8 */
    public CoreInnerPush.C4716a mo33891o8(User user, Message message) {
        return psm.m171181a(user, message);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o9 */
    public boolean mo33892o9() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ob */
    public String mo33893ob(String str) {
        return ProfileListFrag.m51944bd(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: oe */
    public boolean mo33894oe() {
        return njf0.m159656g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ol */
    public String mo33895ol() {
        return CoreModule.f17545c.f19677q2.f114445Z;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: oq */
    public boolean mo33896oq() {
        return OnlineMatchManager.m50143z().m50181m0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: os */
    public double mo33897os() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: p */
    public boolean mo33898p() {
        return upa.m194726a2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: p0 */
    public boolean mo33899p0() {
        return upa.m194845y2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: pb */
    public boolean mo33900pb() {
        return ew40.m118397h().m118407g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ph */
    public String mo33901ph(Act.C4299r c4299r) {
        return MessagesAct.m48951r2(c4299r);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: pn */
    public boolean mo33902pn() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: q */
    public boolean mo33903q() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: q0 */
    public boolean mo33904q0() {
        return upa.m194655J3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qa */
    public void mo33905qa(Act act, String str) {
        act.startActivity(b1c.m99820i(act, str));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qc */
    public String mo33906qc(String str) {
        return C8609a.m50234R(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qe */
    public boolean mo33907qe() {
        return upa.m194635F3() || upa.m194795o2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qf */
    public boolean mo33908qf() {
        return wn90.m204602F().m204648S();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qi */
    public int mo33909qi() {
        return upa.m194684Q();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qq */
    public boolean mo33910qq() {
        return u59.m191802K();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qr */
    public boolean mo33911qr(String str) {
        return TextUtils.equals(str, rxg0.m181572j().f161468m);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: r */
    public void mo33912r(Act act) {
        act.startActivity(new Intent(act, (Class<?>) SelectLogTimeAct.class));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: r7 */
    public void mo33913r7(Act act) {
        wc80.m202636e().m202649q(uc80.m192995a(new gwp(act)));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rf */
    public Intent mo33914rf(Context context, String str) {
        return TanTanCoinOtherAct.m58125a2(context, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rm */
    public void mo33915rm(Act act, String str) {
        act.startActivity(NewMainAct.m39685I5(act, NavigationIntent.get(str)));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rs */
    public int mo33916rs() {
        return swh0.m186276x0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rt */
    public boolean mo33917rt() {
        return leh0.m149527z0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: s */
    public boolean mo33918s() {
        return upa.m194761h3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: s3 */
    public boolean mo33919s3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: sa */
    public boolean mo33920sa() {
        return upa.m194695S2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: sn */
    public boolean mo33921sn() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t */
    public boolean mo33922t() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t8 */
    public boolean mo33923t8() {
        return psq.m171193I();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t9 */
    public boolean mo33924t9() {
        return upa.m194676O();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tb */
    public void mo33925tb(List<CoreGiftInfo> list) {
        qhe.m174529b().m174533e(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: th */
    public Intent mo33926th(Act act) {
        return NewMainAct.m39703P5(act, false, true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ti */
    public boolean mo33927ti(String str) {
        return h7j.m129704P(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tl */
    public boolean mo33928tl() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tm */
    public ArrayList<LoopSelectFillData> mo33929tm(User user) {
        return h7j.m129695G(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tp */
    public boolean mo33930tp() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: u */
    public boolean mo33931u() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: uc */
    public int mo33932uc() {
        return upa.m194610A3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ui */
    public boolean mo33933ui() {
        return upa.m194785m2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: uj */
    public String mo33934uj() {
        return lra0.f129539z;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: v */
    public boolean mo33935v() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vd */
    public boolean mo33936vd(Frag frag) {
        return (frag instanceof NewNewHomeFrag) || (frag instanceof ProfileListFrag);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ve */
    public boolean mo33937ve(User user) {
        return u59.m191813V(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vi */
    public boolean mo33938vi() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vp */
    public boolean mo33939vp() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: w */
    public boolean mo33940w() {
        return upa.m194665L3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: wl */
    public String mo33941wl() {
        return CoreSuggested.UserInfo.VIRTUAL_CARD;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: x */
    public boolean mo33942x() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: x3 */
    public boolean mo33943x3() {
        return CoreModule.m29935P().m94652b().mo35130x3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xc */
    public void mo33944xc(User user) {
        wn90.m204602F().f187269a = user;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xd */
    public void mo33945xd(boolean z) {
        ew40.m118397h().m118410n(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xe */
    public void mo33946xe() {
        nah0.m158679c().m158688j();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xh */
    public boolean mo33947xh() {
        return upa.m194718Y1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xi */
    public boolean mo33948xi() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xq */
    public Intent mo33949xq(Context context, String str, String str2, String str3, String str4, String str5) {
        return IntlTribeSwipeAct.m39525X1(context, str, str2, str3, str4, str5);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xr */
    public Class mo33950xr() {
        return AccountInactiveTipAct.class;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: y */
    public boolean mo33951y() {
        return upa.m194682P1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: y6 */
    public int mo33952y6() {
        return upa.m194769j1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yg */
    public boolean mo33953yg() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yh */
    public boolean mo33954yh() {
        return mah0.m153729s0().m153759T0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ym */
    public boolean mo33955ym() {
        return ft4.m123008b().m123015h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ys */
    public boolean mo33956ys() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yt */
    public boolean mo33957yt() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: z */
    public boolean mo33958z(String str) {
        return zb0.m217811h(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: z1 */
    public boolean mo33959z1() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zk */
    public void mo33960zk() {
        src0.m185656r().m185667J();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zm */
    public Intent mo33961zm(Context context, boolean z, boolean z2) {
        return NewMainAct.m39703P5(context, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zs */
    public void mo33962zs(List<CoreSuggested.UserInfo> list, List<Voice> list2) {
        if (vwb.m200296J(list)) {
            return;
        }
        cvm0.m108885b(list, list2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zt */
    public String mo33963zt() {
        return CoreModule.f17544b.getString(R$string.f18580hh);
    }
}
