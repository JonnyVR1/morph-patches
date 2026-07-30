package p153l;

import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/oyj0;", "", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "frameLoader", "Ljava/util/Date;", "insertedTime", "<init>", "(Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;Ljava/util/Date;)V", "a", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class oyj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1626c frameLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Date insertedTime;

    public oyj0(@NotNull InterfaceC1626c interfaceC1626c, @NotNull Date date) {
        interfaceC1626c.getClass();
        date.getClass();
        this.frameLoader = interfaceC1626c;
        this.insertedTime = date;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC1626c getFrameLoader() {
        return this.frameLoader;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getInsertedTime() {
        return this.insertedTime;
    }
}
