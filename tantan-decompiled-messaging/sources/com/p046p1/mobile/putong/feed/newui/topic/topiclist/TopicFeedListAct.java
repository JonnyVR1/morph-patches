package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import p149l.e30;
import p149l.ozi0;
import p149l.qzi0;
import p149l.xck0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicFeedListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public qzi0 f43217c;

    /* JADX INFO: renamed from: d */
    public ozi0 f43218d;

    /* JADX INFO: renamed from: e */
    public MenuItem f43219e;

    /* JADX INFO: renamed from: f */
    public e30<MenuItem> f43220f = xck0.m208120a(500, new e30() { // from class: l.bzi0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f78038a.m66114Y1((MenuItem) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ boolean m66112Z1(MenuItem menuItem) {
        this.f43220f.call(menuItem);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public boolean m66114Y1(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_topics", this.f43218d.f146455a);
        intent.putExtras(bundle);
        setResult(-1, intent);
        m66873d2();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43217c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43217c = new qzi0(this);
        ozi0 ozi0Var = new ozi0(this);
        this.f43218d = ozi0Var;
        ozi0Var.mo51532C(this.f43217c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43218d.mo39470a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(this.act.getString(R$string.f39073i))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.azi0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f72358a.m66112Z1(menuItem);
            }
        });
        this.f43219e = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        FeedModule.f38855d.m209346Pb().mo193140l(this);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_pick_topic";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f43218d.m166854A0(getIntent().getExtras());
    }
}
