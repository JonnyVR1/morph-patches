package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import p153l.ctu;
import p153l.i9n;
import p153l.izs;
import p153l.qa00;
import p153l.wo0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatTrayBackground extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f46108a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46109b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f46110c;

    /* JADX INFO: renamed from: d */
    public Type f46111d;

    public enum Type {
        first,
        second,
        third,
        fourth
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground$a */
    public class C12685a extends wo0 {
        public C12685a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(LiveVChatTrayBackground.this.f46110c, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground$b */
    public class C12686b extends wo0 {
        public C12686b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(LiveVChatTrayBackground.this.f46110c, false);
        }
    }

    public LiveVChatTrayBackground(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46110c.clearDynamicData();
        this.f46110c.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70739p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m70739p(View view) {
        ctu.m112553a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final GradientDrawable m70740s(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(12.0f));
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    public void setBackgroundImg(String str) {
        bnl0.m105524M(this.f46109b, true);
        bnl0.m105524M(this.f46108a, false);
        izs.m142868s("context_livingAct", this.f46109b, str);
    }

    /* JADX INFO: renamed from: u */
    public void m70741u(Type type, String str) {
        bnl0.m105524M(this.f46109b, false);
        bnl0.m105524M(this.f46108a, true);
        Type type2 = Type.first;
        if (type == type2) {
            bnl0.m105524M(this.f46108a, true);
            this.f46111d = type2;
            String str2 = BLiveAbsData.VOICE_LIVE.equals(str) ? "#e63e3e48" : "#4D000000";
            this.f46108a.setBackground(m70740s(str2, str2));
            return;
        }
        Type type3 = Type.second;
        if (type == type3) {
            bnl0.m105524M(this.f46108a, false);
            bnl0.m105524M(this.f46110c, true);
            this.f46111d = type3;
            return;
        }
        Type type4 = Type.third;
        if (type == type4) {
            this.f46111d = type4;
            bnl0.m105524M(this.f46108a, false);
            bnl0.m105524M(this.f46110c, true);
        } else {
            Type type5 = Type.fourth;
            if (type == type5) {
                this.f46111d = type5;
                bnl0.m105524M(this.f46108a, false);
                bnl0.m105524M(this.f46110c, true);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m70742v() {
        boolean zM139127b = i9n.m139127b();
        Type type = this.f46111d;
        if (zM139127b) {
            if (type == Type.second) {
                this.f46110c.m69682i("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0, null, false);
                return;
            } else if (type == Type.third) {
                this.f46110c.m69682i("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0, null, false);
                return;
            } else {
                if (type == Type.fourth) {
                    this.f46110c.m69682i("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0, null, false);
                    return;
                }
                return;
            }
        }
        if (type == Type.second) {
            this.f46110c.m69683j("https://auto.tancdn.com/v1/raw/e9a7dfe6-1aa5-4280-8067-a2161fb1925c11.pdf", 0);
        } else if (type == Type.third) {
            this.f46110c.m69683j("https://auto.tancdn.com/v1/raw/6576f882-b083-415e-ac89-eebbfb83706510.pdf", 0);
        } else if (type == Type.fourth) {
            this.f46110c.m69683j("https://auto.tancdn.com/v1/raw/2e06f3f3-8507-4a93-a020-0862e6aadf5c11.pdf", 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m70743w(String str) {
        boolean zM139127b = i9n.m139127b();
        AnimEffectPlayer animEffectPlayer = this.f46110c;
        if (zM139127b) {
            bnl0.m105524M(animEffectPlayer, true);
            this.f46110c.m69682i(str, 0, new C12685a(), false);
        } else {
            bnl0.m105524M(animEffectPlayer, true);
            this.f46110c.mo69685l(str, 0, new C12686b());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m70744z() {
        this.f46110c.m69687n();
    }

    public LiveVChatTrayBackground(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveVChatTrayBackground(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
