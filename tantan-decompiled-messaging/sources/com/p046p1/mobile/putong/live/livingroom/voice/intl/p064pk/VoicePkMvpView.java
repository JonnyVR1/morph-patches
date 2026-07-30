package com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.hxs;
import p149l.n7o0;
import p149l.s7m;
import p149l.w7o0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoicePkMvpView extends VFrame implements s7m<w7o0> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53317a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53318b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53319c;

    /* JADX INFO: renamed from: d */
    public w7o0 f53320d;

    public VoicePkMvpView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m78333v(View view) {
        w7o0 w7o0Var = this.f53320d;
        if (w7o0Var != null) {
            w7o0Var.m202043W3();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78334s(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.m7o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131836a.m78333v(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m78334s(View view) {
        n7o0.m158153a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w7o0 w7o0Var) {
        this.f53320d = w7o0Var;
    }

    /* JADX INFO: renamed from: w */
    public void m78336w(BLiveVoicePkInfo bLiveVoicePkInfo) {
        if (!bLiveVoicePkInfo.enable) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        hxs.m133406s("context_single_room", this.f53317a, bLiveVoicePkInfo.mvpBg);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoicePkInfo.leftUserAvatar);
        VDraweeView vDraweeView = this.f53318b;
        if (zIsEmpty) {
            vDraweeView.setController(null);
        } else {
            hxs.m133406s("context_single_room", vDraweeView, bLiveVoicePkInfo.leftUserAvatar);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveVoicePkInfo.rightUserAvatar);
        VDraweeView vDraweeView2 = this.f53319c;
        if (zIsEmpty2) {
            vDraweeView2.setController(null);
        } else {
            hxs.m133406s("context_single_room", vDraweeView2, bLiveVoicePkInfo.rightUserAvatar);
        }
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
