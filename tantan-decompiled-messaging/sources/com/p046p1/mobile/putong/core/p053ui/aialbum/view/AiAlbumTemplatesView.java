package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.cf0;
import p149l.lsi0;
import p149l.tg0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zg0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumTemplatesView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f28430c;

    /* JADX INFO: renamed from: d */
    public VText f28431d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f28432e;

    /* JADX INFO: renamed from: f */
    public VText f28433f;

    /* JADX INFO: renamed from: g */
    public VText f28434g;

    /* JADX INFO: renamed from: h */
    public tg0 f28435h;

    /* JADX INFO: renamed from: i */
    public cf0 f28436i;

    /* JADX INFO: renamed from: j */
    public AiAlbumTemplateData f28437j;

    public AiAlbumTemplatesView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m44302V(View view) {
        if (NullChecker.m81303a(this.f28436i)) {
            zvf0.m220396r("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
            if (this.f28436i.m106470l0()) {
                lsi0.m151593w(R$string.f18603i9);
            } else {
                this.f28436i.m106466h0(this.f28437j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m44303W(View view) {
        zvf0.m220396r("e_intl_ai_photo_change_btn", "p_intl_ai_photo_homepopup");
        if (NullChecker.m81303a(this.f28436i)) {
            this.f28436i.m106460a0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m44304r() {
        this.f28435h = new tg0();
        this.f28432e.setLayoutManager(new GridLayoutManager(this.f28436i.m96966b(), 2));
        this.f28432e.setAdapter(this.f28435h);
        this.f28435h.m188761I(new tg0.InterfaceC20167a() { // from class: l.wg0
            @Override // p149l.tg0.InterfaceC20167a
            /* JADX INFO: renamed from: a */
            public final void mo188764a(AiAlbumTemplateData aiAlbumTemplateData, int i) {
                this.f186130a.m44306T(aiAlbumTemplateData, i);
            }
        });
        xdl0.m208329E0(this.f28433f, new View.OnClickListener() { // from class: l.xg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192728a.m44302V(view);
            }
        });
        xdl0.m208329E0(this.f28434g, new View.OnClickListener() { // from class: l.yg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198108a.m44303W(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m44305S(View view) {
        zg0.m218625a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m44306T(AiAlbumTemplateData aiAlbumTemplateData, int i) {
        this.f28437j = aiAlbumTemplateData;
        this.f28435h.m188763K(aiAlbumTemplateData.f20343id);
        this.f28435h.notifyDataSetChanged();
        this.f28433f.setEnabled(true);
        zvf0.m220399u("e_intl_ai_photo_choose_scenario", "p_intl_ai_photo_homepopup", vwb.m200311Y("intl_ai_photo_no", String.valueOf(i + 1)));
    }

    /* JADX INFO: renamed from: X */
    public void m44307X(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        this.f28435h.m188763K("");
        this.f28433f.setEnabled(true);
        if (!vwb.m200296J(aiAlbumTemplatesEnvelope.data)) {
            AiAlbumTemplateData aiAlbumTemplateData = aiAlbumTemplatesEnvelope.data.get(0);
            if (NullChecker.m81303a(aiAlbumTemplateData)) {
                this.f28437j = aiAlbumTemplateData;
                this.f28435h.m188763K(aiAlbumTemplateData.f20343id);
            }
        }
        this.f28435h.m188762J(aiAlbumTemplatesEnvelope.data);
        zvf0.m220402x("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44305S(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f28436i = cf0Var;
        m44304r();
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
