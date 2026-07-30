package com.p046p1.mobile.putong.account.p050ui.accountai.frag;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.NameEditTextOpt;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.c6c0;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.q4c0;
import p149l.toe;
import p149l.u0c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpNameFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public e30<String> f16368A;

    /* JADX INFO: renamed from: B */
    public e30<Boolean> f16369B;

    /* JADX INFO: renamed from: C */
    public NameEditTextOpt f16370C;

    /* JADX INFO: renamed from: D */
    public Group f16371D;

    /* JADX INFO: renamed from: E */
    public VText f16372E;

    /* JADX INFO: renamed from: F */
    public VImage f16373F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f16374G;

    /* JADX INFO: renamed from: H */
    public boolean f16375H;

    /* JADX INFO: renamed from: I */
    public String f16376I;

    /* JADX INFO: renamed from: z */
    public View f16377z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public /* synthetic */ void m28416H4() {
        m28429M4(3);
    }

    /* JADX INFO: renamed from: I4 */
    public static SignUpNameFrag m28417I4() {
        SignUpNameFrag signUpNameFrag = new SignUpNameFrag();
        signUpNameFrag.setArguments(new Bundle());
        return signUpNameFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m28418r() {
        this.f16370C = (NameEditTextOpt) this.f16377z.findViewById(q4c0.f152578V);
        this.f16371D = (Group) this.f16377z.findViewById(q4c0.f152572P);
        this.f16372E = (VText) this.f16377z.findViewById(q4c0.f152573Q);
        this.f16373F = (VImage) this.f16377z.findViewById(q4c0.f152584a0);
        this.f16370C.setNameWatcher(new NameEditTextOpt.InterfaceC4638b() { // from class: l.ndf0
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.NameEditTextOpt.InterfaceC4638b
            /* JADX INFO: renamed from: a */
            public final void mo28639a(String str, int i) {
                this.f138282a.m28425G4(str, i);
            }
        });
        this.f16370C.setFilters(new InputFilter[]{new toe(20, new toe.InterfaceC20221a() { // from class: l.odf0
            @Override // p149l.toe.InterfaceC20221a
            /* JADX INFO: renamed from: a */
            public final void mo163655a() {
                this.f143203a.m28416H4();
            }
        })});
        if (this.f16374G != null) {
            m28431O4();
        }
        if (TextUtils.isEmpty(this.f16376I)) {
            return;
        }
        m28432P4();
    }

    /* JADX INFO: renamed from: B4 */
    public void m28420B4() {
        this.f16370C.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: C4 */
    public void m28421C4() {
        if (this.f16370C.getText().length() == 0) {
            lsi0.m151564B(getContext().getResources().getString(R$string.f16121P3), false, true);
            return;
        }
        if (NullChecker.m81303a(this.f16368A)) {
            this.f16368A.call(this.f16370C.getText().toString());
        }
        this.f16370C.setFocusable(false);
    }

    /* JADX INFO: renamed from: D4 */
    public void m28422D4() {
        this.f16370C.clearFocus();
        this.f16370C.setCursorVisible(false);
    }

    /* JADX INFO: renamed from: E4 */
    public String m28423E4() {
        if (NullChecker.m81303a(this.f16370C)) {
            return this.f16370C.getText().toString().trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public void m28424F4(String str) {
        this.f16376I = str;
        m28432P4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m28425G4(String str, int i) {
        if (NullChecker.m81303a(this.f16369B)) {
            this.f16369B.call(Boolean.valueOf(!TextUtils.isEmpty(str)));
        }
        this.f16370C.setHintTextColor(getContext().getResources().getColor(u0c0.f172895p));
        m28429M4(i);
    }

    /* JADX INFO: renamed from: J4 */
    public void m28426J4(Act act) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        this.f16370C.requestFocus();
        this.f16370C.setCursorVisible(true);
        act.showInput(this.f16370C, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m28427K4(boolean z, View.OnClickListener onClickListener) {
        this.f16374G = onClickListener;
        this.f16375H = z;
        if (this.f16373F != null) {
            m28431O4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m28428L4(e30<String> e30Var, e30<Boolean> e30Var2) {
        this.f16368A = e30Var;
        this.f16369B = e30Var2;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m28429M4(int i) {
        if (i == 1) {
            m28430N4("仅支持中英文和空格");
            return;
        }
        if (i == 2) {
            m28430N4("不允许仅输入空格");
        } else if (i == 3) {
            m28430N4("最多支持20个字符");
        } else {
            m28430N4("");
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m28430N4(String str) {
        if (TextUtils.isEmpty(str)) {
            zvf0.m220400v("e_ai_signup_name", "p_ai_signup", new j760[0]);
        } else {
            this.f16372E.setText(str);
        }
        xdl0.m208344M(this.f16371D, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: O4 */
    public final void m28431O4() {
        VImage vImage = this.f16373F;
        if (vImage != null) {
            xdl0.m208344M(vImage, this.f16375H);
            xdl0.m208329E0(this.f16373F, this.f16374G);
        }
        NameEditTextOpt nameEditTextOpt = this.f16370C;
        if (nameEditTextOpt != null) {
            nameEditTextOpt.setPadding(xdl0.m208407w(20.0f), 0, this.f16375H ? xdl0.m208407w(52.0f) : xdl0.m208407w(20.0f), 0);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m28432P4() {
        NameEditTextOpt nameEditTextOpt = this.f16370C;
        if (nameEditTextOpt != null) {
            nameEditTextOpt.setText(this.f16376I);
            NameEditTextOpt nameEditTextOpt2 = this.f16370C;
            nameEditTextOpt2.setSelection(nameEditTextOpt2.getText().length());
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f16377z == null) {
            this.f16377z = layoutInflater.inflate(c6c0.f79484X, viewGroup, false);
        }
        m28418r();
        return this.f16377z;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
