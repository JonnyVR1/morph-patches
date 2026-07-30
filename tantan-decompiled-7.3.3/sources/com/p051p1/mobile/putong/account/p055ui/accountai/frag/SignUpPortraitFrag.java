package com.p051p1.mobile.putong.account.p055ui.accountai.frag;

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
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VText;
import p153l.bbc0;
import p153l.bnl0;
import p153l.hec0;
import p153l.jyb;
import p153l.wcc0;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpPortraitFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public x20 f17097A;

    /* JADX INFO: renamed from: B */
    public View f17098B;

    /* JADX INFO: renamed from: C */
    public View f17099C;

    /* JADX INFO: renamed from: D */
    public VText f17100D;

    /* JADX INFO: renamed from: E */
    public VText f17101E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f17102F;

    /* JADX INFO: renamed from: G */
    public Gender f17103G;

    /* JADX INFO: renamed from: z */
    public View f17104z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m29432A4(View view) {
        if (NullChecker.m82486a(this.f17097A)) {
            this.f17097A.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static SignUpPortraitFrag m29433B4() {
        SignUpPortraitFrag signUpPortraitFrag = new SignUpPortraitFrag();
        signUpPortraitFrag.setArguments(new Bundle());
        return signUpPortraitFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m29434r() {
        this.f17101E = (VText) this.f17104z.findViewById(wcc0.f188434b0);
        this.f17098B = this.f17104z.findViewById(wcc0.f188428X);
        this.f17099C = this.f17104z.findViewById(wcc0.f188429Y);
        this.f17100D = (VText) this.f17104z.findViewById(wcc0.f188430Z);
        this.f17102F = (SVGAnimationView) this.f17104z.findViewById(wcc0.f188427W);
        if (NullChecker.m82486a(this.f17103G)) {
            m29439F4();
        }
        bnl0.m105509E0(this.f17098B, new View.OnClickListener() { // from class: l.wlf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189686a.m29432A4(view);
            }
        });
        String strM80485F = RemoteConfig.m80481x().m80485F("signup_photo_config");
        if (TextUtils.isEmpty(strM80485F)) {
            return;
        }
        try {
            String strOptString = new JSONObject(strM80485F).optString("title");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            this.f17101E.setText(strOptString);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void m29436C4(x20 x20Var) {
        this.f17097A = x20Var;
    }

    /* JADX INFO: renamed from: D4 */
    public void m29437D4(Gender gender) {
        this.f17103G = gender;
        if (NullChecker.m82486a(this.f17102F)) {
            m29439F4();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m29438E4(View... viewArr) {
        if (jyb.m147480K(viewArr)) {
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
    public final void m29439F4() {
        if (NullChecker.m82486a(this.f17102F) && NullChecker.m82486a(this.f17103G)) {
            this.f17102F.setImageResource(TEnum.equals(this.f17103G, "female") ? bbc0.f75800F1 : bbc0.f75803G1);
            SVGALoader.with(act()).from(TEnum.equals(this.f17103G, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").autoPlay(true).repeatCount(1).into(this.f17102F);
            m29438E4(this.f17099C, this.f17100D);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f17104z == null) {
            this.f17104z = layoutInflater.inflate(hec0.f109097Y, viewGroup, false);
        }
        m29434r();
        return this.f17104z;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
