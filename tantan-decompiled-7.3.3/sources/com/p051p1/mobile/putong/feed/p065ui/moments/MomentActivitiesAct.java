package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import p153l.fh00;
import p153l.jyb;
import p153l.pf60;
import p153l.vg00;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public vg00 f44509c;

    /* JADX INFO: renamed from: d */
    public fh00 f44510d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m67825Y1(Context context, String str) {
        return new Intent(context, (Class<?>) MomentActivitiesAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("activity poll", new x20() { // from class: l.pg00
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39702c.m61882S2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44510d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f44509c = new vg00(this);
        fh00 fh00Var = new fh00(this);
        this.f44510d = fh00Var;
        this.f44509c.mo52715C(fh00Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44509c.mo40473a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f44510d.m125545i(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_my_interactions_notification_view";
    }
}
