package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.o1j0;
import p153l.pg0;
import p153l.vg0;
import p153l.ye0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumTemplatesView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29278c;

    /* JADX INFO: renamed from: d */
    public VText f29279d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29280e;

    /* JADX INFO: renamed from: f */
    public VText f29281f;

    /* JADX INFO: renamed from: g */
    public VText f29282g;

    /* JADX INFO: renamed from: h */
    public pg0 f29283h;

    /* JADX INFO: renamed from: i */
    public ye0 f29284i;

    /* JADX INFO: renamed from: j */
    public AiAlbumTemplateData f29285j;

    public AiAlbumTemplatesView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m45485V(View view) {
        if (NullChecker.m82486a(this.f29284i)) {
            i4g0.m138520r("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
            if (this.f29284i.m215389l0()) {
                o1j0.m165649w(R$string.f19393k9);
            } else {
                this.f29284i.m215385h0(this.f29285j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m45486W(View view) {
        i4g0.m138520r("e_intl_ai_photo_change_btn", "p_intl_ai_photo_homepopup");
        if (NullChecker.m82486a(this.f29284i)) {
            this.f29284i.m215379a0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m45487r() {
        this.f29283h = new pg0();
        this.f29280e.setLayoutManager(new GridLayoutManager(this.f29284i.m140179b(), 2));
        this.f29280e.setAdapter(this.f29283h);
        this.f29283h.m172173I(new pg0.InterfaceC19362a() { // from class: l.sg0
            @Override // p153l.pg0.InterfaceC19362a
            /* JADX INFO: renamed from: a */
            public final void mo172176a(AiAlbumTemplateData aiAlbumTemplateData, int i) {
                this.f167783a.m45489T(aiAlbumTemplateData, i);
            }
        });
        bnl0.m105509E0(this.f29281f, new View.OnClickListener() { // from class: l.tg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174032a.m45485V(view);
            }
        });
        bnl0.m105509E0(this.f29282g, new View.OnClickListener() { // from class: l.ug0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178849a.m45486W(view);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m45488S(View view) {
        vg0.m201198a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m45489T(AiAlbumTemplateData aiAlbumTemplateData, int i) {
        this.f29285j = aiAlbumTemplateData;
        this.f29283h.m172175K(aiAlbumTemplateData.f21085id);
        this.f29283h.notifyDataSetChanged();
        this.f29281f.setEnabled(true);
        i4g0.m138523u("e_intl_ai_photo_choose_scenario", "p_intl_ai_photo_homepopup", jyb.m147494Y("intl_ai_photo_no", String.valueOf(i + 1)));
    }

    /* JADX INFO: renamed from: X */
    public void m45490X(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
        this.f29283h.m172175K("");
        this.f29281f.setEnabled(true);
        if (!jyb.m147479J(aiAlbumTemplatesEnvelope.data)) {
            AiAlbumTemplateData aiAlbumTemplateData = aiAlbumTemplatesEnvelope.data.get(0);
            if (NullChecker.m82486a(aiAlbumTemplateData)) {
                this.f29285j = aiAlbumTemplateData;
                this.f29283h.m172175K(aiAlbumTemplateData.f21085id);
            }
        }
        this.f29283h.m172174J(aiAlbumTemplatesEnvelope.data);
        i4g0.m138526x("e_intl_ai_photo_upload_btn", "p_intl_ai_photo_homepopup");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45488S(this);
    }

    public void setPresenter(ye0 ye0Var) {
        this.f29284i = ye0Var;
        m45487r();
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumTemplatesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
