package com.p046p1.mobile.putong.core.newui.home.card.expanded.base;

import android.view.View;
import p149l.v1m;
import p149l.xkf;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.a */
/* JADX INFO: loaded from: classes11.dex */
public class C7949a implements v1m {

    /* JADX INFO: renamed from: a */
    public xkf f22392a;

    /* JADX INFO: renamed from: b */
    public boolean f22393b = false;

    /* JADX INFO: renamed from: c */
    public int f22394c;

    /* JADX INFO: renamed from: d */
    public int f22395d;

    /* JADX INFO: renamed from: e */
    public int f22396e;

    /* JADX INFO: renamed from: f */
    public int f22397f;

    /* JADX INFO: renamed from: g */
    public int f22398g;

    /* JADX INFO: renamed from: h */
    public int f22399h;

    /* JADX INFO: renamed from: i */
    public int f22400i;

    /* JADX INFO: renamed from: j */
    public int f22401j;

    /* JADX INFO: renamed from: k */
    public int f22402k;

    /* JADX INFO: renamed from: l */
    public int f22403l;

    /* JADX INFO: renamed from: m */
    public BaseExpandedView.ExpandedItemStatus f22404m;

    /* JADX INFO: renamed from: n */
    public boolean f22405n;

    /* JADX INFO: renamed from: o */
    public int f22406o;

    public C7949a(int i) {
        BaseExpandedView.ExpandedItemStatus expandedItemStatus = BaseExpandedView.ExpandedItemStatus.IDLE;
        this.f22405n = false;
        this.f22404m = expandedItemStatus;
        this.f22406o = i;
    }

    /* JADX INFO: renamed from: a */
    public xkf m38082a() {
        return this.f22392a;
    }

    /* JADX INFO: renamed from: b */
    public BaseExpandedView.ExpandedItemStatus m38083b() {
        return this.f22404m;
    }

    @Override // p149l.v1m
    public int getType() {
        return this.f22406o;
    }

    @Override // p149l.v1m
    public View getView() {
        xkf xkfVar = this.f22392a;
        if (xkfVar != null) {
            return xkfVar.f193287a;
        }
        return null;
    }
}
