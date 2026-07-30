package com.p000p1.mobile.putong.account.p002ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.xdl0;
import p006l.c6c0;
import p006l.q4c0;
import p006l.v2c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpGenderFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public e30<Gender> f349A;

    /* JADX INFO: renamed from: B */
    public View f350B;

    /* JADX INFO: renamed from: C */
    public View f351C;

    /* JADX INFO: renamed from: D */
    public View f352D;

    /* JADX INFO: renamed from: E */
    public View f353E;

    /* JADX INFO: renamed from: F */
    public VImage f354F;

    /* JADX INFO: renamed from: G */
    public VImage f355G;

    /* JADX INFO: renamed from: z */
    public View f356z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m303D4(View view) {
        m309C4(Gender.get("male"));
        if (NullChecker.a(this.f349A)) {
            this.f349A.call(Gender.get("male"));
        }
        this.f351C.setClickable(false);
        this.f350B.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m304E4(View view) {
        m309C4(Gender.get("female"));
        if (NullChecker.a(this.f349A)) {
            this.f349A.call(Gender.get("female"));
        }
        this.f351C.setClickable(false);
        this.f350B.setClickable(false);
    }

    /* JADX INFO: renamed from: F4 */
    public static SignUpGenderFrag m305F4() {
        SignUpGenderFrag signUpGenderFrag = new SignUpGenderFrag();
        signUpGenderFrag.setArguments(new Bundle());
        return signUpGenderFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m306r() {
        this.f350B = this.f356z.findViewById(q4c0.f19623s);
        this.f351C = this.f356z.findViewById(q4c0.f19622r);
        this.f352D = this.f356z.findViewById(q4c0.f19587U);
        this.f353E = this.f356z.findViewById(q4c0.f19585S);
        this.f354F = this.f356z.findViewById(q4c0.f19586T);
        this.f355G = this.f356z.findViewById(q4c0.f19584R);
        xdl0.E0(this.f350B, new View.OnClickListener() { // from class: l.mcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16902a.m303D4(view);
            }
        });
        xdl0.E0(this.f351C, new View.OnClickListener() { // from class: l.ncf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17592a.m304E4(view);
            }
        });
        m309C4(null);
    }

    /* JADX INFO: renamed from: B4 */
    public void m308B4() {
        if (NullChecker.a(this.f351C)) {
            this.f351C.setClickable(true);
        }
        if (NullChecker.a(this.f350B)) {
            this.f350B.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m309C4(Gender gender) {
        if (gender == null) {
            this.f350B.setBackgroundResource(v2c0.f24072s1);
            this.f351C.setBackgroundResource(v2c0.f24072s1);
            this.f354F.setBackgroundResource(v2c0.f24063p1);
            this.f355G.setBackgroundResource(v2c0.f24057n1);
            xdl0.M(this.f352D, false);
            xdl0.M(this.f353E, false);
        }
        if (TEnum.equals(gender, "female")) {
            this.f350B.setBackgroundResource(v2c0.f24072s1);
            this.f351C.setBackgroundResource(v2c0.f24069r1);
            this.f354F.setBackgroundResource(v2c0.f24063p1);
            this.f355G.setBackgroundResource(v2c0.f24054m1);
            xdl0.M(this.f352D, false);
            xdl0.M(this.f353E, true);
        }
        if (TEnum.equals(gender, "male")) {
            this.f350B.setBackgroundResource(v2c0.f24066q1);
            this.f351C.setBackgroundResource(v2c0.f24072s1);
            this.f354F.setBackgroundResource(v2c0.f24060o1);
            this.f355G.setBackgroundResource(v2c0.f24057n1);
            xdl0.M(this.f352D, true);
            xdl0.M(this.f353E, false);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m310G4(e30<Gender> e30Var) {
        this.f349A = e30Var;
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f356z == null) {
            this.f356z = layoutInflater.inflate(c6c0.f9413W, viewGroup, false);
        }
        m306r();
        return this.f356z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
