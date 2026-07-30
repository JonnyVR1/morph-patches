package p009l;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p009l.gnl;

/* JADX INFO: renamed from: l.x4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H$¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll/x4;", "Ll/gnl;", "T", "", "<init>", "()V", "a", "()Ll/gnl;", "c", "", "b", "()Z", "Ll/x4;", "d", "()Ll/x4;", "e", "(Ll/x4;)V", "next", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractC1296x4<T extends gnl> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AbstractC1296x4<T> next;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m24701a() {
        if (mo11256b()) {
            return (T) mo11257c();
        }
        AbstractC1296x4<T> abstractC1296x4 = this.next;
        if (abstractC1296x4 != null) {
            return (T) abstractC1296x4.m24701a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo11256b();

    /* JADX INFO: renamed from: c */
    public abstract T mo11257c();

    @Nullable
    /* JADX INFO: renamed from: d */
    public final AbstractC1296x4<T> m24702d() {
        return this.next;
    }

    /* JADX INFO: renamed from: e */
    public final void m24703e(@Nullable AbstractC1296x4<T> abstractC1296x4) {
        this.next = abstractC1296x4;
    }
}
