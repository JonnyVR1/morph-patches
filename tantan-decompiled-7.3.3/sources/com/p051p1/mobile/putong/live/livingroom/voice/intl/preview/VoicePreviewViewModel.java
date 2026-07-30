package com.p051p1.mobile.putong.live.livingroom.voice.intl.preview;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMutexMode;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.floatview.VoicePreviewFlowItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;
import p153l.bnl0;
import p153l.g4s;
import p153l.gio0;
import p153l.iam;
import p153l.jgc0;
import p153l.jyb;
import p153l.n9c0;
import p153l.o1j0;
import p153l.obc0;
import p153l.qa00;
import p153l.qcr;
import p153l.uio0;
import p153l.x20;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoicePreviewViewModel extends RelativeLayout implements iam<gio0>, TextWatcher {

    /* JADX INFO: renamed from: D */
    public static int f54193D = 16;

    /* JADX INFO: renamed from: A */
    public BLiveVoiceModelDescribe f54194A;

    /* JADX INFO: renamed from: B */
    public g4s f54195B;

    /* JADX INFO: renamed from: C */
    public String f54196C;

    /* JADX INFO: renamed from: a */
    public VoicePreviewViewModel f54197a;

    /* JADX INFO: renamed from: b */
    public VRelative f54198b;

    /* JADX INFO: renamed from: c */
    public ImageView f54199c;

    /* JADX INFO: renamed from: d */
    public VText f54200d;

    /* JADX INFO: renamed from: e */
    public VText f54201e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54202f;

    /* JADX INFO: renamed from: g */
    public VEditText f54203g;

    /* JADX INFO: renamed from: h */
    public VEditText f54204h;

    /* JADX INFO: renamed from: i */
    public VText f54205i;

    /* JADX INFO: renamed from: j */
    public VText f54206j;

    /* JADX INFO: renamed from: k */
    public VText f54207k;

    /* JADX INFO: renamed from: l */
    public VScroll f54208l;

    /* JADX INFO: renamed from: m */
    public FlowLayout f54209m;

    /* JADX INFO: renamed from: n */
    public VLinear f54210n;

    /* JADX INFO: renamed from: o */
    public VImage f54211o;

    /* JADX INFO: renamed from: p */
    public VLinear f54212p;

    /* JADX INFO: renamed from: q */
    public VText f54213q;

    /* JADX INFO: renamed from: r */
    public VLinear f54214r;

    /* JADX INFO: renamed from: s */
    public TextView f54215s;

    /* JADX INFO: renamed from: t */
    public TextView f54216t;

    /* JADX INFO: renamed from: u */
    public gio0 f54217u;

    /* JADX INFO: renamed from: v */
    public boolean f54218v;

    /* JADX INFO: renamed from: w */
    public boolean f54219w;

    /* JADX INFO: renamed from: x */
    public boolean f54220x;

    /* JADX INFO: renamed from: y */
    public Animator f54221y;

    /* JADX INFO: renamed from: z */
    public VoicePreviewFlowItemView f54222z;

    public VoicePreviewViewModel(Context context) {
        super(context);
        this.f54218v = true;
        this.f54219w = false;
        this.f54220x = false;
        this.f54221y = null;
        this.f54194A = null;
        this.f54195B = null;
    }

    /* JADX INFO: renamed from: C */
    private void m79538C() {
        this.f54203g.setFilters(new InputFilter[]{new qcr(32, new x20() { // from class: l.qio0
            @Override // p153l.x20
            public final void call() {
                this.f157853a.m79558z();
            }
        })});
        this.f54204h.setFilters(new InputFilter[]{new qcr(32, new x20() { // from class: l.qio0
            @Override // p153l.x20
            public final void call() {
                this.f157853a.m79558z();
            }
        })});
        this.f54203g.addTextChangedListener(this);
        this.f54204h.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m79539J(View view) {
        this.f54217u.m130362c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m79540K(View view) {
        m79544T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m79541L(View view) {
        m79578b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m79542M(View view) {
        m79577a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m79543N(View view) {
        m79576Z();
    }

    /* JADX INFO: renamed from: T */
    private void m79544T() {
        if (this.f54220x) {
            if (TextUtils.isEmpty(getTitle())) {
                o1j0.m165649w(R$string.f48507yi);
                return;
            }
        } else if (TextUtils.isEmpty(getTitle())) {
            act().dialog().m21499D(R$string.f47489Di).m21541l0(R$string.f47467Ci, new Runnable() { // from class: l.rio0
                @Override // java.lang.Runnable
                public final void run() {
                    VoicePreviewViewModel.m79553k();
                }
            }).m21555t0(R$string.f48494y5, new Runnable() { // from class: l.sio0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168857a.m79567P();
                }
            }).m21495B(false).m21567z0();
            return;
        }
        this.f54217u.m130375r4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79553k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m79558z() {
        o1j0.m165651y(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(f54193D)));
    }

    /* JADX INFO: renamed from: A */
    public final void m79559A(boolean z, String str) {
        this.f54219w = z;
        VText vText = this.f54205i;
        if (!z) {
            vText.setVisibility(8);
            this.f54206j.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f54206j.setVisibility(0);
            this.f54206j.setSelected(false);
            this.f54206j.setText(str);
        }
    }

    /* JADX INFO: renamed from: B */
    public final View m79560B(ViewGroup viewGroup) {
        return act().inflater().inflate(yec0.f199027ba, viewGroup, false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f54217u.act();
    }

    /* JADX INFO: renamed from: E */
    public final void m79561E(List<BLiveVoiceMutexMode> list) {
        this.f54212p.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            BLiveVoiceMutexMode bLiveVoiceMutexMode = list.get(i);
            TextView textViewM79588y = m79588y(bLiveVoiceMutexMode);
            if (i == 0) {
                textViewM79588y.setSelected(true);
                this.f54196C = bLiveVoiceMutexMode.key;
            }
            this.f54212p.addView(textViewM79588y);
        }
        bnl0.m105509E0(this.f54211o, new View.OnClickListener() { // from class: l.iio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115112a.m79565I(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public boolean m79562F() {
        return this.f54215s.isSelected();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m79563G(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m79570S(voicePreviewFlowItemView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m79564H(TextView textView, View view) {
        this.f54196C = (String) textView.getTag();
        m79571U(textView);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m79565I(View view) {
        m79579c0();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m79566O() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54208l.getLayoutParams();
        int iM105588w0 = (bnl0.m105588w0() - this.f54198b.getMeasuredHeight()) - qa00.m175859d(247.0f);
        if (iM105588w0 < qa00.m175859d(155.0f)) {
            if (iM105588w0 < 0) {
                iM105588w0 = 0;
            }
            layoutParams.height = iM105588w0;
        } else {
            layoutParams.height = qa00.m175859d(155.0f);
        }
        this.f54208l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m79567P() {
        this.f54217u.m130375r4();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m79568Q() {
        if (NullChecker.m82486a(this.f54195B)) {
            this.f54195B.dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m79569R() {
        return this.f54216t.isSelected();
    }

    /* JADX INFO: renamed from: S */
    public final void m79570S(VoicePreviewFlowItemView voicePreviewFlowItemView, BLiveVoiceTopic bLiveVoiceTopic) {
        VoicePreviewFlowItemView voicePreviewFlowItemView2 = this.f54222z;
        if (voicePreviewFlowItemView2 == null) {
            voicePreviewFlowItemView.setSelected(true);
            this.f54222z = voicePreviewFlowItemView;
        } else if (voicePreviewFlowItemView2 != voicePreviewFlowItemView) {
            voicePreviewFlowItemView2.setSelected(false);
            voicePreviewFlowItemView.setSelected(true);
            this.f54222z = voicePreviewFlowItemView;
        } else {
            voicePreviewFlowItemView.setSelected(!voicePreviewFlowItemView.isSelected());
        }
        gio0 gio0Var = this.f54217u;
        if (!voicePreviewFlowItemView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        gio0Var.m130376s4(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: U */
    public final void m79571U(View view) {
        for (int i = 0; i < this.f54212p.getChildCount(); i++) {
            View childAt = this.f54212p.getChildAt(i);
            childAt.setSelected(childAt == view);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m79572V(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f54216t.setSelected(bLiveVoiceRoom.maskMode);
        m79559A(bLiveVoiceRoom.useLastTitle && !TextUtils.isEmpty(bLiveVoiceRoom.title), bLiveVoiceRoom.title);
    }

    /* JADX INFO: renamed from: W */
    public void m79573W(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m79574X() {
        act().getWindow().setSoftInputMode(51);
    }

    /* JADX INFO: renamed from: Y */
    public void m79575Y(List<BLiveVoiceTopic> list, boolean z, List<BLiveVoiceMutexMode> list2, BLiveVoiceModelDescribe bLiveVoiceModelDescribe) {
        m79585v(list);
        if (!jyb.m147479J(list2)) {
            m79561E(list2);
        }
        this.f54220x = z;
        m79586w();
        bnl0.m105524M(this.f54216t, zrv.f205799a.m207668g());
        bnl0.m105524M(this.f54210n, !jyb.m147479J(list2));
        this.f54194A = bLiveVoiceModelDescribe;
    }

    /* JADX INFO: renamed from: Z */
    public final void m79576Z() {
        if (getTitle().equals(this.f54206j.getText().toString())) {
            return;
        }
        setTitle(this.f54206j.getText().toString());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m79577a0() {
        TextView textView = this.f54216t;
        textView.setSelected(!textView.isSelected());
        this.f54217u.m130378v4(this.f54216t.isSelected());
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f54217u.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m79586w();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m79578b0() {
        TextView textView = this.f54215s;
        textView.setSelected(!textView.isSelected());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: c0 */
    public void m79579c0() {
        if (this.f54195B == null) {
            VoiceMicHelpDialogView voiceMicHelpDialogView = (VoiceMicHelpDialogView) LayoutInflater.from(act()).inflate(yec0.f198917S9, (ViewGroup) null);
            voiceMicHelpDialogView.m79537c(this.f54194A, new x20() { // from class: l.kio0
                @Override // p153l.x20
                public final void call() {
                    this.f127012a.m79568Q();
                }
            });
            g4s g4sVar = new g4s(this.f54217u, voiceMicHelpDialogView);
            this.f54195B = g4sVar;
            g4sVar.setCanceledOnTouchOutside(false);
            this.f54195B.setCancelable(false);
            this.f54195B.m72954c0(jgc0.f120694a);
        }
        this.f54195B.show();
    }

    /* JADX INFO: renamed from: d0 */
    public void m79580d0() {
        m79574X();
        m79587x();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public String getSelectedModel() {
        return this.f54196C;
    }

    public String getTitle() {
        return (this.f54218v ? this.f54203g : this.f54204h).getText().toString().trim();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f54221y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f54221y.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79581q(this);
        m79582r();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: q */
    public final void m79581q(View view) {
        uio0.m196297a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m79582r() {
        bnl0.m105540X(this.f54199c, bnl0.m105511F0());
        this.f54215s.setSelected(true);
        bnl0.m105509E0(this.f54199c, new View.OnClickListener() { // from class: l.hio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110042a.m79539J(view);
            }
        });
        bnl0.m105509E0(this.f54213q, new View.OnClickListener() { // from class: l.lio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132244a.m79540K(view);
            }
        });
        bnl0.m105509E0(this.f54215s, new View.OnClickListener() { // from class: l.mio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137005a.m79541L(view);
            }
        });
        bnl0.m105509E0(this.f54216t, new View.OnClickListener() { // from class: l.nio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142144a.m79542M(view);
            }
        });
        bnl0.m105509E0(this.f54206j, new View.OnClickListener() { // from class: l.oio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147559a.m79543N(view);
            }
        });
        this.f54205i.setText(zrv.f205803e.getString(R$string.f48529zi) + ":");
        this.f54207k.setText(zrv.f205803e.getString(R$string.f47445Bi) + ":");
        this.f54203g.setAlpha(1.0f);
        bnl0.m105524M(this.f54203g, true);
        m79538C();
        post(new Runnable() { // from class: l.pio0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152588a.m79566O();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m79583s() {
        act().getWindow().setSoftInputMode(32);
    }

    public void setTitle(String str) {
        VEditText vEditText = this.f54218v ? this.f54203g : this.f54204h;
        vEditText.setText(str);
        vEditText.setSelection(vEditText.length());
        vEditText.requestFocus();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gio0 gio0Var) {
        this.f54217u = gio0Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m79585v(List<BLiveVoiceTopic> list) {
        boolean zM147479J = jyb.m147479J(list);
        VText vText = this.f54207k;
        if (zM147479J) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f54209m.removeAllViews();
        for (final BLiveVoiceTopic bLiveVoiceTopic : list) {
            final VoicePreviewFlowItemView voicePreviewFlowItemView = (VoicePreviewFlowItemView) m79560B(this.f54209m);
            voicePreviewFlowItemView.setOnClickListener(new View.OnClickListener() { // from class: l.tio0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f174485a.m79563G(voicePreviewFlowItemView, bLiveVoiceTopic, view);
                }
            });
            voicePreviewFlowItemView.setData(bLiveVoiceTopic);
            this.f54209m.addView(voicePreviewFlowItemView);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79586w() {
        if (!this.f54220x) {
            this.f54213q.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(getTitle());
        VText vText = this.f54213q;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m79587x() {
        this.f54203g.addOnLayoutChangeListener(null);
    }

    /* JADX INFO: renamed from: y */
    public final TextView m79588y(BLiveVoiceMutexMode bLiveVoiceMutexMode) {
        int i;
        final TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(14.0f);
        textView.setTextColor(getContext().getResources().getColor(n9c0.f140823e1));
        Drawable drawable = getResources().getDrawable(obc0.f146250Y6);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setCompoundDrawablePadding(qa00.m175859d(8.0f));
        bnl0.m105539W(textView, qa00.m175859d(23.0f));
        textView.setTag(bLiveVoiceMutexMode.key);
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoiceMutexMode.key)) {
            i = 9;
        } else if (BLiveVoice.VOICE_LIVE_MODEL_RADIO_3.equals(bLiveVoiceMutexMode.key)) {
            i = 3;
        } else {
            i = BLiveVoice.VOICE_LIVE_MODEL_RADIO_5.equals(bLiveVoiceMutexMode.key) ? 5 : 10;
        }
        textView.setText(String.format(getResources().getString(R$string.f47959Zi), i + ""));
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.jio0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121108a.m79564H(textView, view);
            }
        });
        return textView;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54218v = true;
        this.f54219w = false;
        this.f54220x = false;
        this.f54221y = null;
        this.f54194A = null;
        this.f54195B = null;
    }

    public VoicePreviewViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54218v = true;
        this.f54219w = false;
        this.f54220x = false;
        this.f54221y = null;
        this.f54194A = null;
        this.f54195B = null;
    }
}
