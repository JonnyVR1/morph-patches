package p149l;

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
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.ReceiveRecords;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.data.RedPacketMyInfo;
import com.p046p1.mobile.putong.core.data.RedPacketOwner;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketRecordAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class slc0 implements s7m<elc0> {

    /* JADX INFO: renamed from: C */
    public static final long f165154C = 300;

    /* JADX INFO: renamed from: D */
    public static final long f165155D = 400;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f165158a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f165159b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f165160c;

    /* JADX INFO: renamed from: d */
    public VImage f165161d;

    /* JADX INFO: renamed from: e */
    public VImage f165162e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f165163f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f165164g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f165165h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f165166i;

    /* JADX INFO: renamed from: j */
    public View f165167j;

    /* JADX INFO: renamed from: k */
    public View f165168k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f165169l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f165170m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f165171n;

    /* JADX INFO: renamed from: o */
    public VText f165172o;

    /* JADX INFO: renamed from: p */
    public VText f165173p;

    /* JADX INFO: renamed from: q */
    public VImage f165174q;

    /* JADX INFO: renamed from: r */
    public VText f165175r;

    /* JADX INFO: renamed from: s */
    public View f165176s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f165177t;

    /* JADX INFO: renamed from: u */
    public RedPacketRecordAct f165178u;

    /* JADX INFO: renamed from: v */
    public jkc0 f165179v;

    /* JADX INFO: renamed from: x */
    public elc0 f165181x;

    /* JADX INFO: renamed from: z */
    public String f165183z;

    /* JADX INFO: renamed from: w */
    public AccelerateDecelerateInterpolator f165180w = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: y */
    public boolean f165182y = false;

    /* JADX INFO: renamed from: A */
    public boolean f165156A = false;

    /* JADX INFO: renamed from: B */
    public boolean f165157B = false;

    public slc0(RedPacketRecordAct redPacketRecordAct) {
        this.f165178u = redPacketRecordAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m184757B() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: A */
    public boolean m184772A() {
        return this.f165182y;
    }

    /* JADX INFO: renamed from: A3 */
    public void m184773A3(String str) {
        e51.m114742G(new Runnable() { // from class: l.flc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98146a.m184757B();
            }
        });
        this.f165183z = str;
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(str);
        this.f165156A = NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6);
        this.f165179v = new jkc0(this.f165178u, this);
        this.f165163f.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f165163f.setAdapter(this.f165179v);
        this.f165181x.m117105F0(true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m184774C(View view) {
        m184791U();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165178u;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m184775E() {
        this.f165181x.m117107p0();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m184776F() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m184777G(View view) {
        act().m47815F2();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m184778H(boolean z, RedPacket redPacket) {
        act().progressDismiss();
        this.f165164g.setVisibility(8);
        ReceiveRecords receiveRecordsNew_ = ReceiveRecords.new_();
        RedPacketOwner redPacketOwner = redPacket.owner;
        receiveRecordsNew_.userId = redPacketOwner.ownerId;
        receiveRecordsNew_.name = redPacketOwner.name;
        RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
        receiveRecordsNew_.amount = redPacketMyInfo.amount;
        receiveRecordsNew_.highest = redPacketMyInfo.highest;
        redPacket.receiveRecords.add(0, receiveRecordsNew_);
        this.f165179v.m141858G(redPacket.receiveRecords, redPacket, this.f165156A, qib0.f154693H.guessedCurrentServerTime());
        this.f165179v.notifyDataSetChanged();
        if (z) {
            View view = this.f165168k;
            long j = f165155D;
            Animator animatorM103753z = bt0.m103753z((ObjectAnimator) bt0.m103743p(view, "translationY", 0L, j, this.f165180w, -view.getHeight()), (ObjectAnimator) bt0.m103743p(this.f165168k, "scaleX", 0L, j, this.f165180w, xdl0.m208412y0() / (this.f165168k.getWidth() * 1.0f)), (ObjectAnimator) bt0.m103743p(this.f165167j, "translationY", 0L, j, this.f165180w, 1000.0f), (ObjectAnimator) bt0.m103743p(this.f165167j, "scaleX", 0L, j, this.f165180w, xdl0.m208412y0() / (this.f165167j.getWidth() * 1.0f)), (ObjectAnimator) bt0.m103743p(this.f165167j, "alpha", 0L, j, this.f165180w, 0.0f), (ObjectAnimator) bt0.m103743p(this.f165169l, "alpha", 0L, j, this.f165180w, 0.0f), (ObjectAnimator) bt0.m103743p(this.f165158a, "alpha", 0L, j, this.f165180w, 0.0f, 1.0f));
            animatorM103753z.addListener(new C19983a());
            animatorM103753z.start();
            return;
        }
        this.f165165h.setVisibility(8);
        this.f165177t.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(act(), szb0.f167031f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC19984b());
        this.f165158a.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m184779I(Throwable th) {
        act().progressDismiss();
        act().m47815F2();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m184780J(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (i == 4000404) {
                this.f165173p.setText("手慢了，红包派完了");
                this.f165173p.setTextSize(2, 18.0f);
                this.f165174q.setVisibility(4);
                this.f165175r.setVisibility(0);
            } else if (i != 4000405) {
                if (i == 4000406) {
                    m184788R();
                } else if (i == 4000407) {
                    lsi0.m151580j("单日最多可抢同一用户10个红包");
                } else if (i == 4000408) {
                    lsi0.m151580j("单日最多可抢100个红包");
                }
            }
            this.f165181x.m117106G0();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m184781K(Message message, final String str, View view) {
        zvf0.m220399u("e_open_red_packet", this.f165181x.pageId(), vwb.m200311Y("groupchat_id", m184797y()));
        e51.m114742G(new Runnable() { // from class: l.qlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155218a.m184784N();
            }
        });
        act().duringCreated(CoreModule.f17545c.f19637d1.m34889v3(message, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.rlc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159957a.m184785O(str, (Envelope) obj);
            }
        }, new e30() { // from class: l.glc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103310a.m184780J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m184782L(User user) {
        if (NullChecker.m81303a(user)) {
            this.f165172o.setText(user.name + "的红包");
        }
        if (this.f165156A) {
            qib0.f154691G.m102356Z0(this.f165171n, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102341Q0(this.f165171n, user.m60124fp().profileSmall());
        } else {
            qib0.f154691G.m102354Y0(this.f165171n, c3c0.f78540I0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m184783M(View view) {
        zvf0.m220399u("e_check_luck", this.f165181x.pageId(), vwb.m200311Y("groupchat_id", this.f165183z));
        this.f165181x.m117105F0(false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m184784N() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m184785O(String str, Envelope envelope) {
        act().progressDismiss();
        m184789S(str, true, ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0), true);
    }

    /* JADX INFO: renamed from: P */
    public String m184786P() {
        return this.f165181x.pageId();
    }

    /* JADX INFO: renamed from: Q */
    public final void m184787Q() {
        if (!this.f165157B) {
            this.f165177t.setVisibility(0);
        }
        this.f165164g.setOnClickListener(new View.OnClickListener() { // from class: l.ilc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113817a.m184774C(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m184788R() {
        w3z.m201402H(this.f165178u, new Runnable() { // from class: l.hlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108339a.m184775E();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m184789S(String str, final boolean z, RedPacket redPacket, boolean z2) {
        this.f165182y = true;
        act().setSwipeBackEnable(true);
        e51.m114742G(new Runnable() { // from class: l.jlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118507a.m184776F();
            }
        });
        xdl0.m208329E0(this.f165161d, new View.OnClickListener() { // from class: l.klc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123649a.m184777G(view);
            }
        });
        act().duringCreated(CoreModule.f17545c.f19637d1.m34887t3(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.llc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128687a.m184778H(z, (RedPacket) obj);
            }
        }, new e30() { // from class: l.mlc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134420a.m184779I((Throwable) obj);
            }
        }));
        this.f165181x.m117104E0(redPacket, z2);
    }

    /* JADX INFO: renamed from: T */
    public void m184790T(final Message message, final String str, RedPacket redPacket, int i) {
        act().setStatusBarColorResId(a1c0.f67130L);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f165166i.getLayoutParams();
        int iM208412y0 = (int) (xdl0.m208412y0() * 0.822f);
        layoutParams.width = iM208412y0;
        layoutParams.height = (int) (iM208412y0 * 1.486f);
        this.f165166i.setLayoutParams(layoutParams);
        act().duringCreated(CoreModule.f17545c.f19639e0.m169418Ma(message.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.nlc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139519a.m184782L((User) obj);
            }
        }));
        xdl0.m208329E0(this.f165175r, new View.OnClickListener() { // from class: l.olc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144490a.m184783M(view);
            }
        });
        xdl0.m208329E0(this.f165174q, new View.OnClickListener() { // from class: l.plc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150090a.m184781K(message, str, view);
            }
        });
        this.f165175r.setClickable(false);
        this.f165174q.setClickable(false);
        RelativeLayout relativeLayout = this.f165166i;
        long j = f165154C;
        Animator animatorM103753z = bt0.m103753z((ObjectAnimator) bt0.m103743p(relativeLayout, "scaleX", 0L, j, this.f165180w, 0.0f, 1.0f), (ObjectAnimator) bt0.m103743p(this.f165166i, "scaleY", 0L, j, this.f165180w, 0.0f, 1.0f));
        animatorM103753z.addListener(new C19986d());
        animatorM103753z.start();
        this.f165169l.setOnClickListener(null);
        if (i == 1) {
            this.f165174q.setVisibility(4);
            this.f165175r.setVisibility(4);
            this.f165173p.setText("该红包已超过48小时。如已领取，可在「钱包」-「红包记录」中查看。");
            this.f165173p.setTextSize(2, 18.0f);
        } else if (i == 2) {
            this.f165173p.setText("手慢了，红包派完了");
            this.f165173p.setTextSize(2, 18.0f);
            this.f165174q.setVisibility(4);
            this.f165175r.setVisibility(0);
        } else if (i == 3) {
            zvf0.m220368A("e_open_red_packet", this.f165181x.pageId(), vwb.m200311Y("groupchat_id", m184797y()));
            this.f165174q.setVisibility(0);
            this.f165173p.setText(redPacket.showInfo.title);
            if (TextUtils.equals(CoreModule.f17545c.f19639e0.m169527p9().f56011id, redPacket.owner.ownerId) || redPacket.quantity <= redPacket.assignQuantity || redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime()) {
                this.f165175r.setVisibility(0);
            } else {
                this.f165175r.setVisibility(4);
            }
        }
        if (this.f165175r.getVisibility() == 0) {
            zvf0.m220368A("e_check_luck", this.f165181x.pageId(), vwb.m200311Y("groupchat_id", this.f165183z));
        }
    }

    /* JADX INFO: renamed from: U */
    public void m184791U() {
        this.f165164g.setOnClickListener(null);
        if (this.f165157B) {
            return;
        }
        this.f165157B = true;
        RelativeLayout relativeLayout = this.f165166i;
        long j = f165154C;
        Animator animatorM103753z = bt0.m103753z((ObjectAnimator) bt0.m103743p(relativeLayout, "scaleX", 0L, j, this.f165180w, 1.0f, 0.0f), (ObjectAnimator) bt0.m103743p(this.f165166i, "scaleY", 0L, j, this.f165180w, 1.0f, 0.0f));
        animatorM103753z.addListener(new C19985c());
        animatorM103753z.start();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m184792s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m184792s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tlc0.m189617b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public RedPacketRecordAct getAct() {
        return this.f165178u;
    }

    /* JADX INFO: renamed from: v */
    public void m184794v(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f21032m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.m151578h(R$string.f21041n7);
        } else if (i == 41906) {
            w3z.m201403I(this.f165178u);
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m184795w(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 == j760Var.f116564a.intValue()) {
            lsi0.m151593w(R$string.f21050o7);
            return;
        }
        if ("41905".equals(j760Var.f116565b)) {
            lsi0.m151578h(R$string.f21041n7);
        } else if ("41906".equals(j760Var.f116565b)) {
            w3z.m201403I(this.f165178u);
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(elc0 elc0Var) {
        this.f165181x = elc0Var;
    }

    /* JADX INFO: renamed from: y */
    public String m184797y() {
        return this.f165183z;
    }

    /* JADX INFO: renamed from: z */
    public void m184798z(Message message, RedPacket redPacket, String str) {
        int i;
        act().progressDismiss();
        boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19639e0.m169527p9().f56011id, message.owner);
        boolean zEquals2 = TextUtils.equals(redPacket.splitType, "average");
        boolean z = redPacket.quantity <= redPacket.assignQuantity;
        boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
        boolean z2 = redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime();
        if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && z2) && (!(!zEquals && zEquals2 && zIsEmpty && !z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && (!(!zEquals && !zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || !z2) && ((!zEquals || zEquals2 || !zIsEmpty || z || z2) && !(zEquals && !zEquals2 && zIsEmpty && z && !z2)))))))))) {
            m184789S(str, false, redPacket, false);
        } else {
            if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && (!zEquals || zEquals2 || !zIsEmpty || z || z2))) {
                i = (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && !(!zEquals && zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && !((!zEquals && !zEquals2 && zIsEmpty && z && z2) || (zEquals && !zEquals2 && zIsEmpty && z && !z2)))) ? 1 : 2;
            } else {
                i = 3;
            }
            m184790T(message, str, redPacket, i);
            this.f165181x.m117104E0(redPacket, true);
        }
        this.f165181x.m117109r0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.slc0$a */
    public class C19983a implements Animator.AnimatorListener {
        public C19983a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.f165165h.setVisibility(8);
            slc0.this.f165177t.setVisibility(8);
            slc0.this.f165161d.setVisibility(0);
            slc0.this.act().setStatusBarColorResId(a1c0.f67129K);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f165161d.setVisibility(4);
            slc0.this.f165177t.setVisibility(4);
            slc0.this.f165158a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$b */
    public class AnimationAnimationListenerC19984b implements Animation.AnimationListener {
        public AnimationAnimationListenerC19984b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            slc0.this.f165158a.setVisibility(0);
            slc0.this.act().setStatusBarColorResId(a1c0.f67129K);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$c */
    public class C19985c implements Animator.AnimatorListener {
        public C19985c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.act().m47815F2();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f165177t.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$d */
    public class C19986d implements Animator.AnimatorListener {
        public C19986d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.m184787Q();
            slc0.this.f165175r.setClickable(true);
            slc0.this.f165174q.setClickable(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f165165h.setVisibility(0);
            slc0.this.f165164g.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
