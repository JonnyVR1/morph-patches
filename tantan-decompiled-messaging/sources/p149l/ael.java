package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"Ll/ael;", "Ll/a13;", "Ll/ua80;", "poolFactory", "<init>", "(Ll/ua80;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Bitmap;", "a", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Ll/tye;", "Ll/tye;", "jpegGenerator", "Ll/zpi;", "b", "Ll/zpi;", "flexByteArrayPool", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ael implements a13 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final tye jpegGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zpi flexByteArrayPool;

    public ael(@NotNull ua80 ua80Var) {
        ua80Var.getClass();
        this.jpegGenerator = new tye(ua80Var.m192743h());
        zpi zpiVarM192739d = ua80Var.m192739d();
        zpiVarM192739d.getClass();
        this.flexByteArrayPool = zpiVarM192739d;
    }

    @Override // p149l.a13
    @NotNull
    /* JADX INFO: renamed from: a */
    public Bitmap mo94506a(int width, int height, @NotNull Bitmap.Config bitmapConfig) throws Throwable {
        jze jzeVar;
        bitmapConfig.getClass();
        fa5<PooledByteBuffer> fa5VarM191018a = this.jpegGenerator.m191018a((short) width, (short) height);
        fa5VarM191018a.getClass();
        try {
            jzeVar = new jze(fa5VarM191018a);
            try {
                jzeVar.m143917m0(kod.JPEG);
                BitmapFactory.Options optionsM96116b = INSTANCE.m96116b(jzeVar.m143901J(), bitmapConfig);
                int size = fa5VarM191018a.m120155B().size();
                PooledByteBuffer pooledByteBufferM120155B = fa5VarM191018a.m120155B();
                pooledByteBufferM120155B.getClass();
                fa5<byte[]> fa5VarM219670a = this.flexByteArrayPool.m219670a(size + 2);
                byte[] bArrM120155B = fa5VarM219670a.m120155B();
                bArrM120155B.getClass();
                byte[] bArr = bArrM120155B;
                pooledByteBufferM120155B.mo8156p(0, bArr, 0, size);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, optionsM96116b);
                if (bitmapDecodeByteArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                bitmapDecodeByteArray.setHasAlpha(true);
                bitmapDecodeByteArray.eraseColor(0);
                fa5.m120154v(fa5VarM219670a);
                jze.m143896n(jzeVar);
                fa5.m120154v(fa5VarM191018a);
                return bitmapDecodeByteArray;
            } catch (Throwable th) {
                th = th;
                fa5.m120154v(null);
                jze.m143896n(jzeVar);
                fa5.m120154v(fa5VarM191018a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jzeVar = null;
        }
    }

    /* JADX INFO: renamed from: l.ael$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/ael$a;", "", "<init>", "()V", "", "sampleSize", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/BitmapFactory$Options;", "b", "(ILandroid/graphics/Bitmap$Config;)Landroid/graphics/BitmapFactory$Options;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final BitmapFactory.Options m96116b(int sampleSize, Bitmap.Config bitmapConfig) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = bitmapConfig;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = sampleSize;
            options.inMutable = true;
            return options;
        }

        public Companion() {
        }
    }
}
