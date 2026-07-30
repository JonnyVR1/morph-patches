package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.jic0;
import p153l.tec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11347a extends jic0<MakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f40692c;

    /* JADX INFO: renamed from: d */
    public int f40693d = 0;

    /* JADX INFO: renamed from: e */
    public List<MakeUpMenuView.MakeupCategory> f40694e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f40695f;

    public C11347a(Context context, int i) {
        this.f40692c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m62924L(int i) {
        int i2 = this.f40693d;
        this.f40693d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f40693d, 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40694e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f40692c).inflate(tec0.f173585U, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final MakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        feedMakeupItemView.m62681b(makeupCategory, i2 == this.f40693d);
        feedMakeupItemView.f40448a.setOnClickListener(new View.OnClickListener() { // from class: l.sv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f170787a.m62927H(i2, makeupCategory, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f40694e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m62927H(int i, MakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.m82486a(this.f40695f)) {
            m62924L(i);
            this.f40695f.mo37058a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m62928I(a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var) {
        this.f40695f = a30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m62929J(int i) {
        if (i > this.f40694e.size()) {
            i = 0;
        }
        m62924L(i);
        a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var = this.f40695f;
        if (a30Var != null) {
            a30Var.mo37058a(this.f40694e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m62930K(Context context, List<MakeUpMenuView.MakeupCategory> list) {
        this.f40692c = context;
        this.f40694e.clear();
        if (NullChecker.m82486a(list)) {
            this.f40694e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m62931M(int i) {
        this.f40693d = i;
    }
}
