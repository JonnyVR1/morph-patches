package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import p007l.o6c0;
import p007l.tr00;
import p007l.xr00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsInProfileTextAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CommentCheckMarkView f5402c;

    /* JADX INFO: renamed from: d */
    public tr00 f5403d;

    /* JADX INFO: renamed from: e */
    public xr00 f5404e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8194V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfileTextAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f5404e.inflateView(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(o6c0.f11281p4, viewGroup, false);
        this.f5402c = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewInflateView, commentCheckMarkView, commentCheckMarkView.f5093f);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5403d = new tr00(this);
        xr00 xr00Var = new xr00(this);
        this.f5404e = xr00Var;
        this.f5403d.C(xr00Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5403d.m14610a0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f5403d.m14611m0(menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f5403d.m14617z0(getIntent().getStringExtra("moment id"), getIntent().getStringExtra("user id"));
        super.preCreateView(bundle);
    }

    public boolean shouldShowGradientActionBar() {
        return false;
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public List<Object> trackedArgs() {
        return this.f5403d.m14609A0();
    }
}
