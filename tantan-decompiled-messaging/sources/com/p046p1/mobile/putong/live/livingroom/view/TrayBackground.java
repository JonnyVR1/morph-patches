package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.ap0;
import p149l.hxs;
import p149l.i7n;
import p149l.p9j0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class TrayBackground extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f52095a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52096b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f52097c;

    /* JADX INFO: renamed from: d */
    public Type f52098d;

    public enum Type {
        first,
        second,
        third,
        fourth
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.TrayBackground$a */
    public class C12942a extends ap0 {
        public C12942a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(TrayBackground.this.f52097c, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.TrayBackground$b */
    public class C12943b extends ap0 {
        public C12943b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(TrayBackground.this.f52097c, false);
        }
    }

    public TrayBackground(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: s */
    private GradientDrawable m76655s(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(t100.m186890d(12.0f));
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m76656u(int i) {
        return i == 300 || i == 200 || i == 100;
    }

    /* JADX INFO: renamed from: B */
    public void m76657B() {
        this.f52097c.m68504n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52097c.clearDynamicData();
        this.f52097c.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76658p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m76658p(View view) {
        p9j0.m167865a(this, view);
    }

    public void setBackgroundImg(String str) {
        xdl0.m208344M(this.f52096b, true);
        xdl0.m208344M(this.f52095a, false);
        hxs.m133406s("context_livingAct", this.f52096b, str);
    }

    /* JADX INFO: renamed from: v */
    public void m76659v(Type type, String str) {
        xdl0.m208344M(this.f52096b, false);
        xdl0.m208344M(this.f52095a, true);
        Type type2 = Type.first;
        if (type == type2) {
            xdl0.m208344M(this.f52095a, true);
            this.f52098d = type2;
            String str2 = BLiveAbsData.VOICE_LIVE.equals(str) ? "#e63e3e48" : "#4D000000";
            this.f52095a.setBackground(m76655s(str2, str2));
            return;
        }
        Type type3 = Type.second;
        if (type == type3) {
            xdl0.m208344M(this.f52095a, false);
            xdl0.m208344M(this.f52097c, true);
            this.f52098d = type3;
            return;
        }
        Type type4 = Type.third;
        if (type == type4) {
            this.f52098d = type4;
            xdl0.m208344M(this.f52095a, false);
            xdl0.m208344M(this.f52097c, true);
        } else {
            Type type5 = Type.fourth;
            if (type == type5) {
                this.f52098d = type5;
                xdl0.m208344M(this.f52095a, false);
                xdl0.m208344M(this.f52097c, true);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m76660w() {
        boolean zM134916b = i7n.m134916b();
        Type type = this.f52098d;
        if (zM134916b) {
            if (type == Type.second) {
                this.f52097c.m68499i("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0, null, false);
                return;
            } else if (type == Type.third) {
                this.f52097c.m68499i("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0, null, false);
                return;
            } else {
                if (type == Type.fourth) {
                    this.f52097c.m68499i("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0, null, false);
                    return;
                }
                return;
            }
        }
        if (type == Type.second) {
            this.f52097c.m68500j("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0);
        } else if (type == Type.third) {
            this.f52097c.m68500j("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0);
        } else if (type == Type.fourth) {
            this.f52097c.m68500j("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m76661z(String str) {
        boolean zM134916b = i7n.m134916b();
        AnimEffectPlayer animEffectPlayer = this.f52097c;
        if (zM134916b) {
            xdl0.m208344M(animEffectPlayer, true);
            this.f52097c.m68499i(str, 0, new C12942a(), false);
        } else {
            xdl0.m208344M(animEffectPlayer, true);
            this.f52097c.mo68502l(str, 0, new C12943b());
        }
    }

    public TrayBackground(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrayBackground(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
