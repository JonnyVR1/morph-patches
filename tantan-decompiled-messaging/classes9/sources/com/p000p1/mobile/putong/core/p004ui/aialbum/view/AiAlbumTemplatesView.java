package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.lsi0;
import l.vwb;
import l.xdl0;
import l.zg0;
import l.zvf0;
import p006l.cf0;
import p006l.tg0;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumTemplatesView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4497c;

    /* JADX INFO: renamed from: d */
    public VText f4498d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4499e;

    /* JADX INFO: renamed from: f */
    public VText f4500f;

    /* JADX INFO: renamed from: g */
    public VText f4501g;

    /* JADX INFO: renamed from: h */
    public tg0 f4502h;

    /* JADX INFO: renamed from: i */
    public cf0 f4503i;

    /* JADX INFO: renamed from: j */
    public AiAlbumTemplateData f4504j;

    public AiAlbumTemplatesView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m7258V(View view) {
        if (NullChecker.a(this.f4503i)) {
            zvf0.r("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
            if (this.f4503i.m13416l0()) {
                lsi0.w(R$string.f2592i9);
            } else {
                this.f4503i.m13412h0(this.f4504j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m7259W(View view) {
        zvf0.r("e_intl_ai_photo_change_btn", "p_intl_ai_photo_homepopup");
        if (NullChecker.a(this.f4503i)) {
            this.f4503i.m13406a0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m7260r() {
        this.f4502h = new tg0();
        this.f4499e.setLayoutManager(new GridLayoutManager(this.f4503i.b(), 2));
        this.f4499e.setAdapter(this.f4502h);
        this.f4502h.m24685I(new tg0.InterfaceC1308a() { // from class: l.wg0
            @Override // p006l.tg0.InterfaceC1308a
            /* JADX INFO: renamed from: a */
            public final void mo24688a(AiAlbumTemplateData aiAlbumTemplateData, int i) {
                this.f25139a.m7262T(aiAlbumTemplateData, i);
            }
        });
        xdl0.E0(this.f4500f, new View.OnClickListener() { // from class: l.xg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27503a.m7258V(view);
            }
        });
        xdl0.E0(this.f4501g, new View.OnClickListener() { // from class: l.yg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28198a.m7259W(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m7261S(View view) {
        zg0.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m7262T(AiAlbumTemplateData aiAlbumTemplateData, int i) {
        this.f4504j = aiAlbumTemplateData;
        this.f4502h.m24687K(aiAlbumTemplateData.id);
        this.f4502h.notifyDataSetChanged();
        this.f4500f.setEnabled(true);
        zvf0.u("e_intl_ai_photo_choose_scenario", "p_intl_ai_photo_homepopup", new j760[]{vwb.Y("intl_ai_photo_no", String.valueOf(i + 1))});
    }

    /* JADX INFO: renamed from: X */
    public void m7263X(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        this.f4502h.m24687K("");
        this.f4500f.setEnabled(true);
        if (!vwb.J(aiAlbumTemplatesEnvelope.data)) {
            AiAlbumTemplateData aiAlbumTemplateData = (AiAlbumTemplateData) aiAlbumTemplatesEnvelope.data.get(0);
            if (NullChecker.a(aiAlbumTemplateData)) {
                this.f4504j = aiAlbumTemplateData;
                this.f4502h.m24687K(aiAlbumTemplateData.id);
            }
        }
        this.f4502h.m24686J(aiAlbumTemplatesEnvelope.data);
        zvf0.x("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7261S(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f4503i = cf0Var;
        m7260r();
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
