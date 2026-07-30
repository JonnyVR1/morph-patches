package com.p046p1.mobile.putong.core.newui.messages.quickchat;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.iliveroom.TXILiveRoomDefine;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VLinear;
import p149l.bt0;
import p149l.c4g0;
import p149l.dzb0;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.jig;
import p149l.jo0;
import p149l.lzb0;
import p149l.mkd0;
import p149l.nvb0;
import p149l.ogl0;
import p149l.sqb0;
import p149l.t100;
import p149l.upa;
import p149l.vcl0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatConversationsEntryView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static final int f25891A = t100.f167231F;

    /* JADX INFO: renamed from: B */
    public static final int f25892B = t100.f167276y;

    /* JADX INFO: renamed from: C */
    public static final int f25893C = t100.f167247V;

    /* JADX INFO: renamed from: D */
    public static final Property<View, Integer> f25894D = new C8180a(Integer.TYPE, "viewHeight");

    /* JADX INFO: renamed from: a */
    public VLinear f25895a;

    /* JADX INFO: renamed from: b */
    public VLinear f25896b;

    /* JADX INFO: renamed from: c */
    public ImageView f25897c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f25898d;

    /* JADX INFO: renamed from: e */
    public View f25899e;

    /* JADX INFO: renamed from: f */
    public VLinear f25900f;

    /* JADX INFO: renamed from: g */
    public ImageView f25901g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f25902h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f25903i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f25904j;

    /* JADX INFO: renamed from: k */
    public ImageView f25905k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f25906l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f25907m;

    /* JADX INFO: renamed from: n */
    public QuickchatConversationsEntryAvatarView f25908n;

    /* JADX INFO: renamed from: o */
    public TextView f25909o;

    /* JADX INFO: renamed from: p */
    public TextView f25910p;

    /* JADX INFO: renamed from: q */
    public View f25911q;

    /* JADX INFO: renamed from: r */
    public final int f25912r;

    /* JADX INFO: renamed from: s */
    public final int f25913s;

    /* JADX INFO: renamed from: t */
    public Map<Integer, j760<Integer, Integer>> f25914t;

    /* JADX INFO: renamed from: u */
    public c4g0 f25915u;

    /* JADX INFO: renamed from: v */
    public c4g0 f25916v;

    /* JADX INFO: renamed from: w */
    public Act f25917w;

    /* JADX INFO: renamed from: x */
    public Animator f25918x;

    /* JADX INFO: renamed from: y */
    public Animator f25919y;

    /* JADX INFO: renamed from: z */
    public Runnable f25920z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$a */
    public class C8180a extends Property<View, Integer> {
        public C8180a(Class cls, String str) {
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
    public class C8181b implements Animator.AnimatorListener {
        public C8181b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m42522w();
            QuickchatConversationsEntryView.this.m42524y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25895a, false);
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25904j, false);
            QuickchatConversationsEntryView.this.m42524y();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25906l, true);
            QuickchatConversationsEntryView.this.f25906l.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView$c */
    public class C8182c implements Animator.AnimatorListener {
        public C8182c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            QuickchatConversationsEntryView.this.m42523x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25906l, false);
            QuickchatConversationsEntryView quickchatConversationsEntryView = QuickchatConversationsEntryView.this;
            quickchatConversationsEntryView.m42521v(quickchatConversationsEntryView.f25917w);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            QuickchatConversationsEntryView.this.f25896b.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f25899e.setAlpha(0.0f);
            QuickchatConversationsEntryView.this.f25900f.setAlpha(0.0f);
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25895a, true);
            xdl0.m208344M(QuickchatConversationsEntryView.this.f25904j, true);
            QuickchatConversationsEntryView.this.f25904j.setAlpha(0.0f);
        }
    }

    public QuickchatConversationsEntryView(@NonNull Context context) {
        super(context);
        this.f25912r = Color.parseColor("#FFC683");
        this.f25913s = Color.parseColor("#FF9D73");
        this.f25914t = new HashMap(24);
        this.f25920z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93883a.m42517r();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42500a(Act act, View view) {
        zvf0.m220399u("e_voicechat_button", OMSDialogPositon.p_messages_view, j760.m140076a("remainingtimes", Integer.valueOf(sqb0.m185513i0())), j760.m140076a("voicechat_results", sqb0.m185498O().getVoicechat_results()));
        act.startActivity(DropDownAct.m54448b2(act, "voice_quick_chat", "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m42503d(Act act, View view) {
        zvf0.m220399u("e_quickchat_button", OMSDialogPositon.p_messages_view, j760.m140076a("remainingtimes", Integer.valueOf(C8609a.m50246b0())));
        act.startActivity(DropDownAct.m54448b2(act, UnlockConversationType.quick_chat, "messages_view_quickchat_entry", Boolean.FALSE));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m42506g(Throwable th) {
    }

    private ArrayList<String> getheadUrlList() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (zz6.m221004u0()) {
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189953Zi);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190017bj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190049cj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190081dj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190112ej);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190144fj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190176gj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190208hj);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f190239ij);
            arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189985aj);
            return arrayList;
        }
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189643Pi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189705Ri);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189736Si);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189767Ti);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189798Ui);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189829Vi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189860Wi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189891Xi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189922Yi);
        arrayList.add("res://" + getContext().getPackageName() + "/" + x2c0.f189674Qi);
        return arrayList;
    }

    private void setClick(final Act act) {
        xdl0.m208329E0(this.f25906l, new View.OnClickListener() { // from class: l.fzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99946a.m42519t(act, view);
            }
        });
        xdl0.m208329E0(this.f25904j, new View.OnClickListener() { // from class: l.gzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105116a.m42520u(view);
            }
        });
        xdl0.m208329E0(this.f25896b, new View.OnClickListener() { // from class: l.hzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m42500a(act, view);
            }
        });
        xdl0.m208329E0(this.f25900f, new View.OnClickListener() { // from class: l.izb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickchatConversationsEntryView.m42503d(act, view);
            }
        });
    }

    public int getCurrentOnlineUserCountWithTime() {
        if (this.f25914t.size() <= 0) {
            this.f25914t.put(0, j760.m140076a(8762, 11014));
            this.f25914t.put(1, j760.m140076a(5528, 9765));
            this.f25914t.put(2, j760.m140076a(4669, 6161));
            this.f25914t.put(3, j760.m140076a(3211, 5203));
            this.f25914t.put(4, j760.m140076a(2881, 3578));
            this.f25914t.put(5, j760.m140076a(4249, 6004));
            this.f25914t.put(6, j760.m140076a(5388, 8066));
            this.f25914t.put(7, j760.m140076a(7238, 10093));
            this.f25914t.put(8, j760.m140076a(8347, 11238));
            this.f25914t.put(9, j760.m140076a(9294, 12185));
            this.f25914t.put(10, j760.m140076a(11164, Integer.valueOf(CommandMessage.COMMAND_STATISTIC)));
            this.f25914t.put(11, j760.m140076a(12261, 12837));
            this.f25914t.put(12, j760.m140076a(10707, 12454));
            this.f25914t.put(13, j760.m140076a(11410, 12639));
            this.f25914t.put(14, j760.m140076a(11444, 12759));
            this.f25914t.put(15, j760.m140076a(Integer.valueOf(TXILiveRoomDefine.TXILiveRoomErrorMusicNotSupportSampleRate), 12570));
            this.f25914t.put(16, j760.m140076a(11516, 12914));
            this.f25914t.put(17, j760.m140076a(10781, 12353));
            this.f25914t.put(18, j760.m140076a(11317, 13007));
            this.f25914t.put(19, j760.m140076a(11917, 14604));
            this.f25914t.put(20, j760.m140076a(13380, 15737));
            this.f25914t.put(21, j760.m140076a(14238, 15995));
            this.f25914t.put(22, j760.m140076a(13014, 13793));
            this.f25914t.put(23, j760.m140076a(11781, 12583));
        }
        j760<Integer, Integer> j760Var = this.f25914t.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (j760Var.f116565b.intValue() - j760Var.f116564a.intValue())) * Math.random()) + ((double) j760Var.f116564a.intValue()));
    }

    /* JADX INFO: renamed from: k */
    public final void m42510k(View view) {
        lzb0.m152343a(this, view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m42517r() {
        e51.m114745J(this.f25920z);
        jig jigVar = new jig();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f25903i;
        Property<View, Integer> property = f25894D;
        int i = f25892B;
        int i2 = f25891A;
        Animator animatorM103740m = bt0.m103740m(frameLayout, property, 0L, 200L, jigVar, i, i2);
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f25906l, "alpha", 0L, 200L, jigVar, 0.0f, 1.0f), bt0.m103743p(this.f25904j, "alpha", 0L, 200L, jigVar, 1.0f, 0.0f));
        Animator animatorM103740m2 = bt0.m103740m(this.f25895a, property, 0L, 200L, jigVar, f25893C, i2);
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103743p(this.f25896b, "alpha", 0L, 100L, jigVar, 1.0f, 0.0f), bt0.m103743p(this.f25899e, "alpha", 0L, 100L, jigVar, 1.0f, 0.0f), bt0.m103743p(this.f25900f, "alpha", 0L, 100L, jigVar, 1.0f, 0.0f));
        arrayList.add(animatorM103740m);
        arrayList.add(animatorM103753z);
        arrayList.add(animatorM103740m2);
        arrayList.add(animatorM103753z2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.m81303a(this.f25919y)) {
            this.f25919y.removeAllListeners();
            this.f25919y.cancel();
        }
        Animator animatorM103753z3 = bt0.m103753z(animatorArr);
        this.f25919y = animatorM103753z3;
        animatorM103753z3.addListener(new C8181b());
        this.f25919y.start();
    }

    /* JADX INFO: renamed from: m */
    public void m42512m() {
        jig jigVar = new jig();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f25903i;
        Property<View, Integer> property = f25894D;
        int i = f25891A;
        Animator animatorM103740m = bt0.m103740m(frameLayout, property, 0L, 200L, jigVar, i, f25892B);
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f25906l, "alpha", 0L, 200L, jigVar, 1.0f, 0.0f), bt0.m103743p(this.f25904j, "alpha", 0L, 200L, jigVar, 0.0f, 1.0f));
        Animator animatorM103740m2 = bt0.m103740m(this.f25895a, property, 0L, 200L, jigVar, i, f25893C);
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103743p(this.f25896b, "alpha", 150L, 100L, jigVar, 0.0f, 1.0f), bt0.m103743p(this.f25899e, "alpha", 150L, 100L, jigVar, 0.0f, 1.0f), bt0.m103743p(this.f25900f, "alpha", 150L, 100L, jigVar, 0.0f, 1.0f));
        arrayList.add(animatorM103740m);
        arrayList.add(animatorM103753z);
        arrayList.add(animatorM103740m2);
        arrayList.add(animatorM103753z2);
        Animator[] animatorArr = new Animator[4];
        arrayList.toArray(animatorArr);
        if (NullChecker.m81303a(this.f25918x)) {
            this.f25918x.removeAllListeners();
            this.f25918x.cancel();
        }
        Animator animatorM103753z3 = bt0.m103753z(animatorArr);
        this.f25918x = animatorM103753z3;
        animatorM103753z3.addListener(new C8182c());
        this.f25918x.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m42513n() {
        if (xdl0.m208349O0(this.f25911q)) {
            dzb0.m114113a().m114114b();
        }
        xdl0.m208344M(this.f25911q, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m42514o() {
        return m42516q() || m42515p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f25920z);
        if (m42515p()) {
            this.f25919y.cancel();
        }
        if (m42516q()) {
            this.f25918x.cancel();
        }
        m42525z();
        m42524y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42510k(this);
        xdl0.m208344M(this.f25898d, true);
        xdl0.m208344M(this.f25902h, true);
        xdl0.m208344M(this.f25897c, false);
        xdl0.m208344M(this.f25901g, false);
        vcl0.m197906b(this.f25907m, t100.f167260i);
        Context context = getContext();
        if (NullChecker.m81303a(context)) {
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(false).into(this.f25898d);
            SVGALoader.with(context).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(false).into(this.f25902h);
        }
        if (upa.m194847z()) {
            int i = t100.f167247V;
            xdl0.m208327D0(i, this);
            xdl0.m208327D0(i, this.f25907m);
            xdl0.m208327D0(i, this.f25906l);
            xdl0.m208327D0(i, this.f25904j);
            xdl0.m208327D0(i, this.f25903i);
            xdl0.m208327D0(i, this.f25895a);
            this.f25905k.setImageResource(x2c0.f189610Og);
            this.f25895a.setBackgroundResource(x2c0.f189641Pg);
            this.f25903i.setBackgroundResource(x2c0.f189579Ng);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m42515p() {
        return NullChecker.m81303a(this.f25919y) && this.f25919y.isRunning();
    }

    /* JADX INFO: renamed from: q */
    public boolean m42516q() {
        return NullChecker.m81303a(this.f25918x) && this.f25918x.isRunning();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m42518s(Act act, Long l2) {
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/3621d041-af6d-457c-bc73-c42f20fc005014.svga").autoPlay(true).repeatCount(1).into(this.f25898d);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/1adfdbcd-f286-4789-9e0e-e727c27e240414.svga").autoPlay(true).repeatCount(1).into(this.f25902h);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m42519t(Act act, View view) {
        if (m42514o()) {
            return;
        }
        m42513n();
        m42525z();
        if (ogl0.m164237P()) {
            zvf0.m220399u("e_quickchat_button", OMSDialogPositon.p_messages_view, j760.m140076a("remainingtimes", Integer.valueOf(C8609a.m50246b0())));
            nvb0.m161583n(act, "text_quick_chat", "messages_view_quickchat_entry");
        } else {
            zvf0.m220396r("e_quickchat_entrance_message", OMSDialogPositon.p_messages_view);
            m42512m();
            e51.m114743H(act, this.f25920z, 10000L);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m42520u(View view) {
        if (m42514o()) {
            return;
        }
        m42517r();
    }

    /* JADX INFO: renamed from: v */
    public final void m42521v(final Act act) {
        mkd0.m154992z(this.f25915u);
        this.f25915u = act.duringCreated(C22306c.interval(0L, 6L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.jzb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120370a.m42518s(act, (Long) obj);
            }
        }, new e30() { // from class: l.kzb0
            @Override // p149l.e30
            public final void call(Object obj) {
                QuickchatConversationsEntryView.m42506g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m42522w() {
        xdl0.m208344M(this.f25895a, false);
        xdl0.m208344M(this.f25906l, true);
        xdl0.m208344M(this.f25904j, false);
        this.f25906l.setAlpha(1.0f);
        xdl0.m208325C0(this.f25903i, f25891A);
    }

    /* JADX INFO: renamed from: x */
    public void m42523x() {
        xdl0.m208344M(this.f25895a, true);
        xdl0.m208344M(this.f25906l, false);
        xdl0.m208344M(this.f25904j, true);
        this.f25904j.setAlpha(1.0f);
        this.f25896b.setAlpha(1.0f);
        this.f25899e.setAlpha(1.0f);
        this.f25900f.setAlpha(1.0f);
        xdl0.m208325C0(this.f25903i, f25892B);
    }

    /* JADX INFO: renamed from: y */
    public final void m42524y() {
        mkd0.m154992z(this.f25915u);
        this.f25898d.stopAnimation(false);
        this.f25902h.stopAnimation(false);
    }

    /* JADX INFO: renamed from: z */
    public final void m42525z() {
        mkd0.m154992z(this.f25916v);
        xdl0.m208344M(this.f25907m, false);
        this.f25907m.stopAnimation(false);
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25912r = Color.parseColor("#FFC683");
        this.f25913s = Color.parseColor("#FF9D73");
        this.f25914t = new HashMap(24);
        this.f25920z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93883a.m42517r();
            }
        };
    }

    public QuickchatConversationsEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25912r = Color.parseColor("#FFC683");
        this.f25913s = Color.parseColor("#FF9D73");
        this.f25914t = new HashMap(24);
        this.f25920z = new Runnable() { // from class: l.ezb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93883a.m42517r();
            }
        };
    }
}
