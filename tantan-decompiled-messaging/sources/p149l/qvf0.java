package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Ll/qvf0;", j6f.GPS_DIRECTION_TRUE, "Ll/rvf0;", "Ll/uz5;", "consumer", "Ll/yc90;", "producerListener", "Ll/uc90;", "producerContext", "", "producerName", "<init>", "(Ll/uz5;Ll/yc90;Ll/uc90;Ljava/lang/String;)V", LovePlanetStage.result, "", "f", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "e", "(Ljava/lang/Exception;)V", Constants.INAPP_DATA_TAG, "()V", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Ljava/util/Map;", "exception", "h", "(Ljava/lang/Exception;)Ljava/util/Map;", "b", "Ll/uz5;", "c", "Ll/yc90;", "Ll/uc90;", "Ljava/lang/String;", "g", "()Ljava/util/Map;", "extraMapOnCancellation", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class qvf0<T> extends rvf0<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uz5<T> consumer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final yc90 producerListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final uc90 producerContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String producerName;

    public qvf0(@NotNull uz5<T> uz5Var, @NotNull yc90 yc90Var, @NotNull uc90 uc90Var, @NotNull String str) {
        uz5Var.getClass();
        yc90Var.getClass();
        uc90Var.getClass();
        str.getClass();
        this.consumer = uz5Var;
        this.producerListener = yc90Var;
        this.producerContext = uc90Var;
        this.producerName = str;
        yc90Var.mo104754d(uc90Var, str);
    }

    @Override // p149l.rvf0
    /* JADX INFO: renamed from: d */
    public void mo176698d() {
        yc90 yc90Var = this.producerListener;
        uc90 uc90Var = this.producerContext;
        String str = this.producerName;
        yc90Var.mo104753a(uc90Var, str, yc90Var.mo104759k(uc90Var, str) ? m176699g() : null);
        this.consumer.mo107034a();
    }

    @Override // p149l.rvf0
    /* JADX INFO: renamed from: e */
    public void mo113827e(@NotNull Exception e) {
        e.getClass();
        yc90 yc90Var = this.producerListener;
        uc90 uc90Var = this.producerContext;
        String str = this.producerName;
        yc90Var.mo104757i(uc90Var, str, e, yc90Var.mo104759k(uc90Var, str) ? m176700h(e) : null);
        this.consumer.onFailure(e);
    }

    @Override // p149l.rvf0
    /* JADX INFO: renamed from: f */
    public void mo113828f(@Nullable T result) {
        yc90 yc90Var = this.producerListener;
        uc90 uc90Var = this.producerContext;
        String str = this.producerName;
        yc90Var.mo104756f(uc90Var, str, yc90Var.mo104759k(uc90Var, str) ? mo8493i(result) : null);
        this.consumer.mo107035b(result, 1);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Map<String, String> m176699g() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Map<String, String> m176700h(@Nullable Exception exception) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Map<String, String> mo8493i(@Nullable T result) {
        return null;
    }
}
