package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.InactivateReason;
import com.p046p1.mobile.putong.core.data.InactivateReasonDetail;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveConfirmAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveDetailItemView;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveMainItemView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p147v.VButton_FakeShadow;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.bq */
/* JADX INFO: loaded from: classes8.dex */
public class C15940bq implements s7m<C19746rp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f76736a;

    /* JADX INFO: renamed from: b */
    public VText f76737b;

    /* JADX INFO: renamed from: c */
    public VLinear f76738c;

    /* JADX INFO: renamed from: d */
    public VEditText f76739d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f76740e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveAct f76741f;

    /* JADX INFO: renamed from: g */
    public C19746rp f76742g;

    public C15940bq(AccountInactiveAct accountInactiveAct) {
        this.f76741f = accountInactiveAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m103278A(View view) {
        String strM180279g0 = this.f76742g.m180279g0();
        if (this.f76742g.m180280h0() && !TextUtils.isEmpty(this.f76739d.getText().toString().trim())) {
            strM180279g0 = strM180279g0 + "；" + this.f76739d.getText().toString().trim();
        }
        zvf0.m220399u("e_delete_account_specific_reason_submit", "p_delete_account_specific_reason", vwb.m200311Y("delete_account_specific_reason", strM180279g0));
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        if (!this.f76742g.m180280h0()) {
            inputMethodManager.hideSoftInputFromWindow(this.f76740e.getWindowToken(), 0);
            m103293F();
        } else if (!NullChecker.m81303a(this.f76739d.getText()) || TextUtils.isEmpty(this.f76739d.getText().toString().trim())) {
            lsi0.m151595y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f76740e.getWindowToken(), 0);
            m103293F();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103279a(AccountInactiveDetailItemView accountInactiveDetailItemView, View view) {
        VCheckBox vCheckBox = accountInactiveDetailItemView.f28205a;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m103288y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m103289z(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m103290B(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m103291C(InputMethodManager inputMethodManager, View view) {
        zvf0.m220399u("e_delete_account_edit_reason_submit", "p_delete_account_edit_reason", vwb.m200311Y("delete_account_specific_reason", "其他"));
        if (!NullChecker.m81303a(this.f76739d.getText()) || TextUtils.isEmpty(this.f76739d.getText().toString().trim())) {
            lsi0.m151595y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f76740e.getWindowToken(), 0);
            m103293F();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76741f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m103292E() {
        this.f76739d.requestFocus();
    }

    /* JADX INFO: renamed from: F */
    public void m103293F() {
        String strTrim = (!NullChecker.m81303a(this.f76739d.getText()) || TextUtils.isEmpty(this.f76739d.getText().toString().trim())) ? "" : this.f76739d.getText().toString().trim();
        if (this.f76742g.f160461a.entrySet().iterator().hasNext()) {
            Map.Entry<String, String> next = this.f76742g.f160461a.entrySet().iterator().next();
            act().startActivity(AccountInactiveConfirmAct.m44105Y1(act(), this.f76742g.f160462b, next.getKey(), next.getValue(), strTrim));
            this.f76742g.m180285n0();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103294l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m103294l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16209cq.m108209b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AccountInactiveAct act() {
        return this.f76741f;
    }

    /* JADX INFO: renamed from: n */
    public final void m103296n(LinearLayout linearLayout, final InactivateReasonDetail inactivateReasonDetail) {
        final AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) act().inflater().inflate(n6c0.f137366n, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveDetailItemView);
        accountInactiveDetailItemView.f28206b.setText(inactivateReasonDetail.name);
        accountInactiveDetailItemView.setOnClickListener(new View.OnClickListener() { // from class: l.zp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15940bq.m103279a(accountInactiveDetailItemView, view);
            }
        });
        accountInactiveDetailItemView.f28205a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.aq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f71095a.m103302w(inactivateReasonDetail, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m103297p(LinearLayout linearLayout, final InactivateReason inactivateReason) {
        AccountInactiveMainItemView accountInactiveMainItemView = (AccountInactiveMainItemView) act().inflater().inflate(n6c0.f137368o, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveMainItemView);
        accountInactiveMainItemView.f28207a.setText(inactivateReason.name);
        xdl0.m208329E0(accountInactiveMainItemView, new View.OnClickListener() { // from class: l.yp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199373a.m103303x(inactivateReason, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C19746rp c19746rp) {
        this.f76742g = c19746rp;
    }

    /* JADX INFO: renamed from: s */
    public void m103299s(InactivateReason inactivateReason) {
        this.f76736a.setTitle(inactivateReason.name);
        this.f76736a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.wp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187477a.m103289z(view);
            }
        });
        act().hideInput();
        this.f76737b.setVisibility(0);
        this.f76737b.setText("请问你离开的具体原因是什么呢？");
        this.f76740e.setVisibility(0);
        this.f76739d.setVisibility(8);
        this.f76738c.setVisibility(0);
        Iterator<InactivateReasonDetail> it = inactivateReason.reasons.iterator();
        while (it.hasNext()) {
            m103296n(this.f76738c, it.next());
        }
        this.f76740e.setEnabled(false);
        xdl0.m208329E0(this.f76740e, new View.OnClickListener() { // from class: l.xp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193892a.m103278A(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m103300u(List<InactivateReason> list) {
        this.f76736a.setTitle(act().getString(R$string.f27888m0));
        this.f76736a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165738a.m103288y(view);
            }
        });
        act().hideInput();
        this.f76737b.setVisibility(0);
        this.f76737b.setText("请问你为什么要离开探探呢？");
        this.f76740e.setVisibility(8);
        this.f76739d.setVisibility(8);
        this.f76738c.setVisibility(0);
        Iterator<InactivateReason> it = list.iterator();
        while (it.hasNext()) {
            m103297p(this.f76738c, it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m103301v() {
        this.f76736a.setTitle(act().getString(R$string.f27930t0));
        this.f76736a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171424a.m103290B(view);
            }
        });
        this.f76737b.setVisibility(0);
        this.f76737b.setText("请问你离开的具体原因是什么呢？");
        this.f76740e.setVisibility(0);
        this.f76739d.setVisibility(0);
        this.f76738c.setVisibility(8);
        final InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        this.f76740e.setOnClickListener(new View.OnClickListener() { // from class: l.up
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177558a.m103291C(inputMethodManager, view);
            }
        });
        inputMethodManager.toggleSoftInput(2, 0);
        e51.m114742G(new Runnable() { // from class: l.vp
            @Override // java.lang.Runnable
            public final void run() {
                this.f182439a.m103292E();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m103302w(InactivateReasonDetail inactivateReasonDetail, CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.f76738c.getChildCount(); i++) {
                AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) this.f76738c.getChildAt(i);
                if (!TextUtils.equals(accountInactiveDetailItemView.f28206b.getText().toString(), inactivateReasonDetail.name)) {
                    accountInactiveDetailItemView.f28205a.setChecked(false);
                }
            }
            this.f76742g.m180278f0(inactivateReasonDetail);
        } else {
            this.f76742g.m180283l0(inactivateReasonDetail);
        }
        boolean zM180281i0 = this.f76742g.m180281i0();
        VButton_FakeShadow vButton_FakeShadow = this.f76740e;
        if (zM180281i0) {
            vButton_FakeShadow.setEnabled(false);
        } else {
            vButton_FakeShadow.setEnabled(true);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        boolean zM180280h0 = this.f76742g.m180280h0();
        VEditText vEditText = this.f76739d;
        if (zM180280h0) {
            vEditText.setVisibility(0);
        } else {
            vEditText.setVisibility(8);
            inputMethodManager.hideSoftInputFromWindow(this.f76739d.getWindowToken(), 0);
        }
        if ("reason_custom".equals(inactivateReasonDetail.key) && z) {
            inputMethodManager.toggleSoftInput(2, 0);
            this.f76739d.requestFocus();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m103303x(InactivateReason inactivateReason, View view) {
        zvf0.m220399u("e_delete_account_reason_select", "p_delete_account_reason", vwb.m200311Y("delete_account_reason_category", inactivateReason.name));
        this.f76742g.m180282k0(inactivateReason);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
