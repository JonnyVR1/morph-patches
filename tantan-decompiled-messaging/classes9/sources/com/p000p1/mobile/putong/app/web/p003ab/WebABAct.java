package com.p000p1.mobile.putong.app.web.p003ab;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import l.hlp0;
import l.olp0;
import p006l.php0;
import p006l.rhp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WebABAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public String f1196f;

    /* JADX INFO: renamed from: b2 */
    public hlp0 m1610b2() {
        return new php0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public olp0 m1611c2() {
        return new rhp0(this);
    }

    /* JADX INFO: renamed from: e2 */
    public String m1612e2() {
        return this.f1196f;
    }

    public void initDataOnCreate() {
        this.f1196f = ((Act) this).act.getIntent().getStringExtra("pageName");
        super.initDataOnCreate();
        ((WebViewAct) this).c.Z();
        if ("p_mytantan".equals(this.f1196f)) {
            act().hackCenterTitle = true;
        }
    }

    public String pageId() {
        return this.f1196f;
    }
}
