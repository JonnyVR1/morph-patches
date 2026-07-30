package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.KeyboardFrameWithShadowOutside;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MultiContentVoiceCall;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatView;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.TantanListView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.KeyboardMediaLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ffz extends AbstractC18764n2 {

    /* JADX INFO: renamed from: n */
    public static final int f98854n = qa00.m175859d(320.0f);

    /* JADX INFO: renamed from: b */
    public MessagesAct f98856b;

    /* JADX INFO: renamed from: c */
    public vez f98857c;

    /* JADX INFO: renamed from: d */
    public etx f98858d;

    /* JADX INFO: renamed from: g */
    public Keyboard f98861g;

    /* JADX INFO: renamed from: i */
    public nr10 f98863i;

    /* JADX INFO: renamed from: j */
    public KeyboardMediaLayout f98864j;

    /* JADX INFO: renamed from: k */
    public View f98865k;

    /* JADX INFO: renamed from: a */
    public Rect f98855a = new Rect();

    /* JADX INFO: renamed from: e */
    public boolean f98859e = false;

    /* JADX INFO: renamed from: f */
    public boolean f98860f = false;

    /* JADX INFO: renamed from: h */
    public boolean f98862h = true;

    /* JADX INFO: renamed from: l */
    public int f98866l = 0;

    /* JADX INFO: renamed from: m */
    public b30<Boolean, Integer, Boolean, Integer> f98867m = new b30() { // from class: l.bfz
        @Override // p153l.b30
        /* JADX INFO: renamed from: b */
        public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f76555a.m125450N((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
        }
    };

    /* JADX INFO: renamed from: l.ffz$a */
    public class C16968a implements ValueAnimator.AnimatorUpdateListener {
        public C16968a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ffz.this.f98857c.m201106Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.ffz$b */
    public class C16969b implements ValueAnimator.AnimatorUpdateListener {
        public C16969b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ffz.this.f98857c.m201106Q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: l.ffz$c */
    public class C16970c implements bm50 {

        /* JADX INFO: renamed from: a */
        public PointF f98870a = null;

        public C16970c() {
        }

        @Override // p153l.bm50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int iM175859d = qa00.m175859d(4.0f);
            if (CoreModule.m30933P().m143412i().mo180314E()) {
                if (ffz.this.f98857c.m143372e0().mo50158l().mo110970e4()) {
                    iM175859d = qa00.m175859d(8.0f);
                }
                int action = motionEvent.getAction();
                ffz ffzVar = ffz.this;
                if (action != 2) {
                    ffzVar.f98859e = false;
                    ffz.this.f98860f = false;
                } else if (ffzVar.f98859e) {
                    return true;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.f98870a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else if (NullChecker.m82486a(this.f98870a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                PointF pointF = this.f98870a;
                RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                float f = iM175859d;
                boolean z = ((float) Math.sqrt((double) ((rectF.width() * rectF.width()) + (rectF.height() * rectF.height())))) > f;
                if (CoreModule.m30933P().m143412i().mo180314E() && ffz.this.f98857c.m143372e0().mo50158l().mo110970e4()) {
                    z = Math.abs(motionEvent.getY() - this.f98870a.y) > f;
                }
                if (Math.abs(motionEvent.getX() - this.f98870a.x) > qa00.f156314a && NullChecker.m82486a(ffz.this.f98857c.m143372e0().mo50158l().m111048t7().f160417r1) && NullChecker.m82486a(ffz.this.f98857c.m143372e0().mo50158l().m111048t7().f160417r1.f112074d)) {
                    z = false;
                }
                if (z) {
                    if (CoreModule.m30933P().m143412i().mo180314E()) {
                        ffz.this.f98860f = true;
                    }
                    ffz.this.mo125465k(0, -1);
                    ffz.this.f98857c.m143372e0().mo50158l().m111048t7().m178984y0(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ffz$d */
    public class C16971d implements bm50 {

        /* JADX INFO: renamed from: a */
        public PointF f98872a = null;

        /* JADX INFO: renamed from: b */
        public boolean f98873b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qzz f98874c;

        public C16971d(qzz qzzVar) {
            this.f98874c = qzzVar;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m125470b(Rect rect, MotionEvent motionEvent, View view) {
            bnl0.m105514H(view, rect, ffz.this.f98855a);
            return ((view instanceof ListView) || !(view.isClickable() || (view.isLongClickable() && this.f98873b))) ? Boolean.FALSE : Boolean.valueOf(ffz.this.f98855a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
        }

        @Override // p153l.bm50
        public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
            View viewM105575q;
            if (motionEvent.getAction() == 0) {
                this.f98872a = new PointF(motionEvent.getX(), motionEvent.getY());
            } else {
                boolean z = true;
                if (NullChecker.m82486a(this.f98872a) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    PointF pointF = this.f98872a;
                    RectF rectF = new RectF(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                    if (((float) Math.sqrt((rectF.width() * rectF.width()) + (rectF.height() * rectF.height()))) > qa00.m175859d(4.0f)) {
                        ffz.this.mo125465k(0, -1);
                        ffz.this.f98857c.m143372e0().mo50158l().m111048t7().m178984y0(false);
                    }
                } else if (NullChecker.m82486a(this.f98872a) && motionEvent.getAction() == 1) {
                    try {
                        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                            z = false;
                        }
                        this.f98873b = z;
                        final Rect rect = new Rect();
                        this.f98874c.f160366T.getWindowVisibleDisplayFrame(rect);
                        viewM105575q = bnl0.m105575q(this.f98874c.f160366T, new qcj() { // from class: l.gfz
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return this.f103973a.m125470b(rect, motionEvent, (View) obj);
                            }
                        });
                    } catch (Exception e) {
                        CrashHelper.m82479c(new Exception("MessagesAct _list_child dispatchTouchEvent:" + e.getMessage(), e));
                        viewM105575q = null;
                    }
                    if (viewM105575q == null) {
                        ffz.this.mo125465k(0, -1);
                    }
                }
            }
            return false;
        }
    }

    public ffz(MessagesAct messagesAct) {
        this.f98856b = messagesAct;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m125434q(FrameLayout.LayoutParams layoutParams, qzz qzzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        qzzVar.f160375X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m125440y(FrameLayout.LayoutParams layoutParams, qzz qzzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        qzzVar.f160375X0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m125441z(FrameLayout.LayoutParams layoutParams, qzz qzzVar, ValueAnimator valueAnimator) {
        layoutParams.setMargins(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
        qzzVar.f160375X0.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f98856b;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f98856b;
    }

    /* JADX INFO: renamed from: G */
    public final void m125443G(qzz qzzVar, float f) {
        if (bnl0.m105529O0(qzzVar.f160412p0)) {
            VLinear vLinear = qzzVar.f160412p0;
            vLinear.setTranslationY(vLinear.getTranslationY() + f);
        }
        if (NullChecker.m82486a(qzzVar.f160417r1)) {
            LinearLayout linearLayout = qzzVar.f160339G0;
            linearLayout.setTranslationY(linearLayout.getTranslationY() + f);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vez vezVar) {
        this.f98857c = vezVar;
    }

    /* JADX INFO: renamed from: I */
    public final void m125445I() {
        m125446J();
        this.f98864j.m51054e(this.f98858d.m122506d(this.f98857c));
    }

    /* JADX INFO: renamed from: J */
    public final void m125446J() {
        if (this.f98864j == null) {
            if (this.f98858d == null) {
                this.f98858d = new etx(this.f98856b);
            }
            MessageBar messageBarM114041t0 = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0();
            this.f98864j = (KeyboardMediaLayout) p9r.m171370a(getAct()).inflate(qec0.f157075m3, (ViewGroup) messageBarM114041t0.getHidden_slide_out(), false);
            messageBarM114041t0.getHidden_slide_out().addView(this.f98864j);
            this.f98865k = this.f98864j;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m125447K() {
        AIChatView aiChatview = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0().getAiChatview();
        bnl0.m105524M(aiChatview, false);
        aiChatview.m50215d(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m125448L() {
        this.f98856b.alwaysHideInput();
        mo125465k(1, -1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m125449M() {
        this.f98856b.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m125450N(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        u1z u1zVarMo50138B0 = this.f98857c.m143372e0().mo50138B0();
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20384f0.f20673e0.m137019l(uxj0.f181467a);
        } else {
            CoreModule.f18264c.f20384f0.f20670d0.m137019l(uxj0.f181467a);
            u1zVarMo50138B0.m143374g0().m114033p0();
        }
        MessageBar messageBarM114041t0 = u1zVarMo50138B0.m143374g0().m114041t0();
        if (CoreModule.m30933P().m143412i().mo180314E() && messageBarM114041t0 != null && messageBarM114041t0.getBar_center_text().hasFocus() && kqk.m150908r()) {
            return;
        }
        this.f98857c.m201105P0(bool.booleanValue());
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        if (NullChecker.m82486a(messageBarM114041t0) && NullChecker.m82486a(messageBarM114041t0.getHidden_slide_out()) && messageBarM114041t0.getHidden_slide_out().getLayoutParams().height != iMax) {
            ViewGroup.LayoutParams layoutParams = messageBarM114041t0.getHidden_slide_out().getLayoutParams();
            layoutParams.height = iMax;
            messageBarM114041t0.getHidden_slide_out().setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) messageBarM114041t0.getLayoutParams();
            marginLayoutParams.bottomMargin = -iMax;
            messageBarM114041t0.setLayoutParams(marginLayoutParams);
        }
        azy azyVarM114043u0 = u1zVarMo50138B0.m143374g0().m114043u0();
        if (!bool.booleanValue() && this.f98857c.m201111y0() == 4 && (!NullChecker.m82486a(azyVarM114043u0) || !azyVarM114043u0.m101199d0())) {
            KeyboardFrameWithShadowOutside hidden_slide_out = messageBarM114041t0.getHidden_slide_out();
            int i = f98854n;
            bnl0.m105505C0(hidden_slide_out, i);
            bnl0.m105537U(messageBarM114041t0, -i);
        }
        u1zVarMo50138B0.m143374g0().m114049x0();
        if (bool.booleanValue()) {
            m125456T(2, num.intValue(), bool2.booleanValue(), num2.intValue());
            if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                azyVarM114043u0.m101169D0();
                return;
            }
            return;
        }
        if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0() && this.f98857c.m201111y0() != 1 && this.f98857c.m201111y0() != 3) {
            azyVarM114043u0.m101175G0();
        }
        if (this.f98857c.m201111y0() == 2) {
            m125456T(0, num.intValue(), bool2.booleanValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m125451O(MessageBar messageBar) {
        if (this.f98857c.m201111y0() == 2) {
            if (NullChecker.m82486a(this.f98861g)) {
                bnl0.m105525M0(this.f98861g, false);
            }
            if (NullChecker.m82486a(this.f98863i)) {
                bnl0.m105525M0(this.f98863i.m164439a(), false);
            }
            bnl0.m105525M0(messageBar.getHidden_slide_out(), false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m125452P() {
        this.f98857c.m143372e0().mo50158l().f82492s.m137019l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m125453Q(boolean z) {
        if (z) {
            return;
        }
        mo125465k(0, -1);
    }

    /* JADX INFO: renamed from: R */
    public final void m125454R(int i) {
        if (CoreModule.m30933P().m143412i().mo180358M()) {
            this.f98857c.m143372e0().mo50138B0();
            if (i != 1) {
                return;
            }
            sfj0.m185596c("e_expression_button", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m125455S() {
        AIChatView aiChatview = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0().getAiChatview();
        bnl0.m105524M(aiChatview, true);
        aiChatview.m50215d(false);
    }

    /* JADX INFO: renamed from: T */
    public void m125456T(int i, int i2, boolean z, int i3) {
        int height;
        u1z u1zVar;
        int i4;
        int iMin;
        int listRenderHeight;
        int iM175859d;
        m125454R(i);
        if (i > 0) {
            this.f98857c.m143372e0().mo50158l().f82492s.m137019l(Boolean.TRUE);
        }
        if (i == 0 && this.f98857c.m201111y0() == 2 && this.f98857c.m201095D0()) {
            mo125461e();
            return;
        }
        u1z u1zVarMo50138B0 = this.f98857c.m143372e0().mo50138B0();
        final MessageBar messageBarM114041t0 = u1zVarMo50138B0.m143374g0().m114041t0();
        azy azyVarM114043u0 = u1zVarMo50138B0.m143374g0().m114043u0();
        if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0() && i == 0) {
            u1zVarMo50138B0.m143374g0().m114043u0().m101175G0();
        }
        final qzz qzzVarM111048t7 = this.f98857c.m143372e0().mo50158l().m111048t7();
        int iM175859d2 = bnl0.m105529O0(messageBarM114041t0.getActionLayout()) ? qa00.m175859d(48.0f) : 0;
        if (i == 1) {
            messageBarM114041t0.mo50022j(true, azyVarM114043u0.m101199d0());
        } else {
            messageBarM114041t0.mo50022j(false, azyVarM114043u0.m101199d0());
        }
        if (this.f98857c.m201111y0() == 4 && i == 0) {
            m125447K();
        }
        if (i == 4) {
            messageBarM114041t0.mo50021i(true, azyVarM114043u0.m101199d0());
            bnl0.m105525M0(messageBarM114041t0.getHidden_slide_out(), true);
            height = f98854n;
            bnl0.m105505C0(messageBarM114041t0.getHidden_slide_out(), height);
            bnl0.m105537U(messageBarM114041t0, -height);
        } else {
            int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
            int i5 = iMax != messageBarM114041t0.getHidden_slide_out().getHeight() ? iMax : 0;
            bnl0.m105505C0(messageBarM114041t0.getHidden_slide_out(), iMax);
            bnl0.m105537U(messageBarM114041t0, -iMax);
            height = i5;
        }
        if (i == 2) {
            height = i2;
        } else if (height <= 0) {
            height = messageBarM114041t0.getHidden_slide_out().getHeight();
        }
        if (i == 2) {
            u1zVar = u1zVarMo50138B0;
            this.f98856b.postDelayed(new Runnable() { // from class: l.wez
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188735a.m125451O(messageBarM114041t0);
                }
            }, 300L);
        } else {
            u1zVar = u1zVarMo50138B0;
            if (i == 1 || i == 4 || i == 3) {
                messageBarM114041t0.getHidden_slide_out().setVisibility(0);
            }
        }
        if (i == 0 && this.f98857c.m201111y0() == 2) {
            if (NullChecker.m82486a(this.f98861g)) {
                bnl0.m105525M0(this.f98861g, false);
            }
            if (NullChecker.m82486a(this.f98865k)) {
                bnl0.m105525M0(this.f98865k, false);
            }
        } else if (i == 1) {
            this.f98857c.m201109u0();
            bnl0.m105525M0(this.f98861g, true);
            if (NullChecker.m82486a(this.f98865k)) {
                bnl0.m105525M0(this.f98865k, false);
            }
        } else if (i == 4) {
            m125455S();
            if (NullChecker.m82486a(this.f98861g)) {
                bnl0.m105525M0(this.f98861g, false);
            }
            if (NullChecker.m82486a(this.f98865k)) {
                bnl0.m105525M0(this.f98865k, false);
            }
        } else if (i == 3) {
            m125445I();
            if (NullChecker.m82486a(this.f98861g)) {
                bnl0.m105525M0(this.f98861g, false);
            }
            bnl0.m105525M0(this.f98865k, true);
            if (rum0.m183208c()) {
                nr10 nr10Var = this.f98863i;
                if ((nr10Var instanceof MultiContentVoiceCall) && ((MultiContentVoiceCall) nr10Var).f32504b.getCurrentItem() == 0) {
                    sfj0.m185601h("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                }
            }
            if (CoreModule.m30933P().m143412i().mo180314E() && qzzVarM111048t7.f160413p1.mo110970e4()) {
                i4g0.m138492A("e_send_red_packet", "p_group_chat_view", jyb.m147494Y("groupchat_id", qzzVarM111048t7.f160413p1.f82473b));
            }
        }
        if ((i == 1 && !this.f98861g.m49989r()) || i == 2) {
            bnl0.m105500A(messageBarM114041t0.getBar_center_text());
        }
        xjg xjgVar = new xjg();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qzzVarM111048t7.f160375X0.getLayoutParams();
        int iM175859d3 = CoreModule.m30933P().m143412i().mo34517hm() ? (bnl0.m105529O0(messageBarM114041t0.getActionLayout()) ? qa00.m175859d(48.0f) : 0) - iM175859d2 : 0;
        if (iM175859d3 != 0) {
            MessageLayout messageLayout = qzzVarM111048t7.f160366T;
            float f = iM175859d3;
            messageLayout.setTranslationY(messageLayout.getTranslationY() + f);
            messageBarM114041t0.setTranslationY(messageBarM114041t0.getTranslationY() + f);
        }
        if (i != 0) {
            if (z) {
                MessageLayout messageLayout2 = qzzVarM111048t7.f160366T;
                float f2 = i3;
                messageLayout2.setTranslationY(messageLayout2.getTranslationY() + f2);
                messageBarM114041t0.setTranslationY(messageBarM114041t0.getTranslationY() + f2);
                this.f98857c.m201106Q0(messageBarM114041t0.getTranslationY());
            }
            int iMax2 = iM175859d3 + height;
            if (CoreModule.m30933P().m143412i().mo180325G1()) {
                int[] iArr = new int[2];
                messageBarM114041t0.getLocationOnScreen(iArr);
                int height2 = bnl0.m105529O0(qzzVarM111048t7.f160355N0) ? qzzVarM111048t7.f160355N0.getHeight() : 0;
                int[] iArr2 = new int[2];
                qzzVarM111048t7.f160408n1.getRealView().getLocationOnScreen(iArr2);
                int iM201111y0 = this.f98857c.m201111y0();
                iwl iwlVar = qzzVarM111048t7.f160408n1;
                if (iM201111y0 != 0) {
                    listRenderHeight = (((iArr[1] - iArr2[1]) - iwlVar.getListRenderHeight()) + qa00.m175859d(240.0f)) - ((int) messageBarM114041t0.getTranslationY());
                    iM175859d = (int) qzzVarM111048t7.f160366T.getTranslationY();
                } else {
                    listRenderHeight = (iArr[1] - iArr2[1]) - iwlVar.getListRenderHeight();
                    iM175859d = qa00.m175859d(240.0f);
                }
                int height3 = listRenderHeight + iM175859d;
                if (CoreModule.m30933P().m143412i().mo180521p4()) {
                    height3 = qzzVarM111048t7.f160408n1.getRealView().getHeight() - qzzVarM111048t7.f160408n1.getListRenderHeight();
                    iMin = Math.min(height + height2, height3);
                } else {
                    iMin = 0;
                }
                iMax2 = Math.max(((height - height3) + height2) - ((qzzVarM111048t7.f160358P == null || qzzVarM111048t7.f160408n1.getRealView().canScrollVertically(1) || qzzVarM111048t7.f160408n1.getRealView().canScrollVertically(-1)) ? 0 : qzzVarM111048t7.f160358P.getHeight()), 0);
                i4 = height - iMax2;
                this.f98866l = qzzVarM111048t7.f160408n1.getListRenderHeight();
            } else {
                i4 = 0;
                iMin = 0;
            }
            Animator animatorM132169o = CoreModule.m30933P().m143412i().mo180521p4() ? gt0.m132169o(qzzVarM111048t7.f160408n1.getRealView(), TantanListView.f33048v, iMin) : gt0.m132164j(390);
            float f3 = -height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(messageBarM114041t0.getTranslationY(), f3);
            valueAnimatorOfFloat.addUpdateListener(new C16968a());
            float f4 = -iMax2;
            float f5 = -i4;
            gt0.m132175u(true, xjgVar, 390L, animatorM132169o, gt0.m132171q(u1zVar.m143374g0().m114037r0(), "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160366T, "translationY", f4), gt0.m132171q(qzzVarM111048t7.f160361Q0, "translationY", f4), gt0.m132171q(qzzVarM111048t7.f160339G0, "translationY", f5), gt0.m132171q(qzzVarM111048t7.f160412p0, "translationY", f5), gt0.m132171q(qzzVarM111048t7.f160401k0, "translationY", f5), gt0.m132171q(qzzVarM111048t7.f160342H0, "translationY", f5), bnl0.m105529O0(qzzVarM111048t7.f160355N0) ? gt0.m132171q(qzzVarM111048t7.f160355N0, "translationY", f5) : gt0.m132164j(390), valueAnimatorOfFloat, gt0.m132171q(messageBarM114041t0, "translationY", f3)).start();
            if (NullChecker.m82486a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qzzVarM111048t7.f160375X0.getTop(), iMax2);
                valueAnimatorOfInt.setInterpolator(xjgVar);
                valueAnimatorOfInt.setDuration(390L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xez
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ffz.m125440y(layoutParams, qzzVarM111048t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt.start();
            }
        } else {
            Animator animatorM132169o2 = CoreModule.m30933P().m143412i().mo180521p4() ? gt0.m132169o(qzzVarM111048t7.f160408n1.getRealView(), TantanListView.f33048v, 0) : gt0.m132164j(390);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(messageBarM114041t0.getTranslationY(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new C16969b());
            Animator animatorM132175u = gt0.m132175u(true, xjgVar, 390L, animatorM132169o2, gt0.m132171q(u1zVar.m143374g0().m114037r0(), "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160366T, "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160361Q0, "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160339G0, "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160412p0, "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160401k0, "translationY", 0.0f), gt0.m132171q(qzzVarM111048t7.f160342H0, "translationY", 0.0f), bnl0.m105529O0(qzzVarM111048t7.f160355N0) ? gt0.m132171q(qzzVarM111048t7.f160355N0, "translationY", 0.0f) : gt0.m132164j(390), valueAnimatorOfFloat2, gt0.m132171q(messageBarM114041t0, "translationY", 0.0f));
            gt0.m132160f(animatorM132175u, new Runnable() { // from class: l.yez
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199433a.m125452P();
                }
            });
            animatorM132175u.start();
            if (NullChecker.m82486a(layoutParams)) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(qzzVarM111048t7.f160375X0.getTop(), 0);
                valueAnimatorOfInt2.setInterpolator(xjgVar);
                valueAnimatorOfInt2.setDuration(390L);
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zez
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ffz.m125441z(layoutParams, qzzVarM111048t7, valueAnimator);
                    }
                });
                valueAnimatorOfInt2.start();
            }
        }
        if (i != 2) {
            mo125461e();
            if (i != 0) {
                this.f98857c.m143372e0().mo50158l().m110934X2();
            }
        } else {
            mo125462f();
        }
        if (i != 0) {
            boolean zMo180308D = CoreModule.m30933P().m143412i().mo180308D();
            MessageRecyclerDispatchLinear messageRecyclerDispatchLinear = qzzVarM111048t7.f160364S;
            if (zMo180308D) {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C16970c());
                qzzVarM111048t7.f160364S.setOnTouchEventHandleListener(new zo50() { // from class: l.afz
                    @Override // p153l.zo50
                    /* JADX INFO: renamed from: a */
                    public final void mo97574a(boolean z2) {
                        this.f71074a.m125453Q(z2);
                    }
                });
            } else {
                messageRecyclerDispatchLinear.setOnDispatchTouchEventListener(new C16971d(qzzVarM111048t7));
            }
        } else {
            this.f98860f = false;
            qzzVarM111048t7.f160364S.setOnDispatchTouchEventListener(null);
            qzzVarM111048t7.f160364S.setOnTouchEventHandleListener(null);
        }
        this.f98857c.m201107R0(i);
        xzm0.m213760p().m213775s();
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: a */
    public Keyboard mo125457a() {
        return this.f98861g;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: b */
    public etx mo125458b() {
        return this.f98858d;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: c */
    public b30<Boolean, Integer, Boolean, Integer> mo125459c() {
        return this.f98867m;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: d */
    public boolean mo125460d() {
        if (this.f98857c.m201111y0() != 1 && this.f98857c.m201111y0() != 3 && this.f98857c.m201111y0() != 2 && this.f98857c.m201111y0() != 4) {
            return false;
        }
        mo125465k(0, -1);
        return true;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: e */
    public void mo125461e() {
        if (this.f98857c.m201095D0()) {
            MessageBar messageBarM114041t0 = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0();
            bnl0.m105502B(messageBarM114041t0.getBar_center_text(), false);
            this.f98856b.hideInput(messageBarM114041t0.getBar_center_text());
        }
        this.f98862h = true;
        this.f98857c.m143372e0().mo50158l().m110949a3();
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: f */
    public void mo125462f() {
        MessageBar messageBarM114041t0 = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0();
        bnl0.m105500A(messageBarM114041t0.getBar_center_text());
        if (!this.f98857c.m201095D0()) {
            m600.m157133f(this.f98856b.pageId(), this.f98857c.m143372e0().mo50158l().mo111034r3(), "keyboard");
            this.f98856b.showInput(messageBarM114041t0.getBar_center_text(), 0);
        } else if (this.f98862h) {
            m600.m157133f(this.f98856b.pageId(), this.f98857c.m143372e0().mo50158l().mo111034r3(), "keyboard");
        }
        this.f98862h = false;
        this.f98857c.m143372e0().mo50158l().m110934X2();
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: i */
    public void mo125463i() {
        this.f98861g.setUnlockSuccessListener(new x20() { // from class: l.cfz
            @Override // p153l.x20
            public final void call() {
                this.f81610a.m125448L();
            }
        });
        this.f98861g.setShareCancelCallbackListener(new x20() { // from class: l.dfz
            @Override // p153l.x20
            public final void call() {
                this.f88238a.m125449M();
            }
        });
        if (this.f98857c.m201094C0()) {
            this.f98861g.m49984E();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Keyboard keyboard = (Keyboard) this.f98856b.inflater().inflate(CoreModule.m30933P().m143412i().mo180325G1() ? qec0.f157070l5 : qec0.f157056j5, (ViewGroup) this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0().getHidden_slide_out(), false);
        this.f98861g = keyboard;
        return keyboard;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: j */
    public void mo125464j(int i) {
        MessageBar messageBarM114041t0 = this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0();
        final qzz qzzVarM111048t7 = this.f98857c.m143372e0().mo50158l().m111048t7();
        xjg xjgVar = new xjg();
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qzzVarM111048t7.f160375X0.getLayoutParams();
        if (this.f98857c.m201111y0() != 2) {
            i = messageBarM114041t0.getHidden_slide_out().getHeight();
        }
        int[] iArr = new int[2];
        messageBarM114041t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        qzzVarM111048t7.f160408n1.getRealView().getLocationOnScreen(iArr2);
        int iMax = Math.max(((i - (((((iArr[1] - iArr2[1]) - qzzVarM111048t7.f160408n1.getRealView().getHeight()) + qa00.m175859d(240.0f)) - ((int) messageBarM114041t0.getTranslationY())) + ((int) qzzVarM111048t7.f160366T.getTranslationY()))) + (bnl0.m105529O0(qzzVarM111048t7.f160355N0) ? qzzVarM111048t7.f160355N0.getHeight() : 0)) - ((qzzVarM111048t7.f160358P == null || qzzVarM111048t7.f160408n1.getRealView().canScrollVertically(1) || qzzVarM111048t7.f160408n1.getRealView().canScrollVertically(-1)) ? 0 : qzzVarM111048t7.f160358P.getHeight()), 0);
        float f = -iMax;
        m125443G(qzzVarM111048t7, -(f - qzzVarM111048t7.f160366T.getTranslationY()));
        qzzVarM111048t7.f160366T.setTranslationY(f);
        messageBarM114041t0.setTranslationY(-i);
        if (bnl0.m105529O0(qzzVarM111048t7.f160355N0)) {
            qzzVarM111048t7.f160355N0.setTranslationY(iMax - i);
        }
        if (NullChecker.m82486a(layoutParams)) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qzzVarM111048t7.f160375X0.getTop(), iMax);
            valueAnimatorOfInt.setInterpolator(xjgVar);
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.efz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ffz.m125434q(layoutParams, qzzVarM111048t7, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: k */
    public void mo125465k(int i, int i2) {
        m125456T(i, i2, false, 0);
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: l */
    public void mo125466l() {
        if (CoreModule.m30933P().m143412i().mo180314E() && NullChecker.m82486a(this.f98865k)) {
            this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0().getHidden_slide_out().removeView(this.f98865k);
            this.f98865k = null;
            this.f98864j = null;
            m125445I();
            return;
        }
        if (NullChecker.m82486a(this.f98863i)) {
            this.f98857c.m143372e0().mo50138B0().m143374g0().m114041t0().getHidden_slide_out().removeView(this.f98863i.m164439a());
            this.f98863i = null;
            m125445I();
        }
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: m */
    public boolean mo125467m() {
        return this.f98860f;
    }

    @Override // p153l.AbstractC18764n2
    /* JADX INFO: renamed from: n */
    public void mo125468n(boolean z) {
        this.f98859e = z;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
