package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.jic0;
import p153l.tec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.e */
/* JADX INFO: loaded from: classes13.dex */
public class C11351e extends jic0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f40719c;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f40720d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f40721e = 0;

    /* JADX INFO: renamed from: f */
    public int f40722f;

    /* JADX INFO: renamed from: g */
    public boolean f40723g;

    /* JADX INFO: renamed from: h */
    public a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f40724h;

    public C11351e(int i) {
        this.f40722f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m62983N(int i) {
        int i2 = this.f40721e;
        this.f40721e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f40721e, 0);
    }

    private Act act() {
        return (Act) this.f40719c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40720d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(tec0.f173585U, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        boolean z = i2 == this.f40721e;
        if (makeupItem.isNone()) {
            feedMakeupItemView.m62682c(makeupItem, z);
        } else {
            int i3 = this.f40722f;
            boolean z2 = this.f40723g;
            if (i3 == 1) {
                feedMakeupItemView.m62684e(makeupItem, z, z2);
            } else {
                feedMakeupItemView.m62683d(makeupItem, z, z2);
            }
        }
        feedMakeupItemView.f40448a.setOnClickListener(new View.OnClickListener() { // from class: l.pdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f151755a.m62987I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public FeedMakeupPageAdapter.MakeupItem m62985G() {
        int i = this.f40721e;
        if (i < 0 || i > this.f40720d.size()) {
            return FeedMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f40720d.size();
        int i2 = this.f40721e;
        return size > i2 ? this.f40720d.get(i2) : FeedMakeupPageAdapter.MakeupItem.none();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f40720d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m62987I(int i, FeedMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f40721e && NullChecker.m82486a(this.f40724h)) {
            m62983N(i);
            this.f40724h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m62988J(int i) {
        this.f40721e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m62989K(a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f40724h = a30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m62990L(int i) {
        int i2;
        if (i >= this.f40720d.size()) {
            i = 0;
        }
        m62983N(i);
        if (!NullChecker.m82486a(this.f40724h) || (i2 = this.f40721e) < 0) {
            return;
        }
        this.f40724h.mo37058a(this.f40720d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m62991M(Context context, List<FeedMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f40723g = z;
        this.f40719c = context;
        this.f40720d.clear();
        if (NullChecker.m82486a(list)) {
            this.f40720d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
