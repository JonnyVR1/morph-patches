package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.oul0;
import p149l.s7p0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoTitleItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VirtualRoomInfoTitleItem f52745a;

    /* JADX INFO: renamed from: b */
    public VText f52746b;

    /* JADX INFO: renamed from: c */
    public VText f52747c;

    /* JADX INFO: renamed from: d */
    public BLiveExtraData f52748d;

    public VirtualRoomInfoTitleItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m77497c(View view) {
        oul0.m166085a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m77498d(s7p0 s7p0Var, View view) {
        BLiveExtraData bLiveExtraData = this.f52748d;
        if (bLiveExtraData != null) {
            s7p0Var.mo124817d1(bLiveExtraData);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m77499e(s7p0 s7p0Var, View view) {
        BLiveExtraData bLiveExtraData = this.f52748d;
        if (bLiveExtraData != null) {
            s7p0Var.mo124817d1(bLiveExtraData);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77500f(BLiveExtraData bLiveExtraData, final s7p0 s7p0Var) {
        this.f52748d = bLiveExtraData;
        if (bLiveExtraData == null) {
            return;
        }
        m77501g(bLiveExtraData.voiceRoomProfile.title);
        xdl0.m208329E0(this.f52746b, new View.OnClickListener() { // from class: l.mul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135800a.m77498d(s7p0Var, view);
            }
        });
        xdl0.m208329E0(this.f52747c, new View.OnClickListener() { // from class: l.nul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140639a.m77499e(s7p0Var, view);
            }
        });
        if (!s7p0Var.mo124821i0(ypv.f199493a.m199309D0()) && !s7p0Var.mo124816d0(ypv.f199493a.m199309D0())) {
            xdl0.m208344M(this.f52747c, false);
            return;
        }
        xdl0.m208344M(this.f52747c, true);
        boolean zEquals = TextUtils.equals(bLiveExtraData.voiceRoomProfile.titleStatus, "pending");
        VText vText = this.f52747c;
        if (zEquals) {
            vText.setText("审核中");
        } else {
            vText.setText("修改");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m77501g(@NotNull String str) {
        this.f52746b.setText(str);
        BLiveExtraData bLiveExtraData = this.f52748d;
        if (bLiveExtraData != null) {
            bLiveExtraData.voiceRoomProfile.title = str;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77497c(this);
    }

    public VirtualRoomInfoTitleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoTitleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
