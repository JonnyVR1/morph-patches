package com.p051p1.mobile.putong.account.p055ui.accountai.frag;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.NameEditTextOpt;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.a9c0;
import p153l.bnl0;
import p153l.hec0;
import p153l.i4g0;
import p153l.o1j0;
import p153l.pf60;
import p153l.wcc0;
import p153l.xpe;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpNameFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public y20<String> f17087A;

    /* JADX INFO: renamed from: B */
    public y20<Boolean> f17088B;

    /* JADX INFO: renamed from: C */
    public NameEditTextOpt f17089C;

    /* JADX INFO: renamed from: D */
    public Group f17090D;

    /* JADX INFO: renamed from: E */
    public VText f17091E;

    /* JADX INFO: renamed from: F */
    public VImage f17092F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f17093G;

    /* JADX INFO: renamed from: H */
    public boolean f17094H;

    /* JADX INFO: renamed from: I */
    public String f17095I;

    /* JADX INFO: renamed from: z */
    public View f17096z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public /* synthetic */ void m29415H4() {
        m29428M4(3);
    }

    /* JADX INFO: renamed from: I4 */
    public static SignUpNameFrag m29416I4() {
        SignUpNameFrag signUpNameFrag = new SignUpNameFrag();
        signUpNameFrag.setArguments(new Bundle());
        return signUpNameFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m29417r() {
        this.f17089C = (NameEditTextOpt) this.f17096z.findViewById(wcc0.f188426V);
        this.f17090D = (Group) this.f17096z.findViewById(wcc0.f188420P);
        this.f17091E = (VText) this.f17096z.findViewById(wcc0.f188421Q);
        this.f17092F = (VImage) this.f17096z.findViewById(wcc0.f188432a0);
        this.f17089C.setNameWatcher(new NameEditTextOpt.InterfaceC4789b() { // from class: l.ulf0
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.NameEditTextOpt.InterfaceC4789b
            /* JADX INFO: renamed from: a */
            public final void mo29638a(String str, int i) {
                this.f179507a.m29424G4(str, i);
            }
        });
        this.f17089C.setFilters(new InputFilter[]{new xpe(20, new xpe.InterfaceC21405a() { // from class: l.vlf0
            @Override // p153l.xpe.InterfaceC21405a
            /* JADX INFO: renamed from: a */
            public final void mo115213a() {
                this.f184583a.m29415H4();
            }
        })});
        if (this.f17093G != null) {
            m29430O4();
        }
        if (TextUtils.isEmpty(this.f17095I)) {
            return;
        }
        m29431P4();
    }

    /* JADX INFO: renamed from: B4 */
    public void m29419B4() {
        this.f17089C.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: C4 */
    public void m29420C4() {
        if (this.f17089C.getText().length() == 0) {
            o1j0.m165620B(getContext().getResources().getString(R$string.f16840P3), false, true);
            return;
        }
        if (NullChecker.m82486a(this.f17087A)) {
            this.f17087A.call(this.f17089C.getText().toString());
        }
        this.f17089C.setFocusable(false);
    }

    /* JADX INFO: renamed from: D4 */
    public void m29421D4() {
        this.f17089C.clearFocus();
        this.f17089C.setCursorVisible(false);
    }

    /* JADX INFO: renamed from: E4 */
    public String m29422E4() {
        if (NullChecker.m82486a(this.f17089C)) {
            return this.f17089C.getText().toString().trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public void m29423F4(String str) {
        this.f17095I = str;
        m29431P4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m29424G4(String str, int i) {
        if (NullChecker.m82486a(this.f17088B)) {
            this.f17088B.call(Boolean.valueOf(!TextUtils.isEmpty(str)));
        }
        this.f17089C.setHintTextColor(getContext().getResources().getColor(a9c0.f69031p));
        m29428M4(i);
    }

    /* JADX INFO: renamed from: J4 */
    public void m29425J4(Act act) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        this.f17089C.requestFocus();
        this.f17089C.setCursorVisible(true);
        act.showInput(this.f17089C, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m29426K4(boolean z, View.OnClickListener onClickListener) {
        this.f17093G = onClickListener;
        this.f17094H = z;
        if (this.f17092F != null) {
            m29430O4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m29427L4(y20<String> y20Var, y20<Boolean> y20Var2) {
        this.f17087A = y20Var;
        this.f17088B = y20Var2;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m29428M4(int i) {
        if (i == 1) {
            m29429N4("仅支持中英文和空格");
            return;
        }
        if (i == 2) {
            m29429N4("不允许仅输入空格");
        } else if (i == 3) {
            m29429N4("最多支持20个字符");
        } else {
            m29429N4("");
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m29429N4(String str) {
        if (TextUtils.isEmpty(str)) {
            i4g0.m138524v("e_ai_signup_name", "p_ai_signup", new pf60[0]);
        } else {
            this.f17091E.setText(str);
        }
        bnl0.m105524M(this.f17090D, !TextUtils.isEmpty(str));
    }

    /* JADX INFO: renamed from: O4 */
    public final void m29430O4() {
        VImage vImage = this.f17092F;
        if (vImage != null) {
            bnl0.m105524M(vImage, this.f17094H);
            bnl0.m105509E0(this.f17092F, this.f17093G);
        }
        NameEditTextOpt nameEditTextOpt = this.f17089C;
        if (nameEditTextOpt != null) {
            nameEditTextOpt.setPadding(bnl0.m105587w(20.0f), 0, this.f17094H ? bnl0.m105587w(52.0f) : bnl0.m105587w(20.0f), 0);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m29431P4() {
        NameEditTextOpt nameEditTextOpt = this.f17089C;
        if (nameEditTextOpt != null) {
            nameEditTextOpt.setText(this.f17095I);
            NameEditTextOpt nameEditTextOpt2 = this.f17089C;
            nameEditTextOpt2.setSelection(nameEditTextOpt2.getText().length());
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f17096z == null) {
            this.f17096z = layoutInflater.inflate(hec0.f109096X, viewGroup, false);
        }
        m29417r();
        return this.f17096z;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
