package com.p051p1.mobile.putong.core.newui.messages.quickchat;

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
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.iliveroom.TXILiveRoomDefine;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VLinear;
import p153l.bnl0;
import p153l.c17;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.gt0;
import p153l.h7c0;
import p153l.i4g0;
import p153l.kcg0;
import p153l.l51;
import p153l.p7c0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.r3c0;
import p153l.spl0;
import p153l.wyb0;
import p153l.xjg;
import p153l.y20;
import p153l.zll0;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatConversationsEntryView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static final int f26633A = qa00.f156293F;

    /* JADX INFO: renamed from: B */
    public static final int f26634B = qa00.f156338y;

    /* JADX INFO: renamed from: C */
    public static final int f26635C = qa00.f156309V;

    /* JADX INFO: renamed from: D */
    public static final Property<View, Integer> f26636D = new C8331a(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: a */
    public VLinear f26637a;

    /* JADX INFO: renamed from: b */
    public VLinear f26638b;

    /* JADX INFO: renamed from: c */
    public ImageView f26639c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f26640d;

    /* JADX INFO: renamed from: e */
    public View f26641e;

    /* JADX INFO: renamed from: f */
    public VLinear f26642f;

    /* JADX INFO: renamed from: g */
    public ImageView f26643g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f26644h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f26645i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f26646j;

    /* JADX INFO: renamed from: k */
    public ImageView f26647k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f26648l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f26649m;

    /* JADX INFO: renamed from: n */
    public QuickchatConversationsEntryAvatarView f26650n;

    /* JADX INFO: renamed from: o */
    public TextView f26651o;

    /* JADX INFO: renamed from: p */
    public TextView f26652p;

    /* JADX INFO: renamed from: q */
    public View f26653q;

    /* JADX INFO: renamed from: r */
    public final int f26654r;

    /* JADX INFO: renamed from: s */
    public final int f26655s;

    /* JADX INFO: renamed from: t */
    public Map<Integer, pf60<Integer, Integer>> f26656t;

    /* JADX INFO: renamed from: u */
    public kcg0 f26657u;

    /* JADX INFO: renamed from: v */
    public kcg0 f26658v;

    /* JADX INFO: renamed from: w */
    public Act f26659w;

    /* JADX INFO: renamed from: x */
    public Animator f26660x;

    /* JADX INFO: renamed from: y */
    public Animator f26661y;

    /* JADX INFO: renamed from: z */
    public Runnable f26662z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$a */
    public class C8331a extends Property<View, Integer> {
        public C8331a(Class cls, String str) {
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
    public class C8332b implements Animator.AnimatorListener {
        public C8332b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m43533w();
            QuickchatConversationsEntryView.this.m43535y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26637a, false);
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26646j, false);
            QuickchatConversationsEntryView.this.m43535y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26648l, true);
            QuickchatConversationsEntryView.this.f26648l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$c */
    public class C8333c implements Animator.AnimatorListener {
        public C8333c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m43534x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26648l, false);
            QuickchatConversationsEntryView quickchatConversationsEntryView = QuickchatConversationsEntryView.this;
            quickchatConversationsEntryView.m43532v(quickchatConversationsEntryView.f26659w);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickchatConversationsEntryView.this.f26638b.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f26641e.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f26642f.setAlpha(0.0f);
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26637a, true);
            bnl0.m105524M(QuickchatConversationsEntryView.this.f26646j, true);
            QuickchatConversationsEntryView.this.f26646j.setAlpha(0.0f);
        }
    }

    public QuickchatConversationsEntryView(@NonNull Context context) {
        super(context);
        this.f26654r = Color.parseColor("#FFC683");
        this.f26655s = Color.parseColor("#FF9D73");
        this.f26656t = new HashMap(24);
        this.f26662z = new Runnable() { // from class: l.i7c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113251a.m43528r();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43511a(Act act, View view) {
        i4g0.m138523u("e_voicechat_button", OMSDialogPositon.p_messages_view, pf60.m172085a("remainingtimes", Integer.valueOf(wyb0.m208508i0())), pf60.m172085a("voicechat_results", wyb0.m208493O().getVoicechat_results()));
        act.startActivity(DropDownAct.m55631c2(act, "voice_quick_chat", "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m43514d(Act act, View view) {
        i4g0.m138523u("e_quickchat_button", OMSDialogPositon.p_messages_view, pf60.m172085a("remainingtimes", Integer.valueOf(C8772a.m51429b0())));
        act.startActivity(DropDownAct.m55631c2(act, UnlockConversationType.quick_chat, "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m43517g(Throwable th) {
    }

    private ArrayList<String> getheadUrlList() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (c17.m107528u0()) {
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86412Nj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86476Pj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86508Qj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86540Rj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86572Sj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86604Tj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86636Uj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86668Vj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86700Wj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86444Oj);
            return arrayList;
        }
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86092Dj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86156Fj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86188Gj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86220Hj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86252Ij);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86284Jj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86316Kj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86348Lj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86380Mj);
        arrayList.add("res://" + getContext().getPackageName() + "/" + dbc0.f86124Ej);
        return arrayList;
    }

    private void setClick(final Act act) {
        bnl0.m105509E0(this.f26648l, new View.OnClickListener() { // from class: l.j7c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118673a.m43530t(act, view);
            }
        });
        bnl0.m105509E0(this.f26646j, new View.OnClickListener() { // from class: l.k7c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124259a.m43531u(view);
            }
        });
        bnl0.m105509E0(this.f26638b, new View.OnClickListener() { // from class: l.l7c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m43511a(act, view);
            }
        });
        bnl0.m105509E0(this.f26642f, new View.OnClickListener() { // from class: l.m7c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m43514d(act, view);
            }
        });
    }

    public int getCurrentOnlineUserCountWithTime() {
        if (this.f26656t.size() <= 0) {
            this.f26656t.put(0, pf60.m172085a(8762, 11014));
            this.f26656t.put(1, pf60.m172085a(5528, 9765));
            this.f26656t.put(2, pf60.m172085a(4669, 6161));
            this.f26656t.put(3, pf60.m172085a(3211, 5203));
            this.f26656t.put(4, pf60.m172085a(2881, 3578));
            this.f26656t.put(5, pf60.m172085a(4249, 6004));
            this.f26656t.put(6, pf60.m172085a(5388, 8066));
            this.f26656t.put(7, pf60.m172085a(7238, 10093));
            this.f26656t.put(8, pf60.m172085a(8347, 11238));
            this.f26656t.put(9, pf60.m172085a(9294, 12185));
            this.f26656t.put(10, pf60.m172085a(11164, Integer.valueOf(CommandMessage.COMMAND_STATISTIC)));
            this.f26656t.put(11, pf60.m172085a(12261, 12837));
            this.f26656t.put(12, pf60.m172085a(10707, 12454));
            this.f26656t.put(13, pf60.m172085a(11410, 12639));
            this.f26656t.put(14, pf60.m172085a(11444, 12759));
            this.f26656t.put(15, pf60.m172085a(Integer.valueOf(TXILiveRoomDefine.TXILiveRoomErrorMusicNotSupportSampleRate), 12570));
            this.f26656t.put(16, pf60.m172085a(11516, 12914));
            this.f26656t.put(17, pf60.m172085a(10781, 12353));
            this.f26656t.put(18, pf60.m172085a(11317, 13007));
            this.f26656t.put(19, pf60.m172085a(11917, 14604));
            this.f26656t.put(20, pf60.m172085a(13380, 15737));
            this.f26656t.put(21, pf60.m172085a(14238, 15995));
            this.f26656t.put(22, pf60.m172085a(13014, 13793));
            this.f26656t.put(23, pf60.m172085a(11781, 12583));
        }
        pf60<Integer, Integer> pf60Var = this.f26656t.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (pf60Var.f152157b.intValue() - pf60Var.f152156a.intValue())) * Math.random()) + ((double) pf60Var.f152156a.intValue()));
    }

    /* JADX INFO: renamed from: k */
    public final void m43521k(View view) {
        p7c0.m171101a(this, view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m43528r() {
        l51.m152890J(this.f26662z);
        xjg xjgVar = new xjg();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f26645i;
        Property<View, Integer> property = f26636D;
        int i = f26634B;
        int i2 = f26633A;
        Animator animatorM132167m = gt0.m132167m(frameLayout, property, 0L, 200L, xjgVar, i, i2);
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f26648l, "alpha", 0L, 200L, xjgVar, 0.0f, 1.0f), gt0.m132170p(this.f26646j, "alpha", 0L, 200L, xjgVar, 1.0f, 0.0f));
        Animator animatorM132167m2 = gt0.m132167m(this.f26637a, property, 0L, 200L, xjgVar, f26635C, i2);
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132170p(this.f26638b, "alpha", 0L, 100L, xjgVar, 1.0f, 0.0f), gt0.m132170p(this.f26641e, "alpha", 0L, 100L, xjgVar, 1.0f, 0.0f), gt0.m132170p(this.f26642f, "alpha", 0L, 100L, xjgVar, 1.0f, 0.0f));
        arrayList.add(animatorM132167m);
        arrayList.add(animatorM132180z);
        arrayList.add(animatorM132167m2);
        arrayList.add(animatorM132180z2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.m82486a(this.f26661y)) {
            this.f26661y.removeAllListeners();
            this.f26661y.cancel();
        }
        Animator animatorM132180z3 = gt0.m132180z(animatorArr);
        this.f26661y = animatorM132180z3;
        animatorM132180z3.addListener(new C8332b());
        this.f26661y.start();
    }

    /* JADX INFO: renamed from: m */
    public void m43523m() {
        xjg xjgVar = new xjg();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f26645i;
        Property<View, Integer> property = f26636D;
        int i = f26633A;
        Animator animatorM132167m = gt0.m132167m(frameLayout, property, 0L, 200L, xjgVar, i, f26634B);
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f26648l, "alpha", 0L, 200L, xjgVar, 1.0f, 0.0f), gt0.m132170p(this.f26646j, "alpha", 0L, 200L, xjgVar, 0.0f, 1.0f));
        Animator animatorM132167m2 = gt0.m132167m(this.f26637a, property, 0L, 200L, xjgVar, i, f26635C);
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132170p(this.f26638b, "alpha", 150L, 100L, xjgVar, 0.0f, 1.0f), gt0.m132170p(this.f26641e, "alpha", 150L, 100L, xjgVar, 0.0f, 1.0f), gt0.m132170p(this.f26642f, "alpha", 150L, 100L, xjgVar, 0.0f, 1.0f));
        arrayList.add(animatorM132167m);
        arrayList.add(animatorM132180z);
        arrayList.add(animatorM132167m2);
        arrayList.add(animatorM132180z2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.m82486a(this.f26660x)) {
            this.f26660x.removeAllListeners();
            this.f26660x.cancel();
        }
        Animator animatorM132180z3 = gt0.m132180z(animatorArr);
        this.f26660x = animatorM132180z3;
        animatorM132180z3.addListener(new C8333c());
        this.f26660x.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m43524n() {
        if (bnl0.m105529O0(this.f26653q)) {
            h7c0.m133769a().m133770b();
        }
        bnl0.m105524M(this.f26653q, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m43525o() {
        return m43527q() || m43526p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f26662z);
        if (m43526p()) {
            this.f26661y.cancel();
        }
        if (m43527q()) {
            this.f26660x.cancel();
        }
        m43536z();
        m43535y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43521k(this);
        bnl0.m105524M(this.f26640d, true);
        bnl0.m105524M(this.f26644h, true);
        bnl0.m105524M(this.f26639c, false);
        bnl0.m105524M(this.f26643g, false);
        zll0.m220293b(this.f26649m, qa00.f156322i);
        Context context = getContext();
        if (NullChecker.m82486a(context)) {
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(false).into(this.f26640d);
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(false).into(this.f26644h);
        }
        if (gra.m131778z()) {
            int i = qa00.f156309V;
            bnl0.m105507D0(i, this);
            bnl0.m105507D0(i, this.f26649m);
            bnl0.m105507D0(i, this.f26648l);
            bnl0.m105507D0(i, this.f26646j);
            bnl0.m105507D0(i, this.f26645i);
            bnl0.m105507D0(i, this.f26637a);
            this.f26647k.setImageResource(dbc0.f86058Ch);
            this.f26637a.setBackgroundResource(dbc0.f86090Dh);
            this.f26645i.setBackgroundResource(dbc0.f86026Bh);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m43526p() {
        return NullChecker.m82486a(this.f26661y) && this.f26661y.isRunning();
    }

    /* JADX INFO: renamed from: q */
    public boolean m43527q() {
        return NullChecker.m82486a(this.f26660x) && this.f26660x.isRunning();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m43529s(Act act, Long l2) {
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(true).repeatCount(1).into(this.f26640d);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(true).repeatCount(1).into(this.f26644h);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m43530t(Act act, View view) {
        if (m43525o()) {
            return;
        }
        m43524n();
        m43536z();
        if (spl0.m187364P()) {
            i4g0.m138523u("e_quickchat_button", OMSDialogPositon.p_messages_view, pf60.m172085a("remainingtimes", Integer.valueOf(C8772a.m51429b0())));
            r3c0.m179592n(act, "text_quick_chat", "messages_view_quickchat_entry");
        } else {
            i4g0.m138520r("e_quickchat_entrance_message", OMSDialogPositon.p_messages_view);
            m43523m();
            l51.m152888H(act, this.f26662z, 10000L);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m43531u(View view) {
        if (m43525o()) {
            return;
        }
        m43528r();
    }

    /* JADX INFO: renamed from: v */
    public final void m43532v(final Act act) {
        psd0.m173633z(this.f26657u);
        this.f26657u = act.duringCreated(C22421c.interval(0L, 6L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.n7c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140592a.m43529s(act, (Long) obj);
            }
        }, new y20() { // from class: l.o7c0
            @Override // p153l.y20
            public final void call(Object obj) {
                QuickchatConversationsEntryView.m43517g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m43533w() {
        bnl0.m105524M(this.f26637a, false);
        bnl0.m105524M(this.f26648l, true);
        bnl0.m105524M(this.f26646j, false);
        this.f26648l.setAlpha(1.0f);
        bnl0.m105505C0(this.f26645i, f26633A);
    }

    /* JADX INFO: renamed from: x */
    public void m43534x() {
        bnl0.m105524M(this.f26637a, true);
        bnl0.m105524M(this.f26648l, false);
        bnl0.m105524M(this.f26646j, true);
        this.f26646j.setAlpha(1.0f);
        this.f26638b.setAlpha(1.0f);
        this.f26641e.setAlpha(1.0f);
        this.f26642f.setAlpha(1.0f);
        bnl0.m105505C0(this.f26645i, f26634B);
    }

    /* JADX INFO: renamed from: y */
    public final void m43535y() {
        psd0.m173633z(this.f26657u);
        this.f26640d.stopAnimation(false);
        this.f26644h.stopAnimation(false);
    }

    /* JADX INFO: renamed from: z */
    public final void m43536z() {
        psd0.m173633z(this.f26658v);
        bnl0.m105524M(this.f26649m, false);
        this.f26649m.stopAnimation(false);
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26654r = Color.parseColor("#FFC683");
        this.f26655s = Color.parseColor("#FF9D73");
        this.f26656t = new HashMap(24);
        this.f26662z = new Runnable() { // from class: l.i7c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113251a.m43528r();
            }
        };
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26654r = Color.parseColor("#FFC683");
        this.f26655s = Color.parseColor("#FF9D73");
        this.f26656t = new HashMap(24);
        this.f26662z = new Runnable() { // from class: l.i7c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113251a.m43528r();
            }
        };
    }
}
