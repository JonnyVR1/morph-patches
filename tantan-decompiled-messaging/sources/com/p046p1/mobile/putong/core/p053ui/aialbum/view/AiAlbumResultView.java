package com.p046p1.mobile.putong.core.p053ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AiAlbumFinishedData;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.cf0;
import p149l.e30;
import p149l.lsi0;
import p149l.mg0;
import p149l.rg0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumResultView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f28416c;

    /* JADX INFO: renamed from: d */
    public VText f28417d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f28418e;

    /* JADX INFO: renamed from: f */
    public VText f28419f;

    /* JADX INFO: renamed from: g */
    public VText f28420g;

    /* JADX INFO: renamed from: h */
    public mg0 f28421h;

    /* JADX INFO: renamed from: i */
    public cf0 f28422i;

    /* JADX INFO: renamed from: j */
    public String f28423j;

    /* JADX INFO: renamed from: k */
    public int f28424k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.aialbum.view.AiAlbumResultView$a */
    public class C8284a implements mg0.InterfaceC18453a {
        public C8284a() {
        }

        @Override // p149l.mg0.InterfaceC18453a
        /* JADX INFO: renamed from: a */
        public void mo44294a(String str, int i) {
            AiAlbumResultView.this.f28424k = i;
            AiAlbumResultView.this.f28423j = str;
            AiAlbumResultView.this.f28421h.m154478M(str);
            AiAlbumResultView.this.f28421h.notifyDataSetChanged();
            AiAlbumResultView.this.f28419f.setEnabled(true);
        }

        @Override // p149l.mg0.InterfaceC18453a
        /* JADX INFO: renamed from: b */
        public void mo44295b(String str, int i) {
            zvf0.m220399u("e_intl_ai_photo_result_save_btn", "p_intl_ai_photo_result", vwb.m200311Y("intl_ai_photo_no", String.valueOf(i + 1)));
            AiAlbumResultView.this.f28422i.m106465f0(str);
        }
    }

    public AiAlbumResultView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m44288Y(Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.m151593w(R$string.f18813p4);
        } else {
            this.f28422i.m106443J();
            lsi0.m151593w(R$string.f18572h9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m44289Z(View view) {
        zvf0.m220399u("e_intl_ai_photo_replace", "p_intl_ai_photo_result", vwb.m200311Y("intl_ai_photo_no", String.valueOf(this.f28424k + 1)));
        this.f28422i.m106462c0(this.f28423j, new e30() { // from class: l.qg0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154302a.m44288Y((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m44290a0(View view) {
        zvf0.m220396r("e_intl_ai_photo_restart_btn", "p_intl_ai_photo_result");
        if (this.f28422i.m106470l0()) {
            lsi0.m151593w(R$string.f18603i9);
        } else {
            this.f28422i.m106463d0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m44291r() {
        this.f28421h = new mg0();
        this.f28418e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f28418e.setAdapter(this.f28421h);
        this.f28421h.m154476K(new C8284a());
        xdl0.m208329E0(this.f28419f, new View.OnClickListener() { // from class: l.og0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143795a.m44289Z(view);
            }
        });
        xdl0.m208329E0(this.f28420g, new View.OnClickListener() { // from class: l.pg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148604a.m44290a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m44292X(View view) {
        rg0.m179154a(this, view);
    }

    /* JADX INFO: renamed from: b0 */
    public void m44293b0(AiAlbumFinishedData aiAlbumFinishedData) {
        this.f28421h.m154478M("");
        this.f28419f.setEnabled(false);
        this.f28421h.m154477L(aiAlbumFinishedData.images);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44292X(this);
    }

    public void setPresenter(cf0 cf0Var) {
        this.f28422i = cf0Var;
        m44291r();
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
