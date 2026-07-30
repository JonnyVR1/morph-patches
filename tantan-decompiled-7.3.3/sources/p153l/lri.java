package p153l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/lri;", "Ll/d23;", "", "framesToPrepare", "<init>", "(I)V", "Ll/e23;", "bitmapFramePreparer", "Ll/c23;", "bitmapFrameCache", "Ll/yq0;", "animationBackend", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "c", "(Ll/e23;Ll/c23;Ll/yq0;ILkotlin/jvm/functions/Function0;)V", "a", "I", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "TAG", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class lri implements d23 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int framesToPrepare;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<lri> TAG;

    @JvmOverloads
    public lri(int i) {
        this.framesToPrepare = i;
        this.TAG = lri.class;
    }

    @Override // p153l.d23
    @Nullable
    /* JADX INFO: renamed from: a */
    public fb5<Bitmap> mo113659a(int i, int i2, int i3) {
        return d23.C16423a.m113665b(this, i, i2, i3);
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: b */
    public void mo113660b() {
        d23.C16423a.m113664a(this);
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: c */
    public void mo113661c(@NotNull e23 bitmapFramePreparer, @NotNull c23 bitmapFrameCache, @NotNull yq0 animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded) {
        bitmapFramePreparer.getClass();
        bitmapFrameCache.getClass();
        animationBackend.getClass();
        int i = this.framesToPrepare;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                int frameCount = (lastDrawnFrameNumber + i2) % animationBackend.getFrameCount();
                if (huf.m137185m(2)) {
                    huf.m137188p(this.TAG, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(lastDrawnFrameNumber));
                }
                if (!bitmapFramePreparer.mo119040a(bitmapFrameCache, animationBackend, frameCount)) {
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

    @Override // p153l.d23
    /* JADX INFO: renamed from: d */
    public void mo113662d() {
        d23.C16423a.m113666c(this);
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: e */
    public void mo113663e(int i, int i2, @Nullable Function0<Unit> function0) {
        d23.C16423a.m113667d(this, i, i2, function0);
    }

    @JvmOverloads
    public lri() {
        this(0, 1, null);
    }

    public /* synthetic */ lri(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
