package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class hyy0 implements abu0 {

    /* JADX INFO: renamed from: a */
    public static final zfw0 f110159a = cgw0.m106842a(new zfw0() { // from class: l.fyy0
        @Override // p149l.zfw0
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                if (objInvoke != null) {
                    return (abu0) objInvoke;
                }
                throw null;
            } catch (Exception e) {
                phg0.m168968a(e);
                return null;
            }
        }
    });

    public /* synthetic */ hyy0(gyy0 gyy0Var) {
    }
}
