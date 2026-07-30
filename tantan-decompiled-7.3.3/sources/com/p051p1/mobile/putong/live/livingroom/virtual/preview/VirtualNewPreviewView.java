package com.p051p1.mobile.putong.live.livingroom.virtual.preview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import java.util.Random;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.iam;
import p153l.izs;
import p153l.jyb;
import p153l.mdc0;
import p153l.o1j0;
import p153l.qa00;
import p153l.qcr;
import p153l.x20;
import p153l.xau;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualNewPreviewView extends ConstraintLayout implements iam<VoiceVirtualPreviewPresenter> {

    /* JADX INFO: renamed from: d */
    public View f53491d;

    /* JADX INFO: renamed from: e */
    public EditText f53492e;

    /* JADX INFO: renamed from: f */
    public View f53493f;

    /* JADX INFO: renamed from: g */
    public FlowLayout f53494g;

    /* JADX INFO: renamed from: h */
    public TextView f53495h;

    /* JADX INFO: renamed from: i */
    public View f53496i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualPreviewPresenter f53497j;

    /* JADX INFO: renamed from: k */
    public BLiveStartPageTemplate f53498k;

    /* JADX INFO: renamed from: l */
    public String f53499l;

    public VirtualNewPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53499l = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m78423p0(View view) {
        this.f53497j.m78459a4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m78424q0(View view) {
        this.f53497j.m78467o4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m78425r0(View view) {
        m78431v0(this.f53498k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m78426s0(View view) {
        m78430u0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public BLiveStartPageTemplate getCurrentTemplate() {
        if (this.f53498k == null) {
            this.f53498k = BLiveStartPageTemplate.new_();
        }
        return this.f53498k;
    }

    public String getTitle() {
        return this.f53492e.getText().toString().trim();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter) {
        this.f53497j = voiceVirtualPreviewPresenter;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m78428o0() {
        return this.f53495h.isSelected();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53491d = findViewById(mdc0.f136336x0);
        this.f53492e = (EditText) findViewById(mdc0.f136238m1);
        this.f53493f = findViewById(mdc0.f136133b5);
        this.f53494g = (FlowLayout) findViewById(mdc0.f135950H3);
        TextView textView = (TextView) findViewById(mdc0.f136099Y);
        this.f53495h = textView;
        textView.setSelected(true);
        this.f53496i = findViewById(mdc0.f136055T0);
        setTextBold(findViewById(mdc0.f136064U0));
        setTextBold(findViewById(mdc0.f136332w5));
        setTextBold(findViewById(mdc0.f136323v5));
        setTextBold(this.f53492e);
        setTextBold(this.f53496i);
        bnl0.m105509E0(this.f53491d, new View.OnClickListener() { // from class: l.g2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101859a.m78423p0(view);
            }
        });
        bnl0.m105509E0(this.f53496i, new View.OnClickListener() { // from class: l.h2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107566a.m78424q0(view);
            }
        });
        bnl0.m105509E0(this.f53493f, new View.OnClickListener() { // from class: l.i2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112657a.m78425r0(view);
            }
        });
        bnl0.m105509E0(this.f53495h, new View.OnClickListener() { // from class: l.j2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118068a.m78426s0(view);
            }
        });
        bnl0.m105509E0(this.f53492e, null);
        this.f53492e.setFilters(new InputFilter[]{new qcr(30, new x20() { // from class: l.k2m0
            @Override // p153l.x20
            public final void call() {
                this.f123624a.m78434z0();
            }
        })});
        bnl0.m105540X(this.f53491d, bnl0.m105513G0(true));
        this.f53496i.setSelected(true);
    }

    public void setTextBold(View view) {
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m78429t0(BLiveStartPageTemplate bLiveStartPageTemplate, View view, View view2, View view3) {
        BLiveStartPageTemplate bLiveStartPageTemplate2 = this.f53498k;
        if (bLiveStartPageTemplate2 == null || !TextUtils.equals(bLiveStartPageTemplate2.name, bLiveStartPageTemplate.name)) {
            for (int i = 0; i < this.f53494g.getChildCount(); i++) {
                this.f53494g.getChildAt(i).setSelected(false);
                bnl0.m105524M(this.f53494g.getChildAt(i).findViewById(mdc0.f135929F0), false);
                if (view.getId() == this.f53494g.getChildAt(i).getId()) {
                    this.f53498k = bLiveStartPageTemplate;
                }
            }
            view.setSelected(true);
            bnl0.m105524M(view2, true);
            m78431v0(this.f53498k);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m78430u0() {
        TextView textView = this.f53495h;
        textView.setSelected(!textView.isSelected());
        i4g0.m138523u("e_audio_notify_fans", "p_start_audio_room", jyb.m147494Y("switch_type", this.f53495h.isSelected() ? "open" : "close"));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m78431v0(BLiveStartPageTemplate bLiveStartPageTemplate) {
        String str;
        if (bLiveStartPageTemplate == null || jyb.m147479J(bLiveStartPageTemplate.announcements)) {
            return;
        }
        int size = bLiveStartPageTemplate.announcements.size();
        Random random = new Random();
        do {
            str = bLiveStartPageTemplate.announcements.get(random.nextInt(size));
        } while (TextUtils.equals(str, this.f53499l));
        this.f53499l = str;
        this.f53492e.setText(str);
    }

    /* JADX INFO: renamed from: w0 */
    public void m78432w0(List<BLiveStartPageTemplate> list, String str, String str2) {
        boolean zEquals;
        if (jyb.m147479J(list)) {
            return;
        }
        this.f53494g.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            final BLiveStartPageTemplate bLiveStartPageTemplate = list.get(i);
            final View viewInflate = LayoutInflater.from(getContext()).inflate(yec0.f198866O6, (ViewGroup) null);
            viewInflate.setId(View.generateViewId());
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(mdc0.f135886A2);
            VText vText = (VText) viewInflate.findViewById(mdc0.f136162e4);
            final View viewFindViewById = viewInflate.findViewById(mdc0.f135929F0);
            izs.m142868s("context_livingAct", vDraweeView, bLiveStartPageTemplate.icon);
            vText.setText(bLiveStartPageTemplate.name);
            this.f53494g.addView(viewInflate, new ViewGroup.MarginLayoutParams((bnl0.m105592y0() - qa00.m175859d(70.0f)) / 4, qa00.m175859d(86.0f)));
            if (i % 4 != 0) {
                bnl0.m105538V(viewInflate, qa00.m175859d(10.0f));
            }
            if (TextUtils.isEmpty(str)) {
                zEquals = bLiveStartPageTemplate.isDefault;
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                String str3 = bLiveStartPageTemplate.template;
                zEquals = zIsEmpty ? TextUtils.equals(str, str3) : TextUtils.equals(str, str3) && TextUtils.equals(bLiveStartPageTemplate.gameType, str2);
            }
            viewInflate.setSelected(zEquals);
            bnl0.m105524M(viewFindViewById, zEquals);
            if (viewInflate.isSelected()) {
                this.f53498k = bLiveStartPageTemplate;
                m78431v0(bLiveStartPageTemplate);
            }
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.l2m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129783a.m78429t0(bLiveStartPageTemplate, viewInflate, viewFindViewById, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m78433y0(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m78434z0() {
        o1j0.m165651y(xau.m209911u(R$string.f47543G6, 15));
    }

    public VirtualNewPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53499l = "";
    }

    public VirtualNewPreviewView(Context context) {
        super(context);
        this.f53499l = "";
    }
}
