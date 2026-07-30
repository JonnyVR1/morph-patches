package com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.aho0;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.rgo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoicePkMvpView extends VFrame implements iam<aho0> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54165a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54166b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f54167c;

    /* JADX INFO: renamed from: d */
    public aho0 f54168d;

    public VoicePkMvpView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m79516v(View view) {
        aho0 aho0Var = this.f54168d;
        if (aho0Var != null) {
            aho0Var.m97879W3();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79517s(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.qgo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157446a.m79516v(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m79517s(View view) {
        rgo0.m181462a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(aho0 aho0Var) {
        this.f54168d = aho0Var;
    }

    /* JADX INFO: renamed from: w */
    public void m79519w(BLiveVoicePkInfo bLiveVoicePkInfo) {
        if (!bLiveVoicePkInfo.enable) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        izs.m142868s("context_single_room", this.f54165a, bLiveVoicePkInfo.mvpBg);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoicePkInfo.leftUserAvatar);
        VDraweeView vDraweeView = this.f54166b;
        if (zIsEmpty) {
            vDraweeView.setController(null);
        } else {
            izs.m142868s("context_single_room", vDraweeView, bLiveVoicePkInfo.leftUserAvatar);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveVoicePkInfo.rightUserAvatar);
        VDraweeView vDraweeView2 = this.f54167c;
        if (zIsEmpty2) {
            vDraweeView2.setController(null);
        } else {
            izs.m142868s("context_single_room", vDraweeView2, bLiveVoicePkInfo.rightUserAvatar);
        }
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
