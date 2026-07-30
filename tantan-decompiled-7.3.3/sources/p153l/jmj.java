package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class jmj {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public InterfaceC17978a f121675a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final float f121676b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public boolean f121677c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public boolean f121678d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public long f121679e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public float f121680f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public float f121681g;

    /* JADX INFO: renamed from: l.jmj$a */
    public interface InterfaceC17978a {
        /* JADX INFO: renamed from: a */
        boolean mo108230a();
    }

    public jmj(Context context) {
        this.f121676b = ViewConfiguration.get(context).getScaledTouchSlop();
        m146160a();
    }

    /* JADX INFO: renamed from: c */
    public static jmj m146159c(Context context) {
        return new jmj(context);
    }

    /* JADX INFO: renamed from: a */
    public void m146160a() {
        this.f121675a = null;
        m146163e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m146161b() {
        return this.f121677c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m146162d(MotionEvent motionEvent) {
        InterfaceC17978a interfaceC17978a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f121677c = true;
            this.f121678d = true;
            this.f121679e = motionEvent.getEventTime();
            this.f121680f = motionEvent.getX();
            this.f121681g = motionEvent.getY();
        } else if (action == 1) {
            this.f121677c = false;
            if (Math.abs(motionEvent.getX() - this.f121680f) > this.f121676b || Math.abs(motionEvent.getY() - this.f121681g) > this.f121676b) {
                this.f121678d = false;
            }
            if (this.f121678d && motionEvent.getEventTime() - this.f121679e <= ViewConfiguration.getLongPressTimeout() && (interfaceC17978a = this.f121675a) != null) {
                interfaceC17978a.mo108230a();
            }
            this.f121678d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f121677c = false;
                this.f121678d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f121680f) > this.f121676b || Math.abs(motionEvent.getY() - this.f121681g) > this.f121676b) {
            this.f121678d = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m146163e() {
        this.f121677c = false;
        this.f121678d = false;
    }

    /* JADX INFO: renamed from: f */
    public void m146164f(InterfaceC17978a interfaceC17978a) {
        this.f121675a = interfaceC17978a;
    }
}
