package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.hpo0;
import l.hxs;
import l.i3c0;
import l.ipn;
import l.t100;
import l.xdl0;
import l.ym2;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetCpSimpleHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f7145a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7146b;

    /* JADX INFO: renamed from: c */
    public VImage f7147c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f7148d;

    /* JADX INFO: renamed from: e */
    public VImage f7149e;

    public VoiceSweetCpSimpleHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8703a(View view) {
        hpo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8704b(String str, String str2, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f7147c;
        if (zIsEmpty) {
            xdl0.M(vImage, true);
        } else {
            xdl0.M(vImage, false);
            hxs.v("context_single_room", this.f7146b, str, xdl0.w(36.0f), xdl0.w(36.0f), true, false, ipn.a(), (ym2) null);
        }
        if (z || TextUtils.isEmpty(str2)) {
            xdl0.M(this.f7149e, true);
            xdl0.X(this.f7145a, t100.m);
            xdl0.N(this.f7145a, i3c0.la);
        } else {
            xdl0.X(this.f7145a, t100.f);
            xdl0.N(this.f7145a, i3c0.qa);
            xdl0.M(this.f7149e, false);
            hxs.v("context_single_room", this.f7148d, str2, xdl0.w(36.0f), xdl0.w(36.0f), true, false, ipn.a(), (ym2) null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8703a(this);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
