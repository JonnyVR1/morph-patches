package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveConfirmAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveDetailItemView;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveMainItemView;
import com.p1.mobile.putong.core.data.InactivateReason;
import com.p1.mobile.putong.core.data.InactivateReasonDetail;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.cq;
import l.j760;
import l.n6c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VCheckBox;
import v.VEditText;
import v.VLinear;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.bq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0499bq implements s7m<C0684rp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f2314a;

    /* JADX INFO: renamed from: b */
    public VText f2315b;

    /* JADX INFO: renamed from: c */
    public VLinear f2316c;

    /* JADX INFO: renamed from: d */
    public VEditText f2317d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f2318e;

    /* JADX INFO: renamed from: f */
    public AccountInactiveAct f2319f;

    /* JADX INFO: renamed from: g */
    public C0684rp f2320g;

    public C0499bq(AccountInactiveAct accountInactiveAct) {
        this.f2319f = accountInactiveAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m8619A(View view) {
        String strM10596g0 = this.f2320g.m10596g0();
        if (this.f2320g.m10597h0() && !TextUtils.isEmpty(this.f2317d.getText().toString().trim())) {
            strM10596g0 = strM10596g0 + "；" + this.f2317d.getText().toString().trim();
        }
        zvf0.u("e_delete_account_specific_reason_submit", "p_delete_account_specific_reason", new j760[]{vwb.Y("delete_account_specific_reason", strM10596g0)});
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        if (!this.f2320g.m10597h0()) {
            inputMethodManager.hideSoftInputFromWindow(this.f2318e.getWindowToken(), 0);
            m8634F();
        } else if (!NullChecker.a(this.f2317d.getText()) || TextUtils.isEmpty(this.f2317d.getText().toString().trim())) {
            lsi0.m9851y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f2318e.getWindowToken(), 0);
            m8634F();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8620a(AccountInactiveDetailItemView accountInactiveDetailItemView, View view) {
        VCheckBox vCheckBox = accountInactiveDetailItemView.f1776a;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m8629y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m8630z(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8631B(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m8632C(InputMethodManager inputMethodManager, View view) {
        zvf0.u("e_delete_account_edit_reason_submit", "p_delete_account_edit_reason", new j760[]{vwb.Y("delete_account_specific_reason", "其他")});
        if (!NullChecker.a(this.f2317d.getText()) || TextUtils.isEmpty(this.f2317d.getText().toString().trim())) {
            lsi0.m9851y("请输入具体原因");
        } else {
            inputMethodManager.hideSoftInputFromWindow(this.f2318e.getWindowToken(), 0);
            m8634F();
        }
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f2319f;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8633E() {
        this.f2317d.requestFocus();
    }

    /* JADX INFO: renamed from: F */
    public void m8634F() {
        String strTrim = (!NullChecker.a(this.f2317d.getText()) || TextUtils.isEmpty(this.f2317d.getText().toString().trim())) ? "" : this.f2317d.getText().toString().trim();
        if (this.f2320g.f4081a.entrySet().iterator().hasNext()) {
            Map.Entry<String, String> next = this.f2320g.f4081a.entrySet().iterator().next();
            act().startActivity(AccountInactiveConfirmAct.m8445Y1(act(), this.f2320g.f4082b, next.getKey(), next.getValue(), strTrim));
            this.f2320g.m10602n0();
        }
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8635l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m8635l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cq.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AccountInactiveAct act() {
        return this.f2319f;
    }

    /* JADX INFO: renamed from: n */
    public final void m8637n(LinearLayout linearLayout, final InactivateReasonDetail inactivateReasonDetail) {
        final AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) act().inflater().inflate(n6c0.n, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveDetailItemView);
        accountInactiveDetailItemView.f1777b.setText(inactivateReasonDetail.name);
        accountInactiveDetailItemView.setOnClickListener(new View.OnClickListener() { // from class: l.zp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0499bq.m8620a(accountInactiveDetailItemView, view);
            }
        });
        accountInactiveDetailItemView.f1776a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.aq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f1882a.m8643w(inactivateReasonDetail, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m8638p(LinearLayout linearLayout, final InactivateReason inactivateReason) {
        AccountInactiveMainItemView accountInactiveMainItemView = (AccountInactiveMainItemView) act().inflater().inflate(n6c0.o, (ViewGroup) linearLayout, false);
        linearLayout.addView(accountInactiveMainItemView);
        accountInactiveMainItemView.f1778a.setText(inactivateReason.name);
        xdl0.E0(accountInactiveMainItemView, new View.OnClickListener() { // from class: l.yp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5447a.m8644x(inactivateReason, view);
            }
        });
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0684rp c0684rp) {
        this.f2320g = c0684rp;
    }

    /* JADX INFO: renamed from: s */
    public void m8640s(InactivateReason inactivateReason) {
        this.f2314a.setTitle(inactivateReason.name);
        this.f2314a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.wp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5047a.m8630z(view);
            }
        });
        act().hideInput();
        this.f2315b.setVisibility(0);
        this.f2315b.setText("请问你离开的具体原因是什么呢？");
        this.f2318e.setVisibility(0);
        this.f2317d.setVisibility(8);
        this.f2316c.setVisibility(0);
        Iterator it = inactivateReason.reasons.iterator();
        while (it.hasNext()) {
            m8637n(this.f2316c, (InactivateReasonDetail) it.next());
        }
        this.f2318e.setEnabled(false);
        xdl0.E0(this.f2318e, new View.OnClickListener() { // from class: l.xp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5358a.m8619A(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m8641u(List<InactivateReason> list) {
        this.f2314a.setTitle(act().getString(R.string.m0));
        this.f2314a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4163a.m8629y(view);
            }
        });
        act().hideInput();
        this.f2315b.setVisibility(0);
        this.f2315b.setText("请问你为什么要离开探探呢？");
        this.f2318e.setVisibility(8);
        this.f2317d.setVisibility(8);
        this.f2316c.setVisibility(0);
        Iterator<InactivateReason> it = list.iterator();
        while (it.hasNext()) {
            m8638p(this.f2316c, it.next());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8642v() {
        this.f2314a.setTitle(act().getString(R.string.t0));
        this.f2314a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4439a.m8631B(view);
            }
        });
        this.f2315b.setVisibility(0);
        this.f2315b.setText("请问你离开的具体原因是什么呢？");
        this.f2318e.setVisibility(0);
        this.f2317d.setVisibility(0);
        this.f2316c.setVisibility(8);
        final InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        this.f2318e.setOnClickListener(new View.OnClickListener() { // from class: l.up
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4930a.m8632C(inputMethodManager, view);
            }
        });
        inputMethodManager.toggleSoftInput(2, 0);
        e51.m9024G(new Runnable() { // from class: l.vp
            @Override // java.lang.Runnable
            public final void run() {
                this.f4989a.m8633E();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8643w(InactivateReasonDetail inactivateReasonDetail, CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.f2316c.getChildCount(); i++) {
                AccountInactiveDetailItemView accountInactiveDetailItemView = (AccountInactiveDetailItemView) this.f2316c.getChildAt(i);
                if (!TextUtils.equals(accountInactiveDetailItemView.f1777b.getText().toString(), inactivateReasonDetail.name)) {
                    accountInactiveDetailItemView.f1776a.setChecked(false);
                }
            }
            this.f2320g.m10595f0(inactivateReasonDetail);
        } else {
            this.f2320g.m10600l0(inactivateReasonDetail);
        }
        boolean zM10598i0 = this.f2320g.m10598i0();
        VButton_FakeShadow vButton_FakeShadow = this.f2318e;
        if (zM10598i0) {
            vButton_FakeShadow.setEnabled(false);
        } else {
            vButton_FakeShadow.setEnabled(true);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) act().getSystemService("input_method");
        boolean zM10597h0 = this.f2320g.m10597h0();
        VEditText vEditText = this.f2317d;
        if (zM10597h0) {
            vEditText.setVisibility(0);
        } else {
            vEditText.setVisibility(8);
            inputMethodManager.hideSoftInputFromWindow(this.f2317d.getWindowToken(), 0);
        }
        if ("reason_custom".equals(inactivateReasonDetail.key) && z) {
            inputMethodManager.toggleSoftInput(2, 0);
            this.f2317d.requestFocus();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8644x(InactivateReason inactivateReason, View view) {
        zvf0.u("e_delete_account_reason_select", "p_delete_account_reason", new j760[]{vwb.Y("delete_account_reason_category", inactivateReason.name)});
        this.f2320g.m10599k0(inactivateReason);
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
