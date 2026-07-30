package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class rn5 extends hc1 {

    /* JADX INFO: renamed from: g */
    public static final String f160238g = "rn5";

    /* JADX INFO: renamed from: b */
    public zng f160239b;

    /* JADX INFO: renamed from: c */
    public AnimationDrawable f160240c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f160241d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f160242e;

    /* JADX INFO: renamed from: f */
    public final z91 f160243f;

    /* JADX INFO: renamed from: l.rn5$a */
    public class C19737a implements z91 {
        public C19737a() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (wng.m204695v().m204700E()) {
                wng.m204695v().m204731j0();
            }
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                rn5.this.m180060l();
            }
        }

        @Override // p149l.z91
        public void success() {
            rn5.this.m180060l();
        }
    }

    /* JADX INFO: renamed from: l.rn5$b */
    public class C19738b extends zng {
        public C19738b() {
        }

        @Override // p149l.zng, p149l.yng
        /* JADX INFO: renamed from: i */
        public void mo66292i(boolean z) {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f106988a;
            feedAudioRecordView.f40566g.setText(String.valueOf(feedAudioRecordView.f40580u));
            rn5.this.m180062n();
            rn5.this.f106988a.f40565f.setText(R$string.f38881D1);
        }

        @Override // p149l.zng, p149l.yng
        /* JADX INFO: renamed from: j */
        public void mo66293j(float f) {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f106988a;
            feedAudioRecordView.f40566g.setText(String.valueOf(Math.max(0, (int) (feedAudioRecordView.f40580u - (f / 1000.0f)))));
        }

        @Override // p149l.zng, p149l.yng
        public void onComplete() {
            FeedAudioRecordView feedAudioRecordView = rn5.this.f106988a;
            feedAudioRecordView.f40566g.setText(String.valueOf(feedAudioRecordView.f40580u));
            rn5.this.m180062n();
            rn5.this.f106988a.f40565f.setText(R$string.f38881D1);
        }

        @Override // p149l.zng, p149l.yng
        public void onStart() {
            super.onStart();
            rn5.this.m180057i().start();
            rn5.this.f106988a.f40565f.setText(R$string.f38864A2);
        }
    }

    public rn5(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f160243f = new C19737a();
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: a */
    public void mo130367a() {
        m180061m();
        m180056h();
        m180059k();
        this.f106988a.f40568i.setVisibility(0);
        this.f106988a.f40569j.setVisibility(0);
        zvf0.m220368A("e_recording_over_button", "p_moment_post", new j760("button_operation", "finish"));
        zvf0.m220368A("e_recording_over_button", "p_moment_post", new j760("button_operation", RequestParameters.SUBRESOURCE_DELETE));
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: b */
    public void mo130368b() {
        if (!wng.m204695v().m204700E()) {
            ib1.m135233b().mo135238f(f160238g, AudioBusinessType.NORMAL, this.f160243f);
        } else {
            ib1.m135233b().mo135234a(f160238g);
            wng.m204695v().m204731j0();
        }
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: c */
    public void mo130369c() {
        if (NullChecker.m81303a(this.f160242e)) {
            this.f160242e.cancel();
        }
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: d */
    public void mo130370d(AudioRecordState audioRecordState) {
        this.f106988a.f40565f.setText(R$string.f38881D1);
    }

    /* JADX INFO: renamed from: h */
    public final void m180056h() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106988a.f40564e, "alpha", 0.0f, 1.0f);
        this.f160242e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f160242e.setStartDelay(200L);
        this.f160242e.addListener(new C19739c());
        this.f160242e.start();
    }

    /* JADX INFO: renamed from: i */
    public final AnimationDrawable m180057i() {
        if (this.f160240c == null) {
            this.f160240c = (AnimationDrawable) this.f106988a.f40564e.getDrawable();
        }
        return this.f160240c;
    }

    /* JADX INFO: renamed from: j */
    public final zng m180058j() {
        if (this.f160239b == null) {
            this.f160239b = new C19738b();
        }
        return this.f160239b;
    }

    /* JADX INFO: renamed from: k */
    public final void m180059k() {
        if (this.f160241d == null) {
            View view = this.f106988a.f40562c;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.1f);
            View view2 = this.f106988a.f40562c;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.1f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f160241d = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f160241d.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m180060l() {
        try {
            wng.m204695v().m204725d0(this.f106988a.f40570k).m204721Z(this.f106988a.f40576q.m194196m().getAbsolutePath(), m180058j());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m180061m() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106988a.f40568i, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f106988a.f40569j, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m180062n() {
        m180057i().stop();
        m180057i().selectDrawable(0);
    }

    /* JADX INFO: renamed from: l.rn5$c */
    public class C19739c implements Animator.AnimatorListener {
        public C19739c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            rn5.this.f106988a.f40564e.setVisibility(0);
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
