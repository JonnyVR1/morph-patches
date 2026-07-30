package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveConfirmAct;
import com.p046p1.mobile.putong.core.p053ui.account.DeleteAccountInactiveAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.sq */
/* JADX INFO: loaded from: classes8.dex */
public class C20009sq implements s7m<C16665eq> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f165895a;

    /* JADX INFO: renamed from: b */
    public VText f165896b;

    /* JADX INFO: renamed from: c */
    public VText f165897c;

    /* JADX INFO: renamed from: d */
    public VText f165898d;

    /* JADX INFO: renamed from: e */
    public VText f165899e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveConfirmAct f165900f;

    /* JADX INFO: renamed from: g */
    public C16665eq f165901g;

    public C20009sq(AccountInactiveConfirmAct accountInactiveConfirmAct) {
        this.f165900f = accountInactiveConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m185395A(String str, View view) {
        ura.m195053e().m195057d().mo33915rm(act(), "moment");
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m185396B(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), act().getString(R$string.f27909p3), C4728a.m31224M("feedback-mobile/form?from=suggest")));
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m185410w(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m185411C(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), act().getString(R$string.f27909p3), C4728a.m31224M("feedback-mobile/form?from=vip_complaint")));
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165900f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m185412E(String str, View view) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na()) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na().settings) && TextUtils.isEmpty(CoreModule.f17545c.f19639e0.m169520na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.f17545c.f19639e0.m169520na().settings.phoneNumber.number)) {
            act().startActivity(CoreModule.m29931H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else {
            act().startActivity(CoreModule.m29931H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.change_phone)));
        }
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m185413F(String str, View view) {
        ura.m195053e().m195057d().mo33915rm(act(), "cards");
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m185414G(String str, String str2, View view) {
        zvf0.m220399u("e_delete_account_block_delete", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
        m185417J(str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m185415H(String str) {
        zvf0.m220396r("e_delete_account_delete_click", "p_delete_account_tips_popup");
        act().startActivity(DeleteAccountInactiveAct.m44112Y1(act(), str, this.f165901g.m117692f0(), this.f165901g.m117693g0()));
        act().m50458m2();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m185416I() {
        act().m50458m2();
    }

    /* JADX INFO: renamed from: J */
    public void m185417J(final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_delete_account_tips_popup", getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        act().dialog().m20559v().m20561w(3).m20507G0("请注意").m20504F("1. 注销账户后，您将永久失去该账户的所有聊天记录、配对、个人资料、动态等，且无法恢复，请谨慎操作。\n2. 您的 VIP 特权、SVIP 特权及服务有效期将作废；您钱包内的剩余余额将作废（包括探探币余额、直播收入等，其中探探币不可提现，您可以进行消费后再注销，或者直接舍弃）；购买的增值服务（包括超级喜欢、超级曝光、闪聊次数等）将作废。\n3. App Store自动续费用户请在iTunes商店内手动取消续费服务，其他自动续费用户将在注销后自动关闭续费服务。").m20496B(true).m20526V(new DialogInterface.OnDismissListener() { // from class: l.gq
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20560v0("确定", new Runnable() { // from class: l.hq
            @Override // java.lang.Runnable
            public final void run() {
                this.f109020a.m185415H(str);
            }
        }).m20544n0("取消", new Runnable() { // from class: l.iq
            @Override // java.lang.Runnable
            public final void run() {
                this.f114364a.m185416I();
            }
        }).m20567z().show();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m185418q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m185418q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20241tq.m190067b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AccountInactiveConfirmAct act() {
        return this.f165900f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C16665eq c16665eq) {
        this.f165901g = c16665eq;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public void m185421v(final String str, String str2, final String str3) {
        this.f165895a.setTitle(act().getString(R$string.f27888m0));
        this.f165895a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.fq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98754a.m185410w(view);
            }
        });
        this.f165896b.setText(str2);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2049471274:
                if (str.equals("reason_finded_partner_in_true_life")) {
                    b = 0;
                }
                break;
            case -2014436233:
                if (str.equals("reason_got_no_message")) {
                    b = 1;
                }
                break;
            case -1931307249:
                if (str.equals("reason_no_network_frequently")) {
                    b = 2;
                }
                break;
            case -1902698293:
                if (str.equals("reason_account_banned")) {
                    b = 3;
                }
                break;
            case -1709215591:
                if (str.equals("reason_finded_partner_in_other_platform")) {
                    b = 4;
                }
                break;
            case -1573551128:
                if (str.equals("reason_too_much_bug")) {
                    b = 5;
                }
                break;
            case -1534549556:
                if (str.equals("reason_custom")) {
                    b = 6;
                }
                break;
            case -785974473:
                if (str.equals("reason_finded_partner_in_tantan")) {
                    b = 7;
                }
                break;
            case -528945376:
                if (str.equals("reason_matches_disapear")) {
                    b = 8;
                }
                break;
            case -302618129:
                if (str.equals("reason_match_fraud")) {
                    b = 9;
                }
                break;
            case -208858259:
                if (str.equals("reason_reregister_or_change_phone")) {
                    b = 10;
                }
                break;
            case 3625194:
                if (str.equals("reason_no_suggested_person_nearby")) {
                    b = 11;
                }
                break;
            case 44229066:
                if (str.equals("reason_got_person_abuse")) {
                    b = 12;
                }
                break;
            case 370315917:
                if (str.equals("reason_want_back_to_true_life")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 492796074:
                if (str.equals("reason_no_person_i_like_nearby")) {
                    b = 14;
                }
                break;
            case 663706165:
                if (str.equals("reason_got_no_match")) {
                    b = 15;
                }
                break;
            case 879556053:
                if (str.equals("reason_use_too_much_memory")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1177855695:
                if (str.equals("reason_not_want_seen_by_acquaintance")) {
                    b = 17;
                }
                break;
            case 1231944580:
                if (str.equals("reason_picture_embezzled")) {
                    b = 18;
                }
                break;
            case 1410739831:
                if (str.equals("reason_suggested_same_person")) {
                    b = 19;
                }
                break;
            case 1455672063:
                if (str.equals("reason_hang_seriously")) {
                    b = 20;
                }
                break;
            case 1539602702:
                if (str.equals("reason_crash_frequently")) {
                    b = 21;
                }
                break;
            case 1689165110:
                if (str.equals("reason_got_harass")) {
                    b = 22;
                }
                break;
            case 1700149074:
                if (str.equals("reason_no_people_can_talk_to")) {
                    b = 23;
                }
                break;
        }
        switch (b) {
            case 0:
            case 4:
            case 7:
            case 13:
                this.f165897c.setText("在探探，除了心动对象，您也可以从兴趣爱好、工作行业、学术研究等方向出发，找到志同道合的好友；若您对我们的APP有问题，也可以向我们提出宝贵的建议");
                this.f165898d.setText("告诉我们该如何改进");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.nq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f140022a.m185396B(str, view);
                    }
                });
                break;
            case 1:
            case 14:
            case 15:
            case 23:
                this.f165897c.setText("除了划卡之外，发表和评论动态也能极大的增加你找到志同道合的人的概率哦。马上去发表动态吧");
                this.f165898d.setText("去广场结识更多好友");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.mq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f135135a.m185395A(str, view);
                    }
                });
                break;
            case 2:
            case 5:
            case 16:
            case 20:
            case 21:
                this.f165897c.setText("若遇到闪退、卡顿、bug等问题，您可以尝试卸载并重新安装APP，也可以告知客服，说明您的情况并截图，客服会马上处理");
                this.f165898d.setText("点此告知客服");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.lq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f129264a.m185424z(str, view);
                    }
                });
                break;
            case 3:
            case 8:
            case 11:
            case 19:
                this.f165897c.setText("您可以将您的问题直接汇报给客服，我们会以最快的速度精准定位并修复，无需注销");
                this.f165898d.setText("点此告知客服");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.oq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f145071a.m185411C(str, view);
                    }
                });
                break;
            case 6:
                int iM155944o = (int) (((long) (mqi0.m155944o() - CoreModule.f17545c.f19639e0.m169527p9().createdTime)) / 86400000);
                this.f165896b.setText("更多原因");
                this.f165897c.setText("您已注册探探" + (iM155944o + 1) + "天，再坚持一下就能找到志同道合的好友了。您也可以通过广场、直播等找到自己感兴趣的人。");
                this.f165898d.setText("认识更多好友");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.qq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f155844a.m185413F(str, view);
                    }
                });
                break;
            case 9:
            case 12:
            case 18:
            case 22:
                this.f165897c.setText("若您在使用产品的过程中遇到诈骗、骚扰、盗用、人身攻击等，请点击用户资料页右上角或者告知客服进行举报，举报成功后您可获得特权奖励");
                this.f165898d.setText("点此告知客服");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.jq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f119244a.m185422x(str, view);
                    }
                });
                break;
            case 10:
                this.f165897c.setText("您可以在APP内直接更换手机号，无需重新注册");
                this.f165898d.setText("更换手机号");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.pq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f150735a.m185412E(str, view);
                    }
                });
                break;
            case 17:
                this.f165897c.setText("若您允许探探读取了您的通讯录，我们将把您的联系人自动屏蔽掉，你们不会在APP内互相看到对方，您可以随时打开通讯录权限");
                this.f165898d.setText("前往通讯录设置");
                xdl0.m208329E0(this.f165898d, new View.OnClickListener() { // from class: l.kq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f124213a.m185423y(str, view);
                    }
                });
                break;
        }
        xdl0.m208329E0(this.f165899e, new View.OnClickListener() { // from class: l.rq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160581a.m185414G(str, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m185422x(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), act().getString(R$string.f27909p3), C4728a.m31224M("feedback-mobile/form?from=logout_stay")));
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m185423y(String str, View view) {
        if (e16.m114373a(act(), "android.permission.READ_CONTACTS") != 0) {
            try {
                ane0.m97752x(act());
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        } else {
            CoreModule.f17557o.m195057d().mo33662Bo(act());
            C16665eq.f92732c.onNext(roj0.f160388a);
        }
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m185424z(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), act().getString(R$string.f27909p3), C4728a.m31224M("feedback-mobile/form?from=vip_complaint")));
        act().m50458m2();
        zvf0.m220399u("e_delete_account_block_jump", act().pageId(), vwb.m200311Y("delete_account_reason_block_page", act().m44106Z1(str)));
        au2.m98912E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
