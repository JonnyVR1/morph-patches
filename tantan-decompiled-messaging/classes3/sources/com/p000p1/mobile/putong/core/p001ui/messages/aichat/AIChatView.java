package com.p000p1.mobile.putong.core.p001ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.aichat.AIChatView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.e0;
import p003l.d30;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AIChatView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public ImageView f1604A;

    /* JADX INFO: renamed from: B */
    public ImageView f1605B;

    /* JADX INFO: renamed from: C */
    public TextView f1606C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f1607D;

    /* JADX INFO: renamed from: E */
    public TextHide f1608E;

    /* JADX INFO: renamed from: F */
    public SVGAnimationView f1609F;

    /* JADX INFO: renamed from: G */
    public ImageView f1610G;

    /* JADX INFO: renamed from: H */
    public RecyclerView f1611H;

    /* JADX INFO: renamed from: I */
    public d30 f1612I;

    /* JADX INFO: renamed from: a */
    public VLinear f1613a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f1614b;

    /* JADX INFO: renamed from: c */
    public TextHide f1615c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f1616d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f1617e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f1618f;

    /* JADX INFO: renamed from: g */
    public VLinear f1619g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f1620h;

    /* JADX INFO: renamed from: i */
    public TextView f1621i;

    /* JADX INFO: renamed from: j */
    public TextView f1622j;

    /* JADX INFO: renamed from: k */
    public TextView f1623k;

    /* JADX INFO: renamed from: l */
    public VLinear f1624l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f1625m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f1626n;

    /* JADX INFO: renamed from: o */
    public VLinear f1627o;

    /* JADX INFO: renamed from: p */
    public SVGAnimationView f1628p;

    /* JADX INFO: renamed from: q */
    public TextView f1629q;

    /* JADX INFO: renamed from: r */
    public TextView f1630r;

    /* JADX INFO: renamed from: s */
    public TextView f1631s;

    /* JADX INFO: renamed from: t */
    public VLinear f1632t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f1633u;

    /* JADX INFO: renamed from: v */
    public VLinear f1634v;

    /* JADX INFO: renamed from: w */
    public SVGAnimationView f1635w;

    /* JADX INFO: renamed from: x */
    public TextHide f1636x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f1637y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f1638z;

    public AIChatView(Context context) {
        super(context);
        this.f1612I = new d30() { // from class: l.c0
            @Override // p003l.d30
            public final void call() {
                AIChatView.m2127a();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2127a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m2128b(View view) {
        e0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m2129c() {
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public void m2130d(boolean z) {
    }

    /* JADX INFO: renamed from: e */
    public void m2131e() {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2128b(this);
        m2129c();
    }

    public AIChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1612I = new d30() { // from class: l.c0
            @Override // p003l.d30
            public final void call() {
                AIChatView.m2127a();
            }
        };
    }

    public AIChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1612I = new d30() { // from class: l.c0
            @Override // p003l.d30
            public final void call() {
                AIChatView.m2127a();
            }
        };
    }
}
