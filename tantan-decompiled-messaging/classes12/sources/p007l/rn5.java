package p007l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.ib1;
import l.j760;
import l.osi0;
import l.z91;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rn5 extends hc1 {

    /* JADX INFO: renamed from: g */
    public static final String f12686g = "rn5";

    /* JADX INFO: renamed from: b */
    public zng f12687b;

    /* JADX INFO: renamed from: c */
    public AnimationDrawable f12688c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f12689d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f12690e;

    /* JADX INFO: renamed from: f */
    public final z91 f12691f;

    /* JADX INFO: renamed from: l.rn5$a */
    public class C2476a implements z91 {
        public C2476a() {
        }

        /* JADX INFO: renamed from: b */
        public void m13927b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (wng.m15855v().m15860E()) {
                wng.m15855v().m15891j0();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13928d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
                rn5.this.m13924l();
            }
        }

        public void success() {
            rn5.this.m13924l();
        }
    }

    /* JADX INFO: renamed from: l.rn5$b */
    public class C2477b extends zng {
        public C2477b() {
        }

        @Override // p007l.zng, p007l.yng
        /* JADX INFO: renamed from: i */
        public void mo7452i(boolean z) {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f8671a;
            feedAudioRecordView.f2027g.setText(String.valueOf(feedAudioRecordView.f2041u));
            rn5.this.m13926n();
            rn5.this.f8671a.f2026f.setText(R$string.f342D1);
        }

        @Override // p007l.zng, p007l.yng
        /* JADX INFO: renamed from: j */
        public void mo7453j(float f) {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f8671a;
            feedAudioRecordView.f2027g.setText(String.valueOf(Math.max(0, (int) (feedAudioRecordView.f2041u - (f / 1000.0f)))));
        }

        @Override // p007l.zng, p007l.yng
        public void onComplete() {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f8671a;
            feedAudioRecordView.f2027g.setText(String.valueOf(feedAudioRecordView.f2041u));
            rn5.this.m13926n();
            rn5.this.f8671a.f2026f.setText(R$string.f342D1);
        }

        @Override // p007l.zng, p007l.yng
        public void onStart() {
            super.onStart();
            rn5.this.m13921i().start();
            rn5.this.f8671a.f2026f.setText(R$string.f325A2);
        }
    }

    public rn5(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f12691f = new C2476a();
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: a */
    public void mo10594a() {
        m13925m();
        m13920h();
        m13923k();
        this.f8671a.f2029i.setVisibility(0);
        this.f8671a.f2030j.setVisibility(0);
        zvf0.A("e_recording_over_button", "p_moment_post", new j760[]{new j760("button_operation", "finish")});
        zvf0.A("e_recording_over_button", "p_moment_post", new j760[]{new j760("button_operation", "delete")});
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: b */
    public void mo10595b() {
        if (!wng.m15855v().m15860E()) {
            ib1.b().f(f12686g, AudioBusinessType.NORMAL, this.f12691f);
        } else {
            ib1.b().a(f12686g);
            wng.m15855v().m15891j0();
        }
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: c */
    public void mo10596c() {
        if (NullChecker.a(this.f12690e)) {
            this.f12690e.cancel();
        }
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: d */
    public void mo10597d(AudioRecordState audioRecordState) {
        this.f8671a.f2026f.setText(R$string.f342D1);
    }

    /* JADX INFO: renamed from: h */
    public final void m13920h() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8671a.f2025e, "alpha", 0.0f, 1.0f);
        this.f12690e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f12690e.setStartDelay(200L);
        this.f12690e.addListener(new C2478c());
        this.f12690e.start();
    }

    /* JADX INFO: renamed from: i */
    public final AnimationDrawable m13921i() {
        if (this.f12688c == null) {
            this.f12688c = (AnimationDrawable) this.f8671a.f2025e.getDrawable();
        }
        return this.f12688c;
    }

    /* JADX INFO: renamed from: j */
    public final zng m13922j() {
        if (this.f12687b == null) {
            this.f12687b = new C2477b();
        }
        return this.f12687b;
    }

    /* JADX INFO: renamed from: k */
    public final void m13923k() {
        if (this.f12689d == null) {
            View view = this.f8671a.f2023c;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.1f);
            View view2 = this.f8671a.f2023c;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.1f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12689d = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f12689d.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m13924l() {
        try {
            wng.m15855v().m15885d0(this.f8671a.f2031k).m15881Z(this.f8671a.f2037q.m().getAbsolutePath(), m13922j());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13925m() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8671a.f2029i, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8671a.f2030j, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m13926n() {
        m13921i().stop();
        m13921i().selectDrawable(0);
    }

    /* JADX INFO: renamed from: l.rn5$c */
    public class C2478c implements Animator.AnimatorListener {
        public C2478c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            rn5.this.f8671a.f2025e.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
