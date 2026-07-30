package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import p149l.maj;
import p149l.naj;
import p149l.oaj;
import p149l.paj;
import p149l.qaj;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f66441a = maj.INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function1<Object, Boolean> f66442b = naj.INSTANCE;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function1<Object, Object> f66443c = C15359a.INSTANCE;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function1<Object, Unit> f66444d = oaj.INSTANCE;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Function2<Object, Object, Unit> f66445e = paj.INSTANCE;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Function3<Object, Object, Object, Unit> f66446f = qaj.INSTANCE;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$a */
    public static final class C15359a implements Function1 {
        public static final C15359a INSTANCE = new C15359a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m93198a(Object obj) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m93199b(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m93200c(Object obj, Object obj2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m93201d(Object obj, Object obj2, Object obj3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m93202e(Object obj) {
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <T> Function1<T, Boolean> m93208k() {
        return (Function1<T, Boolean>) f66442b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Function3<Object, Object, Object, Unit> m93209l() {
        return f66446f;
    }
}
