package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.WebViewFrag;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p153l.ntp0;
import p153l.o1j0;
import p153l.psd0;
import p153l.rx3;
import p153l.uqb0;
import p153l.y20;
import p153l.zpq;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinCheckstandH5Frag extends WebViewFrag implements View.OnClickListener {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinCheckstandH5Frag$a */
    public class C9216a implements rx3.InterfaceC19928a {
        public C9216a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            TanTanCoinCheckstandH5Frag.this.f29026C.setVisibility(8);
            TanTanCoinCheckstandH5Frag.this.f29025B.setVisibility(8);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            TanTanCoinCheckstandH5Frag.this.f29026C.setVisibility(0);
        }
    }

    public TanTanCoinCheckstandH5Frag() {
        creates(new y20() { // from class: l.s3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166014a.m59265X4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m59265X4(Bundle bundle) {
        this.f29026C.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: d5 */
    public static TanTanCoinCheckstandH5Frag m59269d5(String str) {
        TanTanCoinCheckstandH5Frag tanTanCoinCheckstandH5Frag = new TanTanCoinCheckstandH5Frag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("wideViewPort", false);
        tanTanCoinCheckstandH5Frag.setArguments(bundle);
        return tanTanCoinCheckstandH5Frag;
    }

    /* JADX INFO: renamed from: g5 */
    private void m59270g5() {
        if (getArguments() == null) {
            return;
        }
        mo37608V4(null);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.WebViewFrag
    /* JADX INFO: renamed from: T4 */
    public rx3.InterfaceC19928a mo37607T4() {
        return new C9216a();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.WebViewFrag
    /* JADX INFO: renamed from: V4 */
    public void mo37608V4(Map<String, String> map) {
        duringCreated(uqb0.f180396b0.f170324a.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.q3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155450a.m59272e5((AuthData) obj);
            }
        }, new y20() { // from class: l.r3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161042a.m59273f5((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return (PutongAct) getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m59272e5(AuthData authData) {
        this.f29031H = new zpq(act(), authData.accessToken, this.f29024A);
        HashMap map = new HashMap();
        if (ntp0.m164746d(m45266U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f29024A.setOverScrollMode(2);
        super.mo37608V4(map);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m59273f5(Throwable th) {
        this.f29026C.setVisibility(0);
        this.f29025B.setVisibility(8);
        o1j0.m165640n(R$string.f28105P1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f29026C) {
            m59270g5();
        }
    }
}
