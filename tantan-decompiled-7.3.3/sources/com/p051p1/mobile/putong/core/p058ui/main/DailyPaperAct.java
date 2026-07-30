package com.p051p1.mobile.putong.core.p058ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p153l.crl;
import p153l.h2c;
import p153l.i2c;
import p153l.ktp0;
import p153l.lup0;
import p153l.sup0;

/* JADX INFO: loaded from: classes3.dex */
public class DailyPaperAct extends WebViewAct implements UIBridgeImplementation.InterfaceC13288e, crl {

    /* JADX INFO: renamed from: f */
    public String f31181f;

    /* JADX INFO: renamed from: g */
    public String f31182g;

    /* JADX INFO: renamed from: g2 */
    public static Intent m48511g2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) DailyPaperAct.class);
        intent.putExtra("fromNotif", z);
        intent.putExtra("url", ktp0.m151391b());
        intent.putExtra("title", "我的探探");
        return intent;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public lup0 mo30698c2() {
        return new h2c(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: d2 */
    public sup0 mo30699d2() {
        return new i2c(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13288e
    /* JADX INFO: renamed from: h0 */
    public void mo48512h0(@Nullable String str, @Nullable String str2) {
        ((i2c) this.f55607d).m138184Y(true);
        this.f31181f = str;
        this.f31182g = str2;
    }

    /* JADX INFO: renamed from: h2 */
    public void m48513h2() {
        ((i2c) this.f55607d).m138179T(this.f31181f, this.f31182g);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.hackCenterTitle = true;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (((i2c) this.f55607d).m138176Q(false)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((i2c) this.f55607d).m138180U();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_mytantan";
    }

    @Override // com.p051p1.mobile.putong.p070ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13288e
    /* JADX INFO: renamed from: y0 */
    public void mo48514y0() {
        ((i2c) this.f55607d).m138184Y(false);
    }
}
