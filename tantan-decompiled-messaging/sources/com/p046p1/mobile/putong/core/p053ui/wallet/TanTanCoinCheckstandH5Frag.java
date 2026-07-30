package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.WebViewFrag;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p149l.aoq;
import p149l.e30;
import p149l.jkp0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.sw3;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinCheckstandH5Frag extends WebViewFrag implements View.OnClickListener {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinCheckstandH5Frag$a */
    public class C9053a implements sw3.InterfaceC20043a {
        public C9053a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            TanTanCoinCheckstandH5Frag.this.f28178C.setVisibility(8);
            TanTanCoinCheckstandH5Frag.this.f28177B.setVisibility(8);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            TanTanCoinCheckstandH5Frag.this.f28178C.setVisibility(0);
        }
    }

    public TanTanCoinCheckstandH5Frag() {
        creates(new e30() { // from class: l.kvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124774a.m58082X4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m58082X4(Bundle bundle) {
        this.f28178C.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: d5 */
    public static TanTanCoinCheckstandH5Frag m58086d5(String str) {
        TanTanCoinCheckstandH5Frag tanTanCoinCheckstandH5Frag = new TanTanCoinCheckstandH5Frag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("wideViewPort", false);
        tanTanCoinCheckstandH5Frag.setArguments(bundle);
        return tanTanCoinCheckstandH5Frag;
    }

    /* JADX INFO: renamed from: g5 */
    private void m58087g5() {
        if (getArguments() == null) {
            return;
        }
        mo36605V4(null);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.WebViewFrag
    /* JADX INFO: renamed from: T4 */
    public sw3.InterfaceC20043a mo36604T4() {
        return new C9053a();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.WebViewFrag
    /* JADX INFO: renamed from: V4 */
    public void mo36605V4(Map<String, String> map) {
        duringCreated(qib0.f154713b0.f139230a.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.ivh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115168a.m58089e5((AuthData) obj);
            }
        }, new e30() { // from class: l.jvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119941a.m58090f5((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return (PutongAct) getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m58089e5(AuthData authData) {
        this.f28183H = new aoq(act(), authData.accessToken, this.f28176A);
        HashMap map = new HashMap();
        if (jkp0.m141904d(m44083U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f28176A.setOverScrollMode(2);
        super.mo36605V4(map);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m58090f5(Throwable th) {
        this.f28178C.setVisibility(0);
        this.f28177B.setVisibility(8);
        lsi0.m151584n(R$string.f27257P1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f28178C) {
            m58087g5();
        }
    }
}
