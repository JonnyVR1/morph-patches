package com.p046p1.mobile.putong.core.p053ui.helpcenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import java.util.List;
import p149l.aob0;
import p149l.rol;
import p149l.ynb0;

/* JADX INFO: loaded from: classes10.dex */
public class QuestionAndAnswerAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ynb0 f29597c;

    /* JADX INFO: renamed from: d */
    public aob0 f29598d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m46026V1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) QuestionAndAnswerAct.class);
        intent.putExtra("faq", i);
        intent.putExtra("title", str);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29598d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29597c = new ynb0(this);
        aob0 aob0Var = new aob0(this);
        this.f29598d = aob0Var;
        this.f29597c.mo51532C(aob0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29597c.m215404f0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f29597c.m215405i0(getIntent().getIntExtra("faq", 0), getIntent().getStringExtra("title"));
        checkGradientColors();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f29597c.m215406j0();
    }
}
