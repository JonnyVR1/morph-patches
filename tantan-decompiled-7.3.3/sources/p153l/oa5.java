package p153l;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/oa5;", "", "", "currentTimeMillis", "()J", "c", "", "a", "()I", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface oa5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f145661a;

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final oa5 f145660a = new C19064a();

    /* JADX INFO: renamed from: l.oa5$a */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/oa5$a", "Ll/oa5;", "", "currentTimeMillis", "()J", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "c", "", "a", "()I", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C19064a implements oa5 {
        @Override // p153l.oa5
        /* JADX INFO: renamed from: a */
        public int mo166825a() {
            return (int) (currentTimeMillis() / 1000);
        }

        @Override // p153l.oa5
        /* JADX INFO: renamed from: b */
        public Date mo166826b() {
            return new Date();
        }

        @Override // p153l.oa5
        /* JADX INFO: renamed from: c */
        public long mo166827c() {
            return currentTimeMillis() / 1000;
        }

        @Override // p153l.oa5
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l.oa5$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, m88121d2 = {"Ll/oa5$b;", "", "<init>", "()V", "Ll/oa5;", "SYSTEM", "Ll/oa5;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f145661a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    int mo166825a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Date mo166826b();

    /* JADX INFO: renamed from: c */
    long mo166827c();

    long currentTimeMillis();
}
