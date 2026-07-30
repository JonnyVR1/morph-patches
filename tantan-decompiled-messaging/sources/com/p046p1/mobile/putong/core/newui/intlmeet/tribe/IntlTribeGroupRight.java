package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.TribeSubsetContent;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.b3c0;
import p149l.dep;
import p149l.oho;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupRight extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24278a;

    /* JADX INFO: renamed from: b */
    public VImage f24279b;

    /* JADX INFO: renamed from: c */
    public VLinear f24280c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f24281d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f24282e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f24283f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f24284g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f24285h;

    public IntlTribeGroupRight(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39450p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39450p(View view) {
        dep.m111388a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39451s(TribeSubsetContent tribeSubsetContent, oho ohoVar, int i, int i2) {
        if (tribeSubsetContent == null) {
            return;
        }
        byte b = 1;
        xdl0.m208327D0(i, this);
        xdl0.m208325C0(this, i2);
        qib0.f154691G.m102331L0(this.f24278a, tribeSubsetContent.coverUrl);
        List<String> list = tribeSubsetContent.profilePhoto;
        if (list != null && !list.isEmpty()) {
            if (tribeSubsetContent.profilePhoto.size() > 0) {
                this.f24282e.setImageUrl(tribeSubsetContent.profilePhoto.get(0));
            }
            if (tribeSubsetContent.profilePhoto.size() > 1) {
                this.f24284g.setImageUrl(tribeSubsetContent.profilePhoto.get(1));
            }
            if (tribeSubsetContent.profilePhoto.size() > 2) {
                this.f24283f.setImageUrl(tribeSubsetContent.profilePhoto.get(2));
            }
        }
        this.f24285h.setText(tribeSubsetContent.title);
        this.f24281d.setText(ohoVar.m164457t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.m208344M(this.f24280c, tribeSubsetContent.currentLikeMe > 0);
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
                this.f24279b.setImageResource(b3c0.f72981X);
                break;
            case 1:
                this.f24279b.setImageResource(b3c0.f73011b0);
                break;
            case 2:
                this.f24279b.setImageResource(b3c0.f73019c0);
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
