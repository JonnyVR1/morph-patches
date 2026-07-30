package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.TribeSubsetContent;
import java.util.List;
import l.b3c0;
import l.dep;
import l.qib0;
import l.xdl0;
import p009l.oho;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeGroupRight extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3056a;

    /* JADX INFO: renamed from: b */
    public VImage f3057b;

    /* JADX INFO: renamed from: c */
    public VLinear f3058c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f3059d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f3060e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f3061f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f3062g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f3063h;

    public IntlTribeGroupRight(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3504p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3504p(View view) {
        dep.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m3505s(TribeSubsetContent tribeSubsetContent, oho ohoVar, int i, int i2) {
        if (tribeSubsetContent == null) {
            return;
        }
        byte b = 1;
        xdl0.D0(i, new View[]{this});
        xdl0.C0(this, i2);
        qib0.G.L0(this.f3056a, tribeSubsetContent.coverUrl);
        List list = tribeSubsetContent.profilePhoto;
        if (list != null && !list.isEmpty()) {
            if (tribeSubsetContent.profilePhoto.size() > 0) {
                this.f3060e.setImageUrl((String) tribeSubsetContent.profilePhoto.get(0));
            }
            if (tribeSubsetContent.profilePhoto.size() > 1) {
                this.f3062g.setImageUrl((String) tribeSubsetContent.profilePhoto.get(1));
            }
            if (tribeSubsetContent.profilePhoto.size() > 2) {
                this.f3061f.setImageUrl((String) tribeSubsetContent.profilePhoto.get(2));
            }
        }
        this.f3063h.setText(tribeSubsetContent.title);
        this.f3059d.setText(ohoVar.m19793t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.M(this.f3058c, tribeSubsetContent.currentLikeMe > 0);
        String str = tribeSubsetContent.subType;
        str.getClass();
        switch (str.hashCode()) {
            case -1396849433:
                b = !str.equals("certified") ? (byte) -1 : (byte) 0;
                break;
            case -1012222381:
                if (!str.equals("online")) {
                    b = -1;
                }
                break;
            case 108960:
                b = !str.equals("new") ? (byte) -1 : (byte) 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f3057b.setImageResource(b3c0.X);
                break;
            case 1:
                this.f3057b.setImageResource(b3c0.b0);
                break;
            case 2:
                this.f3057b.setImageResource(b3c0.c0);
                break;
        }
    }

    public IntlTribeGroupRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
