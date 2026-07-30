package com.p051p1.mobile.putong.core.p058ui.aialbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AiAlbumFinishedData;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ig0;
import p153l.jyb;
import p153l.ng0;
import p153l.o1j0;
import p153l.y20;
import p153l.ye0;

/* JADX INFO: loaded from: classes9.dex */
public class AiAlbumResultView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29264c;

    /* JADX INFO: renamed from: d */
    public VText f29265d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29266e;

    /* JADX INFO: renamed from: f */
    public VText f29267f;

    /* JADX INFO: renamed from: g */
    public VText f29268g;

    /* JADX INFO: renamed from: h */
    public ig0 f29269h;

    /* JADX INFO: renamed from: i */
    public ye0 f29270i;

    /* JADX INFO: renamed from: j */
    public String f29271j;

    /* JADX INFO: renamed from: k */
    public int f29272k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.aialbum.view.AiAlbumResultView$a */
    public class C8447a implements ig0.InterfaceC17714a {
        public C8447a() {
        }

        @Override // p153l.ig0.InterfaceC17714a
        /* JADX INFO: renamed from: a */
        public void mo45477a(String str, int i) {
            AiAlbumResultView.this.f29272k = i;
            AiAlbumResultView.this.f29271j = str;
            AiAlbumResultView.this.f29269h.m139762M(str);
            AiAlbumResultView.this.f29269h.notifyDataSetChanged();
            AiAlbumResultView.this.f29267f.setEnabled(true);
        }

        @Override // p153l.ig0.InterfaceC17714a
        /* JADX INFO: renamed from: b */
        public void mo45478b(String str, int i) {
            i4g0.m138523u("e_intl_ai_photo_result_save_btn", "p_intl_ai_photo_result", jyb.m147494Y("intl_ai_photo_no", String.valueOf(i + 1)));
            AiAlbumResultView.this.f29270i.m215384f0(str);
        }
    }

    public AiAlbumResultView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m45471Y(Boolean bool) {
        if (!bool.booleanValue()) {
            o1j0.m165649w(R$string.f19605r4);
        } else {
            this.f29270i.m215362J();
            o1j0.m165649w(R$string.f19362j9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m45472Z(View view) {
        i4g0.m138523u("e_intl_ai_photo_replace", "p_intl_ai_photo_result", jyb.m147494Y("intl_ai_photo_no", String.valueOf(this.f29272k + 1)));
        this.f29270i.m215381c0(this.f29271j, new y20() { // from class: l.mg0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136687a.m45471Y((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m45473a0(View view) {
        i4g0.m138520r("e_intl_ai_photo_restart_btn", "p_intl_ai_photo_result");
        if (this.f29270i.m215389l0()) {
            o1j0.m165649w(R$string.f19393k9);
        } else {
            this.f29270i.m215382d0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: r */
    private void m45474r() {
        this.f29269h = new ig0();
        this.f29266e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f29266e.setAdapter(this.f29269h);
        this.f29269h.m139760K(new C8447a());
        bnl0.m105509E0(this.f29267f, new View.OnClickListener() { // from class: l.kg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126538a.m45472Z(view);
            }
        });
        bnl0.m105509E0(this.f29268g, new View.OnClickListener() { // from class: l.lg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131923a.m45473a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m45475X(View view) {
        ng0.m162962a(this, view);
    }

    /* JADX INFO: renamed from: b0 */
    public void m45476b0(AiAlbumFinishedData aiAlbumFinishedData) {
        this.f29269h.m139762M("");
        this.f29267f.setEnabled(false);
        this.f29269h.m139761L(aiAlbumFinishedData.images);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45475X(this);
    }

    public void setPresenter(ye0 ye0Var) {
        this.f29270i = ye0Var;
        m45474r();
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AiAlbumResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
