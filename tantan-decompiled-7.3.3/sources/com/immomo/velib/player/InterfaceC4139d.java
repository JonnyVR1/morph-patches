package com.immomo.velib.player;

import p153l.dkl0;

/* JADX INFO: renamed from: com.immomo.velib.player.d */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4139d {

    /* JADX INFO: renamed from: com.immomo.velib.player.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo20527a();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$b */
    public interface b {
        void onCompletion();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$c */
    public interface c {
        boolean onError(InterfaceC4139d interfaceC4139d, int i, String str);
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo20526a();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo20525a(int i, int i2);
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$f */
    public interface f {
        void renderPositionChanged(long j);
    }

    /* JADX INFO: renamed from: c */
    void mo20572c();

    /* JADX INFO: renamed from: d */
    void mo20573d(Object obj);

    /* JADX INFO: renamed from: e */
    void mo20574e(d dVar);

    /* JADX INFO: renamed from: f */
    void mo20575f(int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo20576g(e eVar);

    /* JADX INFO: renamed from: i */
    void mo20578i(dkl0 dkl0Var);

    /* JADX INFO: renamed from: j */
    void mo20579j(b bVar);

    /* JADX INFO: renamed from: k */
    void mo20580k(String str, int i);

    /* JADX INFO: renamed from: l */
    void mo20581l(c cVar);

    /* JADX INFO: renamed from: m */
    void mo20582m(C4136a c4136a);

    /* JADX INFO: renamed from: n */
    void mo20583n(f fVar);

    void prepareAsync();
}
