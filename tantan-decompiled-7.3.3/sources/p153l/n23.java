package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, m88121d2 = {"Ll/n23;", "Ll/q23;", "Ll/mpy;", "Ll/by3;", "Ll/db5;", "memoryCache", "Ll/cy3;", "cacheKeyFactory", "Ll/wk90;", "Ll/fb5;", "inputProducer", "<init>", "(Ll/mpy;Ll/cy3;Ll/wk90;)V", "Ll/z06;", "consumer", "cacheKey", "", "isMemoryCacheEnabled", "g", "(Ll/z06;Ll/by3;Z)Ll/z06;", "", "e", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class n23 extends q23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n23(@NotNull mpy<by3, db5> mpyVar, @NotNull cy3 cy3Var, @NotNull wk90<fb5<db5>> wk90Var) {
        super(mpyVar, cy3Var, wk90Var);
        mpyVar.getClass();
        cy3Var.getClass();
        wk90Var.getClass();
    }

    @Override // p153l.q23
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo161152d() {
        return "pipe_ui";
    }

    @Override // p153l.q23
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo161153e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // p153l.q23
    @NotNull
    /* JADX INFO: renamed from: g */
    public z06<fb5<db5>> mo161154g(@NotNull z06<fb5<db5>> consumer, @NotNull by3 cacheKey, boolean isMemoryCacheEnabled) {
        consumer.getClass();
        cacheKey.getClass();
        return consumer;
    }
}
