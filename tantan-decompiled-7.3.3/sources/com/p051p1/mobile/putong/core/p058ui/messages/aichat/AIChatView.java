package com.p051p1.mobile.putong.core.p058ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.C16672e0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public ImageView f32561A;

    /* JADX INFO: renamed from: B */
    public ImageView f32562B;

    /* JADX INFO: renamed from: C */
    public TextView f32563C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f32564D;

    /* JADX INFO: renamed from: E */
    public TextHide f32565E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f32566F;

    /* JADX INFO: renamed from: G */
    public ImageView f32567G;

    /* JADX INFO: renamed from: H */
    public RecyclerView f32568H;

    /* JADX INFO: renamed from: I */
    public x20 f32569I;

    /* JADX INFO: renamed from: a */
    public VLinear f32570a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f32571b;

    /* JADX INFO: renamed from: c */
    public TextHide f32572c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f32573d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f32574e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f32575f;

    /* JADX INFO: renamed from: g */
    public VLinear f32576g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f32577h;

    /* JADX INFO: renamed from: i */
    public TextView f32578i;

    /* JADX INFO: renamed from: j */
    public TextView f32579j;

    /* JADX INFO: renamed from: k */
    public TextView f32580k;

    /* JADX INFO: renamed from: l */
    public VLinear f32581l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f32582m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f32583n;

    /* JADX INFO: renamed from: o */
    public VLinear f32584o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f32585p;

    /* JADX INFO: renamed from: q */
    public TextView f32586q;

    /* JADX INFO: renamed from: r */
    public TextView f32587r;

    /* JADX INFO: renamed from: s */
    public TextView f32588s;

    /* JADX INFO: renamed from: t */
    public VLinear f32589t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f32590u;

    /* JADX INFO: renamed from: v */
    public VLinear f32591v;

    /* JADX INFO: renamed from: w */
    public SVGAnimationView f32592w;

    /* JADX INFO: renamed from: x */
    public TextHide f32593x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f32594y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f32595z;

    public AIChatView(Context context) {
        super(context);
        this.f32569I = new x20() { // from class: l.c0
            @Override // p153l.x20
            public final void call() {
                AIChatView.m50212a();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50212a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m50213b(View view) {
        C16672e0.m118776a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m50214c() {
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public void m50215d(boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public void m50216e() {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50213b(this);
        m50214c();
    }

    public AIChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32569I = new x20() { // from class: l.c0
            @Override // p153l.x20
            public final void call() {
                AIChatView.m50212a();
            }
        };
    }

    public AIChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32569I = new x20() { // from class: l.c0
            @Override // p153l.x20
            public final void call() {
                AIChatView.m50212a();
            }
        };
    }
}
