package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Ll/goh0;", "a", "Ll/goh0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", Constants.INAPP_DATA_TAG, "TOO_LATE_TO_CANCEL", "e", "SEALED", "Ll/sze;", "f", "Ll/sze;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class npq {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f143116a = new goh0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final goh0 f143117b = new goh0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final goh0 f143118c = new goh0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final goh0 f143119d = new goh0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final goh0 f143120e = new goh0("SEALED");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final sze f143121f = new sze(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final sze f143122g = new sze(true);

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m164242g(@Nullable Object obj) {
        return obj instanceof ptm ? new qtm((ptm) obj) : obj;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m164243h(@Nullable Object obj) {
        ptm ptmVar;
        qtm qtmVar = obj instanceof qtm ? (qtm) obj : null;
        return (qtmVar == null || (ptmVar = qtmVar.state) == null) ? obj : ptmVar;
    }
}
