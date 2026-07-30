package p007l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import l.ib1;
import l.j760;
import l.osi0;
import l.z91;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qfp0 extends hc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f12224b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f12225c;

    /* JADX INFO: renamed from: d */
    public final z91 f12226d;

    public qfp0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f12226d = new C2468a();
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: a */
    public void mo10594a() {
        if (this.f8671a.f2022b.getScaleX() != 1.0f) {
            m13553i();
        }
        if (this.f8671a.f2023c.getScaleX() != 1.0f) {
            m13552h();
        }
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: b */
    public void mo10595b() {
        ib1.b().f(FeedAudioRecordView.f2020y, AudioBusinessType.NORMAL, this.f12226d);
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: d */
    public void mo10597d(AudioRecordState audioRecordState) {
        this.f8671a.f2026f.setText(R$string.f390L1);
        this.f8671a.f2027g.setText(String.valueOf(0));
        this.f8671a.f2029i.setVisibility(8);
        this.f8671a.f2030j.setVisibility(8);
        this.f8671a.f2025e.setVisibility(8);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13549e() {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (PermissionHelper.b(strArr)) {
            return true;
        }
        PermissionHelper.c().r(strArr).w(false).u(true).i(this.f8671a.f2031k);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13550f() {
        return this.f8671a.f2023c.getScaleX() != 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m13551g() {
        zvf0.u("e_voice_button", "p_moment_post", new j760[]{new j760("recording_status", "begin"), new j760("voice_duration", "0")});
        if (!m13549e() || this.f8671a.f2040t || m13550f() || !FeedAudioCanWorkControl.m1845b()) {
            return;
        }
        FeedAudioRecordView feedAudioRecordView = this.f8671a;
        feedAudioRecordView.f2040t = true;
        feedAudioRecordView.m3616k(AudioRecordState.RECORDING);
        FeedAudioRecordView feedAudioRecordView2 = this.f8671a;
        feedAudioRecordView2.f2037q.C(feedAudioRecordView2.f2039s);
        FeedAudioRecordView feedAudioRecordView3 = this.f8671a;
        feedAudioRecordView3.f2039s++;
        feedAudioRecordView3.m3609E();
        eb1.m9689b(null, 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m13552h() {
        View view = this.f8671a.f2023c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f8671a.f2023c;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12225c = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f12225c.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m13553i() {
        View view = this.f8671a.f2022b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f8671a.f2022b;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12224b = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f12224b.start();
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: c */
    public void mo10596c() {
    }

    /* JADX INFO: renamed from: l.qfp0$a */
    public class C2468a implements z91 {
        public C2468a() {
        }

        /* JADX INFO: renamed from: b */
        public void m13554b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            FeedAudioRecordView feedAudioRecordView = qfp0.this.f8671a;
            if (feedAudioRecordView.f2032l == AudioRecordState.RECORDING) {
                feedAudioRecordView.m3628w();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13556d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!audioBusinessType2.isHighLevelBusiness()) {
                ib1.b().g(str, audioBusinessType, z91Var);
                qfp0.this.m13551g();
            } else if (audioBusinessType2 == AudioBusinessType.PHONE) {
                osi0.g(FeedModule.f313a.getString(R$string.f426R1));
            } else {
                osi0.g(audioBusinessType2.getBusinessMsg());
            }
        }

        public void success() {
            qfp0.this.m13551g();
        }

        /* JADX INFO: renamed from: c */
        public void m13555c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
        }
    }
}
