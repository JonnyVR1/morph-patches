package p002l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.p000p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bt0;
import l.d30;
import l.e30;
import l.f30;
import l.i0g0;
import l.j760;
import l.kye;
import l.lsi0;
import l.oar;
import l.t100;
import l.vdt;
import l.vwb;
import l.xdl0;
import l.ypv;
import l.zvf0;
import v.VEditText;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jw4 extends LiveMenuDialogHolder<nv4<pn40>> {

    /* JADX INFO: renamed from: E */
    public static int f14064E = 40;

    /* JADX INFO: renamed from: F */
    public static int f14065F = 22;

    /* JADX INFO: renamed from: G */
    public static int f14066G = 40;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f14067A;

    /* JADX INFO: renamed from: B */
    public int f14068B;

    /* JADX INFO: renamed from: C */
    public final InputFilter f14069C;

    /* JADX INFO: renamed from: D */
    public final InputFilter f14070D;

    /* JADX INFO: renamed from: k */
    public VoiceChatKeyboardRoot f14071k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f14072l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f14073m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f14074n;

    /* JADX INFO: renamed from: o */
    public DanmakuTagViewContainer f14075o;

    /* JADX INFO: renamed from: p */
    public NormalDanmakuImgViewGroup f14076p;

    /* JADX INFO: renamed from: q */
    public ChatInputViewGroup f14077q;

    /* JADX INFO: renamed from: r */
    public DanmakuToggleButton f14078r;

    /* JADX INFO: renamed from: s */
    public VEditText f14079s;

    /* JADX INFO: renamed from: t */
    public ImageView f14080t;

    /* JADX INFO: renamed from: u */
    public VText f14081u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f14082v;

    /* JADX INFO: renamed from: w */
    public VPager f14083w;

    /* JADX INFO: renamed from: x */
    public ValueAnimator f14084x;

    /* JADX INFO: renamed from: y */
    public ValueAnimator f14085y;

    /* JADX INFO: renamed from: z */
    public VoiceChatInputView.KeyboardModel f14086z;

    /* JADX INFO: renamed from: l.jw4$b */
    public class C0641b implements f30<Boolean, Integer> {
        public C0641b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            jw4.this.m16383h0(bool, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.jw4$c */
    public class C0642c implements ValueAnimator.AnimatorUpdateListener {
        public C0642c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            jw4.this.f14073m.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.jw4$d */
    public static /* synthetic */ class C0643d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14090a;

        static {
            int[] iArr = new int[VoiceChatInputView.KeyboardModel.values().length];
            f14090a = iArr;
            try {
                iArr[VoiceChatInputView.KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14090a[VoiceChatInputView.KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14090a[VoiceChatInputView.KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jw4(@NonNull final nv4 nv4Var) {
        super(t6c0.f19671S, d8c0.f9102g, nv4Var.act(), nv4Var);
        this.f14084x = ValueAnimator.ofInt(0, 490);
        this.f14085y = ValueAnimator.ofInt(0, 180);
        this.f14086z = VoiceChatInputView.KeyboardModel.NONE;
        this.f14067A = null;
        this.f14069C = new oar(f14064E * 2, new d30() { // from class: l.dw4
            public final void call() {
                lsi0.j(ypv.e.getString(R$string.f2737G6, Integer.valueOf(jw4.f14064E)));
            }
        });
        this.f14070D = new oar(f14065F * 2, new d30() { // from class: l.ew4
            public final void call() {
                lsi0.j(ypv.e.getString(R$string.f2737G6, Integer.valueOf(jw4.f14065F)));
            }
        });
        m5222z(LiveDialogEnum.CHAT_INPUT);
        this.f14084x.setDuration(490L);
        this.f14084x.setInterpolator(new LinearInterpolator());
        bt0.w(this.f14084x, new Runnable() { // from class: l.fw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo13963a4(true);
            }
        }, new Runnable() { // from class: l.gw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo13961Y3(true);
            }
        });
        this.f14084x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hw4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nv4Var.mo13962Z3(true, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f14085y.setDuration(180L);
        this.f14085y.setInterpolator(new LinearInterpolator());
        bt0.w(this.f14085y, new Runnable() { // from class: l.iw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo13963a4(false);
            }
        }, new Runnable() { // from class: l.vv4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo13961Y3(false);
            }
        });
        this.f14085y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wv4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nv4Var.mo13962Z3(false, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m16357H(View view) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m16364O() {
    }

    /* JADX INFO: renamed from: X */
    private void m16371X() {
        if (this.f14085y.isRunning()) {
            this.f14085y.cancel();
        }
        if (this.f14084x.isRunning()) {
            this.f14084x.cancel();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((nv4) this.f3799b).act();
    }

    /* JADX INFO: renamed from: V */
    public final void m16372V(View view) {
        kw4.m16836a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public void m16374Y(String str) {
        VEditText vEditText = this.f14079s;
        if (vEditText == null || vEditText.getText() == null || !TextUtils.equals(str, k25.m16466b(this.f14079s.getText().toString()))) {
            return;
        }
        this.f14079s.setText("");
    }

    /* JADX INFO: renamed from: Z */
    public boolean m16375Z() {
        return this.f14078r.m6015d();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m16376a0(View view) {
        ((nv4) this.f3799b).m19043n4();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m16377b0(View view) {
        if (k25.m16472h()) {
            ((nv4) this.f3799b).m13964b4();
        } else {
            ((nv4) this.f3799b).m19037G4(k25.m16466b(this.f14079s.getText().toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m16378c0(View view) {
        VoiceChatInputView.KeyboardModel keyboardModel = this.f14086z;
        if (keyboardModel == VoiceChatInputView.KeyboardModel.NONE) {
            m16385j0(VoiceChatInputView.KeyboardModel.EMOJI);
        } else if (keyboardModel == VoiceChatInputView.KeyboardModel.INPUT) {
            m16385j0(VoiceChatInputView.KeyboardModel.EMOJI);
            act().hideInput(this.f14079s);
        } else {
            act().showInput(this.f14079s, 0);
            this.f14079s.requestFocus();
        }
        if (NullChecker.a(((nv4) this.f3799b).m25547E2()) && (((nv4) this.f3799b).m25547E2() instanceof pn40)) {
            zvf0.u("e_audio_chat_sticker_button", ((nv4) this.f3799b).mo21430R2(), new j760[]{vwb.Y("anchorId", ((pn40) ((nv4) this.f3799b).m25547E2()).m14576j0()), vwb.Y("liveId", ((pn40) ((nv4) this.f3799b).m25547E2()).m17235k()), vwb.Y("roomId", ((pn40) ((nv4) this.f3799b).m25547E2()).m17239o())});
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m16379d0(boolean z) {
        nv4.f16208u = z;
        m16371X();
        if (z) {
            this.f14084x.start();
        } else {
            this.f14085y.start();
        }
        xu4.m26148a(this.f3799b, z);
        m16387l0();
        if (z) {
            return;
        }
        m16381f0(((nv4) this.f3799b).f16215p);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        mo5216p();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m16380e0(String str) {
        if (i0g0.J(this.f14079s.getText().toString() + str) > f14066G * 2) {
            lsi0.j(ypv.e.getString(R$string.f2737G6, Integer.valueOf(f14066G)));
        } else {
            this.f14079s.getText().insert(this.f14079s.getSelectionStart(), str);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m16381f0(String str) {
        this.f14079s.setHint(str);
    }

    /* JADX INFO: renamed from: g0 */
    public void m16382g0(boolean z, CharSequence charSequence) {
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f14064E;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f14079s.setText(charSequence);
        this.f14079s.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: h0 */
    public final void m16383h0(Boolean bool, int i) {
        if (i > 0 && this.f14068B == 0) {
            this.f14068B = i;
        }
        if (bool.booleanValue()) {
            ((nv4) this.f3799b).m19033C4(Boolean.TRUE, i);
            m16385j0(VoiceChatInputView.KeyboardModel.INPUT);
            return;
        }
        VoiceChatInputView.KeyboardModel keyboardModel = this.f14086z;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        if (keyboardModel == keyboardModel2) {
            m16385j0(keyboardModel2);
        } else {
            m16385j0(VoiceChatInputView.KeyboardModel.NONE);
            ((nv4) this.f3799b).m19033C4(Boolean.FALSE, i);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m16384i0(boolean z) {
        xdl0.M(this.f14078r, z);
        DanmakuToggleButton danmakuToggleButton = this.f14078r;
        if (z) {
            danmakuToggleButton.setOnCheckedChangeListener(new DanmakuToggleButton.InterfaceC0327a() { // from class: l.xv4
                @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton.InterfaceC0327a
                /* JADX INFO: renamed from: a */
                public final void mo6017a(boolean z2) {
                    this.f22477a.m16379d0(z2);
                }
            });
        } else {
            danmakuToggleButton.setOnCheckedChangeListener(null);
        }
        m16386k0(this.f14072l);
        if (vdt.b(2)) {
            this.f14083w.setAdapter(ypv.a.m(act(), new e30() { // from class: l.yv4
                public final void call(Object obj) {
                    this.f23111a.m16380e0((String) obj);
                }
            }, this.f14079s, ypv.a.V().isFemale() ? kye.e : kye.f, new ArrayList(), new d30() { // from class: l.zv4
                public final void call() {
                    jw4.m16364O();
                }
            }));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16385j0(VoiceChatInputView.KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f14080t;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? i3c0.f12556L1 : i3c0.f12568M1);
        xdl0.M0(this.f14083w, keyboardModel == keyboardModel2 || this.f14086z == keyboardModel2);
        if (this.f14086z == keyboardModel) {
            return;
        }
        this.f14086z = keyboardModel;
        int height = this.f14082v.getHeight();
        if (height == 0) {
            height = t100.d(220.0f);
        }
        int iIntValue = this.f14068B;
        if (iIntValue == 0) {
            act();
            iIntValue = ((Integer) Act.savedKeyboardHeight.get()).intValue();
        }
        if (this.f14082v.getHeight() != iIntValue) {
            xdl0.C0(this.f14082v, iIntValue);
        }
        float translationY = this.f14073m.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f14073m.setTranslationY(f2);
        int i = C0643d.f14090a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        ValueAnimator valueAnimator = this.f14067A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f14067A.cancel();
        }
        if (translationY == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f14067A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f14067A.addUpdateListener(new C0642c());
        this.f14067A.start();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m16386k0(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f3800c.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m16386k0((ViewGroup) viewGroup.getParent());
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo5213l() {
        this.f3802e.setUpKeyboardDetectorLayout(new View(this.f3802e), this.f14071k, new C0641b());
    }

    /* JADX INFO: renamed from: l0 */
    public void m16387l0() {
        this.f14079s.setFilters(new InputFilter[]{m16375Z() ? this.f14070D : this.f14069C});
        f14066G = m16375Z() ? f14065F : f14064E;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m16372V(view);
        this.f14072l.setOnClickListener(new View.OnClickListener() { // from class: l.uv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20842a.m16376a0(view2);
            }
        });
        this.f14077q.setOnClickListener(new View.OnClickListener() { // from class: l.aw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jw4.m16357H(view2);
            }
        });
        xdl0.E0(this.f14081u, new View.OnClickListener() { // from class: l.bw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8385a.m16377b0(view2);
            }
        });
        this.f14079s.addTextChangedListener(new C0640a());
        xdl0.M(this.f14080t, false);
        xdl0.E0(this.f14080t, new View.OnClickListener() { // from class: l.cw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8956a.m16378c0(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(nv4<pn40> nv4Var) {
    }

    /* JADX INFO: renamed from: l.jw4$a */
    public class C0640a implements TextWatcher {
        public C0640a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = k25.m16466b(editable.toString()).length();
            jw4 jw4Var = jw4.this;
            if (length > 0) {
                jw4Var.f14081u.setEnabled(true);
            } else {
                jw4Var.f14081u.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
