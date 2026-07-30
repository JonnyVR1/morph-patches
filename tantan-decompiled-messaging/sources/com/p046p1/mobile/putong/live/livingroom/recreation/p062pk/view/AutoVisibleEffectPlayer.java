package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.Nullable;
import p149l.ap0;
import p149l.wo0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class AutoVisibleEffectPlayer extends AnimEffectPlayer {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.AutoVisibleEffectPlayer$a */
    public static class C12910a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final AnimEffectPlayer f51631a;

        /* JADX INFO: renamed from: b */
        public final ap0 f51632b;

        public C12910a(AnimEffectPlayer animEffectPlayer, ap0 ap0Var) {
            this.f51632b = ap0Var;
            this.f51631a = animEffectPlayer;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: a */
        public void mo72837a(@NonNull String str) {
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo72837a(str);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo69562b();
            }
            AnimEffectPlayer animEffectPlayer = this.f51631a;
            if (animEffectPlayer != null) {
                xdl0.m208344M(animEffectPlayer, false);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: c */
        public void mo73520c() {
            super.mo73520c();
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo73520c();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: d */
        public void mo70529d(@NonNull wo0 wo0Var) {
            super.mo70529d(wo0Var);
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo70529d(wo0Var);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: e */
        public void mo76134e() {
            super.mo76134e();
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo76134e();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: f */
        public void mo72838f() {
            super.mo72838f();
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo72838f();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo69603g();
            }
            AnimEffectPlayer animEffectPlayer = this.f51631a;
            if (animEffectPlayer != null) {
                xdl0.m208344M(animEffectPlayer, true);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: h */
        public void mo76135h(int i, double d) {
            super.mo76135h(i, d);
            ap0 ap0Var = this.f51632b;
            if (ap0Var != null) {
                ap0Var.mo76135h(i, d);
            }
        }
    }

    public AutoVisibleEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer
    /* JADX INFO: renamed from: g */
    public void mo68497g(String str, int i, ap0 ap0Var, boolean z) {
        super.mo68497g(str, i, new C12910a(this, ap0Var), z);
    }

    @Override // com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer
    /* JADX INFO: renamed from: l */
    public void mo68502l(String str, int i, ap0 ap0Var) {
        super.mo68502l(str, i, new C12910a(this, ap0Var));
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
