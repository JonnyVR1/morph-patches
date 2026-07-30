package p153l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
public class arc0 extends oc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f72926b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f72927c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f72928d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f72929e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f72930f;

    public arc0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: a */
    public void mo99660a() {
        m99670k();
        m99669j();
        m99666g();
        m99668i();
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: b */
    public void mo99661b() {
        pb1.m171472b().mo171473a(FeedAudioRecordView.f41407y);
        m99665f();
        i4g0.m138523u("e_voice_button", "p_moment_post", new pf60("recording_status", "over"), new pf60("voice_duration", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(this.f146642a.f41428u)));
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: c */
    public void mo99662c() {
        if (NullChecker.m82486a(this.f72928d)) {
            this.f72928d.cancel();
            this.f146642a.f41411d.setProgress(0.0f);
        }
        if (NullChecker.m82486a(this.f72926b)) {
            this.f72926b.cancel();
        }
        if (NullChecker.m82486a(this.f72927c)) {
            this.f72927c.cancel();
        }
        m99667h();
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: d */
    public void mo99663d(AudioRecordState audioRecordState) {
        this.f146642a.f41413f.setText(R$string.f39783M1);
    }

    /* JADX INFO: renamed from: e */
    public final void m99664e() {
        this.f146642a.m63794k(AudioRecordState.COMPLETING);
    }

    /* JADX INFO: renamed from: f */
    public final void m99665f() {
        FeedAudioRecordView feedAudioRecordView = this.f146642a;
        boolean zM63785C = feedAudioRecordView.m63785C(feedAudioRecordView.f41428u);
        FeedAudioRecordView feedAudioRecordView2 = this.f146642a;
        if (zM63785C) {
            feedAudioRecordView2.m63789G();
            m99664e();
        } else {
            feedAudioRecordView2.m63794k(AudioRecordState.WAITING);
            o1j0.m165649w(R$string.f39758I0);
            this.f146642a.m63792i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m99666g() {
        if (this.f72926b == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f146642a.f41410c, "scaleX", 1.0f, 0.4f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f146642a.f41410c, "scaleY", 1.0f, 0.4f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f72926b = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f72926b.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m99667h() {
        if (this.f72929e == null) {
            View view = this.f146642a.f41408a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
            View view2 = this.f146642a.f41408a;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f72929e = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f72929e.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m99668i() {
        if (this.f72927c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f146642a.f41408a, "scaleX", 1.0f, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f146642a.f41408a, "scaleY", 1.0f, 1.1f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(2000);
            objectAnimatorOfFloat2.setRepeatCount(2000);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f72927c = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f72927c.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m99669j() {
        if (this.f72928d == null) {
            this.f72928d = this.f146642a.f41411d.m67641b(Constants.ONE_MIN_IN_MILLIS);
        }
        this.f72928d.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m99670k() {
        if (this.f72930f == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f146642a.f41409b, "scaleX", 1.0f, 1.1f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f146642a.f41409b, "scaleY", 1.0f, 1.1f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat2.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f72930f = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f72930f.start();
    }
}
