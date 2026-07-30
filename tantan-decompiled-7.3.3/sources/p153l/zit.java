package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class zit extends hyr {
    public zit(String str) {
        super(str);
    }

    @Override // p153l.hyr
    /* JADX INFO: renamed from: c */
    public boolean mo137768c(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: renamed from: g */
    public String m219937g(String str) {
        return this.f112156c.get(str);
    }

    /* JADX INFO: renamed from: h */
    public boolean m219938h(String str) {
        return str.startsWith("tantanapp://voice-live/room/");
    }
}
