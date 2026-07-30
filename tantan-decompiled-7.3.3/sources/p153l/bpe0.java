package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0016\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, m88121d2 = {"Ll/bpe0;", "", "<init>", "()V", "", "id", "", "num", "", "click", "from", "", "c", "(Ljava/lang/String;IZLjava/lang/String;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)I", "Ll/bpe0$b;", "e", "(Ljava/lang/String;)Ll/bpe0$b;", "h", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "a", "Ll/bpe0$b;", "preUserData", "b", "curUserData", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bpe0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile bpe0 f77769c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C16079b preUserData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C16079b curUserData;

    /* JADX INFO: renamed from: l.bpe0$b */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/bpe0$b;", "", "", "id", "", "superLikeCount", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "c", "()I", "f", "(I)V", "", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "click", "getFrom", "e", "(Ljava/lang/String;)V", "from", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16079b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int superLikeCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean click;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public String from = "";

        public C16079b(@Nullable String str, int i) {
            this.id = str;
            this.superLikeCount = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClick() {
            return this.click;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSuperLikeCount() {
            return this.superLikeCount;
        }

        /* JADX INFO: renamed from: d */
        public final void m105826d(boolean z) {
            this.click = z;
        }

        /* JADX INFO: renamed from: e */
        public final void m105827e(@NotNull String str) {
            str.getClass();
            this.from = str;
        }

        /* JADX INFO: renamed from: f */
        public final void m105828f(int i) {
            this.superLikeCount = i;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final bpe0 m105814f() {
        return INSTANCE.m105821a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m105815g() {
        INSTANCE.m105822b();
    }

    /* JADX INFO: renamed from: c */
    public final void m105816c(@NotNull String id, int num, boolean click, @NotNull String from) {
        id.getClass();
        from.getClass();
        C16079b c16079b = new C16079b(id, num);
        C16079b c16079b2 = this.curUserData;
        boolean zEquals = TextUtils.equals(id, c16079b2 != null ? c16079b2.getId() : null);
        C16079b c16079b3 = this.curUserData;
        if (!zEquals) {
            this.preUserData = c16079b3;
            this.curUserData = c16079b;
        } else if (c16079b3 != null) {
            c16079b3.m105828f(num);
        }
        C16079b c16079b4 = this.curUserData;
        if (c16079b4 != null) {
            c16079b4.m105826d(click);
        }
        C16079b c16079b5 = this.curUserData;
        if (c16079b5 != null) {
            c16079b5.m105827e(from);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m105817d(@NotNull String id) {
        C16079b c16079b;
        id.getClass();
        C16079b c16079b2 = this.curUserData;
        if (!TextUtils.equals(id, c16079b2 != null ? c16079b2.getId() : null) || (c16079b = this.curUserData) == null) {
            return 1;
        }
        return c16079b.getSuperLikeCount();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C16079b m105818e(@NotNull String id) {
        id.getClass();
        C16079b c16079b = this.curUserData;
        if (TextUtils.equals(id, c16079b != null ? c16079b.getId() : null)) {
            return this.curUserData;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m105819h() {
        this.preUserData = this.curUserData;
        this.curUserData = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m105820i(@NotNull String id) {
        id.getClass();
        C16079b c16079b = this.preUserData;
        if (TextUtils.equals(id, c16079b != null ? c16079b.getId() : null)) {
            this.curUserData = this.preUserData;
            this.preUserData = null;
        }
    }

    /* JADX INFO: renamed from: l.bpe0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/bpe0$a;", "", "<init>", "()V", "Ll/bpe0;", "a", "()Ll/bpe0;", "", "b", "instance", "Ll/bpe0;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final bpe0 m105821a() {
            bpe0 bpe0Var;
            bpe0 bpe0Var2 = bpe0.f77769c;
            if (bpe0Var2 != null) {
                return bpe0Var2;
            }
            synchronized (this) {
                bpe0Var = bpe0.f77769c;
                if (bpe0Var == null) {
                    bpe0Var = new bpe0();
                    bpe0.f77769c = bpe0Var;
                }
            }
            return bpe0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m105822b() {
            bpe0.f77769c = null;
        }

        public Companion() {
        }
    }
}
