package p153l;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class lmj {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f132698a;

    public lmj(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f132698a = new GestureDetector(context, onGestureListener, handler);
    }

    /* JADX INFO: renamed from: a */
    public boolean m154870a(@NonNull MotionEvent motionEvent) {
        return this.f132698a.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m154871b(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f132698a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public lmj(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
