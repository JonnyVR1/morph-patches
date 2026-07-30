package com.p051p1.mobile.putong.core.p058ui.visitor;

import com.p051p1.mobile.android.app.Act;
import java.util.List;
import p153l.cfm0;
import p153l.jic0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC9208a extends jic0<cfm0> {

    /* JADX INFO: renamed from: c */
    public a f38986c;

    /* JADX INFO: renamed from: d */
    public Act f38987d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        void mo59048e(int i);

        void getData();
    }

    public AbstractC9208a(Act act, a aVar) {
        this.f38987d = act;
        this.f38986c = aVar;
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo59047E(List<cfm0> list);
}
