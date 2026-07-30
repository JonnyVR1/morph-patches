package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VText;
import p153l.a8c0;
import p153l.jyb;
import p153l.o110;
import p153l.og3;
import p153l.pcj;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsSimpleTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f44816c;

    /* JADX INFO: renamed from: d */
    public VText f44817d;

    /* JADX INFO: renamed from: e */
    public String f44818e;

    /* JADX INFO: renamed from: f */
    public String f44819f;

    /* JADX INFO: renamed from: b2 */
    public static Intent m68205b2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsSimpleTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ C22421c m68206c2() {
        return FeedModule.f39702c.m61891W3(this.f44818e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m68207d2(View view) {
        lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m68208e2(Moment moment) {
        this.f44817d.setText(moment.value);
        this.f44817d.setOnClickListener(new View.OnClickListener() { // from class: l.n110
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139703a.m68207d2(view);
            }
        });
    }

    /* JADX INFO: renamed from: a2 */
    public View m68209a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o110.m165577b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(a8c0.f68901a, a8c0.f68902b);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m68209a2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new pcj() { // from class: l.l110
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f129633a.m68206c2();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.m110
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134378a.m68208e2((Moment) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f44818e = getIntent().getStringExtra("moment id");
        this.f44819f = getIntent().getStringExtra("user id");
        dimStatusBar(true);
        overridePendingTransition(a8c0.f68903c, a8c0.f68904d);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return jyb.m147507f0("moment id", this.f44818e, og3.f147188c);
    }
}
