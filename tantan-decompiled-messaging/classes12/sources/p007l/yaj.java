package p007l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.p000p1.mobile.putong.data.Tag;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.ig3;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0014"}, d2 = {"Ll/yaj;", "Ll/bbj;", "", Tag.TYPE, "<init>", "(Ljava/lang/String;)V", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "", "d", "(Landroid/app/Activity;)V", "e", "t", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTag", "Companion", "a", "b", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yaj extends bbj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: l.yaj$a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll/yaj$a;", "Ll/bbj$a;", "Ll/yaj;", "<init>", "()V", "Landroid/content/Context;", "context", "s", "(Landroid/content/Context;)Ll/yaj$a;", "", Tag.TYPE, "t", "(Ljava/lang/String;)Ll/yaj$a;", "r", "()Ll/yaj;", "q", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2538a extends bbj.AbstractC2335a<C2538a, yaj> {

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public String tag = "FX_DEFAULT_TAG";

        @NotNull
        /* JADX INFO: renamed from: q */
        public yaj m17097q() {
            return (yaj) super.m8784b();
        }

        @Override // p007l.bbj.AbstractC2335a
        @NotNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public yaj mo8785c() {
            return new yaj(this.tag);
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C2538a m17099s(@NotNull Context context) {
            context.getClass();
            if (context instanceof Application) {
                cri.INSTANCE.m9233h((Application) context);
                return this;
            }
            cri criVar = cri.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            criVar.m9233h((Application) applicationContext);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C2538a m17100t(@NotNull String tag) throws IllegalArgumentException {
            tag.getClass();
            if (tag.length() != 0) {
                this.tag = tag;
                return this;
            }
            ig3.a("浮窗 tag 不能为 [\"\"],请设置一个合法的tag");
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
    public static final C2538a m17093b() {
        return INSTANCE.m17101a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m17095d(Activity activity) {
        this.navigationBarHeight = xdl0.I(activity);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m17096e(Activity activity) {
        this.statsBarHeight = xdl0.F0();
    }

    /* JADX INFO: renamed from: l.yaj$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll/yaj$b;", "", "<init>", "()V", "Ll/yaj$a;", "a", "()Ll/yaj$a;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C2538a m17101a() {
            return new C2538a();
        }

        public Companion() {
        }
    }
}
