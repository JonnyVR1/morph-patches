package com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.gm0;
import p149l.h1c0;
import p149l.hcc0;
import p149l.hxs;
import p149l.kvc0;
import p149l.w1t;
import p149l.x8u;
import p149l.xdl0;
import p149l.zd10;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallPkBoardItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f51425d;

    /* JADX INFO: renamed from: e */
    public VText f51426e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51427f;

    /* JADX INFO: renamed from: g */
    public VImage f51428g;

    /* JADX INFO: renamed from: h */
    public VText f51429h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f51430i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f51431j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f51432k;

    /* JADX INFO: renamed from: l */
    public VText f51433l;

    /* JADX INFO: renamed from: m */
    public w1t f51434m;

    public MultiCallPkBoardItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75873i0(View view) {
        zd10.m218122a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75874j0(int i) {
        VImage vImage = this.f51428g;
        if (i == 1) {
            vImage.setVisibility(0);
        } else {
            vImage.setVisibility(8);
        }
        hcc0.m130418c(getContext(), this.f51425d, this.f51426e, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public final void m75875k0(double d) {
        this.f51433l.setTextColor(kvc0.m147352a(h1c0.f105383l1));
        VText vText = this.f51433l;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            vText.setText("未助力");
        } else {
            vText.setText(x8u.m207433c(d));
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l0 */
    public void m75876l0(final e30<String> e30Var, final BLiveMultiPkBoardUser bLiveMultiPkBoardUser, gm0 gm0Var) {
        xdl0.m208344M(this.f51425d, true);
        xdl0.m208344M(this.f51426e, true);
        m75874j0(bLiveMultiPkBoardUser.rank);
        hxs.m133406s("context_single_room", this.f51427f, bLiveMultiPkBoardUser.userImage);
        this.f51429h.setText(bLiveMultiPkBoardUser.userName);
        m75877m0(bLiveMultiPkBoardUser, gm0Var);
        m75875k0(bLiveMultiPkBoardUser.amount);
        setOnClickListener(new View.OnClickListener() { // from class: l.yd10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveMultiPkBoardUser.userId);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75877m0(@NonNull BLiveMultiPkBoardUser bLiveMultiPkBoardUser, @Nullable gm0 gm0Var) {
        BLiveFanBaseInfo bLiveFanBaseInfo;
        xdl0.m208344M(this.f51431j, true);
        xdl0.m208344M(this.f51432k, true);
        if (this.f51434m == null) {
            w1t w1tVar = new w1t(false);
            this.f51434m = w1tVar;
            w1tVar.m200963C((Act) xdl0.m208328E(this));
        }
        this.f51434m.m200965E(gm0Var);
        if (bLiveMultiPkBoardUser.hierarchyGrade <= 0 && ((bLiveFanBaseInfo = bLiveMultiPkBoardUser.fanbaseInfo) == null || bLiveFanBaseInfo.fanbaseGrade <= 0)) {
            this.f51430i.setVisibility(8);
            return;
        }
        this.f51430i.setVisibility(0);
        this.f51434m.m200961A(this.f51431j, bLiveMultiPkBoardUser.hierarchyGrade);
        BLiveFanBaseInfo bLiveFanBaseInfo2 = bLiveMultiPkBoardUser.fanbaseInfo;
        if (bLiveFanBaseInfo2 != null) {
            this.f51434m.m200977w(this.f51432k, bLiveFanBaseInfo2.fanbaseGrade);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75873i0(this);
    }

    public MultiCallPkBoardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiCallPkBoardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
