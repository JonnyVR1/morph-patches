package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import java.util.List;
import p149l.o6c0;
import p149l.tr00;
import p149l.xr00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsInProfileTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CommentCheckMarkView f43941c;

    /* JADX INFO: renamed from: d */
    public tr00 f43942d;

    /* JADX INFO: renamed from: e */
    public xr00 f43943e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66992V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f43943e.inflateView(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(o6c0.f142262p4, viewGroup, false);
        this.f43941c = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewInflateView, commentCheckMarkView, commentCheckMarkView.f43632f);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43942d = new tr00(this);
        xr00 xr00Var = new xr00(this);
        this.f43943e = xr00Var;
        this.f43942d.mo51532C(xr00Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43942d.mo39470a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f43942d.m190359m0(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f43942d.m190365z0(getIntent().getStringExtra("moment id"), getIntent().getStringExtra("user id"));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43942d.m190358A0();
    }
}
