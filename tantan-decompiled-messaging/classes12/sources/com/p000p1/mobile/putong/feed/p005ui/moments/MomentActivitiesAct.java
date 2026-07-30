package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.app.PutongAct;
import java.util.ArrayList;
import l.d30;
import l.j760;
import l.vwb;
import p007l.m800;
import p007l.w800;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentActivitiesAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public m800 f5122c;

    /* JADX INFO: renamed from: d */
    public w800 f5123d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m7833X1(Context context, String str) {
        return new Intent(context, (Class<?>) MomentActivitiesAct.class);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.Y("activity poll", new d30() { // from class: l.g800
            public final void call() {
                FeedModule.f315c.m1624S2();
            }
        }));
        return arrayListDebugItems;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5123d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5122c = new m800(this);
        w800 w800Var = new w800(this);
        this.f5123d = w800Var;
        this.f5122c.C(w800Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5122c.m11841a0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f5123d.m15736i(menu);
        return true;
    }

    public String pageId() {
        return "p_my_interactions_notification_view";
    }
}
