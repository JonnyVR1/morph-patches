package com.p000p1.mobile.putong.core.p001ui.promotion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.m6c0;
import l.s7m;
import l.z4c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0178c implements s7m<C0177b> {

    /* JADX INFO: renamed from: a */
    public final Act f2158a;

    /* JADX INFO: renamed from: b */
    public C0177b f2159b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f2160c;

    /* JADX INFO: renamed from: d */
    public C0176a f2161d;

    public C0178c(Act act) {
        this.f2158a = act;
    }

    /* JADX INFO: renamed from: b */
    private void m3647b(View view) {
        this.f2160c = view.findViewById(z4c0.z0);
        this.f2161d = new C0176a(act());
        this.f2160c.setLayoutManager(new LinearLayoutManager(this.f2158a));
        this.f2160c.setAdapter(this.f2161d);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3648C0() {
        return this.f2158a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m3651i1(C0177b c0177b) {
        this.f2159b = c0177b;
    }

    @Nullable
    public Act act() {
        return this.f2158a;
    }

    /* JADX INFO: renamed from: c */
    public void m3650c(List<C0177b.a> list) {
        this.f2161d.m3640H(list);
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.D1, viewGroup, false);
        m3647b(viewInflate);
        return viewInflate;
    }
}
