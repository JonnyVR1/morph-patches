package p149l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/poi;", "Ll/o13;", "", "framesToPrepare", "<init>", "(I)V", "Ll/p13;", "bitmapFramePreparer", "Ll/n13;", "bitmapFrameCache", "Ll/uq0;", "animationBackend", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "c", "(Ll/p13;Ll/n13;Ll/uq0;ILkotlin/jvm/functions/Function0;)V", "a", "I", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "TAG", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class poi implements o13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int framesToPrepare;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<poi> TAG;

    @JvmOverloads
    public poi(int i) {
        this.framesToPrepare = i;
        this.TAG = poi.class;
    }

    @Override // p149l.o13
    @Nullable
    /* JADX INFO: renamed from: a */
    public fa5<Bitmap> mo134354a(int i, int i2, int i3) {
        return o13.C18814a.m162231b(this, i, i2, i3);
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: b */
    public void mo134355b() {
        o13.C18814a.m162230a(this);
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: c */
    public void mo134356c(@NotNull p13 bitmapFramePreparer, @NotNull n13 bitmapFrameCache, @NotNull uq0 animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded) {
        bitmapFramePreparer.getClass();
        bitmapFrameCache.getClass();
        animationBackend.getClass();
        int i = this.framesToPrepare;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                int frameCount = (lastDrawnFrameNumber + i2) % animationBackend.getFrameCount();
                if (tsf.m190547m(2)) {
                    tsf.m190550p(this.TAG, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(lastDrawnFrameNumber));
                }
                if (!bitmapFramePreparer.mo150472a(bitmapFrameCache, animationBackend, frameCount)) {
                    return;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (onAnimationLoaded != null) {
            onAnimationLoaded.invoke();
        }
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: d */
    public void mo134357d() {
        o13.C18814a.m162232c(this);
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: e */
    public void mo134358e(int i, int i2, @Nullable Function0<Unit> function0) {
        o13.C18814a.m162233d(this, i, i2, function0);
    }

    @JvmOverloads
    public poi() {
        this(0, 1, null);
    }

    public /* synthetic */ poi(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
