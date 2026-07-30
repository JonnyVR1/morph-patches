package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0014"}, m87232d2 = {"Ll/yaj;", "Ll/bbj;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "activity", "", Constants.INAPP_DATA_TAG, "(Landroid/app/Activity;)V", "e", Constants.KEY_T, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTag", "Companion", "a", "b", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class yaj extends bbj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: l.yaj$a */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/yaj$a;", "Ll/bbj$a;", "Ll/yaj;", "<init>", "()V", "Landroid/content/Context;", "context", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/content/Context;)Ll/yaj$a;", "", "tag", Constants.KEY_T, "(Ljava/lang/String;)Ll/yaj$a;", "r", "()Ll/yaj;", "q", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21354a extends bbj.AbstractC15831a<C21354a, yaj> {

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public String tag = "FX_DEFAULT_TAG";

        @NotNull
        /* JADX INFO: renamed from: q */
        public yaj m213847q() {
            return (yaj) super.m100961b();
        }

        @Override // p149l.bbj.AbstractC15831a
        @NotNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public yaj mo100962c() {
            return new yaj(this.tag);
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C21354a m213849s(@NotNull Context context) {
            context.getClass();
            if (context instanceof Application) {
                cri.INSTANCE.m108375h((Application) context);
                return this;
            }
            cri criVar = cri.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            criVar.m108375h((Application) applicationContext);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C21354a m213850t(@NotNull String tag) throws IllegalArgumentException {
            tag.getClass();
            if (tag.length() != 0) {
                this.tag = tag;
                return this;
            }
            ig3.m135964a("浮窗 tag 不能为 [\"\"],请设置一个合法的tag");
            return null;
        }
    }

    public yaj(@NotNull String str) {
        str.getClass();
        this.tag = str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C21354a m213843b() {
        return INSTANCE.m213851a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m213845d(Activity activity) {
        this.navigationBarHeight = xdl0.m208336I(activity);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m213846e(Activity activity) {
        this.statsBarHeight = xdl0.m208331F0();
    }

    /* JADX INFO: renamed from: l.yaj$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/yaj$b;", "", "<init>", "()V", "Ll/yaj$a;", "a", "()Ll/yaj$a;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C21354a m213851a() {
            return new C21354a();
        }

        public Companion() {
        }
    }
}
