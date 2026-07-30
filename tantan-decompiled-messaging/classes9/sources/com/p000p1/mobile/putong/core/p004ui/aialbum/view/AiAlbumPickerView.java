package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.AiAlbumCheckingData;
import java.util.List;
import l.gg0;
import l.hvc0;
import l.xdl0;
import l.zvf0;
import p006l.cf0;
import p006l.dg0;
import p006l.jf0;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumPickerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4461c;

    /* JADX INFO: renamed from: d */
    public VText f4462d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4463e;

    /* JADX INFO: renamed from: f */
    public VText f4464f;

    /* JADX INFO: renamed from: g */
    public VText f4465g;

    /* JADX INFO: renamed from: h */
    public dg0 f4466h;

    /* JADX INFO: renamed from: i */
    public cf0 f4467i;

    /* JADX INFO: renamed from: j */
    public AiAlbumCheckingData f4468j;

    public AiAlbumPickerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m7224R(View view) {
        boolean zEquals = TextUtils.equals(this.f4468j.action, "upload");
        cf0 cf0Var = this.f4467i;
        if (!zEquals) {
            cf0Var.m13407b0(this.f4468j);
        } else {
            cf0Var.m13413i0();
            zvf0.r("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m7225r() {
        this.f4466h = new dg0();
        this.f4463e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f4463e.setAdapter(this.f4466h);
        xdl0.E0(this.f4465g, new View.OnClickListener() { // from class: l.fg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12709a.m7224R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m7226Q(View view) {
        gg0.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m7227S(AiAlbumCheckingData aiAlbumCheckingData, List<jf0> list) {
        this.f4468j = aiAlbumCheckingData;
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f4465g.setEnabled(true);
                this.f4465g.setText(R$string.f2376b9);
                zvf0.x("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
                break;
            case "add":
                this.f4465g.setEnabled(true);
                this.f4465g.setText(R$string.f2407c9);
                break;
            case "wait":
                this.f4465g.setEnabled(false);
                this.f4465g.setText(R$string.f2530g9);
                break;
        }
        this.f4466h.m14041G(list);
        xdl0.M(this.f4464f, false);
        if (aiAlbumCheckingData.bad.size() > 0) {
            xdl0.M(this.f4464f, true);
            this.f4464f.setText(String.format(hvc0.c(R$string.f2499f9), Integer.valueOf(aiAlbumCheckingData.bad.size())));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m7228T(List<jf0> list) {
        this.f4466h.m14041G(list);
        this.f4465g.setEnabled(false);
        this.f4465g.setText(R$string.f2621j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7226Q(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f4467i = cf0Var;
        m7225r();
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
