package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.xck0;
import p007l.ozi0;
import p007l.qzi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicFeedListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public qzi0 f4678c;

    /* JADX INFO: renamed from: d */
    public ozi0 f4679d;

    /* JADX INFO: renamed from: e */
    public MenuItem f4680e;

    /* JADX INFO: renamed from: f */
    public e30<MenuItem> f4681f = xck0.a(500, new e30() { // from class: l.bzi0
        public final void call(Object obj) {
            this.f6477a.m7266Y1((MenuItem) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ boolean m7264Z1(MenuItem menuItem) {
        this.f4681f.call(menuItem);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public boolean m7266Y1(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_topics", this.f4679d.f11655a);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4678c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f4678c = new qzi0(this);
        ozi0 ozi0Var = new ozi0(this);
        this.f4679d = ozi0Var;
        ozi0Var.C(this.f4678c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f4679d.m12890a0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(((Act) this).act.getString(R$string.f534i))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.azi0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f5877a.m7264Z1(menuItem);
            }
        });
        this.f4680e = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        FeedModule.f316d.m16527Pb().mo15085l(this);
        return true;
    }

    public String pageId() {
        return "p_pick_topic";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f4679d.m12888A0(getIntent().getExtras());
    }
}
