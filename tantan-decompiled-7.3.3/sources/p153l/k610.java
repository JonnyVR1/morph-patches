package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m88121d2 = {"Ll/k610;", "Ll/gyl;", "monitor", "<init>", "(Ll/gyl;)V", "Ll/p4c;", "data", "", "a", "(Ll/p4c;)V", "Ll/gyl;", "getMonitor", "()Ll/gyl;", "setMonitor", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class k610 implements gyl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public gyl monitor;

    public k610(@Nullable gyl gylVar) {
        this.monitor = gylVar;
        if (gylVar == null) {
            this.monitor = new nqd();
        }
    }

    @Override // p153l.gyl
    /* JADX INFO: renamed from: a */
    public void mo132974a(@NotNull p4c data) {
        data.getClass();
        gyl gylVar = this.monitor;
        if (gylVar != null) {
            gylVar.mo132974a(data);
        }
    }
}
