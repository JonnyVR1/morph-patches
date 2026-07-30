package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.NameEditTextOpt;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.a9c0;
import p153l.bbc0;
import p153l.bnl0;
import p153l.fc20;
import p153l.gsj0;
import p153l.o1j0;
import p153l.qa00;
import p153l.xpe;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class NameView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f17128c;

    /* JADX INFO: renamed from: d */
    public NameEditTextOpt f17129d;

    /* JADX INFO: renamed from: e */
    public VImage f17130e;

    /* JADX INFO: renamed from: f */
    public VButton_FakeShadow f17131f;

    /* JADX INFO: renamed from: g */
    public y20<String> f17132g;

    /* JADX INFO: renamed from: h */
    public y20<String> f17133h;

    public NameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29477r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m29472X(String str, int i) {
        m29476d0(str.length() > 0);
        this.f17129d.setHintTextColor(getContext().getResources().getColor(a9c0.f69031p));
        m29475c0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m29473Y() {
        m29475c0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m29474Z(View view) {
        if (this.f17129d.getText().length() == 0) {
            o1j0.m165620B(getContext().getResources().getString(R$string.f16840P3), false, true);
            return;
        }
        if (NullChecker.m82486a(this.f17133h)) {
            this.f17133h.call(this.f17129d.getText().toString());
        }
        this.f17131f.setClickable(false);
        this.f17129d.setFocusable(false);
    }

    /* JADX INFO: renamed from: c0 */
    private void m29475c0(int i) {
        if (NullChecker.m82486a(this.f17132g)) {
            if (i == 1) {
                this.f17132g.call(getContext().getString(R$string.f17021x));
                return;
            }
            if (i == 2) {
                this.f17132g.call(getContext().getString(R$string.f17016w));
                return;
            }
            y20<String> y20Var = this.f17132g;
            if (i == 3) {
                y20Var.call(String.format(getContext().getString(R$string.f17011v), 20));
            } else {
                y20Var.call("");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m29476d0(boolean z) {
        VButton_FakeShadow vButton_FakeShadow = this.f17131f;
        if (z) {
            vButton_FakeShadow.setBackgroundResource(bbc0.f75815K1);
        } else {
            vButton_FakeShadow.setBackgroundResource(bbc0.f75917t1);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m29477r() {
        setOrientation(1);
        m29478S(LayoutInflater.from(getContext()), this);
        m29476d0(false);
        this.f17129d.setNameWatcher(new NameEditTextOpt.InterfaceC4789b() { // from class: l.cc20
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.NameEditTextOpt.InterfaceC4789b
            /* JADX INFO: renamed from: a */
            public final void mo29638a(String str, int i) {
                this.f80884a.m29472X(str, i);
            }
        });
        this.f17129d.setFilters(new InputFilter[]{new xpe(20, new xpe.InterfaceC21405a() { // from class: l.dc20
            @Override // p153l.xpe.InterfaceC21405a
            /* JADX INFO: renamed from: a */
            public final void mo115213a() {
                this.f87736a.m29473Y();
            }
        })});
        bnl0.m105509E0(this.f17131f, new View.OnClickListener() { // from class: l.ec20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93002a.m29474Z(view);
            }
        });
        if (gsj0.m132062f()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17129d.getLayoutParams();
            int i = qa00.f156339z;
            layoutParams.height = i;
            this.f17129d.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f17131f.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = qa00.f156323j;
            this.f17131f.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: S */
    public View m29478S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fc20.m124983b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m29479T() {
        this.f17131f.setClickable(true);
        this.f17129d.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: V */
    public void m29480V() {
        this.f17129d.clearFocus();
        this.f17129d.setCursorVisible(false);
    }

    /* JADX INFO: renamed from: W */
    public void m29481W(String str) {
        this.f17129d.setText(str);
        NameEditTextOpt nameEditTextOpt = this.f17129d;
        nameEditTextOpt.setSelection(nameEditTextOpt.getText().length());
        m29476d0(this.f17129d.getText().length() > 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m29482a0(Act act) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        this.f17129d.requestFocus();
        this.f17129d.setCursorVisible(true);
        act.showInput(this.f17129d, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public void m29483b0(y20<String> y20Var, y20<String> y20Var2) {
        this.f17132g = y20Var;
        this.f17133h = y20Var2;
    }

    public String getLastName() {
        return this.f17129d.getText().toString().trim();
    }

    public void setEditViewPadding(boolean z) {
        NameEditTextOpt nameEditTextOpt = this.f17129d;
        if (z) {
            nameEditTextOpt.setPadding(bnl0.m105587w(16.0f), 0, bnl0.m105587w(64.0f), 0);
        } else {
            nameEditTextOpt.setPadding(bnl0.m105587w(16.0f), 0, bnl0.m105587w(16.0f), 0);
        }
    }

    public NameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NameView(Context context) {
        this(context, null);
    }
}
