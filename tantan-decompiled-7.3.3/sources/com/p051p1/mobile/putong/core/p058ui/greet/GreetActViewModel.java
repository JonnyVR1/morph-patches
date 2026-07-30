package com.p051p1.mobile.putong.core.p058ui.greet;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetActViewModel;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.adk;
import p153l.b30;
import p153l.bm50;
import p153l.bnl0;
import p153l.byd0;
import p153l.cck;
import p153l.g9c0;
import p153l.gt0;
import p153l.h39;
import p153l.i39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.kdk;
import p153l.l4g0;
import p153l.l51;
import p153l.p9r;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qec0;
import p153l.sfj0;
import p153l.th0;
import p153l.tul;
import p153l.ux6;
import p153l.uxj0;
import p153l.vck;
import p153l.vvj;
import p153l.w1e;
import p153l.w6c0;
import p153l.x20;
import p153l.xjg;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GreetActViewModel extends vck<C8520a> {

    /* JADX INFO: renamed from: Q */
    public static byd0 f30166Q = new byd0("show_state_meet_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public tul f30167A;

    /* JADX INFO: renamed from: B */
    public adk f30168B;

    /* JADX INFO: renamed from: C */
    public kdk f30169C;

    /* JADX INFO: renamed from: H */
    public String f30174H;

    /* JADX INFO: renamed from: O */
    public boolean f30181O;

    /* JADX INFO: renamed from: P */
    public PopupWindow f30182P;

    /* JADX INFO: renamed from: a */
    public VFrame f30183a;

    /* JADX INFO: renamed from: b */
    public View f30184b;

    /* JADX INFO: renamed from: c */
    public VFrame f30185c;

    /* JADX INFO: renamed from: d */
    public VFrame f30186d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f30187e;

    /* JADX INFO: renamed from: f */
    public VFrame f30188f;

    /* JADX INFO: renamed from: g */
    public VList f30189g;

    /* JADX INFO: renamed from: h */
    public VFrame f30190h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f30191i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f30192j;

    /* JADX INFO: renamed from: k */
    public VLinear f30193k;

    /* JADX INFO: renamed from: l */
    public VImage f30194l;

    /* JADX INFO: renamed from: m */
    public VLinear f30195m;

    /* JADX INFO: renamed from: n */
    public VEditText f30196n;

    /* JADX INFO: renamed from: o */
    public VText f30197o;

    /* JADX INFO: renamed from: p */
    public VImage f30198p;

    /* JADX INFO: renamed from: q */
    public VFrame f30199q;

    /* JADX INFO: renamed from: r */
    public HeaderFrameWrapper f30200r;

    /* JADX INFO: renamed from: s */
    public VImage f30201s;

    /* JADX INFO: renamed from: t */
    public VText f30202t;

    /* JADX INFO: renamed from: u */
    public VIcon f30203u;

    /* JADX INFO: renamed from: v */
    public VIcon f30204v;

    /* JADX INFO: renamed from: x */
    public GreetAct f30206x;

    /* JADX INFO: renamed from: y */
    public CoreGiftLayer f30207y;

    /* JADX INFO: renamed from: z */
    public C8520a f30208z;

    /* JADX INFO: renamed from: w */
    @SuppressLint({"SV_USE_DUP_ID"})
    public jxd0 f30205w = new jxd0("core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: D */
    public boolean f30170D = true;

    /* JADX INFO: renamed from: E */
    public boolean f30171E = false;

    /* JADX INFO: renamed from: F */
    public int f30172F = 0;

    /* JADX INFO: renamed from: G */
    public int f30173G = 0;

    /* JADX INFO: renamed from: I */
    public boolean f30175I = false;

    /* JADX INFO: renamed from: J */
    public boolean f30176J = false;

    /* JADX INFO: renamed from: K */
    public boolean f30177K = false;

    /* JADX INFO: renamed from: L */
    public Interpolator f30178L = new xjg();

    /* JADX INFO: renamed from: M */
    public Runnable f30179M = new RunnableC8511a();

    /* JADX INFO: renamed from: N */
    public Runnable f30180N = new RunnableC8512b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$4 */
    public class ResultReceiverC85104 extends ResultReceiver {
        public ResultReceiverC85104(Handler handler) {
            super(handler);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m46893b() {
            Intent intent = new Intent();
            intent.putExtra("reportUserId", GreetActViewModel.this.f30208z.m47072g0().otherUser);
            GreetActViewModel.this.getAct().setResult(16, intent);
            GreetActViewModel.this.getAct().lambda$debugItems$19();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (GreetActViewModel.this.getAct().m46766d2().finishForReport && i == -1) {
                l51.m152887G(new Runnable() { // from class: com.p1.mobile.putong.core.ui.greet.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30295a.m46893b();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$a */
    public class RunnableC8511a implements Runnable {
        public RunnableC8511a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f30189g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition == 0) {
                greetActViewModel.m46839U((int) ((-greetActViewModel.f30167A.getTop()) - GreetActViewModel.this.f30189g.getTranslationY()));
            } else {
                greetActViewModel.m46839U(qa00.f156306S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$b */
    public class RunnableC8512b implements Runnable {
        public RunnableC8512b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = GreetActViewModel.this.f30189g.getFirstVisiblePosition();
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (firstVisiblePosition != 0) {
                greetActViewModel.m46839U(qa00.f156306S);
            } else {
                GreetActViewModel.this.m46839U(((float) (-greetActViewModel.f30167A.getTop())) - GreetActViewModel.this.f30189g.getTranslationY() <= ((float) qa00.f156333t) ? 0 : qa00.f156306S);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$c */
    public class C8513c extends gt0.C17308j {
        public C8513c() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            GreetActViewModel.this.f30181O = false;
            if (GreetActViewModel.this.f30206x.m46770i2()) {
                GreetActViewModel.this.f30180N.run();
            }
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GreetActViewModel.this.f30181O = false;
            if (GreetActViewModel.this.f30206x.m46770i2()) {
                GreetActViewModel.this.f30180N.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$d */
    public class C8514d implements TextWatcher {
        public C8514d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GreetActViewModel.this.f30197o.setEnabled(!TextUtils.isEmpty(editable.toString().trim()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.GreetActViewModel$e */
    public class C8515e implements AbsListView.OnScrollListener {
        public C8515e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            GreetActViewModel greetActViewModel = GreetActViewModel.this;
            if (i == 0) {
                greetActViewModel.m46839U((int) ((-greetActViewModel.f30167A.getTop()) - GreetActViewModel.this.f30189g.getTranslationY()));
            } else {
                greetActViewModel.m46839U(qa00.f156306S);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                GreetActViewModel greetActViewModel = GreetActViewModel.this;
                if (greetActViewModel.f30171E) {
                    greetActViewModel.f30206x.hideInput();
                }
            }
            GreetActViewModel.this.f30179M.run();
            if (i == 0 && GreetActViewModel.this.f30206x.m46770i2()) {
                GreetActViewModel.this.f30180N.run();
            }
        }
    }

    public GreetActViewModel(GreetAct greetAct) {
        this.f30206x = greetAct;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m46779E(View view) {
    }

    /* JADX INFO: renamed from: T */
    private void m46792T() {
        PopupWindow popupWindow = new PopupWindow();
        this.f30182P = popupWindow;
        popupWindow.setContentView(getAct().inflater().inflate(qec0.f156915O5, (ViewGroup) null, false));
        this.f30182P.setInputMethodMode(1);
        this.f30182P.setWidth(0);
        this.f30182P.setHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m46807r0() {
        if (this.f30171E) {
            int height = (this.f30189g.getHeight() - this.f30188f.getHeight()) + this.f30173G;
            int i = height - this.f30172F;
            if (height <= 0 || i <= 0) {
                return;
            }
            this.f30172F = height;
            gt0.m132175u(true, this.f30178L, 0L, gt0.m132171q(this.f30189g, "translationY", -height)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m46809s0(View view) {
        this.f30206x.startActivity(CoreModule.m30933P().m143412i().mo180487j1(this.f30206x, this.f30208z.m47072g0().otherUser, new ResultReceiverC85104(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m46810t0(View view) {
        CoreModule.m30932N().mo61561nq().onNext(Boolean.TRUE);
        i4g0.m138520r("e_meet_back", "p_meet_back_pop");
        this.f30206x.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m46812u0(View view) {
        m46845X();
        if (!CoreModule.m30932N().mo61478M8() || !CoreModule.m30932N().mo61508Ui(this.f30206x.m46765c2()) || (f30166Q.get().longValue() != 0 && i39.m138280b(f30166Q.get().longValue(), pzi0.m174454o()))) {
            if (CoreModule.m30932N().mo61478M8() && CoreModule.m30932N().mo61508Ui(this.f30206x.m46765c2())) {
                CoreModule.m30932N().mo61561nq().onNext(Boolean.TRUE);
            }
            this.f30206x.lambda$debugItems$19();
            return;
        }
        f30166Q.put(Long.valueOf(pzi0.m174454o()));
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_meet_back_pop", Dialog.class.getName());
        th0.C20312a c20312a = new th0.C20312a(this.f30206x);
        c20312a.m191151j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        c20312a.m191149h(false);
        c20312a.m191159r("再看看");
        c20312a.m191147f("确定退出");
        c20312a.m191154m(new DialogInterface.OnDismissListener() { // from class: l.gbk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        c20312a.m191144c(new View.OnClickListener() { // from class: l.hbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f108595a.m46810t0(view2);
            }
        });
        c20312a.m191156o(new View.OnClickListener() { // from class: l.ibk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i4g0.m138520r("e_stay_meet", "p_meet_back_pop");
            }
        });
        c20312a.m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m46815w0(View view) {
        m46835R0(this.f30196n.getText().toString().trim());
        this.f30196n.setText("");
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m46819A0(ValueAnimator valueAnimator) {
        this.f30179M.run();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m46820B0() {
        m46875n1(true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f30206x;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m46821D0(CoreGiftInfo coreGiftInfo, boolean z, String str) {
        ViewGroup viewGroup = (ViewGroup) getAct().getWindow().getDecorView();
        CoreGiftLayer coreGiftLayer = (CoreGiftLayer) viewGroup.findViewWithTag("gift_layer_view_tag");
        this.f30207y = coreGiftLayer;
        if (coreGiftLayer == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            CoreGiftLayer coreGiftLayer2 = (CoreGiftLayer) p9r.m171370a(this.f30206x).inflate(qec0.f156881K, (ViewGroup) null, false);
            this.f30207y = coreGiftLayer2;
            coreGiftLayer2.setTag("gift_layer_view_tag");
            viewGroup.addView(this.f30207y, layoutParams);
        }
        this.f30207y.m46638w(coreGiftInfo, null);
        this.f30207y.m46623C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer3 = this.f30207y;
            if (zIsEmpty) {
                coreGiftLayer3.m46629n();
            } else {
                coreGiftLayer3.m46627G(str);
            }
            this.f30207y.m46624D(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m46822E0() {
        this.f30179M.run();
        if (this.f30206x.m46770i2()) {
            this.f30180N.run();
        }
        if (this.f30206x.m46766d2().hotLevel < 1) {
            this.f30196n.requestFocus();
        }
        this.f30206x.showInput(this.f30196n, 0);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m46823G0(User user, View view) {
        sfj0.m185596c("e_kankan_chat_head", "p_kankan_chat_popup", sfj0.C20032a.m185615h("user_id", user.f56859id));
        this.f30208z.m47070z1("from_greet_act", user.f56859id);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m46824H0(User user, View view) {
        sfj0.m185596c("e_kankan_chat_head", "p_kankan_chat_popup", sfj0.C20032a.m185615h("user_id", user.f56859id));
        this.f30208z.m47070z1("from_greet_act", user.f56859id);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m46825I0(User user, View view) {
        sfj0.m185596c("e_kankan_chat_head", "p_kankan_chat_popup", sfj0.C20032a.m185615h("user_id", user.f56859id));
        this.f30208z.m47070z1("from_greet_act", user.f56859id);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m46826J0(CoreGiftInfo coreGiftInfo) {
        this.f30208z.m47032E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m46827K0(String str) {
        this.f30196n.setText("");
        m46867j1(str);
        CoreModule.m30933P().m143410g().mo36041Xe();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m46828L0(CoreGiftInfo coreGiftInfo, String str) {
        m46883r1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m46829M0(String str) {
        if ("bubble_say_hi_gift_first_guide".equals(str)) {
            this.f30177K = false;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m46830N0(CoreGiftInfo coreGiftInfo) {
        this.f30208z.m47032E1(coreGiftInfo);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m46831O0() {
        this.f30203u.performClick();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m46832P0(CoreGiftInfo coreGiftInfo, uxj0 uxj0Var) {
        if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m46858e1(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m46833Q0(String str, uxj0 uxj0Var) {
        if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m46862g1(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m46834R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cck.m108712b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R0 */
    public void m46835R0(final String str) {
        final String str2 = "";
        if (this.f30206x.m46769h2() || this.f30206x.m46771k2()) {
            m46837S0(str, "", "");
        } else if (NullChecker.m82486a(this.f30208z.m47044S0())) {
            this.f30206x.duringCreated(CoreModule.f18264c.f20384f0.m33606Cg(this.f30208z.m47043R0(), this.f30208z.m47044S0().f56859id)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.dbk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f87680a.m46889x0(str, str2, str2, (Boolean) obj);
                }
            }));
        } else {
            m46837S0(str, "", "");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public GreetAct getAct() {
        return this.f30206x;
    }

    /* JADX INFO: renamed from: S0 */
    public void m46837S0(String str, String str2, String str3) {
        if (NullChecker.m82486a(this.f30189g)) {
            final Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            messageNew_.value = str;
            messageNew_.consumeType = str2;
            messageNew_.coinSign = str3;
            Runnable runnable = new Runnable() { // from class: l.mbk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135732a.m46891z0(messageNew_);
                }
            };
            if (this.f30189g.getLastVisiblePosition() == this.f30189g.getCount() - 1) {
                runnable.run();
                return;
            }
            VList vList = this.f30189g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
            this.f30189g.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m46838T0() {
        if (this.f30181O) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(1).setDuration(390L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zak
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f203579a.m46819A0(valueAnimator);
            }
        });
        duration.addListener(new C8513c());
        duration.start();
        this.f30181O = true;
    }

    /* JADX INFO: renamed from: U */
    public void m46839U(int i) {
        VFrame vFrame = this.f30186d;
        int i2 = qa00.f156333t;
        vFrame.setClipChildren(i > i2);
        this.f30186d.setClipToPadding(i > i2);
        this.f30167A.mo41666b(this.f30200r, this.f30201s, this.f30202t, i);
    }

    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void m46887v0(View view) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8520a c8520a) {
        this.f30208z = c8520a;
    }

    /* JADX INFO: renamed from: V0 */
    public void m46842V0(int i) {
        if (i == 0 && this.f30171E) {
            m46861g0();
            m46875n1(false);
            return;
        }
        if (i > 0) {
            this.f30173G = i;
            this.f30171E = true;
            int height = (this.f30189g.getHeight() - this.f30188f.getHeight()) + i;
            this.f30172F = height;
            if (height < 0) {
                this.f30172F = 0;
            }
            gt0.m132160f(gt0.m132175u(true, this.f30178L, 390L, gt0.m132171q(this.f30189g, "translationY", -this.f30172F), gt0.m132171q(this.f30191i, "translationY", -i)), this.f30206x.m46770i2() ? this.f30180N : this.f30179M).start();
            m46838T0();
            this.f30193k.postDelayed(new Runnable() { // from class: l.ebk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92930a.m46820B0();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m46843W(final String str) {
        if (joa.m146362N3() || !m46868k0()) {
            m46837S0(str, "privilege", "");
            return;
        }
        this.f30196n.setText(str);
        this.f30196n.setSelection(str.length());
        if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m46862g1(str);
        } else {
            CoreModule.m30933P().m143410g().mo36027Pk(this.f30206x, "p_chat_greet,greet", new y20() { // from class: l.nbk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141235a.m46872m0(str, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m46844W0(boolean z) {
        if (z && this.f30208z.m47066t1() && NullChecker.m82486a(this.f30182P) && !this.f30182P.isShowing()) {
            this.f30182P.setBackgroundDrawable(new ColorDrawable(0));
            this.f30182P.showAtLocation(this.f30206x.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m46845X() {
        this.f30206x.hideInput(this.f30196n);
        if (this.f30177K) {
            C4499d.m21895l().m21899k("bubble_say_hi_gift_first_guide");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m46846X0(final CoreGiftInfo coreGiftInfo, final boolean z, final String str, boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            l51.m152886F(this.f30206x, new Runnable() { // from class: l.kbk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124957a.m46821D0(coreGiftInfo, z, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final View m46847Y() {
        this.f30167A = (tul) this.f30206x.inflater().inflate((this.f30206x.m46769h2() && TextUtils.equals(this.f30206x.m46767e2().m47072g0().actorUserId, CoreModule.m30929H().userId()) && !CoreModule.m30933P().m143412i().mo180457e()) ? qec0.f157113s : qec0.f157146w4, (ViewGroup) null);
        this.f30168B = new adk(getAct(), this.f30208z, this.f30167A);
        return (View) this.f30167A;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m46848Y0(List<Message> list) {
        if (NullChecker.m82486a(this.f30169C)) {
            this.f30169C.m149207A(list);
            if (m46866j0()) {
                this.f30189g.setSelection(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                VList vList = this.f30189g;
                vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                this.f30170D = false;
                this.f30189g.post(new Runnable() { // from class: l.fbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98116a.m46822E0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m46849Z() {
        if (NullChecker.m82486a(this.f30182P) && this.f30182P.isShowing()) {
            this.f30182P.dismiss();
            this.f30182P = null;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m46850Z0(final User user) {
        if (this.f30206x.m46769h2()) {
            boolean zIsFemale = CoreModule.f18264c.f20381e0.m116600p9().isFemale();
            VEditText vEditText = this.f30196n;
            if (zIsFemale) {
                vEditText.setHint("真诚交友，认真打个招呼吧");
            } else {
                vEditText.setHint("回复即可与她配对");
            }
        } else if (m46870l0() && NullChecker.m82486a(this.f30208z.m47072g0())) {
            this.f30196n.setHint(m46855d0(user));
        } else if (CoreModule.m30933P().m143412i().mo180320F() && NullChecker.m82486a(this.f30208z.m47072g0())) {
            boolean zEquals = TextUtils.equals(CoreModule.m30929H().userId(), this.f30208z.m47072g0().actorUserId);
            VEditText vEditText2 = this.f30196n;
            if (zEquals) {
                vEditText2.setHint(h39.m133446j(user.isFemale()));
            } else {
                vEditText2.setHint("请输入消息...");
            }
        } else if (this.f30206x.m46770i2() || !NullChecker.m82486a(this.f30208z.m47072g0()) || TextUtils.isEmpty(this.f30208z.m47072g0().moment.f39607id)) {
            this.f30196n.setHint("输入新消息");
        } else {
            this.f30196n.setHint("通过动态找话题，更容易得到回复");
        }
        if (NullChecker.m82486a(user)) {
            this.f30174H = String.format("85%%的男性发出“hi”后，不会收到回复，聊聊%s的动态，更容易得到回复", user.isFemale() ? "她" : "他");
        }
        bnl0.m105524M(this.f30200r, true);
        bnl0.m105524M(this.f30202t, true);
        bnl0.m105524M(this.f30201s, true);
        boolean zM47038N1 = this.f30208z.m47038N1();
        HeaderFrameWrapper headerFrameWrapper = this.f30200r;
        if (zM47038N1) {
            headerFrameWrapper.m80875B0(user.getAnonymousUrl());
        } else {
            headerFrameWrapper.m80893v0(user, ux6.m198404b(user).profileSmall());
        }
        this.f30202t.setText(user.name);
        this.f30167A.mo41667c(user, this.f30208z.m47038N1());
        bnl0.m105509E0(this.f30200r, new View.OnClickListener() { // from class: l.xbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193167a.m46823G0(user, view);
            }
        });
        bnl0.m105509E0(this.f30202t, new View.OnClickListener() { // from class: l.ybk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198342a.m46824H0(user, view);
            }
        });
        this.f30167A.setOnAvatarClickListener(new View.OnClickListener() { // from class: l.zbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203675a.m46825I0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final List<String> m46851a0() {
        if (this.f30206x.m46769h2() && CoreModule.f18264c.f20381e0.m116600p9().isFemale() && NullChecker.m82486a(h39.m133445i())) {
            return h39.m133445i().quick_reply;
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m46852a1(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m46853b0() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("core_im_say_hi_gift_guide_text");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("guide_text") : "送个礼物更容易被回复哦";
        } catch (Exception unused) {
            return "送个礼物更容易被回复哦";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m46854c0() {
        return this.f30205w.get().booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public final String m46855d0(User user) {
        List<String> listM46857e0 = user.isFemale() ? m46857e0("hint_input_female") : m46857e0("hint_input_male");
        Collections.shuffle(listM46857e0);
        if (jyb.m147479J(listM46857e0)) {
            return user.isFemale() ? "问问她平时的爱好是什么" : "问问他平时的爱好是什么";
        }
        return listM46857e0.get(0);
    }

    /* JADX INFO: renamed from: d1 */
    public void m46856d1() {
        if (this.f30189g.getLastVisiblePosition() != this.f30189g.getCount() - 1) {
            VList vList = this.f30189g;
            vList.smoothScrollToPositionFromTop(vList.getCount() - 1, ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
        }
    }

    @Override // p153l.iam
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
    public List<String> m46857e0(String str) {
        String strM80485F = RemoteConfig.m80481x().m80485F("dynamic_square_four_hello_greeting");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM80485F)) {
            try {
                JSONArray jSONArray = new JSONObject(strM80485F).getJSONArray(str);
                if (NullChecker.m82486a(jSONArray) && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                } else if (jyb.m147479J(arrayList)) {
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
        } else if (jyb.m147479J(arrayList)) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.p051p1.mobile.putong.core.p058ui.greet.GreetActViewModel.m46857e0(java.lang.String):java.util.List");
        }

        /* JADX INFO: renamed from: e1 */
        public final void m46858e1(final CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = "coin";
            coreGiftInfo.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
            if (CoreModule.m30933P().m143410g().mo36039Wi()) {
                CoreModule.f18276o.m132214d().mo34863jf(this.f30206x, CoreModule.f18264c.f20312H0.m155467t5(), null, null, new x20() { // from class: l.tbk
                    @Override // p153l.x20
                    public final void call() {
                        this.f172969a.m46826J0(coreGiftInfo);
                    }
                });
            } else {
                this.f30208z.m47032E1(coreGiftInfo);
            }
        }

        /* JADX INFO: renamed from: f0 */
        public final boolean m46859f0() {
            return CoreModule.m30930K().mo31754ck() || joa.m146362N3() || !m46868k0();
        }

        /* JADX INFO: renamed from: f1 */
        public final void m46860f1(CoreGiftInfo coreGiftInfo) {
            coreGiftInfo.consumeType = "privilege";
            this.f30208z.m47032E1(coreGiftInfo);
        }

        /* JADX INFO: renamed from: g0 */
        public void m46861g0() {
            this.f30171E = false;
            gt0.m132160f(gt0.m132175u(true, this.f30178L, 390L, gt0.m132171q(this.f30191i, "translationY", 0.0f), gt0.m132171q(this.f30189g, "translationY", 0.0f)), this.f30206x.m46770i2() ? this.f30180N : this.f30179M).start();
            m46838T0();
        }

        /* JADX INFO: renamed from: g1 */
        public final void m46862g1(final String str) {
            if (CoreModule.m30933P().m143410g().mo36039Wi()) {
                CoreModule.f18276o.m132214d().mo34863jf(this.f30206x, CoreModule.f18264c.f20312H0.m155467t5(), null, null, new x20() { // from class: l.sbk
                    @Override // p153l.x20
                    public final void call() {
                        this.f167150a.m46827K0(str);
                    }
                });
            } else {
                this.f30196n.setText("");
                m46867j1(str);
            }
        }

        /* JADX INFO: renamed from: h0 */
        public final void m46863h0(List<String> list, final int i) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f30206x, 0, false);
            linearLayoutManager.canScrollVertically();
            bnl0.m105524M(this.f30192j, true);
            this.f30192j.setLayoutManager(linearLayoutManager);
            final w6c0 w6c0Var = new w6c0();
            w6c0Var.m205096I(list);
            w6c0Var.m205097J(new y20() { // from class: l.pbk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151392a.m46876o0(i, w6c0Var, (Integer) obj);
                }
            });
            this.f30192j.setAdapter(w6c0Var);
            this.f30192j.setOverScrollMode(0);
            if (CoreModule.m30933P().m143412i().mo34386O8()) {
                sfj0.m185601h("e_fast_message", "p_kankan_chat_popup", sfj0.C20032a.m185613f("fast_message_role", i), sfj0.C20032a.m185615h("moments_user_id", NullChecker.m82486a(this.f30208z.m47044S0()) ? this.f30208z.m47044S0().f56859id : ""));
            }
        }

        /* JADX INFO: renamed from: h1 */
        public final void m46864h1(final CoreGiftInfo coreGiftInfo) {
            if (CoreModule.m30930K().mo31754ck() || !m46868k0()) {
                this.f30208z.m47032E1(coreGiftInfo);
                return;
            }
            if (joa.m146362N3()) {
                m46860f1(coreGiftInfo);
            } else if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
                m46858e1(coreGiftInfo);
            } else {
                CoreModule.m30933P().m143410g().mo36027Pk(this.f30206x, "p_chat,gift_send", new y20() { // from class: l.obk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f146594a.m46828L0(coreGiftInfo, (String) obj);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: i0 */
        public final void m46865i0() {
            boolean z = m46859f0() && !this.f30206x.m46769h2();
            bnl0.m105524M(this.f30194l, z);
            if (z) {
                if (!this.f30176J) {
                    if (C4499d.m21895l().m21911x("_edit_greet_tip")) {
                        return;
                    } else {
                        this.f30194l.postDelayed(new Runnable() { // from class: l.abk
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f69630a.m46878p0();
                            }
                        }, 500L);
                    }
                }
                bnl0.m105509E0(this.f30194l, new View.OnClickListener() { // from class: l.bbk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f75960a.m46880q0(view);
                    }
                });
            }
        }

        @Override // p153l.iam
        public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewM46834R = m46834R(layoutInflater, viewGroup);
            this.f30189g.addHeaderView(m46847Y());
            this.f30189g.setHeaderDividersEnabled(false);
            kdk kdkVar = new kdk(this.f30206x, this.f30189g);
            this.f30169C = kdkVar;
            this.f30189g.setAdapter((ListAdapter) kdkVar);
            this.f30169C.notifyDataSetChanged();
            View upKeyboardDetectorLayout = this.f30206x.setUpKeyboardDetectorLayout(viewM46834R, new View(this.f30206x), new b30() { // from class: l.tak
                @Override // p153l.b30
                /* JADX INFO: renamed from: b */
                public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                    this.f172737a.m46874n0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
                }
            });
            if (this.f30208z.m47066t1()) {
                m46792T();
            }
            if (!jyb.m147479J(m46851a0())) {
                m46863h0(m46851a0(), 0);
                return upKeyboardDetectorLayout;
            }
            if (CoreModule.m30933P().m143412i().mo34386O8()) {
                if (TextUtils.equals(this.f30208z.m47072g0().actorUserId, CoreModule.m30929H().userId())) {
                    m46863h0(m46857e0("quick_reply"), 0);
                    return upKeyboardDetectorLayout;
                }
                m46863h0(m46857e0("quick_reply_receiver"), 1);
            }
            return upKeyboardDetectorLayout;
        }

        /* JADX INFO: renamed from: j0 */
        public boolean m46866j0() {
            return this.f30170D;
        }

        /* JADX INFO: renamed from: j1 */
        public final void m46867j1(String str) {
            m46837S0(str, "coin", CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber)));
        }

        /* JADX INFO: renamed from: k0 */
        public boolean m46868k0() {
            return this.f30208z.m47073h0().greetInfo.createdTime < 1.0d;
        }

        /* JADX INFO: renamed from: k1 */
        public final void m46869k1() {
            this.f30205w.put(Boolean.TRUE);
        }

        /* JADX INFO: renamed from: l0 */
        public boolean m46870l0() {
            return this.f30175I;
        }

        /* JADX INFO: renamed from: l1 */
        public void m46871l1(boolean z) {
            this.f30175I = z;
        }

        /* JADX INFO: renamed from: m0 */
        public final /* synthetic */ void m46872m0(String str, String str2) {
            m46884s1(str);
        }

        /* JADX INFO: renamed from: m1 */
        public void m46873m1() {
            getAct().getWindow().setSoftInputMode(21);
        }

        /* JADX INFO: renamed from: n0 */
        public final /* synthetic */ void m46874n0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
            m46842V0(bool.booleanValue() ? num.intValue() : 0);
        }

        /* JADX INFO: renamed from: n1 */
        public final void m46875n1(boolean z) {
            C4499d c4499dM21895l = C4499d.m21895l();
            if (!z && c4499dM21895l.m21911x("_edit_greet_tip")) {
                c4499dM21895l.m21899k("_edit_greet_tip");
                return;
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (z && !TextUtils.isEmpty(this.f30174H) && CoreModule.m30933P().m143412i().mo180563y() && NullChecker.m82486a(this.f30208z.m47072g0()) && TextUtils.equals(CoreModule.m30929H().userId(), this.f30208z.m47072g0().actorUserId) && NullChecker.m82486a(userM116593na) && !userM116593na.isFemale() && !CoreModule.f18264c.f20420r0.f20764c0.get().booleanValue() && !this.f30208z.m47048Y0()) {
                c4499dM21895l.m21908u(new C4496a(getAct()).m21873p(qa00.m175859d(12.0f)).m21848D(this.f30174H).m21854J(13.0f).m21873p(75).m21850F(true).m21849E(true).m21881x(-qa00.f156321h).m21858N(new C4496a.d() { // from class: l.cbk
                    @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                    /* JADX INFO: renamed from: a */
                    public final void mo21886a(View view) {
                        CoreModule.f18264c.f20420r0.f20764c0.put(Boolean.TRUE);
                    }
                }).m21852H(qa00.m175859d(15.0f), qa00.m175859d(10.0f), qa00.m175859d(15.0f), qa00.m175859d(10.0f)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(C4496a.f16403R | C4496a.f16402Q), this.f30193k, "_edit_greet_tip");
            }
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m46876o0(int i, w6c0 w6c0Var, Integer num) {
            if (CoreModule.m30933P().m143412i().mo34386O8()) {
                sfj0.m185596c("e_fast_message", "p_kankan_chat_popup", sfj0.C20032a.m185613f("fast_message_role", i), sfj0.C20032a.m185615h("fast_message_text", w6c0Var.getItem(num.intValue()).trim()), sfj0.C20032a.m185615h("moments_user_id", NullChecker.m82486a(this.f30208z.m47044S0()) ? this.f30208z.m47044S0().f56859id : ""));
            } else {
                sfj0.m185596c("e_fast_message", "p_kankan_chat_popup", new sfj0.C20032a[0]);
            }
            m46835R0(w6c0Var.getItem(num.intValue()).trim());
        }

        /* JADX INFO: renamed from: o1 */
        public final void m46877o1(CoreGiftPanelName coreGiftPanelName) {
            if (NullChecker.m82486a(this.f30208z.m47044S0())) {
                vvj.m203015c(this.f30206x, coreGiftPanelName, new y20() { // from class: l.lbk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f131210a.m46864h1((CoreGiftInfo) obj);
                    }
                }, this.f30208z.m47044S0().f56859id, "p_kankan_chat_popup", this.f30208z.getFrom(), null, 2);
            }
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m46878p0() {
            m46879p1(this.f30194l, m46853b0());
        }

        /* JADX INFO: renamed from: p1 */
        public final void m46879p1(View view, String str) {
            if (NullChecker.m82486a(this.f30206x)) {
                C4499d.m21895l().m21899k("bubble_say_hi_gift_first_guide");
                C4496a c4496a = new C4496a(this.f30206x);
                c4496a.m21870l(qa00.m175859d(7.0f)).m21852H(qa00.m175859d(16.0f), qa00.m175859d(10.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f)).m21851G(g9c0.f102811b).m21869k(-98787).m21873p(75).m21854J(13.0f).m21860b(3000L).m21863e(true).m21868j(new C4496a.c() { // from class: l.jbk
                    @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
                    /* JADX INFO: renamed from: a */
                    public final void mo21885a(String str2) {
                        this.f119970a.m46829M0(str2);
                    }
                }).m21848D(str).m21874q(C4496a.f16400O | C4496a.f16402Q).m21881x(-qa00.m175859d(8.0f)).m21855K(0);
                C4499d.m21895l().m21908u(c4496a, view, "bubble_say_hi_gift_first_guide");
                m46869k1();
                this.f30176J = true;
                this.f30177K = true;
            }
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m46880q0(View view) {
            if (CoreModule.m30930K().mo31754ck()) {
                m46877o1(CoreGiftPanelName.get("chat"));
            } else {
                m46877o1(CoreGiftPanelName.get("greet"));
            }
            m46845X();
        }

        /* JADX INFO: renamed from: q1 */
        public void m46881q1(User user, CoreGiftPanelName coreGiftPanelName) {
            if (!joa.m146357G3() && this.f30206x.m46766d2().hotLevel > 0) {
                sfj0.m185601h("e_chat_gift_bar", "p_kankan_chat_popup", new sfj0.C20032a[0]);
                vvj.m203015c(this.f30206x, coreGiftPanelName, new y20() { // from class: l.vbk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f183257a.m46830N0((CoreGiftInfo) obj);
                    }
                }, user.f56859id, "p_kankan_chat_popup", this.f30208z.getFrom(), new x20() { // from class: l.wbk
                    @Override // p153l.x20
                    public final void call() {
                        this.f188252a.m46831O0();
                    }
                }, this.f30206x.m46766d2().hotLevel);
            }
        }

        /* JADX INFO: renamed from: r */
        public void m46882r() {
            m46873m1();
            this.f30206x.setSwipeBackEnable(false);
            this.f30171E = false;
            this.f30176J = m46854c0();
            if (NullChecker.m82486a(this.f30201s)) {
                if (this.f30206x.m46769h2()) {
                    this.f30201s.setBackgroundResource(0);
                    this.f30201s.setImageResource(CoreModule.m30933P().m143412i().mo180457e() ? ibc0.f113796G : ibc0.f113805H);
                } else if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
                    this.f30201s.setImageResource(ibc0.f114010e6);
                } else {
                    this.f30201s.setImageResource(ibc0.f114094o0);
                }
            }
            if (this.f30208z.m47049a1() && NullChecker.m82486a(this.f30208z.m47072g0().moment) && TextUtils.isEmpty(this.f30208z.m47072g0().moment.f39607id)) {
                this.f30167A.mo41665O();
            }
            this.f30189g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ack
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f69718a.m46807r0();
                }
            });
            m46865i0();
            bnl0.m105509E0(this.f30204v, new View.OnClickListener() { // from class: l.bck
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76179a.m46809s0(view);
                }
            });
            bnl0.m105509E0(this.f30203u, new View.OnClickListener() { // from class: l.uak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178216a.m46812u0(view);
                }
            });
            this.f30196n.addTextChangedListener(new C8514d());
            this.f30196n.setText("");
            bnl0.m105509E0(this.f30196n, new View.OnClickListener() { // from class: l.vak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183105a.m46887v0(view);
                }
            });
            bnl0.m105509E0(this.f30197o, new View.OnClickListener() { // from class: l.wak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188138a.m46815w0(view);
                }
            });
            bnl0.m105509E0(this.f30184b, new View.OnClickListener() { // from class: l.xak
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GreetActViewModel.m46779E(view);
                }
            });
            this.f30189g.setOnScrollListener(new C8515e());
            this.f30183a.setOnDispatchTouchEventListener(new bm50() { // from class: l.yak
                @Override // p153l.bm50
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return this.f198219a.m46852a1(motionEvent);
                }
            });
            if (TextUtils.isEmpty(this.f30206x.m46766d2().preSendMsg) || this.f30206x.m46766d2().hotLevel > 0) {
                return;
            }
            m46835R0(this.f30206x.m46766d2().preSendMsg);
        }

        /* JADX INFO: renamed from: r1 */
        public final void m46883r1(final CoreGiftInfo coreGiftInfo) {
            if (NullChecker.m82486a(this.f30206x)) {
                this.f30206x.duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ubk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f178313a.m46832P0(coreGiftInfo, (uxj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: s1 */
        public final void m46884s1(final String str) {
            if (NullChecker.m82486a(this.f30206x)) {
                this.f30206x.duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.rbk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f162028a.m46833Q0(str, (uxj0) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: t1 */
        public void m46885t1(User user, String str) {
            this.f30167A.mo41673k(user, str);
        }

        /* JADX INFO: renamed from: u1 */
        public void m46886u1(String str, BubbleInfo bubbleInfo) {
            this.f30167A.mo41676n(str, bubbleInfo, this.f30208z.getFrom());
        }

        /* JADX INFO: renamed from: v1 */
        public void m46888v1(C8520a c8520a, User user, String str) {
            if (!jyb.m147479J(m46851a0())) {
                m46863h0(m46851a0(), 0);
                return;
            }
            if (CoreModule.m30932N().mo61552ld()) {
                m46871l1(true);
                this.f30167A.mo41664M(c8520a, user, str);
                m46863h0(m46857e0("quick_reply"), 0);
                if (NullChecker.m82486a(c8520a.m47072g0())) {
                    this.f30196n.setHint(m46855d0(user));
                }
            }
        }

        /* JADX INFO: renamed from: x0 */
        public final /* synthetic */ void m46889x0(String str, String str2, String str3, Boolean bool) {
            if (CoreModule.m30930K().mo31754ck() || bool.booleanValue()) {
                m46837S0(str, str2, str3);
            } else if (this.f30206x.m46772l2()) {
                m46837S0(str, "privilege", "");
            } else {
                m46843W(str);
            }
        }

        /* JADX INFO: renamed from: y0 */
        public final /* synthetic */ void m46890y0(Message message) {
            this.f30208z.m47036J1(message);
            VList vList = this.f30189g;
            vList.setSelection(vList.getCount());
        }

        /* JADX INFO: renamed from: z0 */
        public final /* synthetic */ void m46891z0(final Message message) {
            if (this.f30189g.getLastVisiblePosition() == this.f30189g.getCount() - 1) {
                this.f30208z.m47036J1(message);
            } else {
                getAct().post(new Runnable() { // from class: l.qbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f156486a.m46890y0(message);
                    }
                });
            }
            VList vList = this.f30189g;
            vList.setSelection(vList.getCount());
        }
    }
