package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class vo5 extends oc1 {

    /* JADX INFO: renamed from: g */
    public static final String f184998g = "vo5";

    /* JADX INFO: renamed from: b */
    public opg f184999b;

    /* JADX INFO: renamed from: c */
    public AnimationDrawable f185000c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f185001d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f185002e;

    /* JADX INFO: renamed from: f */
    public final ga1 f185003f;

    /* JADX INFO: renamed from: l.vo5$a */
    public class C20873a implements ga1 {
        public C20873a() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (lpg.m155193v().m155198E()) {
                lpg.m155193v().m155229j0();
            }
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                vo5.this.m202083l();
            }
        }

        @Override // p153l.ga1
        public void success() {
            vo5.this.m202083l();
        }
    }

    /* JADX INFO: renamed from: l.vo5$b */
    public class C20874b extends opg {
        public C20874b() {
        }

        @Override // p153l.opg, p153l.npg
        /* JADX INFO: renamed from: i */
        public void mo67475i(boolean z) {
            FeedAudioRecordView feedAudioRecordView = vo5.this.f146642a;
            feedAudioRecordView.f41414g.setText(String.valueOf(feedAudioRecordView.f41428u));
            vo5.this.m202085n();
            vo5.this.f146642a.f41413f.setText(R$string.f39729D1);
        }

        @Override // p153l.opg, p153l.npg
        /* JADX INFO: renamed from: j */
        public void mo67476j(float f) {
            FeedAudioRecordView feedAudioRecordView = vo5.this.f146642a;
            feedAudioRecordView.f41414g.setText(String.valueOf(Math.max(0, (int) (feedAudioRecordView.f41428u - (f / 1000.0f)))));
        }

        @Override // p153l.opg, p153l.npg
        public void onComplete() {
            FeedAudioRecordView feedAudioRecordView = vo5.this.f146642a;
            feedAudioRecordView.f41414g.setText(String.valueOf(feedAudioRecordView.f41428u));
            vo5.this.m202085n();
            vo5.this.f146642a.f41413f.setText(R$string.f39729D1);
        }

        @Override // p153l.opg, p153l.npg
        public void onStart() {
            super.onStart();
            vo5.this.m202080i().start();
            vo5.this.f146642a.f41413f.setText(R$string.f39712A2);
        }
    }

    public vo5(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f185003f = new C20873a();
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: a */
    public void mo99660a() {
        m202084m();
        m202079h();
        m202082k();
        this.f146642a.f41416i.setVisibility(0);
        this.f146642a.f41417j.setVisibility(0);
        i4g0.m138492A("e_recording_over_button", "p_moment_post", new pf60("button_operation", "finish"));
        i4g0.m138492A("e_recording_over_button", "p_moment_post", new pf60("button_operation", RequestParameters.SUBRESOURCE_DELETE));
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: b */
    public void mo99661b() {
        if (!lpg.m155193v().m155198E()) {
            pb1.m171472b().mo171477f(f184998g, AudioBusinessType.NORMAL, this.f185003f);
        } else {
            pb1.m171472b().mo171473a(f184998g);
            lpg.m155193v().m155229j0();
        }
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: c */
    public void mo99662c() {
        if (NullChecker.m82486a(this.f185002e)) {
            this.f185002e.cancel();
        }
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: d */
    public void mo99663d(AudioRecordState audioRecordState) {
        this.f146642a.f41413f.setText(R$string.f39729D1);
    }

    /* JADX INFO: renamed from: h */
    public final void m202079h() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f146642a.f41412e, "alpha", 0.0f, 1.0f);
        this.f185002e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f185002e.setStartDelay(200L);
        this.f185002e.addListener(new C20875c());
        this.f185002e.start();
    }

    /* JADX INFO: renamed from: i */
    public final AnimationDrawable m202080i() {
        if (this.f185000c == null) {
            this.f185000c = (AnimationDrawable) this.f146642a.f41412e.getDrawable();
        }
        return this.f185000c;
    }

    /* JADX INFO: renamed from: j */
    public final opg m202081j() {
        if (this.f184999b == null) {
            this.f184999b = new C20874b();
        }
        return this.f184999b;
    }

    /* JADX INFO: renamed from: k */
    public final void m202082k() {
        if (this.f185001d == null) {
            View view = this.f146642a.f41410c;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.1f);
            View view2 = this.f146642a.f41410c;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.1f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f185001d = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f185001d.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m202083l() {
        try {
            lpg.m155193v().m155223d0(this.f146642a.f41418k).m155219Z(this.f146642a.f41424q.m191984m().getAbsolutePath(), m202081j());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m202084m() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f146642a.f41416i, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f146642a.f41417j, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m202085n() {
        m202080i().stop();
        m202080i().selectDrawable(0);
    }

    /* JADX INFO: renamed from: l.vo5$c */
    public class C20875c implements Animator.AnimatorListener {
        public C20875c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            vo5.this.f146642a.f41412e.setVisibility(0);
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
