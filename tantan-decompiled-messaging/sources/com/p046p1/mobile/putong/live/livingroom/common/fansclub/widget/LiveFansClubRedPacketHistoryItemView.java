package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.ffw;
import p149l.mcr;
import p149l.nbs;
import p149l.roj0;
import p149l.skc0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketHistoryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49131d;

    /* JADX INFO: renamed from: e */
    public VText f49132e;

    /* JADX INFO: renamed from: f */
    public View f49133f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49134g;

    /* JADX INFO: renamed from: h */
    public C22393b<roj0> f49135h;

    public LiveFansClubRedPacketHistoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49135h = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m72972h0(View view) {
        nbs.m158830a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m72973i0(skc0.C19970a c19970a, mcr mcrVar) {
        this.f49131d.setImageURI(c19970a.f164953a);
        this.f49134g.setImageURI(c19970a.f164954b);
        this.f49132e.setText(c19970a.f164955c);
        C22306c c22306cDuringCreated = mcrVar.duringCreated(c19970a.m184585e().takeUntil(this.f49135h));
        final View view = this.f49133f;
        Objects.requireNonNull(view);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.mbs
            @Override // p149l.e30
            public final void call(Object obj) {
                view.setBackground((imf0) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49135h.onNext(roj0.f160388a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72972h0(this);
    }
}
