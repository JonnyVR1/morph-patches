package com.p051p1.mobile.putong.core.newui.home.card.expanded.base;

import android.view.View;
import p153l.dmf;
import p153l.o4m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.base.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8100a implements o4m {

    /* JADX INFO: renamed from: a */
    public dmf f23134a;

    /* JADX INFO: renamed from: b */
    public boolean f23135b = false;

    /* JADX INFO: renamed from: c */
    public int f23136c;

    /* JADX INFO: renamed from: d */
    public int f23137d;

    /* JADX INFO: renamed from: e */
    public int f23138e;

    /* JADX INFO: renamed from: f */
    public int f23139f;

    /* JADX INFO: renamed from: g */
    public int f23140g;

    /* JADX INFO: renamed from: h */
    public int f23141h;

    /* JADX INFO: renamed from: i */
    public int f23142i;

    /* JADX INFO: renamed from: j */
    public int f23143j;

    /* JADX INFO: renamed from: k */
    public int f23144k;

    /* JADX INFO: renamed from: l */
    public int f23145l;

    /* JADX INFO: renamed from: m */
    public BaseExpandedView.ExpandedItemStatus f23146m;

    /* JADX INFO: renamed from: n */
    public boolean f23147n;

    /* JADX INFO: renamed from: o */
    public int f23148o;

    public C8100a(int i) {
        BaseExpandedView.ExpandedItemStatus expandedItemStatus = BaseExpandedView.ExpandedItemStatus.IDLE;
        this.f23147n = false;
        this.f23146m = expandedItemStatus;
        this.f23148o = i;
    }

    /* JADX INFO: renamed from: a */
    public dmf m39085a() {
        return this.f23134a;
    }

    /* JADX INFO: renamed from: b */
    public BaseExpandedView.ExpandedItemStatus m39086b() {
        return this.f23146m;
    }

    @Override // p153l.o4m
    public int getType() {
        return this.f23148o;
    }

    @Override // p153l.o4m
    public View getView() {
        dmf dmfVar = this.f23134a;
        if (dmfVar != null) {
            return dmfVar.f89621a;
        }
        return null;
    }
}
