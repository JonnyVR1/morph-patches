package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bbc0;
import p153l.bnl0;
import p153l.gsj0;
import p153l.o1j0;
import p153l.qa00;
import p153l.sc0;
import p153l.xpe;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AgeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f17105c;

    /* JADX INFO: renamed from: d */
    public VEditText f17106d;

    /* JADX INFO: renamed from: e */
    public VText f17107e;

    /* JADX INFO: renamed from: f */
    public VLinear f17108f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f17109g;

    /* JADX INFO: renamed from: h */
    public boolean f17110h;

    /* JADX INFO: renamed from: i */
    public y20<Integer> f17111i;

    /* JADX INFO: renamed from: j */
    public y20<Integer> f17112j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountai.new2021.view.AgeView$a */
    public class C4775a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public String f17113a = "";

        public C4775a() {
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
                this.f17113a = "";
                return;
            }
            try {
                iIntValue = Integer.valueOf(charSequence.toString()).intValue();
            } catch (NumberFormatException e) {
                CrashHelper.m82479c(e);
                iIntValue = 0;
            }
            if (charSequence.toString().equals("0")) {
                AgeView.this.f17111i.call(1);
                AgeView.this.f17106d.setText("");
                return;
            }
            if (iIntValue < 10 || iIntValue >= 18) {
                if (!TextUtils.equals(this.f17113a, charSequence.toString())) {
                    AgeView.this.f17111i.call(0);
                }
                this.f17113a = charSequence.toString();
                AgeView.this.m29446b0();
                return;
            }
            AgeView.this.f17106d.setText("1");
            VEditText vEditText = AgeView.this.f17106d;
            vEditText.setSelection(vEditText.getText().length());
            AgeView.this.f17111i.call(1);
        }
    }

    public AgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m29444X() {
        if (this.f17110h) {
            return;
        }
        this.f17111i.call(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m29445Y(View view) {
        if (!m29449W(this.f17106d.getText().toString())) {
            o1j0.m165620B(getContext().getResources().getString(R$string.f16927g), false, true);
            return;
        }
        this.f17110h = true;
        if (NullChecker.m82486a(this.f17112j)) {
            this.f17112j.call(Integer.valueOf(Integer.parseInt(this.f17106d.getText().toString())));
        }
        this.f17109g.setClickable(false);
        m29446b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m29446b0() {
        if (m29449W(this.f17106d.getText().toString()) && this.f17109g.isClickable()) {
            this.f17109g.setBackgroundResource(bbc0.f75815K1);
        } else {
            this.f17109g.setBackgroundResource(bbc0.f75917t1);
        }
    }

    private void init() {
        setOrientation(1);
        m29447T(LayoutInflater.from(getContext()), this);
        m29446b0();
        this.f17106d.setHint(R$string.f16927g);
        this.f17106d.setFilters(new InputFilter[]{new xpe(2, new xpe.InterfaceC21405a() { // from class: l.qc0
            @Override // p153l.xpe.InterfaceC21405a
            /* JADX INFO: renamed from: a */
            public final void mo115213a() {
                this.f156528a.m29444X();
            }
        })});
        this.f17106d.addTextChangedListener(new C4775a());
        bnl0.m105509E0(this.f17109g, new View.OnClickListener() { // from class: l.rc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162053a.m29445Y(view);
            }
        });
        if (gsj0.m132062f()) {
            bnl0.m105524M(this.f17108f, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17105c.getLayoutParams();
            int i = qa00.f156339z;
            layoutParams.height = i;
            this.f17105c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f17109g.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = qa00.f156323j;
            this.f17109g.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: T */
    public View m29447T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sc0.m185358b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public void m29448V() {
        this.f17109g.setClickable(true);
        this.f17110h = false;
        m29446b0();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m29449W(String str) {
        return str.length() == 2;
    }

    /* JADX INFO: renamed from: Z */
    public void m29450Z(Act act) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        this.f17106d.requestFocus();
        act.showInput(this.f17106d, 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m29451a0(y20<Integer> y20Var, y20<Integer> y20Var2) {
        this.f17111i = y20Var;
        this.f17112j = y20Var2;
    }

    public AgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AgeView(Context context) {
        this(context, null);
    }
}
