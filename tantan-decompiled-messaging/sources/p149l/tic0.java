package p149l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes12.dex */
public class tic0 extends hc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f170552b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f170553c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f170554d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f170555e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f170556f;

    public tic0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: a */
    public void mo130367a() {
        m189174k();
        m189173j();
        m189170g();
        m189172i();
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: b */
    public void mo130368b() {
        ib1.m135233b().mo135234a(FeedAudioRecordView.f40559y);
        m189169f();
        zvf0.m220399u("e_voice_button", "p_moment_post", new j760("recording_status", "over"), new j760("voice_duration", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(this.f106988a.f40580u)));
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: c */
    public void mo130369c() {
        if (NullChecker.m81303a(this.f170554d)) {
            this.f170554d.cancel();
            this.f106988a.f40563d.setProgress(0.0f);
        }
        if (NullChecker.m81303a(this.f170552b)) {
            this.f170552b.cancel();
        }
        if (NullChecker.m81303a(this.f170553c)) {
            this.f170553c.cancel();
        }
        m189171h();
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: d */
    public void mo130370d(AudioRecordState audioRecordState) {
        this.f106988a.f40565f.setText(R$string.f38935M1);
    }

    /* JADX INFO: renamed from: e */
    public final void m189168e() {
        this.f106988a.m62611k(AudioRecordState.COMPLETING);
    }

    /* JADX INFO: renamed from: f */
    public final void m189169f() {
        FeedAudioRecordView feedAudioRecordView = this.f106988a;
        boolean zM62602C = feedAudioRecordView.m62602C(feedAudioRecordView.f40580u);
        FeedAudioRecordView feedAudioRecordView2 = this.f106988a;
        if (zM62602C) {
            feedAudioRecordView2.m62606G();
            m189168e();
        } else {
            feedAudioRecordView2.m62611k(AudioRecordState.WAITING);
            lsi0.m151593w(R$string.f38910I0);
            this.f106988a.m62609i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m189170g() {
        if (this.f170552b == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106988a.f40562c, "scaleX", 1.0f, 0.4f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f106988a.f40562c, "scaleY", 1.0f, 0.4f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f170552b = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f170552b.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m189171h() {
        if (this.f170555e == null) {
            View view = this.f106988a.f40560a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
            View view2 = this.f106988a.f40560a;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f170555e = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f170555e.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m189172i() {
        if (this.f170553c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106988a.f40560a, "scaleX", 1.0f, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f106988a.f40560a, "scaleY", 1.0f, 1.1f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(2000);
            objectAnimatorOfFloat2.setRepeatCount(2000);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f170553c = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f170553c.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m189173j() {
        if (this.f170554d == null) {
            this.f170554d = this.f106988a.f40563d.m66458b(Constants.ONE_MIN_IN_MILLIS);
        }
        this.f170554d.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m189174k() {
        if (this.f170556f == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f106988a.f40561b, "scaleX", 1.0f, 1.1f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f106988a.f40561b, "scaleY", 1.0f, 1.1f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat2.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f170556f = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f170556f.start();
    }
}
