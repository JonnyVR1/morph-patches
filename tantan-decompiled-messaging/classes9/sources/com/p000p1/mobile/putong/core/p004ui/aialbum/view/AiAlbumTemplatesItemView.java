package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import l.t100;
import l.vg0;
import l.xdl0;
import p006l.qib0;
import v.VDraweeView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumTemplatesItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumTemplatesItemView f4493d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4494e;

    /* JADX INFO: renamed from: f */
    public int f4495f;

    /* JADX INFO: renamed from: g */
    public int f4496g;

    public AiAlbumTemplatesItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: q */
    private void m7252q() {
        if (this.f4495f == 0 || this.f4496g == 0) {
            int iY0 = (xdl0.y0() - t100.v) / 2;
            this.f4495f = iY0;
            this.f4496g = (int) (iY0 * 1.27f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7253p(this);
        m7252q();
        xdl0.D0(this.f4495f, new View[]{this.f4493d});
        xdl0.C0(this.f4493d, this.f4496g);
    }

    /* JADX INFO: renamed from: p */
    public final void m7253p(View view) {
        vg0.a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m7254z(AiAlbumTemplateData aiAlbumTemplateData, String str) {
        m7252q();
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = aiAlbumTemplateData.templateUrl;
        qib0.f19782G.m12744L0(this.f4494e, pictureNew_.calculatedWidth(this.f4495f).formatted());
        boolean zEquals = TextUtils.equals(aiAlbumTemplateData.id, str);
        VDraweeView vDraweeView = this.f4494e;
        if (zEquals) {
            xdl0.c0(vDraweeView, t100.d(7.0f));
            xdl0.e0(this.f4494e, t100.d(7.0f));
            xdl0.d0(this.f4494e, t100.d(7.0f));
            xdl0.f0(this.f4494e, t100.d(7.0f));
            this.f4494e.setSelected(true);
            return;
        }
        vDraweeView.setSelected(false);
        xdl0.c0(this.f4494e, t100.d(5.0f));
        xdl0.e0(this.f4494e, t100.d(5.0f));
        xdl0.d0(this.f4494e, t100.d(5.0f));
        xdl0.f0(this.f4494e, t100.d(5.0f));
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
