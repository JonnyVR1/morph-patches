package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0016\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, m87232d2 = {"Ll/wge0;", "", "<init>", "()V", "", "id", "", "num", "", "click", "from", "", "c", "(Ljava/lang/String;IZLjava/lang/String;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)I", "Ll/wge0$b;", "e", "(Ljava/lang/String;)Ll/wge0$b;", "h", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "a", "Ll/wge0$b;", "preUserData", "b", "curUserData", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wge0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile wge0 f186183c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C20873b preUserData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C20873b curUserData;

    /* JADX INFO: renamed from: l.wge0$b */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/wge0$b;", "", "", "id", "", "superLikeCount", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "c", "()I", "f", "(I)V", "", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "click", "getFrom", "e", "(Ljava/lang/String;)V", "from", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20873b {

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

        public C20873b(@Nullable String str, int i) {
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
        public final void m203046d(boolean z) {
            this.click = z;
        }

        /* JADX INFO: renamed from: e */
        public final void m203047e(@NotNull String str) {
            str.getClass();
            this.from = str;
        }

        /* JADX INFO: renamed from: f */
        public final void m203048f(int i) {
            this.superLikeCount = i;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final wge0 m203034f() {
        return INSTANCE.m203041a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m203035g() {
        INSTANCE.m203042b();
    }

    /* JADX INFO: renamed from: c */
    public final void m203036c(@NotNull String id, int num, boolean click, @NotNull String from) {
        id.getClass();
        from.getClass();
        C20873b c20873b = new C20873b(id, num);
        C20873b c20873b2 = this.curUserData;
        boolean zEquals = TextUtils.equals(id, c20873b2 != null ? c20873b2.getId() : null);
        C20873b c20873b3 = this.curUserData;
        if (!zEquals) {
            this.preUserData = c20873b3;
            this.curUserData = c20873b;
        } else if (c20873b3 != null) {
            c20873b3.m203048f(num);
        }
        C20873b c20873b4 = this.curUserData;
        if (c20873b4 != null) {
            c20873b4.m203046d(click);
        }
        C20873b c20873b5 = this.curUserData;
        if (c20873b5 != null) {
            c20873b5.m203047e(from);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m203037d(@NotNull String id) {
        C20873b c20873b;
        id.getClass();
        C20873b c20873b2 = this.curUserData;
        if (!TextUtils.equals(id, c20873b2 != null ? c20873b2.getId() : null) || (c20873b = this.curUserData) == null) {
            return 1;
        }
        return c20873b.getSuperLikeCount();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C20873b m203038e(@NotNull String id) {
        id.getClass();
        C20873b c20873b = this.curUserData;
        if (TextUtils.equals(id, c20873b != null ? c20873b.getId() : null)) {
            return this.curUserData;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m203039h() {
        this.preUserData = this.curUserData;
        this.curUserData = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m203040i(@NotNull String id) {
        id.getClass();
        C20873b c20873b = this.preUserData;
        if (TextUtils.equals(id, c20873b != null ? c20873b.getId() : null)) {
            this.curUserData = this.preUserData;
            this.preUserData = null;
        }
    }

    /* JADX INFO: renamed from: l.wge0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/wge0$a;", "", "<init>", "()V", "Ll/wge0;", "a", "()Ll/wge0;", "", "b", "instance", "Ll/wge0;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final wge0 m203041a() {
            wge0 wge0Var;
            wge0 wge0Var2 = wge0.f186183c;
            if (wge0Var2 != null) {
                return wge0Var2;
            }
            synchronized (this) {
                wge0Var = wge0.f186183c;
                if (wge0Var == null) {
                    wge0Var = new wge0();
                    wge0.f186183c = wge0Var;
                }
            }
            return wge0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m203042b() {
            wge0.f186183c = null;
        }

        public Companion() {
        }
    }
}
