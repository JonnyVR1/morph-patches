package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.g30;
import p149l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11184a extends dac0<MakeUpMenuView.MakeupCategory> {

    /* JADX INFO: renamed from: c */
    public Context f39844c;

    /* JADX INFO: renamed from: d */
    public int f39845d = 0;

    /* JADX INFO: renamed from: e */
    public List<MakeUpMenuView.MakeupCategory> f39846e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f39847f;

    public C11184a(Context context, int i) {
        this.f39844c = context;
    }

    /* JADX INFO: renamed from: L */
    private void m61741L(int i) {
        int i2 = this.f39845d;
        this.f39845d = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f39845d, 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39846e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f39844c).inflate(o6c0.f142116U, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final MakeUpMenuView.MakeupCategory makeupCategory, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        feedMakeupItemView.m61497b(makeupCategory, i2 == this.f39845d);
        feedMakeupItemView.f39600a.setOnClickListener(new View.OnClickListener() { // from class: l.cv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82630a.m61744H(i2, makeupCategory, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MakeUpMenuView.MakeupCategory getItem(int i) {
        return this.f39846e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m61744H(int i, MakeUpMenuView.MakeupCategory makeupCategory, View view) {
        if (NullChecker.m81303a(this.f39847f)) {
            m61741L(i);
            this.f39847f.mo36055a(makeupCategory, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m61745I(g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f39847f = g30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m61746J(int i) {
        if (i > this.f39846e.size()) {
            i = 0;
        }
        m61741L(i);
        g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f39847f;
        if (g30Var != null) {
            g30Var.mo36055a(this.f39846e.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m61747K(Context context, List<MakeUpMenuView.MakeupCategory> list) {
        this.f39844c = context;
        this.f39846e.clear();
        if (NullChecker.m81303a(list)) {
            this.f39846e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m61748M(int i) {
        this.f39845d = i;
    }
}
