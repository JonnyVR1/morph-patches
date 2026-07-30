package p153l;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15584h;
import kotlinx.coroutines.RunnableC15583g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0007\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u000b"}, m88121d2 = {"Lkotlinx/coroutines/h;", "b", "()Lkotlinx/coroutines/h;", "", "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/h;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class ood {

    /* JADX INFO: renamed from: a */
    public static final boolean f148345a = bqh0.m105939f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC15584h f148346b = m168572b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC15584h m168571a() {
        return f148346b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC15584h m168572b() {
        if (!f148345a) {
            return RunnableC15583g.INSTANCE;
        }
        gsw gswVarM179862c = r5e.m179862c();
        return (isw.m141993c(gswVarM179862c) || !(gswVarM179862c instanceof InterfaceC15584h)) ? RunnableC15583g.INSTANCE : (InterfaceC15584h) gswVarM179862c;
    }
}
