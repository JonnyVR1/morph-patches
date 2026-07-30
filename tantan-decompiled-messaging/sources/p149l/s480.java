package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/s480;", "", "<init>", "()V", "Ll/ua80;", "poolFactory", "Ll/t480;", "platformDecoder", "Ll/ga5;", "closeableReferenceFactory", "Ll/r480;", "a", "(Ll/ua80;Ll/t480;Ll/ga5;)Ll/r480;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class s480 {

    @NotNull
    public static final s480 INSTANCE = new s480();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final r480 m182214a(@NotNull ua80 poolFactory, @NotNull t480 platformDecoder, @NotNull ga5 closeableReferenceFactory) {
        poolFactory.getClass();
        platformDecoder.getClass();
        closeableReferenceFactory.getClass();
        f23 f23VarM192737b = poolFactory.m192737b();
        f23VarM192737b.getClass();
        return new m01(f23VarM192737b, closeableReferenceFactory);
    }
}
