package com.p000p1.mobile.putong.core.p004ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.AiAlbumFinishedData;
import l.e30;
import l.j760;
import l.lsi0;
import l.rg0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.cf0;
import p006l.mg0;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AiAlbumResultView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4483c;

    /* JADX INFO: renamed from: d */
    public VText f4484d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4485e;

    /* JADX INFO: renamed from: f */
    public VText f4486f;

    /* JADX INFO: renamed from: g */
    public VText f4487g;

    /* JADX INFO: renamed from: h */
    public mg0 f4488h;

    /* JADX INFO: renamed from: i */
    public cf0 f4489i;

    /* JADX INFO: renamed from: j */
    public String f4490j;

    /* JADX INFO: renamed from: k */
    public int f4491k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.aialbum.view.AiAlbumResultView$a */
    public class C0200a implements mg0.InterfaceC1010a {
        public C0200a() {
        }

        @Override // p006l.mg0.InterfaceC1010a
        /* JADX INFO: renamed from: a */
        public void mo7250a(String str, int i) {
            AiAlbumResultView.this.f4491k = i;
            AiAlbumResultView.this.f4490j = str;
            AiAlbumResultView.this.f4488h.m19260M(str);
            AiAlbumResultView.this.f4488h.notifyDataSetChanged();
            AiAlbumResultView.this.f4486f.setEnabled(true);
        }

        @Override // p006l.mg0.InterfaceC1010a
        /* JADX INFO: renamed from: b */
        public void mo7251b(String str, int i) {
            zvf0.u("e_intl_ai_photo_result_save_btn", "p_intl_ai_photo_result", new j760[]{vwb.Y("intl_ai_photo_no", String.valueOf(i + 1))});
            AiAlbumResultView.this.f4489i.m13411f0(str);
        }
    }

    public AiAlbumResultView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m7244Y(Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.w(R$string.f2802p4);
        } else {
            this.f4489i.m13389J();
            lsi0.w(R$string.f2561h9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m7245Z(View view) {
        zvf0.u("e_intl_ai_photo_replace", "p_intl_ai_photo_result", new j760[]{vwb.Y("intl_ai_photo_no", String.valueOf(this.f4491k + 1))});
        this.f4489i.m13408c0(this.f4490j, new e30() { // from class: l.qg0
            public final void call(Object obj) {
                this.f19733a.m7244Y((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m7246a0(View view) {
        zvf0.r("e_intl_ai_photo_restart_btn", "p_intl_ai_photo_result");
        if (this.f4489i.m13416l0()) {
            lsi0.w(R$string.f2592i9);
        } else {
            this.f4489i.m13409d0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m7247r() {
        this.f4488h = new mg0();
        this.f4485e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f4485e.setAdapter(this.f4488h);
        this.f4488h.m19258K(new C0200a());
        xdl0.E0(this.f4486f, new View.OnClickListener() { // from class: l.og0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18225a.m7245Z(view);
            }
        });
        xdl0.E0(this.f4487g, new View.OnClickListener() { // from class: l.pg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18721a.m7246a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m7248X(View view) {
        rg0.a(this, view);
    }

    /* JADX INFO: renamed from: b0 */
    public void m7249b0(AiAlbumFinishedData aiAlbumFinishedData) {
        this.f4488h.m19260M("");
        this.f4486f.setEnabled(false);
        this.f4488h.m19259L(aiAlbumFinishedData.images);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7248X(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f4489i = cf0Var;
        m7247r();
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
