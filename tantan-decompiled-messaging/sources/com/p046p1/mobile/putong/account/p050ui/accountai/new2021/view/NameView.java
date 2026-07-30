package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.NameEditTextOpt;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.djj0;
import p149l.e30;
import p149l.lsi0;
import p149l.t100;
import p149l.toe;
import p149l.u0c0;
import p149l.v2c0;
import p149l.x320;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NameView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f16409c;

    /* JADX INFO: renamed from: d */
    public NameEditTextOpt f16410d;

    /* JADX INFO: renamed from: e */
    public VImage f16411e;

    /* JADX INFO: renamed from: f */
    public VButton_FakeShadow f16412f;

    /* JADX INFO: renamed from: g */
    public e30<String> f16413g;

    /* JADX INFO: renamed from: h */
    public e30<String> f16414h;

    public NameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28478r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m28473X(String str, int i) {
        m28477d0(str.length() > 0);
        this.f16410d.setHintTextColor(getContext().getResources().getColor(u0c0.f172895p));
        m28476c0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m28474Y() {
        m28476c0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m28475Z(View view) {
        if (this.f16410d.getText().length() == 0) {
            lsi0.m151564B(getContext().getResources().getString(R$string.f16121P3), false, true);
            return;
        }
        if (NullChecker.m81303a(this.f16414h)) {
            this.f16414h.call(this.f16410d.getText().toString());
        }
        this.f16412f.setClickable(false);
        this.f16410d.setFocusable(false);
    }

    /* JADX INFO: renamed from: c0 */
    private void m28476c0(int i) {
        if (NullChecker.m81303a(this.f16413g)) {
            if (i == 1) {
                this.f16413g.call(getContext().getString(R$string.f16302x));
                return;
            }
            if (i == 2) {
                this.f16413g.call(getContext().getString(R$string.f16297w));
                return;
            }
            e30<String> e30Var = this.f16413g;
            if (i == 3) {
                e30Var.call(String.format(getContext().getString(R$string.f16292v), 20));
            } else {
                e30Var.call("");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m28477d0(boolean z) {
        VButton_FakeShadow vButton_FakeShadow = this.f16412f;
        if (z) {
            vButton_FakeShadow.setBackgroundResource(v2c0.f179409K1);
        } else {
            vButton_FakeShadow.setBackgroundResource(v2c0.f179511t1);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m28478r() {
        setOrientation(1);
        m28479S(LayoutInflater.from(getContext()), this);
        m28477d0(false);
        this.f16410d.setNameWatcher(new NameEditTextOpt.InterfaceC4638b() { // from class: l.u320
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.NameEditTextOpt.InterfaceC4638b
            /* JADX INFO: renamed from: a */
            public final void mo28639a(String str, int i) {
                this.f173569a.m28473X(str, i);
            }
        });
        this.f16410d.setFilters(new InputFilter[]{new toe(20, new toe.InterfaceC20221a() { // from class: l.v320
            @Override // p149l.toe.InterfaceC20221a
            /* JADX INFO: renamed from: a */
            public final void mo163655a() {
                this.f179620a.m28474Y();
            }
        })});
        xdl0.m208329E0(this.f16412f, new View.OnClickListener() { // from class: l.w320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184298a.m28475Z(view);
            }
        });
        if (djj0.m112085f()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16410d.getLayoutParams();
            int i = t100.f167277z;
            layoutParams.height = i;
            this.f16410d.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f16412f.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = t100.f167261j;
            this.f16412f.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: S */
    public View m28479S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x320.m206895b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m28480T() {
        this.f16412f.setClickable(true);
        this.f16410d.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: V */
    public void m28481V() {
        this.f16410d.clearFocus();
        this.f16410d.setCursorVisible(false);
    }

    /* JADX INFO: renamed from: W */
    public void m28482W(String str) {
        this.f16410d.setText(str);
        NameEditTextOpt nameEditTextOpt = this.f16410d;
        nameEditTextOpt.setSelection(nameEditTextOpt.getText().length());
        m28477d0(this.f16410d.getText().length() > 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m28483a0(Act act) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        this.f16410d.requestFocus();
        this.f16410d.setCursorVisible(true);
        act.showInput(this.f16410d, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public void m28484b0(e30<String> e30Var, e30<String> e30Var2) {
        this.f16413g = e30Var;
        this.f16414h = e30Var2;
    }

    public String getLastName() {
        return this.f16410d.getText().toString().trim();
    }

    public void setEditViewPadding(boolean z) {
        NameEditTextOpt nameEditTextOpt = this.f16410d;
        if (z) {
            nameEditTextOpt.setPadding(xdl0.m208407w(16.0f), 0, xdl0.m208407w(64.0f), 0);
        } else {
            nameEditTextOpt.setPadding(xdl0.m208407w(16.0f), 0, xdl0.m208407w(16.0f), 0);
        }
    }

    public NameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NameView(Context context) {
        this(context, null);
    }
}
