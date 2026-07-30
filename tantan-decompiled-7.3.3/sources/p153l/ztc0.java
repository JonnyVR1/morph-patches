package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.ReceiveRecords;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.core.data.RedPacketMyInfo;
import com.p051p1.mobile.putong.core.data.RedPacketOwner;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketRecordAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ztc0 implements iam<ltc0> {

    /* JADX INFO: renamed from: C */
    public static final long f205962C = 300;

    /* JADX INFO: renamed from: D */
    public static final long f205963D = 400;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f205966a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f205967b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f205968c;

    /* JADX INFO: renamed from: d */
    public VImage f205969d;

    /* JADX INFO: renamed from: e */
    public VImage f205970e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f205971f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f205972g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f205973h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f205974i;

    /* JADX INFO: renamed from: j */
    public View f205975j;

    /* JADX INFO: renamed from: k */
    public View f205976k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f205977l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f205978m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f205979n;

    /* JADX INFO: renamed from: o */
    public VText f205980o;

    /* JADX INFO: renamed from: p */
    public VText f205981p;

    /* JADX INFO: renamed from: q */
    public VImage f205982q;

    /* JADX INFO: renamed from: r */
    public VText f205983r;

    /* JADX INFO: renamed from: s */
    public View f205984s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f205985t;

    /* JADX INFO: renamed from: u */
    public RedPacketRecordAct f205986u;

    /* JADX INFO: renamed from: v */
    public qsc0 f205987v;

    /* JADX INFO: renamed from: x */
    public ltc0 f205989x;

    /* JADX INFO: renamed from: z */
    public String f205991z;

    /* JADX INFO: renamed from: w */
    public AccelerateDecelerateInterpolator f205988w = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: y */
    public boolean f205990y = false;

    /* JADX INFO: renamed from: A */
    public boolean f205964A = false;

    /* JADX INFO: renamed from: B */
    public boolean f205965B = false;

    public ztc0(RedPacketRecordAct redPacketRecordAct) {
        this.f205986u = redPacketRecordAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m221492B() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: A */
    public boolean m221507A() {
        return this.f205990y;
    }

    /* JADX INFO: renamed from: A3 */
    public void m221508A3(String str) {
        l51.m152887G(new Runnable() { // from class: l.mtc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138597a.m221492B();
            }
        });
        this.f205991z = str;
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(str);
        this.f205964A = NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6);
        this.f205987v = new qsc0(this.f205986u, this);
        this.f205971f.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f205971f.setAdapter(this.f205987v);
        this.f205989x.m155762F0(true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m221509C(View view) {
        m221526U();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205986u;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m221510E() {
        this.f205989x.m155764p0();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m221511F() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m221512G(View view) {
        act().m48999H2();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m221513H(boolean z, RedPacket redPacket) {
        act().progressDismiss();
        this.f205972g.setVisibility(8);
        ReceiveRecords receiveRecordsNew_ = ReceiveRecords.new_();
        RedPacketOwner redPacketOwner = redPacket.owner;
        receiveRecordsNew_.userId = redPacketOwner.ownerId;
        receiveRecordsNew_.name = redPacketOwner.name;
        RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
        receiveRecordsNew_.amount = redPacketMyInfo.amount;
        receiveRecordsNew_.highest = redPacketMyInfo.highest;
        redPacket.receiveRecords.add(0, receiveRecordsNew_);
        this.f205987v.m177759G(redPacket.receiveRecords, redPacket, this.f205964A, uqb0.f180376H.guessedCurrentServerTime());
        this.f205987v.notifyDataSetChanged();
        if (z) {
            View view = this.f205976k;
            long j = f205963D;
            Animator animatorM132180z = gt0.m132180z((ObjectAnimator) gt0.m132170p(view, "translationY", 0L, j, this.f205988w, -view.getHeight()), (ObjectAnimator) gt0.m132170p(this.f205976k, "scaleX", 0L, j, this.f205988w, bnl0.m105592y0() / (this.f205976k.getWidth() * 1.0f)), (ObjectAnimator) gt0.m132170p(this.f205975j, "translationY", 0L, j, this.f205988w, 1000.0f), (ObjectAnimator) gt0.m132170p(this.f205975j, "scaleX", 0L, j, this.f205988w, bnl0.m105592y0() / (this.f205975j.getWidth() * 1.0f)), (ObjectAnimator) gt0.m132170p(this.f205975j, "alpha", 0L, j, this.f205988w, 0.0f), (ObjectAnimator) gt0.m132170p(this.f205977l, "alpha", 0L, j, this.f205988w, 0.0f), (ObjectAnimator) gt0.m132170p(this.f205966a, "alpha", 0L, j, this.f205988w, 0.0f, 1.0f));
            animatorM132180z.addListener(new C21888a());
            animatorM132180z.start();
            return;
        }
        this.f205973h.setVisibility(8);
        this.f205985t.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(act(), y7c0.f197768f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC21889b());
        this.f205966a.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m221514I(Throwable th) {
        act().progressDismiss();
        act().m48999H2();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m221515J(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (i == 4000404) {
                this.f205981p.setText("手慢了，红包派完了");
                this.f205981p.setTextSize(2, 18.0f);
                this.f205982q.setVisibility(4);
                this.f205983r.setVisibility(0);
            } else if (i != 4000405) {
                if (i == 4000406) {
                    m221523R();
                } else if (i == 4000407) {
                    o1j0.m165636j("单日最多可抢同一用户10个红包");
                } else if (i == 4000408) {
                    o1j0.m165636j("单日最多可抢100个红包");
                }
            }
            this.f205989x.m155763G0();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m221516K(Message message, final String str, View view) {
        i4g0.m138523u("e_open_red_packet", this.f205989x.pageId(), jyb.m147494Y("groupchat_id", m221532y()));
        l51.m152887G(new Runnable() { // from class: l.xtc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196198a.m221519N();
            }
        });
        act().duringCreated(CoreModule.f18264c.f20379d1.m35892v3(message, str)).subscribe(psd0.m173597H(new y20() { // from class: l.ytc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201501a.m221520O(str, (Envelope) obj);
            }
        }, new y20() { // from class: l.ntc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143596a.m221515J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m221517L(User user) {
        if (NullChecker.m82486a(user)) {
            this.f205980o.setText(user.name + "的红包");
        }
        if (this.f205964A) {
            uqb0.f180374G.m127140Z0(this.f205979n, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127125Q0(this.f205979n, user.m61308fp().profileSmall());
        } else {
            uqb0.f180374G.m127138Y0(this.f205979n, ibc0.f113815I0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m221518M(View view) {
        i4g0.m138523u("e_check_luck", this.f205989x.pageId(), jyb.m147494Y("groupchat_id", this.f205991z));
        this.f205989x.m155762F0(false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m221519N() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m221520O(String str, Envelope envelope) {
        act().progressDismiss();
        m221524S(str, true, ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0), true);
    }

    /* JADX INFO: renamed from: P */
    public String m221521P() {
        return this.f205989x.pageId();
    }

    /* JADX INFO: renamed from: Q */
    public final void m221522Q() {
        if (!this.f205965B) {
            this.f205985t.setVisibility(0);
        }
        this.f205972g.setOnClickListener(new View.OnClickListener() { // from class: l.ptc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154036a.m221509C(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m221523R() {
        tcz.m190530H(this.f205986u, new Runnable() { // from class: l.otc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f148945a.m221510E();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m221524S(String str, final boolean z, RedPacket redPacket, boolean z2) {
        this.f205990y = true;
        act().setSwipeBackEnable(true);
        l51.m152887G(new Runnable() { // from class: l.qtc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159403a.m221511F();
            }
        });
        bnl0.m105509E0(this.f205969d, new View.OnClickListener() { // from class: l.rtc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164807a.m221512G(view);
            }
        });
        act().duringCreated(CoreModule.f18264c.f20379d1.m35890t3(str)).subscribe(psd0.m173597H(new y20() { // from class: l.stc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170554a.m221513H(z, (RedPacket) obj);
            }
        }, new y20() { // from class: l.ttc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176068a.m221514I((Throwable) obj);
            }
        }));
        this.f205989x.m155761E0(redPacket, z2);
    }

    /* JADX INFO: renamed from: T */
    public void m221525T(final Message message, final String str, RedPacket redPacket, int i) {
        act().setStatusBarColorResId(g9c0.f102794L);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f205974i.getLayoutParams();
        int iM105592y0 = (int) (bnl0.m105592y0() * 0.822f);
        layoutParams.width = iM105592y0;
        layoutParams.height = (int) (iM105592y0 * 1.486f);
        this.f205974i.setLayoutParams(layoutParams);
        act().duringCreated(CoreModule.f18264c.f20381e0.m116491Ma(message.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.utc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180906a.m221517L((User) obj);
            }
        }));
        bnl0.m105509E0(this.f205983r, new View.OnClickListener() { // from class: l.vtc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185707a.m221518M(view);
            }
        });
        bnl0.m105509E0(this.f205982q, new View.OnClickListener() { // from class: l.wtc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190735a.m221516K(message, str, view);
            }
        });
        this.f205983r.setClickable(false);
        this.f205982q.setClickable(false);
        RelativeLayout relativeLayout = this.f205974i;
        long j = f205962C;
        Animator animatorM132180z = gt0.m132180z((ObjectAnimator) gt0.m132170p(relativeLayout, "scaleX", 0L, j, this.f205988w, 0.0f, 1.0f), (ObjectAnimator) gt0.m132170p(this.f205974i, "scaleY", 0L, j, this.f205988w, 0.0f, 1.0f));
        animatorM132180z.addListener(new C21891d());
        animatorM132180z.start();
        this.f205977l.setOnClickListener(null);
        if (i == 1) {
            this.f205982q.setVisibility(4);
            this.f205983r.setVisibility(4);
            this.f205981p.setText("该红包已超过48小时。如已领取，可在「钱包」-「红包记录」中查看。");
            this.f205981p.setTextSize(2, 18.0f);
        } else if (i == 2) {
            this.f205981p.setText("手慢了，红包派完了");
            this.f205981p.setTextSize(2, 18.0f);
            this.f205982q.setVisibility(4);
            this.f205983r.setVisibility(0);
        } else if (i == 3) {
            i4g0.m138492A("e_open_red_packet", this.f205989x.pageId(), jyb.m147494Y("groupchat_id", m221532y()));
            this.f205982q.setVisibility(0);
            this.f205981p.setText(redPacket.showInfo.title);
            if (TextUtils.equals(CoreModule.f18264c.f20381e0.m116600p9().f56859id, redPacket.owner.ownerId) || redPacket.quantity <= redPacket.assignQuantity || redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime()) {
                this.f205983r.setVisibility(0);
            } else {
                this.f205983r.setVisibility(4);
            }
        }
        if (this.f205983r.getVisibility() == 0) {
            i4g0.m138492A("e_check_luck", this.f205989x.pageId(), jyb.m147494Y("groupchat_id", this.f205991z));
        }
    }

    /* JADX INFO: renamed from: U */
    public void m221526U() {
        this.f205972g.setOnClickListener(null);
        if (this.f205965B) {
            return;
        }
        this.f205965B = true;
        RelativeLayout relativeLayout = this.f205974i;
        long j = f205962C;
        Animator animatorM132180z = gt0.m132180z((ObjectAnimator) gt0.m132170p(relativeLayout, "scaleX", 0L, j, this.f205988w, 1.0f, 0.0f), (ObjectAnimator) gt0.m132170p(this.f205974i, "scaleY", 0L, j, this.f205988w, 1.0f, 0.0f));
        animatorM132180z.addListener(new C21890c());
        animatorM132180z.start();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m221527s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m221527s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return auc0.m100370b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public RedPacketRecordAct getAct() {
        return this.f205986u;
    }

    /* JADX INFO: renamed from: v */
    public void m221529v(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f21774m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            o1j0.m165634h(R$string.f21783n7);
        } else if (i == 41906) {
            tcz.m190531I(this.f205986u);
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m221530w(pf60<Integer, String> pf60Var) {
        act().progressDismiss();
        if (9000 == pf60Var.f152156a.intValue()) {
            o1j0.m165649w(R$string.f21792o7);
            return;
        }
        if ("41905".equals(pf60Var.f152157b)) {
            o1j0.m165634h(R$string.f21783n7);
        } else if ("41906".equals(pf60Var.f152157b)) {
            tcz.m190531I(this.f205986u);
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ltc0 ltc0Var) {
        this.f205989x = ltc0Var;
    }

    /* JADX INFO: renamed from: y */
    public String m221532y() {
        return this.f205991z;
    }

    /* JADX INFO: renamed from: z */
    public void m221533z(Message message, RedPacket redPacket, String str) {
        int i;
        act().progressDismiss();
        boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20381e0.m116600p9().f56859id, message.owner);
        boolean zEquals2 = TextUtils.equals(redPacket.splitType, "average");
        boolean z = redPacket.quantity <= redPacket.assignQuantity;
        boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
        boolean z2 = redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime();
        if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && z2) && (!(!zEquals && zEquals2 && zIsEmpty && !z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && (!(!zEquals && !zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || !z2) && ((!zEquals || zEquals2 || !zIsEmpty || z || z2) && !(zEquals && !zEquals2 && zIsEmpty && z && !z2)))))))))) {
            m221524S(str, false, redPacket, false);
        } else {
            if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && (!zEquals || zEquals2 || !zIsEmpty || z || z2))) {
                i = (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && !(!zEquals && zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && !((!zEquals && !zEquals2 && zIsEmpty && z && z2) || (zEquals && !zEquals2 && zIsEmpty && z && !z2)))) ? 1 : 2;
            } else {
                i = 3;
            }
            m221525T(message, str, redPacket, i);
            this.f205989x.m155761E0(redPacket, true);
        }
        this.f205989x.m155766r0();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ztc0$a */
    public class C21888a implements Animator.AnimatorListener {
        public C21888a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ztc0.this.f205973h.setVisibility(8);
            ztc0.this.f205985t.setVisibility(8);
            ztc0.this.f205969d.setVisibility(0);
            ztc0.this.act().setStatusBarColorResId(g9c0.f102793K);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ztc0.this.f205969d.setVisibility(4);
            ztc0.this.f205985t.setVisibility(4);
            ztc0.this.f205966a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.ztc0$b */
    public class AnimationAnimationListenerC21889b implements Animation.AnimationListener {
        public AnimationAnimationListenerC21889b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ztc0.this.f205966a.setVisibility(0);
            ztc0.this.act().setStatusBarColorResId(g9c0.f102793K);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: l.ztc0$c */
    public class C21890c implements Animator.AnimatorListener {
        public C21890c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ztc0.this.act().m48999H2();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ztc0.this.f205985t.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.ztc0$d */
    public class C21891d implements Animator.AnimatorListener {
        public C21891d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ztc0.this.m221522Q();
            ztc0.this.f205983r.setClickable(true);
            ztc0.this.f205982q.setClickable(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ztc0.this.f205973h.setVisibility(0);
            ztc0.this.f205972g.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
