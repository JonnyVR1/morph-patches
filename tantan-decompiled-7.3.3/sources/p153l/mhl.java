package p153l;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/mhl;", "Ll/azm;", "<init>", "()V", "Ll/azm$a;", "chain", "Ll/i5d0;", "intercept", "(Ll/azm$a;)Ll/i5d0;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mhl implements azm {
    @Override // p153l.azm
    @NotNull
    public i5d0 intercept(@NotNull azm.InterfaceC15867a chain) throws IOException {
        chain.getClass();
        lhl lhlVar = lhl.INSTANCE;
        x1d0 x1d0VarRequest = chain.request();
        x1d0VarRequest.getClass();
        i5d0 i5d0VarMo101076a = chain.mo101076a(lhlVar.m154221n(x1d0VarRequest));
        i5d0VarMo101076a.getClass();
        return i5d0VarMo101076a;
    }
}
