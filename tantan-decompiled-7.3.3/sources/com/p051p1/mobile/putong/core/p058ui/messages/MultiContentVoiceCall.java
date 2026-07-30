package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import p151v.VPagerCircleIndicator;
import p153l.cf60;
import p153l.edc0;
import p153l.nr10;
import p153l.or10;
import p153l.p9r;
import p153l.qec0;

/* JADX INFO: loaded from: classes3.dex */
public class MultiContentVoiceCall extends FrameLayout implements nr10 {

    /* JADX INFO: renamed from: m */
    public static String f32501m = "media_first";

    /* JADX INFO: renamed from: n */
    public static String f32502n = "media_second";

    /* JADX INFO: renamed from: a */
    public MultiContentVoiceCall f32503a;

    /* JADX INFO: renamed from: b */
    public ViewPager f32504b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f32505c;

    /* JADX INFO: renamed from: d */
    public View f32506d;

    /* JADX INFO: renamed from: e */
    public View f32507e;

    /* JADX INFO: renamed from: f */
    public View f32508f;

    /* JADX INFO: renamed from: g */
    public View f32509g;

    /* JADX INFO: renamed from: h */
    public View f32510h;

    /* JADX INFO: renamed from: i */
    public View f32511i;

    /* JADX INFO: renamed from: j */
    public View f32512j;

    /* JADX INFO: renamed from: k */
    public View f32513k;

    /* JADX INFO: renamed from: l */
    public View f32514l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MultiContentVoiceCall$a */
    public class C8680a extends cf60 {
        public C8680a() {
        }

        @Override // p153l.cf60
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (i == 0 && MultiContentVoiceCall.f32501m.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f32513k);
                MultiContentVoiceCall.this.f32513k.setTag("");
            } else if (i == 1 && MultiContentVoiceCall.f32502n.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f32514l);
                MultiContentVoiceCall.this.f32514l.setTag("");
            }
        }

        @Override // p153l.cf60
        public int getCount() {
            return 2;
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            MultiContentVoiceCall multiContentVoiceCall = MultiContentVoiceCall.this;
            if (i == 0) {
                viewGroup.addView(multiContentVoiceCall.f32513k);
                MultiContentVoiceCall.this.f32513k.setTag(MultiContentVoiceCall.f32501m);
                return MultiContentVoiceCall.f32501m;
            }
            multiContentVoiceCall.f32514l.setTag(MultiContentVoiceCall.f32502n);
            viewGroup.addView(MultiContentVoiceCall.this.f32514l);
            return MultiContentVoiceCall.f32502n;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }
    }

    public MultiContentVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m50167d(View view) {
        or10.m168853a(this, view);
    }

    public View getMediaCameraView() {
        return this.f32509g;
    }

    public View getMediaIntimateQuestionView() {
        return this.f32507e;
    }

    public View getMediaLocationView() {
        return this.f32506d;
    }

    public View getMediaMildQuestionView() {
        return this.f32508f;
    }

    public View getMediaPictureView() {
        return this.f32512j;
    }

    public View getMediaVideoView() {
        return this.f32510h;
    }

    public View getMediaVoiceCall() {
        return this.f32511i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50167d(this);
        this.f32513k = p9r.m171370a(getContext()).inflate(qec0.f157082n3, (ViewGroup) this.f32504b, false);
        this.f32514l = p9r.m171370a(getContext()).inflate(qec0.f157089o3, (ViewGroup) this.f32504b, false);
        this.f32506d = this.f32513k.findViewById(edc0.f93282T1);
        this.f32507e = this.f32513k.findViewById(edc0.f93499z1);
        this.f32508f = this.f32513k.findViewById(edc0.f93430p2);
        this.f32509g = this.f32513k.findViewById(edc0.f93196F);
        this.f32512j = this.f32513k.findViewById(edc0.f93389j3);
        this.f32511i = this.f32513k.findViewById(edc0.f93489x5);
        this.f32510h = this.f32514l.findViewById(edc0.f93461t5);
        this.f32504b.setAdapter(new C8680a());
        this.f32505c.setViewPager(this.f32504b);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
