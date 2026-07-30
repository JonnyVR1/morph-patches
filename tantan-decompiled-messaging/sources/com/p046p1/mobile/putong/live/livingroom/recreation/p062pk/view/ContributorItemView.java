package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.hxs;
import p149l.i3c0;
import p149l.o26;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class ContributorItemView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f51633f;

    /* JADX INFO: renamed from: g */
    public static final SparseIntArray f51634g;

    /* JADX INFO: renamed from: h */
    public static final SparseIntArray f51635h;

    /* JADX INFO: renamed from: a */
    public VImage f51636a;

    /* JADX INFO: renamed from: b */
    public VImage f51637b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51638c;

    /* JADX INFO: renamed from: d */
    public View f51639d;

    /* JADX INFO: renamed from: e */
    public VImage f51640e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f51633f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f51634g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f51635h = sparseIntArray3;
        sparseIntArray.put(0, i3c0.f110843R4);
        sparseIntArray.put(1, i3c0.f110790M8);
        sparseIntArray.put(2, i3c0.f110753J7);
        sparseIntArray2.put(0, i3c0.f110854S4);
        sparseIntArray2.put(1, i3c0.f110802N8);
        sparseIntArray2.put(2, i3c0.f110753J7);
        sparseIntArray3.put(0, i3c0.f110821P4);
        sparseIntArray3.put(1, i3c0.f110832Q4);
        sparseIntArray3.put(2, i3c0.f110753J7);
    }

    public ContributorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76136a(View view) {
        o26.m162287a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76137b(PkContributor pkContributor) {
        int i;
        int i2;
        boolean z = false;
        xdl0.m208344M(this.f51640e, pkContributor.isPunishStage() && !pkContributor.isTied() && pkContributor.isSuccess() && pkContributor.getRank() == 0);
        if (pkContributor.isPunishStage() && !pkContributor.isSuccess()) {
            z = true;
        }
        if (z) {
            z = !pkContributor.isTied();
        }
        if (z) {
            i = i3c0.f110645A7;
        } else {
            i = pkContributor.isHost() ? i3c0.f110657B7 : i3c0.f110669C7;
        }
        this.f51637b.setImageResource(i);
        if (z) {
            i2 = f51635h.get(pkContributor.getRank());
        } else {
            i2 = (pkContributor.isHost() ? f51633f : f51634g).get(pkContributor.getRank());
        }
        this.f51636a.setImageResource(i2);
        boolean zIsEmpty = TextUtils.isEmpty(pkContributor.getAvatarUrl());
        VDraweeView vDraweeView = this.f51638c;
        if (zIsEmpty) {
            vDraweeView.setImageResource(i3c0.f110865T4);
        } else {
            hxs.m133407t("context_single_room", vDraweeView, pkContributor.getAvatarUrl(), t100.f167270s);
        }
        xdl0.m208344M(this.f51639d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76136a(this);
    }

    public ContributorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContributorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
