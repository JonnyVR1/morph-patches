package com.p000p1.mobile.putong.core.newui.home.card.expanded.base;

import android.view.View;
import p009l.v1m;
import p009l.xkf;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0113a implements v1m {

    /* JADX INFO: renamed from: a */
    public xkf f1170a;

    /* JADX INFO: renamed from: b */
    public boolean f1171b = false;

    /* JADX INFO: renamed from: c */
    public int f1172c;

    /* JADX INFO: renamed from: d */
    public int f1173d;

    /* JADX INFO: renamed from: e */
    public int f1174e;

    /* JADX INFO: renamed from: f */
    public int f1175f;

    /* JADX INFO: renamed from: g */
    public int f1176g;

    /* JADX INFO: renamed from: h */
    public int f1177h;

    /* JADX INFO: renamed from: i */
    public int f1178i;

    /* JADX INFO: renamed from: j */
    public int f1179j;

    /* JADX INFO: renamed from: k */
    public int f1180k;

    /* JADX INFO: renamed from: l */
    public int f1181l;

    /* JADX INFO: renamed from: m */
    public BaseExpandedView.ExpandedItemStatus f1182m;

    /* JADX INFO: renamed from: n */
    public boolean f1183n;

    /* JADX INFO: renamed from: o */
    public int f1184o;

    public C0113a(int i) {
        BaseExpandedView.ExpandedItemStatus expandedItemStatus = BaseExpandedView.ExpandedItemStatus.IDLE;
        this.f1183n = false;
        this.f1182m = expandedItemStatus;
        this.f1184o = i;
    }

    /* JADX INFO: renamed from: a */
    public xkf m2056a() {
        return this.f1170a;
    }

    /* JADX INFO: renamed from: b */
    public BaseExpandedView.ExpandedItemStatus m2057b() {
        return this.f1182m;
    }

    @Override // p009l.v1m
    public int getType() {
        return this.f1184o;
    }

    @Override // p009l.v1m
    public View getView() {
        xkf xkfVar = this.f1170a;
        if (xkfVar != null) {
            return xkfVar.f22639a;
        }
        return null;
    }
}
