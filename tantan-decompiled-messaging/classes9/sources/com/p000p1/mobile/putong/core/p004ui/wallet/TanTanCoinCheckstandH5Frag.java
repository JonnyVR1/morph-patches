package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.os.Bundle;
import android.view.View;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.WebViewFrag;
import com.p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.e30;
import l.jkp0;
import l.lsi0;
import l.mkd0;
import l.sw3;
import p006l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinCheckstandH5Frag extends WebViewFrag implements View.OnClickListener {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinCheckstandH5Frag$a */
    public class C0489a implements sw3.a {
        public C0489a() {
        }

        /* JADX INFO: renamed from: a */
        public void m11620a(String str) {
            ((WebViewFrag) TanTanCoinCheckstandH5Frag.this).C.setVisibility(8);
            ((WebViewFrag) TanTanCoinCheckstandH5Frag.this).B.setVisibility(8);
        }

        /* JADX INFO: renamed from: b */
        public void m11621b(String str) {
        }

        /* JADX INFO: renamed from: c */
        public void m11622c(int i, String str, String str2) {
            ((WebViewFrag) TanTanCoinCheckstandH5Frag.this).C.setVisibility(0);
        }
    }

    public TanTanCoinCheckstandH5Frag() {
        creates(new e30() { // from class: l.kvh0
            public final void call(Object obj) {
                this.f16010a.m11609X4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m11609X4(Bundle bundle) {
        ((WebViewFrag) this).C.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: d5 */
    public static TanTanCoinCheckstandH5Frag m11613d5(String str) {
        TanTanCoinCheckstandH5Frag tanTanCoinCheckstandH5Frag = new TanTanCoinCheckstandH5Frag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("wideViewPort", false);
        tanTanCoinCheckstandH5Frag.setArguments(bundle);
        return tanTanCoinCheckstandH5Frag;
    }

    /* JADX INFO: renamed from: g5 */
    private void m11614g5() {
        if (getArguments() == null) {
            return;
        }
        m11616V4(null);
    }

    /* JADX INFO: renamed from: T4 */
    public sw3.a m11615T4() {
        return new C0489a();
    }

    /* JADX INFO: renamed from: V4 */
    public void m11616V4(Map<String, String> map) {
        duringCreated(qib0.f19804b0.f17706a.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.ivh0
            public final void call(Object obj) {
                this.f14843a.m11618e5((AuthData) obj);
            }
        }, new e30() { // from class: l.jvh0
            public final void call(Object obj) {
                this.f15453a.m11619f5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m11618e5(AuthData authData) {
        ((WebViewFrag) this).H = new aoq(act(), authData.accessToken, ((WebViewFrag) this).A);
        HashMap map = new HashMap();
        if (jkp0.d(U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        ((WebViewFrag) this).A.setOverScrollMode(2);
        super.V4(map);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m11619f5(Throwable th) {
        ((WebViewFrag) this).C.setVisibility(0);
        ((WebViewFrag) this).B.setVisibility(8);
        lsi0.n(R.string.P1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == ((WebViewFrag) this).C) {
            m11614g5();
        }
    }
}
