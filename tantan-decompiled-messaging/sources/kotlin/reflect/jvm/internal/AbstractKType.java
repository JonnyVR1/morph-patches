package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.KTypeBase;
import kotlin.reflect.KType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0006\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/AbstractKType;", "Lkotlin/jvm/internal/KTypeBase;", "<init>", "()V", BLiveStormDanmakuGiftResourceType.f44444l, "()Lkotlin/reflect/jvm/internal/AbstractKType;", "m", "Lkotlin/reflect/KType;", Constants.INAPP_DATA_TAG, "()Lkotlin/reflect/KType;", "abbreviation", "", "e", "()Z", "isDefinitelyNotNullType", "h", "isNothingType", "g", "isMutableCollectionType", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractKType implements KTypeBase {
    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract KType mo87648d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo87649e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo87650g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo87651h();

    @Nullable
    /* JADX INFO: renamed from: l */
    public abstract AbstractKType mo87652l();

    @Nullable
    /* JADX INFO: renamed from: m */
    public abstract AbstractKType mo87653m();
}
