package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;

/* JADX INFO: loaded from: classes13.dex */
public class lum extends oc1 {
    public lum(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: d */
    public void mo99663d(AudioRecordState audioRecordState) {
        m155945e();
    }

    /* JADX INFO: renamed from: e */
    public final void m155945e() {
        m155946f();
        m155947g();
    }

    /* JADX INFO: renamed from: f */
    public final void m155946f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#0Fff5c31"));
        gradientDrawable.setCornerRadius(qa00.m175859d(54.0f));
        this.f146642a.f41408a.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(qa00.m175859d(54.0f));
        gradientDrawable2.setColor(Color.parseColor("#e9e9e9"));
        this.f146642a.f41416i.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(qa00.m175859d(54.0f));
        gradientDrawable3.setColor(this.f146642a.getResources().getColor(k9c0.f124521n));
        this.f146642a.f41417j.setBackground(gradientDrawable3);
        GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f146642a.getResources().getColor(k9c0.f124521n), Color.parseColor("#ff6f31")});
        gradientDrawable4.setGradientType(0);
        gradientDrawable4.setCornerRadius(qa00.m175859d(40.0f));
        this.f146642a.f41410c.setBackground(gradientDrawable4);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(-1);
        gradientDrawable5.setCornerRadius(qa00.m175859d(44.0f));
        this.f146642a.f41409b.setBackground(gradientDrawable5);
    }

    /* JADX INFO: renamed from: g */
    public final void m155947g() {
        this.f146642a.f41416i.setImageResource(lbc0.f130806B);
        this.f146642a.f41417j.setImageResource(lbc0.f130798A);
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: a */
    public void mo99660a() {
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: b */
    public void mo99661b() {
    }

    @Override // p153l.oc1
    /* JADX INFO: renamed from: c */
    public void mo99662c() {
    }
}
