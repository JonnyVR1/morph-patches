package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m88121d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/AbstractPlatformRandom;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", "<init>", "(Ljava/util/Random;)V", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "Companion", "a", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
final class PlatformRandom extends AbstractPlatformRandom implements Serializable {

    @NotNull
    private static final C15272a Companion = new C15272a(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private final java.util.Random impl;

    /* JADX INFO: renamed from: kotlin.random.PlatformRandom$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlin/random/PlatformRandom$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15272a {
        public /* synthetic */ C15272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15272a() {
        }
    }

    public PlatformRandom(@NotNull java.util.Random random) {
        random.getClass();
        this.impl = random;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        return this.impl;
    }
}
