package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import p153l.dmk0;
import p153l.s8j0;
import p153l.u8j0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class TopicFeedListAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public u8j0 f44065c;

    /* JADX INFO: renamed from: d */
    public s8j0 f44066d;

    /* JADX INFO: renamed from: e */
    public MenuItem f44067e;

    /* JADX INFO: renamed from: f */
    public y20<MenuItem> f44068f = dmk0.m116962a(500, new y20() { // from class: l.f8j0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f97743a.m67297Z1((MenuItem) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ boolean m67295a2(MenuItem menuItem) {
        this.f44068f.call(menuItem);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public boolean m67297Z1(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_topics", this.f44066d.f166830a);
        intent.putExtras(bundle);
        setResult(-1, intent);
        m68056e2();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44065c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f44065c = new u8j0(this);
        s8j0 s8j0Var = new s8j0(this);
        this.f44066d = s8j0Var;
        s8j0Var.mo52715C(this.f44065c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44066d.mo40473a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(this.act.getString(R$string.f39921i))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.e8j0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f92547a.m67295a2(menuItem);
            }
        });
        this.f44067e = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        FeedModule.f39703d.m145587Pb().mo144677l(this);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_pick_topic";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f44066d.m185089A0(getIntent().getExtras());
    }
}
