package p149l;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15477h;
import kotlinx.coroutines.RunnableC15476g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0007\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u000b"}, m87232d2 = {"Lkotlinx/coroutines/h;", "b", "()Lkotlinx/coroutines/h;", "", "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/h;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class jnd {

    /* JADX INFO: renamed from: a */
    public static final boolean f118849a = uhh0.m193720f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC15477h f118850b = m142373b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC15477h m142372a() {
        return f118850b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC15477h m142373b() {
        if (!f118849a) {
            return RunnableC15476g.INSTANCE;
        }
        hpw hpwVarM109982c = d4e.m109982c();
        return (jpw.m142763c(hpwVarM109982c) || !(hpwVarM109982c instanceof InterfaceC15477h)) ? RunnableC15476g.INSTANCE : (InterfaceC15477h) hpwVarM109982c;
    }
}
