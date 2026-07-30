package com.p046p1.mobile.putong.account.p050ui.accountai.frag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VText;
import p149l.c6c0;
import p149l.d30;
import p149l.q4c0;
import p149l.v2c0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpPortraitFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public d30 f16378A;

    /* JADX INFO: renamed from: B */
    public View f16379B;

    /* JADX INFO: renamed from: C */
    public View f16380C;

    /* JADX INFO: renamed from: D */
    public VText f16381D;

    /* JADX INFO: renamed from: E */
    public VText f16382E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f16383F;

    /* JADX INFO: renamed from: G */
    public Gender f16384G;

    /* JADX INFO: renamed from: z */
    public View f16385z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m28433A4(View view) {
        if (NullChecker.m81303a(this.f16378A)) {
            this.f16378A.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static SignUpPortraitFrag m28434B4() {
        SignUpPortraitFrag signUpPortraitFrag = new SignUpPortraitFrag();
        signUpPortraitFrag.setArguments(new Bundle());
        return signUpPortraitFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m28435r() {
        this.f16382E = (VText) this.f16385z.findViewById(q4c0.f152586b0);
        this.f16379B = this.f16385z.findViewById(q4c0.f152580X);
        this.f16380C = this.f16385z.findViewById(q4c0.f152581Y);
        this.f16381D = (VText) this.f16385z.findViewById(q4c0.f152582Z);
        this.f16383F = (SVGAnimationView) this.f16385z.findViewById(q4c0.f152579W);
        if (NullChecker.m81303a(this.f16384G)) {
            m28440F4();
        }
        xdl0.m208329E0(this.f16379B, new View.OnClickListener() { // from class: l.pdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148300a.m28433A4(view);
            }
        });
        String strM79302F = RemoteConfig.m79298x().m79302F("signup_photo_config");
        if (TextUtils.isEmpty(strM79302F)) {
            return;
        }
        try {
            String strOptString = new JSONObject(strM79302F).optString("title");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            this.f16382E.setText(strOptString);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void m28437C4(d30 d30Var) {
        this.f16378A = d30Var;
    }

    /* JADX INFO: renamed from: D4 */
    public void m28438D4(Gender gender) {
        this.f16384G = gender;
        if (NullChecker.m81303a(this.f16383F)) {
            m28440F4();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m28439E4(View... viewArr) {
        if (vwb.m200297K(viewArr)) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        for (View view : viewArr) {
            if (view != null) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f));
            }
        }
        animatorSet.setStartDelay(50L);
        animatorSet.setDuration(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).start();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m28440F4() {
        if (NullChecker.m81303a(this.f16383F) && NullChecker.m81303a(this.f16384G)) {
            this.f16383F.setImageResource(TEnum.equals(this.f16384G, "female") ? v2c0.f179394F1 : v2c0.f179397G1);
            SVGALoader.with(act()).from(TEnum.equals(this.f16384G, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").autoPlay(true).repeatCount(1).into(this.f16383F);
            m28439E4(this.f16380C, this.f16381D);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f16385z == null) {
            this.f16385z = layoutInflater.inflate(c6c0.f79485Y, viewGroup, false);
        }
        m28435r();
        return this.f16385z;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
