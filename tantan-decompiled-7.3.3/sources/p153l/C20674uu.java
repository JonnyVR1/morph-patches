package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.data.ProtocolItemBean;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountProtocolAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.uu */
/* JADX INFO: loaded from: classes9.dex */
public class C20674uu implements iam<C19214ou> {

    /* JADX INFO: renamed from: a */
    public VRelative f181011a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f181012b;

    /* JADX INFO: renamed from: c */
    public VText f181013c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f181014d;

    /* JADX INFO: renamed from: e */
    public VLinear f181015e;

    /* JADX INFO: renamed from: f */
    public VLinear f181016f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f181017g;

    /* JADX INFO: renamed from: h */
    public TextView f181018h;

    /* JADX INFO: renamed from: i */
    public VButton f181019i;

    /* JADX INFO: renamed from: j */
    public VText f181020j;

    /* JADX INFO: renamed from: k */
    public AccountProtocolAct f181021k;

    /* JADX INFO: renamed from: l */
    public C21897zu f181022l;

    /* JADX INFO: renamed from: m */
    public bm5 f181023m;

    /* JADX INFO: renamed from: l.uu$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138524v("e_delete_account_interact_block_button", C20674uu.this.act().pageId(), new pf60("select_click_type", "policy"));
            C20674uu.this.f181017g.setChecked(true);
            C20674uu.this.f181023m.dismiss();
        }
    }

    public C20674uu(AccountProtocolAct accountProtocolAct) {
        this.f181021k = accountProtocolAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m198122m(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m198123n() {
        this.f181023m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m198124p(View view) {
        i4g0.m138524v("e_delete_account_interact_block_button", act().pageId(), new pf60("select_click_type", "policy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m198125q(View view) {
        i4g0.m138520r("e_delete_account_interact_block_cancel", act().pageId());
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m198126s(View view) {
        i4g0.m138520r("e_delete_account_interact_block_confirm", act().pageId());
        if (!m198130l() || !this.f181017g.isChecked()) {
            o1j0.m165651y("请确认并勾选全部注销条件");
        } else {
            act().startActivity(AccountInactiveAct.m45284Z1(act(), 0));
            act().m68056e2();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f181021k;
    }

    /* JADX INFO: renamed from: i */
    public View m198127i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20934vu.m202769b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198127i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m198129k() {
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
        this.f181022l.m221589H(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public boolean m198130l() {
        if (!NullChecker.m82486a(this.f181022l.m221584C())) {
            return false;
        }
        Iterator<ProtocolItemBean> it = this.f181022l.m221584C().iterator();
        while (it.hasNext()) {
            if (!it.next().isCheck) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m198131r() {
        i4g0.m138526x("e_delete_account_interact_block_confirm", act().pageId());
        this.f181012b.setTitle("注销账号");
        this.f181012b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154131a.m198122m(view);
            }
        });
        this.f181014d.setLayoutManager(new LinearLayoutManager(act()));
        this.f181022l = new C21897zu(act());
        m198129k();
        this.f181014d.setAdapter(this.f181022l);
        bm5 bm5Var = new bm5(act(), 5);
        this.f181023m = bm5Var;
        bm5Var.m104999D(new a());
        fsj0.m127199a(this.f181018h, "《探探注销账户须知》", Color.parseColor("#4c000000"), new x20() { // from class: l.qu
            @Override // p153l.x20
            public final void call() {
                this.f159502a.m198123n();
            }
        });
        this.f181018h.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f181017g, new View.OnClickListener() { // from class: l.ru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164887a.m198124p(view);
            }
        });
        bnl0.m105509E0(this.f181019i, new View.OnClickListener() { // from class: l.su
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170631a.m198125q(view);
            }
        });
        bnl0.m105509E0(this.f181020j, new View.OnClickListener() { // from class: l.tu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176124a.m198126s(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C19214ou c19214ou) {
    }
}
