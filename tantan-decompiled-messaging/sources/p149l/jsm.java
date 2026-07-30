package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;

/* JADX INFO: loaded from: classes12.dex */
public class jsm extends hc1 {
    public jsm(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: d */
    public void mo130370d(AudioRecordState audioRecordState) {
        m143052e();
    }

    /* JADX INFO: renamed from: e */
    public final void m143052e() {
        m143053f();
        m143054g();
    }

    /* JADX INFO: renamed from: f */
    public final void m143053f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#0Fff5c31"));
        gradientDrawable.setCornerRadius(t100.m186890d(54.0f));
        this.f106988a.f40560a.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(t100.m186890d(54.0f));
        gradientDrawable2.setColor(Color.parseColor("#e9e9e9"));
        this.f106988a.f40568i.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(t100.m186890d(54.0f));
        gradientDrawable3.setColor(this.f106988a.getResources().getColor(e1c0.f88798n));
        this.f106988a.f40569j.setBackground(gradientDrawable3);
        GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f106988a.getResources().getColor(e1c0.f88798n), Color.parseColor("#ff6f31")});
        gradientDrawable4.setGradientType(0);
        gradientDrawable4.setCornerRadius(t100.m186890d(40.0f));
        this.f106988a.f40562c.setBackground(gradientDrawable4);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(-1);
        gradientDrawable5.setCornerRadius(t100.m186890d(44.0f));
        this.f106988a.f40561b.setBackground(gradientDrawable5);
    }

    /* JADX INFO: renamed from: g */
    public final void m143054g() {
        this.f106988a.f40568i.setImageResource(f3c0.f94288B);
        this.f106988a.f40569j.setImageResource(f3c0.f94280A);
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: a */
    public void mo130367a() {
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: b */
    public void mo130368b() {
    }

    @Override // p149l.hc1
    /* JADX INFO: renamed from: c */
    public void mo130369c() {
    }
}
