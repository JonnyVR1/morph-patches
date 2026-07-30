package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.t36;

/* JADX INFO: loaded from: classes5.dex */
public class ContributorItemView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f52481f;

    /* JADX INFO: renamed from: g */
    public static final SparseIntArray f52482g;

    /* JADX INFO: renamed from: h */
    public static final SparseIntArray f52483h;

    /* JADX INFO: renamed from: a */
    public VImage f52484a;

    /* JADX INFO: renamed from: b */
    public VImage f52485b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52486c;

    /* JADX INFO: renamed from: d */
    public View f52487d;

    /* JADX INFO: renamed from: e */
    public VImage f52488e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f52481f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f52482g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f52483h = sparseIntArray3;
        sparseIntArray.put(0, obc0.f146171R4);
        sparseIntArray.put(1, obc0.f146118M8);
        sparseIntArray.put(2, obc0.f146081J7);
        sparseIntArray2.put(0, obc0.f146182S4);
        sparseIntArray2.put(1, obc0.f146130N8);
        sparseIntArray2.put(2, obc0.f146081J7);
        sparseIntArray3.put(0, obc0.f146149P4);
        sparseIntArray3.put(1, obc0.f146160Q4);
        sparseIntArray3.put(2, obc0.f146081J7);
    }

    public ContributorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77319a(View view) {
        t36.m189076a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77320b(PkContributor pkContributor) {
        int i;
        int i2;
        boolean z = false;
        bnl0.m105524M(this.f52488e, pkContributor.isPunishStage() && !pkContributor.isTied() && pkContributor.isSuccess() && pkContributor.getRank() == 0);
        if (pkContributor.isPunishStage() && !pkContributor.isSuccess()) {
            z = true;
        }
        if (z) {
            z = !pkContributor.isTied();
        }
        if (z) {
            i = obc0.f145973A7;
        } else {
            i = pkContributor.isHost() ? obc0.f145985B7 : obc0.f145997C7;
        }
        this.f52485b.setImageResource(i);
        if (z) {
            i2 = f52483h.get(pkContributor.getRank());
        } else {
            i2 = (pkContributor.isHost() ? f52481f : f52482g).get(pkContributor.getRank());
        }
        this.f52484a.setImageResource(i2);
        boolean zIsEmpty = TextUtils.isEmpty(pkContributor.getAvatarUrl());
        VDraweeView vDraweeView = this.f52486c;
        if (zIsEmpty) {
            vDraweeView.setImageResource(obc0.f146193T4);
        } else {
            izs.m142869t("context_single_room", vDraweeView, pkContributor.getAvatarUrl(), qa00.f156332s);
        }
        bnl0.m105524M(this.f52487d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77319a(this);
    }

    public ContributorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContributorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
