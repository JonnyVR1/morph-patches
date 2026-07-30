package p149l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"¨\u0006#"}, m87232d2 = {"Ll/wom;", "Ll/igy;", "Landroid/graphics/Bitmap;", "Ll/nt3;", "ctCaches", "Ll/nul;", "logger", "<init>", "(Ll/nt3;Ll/nul;)V", "", Constants.KEY_KEY, "Lkotlin/Pair;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lkotlin/Pair;", "A", "Ll/xgy;", "transformTo", "g", "(Ljava/lang/String;Ll/xgy;)Ljava/lang/Object;", "h", "f", "(Ljava/lang/String;)Ljava/io/File;", "data", "", "e", "(Ljava/lang/String;Lkotlin/Pair;)Z", "", "c", "(Ljava/lang/String;[B)Ljava/io/File;", "b", "(Ljava/lang/String;)Z", "a", "Ll/nt3;", "Ll/nul;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class wom implements igy<Bitmap> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final nt3 ctCaches;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final nul logger;

    public wom(@NotNull nt3 nt3Var, @Nullable nul nulVar) {
        nt3Var.getClass();
        this.ctCaches = nt3Var;
        this.logger = nulVar;
    }

    @Override // p149l.igy
    @Nullable
    /* JADX INFO: renamed from: a */
    public Pair<Bitmap, File> mo111656a(@NotNull String key) {
        key.getClass();
        nul nulVar = this.logger;
        if (nulVar != null) {
            nulVar.verbose("FileDownload", "If present, will remove " + key + " data from IMAGE in-memory");
        }
        return this.ctCaches.m160843h().m175947c(key);
    }

    @Override // p149l.igy
    /* JADX INFO: renamed from: b */
    public boolean mo111657b(@NotNull String key) {
        key.getClass();
        nul nulVar = this.logger;
        if (nulVar != null) {
            nulVar.verbose("FileDownload", "If present, will remove " + key + " data from IMAGE disk-memory");
        }
        return this.ctCaches.m160842g().m152838d(key);
    }

    @Override // p149l.igy
    @NotNull
    /* JADX INFO: renamed from: c */
    public File mo111658c(@NotNull String key, @NotNull byte[] data) {
        key.getClass();
        data.getClass();
        return this.ctCaches.m160842g().m152836a(key, data);
    }

    @Override // p149l.igy
    @Nullable
    /* JADX INFO: renamed from: d */
    public Pair<Bitmap, File> mo111659d(@NotNull String key) {
        key.getClass();
        return this.ctCaches.m160843h().m175946b(key);
    }

    @Override // p149l.igy
    /* JADX INFO: renamed from: e */
    public boolean mo111660e(@NotNull String key, @NotNull Pair<? extends Bitmap, ? extends File> data) {
        key.getClass();
        data.getClass();
        nul nulVar = this.logger;
        if (nulVar != null) {
            nulVar.verbose("FileDownload", "Saving " + key + " data in IMAGE in-memory");
        }
        return this.ctCaches.m160843h().m175945a(key, data);
    }

    @Override // p149l.igy
    @Nullable
    /* JADX INFO: renamed from: f */
    public File mo111661f(@NotNull String key) {
        key.getClass();
        nul nulVar = this.logger;
        if (nulVar != null) {
            nulVar.verbose("FileDownload", "IMAGE In-Memory cache miss for " + key + " data");
        }
        return this.ctCaches.m160842g().m152837c(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.igy
    @Nullable
    /* JADX INFO: renamed from: g */
    public <A> A mo111662g(@NotNull String key, @NotNull xgy<A> transformTo) {
        key.getClass();
        transformTo.getClass();
        Pair<Bitmap, File> pairMo111659d = mo111659d(key);
        if (pairMo111659d != null) {
            nul nulVar = this.logger;
            if (nulVar != null) {
                nulVar.verbose("FileDownload", key + " data found in image in-memory");
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21146a.INSTANCE)) {
                A a = (A) pairMo111659d.getFirst();
                if (a == null) {
                    return null;
                }
                return a;
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21147b.INSTANCE)) {
                Function1<Bitmap, byte[]> function1M159369e = Function1.m159369e();
                Bitmap first = pairMo111659d.getFirst();
                first.getClass();
                A a2 = (A) function1M159369e.invoke(first);
                if (a2 == null) {
                    return null;
                }
                return a2;
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21148c.INSTANCE)) {
                A a3 = (A) pairMo111659d.getSecond();
                if (a3 == null) {
                    return null;
                }
                return a3;
            }
            l9r.m149037a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.igy
    @Nullable
    /* JADX INFO: renamed from: h */
    public <A> A mo111663h(@NotNull String key, @NotNull xgy<A> transformTo) {
        key.getClass();
        transformTo.getClass();
        A a = (A) mo111661f(key);
        if (a != null) {
            nul nulVar = this.logger;
            if (nulVar != null) {
                nulVar.verbose("FileDownload", key + " data found in image disk memory");
            }
            A a2 = (A) ((Bitmap) Function1.m159371g().invoke(a));
            if (a2 != null) {
                mo111660e(key, new Pair<>(a2, a));
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21146a.INSTANCE)) {
                if (a2 != null) {
                    return a2;
                }
                return null;
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21147b.INSTANCE)) {
                A a3 = (A) Function1.m159372h().invoke(a);
                if (a3 == null) {
                    return null;
                }
                return a3;
            }
            if (Intrinsics.m87488d(transformTo, xgy.C21148c.INSTANCE)) {
                return a;
            }
            l9r.m149037a();
        }
        return null;
    }
}
