package com.p051p1.mobile.putong.core.p058ui.helpcenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import java.util.List;
import p153l.crl;
import p153l.cwb0;
import p153l.ewb0;

/* JADX INFO: loaded from: classes3.dex */
public class QuestionAndAnswerAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public cwb0 f30445c;

    /* JADX INFO: renamed from: d */
    public ewb0 f30446d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m47209X1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) QuestionAndAnswerAct.class);
        intent.putExtra("faq", i);
        intent.putExtra("title", str);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30446d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30445c = new cwb0(this);
        ewb0 ewb0Var = new ewb0(this);
        this.f30446d = ewb0Var;
        this.f30445c.mo52715C(ewb0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30445c.m112898f0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f30445c.m112899i0(getIntent().getIntExtra("faq", 0), getIntent().getStringExtra("title"));
        checkGradientColors();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f30445c.m112900j0();
    }
}
