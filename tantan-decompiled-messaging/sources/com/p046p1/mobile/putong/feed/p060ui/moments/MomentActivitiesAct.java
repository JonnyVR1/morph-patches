package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import p149l.d30;
import p149l.j760;
import p149l.m800;
import p149l.vwb;
import p149l.w800;

/* JADX INFO: loaded from: classes12.dex */
public class MomentActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public m800 f43661c;

    /* JADX INFO: renamed from: d */
    public w800 f43662d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66642X1(Context context, String str) {
        return new Intent(context, (Class<?>) MomentActivitiesAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("activity poll", new d30() { // from class: l.g800
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38854c.m60698S2();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43662d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43661c = new m800(this);
        w800 w800Var = new w800(this);
        this.f43662d = w800Var;
        this.f43661c.mo51532C(w800Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43661c.mo39470a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f43662d.m202094i(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_my_interactions_notification_view";
    }
}
