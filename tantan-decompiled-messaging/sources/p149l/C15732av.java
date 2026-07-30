package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.data.ProtocolItemBean;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountProtocolAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.av */
/* JADX INFO: loaded from: classes8.dex */
public class C15732av implements s7m<C20513uu> {

    /* JADX INFO: renamed from: a */
    public VRelative f71875a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f71876b;

    /* JADX INFO: renamed from: c */
    public VText f71877c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f71878d;

    /* JADX INFO: renamed from: e */
    public VLinear f71879e;

    /* JADX INFO: renamed from: f */
    public VLinear f71880f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f71881g;

    /* JADX INFO: renamed from: h */
    public TextView f71882h;

    /* JADX INFO: renamed from: i */
    public VButton f71883i;

    /* JADX INFO: renamed from: j */
    public VText f71884j;

    /* JADX INFO: renamed from: k */
    public AccountProtocolAct f71885k;

    /* JADX INFO: renamed from: l */
    public C16923fv f71886l;

    /* JADX INFO: renamed from: m */
    public yk5 f71887m;

    /* JADX INFO: renamed from: l.av$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220400v("e_delete_account_interact_block_button", C15732av.this.act().pageId(), new j760("select_click_type", "policy"));
            C15732av.this.f71881g.setChecked(true);
            C15732av.this.f71887m.dismiss();
        }
    }

    public C15732av(AccountProtocolAct accountProtocolAct) {
        this.f71885k = accountProtocolAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m99102m(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m99103n() {
        this.f71887m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m99104p(View view) {
        zvf0.m220400v("e_delete_account_interact_block_button", act().pageId(), new j760("select_click_type", "policy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m99105q(View view) {
        zvf0.m220396r("e_delete_account_interact_block_cancel", act().pageId());
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m99106s(View view) {
        zvf0.m220396r("e_delete_account_interact_block_confirm", act().pageId());
        if (!m99110l() || !this.f71881g.isChecked()) {
            lsi0.m151595y("请确认并勾选全部注销条件");
        } else {
            act().startActivity(AccountInactiveAct.m44101Y1(act(), 0));
            act().m66873d2();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f71885k;
    }

    /* JADX INFO: renamed from: i */
    public View m99107i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15978bv.m104007b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m99107i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m99109k() {
        ArrayList arrayList = new ArrayList();
        ProtocolItemBean protocolItemBean = new ProtocolItemBean();
        protocolItemBean.title = "账号内钱包结清";
        protocolItemBean.tip = "通过使用探探服务获得的资产或虚拟权益等财产性利益（包括不限于探探钱包余额、直播收益、虚拟礼物收益等），您可以选择提现后进行注销或同意放弃后进行注销。其中探探币不可提现，您可以进行消费后再进行注销，如直接注销则视为您同意放弃，将无法继续使用";
        protocolItemBean.isCheck = false;
        protocolItemBean.isShow = false;
        arrayList.add(protocolItemBean);
        ProtocolItemBean protocolItemBean2 = new ProtocolItemBean();
        protocolItemBean2.title = "会员服务结清";
        protocolItemBean2.tip = "您的VIP特权、SVIP特权及服务（包括尚未使用完毕的超级喜欢、优先推荐、闪聊次数等增值服务）有效期将作废";
        protocolItemBean2.isCheck = false;
        protocolItemBean2.isShow = false;
        arrayList.add(protocolItemBean2);
        ProtocolItemBean protocolItemBean3 = new ProtocolItemBean();
        protocolItemBean3.title = "相关信息资产";
        protocolItemBean3.tip = "注销账户后，您将永远失去该账户的所有聊天记录、配对信息、个人资料、动态、财富等级、获赠礼物、账单记录、红包记录等，且无法恢复，请谨慎操作";
        protocolItemBean3.isCheck = false;
        protocolItemBean3.isShow = false;
        arrayList.add(protocolItemBean3);
        ProtocolItemBean protocolItemBean4 = new ProtocolItemBean();
        protocolItemBean4.title = "自动订阅服务和自动续费";
        protocolItemBean4.tip = "App Store自动续费用户请在iTunes商店内手动取消续费服务，其他自动续费用户将在注销后自动关闭续费服务";
        protocolItemBean4.isCheck = false;
        protocolItemBean4.isShow = false;
        arrayList.add(protocolItemBean4);
        ProtocolItemBean protocolItemBean5 = new ProtocolItemBean();
        protocolItemBean5.title = "安全风险审核";
        protocolItemBean5.tip = "账号处于正常使用状态，30天内无异常登录/修改密码操作，账号无未处理完的投诉/举报";
        protocolItemBean5.isCheck = false;
        protocolItemBean5.isShow = false;
        arrayList.add(protocolItemBean5);
        this.f71886l.m123248H(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public boolean m99110l() {
        if (!NullChecker.m81303a(this.f71886l.m123243C())) {
            return false;
        }
        Iterator<ProtocolItemBean> it = this.f71886l.m123243C().iterator();
        while (it.hasNext()) {
            if (!it.next().isCheck) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m99111r() {
        zvf0.m220402x("e_delete_account_interact_block_confirm", act().pageId());
        this.f71876b.setTitle("注销账号");
        this.f71876b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.vu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183019a.m99102m(view);
            }
        });
        this.f71878d.setLayoutManager(new LinearLayoutManager(act()));
        this.f71886l = new C16923fv(act());
        m99109k();
        this.f71878d.setAdapter(this.f71886l);
        yk5 yk5Var = new yk5(act(), 5);
        this.f71887m = yk5Var;
        yk5Var.m215118D(new a());
        cjj0.m107173a(this.f71882h, "《探探注销账户须知》", Color.parseColor("#4c000000"), new d30() { // from class: l.wu
            @Override // p149l.d30
            public final void call() {
                this.f188070a.m99103n();
            }
        });
        this.f71882h.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f71881g, new View.OnClickListener() { // from class: l.xu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194459a.m99104p(view);
            }
        });
        xdl0.m208329E0(this.f71883i, new View.OnClickListener() { // from class: l.yu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200037a.m99105q(view);
            }
        });
        xdl0.m208329E0(this.f71884j, new View.OnClickListener() { // from class: l.zu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204787a.m99106s(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C20513uu c20513uu) {
    }
}
