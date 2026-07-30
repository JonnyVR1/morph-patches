package p153l;

import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/ad80;", "", "<init>", "()V", "Ll/aj80;", "poolFactory", "", "gingerbreadDecoderEnabled", "useDecodeBufferHelper", "Ll/bd80;", "platformDecoderOptions", "Ll/zc80;", "a", "(Ll/aj80;ZZLl/bd80;)Ll/zc80;", "Ll/nj80;", "Ljava/nio/ByteBuffer;", "b", "(Ll/aj80;Z)Ll/nj80;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ad80 {

    @NotNull
    public static final ad80 INSTANCE = new ad80();

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final zc80 m97063a(@NotNull aj80 poolFactory, boolean gingerbreadDecoderEnabled, boolean useDecodeBufferHelper, @NotNull bd80 platformDecoderOptions) {
        poolFactory.getClass();
        platformDecoderOptions.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            v23 v23VarM98356b = poolFactory.m98356b();
            v23VarM98356b.getClass();
            return new y560(v23VarM98356b, m97064b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
        }
        v23 v23VarM98356b2 = poolFactory.m98356b();
        v23VarM98356b2.getClass();
        return new u01(v23VarM98356b2, m97064b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final nj80<ByteBuffer> m97064b(@NotNull aj80 poolFactory, boolean useDecodeBufferHelper) {
        poolFactory.getClass();
        if (useDecodeBufferHelper) {
            rhd rhdVar = rhd.INSTANCE;
            rhdVar.getClass();
            return rhdVar;
        }
        int iM98359e = poolFactory.m98359e();
        rj80 rj80Var = new rj80(iM98359e);
        for (int i = 0; i < iM98359e; i++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rhd.m181515c());
            byteBufferAllocate.getClass();
            rj80Var.release(byteBufferAllocate);
        }
        return rj80Var;
    }
}
