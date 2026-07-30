package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.p051p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VEditText;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ix4 extends LiveMenuDialogHolder<mw4<dw40>> {

    /* JADX INFO: renamed from: E */
    public static int f117314E = 40;

    /* JADX INFO: renamed from: F */
    public static int f117315F = 22;

    /* JADX INFO: renamed from: G */
    public static int f117316G = 40;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f117317A;

    /* JADX INFO: renamed from: B */
    public int f117318B;

    /* JADX INFO: renamed from: C */
    public final InputFilter f117319C;

    /* JADX INFO: renamed from: D */
    public final InputFilter f117320D;

    /* JADX INFO: renamed from: k */
    public VoiceChatKeyboardRoot f117321k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f117322l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f117323m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f117324n;

    /* JADX INFO: renamed from: o */
    public DanmakuTagViewContainer f117325o;

    /* JADX INFO: renamed from: p */
    public NormalDanmakuImgViewGroup f117326p;

    /* JADX INFO: renamed from: q */
    public ChatInputViewGroup f117327q;

    /* JADX INFO: renamed from: r */
    public DanmakuToggleButton f117328r;

    /* JADX INFO: renamed from: s */
    public VEditText f117329s;

    /* JADX INFO: renamed from: t */
    public ImageView f117330t;

    /* JADX INFO: renamed from: u */
    public VText f117331u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f117332v;

    /* JADX INFO: renamed from: w */
    public VPager f117333w;

    /* JADX INFO: renamed from: x */
    public ValueAnimator f117334x;

    /* JADX INFO: renamed from: y */
    public ValueAnimator f117335y;

    /* JADX INFO: renamed from: z */
    public VoiceChatInputView.KeyboardModel f117336z;

    /* JADX INFO: renamed from: l.ix4$b */
    public class C17814b implements z20<Boolean, Integer> {
        public C17814b() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            ix4.this.m142427h0(bool, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.ix4$c */
    public class C17815c implements ValueAnimator.AnimatorUpdateListener {
        public C17815c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ix4.this.f117323m.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.ix4$d */
    public static /* synthetic */ class C17816d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117340a;

        static {
            int[] iArr = new int[VoiceChatInputView.KeyboardModel.values().length];
            f117340a = iArr;
            try {
                iArr[VoiceChatInputView.KeyboardModel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117340a[VoiceChatInputView.KeyboardModel.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117340a[VoiceChatInputView.KeyboardModel.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ix4(@NonNull final mw4 mw4Var) {
        super(yec0.f198907S, jgc0.f120700g, mw4Var.act(), mw4Var);
        this.f117334x = ValueAnimator.ofInt(0, 490);
        this.f117335y = ValueAnimator.ofInt(0, 180);
        this.f117336z = VoiceChatInputView.KeyboardModel.NONE;
        this.f117317A = null;
        this.f117319C = new qcr(f117314E * 2, new x20() { // from class: l.cx4
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(ix4.f117314E)));
            }
        });
        this.f117320D = new qcr(f117315F * 2, new x20() { // from class: l.dx4
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(ix4.f117315F)));
            }
        });
        m73027z(LiveDialogEnum.CHAT_INPUT);
        this.f117334x.setDuration(490L);
        this.f117334x.setInterpolator(new LinearInterpolator());
        gt0.m132177w(this.f117334x, new Runnable() { // from class: l.ex4
            @Override // java.lang.Runnable
            public final void run() {
                mw4Var.mo112749a4(true);
            }
        }, new Runnable() { // from class: l.fx4
            @Override // java.lang.Runnable
            public final void run() {
                mw4Var.mo95792Y3(true);
            }
        });
        this.f117334x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gx4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                mw4Var.mo95793Z3(true, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f117335y.setDuration(180L);
        this.f117335y.setInterpolator(new LinearInterpolator());
        gt0.m132177w(this.f117335y, new Runnable() { // from class: l.hx4
            @Override // java.lang.Runnable
            public final void run() {
                mw4Var.mo112749a4(false);
            }
        }, new Runnable() { // from class: l.uw4
            @Override // java.lang.Runnable
            public final void run() {
                mw4Var.mo95792Y3(false);
            }
        });
        this.f117335y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vw4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                mw4Var.mo95793Z3(false, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m142401H(View view) {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m142408O() {
    }

    /* JADX INFO: renamed from: X */
    private void m142415X() {
        if (this.f117335y.isRunning()) {
            this.f117335y.cancel();
        }
        if (this.f117334x.isRunning()) {
            this.f117334x.cancel();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((mw4) this.f48605b).act();
    }

    /* JADX INFO: renamed from: V */
    public final void m142416V(View view) {
        jx4.m147284a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public void m142418Y(String str) {
        VEditText vEditText = this.f117329s;
        if (vEditText == null || vEditText.getText() == null || !TextUtils.equals(str, j35.m143317b(this.f117329s.getText().toString()))) {
            return;
        }
        this.f117329s.setText("");
    }

    /* JADX INFO: renamed from: Z */
    public boolean m142419Z() {
        return this.f117328r.m73706d();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m142420a0(View view) {
        ((mw4) this.f48605b).m160441n4();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m142421b0(View view) {
        if (j35.m143323h()) {
            ((mw4) this.f48605b).m163853b4();
        } else {
            ((mw4) this.f48605b).m160436G4(j35.m143317b(this.f117329s.getText().toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m142422c0(View view) {
        VoiceChatInputView.KeyboardModel keyboardModel = this.f117336z;
        if (keyboardModel == VoiceChatInputView.KeyboardModel.NONE) {
            m142429j0(VoiceChatInputView.KeyboardModel.EMOJI);
        } else if (keyboardModel == VoiceChatInputView.KeyboardModel.INPUT) {
            m142429j0(VoiceChatInputView.KeyboardModel.EMOJI);
            getAct().hideInput(this.f117329s);
        } else {
            getAct().showInput(this.f117329s, 0);
            this.f117329s.requestFocus();
        }
        if (NullChecker.m82486a(((mw4) this.f48605b).m213810E2()) && (((mw4) this.f48605b).m213810E2() instanceof dw40)) {
            i4g0.m138523u("e_audio_chat_sticker_button", ((mw4) this.f48605b).mo78457R2(), jyb.m147494Y("anchorId", ((dw40) ((mw4) this.f48605b).m213810E2()).m168526j0()), jyb.m147494Y("liveId", ((dw40) ((mw4) this.f48605b).m213810E2()).m202191k()), jyb.m147494Y("roomId", ((dw40) ((mw4) this.f48605b).m213810E2()).m202194o()));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m142423d0(boolean z) {
        mw4.f139010u = z;
        m142415X();
        if (z) {
            this.f117334x.start();
        } else {
            this.f117335y.start();
        }
        wv4.m207988a(this.f48605b, z);
        m142431l0();
        if (z) {
            return;
        }
        m142425f0(((mw4) this.f48605b).f139017p);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        mo73021p();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m142424e0(String str) {
        if (q8g0.m175778J(this.f117329s.getText().toString() + str) > f117316G * 2) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(f117316G)));
        } else {
            this.f117329s.getText().insert(this.f117329s.getSelectionStart(), str);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m142425f0(String str) {
        this.f117329s.setHint(str);
    }

    /* JADX INFO: renamed from: g0 */
    public void m142426g0(boolean z, CharSequence charSequence) {
        if (!z || charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int i = f117314E;
        if (length > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        this.f117329s.setText(charSequence);
        this.f117329s.setSelection(charSequence.length());
    }

    /* JADX INFO: renamed from: h0 */
    public final void m142427h0(Boolean bool, int i) {
        if (i > 0 && this.f117318B == 0) {
            this.f117318B = i;
        }
        if (bool.booleanValue()) {
            ((mw4) this.f48605b).m160432C4(Boolean.TRUE, i);
            m142429j0(VoiceChatInputView.KeyboardModel.INPUT);
            return;
        }
        VoiceChatInputView.KeyboardModel keyboardModel = this.f117336z;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        if (keyboardModel == keyboardModel2) {
            m142429j0(keyboardModel2);
        } else {
            m142429j0(VoiceChatInputView.KeyboardModel.NONE);
            ((mw4) this.f48605b).m160432C4(Boolean.FALSE, i);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m142428i0(boolean z) {
        bnl0.m105524M(this.f117328r, z);
        DanmakuToggleButton danmakuToggleButton = this.f117328r;
        if (z) {
            danmakuToggleButton.setOnCheckedChangeListener(new DanmakuToggleButton.InterfaceC12901a() { // from class: l.ww4
                @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton.InterfaceC12901a
                /* JADX INFO: renamed from: a */
                public final void mo73708a(boolean z2) {
                    this.f191154a.m142423d0(z2);
                }
            });
        } else {
            danmakuToggleButton.setOnCheckedChangeListener(null);
        }
        m142430k0(this.f117322l);
        if (wft.m206159b(2)) {
            this.f117333w.setAdapter(zrv.f205799a.m207680m(getAct(), new y20() { // from class: l.xw4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196455a.m142424e0((String) obj);
                }
            }, this.f117329s, zrv.f205799a.m207651V().isFemale() ? oze.f149867e : oze.f149868f, new ArrayList(), new x20() { // from class: l.yw4
                @Override // p153l.x20
                public final void call() {
                    ix4.m142408O();
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m142429j0(VoiceChatInputView.KeyboardModel keyboardModel) {
        float f;
        ImageView imageView = this.f117330t;
        VoiceChatInputView.KeyboardModel keyboardModel2 = VoiceChatInputView.KeyboardModel.EMOJI;
        imageView.setImageResource(keyboardModel == keyboardModel2 ? obc0.f146099L1 : obc0.f146111M1);
        bnl0.m105525M0(this.f117333w, keyboardModel == keyboardModel2 || this.f117336z == keyboardModel2);
        if (this.f117336z == keyboardModel) {
            return;
        }
        this.f117336z = keyboardModel;
        int height = this.f117332v.getHeight();
        if (height == 0) {
            height = qa00.m175859d(220.0f);
        }
        int iIntValue = this.f117318B;
        if (iIntValue == 0) {
            getAct();
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        if (this.f117332v.getHeight() != iIntValue) {
            bnl0.m105505C0(this.f117332v, iIntValue);
        }
        float translationY = this.f117323m.getTranslationY();
        float f2 = (iIntValue - height) + translationY;
        this.f117323m.setTranslationY(f2);
        int i = C17816d.f117340a[keyboardModel.ordinal()];
        if (i != 1) {
            f = 0.0f;
            if (i != 2) {
            }
        } else {
            f = iIntValue;
        }
        ValueAnimator valueAnimator = this.f117317A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f117317A.cancel();
        }
        if (translationY == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        this.f117317A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f117317A.addUpdateListener(new C17815c());
        this.f117317A.start();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m142430k0(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup != this.f48606c.getWindow().getDecorView() && (viewGroup.getParent() instanceof ViewGroup)) {
            m142430k0((ViewGroup) viewGroup.getParent());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        this.f48608e.setUpKeyboardDetectorLayout(new View(this.f48608e), this.f117321k, new C17814b());
    }

    /* JADX INFO: renamed from: l0 */
    public void m142431l0() {
        this.f117329s.setFilters(new InputFilter[]{m142419Z() ? this.f117320D : this.f117319C});
        f117316G = m142419Z() ? f117315F : f117314E;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m142416V(view);
        this.f117322l.setOnClickListener(new View.OnClickListener() { // from class: l.tw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f176371a.m142420a0(view2);
            }
        });
        this.f117327q.setOnClickListener(new View.OnClickListener() { // from class: l.zw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ix4.m142401H(view2);
            }
        });
        bnl0.m105509E0(this.f117331u, new View.OnClickListener() { // from class: l.ax4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f73817a.m142421b0(view2);
            }
        });
        this.f117329s.addTextChangedListener(new C17813a());
        bnl0.m105524M(this.f117330t, false);
        bnl0.m105509E0(this.f117330t, new View.OnClickListener() { // from class: l.bx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f78809a.m142422c0(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mw4<dw40> mw4Var) {
    }

    /* JADX INFO: renamed from: l.ix4$a */
    public class C17813a implements TextWatcher {
        public C17813a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = j35.m143317b(editable.toString()).length();
            ix4 ix4Var = ix4.this;
            if (length > 0) {
                ix4Var.f117331u.setEnabled(true);
            } else {
                ix4Var.f117331u.setEnabled(false);
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
