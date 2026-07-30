package p149l;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/n95;", "", "", "currentTimeMillis", "()J", "c", "", "a", "()I", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface n95 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f137722a;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final n95 f137721a = new C18636a();

    /* JADX INFO: renamed from: l.n95$a */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/n95$a", "Ll/n95;", "", "currentTimeMillis", "()J", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "c", "", "a", "()I", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18636a implements n95 {
        @Override // p149l.n95
        /* JADX INFO: renamed from: a */
        public int mo158531a() {
            return (int) (currentTimeMillis() / 1000);
        }

        @Override // p149l.n95
        /* JADX INFO: renamed from: b */
        public Date mo158532b() {
            return new Date();
        }

        @Override // p149l.n95
        /* JADX INFO: renamed from: c */
        public long mo158533c() {
            return currentTimeMillis() / 1000;
        }

        @Override // p149l.n95
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l.n95$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, m87232d2 = {"Ll/n95$b;", "", "<init>", "()V", "Ll/n95;", "SYSTEM", "Ll/n95;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f137722a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    int mo158531a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Date mo158532b();

    /* JADX INFO: renamed from: c */
    long mo158533c();

    long currentTimeMillis();
}
