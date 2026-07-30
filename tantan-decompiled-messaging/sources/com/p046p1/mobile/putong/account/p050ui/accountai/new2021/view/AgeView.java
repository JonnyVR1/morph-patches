package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.djj0;
import p149l.e30;
import p149l.lsi0;
import p149l.t100;
import p149l.toe;
import p149l.v2c0;
import p149l.wc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AgeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f16386c;

    /* JADX INFO: renamed from: d */
    public VEditText f16387d;

    /* JADX INFO: renamed from: e */
    public VText f16388e;

    /* JADX INFO: renamed from: f */
    public VLinear f16389f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f16390g;

    /* JADX INFO: renamed from: h */
    public boolean f16391h;

    /* JADX INFO: renamed from: i */
    public e30<Integer> f16392i;

    /* JADX INFO: renamed from: j */
    public e30<Integer> f16393j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.AgeView$a */
    public class C4624a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public String f16394a = "";

        public C4624a() {
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
                this.f16394a = "";
                return;
            }
            try {
                iIntValue = Integer.valueOf(charSequence.toString()).intValue();
            } catch (NumberFormatException e) {
                CrashHelper.m81296c(e);
                iIntValue = 0;
            }
            if (charSequence.toString().equals("0")) {
                AgeView.this.f16392i.call(1);
                AgeView.this.f16387d.setText("");
                return;
            }
            if (iIntValue < 10 || iIntValue >= 18) {
                if (!TextUtils.equals(this.f16394a, charSequence.toString())) {
                    AgeView.this.f16392i.call(0);
                }
                this.f16394a = charSequence.toString();
                AgeView.this.m28447b0();
                return;
            }
            AgeView.this.f16387d.setText("1");
            VEditText vEditText = AgeView.this.f16387d;
            vEditText.setSelection(vEditText.getText().length());
            AgeView.this.f16392i.call(1);
        }
    }

    public AgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m28445X() {
        if (this.f16391h) {
            return;
        }
        this.f16392i.call(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m28446Y(View view) {
        if (!m28450W(this.f16387d.getText().toString())) {
            lsi0.m151564B(getContext().getResources().getString(R$string.f16208g), false, true);
            return;
        }
        this.f16391h = true;
        if (NullChecker.m81303a(this.f16393j)) {
            this.f16393j.call(Integer.valueOf(Integer.parseInt(this.f16387d.getText().toString())));
        }
        this.f16390g.setClickable(false);
        m28447b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m28447b0() {
        if (m28450W(this.f16387d.getText().toString()) && this.f16390g.isClickable()) {
            this.f16390g.setBackgroundResource(v2c0.f179409K1);
        } else {
            this.f16390g.setBackgroundResource(v2c0.f179511t1);
        }
    }

    private void init() {
        setOrientation(1);
        m28448T(LayoutInflater.from(getContext()), this);
        m28447b0();
        this.f16387d.setHint(R$string.f16208g);
        this.f16387d.setFilters(new InputFilter[]{new toe(2, new toe.InterfaceC20221a() { // from class: l.uc0
            @Override // p149l.toe.InterfaceC20221a
            /* JADX INFO: renamed from: a */
            public final void mo163655a() {
                this.f175780a.m28445X();
            }
        })});
        this.f16387d.addTextChangedListener(new C4624a());
        xdl0.m208329E0(this.f16390g, new View.OnClickListener() { // from class: l.vc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180899a.m28446Y(view);
            }
        });
        if (djj0.m112085f()) {
            xdl0.m208344M(this.f16389f, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16386c.getLayoutParams();
            int i = t100.f167277z;
            layoutParams.height = i;
            this.f16386c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f16390g.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = t100.f167261j;
            this.f16390g.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: T */
    public View m28448T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wc0.m202589b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public void m28449V() {
        this.f16390g.setClickable(true);
        this.f16391h = false;
        m28447b0();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m28450W(String str) {
        return str.length() == 2;
    }

    /* JADX INFO: renamed from: Z */
    public void m28451Z(Act act) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        this.f16387d.requestFocus();
        act.showInput(this.f16387d, 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m28452a0(e30<Integer> e30Var, e30<Integer> e30Var2) {
        this.f16392i = e30Var;
        this.f16393j = e30Var2;
    }

    public AgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AgeView(Context context) {
        this(context, null);
    }
}
