package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.hpo0;
import p149l.hxs;
import p149l.i3c0;
import p149l.ipn;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetCpSimpleHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f53539a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53540b;

    /* JADX INFO: renamed from: c */
    public VImage f53541c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53542d;

    /* JADX INFO: renamed from: e */
    public VImage f53543e;

    public VoiceSweetCpSimpleHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78494a(View view) {
        hpo0.m132370a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78495b(String str, String str2, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f53541c;
        if (zIsEmpty) {
            xdl0.m208344M(vImage, true);
        } else {
            xdl0.m208344M(vImage, false);
            hxs.m133409v("context_single_room", this.f53540b, str, xdl0.m208407w(36.0f), xdl0.m208407w(36.0f), true, false, ipn.m137564a(), null);
        }
        if (z || TextUtils.isEmpty(str2)) {
            xdl0.m208344M(this.f53543e, true);
            xdl0.m208360X(this.f53539a, t100.f167264m);
            xdl0.m208346N(this.f53539a, i3c0.f111080la);
        } else {
            xdl0.m208360X(this.f53539a, t100.f167257f);
            xdl0.m208346N(this.f53539a, i3c0.f111140qa);
            xdl0.m208344M(this.f53543e, false);
            hxs.m133409v("context_single_room", this.f53542d, str2, xdl0.m208407w(36.0f), xdl0.m208407w(36.0f), true, false, ipn.m137564a(), null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78494a(this);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
