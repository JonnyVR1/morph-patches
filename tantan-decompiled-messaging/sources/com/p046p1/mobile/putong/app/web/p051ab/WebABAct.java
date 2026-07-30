package com.p046p1.mobile.putong.app.web.p051ab;

import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p149l.hlp0;
import p149l.olp0;
import p149l.php0;
import p149l.rhp0;

/* JADX INFO: loaded from: classes9.dex */
public class WebABAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public String f17207f;

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: b2 */
    public hlp0 mo29700b2() {
        return new php0(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public olp0 mo29701c2() {
        return new rhp0(this);
    }

    /* JADX INFO: renamed from: e2 */
    public String m29702e2() {
        return this.f17207f;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17207f = this.act.getIntent().getStringExtra("pageName");
        super.initDataOnCreate();
        this.f54758c.mo39469Z();
        if ("p_mytantan".equals(this.f17207f)) {
            act().hackCenterTitle = true;
        }
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.WebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return this.f17207f;
    }
}
