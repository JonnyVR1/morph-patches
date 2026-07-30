package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.irn;
import p153l.izs;
import p153l.lyo0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetCpSimpleHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f54387a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54388b;

    /* JADX INFO: renamed from: c */
    public VImage f54389c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f54390d;

    /* JADX INFO: renamed from: e */
    public VImage f54391e;

    public VoiceSweetCpSimpleHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79677a(View view) {
        lyo0.m156374a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79678b(String str, String str2, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f54389c;
        if (zIsEmpty) {
            bnl0.m105524M(vImage, true);
        } else {
            bnl0.m105524M(vImage, false);
            izs.m142871v("context_single_room", this.f54388b, str, bnl0.m105587w(36.0f), bnl0.m105587w(36.0f), true, false, irn.m141839a(), null);
        }
        if (z || TextUtils.isEmpty(str2)) {
            bnl0.m105524M(this.f54391e, true);
            bnl0.m105540X(this.f54387a, qa00.f156326m);
            bnl0.m105526N(this.f54387a, obc0.f146408la);
        } else {
            bnl0.m105540X(this.f54387a, qa00.f156319f);
            bnl0.m105526N(this.f54387a, obc0.f146468qa);
            bnl0.m105524M(this.f54391e, false);
            izs.m142871v("context_single_room", this.f54390d, str2, bnl0.m105587w(36.0f), bnl0.m105587w(36.0f), true, false, irn.m141839a(), null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79677a(this);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpSimpleHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
