package com.p051p1.mobile.putong.live.livingroom.common.usercard;

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
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.cp0;
import p153l.fn2;
import p153l.izs;
import p153l.mdc0;
import p153l.qa00;
import p153l.qim;
import p153l.so0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonMedalView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50232d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f50233e;

    /* JADX INFO: renamed from: f */
    public C12945c f50234f;

    /* JADX INFO: renamed from: g */
    public int f50235g;

    /* JADX INFO: renamed from: h */
    public int f50236h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$a */
    public class C12943a extends fn2 {
        public C12943a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            float width = qimVar.getWidth() / qimVar.getHeight();
            bnl0.m105507D0((int) (CommonMedalView.this.f50235g * width), CommonMedalView.this.f50232d);
            bnl0.m105507D0((int) (CommonMedalView.this.f50235g * width), CommonMedalView.this);
            bnl0.m105505C0(CommonMedalView.this.f50232d, CommonMedalView.this.f50235g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$b */
    public class C12944b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f50238a;

        public C12944b(SVGAnimationView sVGAnimationView) {
            this.f50238a = sVGAnimationView;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (resource.get() instanceof SVGAVideoEntity) {
                cp0 cp0VarM187042b = so0.m187041a((SVGAVideoEntity) resource.get()).m187042b();
                bnl0.m105507D0((int) (((double) CommonMedalView.this.f50235g) * (cp0VarM187042b.m111728c() / cp0VarM187042b.m111727b())), this.f50238a);
                bnl0.m105505C0(this.f50238a, CommonMedalView.this.f50235g);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView$c */
    public static class C12945c {

        /* JADX INFO: renamed from: a */
        public String f50240a;

        /* JADX INFO: renamed from: b */
        public String f50241b;

        public C12945c(@Nullable String str, @Nullable String str2) {
            this.f50240a = "";
            this.f50241b = "";
            if (!TextUtils.isEmpty(str)) {
                this.f50240a = str;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f50241b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m74474a() {
            this.f50240a = "";
            this.f50241b = "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m74475b() {
            return !TextUtils.isEmpty(this.f50241b) && this.f50241b.endsWith(".svga");
        }

        /* JADX INFO: renamed from: c */
        public String m74476c() {
            return (TextUtils.isEmpty(this.f50241b) || this.f50241b.endsWith(".svga")) ? this.f50240a : this.f50241b;
        }
    }

    public CommonMedalView(@NonNull Context context) {
        super(context);
        this.f50235g = qa00.m175859d(14.0f);
        this.f50236h = 3;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(yec0.f199121j0, (ViewGroup) this, true);
        this.f50232d = (VDraweeView) findViewById(mdc0.f136174f6);
        this.f50233e = (SVGAnimationView) findViewById(mdc0.f136229l1);
        bnl0.m105524M(this.f50232d, false);
        bnl0.m105524M(this.f50233e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m74470j0() {
        if (this.f50234f.m74475b()) {
            bnl0.m105524M(this.f50233e, true);
            bnl0.m105524M(this.f50232d, false);
            m74472l0(this.f50233e, this.f50234f.f50241b);
        } else {
            if (TextUtils.isEmpty(this.f50234f.m74476c())) {
                return;
            }
            bnl0.m105524M(this.f50232d, true);
            bnl0.m105524M(this.f50233e, false);
            VDraweeView vDraweeView = this.f50232d;
            String strM74476c = this.f50234f.m74476c();
            int i = this.f50235g;
            izs.m142871v("context_livingAct", vDraweeView, strM74476c, i * this.f50236h, i, false, false, false, new C12943a());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m74471k0() {
        C12945c c12945c = this.f50234f;
        if (c12945c != null) {
            c12945c.m74474a();
        }
        this.f50232d.setController(null);
        this.f50233e.stopAnimation(true);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74472l0(SVGAnimationView sVGAnimationView, String str) {
        sVGAnimationView.setRequestCallback(new C12944b(sVGAnimationView));
        SVGALoader.with(getContext()).from(str).repeatCount(-1).autoPlay(true).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74473m0(int i, @Nullable String str, @Nullable String str2) {
        if (i > 0) {
            this.f50235g = i;
        }
        C12945c c12945c = this.f50234f;
        if (c12945c != null && TextUtils.equals(c12945c.f50240a, str) && TextUtils.equals(this.f50234f.f50241b, str2)) {
            return;
        }
        if (this.f50234f == null) {
            this.f50234f = new C12945c(str, str2);
        }
        C12945c c12945c2 = this.f50234f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        c12945c2.f50240a = str;
        C12945c c12945c3 = this.f50234f;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c12945c3.f50241b = str2;
        m74470j0();
    }

    public void setImageResource(int i) {
        this.f50232d.setImageResource(i);
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50235g = qa00.m175859d(14.0f);
        this.f50236h = 3;
        init();
    }

    public CommonMedalView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50235g = qa00.m175859d(14.0f);
        this.f50236h = 3;
        init();
    }
}
