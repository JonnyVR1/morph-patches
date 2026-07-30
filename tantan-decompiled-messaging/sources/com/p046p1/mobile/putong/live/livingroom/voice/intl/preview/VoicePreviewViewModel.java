package com.p046p1.mobile.putong.live.livingroom.voice.intl.preview;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMutexMode;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.floatview.VoicePreviewFlowItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;
import p149l.c9o0;
import p149l.d30;
import p149l.d8c0;
import p149l.f2s;
import p149l.h1c0;
import p149l.i3c0;
import p149l.lsi0;
import p149l.oar;
import p149l.q9o0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoicePreviewViewModel extends RelativeLayout implements s7m<c9o0>, TextWatcher {

    /* JADX INFO: renamed from: D */
    public static int f53345D = 16;

    /* JADX INFO: renamed from: A */
    public BLiveVoiceModelDescribe f53346A;

    /* JADX INFO: renamed from: B */
    public f2s f53347B;

    /* JADX INFO: renamed from: C */
    public String f53348C;

    /* JADX INFO: renamed from: a */
    public VoicePreviewViewModel f53349a;

    /* JADX INFO: renamed from: b */
    public VRelative f53350b;

    /* JADX INFO: renamed from: c */
    public ImageView f53351c;

    /* JADX INFO: renamed from: d */
    public VText f53352d;

    /* JADX INFO: renamed from: e */
    public VText f53353e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f53354f;

    /* JADX INFO: renamed from: g */
    public VEditText f53355g;

    /* JADX INFO: renamed from: h */
    public VEditText f53356h;

    /* JADX INFO: renamed from: i */
    public VText f53357i;

    /* JADX INFO: renamed from: j */
    public VText f53358j;

    /* JADX INFO: renamed from: k */
    public VText f53359k;

    /* JADX INFO: renamed from: l */
    public VScroll f53360l;

    /* JADX INFO: renamed from: m */
    public FlowLayout f53361m;

    /* JADX INFO: renamed from: n */
    public VLinear f53362n;

    /* JADX INFO: renamed from: o */
    public VImage f53363o;

    /* JADX INFO: renamed from: p */
    public VLinear f53364p;

    /* JADX INFO: renamed from: q */
    public VText f53365q;

    /* JADX INFO: renamed from: r */
    public VLinear f53366r;

    /* JADX INFO: renamed from: s */
    public TextView f53367s;

    /* JADX INFO: renamed from: t */
    public TextView f53368t;

    /* JADX INFO: renamed from: u */
    public c9o0 f53369u;

    /* JADX INFO: renamed from: v */
    public boolean f53370v;

    /* JADX INFO: renamed from: w */
    public boolean f53371w;

    /* JADX INFO: renamed from: x */
    public boolean f53372x;

    /* JADX INFO: renamed from: y */
    public Animator f53373y;

    /* JADX INFO: renamed from: z */
    public VoicePreviewFlowItemView f53374z;

    public VoicePreviewViewModel(Context context) {
        super(context);
        this.f53370v = true;
        this.f53371w = false;
        this.f53372x = false;
        this.f53373y = null;
        this.f53346A = null;
        this.f53347B = null;
    }

    /* JADX INFO: renamed from: C */
    private void m78355C() {
        this.f53355g.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.m9o0
            @Override // p149l.d30
            public final void call() {
                this.f132787a.m78375z();
            }
        })});
        this.f53356h.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.m9o0
            @Override // p149l.d30
            public final void call() {
                this.f132787a.m78375z();
            }
        })});
        this.f53355g.addTextChangedListener(this);
        this.f53356h.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m78356J(View view) {
        this.f53369u.m105877c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m78357K(View view) {
        m78361T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m78358L(View view) {
        m78395b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m78359M(View view) {
        m78394a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m78360N(View view) {
        m78393Z();
    }

    /* JADX INFO: renamed from: T */
    private void m78361T() {
        if (this.f53372x) {
            if (TextUtils.isEmpty(getTitle())) {
                lsi0.m151593w(R$string.f47659yi);
                return;
            }
        } else if (TextUtils.isEmpty(getTitle())) {
            act().dialog().m20500D(R$string.f46641Di).m20542l0(R$string.f46619Ci, new Runnable() { // from class: l.n9o0
                @Override // java.lang.Runnable
                public final void run() {
                    VoicePreviewViewModel.m78370k();
                }
            }).m20556t0(R$string.f47646y5, new Runnable() { // from class: l.o9o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f142731a.m78384P();
                }
            }).m20496B(false).m20568z0();
            return;
        }
        this.f53369u.m105890r4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m78370k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m78375z() {
        lsi0.m151595y(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(f53345D)));
    }

    /* JADX INFO: renamed from: A */
    public final void m78376A(boolean z, String str) {
        this.f53371w = z;
        VText vText = this.f53357i;
        if (!z) {
            vText.setVisibility(8);
            this.f53358j.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f53358j.setVisibility(0);
            this.f53358j.setSelected(false);
            this.f53358j.setText(str);
        }
    }

    /* JADX INFO: renamed from: B */
    public final View m78377B(ViewGroup viewGroup) {
        return act().inflater().inflate(t6c0.f168295ba, viewGroup, false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f53369u.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m78378E(List<BLiveVoiceMutexMode> list) {
        this.f53364p.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            BLiveVoiceMutexMode bLiveVoiceMutexMode = list.get(i);
            TextView textViewM78405y = m78405y(bLiveVoiceMutexMode);
            if (i == 0) {
                textViewM78405y.setSelected(true);
                this.f53348C = bLiveVoiceMutexMode.key;
            }
            this.f53364p.addView(textViewM78405y);
        }
        xdl0.m208329E0(this.f53363o, new View.OnClickListener() { // from class: l.e9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90113a.m78382I(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public boolean m78379F() {
        return this.f53367s.isSelected();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m78380G(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m78387S(voicePreviewFlowItemView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m78381H(TextView textView, View view) {
        this.f53348C = (String) textView.getTag();
        m78388U(textView);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m78382I(View view) {
        m78396c0();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m78383O() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f53360l.getLayoutParams();
        int iM208408w0 = (xdl0.m208408w0() - this.f53350b.getMeasuredHeight()) - t100.m186890d(247.0f);
        if (iM208408w0 < t100.m186890d(155.0f)) {
            if (iM208408w0 < 0) {
                iM208408w0 = 0;
            }
            layoutParams.height = iM208408w0;
        } else {
            layoutParams.height = t100.m186890d(155.0f);
        }
        this.f53360l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m78384P() {
        this.f53369u.m105890r4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m78385Q() {
        if (NullChecker.m81303a(this.f53347B)) {
            this.f53347B.dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m78386R() {
        return this.f53368t.isSelected();
    }

    /* JADX INFO: renamed from: S */
    public final void m78387S(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic) {
        VoicePreviewFlowItemView voicePreviewFlowItemView2 = this.f53374z;
        if (voicePreviewFlowItemView2 == null) {
            voicePreviewFlowItemView.setSelected(true);
            this.f53374z = voicePreviewFlowItemView;
        } else if (voicePreviewFlowItemView2 != voicePreviewFlowItemView) {
            voicePreviewFlowItemView2.setSelected(false);
            voicePreviewFlowItemView.setSelected(true);
            this.f53374z = voicePreviewFlowItemView;
        } else {
            voicePreviewFlowItemView.setSelected(!voicePreviewFlowItemView.isSelected());
        }
        c9o0 c9o0Var = this.f53369u;
        if (!voicePreviewFlowItemView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        c9o0Var.m105891s4(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: U */
    public final void m78388U(View view) {
        for (int i = 0; i < this.f53364p.getChildCount(); i++) {
            View childAt = this.f53364p.getChildAt(i);
            childAt.setSelected(childAt == view);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m78389V(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f53368t.setSelected(bLiveVoiceRoom.maskMode);
        m78376A(bLiveVoiceRoom.useLastTitle && !TextUtils.isEmpty(bLiveVoiceRoom.title), bLiveVoiceRoom.title);
    }

    /* JADX INFO: renamed from: W */
    public void m78390W(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m78391X() {
        act().getWindow().setSoftInputMode(51);
    }

    /* JADX INFO: renamed from: Y */
    public void m78392Y(List<BLiveVoiceTopic> list, boolean z, List<BLiveVoiceMutexMode> list2, BLiveVoiceModelDescribe bLiveVoiceModelDescribe) {
        m78402v(list);
        if (!vwb.m200296J(list2)) {
            m78378E(list2);
        }
        this.f53372x = z;
        m78403w();
        xdl0.m208344M(this.f53368t, ypv.f199493a.m199346g());
        xdl0.m208344M(this.f53362n, !vwb.m200296J(list2));
        this.f53346A = bLiveVoiceModelDescribe;
    }

    /* JADX INFO: renamed from: Z */
    public final void m78393Z() {
        if (getTitle().equals(this.f53358j.getText().toString())) {
            return;
        }
        setTitle(this.f53358j.getText().toString());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m78394a0() {
        TextView textView = this.f53368t;
        textView.setSelected(!textView.isSelected());
        this.f53369u.m105893v4(this.f53368t.isSelected());
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f53369u.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m78403w();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m78395b0() {
        TextView textView = this.f53367s;
        textView.setSelected(!textView.isSelected());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: c0 */
    public void m78396c0() {
        if (this.f53347B == null) {
            VoiceMicHelpDialogView voiceMicHelpDialogView = (VoiceMicHelpDialogView) LayoutInflater.from(act()).inflate(t6c0.f168185S9, (ViewGroup) null);
            voiceMicHelpDialogView.m78354c(this.f53346A, new d30() { // from class: l.g9o0
                @Override // p149l.d30
                public final void call() {
                    this.f101582a.m78385Q();
                }
            });
            f2s f2sVar = new f2s(this.f53369u, voiceMicHelpDialogView);
            this.f53347B = f2sVar;
            f2sVar.setCanceledOnTouchOutside(false);
            this.f53347B.setCancelable(false);
            this.f53347B.m71771c0(d8c0.f84846a);
        }
        this.f53347B.show();
    }

    /* JADX INFO: renamed from: d0 */
    public void m78397d0() {
        m78391X();
        m78404x();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public String getSelectedModel() {
        return this.f53348C;
    }

    public String getTitle() {
        return (this.f53370v ? this.f53355g : this.f53356h).getText().toString().trim();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f53373y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f53373y.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78398q(this);
        m78399r();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: q */
    public final void m78398q(View view) {
        q9o0.m173660a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m78399r() {
        xdl0.m208360X(this.f53351c, xdl0.m208331F0());
        this.f53367s.setSelected(true);
        xdl0.m208329E0(this.f53351c, new View.OnClickListener() { // from class: l.d9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85136a.m78356J(view);
            }
        });
        xdl0.m208329E0(this.f53365q, new View.OnClickListener() { // from class: l.h9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106619a.m78357K(view);
            }
        });
        xdl0.m208329E0(this.f53367s, new View.OnClickListener() { // from class: l.i9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112243a.m78358L(view);
            }
        });
        xdl0.m208329E0(this.f53368t, new View.OnClickListener() { // from class: l.j9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116944a.m78359M(view);
            }
        });
        xdl0.m208329E0(this.f53358j, new View.OnClickListener() { // from class: l.k9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122054a.m78360N(view);
            }
        });
        this.f53357i.setText(ypv.f199497e.getString(R$string.f47681zi) + ":");
        this.f53359k.setText(ypv.f199497e.getString(R$string.f46597Bi) + ":");
        this.f53355g.setAlpha(1.0f);
        xdl0.m208344M(this.f53355g, true);
        m78355C();
        post(new Runnable() { // from class: l.l9o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127133a.m78383O();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m78400s() {
        act().getWindow().setSoftInputMode(32);
    }

    public void setTitle(String str) {
        VEditText vEditText = this.f53370v ? this.f53355g : this.f53356h;
        vEditText.setText(str);
        vEditText.setSelection(vEditText.length());
        vEditText.requestFocus();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c9o0 c9o0Var) {
        this.f53369u = c9o0Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m78402v(List<BLiveVoiceTopic> list) {
        boolean zM200296J = vwb.m200296J(list);
        VText vText = this.f53359k;
        if (zM200296J) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f53361m.removeAllViews();
        for (final BLiveVoiceTopic bLiveVoiceTopic : list) {
            final VoicePreviewFlowItemView voicePreviewFlowItemView = (VoicePreviewFlowItemView) m78377B(this.f53361m);
            voicePreviewFlowItemView.setOnClickListener(new View.OnClickListener() { // from class: l.p9o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147778a.m78380G(voicePreviewFlowItemView, bLiveVoiceTopic, view);
                }
            });
            voicePreviewFlowItemView.setData(bLiveVoiceTopic);
            this.f53361m.addView(voicePreviewFlowItemView);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m78403w() {
        if (!this.f53372x) {
            this.f53365q.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(getTitle());
        VText vText = this.f53365q;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m78404x() {
        this.f53355g.addOnLayoutChangeListener(null);
    }

    /* JADX INFO: renamed from: y */
    public final TextView m78405y(BLiveVoiceMutexMode bLiveVoiceMutexMode) {
        int i;
        final TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(14.0f);
        textView.setTextColor(getContext().getResources().getColor(h1c0.f105362e1));
        Drawable drawable = getResources().getDrawable(i3c0.f110922Y6);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setCompoundDrawablePadding(t100.m186890d(8.0f));
        xdl0.m208359W(textView, t100.m186890d(23.0f));
        textView.setTag(bLiveVoiceMutexMode.key);
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoiceMutexMode.key)) {
            i = 9;
        } else if (BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(bLiveVoiceMutexMode.key)) {
            i = 3;
        } else {
            i = BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(bLiveVoiceMutexMode.key) ? 5 : 10;
        }
        textView.setText(String.format(getResources().getString(R$string.f47111Zi), i + ""));
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.f9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96498a.m78381H(textView, view);
            }
        });
        return textView;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53370v = true;
        this.f53371w = false;
        this.f53372x = false;
        this.f53373y = null;
        this.f53346A = null;
        this.f53347B = null;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53370v = true;
        this.f53371w = false;
        this.f53372x = false;
        this.f53373y = null;
        this.f53346A = null;
        this.f53347B = null;
    }
}
