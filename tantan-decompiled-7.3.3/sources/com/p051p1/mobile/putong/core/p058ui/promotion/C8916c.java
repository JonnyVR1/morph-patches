package com.p051p1.mobile.putong.core.p058ui.promotion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import java.util.List;
import p153l.fdc0;
import p153l.iam;
import p153l.rec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.c */
/* JADX INFO: loaded from: classes4.dex */
public class C8916c implements iam<C8915b> {

    /* JADX INFO: renamed from: a */
    public final Act f35184a;

    /* JADX INFO: renamed from: b */
    public C8915b f35185b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f35186c;

    /* JADX INFO: renamed from: d */
    public C8914a f35187d;

    public C8916c(Act act) {
        this.f35184a = act;
    }

    /* JADX INFO: renamed from: b */
    private void m54266b(View view) {
        this.f35186c = (RecyclerView) view.findViewById(fdc0.f98453z0);
        this.f35187d = new C8914a(act());
        this.f35186c.setLayoutManager(new LinearLayoutManager(this.f35184a));
        this.f35186c.setAdapter(this.f35187d);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f35184a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8915b c8915b) {
        this.f35185b = c8915b;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f35184a;
    }

    /* JADX INFO: renamed from: c */
    public void m54268c(List<C8915b.a> list) {
        this.f35187d.m54260H(list);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162431D1, viewGroup, false);
        m54266b(viewInflate);
        return viewInflate;
    }
}
