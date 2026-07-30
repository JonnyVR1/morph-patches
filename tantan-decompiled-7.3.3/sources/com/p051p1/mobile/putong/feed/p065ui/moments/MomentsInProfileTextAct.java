package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import java.util.List;
import p153l.c010;
import p153l.g010;
import p153l.tec0;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInProfileTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CommentCheckMarkView f44789c;

    /* JADX INFO: renamed from: d */
    public c010 f44790d;

    /* JADX INFO: renamed from: e */
    public g010 f44791e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m68175X1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f44791e.inflateView(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(tec0.f173731p4, viewGroup, false);
        this.f44789c = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewInflateView, commentCheckMarkView, commentCheckMarkView.f44480f);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f44790d = new c010(this);
        g010 g010Var = new g010(this);
        this.f44791e = g010Var;
        this.f44790d.mo52715C(g010Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44790d.mo40473a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f44790d.m107294m0(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f44790d.m107300z0(getIntent().getStringExtra("moment id"), getIntent().getStringExtra("user id"));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f44790d.m107293A0();
    }
}
