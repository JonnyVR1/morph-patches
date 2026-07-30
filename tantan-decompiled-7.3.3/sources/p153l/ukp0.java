package p153l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseEvent$GestureIntention;

/* JADX INFO: loaded from: classes5.dex */
public class ukp0 {

    /* JADX INFO: renamed from: a */
    public boolean f179443a = false;

    /* JADX INFO: renamed from: b */
    public GestureDetector.SimpleOnGestureListener f179444b = new C20594a();

    /* JADX INFO: renamed from: c */
    public lmj f179445c;

    /* JADX INFO: renamed from: d */
    public int f179446d;

    /* JADX INFO: renamed from: e */
    public int f179447e;

    /* JADX INFO: renamed from: f */
    public i6t f179448f;

    /* JADX INFO: renamed from: l.ukp0$a */
    public class C20594a extends GestureDetector.SimpleOnGestureListener {
        public C20594a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention;
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            if (fAbs > ukp0.this.f179447e || fAbs2 > ukp0.this.f179447e) {
                ukp0 ukp0Var = ukp0.this;
                if (ukp0Var.f179443a) {
                    if (fAbs > fAbs2) {
                        voiceCloseEvent$GestureIntention = f >= 0.0f ? VoiceCloseEvent$GestureIntention.LEFT2RIGHT : VoiceCloseEvent$GestureIntention.RIGHT2LEFT;
                    } else {
                        voiceCloseEvent$GestureIntention = f2 >= 0.0f ? VoiceCloseEvent$GestureIntention.UP2DOWN : VoiceCloseEvent$GestureIntention.DOWN2UP;
                    }
                    ukp0Var.f179448f.m213811F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo199273j(voiceCloseEvent$GestureIntention);
                    ukp0.this.f179443a = false;
                }
            }
            int unused = ukp0.this.f179447e;
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            if ((fAbs > ukp0.this.f179446d || fAbs2 > ukp0.this.f179446d) && ukp0.this.f179443a) {
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                if (fAbs >= fAbs2) {
                    voiceCloseEvent$GestureIntention = x2 >= x ? VoiceCloseEvent$GestureIntention.LEFT2RIGHT : VoiceCloseEvent$GestureIntention.RIGHT2LEFT;
                } else {
                    voiceCloseEvent$GestureIntention = y2 >= y ? VoiceCloseEvent$GestureIntention.UP2DOWN : VoiceCloseEvent$GestureIntention.DOWN2UP;
                }
                ukp0.this.f179448f.m213811F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo199273j(voiceCloseEvent$GestureIntention);
                ukp0.this.f179443a = false;
            }
            int unused = ukp0.this.f179446d;
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ukp0.this.f179448f.m213811F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo199273j(VoiceCloseEvent$GestureIntention.TAP);
            return super.onSingleTapUp(motionEvent);
        }
    }

    public ukp0(i6t i6tVar) {
        this.f179448f = i6tVar;
        this.f179446d = ViewConfiguration.get(i6tVar.m113230C0()).getScaledTouchSlop();
        this.f179447e = ViewConfiguration.get(this.f179448f.m113230C0()).getScaledMinimumFlingVelocity();
        this.f179445c = new lmj(this.f179448f.m113230C0(), this.f179444b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m196510d(MotionEvent motionEvent) {
        lmj lmjVar = this.f179445c;
        return lmjVar != null && lmjVar.m154870a(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m196511e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f179443a = true;
        } else if (action == 1 || action == 3) {
            this.f179443a = false;
        }
        lmj lmjVar = this.f179445c;
        return lmjVar != null && lmjVar.m154870a(motionEvent);
    }
}
