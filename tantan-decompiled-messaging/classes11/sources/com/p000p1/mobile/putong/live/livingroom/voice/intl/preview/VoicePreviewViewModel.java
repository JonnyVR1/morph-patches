package com.p000p1.mobile.putong.live.livingroom.voice.intl.preview;

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
import com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.floatview.VoicePreviewFlowItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import com.p1.mobile.putong.live.base.data.BLiveVoiceMutexMode;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.d8c0;
import l.f2s;
import l.h1c0;
import l.i3c0;
import l.lsi0;
import l.oar;
import l.q9o0;
import l.s7m;
import l.t100;
import l.t6c0;
import l.vwb;
import l.xdl0;
import org.apmem.tools.layouts.FlowLayout;
import p009l.c9o0;
import p009l.ypv;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoicePreviewViewModel extends RelativeLayout implements s7m<c9o0>, TextWatcher {

    /* JADX INFO: renamed from: D */
    public static int f6951D = 16;

    /* JADX INFO: renamed from: A */
    public BLiveVoiceModelDescribe f6952A;

    /* JADX INFO: renamed from: B */
    public f2s f6953B;

    /* JADX INFO: renamed from: C */
    public String f6954C;

    /* JADX INFO: renamed from: a */
    public VoicePreviewViewModel f6955a;

    /* JADX INFO: renamed from: b */
    public VRelative f6956b;

    /* JADX INFO: renamed from: c */
    public ImageView f6957c;

    /* JADX INFO: renamed from: d */
    public VText f6958d;

    /* JADX INFO: renamed from: e */
    public VText f6959e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f6960f;

    /* JADX INFO: renamed from: g */
    public VEditText f6961g;

    /* JADX INFO: renamed from: h */
    public VEditText f6962h;

    /* JADX INFO: renamed from: i */
    public VText f6963i;

    /* JADX INFO: renamed from: j */
    public VText f6964j;

    /* JADX INFO: renamed from: k */
    public VText f6965k;

    /* JADX INFO: renamed from: l */
    public VScroll f6966l;

    /* JADX INFO: renamed from: m */
    public FlowLayout f6967m;

    /* JADX INFO: renamed from: n */
    public VLinear f6968n;

    /* JADX INFO: renamed from: o */
    public VImage f6969o;

    /* JADX INFO: renamed from: p */
    public VLinear f6970p;

    /* JADX INFO: renamed from: q */
    public VText f6971q;

    /* JADX INFO: renamed from: r */
    public VLinear f6972r;

    /* JADX INFO: renamed from: s */
    public TextView f6973s;

    /* JADX INFO: renamed from: t */
    public TextView f6974t;

    /* JADX INFO: renamed from: u */
    public c9o0 f6975u;

    /* JADX INFO: renamed from: v */
    public boolean f6976v;

    /* JADX INFO: renamed from: w */
    public boolean f6977w;

    /* JADX INFO: renamed from: x */
    public boolean f6978x;

    /* JADX INFO: renamed from: y */
    public Animator f6979y;

    /* JADX INFO: renamed from: z */
    public VoicePreviewFlowItemView f6980z;

    public VoicePreviewViewModel(Context context) {
        super(context);
        this.f6976v = true;
        this.f6977w = false;
        this.f6978x = false;
        this.f6979y = null;
        this.f6952A = null;
        this.f6953B = null;
    }

    /* JADX INFO: renamed from: C */
    private void m8554C() {
        this.f6961g.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.m9o0
            public final void call() {
                this.f16777a.m8574z();
            }
        })});
        this.f6962h.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.m9o0
            public final void call() {
                this.f16777a.m8574z();
            }
        })});
        this.f6961g.addTextChangedListener(this);
        this.f6962h.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m8555J(View view) {
        this.f6975u.m12443c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m8556K(View view) {
        m8560T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m8557L(View view) {
        m8595b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m8558M(View view) {
        m8594a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m8559N(View view) {
        m8593Z();
    }

    /* JADX INFO: renamed from: T */
    private void m8560T() {
        if (this.f6978x) {
            if (TextUtils.isEmpty(getTitle())) {
                lsi0.w(R.string.yi);
                return;
            }
        } else if (TextUtils.isEmpty(getTitle())) {
            act().dialog().D(R.string.Di).l0(R.string.Ci, new Runnable() { // from class: l.n9o0
                @Override // java.lang.Runnable
                public final void run() {
                    VoicePreviewViewModel.m8569k();
                }
            }).t0(R.string.y5, new Runnable() { // from class: l.o9o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17884a.m8584P();
                }
            }).B(false).z0();
            return;
        }
        this.f6975u.m12456r4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8569k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m8574z() {
        lsi0.y(ypv.f23200e.getString(R.string.G6, Integer.valueOf(f6951D)));
    }

    /* JADX INFO: renamed from: A */
    public final void m8575A(boolean z, String str) {
        this.f6977w = z;
        VText vText = this.f6963i;
        if (!z) {
            vText.setVisibility(8);
            this.f6964j.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f6964j.setVisibility(0);
            this.f6964j.setSelected(false);
            this.f6964j.setText(str);
        }
    }

    /* JADX INFO: renamed from: B */
    public final View m8576B(ViewGroup viewGroup) {
        return act().inflater().inflate(t6c0.ba, viewGroup, false);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8577C0() {
        return this.f6975u.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m8578E(List<BLiveVoiceMutexMode> list) {
        this.f6970p.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            BLiveVoiceMutexMode bLiveVoiceMutexMode = list.get(i);
            TextView textViewM8606y = m8606y(bLiveVoiceMutexMode);
            if (i == 0) {
                textViewM8606y.setSelected(true);
                this.f6954C = bLiveVoiceMutexMode.key;
            }
            this.f6970p.addView(textViewM8606y);
        }
        xdl0.E0(this.f6969o, new View.OnClickListener() { // from class: l.e9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12461a.m8582I(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public boolean m8579F() {
        return this.f6973s.isSelected();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8580G(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m8587S(voicePreviewFlowItemView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m8581H(TextView textView, View view) {
        this.f6954C = (String) textView.getTag();
        m8588U(textView);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m8582I(View view) {
        m8596c0();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m8583O() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6966l.getLayoutParams();
        int iW0 = (xdl0.w0() - this.f6956b.getMeasuredHeight()) - t100.d(247.0f);
        if (iW0 < t100.d(155.0f)) {
            if (iW0 < 0) {
                iW0 = 0;
            }
            layoutParams.height = iW0;
        } else {
            layoutParams.height = t100.d(155.0f);
        }
        this.f6966l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m8584P() {
        this.f6975u.m12456r4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8585Q() {
        if (NullChecker.a(this.f6953B)) {
            this.f6953B.dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m8586R() {
        return this.f6974t.isSelected();
    }

    /* JADX INFO: renamed from: S */
    public final void m8587S(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic) {
        VoicePreviewFlowItemView voicePreviewFlowItemView2 = this.f6980z;
        if (voicePreviewFlowItemView2 == null) {
            voicePreviewFlowItemView.setSelected(true);
            this.f6980z = voicePreviewFlowItemView;
        } else if (voicePreviewFlowItemView2 != voicePreviewFlowItemView) {
            voicePreviewFlowItemView2.setSelected(false);
            voicePreviewFlowItemView.setSelected(true);
            this.f6980z = voicePreviewFlowItemView;
        } else {
            voicePreviewFlowItemView.setSelected(!voicePreviewFlowItemView.isSelected());
        }
        c9o0 c9o0Var = this.f6975u;
        if (!voicePreviewFlowItemView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        c9o0Var.m12457s4(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: U */
    public final void m8588U(View view) {
        for (int i = 0; i < this.f6970p.getChildCount(); i++) {
            View childAt = this.f6970p.getChildAt(i);
            childAt.setSelected(childAt == view);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m8589V(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f6974t.setSelected(bLiveVoiceRoom.maskMode);
        m8575A(bLiveVoiceRoom.useLastTitle && !TextUtils.isEmpty(((BLiveAbsRoom) bLiveVoiceRoom).title), ((BLiveAbsRoom) bLiveVoiceRoom).title);
    }

    /* JADX INFO: renamed from: W */
    public void m8590W(boolean z) {
        xdl0.M(this, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m8591X() {
        act().getWindow().setSoftInputMode(51);
    }

    /* JADX INFO: renamed from: Y */
    public void m8592Y(List<BLiveVoiceTopic> list, boolean z, List<BLiveVoiceMutexMode> list2, BLiveVoiceModelDescribe bLiveVoiceModelDescribe) {
        m8603v(list);
        if (!vwb.J(list2)) {
            m8578E(list2);
        }
        this.f6978x = z;
        m8604w();
        xdl0.M(this.f6974t, ypv.f23196a.m23656g());
        xdl0.M(this.f6968n, !vwb.J(list2));
        this.f6952A = bLiveVoiceModelDescribe;
    }

    /* JADX INFO: renamed from: Z */
    public final void m8593Z() {
        if (getTitle().equals(this.f6964j.getText().toString())) {
            return;
        }
        setTitle(this.f6964j.getText().toString());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m8594a0() {
        TextView textView = this.f6974t;
        textView.setSelected(!textView.isSelected());
        this.f6975u.m12459v4(this.f6974t.isSelected());
    }

    @Nullable
    public Act act() {
        return this.f6975u.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m8604w();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8595b0() {
        TextView textView = this.f6973s;
        textView.setSelected(!textView.isSelected());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: c0 */
    public void m8596c0() {
        if (this.f6953B == null) {
            VoiceMicHelpDialogView voiceMicHelpDialogView = (VoiceMicHelpDialogView) LayoutInflater.from(act()).inflate(t6c0.S9, (ViewGroup) null);
            voiceMicHelpDialogView.m8553c(this.f6952A, new d30() { // from class: l.g9o0
                public final void call() {
                    this.f13387a.m8585Q();
                }
            });
            f2s f2sVar = new f2s(this.f6975u, voiceMicHelpDialogView);
            this.f6953B = f2sVar;
            f2sVar.setCanceledOnTouchOutside(false);
            this.f6953B.setCancelable(false);
            this.f6953B.c0(d8c0.a);
        }
        this.f6953B.show();
    }

    /* JADX INFO: renamed from: d0 */
    public void m8597d0() {
        m8591X();
        m8605x();
    }

    public void destroy() {
    }

    public String getSelectedModel() {
        return this.f6954C;
    }

    public String getTitle() {
        return (this.f6976v ? this.f6961g : this.f6962h).getText().toString().trim();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f6979y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f6979y.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8599q(this);
        m8600r();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: q */
    public final void m8599q(View view) {
        q9o0.a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m8600r() {
        xdl0.X(this.f6957c, xdl0.F0());
        this.f6973s.setSelected(true);
        xdl0.E0(this.f6957c, new View.OnClickListener() { // from class: l.d9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11682a.m8555J(view);
            }
        });
        xdl0.E0(this.f6971q, new View.OnClickListener() { // from class: l.h9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13915a.m8556K(view);
            }
        });
        xdl0.E0(this.f6973s, new View.OnClickListener() { // from class: l.i9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14449a.m8557L(view);
            }
        });
        xdl0.E0(this.f6974t, new View.OnClickListener() { // from class: l.j9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15021a.m8558M(view);
            }
        });
        xdl0.E0(this.f6964j, new View.OnClickListener() { // from class: l.k9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15562a.m8559N(view);
            }
        });
        this.f6963i.setText(ypv.f23200e.getString(R.string.zi) + ":");
        this.f6965k.setText(ypv.f23200e.getString(R.string.Bi) + ":");
        this.f6961g.setAlpha(1.0f);
        xdl0.M(this.f6961g, true);
        m8554C();
        post(new Runnable() { // from class: l.l9o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16030a.m8583O();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m8601s() {
        act().getWindow().setSoftInputMode(32);
    }

    public void setTitle(String str) {
        VEditText vEditText = this.f6976v ? this.f6961g : this.f6962h;
        vEditText.setText(str);
        vEditText.setSelection(vEditText.length());
        vEditText.requestFocus();
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m8598i1(c9o0 c9o0Var) {
        this.f6975u = c9o0Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m8603v(List<BLiveVoiceTopic> list) {
        boolean zJ = vwb.J(list);
        VText vText = this.f6965k;
        if (zJ) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f6967m.removeAllViews();
        for (final BLiveVoiceTopic bLiveVoiceTopic : list) {
            final VoicePreviewFlowItemView voicePreviewFlowItemView = (VoicePreviewFlowItemView) m8576B(this.f6967m);
            voicePreviewFlowItemView.setOnClickListener(new View.OnClickListener() { // from class: l.p9o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18436a.m8580G(voicePreviewFlowItemView, bLiveVoiceTopic, view);
                }
            });
            voicePreviewFlowItemView.setData(bLiveVoiceTopic);
            this.f6967m.addView(voicePreviewFlowItemView);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m8604w() {
        if (!this.f6978x) {
            this.f6971q.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(getTitle());
        VText vText = this.f6971q;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8605x() {
        this.f6961g.addOnLayoutChangeListener(null);
    }

    /* JADX INFO: renamed from: y */
    public final TextView m8606y(BLiveVoiceMutexMode bLiveVoiceMutexMode) {
        int i;
        final TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(14.0f);
        textView.setTextColor(getContext().getResources().getColor(h1c0.e1));
        Drawable drawable = getResources().getDrawable(i3c0.Y6);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setCompoundDrawablePadding(t100.d(8.0f));
        xdl0.W(textView, t100.d(23.0f));
        textView.setTag(bLiveVoiceMutexMode.key);
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoiceMutexMode.key)) {
            i = 9;
        } else if (BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(bLiveVoiceMutexMode.key)) {
            i = 3;
        } else {
            i = BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(bLiveVoiceMutexMode.key) ? 5 : 10;
        }
        textView.setText(String.format(getResources().getString(R.string.Zi), i + ""));
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.f9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12881a.m8581H(textView, view);
            }
        });
        return textView;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6976v = true;
        this.f6977w = false;
        this.f6978x = false;
        this.f6979y = null;
        this.f6952A = null;
        this.f6953B = null;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6976v = true;
        this.f6977w = false;
        this.f6978x = false;
        this.f6979y = null;
        this.f6952A = null;
        this.f6953B = null;
    }
}
