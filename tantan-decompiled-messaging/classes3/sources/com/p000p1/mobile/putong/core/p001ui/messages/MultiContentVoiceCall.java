package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import l.ej10;
import l.l6c0;
import l.o7r;
import l.w660;
import l.y4c0;
import p003l.dj10;
import p028v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MultiContentVoiceCall extends FrameLayout implements dj10 {

    /* JADX INFO: renamed from: m */
    public static String f1544m = "media_first";

    /* JADX INFO: renamed from: n */
    public static String f1545n = "media_second";

    /* JADX INFO: renamed from: a */
    public MultiContentVoiceCall f1546a;

    /* JADX INFO: renamed from: b */
    public ViewPager f1547b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f1548c;

    /* JADX INFO: renamed from: d */
    public View f1549d;

    /* JADX INFO: renamed from: e */
    public View f1550e;

    /* JADX INFO: renamed from: f */
    public View f1551f;

    /* JADX INFO: renamed from: g */
    public View f1552g;

    /* JADX INFO: renamed from: h */
    public View f1553h;

    /* JADX INFO: renamed from: i */
    public View f1554i;

    /* JADX INFO: renamed from: j */
    public View f1555j;

    /* JADX INFO: renamed from: k */
    public View f1556k;

    /* JADX INFO: renamed from: l */
    public View f1557l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MultiContentVoiceCall$a */
    public class C0100a extends w660 {
        public C0100a() {
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (i == 0 && MultiContentVoiceCall.f1544m.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f1556k);
                MultiContentVoiceCall.this.f1556k.setTag("");
            } else if (i == 1 && MultiContentVoiceCall.f1545n.equals(obj)) {
                viewGroup.removeView(MultiContentVoiceCall.this.f1557l);
                MultiContentVoiceCall.this.f1557l.setTag("");
            }
        }

        public int getCount() {
            return 2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            MultiContentVoiceCall multiContentVoiceCall = MultiContentVoiceCall.this;
            if (i == 0) {
                viewGroup.addView(multiContentVoiceCall.f1556k);
                MultiContentVoiceCall.this.f1556k.setTag(MultiContentVoiceCall.f1544m);
                return MultiContentVoiceCall.f1544m;
            }
            multiContentVoiceCall.f1557l.setTag(MultiContentVoiceCall.f1545n);
            viewGroup.addView(MultiContentVoiceCall.this.f1557l);
            return MultiContentVoiceCall.f1545n;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }
    }

    public MultiContentVoiceCall(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m2080d(View view) {
        ej10.a(this, view);
    }

    public View getMediaCameraView() {
        return this.f1552g;
    }

    public View getMediaIntimateQuestionView() {
        return this.f1550e;
    }

    public View getMediaLocationView() {
        return this.f1549d;
    }

    public View getMediaMildQuestionView() {
        return this.f1551f;
    }

    public View getMediaPictureView() {
        return this.f1555j;
    }

    public View getMediaVideoView() {
        return this.f1553h;
    }

    public View getMediaVoiceCall() {
        return this.f1554i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2080d(this);
        this.f1556k = o7r.a(getContext()).inflate(l6c0.n3, (ViewGroup) this.f1547b, false);
        this.f1557l = o7r.a(getContext()).inflate(l6c0.o3, (ViewGroup) this.f1547b, false);
        this.f1549d = this.f1556k.findViewById(y4c0.T1);
        this.f1550e = this.f1556k.findViewById(y4c0.z1);
        this.f1551f = this.f1556k.findViewById(y4c0.p2);
        this.f1552g = this.f1556k.findViewById(y4c0.F);
        this.f1555j = this.f1556k.findViewById(y4c0.j3);
        this.f1554i = this.f1556k.findViewById(y4c0.x5);
        this.f1553h = this.f1557l.findViewById(y4c0.t5);
        this.f1547b.setAdapter(new C0100a());
        this.f1548c.setViewPager(this.f1547b);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiContentVoiceCall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
