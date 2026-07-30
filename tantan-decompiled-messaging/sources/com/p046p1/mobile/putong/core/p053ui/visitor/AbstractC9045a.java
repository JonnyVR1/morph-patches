package com.p046p1.mobile.putong.core.p053ui.visitor;

import com.p046p1.mobile.android.app.Act;
import java.util.List;
import p149l.dac0;
import p149l.y5m0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC9045a extends dac0<y5m0> {

    /* JADX INFO: renamed from: c */
    public a f38138c;

    /* JADX INFO: renamed from: d */
    public Act f38139d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.a$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        void mo57865e(int i);

        void getData();
    }

    public AbstractC9045a(Act act, a aVar) {
        this.f38139d = act;
        this.f38138c = aVar;
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo57864E(List<y5m0> list);
}
