package com.p051p1.mobile.putong.core.module;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.data.IPRegion;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UrlTag;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.core.module.CoreProviderImpl;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveTipAct;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketRecordAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.operation.OperationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.core.p058ui.profile.EditProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopFragAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.settings.log.SelectLogTimeAct;
import com.p051p1.mobile.putong.core.p058ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.PurchaseCoinConsumeSayHiView;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinCheckstandAct;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinOtherAct;
import com.p051p1.mobile.putong.data.CounterConversations;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.a2i0;
import p153l.a5i0;
import p153l.al80;
import p153l.aw90;
import p153l.b240;
import p153l.b83;
import p153l.baj;
import p153l.bnl0;
import p153l.c760;
import p153l.c7d0;
import p153l.cjj;
import p153l.cl80;
import p153l.d79;
import p153l.dbc0;
import p153l.dy90;
import p153l.e1b;
import p153l.ej1;
import p153l.eu4;
import p153l.ey0;
import p153l.ey6;
import p153l.f4s;
import p153l.f760;
import p153l.fcp;
import p153l.fhp;
import p153l.g4n0;
import p153l.g6v;
import p153l.gj40;
import p153l.gra;
import p153l.gs50;
import p153l.gw90;
import p153l.gyp;
import p153l.h39;
import p153l.i4g0;
import p153l.ige0;
import p153l.iz40;
import p153l.jek;
import p153l.jyb;
import p153l.kec0;
import p153l.ljj;
import p153l.ln7;
import p153l.lyh0;
import p153l.m600;
import p153l.ma3;
import p153l.n46;
import p153l.ner;
import p153l.nwb;
import p153l.o2c;
import p153l.o3z;
import p153l.pm6;
import p153l.pq4;
import p153l.pza0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qap;
import p153l.qtk;
import p153l.quq;
import p153l.r8n;
import p153l.rgr;
import p153l.rm50;
import p153l.rum;
import p153l.rum0;
import p153l.spl0;
import p153l.sxa0;
import p153l.syu;
import p153l.szx;
import p153l.t450;
import p153l.t4j;
import p153l.t7a;
import p153l.tje0;
import p153l.tmh0;
import p153l.ts9;
import p153l.ugy;
import p153l.uie;
import p153l.uih0;
import p153l.upm;
import p153l.vb0;
import p153l.vih0;
import p153l.vq8;
import p153l.vx6;
import p153l.wrf0;
import p153l.wyd0;
import p153l.x20;
import p153l.xc20;
import p153l.xfc0;
import p153l.xwa;
import p153l.xzc0;
import p153l.xzm0;
import p153l.y20;
import p153l.yc2;
import p153l.ytk;
import p153l.yvk;
import p153l.z5h0;
import p153l.zg6;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreProviderModule", path = "/core_global/service")
public class CoreProviderImpl implements CoreProviderInterface {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$a */
    public class C7985a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f21960a;

