package p153l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/u36;", "INFO", "", "", "id", "callerContext", "Ll/u36$a;", "extraData", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/Object;Ll/u36$a;)V", "imageInfo", "h", "b", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "(Ljava/lang/String;)V", "", "throwable", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/Throwable;Ll/u36$a;)V", "j", "(Ljava/lang/String;Ll/u36$a;)V", "a", "ui-common_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface u36<INFO> {

    /* JADX INFO: renamed from: l.u36$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0007R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010)\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m88121d2 = {"Ll/u36$a;", "", "<init>", "()V", "", "", "a", "Ljava/util/Map;", "componentExtras", "b", "shortcutExtras", "c", "datasourceExtras", Constants.INAPP_DATA_TAG, "imageExtras", "e", "imageSourceExtras", "f", "Ljava/lang/Object;", "callerContext", "Landroid/net/Uri;", "g", "Landroid/net/Uri;", "mainUri", "", "h", "I", "viewportWidth", RXScreenCaptureService.KEY_INDEX, "viewportHeight", "j", "scaleType", "", "k", "Ljava/lang/Float;", "focusX", BLiveStormDanmakuGiftResourceType.f45292l, "focusY", "", "m", "Z", "logWithHighSamplingRate", "Companion", "ui-common_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C20477a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> componentExtras;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> shortcutExtras;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> datasourceExtras;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> imageExtras;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Map<String, ? extends Object> imageSourceExtras;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object callerContext;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Uri mainUri;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public int viewportWidth = -1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @JvmField
        public int viewportHeight = -1;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object scaleType;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Float focusX;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Float focusY;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @JvmField
        public boolean logWithHighSamplingRate;
    }

    /* JADX INFO: renamed from: b */
    void mo149842b(@NotNull String id, @Nullable INFO imageInfo);

    /* JADX INFO: renamed from: d */
    void mo149843d(@NotNull String id, @Nullable Throwable throwable, @Nullable C20477a extraData);

    /* JADX INFO: renamed from: e */
    void mo149844e(@NotNull String id);

    /* JADX INFO: renamed from: h */
    void mo149845h(@NotNull String id, @Nullable INFO imageInfo, @Nullable C20477a extraData);

    /* JADX INFO: renamed from: i */
    void mo149846i(@NotNull String id, @Nullable Object callerContext, @Nullable C20477a extraData);

    /* JADX INFO: renamed from: j */
    void mo149847j(@NotNull String id, @Nullable C20477a extraData);
}
