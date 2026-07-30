package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.dgp;
import p153l.gbc0;
import p153l.ojo;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupRight extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25020a;

    /* JADX INFO: renamed from: b */
    public VImage f25021b;

    /* JADX INFO: renamed from: c */
    public VLinear f25022c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f25023d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f25024e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f25025f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f25026g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f25027h;

    public IntlTribeGroupRight(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40453p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40453p(View view) {
        dgp.m115660a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m40454s(TribeSubsetContent tribeSubsetContent, ojo ojoVar, int i, int i2) {
        if (tribeSubsetContent == null) {
            return;
        }
        byte b = 1;
        bnl0.m105507D0(i, this);
        bnl0.m105505C0(this, i2);
        uqb0.f180374G.m127115L0(this.f25020a, tribeSubsetContent.coverUrl);
        List<String> list = tribeSubsetContent.profilePhoto;
        if (list != null && !list.isEmpty()) {
            if (tribeSubsetContent.profilePhoto.size() > 0) {
                this.f25024e.setImageUrl(tribeSubsetContent.profilePhoto.get(0));
            }
            if (tribeSubsetContent.profilePhoto.size() > 1) {
                this.f25026g.setImageUrl(tribeSubsetContent.profilePhoto.get(1));
            }
            if (tribeSubsetContent.profilePhoto.size() > 2) {
                this.f25025f.setImageUrl(tribeSubsetContent.profilePhoto.get(2));
            }
        }
        this.f25027h.setText(tribeSubsetContent.title);
        this.f25023d.setText(ojoVar.m167897t0(tribeSubsetContent.currentLikeMe, true));
        bnl0.m105524M(this.f25022c, tribeSubsetContent.currentLikeMe > 0);
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
                b = !str.equals(ShareConstants.NEW_VERSION) ? (byte) -1 : (byte) 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f25021b.setImageResource(gbc0.f103232X);
                break;
            case 1:
                this.f25021b.setImageResource(gbc0.f103262b0);
                break;
            case 2:
                this.f25021b.setImageResource(gbc0.f103270c0);
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
