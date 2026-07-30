package com.p000p1.mobile.putong.core.p001ui.helpcenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import l.rol;
import p003l.aob0;
import p003l.ynb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class QuestionAndAnswerAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public ynb0 f1991c;

    /* JADX INFO: renamed from: d */
    public aob0 f1992d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m3386V1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) QuestionAndAnswerAct.class);
        intent.putExtra("faq", i);
        intent.putExtra(KnowMyselfShareParams.PARAMS_TITLE, str);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1992d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1991c = new ynb0(this);
        aob0 aob0Var = new aob0(this);
        this.f1992d = aob0Var;
        this.f1991c.C(aob0Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1991c.m11264f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f1991c.m11265i0(getIntent().getIntExtra("faq", 0), getIntent().getStringExtra(KnowMyselfShareParams.PARAMS_TITLE));
        checkGradientColors();
    }

    public List<Object> trackedArgs() {
        return this.f1991c.m11266j0();
    }
}
