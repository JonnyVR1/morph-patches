package p149l;

/* JADX INFO: loaded from: classes5.dex */
public class mm70 {
    /* JADX INFO: renamed from: a */
    public static void m155305a(h4t h4tVar, boolean z, boolean z2) {
        ht70.m132853j("PkDialogRenderEvent renderCardsDialog visible:" + z2);
        h4tVar.m206028F2().LivePkEvent.showPkDialog().mo172463j(new gat(z ? 5 : 6, z2));
    }

    /* JADX INFO: renamed from: b */
    public static void m155306b(h4t h4tVar, boolean z) {
        ht70.m132853j("PkDialogRenderEvent renderFriendDialog visible:" + z);
        h4tVar.m206028F2().LivePkEvent.showPkDialog().mo172463j(new gat(3, z));
    }

    /* JADX INFO: renamed from: c */
    public static void m155307c(h4t h4tVar, boolean z) {
        ht70.m132853j("PkDialogRenderEvent renderInviteDialog visible:" + z);
        h4tVar.m206028F2().LivePkEvent.showPkDialog().mo172463j(new gat(4, z));
    }

    /* JADX INFO: renamed from: d */
    public static void m155308d(h4t h4tVar, boolean z) {
        ht70.m132853j("PkDialogRenderEvent renderMatchDialog visible:" + z);
        h4tVar.m206028F2().LivePkEvent.showPkDialog().mo172463j(new gat(2, z));
    }

    /* JADX INFO: renamed from: e */
    public static void m155309e(h4t h4tVar, boolean z) {
        ht70.m132853j("PkDialogRenderEvent renderMenuDialog visible:" + z);
        h4tVar.m206028F2().LivePkEvent.showPkDialog().mo172463j(new gat(1, z));
    }
}
