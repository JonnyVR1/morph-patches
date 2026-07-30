package p153l;

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
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Ll/jim;", "", "<init>", "()V", "Ljava/io/InputStream;", "is", "Ll/him;", "c", "(Ljava/io/InputStream;)Ll/him;", "", "e", "", "a", "I", "maxHeaderLength", "", "Ll/him$b;", "b", "Ljava/util/List;", "customImageFormatCheckers", "Ll/opd;", "Ll/opd;", "defaultFormatChecker", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class jim {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<jim> f121101d = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.iim
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jim.m144983a();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxHeaderLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends him.InterfaceC17471b> customImageFormatCheckers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final opd defaultFormatChecker = new opd();

    public jim() {
        m144987e();
    }

    /* JADX INFO: renamed from: a */
    public static jim m144983a() {
        return new jim();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final him m144985d(@NotNull InputStream inputStream) {
        return INSTANCE.m144990c(inputStream);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final him m144986c(@NotNull InputStream is) throws IOException {
        is.getClass();
        int i = this.maxHeaderLength;
        byte[] bArr = new byte[i];
        int iM144992e = INSTANCE.m144992e(i, is, bArr);
        him himVarMo135129a = this.defaultFormatChecker.mo135129a(bArr, iM144992e);
        if (himVarMo135129a != him.f110036c) {
            return himVarMo135129a;
        }
        List<? extends him.InterfaceC17471b> list = this.customImageFormatCheckers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                him himVarMo135129a2 = ((him.InterfaceC17471b) it.next()).mo135129a(bArr, iM144992e);
                if (himVarMo135129a2 != him.f110036c) {
                    return himVarMo135129a2;
                }
            }
        }
        return him.f110036c;
    }

    /* JADX INFO: renamed from: e */
    public final void m144987e() {
        this.maxHeaderLength = this.defaultFormatChecker.getHeaderSize();
        List<? extends him.InterfaceC17471b> list = this.customImageFormatCheckers;
        if (list != null) {
            list.getClass();
            Iterator<? extends him.InterfaceC17471b> it = list.iterator();
            while (it.hasNext()) {
                this.maxHeaderLength = Math.max(this.maxHeaderLength, it.next().getHeaderSize());
            }
        }
    }

    /* JADX INFO: renamed from: l.jim$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/jim$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "is", "Ll/him;", "b", "(Ljava/io/InputStream;)Ll/him;", "c", "", "maxHeaderLength", "", "imageHeaderBytes", "e", "(ILjava/io/InputStream;[B)I", "Ll/jim;", "instance$delegate", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ll/jim;", "instance", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final him m144989b(@NotNull InputStream is) throws IOException {
            is.getClass();
            return m144991d().m144986c(is);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final him m144990c(@NotNull InputStream is) {
            is.getClass();
            try {
                return m144989b(is);
            } catch (IOException e) {
                throw vyi0.m203997a(e);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final jim m144991d() {
            return (jim) jim.f121101d.getValue();
        }

        /* JADX INFO: renamed from: e */
        public final int m144992e(int maxHeaderLength, InputStream is, byte[] imageHeaderBytes) throws IOException {
            if (imageHeaderBytes.length < maxHeaderLength) {
                wtq0.m207906a("Check failed.");
                return 0;
            }
            if (!is.markSupported()) {
                return nr3.m164441b(is, imageHeaderBytes, 0, maxHeaderLength);
            }
            try {
                is.mark(maxHeaderLength);
                return nr3.m164441b(is, imageHeaderBytes, 0, maxHeaderLength);
            } finally {
                is.reset();
            }
        }

        public Companion() {
        }
    }
}
