package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p046p1.mobile.putong.data.Picture;
import p147v.VDraweeView;
import p147v.VRelative;
import p149l.qib0;
import p149l.t100;
import p149l.vg0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumTemplatesItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumTemplatesItemView f28426d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f28427e;

    /* JADX INFO: renamed from: f */
    public int f28428f;

    /* JADX INFO: renamed from: g */
    public int f28429g;

    public AiAlbumTemplatesItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: q */
    private void m44296q() {
        if (this.f28428f == 0 || this.f28429g == 0) {
            int iM208412y0 = (xdl0.m208412y0() - t100.f167273v) / 2;
            this.f28428f = iM208412y0;
            this.f28429g = (int) (iM208412y0 * 1.27f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44297p(this);
        m44296q();
        xdl0.m208327D0(this.f28428f, this.f28426d);
        xdl0.m208325C0(this.f28426d, this.f28429g);
    }

    /* JADX INFO: renamed from: p */
    public final void m44297p(View view) {
        vg0.m198308a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m44298z(AiAlbumTemplateData aiAlbumTemplateData, String str) {
        m44296q();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = aiAlbumTemplateData.templateUrl;
        qib0.f154691G.m102331L0(this.f28427e, pictureNew_.calculatedWidth(this.f28428f).formatted());
        boolean zEquals = TextUtils.equals(aiAlbumTemplateData.f20343id, str);
        VDraweeView vDraweeView = this.f28427e;
        if (zEquals) {
            xdl0.m208368c0(vDraweeView, t100.m186890d(7.0f));
            xdl0.m208372e0(this.f28427e, t100.m186890d(7.0f));
            xdl0.m208370d0(this.f28427e, t100.m186890d(7.0f));
            xdl0.m208374f0(this.f28427e, t100.m186890d(7.0f));
            this.f28427e.setSelected(true);
            return;
        }
        vDraweeView.setSelected(false);
        xdl0.m208368c0(this.f28427e, t100.m186890d(5.0f));
        xdl0.m208372e0(this.f28427e, t100.m186890d(5.0f));
        xdl0.m208370d0(this.f28427e, t100.m186890d(5.0f));
        xdl0.m208374f0(this.f28427e, t100.m186890d(5.0f));
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
