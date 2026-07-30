package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p051p1.mobile.putong.data.Picture;
import p151v.VDraweeView;
import p151v.VRelative;
import p153l.bnl0;
import p153l.qa00;
import p153l.rg0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumTemplatesItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public AiAlbumTemplatesItemView f29274d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29275e;

    /* JADX INFO: renamed from: f */
    public int f29276f;

    /* JADX INFO: renamed from: g */
    public int f29277g;

    public AiAlbumTemplatesItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: q */
    private void m45479q() {
        if (this.f29276f == 0 || this.f29277g == 0) {
            int iM105592y0 = (bnl0.m105592y0() - qa00.f156335v) / 2;
            this.f29276f = iM105592y0;
            this.f29277g = (int) (iM105592y0 * 1.27f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45480p(this);
        m45479q();
        bnl0.m105507D0(this.f29276f, this.f29274d);
        bnl0.m105505C0(this.f29274d, this.f29277g);
    }

    /* JADX INFO: renamed from: p */
    public final void m45480p(View view) {
        rg0.m181313a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m45481z(AiAlbumTemplateData aiAlbumTemplateData, String str) {
        m45479q();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = aiAlbumTemplateData.templateUrl;
        uqb0.f180374G.m127115L0(this.f29275e, pictureNew_.calculatedWidth(this.f29276f).formatted());
        boolean zEquals = TextUtils.equals(aiAlbumTemplateData.f21085id, str);
        VDraweeView vDraweeView = this.f29275e;
        if (zEquals) {
            bnl0.m105548c0(vDraweeView, qa00.m175859d(7.0f));
            bnl0.m105552e0(this.f29275e, qa00.m175859d(7.0f));
            bnl0.m105550d0(this.f29275e, qa00.m175859d(7.0f));
            bnl0.m105554f0(this.f29275e, qa00.m175859d(7.0f));
            this.f29275e.setSelected(true);
            return;
        }
        vDraweeView.setSelected(false);
        bnl0.m105548c0(this.f29275e, qa00.m175859d(5.0f));
        bnl0.m105552e0(this.f29275e, qa00.m175859d(5.0f));
        bnl0.m105550d0(this.f29275e, qa00.m175859d(5.0f));
        bnl0.m105554f0(this.f29275e, qa00.m175859d(5.0f));
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
