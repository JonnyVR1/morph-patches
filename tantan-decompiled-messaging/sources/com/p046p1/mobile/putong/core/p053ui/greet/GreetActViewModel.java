package com.p046p1.mobile.putong.core.p053ui.greet;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetActViewModel;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.a1c0;
import p149l.bt0;
import p149l.c3c0;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.eak;
import p149l.fsl;
import p149l.ftj;
import p149l.h30;
import p149l.hpd0;
import p149l.i0e;
import p149l.jak;
import p149l.jig;
import p149l.l6c0;
import p149l.l9k;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.o7r;
import p149l.roj0;
import p149l.rw6;
import p149l.syb0;
import p149l.t100;
import p149l.tak;
import p149l.ud50;
import p149l.vwb;
import p149l.xdl0;
import p149l.xh0;
import p149l.xma;
import p149l.y19;
import p149l.z19;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetActViewModel extends eak<C8357a> {

    /* JADX INFO: renamed from: Q */
    public static zpd0 f29318Q = new zpd0("show_state_meet_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public fsl f29319A;

    /* JADX INFO: renamed from: B */
    public jak f29320B;

    /* JADX INFO: renamed from: C */
    public tak f29321C;

    /* JADX INFO: renamed from: H */
    public String f29326H;

    /* JADX INFO: renamed from: O */
    public boolean f29333O;

    /* JADX INFO: renamed from: P */
    public PopupWindow f29334P;

    /* JADX INFO: renamed from: a */
    public VFrame f29335a;

    /* JADX INFO: renamed from: b */
    public View f29336b;

    /* JADX INFO: renamed from: c */
    public VFrame f29337c;

    /* JADX INFO: renamed from: d */
    public VFrame f29338d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f29339e;

    /* JADX INFO: renamed from: f */
    public VFrame f29340f;

    /* JADX INFO: renamed from: g */
    public VList f29341g;

    /* JADX INFO: renamed from: h */
    public VFrame f29342h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f29343i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f29344j;

    /* JADX INFO: renamed from: k */
    public VLinear f29345k;

    /* JADX INFO: renamed from: l */
    public VImage f29346l;

    /* JADX INFO: renamed from: m */
    public VLinear f29347m;

    /* JADX INFO: renamed from: n */
    public VEditText f29348n;

    /* JADX INFO: renamed from: o */
    public VText f29349o;

    /* JADX INFO: renamed from: p */
    public VImage f29350p;

    /* JADX INFO: renamed from: q */
    public VFrame f29351q;

    /* JADX INFO: renamed from: r */
    public HeaderFrameWrapper f29352r;

    /* JADX INFO: renamed from: s */
    public VImage f29353s;

    /* JADX INFO: renamed from: t */
    public VText f29354t;

    /* JADX INFO: renamed from: u */
    public VIcon f29355u;

    /* JADX INFO: renamed from: v */
    public VIcon f29356v;

    /* JADX INFO: renamed from: x */
    public GreetAct f29358x;

    /* JADX INFO: renamed from: y */
    public CoreGiftLayer f29359y;

    /* JADX INFO: renamed from: z */
    public C8357a f29360z;

    /* JADX INFO: renamed from: w */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f29357w = new hpd0("core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: D */
    public boolean f29322D = true;

    /* JADX INFO: renamed from: E */
    public boolean f29323E = false;

    /* JADX INFO: renamed from: F */
    public int f29324F = 0;

    /* JADX INFO: renamed from: G */
    public int f29325G = 0;

    /* JADX INFO: renamed from: I */
    public boolean f29327I = false;

    /* JADX INFO: renamed from: J */
    public boolean f29328J = false;

    /* JADX INFO: renamed from: K */
    public boolean f29329K = false;

    /* JADX INFO: renamed from: L */
    public Interpolator f29330L = new jig();

    /* JADX INFO: renamed from: M */
    public Runnable f29331M = new RunnableC8348a();

    /* JADX INFO: renamed from: N */
    public Runnable f29332N = new RunnableC8349b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$4 */
    public class ResultReceiverC83474 extends ResultReceiver {
        public ResultReceiverC83474(Handler handler) {
            super(handler);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m45710b() {
            Intent intent = new Intent();
            intent.putExtra("reportUserId", GreetActViewModel.this.f29360z.m45889g0().otherUser);
            GreetActViewModel.this.getAct().setResult(16, intent);
            GreetActViewModel.this.getAct().lambda$debugItems$19();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (GreetActViewModel.this.getAct().m45583c2().finishForReport && i == -1) {
                e51.m114742G(new Runnable() { // from class: com.p1.mobile.putong.core.ui.greet.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29447a.m45710b();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$a */
    public class RunnableC8348a implements Runnable {
        public RunnableC8348a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f29341g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition == 0) {
                greetActViewModel.m45656U((int) ((-greetActViewModel.f29319A.getTop()) - GreetActViewModel.this.f29341g.getTranslationY()));
            } else {
                greetActViewModel.m45656U(t100.f167244S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$b */
    public class RunnableC8349b implements Runnable {
        public RunnableC8349b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f29341g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition != 0) {
                greetActViewModel.m45656U(t100.f167244S);
            } else {
                GreetActViewModel.this.m45656U(((float) (-greetActViewModel.f29319A.getTop())) - GreetActViewModel.this.f29341g.getTranslationY() <= ((float) t100.f167271t) ? 0 : t100.f167244S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$c */
    public class C8350c extends bt0.C15966j {
        public C8350c() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            GreetActViewModel.this.f29333O = false;
            if (GreetActViewModel.this.f29358x.m45587h2()) {
                GreetActViewModel.this.f29332N.run();
            }
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GreetActViewModel.this.f29333O = false;
            if (GreetActViewModel.this.f29358x.m45587h2()) {
                GreetActViewModel.this.f29332N.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$d */
    public class C8351d implements TextWatcher {
        public C8351d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GreetActViewModel.this.f29349o.setEnabled(!TextUtils.isEmpty(editable.toString().trim()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$e */
    public class C8352e implements AbsListView.OnScrollListener {
        public C8352e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (i == 0) {
                greetActViewModel.m45656U((int) ((-greetActViewModel.f29319A.getTop()) - GreetActViewModel.this.f29341g.getTranslationY()));
            } else {
                greetActViewModel.m45656U(t100.f167244S);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                GreetActViewModel greetActViewModel = GreetActViewModel.this;
                if (greetActViewModel.f29323E) {
                    greetActViewModel.f29358x.hideInput();
                }
            }
            GreetActViewModel.this.f29331M.run();
            if (i == 0 && GreetActViewModel.this.f29358x.m45587h2()) {
                GreetActViewModel.this.f29332N.run();
            }
        }
    }

    public GreetActViewModel(GreetAct greetAct) {
        this.f29358x = greetAct;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m45596E(View view) {
    }

    /* JADX INFO: renamed from: T */
    private void m45609T() {
        PopupWindow popupWindow = new PopupWindow();
        this.f29334P = popupWindow;
        popupWindow.setContentView(getAct().inflater().inflate(l6c0.f126359O5, (ViewGroup) null, false));
        this.f29334P.setInputMethodMode(1);
        this.f29334P.setWidth(0);
        this.f29334P.setHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m45624r0() {
        if (this.f29323E) {
            int height = (this.f29341g.getHeight() - this.f29340f.getHeight()) + this.f29325G;
            int i = height - this.f29324F;
            if (height <= 0 || i <= 0) {
                return;
            }
            this.f29324F = height;
            bt0.m103748u(true, this.f29330L, 0L, bt0.m103744q(this.f29341g, "translationY", -height)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m45626s0(View view) {
        this.f29358x.startActivity(CoreModule.m29935P().m94658i().mo158395j1(this.f29358x, this.f29360z.m45889g0().otherUser, new ResultReceiverC83474(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m45627t0(View view) {
        CoreModule.m29934N().mo60377nq().onNext(Boolean.TRUE);
        zvf0.m220396r("e_meet_back", "p_meet_back_pop");
        this.f29358x.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m45629u0(View view) {
        m45662X();
        if (!CoreModule.m29934N().mo60294M8() || !CoreModule.m29934N().mo60324Ui(this.f29358x.m45582b2()) || (f29318Q.get().longValue() != 0 && z19.m216789b(f29318Q.get().longValue(), mqi0.m155944o()))) {
            if (CoreModule.m29934N().mo60294M8() && CoreModule.m29934N().mo60324Ui(this.f29358x.m45582b2())) {
                CoreModule.m29934N().mo60377nq().onNext(Boolean.TRUE);
            }
            this.f29358x.lambda$debugItems$19();
            return;
        }
        f29318Q.put(Long.valueOf(mqi0.m155944o()));
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_meet_back_pop", Dialog.class.getName());
        xh0.C21150a c21150a = new xh0.C21150a(this.f29358x);
        c21150a.m208731j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        c21150a.m208729h(false);
        c21150a.m208739r("再看看");
        c21150a.m208727f("确定退出");
        c21150a.m208734m(new DialogInterface.OnDismissListener() { // from class: l.p8k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        c21150a.m208724c(new View.OnClickListener() { // from class: l.q8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f153197a.m45627t0(view2);
            }
        });
        c21150a.m208736o(new View.OnClickListener() { // from class: l.r8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvf0.m220396r("e_stay_meet", "p_meet_back_pop");
            }
        });
        c21150a.m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m45632w0(View view) {
        m45652R0(this.f29348n.getText().toString().trim());
        this.f29348n.setText("");
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m45636A0(ValueAnimator valueAnimator) {
        this.f29331M.run();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m45637B0() {
        m45692n1(true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f29358x;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m45638D0(CoreGiftInfo coreGiftInfo, boolean z, String str) {
        ViewGroup viewGroup = (ViewGroup) getAct().getWindow().getDecorView();
        CoreGiftLayer coreGiftLayer = (CoreGiftLayer) viewGroup.findViewWithTag("gift_layer_view_tag");
        this.f29359y = coreGiftLayer;
        if (coreGiftLayer == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            CoreGiftLayer coreGiftLayer2 = (CoreGiftLayer) o7r.m163037a(this.f29358x).inflate(l6c0.f126325K, (ViewGroup) null, false);
            this.f29359y = coreGiftLayer2;
            coreGiftLayer2.setTag("gift_layer_view_tag");
            viewGroup.addView(this.f29359y, layoutParams);
        }
        this.f29359y.m45455w(coreGiftInfo, null);
        this.f29359y.m45440C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer3 = this.f29359y;
            if (zIsEmpty) {
                coreGiftLayer3.m45446n();
            } else {
                coreGiftLayer3.m45444G(str);
            }
            this.f29359y.m45441D(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m45639E0() {
        this.f29331M.run();
        if (this.f29358x.m45587h2()) {
            this.f29332N.run();
        }
        if (this.f29358x.m45583c2().hotLevel < 1) {
            this.f29348n.requestFocus();
        }
        this.f29358x.showInput(this.f29348n, 0);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m45640G0(User user, View view) {
        o6j0.m162859c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C18854a.m162878h("user_id", user.f56011id));
        this.f29360z.m45887z1("from_greet_act", user.f56011id);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m45641H0(User user, View view) {
        o6j0.m162859c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C18854a.m162878h("user_id", user.f56011id));
        this.f29360z.m45887z1("from_greet_act", user.f56011id);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m45642I0(User user, View view) {
        o6j0.m162859c("e_kankan_chat_head", "p_kankan_chat_popup", o6j0.C18854a.m162878h("user_id", user.f56011id));
        this.f29360z.m45887z1("from_greet_act", user.f56011id);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m45643J0(CoreGiftInfo coreGiftInfo) {
        this.f29360z.m45849E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m45644K0(String str) {
        this.f29348n.setText("");
        m45684j1(str);
        CoreModule.m29935P().m94656g().mo35038Xe();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m45645L0(CoreGiftInfo coreGiftInfo, String str) {
        m45700r1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m45646M0(String str) {
        if ("bubble_say_hi_gift_first_guide".equals(str)) {
            this.f29329K = false;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m45647N0(CoreGiftInfo coreGiftInfo) {
        this.f29360z.m45849E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m45648O0() {
        this.f29355u.performClick();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m45649P0(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m45675e1(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m45650Q0(String str, roj0 roj0Var) {
        if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m45679g1(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m45651R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l9k.m149036b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R0 */
    public void m45652R0(final String str) {
        final String str2 = "";
        if (this.f29358x.m45586g2() || this.f29358x.m45588i2()) {
            m45654S0(str, "", "");
        } else if (NullChecker.m81303a(this.f29360z.m45861S0())) {
            this.f29358x.duringCreated(CoreModule.f17545c.f19642f0.m32603Cg(this.f29360z.m45860R0(), this.f29360z.m45861S0().f56011id)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.m8k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f132582a.m45706x0(str, str2, str2, (Boolean) obj);
                }
            }));
        } else {
            m45654S0(str, "", "");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public GreetAct getAct() {
        return this.f29358x;
    }

    /* JADX INFO: renamed from: S0 */
    public void m45654S0(String str, String str2, String str3) {
        if (NullChecker.m81303a(this.f29341g)) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            messageNew_.value = str;
            messageNew_.consumeType = str2;
            messageNew_.coinSign = str3;
            Runnable runnable = new Runnable() { // from class: l.v8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180547a.m45708z0(messageNew_);
                }
            };
            if (this.f29341g.getLastVisiblePosition() == this.f29341g.getCount() - 1) {
                runnable.run();
                return;
            }
            VList vList = this.f29341g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
            this.f29341g.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m45655T0() {
        if (this.f29333O) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i8k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f112049a.m45636A0(valueAnimator);
            }
        });
        duration.addListener(new C8350c());
        duration.start();
        this.f29333O = true;
    }

    /* JADX INFO: renamed from: U */
    public void m45656U(int i) {
        VFrame vFrame = this.f29338d;
        int i2 = t100.f167271t;
        vFrame.setClipChildren(i > i2);
        this.f29338d.setClipToPadding(i > i2);
        this.f29319A.mo40655b(this.f29352r, this.f29353s, this.f29354t, i);
    }

    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void m45704v0(View view) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8357a c8357a) {
        this.f29360z = c8357a;
    }

    /* JADX INFO: renamed from: V0 */
    public void m45659V0(int i) {
        if (i == 0 && this.f29323E) {
            m45678g0();
            m45692n1(false);
            return;
        }
        if (i > 0) {
            this.f29325G = i;
            this.f29323E = true;
            int height = (this.f29341g.getHeight() - this.f29340f.getHeight()) + i;
            this.f29324F = height;
            if (height < 0) {
                this.f29324F = 0;
            }
            bt0.m103733f(bt0.m103748u(true, this.f29330L, 390L, bt0.m103744q(this.f29341g, "translationY", -this.f29324F), bt0.m103744q(this.f29343i, "translationY", -i)), this.f29358x.m45587h2() ? this.f29332N : this.f29331M).start();
            m45655T0();
            this.f29345k.postDelayed(new Runnable() { // from class: l.n8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137657a.m45637B0();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m45660W(final String str) {
        if (xma.m210048M3() || !m45685k0()) {
            m45654S0(str, "privilege", "");
            return;
        }
        this.f29348n.setText(str);
        this.f29348n.setSelection(str.length());
        if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m45679g1(str);
        } else {
            CoreModule.m29935P().m94656g().mo35024Pk(this.f29358x, "p_chat_greet,greet", new e30() { // from class: l.w8k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185229a.m45689m0(str, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m45661W0(boolean z) {
        if (z && this.f29360z.m45883t1() && NullChecker.m81303a(this.f29334P) && !this.f29334P.isShowing()) {
            this.f29334P.setBackgroundDrawable(new ColorDrawable(0));
            this.f29334P.showAtLocation(this.f29358x.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m45662X() {
        this.f29358x.hideInput(this.f29348n);
        if (this.f29329K) {
            C4348d.m20896l().m20900k("bubble_say_hi_gift_first_guide");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m45663X0(final CoreGiftInfo coreGiftInfo, final boolean z, final String str, boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            e51.m114741F(this.f29358x, new Runnable() { // from class: l.t8k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168924a.m45638D0(coreGiftInfo, z, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final View m45664Y() {
        this.f29319A = (fsl) this.f29358x.inflater().inflate((this.f29358x.m45586g2() && TextUtils.equals(this.f29358x.m45584d2().m45889g0().actorUserId, CoreModule.m29931H().userId()) && !CoreModule.m29935P().m94658i().mo158365e()) ? l6c0.f126557s : l6c0.f126590w4, (ViewGroup) null);
        this.f29320B = new jak(getAct(), this.f29360z, this.f29319A);
        return (View) this.f29319A;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m45665Y0(List<Message> list) {
        if (NullChecker.m81303a(this.f29321C)) {
            this.f29321C.m187728A(list);
            if (m45683j0()) {
                this.f29341g.setSelection(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                VList vList = this.f29341g;
                vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                this.f29322D = false;
                this.f29341g.post(new Runnable() { // from class: l.o8k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f142643a.m45639E0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m45666Z() {
        if (NullChecker.m81303a(this.f29334P) && this.f29334P.isShowing()) {
            this.f29334P.dismiss();
            this.f29334P = null;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m45667Z0(final User user) {
        if (this.f29358x.m45586g2()) {
            boolean zIsFemale = CoreModule.f17545c.f19639e0.m169527p9().isFemale();
            VEditText vEditText = this.f29348n;
            if (zIsFemale) {
                vEditText.setHint("真诚交友，认真打个招呼吧");
            } else {
                vEditText.setHint("回复即可与她配对");
            }
        } else if (m45687l0() && NullChecker.m81303a(this.f29360z.m45889g0())) {
            this.f29348n.setHint(m45672d0(user));
        } else if (CoreModule.m29935P().m94658i().mo158228F() && NullChecker.m81303a(this.f29360z.m45889g0())) {
            boolean zEquals = TextUtils.equals(CoreModule.m29931H().userId(), this.f29360z.m45889g0().actorUserId);
            VEditText vEditText2 = this.f29348n;
            if (zEquals) {
                vEditText2.setHint(y19.m212175j(user.isFemale()));
            } else {
                vEditText2.setHint("请输入消息...");
            }
        } else if (this.f29358x.m45587h2() || !NullChecker.m81303a(this.f29360z.m45889g0()) || TextUtils.isEmpty(this.f29360z.m45889g0().moment.f38759id)) {
            this.f29348n.setHint("输入新消息");
        } else {
            this.f29348n.setHint("通过动态找话题，更容易得到回复");
        }
        if (NullChecker.m81303a(user)) {
            this.f29326H = String.format("85%%的男性发出“hi”后，不会收到回复，聊聊%s的动态，更容易得到回复", user.isFemale() ? "她" : "他");
        }
        xdl0.m208344M(this.f29352r, true);
        xdl0.m208344M(this.f29354t, true);
        xdl0.m208344M(this.f29353s, true);
        boolean zM45855N1 = this.f29360z.m45855N1();
        HeaderFrameWrapper headerFrameWrapper = this.f29352r;
        if (zM45855N1) {
            headerFrameWrapper.m79692B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m79710v0(user, rw6.m181386b(user).profileSmall());
        }
        this.f29354t.setText(user.name);
        this.f29319A.mo40656c(user, this.f29360z.m45855N1());
        xdl0.m208329E0(this.f29352r, new View.OnClickListener() { // from class: l.g9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101573a.m45640G0(user, view);
            }
        });
        xdl0.m208329E0(this.f29354t, new View.OnClickListener() { // from class: l.h9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106608a.m45641H0(user, view);
            }
        });
        this.f29319A.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.i9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112227a.m45642I0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final List<String> m45668a0() {
        if (this.f29358x.m45586g2() && CoreModule.f17545c.f19639e0.m169527p9().isFemale() && NullChecker.m81303a(y19.m212174i())) {
            return y19.m212174i().quick_reply;
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m45669a1(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m45670b0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("core_im_say_hi_gift_guide_text");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("guide_text") : "送个礼物更容易被回复哦";
        } catch (Exception unused) {
            return "送个礼物更容易被回复哦";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m45671c0() {
        return this.f29357w.get().booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public final String m45672d0(User user) {
        List<String> listM45674e0 = user.isFemale() ? m45674e0("hint_input_female") : m45674e0("hint_input_male");
        Collections.shuffle(listM45674e0);
        if (vwb.m200296J(listM45674e0)) {
            return user.isFemale() ? "问问她平时的爱好是什么" : "问问他平时的爱好是什么";
        }
        return listM45674e0.get(0);
    }

    /* JADX INFO: renamed from: d1 */
    public void m45673d1() {
        if (this.f29341g.getLastVisiblePosition() != this.f29341g.getCount() - 1) {
            VList vList = this.f29341g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
        }
    }

    @Override // p149l.s7m
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
    public List<String> m45674e0(String str) {
        String strM79302F = RemoteConfig.m79298x().m79302F("dynamic_square_four_hello_greeting");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM79302F)) {
            try {
                JSONArray jSONArray = new JSONObject(strM79302F).getJSONArray(str);
                if (NullChecker.m81303a(jSONArray) && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                } else if (vwb.m200296J(arrayList)) {
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
        } else if (vwb.m200296J(arrayList)) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.p053ui.greet.GreetActViewModel.m45674e0(java.lang.String):java.util.List");
        }

        /* JADX INFO: renamed from: e1 */
        public final void m45675e1(final CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = "coin";
            coreGiftInfo.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
            if (CoreModule.m29935P().m94656g().mo35036Wi()) {
                CoreModule.f17557o.m195057d().mo33860jf(this.f29358x, CoreModule.f17545c.f19570H0.m210379t5(), null, null, new d30() { // from class: l.c9k
                    @Override // p149l.d30
                    public final void call() {
                        this.f79947a.m45643J0(coreGiftInfo);
                    }
                });
            } else {
                this.f29360z.m45849E1(coreGiftInfo);
            }
        }

        /* JADX INFO: renamed from: f0 */
        public final boolean m45676f0() {
            return CoreModule.m29932K().mo30751ck() || xma.m210048M3() || !m45685k0();
        }

        /* JADX INFO: renamed from: f1 */
        public final void m45677f1(CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = "privilege";
            this.f29360z.m45849E1(coreGiftInfo);
        }

        /* JADX INFO: renamed from: g0 */
        public void m45678g0() {
            this.f29323E = false;
            bt0.m103733f(bt0.m103748u(true, this.f29330L, 390L, bt0.m103744q(this.f29343i, "translationY", 0.0f), bt0.m103744q(this.f29341g, "translationY", 0.0f)), this.f29358x.m45587h2() ? this.f29332N : this.f29331M).start();
            m45655T0();
        }

        /* JADX INFO: renamed from: g1 */
        public final void m45679g1(final String str) {
            if (CoreModule.m29935P().m94656g().mo35036Wi()) {
                CoreModule.f17557o.m195057d().mo33860jf(this.f29358x, CoreModule.f17545c.f19570H0.m210379t5(), null, null, new d30() { // from class: l.b9k
                    @Override // p149l.d30
                    public final void call() {
                        this.f74591a.m45644K0(str);
                    }
                });
            } else {
                this.f29348n.setText("");
                m45684j1(str);
            }
        }

        /* JADX INFO: renamed from: h0 */
        public final void m45680h0(List<String> list, final int i) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f29358x, 0, false);
            linearLayoutManager.canScrollVertically();
            xdl0.m208344M(this.f29344j, true);
            this.f29344j.setLayoutManager(linearLayoutManager);
            final syb0 syb0Var = new syb0();
            syb0Var.m186655I(list);
            syb0Var.m186656J(new e30() { // from class: l.y8k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196849a.m45693o0(i, syb0Var, (Integer) obj);
                }
            });
            this.f29344j.setAdapter(syb0Var);
            this.f29344j.setOverScrollMode(0);
            if (CoreModule.m29935P().m94658i().mo33383O8()) {
                o6j0.m162864h("e_fast_message", "p_kankan_chat_popup", o6j0.C18854a.m162876f("fast_message_role", i), o6j0.C18854a.m162878h("moments_user_id", NullChecker.m81303a(this.f29360z.m45861S0()) ? this.f29360z.m45861S0().f56011id : ""));
            }
        }

        /* JADX INFO: renamed from: h1 */
        public final void m45681h1(final CoreGiftInfo coreGiftInfo) {
            if (CoreModule.m29932K().mo30751ck() || !m45685k0()) {
                this.f29360z.m45849E1(coreGiftInfo);
                return;
            }
            if (xma.m210048M3()) {
                m45677f1(coreGiftInfo);
            } else if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
                m45675e1(coreGiftInfo);
            } else {
                CoreModule.m29935P().m94656g().mo35024Pk(this.f29358x, "p_chat,gift_send", new e30() { // from class: l.x8k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f191527a.m45645L0(coreGiftInfo, (String) obj);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: i0 */
        public final void m45682i0() {
            boolean z = m45676f0() && !this.f29358x.m45586g2();
            xdl0.m208344M(this.f29346l, z);
            if (z) {
                if (!this.f29328J) {
                    if (C4348d.m20896l().m20912x("_edit_greet_tip")) {
                        return;
                    } else {
                        this.f29346l.postDelayed(new Runnable() { // from class: l.j8k
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f116722a.m45695p0();
                            }
                        }, 500L);
                    }
                }
                xdl0.m208329E0(this.f29346l, new View.OnClickListener() { // from class: l.k8k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f121835a.m45697q0(view);
                    }
                });
            }
        }

        @Override // p149l.s7m
        public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewM45651R = m45651R(layoutInflater, viewGroup);
            this.f29341g.addHeaderView(m45664Y());
            this.f29341g.setHeaderDividersEnabled(false);
            tak takVar = new tak(this.f29358x, this.f29341g);
            this.f29321C = takVar;
            this.f29341g.setAdapter((ListAdapter) takVar);
            this.f29321C.notifyDataSetChanged();
            View upKeyboardDetectorLayout = this.f29358x.setUpKeyboardDetectorLayout(viewM45651R, new View(this.f29358x), new h30() { // from class: l.c8k
                @Override // p149l.h30
                /* JADX INFO: renamed from: b */
                public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                    this.f79771a.m45691n0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
                }
            });
            if (this.f29360z.m45883t1()) {
                m45609T();
            }
            if (!vwb.m200296J(m45668a0())) {
                m45680h0(m45668a0(), 0);
                return upKeyboardDetectorLayout;
            }
            if (CoreModule.m29935P().m94658i().mo33383O8()) {
                if (TextUtils.equals(this.f29360z.m45889g0().actorUserId, CoreModule.m29931H().userId())) {
                    m45680h0(m45674e0("quick_reply"), 0);
                    return upKeyboardDetectorLayout;
                }
                m45680h0(m45674e0("quick_reply_receiver"), 1);
            }
            return upKeyboardDetectorLayout;
        }

        /* JADX INFO: renamed from: j0 */
        public boolean m45683j0() {
            return this.f29322D;
        }

        /* JADX INFO: renamed from: j1 */
        public final void m45684j1(String str) {
            m45654S0(str, "coin", CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }

        /* JADX INFO: renamed from: k0 */
        public boolean m45685k0() {
            return this.f29360z.m45890h0().greetInfo.createdTime < 1.0d;
        }

        /* JADX INFO: renamed from: k1 */
        public final void m45686k1() {
            this.f29357w.put(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l0 */
        public boolean m45687l0() {
            return this.f29327I;
        }

        /* JADX INFO: renamed from: l1 */
        public void m45688l1(boolean z) {
            this.f29327I = z;
        }

        /* JADX INFO: renamed from: m0 */
        public final /* synthetic */ void m45689m0(String str, String str2) {
            m45701s1(str);
        }

        /* JADX INFO: renamed from: m1 */
        public void m45690m1() {
            getAct().getWindow().setSoftInputMode(21);
        }

        /* JADX INFO: renamed from: n0 */
        public final /* synthetic */ void m45691n0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
            m45659V0(bool.booleanValue() ? num.intValue() : 0);
        }

        /* JADX INFO: renamed from: n1 */
        public final void m45692n1(boolean z) {
            C4348d c4348dM20896l = C4348d.m20896l();
            if (!z && c4348dM20896l.m20912x("_edit_greet_tip")) {
                c4348dM20896l.m20900k("_edit_greet_tip");
                return;
            }
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (z && !TextUtils.isEmpty(this.f29326H) && CoreModule.m29935P().m94658i().mo158471y() && NullChecker.m81303a(this.f29360z.m45889g0()) && TextUtils.equals(CoreModule.m29931H().userId(), this.f29360z.m45889g0().actorUserId) && NullChecker.m81303a(userM169520na) && !userM169520na.isFemale() && !CoreModule.f17545c.f19678r0.f20022c0.get().booleanValue() && !this.f29360z.m45865Y0()) {
                c4348dM20896l.m20909u(new C4345a(getAct()).m20874p(t100.m186890d(12.0f)).m20849D(this.f29326H).m20855J(13.0f).m20874p(75).m20851F(true).m20850E(true).m20882x(-t100.f167259h).m20859N(new C4345a.d() { // from class: l.l8k
                    @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo20887a(View view) {
                        CoreModule.f17545c.f19678r0.f20022c0.put(Boolean.TRUE);
                    }
                }).m20853H(t100.m186890d(15.0f), t100.m186890d(10.0f), t100.m186890d(15.0f), t100.m186890d(10.0f)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(C4345a.f15684R | C4345a.f15683Q), this.f29345k, "_edit_greet_tip");
            }
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m45693o0(int i, syb0 syb0Var, Integer num) {
            if (CoreModule.m29935P().m94658i().mo33383O8()) {
                o6j0.m162859c("e_fast_message", "p_kankan_chat_popup", o6j0.C18854a.m162876f("fast_message_role", i), o6j0.C18854a.m162878h("fast_message_text", syb0Var.getItem(num.intValue()).trim()), o6j0.C18854a.m162878h("moments_user_id", NullChecker.m81303a(this.f29360z.m45861S0()) ? this.f29360z.m45861S0().f56011id : ""));
            } else {
                o6j0.m162859c("e_fast_message", "p_kankan_chat_popup", new o6j0.C18854a[0]);
            }
            m45652R0(syb0Var.getItem(num.intValue()).trim());
        }

        /* JADX INFO: renamed from: o1 */
        public final void m45694o1(CoreGiftPanelName coreGiftPanelName) {
            if (NullChecker.m81303a(this.f29360z.m45861S0())) {
                ftj.m123058c(this.f29358x, coreGiftPanelName, new e30() { // from class: l.u8k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f175141a.m45681h1((CoreGiftInfo) obj);
                    }
                }, this.f29360z.m45861S0().f56011id, "p_kankan_chat_popup", this.f29360z.getFrom(), null, 2);
            }
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m45695p0() {
            m45696p1(this.f29346l, m45670b0());
        }

        /* JADX INFO: renamed from: p1 */
        public final void m45696p1(View view, String str) {
            if (NullChecker.m81303a(this.f29358x)) {
                C4348d.m20896l().m20900k("bubble_say_hi_gift_first_guide");
                C4345a c4345a = new C4345a(this.f29358x);
                c4345a.m20871l(t100.m186890d(7.0f)).m20853H(t100.m186890d(16.0f), t100.m186890d(10.0f), t100.m186890d(16.0f), t100.m186890d(10.0f)).m20852G(a1c0.f67147b).m20870k(-98787).m20874p(75).m20855J(13.0f).m20861b(3000L).m20864e(true).m20869j(new C4345a.c() { // from class: l.s8k
                    @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
                    /* JADX INFO: renamed from: a */
                    public final void mo20886a(String str2) {
                        this.f163080a.m45646M0(str2);
                    }
                }).m20849D(str).m20875q(C4345a.f15681O | C4345a.f15683Q).m20882x(-t100.m186890d(8.0f)).m20856K(0);
                C4348d.m20896l().m20909u(c4345a, view, "bubble_say_hi_gift_first_guide");
                m45686k1();
                this.f29328J = true;
                this.f29329K = true;
            }
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m45697q0(View view) {
            if (CoreModule.m29932K().mo30751ck()) {
                m45694o1(CoreGiftPanelName.get("chat"));
            } else {
                m45694o1(CoreGiftPanelName.get("greet"));
            }
            m45662X();
        }

        /* JADX INFO: renamed from: q1 */
        public void m45698q1(User user, CoreGiftPanelName coreGiftPanelName) {
            if (!xma.m210043F3() && this.f29358x.m45583c2().hotLevel > 0) {
                o6j0.m162864h("e_chat_gift_bar", "p_kankan_chat_popup", new o6j0.C18854a[0]);
                ftj.m123058c(this.f29358x, coreGiftPanelName, new e30() { // from class: l.e9k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f90108a.m45647N0((CoreGiftInfo) obj);
                    }
                }, user.f56011id, "p_kankan_chat_popup", this.f29360z.getFrom(), new d30() { // from class: l.f9k
                    @Override // p149l.d30
                    public final void call() {
                        this.f96491a.m45648O0();
                    }
                }, this.f29358x.m45583c2().hotLevel);
            }
        }

        /* JADX INFO: renamed from: r */
        public void m45699r() {
            m45690m1();
            this.f29358x.setSwipeBackEnable(false);
            this.f29323E = false;
            this.f29328J = m45671c0();
            if (NullChecker.m81303a(this.f29353s)) {
                if (this.f29358x.m45586g2()) {
                    this.f29353s.setBackgroundResource(0);
                    this.f29353s.setImageResource(CoreModule.m29935P().m94658i().mo158365e() ? c3c0.f78521G : c3c0.f78530H);
                } else if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
                    this.f29353s.setImageResource(c3c0.f78735e6);
                } else {
                    this.f29353s.setImageResource(c3c0.f78819o0);
                }
            }
            if (this.f29360z.m45866a1() && NullChecker.m81303a(this.f29360z.m45889g0().moment) && TextUtils.isEmpty(this.f29360z.m45889g0().moment.f38759id)) {
                this.f29319A.mo40654O();
            }
            this.f29341g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.j9k
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f116933a.m45624r0();
                }
            });
            m45682i0();
            xdl0.m208329E0(this.f29356v, new View.OnClickListener() { // from class: l.k9k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122047a.m45626s0(view);
                }
            });
            xdl0.m208329E0(this.f29355u, new View.OnClickListener() { // from class: l.d8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84874a.m45629u0(view);
                }
            });
            this.f29348n.addTextChangedListener(new C8351d());
            this.f29348n.setText("");
            xdl0.m208329E0(this.f29348n, new View.OnClickListener() { // from class: l.e8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89832a.m45704v0(view);
                }
            });
            xdl0.m208329E0(this.f29349o, new View.OnClickListener() { // from class: l.f8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96383a.m45632w0(view);
                }
            });
            xdl0.m208329E0(this.f29336b, new View.OnClickListener() { // from class: l.g8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GreetActViewModel.m45596E(view);
                }
            });
            this.f29341g.setOnScrollListener(new C8352e());
            this.f29335a.setOnDispatchTouchEventListener(new ud50() { // from class: l.h8k
                @Override // p149l.ud50
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return this.f106448a.m45669a1(motionEvent);
                }
            });
            if (TextUtils.isEmpty(this.f29358x.m45583c2().preSendMsg) || this.f29358x.m45583c2().hotLevel > 0) {
                return;
            }
            m45652R0(this.f29358x.m45583c2().preSendMsg);
        }

        /* JADX INFO: renamed from: r1 */
        public final void m45700r1(final CoreGiftInfo coreGiftInfo) {
            if (NullChecker.m81303a(this.f29358x)) {
                this.f29358x.duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.d9k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f85128a.m45649P0(coreGiftInfo, (roj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: s1 */
        public final void m45701s1(final String str) {
            if (NullChecker.m81303a(this.f29358x)) {
                this.f29358x.duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.a9k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f68188a.m45650Q0(str, (roj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: t1 */
        public void m45702t1(User user, String str) {
            this.f29319A.mo40662k(user, str);
        }

        /* JADX INFO: renamed from: u1 */
        public void m45703u1(String str, BubbleInfo bubbleInfo) {
            this.f29319A.mo40665n(str, bubbleInfo, this.f29360z.getFrom());
        }

        /* JADX INFO: renamed from: v1 */
        public void m45705v1(C8357a c8357a, User user, String str) {
            if (!vwb.m200296J(m45668a0())) {
                m45680h0(m45668a0(), 0);
                return;
            }
            if (CoreModule.m29934N().mo60368ld()) {
                m45688l1(true);
                this.f29319A.mo40653M(c8357a, user, str);
                m45680h0(m45674e0("quick_reply"), 0);
                if (NullChecker.m81303a(c8357a.m45889g0())) {
                    this.f29348n.setHint(m45672d0(user));
                }
            }
        }

        /* JADX INFO: renamed from: x0 */
        public final /* synthetic */ void m45706x0(String str, String str2, String str3, Boolean bool) {
            if (CoreModule.m29932K().mo30751ck() || bool.booleanValue()) {
                m45654S0(str, str2, str3);
            } else if (this.f29358x.m45589k2()) {
                m45654S0(str, "privilege", "");
            } else {
                m45660W(str);
            }
        }

        /* JADX INFO: renamed from: y0 */
        public final /* synthetic */ void m45707y0(Message message) {
            this.f29360z.m45853J1(message);
            VList vList = this.f29341g;
            vList.setSelection(vList.getCount());
        }

        /* JADX INFO: renamed from: z0 */
        public final /* synthetic */ void m45708z0(final Message message) {
            if (this.f29341g.getLastVisiblePosition() == this.f29341g.getCount() - 1) {
                this.f29360z.m45853J1(message);
            } else {
                getAct().post(new Runnable() { // from class: l.z8k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202180a.m45707y0(message);
                    }
                });
            }
            VList vList = this.f29341g;
            vList.setSelection(vList.getCount());
        }
    }
