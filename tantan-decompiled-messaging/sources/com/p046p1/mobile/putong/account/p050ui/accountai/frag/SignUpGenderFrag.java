package com.p046p1.mobile.putong.account.p050ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.c6c0;
import p149l.e30;
import p149l.q4c0;
import p149l.v2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpGenderFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public e30<Gender> f16360A;

    /* JADX INFO: renamed from: B */
    public View f16361B;

    /* JADX INFO: renamed from: C */
    public View f16362C;

    /* JADX INFO: renamed from: D */
    public View f16363D;

    /* JADX INFO: renamed from: E */
    public View f16364E;

    /* JADX INFO: renamed from: F */
    public VImage f16365F;

    /* JADX INFO: renamed from: G */
    public VImage f16366G;

    /* JADX INFO: renamed from: z */
    public View f16367z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m28407D4(View view) {
        m28413C4(Gender.get("male"));
        if (NullChecker.m81303a(this.f16360A)) {
            this.f16360A.call(Gender.get("male"));
        }
        this.f16362C.setClickable(false);
        this.f16361B.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m28408E4(View view) {
        m28413C4(Gender.get("female"));
        if (NullChecker.m81303a(this.f16360A)) {
            this.f16360A.call(Gender.get("female"));
        }
        this.f16362C.setClickable(false);
        this.f16361B.setClickable(false);
    }

    /* JADX INFO: renamed from: F4 */
    public static SignUpGenderFrag m28409F4() {
        SignUpGenderFrag signUpGenderFrag = new SignUpGenderFrag();
        signUpGenderFrag.setArguments(new Bundle());
        return signUpGenderFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m28410r() {
        this.f16361B = this.f16367z.findViewById(q4c0.f152613s);
        this.f16362C = this.f16367z.findViewById(q4c0.f152612r);
        this.f16363D = this.f16367z.findViewById(q4c0.f152577U);
        this.f16364E = this.f16367z.findViewById(q4c0.f152575S);
        this.f16365F = (VImage) this.f16367z.findViewById(q4c0.f152576T);
        this.f16366G = (VImage) this.f16367z.findViewById(q4c0.f152574R);
        xdl0.m208329E0(this.f16361B, new View.OnClickListener() { // from class: l.mcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133102a.m28407D4(view);
            }
        });
        xdl0.m208329E0(this.f16362C, new View.OnClickListener() { // from class: l.ncf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138166a.m28408E4(view);
            }
        });
        m28413C4(null);
    }

    /* JADX INFO: renamed from: B4 */
    public void m28412B4() {
        if (NullChecker.m81303a(this.f16362C)) {
            this.f16362C.setClickable(true);
        }
        if (NullChecker.m81303a(this.f16361B)) {
            this.f16361B.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m28413C4(Gender gender) {
        if (gender == null) {
            this.f16361B.setBackgroundResource(v2c0.f179508s1);
            this.f16362C.setBackgroundResource(v2c0.f179508s1);
            this.f16365F.setBackgroundResource(v2c0.f179499p1);
            this.f16366G.setBackgroundResource(v2c0.f179493n1);
            xdl0.m208344M(this.f16363D, false);
            xdl0.m208344M(this.f16364E, false);
        }
        if (TEnum.equals(gender, "female")) {
            this.f16361B.setBackgroundResource(v2c0.f179508s1);
            this.f16362C.setBackgroundResource(v2c0.f179505r1);
            this.f16365F.setBackgroundResource(v2c0.f179499p1);
            this.f16366G.setBackgroundResource(v2c0.f179490m1);
            xdl0.m208344M(this.f16363D, false);
            xdl0.m208344M(this.f16364E, true);
        }
        if (TEnum.equals(gender, "male")) {
            this.f16361B.setBackgroundResource(v2c0.f179502q1);
            this.f16362C.setBackgroundResource(v2c0.f179508s1);
            this.f16365F.setBackgroundResource(v2c0.f179496o1);
            this.f16366G.setBackgroundResource(v2c0.f179493n1);
            xdl0.m208344M(this.f16363D, true);
            xdl0.m208344M(this.f16364E, false);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m28414G4(e30<Gender> e30Var) {
        this.f16360A = e30Var;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f16367z == null) {
            this.f16367z = layoutInflater.inflate(c6c0.f79483W, viewGroup, false);
        }
        m28410r();
        return this.f16367z;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
