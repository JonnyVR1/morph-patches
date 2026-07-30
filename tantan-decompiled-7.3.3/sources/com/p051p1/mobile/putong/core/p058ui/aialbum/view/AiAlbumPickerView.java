package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AiAlbumCheckingData;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.cg0;
import p153l.ff0;
import p153l.i4g0;
import p153l.k3d0;
import p153l.ye0;
import p153l.zf0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumPickerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29242c;

    /* JADX INFO: renamed from: d */
    public VText f29243d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29244e;

    /* JADX INFO: renamed from: f */
    public VText f29245f;

    /* JADX INFO: renamed from: g */
    public VText f29246g;

    /* JADX INFO: renamed from: h */
    public zf0 f29247h;

    /* JADX INFO: renamed from: i */
    public ye0 f29248i;

    /* JADX INFO: renamed from: j */
    public AiAlbumCheckingData f29249j;

    public AiAlbumPickerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m45451R(View view) {
        boolean zEquals = TextUtils.equals(this.f29249j.action, "upload");
        ye0 ye0Var = this.f29248i;
        if (!zEquals) {
            ye0Var.m215380b0(this.f29249j);
        } else {
            ye0Var.m215386i0();
            i4g0.m138520r("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
        }
    }

    /* JADX INFO: renamed from: r */
    private void m45452r() {
        this.f29247h = new zf0();
        this.f29244e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f29244e.setAdapter(this.f29247h);
        bnl0.m105509E0(this.f29246g, new View.OnClickListener() { // from class: l.bg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76559a.m45451R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m45453Q(View view) {
        cg0.m109661a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m45454S(AiAlbumCheckingData aiAlbumCheckingData, List<ff0> list) {
        this.f29249j = aiAlbumCheckingData;
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f29246g.setEnabled(true);
                this.f29246g.setText(R$string.f19179d9);
                i4g0.m138526x("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
                break;
            case "add":
                this.f29246g.setEnabled(true);
                this.f29246g.setText(R$string.f19209e9);
                break;
            case "wait":
                this.f29246g.setEnabled(false);
                this.f29246g.setText(R$string.f19333i9);
                break;
        }
        this.f29247h.m219519G(list);
        bnl0.m105524M(this.f29245f, false);
        if (aiAlbumCheckingData.bad.size() > 0) {
            bnl0.m105524M(this.f29245f, true);
            this.f29245f.setText(String.format(k3d0.m148007c(R$string.f19302h9), Integer.valueOf(aiAlbumCheckingData.bad.size())));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m45455T(List<ff0> list) {
        this.f29247h.m219519G(list);
        this.f29246g.setEnabled(false);
        this.f29246g.setText(R$string.f19424l9);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45453Q(this);
    }

    public void setPresenter(ye0 ye0Var) {
        this.f29248i = ye0Var;
        m45452r();
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
