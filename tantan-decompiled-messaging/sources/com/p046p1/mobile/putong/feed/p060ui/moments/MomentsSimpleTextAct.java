package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VText;
import p149l.ag3;
import p149l.e30;
import p149l.ft00;
import p149l.mkd0;
import p149l.uzb0;
import p149l.v9j;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsSimpleTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f43968c;

    /* JADX INFO: renamed from: d */
    public VText f43969d;

    /* JADX INFO: renamed from: e */
    public String f43970e;

    /* JADX INFO: renamed from: f */
    public String f43971f;

    /* JADX INFO: renamed from: a2 */
    public static Intent m67022a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsSimpleTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ C22306c m67023b2() {
        return FeedModule.f38854c.m60707W3(this.f43970e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m67024c2(View view) {
        lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m67025d2(Moment moment) {
        this.f43969d.setText(moment.value);
        this.f43969d.setOnClickListener(new View.OnClickListener() { // from class: l.et00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93069a.m67024c2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public View m67026Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ft00.m122986b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(uzb0.f178976a, uzb0.f178977b);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m67026Z1(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.ct00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82449a.m67023b2();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dt00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87803a.m67025d2((Moment) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f43970e = getIntent().getStringExtra("moment id");
        this.f43971f = getIntent().getStringExtra("user id");
        dimStatusBar(true);
        overridePendingTransition(uzb0.f178978c, uzb0.f178979d);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.m200324f0("moment id", this.f43970e, ag3.f69254c);
    }
}
