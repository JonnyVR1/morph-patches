package com.p000p1.mobile.putong.account.p002ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.accountai.frag.SignUpAgeFrag;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.datepicker.WheelView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.ie50;
import l.l01;
import p006l.c6c0;
import p006l.q4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpAgeFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public VText f345A;

    /* JADX INFO: renamed from: B */
    public WheelView f346B;

    /* JADX INFO: renamed from: C */
    public SignUpData f347C;

    /* JADX INFO: renamed from: z */
    public View f348z;

    /* JADX INFO: renamed from: B4 */
    public static SignUpAgeFrag m296B4() {
        SignUpAgeFrag signUpAgeFrag = new SignUpAgeFrag();
        signUpAgeFrag.setArguments(new Bundle());
        return signUpAgeFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m297r() {
        this.f346B = this.f348z.findViewById(q4c0.f19581O);
        this.f345A = this.f348z.findViewById(q4c0.f19596b0);
        ArrayList arrayList = new ArrayList();
        for (int i = 18; i < 100; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        this.f346B.setAdapter(new l01(arrayList));
        this.f346B.setSelectedPosition(4);
        this.f346B.setOnItemSelectedListener(new ie50() { // from class: l.m5f0
            /* JADX INFO: renamed from: c */
            public final void m19124c(WheelView wheelView, l01 l01Var, int i2) {
                SignUpAgeFrag.m298z4(wheelView, l01Var, i2);
            }
        });
        if (NullChecker.a(this.f347C)) {
            m301D4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m298z4(WheelView wheelView, l01 l01Var, int i) {
    }

    /* JADX INFO: renamed from: A4 */
    public int m299A4() {
        return ((Integer) this.f346B.getSelectedItem()).intValue();
    }

    /* JADX INFO: renamed from: C4 */
    public void m300C4(SignUpData signUpData) {
        this.f347C = signUpData;
        if (NullChecker.a(this.f345A)) {
            m301D4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m301D4() {
        if (this.f347C != null) {
            SVGALoader.with(act()).from(TEnum.equals(this.f347C.gender, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").downloadOnly();
        }
        VText vText = this.f345A;
        SignUpData signUpData = this.f347C;
        vText.setText((signUpData == null || !TEnum.equals(signUpData.gender, "female")) ? "你好，先生" : "你好，女士");
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f348z == null) {
            this.f348z = layoutInflater.inflate(c6c0.f9410T, viewGroup, false);
        }
        m297r();
        return this.f348z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
