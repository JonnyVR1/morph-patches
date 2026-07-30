package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/ag4;", LovePlanetStage.result, "", "c", "(Ll/ag4;Ljava/lang/Object;)V", "", "exception", Constants.INAPP_DATA_TAG, "(Ll/ag4;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class ole0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final <T> void m168106c(ag4<? super T> ag4Var, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) ag4Var.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            ag4Var.mo94635B(coroutineDispatcher, t);
        } else {
            ag4Var.resumeWith(Result.m225066constructorimpl(t));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m168107d(ag4<?> ag4Var, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) ag4Var.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            ag4Var.mo94651a(coroutineDispatcher, th);
        } else {
            Result.Companion companion = Result.INSTANCE;
            ag4Var.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(th)));
        }
    }
}
