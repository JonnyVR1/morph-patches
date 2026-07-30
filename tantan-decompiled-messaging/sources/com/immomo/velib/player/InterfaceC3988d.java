package com.immomo.velib.player;

import p149l.zal0;

/* JADX INFO: renamed from: com.immomo.velib.player.d */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC3988d {

    /* JADX INFO: renamed from: com.immomo.velib.player.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19528a();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$b */
    public interface b {
        void onCompletion();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$c */
    public interface c {
        boolean onError(InterfaceC3988d interfaceC3988d, int i, String str);
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo19527a();
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo19526a(int i, int i2);
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.d$f */
    public interface f {
        void renderPositionChanged(long j);
    }

    /* JADX INFO: renamed from: c */
    void mo19573c();

    /* JADX INFO: renamed from: d */
    void mo19574d(Object obj);

    /* JADX INFO: renamed from: e */
    void mo19575e(d dVar);

    /* JADX INFO: renamed from: f */
    void mo19576f(int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo19577g(e eVar);

    /* JADX INFO: renamed from: i */
    void mo19579i(zal0 zal0Var);

    /* JADX INFO: renamed from: j */
    void mo19580j(b bVar);

    /* JADX INFO: renamed from: k */
    void mo19581k(String str, int i);

    /* JADX INFO: renamed from: l */
    void mo19582l(c cVar);

    /* JADX INFO: renamed from: m */
    void mo19583m(C3985a c3985a);

    /* JADX INFO: renamed from: n */
    void mo19584n(f fVar);

    void prepareAsync();
}
