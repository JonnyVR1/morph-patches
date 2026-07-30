package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.g30;
import p149l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.e */
/* JADX INFO: loaded from: classes12.dex */
public class C11188e extends dac0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f39871c;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f39872d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f39873e = 0;

    /* JADX INFO: renamed from: f */
    public int f39874f;

    /* JADX INFO: renamed from: g */
    public boolean f39875g;

    /* JADX INFO: renamed from: h */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f39876h;

    public C11188e(int i) {
        this.f39874f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m61800N(int i) {
        int i2 = this.f39873e;
        this.f39873e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f39873e, 0);
    }

    private Act act() {
        return (Act) this.f39871c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39872d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f142116U, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        boolean z = i2 == this.f39873e;
        if (makeupItem.isNone()) {
            feedMakeupItemView.m61498c(makeupItem, z);
        } else {
            int i3 = this.f39874f;
            boolean z2 = this.f39875g;
            if (i3 == 1) {
                feedMakeupItemView.m61500e(makeupItem, z, z2);
            } else {
                feedMakeupItemView.m61499d(makeupItem, z, z2);
            }
        }
        feedMakeupItemView.f39600a.setOnClickListener(new View.OnClickListener() { // from class: l.ach
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f68803a.m61804I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public FeedMakeupPageAdapter.MakeupItem m61802G() {
        int i = this.f39873e;
        if (i < 0 || i > this.f39872d.size()) {
            return FeedMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f39872d.size();
        int i2 = this.f39873e;
        return size > i2 ? this.f39872d.get(i2) : FeedMakeupPageAdapter.MakeupItem.none();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f39872d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m61804I(int i, FeedMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f39873e && NullChecker.m81303a(this.f39876h)) {
            m61800N(i);
            this.f39876h.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m61805J(int i) {
        this.f39873e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m61806K(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f39876h = g30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m61807L(int i) {
        int i2;
        if (i >= this.f39872d.size()) {
            i = 0;
        }
        m61800N(i);
        if (!NullChecker.m81303a(this.f39876h) || (i2 = this.f39873e) < 0) {
            return;
        }
        this.f39876h.mo36055a(this.f39872d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m61808M(Context context, List<FeedMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f39875g = z;
        this.f39871c = context;
        this.f39872d.clear();
        if (NullChecker.m81303a(list)) {
            this.f39872d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
