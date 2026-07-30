package p153l;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/q4c;", p7f.GPS_DIRECTION_TRUE, "Ll/l3g0;", "value", "", "hashCode", "<init>", "(Ljava/lang/Object;I)V", "", "a", "()V", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "I", "getHashCode", "()I", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class q4c<T> extends l3g0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int hashCode;

    public q4c(T t, int i) {
        super(null);
        this.value = t;
        this.hashCode = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m175207a() {
        T t = this.value;
        if ((t != null ? t.hashCode() : 0) == this.hashCode) {
            return;
        }
        wtq0.m207906a("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    }

    /* JADX INFO: renamed from: b */
    public final T m175208b() {
        return this.value;
    }
}
