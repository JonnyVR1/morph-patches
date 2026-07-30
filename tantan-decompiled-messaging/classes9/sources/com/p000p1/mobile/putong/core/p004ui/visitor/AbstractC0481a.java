package com.p000p1.mobile.putong.core.p004ui.visitor;

import com.p1.mobile.android.app.Act;
import java.util.List;
import l.dac0;
import p006l.y5m0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class AbstractC0481a extends dac0<y5m0> {

    /* JADX INFO: renamed from: c */
    public a f7919c;

    /* JADX INFO: renamed from: d */
    public Act f7920d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        void mo11374e(int i);

        void getData();
    }

    public AbstractC0481a(Act act, a aVar) {
        this.f7920d = act;
        this.f7919c = aVar;
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo11373E(List<y5m0> list);
}
