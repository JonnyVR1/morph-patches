package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.so0;
import p153l.wo0;

/* JADX INFO: loaded from: classes5.dex */
public class AutoVisibleEffectPlayer extends AnimEffectPlayer {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.AutoVisibleEffectPlayer$a */
    public static class C13073a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final AnimEffectPlayer f52479a;

        /* JADX INFO: renamed from: b */
        public final wo0 f52480b;

        public C13073a(AnimEffectPlayer animEffectPlayer, wo0 wo0Var) {
            this.f52480b = wo0Var;
            this.f52479a = animEffectPlayer;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: a */
        public void mo74020a(@NonNull String str) {
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo74020a(str);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo70745b();
            }
            AnimEffectPlayer animEffectPlayer = this.f52479a;
            if (animEffectPlayer != null) {
                bnl0.m105524M(animEffectPlayer, false);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: c */
        public void mo74703c() {
            super.mo74703c();
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo74703c();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: d */
        public void mo71712d(@NonNull so0 so0Var) {
            super.mo71712d(so0Var);
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo71712d(so0Var);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: e */
        public void mo77317e() {
            super.mo77317e();
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo77317e();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: f */
        public void mo74021f() {
            super.mo74021f();
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo74021f();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo70786g();
            }
            AnimEffectPlayer animEffectPlayer = this.f52479a;
            if (animEffectPlayer != null) {
                bnl0.m105524M(animEffectPlayer, true);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: h */
        public void mo77318h(int i, double d) {
            super.mo77318h(i, d);
            wo0 wo0Var = this.f52480b;
            if (wo0Var != null) {
                wo0Var.mo77318h(i, d);
            }
        }
    }

    public AutoVisibleEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer
    /* JADX INFO: renamed from: g */
    public void mo69680g(String str, int i, wo0 wo0Var, boolean z) {
        super.mo69680g(str, i, new C13073a(this, wo0Var), z);
    }

    @Override // com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer
    /* JADX INFO: renamed from: l */
    public void mo69685l(String str, int i, wo0 wo0Var) {
        super.mo69685l(str, i, new C13073a(this, wo0Var));
    }

    public AutoVisibleEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AutoVisibleEffectPlayer(@Nullable Context context) {
        super(context);
    }

    public AutoVisibleEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
