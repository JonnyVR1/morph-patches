package com.p000p1.mobile.putong.account.p002ui.accountai.frag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.vwb;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.c6c0;
import p006l.q4c0;
import p006l.v2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpPortraitFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public d30 f367A;

    /* JADX INFO: renamed from: B */
    public View f368B;

    /* JADX INFO: renamed from: C */
    public View f369C;

    /* JADX INFO: renamed from: D */
    public VText f370D;

    /* JADX INFO: renamed from: E */
    public VText f371E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f372F;

    /* JADX INFO: renamed from: G */
    public Gender f373G;

    /* JADX INFO: renamed from: z */
    public View f374z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m329A4(View view) {
        if (NullChecker.a(this.f367A)) {
            this.f367A.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static SignUpPortraitFrag m330B4() {
        SignUpPortraitFrag signUpPortraitFrag = new SignUpPortraitFrag();
        signUpPortraitFrag.setArguments(new Bundle());
        return signUpPortraitFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m331r() {
        this.f371E = this.f374z.findViewById(q4c0.f19596b0);
        this.f368B = this.f374z.findViewById(q4c0.f19590X);
        this.f369C = this.f374z.findViewById(q4c0.f19591Y);
        this.f370D = this.f374z.findViewById(q4c0.f19592Z);
        this.f372F = this.f374z.findViewById(q4c0.f19589W);
        if (NullChecker.a(this.f373G)) {
            m336F4();
        }
        xdl0.E0(this.f368B, new View.OnClickListener() { // from class: l.pdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18692a.m329A4(view);
            }
        });
        String strF = RemoteConfig.x().F("signup_photo_config");
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        try {
            String strOptString = new JSONObject(strF).optString("title");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            this.f371E.setText(strOptString);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void m333C4(d30 d30Var) {
        this.f367A = d30Var;
    }

    /* JADX INFO: renamed from: D4 */
    public void m334D4(Gender gender) {
        this.f373G = gender;
        if (NullChecker.a(this.f372F)) {
            m336F4();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m335E4(View... viewArr) {
        if (vwb.K(viewArr)) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        for (View view : viewArr) {
            if (view != null) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f));
            }
        }
        animatorSet.setStartDelay(50L);
        animatorSet.setDuration(5000L).start();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m336F4() {
        if (NullChecker.a(this.f372F) && NullChecker.a(this.f373G)) {
            this.f372F.setImageResource(TEnum.equals(this.f373G, "female") ? v2c0.f23958F1 : v2c0.f23961G1);
            SVGALoader.with(act()).from(TEnum.equals(this.f373G, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").autoPlay(true).repeatCount(1).into(this.f372F);
            m335E4(this.f369C, this.f370D);
        }
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f374z == null) {
            this.f374z = layoutInflater.inflate(c6c0.f9415Y, viewGroup, false);
        }
        m331r();
        return this.f374z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
