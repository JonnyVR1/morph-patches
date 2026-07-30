package com.p046p1.mobile.putong.account.p050ui.accountai.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.account.p050ui.accountai.frag.SignUpAgeFrag;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.datepicker.WheelView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VText;
import p149l.c6c0;
import p149l.ie50;
import p149l.l01;
import p149l.q4c0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpAgeFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public VText f16356A;

    /* JADX INFO: renamed from: B */
    public WheelView f16357B;

    /* JADX INFO: renamed from: C */
    public SignUpData f16358C;

    /* JADX INFO: renamed from: z */
    public View f16359z;

    /* JADX INFO: renamed from: B4 */
    public static SignUpAgeFrag m28400B4() {
        SignUpAgeFrag signUpAgeFrag = new SignUpAgeFrag();
        signUpAgeFrag.setArguments(new Bundle());
        return signUpAgeFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m28401r() {
        this.f16357B = (WheelView) this.f16359z.findViewById(q4c0.f152571O);
        this.f16356A = (VText) this.f16359z.findViewById(q4c0.f152586b0);
        ArrayList arrayList = new ArrayList();
        for (int i = 18; i < 100; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        this.f16357B.setAdapter(new l01<>(arrayList));
        this.f16357B.setSelectedPosition(4);
        this.f16357B.setOnItemSelectedListener(new ie50() { // from class: l.m5f0
            @Override // p149l.ie50
            /* JADX INFO: renamed from: c */
            public final void mo111089c(WheelView wheelView, l01 l01Var, int i2) {
                SignUpAgeFrag.m28402z4(wheelView, l01Var, i2);
            }
        });
        if (NullChecker.m81303a(this.f16358C)) {
            m28405D4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m28402z4(WheelView wheelView, l01 l01Var, int i) {
    }

    /* JADX INFO: renamed from: A4 */
    public int m28403A4() {
        return ((Integer) this.f16357B.getSelectedItem()).intValue();
    }

    /* JADX INFO: renamed from: C4 */
    public void m28404C4(SignUpData signUpData) {
        this.f16358C = signUpData;
        if (NullChecker.m81303a(this.f16356A)) {
            m28405D4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m28405D4() {
        if (this.f16358C != null) {
            SVGALoader.with(act()).from(TEnum.equals(this.f16358C.gender, "female") ? "https://auto.tancdn.com/v1/raw/f4973703-3fdb-40f1-b31c-2dfc7c47fc5614.svga" : "https://auto.tancdn.com/v1/raw/cd16e9f0-10d8-420e-8ac9-5ca497c7714c14.svga").downloadOnly();
        }
        VText vText = this.f16356A;
        SignUpData signUpData = this.f16358C;
        vText.setText((signUpData == null || !TEnum.equals(signUpData.gender, "female")) ? "你好，先生" : "你好，女士");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f16359z == null) {
            this.f16359z = layoutInflater.inflate(c6c0.f79480T, viewGroup, false);
        }
        m28401r();
        return this.f16359z;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
