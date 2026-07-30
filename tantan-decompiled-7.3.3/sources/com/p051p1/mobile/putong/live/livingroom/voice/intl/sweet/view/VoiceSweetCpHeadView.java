package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.irn;
import p153l.izs;
import p153l.pwo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetCpHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54378a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54379b;

    /* JADX INFO: renamed from: c */
    public VImage f54380c;

    /* JADX INFO: renamed from: d */
    public VImage f54381d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54382e;

    /* JADX INFO: renamed from: f */
    public VImage f54383f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54384g;

    /* JADX INFO: renamed from: h */
    public VImage f54385h;

    /* JADX INFO: renamed from: i */
    public VText f54386i;

    public VoiceSweetCpHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79674a(View view) {
        pwo0.m174059a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79675b(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            izs.m142871v("context_single_room", this.f54378a, str, bnl0.m105587w(80.0f), bnl0.m105587w(70.0f), false, false, irn.m141839a(), null);
            this.f54378a.setBackground(null);
        }
        if (!TextUtils.isEmpty(str2)) {
            izs.m142871v("context_single_room", this.f54379b, str2, bnl0.m105587w(80.0f), bnl0.m105587w(70.0f), false, false, irn.m141839a(), null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        VImage vImage = this.f54383f;
        if (zIsEmpty) {
            bnl0.m105524M(vImage, true);
        } else {
            bnl0.m105524M(vImage, false);
            izs.m142871v("context_single_room", this.f54382e, str4, bnl0.m105587w(48.0f), bnl0.m105587w(48.0f), true, false, irn.m141839a(), null);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str5);
        VImage vImage2 = this.f54385h;
        if (zIsEmpty2) {
            bnl0.m105524M(vImage2, true);
        } else {
            bnl0.m105524M(vImage2, false);
            izs.m142871v("context_single_room", this.f54384g, str5, bnl0.m105587w(48.0f), bnl0.m105587w(48.0f), true, false, irn.m141839a(), null);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f54386i.setText(str3);
    }

    /* JADX INFO: renamed from: c */
    public void m79676c(int i, int i2) {
        bnl0.m105507D0(i, this.f54379b);
        bnl0.m105505C0(this.f54379b, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79674a(this);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
