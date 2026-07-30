package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.g30;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2028a extends dac0<MakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f1305c;

    /* JADX INFO: renamed from: d */
    public int f1306d = 0;

    /* JADX INFO: renamed from: e */
    public List<MakeUpMenuView.MakeupCategory> f1307e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f1308f;

    public C2028a(Context context, int i) {
        this.f1305c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m2693L(int i) {
        int i2 = this.f1306d;
        this.f1306d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f1306d, 0);
    }

    /* JADX INFO: renamed from: C */
    public int m2695C() {
        return this.f1307e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m2696D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f1305c).inflate(o6c0.f11135U, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m2694A(View view, final MakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        feedMakeupItemView.m2449b(makeupCategory, i2 == this.f1306d);
        feedMakeupItemView.f1061a.setOnClickListener(new View.OnClickListener() { // from class: l.cv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6733a.m2699H(i2, makeupCategory, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f1307e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m2699H(int i, MakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.a(this.f1308f)) {
            m2693L(i);
            this.f1308f.a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m2700I(g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f1308f = g30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m2701J(int i) {
        if (i > this.f1307e.size()) {
            i = 0;
        }
        m2693L(i);
        g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f1308f;
        if (g30Var != null) {
            g30Var.a(this.f1307e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m2702K(Context context, List<MakeUpMenuView.MakeupCategory> list) {
        this.f1305c = context;
        this.f1307e.clear();
        if (NullChecker.a(list)) {
            this.f1307e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m2703M(int i) {
        this.f1306d = i;
    }
}
