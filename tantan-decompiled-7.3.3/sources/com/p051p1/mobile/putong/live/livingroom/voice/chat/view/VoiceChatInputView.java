package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;
import p153l.bnl0;
import p153l.c0s;
import p153l.i4g0;
import p153l.iam;
import p153l.jgc0;
import p153l.jkp0;
import p153l.jyb;
import p153l.k8n0;
import p153l.obc0;
import p153l.oze;
import p153l.pae;
import p153l.qa00;
import p153l.qcr;
import p153l.wft;
import p153l.x20;
import p153l.x8n0;
import p153l.y20;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatInputView implements iam<k8n0> {

    /* JADX INFO: renamed from: t */
    public static int f53867t = 1000;

    /* JADX INFO: renamed from: a */
    public VoiceChatKeyboardRoot f53868a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53869b;

    /* JADX INFO: renamed from: c */
    public VLinear f53870c;

    /* JADX INFO: renamed from: d */
    public VirtualChatInputTipsView f53871d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53872e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f53873f;

    /* JADX INFO: renamed from: g */
    public VEditText f53874g;

    /* JADX INFO: renamed from: h */
    public ImageView f53875h;

    /* JADX INFO: renamed from: i */
    public VText f53876i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f53877j;

    /* JADX INFO: renamed from: k */
    public VPager f53878k;

    /* JADX INFO: renamed from: l */
    public k8n0 f53879l;

    /* JADX INFO: renamed from: m */
    public DialogC12774a f53880m;

    /* JADX INFO: renamed from: o */
    public int f53882o;

    /* JADX INFO: renamed from: n */
    public int f53881n = qa00.m175859d(2.0f);

    /* JADX INFO: renamed from: p */
    public int f53883p = -1;

    /* JADX INFO: renamed from: q */
    public int f53884q = pae.f151257a;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f53885r = null;

    /* JADX INFO: renamed from: s */
    public KeyboardModel f53886s = KeyboardModel.NONE;

    public enum KeyboardModel {
        NONE,
        INPUT,
        EMOJI
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$a */
    public class DialogInterfaceOnShowListenerC13170a implements DialogInterface.OnShowListener {
        public DialogInterfaceOnShowListenerC13170a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (VoiceChatInputView.this.f53879l != null) {
                VoiceChatInputView.this.f53879l.m148733c4();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$b */
    public class C13171b implements TextWatcher {
        public C13171b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = VoiceChatInputView.this.m79202w(editable.toString()).length();
            VoiceChatInputView voiceChatInputView = VoiceChatInputView.this;
            if (length > 0) {
                voiceChatInputView.f53876i.setTextColor(Color.parseColor("#FFFFFFFF"));
                VoiceChatInputView.this.f53876i.setEnabled(true);
            } else {
                voiceChatInputView.f53876i.setTextColor(Color.parseColor("#33FFFFFF"));
                VoiceChatInputView.this.f53876i.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$c */
    public class C13172c implements ValueAnimator.AnimatorUpdateListener {
        public C13172c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            VoiceChatInputView.this.f53870c.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$d */
    public static /* synthetic */ class C13173d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53890a;

        static {
            int[] iArr = new int[KeyboardModel.values().length];
            f53890a = iArr;
            try {
                iArr[KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53890a[KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53890a[KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m79169A() {
        Settings settings;
        User userM207651V = zrv.f205799a.m207651V();
        if (userM207651V == null || (settings = userM207651V.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM207651V.settings.phoneNumber.number)) {
            return TEnum.equals(userM207651V.source, "wechat") || TEnum.equals(userM207651V.source, "qq") || TEnum.equals(userM207651V.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m79170C(View view) {
        m79201v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m79171F(View view) {
        KeyboardModel keyboardModel = this.f53886s;
        if (keyboardModel == KeyboardModel.NONE) {
            m79173L(KeyboardModel.EMOJI);
        } else if (keyboardModel == KeyboardModel.INPUT) {
            m79173L(KeyboardModel.EMOJI);
            getAct().hideInput(this.f53874g);
        } else {
            getAct().showInput(this.f53874g, 0);
            this.f53874g.requestFocus();
        }
        if (NullChecker.m82486a(this.f53879l.m213810E2())) {
            i4g0.m138523u("e_audio_chat_sticker_button", this.f53879l.mo78457R2(), jyb.m147494Y("anchorId", this.f53879l.m213810E2().m168526j0()), jyb.m147494Y("liveId", this.f53879l.m213810E2().m202191k()), jyb.m147494Y("roomId", this.f53879l.m213810E2().m202194o()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m79172K(Boolean bool, int i) {
        if (i > 0 && this.f53882o == 0) {
            this.f53882o = i;
        }
        if (i > 0) {
            this.f53883p = i;
        }
        if (bool.booleanValue()) {
            this.f53879l.m148736f4(this.f53882o + this.f53881n);
            m79173L(KeyboardModel.INPUT);
            return;
        }
        KeyboardModel keyboardModel = this.f53886s;
        KeyboardModel keyboardModel2 = KeyboardModel.EMOJI;
        if (keyboardModel != keyboardModel2) {
            m79173L(KeyboardModel.NONE);
        } else {
            m79173L(keyboardModel2);
        }
        this.f53879l.m148734d4(this.f53881n);
    }

    /* JADX INFO: renamed from: L */
    private void m79173L(KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f53875h;
        KeyboardModel keyboardModel2 = KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? obc0.f146099L1 : obc0.f146111M1);
        bnl0.m105525M0(this.f53878k, keyboardModel == keyboardModel2 || this.f53886s == keyboardModel2);
        if (this.f53886s == keyboardModel) {
            return;
        }
        this.f53886s = keyboardModel;
        int height = this.f53877j.getHeight();
        if (height == 0) {
            height = qa00.m175859d(220.0f);
        }
        int iIntValue = this.f53882o;
        if (iIntValue == 0) {
            getAct();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f53877j.getHeight() != iIntValue) {
            bnl0.m105505C0(this.f53877j, iIntValue);
        }
        float translationY = this.f53870c.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f53870c.setTranslationY(f2);
        int i = C13173d.f53890a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        ValueAnimator valueAnimator = this.f53885r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f53885r.cancel();
        }
        if (translationY == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f53885r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f53885r.addUpdateListener(new C13172c());
        this.f53885r.start();
    }

    /* JADX INFO: renamed from: M */
    private void m79174M(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f53880m.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m79174M((ViewGroup) viewGroup.getParent());
        }
    }

    /* JADX INFO: renamed from: N */
    private void m79175N(final Act act) {
        act.dialog().m21555t0(R$string.f47559H0, new Runnable() { // from class: l.w8n0
            @Override // java.lang.Runnable
            public final void run() {
                zrv.f205799a.m207683n0(act, new x20() { // from class: l.m8n0
                    @Override // p153l.x20
                    public final void call() {
                        VoiceChatInputView.m79177b();
                    }
                });
            }
        }).m21499D(R$string.f47581I0).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79177b() {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79179d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79184k(View view) {
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m79189B(DialogInterface dialogInterface) {
        k8n0 k8n0Var = this.f53879l;
        if (k8n0Var != null) {
            k8n0Var.m148734d4(0);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f53879l.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m79190E(Act act, View view) {
        if (m79169A()) {
            m79175N(act);
            return;
        }
        this.f53879l.m148738i4(m79202w(this.f53874g.getText().toString()), "user");
        if (bnl0.m105529O0(this.f53871d)) {
            bnl0.m105524M(this.f53871d, false);
            this.f53879l.m213811F2().VoiceVirtualLiveEvent.dismissChatTips().m199277p();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m79191G(String str) {
        this.f53879l.m148738i4(str, "user");
        this.f53879l.m213811F2().VoiceVirtualLiveEvent.dismissChatTips().m199277p();
        jkp0.m145877h(this.f53879l, str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m79192H(String str) {
        this.f53874g.getText().insert(this.f53874g.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: I */
    public void m79193I(boolean z, CharSequence charSequence) {
        m79196P(true);
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f53867t;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f53874g.setText(charSequence);
        this.f53874g.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: J */
    public void m79194J(List<String> list) {
        VirtualChatInputTipsView virtualChatInputTipsView = this.f53871d;
        if (virtualChatInputTipsView != null) {
            virtualChatInputTipsView.m78117T(list, VirtualChatInputTipsView.f53130l, new y20() { // from class: l.n8n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140699a.m79191G((String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public void m79195O(boolean z) {
        if (!z) {
            m79201v();
        } else {
            m79173L(KeyboardModel.EMOJI);
            m79196P(false);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m79196P(boolean z) {
        if (this.f53880m.isShowing()) {
            return;
        }
        this.f53880m.show();
        m79174M(this.f53869b);
        if (z) {
            getAct().showInput(this.f53874g, 0);
            this.f53874g.requestFocus();
        }
        this.f53874g.setFilters(new InputFilter[]{new qcr(f53867t * 2, new x20() { // from class: l.t8n0
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(VoiceChatInputView.f53867t)));
            }
        })});
        if (wft.m206159b(3)) {
            this.f53878k.setAdapter(zrv.f205799a.m207680m(getAct(), new y20() { // from class: l.u8n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178059a.m79192H((String) obj);
                }
            }, this.f53874g, zrv.f205799a.m207651V().isFemale() ? oze.f149867e : oze.f149868f, new ArrayList(), new x20() { // from class: l.v8n0
                @Override // p153l.x20
                public final void call() {
                    VoiceChatInputView.m79179d();
                }
            }));
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f53879l.act();
    }

    @Override // p153l.iam
    public void destroy() {
        m79201v();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public View m79197q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x8n0.m209745b(this, layoutInflater, viewGroup);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m79198r() {
        final Act act = getAct();
        c0s c0sVar = new c0s(this.f53879l, jgc0.f120708o, m79197q(act.inflater(), null));
        this.f53880m = c0sVar;
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.l8n0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f130503a.m79189B(dialogInterface);
            }
        });
        this.f53880m.setOnShowListener(new DialogInterfaceOnShowListenerC13170a());
        act.setUpKeyboardDetectorLayout(new View(act), this.f53868a, new z20() { // from class: l.o8n0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f145451a.m79172K((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
        this.f53869b.setOnClickListener(new View.OnClickListener() { // from class: l.p8n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151046a.m79170C(view);
            }
        });
        this.f53880m.m72954c0(jgc0.f120701h);
        this.f53880m.m72961j0(LiveDialogEnum.CHAT_INPUT);
        this.f53876i.setOnClickListener(new View.OnClickListener() { // from class: l.q8n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156149a.m79190E(act, view);
            }
        });
        bnl0.m105509E0(this.f53872e, new View.OnClickListener() { // from class: l.r8n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceChatInputView.m79184k(view);
            }
        });
        bnl0.m105524M(this.f53875h, false);
        bnl0.m105509E0(this.f53875h, new View.OnClickListener() { // from class: l.s8n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166836a.m79171F(view);
            }
        });
        this.f53874g.addTextChangedListener(new C13171b());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k8n0 k8n0Var) {
        this.f53879l = k8n0Var;
    }

    /* JADX INFO: renamed from: u */
    public void m79200u(String str) {
        if (TextUtils.equals(str, m79202w(this.f53874g.getText().toString()))) {
            this.f53874g.setText("");
        }
    }

    /* JADX INFO: renamed from: v */
    public void m79201v() {
        DialogC12774a dialogC12774a = this.f53880m;
        if (dialogC12774a != null && dialogC12774a.isShowing()) {
            if (getAct() != null) {
                getAct().hideInput(this.f53874g);
            }
            this.f53880m.dismiss();
        }
        this.f53886s = KeyboardModel.NONE;
        ValueAnimator valueAnimator = this.f53885r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f53885r.cancel();
        }
        if (NullChecker.m82486a(this.f53877j)) {
            bnl0.m105505C0(this.f53877j, m79204y());
        }
        if (NullChecker.m82486a(this.f53870c)) {
            this.f53870c.setTranslationY(m79204y());
        }
    }

    /* JADX INFO: renamed from: w */
    public String m79202w(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: x */
    public String m79203x() {
        VEditText vEditText = this.f53874g;
        return vEditText == null ? "" : m79202w(vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: y */
    public final int m79204y() {
        int i = this.f53882o;
        if (i != 0) {
            return i;
        }
        getAct();
        return Act.savedKeyboardHeight.get().intValue();
    }

    /* JADX INFO: renamed from: z */
    public void m79205z() {
        VirtualChatInputTipsView virtualChatInputTipsView = this.f53871d;
        if (virtualChatInputTipsView != null) {
            virtualChatInputTipsView.m78112O();
        }
    }
}
