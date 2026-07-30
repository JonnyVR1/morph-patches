package com.p000p1.mobile.putong.core.p001ui.greet;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetActViewModel;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.bt0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.h30;
import l.hpd0;
import l.i0e;
import l.jig;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.roj0;
import l.t100;
import l.ud50;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.xma;
import l.zpd0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.a1c0;
import p003l.c3c0;
import p003l.eak;
import p003l.fsl;
import p003l.ftj;
import p003l.jak;
import p003l.l6c0;
import p003l.l9k;
import p003l.o6j0;
import p003l.rw6;
import p003l.syb0;
import p003l.tak;
import p003l.y19;
import p003l.z19;
import v.VEditText;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetActViewModel extends eak<C3132a> {

    /* JADX INFO: renamed from: Q */
    public static zpd0 f1712Q = new zpd0("show_state_meet_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public fsl f1713A;

    /* JADX INFO: renamed from: B */
    public jak f1714B;

    /* JADX INFO: renamed from: C */
    public tak f1715C;

    /* JADX INFO: renamed from: H */
    public String f1720H;

    /* JADX INFO: renamed from: O */
    public boolean f1727O;

    /* JADX INFO: renamed from: P */
    public PopupWindow f1728P;

    /* JADX INFO: renamed from: a */
    public VFrame f1729a;

    /* JADX INFO: renamed from: b */
    public View f1730b;

    /* JADX INFO: renamed from: c */
    public VFrame f1731c;

    /* JADX INFO: renamed from: d */
    public VFrame f1732d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f1733e;

    /* JADX INFO: renamed from: f */
    public VFrame f1734f;

    /* JADX INFO: renamed from: g */
    public VList f1735g;

    /* JADX INFO: renamed from: h */
    public VFrame f1736h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f1737i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f1738j;

    /* JADX INFO: renamed from: k */
    public VLinear f1739k;

    /* JADX INFO: renamed from: l */
    public VImage f1740l;

    /* JADX INFO: renamed from: m */
    public VLinear f1741m;

    /* JADX INFO: renamed from: n */
    public VEditText f1742n;

    /* JADX INFO: renamed from: o */
    public VText f1743o;

    /* JADX INFO: renamed from: p */
    public VImage f1744p;

    /* JADX INFO: renamed from: q */
    public VFrame f1745q;

    /* JADX INFO: renamed from: r */
    public HeaderFrameWrapper f1746r;

    /* JADX INFO: renamed from: s */
    public VImage f1747s;

    /* JADX INFO: renamed from: t */
    public VText f1748t;

    /* JADX INFO: renamed from: u */
    public VIcon f1749u;

    /* JADX INFO: renamed from: v */
    public VIcon f1750v;

    /* JADX INFO: renamed from: x */
    public GreetAct f1752x;

    /* JADX INFO: renamed from: y */
    public CoreGiftLayer f1753y;

    /* JADX INFO: renamed from: z */
    public C3132a f1754z;

    /* JADX INFO: renamed from: w */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f1751w = new hpd0("core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: D */
    public boolean f1716D = true;

    /* JADX INFO: renamed from: E */
    public boolean f1717E = false;

    /* JADX INFO: renamed from: F */
    public int f1718F = 0;

    /* JADX INFO: renamed from: G */
    public int f1719G = 0;

    /* JADX INFO: renamed from: I */
    public boolean f1721I = false;

    /* JADX INFO: renamed from: J */
    public boolean f1722J = false;

    /* JADX INFO: renamed from: K */
    public boolean f1723K = false;

    /* JADX INFO: renamed from: L */
    public Interpolator f1724L = new jig();

    /* JADX INFO: renamed from: M */
    public Runnable f1725M = new RunnableC3123a();

    /* JADX INFO: renamed from: N */
    public Runnable f1726N = new RunnableC3124b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$4 */
    public class ResultReceiverC31224 extends ResultReceiver {
        public ResultReceiverC31224(Handler handler) {
            super(handler);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m3048b() {
            Intent intent = new Intent();
            intent.putExtra("reportUserId", GreetActViewModel.this.f1754z.m3235g0().otherUser);
            GreetActViewModel.this.act().setResult(16, intent);
            GreetActViewModel.this.act().finish();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (GreetActViewModel.this.act().m2919c2().finishForReport && i == -1) {
                e51.G(new Runnable() { // from class: com.p1.mobile.putong.core.ui.greet.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1841a.m3048b();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$a */
    public class RunnableC3123a implements Runnable {
        public RunnableC3123a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f1735g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition == 0) {
                greetActViewModel.m2993U((int) ((-greetActViewModel.f1713A.getTop()) - GreetActViewModel.this.f1735g.getTranslationY()));
            } else {
                greetActViewModel.m2993U(t100.S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$b */
    public class RunnableC3124b implements Runnable {
        public RunnableC3124b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f1735g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition != 0) {
                greetActViewModel.m2993U(t100.S);
            } else {
                GreetActViewModel.this.m2993U(((float) (-greetActViewModel.f1713A.getTop())) - GreetActViewModel.this.f1735g.getTranslationY() <= ((float) t100.t) ? 0 : t100.S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$c */
    public class C3125c extends bt0.j {
        public C3125c() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            GreetActViewModel.this.f1727O = false;
            if (GreetActViewModel.this.f1752x.m2923h2()) {
                GreetActViewModel.this.f1726N.run();
            }
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GreetActViewModel.this.f1727O = false;
            if (GreetActViewModel.this.f1752x.m2923h2()) {
                GreetActViewModel.this.f1726N.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$d */
    public class C3126d implements TextWatcher {
        public C3126d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GreetActViewModel.this.f1743o.setEnabled(!TextUtils.isEmpty(editable.toString().trim()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$e */
    public class C3127e implements AbsListView.OnScrollListener {
        public C3127e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (i == 0) {
                greetActViewModel.m2993U((int) ((-greetActViewModel.f1713A.getTop()) - GreetActViewModel.this.f1735g.getTranslationY()));
            } else {
                greetActViewModel.m2993U(t100.S);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                GreetActViewModel greetActViewModel = GreetActViewModel.this;
                if (greetActViewModel.f1717E) {
                    greetActViewModel.f1752x.hideInput();
                }
            }
            GreetActViewModel.this.f1725M.run();
            if (i == 0 && GreetActViewModel.this.f1752x.m2923h2()) {
                GreetActViewModel.this.f1726N.run();
            }
        }
    }

    public GreetActViewModel(GreetAct greetAct) {
        this.f1752x = greetAct;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m2932E(View view) {
    }

    /* JADX INFO: renamed from: T */
    private void m2945T() {
        PopupWindow popupWindow = new PopupWindow();
        this.f1728P = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(l6c0.f5868O5, (ViewGroup) null, false));
        this.f1728P.setInputMethodMode(1);
        this.f1728P.setWidth(0);
        this.f1728P.setHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m2960r0() {
        if (this.f1717E) {
            int height = (this.f1735g.getHeight() - this.f1734f.getHeight()) + this.f1719G;
            int i = height - this.f1718F;
            if (height <= 0 || i <= 0) {
                return;
            }
            this.f1718F = height;
            bt0.u(true, this.f1724L, 0L, new Animator[]{bt0.q(this.f1735g, "translationY", new float[]{-height})}).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m2962s0(View view) {
        this.f1752x.startActivity(CoreModule.P().i().j1(this.f1752x, this.f1754z.m3235g0().otherUser, new ResultReceiverC31224(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m2963t0(View view) {
        CoreModule.N().nq().onNext(Boolean.TRUE);
        zvf0.r("e_meet_back", "p_meet_back_pop");
        this.f1752x.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m2965u0(View view) {
        m2999X();
        if (!CoreModule.N().M8() || !CoreModule.N().Ui(this.f1752x.m2918b2()) || (((Long) f1712Q.get()).longValue() != 0 && z19.m11322b(((Long) f1712Q.get()).longValue(), mqi0.o()))) {
            if (CoreModule.N().M8() && CoreModule.N().Ui(this.f1752x.m2918b2())) {
                CoreModule.N().nq().onNext(Boolean.TRUE);
            }
            this.f1752x.finish();
            return;
        }
        f1712Q.put(Long.valueOf(mqi0.o()));
        final cwf0 cwf0VarC = i0e.c("p_meet_back_pop", Dialog.class.getName());
        xh0.a aVar = new xh0.a(this.f1752x);
        aVar.j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        aVar.h(false);
        aVar.r("再看看");
        aVar.f("确定退出");
        aVar.m(new DialogInterface.OnDismissListener() { // from class: l.p8k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        aVar.c(new View.OnClickListener() { // from class: l.q8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6986a.m2963t0(view2);
            }
        });
        aVar.o(new View.OnClickListener() { // from class: l.r8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.r("e_stay_meet", "p_meet_back_pop");
            }
        });
        aVar.a().g();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m2968w0(View view) {
        m2989R0(this.f1742n.getText().toString().trim());
        this.f1742n.setText("");
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m2972A0(ValueAnimator valueAnimator) {
        this.f1725M.run();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m2973B0() {
        m3030n1(true);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2974C0() {
        return this.f1752x;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m2975D0(CoreGiftInfo coreGiftInfo, boolean z, String str) {
        ViewGroup viewGroup = (ViewGroup) act().getWindow().getDecorView();
        CoreGiftLayer coreGiftLayer = (CoreGiftLayer) viewGroup.findViewWithTag("gift_layer_view_tag");
        this.f1753y = coreGiftLayer;
        if (coreGiftLayer == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            CoreGiftLayer coreGiftLayer2 = (CoreGiftLayer) o7r.a(this.f1752x).inflate(l6c0.f5834K, (ViewGroup) null, false);
            this.f1753y = coreGiftLayer2;
            coreGiftLayer2.setTag("gift_layer_view_tag");
            viewGroup.addView(this.f1753y, layoutParams);
        }
        this.f1753y.m2785w(coreGiftInfo, null);
        this.f1753y.m2770C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer3 = this.f1753y;
            if (zIsEmpty) {
                coreGiftLayer3.m2776n();
            } else {
                coreGiftLayer3.m2774G(str);
            }
            this.f1753y.m2771D(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m2976E0() {
        this.f1725M.run();
        if (this.f1752x.m2923h2()) {
            this.f1726N.run();
        }
        if (this.f1752x.m2919c2().hotLevel < 1) {
            this.f1742n.requestFocus();
        }
        this.f1752x.showInput(this.f1742n, 0);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m2977G0(User user, View view) {
        o6j0.m8403c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C3390a.m8422h("user_id", ((DbObject) user).id));
        this.f1754z.m3233z1("from_greet_act", ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m2978H0(User user, View view) {
        o6j0.m8403c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C3390a.m8422h("user_id", ((DbObject) user).id));
        this.f1754z.m3233z1("from_greet_act", ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m2979I0(User user, View view) {
        o6j0.m8403c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C3390a.m8422h("user_id", ((DbObject) user).id));
        this.f1754z.m3233z1("from_greet_act", ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m2980J0(CoreGiftInfo coreGiftInfo) {
        this.f1754z.m3193E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m2981K0(String str) {
        this.f1742n.setText("");
        m3022j1(str);
        CoreModule.P().g().Xe();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m2982L0(CoreGiftInfo coreGiftInfo, String str) {
        m3038r1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m2983M0(String str) {
        if ("bubble_say_hi_gift_first_guide".equals(str)) {
            this.f1723K = false;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m2984N0(CoreGiftInfo coreGiftInfo) {
        this.f1754z.m3193E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m2985O0() {
        this.f1749u.performClick();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m2986P0(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        if (CoreModule.P().g().Fh() > 0) {
            m3012e1(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m2987Q0(String str, roj0 roj0Var) {
        if (CoreModule.P().g().Fh() > 0) {
            m3016g1(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m2988R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l9k.m7710b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R0 */
    public void m2989R0(final String str) {
        final String str2 = "";
        if (this.f1752x.m2922g2() || this.f1752x.m2924i2()) {
            m2991S0(str, "", "");
        } else if (NullChecker.a(this.f1754z.m3205S0())) {
            this.f1752x.duringCreated(CoreModule.c.f0.Cg(this.f1754z.m3204R0(), ((DbObject) this.f1754z.m3205S0()).id)).take(1).subscribe(mkd0.G(new e30() { // from class: l.m8k
                public final void call(Object obj) {
                    this.f6283a.m3044x0(str, str2, str2, (Boolean) obj);
                }
            }));
        } else {
            m2991S0(str, "", "");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public GreetAct act() {
        return this.f1752x;
    }

    /* JADX INFO: renamed from: S0 */
    public void m2991S0(String str, String str2, String str3) {
        if (NullChecker.a(this.f1735g)) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            messageNew_.value = str;
            messageNew_.consumeType = str2;
            messageNew_.coinSign = str3;
            Runnable runnable = new Runnable() { // from class: l.v8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7937a.m3046z0(messageNew_);
                }
            };
            if (this.f1735g.getLastVisiblePosition() == this.f1735g.getCount() - 1) {
                runnable.run();
                return;
            }
            VList vList = this.f1735g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, -10000);
            this.f1735g.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m2992T0() {
        if (this.f1727O) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i8k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5014a.m2972A0(valueAnimator);
            }
        });
        duration.addListener(new C3125c());
        duration.start();
        this.f1727O = true;
    }

    /* JADX INFO: renamed from: U */
    public void m2993U(int i) {
        VFrame vFrame = this.f1732d;
        int i2 = t100.t;
        vFrame.setClipChildren(i > i2);
        this.f1732d.setClipToPadding(i > i2);
        this.f1713A.mo3281b(this.f1746r, this.f1747s, this.f1748t, i);
    }

    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void m3042v0(View view) {
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m3020i1(C3132a c3132a) {
        this.f1754z = c3132a;
    }

    /* JADX INFO: renamed from: V0 */
    public void m2996V0(int i) {
        if (i == 0 && this.f1717E) {
            m3015g0();
            m3030n1(false);
            return;
        }
        if (i > 0) {
            this.f1719G = i;
            this.f1717E = true;
            int height = (this.f1735g.getHeight() - this.f1734f.getHeight()) + i;
            this.f1718F = height;
            if (height < 0) {
                this.f1718F = 0;
            }
            bt0.f(bt0.u(true, this.f1724L, 390L, new Animator[]{bt0.q(this.f1735g, "translationY", new float[]{-this.f1718F}), bt0.q(this.f1737i, "translationY", new float[]{-i})}), this.f1752x.m2923h2() ? this.f1726N : this.f1725M).start();
            m2992T0();
            this.f1739k.postDelayed(new Runnable() { // from class: l.n8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6492a.m2973B0();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m2997W(final String str) {
        if (xma.M3() || !m3023k0()) {
            m2991S0(str, ConsumeType.privilege, "");
            return;
        }
        this.f1742n.setText(str);
        this.f1742n.setSelection(str.length());
        if (CoreModule.P().g().Fh() > 0) {
            m3016g1(str);
        } else {
            CoreModule.P().g().Pk(this.f1752x, "p_chat_greet,greet", new e30() { // from class: l.w8k
                public final void call(Object obj) {
                    this.f8137a.m3027m0(str, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m2998W0(boolean z) {
        if (z && this.f1754z.m3229t1() && NullChecker.a(this.f1728P) && !this.f1728P.isShowing()) {
            this.f1728P.setBackgroundDrawable(new ColorDrawable(0));
            this.f1728P.showAtLocation(this.f1752x.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m2999X() {
        this.f1752x.hideInput(this.f1742n);
        if (this.f1723K) {
            d.l().k("bubble_say_hi_gift_first_guide");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m3000X0(final CoreGiftInfo coreGiftInfo, final boolean z, final String str, boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            e51.F(this.f1752x, new Runnable() { // from class: l.t8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7523a.m2975D0(coreGiftInfo, z, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final View m3001Y() {
        this.f1713A = (fsl) this.f1752x.inflater().inflate((this.f1752x.m2922g2() && TextUtils.equals(this.f1752x.m2920d2().m3235g0().actorUserId, CoreModule.H().userId()) && !CoreModule.P().i().e()) ? l6c0.f6066s : l6c0.f6099w4, (ViewGroup) null);
        this.f1714B = new jak(act(), this.f1754z, this.f1713A);
        return (View) this.f1713A;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m3002Y0(List<Message> list) {
        if (NullChecker.a(this.f1715C)) {
            this.f1715C.m9557A(list);
            if (m3021j0()) {
                this.f1735g.setSelection(Integer.MAX_VALUE);
                VList vList = this.f1735g;
                vList.smoothScrollToPositionFromTop(vList.getCount() - 1, -10000);
                this.f1716D = false;
                this.f1735g.post(new Runnable() { // from class: l.o8k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6629a.m2976E0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m3003Z() {
        if (NullChecker.a(this.f1728P) && this.f1728P.isShowing()) {
            this.f1728P.dismiss();
            this.f1728P = null;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m3004Z0(final User user) {
        if (this.f1752x.m2922g2()) {
            boolean zIsFemale = CoreModule.c.e0.p9().isFemale();
            VEditText vEditText = this.f1742n;
            if (zIsFemale) {
                vEditText.setHint("真诚交友，认真打个招呼吧");
            } else {
                vEditText.setHint("回复即可与她配对");
            }
        } else if (m3025l0() && NullChecker.a(this.f1754z.m3235g0())) {
            this.f1742n.setHint(m3009d0(user));
        } else if (CoreModule.P().i().F() && NullChecker.a(this.f1754z.m3235g0())) {
            boolean zEquals = TextUtils.equals(CoreModule.H().userId(), this.f1754z.m3235g0().actorUserId);
            VEditText vEditText2 = this.f1742n;
            if (zEquals) {
                vEditText2.setHint(y19.m11111j(user.isFemale()));
            } else {
                vEditText2.setHint("请输入消息...");
            }
        } else if (this.f1752x.m2923h2() || !NullChecker.a(this.f1754z.m3235g0()) || TextUtils.isEmpty(this.f1754z.m3235g0().moment.id)) {
            this.f1742n.setHint("输入新消息");
        } else {
            this.f1742n.setHint("通过动态找话题，更容易得到回复");
        }
        if (NullChecker.a(user)) {
            this.f1720H = String.format("85%%的男性发出“hi”后，不会收到回复，聊聊%s的动态，更容易得到回复", user.isFemale() ? "她" : "他");
        }
        xdl0.M(this.f1746r, true);
        xdl0.M(this.f1748t, true);
        xdl0.M(this.f1747s, true);
        boolean zM3199N1 = this.f1754z.m3199N1();
        HeaderFrameWrapper headerFrameWrapper = this.f1746r;
        if (zM3199N1) {
            headerFrameWrapper.B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.v0(user, rw6.m9196b(user).profileSmall());
        }
        this.f1748t.setText(user.name);
        this.f1713A.mo3283c(user, this.f1754z.m3199N1());
        xdl0.E0(this.f1746r, new View.OnClickListener() { // from class: l.g9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4595a.m2977G0(user, view);
            }
        });
        xdl0.E0(this.f1748t, new View.OnClickListener() { // from class: l.h9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4848a.m2978H0(user, view);
            }
        });
        this.f1713A.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.i9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5105a.m2979I0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final List<String> m3005a0() {
        if (this.f1752x.m2922g2() && CoreModule.c.e0.p9().isFemale() && NullChecker.a(y19.m11110i())) {
            return y19.m11110i().quick_reply;
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m3006a1(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m3007b0() {
        try {
            String strF = RemoteConfig.x().F("core_im_say_hi_gift_guide_text");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString("guide_text") : "送个礼物更容易被回复哦";
        } catch (Exception unused) {
            return "送个礼物更容易被回复哦";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m3008c0() {
        return ((Boolean) this.f1751w.get()).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public final String m3009d0(User user) {
        List<String> listM3011e0 = user.isFemale() ? m3011e0("hint_input_female") : m3011e0("hint_input_male");
        Collections.shuffle(listM3011e0);
        if (vwb.J(listM3011e0)) {
            return user.isFemale() ? "问问她平时的爱好是什么" : "问问他平时的爱好是什么";
        }
        return listM3011e0.get(0);
    }

    /* JADX INFO: renamed from: d1 */
    public void m3010d1() {
        if (this.f1735g.getLastVisiblePosition() != this.f1735g.getCount() - 1) {
            VList vList = this.f1735g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, -10000);
        }
    }

    public void destroy() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: e0 */
    public List<String> m3011e0(String str) {
        String strF = RemoteConfig.x().F("dynamic_square_four_hello_greeting");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strF)) {
            try {
                JSONArray jSONArray = new JSONObject(strF).getJSONArray(str);
                if (NullChecker.a(jSONArray) && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                } else if (vwb.J(arrayList)) {
                    str.getClass();
                    switch (str) {
                        case "hint_input_male":
                            arrayList.add("问问他平时的爱好是什么");
                            arrayList.add("和他聊聊最近看过的电影吧");
                            arrayList.add("和他聊聊最近的开心事");
                            arrayList.add("问问他下班后最喜欢做些啥");
                            arrayList.add("和他聊聊最喜欢的歌手吧");
                            arrayList.add("问问他交朋友最看重什么");
                            break;
                        case "quick_reply_receiver":
                        case "quick_reply":
                            arrayList.add("哈喽～");
                            arrayList.add("[玫瑰]");
                            arrayList.add("在干嘛？");
                            arrayList.add("很希望可以认识你");
                            arrayList.add("今天开心吗？");
                            break;
                        case "hint_input_female":
                            arrayList.add("问问她平时的爱好是什么");
                            arrayList.add("和她聊聊最近看过的电影吧");
                            arrayList.add("和她聊聊最近的开心事");
                            arrayList.add("问问她下班后最喜欢做些啥");
                            arrayList.add("和她聊聊最喜欢的歌手吧");
                            arrayList.add("问问她交朋友最看重什么");
                            break;
                    }
                }
            } catch (JSONException unused) {
            }
        } else if (vwb.J(arrayList)) {
            str.getClass();
            switch (str) {
                case -1318542822:
                    if (!str.equals("hint_input_male")) {
                    }
                    break;
                case -674643914:
                    if (!str.equals("quick_reply_receiver")) {
                    }
                    break;
                case -300980199:
                    if (!str.equals("hint_input_female")) {
                    }
                    break;
                case 527873560:
                    if (!str.equals("quick_reply")) {
                    }
                    break;
                default:
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p001ui.greet.GreetActViewModel.m3011e0(java.lang.String):java.util.List");
        }

        /* JADX INFO: renamed from: e1 */
        public final void m3012e1(final CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = "coin";
            coreGiftInfo.coinSign = CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
            if (CoreModule.P().g().Wi()) {
                CoreModule.o.d().jf(this.f1752x, CoreModule.c.H0.t5(), (Runnable) null, (Runnable) null, new d30() { // from class: l.c9k
                    public final void call() {
                        this.f3996a.m2980J0(coreGiftInfo);
                    }
                });
            } else {
                this.f1754z.m3193E1(coreGiftInfo);
            }
        }

        /* JADX INFO: renamed from: f0 */
        public final boolean m3013f0() {
            return CoreModule.K().m5149ck() || xma.M3() || !m3023k0();
        }

        /* JADX INFO: renamed from: f1 */
        public final void m3014f1(CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = ConsumeType.privilege;
            this.f1754z.m3193E1(coreGiftInfo);
        }

        /* JADX INFO: renamed from: g0 */
        public void m3015g0() {
            this.f1717E = false;
            bt0.f(bt0.u(true, this.f1724L, 390L, new Animator[]{bt0.q(this.f1737i, "translationY", new float[]{0.0f}), bt0.q(this.f1735g, "translationY", new float[]{0.0f})}), this.f1752x.m2923h2() ? this.f1726N : this.f1725M).start();
            m2992T0();
        }

        /* JADX INFO: renamed from: g1 */
        public final void m3016g1(final String str) {
            if (CoreModule.P().g().Wi()) {
                CoreModule.o.d().jf(this.f1752x, CoreModule.c.H0.t5(), (Runnable) null, (Runnable) null, new d30() { // from class: l.b9k
                    public final void call() {
                        this.f3349a.m2981K0(str);
                    }
                });
            } else {
                this.f1742n.setText("");
                m3022j1(str);
            }
        }

        /* JADX INFO: renamed from: h0 */
        public final void m3017h0(List<String> list, final int i) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f1752x, 0, false);
            linearLayoutManager.canScrollVertically();
            xdl0.M(this.f1738j, true);
            this.f1738j.setLayoutManager(linearLayoutManager);
            final syb0 syb0Var = new syb0();
            syb0Var.m9503I(list);
            syb0Var.m9504J(new e30() { // from class: l.y8k
                public final void call(Object obj) {
                    this.f9004a.m3031o0(i, syb0Var, (Integer) obj);
                }
            });
            this.f1738j.setAdapter(syb0Var);
            this.f1738j.setOverScrollMode(0);
            if (CoreModule.P().i().O8()) {
                o6j0.m8408h("e_fast_message", "p_kankan_chat_popup", o6j0.C3390a.m8420f("fast_message_role", i), o6j0.C3390a.m8422h("moments_user_id", NullChecker.a(this.f1754z.m3205S0()) ? ((DbObject) this.f1754z.m3205S0()).id : ""));
            }
        }

        /* JADX INFO: renamed from: h1 */
        public final void m3018h1(final CoreGiftInfo coreGiftInfo) {
            if (CoreModule.K().m5149ck() || !m3023k0()) {
                this.f1754z.m3193E1(coreGiftInfo);
                return;
            }
            if (xma.M3()) {
                m3014f1(coreGiftInfo);
            } else if (CoreModule.P().g().Fh() > 0) {
                m3012e1(coreGiftInfo);
            } else {
                CoreModule.P().g().Pk(this.f1752x, "p_chat,gift_send", new e30() { // from class: l.x8k
                    public final void call(Object obj) {
                        this.f8419a.m2982L0(coreGiftInfo, (String) obj);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: i0 */
        public final void m3019i0() {
            boolean z = m3013f0() && !this.f1752x.m2922g2();
            xdl0.M(this.f1740l, z);
            if (z) {
                if (!this.f1722J) {
                    if (d.l().x("_edit_greet_tip")) {
                        return;
                    } else {
                        this.f1740l.postDelayed(new Runnable() { // from class: l.j8k
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f5268a.m3033p0();
                            }
                        }, 500L);
                    }
                }
                xdl0.E0(this.f1740l, new View.OnClickListener() { // from class: l.k8k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5622a.m3035q0(view);
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.ListAdapter, l.tak] */
        public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewM2988R = m2988R(layoutInflater, viewGroup);
            this.f1735g.addHeaderView(m3001Y());
            this.f1735g.setHeaderDividersEnabled(false);
            ?? takVar = new tak(this.f1752x, this.f1735g);
            this.f1715C = takVar;
            this.f1735g.setAdapter((ListAdapter) takVar);
            this.f1715C.notifyDataSetChanged();
            View upKeyboardDetectorLayout = this.f1752x.setUpKeyboardDetectorLayout(viewM2988R, new View(this.f1752x), new h30() { // from class: l.c8k
                /* JADX INFO: renamed from: b */
                public final void m5869b(Object obj, Object obj2, Object obj3, Object obj4) {
                    this.f3985a.m3029n0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
                }
            });
            if (this.f1754z.m3229t1()) {
                m2945T();
            }
            if (!vwb.J(m3005a0())) {
                m3017h0(m3005a0(), 0);
                return upKeyboardDetectorLayout;
            }
            if (CoreModule.P().i().O8()) {
                if (TextUtils.equals(this.f1754z.m3235g0().actorUserId, CoreModule.H().userId())) {
                    m3017h0(m3011e0("quick_reply"), 0);
                    return upKeyboardDetectorLayout;
                }
                m3017h0(m3011e0("quick_reply_receiver"), 1);
            }
            return upKeyboardDetectorLayout;
        }

        /* JADX INFO: renamed from: j0 */
        public boolean m3021j0() {
            return this.f1716D;
        }

        /* JADX INFO: renamed from: j1 */
        public final void m3022j1(String str) {
            m2991S0(str, "coin", CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }

        /* JADX INFO: renamed from: k0 */
        public boolean m3023k0() {
            return this.f1754z.m3236h0().greetInfo.createdTime < 1.0d;
        }

        /* JADX INFO: renamed from: k1 */
        public final void m3024k1() {
            this.f1751w.put(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l0 */
        public boolean m3025l0() {
            return this.f1721I;
        }

        /* JADX INFO: renamed from: l1 */
        public void m3026l1(boolean z) {
            this.f1721I = z;
        }

        /* JADX INFO: renamed from: m0 */
        public final /* synthetic */ void m3027m0(String str, String str2) {
            m3039s1(str);
        }

        /* JADX INFO: renamed from: m1 */
        public void m3028m1() {
            act().getWindow().setSoftInputMode(21);
        }

        /* JADX INFO: renamed from: n0 */
        public final /* synthetic */ void m3029n0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
            m2996V0(bool.booleanValue() ? num.intValue() : 0);
        }

        /* JADX INFO: renamed from: n1 */
        public final void m3030n1(boolean z) {
            d dVarL = d.l();
            if (!z && dVarL.x("_edit_greet_tip")) {
                dVarL.k("_edit_greet_tip");
                return;
            }
            User userNa = CoreModule.c.e0.na();
            if (z && !TextUtils.isEmpty(this.f1720H) && CoreModule.P().i().y() && NullChecker.a(this.f1754z.m3235g0()) && TextUtils.equals(CoreModule.H().userId(), this.f1754z.m3235g0().actorUserId) && NullChecker.a(userNa) && !userNa.isFemale() && !((Boolean) CoreModule.c.r0.c0.get()).booleanValue() && !this.f1754z.m3209Y0()) {
                dVarL.u(new a(act()).p(t100.d(12.0f)).D(this.f1720H).J(13.0f).p(75).F(true).E(true).x(-t100.h).N(new a.d() { // from class: l.l8k
                    /* JADX INFO: renamed from: a */
                    public final void m7704a(View view) {
                        CoreModule.c.r0.c0.put(Boolean.TRUE);
                    }
                }).H(t100.d(15.0f), t100.d(10.0f), t100.d(15.0f), t100.d(10.0f)).b(5000L).q(a.R | a.Q), this.f1739k, "_edit_greet_tip");
            }
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m3031o0(int i, syb0 syb0Var, Integer num) {
            if (CoreModule.P().i().O8()) {
                o6j0.m8403c("e_fast_message", "p_kankan_chat_popup", o6j0.C3390a.m8420f("fast_message_role", i), o6j0.C3390a.m8422h("fast_message_text", syb0Var.getItem(num.intValue()).trim()), o6j0.C3390a.m8422h("moments_user_id", NullChecker.a(this.f1754z.m3205S0()) ? ((DbObject) this.f1754z.m3205S0()).id : ""));
            } else {
                o6j0.m8403c("e_fast_message", "p_kankan_chat_popup", new o6j0.C3390a[0]);
            }
            m2989R0(syb0Var.getItem(num.intValue()).trim());
        }

        /* JADX INFO: renamed from: o1 */
        public final void m3032o1(CoreGiftPanelName coreGiftPanelName) {
            if (NullChecker.a(this.f1754z.m3205S0())) {
                ftj.m6509c(this.f1752x, coreGiftPanelName, new e30() { // from class: l.u8k
                    public final void call(Object obj) {
                        this.f7703a.m3018h1((CoreGiftInfo) obj);
                    }
                }, ((DbObject) this.f1754z.m3205S0()).id, "p_kankan_chat_popup", this.f1754z.getFrom(), null, 2);
            }
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m3033p0() {
            m3034p1(this.f1740l, m3007b0());
        }

        /* JADX INFO: renamed from: p1 */
        public final void m3034p1(View view, String str) {
            if (NullChecker.a(this.f1752x)) {
                d.l().k("bubble_say_hi_gift_first_guide");
                a aVar = new a(this.f1752x);
                aVar.l(t100.d(7.0f)).H(t100.d(16.0f), t100.d(10.0f), t100.d(16.0f), t100.d(10.0f)).G(a1c0.f2693b).k(new int[]{-98787}).p(75).J(13.0f).b(3000L).e(true).j(new a.c() { // from class: l.s8k
                    /* JADX INFO: renamed from: a */
                    public final void m9243a(String str2) {
                        this.f7303a.m2983M0(str2);
                    }
                }).D(str).q(a.O | a.Q).x(-t100.d(8.0f)).K(0);
                d.l().u(aVar, view, "bubble_say_hi_gift_first_guide");
                m3024k1();
                this.f1722J = true;
                this.f1723K = true;
            }
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m3035q0(View view) {
            if (CoreModule.K().m5149ck()) {
                m3032o1(CoreGiftPanelName.get(com.p000p1.mobile.putong.core.data.CoreGiftPanelName.chat));
            } else {
                m3032o1(CoreGiftPanelName.get(GiftSubBizType.greet));
            }
            m2999X();
        }

        /* JADX INFO: renamed from: q1 */
        public void m3036q1(User user, CoreGiftPanelName coreGiftPanelName) {
            if (!xma.F3() && this.f1752x.m2919c2().hotLevel > 0) {
                o6j0.m8408h("e_chat_gift_bar", "p_kankan_chat_popup", new o6j0.C3390a[0]);
                ftj.m6509c(this.f1752x, coreGiftPanelName, new e30() { // from class: l.e9k
                    public final void call(Object obj) {
                        this.f4275a.m2984N0((CoreGiftInfo) obj);
                    }
                }, ((DbObject) user).id, "p_kankan_chat_popup", this.f1754z.getFrom(), new d30() { // from class: l.f9k
                    public final void call() {
                        this.f4425a.m2985O0();
                    }
                }, this.f1752x.m2919c2().hotLevel);
            }
        }

        /* JADX INFO: renamed from: r */
        public void m3037r() {
            m3028m1();
            this.f1752x.setSwipeBackEnable(false);
            this.f1717E = false;
            this.f1722J = m3008c0();
            if (NullChecker.a(this.f1747s)) {
                if (this.f1752x.m2922g2()) {
                    this.f1747s.setBackgroundResource(0);
                    this.f1747s.setImageResource(CoreModule.P().i().e() ? c3c0.f3558G : c3c0.f3567H);
                } else if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
                    this.f1747s.setImageResource(c3c0.f3772e6);
                } else {
                    this.f1747s.setImageResource(c3c0.f3856o0);
                }
            }
            if (this.f1754z.m3212a1() && NullChecker.a(this.f1754z.m3235g0().moment) && TextUtils.isEmpty(this.f1754z.m3235g0().moment.id)) {
                this.f1713A.mo3276O();
            }
            this.f1735g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.j9k
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f5282a.m2960r0();
                }
            });
            m3019i0();
            xdl0.E0(this.f1750v, new View.OnClickListener() { // from class: l.k9k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5627a.m2962s0(view);
                }
            });
            xdl0.E0(this.f1749u, new View.OnClickListener() { // from class: l.d8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4133a.m2965u0(view);
                }
            });
            this.f1742n.addTextChangedListener(new C3126d());
            this.f1742n.setText("");
            xdl0.E0(this.f1742n, new View.OnClickListener() { // from class: l.e8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4270a.m3042v0(view);
                }
            });
            xdl0.E0(this.f1743o, new View.OnClickListener() { // from class: l.f8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4423a.m2968w0(view);
                }
            });
            xdl0.E0(this.f1730b, new View.OnClickListener() { // from class: l.g8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GreetActViewModel.m2932E(view);
                }
            });
            this.f1735g.setOnScrollListener(new C3127e());
            this.f1729a.setOnDispatchTouchEventListener(new ud50() { // from class: l.h8k
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return this.f4809a.m3006a1(motionEvent);
                }
            });
            if (TextUtils.isEmpty(this.f1752x.m2919c2().preSendMsg) || this.f1752x.m2919c2().hotLevel > 0) {
                return;
            }
            m2989R0(this.f1752x.m2919c2().preSendMsg);
        }

        /* JADX INFO: renamed from: r1 */
        public final void m3038r1(final CoreGiftInfo coreGiftInfo) {
            if (NullChecker.a(this.f1752x)) {
                this.f1752x.duringCreated(CoreModule.c.H0.k5()).take(1).subscribe(mkd0.G(new e30() { // from class: l.d9k
                    public final void call(Object obj) {
                        this.f4137a.m2986P0(coreGiftInfo, (roj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: s1 */
        public final void m3039s1(final String str) {
            if (NullChecker.a(this.f1752x)) {
                this.f1752x.duringCreated(CoreModule.c.H0.k5()).take(1).subscribe(mkd0.G(new e30() { // from class: l.a9k
                    public final void call(Object obj) {
                        this.f2744a.m2987Q0(str, (roj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: t1 */
        public void m3040t1(User user, String str) {
            this.f1713A.mo3285k(user, str);
        }

        /* JADX INFO: renamed from: u1 */
        public void m3041u1(String str, BubbleInfo bubbleInfo) {
            this.f1713A.mo3286n(str, bubbleInfo, this.f1754z.getFrom());
        }

        /* JADX INFO: renamed from: v1 */
        public void m3043v1(C3132a c3132a, User user, String str) {
            if (!vwb.J(m3005a0())) {
                m3017h0(m3005a0(), 0);
                return;
            }
            if (CoreModule.N().ld()) {
                m3026l1(true);
                this.f1713A.mo3275M(c3132a, user, str);
                m3017h0(m3011e0("quick_reply"), 0);
                if (NullChecker.a(c3132a.m3235g0())) {
                    this.f1742n.setHint(m3009d0(user));
                }
            }
        }

        /* JADX INFO: renamed from: x0 */
        public final /* synthetic */ void m3044x0(String str, String str2, String str3, Boolean bool) {
            if (CoreModule.K().m5149ck() || bool.booleanValue()) {
                m2991S0(str, str2, str3);
            } else if (this.f1752x.m2925k2()) {
                m2991S0(str, ConsumeType.privilege, "");
            } else {
                m2997W(str);
            }
        }

        /* JADX INFO: renamed from: y0 */
        public final /* synthetic */ void m3045y0(Message message) {
            this.f1754z.m3197J1(message);
            VList vList = this.f1735g;
            vList.setSelection(vList.getCount());
        }

        /* JADX INFO: renamed from: z0 */
        public final /* synthetic */ void m3046z0(final Message message) {
            if (this.f1735g.getLastVisiblePosition() == this.f1735g.getCount() - 1) {
                this.f1754z.m3197J1(message);
            } else {
                act().post(new Runnable() { // from class: l.z8k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9202a.m3045y0(message);
                    }
                });
            }
            VList vList = this.f1735g;
            vList.setSelection(vList.getCount());
        }
    }
