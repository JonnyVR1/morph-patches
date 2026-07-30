package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.FlushResult;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/yvi;", "", "<init>", "()V", "", "a", "I", "()I", "c", "(I)V", "numEvents", "Lcom/facebook/appevents/FlushResult;", "b", "Lcom/facebook/appevents/FlushResult;", "()Lcom/facebook/appevents/FlushResult;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/FlushResult;)V", LovePlanetStage.result, "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class yvi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int numEvents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public FlushResult result = FlushResult.SUCCESS;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNumEvents() {
        return this.numEvents;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FlushResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: c */
    public final void m217518c(int i) {
        this.numEvents = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m217519d(@NotNull FlushResult flushResult) {
        flushResult.getClass();
        this.result = flushResult;
    }
}
