package com.p046p1.mobile.putong.live.livingroom.virtual.preview;

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
import com.p046p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import java.util.Random;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.g5c0;
import p149l.hxs;
import p149l.lsi0;
import p149l.oar;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualNewPreviewView extends ConstraintLayout implements s7m<VoiceVirtualPreviewPresenter> {

    /* JADX INFO: renamed from: d */
    public View f52643d;

    /* JADX INFO: renamed from: e */
    public EditText f52644e;

    /* JADX INFO: renamed from: f */
    public View f52645f;

    /* JADX INFO: renamed from: g */
    public FlowLayout f52646g;

    /* JADX INFO: renamed from: h */
    public TextView f52647h;

    /* JADX INFO: renamed from: i */
    public View f52648i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualPreviewPresenter f52649j;

    /* JADX INFO: renamed from: k */
    public BLiveStartPageTemplate f52650k;

    /* JADX INFO: renamed from: l */
    public String f52651l;

    public VirtualNewPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52651l = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m77240p0(View view) {
        this.f52649j.m77276a4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m77241q0(View view) {
        this.f52649j.m77284o4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m77242r0(View view) {
        m77248v0(this.f52650k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m77243s0(View view) {
        m77247u0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public BLiveStartPageTemplate getCurrentTemplate() {
        if (this.f52650k == null) {
            this.f52650k = BLiveStartPageTemplate.new_();
        }
        return this.f52650k;
    }

    public String getTitle() {
        return this.f52644e.getText().toString().trim();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter) {
        this.f52649j = voiceVirtualPreviewPresenter;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m77245o0() {
        return this.f52647h.isSelected();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52643d = findViewById(g5c0.f101091x0);
        this.f52644e = (EditText) findViewById(g5c0.f100993m1);
        this.f52645f = findViewById(g5c0.f100888b5);
        this.f52646g = (FlowLayout) findViewById(g5c0.f100705H3);
        TextView textView = (TextView) findViewById(g5c0.f100854Y);
        this.f52647h = textView;
        textView.setSelected(true);
        this.f52648i = findViewById(g5c0.f100810T0);
        setTextBold(findViewById(g5c0.f100819U0));
        setTextBold(findViewById(g5c0.f101087w5));
        setTextBold(findViewById(g5c0.f101078v5));
        setTextBold(this.f52644e);
        setTextBold(this.f52648i);
        xdl0.m208329E0(this.f52643d, new View.OnClickListener() { // from class: l.ctl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82488a.m77240p0(view);
            }
        });
        xdl0.m208329E0(this.f52648i, new View.OnClickListener() { // from class: l.dtl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87853a.m77241q0(view);
            }
        });
        xdl0.m208329E0(this.f52645f, new View.OnClickListener() { // from class: l.etl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93158a.m77242r0(view);
            }
        });
        xdl0.m208329E0(this.f52647h, new View.OnClickListener() { // from class: l.ftl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99222a.m77243s0(view);
            }
        });
        xdl0.m208329E0(this.f52644e, null);
        this.f52644e.setFilters(new InputFilter[]{new oar(30, new d30() { // from class: l.gtl0
            @Override // p149l.d30
            public final void call() {
                this.f104323a.m77251z0();
            }
        })});
        xdl0.m208360X(this.f52643d, xdl0.m208333G0(true));
        this.f52648i.setSelected(true);
    }

    public void setTextBold(View view) {
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m77246t0(BLiveStartPageTemplate bLiveStartPageTemplate, View view, View view2, View view3) {
        BLiveStartPageTemplate bLiveStartPageTemplate2 = this.f52650k;
        if (bLiveStartPageTemplate2 == null || !TextUtils.equals(bLiveStartPageTemplate2.name, bLiveStartPageTemplate.name)) {
            for (int i = 0; i < this.f52646g.getChildCount(); i++) {
                this.f52646g.getChildAt(i).setSelected(false);
                xdl0.m208344M(this.f52646g.getChildAt(i).findViewById(g5c0.f100684F0), false);
                if (view.getId() == this.f52646g.getChildAt(i).getId()) {
                    this.f52650k = bLiveStartPageTemplate;
                }
            }
            view.setSelected(true);
            xdl0.m208344M(view2, true);
            m77248v0(this.f52650k);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m77247u0() {
        TextView textView = this.f52647h;
        textView.setSelected(!textView.isSelected());
        zvf0.m220399u("e_audio_notify_fans", "p_start_audio_room", vwb.m200311Y("switch_type", this.f52647h.isSelected() ? "open" : "close"));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77248v0(BLiveStartPageTemplate bLiveStartPageTemplate) {
        String str;
        if (bLiveStartPageTemplate == null || vwb.m200296J(bLiveStartPageTemplate.announcements)) {
            return;
        }
        int size = bLiveStartPageTemplate.announcements.size();
        Random random = new Random();
        do {
            str = bLiveStartPageTemplate.announcements.get(random.nextInt(size));
        } while (TextUtils.equals(str, this.f52651l));
        this.f52651l = str;
        this.f52644e.setText(str);
    }

    /* JADX INFO: renamed from: w0 */
    public void m77249w0(List<BLiveStartPageTemplate> list, String str, String str2) {
        boolean zEquals;
        if (vwb.m200296J(list)) {
            return;
        }
        this.f52646g.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            final BLiveStartPageTemplate bLiveStartPageTemplate = list.get(i);
            final View viewInflate = LayoutInflater.from(getContext()).inflate(t6c0.f168134O6, (ViewGroup) null);
            viewInflate.setId(View.generateViewId());
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(g5c0.f100641A2);
            VText vText = (VText) viewInflate.findViewById(g5c0.f100917e4);
            final View viewFindViewById = viewInflate.findViewById(g5c0.f100684F0);
            hxs.m133406s("context_livingAct", vDraweeView, bLiveStartPageTemplate.icon);
            vText.setText(bLiveStartPageTemplate.name);
            this.f52646g.addView(viewInflate, new ViewGroup.MarginLayoutParams((xdl0.m208412y0() - t100.m186890d(70.0f)) / 4, t100.m186890d(86.0f)));
            if (i % 4 != 0) {
                xdl0.m208358V(viewInflate, t100.m186890d(10.0f));
            }
            if (TextUtils.isEmpty(str)) {
                zEquals = bLiveStartPageTemplate.isDefault;
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                String str3 = bLiveStartPageTemplate.template;
                zEquals = zIsEmpty ? TextUtils.equals(str, str3) : TextUtils.equals(str, str3) && TextUtils.equals(bLiveStartPageTemplate.gameType, str2);
            }
            viewInflate.setSelected(zEquals);
            xdl0.m208344M(viewFindViewById, zEquals);
            if (viewInflate.isSelected()) {
                this.f52650k = bLiveStartPageTemplate;
                m77248v0(bLiveStartPageTemplate);
            }
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.htl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109397a.m77246t0(bLiveStartPageTemplate, viewInflate, viewFindViewById, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m77250y0(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m77251z0() {
        lsi0.m151595y(w8u.m202218u(R$string.f46695G6, 15));
    }

    public VirtualNewPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52651l = "";
    }

    public VirtualNewPreviewView(Context context) {
        super(context);
        this.f52651l = "";
    }
}
