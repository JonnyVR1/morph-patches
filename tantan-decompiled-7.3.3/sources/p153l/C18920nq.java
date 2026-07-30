package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveConfirmAct;
import com.p051p1.mobile.putong.core.p058ui.account.DeleteAccountInactiveAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.nq */
/* JADX INFO: loaded from: classes9.dex */
public class C18920nq implements iam<C21846zp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f143151a;

    /* JADX INFO: renamed from: b */
    public VText f143152b;

    /* JADX INFO: renamed from: c */
    public VText f143153c;

    /* JADX INFO: renamed from: d */
    public VText f143154d;

    /* JADX INFO: renamed from: e */
    public VText f143155e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveConfirmAct f143156f;

    /* JADX INFO: renamed from: g */
    public C21846zp f143157g;

    public C18920nq(AccountInactiveConfirmAct accountInactiveConfirmAct) {
        this.f143156f = accountInactiveConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m164251A(String str, View view) {
        gta.m132210e().m132214d().mo34918rm(act(), "moment");
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m164252B(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), act().getString(R$string.f28757p3), C4879a.m32227M("feedback-mobile/form?from=suggest")));
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m164266w(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m164267C(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), act().getString(R$string.f28757p3), C4879a.m32227M("feedback-mobile/form?from=vip_complaint")));
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143156f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m164268E(String str, View view) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na()) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na().settings) && TextUtils.isEmpty(CoreModule.f18264c.f20381e0.m116593na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.f18264c.f20381e0.m116593na().settings.phoneNumber.number)) {
            act().startActivity(CoreModule.m30929H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else {
            act().startActivity(CoreModule.m30929H().phoneVerificationActArgs(act(), VerifyReason.get(VerifyReason.change_phone)));
        }
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m164269F(String str, View view) {
        gta.m132210e().m132214d().mo34918rm(act(), "cards");
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m164270G(String str, String str2, View view) {
        i4g0.m138523u("e_delete_account_block_delete", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
        m164273J(str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m164271H(String str) {
        i4g0.m138520r("e_delete_account_delete_click", "p_delete_account_tips_popup");
        act().startActivity(DeleteAccountInactiveAct.m45295Z1(act(), str, this.f143157g.m220808f0(), this.f143157g.m220809g0()));
        act().m51642n2();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m164272I() {
        act().m51642n2();
    }

    /* JADX INFO: renamed from: J */
    public void m164273J(final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_delete_account_tips_popup", getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        act().dialog().m21558v().m21560w(3).m21506G0("请注意").m21503F("1. 注销账户后，您将永久失去该账户的所有聊天记录、配对、个人资料、动态等，且无法恢复，请谨慎操作。\n2. 您的 VIP 特权、SVIP 特权及服务有效期将作废；您钱包内的剩余余额将作废（包括探探币余额、直播收入等，其中探探币不可提现，您可以进行消费后再注销，或者直接舍弃）；购买的增值服务（包括超级喜欢、超级曝光、闪聊次数等）将作废。\n3. App Store自动续费用户请在iTunes商店内手动取消续费服务，其他自动续费用户将在注销后自动关闭续费服务。").m21495B(true).m21525V(new DialogInterface.OnDismissListener() { // from class: l.bq
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21559v0("确定", new Runnable() { // from class: l.cq
            @Override // java.lang.Runnable
            public final void run() {
                this.f83050a.m164271H(str);
            }
        }).m21543n0("取消", new Runnable() { // from class: l.dq
            @Override // java.lang.Runnable
            public final void run() {
                this.f90097a.m164272I();
            }
        }).m21566z().show();
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m164274q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m164274q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19193oq.m168777b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AccountInactiveConfirmAct act() {
        return this.f143156f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C21846zp c21846zp) {
        this.f143157g = c21846zp;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public void m164277v(final String str, String str2, final String str3) {
        this.f143151a.setTitle(act().getString(R$string.f28736m0));
        this.f143151a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.aq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72766a.m164266w(view);
            }
        });
        this.f143152b.setText(str2);
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
                this.f143153c.setText("在探探，除了心动对象，您也可以从兴趣爱好、工作行业、学术研究等方向出发，找到志同道合的好友；若您对我们的APP有问题，也可以向我们提出宝贵的建议");
                this.f143154d.setText("告诉我们该如何改进");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.iq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f116315a.m164252B(str, view);
                    }
                });
                break;
            case 1:
            case 14:
            case 15:
            case 23:
                this.f143153c.setText("除了划卡之外，发表和评论动态也能极大的增加你找到志同道合的人的概率哦。马上去发表动态吧");
                this.f143154d.setText("去广场结识更多好友");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.hq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f111063a.m164251A(str, view);
                    }
                });
                break;
            case 2:
            case 5:
            case 16:
            case 20:
            case 21:
                this.f143153c.setText("若遇到闪退、卡顿、bug等问题，您可以尝试卸载并重新安装APP，也可以告知客服，说明您的情况并截图，客服会马上处理");
                this.f143154d.setText("点此告知客服");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.gq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f105637a.m164280z(str, view);
                    }
                });
                break;
            case 3:
            case 8:
            case 11:
            case 19:
                this.f143153c.setText("您可以将您的问题直接汇报给客服，我们会以最快的速度精准定位并修复，无需注销");
                this.f143154d.setText("点此告知客服");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.jq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f122172a.m164267C(str, view);
                    }
                });
                break;
            case 6:
                int iM174454o = (int) (((long) (pzi0.m174454o() - CoreModule.f18264c.f20381e0.m116600p9().createdTime)) / 86400000);
                this.f143152b.setText("更多原因");
                this.f143153c.setText("您已注册探探" + (iM174454o + 1) + "天，再坚持一下就能找到志同道合的好友了。您也可以通过广场、直播等找到自己感兴趣的人。");
                this.f143154d.setText("认识更多好友");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.lq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f133130a.m164269F(str, view);
                    }
                });
                break;
            case 9:
            case 12:
            case 18:
            case 22:
                this.f143153c.setText("若您在使用产品的过程中遇到诈骗、骚扰、盗用、人身攻击等，请点击用户资料页右上角或者告知客服进行举报，举报成功后您可获得特权奖励");
                this.f143154d.setText("点此告知客服");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.eq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f95287a.m164278x(str, view);
                    }
                });
                break;
            case 10:
                this.f143153c.setText("您可以在APP内直接更换手机号，无需重新注册");
                this.f143154d.setText("更换手机号");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.kq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f128146a.m164268E(str, view);
                    }
                });
                break;
            case 17:
                this.f143153c.setText("若您允许探探读取了您的通讯录，我们将把您的联系人自动屏蔽掉，你们不会在APP内互相看到对方，您可以随时打开通讯录权限");
                this.f143154d.setText("前往通讯录设置");
                bnl0.m105509E0(this.f143154d, new View.OnClickListener() { // from class: l.fq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f100234a.m164279y(str, view);
                    }
                });
                break;
        }
        bnl0.m105509E0(this.f143155e, new View.OnClickListener() { // from class: l.mq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137976a.m164270G(str, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m164278x(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), act().getString(R$string.f28757p3), C4879a.m32227M("feedback-mobile/form?from=logout_stay")));
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m164279y(String str, View view) {
        if (j26.m143188a(act(), "android.permission.READ_CONTACTS") != 0) {
            try {
                hve0.m137322x(act());
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        } else {
            CoreModule.f18276o.m132214d().mo34665Bo(act());
            C21846zp.f205406c.onNext(uxj0.f181467a);
        }
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m164280z(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), act().getString(R$string.f28757p3), C4879a.m32227M("feedback-mobile/form?from=vip_complaint")));
        act().m51642n2();
        i4g0.m138523u("e_delete_account_block_jump", act().pageId(), jyb.m147494Y("delete_account_reason_block_page", act().m45289a2(str)));
        qu2.m178105E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
