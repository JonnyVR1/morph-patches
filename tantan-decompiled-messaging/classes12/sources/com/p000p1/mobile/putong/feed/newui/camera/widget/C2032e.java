package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.g30;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2032e extends dac0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f1332c;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f1333d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f1334e = 0;

    /* JADX INFO: renamed from: f */
    public int f1335f;

    /* JADX INFO: renamed from: g */
    public boolean f1336g;

    /* JADX INFO: renamed from: h */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f1337h;

    public C2032e(int i) {
        this.f1335f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m2761N(int i) {
        int i2 = this.f1334e;
        this.f1334e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f1334e, 0);
    }

    private Act act() {
        return this.f1332c;
    }

    /* JADX INFO: renamed from: C */
    public int m2763C() {
        return this.f1333d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m2764D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f11135U, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m2762A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        FeedMakeupItemView feedMakeupItemView = (FeedMakeupItemView) view;
        boolean z = i2 == this.f1334e;
        if (makeupItem.isNone()) {
            feedMakeupItemView.m2450c(makeupItem, z);
        } else {
            int i3 = this.f1335f;
            boolean z2 = this.f1336g;
            if (i3 == 1) {
                feedMakeupItemView.m2452e(makeupItem, z, z2);
            } else {
                feedMakeupItemView.m2451d(makeupItem, z, z2);
            }
        }
        feedMakeupItemView.f1061a.setOnClickListener(new View.OnClickListener() { // from class: l.ach
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5709a.m2768I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public FeedMakeupPageAdapter.MakeupItem m2766G() {
        int i = this.f1334e;
        if (i < 0 || i > this.f1333d.size()) {
            return FeedMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f1333d.size();
        int i2 = this.f1334e;
        return size > i2 ? this.f1333d.get(i2) : FeedMakeupPageAdapter.MakeupItem.none();
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f1333d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m2768I(int i, FeedMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f1334e && NullChecker.a(this.f1337h)) {
            m2761N(i);
            this.f1337h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m2769J(int i) {
        this.f1334e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m2770K(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f1337h = g30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m2771L(int i) {
        int i2;
        if (i >= this.f1333d.size()) {
            i = 0;
        }
        m2761N(i);
        if (!NullChecker.a(this.f1337h) || (i2 = this.f1334e) < 0) {
            return;
        }
        this.f1337h.a(this.f1333d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m2772M(Context context, List<FeedMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f1336g = z;
        this.f1332c = context;
        this.f1333d.clear();
        if (NullChecker.a(list)) {
            this.f1333d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
