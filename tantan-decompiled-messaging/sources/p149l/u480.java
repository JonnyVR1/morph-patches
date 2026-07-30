package p149l;

import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/u480;", "", "<init>", "()V", "Ll/ua80;", "poolFactory", "", "gingerbreadDecoderEnabled", "useDecodeBufferHelper", "Ll/v480;", "platformDecoderOptions", "Ll/t480;", "a", "(Ll/ua80;ZZLl/v480;)Ll/t480;", "Ll/hb80;", "Ljava/nio/ByteBuffer;", "b", "(Ll/ua80;Z)Ll/hb80;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class u480 {

    @NotNull
    public static final u480 INSTANCE = new u480();

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final t480 m191720a(@NotNull ua80 poolFactory, boolean gingerbreadDecoderEnabled, boolean useDecodeBufferHelper, @NotNull v480 platformDecoderOptions) {
        poolFactory.getClass();
        platformDecoderOptions.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            f23 f23VarM192737b = poolFactory.m192737b();
            f23VarM192737b.getClass();
            return new tx50(f23VarM192737b, m191721b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
        }
        f23 f23VarM192737b2 = poolFactory.m192737b();
        f23VarM192737b2.getClass();
        return new n01(f23VarM192737b2, m191721b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final hb80<ByteBuffer> m191721b(@NotNull ua80 poolFactory, boolean useDecodeBufferHelper) {
        poolFactory.getClass();
        if (useDecodeBufferHelper) {
            lgd lgdVar = lgd.INSTANCE;
            lgdVar.getClass();
            return lgdVar;
        }
        int iM192740e = poolFactory.m192740e();
        lb80 lb80Var = new lb80(iM192740e);
        for (int i = 0; i < iM192740e; i++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(lgd.m149774c());
            byteBufferAllocate.getClass();
            lb80Var.release(byteBufferAllocate);
        }
        return lb80Var;
    }
}
