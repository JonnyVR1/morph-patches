package com.p000p1.mobile.putong.live.livingroom.common.usercard;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGAVideoEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.gp0;
import l.hce;
import l.hxs;
import l.ngm;
import l.t100;
import l.wo0;
import l.xdl0;
import l.ym2;
import p002l.g5c0;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CommonMedalView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f5426d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f5427e;

    /* JADX INFO: renamed from: f */
    public C0371c f5428f;

    /* JADX INFO: renamed from: g */
    public int f5429g;

    /* JADX INFO: renamed from: h */
    public int f5430h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$a */
    public class C0369a extends ym2 {
        public C0369a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public void m6826h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            float width = ngmVar.getWidth() / ngmVar.getHeight();
            xdl0.D0((int) (CommonMedalView.this.f5429g * width), new View[]{CommonMedalView.this.f5426d});
            xdl0.D0((int) (CommonMedalView.this.f5429g * width), new View[]{CommonMedalView.this});
            xdl0.C0(CommonMedalView.this.f5426d, CommonMedalView.this.f5429g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$b */
    public class C0370b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f5432a;

        public C0370b(SVGAnimationView sVGAnimationView) {
            this.f5432a = sVGAnimationView;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (resource.get() instanceof SVGAVideoEntity) {
                gp0 gp0VarB = wo0.a((SVGAVideoEntity) resource.get()).b();
                xdl0.D0((int) (((double) CommonMedalView.this.f5429g) * (gp0VarB.c() / gp0VarB.b())), new View[]{this.f5432a});
                xdl0.C0(this.f5432a, CommonMedalView.this.f5429g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$c */
    public static class C0371c {

        /* JADX INFO: renamed from: a */
        public String f5434a;

        /* JADX INFO: renamed from: b */
        public String f5435b;

        public C0371c(@Nullable String str, @Nullable String str2) {
            this.f5434a = "";
            this.f5435b = "";
            if (!TextUtils.isEmpty(str)) {
                this.f5434a = str;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f5435b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m6827a() {
            this.f5434a = "";
            this.f5435b = "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m6828b() {
            return !TextUtils.isEmpty(this.f5435b) && this.f5435b.endsWith(".svga");
        }

        /* JADX INFO: renamed from: c */
        public String m6829c() {
            return (TextUtils.isEmpty(this.f5435b) || this.f5435b.endsWith(".svga")) ? this.f5434a : this.f5435b;
        }
    }

    public CommonMedalView(@NonNull Context context) {
        super(context);
        this.f5429g = t100.d(14.0f);
        this.f5430h = 3;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        LayoutInflater.from(getContext()).inflate(t6c0.f19885j0, (ViewGroup) this, true);
        this.f5426d = findViewById(g5c0.f11079f6);
        this.f5427e = findViewById(g5c0.f11134l1);
        xdl0.M(this.f5426d, false);
        xdl0.M(this.f5427e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m6822j0() {
        if (this.f5428f.m6828b()) {
            xdl0.M(this.f5427e, true);
            xdl0.M(this.f5426d, false);
            m6824l0(this.f5427e, this.f5428f.f5435b);
        } else {
            if (TextUtils.isEmpty(this.f5428f.m6829c())) {
                return;
            }
            xdl0.M(this.f5426d, true);
            xdl0.M(this.f5427e, false);
            VDraweeView vDraweeView = this.f5426d;
            String strM6829c = this.f5428f.m6829c();
            int i = this.f5429g;
            hxs.v("context_livingAct", vDraweeView, strM6829c, i * this.f5430h, i, false, false, false, new C0369a());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m6823k0() {
        C0371c c0371c = this.f5428f;
        if (c0371c != null) {
            c0371c.m6827a();
        }
        this.f5426d.setController((hce) null);
        this.f5427e.stopAnimation(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m6824l0(SVGAnimationView sVGAnimationView, String str) {
        sVGAnimationView.setRequestCallback(new C0370b(sVGAnimationView));
        SVGALoader.with(getContext()).from(str).repeatCount(-1).autoPlay(true).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: m0 */
    public void m6825m0(int i, @Nullable String str, @Nullable String str2) {
        if (i > 0) {
            this.f5429g = i;
        }
        C0371c c0371c = this.f5428f;
        if (c0371c != null && TextUtils.equals(c0371c.f5434a, str) && TextUtils.equals(this.f5428f.f5435b, str2)) {
            return;
        }
        if (this.f5428f == null) {
            this.f5428f = new C0371c(str, str2);
        }
        C0371c c0371c2 = this.f5428f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        c0371c2.f5434a = str;
        C0371c c0371c3 = this.f5428f;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c0371c3.f5435b = str2;
        m6822j0();
    }

    public void setImageResource(int i) {
        this.f5426d.setImageResource(i);
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5429g = t100.d(14.0f);
        this.f5430h = 3;
        init();
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5429g = t100.d(14.0f);
        this.f5430h = 3;
        init();
    }
}
