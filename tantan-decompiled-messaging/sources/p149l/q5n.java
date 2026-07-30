package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class q5n extends LiveMenuDialogHolder<e5n> {

    /* JADX INFO: renamed from: B */
    public static int f152793B = 40;

    /* JADX INFO: renamed from: C */
    public static int f152794C = 30;

    /* JADX INFO: renamed from: D */
    public static int f152795D = 40;

    /* JADX INFO: renamed from: A */
    public final InputFilter f152796A;

    /* JADX INFO: renamed from: k */
    public VoiceChatKeyboardRoot f152797k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f152798l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f152799m;

    /* JADX INFO: renamed from: n */
    public VFrame f152800n;

    /* JADX INFO: renamed from: o */
    public ChatInputViewGroup f152801o;

    /* JADX INFO: renamed from: p */
    public CheckBox f152802p;

    /* JADX INFO: renamed from: q */
    public VEditText f152803q;

    /* JADX INFO: renamed from: r */
    public ImageView f152804r;

    /* JADX INFO: renamed from: s */
    public VText f152805s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f152806t;

    /* JADX INFO: renamed from: u */
    public VoiceChatInputView.KeyboardModel f152807u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f152808v;

    /* JADX INFO: renamed from: w */
    public int f152809w;

    /* JADX INFO: renamed from: x */
    public Animator f152810x;

    /* JADX INFO: renamed from: y */
    public Animator f152811y;

    /* JADX INFO: renamed from: z */
    public final InputFilter f152812z;

    /* JADX INFO: renamed from: l.q5n$b */
    public static /* synthetic */ class C19434b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152814a;

        static {
            int[] iArr = new int[VoiceChatInputView.KeyboardModel.values().length];
            f152814a = iArr;
            try {
                iArr[VoiceChatInputView.KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f152814a[VoiceChatInputView.KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f152814a[VoiceChatInputView.KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public q5n(@NonNull e5n e5nVar) {
        super(t6c0.f168443n2, d8c0.f84852g, e5nVar.act(), e5nVar);
        this.f152807u = VoiceChatInputView.KeyboardModel.NONE;
        this.f152808v = null;
        this.f152812z = new oar(f152793B * 2, new d30() { // from class: l.m5n
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(q5n.f152793B)));
            }
        });
        this.f152796A = new oar(f152794C * 2, new d30() { // from class: l.n5n
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(w8u.m202218u(R$string.f46695G6, Integer.valueOf(q5n.f152794C)));
            }
        });
        m71844z(LiveDialogEnum.CHAT_INPUT);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m173057F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m173068V(View view) {
        ((e5n) this.f47757b).m114876u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m173069W(View view) {
        if (k25.m144267h()) {
            ((e5n) this.f47757b).m127110b4();
        } else {
            ((e5n) this.f47757b).m114867R4(k25.m144261b(this.f152803q.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m173070g0(Boolean bool, int i) {
        if (i > 0 && this.f152809w == 0) {
            this.f152809w = i;
        }
        if (bool.booleanValue()) {
            ((e5n) this.f47757b).m114865O4(Boolean.TRUE, i);
            m173071k0(VoiceChatInputView.KeyboardModel.INPUT);
            return;
        }
        VoiceChatInputView.KeyboardModel keyboardModel = this.f152807u;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        if (keyboardModel == keyboardModel2) {
            m173071k0(keyboardModel2);
        } else {
            m173071k0(VoiceChatInputView.KeyboardModel.NONE);
            ((e5n) this.f47757b).m114865O4(Boolean.FALSE, i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m173071k0(VoiceChatInputView.KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f152804r;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? i3c0.f110771L1 : i3c0.f110783M1);
        xdl0.m208345M0(this.f152806t, keyboardModel == keyboardModel2 || this.f152807u == keyboardModel2);
        if (this.f152807u == keyboardModel) {
            return;
        }
        this.f152807u = keyboardModel;
        int height = this.f152806t.getHeight();
        if (height == 0) {
            height = t100.m186890d(220.0f);
        }
        int iIntValue = this.f152809w;
        if (iIntValue == 0) {
            act();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f152806t.getHeight() != iIntValue) {
            xdl0.m208325C0(this.f152806t, iIntValue);
        }
        float translationY = this.f152799m.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f152799m.setTranslationY(f2);
        int i = C19434b.f152814a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        if (translationY == f) {
            return;
        }
        dt0.m113503C(this.f152808v);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f152808v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f152808v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.o5n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f141919a.m173082b0(valueAnimator);
            }
        });
        this.f152808v.start();
    }

    /* JADX INFO: renamed from: l0 */
    private void m173072l0(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f47758c.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m173072l0((ViewGroup) viewGroup.getParent());
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((e5n) this.f47757b).act();
    }

    /* JADX INFO: renamed from: Q */
    public final void m173073Q(View view) {
        r5n.m177955a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m173074R(String str) {
        VEditText vEditText = this.f152803q;
        if (vEditText == null || vEditText.getText() == null || !TextUtils.equals(str, k25.m144261b(this.f152803q.getText().toString()))) {
            return;
        }
        this.f152803q.setText("");
    }

    /* JADX INFO: renamed from: S */
    public void m173075S(boolean z) {
        ImageView imageView = this.f152804r;
        if (imageView == null) {
            return;
        }
        if (z) {
            xdl0.m208344M(imageView, true);
            return;
        }
        xdl0.m208344M(imageView, false);
        if (this.f152807u == VoiceChatInputView.KeyboardModel.EMOJI) {
            this.f152804r.setImageResource(i3c0.f110783M1);
            mo71838p();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m173076T() {
        VFrame vFrame = this.f152800n;
        Property<View, Integer> property = bt0.f77160g;
        Animator animatorM103742o = bt0.m103742o(vFrame, property, 0, t100.m186890d(49.0f));
        VFrame vFrame2 = this.f152800n;
        Property property2 = View.ALPHA;
        Animator duration = bt0.m103753z(animatorM103742o, bt0.m103741n(vFrame2, property2, 0.0f, 1.0f)).setDuration(180L);
        this.f152810x = duration;
        Interpolator interpolator = bt0.f77157d;
        duration.setInterpolator(interpolator);
        bt0.m103749v(this.f152810x, new Runnable() { // from class: l.p5n
            @Override // java.lang.Runnable
            public final void run() {
                this.f147312a.m173080Z();
            }
        });
        Animator duration2 = bt0.m103753z(bt0.m103742o(this.f152800n, property, t100.m186890d(49.0f), t100.m186890d(0.0f)), bt0.m103741n(this.f152800n, property2, 1.0f, 0.0f)).setDuration(120L);
        this.f152811y = duration2;
        duration2.setInterpolator(interpolator);
        bt0.m103733f(this.f152811y, new Runnable() { // from class: l.g5n
            @Override // java.lang.Runnable
            public final void run() {
                this.f101174a.m173081a0();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public boolean m173077U() {
        return this.f152802p.isChecked();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m173078X(View view) {
        m173083c0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m173079Y(CompoundButton compoundButton, boolean z) {
        ((e5n) this.f47757b).f89451t = z;
        dt0.m113502B(this.f152810x);
        dt0.m113502B(this.f152811y);
        if (z) {
            this.f152810x.start();
            ((e5n) this.f47757b).f89452u.m105614X3();
            if (this.f152807u == VoiceChatInputView.KeyboardModel.EMOJI) {
                act().showInput(this.f152803q, 0);
                this.f152803q.requestFocus();
            }
        } else {
            this.f152811y.start();
            ((e5n) this.f47757b).f89452u.f79634k = null;
        }
        xu4.m211078a(this.f47757b, z);
        m173090m0();
        if (z) {
            return;
        }
        m173084d0(((e5n) this.f47757b).f89450s);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m173080Z() {
        m173086f0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m173081a0() {
        m173086f0(true);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m173082b0(ValueAnimator valueAnimator) {
        this.f152799m.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m173083c0() {
        VoiceChatInputView.KeyboardModel keyboardModel = this.f152807u;
        if (keyboardModel == VoiceChatInputView.KeyboardModel.NONE) {
            m173089j0();
        } else if (keyboardModel == VoiceChatInputView.KeyboardModel.INPUT) {
            m173089j0();
            act().hideInput(this.f152803q);
        } else {
            act().showInput(this.f152803q, 0);
            this.f152803q.requestFocus();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m173084d0(String str) {
        this.f152803q.setHint(str);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        mo71838p();
    }

    /* JADX INFO: renamed from: e0 */
    public void m173085e0(boolean z, CharSequence charSequence) {
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f152793B;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f152803q.setText(charSequence);
        this.f152803q.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: f0 */
    public void m173086f0(boolean z) {
        ChatInputViewGroup chatInputViewGroup = this.f152801o;
        if (z) {
            chatInputViewGroup.setBackgroundResource(i3c0.f111189v);
        } else {
            chatInputViewGroup.setBackgroundColor(Color.parseColor("#19191e"));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m173087h0(boolean z) {
        this.f152802p.setChecked(z);
    }

    /* JADX INFO: renamed from: i0 */
    public void m173088i0(boolean z) {
        m173072l0(this.f152798l);
        m173087h0(z && ((e5n) this.f47757b).f89451t);
        m173086f0(!this.f152802p.isChecked());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m173089j0() {
        if (this.f152802p.isChecked()) {
            this.f152802p.setChecked(false);
        }
        m173071k0(VoiceChatInputView.KeyboardModel.EMOJI);
        zvf0.m220396r("e_intl_emoticon_panel_enter_click", "p_intl_emoticon_panel_show");
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        this.f47760e.setUpKeyboardDetectorLayout(new View(this.f47760e), this.f152797k, new f30() { // from class: l.l5n
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f126192a.m173070g0((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m173073Q(view);
        m173076T();
        this.f152798l.setOnClickListener(new View.OnClickListener() { // from class: l.f5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f95189a.m173068V(view2);
            }
        });
        this.f152801o.setOnClickListener(new View.OnClickListener() { // from class: l.h5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q5n.m173057F(view2);
            }
        });
        xdl0.m208329E0(this.f152805s, new View.OnClickListener() { // from class: l.i5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f111625a.m173069W(view2);
            }
        });
        this.f152803q.addTextChangedListener(new C19433a());
        xdl0.m208344M(this.f152804r, alk0.m97309h(((nnn0) ((e5n) this.f47757b).m206027E2()).m160261Y2()));
        xdl0.m208329E0(this.f152804r, new View.OnClickListener() { // from class: l.j5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f116334a.m173078X(view2);
            }
        });
        this.f152802p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.k5n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f121214a.m173079Y(compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m173090m0() {
        this.f152803q.setFilters(new InputFilter[]{m173077U() ? this.f152796A : this.f152812z});
        f152795D = m173077U() ? f152794C : f152793B;
    }

    /* JADX INFO: renamed from: l.q5n$a */
    public class C19433a implements TextWatcher {
        public C19433a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = k25.m144261b(editable.toString()).length();
            q5n q5nVar = q5n.this;
            if (length > 0) {
                q5nVar.f152805s.setEnabled(true);
            } else {
                q5nVar.f152805s.setEnabled(false);
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
