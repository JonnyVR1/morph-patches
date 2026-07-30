package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Ll/yfh0;", "a", "Ll/yfh0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", Constants.INAPP_DATA_TAG, "TOO_LATE_TO_CANCEL", "e", "SEALED", "Ll/oye;", "f", "Ll/oye;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class onq {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f144809a = new yfh0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final yfh0 f144810b = new yfh0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final yfh0 f144811c = new yfh0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final yfh0 f144812d = new yfh0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final yfh0 f144813e = new yfh0("SEALED");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final oye f144814f = new oye(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final oye f144815g = new oye(true);

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m165222g(@Nullable Object obj) {
        return obj instanceof nrm ? new orm((nrm) obj) : obj;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m165223h(@Nullable Object obj) {
        nrm nrmVar;
        orm ormVar = obj instanceof orm ? (orm) obj : null;
        return (ormVar == null || (nrmVar = ormVar.state) == null) ? obj : nrmVar;
    }
}
