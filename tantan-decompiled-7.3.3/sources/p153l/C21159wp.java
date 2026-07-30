package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.InactivateReason;
import com.p051p1.mobile.putong.core.data.InactivateReasonDetail;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveConfirmAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveDetailItemView;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveMainItemView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p151v.VButton_FakeShadow;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.wp */
/* JADX INFO: loaded from: classes8.dex */
public class C21159wp implements iam<C18666mp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f190204a;

    /* JADX INFO: renamed from: b */
    public VText f190205b;

    /* JADX INFO: renamed from: c */
    public VLinear f190206c;

    /* JADX INFO: renamed from: d */
    public VEditText f190207d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f190208e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveAct f190209f;

    /* JADX INFO: renamed from: g */
    public C18666mp f190210g;

    public C21159wp(AccountInactiveAct accountInactiveAct) {
        this.f190209f = accountInactiveAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m207362A(View view) {
        String strM159330g0 = this.f190210g.m159330g0();
        if (this.f190210g.m159331h0() && !TextUtils.isEmpty(this.f190207d.getText().toString().trim())) {
            strM159330g0 = strM159330g0 + "；" + this.f190207d.getText().toString().trim();
        }
        i4g0.m138523u("e_delete_account_specific_reason_submit", "p_delete_account_specific_reason", jyb.m147494Y("delete_account_specific_reason", strM159330g0));
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        if (!this.f190210g.m159331h0()) {
            inputMethodManager.hideSoftInputFromWindow(this.f190208e.getWindowToken(), 0);
            m207377F();
        } else if (!NullChecker.m82486a(this.f190207d.getText()) || TextUtils.isEmpty(this.f190207d.getText().toString().trim())) {
            o1j0.m165651y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f190208e.getWindowToken(), 0);
            m207377F();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m207363a(AccountInactiveDetailItemView accountInactiveDetailItemView, View view) {
        VCheckBox vCheckBox = accountInactiveDetailItemView.f29053a;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m207372y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m207373z(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m207374B(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m207375C(InputMethodManager inputMethodManager, View view) {
        i4g0.m138523u("e_delete_account_edit_reason_submit", "p_delete_account_edit_reason", jyb.m147494Y("delete_account_specific_reason", "其他"));
        if (!NullChecker.m82486a(this.f190207d.getText()) || TextUtils.isEmpty(this.f190207d.getText().toString().trim())) {
            o1j0.m165651y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f190208e.getWindowToken(), 0);
            m207377F();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f190209f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m207376E() {
        this.f190207d.requestFocus();
    }

    /* JADX INFO: renamed from: F */
    public void m207377F() {
        String strTrim = (!NullChecker.m82486a(this.f190207d.getText()) || TextUtils.isEmpty(this.f190207d.getText().toString().trim())) ? "" : this.f190207d.getText().toString().trim();
        if (this.f190210g.f137860a.entrySet().iterator().hasNext()) {
            Map.Entry<String, String> next = this.f190210g.f137860a.entrySet().iterator().next();
            act().startActivity(AccountInactiveConfirmAct.m45288Z1(act(), this.f190210g.f137861b, next.getKey(), next.getValue(), strTrim));
            this.f190210g.m159336n0();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m207378l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m207378l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21402xp.m212489b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AccountInactiveAct act() {
        return this.f190209f;
    }

    /* JADX INFO: renamed from: n */
    public final void m207380n(LinearLayout linearLayout, final InactivateReasonDetail inactivateReasonDetail) {
        final AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) act().inflater().inflate(sec0.f167580n, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveDetailItemView);
        accountInactiveDetailItemView.f29054b.setText(inactivateReasonDetail.name);
        accountInactiveDetailItemView.setOnClickListener(new View.OnClickListener() { // from class: l.up
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21159wp.m207363a(accountInactiveDetailItemView, view);
            }
        });
        accountInactiveDetailItemView.f29053a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f185194a.m207386w(inactivateReasonDetail, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m207381p(LinearLayout linearLayout, final InactivateReason inactivateReason) {
        AccountInactiveMainItemView accountInactiveMainItemView = (AccountInactiveMainItemView) act().inflater().inflate(sec0.f167582o, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveMainItemView);
        accountInactiveMainItemView.f29055a.setText(inactivateReason.name);
        bnl0.m105509E0(accountInactiveMainItemView, new View.OnClickListener() { // from class: l.tp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175525a.m207387x(inactivateReason, view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C18666mp c18666mp) {
        this.f190210g = c18666mp;
    }

    /* JADX INFO: renamed from: s */
    public void m207383s(InactivateReason inactivateReason) {
        this.f190204a.setTitle(inactivateReason.name);
        this.f190204a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164288a.m207373z(view);
            }
        });
        act().hideInput();
        this.f190205b.setVisibility(0);
        this.f190205b.setText("请问你离开的具体原因是什么呢？");
        this.f190208e.setVisibility(0);
        this.f190207d.setVisibility(8);
        this.f190206c.setVisibility(0);
        Iterator<InactivateReasonDetail> it = inactivateReason.reasons.iterator();
        while (it.hasNext()) {
            m207380n(this.f190206c, it.next());
        }
        this.f190208e.setEnabled(false);
        bnl0.m105509E0(this.f190208e, new View.OnClickListener() { // from class: l.sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169990a.m207362A(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m207384u(List<InactivateReason> list) {
        this.f190204a.setTitle(act().getString(R$string.f28736m0));
        this.f190204a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.np
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143061a.m207372y(view);
            }
        });
        act().hideInput();
        this.f190205b.setVisibility(0);
        this.f190205b.setText("请问你为什么要离开探探呢？");
        this.f190208e.setVisibility(8);
        this.f190207d.setVisibility(8);
        this.f190206c.setVisibility(0);
        Iterator<InactivateReason> it = list.iterator();
        while (it.hasNext()) {
            m207381p(this.f190206c, it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m207385v() {
        this.f190204a.setTitle(act().getString(R$string.f28778t0));
        this.f190204a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.op
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148403a.m207374B(view);
            }
        });
        this.f190205b.setVisibility(0);
        this.f190205b.setText("请问你离开的具体原因是什么呢？");
        this.f190208e.setVisibility(0);
        this.f190207d.setVisibility(0);
        this.f190206c.setVisibility(8);
        final InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        this.f190208e.setOnClickListener(new View.OnClickListener() { // from class: l.pp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153442a.m207375C(inputMethodManager, view);
            }
        });
        inputMethodManager.toggleSoftInput(2, 0);
        l51.m152887G(new Runnable() { // from class: l.qp
            @Override // java.lang.Runnable
            public final void run() {
                this.f158799a.m207376E();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m207386w(InactivateReasonDetail inactivateReasonDetail, CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.f190206c.getChildCount(); i++) {
                AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) this.f190206c.getChildAt(i);
                if (!TextUtils.equals(accountInactiveDetailItemView.f29054b.getText().toString(), inactivateReasonDetail.name)) {
                    accountInactiveDetailItemView.f29053a.setChecked(false);
                }
            }
            this.f190210g.m159329f0(inactivateReasonDetail);
        } else {
            this.f190210g.m159334l0(inactivateReasonDetail);
        }
        boolean zM159332i0 = this.f190210g.m159332i0();
        VButton_FakeShadow vButton_FakeShadow = this.f190208e;
        if (zM159332i0) {
            vButton_FakeShadow.setEnabled(false);
        } else {
            vButton_FakeShadow.setEnabled(true);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        boolean zM159331h0 = this.f190210g.m159331h0();
        VEditText vEditText = this.f190207d;
        if (zM159331h0) {
            vEditText.setVisibility(0);
        } else {
            vEditText.setVisibility(8);
            inputMethodManager.hideSoftInputFromWindow(this.f190207d.getWindowToken(), 0);
        }
        if ("reason_custom".equals(inactivateReasonDetail.key) && z) {
            inputMethodManager.toggleSoftInput(2, 0);
            this.f190207d.requestFocus();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m207387x(InactivateReason inactivateReason, View view) {
        i4g0.m138523u("e_delete_account_reason_select", "p_delete_account_reason", jyb.m147494Y("delete_account_reason_category", inactivateReason.name));
        this.f190210g.m159333k0(inactivateReason);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
