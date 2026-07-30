package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class qjj {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public InterfaceC19523a f154937a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final float f154938b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public boolean f154939c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public boolean f154940d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public long f154941e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public float f154942f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public float f154943g;

    /* JADX INFO: renamed from: l.qjj$a */
    public interface InterfaceC19523a {
        /* JADX INFO: renamed from: a */
        boolean mo129594a();
    }

    public qjj(Context context) {
        this.f154938b = ViewConfiguration.get(context).getScaledTouchSlop();
        m174996a();
    }

    /* JADX INFO: renamed from: c */
    public static qjj m174995c(Context context) {
        return new qjj(context);
    }

    /* JADX INFO: renamed from: a */
    public void m174996a() {
        this.f154937a = null;
        m174999e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m174997b() {
        return this.f154939c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m174998d(MotionEvent motionEvent) {
        InterfaceC19523a interfaceC19523a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f154939c = true;
            this.f154940d = true;
            this.f154941e = motionEvent.getEventTime();
            this.f154942f = motionEvent.getX();
            this.f154943g = motionEvent.getY();
        } else if (action == 1) {
            this.f154939c = false;
            if (Math.abs(motionEvent.getX() - this.f154942f) > this.f154938b || Math.abs(motionEvent.getY() - this.f154943g) > this.f154938b) {
                this.f154940d = false;
            }
            if (this.f154940d && motionEvent.getEventTime() - this.f154941e <= ViewConfiguration.getLongPressTimeout() && (interfaceC19523a = this.f154937a) != null) {
                interfaceC19523a.mo129594a();
            }
            this.f154940d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f154939c = false;
                this.f154940d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f154942f) > this.f154938b || Math.abs(motionEvent.getY() - this.f154943g) > this.f154938b) {
            this.f154940d = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m174999e() {
        this.f154939c = false;
        this.f154940d = false;
    }

    /* JADX INFO: renamed from: f */
    public void m175000f(InterfaceC19523a interfaceC19523a) {
        this.f154937a = interfaceC19523a;
    }
}
