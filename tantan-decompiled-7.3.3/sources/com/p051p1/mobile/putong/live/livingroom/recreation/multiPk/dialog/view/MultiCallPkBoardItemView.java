package com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cm0;
import p153l.izs;
import p153l.jm10;
import p153l.n3d0;
import p153l.n9c0;
import p153l.okc0;
import p153l.x3t;
import p153l.y20;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallPkBoardItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f52273d;

    /* JADX INFO: renamed from: e */
    public VText f52274e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52275f;

    /* JADX INFO: renamed from: g */
    public VImage f52276g;

    /* JADX INFO: renamed from: h */
    public VText f52277h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f52278i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f52279j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f52280k;

    /* JADX INFO: renamed from: l */
    public VText f52281l;

    /* JADX INFO: renamed from: m */
    public x3t f52282m;

    public MultiCallPkBoardItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77056i0(View view) {
        jm10.m146142a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77057j0(int i) {
        VImage vImage = this.f52276g;
        if (i == 1) {
            vImage.setVisibility(0);
        } else {
            vImage.setVisibility(8);
        }
        okc0.m168003c(getContext(), this.f52273d, this.f52274e, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public final void m77058k0(double d) {
        this.f52281l.setTextColor(n3d0.m161277a(n9c0.f140844l1));
        VText vText = this.f52281l;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            vText.setText("未助力");
        } else {
            vText.setText(yau.m214935c(d));
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l0 */
    public void m77059l0(final y20<String> y20Var, final BLiveMultiPkBoardUser bLiveMultiPkBoardUser, cm0 cm0Var) {
        bnl0.m105524M(this.f52273d, true);
        bnl0.m105524M(this.f52274e, true);
        m77057j0(bLiveMultiPkBoardUser.rank);
        izs.m142868s("context_single_room", this.f52275f, bLiveMultiPkBoardUser.userImage);
        this.f52277h.setText(bLiveMultiPkBoardUser.userName);
        m77060m0(bLiveMultiPkBoardUser, cm0Var);
        m77058k0(bLiveMultiPkBoardUser.amount);
        setOnClickListener(new View.OnClickListener() { // from class: l.im10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveMultiPkBoardUser.userId);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77060m0(@NonNull BLiveMultiPkBoardUser bLiveMultiPkBoardUser, @Nullable cm0 cm0Var) {
        BLiveFanBaseInfo bLiveFanBaseInfo;
        bnl0.m105524M(this.f52279j, true);
        bnl0.m105524M(this.f52280k, true);
        if (this.f52282m == null) {
            x3t x3tVar = new x3t(false);
            this.f52282m = x3tVar;
            x3tVar.m209275C((Act) bnl0.m105508E(this));
        }
        this.f52282m.m209277E(cm0Var);
        if (bLiveMultiPkBoardUser.hierarchyGrade <= 0 && ((bLiveFanBaseInfo = bLiveMultiPkBoardUser.fanbaseInfo) == null || bLiveFanBaseInfo.fanbaseGrade <= 0)) {
            this.f52278i.setVisibility(8);
            return;
        }
        this.f52278i.setVisibility(0);
        this.f52282m.m209273A(this.f52279j, bLiveMultiPkBoardUser.hierarchyGrade);
        BLiveFanBaseInfo bLiveFanBaseInfo2 = bLiveMultiPkBoardUser.fanbaseInfo;
        if (bLiveFanBaseInfo2 != null) {
            this.f52282m.m209289w(this.f52280k, bLiveFanBaseInfo2.fanbaseGrade);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77056i0(this);
    }

    public MultiCallPkBoardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiCallPkBoardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
