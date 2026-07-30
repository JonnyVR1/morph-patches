package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/qgl;", "Ll/p13;", "Ll/aj80;", "poolFactory", "<init>", "(Ll/aj80;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Bitmap;", "a", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Ll/xze;", "Ll/xze;", "jpegGenerator", "Ll/vsi;", "b", "Ll/vsi;", "flexByteArrayPool", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class qgl implements p13 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xze jpegGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final vsi flexByteArrayPool;

    public qgl(@NotNull aj80 aj80Var) {
        aj80Var.getClass();
        this.jpegGenerator = new xze(aj80Var.m98362h());
        vsi vsiVarM98358d = aj80Var.m98358d();
        vsiVarM98358d.getClass();
        this.flexByteArrayPool = vsiVarM98358d;
    }

    @Override // p153l.p13
    @NotNull
    /* JADX INFO: renamed from: a */
    public Bitmap mo170193a(int width, int height, @NotNull Bitmap.Config bitmapConfig) throws Throwable {
        n0f n0fVar;
        bitmapConfig.getClass();
        fb5<PooledByteBuffer> fb5VarM213753a = this.jpegGenerator.m213753a((short) width, (short) height);
        fb5VarM213753a.getClass();
        try {
            n0fVar = new n0f(fb5VarM213753a);
            try {
                n0fVar.m160980n0(ppd.JPEG);
                BitmapFactory.Options optionsM176497b = INSTANCE.m176497b(n0fVar.m160964J(), bitmapConfig);
                int size = fb5VarM213753a.m124875B().size();
                PooledByteBuffer pooledByteBufferM124875B = fb5VarM213753a.m124875B();
                pooledByteBufferM124875B.getClass();
                fb5<byte[]> fb5VarM202615a = this.flexByteArrayPool.m202615a(size + 2);
                byte[] bArrM124875B = fb5VarM202615a.m124875B();
                bArrM124875B.getClass();
                byte[] bArr = bArrM124875B;
                pooledByteBufferM124875B.mo8210p(0, bArr, 0, size);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, optionsM176497b);
                if (bitmapDecodeByteArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                bitmapDecodeByteArray.setHasAlpha(true);
                bitmapDecodeByteArray.eraseColor(0);
                fb5.m124874v(fb5VarM202615a);
                n0f.m160959n(n0fVar);
                fb5.m124874v(fb5VarM213753a);
                return bitmapDecodeByteArray;
            } catch (Throwable th) {
                th = th;
                fb5.m124874v(null);
                n0f.m160959n(n0fVar);
                fb5.m124874v(fb5VarM213753a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            n0fVar = null;
        }
    }

    /* JADX INFO: renamed from: l.qgl$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/qgl$a;", "", "<init>", "()V", "", "sampleSize", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/BitmapFactory$Options;", "b", "(ILandroid/graphics/Bitmap$Config;)Landroid/graphics/BitmapFactory$Options;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final BitmapFactory.Options m176497b(int sampleSize, Bitmap.Config bitmapConfig) {
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
