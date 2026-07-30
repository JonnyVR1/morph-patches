package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.p046p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VEditText;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jw4 extends LiveMenuDialogHolder<nv4<pn40>> {

    /* JADX INFO: renamed from: E */
    public static int f120018E = 40;

    /* JADX INFO: renamed from: F */
    public static int f120019F = 22;

    /* JADX INFO: renamed from: G */
    public static int f120020G = 40;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f120021A;

    /* JADX INFO: renamed from: B */
    public int f120022B;

    /* JADX INFO: renamed from: C */
    public final InputFilter f120023C;

    /* JADX INFO: renamed from: D */
    public final InputFilter f120024D;

    /* JADX INFO: renamed from: k */
    public VoiceChatKeyboardRoot f120025k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f120026l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f120027m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f120028n;

    /* JADX INFO: renamed from: o */
    public DanmakuTagViewContainer f120029o;

    /* JADX INFO: renamed from: p */
    public NormalDanmakuImgViewGroup f120030p;

    /* JADX INFO: renamed from: q */
    public ChatInputViewGroup f120031q;

    /* JADX INFO: renamed from: r */
    public DanmakuToggleButton f120032r;

    /* JADX INFO: renamed from: s */
    public VEditText f120033s;

    /* JADX INFO: renamed from: t */
    public ImageView f120034t;

    /* JADX INFO: renamed from: u */
    public VText f120035u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f120036v;

    /* JADX INFO: renamed from: w */
    public VPager f120037w;

    /* JADX INFO: renamed from: x */
    public ValueAnimator f120038x;

    /* JADX INFO: renamed from: y */
    public ValueAnimator f120039y;

    /* JADX INFO: renamed from: z */
    public VoiceChatInputView.KeyboardModel f120040z;

    /* JADX INFO: renamed from: l.jw4$b */
    public class C17876b implements f30<Boolean, Integer> {
        public C17876b() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            jw4.this.m143641h0(bool, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.jw4$c */
    public class C17877c implements ValueAnimator.AnimatorUpdateListener {
        public C17877c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            jw4.this.f120027m.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.jw4$d */
    public static /* synthetic */ class C17878d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120044a;

        static {
            int[] iArr = new int[VoiceChatInputView.KeyboardModel.values().length];
            f120044a = iArr;
            try {
                iArr[VoiceChatInputView.KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120044a[VoiceChatInputView.KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120044a[VoiceChatInputView.KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jw4(@NonNull final nv4 nv4Var) {
        super(t6c0.f168175S, d8c0.f84852g, nv4Var.act(), nv4Var);
        this.f120038x = ValueAnimator.ofInt(0, 490);
        this.f120039y = ValueAnimator.ofInt(0, 180);
        this.f120040z = VoiceChatInputView.KeyboardModel.NONE;
        this.f120021A = null;
        this.f120023C = new oar(f120018E * 2, new d30() { // from class: l.dw4
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(jw4.f120018E)));
            }
        });
        this.f120024D = new oar(f120019F * 2, new d30() { // from class: l.ew4
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(jw4.f120019F)));
            }
        });
        m71844z(LiveDialogEnum.CHAT_INPUT);
        this.f120038x.setDuration(490L);
        this.f120038x.setInterpolator(new LinearInterpolator());
        bt0.m103750w(this.f120038x, new Runnable() { // from class: l.fw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo127109a4(true);
            }
        }, new Runnable() { // from class: l.gw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo127107Y3(true);
            }
        });
        this.f120038x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hw4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nv4Var.mo127108Z3(true, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f120039y.setDuration(180L);
        this.f120039y.setInterpolator(new LinearInterpolator());
        bt0.m103750w(this.f120039y, new Runnable() { // from class: l.iw4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo127109a4(false);
            }
        }, new Runnable() { // from class: l.vv4
            @Override // java.lang.Runnable
            public final void run() {
                nv4Var.mo127107Y3(false);
            }
        });
        this.f120039y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wv4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nv4Var.mo127108Z3(false, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m143615H(View view) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m143622O() {
    }

    /* JADX INFO: renamed from: X */
    private void m143629X() {
        if (this.f120039y.isRunning()) {
            this.f120039y.cancel();
        }
        if (this.f120038x.isRunning()) {
            this.f120038x.cancel();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((nv4) this.f47757b).act();
    }

    /* JADX INFO: renamed from: V */
    public final void m143630V(View view) {
        kw4.m147514a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public void m143632Y(String str) {
        VEditText vEditText = this.f120033s;
        if (vEditText == null || vEditText.getText() == null || !TextUtils.equals(str, k25.m144261b(this.f120033s.getText().toString()))) {
            return;
        }
        this.f120033s.setText("");
    }

    /* JADX INFO: renamed from: Z */
    public boolean m143633Z() {
        return this.f120032r.m72523d();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m143634a0(View view) {
        ((nv4) this.f47757b).m161555n4();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m143635b0(View view) {
        if (k25.m144267h()) {
            ((nv4) this.f47757b).m127110b4();
        } else {
            ((nv4) this.f47757b).m161550G4(k25.m144261b(this.f120033s.getText().toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m143636c0(View view) {
        VoiceChatInputView.KeyboardModel keyboardModel = this.f120040z;
        if (keyboardModel == VoiceChatInputView.KeyboardModel.NONE) {
            m143643j0(VoiceChatInputView.KeyboardModel.EMOJI);
        } else if (keyboardModel == VoiceChatInputView.KeyboardModel.INPUT) {
            m143643j0(VoiceChatInputView.KeyboardModel.EMOJI);
            getAct().hideInput(this.f120033s);
        } else {
            getAct().showInput(this.f120033s, 0);
            this.f120033s.requestFocus();
        }
        if (NullChecker.m81303a(((nv4) this.f47757b).m206027E2()) && (((nv4) this.f47757b).m206027E2() instanceof pn40)) {
            zvf0.m220399u("e_audio_chat_sticker_button", ((nv4) this.f47757b).mo77274R2(), vwb.m200311Y("anchorId", ((pn40) ((nv4) this.f47757b).m206027E2()).m132140j0()), vwb.m200311Y("liveId", ((pn40) ((nv4) this.f47757b).m206027E2()).m149814k()), vwb.m200311Y("roomId", ((pn40) ((nv4) this.f47757b).m206027E2()).m149818o()));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m143637d0(boolean z) {
        nv4.f140667u = z;
        m143629X();
        if (z) {
            this.f120038x.start();
        } else {
            this.f120039y.start();
        }
        xu4.m211078a(this.f47757b, z);
        m143645l0();
        if (z) {
            return;
        }
        m143639f0(((nv4) this.f47757b).f140674p);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        mo71838p();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m143638e0(String str) {
        if (i0g0.m133843J(this.f120033s.getText().toString() + str) > f120020G * 2) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(f120020G)));
        } else {
            this.f120033s.getText().insert(this.f120033s.getSelectionStart(), str);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m143639f0(String str) {
        this.f120033s.setHint(str);
    }

    /* JADX INFO: renamed from: g0 */
    public void m143640g0(boolean z, CharSequence charSequence) {
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f120018E;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f120033s.setText(charSequence);
        this.f120033s.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: h0 */
    public final void m143641h0(Boolean bool, int i) {
        if (i > 0 && this.f120022B == 0) {
            this.f120022B = i;
        }
        if (bool.booleanValue()) {
            ((nv4) this.f47757b).m161546C4(Boolean.TRUE, i);
            m143643j0(VoiceChatInputView.KeyboardModel.INPUT);
            return;
        }
        VoiceChatInputView.KeyboardModel keyboardModel = this.f120040z;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        if (keyboardModel == keyboardModel2) {
            m143643j0(keyboardModel2);
        } else {
            m143643j0(VoiceChatInputView.KeyboardModel.NONE);
            ((nv4) this.f47757b).m161546C4(Boolean.FALSE, i);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m143642i0(boolean z) {
        xdl0.m208344M(this.f120032r, z);
        DanmakuToggleButton danmakuToggleButton = this.f120032r;
        if (z) {
            danmakuToggleButton.setOnCheckedChangeListener(new DanmakuToggleButton.InterfaceC12738a() { // from class: l.xv4
                @Override // com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton.InterfaceC12738a
                /* JADX INFO: renamed from: a */
                public final void mo72525a(boolean z2) {
                    this.f194576a.m143637d0(z2);
                }
            });
        } else {
            danmakuToggleButton.setOnCheckedChangeListener(null);
        }
        m143644k0(this.f120026l);
        if (vdt.m198092b(2)) {
            this.f120037w.setAdapter(ypv.f199493a.m199358m(getAct(), new e30() { // from class: l.yv4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200219a.m143638e0((String) obj);
                }
            }, this.f120033s, ypv.f199493a.m199329V().isFemale() ? kye.f125280e : kye.f125281f, new ArrayList(), new d30() { // from class: l.zv4
                @Override // p149l.d30
                public final void call() {
                    jw4.m143622O();
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m143643j0(VoiceChatInputView.KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f120034t;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? i3c0.f110771L1 : i3c0.f110783M1);
        xdl0.m208345M0(this.f120037w, keyboardModel == keyboardModel2 || this.f120040z == keyboardModel2);
        if (this.f120040z == keyboardModel) {
            return;
        }
        this.f120040z = keyboardModel;
        int height = this.f120036v.getHeight();
        if (height == 0) {
            height = t100.m186890d(220.0f);
        }
        int iIntValue = this.f120022B;
        if (iIntValue == 0) {
            getAct();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f120036v.getHeight() != iIntValue) {
            xdl0.m208325C0(this.f120036v, iIntValue);
        }
        float translationY = this.f120027m.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f120027m.setTranslationY(f2);
        int i = C17878d.f120044a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        ValueAnimator valueAnimator = this.f120021A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f120021A.cancel();
        }
        if (translationY == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f120021A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f120021A.addUpdateListener(new C17877c());
        this.f120021A.start();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m143644k0(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f47758c.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m143644k0((ViewGroup) viewGroup.getParent());
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        this.f47760e.setUpKeyboardDetectorLayout(new View(this.f47760e), this.f120025k, new C17876b());
    }

    /* JADX INFO: renamed from: l0 */
    public void m143645l0() {
        this.f120033s.setFilters(new InputFilter[]{m143633Z() ? this.f120024D : this.f120023C});
        f120020G = m143633Z() ? f120019F : f120018E;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m143630V(view);
        this.f120026l.setOnClickListener(new View.OnClickListener() { // from class: l.uv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f178497a.m143634a0(view2);
            }
        });
        this.f120031q.setOnClickListener(new View.OnClickListener() { // from class: l.aw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jw4.m143615H(view2);
            }
        });
        xdl0.m208329E0(this.f120035u, new View.OnClickListener() { // from class: l.bw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77580a.m143635b0(view2);
            }
        });
        this.f120033s.addTextChangedListener(new C17875a());
        xdl0.m208344M(this.f120034t, false);
        xdl0.m208329E0(this.f120034t, new View.OnClickListener() { // from class: l.cw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82744a.m143636c0(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nv4<pn40> nv4Var) {
    }

    /* JADX INFO: renamed from: l.jw4$a */
    public class C17875a implements TextWatcher {
        public C17875a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = k25.m144261b(editable.toString()).length();
            jw4 jw4Var = jw4.this;
            if (length > 0) {
                jw4Var.f120035u.setEnabled(true);
            } else {
                jw4Var.f120035u.setEnabled(false);
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
