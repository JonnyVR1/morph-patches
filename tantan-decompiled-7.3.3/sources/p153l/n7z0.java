package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class n7z0 implements gku0 {

    /* JADX INFO: renamed from: a */
    public static final fpw0 f140641a = ipw0.m141543a(new fpw0() { // from class: l.l7z0
        @Override // p153l.fpw0
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                if (objInvoke != null) {
                    return (gku0) objInvoke;
                }
                throw null;
            } catch (Exception e) {
                xpg0.m212648a(e);
                return null;
            }
        }
    });

    public /* synthetic */ n7z0(m7z0 m7z0Var) {
    }
}
