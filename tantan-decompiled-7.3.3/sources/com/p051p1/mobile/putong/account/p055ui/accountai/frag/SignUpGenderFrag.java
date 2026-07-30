package com.p051p1.mobile.putong.account.p055ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bbc0;
import p153l.bnl0;
import p153l.hec0;
import p153l.wcc0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpGenderFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public y20<Gender> f17079A;

    /* JADX INFO: renamed from: B */
    public View f17080B;

    /* JADX INFO: renamed from: C */
    public View f17081C;

    /* JADX INFO: renamed from: D */
    public View f17082D;

    /* JADX INFO: renamed from: E */
    public View f17083E;

    /* JADX INFO: renamed from: F */
    public VImage f17084F;

    /* JADX INFO: renamed from: G */
    public VImage f17085G;

    /* JADX INFO: renamed from: z */
    public View f17086z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m29406D4(View view) {
        m29412C4(Gender.get("male"));
        if (NullChecker.m82486a(this.f17079A)) {
            this.f17079A.call(Gender.get("male"));
        }
        this.f17081C.setClickable(false);
        this.f17080B.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m29407E4(View view) {
        m29412C4(Gender.get("female"));
        if (NullChecker.m82486a(this.f17079A)) {
            this.f17079A.call(Gender.get("female"));
        }
        this.f17081C.setClickable(false);
        this.f17080B.setClickable(false);
    }

    /* JADX INFO: renamed from: F4 */
    public static SignUpGenderFrag m29408F4() {
        SignUpGenderFrag signUpGenderFrag = new SignUpGenderFrag();
        signUpGenderFrag.setArguments(new Bundle());
        return signUpGenderFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m29409r() {
        this.f17080B = this.f17086z.findViewById(wcc0.f188461s);
        this.f17081C = this.f17086z.findViewById(wcc0.f188460r);
        this.f17082D = this.f17086z.findViewById(wcc0.f188425U);
        this.f17083E = this.f17086z.findViewById(wcc0.f188423S);
        this.f17084F = (VImage) this.f17086z.findViewById(wcc0.f188424T);
        this.f17085G = (VImage) this.f17086z.findViewById(wcc0.f188422R);
        bnl0.m105509E0(this.f17080B, new View.OnClickListener() { // from class: l.tkf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174707a.m29406D4(view);
            }
        });
        bnl0.m105509E0(this.f17081C, new View.OnClickListener() { // from class: l.ukf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179389a.m29407E4(view);
            }
        });
        m29412C4(null);
    }

    /* JADX INFO: renamed from: B4 */
    public void m29411B4() {
        if (NullChecker.m82486a(this.f17081C)) {
            this.f17081C.setClickable(true);
        }
        if (NullChecker.m82486a(this.f17080B)) {
            this.f17080B.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m29412C4(Gender gender) {
        if (gender == null) {
            this.f17080B.setBackgroundResource(bbc0.f75914s1);
            this.f17081C.setBackgroundResource(bbc0.f75914s1);
            this.f17084F.setBackgroundResource(bbc0.f75905p1);
            this.f17085G.setBackgroundResource(bbc0.f75899n1);
            bnl0.m105524M(this.f17082D, false);
            bnl0.m105524M(this.f17083E, false);
        }
        if (TEnum.equals(gender, "female")) {
            this.f17080B.setBackgroundResource(bbc0.f75914s1);
            this.f17081C.setBackgroundResource(bbc0.f75911r1);
            this.f17084F.setBackgroundResource(bbc0.f75905p1);
            this.f17085G.setBackgroundResource(bbc0.f75896m1);
            bnl0.m105524M(this.f17082D, false);
            bnl0.m105524M(this.f17083E, true);
        }
        if (TEnum.equals(gender, "male")) {
            this.f17080B.setBackgroundResource(bbc0.f75908q1);
            this.f17081C.setBackgroundResource(bbc0.f75914s1);
            this.f17084F.setBackgroundResource(bbc0.f75902o1);
            this.f17085G.setBackgroundResource(bbc0.f75899n1);
            bnl0.m105524M(this.f17082D, true);
            bnl0.m105524M(this.f17083E, false);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m29413G4(y20<Gender> y20Var) {
        this.f17079A = y20Var;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f17086z == null) {
            this.f17086z = layoutInflater.inflate(hec0.f109095W, viewGroup, false);
        }
        m29409r();
        return this.f17086z;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
