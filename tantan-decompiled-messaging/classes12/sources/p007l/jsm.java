package p007l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jsm extends hc1 {
    public jsm(FeedAudioRecordView feedAudioRecordView) {
        super(feedAudioRecordView);
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: d */
    public void mo10597d(AudioRecordState audioRecordState) {
        m11325e();
    }

    /* JADX INFO: renamed from: e */
    public final void m11325e() {
        m11326f();
        m11327g();
    }

    /* JADX INFO: renamed from: f */
    public final void m11326f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#0Fff5c31"));
        gradientDrawable.setCornerRadius(t100.d(54.0f));
        this.f8671a.f2021a.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(t100.d(54.0f));
        gradientDrawable2.setColor(Color.parseColor("#e9e9e9"));
        this.f8671a.f2029i.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(t100.d(54.0f));
        gradientDrawable3.setColor(this.f8671a.getResources().getColor(e1c0.f7154n));
        this.f8671a.f2030j.setBackground(gradientDrawable3);
        GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.f8671a.getResources().getColor(e1c0.f7154n), Color.parseColor("#ff6f31")});
        gradientDrawable4.setGradientType(0);
        gradientDrawable4.setCornerRadius(t100.d(40.0f));
        this.f8671a.f2023c.setBackground(gradientDrawable4);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(-1);
        gradientDrawable5.setCornerRadius(t100.d(44.0f));
        this.f8671a.f2022b.setBackground(gradientDrawable5);
    }

    /* JADX INFO: renamed from: g */
    public final void m11327g() {
        this.f8671a.f2029i.setImageResource(f3c0.f7571B);
        this.f8671a.f2030j.setImageResource(f3c0.f7563A);
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: a */
    public void mo10594a() {
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: b */
    public void mo10595b() {
    }

    @Override // p007l.hc1
    /* JADX INFO: renamed from: c */
    public void mo10596c() {
    }
}
