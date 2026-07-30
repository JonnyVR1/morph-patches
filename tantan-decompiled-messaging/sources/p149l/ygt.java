package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class ygt extends gwr {
    public ygt(String str) {
        super(str);
    }

    @Override // p149l.gwr
    /* JADX INFO: renamed from: c */
    public boolean mo128507c(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: renamed from: g */
    public String m214763g(String str) {
        return this.f104771c.get(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m214764h(String str) {
        return str.startsWith("tantanapp://voice-live/room/");
    }
}
