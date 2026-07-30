package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AiAlbumCheckingData;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.cf0;
import p149l.dg0;
import p149l.gg0;
import p149l.hvc0;
import p149l.jf0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumPickerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f28394c;

    /* JADX INFO: renamed from: d */
    public VText f28395d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f28396e;

    /* JADX INFO: renamed from: f */
    public VText f28397f;

    /* JADX INFO: renamed from: g */
    public VText f28398g;

    /* JADX INFO: renamed from: h */
    public dg0 f28399h;

    /* JADX INFO: renamed from: i */
    public cf0 f28400i;

    /* JADX INFO: renamed from: j */
    public AiAlbumCheckingData f28401j;

    public AiAlbumPickerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m44268R(View view) {
        boolean zEquals = TextUtils.equals(this.f28401j.action, "upload");
        cf0 cf0Var = this.f28400i;
        if (!zEquals) {
            cf0Var.m106461b0(this.f28401j);
        } else {
            cf0Var.m106467i0();
            zvf0.m220396r("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
        }
    }

    /* JADX INFO: renamed from: r */
    private void m44269r() {
        this.f28399h = new dg0();
        this.f28396e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f28396e.setAdapter(this.f28399h);
        xdl0.m208329E0(this.f28398g, new View.OnClickListener() { // from class: l.fg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97324a.m44268R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m44270Q(View view) {
        gg0.m125936a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m44271S(AiAlbumCheckingData aiAlbumCheckingData, List<jf0> list) {
        this.f28401j = aiAlbumCheckingData;
        String str = aiAlbumCheckingData.action;
        str.getClass();
        switch (str) {
            case "upload":
                this.f28398g.setEnabled(true);
                this.f28398g.setText(R$string.f18387b9);
                zvf0.m220402x("e_intl_ai_photo_generate_btn", "p_intl_ai_photo_self_photo");
                break;
            case "add":
                this.f28398g.setEnabled(true);
                this.f28398g.setText(R$string.f18418c9);
                break;
            case "wait":
                this.f28398g.setEnabled(false);
                this.f28398g.setText(R$string.f18541g9);
                break;
        }
        this.f28399h.m111542G(list);
        xdl0.m208344M(this.f28397f, false);
        if (aiAlbumCheckingData.bad.size() > 0) {
            xdl0.m208344M(this.f28397f, true);
            this.f28397f.setText(String.format(hvc0.m133156c(R$string.f18510f9), Integer.valueOf(aiAlbumCheckingData.bad.size())));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m44272T(List<jf0> list) {
        this.f28399h.m111542G(list);
        this.f28398g.setEnabled(false);
        this.f28398g.setText(R$string.f18632j9);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44270Q(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f28400i = cf0Var;
        m44269r();
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
