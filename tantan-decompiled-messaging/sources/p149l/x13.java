package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"Ll/x13;", "Ll/a23;", "Ll/pgy;", "Ll/cx3;", "Ll/da5;", "memoryCache", "Ll/dx3;", "cacheKeyFactory", "Ll/sc90;", "Ll/fa5;", "inputProducer", "<init>", "(Ll/pgy;Ll/dx3;Ll/sc90;)V", "Ll/uz5;", "consumer", "cacheKey", "", "isMemoryCacheEnabled", "g", "(Ll/uz5;Ll/cx3;Z)Ll/uz5;", "", "e", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class x13 extends a23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x13(@NotNull pgy<cx3, da5> pgyVar, @NotNull dx3 dx3Var, @NotNull sc90<fa5<da5>> sc90Var) {
        super(pgyVar, dx3Var, sc90Var);
        pgyVar.getClass();
        dx3Var.getClass();
        sc90Var.getClass();
    }

    @Override // p149l.a23
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo94588d() {
        return "pipe_ui";
    }

    @Override // p149l.a23
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo94589e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // p149l.a23
    @NotNull
    /* JADX INFO: renamed from: g */
    public uz5<fa5<da5>> mo94590g(@NotNull uz5<fa5<da5>> consumer, @NotNull cx3 cacheKey, boolean isMemoryCacheEnabled) {
        consumer.getClass();
        cacheKey.getClass();
        return consumer;
    }
}
