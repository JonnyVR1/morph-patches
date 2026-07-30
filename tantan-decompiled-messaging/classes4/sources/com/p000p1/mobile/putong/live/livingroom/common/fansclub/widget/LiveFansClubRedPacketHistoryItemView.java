package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import l.e30;
import l.ffw;
import l.imf0;
import l.mcr;
import l.roj0;
import p002l.nbs;
import p002l.skc0;
import rx.c;
import rx.subjects.b;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubRedPacketHistoryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f5173d;

    /* JADX INFO: renamed from: e */
    public VText f5174e;

    /* JADX INFO: renamed from: f */
    public View f5175f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5176g;

    /* JADX INFO: renamed from: h */
    public b<roj0> f5177h;

    public LiveFansClubRedPacketHistoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5177h = b.b();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6493h0(View view) {
        nbs.m18641a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m6494i0(skc0.C0818a c0818a, mcr mcrVar) {
        this.f5173d.setImageURI(c0818a.f19064a);
        this.f5176g.setImageURI(c0818a.f19065b);
        this.f5174e.setText(c0818a.f19066c);
        c cVarDuringCreated = mcrVar.duringCreated(c0818a.m22510e().takeUntil(this.f5177h));
        final View view = this.f5175f;
        Objects.requireNonNull(view);
        cVarDuringCreated.subscribe(ffw.h(new e30() { // from class: l.mbs
            public final void call(Object obj) {
                view.setBackground((imf0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f5177h.onNext(roj0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6493h0(this);
    }
}
