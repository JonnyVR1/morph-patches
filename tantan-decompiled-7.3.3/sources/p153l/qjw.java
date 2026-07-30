package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00101\u001a\u0004\b \u00102\"\u0004\b3\u00104R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010E\u001a\u0004\b5\u0010F\"\u0004\bG\u0010HR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010I\u001a\u0004\b\u001a\u0010J\"\u0004\bK\u0010LR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010M\u001a\u0004\b&\u0010N\"\u0004\bO\u0010P¨\u0006Q"}, m88121d2 = {"Ll/qjw;", "", "Ll/ivl;", "iHttpRequester", "Ll/nvl;", "iImageloader", "Ll/oxl;", "iMKKV", "Ll/mxl;", "iMKDownloader", "Ll/g4k;", "eventAdapter", "Ll/yym;", "interceptConfig", "Ll/i5m;", "safetyConfig", "Ll/p7m;", "pureWebLoadInterceptConfig", "Ll/rtl;", "fdtConfig", "Ll/lxl;", "iMKDns", "Ll/url;", "customHostSwitch", "<init>", "(Ll/ivl;Ll/nvl;Ll/oxl;Ll/mxl;Ll/g4k;Ll/yym;Ll/i5m;Ll/p7m;Ll/rtl;Ll/lxl;Ll/url;)V", "a", "Ll/ivl;", Constants.INAPP_DATA_TAG, "()Ll/ivl;", "setIHttpRequester", "(Ll/ivl;)V", "b", "Ll/nvl;", "e", "()Ll/nvl;", "setIImageloader", "(Ll/nvl;)V", "c", "Ll/oxl;", "h", "()Ll/oxl;", "setIMKKV", "(Ll/oxl;)V", "Ll/mxl;", "g", "()Ll/mxl;", "setIMKDownloader", "(Ll/mxl;)V", "Ll/g4k;", "()Ll/g4k;", "setEventAdapter", "(Ll/g4k;)V", "f", "Ll/yym;", RXScreenCaptureService.KEY_INDEX, "()Ll/yym;", "setInterceptConfig", "(Ll/yym;)V", "Ll/i5m;", "k", "()Ll/i5m;", "setSafetyConfig", "(Ll/i5m;)V", "Ll/p7m;", "j", "()Ll/p7m;", "setPureWebLoadInterceptConfig", "(Ll/p7m;)V", "Ll/lxl;", "()Ll/lxl;", "setIMKDns", "(Ll/lxl;)V", "Ll/url;", "()Ll/url;", "setCustomHostSwitch", "(Ll/url;)V", "Ll/rtl;", "()Ll/rtl;", "setFdtConfig", "(Ll/rtl;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class qjw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ivl iHttpRequester;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private nvl iImageloader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private oxl iMKKV;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private mxl iMKDownloader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private g4k eventAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private yym interceptConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private i5m safetyConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private p7m pureWebLoadInterceptConfig;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private lxl iMKDns;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private url customHostSwitch;

    public qjw(@NotNull ivl ivlVar, @Nullable nvl nvlVar, @Nullable oxl oxlVar, @Nullable mxl mxlVar, @Nullable g4k g4kVar, @Nullable yym yymVar, @Nullable i5m i5mVar, @Nullable p7m p7mVar, @Nullable rtl rtlVar, @Nullable lxl lxlVar, @Nullable url urlVar) {
        ivlVar.getClass();
        this.iHttpRequester = ivlVar;
        this.iImageloader = nvlVar;
        this.iMKKV = oxlVar;
        this.iMKDownloader = mxlVar;
        this.eventAdapter = g4kVar;
        this.interceptConfig = yymVar;
        this.safetyConfig = i5mVar;
        this.pureWebLoadInterceptConfig = p7mVar;
        this.iMKDns = lxlVar;
        this.customHostSwitch = urlVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final url getCustomHostSwitch() {
        return this.customHostSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final g4k getEventAdapter() {
        return this.eventAdapter;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final rtl m176891c() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ivl getIHttpRequester() {
        return this.iHttpRequester;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final nvl getIImageloader() {
        return this.iImageloader;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final lxl getIMKDns() {
        return this.iMKDns;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final mxl getIMKDownloader() {
        return this.iMKDownloader;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final oxl getIMKKV() {
        return this.iMKKV;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final yym getInterceptConfig() {
        return this.interceptConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final p7m getPureWebLoadInterceptConfig() {
        return this.pureWebLoadInterceptConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final i5m getSafetyConfig() {
        return this.safetyConfig;
    }
}
