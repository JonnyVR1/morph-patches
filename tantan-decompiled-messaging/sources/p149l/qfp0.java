package p149l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes12.dex */
public class qfp0 extends hc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f154157b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f154158c;

    /* JADX INFO: renamed from: d */
    public final z91 f154159d;

    public qfp0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f154159d = new C19489a();
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: a */
    public void mo130367a() {
        if (this.f106988a.f40561b.getScaleX() != 1.0f) {
            m174371i();
        }
        if (this.f106988a.f40562c.getScaleX() != 1.0f) {
            m174370h();
        }
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: b */
    public void mo130368b() {
        ib1.m135233b().mo135238f(FeedAudioRecordView.f40559y, AudioBusinessType.NORMAL, this.f154159d);
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: d */
    public void mo130370d(AudioRecordState audioRecordState) {
        this.f106988a.f40565f.setText(R$string.f38929L1);
        this.f106988a.f40566g.setText(String.valueOf(0));
        this.f106988a.f40568i.setVisibility(8);
        this.f106988a.f40569j.setVisibility(8);
        this.f106988a.f40564e.setVisibility(8);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m174367e() {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (PermissionHelper.m79881b(strArr)) {
            return true;
        }
        PermissionHelper.m79882c().m79900r(strArr).m79905w(false).m79903u(true).m79891i(this.f106988a.f40570k);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m174368f() {
        return this.f106988a.f40562c.getScaleX() != 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m174369g() {
        zvf0.m220399u("e_voice_button", "p_moment_post", new j760("recording_status", "begin"), new j760("voice_duration", "0"));
        if (!m174367e() || this.f106988a.f40579t || m174368f() || !FeedAudioCanWorkControl.m60919b()) {
            return;
        }
        FeedAudioRecordView feedAudioRecordView = this.f106988a;
        feedAudioRecordView.f40579t = true;
        feedAudioRecordView.m62611k(AudioRecordState.RECORDING);
        FeedAudioRecordView feedAudioRecordView2 = this.f106988a;
        feedAudioRecordView2.f40576q.m194191C(feedAudioRecordView2.f40578s);
        FeedAudioRecordView feedAudioRecordView3 = this.f106988a;
        feedAudioRecordView3.f40578s++;
        feedAudioRecordView3.m62604E();
        eb1.m115447b(null, 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m174370h() {
        View view = this.f106988a.f40562c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f106988a.f40562c;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f154158c = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f154158c.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m174371i() {
        View view = this.f106988a.f40561b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f106988a.f40561b;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f154157b = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f154157b.start();
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: c */
    public void mo130369c() {
    }

    /* JADX INFO: renamed from: l.qfp0$a */
    public class C19489a implements z91 {
        public C19489a() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            FeedAudioRecordView feedAudioRecordView = qfp0.this.f106988a;
            if (feedAudioRecordView.f40571l == AudioRecordState.RECORDING) {
                feedAudioRecordView.m62623w();
            }
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!audioBusinessType2.isHighLevelBusiness()) {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                qfp0.this.m174369g();
            } else if (audioBusinessType2 == AudioBusinessType.PHONE) {
                osi0.m165783g(FeedModule.f38852a.getString(R$string.f38965R1));
            } else {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            }
        }

        @Override // p149l.z91
        public void success() {
            qfp0.this.m174369g();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: c */
        public void mo61467c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
        }
    }
}
