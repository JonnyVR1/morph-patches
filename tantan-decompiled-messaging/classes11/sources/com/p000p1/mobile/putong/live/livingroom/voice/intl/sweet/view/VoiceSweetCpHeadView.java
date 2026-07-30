package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.hxs;
import l.ipn;
import l.lno0;
import l.xdl0;
import l.ym2;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetCpHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7136a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7137b;

    /* JADX INFO: renamed from: c */
    public VImage f7138c;

    /* JADX INFO: renamed from: d */
    public VImage f7139d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7140e;

    /* JADX INFO: renamed from: f */
    public VImage f7141f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7142g;

    /* JADX INFO: renamed from: h */
    public VImage f7143h;

    /* JADX INFO: renamed from: i */
    public VText f7144i;

    public VoiceSweetCpHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8700a(View view) {
        lno0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8701b(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            hxs.v("context_single_room", this.f7136a, str, xdl0.w(80.0f), xdl0.w(70.0f), false, false, ipn.a(), (ym2) null);
            this.f7136a.setBackground(null);
        }
        if (!TextUtils.isEmpty(str2)) {
            hxs.v("context_single_room", this.f7137b, str2, xdl0.w(80.0f), xdl0.w(70.0f), false, false, ipn.a(), (ym2) null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        VImage vImage = this.f7141f;
        if (zIsEmpty) {
            xdl0.M(vImage, true);
        } else {
            xdl0.M(vImage, false);
            hxs.v("context_single_room", this.f7140e, str4, xdl0.w(48.0f), xdl0.w(48.0f), true, false, ipn.a(), (ym2) null);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str5);
        VImage vImage2 = this.f7143h;
        if (zIsEmpty2) {
            xdl0.M(vImage2, true);
        } else {
            xdl0.M(vImage2, false);
            hxs.v("context_single_room", this.f7142g, str5, xdl0.w(48.0f), xdl0.w(48.0f), true, false, ipn.a(), (ym2) null);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f7144i.setText(str3);
    }

    /* JADX INFO: renamed from: c */
    public void m8702c(int i, int i2) {
        xdl0.D0(i, new View[]{this.f7137b});
        xdl0.C0(this.f7137b, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8700a(this);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
