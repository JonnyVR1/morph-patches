package p007l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountProtocolAct;
import com.p1.mobile.putong.core.data.ProtocolItemBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.bv;
import l.cjj0;
import l.d30;
import l.eqh0;
import l.j760;
import l.xdl0;
import l.yk5;
import l.zvf0;
import v.VButton;
import v.VCheckBox;
import v.VLinear;
import v.VRecyclerView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.av */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0494av implements s7m<C0737uu> {

    /* JADX INFO: renamed from: a */
    public VRelative f1888a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f1889b;

    /* JADX INFO: renamed from: c */
    public VText f1890c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f1891d;

    /* JADX INFO: renamed from: e */
    public VLinear f1892e;

    /* JADX INFO: renamed from: f */
    public VLinear f1893f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f1894g;

    /* JADX INFO: renamed from: h */
    public TextView f1895h;

    /* JADX INFO: renamed from: i */
    public VButton f1896i;

    /* JADX INFO: renamed from: j */
    public VText f1897j;

    /* JADX INFO: renamed from: k */
    public AccountProtocolAct f1898k;

    /* JADX INFO: renamed from: l */
    public C0548fv f1899l;

    /* JADX INFO: renamed from: m */
    public yk5 f1900m;

    /* JADX INFO: renamed from: l.av$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.v("e_delete_account_interact_block_button", C0494av.this.act().pageId(), new j760[]{new j760("select_click_type", "policy")});
            C0494av.this.f1894g.setChecked(true);
            C0494av.this.f1900m.dismiss();
        }
    }

    public C0494av(AccountProtocolAct accountProtocolAct) {
        this.f1898k = accountProtocolAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m8590m(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m8591n() {
        this.f1900m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m8592p(View view) {
        zvf0.v("e_delete_account_interact_block_button", act().pageId(), new j760[]{new j760("select_click_type", "policy")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m8593q(View view) {
        zvf0.r("e_delete_account_interact_block_cancel", act().pageId());
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m8594s(View view) {
        zvf0.r("e_delete_account_interact_block_confirm", act().pageId());
        if (!m8598l() || !this.f1894g.isChecked()) {
            lsi0.m9851y("请确认并勾选全部注销条件");
        } else {
            act().startActivity(AccountInactiveAct.m8439Y1(act(), 0));
            act().lambda$debugItems$19();
        }
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f1898k;
    }

    /* JADX INFO: renamed from: i */
    public View m8595i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bv.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8595i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m8597k() {
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
        this.f1899l.m9172H(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public boolean m8598l() {
        if (!NullChecker.a(this.f1899l.m9167C())) {
            return false;
        }
        Iterator<ProtocolItemBean> it = this.f1899l.m9167C().iterator();
        while (it.hasNext()) {
            if (!it.next().isCheck) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m8599r() {
        zvf0.x("e_delete_account_interact_block_confirm", act().pageId());
        this.f1889b.setTitle("注销账号");
        this.f1889b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.vu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4992a.m8590m(view);
            }
        });
        this.f1891d.setLayoutManager(new LinearLayoutManager(act()));
        this.f1899l = new C0548fv(act());
        m8597k();
        this.f1891d.setAdapter(this.f1899l);
        yk5 yk5Var = new yk5(act(), 5);
        this.f1900m = yk5Var;
        yk5Var.D(new a());
        cjj0.a(this.f1895h, "《探探注销账户须知》", Color.parseColor("#4c000000"), new d30() { // from class: l.wu
            public final void call() {
                this.f5051a.m8591n();
            }
        });
        this.f1895h.setTypeface(eqh0.c(3), 1);
        xdl0.E0(this.f1894g, new View.OnClickListener() { // from class: l.xu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5362a.m8592p(view);
            }
        });
        xdl0.E0(this.f1896i, new View.OnClickListener() { // from class: l.yu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5463a.m8593q(view);
            }
        });
        xdl0.E0(this.f1897j, new View.OnClickListener() { // from class: l.zu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5542a.m8594s(view);
            }
        });
    }

    @Override // p007l.s7m
    public void destroy() {
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0737uu c0737uu) {
    }
}
