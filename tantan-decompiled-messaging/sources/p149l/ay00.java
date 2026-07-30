package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m87232d2 = {"Ll/ay00;", "Ll/ovl;", "monitor", "<init>", "(Ll/ovl;)V", "Ll/g3c;", "data", "", "a", "(Ll/g3c;)V", "Ll/ovl;", "getMonitor", "()Ll/ovl;", "setMonitor", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ay00 implements ovl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ovl monitor;

    public ay00(@Nullable ovl ovlVar) {
        this.monitor = ovlVar;
        if (ovlVar == null) {
            this.monitor = new ipd();
        }
    }

    @Override // p149l.ovl
    /* JADX INFO: renamed from: a */
    public void mo99534a(@NotNull g3c data) {
        data.getClass();
        ovl ovlVar = this.monitor;
        if (ovlVar != null) {
            ovlVar.mo99534a(data);
        }
    }
}
