package com.p046p1.mobile.putong.core.p053ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p149l.gkp0;
import p149l.hlp0;
import p149l.olp0;
import p149l.rol;
import p149l.u0c;
import p149l.v0c;

/* JADX INFO: loaded from: classes3.dex */
public class DailyPaperAct extends WebViewAct implements UIBridgeImplementation.InterfaceC13125e, rol {

    /* JADX INFO: renamed from: f */
    public String f30333f;

    /* JADX INFO: renamed from: g */
    public String f30334g;

    /* JADX INFO: renamed from: e2 */
    public static Intent m47328e2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) DailyPaperAct.class);
        intent.putExtra("fromNotif", z);
        intent.putExtra("url", gkp0.m126667b());
        intent.putExtra("title", "我的探探");
        return intent;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: b2 */
    public hlp0 mo29700b2() {
        return new u0c(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public olp0 mo29701c2() {
        return new v0c(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13125e
    /* JADX INFO: renamed from: g0 */
    public void mo47329g0(@Nullable String str, @Nullable String str2) {
        ((v0c) this.f54759d).m196492Y(true);
        this.f30333f = str;
        this.f30334g = str2;
    }

    /* JADX INFO: renamed from: g2 */
    public void m47330g2() {
        ((v0c) this.f54759d).m196487T(this.f30333f, this.f30334g);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.hackCenterTitle = true;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (((v0c) this.f54759d).m196484Q(false)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((v0c) this.f54759d).m196488U();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_mytantan";
    }

    @Override // com.p046p1.mobile.putong.p065ui.jsbridge.implement.UIBridgeImplementation.InterfaceC13125e
    /* JADX INFO: renamed from: x0 */
    public void mo47331x0() {
        ((v0c) this.f54759d).m196492Y(false);
    }
}
