package com.p051p1.mobile.putong.account.p055ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.account.p055ui.accountai.frag.SignUpAgeFrag;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VText;
import p153l.hec0;
import p153l.pm50;
import p153l.s01;
import p153l.wcc0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpAgeFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public VText f17075A;

    /* JADX INFO: renamed from: B */
    public WheelView f17076B;

    /* JADX INFO: renamed from: C */
    public SignUpData f17077C;

    /* JADX INFO: renamed from: z */
    public View f17078z;

    /* JADX INFO: renamed from: B4 */
    public static SignUpAgeFrag m29399B4() {
        SignUpAgeFrag signUpAgeFrag = new SignUpAgeFrag();
        signUpAgeFrag.setArguments(new Bundle());
        return signUpAgeFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m29400r() {
        this.f17076B = (WheelView) this.f17078z.findViewById(wcc0.f188419O);
        this.f17075A = (VText) this.f17078z.findViewById(wcc0.f188434b0);
        ArrayList arrayList = new ArrayList();
        for (int i = 18; i < 100; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        this.f17076B.setAdapter(new s01<>(arrayList));
        this.f17076B.setSelectedPosition(4);
        this.f17076B.setOnItemSelectedListener(new pm50() { // from class: l.tdf0
            @Override // p153l.pm50
            /* JADX INFO: renamed from: c */
            public final void mo163801c(WheelView wheelView, s01 s01Var, int i2) {
                SignUpAgeFrag.m29401z4(wheelView, s01Var, i2);
            }
        });
        if (NullChecker.m82486a(this.f17077C)) {
            m29404D4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m29401z4(WheelView wheelView, s01 s01Var, int i) {
    }

    /* JADX INFO: renamed from: A4 */
    public int m29402A4() {
        return ((Integer) this.f17076B.getSelectedItem()).intValue();
    }

    /* JADX INFO: renamed from: C4 */
    public void m29403C4(SignUpData signUpData) {
        this.f17077C = signUpData;
        if (NullChecker.m82486a(this.f17075A)) {
            m29404D4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m29404D4() {
        if (this.f17077C != null) {
            SVGALoader.with(act()).from(TEnum.equals(this.f17077C.gender, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").downloadOnly();
        }
        VText vText = this.f17075A;
        SignUpData signUpData = this.f17077C;
        vText.setText((signUpData == null || !TEnum.equals(signUpData.gender, "female")) ? "你好，先生" : "你好，女士");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f17078z == null) {
            this.f17078z = layoutInflater.inflate(hec0.f109092T, viewGroup, false);
        }
        m29400r();
        return this.f17078z;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
