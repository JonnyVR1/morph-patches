package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.filter.DetectorType;
import com.p046p1.mobile.putong.data.Counter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/mxd;", "", "<init>", "()V", "Lcom/immomo/momomediaext/filter/DetectorType;", "detectorType", "", "f", "(Lcom/immomo/momomediaext/filter/DetectorType;)V", "e", Constants.INAPP_DATA_TAG, "c", "Ll/nxd;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "h", "(Ll/nxd;)V", "g", "", "", "a", "Ljava/util/Map;", Counter.TYPE, "b", "Ll/nxd;", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class mxd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<DetectorType, Integer> counter = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private nxd listener;

    /* JADX INFO: renamed from: a */
    public static void m156874a(mxd mxdVar, DetectorType detectorType) {
        mxdVar.getClass();
        detectorType.getClass();
        nxd nxdVar = mxdVar.listener;
        if (nxdVar != null) {
            nxdVar.mo134663a(detectorType);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156875b(mxd mxdVar, DetectorType detectorType) {
        mxdVar.getClass();
        detectorType.getClass();
        nxd nxdVar = mxdVar.listener;
        if (nxdVar != null) {
            nxdVar.mo134664b(detectorType);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m156876e(final DetectorType detectorType) {
        opw.m165383a(new Runnable() { // from class: l.kxd
            @Override // java.lang.Runnable
            public final void run() {
                mxd.m156875b(this.f125100a, detectorType);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private final void m156877f(final DetectorType detectorType) {
        opw.m165383a(new Runnable() { // from class: l.lxd
            @Override // java.lang.Runnable
            public final void run() {
                mxd.m156874a(this.f130412a, detectorType);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m156878c(@NotNull DetectorType detectorType) {
        try {
            detectorType.getClass();
            Integer num = this.counter.get(detectorType);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                iIntValue--;
            }
            this.counter.put(detectorType, Integer.valueOf(iIntValue));
            if (iIntValue == 0) {
                m156876e(detectorType);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m156879d(@NotNull DetectorType detectorType) {
        try {
            detectorType.getClass();
            Integer num = this.counter.get(detectorType);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.counter.put(detectorType, Integer.valueOf(iIntValue));
            if (iIntValue == 1) {
                m156877f(detectorType);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m156880g() {
        this.counter.clear();
        this.listener = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m156881h(@NotNull nxd listener) {
        listener.getClass();
        this.listener = listener;
    }
}
