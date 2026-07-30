package com.p000p1.mobile.putong.core.newui.messages.quickchat;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.c4g0;
import l.e30;
import l.e51;
import l.j760;
import l.jig;
import l.jo0;
import l.lzb0;
import l.mkd0;
import l.nvb0;
import l.ogl0;
import l.sqb0;
import l.t100;
import l.upa;
import l.vcl0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p009l.dzb0;
import rx.c;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickchatConversationsEntryView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static final int f4669A = t100.F;

    /* JADX INFO: renamed from: B */
    public static final int f4670B = t100.y;

    /* JADX INFO: renamed from: C */
    public static final int f4671C = t100.V;

    /* JADX INFO: renamed from: D */
    public static final Property<View, Integer> f4672D = new C0344a(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: a */
    public VLinear f4673a;

    /* JADX INFO: renamed from: b */
    public VLinear f4674b;

    /* JADX INFO: renamed from: c */
    public ImageView f4675c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f4676d;

    /* JADX INFO: renamed from: e */
    public View f4677e;

    /* JADX INFO: renamed from: f */
    public VLinear f4678f;

    /* JADX INFO: renamed from: g */
    public ImageView f4679g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f4680h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f4681i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f4682j;

    /* JADX INFO: renamed from: k */
    public ImageView f4683k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f4684l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f4685m;

    /* JADX INFO: renamed from: n */
    public QuickchatConversationsEntryAvatarView f4686n;

    /* JADX INFO: renamed from: o */
    public TextView f4687o;

    /* JADX INFO: renamed from: p */
    public TextView f4688p;

    /* JADX INFO: renamed from: q */
    public View f4689q;

    /* JADX INFO: renamed from: r */
    public final int f4690r;

    /* JADX INFO: renamed from: s */
    public final int f4691s;

    /* JADX INFO: renamed from: t */
    public Map<Integer, j760<Integer, Integer>> f4692t;

    /* JADX INFO: renamed from: u */
    public c4g0 f4693u;

    /* JADX INFO: renamed from: v */
    public c4g0 f4694v;

    /* JADX INFO: renamed from: w */
    public Act f4695w;

    /* JADX INFO: renamed from: x */
    public Animator f4696x;

    /* JADX INFO: renamed from: y */
    public Animator f4697y;

    /* JADX INFO: renamed from: z */
    public Runnable f4698z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$a */
    public class C0344a extends Property<View, Integer> {
        public C0344a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$b */
    public class C0345b implements Animator.AnimatorListener {
        public C0345b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m6681w();
            QuickchatConversationsEntryView.this.m6683y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(QuickchatConversationsEntryView.this.f4673a, false);
            xdl0.M(QuickchatConversationsEntryView.this.f4682j, false);
            QuickchatConversationsEntryView.this.m6683y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M(QuickchatConversationsEntryView.this.f4684l, true);
            QuickchatConversationsEntryView.this.f4684l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$c */
    public class C0346c implements Animator.AnimatorListener {
        public C0346c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m6682x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(QuickchatConversationsEntryView.this.f4684l, false);
            QuickchatConversationsEntryView quickchatConversationsEntryView = QuickchatConversationsEntryView.this;
            quickchatConversationsEntryView.m6680v(quickchatConversationsEntryView.f4695w);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickchatConversationsEntryView.this.f4674b.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f4677e.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f4678f.setAlpha(0.0f);
            xdl0.M(QuickchatConversationsEntryView.this.f4673a, true);
            xdl0.M(QuickchatConversationsEntryView.this.f4682j, true);
            QuickchatConversationsEntryView.this.f4682j.setAlpha(0.0f);
        }
    }

    public QuickchatConversationsEntryView(@NonNull Context context) {
        super(context);
        this.f4690r = Color.parseColor("#FFC683");
        this.f4691s = Color.parseColor("#FF9D73");
        this.f4692t = new HashMap(24);
        this.f4698z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12740a.m6676r();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6659a(Act act, View view) {
        zvf0.u("e_voicechat_button", "p_messages_view", new j760[]{j760.a("remainingtimes", Integer.valueOf(sqb0.i0())), j760.a("voicechat_results", sqb0.O().R())});
        act.startActivity(DropDownAct.b2(act, "voice_quick_chat", "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6662d(Act act, View view) {
        zvf0.u("e_quickchat_button", "p_messages_view", new j760[]{j760.a("remainingtimes", Integer.valueOf(a.b0()))});
        act.startActivity(DropDownAct.b2(act, "quick_chat", "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6665g(Throwable th) {
    }

    private ArrayList<String> getheadUrlList() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (zz6.u0()) {
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Zi);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.bj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.cj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.dj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.ej);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.fj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.gj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.hj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.ij);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.aj);
            return arrayList;
        }
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Pi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Ri);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Si);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Ti);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Ui);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Vi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Wi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Xi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Yi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.Qi);
        return arrayList;
    }

    private void setClick(final Act act) {
        xdl0.E0(this.f4684l, new View.OnClickListener() { // from class: l.fzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13244a.m6678t(act, view);
            }
        });
        xdl0.E0(this.f4682j, new View.OnClickListener() { // from class: l.gzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13821a.m6679u(view);
            }
        });
        xdl0.E0(this.f4674b, new View.OnClickListener() { // from class: l.hzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m6659a(act, view);
            }
        });
        xdl0.E0(this.f4678f, new View.OnClickListener() { // from class: l.izb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m6662d(act, view);
            }
        });
    }

    public int getCurrentOnlineUserCountWithTime() {
        if (this.f4692t.size() <= 0) {
            this.f4692t.put(0, j760.a(8762, 11014));
            this.f4692t.put(1, j760.a(5528, 9765));
            this.f4692t.put(2, j760.a(4669, 6161));
            this.f4692t.put(3, j760.a(3211, 5203));
            this.f4692t.put(4, j760.a(2881, 3578));
            this.f4692t.put(5, j760.a(4249, 6004));
            this.f4692t.put(6, j760.a(5388, 8066));
            this.f4692t.put(7, j760.a(7238, 10093));
            this.f4692t.put(8, j760.a(8347, 11238));
            this.f4692t.put(9, j760.a(9294, 12185));
            this.f4692t.put(10, j760.a(11164, 12291));
            this.f4692t.put(11, j760.a(12261, 12837));
            this.f4692t.put(12, j760.a(10707, 12454));
            this.f4692t.put(13, j760.a(11410, 12639));
            this.f4692t.put(14, j760.a(11444, 12759));
            this.f4692t.put(15, j760.a(11203, 12570));
            this.f4692t.put(16, j760.a(11516, 12914));
            this.f4692t.put(17, j760.a(10781, 12353));
            this.f4692t.put(18, j760.a(11317, 13007));
            this.f4692t.put(19, j760.a(11917, 14604));
            this.f4692t.put(20, j760.a(13380, 15737));
            this.f4692t.put(21, j760.a(14238, 15995));
            this.f4692t.put(22, j760.a(13014, 13793));
            this.f4692t.put(23, j760.a(11781, 12583));
        }
        j760<Integer, Integer> j760Var = this.f4692t.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (((Integer) j760Var.b).intValue() - ((Integer) j760Var.a).intValue())) * Math.random()) + ((double) ((Integer) j760Var.a).intValue()));
    }

    /* JADX INFO: renamed from: k */
    public final void m6669k(View view) {
        lzb0.a(this, view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m6676r() {
        e51.J(this.f4698z);
        jig jigVar = new jig();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f4681i;
        Property<View, Integer> property = f4672D;
        int i = f4670B;
        int i2 = f4669A;
        Animator animatorM = bt0.m(frameLayout, property, 0L, 200L, jigVar, new int[]{i, i2});
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f4684l, "alpha", 0L, 200L, jigVar, new float[]{0.0f, 1.0f}), bt0.p(this.f4682j, "alpha", 0L, 200L, jigVar, new float[]{1.0f, 0.0f})});
        Animator animatorM2 = bt0.m(this.f4673a, property, 0L, 200L, jigVar, new int[]{f4671C, i2});
        Animator animatorZ2 = bt0.z(new Animator[]{bt0.p(this.f4674b, "alpha", 0L, 100L, jigVar, new float[]{1.0f, 0.0f}), bt0.p(this.f4677e, "alpha", 0L, 100L, jigVar, new float[]{1.0f, 0.0f}), bt0.p(this.f4678f, "alpha", 0L, 100L, jigVar, new float[]{1.0f, 0.0f})});
        arrayList.add(animatorM);
        arrayList.add(animatorZ);
        arrayList.add(animatorM2);
        arrayList.add(animatorZ2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.a(this.f4697y)) {
            this.f4697y.removeAllListeners();
            this.f4697y.cancel();
        }
        Animator animatorZ3 = bt0.z(animatorArr);
        this.f4697y = animatorZ3;
        animatorZ3.addListener(new C0345b());
        this.f4697y.start();
    }

    /* JADX INFO: renamed from: m */
    public void m6671m() {
        jig jigVar = new jig();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f4681i;
        Property<View, Integer> property = f4672D;
        int i = f4669A;
        Animator animatorM = bt0.m(frameLayout, property, 0L, 200L, jigVar, new int[]{i, f4670B});
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(this.f4684l, "alpha", 0L, 200L, jigVar, new float[]{1.0f, 0.0f}), bt0.p(this.f4682j, "alpha", 0L, 200L, jigVar, new float[]{0.0f, 1.0f})});
        Animator animatorM2 = bt0.m(this.f4673a, property, 0L, 200L, jigVar, new int[]{i, f4671C});
        Animator animatorZ2 = bt0.z(new Animator[]{bt0.p(this.f4674b, "alpha", 150L, 100L, jigVar, new float[]{0.0f, 1.0f}), bt0.p(this.f4677e, "alpha", 150L, 100L, jigVar, new float[]{0.0f, 1.0f}), bt0.p(this.f4678f, "alpha", 150L, 100L, jigVar, new float[]{0.0f, 1.0f})});
        arrayList.add(animatorM);
        arrayList.add(animatorZ);
        arrayList.add(animatorM2);
        arrayList.add(animatorZ2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.a(this.f4696x)) {
            this.f4696x.removeAllListeners();
            this.f4696x.cancel();
        }
        Animator animatorZ3 = bt0.z(animatorArr);
        this.f4696x = animatorZ3;
        animatorZ3.addListener(new C0346c());
        this.f4696x.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m6672n() {
        if (xdl0.O0(this.f4689q)) {
            dzb0.m13528a().m13529b();
        }
        xdl0.M(this.f4689q, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m6673o() {
        return m6675q() || m6674p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.J(this.f4698z);
        if (m6674p()) {
            this.f4697y.cancel();
        }
        if (m6675q()) {
            this.f4696x.cancel();
        }
        m6684z();
        m6683y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6669k(this);
        xdl0.M(this.f4676d, true);
        xdl0.M(this.f4680h, true);
        xdl0.M(this.f4675c, false);
        xdl0.M(this.f4679g, false);
        vcl0.b(this.f4685m, t100.i);
        Context context = getContext();
        if (NullChecker.a(context)) {
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(false).into(this.f4676d);
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(false).into(this.f4680h);
        }
        if (upa.z()) {
            int i = t100.V;
            xdl0.D0(i, new View[]{this});
            xdl0.D0(i, new View[]{this.f4685m});
            xdl0.D0(i, new View[]{this.f4684l});
            xdl0.D0(i, new View[]{this.f4682j});
            xdl0.D0(i, new View[]{this.f4681i});
            xdl0.D0(i, new View[]{this.f4673a});
            this.f4683k.setImageResource(x2c0.Og);
            this.f4673a.setBackgroundResource(x2c0.Pg);
            this.f4681i.setBackgroundResource(x2c0.Ng);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m6674p() {
        return NullChecker.a(this.f4697y) && this.f4697y.isRunning();
    }

    /* JADX INFO: renamed from: q */
    public boolean m6675q() {
        return NullChecker.a(this.f4696x) && this.f4696x.isRunning();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m6677s(Act act, Long l2) {
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(true).repeatCount(1).into(this.f4676d);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(true).repeatCount(1).into(this.f4680h);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m6678t(Act act, View view) {
        if (m6673o()) {
            return;
        }
        m6672n();
        m6684z();
        if (ogl0.P()) {
            zvf0.u("e_quickchat_button", "p_messages_view", new j760[]{j760.a("remainingtimes", Integer.valueOf(a.b0()))});
            nvb0.n(act, "text_quick_chat", "messages_view_quickchat_entry");
        } else {
            zvf0.r("e_quickchat_entrance_message", "p_messages_view");
            m6671m();
            e51.H(act, this.f4698z, 10000L);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m6679u(View view) {
        if (m6673o()) {
            return;
        }
        m6676r();
    }

    /* JADX INFO: renamed from: v */
    public final void m6680v(final Act act) {
        mkd0.z(this.f4693u);
        this.f4693u = act.duringCreated(c.interval(0L, 6L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.jzb0
            public final void call(Object obj) {
                this.f15368a.m6677s(act, (Long) obj);
            }
        }, new e30() { // from class: l.kzb0
            public final void call(Object obj) {
                QuickchatConversationsEntryView.m6665g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m6681w() {
        xdl0.M(this.f4673a, false);
        xdl0.M(this.f4684l, true);
        xdl0.M(this.f4682j, false);
        this.f4684l.setAlpha(1.0f);
        xdl0.C0(this.f4681i, f4669A);
    }

    /* JADX INFO: renamed from: x */
    public void m6682x() {
        xdl0.M(this.f4673a, true);
        xdl0.M(this.f4684l, false);
        xdl0.M(this.f4682j, true);
        this.f4682j.setAlpha(1.0f);
        this.f4674b.setAlpha(1.0f);
        this.f4677e.setAlpha(1.0f);
        this.f4678f.setAlpha(1.0f);
        xdl0.C0(this.f4681i, f4670B);
    }

    /* JADX INFO: renamed from: y */
    public final void m6683y() {
        mkd0.z(this.f4693u);
        this.f4676d.stopAnimation(false);
        this.f4680h.stopAnimation(false);
    }

    /* JADX INFO: renamed from: z */
    public final void m6684z() {
        mkd0.z(this.f4694v);
        xdl0.M(this.f4685m, false);
        this.f4685m.stopAnimation(false);
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4690r = Color.parseColor("#FFC683");
        this.f4691s = Color.parseColor("#FF9D73");
        this.f4692t = new HashMap(24);
        this.f4698z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12740a.m6676r();
            }
        };
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4690r = Color.parseColor("#FFC683");
        this.f4691s = Color.parseColor("#FF9D73");
        this.f4692t = new HashMap(24);
        this.f4698z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12740a.m6676r();
            }
        };
    }
}
