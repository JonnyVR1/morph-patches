package p007l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveConfirmAct;
import com.p003p1.mobile.putong.core.p006ui.account.DeleteAccountInactiveAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Date;
import l.ane0;
import l.au2;
import l.cwf0;
import l.e16;
import l.i0e;
import l.j760;
import l.mqi0;
import l.roj0;
import l.tq;
import l.ura;
import l.vwb;
import l.xdl0;
import l.ytj0;
import l.zvf0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.sq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0697sq implements s7m<C0532eq> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f4165a;

    /* JADX INFO: renamed from: b */
    public VText f4166b;

    /* JADX INFO: renamed from: c */
    public VText f4167c;

    /* JADX INFO: renamed from: d */
    public VText f4168d;

    /* JADX INFO: renamed from: e */
    public VText f4169e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveConfirmAct f4170f;

    /* JADX INFO: renamed from: g */
    public C0532eq f4171g;

    public C0697sq(AccountInactiveConfirmAct accountInactiveConfirmAct) {
        this.f4170f = accountInactiveConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m10687A(String str, View view) {
        ura.e().d().rm(act(), "moment");
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m10688B(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.Z1(act(), act().getString(R.string.p3), a.M("feedback-mobile/form?from=suggest")));
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m10702w(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10703C(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.Z1(act(), act().getString(R.string.p3), a.M("feedback-mobile/form?from=vip_complaint")));
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f4170f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10704E(String str, View view) {
        if (NullChecker.a(CoreModule.c.e0.na()) && NullChecker.a(CoreModule.c.e0.na().settings) && TextUtils.isEmpty(CoreModule.c.e0.na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.c.e0.na().settings.phoneNumber.number)) {
            act().startActivity(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("bind_mobile")));
        } else {
            act().startActivity(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("change-phone")));
        }
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10705F(String str, View view) {
        ura.e().d().rm(act(), "cards");
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10706G(String str, String str2, View view) {
        zvf0.u("e_delete_account_block_delete", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
        m10709J(str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10707H(String str) {
        zvf0.r("e_delete_account_delete_click", "p_delete_account_tips_popup");
        act().startActivity(DeleteAccountInactiveAct.m8460Y1(act(), str, this.f4171g.m9072f0(), this.f4171g.m9073g0()));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10708I() {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: J */
    public void m10709J(final String str) {
        final cwf0 cwf0VarC = i0e.c("p_delete_account_tips_popup", getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active")});
        act().dialog().m830v().m832w(3).m778G0("请注意").m775F("1. 注销账户后，您将永久失去该账户的所有聊天记录、配对、个人资料、动态等，且无法恢复，请谨慎操作。\n2. 您的 VIP 特权、SVIP 特权及服务有效期将作废；您钱包内的剩余余额将作废（包括探探币余额、直播收入等，其中探探币不可提现，您可以进行消费后再注销，或者直接舍弃）；购买的增值服务（包括超级喜欢、超级曝光、闪聊次数等）将作废。\n3. App Store自动续费用户请在iTunes商店内手动取消续费服务，其他自动续费用户将在注销后自动关闭续费服务。").m767B(true).m797V(new DialogInterface.OnDismissListener() { // from class: l.gq
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).m831v0("确定", new Runnable() { // from class: l.hq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2852a.m10707H(str);
            }
        }).m815n0("取消", new Runnable() { // from class: l.iq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2921a.m10708I();
            }
        }).m838z().show();
        i0e.f(cwf0VarC);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10710q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m10710q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tq.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AccountInactiveConfirmAct act() {
        return this.f4170f;
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0532eq c0532eq) {
        this.f4171g = c0532eq;
    }

    /* JADX INFO: renamed from: v */
    public void m10713v(final String str, String str2, final String str3) {
        this.f4165a.setTitle(act().getString(R.string.m0));
        this.f4165a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.fq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2733a.m10702w(view);
            }
        });
        this.f4166b.setText(str2);
        str.getClass();
        switch (str) {
            case "reason_finded_partner_in_true_life":
            case "reason_finded_partner_in_other_platform":
            case "reason_finded_partner_in_tantan":
            case "reason_want_back_to_true_life":
                this.f4167c.setText("在探探，除了心动对象，您也可以从兴趣爱好、工作行业、学术研究等方向出发，找到志同道合的好友；若您对我们的APP有问题，也可以向我们提出宝贵的建议");
                this.f4168d.setText("告诉我们该如何改进");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.nq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3430a.m10688B(str, view);
                    }
                });
                break;
            case "reason_got_no_message":
            case "reason_no_person_i_like_nearby":
            case "reason_got_no_match":
            case "reason_no_people_can_talk_to":
                this.f4167c.setText("除了划卡之外，发表和评论动态也能极大的增加你找到志同道合的人的概率哦。马上去发表动态吧");
                this.f4168d.setText("去广场结识更多好友");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.mq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3321a.m10687A(str, view);
                    }
                });
                break;
            case "reason_no_network_frequently":
            case "reason_too_much_bug":
            case "reason_use_too_much_memory":
            case "reason_hang_seriously":
            case "reason_crash_frequently":
                this.f4167c.setText("若遇到闪退、卡顿、bug等问题，您可以尝试卸载并重新安装APP，也可以告知客服，说明您的情况并截图，客服会马上处理");
                this.f4168d.setText("点此告知客服");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.lq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3241a.m10716z(str, view);
                    }
                });
                break;
            case "reason_account_banned":
            case "reason_matches_disapear":
            case "reason_no_suggested_person_nearby":
            case "reason_suggested_same_person":
                this.f4167c.setText("您可以将您的问题直接汇报给客服，我们会以最快的速度精准定位并修复，无需注销");
                this.f4168d.setText("点此告知客服");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.oq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3548a.m10703C(str, view);
                    }
                });
                break;
            case "reason_custom":
                int iO = (int) (((long) (mqi0.o() - CoreModule.c.e0.p9().createdTime)) / 86400000);
                this.f4166b.setText("更多原因");
                this.f4167c.setText("您已注册探探" + (iO + 1) + "天，再坚持一下就能找到志同道合的好友了。您也可以通过广场、直播等找到自己感兴趣的人。");
                this.f4168d.setText("认识更多好友");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.qq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3970a.m10705F(str, view);
                    }
                });
                break;
            case "reason_match_fraud":
            case "reason_got_person_abuse":
            case "reason_picture_embezzled":
            case "reason_got_harass":
                this.f4167c.setText("若您在使用产品的过程中遇到诈骗、骚扰、盗用、人身攻击等，请点击用户资料页右上角或者告知客服进行举报，举报成功后您可获得特权奖励");
                this.f4168d.setText("点此告知客服");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.jq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3018a.m10714x(str, view);
                    }
                });
                break;
            case "reason_reregister_or_change_phone":
                this.f4167c.setText("您可以在APP内直接更换手机号，无需重新注册");
                this.f4168d.setText("更换手机号");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.pq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3793a.m10704E(str, view);
                    }
                });
                break;
            case "reason_not_want_seen_by_acquaintance":
                this.f4167c.setText("若您允许探探读取了您的通讯录，我们将把您的联系人自动屏蔽掉，你们不会在APP内互相看到对方，您可以随时打开通讯录权限");
                this.f4168d.setText("前往通讯录设置");
                xdl0.E0(this.f4168d, new View.OnClickListener() { // from class: l.kq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3084a.m10715y(str, view);
                    }
                });
                break;
        }
        xdl0.E0(this.f4169e, new View.OnClickListener() { // from class: l.rq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4083a.m10706G(str, str3, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m10714x(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.Z1(act(), act().getString(R.string.p3), a.M("feedback-mobile/form?from=logout_stay")));
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m10715y(String str, View view) {
        if (e16.a(act(), "android.permission.READ_CONTACTS") != 0) {
            try {
                ane0.x(act());
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        } else {
            CoreModule.o.d().Bo(act());
            C0532eq.f2628c.onNext(roj0.a);
        }
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m10716z(String str, View view) {
        act().startActivity(AccessTokenWebViewAct.Z1(act(), act().getString(R.string.p3), a.M("feedback-mobile/form?from=vip_complaint")));
        act().lambda$debugItems$19();
        zvf0.u("e_delete_account_block_jump", act().pageId(), new j760[]{vwb.Y("delete_account_reason_block_page", act().m8448Z1(str))});
        au2.E(Collections.singletonList(new Date()), "feedback", 0L, (ytj0) null);
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
