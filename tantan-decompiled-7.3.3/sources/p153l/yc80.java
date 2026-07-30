package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/yc80;", "", "<init>", "()V", "Ll/aj80;", "poolFactory", "Ll/zc80;", "platformDecoder", "Ll/gb5;", "closeableReferenceFactory", "Ll/xc80;", "a", "(Ll/aj80;Ll/zc80;Ll/gb5;)Ll/xc80;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class yc80 {

    @NotNull
    public static final yc80 INSTANCE = new yc80();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final xc80 m215141a(@NotNull aj80 poolFactory, @NotNull zc80 platformDecoder, @NotNull gb5 closeableReferenceFactory) {
        poolFactory.getClass();
        platformDecoder.getClass();
        closeableReferenceFactory.getClass();
        v23 v23VarM98356b = poolFactory.m98356b();
        v23VarM98356b.getClass();
        return new t01(v23VarM98356b, closeableReferenceFactory);
    }
}
