package com.p046p1.mobile.putong.live.livingroom.common.usercard;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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
import p147v.VDraweeView;
import p149l.g5c0;
import p149l.gp0;
import p149l.hxs;
import p149l.ngm;
import p149l.t100;
import p149l.t6c0;
import p149l.wo0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes4.dex */
public class CommonMedalView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49384d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f49385e;

    /* JADX INFO: renamed from: f */
    public C12782c f49386f;

    /* JADX INFO: renamed from: g */
    public int f49387g;

    /* JADX INFO: renamed from: h */
    public int f49388h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$a */
    public class C12780a extends ym2 {
        public C12780a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            float width = ngmVar.getWidth() / ngmVar.getHeight();
            xdl0.m208327D0((int) (CommonMedalView.this.f49387g * width), CommonMedalView.this.f49384d);
            xdl0.m208327D0((int) (CommonMedalView.this.f49387g * width), CommonMedalView.this);
            xdl0.m208325C0(CommonMedalView.this.f49384d, CommonMedalView.this.f49387g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$b */
    public class C12781b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f49390a;

        public C12781b(SVGAnimationView sVGAnimationView) {
            this.f49390a = sVGAnimationView;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (resource.get() instanceof SVGAVideoEntity) {
                gp0 gp0VarM204795b = wo0.m204794a((SVGAVideoEntity) resource.get()).m204795b();
                xdl0.m208327D0((int) (((double) CommonMedalView.this.f49387g) * (gp0VarM204795b.m127324c() / gp0VarM204795b.m127323b())), this.f49390a);
                xdl0.m208325C0(this.f49390a, CommonMedalView.this.f49387g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$c */
    public static class C12782c {

        /* JADX INFO: renamed from: a */
        public String f49392a;

        /* JADX INFO: renamed from: b */
        public String f49393b;

        public C12782c(@Nullable String str, @Nullable String str2) {
            this.f49392a = "";
            this.f49393b = "";
            if (!TextUtils.isEmpty(str)) {
                this.f49392a = str;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f49393b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m73291a() {
            this.f49392a = "";
            this.f49393b = "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m73292b() {
            return !TextUtils.isEmpty(this.f49393b) && this.f49393b.endsWith(".svga");
        }

        /* JADX INFO: renamed from: c */
        public String m73293c() {
            return (TextUtils.isEmpty(this.f49393b) || this.f49393b.endsWith(".svga")) ? this.f49392a : this.f49393b;
        }
    }

    public CommonMedalView(@NonNull Context context) {
        super(context);
        this.f49387g = t100.m186890d(14.0f);
        this.f49388h = 3;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(t6c0.f168389j0, (ViewGroup) this, true);
        this.f49384d = (VDraweeView) findViewById(g5c0.f100929f6);
        this.f49385e = (SVGAnimationView) findViewById(g5c0.f100984l1);
        xdl0.m208344M(this.f49384d, false);
        xdl0.m208344M(this.f49385e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m73287j0() {
        if (this.f49386f.m73292b()) {
            xdl0.m208344M(this.f49385e, true);
            xdl0.m208344M(this.f49384d, false);
            m73289l0(this.f49385e, this.f49386f.f49393b);
        } else {
            if (TextUtils.isEmpty(this.f49386f.m73293c())) {
                return;
            }
            xdl0.m208344M(this.f49384d, true);
            xdl0.m208344M(this.f49385e, false);
            VDraweeView vDraweeView = this.f49384d;
            String strM73293c = this.f49386f.m73293c();
            int i = this.f49387g;
            hxs.m133409v("context_livingAct", vDraweeView, strM73293c, i * this.f49388h, i, false, false, false, new C12780a());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m73288k0() {
        C12782c c12782c = this.f49386f;
        if (c12782c != null) {
            c12782c.m73291a();
        }
        this.f49384d.setController(null);
        this.f49385e.stopAnimation(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m73289l0(SVGAnimationView sVGAnimationView, String str) {
        sVGAnimationView.setRequestCallback(new C12781b(sVGAnimationView));
        SVGALoader.with(getContext()).from(str).repeatCount(-1).autoPlay(true).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: m0 */
    public void m73290m0(int i, @Nullable String str, @Nullable String str2) {
        if (i > 0) {
            this.f49387g = i;
        }
        C12782c c12782c = this.f49386f;
        if (c12782c != null && TextUtils.equals(c12782c.f49392a, str) && TextUtils.equals(this.f49386f.f49393b, str2)) {
            return;
        }
        if (this.f49386f == null) {
            this.f49386f = new C12782c(str, str2);
        }
        C12782c c12782c2 = this.f49386f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        c12782c2.f49392a = str;
        C12782c c12782c3 = this.f49386f;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c12782c3.f49393b = str2;
        m73287j0();
    }

    public void setImageResource(int i) {
        this.f49384d.setImageResource(i);
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49387g = t100.m186890d(14.0f);
        this.f49388h = 3;
        init();
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49387g = t100.m186890d(14.0f);
        this.f49388h = 3;
        init();
    }
}
