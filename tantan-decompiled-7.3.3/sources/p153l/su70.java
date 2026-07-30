package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class su70 {
    /* JADX INFO: renamed from: a */
    public static void m187993a(i6t i6tVar, boolean z, boolean z2) {
        n180.m161093j("PkDialogRenderEvent renderCardsDialog visible:" + z2);
        i6tVar.m213811F2().LivePkEvent.showPkDialog().mo199273j(new hct(z ? 5 : 6, z2));
    }

    /* JADX INFO: renamed from: b */
    public static void m187994b(i6t i6tVar, boolean z) {
        n180.m161093j("PkDialogRenderEvent renderFriendDialog visible:" + z);
        i6tVar.m213811F2().LivePkEvent.showPkDialog().mo199273j(new hct(3, z));
    }

    /* JADX INFO: renamed from: c */
    public static void m187995c(i6t i6tVar, boolean z) {
        n180.m161093j("PkDialogRenderEvent renderInviteDialog visible:" + z);
        i6tVar.m213811F2().LivePkEvent.showPkDialog().mo199273j(new hct(4, z));
    }

    /* JADX INFO: renamed from: d */
    public static void m187996d(i6t i6tVar, boolean z) {
        n180.m161093j("PkDialogRenderEvent renderMatchDialog visible:" + z);
        i6tVar.m213811F2().LivePkEvent.showPkDialog().mo199273j(new hct(2, z));
    }

    /* JADX INFO: renamed from: e */
    public static void m187997e(i6t i6tVar, boolean z) {
        n180.m161093j("PkDialogRenderEvent renderMenuDialog visible:" + z);
        i6tVar.m213811F2().LivePkEvent.showPkDialog().mo199273j(new hct(1, z));
    }
}
