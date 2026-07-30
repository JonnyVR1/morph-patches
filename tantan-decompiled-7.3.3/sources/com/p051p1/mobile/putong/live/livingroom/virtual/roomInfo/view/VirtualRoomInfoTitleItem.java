package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.bnl0;
import p153l.s3m0;
import p153l.wgp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoTitleItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VirtualRoomInfoTitleItem f53593a;

    /* JADX INFO: renamed from: b */
    public VText f53594b;

    /* JADX INFO: renamed from: c */
    public VText f53595c;

    /* JADX INFO: renamed from: d */
    public BLiveExtraData f53596d;

    public VirtualRoomInfoTitleItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m78680c(View view) {
        s3m0.m184282a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m78681d(wgp0 wgp0Var, View view) {
        BLiveExtraData bLiveExtraData = this.f53596d;
        if (bLiveExtraData != null) {
            wgp0Var.mo149953d1(bLiveExtraData);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78682e(wgp0 wgp0Var, View view) {
        BLiveExtraData bLiveExtraData = this.f53596d;
        if (bLiveExtraData != null) {
            wgp0Var.mo149953d1(bLiveExtraData);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78683f(BLiveExtraData bLiveExtraData, final wgp0 wgp0Var) {
        this.f53596d = bLiveExtraData;
        if (bLiveExtraData == null) {
            return;
        }
        m78684g(bLiveExtraData.voiceRoomProfile.title);
        bnl0.m105509E0(this.f53594b, new View.OnClickListener() { // from class: l.q3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155460a.m78681d(wgp0Var, view);
            }
        });
        bnl0.m105509E0(this.f53595c, new View.OnClickListener() { // from class: l.r3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161048a.m78682e(wgp0Var, view);
            }
        });
        if (!wgp0Var.mo149957i0(zrv.f205799a.m207631D0()) && !wgp0Var.mo149952d0(zrv.f205799a.m207631D0())) {
            bnl0.m105524M(this.f53595c, false);
            return;
        }
        bnl0.m105524M(this.f53595c, true);
        boolean zEquals = TextUtils.equals(bLiveExtraData.voiceRoomProfile.titleStatus, "pending");
        VText vText = this.f53595c;
        if (zEquals) {
            vText.setText("审核中");
        } else {
            vText.setText("修改");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m78684g(@NotNull String str) {
        this.f53594b.setText(str);
        BLiveExtraData bLiveExtraData = this.f53596d;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.title = str;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78680c(this);
    }

    public VirtualRoomInfoTitleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoTitleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
