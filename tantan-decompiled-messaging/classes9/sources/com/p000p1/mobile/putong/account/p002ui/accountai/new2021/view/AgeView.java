package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.lsi0;
import l.t100;
import l.xdl0;
import p006l.djj0;
import p006l.toe;
import p006l.v2c0;
import p006l.wc0;
import v.VButton_FakeShadow;
import v.VEditText;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AgeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f375c;

    /* JADX INFO: renamed from: d */
    public VEditText f376d;

    /* JADX INFO: renamed from: e */
    public VText f377e;

    /* JADX INFO: renamed from: f */
    public VLinear f378f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f379g;

    /* JADX INFO: renamed from: h */
    public boolean f380h;

    /* JADX INFO: renamed from: i */
    public e30<Integer> f381i;

    /* JADX INFO: renamed from: j */
    public e30<Integer> f382j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.AgeView$a */
    public class C0050a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public String f383a = "";

        public C0050a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int iIntValue;
            if (TextUtils.isEmpty(charSequence.toString())) {
                this.f383a = "";
                return;
            }
            try {
                iIntValue = Integer.valueOf(charSequence.toString()).intValue();
            } catch (NumberFormatException e) {
                CrashHelper.c(e);
                iIntValue = 0;
            }
            if (charSequence.toString().equals("0")) {
                AgeView.this.f381i.call(1);
                AgeView.this.f376d.setText("");
                return;
            }
            if (iIntValue < 10 || iIntValue >= 18) {
                if (!TextUtils.equals(this.f383a, charSequence.toString())) {
                    AgeView.this.f381i.call(0);
                }
                this.f383a = charSequence.toString();
                AgeView.this.m343b0();
                return;
            }
            AgeView.this.f376d.setText("1");
            VEditText vEditText = AgeView.this.f376d;
            vEditText.setSelection(vEditText.getText().length());
            AgeView.this.f381i.call(1);
        }
    }

    public AgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m341X() {
        if (this.f380h) {
            return;
        }
        this.f381i.call(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m342Y(View view) {
        if (!m346W(this.f376d.getText().toString())) {
            lsi0.B(getContext().getResources().getString(R$string.f197g), false, true);
            return;
        }
        this.f380h = true;
        if (NullChecker.a(this.f382j)) {
            this.f382j.call(Integer.valueOf(Integer.parseInt(this.f376d.getText().toString())));
        }
        this.f379g.setClickable(false);
        m343b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m343b0() {
        if (m346W(this.f376d.getText().toString()) && this.f379g.isClickable()) {
            this.f379g.setBackgroundResource(v2c0.f23973K1);
        } else {
            this.f379g.setBackgroundResource(v2c0.f24075t1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOrientation(1);
        m344T(LayoutInflater.from(getContext()), this);
        m343b0();
        this.f376d.setHint(R$string.f197g);
        this.f376d.setFilters(new InputFilter[]{new toe(2, new toe.InterfaceC1317a() { // from class: l.uc0
            @Override // p006l.toe.InterfaceC1317a
            /* JADX INFO: renamed from: a */
            public final void mo20531a() {
                this.f23482a.m341X();
            }
        })});
        this.f376d.addTextChangedListener(new C0050a());
        xdl0.E0(this.f379g, new View.OnClickListener() { // from class: l.vc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24251a.m342Y(view);
            }
        });
        if (djj0.m14048f()) {
            xdl0.M(this.f378f, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f375c.getLayoutParams();
            int i = t100.z;
            layoutParams.height = i;
            this.f375c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f379g.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = t100.j;
            this.f379g.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: T */
    public View m344T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wc0.m26350b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public void m345V() {
        this.f379g.setClickable(true);
        this.f380h = false;
        m343b0();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m346W(String str) {
        return str.length() == 2;
    }

    /* JADX INFO: renamed from: Z */
    public void m347Z(Act act) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        this.f376d.requestFocus();
        act.showInput(this.f376d, 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m348a0(e30<Integer> e30Var, e30<Integer> e30Var2) {
        this.f381i = e30Var;
        this.f382j = e30Var2;
    }

    public AgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AgeView(Context context) {
        this(context, null);
    }
}
