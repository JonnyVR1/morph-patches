package p003l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.KeyboardFrameWithShadowOutside;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MultiContentVoiceCall;
import com.p000p1.mobile.putong.core.p001ui.messages.aichat.AIChatView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p1.mobile.putong.core.ui.messages.recycler.opt.TantanListView;
import com.p1.mobile.putong.core.ui.messages.view.KeyboardMediaLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.j760;
import l.jig;
import l.l6c0;
import l.nlm0;
import l.o6j0;
import l.o7r;
import l.pxz;
import l.roj0;
import l.t100;
import l.tqm0;
import l.utl;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class i6z extends AbstractC0438n2 {

    /* JADX INFO: renamed from: n */
    public static final int f4354n = t100.d(320.0f);

    /* JADX INFO: renamed from: b */
    public MessagesAct f4356b;

    /* JADX INFO: renamed from: c */
    public y5z f4357c;

    /* JADX INFO: renamed from: d */
    public hkx f4358d;

    /* JADX INFO: renamed from: g */
    public Keyboard f4361g;

    /* JADX INFO: renamed from: i */
    public dj10 f4363i;

    /* JADX INFO: renamed from: j */
    public KeyboardMediaLayout f4364j;

    /* JADX INFO: renamed from: k */
    public View f4365k;

    /* JADX INFO: renamed from: a */
    public Rect f4355a = new Rect();

    /* JADX INFO: renamed from: e */
    public boolean f4359e = false;

    /* JADX INFO: renamed from: f */
    public boolean f4360f = false;

    /* JADX INFO: renamed from: h */
    public boolean f4362h = true;

    /* JADX INFO: renamed from: l */
    public int f4366l = 0;

    /* JADX INFO: renamed from: m */
    public h30<Boolean, Integer, Boolean, Integer> f4367m = new h30() { // from class: l.e6z
        @Override // p003l.h30
        /* JADX INFO: renamed from: b */
        public final void mo3798b(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f3208a.m5092N((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
        }
    };

    /* JADX INFO: renamed from: l.i6z$a */
    public class C0344a implements ValueAnimator.AnimatorUpdateListener {
        public C0344a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i6z.this.f4357c.m8915Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.i6z$b */
    public class C0345b implements ValueAnimator.AnimatorUpdateListener {
        public C0345b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i6z.this.f4357c.m8915Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.i6z$c */
    public class C0346c implements ud50 {

        /* JADX INFO: renamed from: a */
        public PointF f4370a = null;

        public C0346c() {
        }

        @Override // p003l.ud50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int iD = t100.d(4.0f);
            if (CoreModule.P().i().E()) {
                if (i6z.this.f4357c.m6497e0().mo2066l().m4231e4()) {
                    iD = t100.d(8.0f);
                }
                int action = motionEvent.getAction();
                i6z i6zVar = i6z.this;
                if (action != 2) {
                    i6zVar.f4359e = false;
                    i6z.this.f4360f = false;
                } else if (i6zVar.f4359e) {
                    return true;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.f4370a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else if (NullChecker.a(this.f4370a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                PointF pointF = this.f4370a;
                RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                float f = iD;
                boolean z = ((float) Math.sqrt((double) ((rectF.width() * rectF.width()) + (rectF.height() * rectF.height())))) > f;
                if (CoreModule.P().i().E() && i6z.this.f4357c.m6497e0().mo2066l().m4231e4()) {
                    z = Math.abs(motionEvent.getY() - this.f4370a.y) > f;
                }
                if (Math.abs(motionEvent.getX() - this.f4370a.x) > t100.a && NullChecker.a(i6z.this.f4357c.m6497e0().mo2066l().m4309t7().f7686r1) && NullChecker.a(i6z.this.f4357c.m6497e0().mo2066l().m4309t7().f7686r1.f4989d)) {
                    z = false;
                }
                if (z) {
                    if (CoreModule.P().i().E()) {
                        i6z.this.f4360f = true;
                    }
                    i6z.this.mo5108k(0, -1);
                    i6z.this.f4357c.m6497e0().mo2066l().m4309t7().m7965y0(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.i6z$d */
    public class C0347d implements ud50 {

        /* JADX INFO: renamed from: a */
        public PointF f4372a = null;

        /* JADX INFO: renamed from: b */
        public boolean f4373b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tqz f4374c;

        public C0347d(tqz tqzVar) {
            this.f4374c = tqzVar;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m5113b(Rect rect, MotionEvent motionEvent, View view) {
            xdl0.H(view, rect, i6z.this.f4355a);
            return ((view instanceof ListView) || !(view.isClickable() || (view.isLongClickable() && this.f4373b))) ? Boolean.FALSE : Boolean.valueOf(i6z.this.f4355a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
        }

        @Override // p003l.ud50
        public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
            View viewQ;
            if (motionEvent.getAction() == 0) {
                this.f4372a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else {
                boolean z = true;
                if (NullChecker.a(this.f4372a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    PointF pointF = this.f4372a;
                    RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                    if (((float) Math.sqrt((rectF.width() * rectF.width()) + (rectF.height() * rectF.height()))) > t100.d(4.0f)) {
                        i6z.this.mo5108k(0, -1);
                        i6z.this.f4357c.m6497e0().mo2066l().m4309t7().m7965y0(false);
                    }
                } else if (NullChecker.a(this.f4372a) && motionEvent.getAction() == 1) {
                    try {
                        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                            z = false;
                        }
                        this.f4373b = z;
                        final Rect rect = new Rect();
                        this.f4374c.f7635T.getWindowVisibleDisplayFrame(rect);
                        viewQ = xdl0.q(this.f4374c.f7635T, new w9j() { // from class: l.j6z
                            @Override // p003l.w9j
                            public final Object call(Object obj) {
                                return this.f4580a.m5113b(rect, motionEvent, (View) obj);
                            }
                        });
                    } catch (Exception e) {
                        CrashHelper.c(new Exception("MessagesAct _list_child dispatchTouchEvent:" + e.getMessage(), e));
                        viewQ = null;
                    }
                    if (viewQ == null) {
                        i6z.this.mo5108k(0, -1);
                    }
                }
            }
            return false;
        }
    }

    public i6z(MessagesAct messagesAct) {
        this.f4356b = messagesAct;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5075q(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f7644X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m5081y(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f7644X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m5082z(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f7644X0.setLayoutParams(layoutParams);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5083C0() {
        return this.f4356b;
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f4356b;
    }

    /* JADX INFO: renamed from: G */
    public final void m5085G(tqz tqzVar, float f) {
        if (xdl0.O0(tqzVar.f7681p0)) {
            VLinear vLinear = tqzVar.f7681p0;
            vLinear.setTranslationY(vLinear.getTranslationY() + f);
        }
        if (NullChecker.a(tqzVar.f7686r1)) {
            LinearLayout linearLayout = tqzVar.f7608G0;
            linearLayout.setTranslationY(linearLayout.getTranslationY() + f);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m5106i1(y5z y5zVar) {
        this.f4357c = y5zVar;
    }

    /* JADX INFO: renamed from: I */
    public final void m5087I() {
        m5088J();
        this.f4364j.e(this.f4358d.m4982d(this.f4357c));
    }

    /* JADX INFO: renamed from: J */
    public final void m5088J() {
        if (this.f4364j == null) {
            if (this.f4358d == null) {
                this.f4358d = new hkx(this.f4356b);
            }
            MessageBar messageBarM4844t0 = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0();
            this.f4364j = o7r.a(act()).inflate(l6c0.m3, (ViewGroup) messageBarM4844t0.getHidden_slide_out(), false);
            messageBarM4844t0.getHidden_slide_out().addView(this.f4364j);
            this.f4365k = this.f4364j;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m5089K() {
        AIChatView aiChatview = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0().getAiChatview();
        xdl0.M(aiChatview, false);
        aiChatview.m2130d(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m5090L() {
        this.f4356b.alwaysHideInput();
        mo5108k(1, -1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m5091M() {
        this.f4356b.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m5092N(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        xsy xsyVarMo2046A0 = this.f4357c.m6497e0().mo2046A0();
        if (bool.booleanValue()) {
            CoreModule.c.f0.e0.onNext(roj0.a);
        } else {
            CoreModule.c.f0.d0.onNext(roj0.a);
            xsyVarMo2046A0.m6499g0().m4836p0();
        }
        MessageBar messageBarM4844t0 = xsyVarMo2046A0.m6499g0().m4844t0();
        if (CoreModule.P().i().E() && messageBarM4844t0 != null && messageBarM4844t0.getBar_center_text().hasFocus() && unk.m8170r()) {
            return;
        }
        this.f4357c.m8914P0(bool.booleanValue());
        int iMax = Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        if (NullChecker.a(messageBarM4844t0) && NullChecker.a(messageBarM4844t0.getHidden_slide_out()) && messageBarM4844t0.getHidden_slide_out().getLayoutParams().height != iMax) {
            ViewGroup.LayoutParams layoutParams = messageBarM4844t0.getHidden_slide_out().getLayoutParams();
            layoutParams.height = iMax;
            messageBarM4844t0.getHidden_slide_out().setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) messageBarM4844t0.getLayoutParams();
            marginLayoutParams.bottomMargin = -iMax;
            messageBarM4844t0.setLayoutParams(marginLayoutParams);
        }
        dqy dqyVarM4846u0 = xsyVarMo2046A0.m6499g0().m4846u0();
        if (!bool.booleanValue() && this.f4357c.m8922y0() == 4 && (!NullChecker.a(dqyVarM4846u0) || !dqyVarM4846u0.m3703d0())) {
            KeyboardFrameWithShadowOutside hidden_slide_out = messageBarM4844t0.getHidden_slide_out();
            int i = f4354n;
            xdl0.C0(hidden_slide_out, i);
            xdl0.U(messageBarM4844t0, -i);
        }
        xsyVarMo2046A0.m6499g0().m4852x0();
        if (bool.booleanValue()) {
            m5098T(2, num.intValue(), bool2.booleanValue(), num2.intValue());
            if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0()) {
                dqyVarM4846u0.m3673D0();
                return;
            }
            return;
        }
        if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0() && this.f4357c.m8922y0() != 1 && this.f4357c.m8922y0() != 3) {
            dqyVarM4846u0.m3679G0();
        }
        if (this.f4357c.m8922y0() == 2) {
            m5098T(0, num.intValue(), bool2.booleanValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m5093O(MessageBar messageBar) {
        if (this.f4357c.m8922y0() == 2) {
            if (NullChecker.a(this.f4361g)) {
                xdl0.M0(this.f4361g, false);
            }
            if (NullChecker.a(this.f4363i)) {
                xdl0.M0(this.f4363i.m3587a(), false);
            }
            xdl0.M0(messageBar.getHidden_slide_out(), false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m5094P() {
        this.f4357c.m6497e0().mo2066l().f3561s.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m5095Q(boolean z) {
        if (z) {
            return;
        }
        mo5108k(0, -1);
    }

    /* JADX INFO: renamed from: R */
    public final void m5096R(int i) {
        if (CoreModule.P().i().M()) {
            this.f4357c.m6497e0().mo2046A0();
            if (i != 1) {
                return;
            }
            o6j0.c("e_expression_button", "p_chat_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m5097S() {
        AIChatView aiChatview = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0().getAiChatview();
        xdl0.M(aiChatview, true);
        aiChatview.m2130d(false);
    }

    /* JADX INFO: renamed from: T */
    public void m5098T(int i, int i2, boolean z, int i3) {
        int height;
        xsy xsyVar;
        int i4;
        int iMin;
        int listRenderHeight;
        int iD;
        m5096R(i);
        if (i > 0) {
            this.f4357c.m6497e0().mo2066l().f3561s.onNext(Boolean.TRUE);
        }
        if (i == 0 && this.f4357c.m8922y0() == 2 && this.f4357c.m8904D0()) {
            mo5103e();
            return;
        }
        xsy xsyVarMo2046A0 = this.f4357c.m6497e0().mo2046A0();
        final MessageBar messageBarM4844t0 = xsyVarMo2046A0.m6499g0().m4844t0();
        dqy dqyVarM4846u0 = xsyVarMo2046A0.m6499g0().m4846u0();
        if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0() && i == 0) {
            xsyVarMo2046A0.m6499g0().m4846u0().m3679G0();
        }
        final tqz tqzVarM4309t7 = this.f4357c.m6497e0().mo2066l().m4309t7();
        int iD2 = xdl0.O0(messageBarM4844t0.getActionLayout()) ? t100.d(48.0f) : 0;
        if (i == 1) {
            messageBarM4844t0.mo1924j(true, dqyVarM4846u0.m3703d0());
        } else {
            messageBarM4844t0.mo1924j(false, dqyVarM4846u0.m3703d0());
        }
        if (this.f4357c.m8922y0() == 4 && i == 0) {
            m5089K();
        }
        if (i == 4) {
            messageBarM4844t0.mo1923i(true, dqyVarM4846u0.m3703d0());
            xdl0.M0(messageBarM4844t0.getHidden_slide_out(), true);
            height = f4354n;
            xdl0.C0(messageBarM4844t0.getHidden_slide_out(), height);
            xdl0.U(messageBarM4844t0, -height);
        } else {
            int iMax = Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
            int i5 = iMax != messageBarM4844t0.getHidden_slide_out().getHeight() ? iMax : 0;
            xdl0.C0(messageBarM4844t0.getHidden_slide_out(), iMax);
            xdl0.U(messageBarM4844t0, -iMax);
            height = i5;
        }
        if (i == 2) {
            height = i2;
        } else if (height <= 0) {
            height = messageBarM4844t0.getHidden_slide_out().getHeight();
        }
        if (i == 2) {
            xsyVar = xsyVarMo2046A0;
            this.f4356b.postDelayed(new Runnable() { // from class: l.z5z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9264a.m5093O(messageBarM4844t0);
                }
            }, 300L);
        } else {
            xsyVar = xsyVarMo2046A0;
            if (i == 1 || i == 4 || i == 3) {
                messageBarM4844t0.getHidden_slide_out().setVisibility(0);
            }
        }
        if (i == 0 && this.f4357c.m8922y0() == 2) {
            if (NullChecker.a(this.f4361g)) {
                xdl0.M0(this.f4361g, false);
            }
            if (NullChecker.a(this.f4365k)) {
                xdl0.M0(this.f4365k, false);
            }
        } else if (i == 1) {
            this.f4357c.m8920u0();
            xdl0.M0(this.f4361g, true);
            if (NullChecker.a(this.f4365k)) {
                xdl0.M0(this.f4365k, false);
            }
        } else if (i == 4) {
            m5097S();
            if (NullChecker.a(this.f4361g)) {
                xdl0.M0(this.f4361g, false);
            }
            if (NullChecker.a(this.f4365k)) {
                xdl0.M0(this.f4365k, false);
            }
        } else if (i == 3) {
            m5087I();
            if (NullChecker.a(this.f4361g)) {
                xdl0.M0(this.f4361g, false);
            }
            xdl0.M0(this.f4365k, true);
            if (nlm0.c()) {
                dj10 dj10Var = this.f4363i;
                if ((dj10Var instanceof MultiContentVoiceCall) && ((MultiContentVoiceCall) dj10Var).f1547b.getCurrentItem() == 0) {
                    o6j0.h("e_chat_more_voice_call", "p_chat_view", new o6j0.a[0]);
                }
            }
            if (CoreModule.P().i().E() && tqzVarM4309t7.f7682p1.m4231e4()) {
                zvf0.A("e_send_red_packet", "p_group_chat_view", new j760[]{vwb.Y("groupchat_id", tqzVarM4309t7.f7682p1.f3542b)});
            }
        }
        if ((i == 1 && !this.f4361g.m1890r()) || i == 2) {
            xdl0.A(messageBarM4844t0.getBar_center_text());
        }
        jig jigVar = new jig();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tqzVarM4309t7.f7644X0.getLayoutParams();
        int iD3 = CoreModule.P().i().hm() ? (xdl0.O0(messageBarM4844t0.getActionLayout()) ? t100.d(48.0f) : 0) - iD2 : 0;
        if (iD3 != 0) {
            MessageLayout messageLayout = tqzVarM4309t7.f7635T;
            float f = iD3;
            messageLayout.setTranslationY(messageLayout.getTranslationY() + f);
            messageBarM4844t0.setTranslationY(messageBarM4844t0.getTranslationY() + f);
        }
        if (i != 0) {
            if (z) {
                MessageLayout messageLayout2 = tqzVarM4309t7.f7635T;
                float f2 = i3;
                messageLayout2.setTranslationY(messageLayout2.getTranslationY() + f2);
                messageBarM4844t0.setTranslationY(messageBarM4844t0.getTranslationY() + f2);
                this.f4357c.m8915Q0(messageBarM4844t0.getTranslationY());
            }
            int iMax2 = iD3 + height;
            if (CoreModule.P().i().G1()) {
                int[] iArr = new int[2];
                messageBarM4844t0.getLocationOnScreen(iArr);
                int height2 = xdl0.O0(tqzVarM4309t7.f7624N0) ? tqzVarM4309t7.f7624N0.getHeight() : 0;
                int[] iArr2 = new int[2];
                tqzVarM4309t7.f7677n1.getRealView().getLocationOnScreen(iArr2);
                int iM8922y0 = this.f4357c.m8922y0();
                utl utlVar = tqzVarM4309t7.f7677n1;
                if (iM8922y0 != 0) {
                    listRenderHeight = (((iArr[1] - iArr2[1]) - utlVar.getListRenderHeight()) + t100.d(240.0f)) - ((int) messageBarM4844t0.getTranslationY());
                    iD = (int) tqzVarM4309t7.f7635T.getTranslationY();
                } else {
                    listRenderHeight = (iArr[1] - iArr2[1]) - utlVar.getListRenderHeight();
                    iD = t100.d(240.0f);
                }
                int height3 = listRenderHeight + iD;
                if (CoreModule.P().i().p4()) {
                    height3 = tqzVarM4309t7.f7677n1.getRealView().getHeight() - tqzVarM4309t7.f7677n1.getListRenderHeight();
                    iMin = Math.min(height + height2, height3);
                } else {
                    iMin = 0;
                }
                iMax2 = Math.max(((height - height3) + height2) - ((tqzVarM4309t7.f7627P == null || tqzVarM4309t7.f7677n1.getRealView().canScrollVertically(1) || tqzVarM4309t7.f7677n1.getRealView().canScrollVertically(-1)) ? 0 : tqzVarM4309t7.f7627P.getHeight()), 0);
                i4 = height - iMax2;
                this.f4366l = tqzVarM4309t7.f7677n1.getListRenderHeight();
            } else {
                i4 = 0;
                iMin = 0;
            }
            Animator animatorO = CoreModule.P().i().p4() ? bt0.o(tqzVarM4309t7.f7677n1.getRealView(), TantanListView.v, new int[]{iMin}) : bt0.j(390);
            float f3 = -height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(messageBarM4844t0.getTranslationY(), f3);
            valueAnimatorOfFloat.addUpdateListener(new C0344a());
            float f4 = -iMax2;
            float f5 = -i4;
            bt0.u(true, jigVar, 390L, new Animator[]{animatorO, bt0.q(xsyVar.m6499g0().m4840r0(), "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7635T, "translationY", new float[]{f4}), bt0.q(tqzVarM4309t7.f7630Q0, "translationY", new float[]{f4}), bt0.q(tqzVarM4309t7.f7608G0, "translationY", new float[]{f5}), bt0.q(tqzVarM4309t7.f7681p0, "translationY", new float[]{f5}), bt0.q(tqzVarM4309t7.f7670k0, "translationY", new float[]{f5}), bt0.q(tqzVarM4309t7.f7611H0, "translationY", new float[]{f5}), xdl0.O0(tqzVarM4309t7.f7624N0) ? bt0.q(tqzVarM4309t7.f7624N0, "translationY", new float[]{f5}) : bt0.j(390), valueAnimatorOfFloat, bt0.q(messageBarM4844t0, "translationY", new float[]{f3})}).start();
            if (NullChecker.a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tqzVarM4309t7.f7644X0.getTop(), iMax2);
                valueAnimatorOfInt.setInterpolator(jigVar);
                valueAnimatorOfInt.setDuration(390L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a6z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        i6z.m5081y(layoutParams, tqzVarM4309t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt.start();
            }
        } else {
            Animator animatorO2 = CoreModule.P().i().p4() ? bt0.o(tqzVarM4309t7.f7677n1.getRealView(), TantanListView.v, new int[]{0}) : bt0.j(390);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(messageBarM4844t0.getTranslationY(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new C0345b());
            Animator animatorU = bt0.u(true, jigVar, 390L, new Animator[]{animatorO2, bt0.q(xsyVar.m6499g0().m4840r0(), "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7635T, "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7630Q0, "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7608G0, "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7681p0, "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7670k0, "translationY", new float[]{0.0f}), bt0.q(tqzVarM4309t7.f7611H0, "translationY", new float[]{0.0f}), xdl0.O0(tqzVarM4309t7.f7624N0) ? bt0.q(tqzVarM4309t7.f7624N0, "translationY", new float[]{0.0f}) : bt0.j(390), valueAnimatorOfFloat2, bt0.q(messageBarM4844t0, "translationY", new float[]{0.0f})});
            bt0.f(animatorU, new Runnable() { // from class: l.b6z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2346a.m5094P();
                }
            });
            animatorU.start();
            if (NullChecker.a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(tqzVarM4309t7.f7644X0.getTop(), 0);
                valueAnimatorOfInt2.setInterpolator(jigVar);
                valueAnimatorOfInt2.setDuration(390L);
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.c6z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        i6z.m5082z(layoutParams, tqzVarM4309t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt2.start();
            }
        }
        if (i != 2) {
            mo5103e();
            if (i != 0) {
                this.f4357c.m6497e0().mo2066l().m4193X2();
            }
        } else {
            mo5104f();
        }
        if (i != 0) {
            boolean zD = CoreModule.P().i().D();
            MessageRecyclerDispatchLinear messageRecyclerDispatchLinear = tqzVarM4309t7.f7633S;
            if (zD) {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C0346c());
                tqzVarM4309t7.f7633S.setOnTouchEventHandleListener(new tg50() { // from class: l.d6z
                    @Override // p003l.tg50
                    /* JADX INFO: renamed from: a */
                    public final void mo3519a(boolean z2) {
                        this.f2902a.m5095Q(z2);
                    }
                });
            } else {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C0347d(tqzVarM4309t7));
            }
        } else {
            this.f4360f = false;
            tqzVarM4309t7.f7633S.setOnDispatchTouchEventListener((ud50) null);
            tqzVarM4309t7.f7633S.setOnTouchEventHandleListener((tg50) null);
        }
        this.f4357c.m8916R0(i);
        tqm0.p().s();
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: a */
    public Keyboard mo5099a() {
        return this.f4361g;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: b */
    public hkx mo5100b() {
        return this.f4358d;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: c */
    public h30<Boolean, Integer, Boolean, Integer> mo5101c() {
        return this.f4367m;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: d */
    public boolean mo5102d() {
        if (this.f4357c.m8922y0() != 1 && this.f4357c.m8922y0() != 3 && this.f4357c.m8922y0() != 2 && this.f4357c.m8922y0() != 4) {
            return false;
        }
        mo5108k(0, -1);
        return true;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: e */
    public void mo5103e() {
        if (this.f4357c.m8904D0()) {
            MessageBar messageBarM4844t0 = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0();
            xdl0.B(messageBarM4844t0.getBar_center_text(), false);
            this.f4356b.hideInput(messageBarM4844t0.getBar_center_text());
        }
        this.f4362h = true;
        this.f4357c.m6497e0().mo2066l().m4210a3();
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: f */
    public void mo5104f() {
        MessageBar messageBarM4844t0 = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0();
        xdl0.A(messageBarM4844t0.getBar_center_text());
        if (!this.f4357c.m8904D0()) {
            pxz.f(this.f4356b.pageId(), this.f4357c.m6497e0().mo2066l().m4295r3(), "keyboard");
            this.f4356b.showInput(messageBarM4844t0.getBar_center_text(), 0);
        } else if (this.f4362h) {
            pxz.f(this.f4356b.pageId(), this.f4357c.m6497e0().mo2066l().m4295r3(), "keyboard");
        }
        this.f4362h = false;
        this.f4357c.m6497e0().mo2066l().m4193X2();
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: i */
    public void mo5105i() {
        this.f4361g.setUnlockSuccessListener(new d30() { // from class: l.f6z
            @Override // p003l.d30
            public final void call() {
                this.f3461a.m5090L();
            }
        });
        this.f4361g.setShareCancelCallbackListener(new d30() { // from class: l.g6z
            @Override // p003l.d30
            public final void call() {
                this.f3809a.m5091M();
            }
        });
        if (this.f4357c.m8903C0()) {
            this.f4361g.m1885E();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Keyboard keyboard = (Keyboard) this.f4356b.inflater().inflate(CoreModule.P().i().G1() ? l6c0.l5 : l6c0.j5, (ViewGroup) this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0().getHidden_slide_out(), false);
        this.f4361g = keyboard;
        return keyboard;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: j */
    public void mo5107j(int i) {
        MessageBar messageBarM4844t0 = this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0();
        final tqz tqzVarM4309t7 = this.f4357c.m6497e0().mo2066l().m4309t7();
        TimeInterpolator jigVar = new jig();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tqzVarM4309t7.f7644X0.getLayoutParams();
        if (this.f4357c.m8922y0() != 2) {
            i = messageBarM4844t0.getHidden_slide_out().getHeight();
        }
        int[] iArr = new int[2];
        messageBarM4844t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        tqzVarM4309t7.f7677n1.getRealView().getLocationOnScreen(iArr2);
        int iMax = Math.max(((i - (((((iArr[1] - iArr2[1]) - tqzVarM4309t7.f7677n1.getRealView().getHeight()) + t100.d(240.0f)) - ((int) messageBarM4844t0.getTranslationY())) + ((int) tqzVarM4309t7.f7635T.getTranslationY()))) + (xdl0.O0(tqzVarM4309t7.f7624N0) ? tqzVarM4309t7.f7624N0.getHeight() : 0)) - ((tqzVarM4309t7.f7627P == null || tqzVarM4309t7.f7677n1.getRealView().canScrollVertically(1) || tqzVarM4309t7.f7677n1.getRealView().canScrollVertically(-1)) ? 0 : tqzVarM4309t7.f7627P.getHeight()), 0);
        float f = -iMax;
        m5085G(tqzVarM4309t7, -(f - tqzVarM4309t7.f7635T.getTranslationY()));
        tqzVarM4309t7.f7635T.setTranslationY(f);
        messageBarM4844t0.setTranslationY(-i);
        if (xdl0.O0(tqzVarM4309t7.f7624N0)) {
            tqzVarM4309t7.f7624N0.setTranslationY(iMax - i);
        }
        if (NullChecker.a(layoutParams)) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tqzVarM4309t7.f7644X0.getTop(), iMax);
            valueAnimatorOfInt.setInterpolator(jigVar);
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h6z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    i6z.m5075q(layoutParams, tqzVarM4309t7, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: k */
    public void mo5108k(int i, int i2) {
        m5098T(i, i2, false, 0);
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: l */
    public void mo5109l() {
        if (CoreModule.P().i().E() && NullChecker.a(this.f4365k)) {
            this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0().getHidden_slide_out().removeView(this.f4365k);
            this.f4365k = null;
            this.f4364j = null;
            m5087I();
            return;
        }
        if (NullChecker.a(this.f4363i)) {
            this.f4357c.m6497e0().mo2046A0().m6499g0().m4844t0().getHidden_slide_out().removeView(this.f4363i.m3587a());
            this.f4363i = null;
            m5087I();
        }
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: m */
    public boolean mo5110m() {
        return this.f4360f;
    }

    @Override // p003l.AbstractC0438n2
    /* JADX INFO: renamed from: n */
    public void mo5111n(boolean z) {
        this.f4359e = z;
    }

    public void destroy() {
    }
}
