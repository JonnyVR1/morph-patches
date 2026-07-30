package p149l;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class sjj {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f164843a;

    public sjj(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f164843a = new GestureDetector(context, onGestureListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public boolean m184493a(@NonNull MotionEvent motionEvent) {
        return this.f164843a.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m184494b(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f164843a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public sjj(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
