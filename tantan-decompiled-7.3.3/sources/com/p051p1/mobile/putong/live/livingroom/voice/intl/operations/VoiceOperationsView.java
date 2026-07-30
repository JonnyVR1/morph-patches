package com.p051p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.efo0;
import p153l.iam;
import p153l.jfo0;
import p153l.jyb;
import p153l.mdc0;
import p153l.qa00;
import p153l.qfo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceOperationsView extends FrameLayout implements iam<qfo0> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f54162a;

    /* JADX INFO: renamed from: b */
    public qfo0 f54163b;

    /* JADX INFO: renamed from: c */
    public jfo0 f54164c;

    public VoiceOperationsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m79510d() {
        this.f54162a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        jfo0 jfo0Var = new jfo0();
        this.f54164c = jfo0Var;
        this.f54162a.setAdapter(jfo0Var);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m79511b(FrameLayout frameLayout, int i) {
        if (!bnl0.m105529O0(this) || i == 0) {
            bnl0.m105540X(frameLayout, qa00.m175859d(5.0f));
        } else {
            bnl0.m105540X(frameLayout, qa00.m175859d(5.0f) + qa00.m175859d(6.0f) + i);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qfo0 qfo0Var) {
        this.f54163b = qfo0Var;
        jfo0 jfo0Var = this.f54164c;
        if (jfo0Var != null) {
            jfo0Var.m144698f0(qfo0Var);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        bnl0.m105524M(this, false);
        jfo0 jfo0Var = this.f54164c;
        if (jfo0Var != null) {
            jfo0Var.m144697e0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79513e(IntlLiveOperationItemBean intlLiveOperationItemBean, efo0 efo0Var, View view) {
        qfo0 qfo0Var = this.f54163b;
        if (qfo0Var != null) {
            qfo0Var.m176386S3(intlLiveOperationItemBean);
            efo0Var.m120704K(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79514f(List<IntlLiveOperationItemBean> list, FrameLayout frameLayout, int i) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            jfo0 jfo0Var = this.f54164c;
            if (jfo0Var != null) {
                jfo0Var.m144697e0();
            }
            m79511b(frameLayout, i);
            return;
        }
        setData(list);
        if (list.size() > 3) {
            bnl0.m105507D0(qa00.m175859d(120.0f), this.f54162a);
        } else {
            bnl0.m105507D0(qa00.m175859d(132.0f), this.f54162a);
        }
        bnl0.m105524M(this, true);
        m79511b(frameLayout, i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54162a = (RecyclerView) findViewById(mdc0.f136086W4);
        m79510d();
    }

    public void setData(List<IntlLiveOperationItemBean> list) {
        if (this.f54164c == null) {
            return;
        }
        if (jyb.m147479J(list)) {
            this.f54164c.m144697e0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final IntlLiveOperationItemBean intlLiveOperationItemBean : list) {
            final efo0 efo0Var = new efo0(this.f54164c, intlLiveOperationItemBean);
            efo0Var.mo113881A(new View.OnClickListener() { // from class: l.rfo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162821a.m79513e(intlLiveOperationItemBean, efo0Var, view);
                }
            });
            arrayList.add(efo0Var);
        }
        this.f54164c.m68555a0(arrayList, false);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
