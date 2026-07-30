package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.RedPacketRecordAct;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.ReceiveRecords;
import com.p1.mobile.putong.core.data.RedPacket;
import com.p1.mobile.putong.core.data.RedPacketMyInfo;
import com.p1.mobile.putong.core.data.RedPacketOwner;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.bt0;
import l.c3c0;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.szb0;
import l.tbk;
import l.tlc0;
import l.vwb;
import l.w3z;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class slc0 implements s7m<elc0> {

    /* JADX INFO: renamed from: C */
    public static final long f19084C = 300;

    /* JADX INFO: renamed from: D */
    public static final long f19085D = 400;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f19088a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f19089b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f19090c;

    /* JADX INFO: renamed from: d */
    public VImage f19091d;

    /* JADX INFO: renamed from: e */
    public VImage f19092e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f19093f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f19094g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f19095h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f19096i;

    /* JADX INFO: renamed from: j */
    public View f19097j;

    /* JADX INFO: renamed from: k */
    public View f19098k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f19099l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f19100m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f19101n;

    /* JADX INFO: renamed from: o */
    public VText f19102o;

    /* JADX INFO: renamed from: p */
    public VText f19103p;

    /* JADX INFO: renamed from: q */
    public VImage f19104q;

    /* JADX INFO: renamed from: r */
    public VText f19105r;

    /* JADX INFO: renamed from: s */
    public View f19106s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f19107t;

    /* JADX INFO: renamed from: u */
    public RedPacketRecordAct f19108u;

    /* JADX INFO: renamed from: v */
    public jkc0 f19109v;

    /* JADX INFO: renamed from: x */
    public elc0 f19111x;

    /* JADX INFO: renamed from: z */
    public String f19113z;

    /* JADX INFO: renamed from: w */
    public AccelerateDecelerateInterpolator f19110w = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: y */
    public boolean f19112y = false;

    /* JADX INFO: renamed from: A */
    public boolean f19086A = false;

    /* JADX INFO: renamed from: B */
    public boolean f19087B = false;

    public slc0(RedPacketRecordAct redPacketRecordAct) {
        this.f19108u = redPacketRecordAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m22518B() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: A */
    public boolean m22533A() {
        return this.f19112y;
    }

    /* JADX INFO: renamed from: A3 */
    public void m22534A3(String str) {
        e51.G(new Runnable() { // from class: l.flc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10456a.m22518B();
            }
        });
        this.f19113z = str;
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(str);
        this.f19086A = NullChecker.a(chatGroupS6) && tbk.s(chatGroupS6);
        this.f19109v = new jkc0(this.f19108u, this);
        this.f19093f.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f19093f.setAdapter(this.f19109v);
        this.f19111x.m12590F0(true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m22535C(View view) {
        m22553U();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22536C0() {
        return this.f19108u;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m22537E() {
        this.f19111x.m12593p0();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m22538F() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m22539G(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m22540H(boolean z, RedPacket redPacket) {
        act().progressDismiss();
        this.f19094g.setVisibility(8);
        ReceiveRecords receiveRecordsNew_ = ReceiveRecords.new_();
        RedPacketOwner redPacketOwner = redPacket.owner;
        receiveRecordsNew_.userId = redPacketOwner.ownerId;
        receiveRecordsNew_.name = redPacketOwner.name;
        RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
        receiveRecordsNew_.amount = redPacketMyInfo.amount;
        receiveRecordsNew_.highest = redPacketMyInfo.highest;
        redPacket.receiveRecords.add(0, receiveRecordsNew_);
        this.f19109v.m15985G(redPacket.receiveRecords, redPacket, this.f19086A, qib0.H.guessedCurrentServerTime());
        this.f19109v.notifyDataSetChanged();
        if (z) {
            View view = this.f19098k;
            long j = f19085D;
            Animator animatorZ = bt0.z(new Animator[]{(ObjectAnimator) bt0.p(view, "translationY", 0L, j, this.f19110w, new float[]{-view.getHeight()}), (ObjectAnimator) bt0.p(this.f19098k, "scaleX", 0L, j, this.f19110w, new float[]{xdl0.y0() / (this.f19098k.getWidth() * 1.0f)}), (ObjectAnimator) bt0.p(this.f19097j, "translationY", 0L, j, this.f19110w, new float[]{1000.0f}), (ObjectAnimator) bt0.p(this.f19097j, "scaleX", 0L, j, this.f19110w, new float[]{xdl0.y0() / (this.f19097j.getWidth() * 1.0f)}), (ObjectAnimator) bt0.p(this.f19097j, "alpha", 0L, j, this.f19110w, new float[]{0.0f}), (ObjectAnimator) bt0.p(this.f19099l, "alpha", 0L, j, this.f19110w, new float[]{0.0f}), (ObjectAnimator) bt0.p(this.f19088a, "alpha", 0L, j, this.f19110w, new float[]{0.0f, 1.0f})});
            animatorZ.addListener(new C0820a());
            animatorZ.start();
            return;
        }
        this.f19095h.setVisibility(8);
        this.f19107t.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(act(), szb0.f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0821b());
        this.f19088a.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22541I(Throwable th) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22542J(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).subCode;
            if (i == 4000404) {
                this.f19103p.setText("手慢了，红包派完了");
                this.f19103p.setTextSize(2, 18.0f);
                this.f19104q.setVisibility(4);
                this.f19105r.setVisibility(0);
            } else if (i != 4000405) {
                if (i == 4000406) {
                    m22550R();
                } else if (i == 4000407) {
                    lsi0.j("单日最多可抢同一用户10个红包");
                } else if (i == 4000408) {
                    lsi0.j("单日最多可抢100个红包");
                }
            }
            this.f19111x.m12591G0();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m22543K(Message message, final String str, View view) {
        zvf0.u("e_open_red_packet", this.f19111x.pageId(), new j760[]{vwb.Y("groupchat_id", m22560y())});
        e51.G(new Runnable() { // from class: l.qlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18082a.m22546N();
            }
        });
        act().duringCreated(CoreModule.c.d1.v3(message, str)).subscribe(mkd0.H(new e30() { // from class: l.rlc0
            public final void call(Object obj) {
                this.f18598a.m22547O(str, (Envelope) obj);
            }
        }, new e30() { // from class: l.glc0
            public final void call(Object obj) {
                this.f11493a.m22542J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m22544L(User user) {
        if (NullChecker.a(user)) {
            this.f19102o.setText(user.name + "的红包");
        }
        if (this.f19086A) {
            qib0.G.Z0(this.f19101n, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.a(user)) {
            qib0.G.Q0(this.f19101n, user.fp().profileSmall());
        } else {
            qib0.G.Y0(this.f19101n, c3c0.I0);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m22545M(View view) {
        zvf0.u("e_check_luck", this.f19111x.pageId(), new j760[]{vwb.Y("groupchat_id", this.f19113z)});
        this.f19111x.m12590F0(false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m22546N() {
        act().progress("加载中...", true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m22547O(String str, Envelope envelope) {
        act().progressDismiss();
        m22551S(str, true, (RedPacket) envelope.getModuleData(CoreData.class).redPackets.get(0), true);
    }

    /* JADX INFO: renamed from: P */
    public String m22548P() {
        return this.f19111x.pageId();
    }

    /* JADX INFO: renamed from: Q */
    public final void m22549Q() {
        if (!this.f19087B) {
            this.f19107t.setVisibility(0);
        }
        this.f19094g.setOnClickListener(new View.OnClickListener() { // from class: l.ilc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13296a.m22535C(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m22550R() {
        w3z.H(this.f19108u, new Runnable() { // from class: l.hlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12104a.m22537E();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m22551S(String str, final boolean z, RedPacket redPacket, boolean z2) {
        this.f19112y = true;
        act().setSwipeBackEnable(true);
        e51.G(new Runnable() { // from class: l.jlc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13863a.m22538F();
            }
        });
        xdl0.E0(this.f19091d, new View.OnClickListener() { // from class: l.klc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14373a.m22539G(view);
            }
        });
        act().duringCreated(CoreModule.c.d1.t3(str)).subscribe(mkd0.H(new e30() { // from class: l.llc0
            public final void call(Object obj) {
                this.f14943a.m22540H(z, (RedPacket) obj);
            }
        }, new e30() { // from class: l.mlc0
            public final void call(Object obj) {
                this.f15440a.m22541I((Throwable) obj);
            }
        }));
        this.f19111x.m12589E0(redPacket, z2);
    }

    /* JADX INFO: renamed from: T */
    public void m22552T(final Message message, final String str, RedPacket redPacket, int i) {
        act().setStatusBarColorResId(a1c0.L);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f19096i.getLayoutParams();
        int iY0 = (int) (xdl0.y0() * 0.822f);
        layoutParams.width = iY0;
        layoutParams.height = (int) (iY0 * 1.486f);
        this.f19096i.setLayoutParams(layoutParams);
        act().duringCreated(CoreModule.c.e0.Ma(message.owner)).subscribe(mkd0.G(new e30() { // from class: l.nlc0
            public final void call(Object obj) {
                this.f16095a.m22544L((User) obj);
            }
        }));
        xdl0.E0(this.f19105r, new View.OnClickListener() { // from class: l.olc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16690a.m22545M(view);
            }
        });
        xdl0.E0(this.f19104q, new View.OnClickListener() { // from class: l.plc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17489a.m22543K(message, str, view);
            }
        });
        this.f19105r.setClickable(false);
        this.f19104q.setClickable(false);
        RelativeLayout relativeLayout = this.f19096i;
        long j = f19084C;
        Animator animatorZ = bt0.z(new Animator[]{(ObjectAnimator) bt0.p(relativeLayout, "scaleX", 0L, j, this.f19110w, new float[]{0.0f, 1.0f}), (ObjectAnimator) bt0.p(this.f19096i, "scaleY", 0L, j, this.f19110w, new float[]{0.0f, 1.0f})});
        animatorZ.addListener(new C0823d());
        animatorZ.start();
        this.f19099l.setOnClickListener(null);
        if (i == 1) {
            this.f19104q.setVisibility(4);
            this.f19105r.setVisibility(4);
            this.f19103p.setText("该红包已超过48小时。如已领取，可在「钱包」-「红包记录」中查看。");
            this.f19103p.setTextSize(2, 18.0f);
        } else if (i == 2) {
            this.f19103p.setText("手慢了，红包派完了");
            this.f19103p.setTextSize(2, 18.0f);
            this.f19104q.setVisibility(4);
            this.f19105r.setVisibility(0);
        } else if (i == 3) {
            zvf0.A("e_open_red_packet", this.f19111x.pageId(), new j760[]{vwb.Y("groupchat_id", m22560y())});
            this.f19104q.setVisibility(0);
            this.f19103p.setText(redPacket.showInfo.title);
            if (TextUtils.equals(((DbObject) CoreModule.c.e0.p9()).id, redPacket.owner.ownerId) || redPacket.quantity <= redPacket.assignQuantity || redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime()) {
                this.f19105r.setVisibility(0);
            } else {
                this.f19105r.setVisibility(4);
            }
        }
        if (this.f19105r.getVisibility() == 0) {
            zvf0.A("e_check_luck", this.f19111x.pageId(), new j760[]{vwb.Y("groupchat_id", this.f19113z)});
        }
    }

    /* JADX INFO: renamed from: U */
    public void m22553U() {
        this.f19094g.setOnClickListener(null);
        if (this.f19087B) {
            return;
        }
        this.f19087B = true;
        RelativeLayout relativeLayout = this.f19096i;
        long j = f19084C;
        Animator animatorZ = bt0.z(new Animator[]{(ObjectAnimator) bt0.p(relativeLayout, "scaleX", 0L, j, this.f19110w, new float[]{1.0f, 0.0f}), (ObjectAnimator) bt0.p(this.f19096i, "scaleY", 0L, j, this.f19110w, new float[]{1.0f, 0.0f})});
        animatorZ.addListener(new C0822c());
        animatorZ.start();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22555s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m22555s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tlc0.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public RedPacketRecordAct act() {
        return this.f19108u;
    }

    /* JADX INFO: renamed from: v */
    public void m22557v(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.h(R.string.n7);
        } else if (i == 41906) {
            w3z.I(this.f19108u);
        } else {
            lsi0.h(R.string.m7);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m22558w(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 == ((Integer) j760Var.a).intValue()) {
            lsi0.w(R.string.o7);
            return;
        }
        if ("41905".equals(j760Var.b)) {
            lsi0.h(R.string.n7);
        } else if ("41906".equals(j760Var.b)) {
            w3z.I(this.f19108u);
        } else {
            lsi0.h(R.string.m7);
        }
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m22554i1(elc0 elc0Var) {
        this.f19111x = elc0Var;
    }

    /* JADX INFO: renamed from: y */
    public String m22560y() {
        return this.f19113z;
    }

    /* JADX INFO: renamed from: z */
    public void m22561z(Message message, RedPacket redPacket, String str) {
        int i;
        act().progressDismiss();
        boolean zEquals = TextUtils.equals(((DbObject) CoreModule.c.e0.p9()).id, message.owner);
        boolean zEquals2 = TextUtils.equals(redPacket.splitType, "average");
        boolean z = redPacket.quantity <= redPacket.assignQuantity;
        boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
        boolean z2 = redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime();
        if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && (!(!zEquals && zEquals2 && zIsEmpty && z && z2) && (!(!zEquals && zEquals2 && zIsEmpty && !z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && (!(!zEquals && !zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || z || !z2) && ((!zEquals || zEquals2 || !zIsEmpty || z || z2) && !(zEquals && !zEquals2 && zIsEmpty && z && !z2)))))))))) {
            m22551S(str, false, redPacket, false);
        } else {
            if ((zEquals || !zEquals2 || !zIsEmpty || z || z2) && ((zEquals || zEquals2 || !zIsEmpty || z || z2) && (!zEquals || zEquals2 || !zIsEmpty || z || z2))) {
                i = (!(!zEquals && zEquals2 && zIsEmpty && z && !z2) && !(!zEquals && zEquals2 && zIsEmpty && z && z2) && ((zEquals || zEquals2 || !zIsEmpty || !z || z2) && !((!zEquals && !zEquals2 && zIsEmpty && z && z2) || (zEquals && !zEquals2 && zIsEmpty && z && !z2)))) ? 1 : 2;
            } else {
                i = 3;
            }
            m22552T(message, str, redPacket, i);
            this.f19111x.m12589E0(redPacket, true);
        }
        this.f19111x.m12595r0();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.slc0$a */
    public class C0820a implements Animator.AnimatorListener {
        public C0820a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.f19095h.setVisibility(8);
            slc0.this.f19107t.setVisibility(8);
            slc0.this.f19091d.setVisibility(0);
            slc0.this.act().setStatusBarColorResId(a1c0.K);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f19091d.setVisibility(4);
            slc0.this.f19107t.setVisibility(4);
            slc0.this.f19088a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$b */
    public class AnimationAnimationListenerC0821b implements Animation.AnimationListener {
        public AnimationAnimationListenerC0821b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            slc0.this.f19088a.setVisibility(0);
            slc0.this.act().setStatusBarColorResId(a1c0.K);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$c */
    public class C0822c implements Animator.AnimatorListener {
        public C0822c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.act().finish();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f19107t.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.slc0$d */
    public class C0823d implements Animator.AnimatorListener {
        public C0823d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            slc0.this.m22549Q();
            slc0.this.f19105r.setClickable(true);
            slc0.this.f19104q.setClickable(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            slc0.this.f19095h.setVisibility(0);
            slc0.this.f19094g.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
