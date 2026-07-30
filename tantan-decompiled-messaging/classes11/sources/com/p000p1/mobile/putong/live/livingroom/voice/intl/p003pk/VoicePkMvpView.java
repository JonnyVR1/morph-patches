package com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import l.hce;
import l.hxs;
import l.n7o0;
import l.s7m;
import l.xdl0;
import p009l.w7o0;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoicePkMvpView extends VFrame implements s7m<w7o0> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6923a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6924b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6925c;

    /* JADX INFO: renamed from: d */
    public w7o0 f6926d;

    public VoicePkMvpView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m8528v(View view) {
        w7o0 w7o0Var = this.f6926d;
        if (w7o0Var != null) {
            w7o0Var.m23982W3();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8529C0() {
        return null;
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8531s(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.m7o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16750a.m8528v(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m8531s(View view) {
        n7o0.a(this, view);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m8530i1(w7o0 w7o0Var) {
        this.f6926d = w7o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m8533w(BLiveVoicePkInfo bLiveVoicePkInfo) {
        if (!bLiveVoicePkInfo.enable) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        hxs.s("context_single_room", this.f6923a, bLiveVoicePkInfo.mvpBg);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoicePkInfo.leftUserAvatar);
        VDraweeView vDraweeView = this.f6924b;
        if (zIsEmpty) {
            vDraweeView.setController((hce) null);
        } else {
            hxs.s("context_single_room", vDraweeView, bLiveVoicePkInfo.leftUserAvatar);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveVoicePkInfo.rightUserAvatar);
        VDraweeView vDraweeView2 = this.f6925c;
        if (zIsEmpty2) {
            vDraweeView2.setController((hce) null);
        } else {
            hxs.s("context_single_room", vDraweeView2, bLiveVoicePkInfo.rightUserAvatar);
        }
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoicePkMvpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
