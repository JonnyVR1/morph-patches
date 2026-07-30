package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Visibilities {

    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<Visibility, Integer> f64739a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Public f64740b;

    public static final class Inherited extends Visibility {

        @NotNull
        public static final Inherited INSTANCE = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    public static final class Internal extends Visibility {

        @NotNull
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    public static final class InvisibleFake extends Visibility {

        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    public static final class Local extends Visibility {

        @NotNull
        public static final Local INSTANCE = new Local();

        private Local() {
            super("local", false);
        }
    }

    public static final class Private extends Visibility {

        @NotNull
        public static final Private INSTANCE = new Private();

        private Private() {
            super("private", false);
        }
    }

    public static final class PrivateToThis extends Visibility {

        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo89516b() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {

        @NotNull
        public static final Protected INSTANCE = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    public static final class Public extends Visibility {

        @NotNull
        public static final Public INSTANCE = new Public();

        private Public() {
            super("public", true);
        }
    }

    public static final class Unknown extends Visibility {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(PrivateToThis.INSTANCE, 0);
        mapCreateMapBuilder.put(Private.INSTANCE, 0);
        mapCreateMapBuilder.put(Internal.INSTANCE, 1);
        mapCreateMapBuilder.put(Protected.INSTANCE, 1);
        Public r1 = Public.INSTANCE;
        mapCreateMapBuilder.put(r1, 2);
        f64739a = MapsKt.build(mapCreateMapBuilder);
        f64740b = r1;
    }

    private Visibilities() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m89514a(@NotNull Visibility visibility, @NotNull Visibility visibility2) {
        visibility.getClass();
        visibility2.getClass();
        if (visibility == visibility2) {
            return 0;
        }
        Map<Visibility, Integer> map = f64739a;
        Integer num = map.get(visibility);
        Integer num2 = map.get(visibility2);
        if (num == null || num2 == null || Intrinsics.m88377d(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m89515b(@NotNull Visibility visibility) {
        visibility.getClass();
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
