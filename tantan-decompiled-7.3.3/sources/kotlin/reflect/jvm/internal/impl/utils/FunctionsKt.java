package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import p153l.gdj;
import p153l.hdj;
import p153l.idj;
import p153l.jdj;
import p153l.kdj;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f67115a = gdj.INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function1<Object, Boolean> f67116b = hdj.INSTANCE;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function1<Object, Object> f67117c = C15466a.INSTANCE;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function1<Object, Unit> f67118d = idj.INSTANCE;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Function2<Object, Object, Unit> f67119e = jdj.INSTANCE;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Function3<Object, Object, Object, Unit> f67120f = kdj.INSTANCE;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$a */
    public static final class C15466a implements Function1 {
        public static final C15466a INSTANCE = new C15466a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m94089a(Object obj) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m94090b(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m94091c(Object obj, Object obj2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m94092d(Object obj, Object obj2, Object obj3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m94093e(Object obj) {
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <T> Function1<T, Boolean> m94099k() {
        return (Function1<T, Boolean>) f67116b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Function3<Object, Object, Object, Unit> m94100l() {
        return f67120f;
    }
}
