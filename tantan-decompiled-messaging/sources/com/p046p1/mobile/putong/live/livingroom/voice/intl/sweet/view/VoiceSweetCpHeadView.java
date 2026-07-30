package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.hxs;
import p149l.ipn;
import p149l.lno0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetCpHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53530a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53531b;

    /* JADX INFO: renamed from: c */
    public VImage f53532c;

    /* JADX INFO: renamed from: d */
    public VImage f53533d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53534e;

    /* JADX INFO: renamed from: f */
    public VImage f53535f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53536g;

    /* JADX INFO: renamed from: h */
    public VImage f53537h;

    /* JADX INFO: renamed from: i */
    public VText f53538i;

    public VoiceSweetCpHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78491a(View view) {
        lno0.m150691a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78492b(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            hxs.m133409v("context_single_room", this.f53530a, str, xdl0.m208407w(80.0f), xdl0.m208407w(70.0f), false, false, ipn.m137564a(), null);
            this.f53530a.setBackground(null);
        }
        if (!TextUtils.isEmpty(str2)) {
            hxs.m133409v("context_single_room", this.f53531b, str2, xdl0.m208407w(80.0f), xdl0.m208407w(70.0f), false, false, ipn.m137564a(), null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        VImage vImage = this.f53535f;
        if (zIsEmpty) {
            xdl0.m208344M(vImage, true);
        } else {
            xdl0.m208344M(vImage, false);
            hxs.m133409v("context_single_room", this.f53534e, str4, xdl0.m208407w(48.0f), xdl0.m208407w(48.0f), true, false, ipn.m137564a(), null);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str5);
        VImage vImage2 = this.f53537h;
        if (zIsEmpty2) {
            xdl0.m208344M(vImage2, true);
        } else {
            xdl0.m208344M(vImage2, false);
            hxs.m133409v("context_single_room", this.f53536g, str5, xdl0.m208407w(48.0f), xdl0.m208407w(48.0f), true, false, ipn.m137564a(), null);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f53538i.setText(str3);
    }

    /* JADX INFO: renamed from: c */
    public void m78493c(int i, int i2) {
        xdl0.m208327D0(i, this.f53531b);
        xdl0.m208325C0(this.f53531b, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78491a(this);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
