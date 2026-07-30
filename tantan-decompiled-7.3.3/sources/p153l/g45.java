package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/g45;", "Ll/woq;", "Ll/f45;", "Ll/h45;", "childJob", "<init>", "(Ll/h45;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "", "b", "(Ljava/lang/Throwable;)Z", "e", "Ll/h45;", "Lkotlinx/coroutines/o;", "getParent", "()Lkotlinx/coroutines/o;", "parent", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class g45 extends woq implements f45 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final h45 childJob;

    public g45(@NotNull h45 h45Var) {
        this.childJob = h45Var;
    }

    @Override // kotlinx.coroutines.InterfaceC15592n
    /* JADX INFO: renamed from: a */
    public void mo94601a(@Nullable Throwable cause) {
        this.childJob.mo94533F(m136579u());
    }

    @Override // p153l.f45
    /* JADX INFO: renamed from: b */
    public boolean mo106425b(@NotNull Throwable cause) {
        return m136579u().mo94575e0(cause);
    }

    @Override // p153l.f45
    @NotNull
    public InterfaceC15593o getParent() {
        return m136579u();
    }
}
