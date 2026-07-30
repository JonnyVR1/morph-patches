package com.p000p1.mobile.putong.core.p001ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.jsbridge.implement.UIBridgeImplementation;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import l.gkp0;
import l.hlp0;
import l.olp0;
import l.rol;
import l.u0c;
import l.v0c;
import org.spongycastle.i18n.MessageBundle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DailyPaperAct extends WebViewAct implements UIBridgeImplementation.e, rol {

    /* JADX INFO: renamed from: f */
    public String f224f;

    /* JADX INFO: renamed from: g */
    public String f225g;

    /* JADX INFO: renamed from: e2 */
    public static Intent m359e2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) DailyPaperAct.class);
        intent.putExtra("fromNotif", z);
        intent.putExtra("url", gkp0.b());
        intent.putExtra(MessageBundle.TITLE_ENTRY, "我的探探");
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public hlp0 m360b2() {
        return new u0c(this);
    }

    /* JADX INFO: renamed from: c2 */
    public olp0 m361c2() {
        return new v0c(this);
    }

    /* JADX INFO: renamed from: g0 */
    public void m362g0(@Nullable String str, @Nullable String str2) {
        ((WebViewAct) this).d.Y(true);
        this.f224f = str;
        this.f225g = str2;
    }

    /* JADX INFO: renamed from: g2 */
    public void m363g2() {
        ((WebViewAct) this).d.T(this.f224f, this.f225g);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((Act) this).hackCenterTitle = true;
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (((WebViewAct) this).d.Q(false)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onNewIntent(intent);
        ((WebViewAct) this).d.U();
    }

    public String pageId() {
        return "p_mytantan";
    }

    /* JADX INFO: renamed from: x0 */
    public void m364x0() {
        ((WebViewAct) this).d.Y(false);
    }
}
