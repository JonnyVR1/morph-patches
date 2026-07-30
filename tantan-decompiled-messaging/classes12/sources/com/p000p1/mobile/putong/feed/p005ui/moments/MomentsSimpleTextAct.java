package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import l.ag3;
import l.e30;
import l.mkd0;
import l.v9j;
import l.vwb;
import p007l.ft00;
import p007l.uzb0;
import rx.c;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsSimpleTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f5429c;

    /* JADX INFO: renamed from: d */
    public VText f5430d;

    /* JADX INFO: renamed from: e */
    public String f5431e;

    /* JADX INFO: renamed from: f */
    public String f5432f;

    /* JADX INFO: renamed from: a2 */
    public static Intent m8225a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsSimpleTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ c m8226b2() {
        return FeedModule.f315c.m1633W3(this.f5431e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m8227c2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m8228d2(Moment moment) {
        this.f5430d.setText(moment.value);
        this.f5430d.setOnClickListener(new View.OnClickListener() { // from class: l.et00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7474a.m8227c2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public View m8229Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ft00.m10321b(this, layoutInflater, viewGroup);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(uzb0.f13987a, uzb0.f13988b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8229Z1(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.ct00
            public final Object call() {
                return this.f6727a.m8226b2();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dt00
            public final void call(Object obj) {
                this.f7049a.m8228d2((Moment) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f5431e = getIntent().getStringExtra("moment id");
        this.f5432f = getIntent().getStringExtra("user id");
        dimStatusBar(true);
        overridePendingTransition(uzb0.f13989c, uzb0.f13990d);
    }

    public List<Object> trackedArgs() {
        return vwb.f0(new Object[]{"moment id", this.f5431e, ag3.c});
    }
}
