package p007l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import l.ib1;
import l.j760;
import l.lsi0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tic0 extends hc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f13311b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f13312c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f13313d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f13314e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f13315f;

    public tic0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: a */
    public void mo10594a() {
        m14551k();
        m14550j();
        m14547g();
        m14549i();
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: b */
    public void mo10595b() {
        ib1.b().a(FeedAudioRecordView.f2020y);
        m14546f();
        zvf0.u("e_voice_button", "p_moment_post", new j760[]{new j760("recording_status", "over"), new j760("voice_duration", new DecimalFormat("0.0").format(this.f8671a.f2041u))});
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: c */
    public void mo10596c() {
        if (NullChecker.a(this.f13313d)) {
            this.f13313d.cancel();
            this.f8671a.f2024d.setProgress(0.0f);
        }
        if (NullChecker.a(this.f13311b)) {
            this.f13311b.cancel();
        }
        if (NullChecker.a(this.f13312c)) {
            this.f13312c.cancel();
        }
        m14548h();
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: d */
    public void mo10597d(AudioRecordState audioRecordState) {
        this.f8671a.f2026f.setText(R$string.f396M1);
    }

    /* JADX INFO: renamed from: e */
    public final void m14545e() {
        this.f8671a.m3616k(AudioRecordState.COMPLETING);
    }

    /* JADX INFO: renamed from: f */
    public final void m14546f() {
        FeedAudioRecordView feedAudioRecordView = this.f8671a;
        boolean zM3607C = feedAudioRecordView.m3607C(feedAudioRecordView.f2041u);
        FeedAudioRecordView feedAudioRecordView2 = this.f8671a;
        if (zM3607C) {
            feedAudioRecordView2.m3611G();
            m14545e();
        } else {
            feedAudioRecordView2.m3616k(AudioRecordState.WAITING);
            lsi0.w(R$string.f371I0);
            this.f8671a.m3614i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14547g() {
        if (this.f13311b == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8671a.f2023c, "scaleX", 1.0f, 0.4f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8671a.f2023c, "scaleY", 1.0f, 0.4f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13311b = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f13311b.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m14548h() {
        if (this.f13314e == null) {
            View view = this.f8671a.f2021a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
            View view2 = this.f8671a.f2021a;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat2.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13314e = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f13314e.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m14549i() {
        if (this.f13312c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8671a.f2021a, "scaleX", 1.0f, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8671a.f2021a, "scaleY", 1.0f, 1.1f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(2000);
            objectAnimatorOfFloat2.setRepeatCount(2000);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13312c = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f13312c.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m14550j() {
        if (this.f13313d == null) {
            this.f13313d = this.f8671a.f2024d.m7625b(60000L);
        }
        this.f13313d.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m14551k() {
        if (this.f13315f == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8671a.f2022b, "scaleX", 1.0f, 1.1f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f8671a.f2022b, "scaleY", 1.0f, 1.1f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat2.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13315f = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        this.f13315f.start();
    }
}
