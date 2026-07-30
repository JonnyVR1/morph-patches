package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class q7n extends LiveMenuDialogHolder<e7n> {

    /* JADX INFO: renamed from: B */
    public static int f155973B = 40;

    /* JADX INFO: renamed from: C */
    public static int f155974C = 30;

    /* JADX INFO: renamed from: D */
    public static int f155975D = 40;

    /* JADX INFO: renamed from: A */
    public final InputFilter f155976A;

    /* JADX INFO: renamed from: k */
    public VoiceChatKeyboardRoot f155977k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f155978l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f155979m;

    /* JADX INFO: renamed from: n */
    public VFrame f155980n;

    /* JADX INFO: renamed from: o */
    public ChatInputViewGroup f155981o;

    /* JADX INFO: renamed from: p */
    public CheckBox f155982p;

    /* JADX INFO: renamed from: q */
    public VEditText f155983q;

    /* JADX INFO: renamed from: r */
    public ImageView f155984r;

    /* JADX INFO: renamed from: s */
    public VText f155985s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f155986t;

    /* JADX INFO: renamed from: u */
    public VoiceChatInputView.KeyboardModel f155987u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f155988v;

    /* JADX INFO: renamed from: w */
    public int f155989w;

    /* JADX INFO: renamed from: x */
    public Animator f155990x;

    /* JADX INFO: renamed from: y */
    public Animator f155991y;

    /* JADX INFO: renamed from: z */
    public final InputFilter f155992z;

    /* JADX INFO: renamed from: l.q7n$b */
    public static /* synthetic */ class C19535b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155994a;

        static {
            int[] iArr = new int[VoiceChatInputView.KeyboardModel.values().length];
            f155994a = iArr;
            try {
                iArr[VoiceChatInputView.KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155994a[VoiceChatInputView.KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155994a[VoiceChatInputView.KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public q7n(@NonNull e7n e7nVar) {
        super(yec0.f199175n2, jgc0.f120700g, e7nVar.act(), e7nVar);
        this.f155987u = VoiceChatInputView.KeyboardModel.NONE;
        this.f155988v = null;
        this.f155992z = new qcr(f155973B * 2, new x20() { // from class: l.m7n
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(q7n.f155973B)));
            }
        });
        this.f155976A = new qcr(f155974C * 2, new x20() { // from class: l.n7n
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(xau.m209911u(R$string.f47543G6, Integer.valueOf(q7n.f155974C)));
            }
        });
        m73027z(LiveDialogEnum.CHAT_INPUT);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m175665F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m175676V(View view) {
        ((e7n) this.f48605b).m119755u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m175677W(View view) {
        if (j35.m143323h()) {
            ((e7n) this.f48605b).m163853b4();
        } else {
            ((e7n) this.f48605b).m119746R4(j35.m143317b(this.f155983q.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m175678g0(Boolean bool, int i) {
        if (i > 0 && this.f155989w == 0) {
            this.f155989w = i;
        }
        if (bool.booleanValue()) {
            ((e7n) this.f48605b).m119744O4(Boolean.TRUE, i);
            m175679k0(VoiceChatInputView.KeyboardModel.INPUT);
            return;
        }
        VoiceChatInputView.KeyboardModel keyboardModel = this.f155987u;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        if (keyboardModel == keyboardModel2) {
            m175679k0(keyboardModel2);
        } else {
            m175679k0(VoiceChatInputView.KeyboardModel.NONE);
            ((e7n) this.f48605b).m119744O4(Boolean.FALSE, i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m175679k0(VoiceChatInputView.KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f155984r;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? obc0.f146099L1 : obc0.f146111M1);
        bnl0.m105525M0(this.f155986t, keyboardModel == keyboardModel2 || this.f155987u == keyboardModel2);
        if (this.f155987u == keyboardModel) {
            return;
        }
        this.f155987u = keyboardModel;
        int height = this.f155986t.getHeight();
        if (height == 0) {
            height = qa00.m175859d(220.0f);
        }
        int iIntValue = this.f155989w;
        if (iIntValue == 0) {
            act();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f155986t.getHeight() != iIntValue) {
            bnl0.m105505C0(this.f155986t, iIntValue);
        }
        float translationY = this.f155979m.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f155979m.setTranslationY(f2);
        int i = C19535b.f155994a[keyboardModel.ordinal()];
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
        it0.m142009C(this.f155988v);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f155988v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f155988v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.o7n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f145283a.m175690b0(valueAnimator);
            }
        });
        this.f155988v.start();
    }

    /* JADX INFO: renamed from: l0 */
    private void m175680l0(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f48606c.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m175680l0((ViewGroup) viewGroup.getParent());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((e7n) this.f48605b).act();
    }

    /* JADX INFO: renamed from: Q */
    public final void m175681Q(View view) {
        r7n.m180161a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m175682R(String str) {
        VEditText vEditText = this.f155983q;
        if (vEditText == null || vEditText.getText() == null || !TextUtils.equals(str, j35.m143317b(this.f155983q.getText().toString()))) {
            return;
        }
        this.f155983q.setText("");
    }

    /* JADX INFO: renamed from: S */
    public void m175683S(boolean z) {
        ImageView imageView = this.f155984r;
        if (imageView == null) {
            return;
        }
        if (z) {
            bnl0.m105524M(imageView, true);
            return;
        }
        bnl0.m105524M(imageView, false);
        if (this.f155987u == VoiceChatInputView.KeyboardModel.EMOJI) {
            this.f155984r.setImageResource(obc0.f146111M1);
            mo73021p();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m175684T() {
        VFrame vFrame = this.f155980n;
        Property<View, Integer> property = gt0.f106352g;
        Animator animatorM132169o = gt0.m132169o(vFrame, property, 0, qa00.m175859d(49.0f));
        VFrame vFrame2 = this.f155980n;
        Property property2 = View.ALPHA;
        Animator duration = gt0.m132180z(animatorM132169o, gt0.m132168n(vFrame2, property2, 0.0f, 1.0f)).setDuration(180L);
        this.f155990x = duration;
        Interpolator interpolator = gt0.f106349d;
        duration.setInterpolator(interpolator);
        gt0.m132176v(this.f155990x, new Runnable() { // from class: l.p7n
            @Override // java.lang.Runnable
            public final void run() {
                this.f150951a.m175688Z();
            }
        });
        Animator duration2 = gt0.m132180z(gt0.m132169o(this.f155980n, property, qa00.m175859d(49.0f), qa00.m175859d(0.0f)), gt0.m132168n(this.f155980n, property2, 1.0f, 0.0f)).setDuration(120L);
        this.f155991y = duration2;
        duration2.setInterpolator(interpolator);
        gt0.m132160f(this.f155991y, new Runnable() { // from class: l.g7n
            @Override // java.lang.Runnable
            public final void run() {
                this.f102592a.m175689a0();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public boolean m175685U() {
        return this.f155982p.isChecked();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m175686X(View view) {
        m175691c0();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m175687Y(CompoundButton compoundButton, boolean z) {
        ((e7n) this.f48605b).f92459t = z;
        it0.m142008B(this.f155990x);
        it0.m142008B(this.f155991y);
        if (z) {
            this.f155990x.start();
            ((e7n) this.f48605b).f92460u.m108452X3();
            if (this.f155987u == VoiceChatInputView.KeyboardModel.EMOJI) {
                act().showInput(this.f155983q, 0);
                this.f155983q.requestFocus();
            }
        } else {
            this.f155991y.start();
            ((e7n) this.f48605b).f92460u.f80506k = null;
        }
        wv4.m207988a(this.f48605b, z);
        m175698m0();
        if (z) {
            return;
        }
        m175692d0(((e7n) this.f48605b).f92458s);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m175688Z() {
        m175694f0(false);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m175689a0() {
        m175694f0(true);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m175690b0(ValueAnimator valueAnimator) {
        this.f155979m.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m175691c0() {
        VoiceChatInputView.KeyboardModel keyboardModel = this.f155987u;
        if (keyboardModel == VoiceChatInputView.KeyboardModel.NONE) {
            m175697j0();
        } else if (keyboardModel == VoiceChatInputView.KeyboardModel.INPUT) {
            m175697j0();
            act().hideInput(this.f155983q);
        } else {
            act().showInput(this.f155983q, 0);
            this.f155983q.requestFocus();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m175692d0(String str) {
        this.f155983q.setHint(str);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        mo73021p();
    }

    /* JADX INFO: renamed from: e0 */
    public void m175693e0(boolean z, CharSequence charSequence) {
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f155973B;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f155983q.setText(charSequence);
        this.f155983q.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: f0 */
    public void m175694f0(boolean z) {
        ChatInputViewGroup chatInputViewGroup = this.f155981o;
        if (z) {
            chatInputViewGroup.setBackgroundResource(obc0.f146517v);
        } else {
            chatInputViewGroup.setBackgroundColor(Color.parseColor("#19191e"));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m175695h0(boolean z) {
        this.f155982p.setChecked(z);
    }

    /* JADX INFO: renamed from: i0 */
    public void m175696i0(boolean z) {
        m175680l0(this.f155978l);
        m175695h0(z && ((e7n) this.f48605b).f92459t);
        m175694f0(!this.f155982p.isChecked());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m175697j0() {
        if (this.f155982p.isChecked()) {
            this.f155982p.setChecked(false);
        }
        m175679k0(VoiceChatInputView.KeyboardModel.EMOJI);
        i4g0.m138520r("e_intl_emoticon_panel_enter_click", "p_intl_emoticon_panel_show");
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        this.f48608e.setUpKeyboardDetectorLayout(new View(this.f48608e), this.f155977k, new z20() { // from class: l.l7n
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f130367a.m175678g0((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m175681Q(view);
        m175684T();
        this.f155978l.setOnClickListener(new View.OnClickListener() { // from class: l.f7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f97575a.m175676V(view2);
            }
        });
        this.f155981o.setOnClickListener(new View.OnClickListener() { // from class: l.h7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q7n.m175665F(view2);
            }
        });
        bnl0.m105509E0(this.f155985s, new View.OnClickListener() { // from class: l.i7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f113276a.m175677W(view2);
            }
        });
        this.f155983q.addTextChangedListener(new C19534a());
        bnl0.m105524M(this.f155984r, guk0.m132329h(((rwn0) ((e7n) this.f48605b).m213810E2()).m183423Y2()));
        bnl0.m105509E0(this.f155984r, new View.OnClickListener() { // from class: l.j7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f118698a.m175686X(view2);
            }
        });
        this.f155982p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.k7n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f124279a.m175687Y(compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m175698m0() {
        this.f155983q.setFilters(new InputFilter[]{m175685U() ? this.f155976A : this.f155992z});
        f155975D = m175685U() ? f155974C : f155973B;
    }

    /* JADX INFO: renamed from: l.q7n$a */
    public class C19534a implements TextWatcher {
        public C19534a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = j35.m143317b(editable.toString()).length();
            q7n q7nVar = q7n.this;
            if (length > 0) {
                q7nVar.f155985s.setEnabled(true);
            } else {
                q7nVar.f155985s.setEnabled(false);
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
