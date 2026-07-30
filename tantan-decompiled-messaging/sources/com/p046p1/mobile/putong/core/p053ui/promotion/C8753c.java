package com.p046p1.mobile.putong.core.p053ui.promotion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import java.util.List;
import p149l.m6c0;
import p149l.s7m;
import p149l.z4c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.c */
/* JADX INFO: loaded from: classes4.dex */
public class C8753c implements s7m<C8752b> {

    /* JADX INFO: renamed from: a */
    public final Act f34336a;

    /* JADX INFO: renamed from: b */
    public C8752b f34337b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f34338c;

    /* JADX INFO: renamed from: d */
    public C8751a f34339d;

    public C8753c(Act act) {
        this.f34336a = act;
    }

    /* JADX INFO: renamed from: b */
    private void m53083b(View view) {
        this.f34338c = (RecyclerView) view.findViewById(z4c0.f201577z0);
        this.f34339d = new C8751a(act());
        this.f34338c.setLayoutManager(new LinearLayoutManager(this.f34336a));
        this.f34338c.setAdapter(this.f34339d);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f34336a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8752b c8752b) {
        this.f34337b = c8752b;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f34336a;
    }

    /* JADX INFO: renamed from: c */
    public void m53085c(List<C8752b.a> list) {
        this.f34339d.m53077H(list);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131471D1, viewGroup, false);
        m53083b(viewInflate);
        return viewInflate;
    }
}
