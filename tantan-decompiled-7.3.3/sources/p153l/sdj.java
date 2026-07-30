package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0014"}, m88121d2 = {"Ll/sdj;", "Ll/vdj;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "activity", "", Constants.INAPP_DATA_TAG, "(Landroid/app/Activity;)V", "e", Constants.KEY_T, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTag", "Companion", "a", "b", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sdj extends vdj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: l.sdj$a */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/sdj$a;", "Ll/vdj$a;", "Ll/sdj;", "<init>", "()V", "Landroid/content/Context;", "context", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/content/Context;)Ll/sdj$a;", "", "tag", Constants.KEY_T, "(Ljava/lang/String;)Ll/sdj$a;", "r", "()Ll/sdj;", "q", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20022a extends vdj.AbstractC20818a<C20022a, sdj> {

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public String tag = "FX_DEFAULT_TAG";

        @NotNull
        /* JADX INFO: renamed from: q */
        public sdj m185470q() {
            return (sdj) super.m200971b();
        }

        @Override // p153l.vdj.AbstractC20818a
        @NotNull
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public sdj mo185469c() {
            return new sdj(this.tag);
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final C20022a m185472s(@NotNull Context context) {
            context.getClass();
            if (context instanceof Application) {
                yti.INSTANCE.m217320h((Application) context);
                return this;
            }
            yti ytiVar = yti.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ytiVar.m217320h((Application) applicationContext);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C20022a m185473t(@NotNull String tag) throws IllegalArgumentException {
            tag.getClass();
            if (tag.length() != 0) {
                this.tag = tag;
                return this;
            }
            wg3.m206174a("浮窗 tag 不能为 [\"\"],请设置一个合法的tag");
            return null;
        }
    }

    public sdj(@NotNull String str) {
        str.getClass();
        this.tag = str;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C20022a m185465b() {
        return INSTANCE.m185474a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m185467d(Activity activity) {
        this.navigationBarHeight = bnl0.m105516I(activity);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m185468e(Activity activity) {
        this.statsBarHeight = bnl0.m105511F0();
    }

    /* JADX INFO: renamed from: l.sdj$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/sdj$b;", "", "<init>", "()V", "Ll/sdj$a;", "a", "()Ll/sdj$a;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C20022a m185474a() {
            return new C20022a();
        }

        public Companion() {
        }
    }
}
