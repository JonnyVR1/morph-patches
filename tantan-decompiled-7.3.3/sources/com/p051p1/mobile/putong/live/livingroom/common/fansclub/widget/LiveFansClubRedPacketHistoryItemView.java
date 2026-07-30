package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VText;
import p153l.dhw;
import p153l.ner;
import p153l.ods;
import p153l.uxj0;
import p153l.y20;
import p153l.zsc0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketHistoryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49979d;

    /* JADX INFO: renamed from: e */
    public VText f49980e;

    /* JADX INFO: renamed from: f */
    public View f49981f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49982g;

    /* JADX INFO: renamed from: h */
    public C22508b<uxj0> f49983h;

    public LiveFansClubRedPacketHistoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49983h = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74155h0(View view) {
        ods.m167329a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74156i0(zsc0.C21884a c21884a, ner nerVar) {
        this.f49979d.setImageURI(c21884a.f205864a);
        this.f49982g.setImageURI(c21884a.f205865b);
        this.f49980e.setText(c21884a.f205866c);
        C22421c c22421cDuringCreated = nerVar.duringCreated(c21884a.m221333e().takeUntil(this.f49983h));
        final View view = this.f49981f;
        Objects.requireNonNull(view);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.nds
            @Override // p153l.y20
            public final void call(Object obj) {
                view.setBackground((ruf0) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49983h.onNext(uxj0.f181467a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74155h0(this);
    }
}
