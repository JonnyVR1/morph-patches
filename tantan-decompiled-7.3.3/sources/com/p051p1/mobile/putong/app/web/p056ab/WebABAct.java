package com.p051p1.mobile.putong.app.web.p056ab;

import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p153l.lup0;
import p153l.sup0;
import p153l.tqp0;
import p153l.vqp0;

/* JADX INFO: loaded from: classes9.dex */
public class WebABAct extends WebViewAct {

    /* JADX INFO: renamed from: f */
    public String f17926f;

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public lup0 mo30698c2() {
        return new tqp0(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: d2 */
    public sup0 mo30699d2() {
        return new vqp0(this);
    }

    /* JADX INFO: renamed from: g2 */
    public String m30700g2() {
        return this.f17926f;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17926f = this.act.getIntent().getStringExtra("pageName");
        super.initDataOnCreate();
        this.f55606c.mo40472Z();
        if ("p_mytantan".equals(this.f17926f)) {
            act().hackCenterTitle = true;
        }
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.WebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return this.f17926f;
    }
}
