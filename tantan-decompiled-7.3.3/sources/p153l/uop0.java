package p153l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class uop0 extends oc1 {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f180114b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f180115c;

    /* JADX INFO: renamed from: d */
    public final ga1 f180116d;

    public uop0(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
        this.f180116d = new C20607a();
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: a */
    public void mo99660a() {
        if (this.f146642a.f41409b.getScaleX() != 1.0f) {
            m197015i();
        }
        if (this.f146642a.f41410c.getScaleX() != 1.0f) {
            m197014h();
        }
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: b */
    public void mo99661b() {
        pb1.m171472b().mo171477f(FeedAudioRecordView.f41407y, AudioBusinessType.NORMAL, this.f180116d);
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: d */
    public void mo99663d(AudioRecordState audioRecordState) {
        this.f146642a.f41413f.setText(R$string.f39777L1);
        this.f146642a.f41414g.setText(String.valueOf(0));
        this.f146642a.f41416i.setVisibility(8);
        this.f146642a.f41417j.setVisibility(8);
        this.f146642a.f41412e.setVisibility(8);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m197011e() {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (PermissionHelper.m81064b(strArr)) {
            return true;
        }
        PermissionHelper.m81065c().m81083r(strArr).m81088w(false).m81086u(true).m81074i(this.f146642a.f41418k);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m197012f() {
        return this.f146642a.f41410c.getScaleX() != 1.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m197013g() {
        i4g0.m138523u("e_voice_button", "p_moment_post", new pf60("recording_status", "begin"), new pf60("voice_duration", "0"));
        if (!m197011e() || this.f146642a.f41427t || m197012f() || !FeedAudioCanWorkControl.m62103b()) {
            return;
        }
        FeedAudioRecordView feedAudioRecordView = this.f146642a;
        feedAudioRecordView.f41427t = true;
        feedAudioRecordView.m63794k(AudioRecordState.RECORDING);
        FeedAudioRecordView feedAudioRecordView2 = this.f146642a;
        feedAudioRecordView2.f41424q.m191979C(feedAudioRecordView2.f41426s);
        FeedAudioRecordView feedAudioRecordView3 = this.f146642a;
        feedAudioRecordView3.f41426s++;
        feedAudioRecordView3.m63787E();
        lb1.m153552b(null, 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m197014h() {
        View view = this.f146642a.f41410c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f146642a.f41410c;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f180115c = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f180115c.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m197015i() {
        View view = this.f146642a.f41409b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        View view2 = this.f146642a.f41409b;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f180114b = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f180114b.start();
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: c */
    public void mo99662c() {
    }

    /* JADX INFO: renamed from: l.uop0$a */
    public class C20607a implements ga1 {
        public C20607a() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            FeedAudioRecordView feedAudioRecordView = uop0.this.f146642a;
            if (feedAudioRecordView.f41419l == AudioRecordState.RECORDING) {
                feedAudioRecordView.m63806w();
            }
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!audioBusinessType2.isHighLevelBusiness()) {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                uop0.this.m197013g();
            } else if (audioBusinessType2 == AudioBusinessType.PHONE) {
                r1j0.m179420g(FeedModule.f39700a.getString(R$string.f39813R1));
            } else {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            }
        }

        @Override // p153l.ga1
        public void success() {
            uop0.this.m197013g();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: c */
        public void mo62651c(String str, AudioBusinessType audioBusinessType, String str2, ga1 ga1Var) {
        }
    }
}
