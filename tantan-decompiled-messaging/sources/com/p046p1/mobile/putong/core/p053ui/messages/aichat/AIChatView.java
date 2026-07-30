package com.p046p1.mobile.putong.core.p053ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.C16509e0;
import p149l.d30;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public ImageView f31713A;

    /* JADX INFO: renamed from: B */
    public ImageView f31714B;

    /* JADX INFO: renamed from: C */
    public TextView f31715C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f31716D;

    /* JADX INFO: renamed from: E */
    public TextHide f31717E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f31718F;

    /* JADX INFO: renamed from: G */
    public ImageView f31719G;

    /* JADX INFO: renamed from: H */
    public RecyclerView f31720H;

    /* JADX INFO: renamed from: I */
    public d30 f31721I;

    /* JADX INFO: renamed from: a */
    public VLinear f31722a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f31723b;

    /* JADX INFO: renamed from: c */
    public TextHide f31724c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f31725d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f31726e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f31727f;

    /* JADX INFO: renamed from: g */
    public VLinear f31728g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f31729h;

    /* JADX INFO: renamed from: i */
    public TextView f31730i;

    /* JADX INFO: renamed from: j */
    public TextView f31731j;

    /* JADX INFO: renamed from: k */
    public TextView f31732k;

    /* JADX INFO: renamed from: l */
    public VLinear f31733l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f31734m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f31735n;

    /* JADX INFO: renamed from: o */
    public VLinear f31736o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f31737p;

    /* JADX INFO: renamed from: q */
    public TextView f31738q;

    /* JADX INFO: renamed from: r */
    public TextView f31739r;

    /* JADX INFO: renamed from: s */
    public TextView f31740s;

    /* JADX INFO: renamed from: t */
    public VLinear f31741t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f31742u;

    /* JADX INFO: renamed from: v */
    public VLinear f31743v;

    /* JADX INFO: renamed from: w */
    public SVGAnimationView f31744w;

    /* JADX INFO: renamed from: x */
    public TextHide f31745x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f31746y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f31747z;

    public AIChatView(Context context) {
        super(context);
        this.f31721I = new d30() { // from class: l.c0
            @Override // p149l.d30
            public final void call() {
                AIChatView.m49029a();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49029a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m49030b(View view) {
        C16509e0.m114141a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m49031c() {
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public void m49032d(boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public void m49033e() {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49030b(this);
        m49031c();
    }

    public AIChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31721I = new d30() { // from class: l.c0
            @Override // p149l.d30
            public final void call() {
                AIChatView.m49029a();
            }
        };
    }

    public AIChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31721I = new d30() { // from class: l.c0
            @Override // p149l.d30
            public final void call() {
                AIChatView.m49029a();
            }
        };
    }
}
