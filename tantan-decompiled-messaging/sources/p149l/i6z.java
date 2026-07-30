package p149l;

import android.animation.Animator;
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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.KeyboardFrameWithShadowOutside;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MultiContentVoiceCall;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatView;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.TantanListView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.KeyboardMediaLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class i6z extends AbstractC18604n2 {

    /* JADX INFO: renamed from: n */
    public static final int f111795n = t100.m186890d(320.0f);

    /* JADX INFO: renamed from: b */
    public MessagesAct f111797b;

    /* JADX INFO: renamed from: c */
    public y5z f111798c;

    /* JADX INFO: renamed from: d */
    public hkx f111799d;

    /* JADX INFO: renamed from: g */
    public Keyboard f111802g;

    /* JADX INFO: renamed from: i */
    public dj10 f111804i;

    /* JADX INFO: renamed from: j */
    public KeyboardMediaLayout f111805j;

    /* JADX INFO: renamed from: k */
    public View f111806k;

    /* JADX INFO: renamed from: a */
    public Rect f111796a = new Rect();

    /* JADX INFO: renamed from: e */
    public boolean f111800e = false;

    /* JADX INFO: renamed from: f */
    public boolean f111801f = false;

    /* JADX INFO: renamed from: h */
    public boolean f111803h = true;

    /* JADX INFO: renamed from: l */
    public int f111807l = 0;

    /* JADX INFO: renamed from: m */
    public h30<Boolean, Integer, Boolean, Integer> f111808m = new h30() { // from class: l.e6z
        @Override // p149l.h30
        /* JADX INFO: renamed from: b */
        public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f89663a.m134695N((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
        }
    };

    /* JADX INFO: renamed from: l.i6z$a */
    public class C17497a implements ValueAnimator.AnimatorUpdateListener {
        public C17497a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i6z.this.f111798c.m213061Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.i6z$b */
    public class C17498b implements ValueAnimator.AnimatorUpdateListener {
        public C17498b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i6z.this.f111798c.m213061Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.i6z$c */
    public class C17499c implements ud50 {

        /* JADX INFO: renamed from: a */
        public PointF f111811a = null;

        public C17499c() {
        }

        @Override // p149l.ud50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int iM186890d = t100.m186890d(4.0f);
            if (CoreModule.m29935P().m94658i().mo158222E()) {
                if (i6z.this.f111798c.m156455e0().mo48974l().mo120764e4()) {
                    iM186890d = t100.m186890d(8.0f);
                }
                int action = motionEvent.getAction();
                i6z i6zVar = i6z.this;
                if (action != 2) {
                    i6zVar.f111800e = false;
                    i6z.this.f111801f = false;
                } else if (i6zVar.f111800e) {
                    return true;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.f111811a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else if (NullChecker.m81303a(this.f111811a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                PointF pointF = this.f111811a;
                RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                float f = iM186890d;
                boolean z = ((float) Math.sqrt((double) ((rectF.width() * rectF.width()) + (rectF.height() * rectF.height())))) > f;
                if (CoreModule.m29935P().m94658i().mo158222E() && i6z.this.f111798c.m156455e0().mo48974l().mo120764e4()) {
                    z = Math.abs(motionEvent.getY() - this.f111811a.y) > f;
                }
                if (Math.abs(motionEvent.getX() - this.f111811a.x) > t100.f167252a && NullChecker.m81303a(i6z.this.f111798c.m156455e0().mo48974l().m120842t7().f171754r1) && NullChecker.m81303a(i6z.this.f111798c.m156455e0().mo48974l().m120842t7().f171754r1.f124073d)) {
                    z = false;
                }
                if (z) {
                    if (CoreModule.m29935P().m94658i().mo158222E()) {
                        i6z.this.f111801f = true;
                    }
                    i6z.this.mo134710k(0, -1);
                    i6z.this.f111798c.m156455e0().mo48974l().m120842t7().m190339y0(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.i6z$d */
    public class C17500d implements ud50 {

        /* JADX INFO: renamed from: a */
        public PointF f111813a = null;

        /* JADX INFO: renamed from: b */
        public boolean f111814b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tqz f111815c;

        public C17500d(tqz tqzVar) {
            this.f111815c = tqzVar;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m134715b(Rect rect, MotionEvent motionEvent, View view) {
            xdl0.m208334H(view, rect, i6z.this.f111796a);
            return ((view instanceof ListView) || !(view.isClickable() || (view.isLongClickable() && this.f111814b))) ? Boolean.FALSE : Boolean.valueOf(i6z.this.f111796a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
        }

        @Override // p149l.ud50
        public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
            View viewM208395q;
            if (motionEvent.getAction() == 0) {
                this.f111813a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else {
                boolean z = true;
                if (NullChecker.m81303a(this.f111813a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    PointF pointF = this.f111813a;
                    RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                    if (((float) Math.sqrt((rectF.width() * rectF.width()) + (rectF.height() * rectF.height()))) > t100.m186890d(4.0f)) {
                        i6z.this.mo134710k(0, -1);
                        i6z.this.f111798c.m156455e0().mo48974l().m120842t7().m190339y0(false);
                    }
                } else if (NullChecker.m81303a(this.f111813a) && motionEvent.getAction() == 1) {
                    try {
                        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                            z = false;
                        }
                        this.f111814b = z;
                        final Rect rect = new Rect();
                        this.f111815c.f171703T.getWindowVisibleDisplayFrame(rect);
                        viewM208395q = xdl0.m208395q(this.f111815c.f171703T, new w9j() { // from class: l.j6z
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return this.f116547a.m134715b(rect, motionEvent, (View) obj);
                            }
                        });
                    } catch (Exception e) {
                        CrashHelper.m81296c(new Exception("MessagesAct _list_child dispatchTouchEvent:" + e.getMessage(), e));
                        viewM208395q = null;
                    }
                    if (viewM208395q == null) {
                        i6z.this.mo134710k(0, -1);
                    }
                }
            }
            return false;
        }
    }

    public i6z(MessagesAct messagesAct) {
        this.f111797b = messagesAct;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m134679q(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f171712X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m134685y(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f171712X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m134686z(FrameLayout.LayoutParams layoutParams, tqz tqzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        tqzVar.f171712X0.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f111797b;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f111797b;
    }

    /* JADX INFO: renamed from: G */
    public final void m134688G(tqz tqzVar, float f) {
        if (xdl0.m208349O0(tqzVar.f171749p0)) {
            VLinear vLinear = tqzVar.f171749p0;
            vLinear.setTranslationY(vLinear.getTranslationY() + f);
        }
        if (NullChecker.m81303a(tqzVar.f171754r1)) {
            LinearLayout linearLayout = tqzVar.f171676G0;
            linearLayout.setTranslationY(linearLayout.getTranslationY() + f);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y5z y5zVar) {
        this.f111798c = y5zVar;
    }

    /* JADX INFO: renamed from: I */
    public final void m134690I() {
        m134691J();
        this.f111805j.m49871e(this.f111799d.m131603d(this.f111798c));
    }

    /* JADX INFO: renamed from: J */
    public final void m134691J() {
        if (this.f111805j == null) {
            if (this.f111799d == null) {
                this.f111799d = new hkx(this.f111797b);
            }
            MessageBar messageBarM128210t0 = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0();
            this.f111805j = (KeyboardMediaLayout) o7r.m163037a(getAct()).inflate(l6c0.f126519m3, (ViewGroup) messageBarM128210t0.getHidden_slide_out(), false);
            messageBarM128210t0.getHidden_slide_out().addView(this.f111805j);
            this.f111806k = this.f111805j;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m134692K() {
        AIChatView aiChatview = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0().getAiChatview();
        xdl0.m208344M(aiChatview, false);
        aiChatview.m49032d(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m134693L() {
        this.f111797b.alwaysHideInput();
        mo134710k(1, -1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m134694M() {
        this.f111797b.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m134695N(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        xsy xsyVarMo48954A0 = this.f111798c.m156455e0().mo48954A0();
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19642f0.f19931e0.m132487l(roj0.f160388a);
        } else {
            CoreModule.f17545c.f19642f0.f19928d0.m132487l(roj0.f160388a);
            xsyVarMo48954A0.m156457g0().m128202p0();
        }
        MessageBar messageBarM128210t0 = xsyVarMo48954A0.m156457g0().m128210t0();
        if (CoreModule.m29935P().m94658i().mo158222E() && messageBarM128210t0 != null && messageBarM128210t0.getBar_center_text().hasFocus() && unk.m194440r()) {
            return;
        }
        this.f111798c.m213060P0(bool.booleanValue());
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        if (NullChecker.m81303a(messageBarM128210t0) && NullChecker.m81303a(messageBarM128210t0.getHidden_slide_out()) && messageBarM128210t0.getHidden_slide_out().getLayoutParams().height != iMax) {
            ViewGroup.LayoutParams layoutParams = messageBarM128210t0.getHidden_slide_out().getLayoutParams();
            layoutParams.height = iMax;
            messageBarM128210t0.getHidden_slide_out().setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) messageBarM128210t0.getLayoutParams();
            marginLayoutParams.bottomMargin = -iMax;
            messageBarM128210t0.setLayoutParams(marginLayoutParams);
        }
        dqy dqyVarM128212u0 = xsyVarMo48954A0.m156457g0().m128212u0();
        if (!bool.booleanValue() && this.f111798c.m213066y0() == 4 && (!NullChecker.m81303a(dqyVarM128212u0) || !dqyVarM128212u0.m113220d0())) {
            KeyboardFrameWithShadowOutside hidden_slide_out = messageBarM128210t0.getHidden_slide_out();
            int i = f111795n;
            xdl0.m208325C0(hidden_slide_out, i);
            xdl0.m208357U(messageBarM128210t0, -i);
        }
        xsyVarMo48954A0.m156457g0().m128218x0();
        if (bool.booleanValue()) {
            m134701T(2, num.intValue(), bool2.booleanValue(), num2.intValue());
            if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                dqyVarM128212u0.m113190D0();
                return;
            }
            return;
        }
        if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0() && this.f111798c.m213066y0() != 1 && this.f111798c.m213066y0() != 3) {
            dqyVarM128212u0.m113196G0();
        }
        if (this.f111798c.m213066y0() == 2) {
            m134701T(0, num.intValue(), bool2.booleanValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m134696O(MessageBar messageBar) {
        if (this.f111798c.m213066y0() == 2) {
            if (NullChecker.m81303a(this.f111802g)) {
                xdl0.m208345M0(this.f111802g, false);
            }
            if (NullChecker.m81303a(this.f111804i)) {
                xdl0.m208345M0(this.f111804i.m111976a(), false);
            }
            xdl0.m208345M0(messageBar.getHidden_slide_out(), false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m134697P() {
        this.f111798c.m156455e0().mo48974l().f96929s.m132487l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m134698Q(boolean z) {
        if (z) {
            return;
        }
        mo134710k(0, -1);
    }

    /* JADX INFO: renamed from: R */
    public final void m134699R(int i) {
        if (CoreModule.m29935P().m94658i().mo158266M()) {
            this.f111798c.m156455e0().mo48954A0();
            if (i != 1) {
                return;
            }
            o6j0.m162859c("e_expression_button", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m134700S() {
        AIChatView aiChatview = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0().getAiChatview();
        xdl0.m208344M(aiChatview, true);
        aiChatview.m49032d(false);
    }

    /* JADX INFO: renamed from: T */
    public void m134701T(int i, int i2, boolean z, int i3) {
        int height;
        xsy xsyVar;
        int i4;
        int iMin;
        int listRenderHeight;
        int iM186890d;
        m134699R(i);
        if (i > 0) {
            this.f111798c.m156455e0().mo48974l().f96929s.m132487l(Boolean.TRUE);
        }
        if (i == 0 && this.f111798c.m213066y0() == 2 && this.f111798c.m213050D0()) {
            mo134706e();
            return;
        }
        xsy xsyVarMo48954A0 = this.f111798c.m156455e0().mo48954A0();
        final MessageBar messageBarM128210t0 = xsyVarMo48954A0.m156457g0().m128210t0();
        dqy dqyVarM128212u0 = xsyVarMo48954A0.m156457g0().m128212u0();
        if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0() && i == 0) {
            xsyVarMo48954A0.m156457g0().m128212u0().m113196G0();
        }
        final tqz tqzVarM120842t7 = this.f111798c.m156455e0().mo48974l().m120842t7();
        int iM186890d2 = xdl0.m208349O0(messageBarM128210t0.getActionLayout()) ? t100.m186890d(48.0f) : 0;
        if (i == 1) {
            messageBarM128210t0.mo48839j(true, dqyVarM128212u0.m113220d0());
        } else {
            messageBarM128210t0.mo48839j(false, dqyVarM128212u0.m113220d0());
        }
        if (this.f111798c.m213066y0() == 4 && i == 0) {
            m134692K();
        }
        if (i == 4) {
            messageBarM128210t0.mo48838i(true, dqyVarM128212u0.m113220d0());
            xdl0.m208345M0(messageBarM128210t0.getHidden_slide_out(), true);
            height = f111795n;
            xdl0.m208325C0(messageBarM128210t0.getHidden_slide_out(), height);
            xdl0.m208357U(messageBarM128210t0, -height);
        } else {
            int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
            int i5 = iMax != messageBarM128210t0.getHidden_slide_out().getHeight() ? iMax : 0;
            xdl0.m208325C0(messageBarM128210t0.getHidden_slide_out(), iMax);
            xdl0.m208357U(messageBarM128210t0, -iMax);
            height = i5;
        }
        if (i == 2) {
            height = i2;
        } else if (height <= 0) {
            height = messageBarM128210t0.getHidden_slide_out().getHeight();
        }
        if (i == 2) {
            xsyVar = xsyVarMo48954A0;
            this.f111797b.postDelayed(new Runnable() { // from class: l.z5z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201879a.m134696O(messageBarM128210t0);
                }
            }, 300L);
        } else {
            xsyVar = xsyVarMo48954A0;
            if (i == 1 || i == 4 || i == 3) {
                messageBarM128210t0.getHidden_slide_out().setVisibility(0);
            }
        }
        if (i == 0 && this.f111798c.m213066y0() == 2) {
            if (NullChecker.m81303a(this.f111802g)) {
                xdl0.m208345M0(this.f111802g, false);
            }
            if (NullChecker.m81303a(this.f111806k)) {
                xdl0.m208345M0(this.f111806k, false);
            }
        } else if (i == 1) {
            this.f111798c.m213064u0();
            xdl0.m208345M0(this.f111802g, true);
            if (NullChecker.m81303a(this.f111806k)) {
                xdl0.m208345M0(this.f111806k, false);
            }
        } else if (i == 4) {
            m134700S();
            if (NullChecker.m81303a(this.f111802g)) {
                xdl0.m208345M0(this.f111802g, false);
            }
            if (NullChecker.m81303a(this.f111806k)) {
                xdl0.m208345M0(this.f111806k, false);
            }
        } else if (i == 3) {
            m134690I();
            if (NullChecker.m81303a(this.f111802g)) {
                xdl0.m208345M0(this.f111802g, false);
            }
            xdl0.m208345M0(this.f111806k, true);
            if (nlm0.m160070c()) {
                dj10 dj10Var = this.f111804i;
                if ((dj10Var instanceof MultiContentVoiceCall) && ((MultiContentVoiceCall) dj10Var).f31656b.getCurrentItem() == 0) {
                    o6j0.m162864h("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                }
            }
            if (CoreModule.m29935P().m94658i().mo158222E() && tqzVarM120842t7.f171750p1.mo120764e4()) {
                zvf0.m220368A("e_send_red_packet", "p_group_chat_view", vwb.m200311Y("groupchat_id", tqzVarM120842t7.f171750p1.f96910b));
            }
        }
        if ((i == 1 && !this.f111802g.m48806r()) || i == 2) {
            xdl0.m208320A(messageBarM128210t0.getBar_center_text());
        }
        jig jigVar = new jig();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tqzVarM120842t7.f171712X0.getLayoutParams();
        int iM186890d3 = CoreModule.m29935P().m94658i().mo33514hm() ? (xdl0.m208349O0(messageBarM128210t0.getActionLayout()) ? t100.m186890d(48.0f) : 0) - iM186890d2 : 0;
        if (iM186890d3 != 0) {
            MessageLayout messageLayout = tqzVarM120842t7.f171703T;
            float f = iM186890d3;
            messageLayout.setTranslationY(messageLayout.getTranslationY() + f);
            messageBarM128210t0.setTranslationY(messageBarM128210t0.getTranslationY() + f);
        }
        if (i != 0) {
            if (z) {
                MessageLayout messageLayout2 = tqzVarM120842t7.f171703T;
                float f2 = i3;
                messageLayout2.setTranslationY(messageLayout2.getTranslationY() + f2);
                messageBarM128210t0.setTranslationY(messageBarM128210t0.getTranslationY() + f2);
                this.f111798c.m213061Q0(messageBarM128210t0.getTranslationY());
            }
            int iMax2 = iM186890d3 + height;
            if (CoreModule.m29935P().m94658i().mo158233G1()) {
                int[] iArr = new int[2];
                messageBarM128210t0.getLocationOnScreen(iArr);
                int height2 = xdl0.m208349O0(tqzVarM120842t7.f171692N0) ? tqzVarM120842t7.f171692N0.getHeight() : 0;
                int[] iArr2 = new int[2];
                tqzVarM120842t7.f171745n1.getRealView().getLocationOnScreen(iArr2);
                int iM213066y0 = this.f111798c.m213066y0();
                utl utlVar = tqzVarM120842t7.f171745n1;
                if (iM213066y0 != 0) {
                    listRenderHeight = (((iArr[1] - iArr2[1]) - utlVar.getListRenderHeight()) + t100.m186890d(240.0f)) - ((int) messageBarM128210t0.getTranslationY());
                    iM186890d = (int) tqzVarM120842t7.f171703T.getTranslationY();
                } else {
                    listRenderHeight = (iArr[1] - iArr2[1]) - utlVar.getListRenderHeight();
                    iM186890d = t100.m186890d(240.0f);
                }
                int height3 = listRenderHeight + iM186890d;
                if (CoreModule.m29935P().m94658i().mo158429p4()) {
                    height3 = tqzVarM120842t7.f171745n1.getRealView().getHeight() - tqzVarM120842t7.f171745n1.getListRenderHeight();
                    iMin = Math.min(height + height2, height3);
                } else {
                    iMin = 0;
                }
                iMax2 = Math.max(((height - height3) + height2) - ((tqzVarM120842t7.f171695P == null || tqzVarM120842t7.f171745n1.getRealView().canScrollVertically(1) || tqzVarM120842t7.f171745n1.getRealView().canScrollVertically(-1)) ? 0 : tqzVarM120842t7.f171695P.getHeight()), 0);
                i4 = height - iMax2;
                this.f111807l = tqzVarM120842t7.f171745n1.getListRenderHeight();
            } else {
                i4 = 0;
                iMin = 0;
            }
            Animator animatorM103742o = CoreModule.m29935P().m94658i().mo158429p4() ? bt0.m103742o(tqzVarM120842t7.f171745n1.getRealView(), TantanListView.f32200v, iMin) : bt0.m103737j(390);
            float f3 = -height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(messageBarM128210t0.getTranslationY(), f3);
            valueAnimatorOfFloat.addUpdateListener(new C17497a());
            float f4 = -iMax2;
            float f5 = -i4;
            bt0.m103748u(true, jigVar, 390L, animatorM103742o, bt0.m103744q(xsyVar.m156457g0().m128206r0(), "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171703T, "translationY", f4), bt0.m103744q(tqzVarM120842t7.f171698Q0, "translationY", f4), bt0.m103744q(tqzVarM120842t7.f171676G0, "translationY", f5), bt0.m103744q(tqzVarM120842t7.f171749p0, "translationY", f5), bt0.m103744q(tqzVarM120842t7.f171738k0, "translationY", f5), bt0.m103744q(tqzVarM120842t7.f171679H0, "translationY", f5), xdl0.m208349O0(tqzVarM120842t7.f171692N0) ? bt0.m103744q(tqzVarM120842t7.f171692N0, "translationY", f5) : bt0.m103737j(390), valueAnimatorOfFloat, bt0.m103744q(messageBarM128210t0, "translationY", f3)).start();
            if (NullChecker.m81303a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tqzVarM120842t7.f171712X0.getTop(), iMax2);
                valueAnimatorOfInt.setInterpolator(jigVar);
                valueAnimatorOfInt.setDuration(390L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a6z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        i6z.m134685y(layoutParams, tqzVarM120842t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt.start();
            }
        } else {
            Animator animatorM103742o2 = CoreModule.m29935P().m94658i().mo158429p4() ? bt0.m103742o(tqzVarM120842t7.f171745n1.getRealView(), TantanListView.f32200v, 0) : bt0.m103737j(390);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(messageBarM128210t0.getTranslationY(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new C17498b());
            Animator animatorM103748u = bt0.m103748u(true, jigVar, 390L, animatorM103742o2, bt0.m103744q(xsyVar.m156457g0().m128206r0(), "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171703T, "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171698Q0, "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171676G0, "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171749p0, "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171738k0, "translationY", 0.0f), bt0.m103744q(tqzVarM120842t7.f171679H0, "translationY", 0.0f), xdl0.m208349O0(tqzVarM120842t7.f171692N0) ? bt0.m103744q(tqzVarM120842t7.f171692N0, "translationY", 0.0f) : bt0.m103737j(390), valueAnimatorOfFloat2, bt0.m103744q(messageBarM128210t0, "translationY", 0.0f));
            bt0.m103733f(animatorM103748u, new Runnable() { // from class: l.b6z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73891a.m134697P();
                }
            });
            animatorM103748u.start();
            if (NullChecker.m81303a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(tqzVarM120842t7.f171712X0.getTop(), 0);
                valueAnimatorOfInt2.setInterpolator(jigVar);
                valueAnimatorOfInt2.setDuration(390L);
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.c6z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        i6z.m134686z(layoutParams, tqzVarM120842t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt2.start();
            }
        }
        if (i != 2) {
            mo134706e();
            if (i != 0) {
                this.f111798c.m156455e0().mo48974l().m120728X2();
            }
        } else {
            mo134707f();
        }
        if (i != 0) {
            boolean zMo158216D = CoreModule.m29935P().m94658i().mo158216D();
            MessageRecyclerDispatchLinear messageRecyclerDispatchLinear = tqzVarM120842t7.f171701S;
            if (zMo158216D) {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C17499c());
                tqzVarM120842t7.f171701S.setOnTouchEventHandleListener(new tg50() { // from class: l.d6z
                    @Override // p149l.tg50
                    /* JADX INFO: renamed from: a */
                    public final void mo110205a(boolean z2) {
                        this.f84687a.m134698Q(z2);
                    }
                });
            } else {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C17500d(tqzVarM120842t7));
            }
        } else {
            this.f111801f = false;
            tqzVarM120842t7.f171701S.setOnDispatchTouchEventListener(null);
            tqzVarM120842t7.f171701S.setOnTouchEventHandleListener(null);
        }
        this.f111798c.m213062R0(i);
        tqm0.m190131p().m190146s();
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: a */
    public Keyboard mo134702a() {
        return this.f111802g;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: b */
    public hkx mo134703b() {
        return this.f111799d;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: c */
    public h30<Boolean, Integer, Boolean, Integer> mo134704c() {
        return this.f111808m;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: d */
    public boolean mo134705d() {
        if (this.f111798c.m213066y0() != 1 && this.f111798c.m213066y0() != 3 && this.f111798c.m213066y0() != 2 && this.f111798c.m213066y0() != 4) {
            return false;
        }
        mo134710k(0, -1);
        return true;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: e */
    public void mo134706e() {
        if (this.f111798c.m213050D0()) {
            MessageBar messageBarM128210t0 = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0();
            xdl0.m208322B(messageBarM128210t0.getBar_center_text(), false);
            this.f111797b.hideInput(messageBarM128210t0.getBar_center_text());
        }
        this.f111803h = true;
        this.f111798c.m156455e0().mo48974l().m120743a3();
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: f */
    public void mo134707f() {
        MessageBar messageBarM128210t0 = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0();
        xdl0.m208320A(messageBarM128210t0.getBar_center_text());
        if (!this.f111798c.m213050D0()) {
            pxz.m171969f(this.f111797b.pageId(), this.f111798c.m156455e0().mo48974l().mo120828r3(), "keyboard");
            this.f111797b.showInput(messageBarM128210t0.getBar_center_text(), 0);
        } else if (this.f111803h) {
            pxz.m171969f(this.f111797b.pageId(), this.f111798c.m156455e0().mo48974l().mo120828r3(), "keyboard");
        }
        this.f111803h = false;
        this.f111798c.m156455e0().mo48974l().m120728X2();
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: i */
    public void mo134708i() {
        this.f111802g.setUnlockSuccessListener(new d30() { // from class: l.f6z
            @Override // p149l.d30
            public final void call() {
                this.f96183a.m134693L();
            }
        });
        this.f111802g.setShareCancelCallbackListener(new d30() { // from class: l.g6z
            @Override // p149l.d30
            public final void call() {
                this.f101321a.m134694M();
            }
        });
        if (this.f111798c.m213049C0()) {
            this.f111802g.m48801E();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Keyboard keyboard = (Keyboard) this.f111797b.inflater().inflate(CoreModule.m29935P().m94658i().mo158233G1() ? l6c0.f126514l5 : l6c0.f126500j5, (ViewGroup) this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0().getHidden_slide_out(), false);
        this.f111802g = keyboard;
        return keyboard;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: j */
    public void mo134709j(int i) {
        MessageBar messageBarM128210t0 = this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0();
        final tqz tqzVarM120842t7 = this.f111798c.m156455e0().mo48974l().m120842t7();
        jig jigVar = new jig();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tqzVarM120842t7.f171712X0.getLayoutParams();
        if (this.f111798c.m213066y0() != 2) {
            i = messageBarM128210t0.getHidden_slide_out().getHeight();
        }
        int[] iArr = new int[2];
        messageBarM128210t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        tqzVarM120842t7.f171745n1.getRealView().getLocationOnScreen(iArr2);
        int iMax = Math.max(((i - (((((iArr[1] - iArr2[1]) - tqzVarM120842t7.f171745n1.getRealView().getHeight()) + t100.m186890d(240.0f)) - ((int) messageBarM128210t0.getTranslationY())) + ((int) tqzVarM120842t7.f171703T.getTranslationY()))) + (xdl0.m208349O0(tqzVarM120842t7.f171692N0) ? tqzVarM120842t7.f171692N0.getHeight() : 0)) - ((tqzVarM120842t7.f171695P == null || tqzVarM120842t7.f171745n1.getRealView().canScrollVertically(1) || tqzVarM120842t7.f171745n1.getRealView().canScrollVertically(-1)) ? 0 : tqzVarM120842t7.f171695P.getHeight()), 0);
        float f = -iMax;
        m134688G(tqzVarM120842t7, -(f - tqzVarM120842t7.f171703T.getTranslationY()));
        tqzVarM120842t7.f171703T.setTranslationY(f);
        messageBarM128210t0.setTranslationY(-i);
        if (xdl0.m208349O0(tqzVarM120842t7.f171692N0)) {
            tqzVarM120842t7.f171692N0.setTranslationY(iMax - i);
        }
        if (NullChecker.m81303a(layoutParams)) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(tqzVarM120842t7.f171712X0.getTop(), iMax);
            valueAnimatorOfInt.setInterpolator(jigVar);
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h6z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    i6z.m134679q(layoutParams, tqzVarM120842t7, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: k */
    public void mo134710k(int i, int i2) {
        m134701T(i, i2, false, 0);
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: l */
    public void mo134711l() {
        if (CoreModule.m29935P().m94658i().mo158222E() && NullChecker.m81303a(this.f111806k)) {
            this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0().getHidden_slide_out().removeView(this.f111806k);
            this.f111806k = null;
            this.f111805j = null;
            m134690I();
            return;
        }
        if (NullChecker.m81303a(this.f111804i)) {
            this.f111798c.m156455e0().mo48954A0().m156457g0().m128210t0().getHidden_slide_out().removeView(this.f111804i.m111976a());
            this.f111804i = null;
            m134690I();
        }
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: m */
    public boolean mo134712m() {
        return this.f111801f;
    }

    @Override // p149l.AbstractC18604n2
    /* JADX INFO: renamed from: n */
    public void mo134713n(boolean z) {
        this.f111800e = z;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
