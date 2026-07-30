package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import p147v.VPagerCircleIndicator;
import p149l.dj10;
import p149l.ej10;
import p149l.l6c0;
import p149l.o7r;
import p149l.w660;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class MultiContentVoiceCall extends FrameLayout implements dj10 {

    /* JADX INFO: renamed from: m */
    public static String f31653m = "media_first";

    /* JADX INFO: renamed from: n */
    public static String f31654n = "media_second";

    /* JADX INFO: renamed from: a */
    public MultiContentVoiceCall f31655a;

    /* JADX INFO: renamed from: b */
    public ViewPager f31656b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f31657c;

    /* JADX INFO: renamed from: d */
    public View f31658d;

    /* JADX INFO: renamed from: e */
    public View f31659e;

    /* JADX INFO: renamed from: f */
    public View f31660f;

    /* JADX INFO: renamed from: g */
    public View f31661g;

    /* JADX INFO: renamed from: h */
    public View f31662h;

    /* JADX INFO: renamed from: i */
    public View f31663i;

    /* JADX INFO: renamed from: j */
    public View f31664j;

    /* JADX INFO: renamed from: k */
    public View f31665k;

    /* JADX INFO: renamed from: l */
    public View f31666l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MultiContentVoiceCall$a */
    public class C8517a extends w660 {
        public C8517a() {
        }

        @Override // p149l.w660
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (i == 0 && MultiContentVoiceCall.f31653m.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f31665k);
                MultiContentVoiceCall.this.f31665k.setTag("");
            } else if (i == 1 && MultiContentVoiceCall.f31654n.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f31666l);
                MultiContentVoiceCall.this.f31666l.setTag("");
            }
        }

        @Override // p149l.w660
        public int getCount() {
            return 2;
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            MultiContentVoiceCall multiContentVoiceCall = MultiContentVoiceCall.this;
            if (i == 0) {
                viewGroup.addView(multiContentVoiceCall.f31665k);
                MultiContentVoiceCall.this.f31665k.setTag(MultiContentVoiceCall.f31653m);
                return MultiContentVoiceCall.f31653m;
            }
            multiContentVoiceCall.f31666l.setTag(MultiContentVoiceCall.f31654n);
            viewGroup.addView(MultiContentVoiceCall.this.f31666l);
            return MultiContentVoiceCall.f31654n;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }
    }

    public MultiContentVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m48984d(View view) {
        ej10.m116752a(this, view);
    }

    public View getMediaCameraView() {
        return this.f31661g;
    }

    public View getMediaIntimateQuestionView() {
        return this.f31659e;
    }

    public View getMediaLocationView() {
        return this.f31658d;
    }

    public View getMediaMildQuestionView() {
        return this.f31660f;
    }

    public View getMediaPictureView() {
        return this.f31664j;
    }

    public View getMediaVideoView() {
        return this.f31662h;
    }

    public View getMediaVoiceCall() {
        return this.f31663i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48984d(this);
        this.f31665k = o7r.m163037a(getContext()).inflate(l6c0.f126526n3, (ViewGroup) this.f31656b, false);
        this.f31666l = o7r.m163037a(getContext()).inflate(l6c0.f126533o3, (ViewGroup) this.f31656b, false);
        this.f31658d = this.f31665k.findViewById(y4c0.f196047T1);
        this.f31659e = this.f31665k.findViewById(y4c0.f196264z1);
        this.f31660f = this.f31665k.findViewById(y4c0.f196195p2);
        this.f31661g = this.f31665k.findViewById(y4c0.f195961F);
        this.f31664j = this.f31665k.findViewById(y4c0.f196154j3);
        this.f31663i = this.f31665k.findViewById(y4c0.f196254x5);
        this.f31662h = this.f31666l.findViewById(y4c0.f196226t5);
        this.f31656b.setAdapter(new C8517a());
        this.f31657c.setViewPager(this.f31656b);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
