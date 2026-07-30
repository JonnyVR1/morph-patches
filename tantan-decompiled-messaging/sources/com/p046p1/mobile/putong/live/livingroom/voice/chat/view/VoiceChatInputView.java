package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VPager;
import p147v.VText;
import p149l.byr;
import p149l.d30;
import p149l.d8c0;
import p149l.e30;
import p149l.f30;
import p149l.fbp0;
import p149l.gzm0;
import p149l.i3c0;
import p149l.kye;
import p149l.l9e;
import p149l.oar;
import p149l.s7m;
import p149l.t100;
import p149l.tzm0;
import p149l.vdt;
import p149l.vwb;
import p149l.xdl0;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatInputView implements s7m<gzm0> {

    /* JADX INFO: renamed from: t */
    public static int f53019t = 1000;

    /* JADX INFO: renamed from: a */
    public VoiceChatKeyboardRoot f53020a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53021b;

    /* JADX INFO: renamed from: c */
    public VLinear f53022c;

    /* JADX INFO: renamed from: d */
    public VirtualChatInputTipsView f53023d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53024e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f53025f;

    /* JADX INFO: renamed from: g */
    public VEditText f53026g;

    /* JADX INFO: renamed from: h */
    public ImageView f53027h;

    /* JADX INFO: renamed from: i */
    public VText f53028i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f53029j;

    /* JADX INFO: renamed from: k */
    public VPager f53030k;

    /* JADX INFO: renamed from: l */
    public gzm0 f53031l;

    /* JADX INFO: renamed from: m */
    public DialogC12611a f53032m;

    /* JADX INFO: renamed from: o */
    public int f53034o;

    /* JADX INFO: renamed from: n */
    public int f53033n = t100.m186890d(2.0f);

    /* JADX INFO: renamed from: p */
    public int f53035p = -1;

    /* JADX INFO: renamed from: q */
    public int f53036q = l9e.f127077a;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f53037r = null;

    /* JADX INFO: renamed from: s */
    public KeyboardModel f53038s = KeyboardModel.NONE;

    public enum KeyboardModel {
        NONE,
        INPUT,
        EMOJI
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$a */
    public class DialogInterfaceOnShowListenerC13007a implements DialogInterface.OnShowListener {
        public DialogInterfaceOnShowListenerC13007a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (VoiceChatInputView.this.f53031l != null) {
                VoiceChatInputView.this.f53031l.m128896c4();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$b */
    public class C13008b implements TextWatcher {
        public C13008b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = VoiceChatInputView.this.m78019w(editable.toString()).length();
            VoiceChatInputView voiceChatInputView = VoiceChatInputView.this;
            if (length > 0) {
                voiceChatInputView.f53028i.setTextColor(Color.parseColor("#FFFFFFFF"));
                VoiceChatInputView.this.f53028i.setEnabled(true);
            } else {
                voiceChatInputView.f53028i.setTextColor(Color.parseColor("#33FFFFFF"));
                VoiceChatInputView.this.f53028i.setEnabled(false);
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
    public class C13009c implements ValueAnimator.AnimatorUpdateListener {
        public C13009c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            VoiceChatInputView.this.f53022c.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView$d */
    public static /* synthetic */ class C13010d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53042a;

        static {
            int[] iArr = new int[KeyboardModel.values().length];
            f53042a = iArr;
            try {
                iArr[KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53042a[KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53042a[KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m77986A() {
        Settings settings;
        User userM199329V = ypv.f199493a.m199329V();
        if (userM199329V == null || (settings = userM199329V.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM199329V.settings.phoneNumber.number)) {
            return TEnum.equals(userM199329V.source, "wechat") || TEnum.equals(userM199329V.source, "qq") || TEnum.equals(userM199329V.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m77987C(View view) {
        m78018v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m77988F(View view) {
        KeyboardModel keyboardModel = this.f53038s;
        if (keyboardModel == KeyboardModel.NONE) {
            m77990L(KeyboardModel.EMOJI);
        } else if (keyboardModel == KeyboardModel.INPUT) {
            m77990L(KeyboardModel.EMOJI);
            getAct().hideInput(this.f53026g);
        } else {
            getAct().showInput(this.f53026g, 0);
            this.f53026g.requestFocus();
        }
        if (NullChecker.m81303a(this.f53031l.m206027E2())) {
            zvf0.m220399u("e_audio_chat_sticker_button", this.f53031l.mo77274R2(), vwb.m200311Y("anchorId", this.f53031l.m206027E2().m132140j0()), vwb.m200311Y("liveId", this.f53031l.m206027E2().m149814k()), vwb.m200311Y("roomId", this.f53031l.m206027E2().m149818o()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m77989K(Boolean bool, int i) {
        if (i > 0 && this.f53034o == 0) {
            this.f53034o = i;
        }
        if (i > 0) {
            this.f53035p = i;
        }
        if (bool.booleanValue()) {
            this.f53031l.m128899f4(this.f53034o + this.f53033n);
            m77990L(KeyboardModel.INPUT);
            return;
        }
        KeyboardModel keyboardModel = this.f53038s;
        KeyboardModel keyboardModel2 = KeyboardModel.EMOJI;
        if (keyboardModel != keyboardModel2) {
            m77990L(KeyboardModel.NONE);
        } else {
            m77990L(keyboardModel2);
        }
        this.f53031l.m128897d4(this.f53033n);
    }

    /* JADX INFO: renamed from: L */
    private void m77990L(KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f53027h;
        KeyboardModel keyboardModel2 = KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? i3c0.f110771L1 : i3c0.f110783M1);
        xdl0.m208345M0(this.f53030k, keyboardModel == keyboardModel2 || this.f53038s == keyboardModel2);
        if (this.f53038s == keyboardModel) {
            return;
        }
        this.f53038s = keyboardModel;
        int height = this.f53029j.getHeight();
        if (height == 0) {
            height = t100.m186890d(220.0f);
        }
        int iIntValue = this.f53034o;
        if (iIntValue == 0) {
            getAct();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f53029j.getHeight() != iIntValue) {
            xdl0.m208325C0(this.f53029j, iIntValue);
        }
        float translationY = this.f53022c.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f53022c.setTranslationY(f2);
        int i = C13010d.f53042a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        ValueAnimator valueAnimator = this.f53037r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f53037r.cancel();
        }
        if (translationY == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f53037r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f53037r.addUpdateListener(new C13009c());
        this.f53037r.start();
    }

    /* JADX INFO: renamed from: M */
    private void m77991M(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f53032m.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m77991M((ViewGroup) viewGroup.getParent());
        }
    }

    /* JADX INFO: renamed from: N */
    private void m77992N(final Act act) {
        act.dialog().m20556t0(R$string.f46711H0, new Runnable() { // from class: l.szm0
            @Override // java.lang.Runnable
            public final void run() {
                ypv.f199493a.m199361n0(act, new d30() { // from class: l.izm0
                    @Override // p149l.d30
                    public final void call() {
                        VoiceChatInputView.m77994b();
                    }
                });
            }
        }).m20500D(R$string.f46733I0).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m77994b() {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m77996d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m78001k(View view) {
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m78006B(DialogInterface dialogInterface) {
        gzm0 gzm0Var = this.f53031l;
        if (gzm0Var != null) {
            gzm0Var.m128897d4(0);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f53031l.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m78007E(Act act, View view) {
        if (m77986A()) {
            m77992N(act);
            return;
        }
        this.f53031l.m128901i4(m78019w(this.f53026g.getText().toString()), "user");
        if (xdl0.m208349O0(this.f53023d)) {
            xdl0.m208344M(this.f53023d, false);
            this.f53031l.m206028F2().VoiceVirtualLiveEvent.dismissChatTips().m172467p();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m78008G(String str) {
        this.f53031l.m128901i4(str, "user");
        this.f53031l.m206028F2().VoiceVirtualLiveEvent.dismissChatTips().m172467p();
        fbp0.m120392h(this.f53031l, str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m78009H(String str) {
        this.f53026g.getText().insert(this.f53026g.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: I */
    public void m78010I(boolean z, CharSequence charSequence) {
        m78013P(true);
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f53019t;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f53026g.setText(charSequence);
        this.f53026g.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: J */
    public void m78011J(List<String> list) {
        VirtualChatInputTipsView virtualChatInputTipsView = this.f53023d;
        if (virtualChatInputTipsView != null) {
            virtualChatInputTipsView.m76934T(list, VirtualChatInputTipsView.f52282l, new e30() { // from class: l.jzm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120401a.m78008G((String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    public void m78012O(boolean z) {
        if (!z) {
            m78018v();
        } else {
            m77990L(KeyboardModel.EMOJI);
            m78013P(false);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m78013P(boolean z) {
        if (this.f53032m.isShowing()) {
            return;
        }
        this.f53032m.show();
        m77991M(this.f53021b);
        if (z) {
            getAct().showInput(this.f53026g, 0);
            this.f53026g.requestFocus();
        }
        this.f53026g.setFilters(new InputFilter[]{new oar(f53019t * 2, new d30() { // from class: l.pzm0
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(VoiceChatInputView.f53019t)));
            }
        })});
        if (vdt.m198092b(3)) {
            this.f53030k.setAdapter(ypv.f199493a.m199358m(getAct(), new e30() { // from class: l.qzm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157082a.m78009H((String) obj);
                }
            }, this.f53026g, ypv.f199493a.m199329V().isFemale() ? kye.f125280e : kye.f125281f, new ArrayList(), new d30() { // from class: l.rzm0
                @Override // p149l.d30
                public final void call() {
                    VoiceChatInputView.m77996d();
                }
            }));
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f53031l.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        m78018v();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public View m78014q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tzm0.m191210b(this, layoutInflater, viewGroup);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m78015r() {
        final Act act = getAct();
        byr byrVar = new byr(this.f53031l, d8c0.f84860o, m78014q(act.inflater(), null));
        this.f53032m = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hzm0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f110216a.m78006B(dialogInterface);
            }
        });
        this.f53032m.setOnShowListener(new DialogInterfaceOnShowListenerC13007a());
        act.setUpKeyboardDetectorLayout(new View(act), this.f53020a, new f30() { // from class: l.kzm0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f125395a.m77989K((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
        this.f53021b.setOnClickListener(new View.OnClickListener() { // from class: l.lzm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130659a.m77987C(view);
            }
        });
        this.f53032m.m71771c0(d8c0.f84853h);
        this.f53032m.m71778j0(LiveDialogEnum.CHAT_INPUT);
        this.f53028i.setOnClickListener(new View.OnClickListener() { // from class: l.mzm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136405a.m78007E(act, view);
            }
        });
        xdl0.m208329E0(this.f53024e, new View.OnClickListener() { // from class: l.nzm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceChatInputView.m78001k(view);
            }
        });
        xdl0.m208344M(this.f53027h, false);
        xdl0.m208329E0(this.f53027h, new View.OnClickListener() { // from class: l.ozm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146486a.m77988F(view);
            }
        });
        this.f53026g.addTextChangedListener(new C13008b());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gzm0 gzm0Var) {
        this.f53031l = gzm0Var;
    }

    /* JADX INFO: renamed from: u */
    public void m78017u(String str) {
        if (TextUtils.equals(str, m78019w(this.f53026g.getText().toString()))) {
            this.f53026g.setText("");
        }
    }

    /* JADX INFO: renamed from: v */
    public void m78018v() {
        DialogC12611a dialogC12611a = this.f53032m;
        if (dialogC12611a != null && dialogC12611a.isShowing()) {
            if (getAct() != null) {
                getAct().hideInput(this.f53026g);
            }
            this.f53032m.dismiss();
        }
        this.f53038s = KeyboardModel.NONE;
        ValueAnimator valueAnimator = this.f53037r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f53037r.cancel();
        }
        if (NullChecker.m81303a(this.f53029j)) {
            xdl0.m208325C0(this.f53029j, m78021y());
        }
        if (NullChecker.m81303a(this.f53022c)) {
            this.f53022c.setTranslationY(m78021y());
        }
    }

    /* JADX INFO: renamed from: w */
    public String m78019w(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: x */
    public String m78020x() {
        VEditText vEditText = this.f53026g;
        return vEditText == null ? "" : m78019w(vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: y */
    public final int m78021y() {
        int i = this.f53034o;
        if (i != 0) {
            return i;
        }
        getAct();
        return Act.savedKeyboardHeight.get().intValue();
    }

    /* JADX INFO: renamed from: z */
    public void m78022z() {
        VirtualChatInputTipsView virtualChatInputTipsView = this.f53023d;
        if (virtualChatInputTipsView != null) {
            virtualChatInputTipsView.m76929O();
        }
    }
}
