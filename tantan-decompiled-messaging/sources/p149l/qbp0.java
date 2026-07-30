package p149l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseEvent$GestureIntention;

/* JADX INFO: loaded from: classes5.dex */
public class qbp0 {

    /* JADX INFO: renamed from: a */
    public boolean f153685a = false;

    /* JADX INFO: renamed from: b */
    public GestureDetector.SimpleOnGestureListener f153686b = new C19458a();

    /* JADX INFO: renamed from: c */
    public sjj f153687c;

    /* JADX INFO: renamed from: d */
    public int f153688d;

    /* JADX INFO: renamed from: e */
    public int f153689e;

    /* JADX INFO: renamed from: f */
    public h4t f153690f;

    /* JADX INFO: renamed from: l.qbp0$a */
    public class C19458a extends GestureDetector.SimpleOnGestureListener {
        public C19458a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention;
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            if (fAbs > qbp0.this.f153689e || fAbs2 > qbp0.this.f153689e) {
                qbp0 qbp0Var = qbp0.this;
                if (qbp0Var.f153685a) {
                    if (fAbs > fAbs2) {
                        voiceCloseEvent$GestureIntention = f >= 0.0f ? VoiceCloseEvent$GestureIntention.LEFT2RIGHT : VoiceCloseEvent$GestureIntention.RIGHT2LEFT;
                    } else {
                        voiceCloseEvent$GestureIntention = f2 >= 0.0f ? VoiceCloseEvent$GestureIntention.UP2DOWN : VoiceCloseEvent$GestureIntention.DOWN2UP;
                    }
                    qbp0Var.f153690f.m206028F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo172463j(voiceCloseEvent$GestureIntention);
                    qbp0.this.f153685a = false;
                }
            }
            int unused = qbp0.this.f153689e;
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            if ((fAbs > qbp0.this.f153688d || fAbs2 > qbp0.this.f153688d) && qbp0.this.f153685a) {
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                if (fAbs >= fAbs2) {
                    voiceCloseEvent$GestureIntention = x2 >= x ? VoiceCloseEvent$GestureIntention.LEFT2RIGHT : VoiceCloseEvent$GestureIntention.RIGHT2LEFT;
                } else {
                    voiceCloseEvent$GestureIntention = y2 >= y ? VoiceCloseEvent$GestureIntention.UP2DOWN : VoiceCloseEvent$GestureIntention.DOWN2UP;
                }
                qbp0.this.f153690f.m206028F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo172463j(voiceCloseEvent$GestureIntention);
                qbp0.this.f153685a = false;
            }
            int unused = qbp0.this.f153688d;
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            qbp0.this.f153690f.m206028F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().mo172463j(VoiceCloseEvent$GestureIntention.TAP);
            return super.onSingleTapUp(motionEvent);
        }
    }

    public qbp0(h4t h4tVar) {
        this.f153690f = h4tVar;
        this.f153688d = ViewConfiguration.get(h4tVar.m104249C0()).getScaledTouchSlop();
        this.f153689e = ViewConfiguration.get(this.f153690f.m104249C0()).getScaledMinimumFlingVelocity();
        this.f153687c = new sjj(this.f153690f.m104249C0(), this.f153686b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m173838d(MotionEvent motionEvent) {
        sjj sjjVar = this.f153687c;
        return sjjVar != null && sjjVar.m184493a(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public boolean m173839e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f153685a = true;
        } else if (action == 1 || action == 3) {
            this.f153685a = false;
        }
        sjj sjjVar = this.f153687c;
        return sjjVar != null && sjjVar.m184493a(motionEvent);
    }
}
