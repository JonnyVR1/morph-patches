package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0018"}, m87232d2 = {"Ll/ggm;", "", "<init>", "()V", "Ljava/io/InputStream;", "is", "Ll/egm;", "c", "(Ljava/io/InputStream;)Ll/egm;", "", "e", "", "a", "I", "maxHeaderLength", "", "Ll/egm$b;", "b", "Ljava/util/List;", "customImageFormatCheckers", "Ll/jod;", "Ll/jod;", "defaultFormatChecker", "Companion", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ggm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<ggm> f102521d = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.fgm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ggm.m125987a();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxHeaderLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends egm.InterfaceC16594b> customImageFormatCheckers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final jod defaultFormatChecker = new jod();

    public ggm() {
        m125991e();
    }

    /* JADX INFO: renamed from: a */
    public static ggm m125987a() {
        return new ggm();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final egm m125989d(@NotNull InputStream inputStream) {
        return INSTANCE.m125994c(inputStream);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final egm m125990c(@NotNull InputStream is) throws IOException {
        is.getClass();
        int i = this.maxHeaderLength;
        byte[] bArr = new byte[i];
        int iM125996e = INSTANCE.m125996e(i, is, bArr);
        egm egmVarMo116294a = this.defaultFormatChecker.mo116294a(bArr, iM125996e);
        if (egmVarMo116294a != egm.f90961c) {
            return egmVarMo116294a;
        }
        List<? extends egm.InterfaceC16594b> list = this.customImageFormatCheckers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                egm egmVarMo116294a2 = ((egm.InterfaceC16594b) it.next()).mo116294a(bArr, iM125996e);
                if (egmVarMo116294a2 != egm.f90961c) {
                    return egmVarMo116294a2;
                }
            }
        }
        return egm.f90961c;
    }

    /* JADX INFO: renamed from: e */
    public final void m125991e() {
        this.maxHeaderLength = this.defaultFormatChecker.getHeaderSize();
        List<? extends egm.InterfaceC16594b> list = this.customImageFormatCheckers;
        if (list != null) {
            list.getClass();
            Iterator<? extends egm.InterfaceC16594b> it = list.iterator();
            while (it.hasNext()) {
                this.maxHeaderLength = Math.max(this.maxHeaderLength, it.next().getHeaderSize());
            }
        }
    }

    /* JADX INFO: renamed from: l.ggm$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/ggm$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "is", "Ll/egm;", "b", "(Ljava/io/InputStream;)Ll/egm;", "c", "", "maxHeaderLength", "", "imageHeaderBytes", "e", "(ILjava/io/InputStream;[B)I", "Ll/ggm;", "instance$delegate", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ll/ggm;", "instance", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final egm m125993b(@NotNull InputStream is) throws IOException {
            is.getClass();
            return m125995d().m125990c(is);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final egm m125994c(@NotNull InputStream is) {
            is.getClass();
            try {
                return m125993b(is);
            } catch (IOException e) {
                throw spi0.m185369a(e);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final ggm m125995d() {
            return (ggm) ggm.f102521d.getValue();
        }

        /* JADX INFO: renamed from: e */
        public final int m125996e(int maxHeaderLength, InputStream is, byte[] imageHeaderBytes) throws IOException {
            if (imageHeaderBytes.length < maxHeaderLength) {
                qkq0.m175383a("Check failed.");
                return 0;
            }
            if (!is.markSupported()) {
                return oq3.m165402b(is, imageHeaderBytes, 0, maxHeaderLength);
            }
            try {
                is.mark(maxHeaderLength);
                return oq3.m165402b(is, imageHeaderBytes, 0, maxHeaderLength);
            } finally {
                is.reset();
            }
        }

        public Companion() {
        }
    }
}
