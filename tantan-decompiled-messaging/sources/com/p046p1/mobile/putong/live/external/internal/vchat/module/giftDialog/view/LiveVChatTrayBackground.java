package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import p149l.bru;
import p149l.hxs;
import p149l.i7n;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatTrayBackground extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f45260a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45261b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f45262c;

    /* JADX INFO: renamed from: d */
    public Type f45263d;

    public enum Type {
        first,
        second,
        third,
        fourth
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground$a */
    public class C12522a extends ap0 {
        public C12522a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(LiveVChatTrayBackground.this.f45262c, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground$b */
    public class C12523b extends ap0 {
        public C12523b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(LiveVChatTrayBackground.this.f45262c, false);
        }
    }

    public LiveVChatTrayBackground(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45262c.clearDynamicData();
        this.f45262c.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69556p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m69556p(View view) {
        bru.m103600a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final GradientDrawable m69557s(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(t100.m186890d(12.0f));
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    public void setBackgroundImg(String str) {
        xdl0.m208344M(this.f45261b, true);
        xdl0.m208344M(this.f45260a, false);
        hxs.m133406s("context_livingAct", this.f45261b, str);
    }

    /* JADX INFO: renamed from: u */
    public void m69558u(Type type, String str) {
        xdl0.m208344M(this.f45261b, false);
        xdl0.m208344M(this.f45260a, true);
        Type type2 = Type.first;
        if (type == type2) {
            xdl0.m208344M(this.f45260a, true);
            this.f45263d = type2;
            String str2 = BLiveAbsData.VOICE_LIVE.equals(str) ? "#e63e3e48" : "#4D000000";
            this.f45260a.setBackground(m69557s(str2, str2));
            return;
        }
        Type type3 = Type.second;
        if (type == type3) {
            xdl0.m208344M(this.f45260a, false);
            xdl0.m208344M(this.f45262c, true);
            this.f45263d = type3;
            return;
        }
        Type type4 = Type.third;
        if (type == type4) {
            this.f45263d = type4;
            xdl0.m208344M(this.f45260a, false);
            xdl0.m208344M(this.f45262c, true);
        } else {
            Type type5 = Type.fourth;
            if (type == type5) {
                this.f45263d = type5;
                xdl0.m208344M(this.f45260a, false);
                xdl0.m208344M(this.f45262c, true);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m69559v() {
        boolean zM134916b = i7n.m134916b();
        Type type = this.f45263d;
        if (zM134916b) {
            if (type == Type.second) {
                this.f45262c.m68499i("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0, null, false);
                return;
            } else if (type == Type.third) {
                this.f45262c.m68499i("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0, null, false);
                return;
            } else {
                if (type == Type.fourth) {
                    this.f45262c.m68499i("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0, null, false);
                    return;
                }
                return;
            }
        }
        if (type == Type.second) {
            this.f45262c.m68500j("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0);
        } else if (type == Type.third) {
            this.f45262c.m68500j("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0);
        } else if (type == Type.fourth) {
            this.f45262c.m68500j("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m69560w(String str) {
        boolean zM134916b = i7n.m134916b();
        AnimEffectPlayer animEffectPlayer = this.f45262c;
        if (zM134916b) {
            xdl0.m208344M(animEffectPlayer, true);
            this.f45262c.m68499i(str, 0, new C12522a(), false);
        } else {
            xdl0.m208344M(animEffectPlayer, true);
            this.f45262c.mo68502l(str, 0, new C12523b());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m69561z() {
        this.f45262c.m68504n();
    }

    public LiveVChatTrayBackground(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveVChatTrayBackground(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
