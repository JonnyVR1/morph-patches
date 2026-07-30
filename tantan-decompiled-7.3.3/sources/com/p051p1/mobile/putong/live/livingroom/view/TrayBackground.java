package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.i9n;
import p153l.izs;
import p153l.qa00;
import p153l.tij0;
import p153l.wo0;

/* JADX INFO: loaded from: classes5.dex */
public class TrayBackground extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f52943a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52944b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f52945c;

    /* JADX INFO: renamed from: d */
    public Type f52946d;

    public enum Type {
        first,
        second,
        third,
        fourth
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.TrayBackground$a */
    public class C13105a extends wo0 {
        public C13105a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(TrayBackground.this.f52945c, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.TrayBackground$b */
    public class C13106b extends wo0 {
        public C13106b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(TrayBackground.this.f52945c, false);
        }
    }

    public TrayBackground(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: s */
    private GradientDrawable m77838s(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(12.0f));
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m77839u(int i) {
        return i == 300 || i == 200 || i == 100;
    }

    /* JADX INFO: renamed from: B */
    public void m77840B() {
        this.f52945c.m69687n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52945c.clearDynamicData();
        this.f52945c.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77841p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m77841p(View view) {
        tij0.m191335a(this, view);
    }

    public void setBackgroundImg(String str) {
        bnl0.m105524M(this.f52944b, true);
        bnl0.m105524M(this.f52943a, false);
        izs.m142868s("context_livingAct", this.f52944b, str);
    }

    /* JADX INFO: renamed from: v */
    public void m77842v(Type type, String str) {
        bnl0.m105524M(this.f52944b, false);
        bnl0.m105524M(this.f52943a, true);
        Type type2 = Type.first;
        if (type == type2) {
            bnl0.m105524M(this.f52943a, true);
            this.f52946d = type2;
            String str2 = BLiveAbsData.VOICE_LIVE.equals(str) ? "#e63e3e48" : "#4D000000";
            this.f52943a.setBackground(m77838s(str2, str2));
            return;
        }
        Type type3 = Type.second;
        if (type == type3) {
            bnl0.m105524M(this.f52943a, false);
            bnl0.m105524M(this.f52945c, true);
            this.f52946d = type3;
            return;
        }
        Type type4 = Type.third;
        if (type == type4) {
            this.f52946d = type4;
            bnl0.m105524M(this.f52943a, false);
            bnl0.m105524M(this.f52945c, true);
        } else {
            Type type5 = Type.fourth;
            if (type == type5) {
                this.f52946d = type5;
                bnl0.m105524M(this.f52943a, false);
                bnl0.m105524M(this.f52945c, true);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m77843w() {
        boolean zM139127b = i9n.m139127b();
        Type type = this.f52946d;
        if (zM139127b) {
            if (type == Type.second) {
                this.f52945c.m69682i("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0, null, false);
                return;
            } else if (type == Type.third) {
                this.f52945c.m69682i("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0, null, false);
                return;
            } else {
                if (type == Type.fourth) {
                    this.f52945c.m69682i("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0, null, false);
                    return;
                }
                return;
            }
        }
        if (type == Type.second) {
            this.f52945c.m69683j("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0);
        } else if (type == Type.third) {
            this.f52945c.m69683j("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0);
        } else if (type == Type.fourth) {
            this.f52945c.m69683j("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m77844z(String str) {
        boolean zM139127b = i9n.m139127b();
        AnimEffectPlayer animEffectPlayer = this.f52945c;
        if (zM139127b) {
            bnl0.m105524M(animEffectPlayer, true);
            this.f52945c.m69682i(str, 0, new C13105a(), false);
        } else {
            bnl0.m105524M(animEffectPlayer, true);
            this.f52945c.mo69685l(str, 0, new C13106b());
        }
    }

    public TrayBackground(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrayBackground(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