        public C7985a(Act act) {
            this.f21960a = act;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            Act act = this.f21960a;
            act.startActivity(NewMainAct.m40697M5(act, NavigationIntent.get(NavigationIntent.menu)));
            this.f21960a.m68056e2();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreProviderImpl$b */
    public class C7986b implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f21962a;

        public C7986b(Act act) {
            this.f21962a = act;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            Act act = this.f21962a;
            act.startActivity(NewMainAct.m40697M5(act, NavigationIntent.get(NavigationIntent.menu)));
            this.f21962a.m68056e2();
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m37094F(x20 x20Var, ugy ugyVar) {
        i4g0.m138523u("e_coin_usage_confirm_button", "p_alert_coin_usage_confirm", jyb.m147494Y("is_shown_next_time", Boolean.valueOf(!a5i0.m96160p0().m96217f1())));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m37095H(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m37096J(Runnable runnable, ugy ugyVar) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m37098L() {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m37099M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m37100N(Relationship relationship) {
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m37101P(Runnable runnable, ugy ugyVar) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m37102Q(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m37103R(x20 x20Var, ugy ugyVar) {
        a5i0.m96110M1(PurchaseType.TYPE_SAY_HI_PKG);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: A */
    public void mo34654A(Act act) {
        qtk.m177999T0(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: A8 */
    public void mo34655A8(Act act, String str, String str2, String str3) {
        aw90.m100562F().m100606P(act, str, str2, str3);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Aa */
    public boolean mo34656Aa(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123180h(tantanForbidden);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ac */
    public CharSequence mo34657Ac(Message message) {
        return e1b.m118950H0(message);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ae */
    public boolean mo34658Ae(CoreSuggested.UserInfo userInfo) {
        return yvk.m217526g(userInfo);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Aj */
    public boolean mo34659Aj(Conversation conversation) {
        return fcp.m125025l(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: As */
    public boolean mo34660As() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: B */
    public boolean mo34661B() {
        return d79.m114685j0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: B8 */
    public wyd0 mo34662B8() {
        return r8n.m180219f().f161732f;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bf */
    public void mo34663Bf(String str, HashMap<String, String> map, HashMap<String, IPRegion> map2) {
        c760.m108287d().m108288c(str, map, map2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bm */
    public void mo34664Bm(AppealInfo appealInfo) {
        yc2.m215118e().m215125h(appealInfo);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bo */
    public void mo34665Bo(Act act) {
        act.startActivity(new Intent(act, (Class<?>) PrivacyAndPremissonAct.class));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Bt */
    public boolean mo34666Bt() {
        return gra.m131561E3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: C */
    public boolean mo34667C(int i) {
        return ln7.m154966a(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ce */
    public boolean mo34668Ce(Activity activity) {
        return activity instanceof LikersAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cf */
    public void mo34669Cf(List<UrlTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UrlTag> it = list.iterator();
        while (it.hasNext()) {
            for (UserTagData userTagData : it.next().tags) {
                NewTags newTagsNew_ = NewTags.new_();
                newTagsNew_.f21199id = userTagData.f21269id;
                newTagsNew_.name = userTagData.title;
                newTagsNew_.icon = userTagData.icon;
                int i = userTagData.count;
                newTagsNew_.localTagUserCounts = i > 0 ? i : 1L;
                newTagsNew_.categories = userTagData.categories;
                newTagsNew_.status = userTagData.status;
                if (gra.m131596L3()) {
                    newTagsNew_.isPictureTag = true;
                }
                arrayList.add(newTagsNew_);
            }
        }
        gj40.m130415o().m130428M(arrayList);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cn */
    public boolean mo34670Cn() {
        return gra.m131576H3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Cq */
    public int mo34671Cq() {
        return gra.m131616Q0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ct */
    public boolean mo34672Ct(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123178f(tantanForbidden);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: D */
    public boolean mo34673D() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Db */
    public void mo34674Db(boolean z) {
        tmh0.m191736J0(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Df */
    public boolean mo34675Df(User user) {
        return o3z.m165898g().m165905j(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Dg */
    public void mo34676Dg(String str) {
        t4j.m189281g(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Di */
    public Picture mo34677Di(User user) {
        return vx6.m203837a(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Dt */
    public int mo34678Dt() {
        CollapsibleConversationConfig collapsibleConversationConfigM131703k = gra.m131703k();
        return collapsibleConversationConfigM131703k == null ? Api.BaseClientBuilder.API_PRIORITY_OTHER : collapsibleConversationConfigM131703k.ignorable_unread_msg_days;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E */
    public boolean mo34679E() {
        return gra.m131637V1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E7 */
    public int mo34680E7(CounterConversations counterConversations) {
        return counterConversations.unseen;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: E8 */
    public void mo34681E8(HashMap<String, Integer> map) {
        map.put("CHAT_GROUP_QUNJINGAO", Integer.valueOf(R$string.f18318B1));
        map.put("CHAT_GROUP_QUNJIESHAN", Integer.valueOf(R$string.f18287A1));
        map.put("CHAT_GROUP_BEIQUNZUJINYAN", Integer.valueOf(R$string.f19447m1));
        map.put("CHAT_GROUP_YICHUQUNZU", Integer.valueOf(R$string.f18411E1));
        map.put("CHAT_GROUP_YAOQINGGRUQUN", Integer.valueOf(R$string.f18380D1));
        map.put("CHAT_GROUP_NIBEI_YICHUQUN", Integer.valueOf(R$string.f19695u1));
        map.put("CHAT_GROUP_HUANYINGRUQUN", Integer.valueOf(R$string.f19478n1));
        map.put("CHAT_GROUP_JIANQUN_CHENGGONG", Integer.valueOf(R$string.f19540p1));
        map.put("CHAT_GROUP_QUANYUANJINYAN", Integer.valueOf(R$string.f19819y1));
        map.put("CHAT_GROUP_JIECHUJINYAN", Integer.valueOf(R$string.f19571q1));
        map.put("CHAT_GROUP_ADMINISTRATOR", Integer.valueOf(R$string.f19416l1));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Eg */
    public void mo34682Eg(Act act) {
        pq4.m173309q(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: El */
    public String mo34683El(int i) {
        return baj.m103180U(baj.f75715p.get(i).m52760c());
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Er */
    public boolean mo34684Er() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F4 */
    public boolean mo34685F4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F6 */
    public boolean mo34686F6() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: F7 */
    public boolean mo34687F7() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fa */
    public void mo34688Fa(Act act, String str) {
        new sxa0(act, str).m188474K(5, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fk */
    public void mo34689Fk() {
        t4j.m189279d().m189287i();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Fl */
    public boolean mo34690Fl() {
        return gra.m131575H2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: G */
    public C4850a mo34691G(PutongAct putongAct) {
        return new szx(putongAct);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ga */
    public void mo34692Ga(String str) {
        if (gra.m131740r1()) {
            n46.m161541g().m161544f(str);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ge */
    public Intent mo34693Ge(Act act) {
        return MediaPickerAct.m48970k2(act, 1, false, true, true, null, MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender, "", true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gh */
    public NewTags mo34694Gh(String str) {
        return gj40.m130415o().m130430O(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gi */
    public boolean mo34695Gi() {
        return gra.m131771x2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Gp */
    public ArrayList<LoopSelectFillData> mo34696Gp(User user) {
        return baj.m103205r(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: H6 */
    public boolean mo34697H6(Activity activity) {
        return activity instanceof RedPacketRecordAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hb */
    public void mo34698Hb(Act act, boolean z, String str, x20 x20Var) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            b83.m102909k(act);
        } else {
            ma3.m157625h(act, z, x20Var, false, str);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hf */
    public boolean mo34699Hf() {
        return C8618a.m48771w().m48799v();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hg */
    public boolean mo34700Hg() {
        return d79.m114661T();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Hq */
    public void mo34701Hq(String str, ValueObject valueObject, ValueObject valueObject2) {
        g6v.m129273f().m129274e(str, valueObject, valueObject2, Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: I4 */
    public boolean mo34702I4() {
        return gra.m131778z();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: I5 */
    public boolean mo34703I5() {
        return spl0.m187369U();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ih */
    public int mo34704Ih() {
        if (NullChecker.m82486a(gra.m131558E0())) {
            return gra.m131558E0().new_tag_exposure_after_max_minutes;
        }
        return 3;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ik */
    public QualificationType mo34705Ik(String str) {
        return baj.m103167H(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ip */
    public void mo34706Ip(Act act, boolean z, String str, String str2) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
        } else if (CoreModule.f18264c.f20381e0.m116600p9().isProfileJailed()) {
            ey0.m123127i(act, false);
        } else {
            a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
            act.startActivity(TagGuidePicAct.m51955Z1(act, z, str, str2));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Is */
    public boolean mo34707Is() {
        return gra.m131707k3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: J8 */
    public int mo34708J8() {
        return a5i0.m96175v0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: J9 */
    public int mo34709J9() {
        return dbc0.f86163Fq;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jc */
    public int mo34710Jc(Act act) {
        return aw90.m100562F().m100595C(act, aw90.m100562F().f73701a, true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jd */
    public String mo34711Jd() {
        return m600.m157130c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Je */
    public boolean mo34712Je() {
        return gra.m131673e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ji */
    public boolean mo34713Ji(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123184l(tantanForbidden);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jk */
    public void mo34714Jk(Act act, User user) {
        rgr.m181477n(act, user, true, false, false, "logout_ab", null, new y20() { // from class: l.bta
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37100N((Relationship) obj);
            }
        }, new y20() { // from class: l.cta
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37099M((Throwable) obj);
            }
        }, "p_delete_account_chat_block", null, null, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Jo */
    public void mo34715Jo(Act act, @Nullable x20 x20Var) {
        qtk.m177991P0(act, "", new x20() { // from class: l.vsa
            @Override // p153l.x20
            public final void call() {
                CoreProviderImpl.m37098L();
            }
        }, false, false, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: K4 */
    public boolean mo34716K4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Kl */
    public boolean mo34717Kl() {
        return gra.m131667c3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Kq */
    public boolean mo34718Kq(User user) {
        return aw90.m100562F().m100620h0(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Lc */
    public boolean mo34719Lc() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Li */
    public boolean mo34720Li() {
        CollapsibleConversationConfig collapsibleConversationConfigM131703k = gra.m131703k();
        if (collapsibleConversationConfigM131703k == null) {
            return false;
        }
        return collapsibleConversationConfigM131703k.ignore_old_unread_msg;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ln */
    public boolean mo34721Ln() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mg */
    public int mo34722Mg() {
        return gra.m131551C3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mk */
    public CategorySuggestions mo34723Mk() {
        return ProfileListFrag.f34458I4;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mm */
    public boolean mo34724Mm(Act act) {
        return act instanceof EditProfileAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Mo */
    public boolean mo34725Mo() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: N6 */
    public HometownSuggest mo34726N6() {
        return gw90.m132588h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Na */
    public boolean mo34727Na() {
        return t7a.m189547c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nb */
    public String mo34728Nb(Profile profile) {
        return dy90.m118646V(profile);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nc */
    public void mo34729Nc(String str) {
        HomeStatisticsHelper.m37695F(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nd */
    public boolean mo34730Nd(Conversation conversation) {
        return pm6.m172913a(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nl */
    public boolean mo34731Nl(User user) {
        return ige0.m139914a(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Nq */
    public void mo34732Nq(boolean z) {
        ej1.m120954a(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: O */
    public boolean mo34733O() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oc */
    public boolean mo34734Oc() {
        return zg6.m219595f();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Od */
    public boolean mo34735Od() {
        return h39.m133422K();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oe */
    public void mo34736Oe(Envelope envelope, String str, boolean z) {
        zg6.m219591b(envelope, str, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oi */
    public boolean mo34737Oi() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Oq */
    public boolean mo34738Oq() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Or */
    public boolean mo34739Or() {
        return d79.m114652K();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Os */
    public List<String> mo34740Os(String str) {
        return baj.m103160A(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Pa */
    public void mo34741Pa(Context context) {
        Activity activityM105506D = bnl0.m105506D(context);
        i4g0.m138520r("e_advanced_filter_location", "p_advanced_filter_page");
        activityM105506D.startActivity(VipLocationHistoryAct.m57459X1(activityM105506D, ""));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Pi */
    public List<String> mo34742Pi(String str) {
        return baj.m103165F(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Q6 */
    public C22507a<List<Merchandise>> mo34743Q6() {
        return cjj.f82167b;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qg */
    public void mo34744Qg(Act act, boolean z, x20 x20Var) {
        mo34698Hb(act, z, "", x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qi */
    public boolean mo34745Qi() {
        return d79.m114669b0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ql */
    public boolean mo34746Ql(String str) {
        return d79.m114707x(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Qq */
    public boolean mo34747Qq() {
        return d79.m114668a0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: R8 */
    public boolean mo34748R8() {
        return d79.m114675e0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rg */
    public String mo34749Rg(String str, String str2) {
        return C8687b.m50242k(str, str2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rk */
    public boolean mo34750Rk() {
        return d79.m114662U();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ro */
    public int mo34751Ro() {
        return gra.m131713m();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Rq */
    public boolean mo34752Rq(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Si */
    public void mo34753Si(Act act) {
        act.startActivityForResult(DropDownAct.m55629a2(act), new C7986b(act));
    }

    /* JADX INFO: renamed from: T */
    public final View m37105T(Act act, ViewGroup viewGroup, boolean z) {
        PurchaseCoinConsumeSayHiView purchaseCoinConsumeSayHiView = (PurchaseCoinConsumeSayHiView) LayoutInflater.from(act).inflate(kec0.f125867hb, viewGroup, false);
        purchaseCoinConsumeSayHiView.m58588b(z);
        return purchaseCoinConsumeSayHiView;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: T8 */
    public Pair<List<String>, List<String>> mo34754T8(String str) {
        return baj.m103211x(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Te */
    public boolean mo34755Te(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123182j(tantanForbidden);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U */
    public boolean mo34756U() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U8 */
    public void mo34757U8(Act act) {
        pq4.m173308p(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: U9 */
    public boolean mo34758U9() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ua */
    public boolean mo34759Ua() {
        return gra.m131745s1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uc */
    public User mo34760Uc() {
        return aw90.m100562F().f73701a;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ud */
    public void mo34761Ud(Act act) {
        new fhp(act).show();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uj */
    public void mo34762Uj(Act act, y20<Media> y20Var) {
        aw90.m100562F().m100632v0(act, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ul */
    public C22507a<InsertConversationsList> mo34763Ul() {
        return r8n.m180219f().f161728b;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Uo */
    public boolean mo34764Uo(String str) {
        return baj.m103177R(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: V6 */
    public boolean mo34765V6() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: V8 */
    public boolean mo34766V8(TantanException.Client.TantanForbidden tantanForbidden) {
        return ey6.m123177e(tantanForbidden);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vb */
    public boolean mo34767Vb() {
        return gra.m131708l().enabled;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vc */
    public void mo34768Vc() {
        JailedDialogLikeAct.m45368o2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vd */
    public boolean mo34769Vd() {
        return d79.m114663V();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ve */
    public boolean mo34770Ve() {
        return d79.m114660S();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vi */
    public void mo34771Vi(Act act, int i, final Runnable runnable, final Runnable runnable2, final x20 x20Var) {
        ugy ugyVarM195998t = new ugy.C20573a(act).m195992A(false).m195995D("抢先告白").m195994C(q8g0.m175796b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), "抢先告白"), jyb.m147507f0(String.valueOf(i)), Color.parseColor("#fe7e1d"), lyh0.m156283c(3))).m196002x(act.string(R$string.f19012Xp), new y20() { // from class: l.dta
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37094F(x20Var, (ugy) obj);
            }
        }).m196000v(act.string(R$string.f19138c), new y20() { // from class: l.eta
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37096J(runnable2, (ugy) obj);
            }
        }).m196004z(a5i0.m96160p0().m96188C0()).m196001w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.fta
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96198P0(z);
            }
        }).m195993B(new DialogInterface.OnDismissListener() { // from class: l.wsa
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m37102Q(runnable, dialogInterface);
            }
        }).m195998t();
        ugyVarM195998t.m195967g().m46366m0(qa00.m175859d(4.0f)).m46341G(m37105T(act, ugyVarM195998t.m195967g(), true));
        ugyVarM195998t.m195967g().m46339E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", qa00.m175859d(311.0f), qa00.m175859d(253.0f));
        ugyVarM195998t.m195974n();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vj */
    public Intent mo34772Vj(Context context, String str) {
        return TanTanCoinCheckstandAct.m59263Y1(context, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vn */
    public void mo34773Vn(ner nerVar, x20 x20Var) {
        xzc0.m213720r().m213732K(nerVar, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Vq */
    public boolean mo34774Vq(String str) {
        return o3z.m165898g().m165901e(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: W7 */
    public String mo34775W7() {
        return "group";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: W8 */
    public boolean mo34776W8() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
        if (chatRoundsDisplayedExternallyConfigM131611P == null) {
            return false;
        }
        return chatRoundsDisplayedExternallyConfigM131611P.enabled;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wb */
    public void mo34777Wb(Act act) {
        act.startActivity(AppealProgressAct.m37175a2(act, false));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wc */
    public boolean mo34778Wc(CoreSuggested.UserInfo userInfo) {
        return (NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && "chat".equals(userInfo.payCardStyle)) || f760.INSTANCE.m124364k(userInfo);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wg */
    public int mo34779Wg() {
        return baj.f75715p.size();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wj */
    public String mo34780Wj() {
        return C8772a.f33513a;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Wk */
    public int mo34781Wk() {
        return 20;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: X5 */
    public boolean mo34782X5() {
        return gra.m131646X2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: X9 */
    public boolean mo34783X9() {
        return gra.m131742r3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xb */
    public void mo34784Xb(int i) {
        C8509a.m46746j().m46759t(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xf */
    public Picture.ImageUri mo34785Xf(Media media) {
        return nwb.m164968f(media);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xj */
    public void mo34786Xj(String str) {
        pza0.m174354f(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xk */
    public boolean mo34787Xk() {
        return gra.m131585J2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xl */
    public boolean mo34788Xl(int i) {
        return ey6.m123181i(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Xs */
    public void mo34789Xs(Act act, Throwable th, x20 x20Var) {
        xc20.m210106r(act, th, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Y7 */
    public void mo34790Y7(Envelope envelope, String str) {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ye */
    public int mo34791Ye() {
        return gra.m131703k().ignore_msg_days;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Yh */
    public boolean mo34792Yh() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ym */
    public String mo34793Ym(Profile profile) {
        return dy90.m118648X(profile);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Z5 */
    public boolean mo34794Z5(User user) {
        return tje0.m191438k(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Zc */
    public void mo34795Zc(Act act, String str) {
        gs50.m131966O().m131993H(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Ze */
    public boolean mo34796Ze() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: Zg */
    public List<String> mo34797Zg() {
        return baj.m103209v();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ac */
    public String mo34798ac(Activity activity) {
        if (activity instanceof MessagesAct) {
            return ((MessagesAct) activity).mo50158l().mo111034r3();
        }
        if (activity instanceof GreetAct) {
            return ((GreetAct) activity).m46767e2().m47043R0();
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: af */
    public String mo34799af() {
        return jek.m144581m();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ag */
    public void mo34800ag(Activity activity) {
        if ((activity instanceof ProfileAct) || (activity instanceof ProfileInfoLoopEditAct) || (activity instanceof ProfileLoopFragAct) || (activity instanceof MarryProfileEditAct)) {
            activity.finish();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ak */
    public boolean mo34801ak() {
        return gra.m131570G2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: am */
    public boolean mo34802am() {
        return o2c.m165708f();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: aq */
    public boolean mo34803aq() {
        return C8618a.m48771w().m48791n();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ar */
    public boolean mo34804ar() {
        return uih0.m196214m0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: b */
    public boolean mo34805b() {
        return vq8.m202358b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bh */
    public void mo34806bh(HeartbeatPushInfo heartbeatPushInfo) {
        upm.m197133b0(heartbeatPushInfo);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bm */
    public boolean mo34807bm() {
        return ts9.m192572d();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bn */
    public boolean mo34808bn() {
        return o2c.m165709g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bp */
    public void mo34809bp(Act act, String str, String str2) {
        aw90.m100562F().m100606P(act, str, str2, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: bq */
    public boolean mo34810bq() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: c */
    public boolean mo34811c() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: cp */
    public void mo34812cp() {
        uih0.m196223s0().m196254V0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ct */
    public Integer mo34813ct() {
        return Integer.valueOf(xfc0.f194023b);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d */
    public void mo34814d(Throwable th) {
        ey6.m123174b(th);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d4 */
    public boolean mo34815d4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: d7 */
    public boolean mo34816d7() {
        return gra.m131760v1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: da */
    public CoreInnerPush.C4867a mo34817da(User user, Message message) {
        return rum.m183205c(user, message);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: df */
    public boolean mo34818df() {
        return gra.m131712l3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: dq */
    public int mo34819dq() {
        return a5i0.m96181x0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: e */
    public boolean mo34820e() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ed */
    public boolean mo34821ed() {
        return d79.m114655N();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ee */
    public boolean mo34822ee(Act act) {
        return (act instanceof ProfileAct) && ((ProfileAct) act).m51935I2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ep */
    public boolean mo34823ep() {
        return d79.m114696p();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: er */
    public boolean mo34824er() {
        return qap.m175962i();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f */
    public boolean mo34825f() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f7 */
    public void mo34826f7() {
        upm.m197147i0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: f8 */
    public boolean mo34827f8() {
        return gra.m131556D3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fa */
    public List<String> mo34828fa(String str) {
        return baj.m103204q(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fd */
    public int mo34829fd() {
        return gra.m131567G();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: fi */
    public String mo34830fi() {
        return c7d0.f80104b.get();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g */
    public boolean mo34831g() {
        return rum0.m183208c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g5 */
    public C22421c<List<Merchandise>> mo34832g5(@NonNull @NotNull Context context, @NonNull @NotNull List<Merchandise> list) {
        return cjj.m110205M(context, list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g7 */
    public ArrayList<LoopSelectFillData> mo34833g7(User user) {
        return baj.m103212y(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: g8 */
    public boolean mo34834g8() {
        return b240.f74490X0;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gb */
    public boolean mo34835gb() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    public Intent getMainActIntent(Context context) {
        return xwa.m213310e(context);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gf */
    public ArrayList<LoopSelectFillData> mo34836gf(User user) {
        return baj.m103208u(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gm */
    public AtomicBoolean mo34837gm() {
        return d79.f85485r;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gn */
    public boolean mo34838gn() {
        return gra.m131563F0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: go */
    public Double mo34839go() {
        return rm50.m182042c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gq */
    public boolean mo34840gq() {
        return ts9.m192571c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gs */
    public void mo34841gs() {
        upm.m197145h0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: gt */
    public ArrayList<LoopSelectFillData> mo34842gt(User user) {
        return baj.m103161B(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h */
    public String mo34843h() {
        return syu.m188587h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h5 */
    public boolean mo34844h5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: h6 */
    public void mo34845h6(String str) {
        xzm0.m213760p().m213779w(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hf */
    public boolean mo34846hf(String str) {
        return baj.m103174O(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hh */
    public void mo34847hh(List<CoreSuggested.UserInfo> list) {
        uih0.m196223s0().m196282x0(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hi */
    public boolean mo34848hi(Act act) {
        return (act instanceof NewMainAct) || (act instanceof ProfileAct) || (act instanceof MediaPreviewAct) || (act instanceof CommonMediaPreviewAct) || (act instanceof IntlTribeSwipeAct) || (act instanceof com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPreviewAct);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: hs */
    public Intent mo34849hs(Context context) {
        return OperationCenterAct.m51596Z1(context);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: i */
    public boolean mo34850i() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ib */
    public boolean mo34851ib() {
        return spl0.m187385k();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ic */
    public boolean mo34852ic() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: id */
    public void mo34853id(Act act) {
        C8927c.m54659n1(act, "p_home_filter,advanced", Privilege.advanced_filter);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ig */
    public boolean mo34854ig() {
        return a5i0.m96108L1();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ip */
    public void mo34855ip(Act act, String str, Privilege privilege) {
        C8927c.m54659n1(act, str, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: iq */
    public boolean mo34856iq() {
        return d79.m114706w();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ir */
    public boolean mo34857ir() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: is */
    public boolean mo34858is() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j */
    public boolean mo34859j() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j3 */
    public boolean mo34860j3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: j6 */
    public Intent mo34861j6(Act act, String str) {
        return NewCropperAct.m37196G1(act, str, true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jd */
    public void mo34862jd(int i) {
        C8509a.m46746j().m46758s(1);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jf */
    public void mo34863jf(Act act, int i, final Runnable runnable, final Runnable runnable2, final x20 x20Var) {
        String str = CoreModule.f18276o.m132214d().mo34703I5() ? "抢先告白" : "打招呼";
        ugy ugyVarM195998t = new ugy.C20573a(act).m195992A(false).m195995D(str).m195994C(q8g0.m175796b0(String.format("本次使用将扣除 %1s 探探币，%2s用完了，可以用探探币购买更多", Integer.valueOf(i), str), jyb.m147507f0(String.valueOf(i)), Color.parseColor("#fe7e1d"), lyh0.m156283c(3))).m196002x(act.string(R$string.f19012Xp), new y20() { // from class: l.xsa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37103R(x20Var, (ugy) obj);
            }
        }).m196000v(act.string(R$string.f19138c), new y20() { // from class: l.ysa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreProviderImpl.m37101P(runnable2, (ugy) obj);
            }
        }).m196004z(a5i0.m96160p0().m96190I0()).m196001w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.zsa
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96202R0(z);
            }
        }).m195993B(new DialogInterface.OnDismissListener() { // from class: l.ata
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreProviderImpl.m37095H(runnable, dialogInterface);
            }
        }).m195998t();
        ugyVarM195998t.m195967g().m46366m0(qa00.m175859d(4.0f)).m46341G(m37105T(act, ugyVarM195998t.m195967g(), false));
        if (spl0.m187369U()) {
            ugyVarM195998t.m195967g().m46339E("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp", qa00.m175859d(311.0f), qa00.m175859d(253.0f));
        } else {
            ugyVarM195998t.m195967g().m46337B(dbc0.f87619yp);
        }
        ugyVarM195998t.m195974n();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jm */
    public int mo34864jm() {
        return C8618a.m48771w().m48773B();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jo */
    public void mo34865jo(List<CoreSuggested.UserInfo> list) {
        uih0.m196223s0().m196261e1(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jq */
    public void mo34866jq(boolean z) {
        C8618a.m48771w().m48787Q(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: js */
    public boolean mo34867js() {
        return ytk.m217338b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: jt */
    public int mo34868jt(Long l2) {
        return iz40.m142783t(pzi0.m174454o(), l2.longValue());
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k */
    public boolean mo34869k() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k6 */
    public boolean mo34870k6() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: k8 */
    public boolean mo34871k8() {
        return gra.m131574H1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ka */
    public boolean mo34872ka() {
        return zg6.m219594e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kc */
    public boolean mo34873kc() {
        return C7997b.m37423r().m37434n();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kd */
    public Throwable mo34874kd(Throwable th) {
        return ey6.m123173a(th);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kf */
    public boolean mo34875kf(List<String> list, List<String> list2) {
        return baj.m103176Q(list, list2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: kl */
    public boolean mo34876kl() {
        return aw90.m100562F().f73702b;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: km */
    public boolean mo34877km() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: l */
    public boolean mo34878l() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: l7 */
    public void mo34879l7(Act act, String str) {
        act.startActivityForResult(MessagesAct.m50126k2(act, str, false, false), new C7985a(act));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lb */
    public void mo34880lb() {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lj */
    public void mo34881lj(long j) {
        upm.m197126W(j);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: lk */
    public boolean mo34882lk() {
        return gra.m131654Z2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ll */
    public void mo34883ll(List<CoreSuggested.UserInfo> list) {
        uih0.m196223s0().m196260d1(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: m */
    public String mo34884m(List<String> list, List<String> list2) {
        return baj.m103172M(list, list2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: m3 */
    public boolean mo34885m3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: md */
    public Intent mo34886md(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        return xwa.m213301A(context, str, str2, z, z2, z3);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: mj */
    public boolean mo34887mj() {
        return gra.m131740r1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: mk */
    public List<GPTopicCard> mo34888mk(List<GPTopicCard> list) {
        return ljj.m154510b(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    public Intent newMainActClearStack(Context context, boolean z) {
        return NewMainAct.m40712S5(context, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: nj */
    public void mo34889nj(List<CoreSuggested.UserInfo> list, List<Live> list2) {
        if (jyb.m147479J(list)) {
            return;
        }
        f4s.m124036b(list, list2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: nn */
    public List<Purpose> mo34890nn(String str) {
        return baj.m103164E(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: no */
    public void mo34891no(boolean z) {
        aw90.m100562F().f73702b = z;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: np */
    public void mo34892np(Act act, y20<Media> y20Var) {
        aw90.m100562F().m100631u0(act, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o */
    public boolean mo34893o() {
        return gra.m131539A1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o8 */
    public CoreInnerPush.C4867a mo34894o8(User user, Message message) {
        return rum.m183203a(user, message);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: o9 */
    public boolean mo34895o9() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ob */
    public String mo34896ob(String str) {
        return ProfileListFrag.m53127bd(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: oe */
    public boolean mo34897oe() {
        return wrf0.m207589g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ol */
    public String mo34898ol() {
        return CoreModule.f18264c.f20419q2.f180586Z;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: oq */
    public boolean mo34899oq() {
        return OnlineMatchManager.m51326z().m51364m0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: os */
    public double mo34900os() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: p */
    public boolean mo34901p() {
        return gra.m131657a2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: p0 */
    public boolean mo34902p0() {
        return gra.m131776y2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: pb */
    public boolean mo34903pb() {
        return t450.m189174h().m189184g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ph */
    public String mo34904ph(Act.C4450r c4450r) {
        return MessagesAct.m50134s2(c4450r);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: pn */
    public boolean mo34905pn() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: q */
    public boolean mo34906q() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: q0 */
    public boolean mo34907q0() {
        return gra.m131586J3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qa */
    public void mo34908qa(Act act, String str) {
        act.startActivity(o2c.m165711i(act, str));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qc */
    public String mo34909qc(String str) {
        return C8772a.m51417R(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qe */
    public boolean mo34910qe() {
        return gra.m131566F3() || gra.m131726o2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qf */
    public boolean mo34911qf() {
        return aw90.m100562F().m100608S();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qi */
    public int mo34912qi() {
        return gra.m131615Q();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qq */
    public boolean mo34913qq() {
        return d79.m114653L();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: qr */
    public boolean mo34914qr(String str) {
        return TextUtils.equals(str, z5h0.m218675j().f203055m);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: r */
    public void mo34915r(Act act) {
        act.startActivity(new Intent(act, (Class<?>) SelectLogTimeAct.class));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: r7 */
    public void mo34916r7(Act act) {
        cl80.m110426e().m110439q(al80.m98641a(new gyp(act)));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rf */
    public Intent mo34917rf(Context context, String str) {
        return TanTanCoinOtherAct.m59308b2(context, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rm */
    public void mo34918rm(Act act, String str) {
        act.startActivity(NewMainAct.m40697M5(act, NavigationIntent.get(str)));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rs */
    public int mo34919rs() {
        return a5i0.m96181x0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: rt */
    public boolean mo34920rt() {
        return tmh0.m191747z0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: s */
    public boolean mo34921s() {
        return gra.m131692h3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: s3 */
    public boolean mo34922s3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: sa */
    public boolean mo34923sa() {
        return gra.m131626S2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: sn */
    public boolean mo34924sn() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t */
    public boolean mo34925t() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t8 */
    public boolean mo34926t8() {
        return quq.m178173I();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: t9 */
    public boolean mo34927t9() {
        return gra.m131607O();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tb */
    public void mo34928tb(List<CoreGiftInfo> list) {
        uie.m196154b().m196158e(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: th */
    public Intent mo34929th(Act act) {
        return NewMainAct.m40715T5(act, false, true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ti */
    public boolean mo34930ti(String str) {
        return baj.m103175P(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tl */
    public boolean mo34931tl() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tm */
    public ArrayList<LoopSelectFillData> mo34932tm(User user) {
        return baj.m103166G(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: tp */
    public boolean mo34933tp() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: u */
    public boolean mo34934u() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: uc */
    public int mo34935uc() {
        return gra.m131541A3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ui */
    public boolean mo34936ui() {
        return gra.m131716m2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: uj */
    public String mo34937uj() {
        return pza0.f154799z;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: v */
    public boolean mo34938v() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vd */
    public boolean mo34939vd(Frag frag) {
        return (frag instanceof NewNewHomeFrag) || (frag instanceof ProfileListFrag);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ve */
    public boolean mo34940ve(User user) {
        return d79.m114664W(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vi */
    public boolean mo34941vi() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: vp */
    public boolean mo34942vp() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: w */
    public boolean mo34943w() {
        return gra.m131596L3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: wl */
    public String mo34944wl() {
        return CoreSuggested.UserInfo.VIRTUAL_CARD;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: x */
    public boolean mo34945x() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: x3 */
    public boolean mo34946x3() {
        return CoreModule.m30933P().m143406b().mo36133x3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xc */
    public void mo34947xc(User user) {
        aw90.m100562F().f73701a = user;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xd */
    public void mo34948xd(boolean z) {
        t450.m189174h().m189187n(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xe */
    public void mo34949xe() {
        vih0.m201338c().m201347j();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xh */
    public boolean mo34950xh() {
        return gra.m131649Y1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xi */
    public boolean mo34951xi() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xq */
    public Intent mo34952xq(Context context, String str, String str2, String str3, String str4, String str5) {
        return IntlTribeSwipeAct.m40528Y1(context, str, str2, str3, str4, str5);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: xr */
    public Class mo34953xr() {
        return AccountInactiveTipAct.class;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: y */
    public boolean mo34954y() {
        return gra.m131613P1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: y6 */
    public int mo34955y6() {
        return gra.m131700j1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yg */
    public boolean mo34956yg() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yh */
    public boolean mo34957yh() {
        return uih0.m196223s0().m196253T0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ym */
    public boolean mo34958ym() {
        return eu4.m122523b().m122530h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: ys */
    public boolean mo34959ys() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: yt */
    public boolean mo34960yt() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: z */
    public boolean mo34961z(String str) {
        return vb0.m200646h(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: z1 */
    public boolean mo34962z1() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zk */
    public void mo34963zk() {
        xzc0.m213720r().m213731J();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zm */
    public Intent mo34964zm(Context context, boolean z, boolean z2) {
        return NewMainAct.m40715T5(context, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zs */
    public void mo34965zs(List<CoreSuggested.UserInfo> list, List<Voice> list2) {
        if (jyb.m147479J(list)) {
            return;
        }
        g4n0.m128906b(list, list2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface
    /* JADX INFO: renamed from: zt */
    public String mo34966zt() {
        return CoreModule.f18263b.getString(R$string.f18365Ch);
    }
}
