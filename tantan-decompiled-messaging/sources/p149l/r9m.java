package p149l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import p133rx.subjects.C22393b;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class r9m {

    /* JADX INFO: renamed from: f */
    public static long f158386f = 604800000;

    /* JADX INFO: renamed from: g */
    public static long f158387g = 3600000;

    /* JADX INFO: renamed from: h */
    public static volatile r9m f158388h;

    /* JADX INFO: renamed from: i */
    public static hpd0 f158389i;

    /* JADX INFO: renamed from: j */
    public static hpd0 f158390j;

    /* JADX INFO: renamed from: a */
    public final C22393b<roj0> f158391a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public List<String> f158392b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f158393c = false;

    /* JADX INFO: renamed from: d */
    public String f158394d = "";

    /* JADX INFO: renamed from: e */
    public boolean f158395e = false;

    static {
        Boolean bool = Boolean.FALSE;
        f158389i = new hpd0("iceBreakExpEnable", bool);
        f158390j = new hpd0("iceBreakDlgShowIgnoreInterval", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178379a(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m178383e(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.f154691G.m102331L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f17545c.f19588N0.m31965i3(user, CoreModule.m29935P().m94658i().mo158323W(user))) {
            xdl0.m208344M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m178387i(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m178389k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m178391m(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.f154691G.m102331L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f17545c.f19588N0.m31965i3(user, CoreModule.m29935P().m94658i().mo158323W(user))) {
            xdl0.m208344M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m178393o(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.f154691G.m102331L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f17545c.f19588N0.m31965i3(user, CoreModule.m29935P().m94658i().mo158323W(user))) {
            xdl0.m208344M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m178394p(boolean z) {
        return String.format(mu5.f135733a.get().contains("staging") ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r */
    public static r9m m178395r() {
        if (f158388h == null) {
            synchronized (r9m.class) {
                try {
                    if (f158388h == null) {
                        f158388h = new r9m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f158388h;
    }

    /* JADX INFO: renamed from: A */
    public void m178396A(String str, Message message) {
        CoreModule.f17545c.f19642f0.m32623Dn(str, message, null);
    }

    /* JADX INFO: renamed from: B */
    public void m178397B(List<String> list) {
        this.f158392b = list;
    }

    /* JADX INFO: renamed from: C */
    public void m178398C(boolean z) {
        this.f158393c = z;
    }

    /* JADX INFO: renamed from: D */
    public void m178399D(String str) {
        this.f158394d = str;
    }

    /* JADX INFO: renamed from: E */
    public void m178400E(boolean z) {
        this.f158395e = z;
    }

    /* JADX INFO: renamed from: F */
    public void m178401F(final Act act) {
        if (vwb.m200296J(this.f158392b) || this.f158392b.size() < 3) {
            return;
        }
        final long jM155944o = mqi0.m155944o();
        final dd80 dd80VarM110960O = act.newDialog().m110962Q(l6c0.f126291F0).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.c9m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f79950a.m178405u(dialogInterface);
            }
        }).m110960O();
        dd80VarM110960O.show();
        zvf0.m220368A("e_batch_icebreak", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", this.f158392b.get(0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f158392b.get(1) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f158392b.get(2)));
        if (CoreModule.f17545c.f19639e0.f149384h3.get().intValue() == 1) {
            CoreModule.f17545c.f19639e0.f149384h3.put(2);
            CoreModule.f17545c.f19639e0.f149392i3.put(Long.valueOf(f158386f + jM155944o));
        } else {
            CoreModule.f17545c.f19639e0.f149384h3.put(1);
            CoreModule.f17545c.f19639e0.f149392i3.put(Long.valueOf((((long) y19.m212146F()) * f158387g) + jM155944o));
        }
        View viewM110906L = dd80VarM110960O.m110906L();
        final VDraweeView vDraweeView = (VDraweeView) viewM110906L.findViewById(y4c0.f196194p1);
        final VImage vImage = (VImage) viewM110906L.findViewById(y4c0.f196006M2);
        VButton vButton = (VButton) viewM110906L.findViewById(y4c0.f195970G2);
        VButton vButton2 = (VButton) viewM110906L.findViewById(y4c0.f196210r3);
        vButton2.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.n9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110960O.dismiss();
            }
        });
        xdl0.m208329E0(vButton2, new View.OnClickListener() { // from class: l.o9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142722a.m178407w(dd80VarM110960O, jM155944o, view);
            }
        });
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.p9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147775a.m178408x(act, view);
            }
        });
        act.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f158392b.get(0))).filter(new w9j() { // from class: l.q9m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81303a(user) && !vwb.m200296J(user.pictures));
            }
        }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.d9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178383e(vDraweeView, vImage, (User) obj);
            }
        }, new e30() { // from class: l.e9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178387i((Throwable) obj);
            }
        }));
        final VDraweeView vDraweeView2 = (VDraweeView) viewM110906L.findViewById(y4c0.f196201q1);
        final VImage vImage2 = (VImage) viewM110906L.findViewById(y4c0.f196012N2);
        xdl0.m208329E0(vDraweeView2, new View.OnClickListener() { // from class: l.f9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96495a.m178409y(act, view);
            }
        });
        act.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f158392b.get(1))).filter(new w9j() { // from class: l.g9m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81303a(user) && !vwb.m200296J(user.pictures));
            }
        }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.h9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178393o(vDraweeView2, vImage2, (User) obj);
            }
        }, new e30() { // from class: l.i9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178379a((Throwable) obj);
            }
        }));
        final VDraweeView vDraweeView3 = (VDraweeView) viewM110906L.findViewById(y4c0.f196208r1);
        final VImage vImage3 = (VImage) viewM110906L.findViewById(y4c0.f196018O2);
        xdl0.m208329E0(vDraweeView3, new View.OnClickListener() { // from class: l.j9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116937a.m178406v(act, view);
            }
        });
        act.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f158392b.get(2))).filter(new w9j() { // from class: l.k9m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81303a(user) && !vwb.m200296J(user.pictures));
            }
        }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.l9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178391m(vDraweeView3, vImage3, (User) obj);
            }
        }, new e30() { // from class: l.m9m
            @Override // p149l.e30
            public final void call(Object obj) {
                r9m.m178389k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public boolean m178402q(long j) {
        return !this.f158393c && !vwb.m200296J(this.f158392b) && this.f158392b.size() >= 3 && j > CoreModule.f17545c.f19639e0.f149392i3.get().longValue();
    }

    /* JADX INFO: renamed from: s */
    public String m178403s() {
        return this.f158394d;
    }

    /* JADX INFO: renamed from: t */
    public final List<Message> m178404t() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Message messageNew_ = Message.new_();
        messageNew_.value = "hello在吗";
        messageNew_.messageType = MessageType.get("text");
        arrayList2.add(messageNew_);
        Message messageNew_2 = Message.new_();
        messageNew_2.value = "你好";
        messageNew_2.messageType = MessageType.get("text");
        arrayList2.add(messageNew_2);
        Message messageNew_3 = Message.new_();
        messageNew_3.value = "hi";
        messageNew_3.messageType = MessageType.get("text");
        arrayList2.add(messageNew_3);
        Message message = new Message();
        message.sticker = "1";
        message.messageType = MessageType.get("sticker");
        arrayList2.add(message);
        Message messageNew_4 = Message.new_();
        messageNew_4.value = "嗨";
        messageNew_4.messageType = MessageType.get("text");
        arrayList2.add(messageNew_4);
        Message messageNew_5 = Message.new_();
        messageNew_5.value = "[微笑]";
        messageNew_5.messageType = MessageType.get("text");
        arrayList2.add(messageNew_5);
        Message messageNew_6 = Message.new_();
        messageNew_6.value = "认识一下吗";
        messageNew_6.messageType = MessageType.get("text");
        arrayList2.add(messageNew_6);
        Random random = new Random();
        int iNextInt = random.nextInt(7);
        arrayList.add((Message) arrayList2.get(iNextInt));
        arrayList2.remove(iNextInt);
        int iNextInt2 = random.nextInt(6);
        arrayList.add((Message) arrayList2.get(iNextInt2));
        arrayList2.remove(iNextInt2);
        int iNextInt3 = random.nextInt(5);
        arrayList.add((Message) arrayList2.get(iNextInt3));
        arrayList2.remove(iNextInt3);
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m178405u(DialogInterface dialogInterface) {
        this.f158392b.clear();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m178406v(Act act, View view) {
        if (vwb.m200296J(this.f158392b) || this.f158392b.size() < 3) {
            return;
        }
        zvf0.m220399u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", this.f158392b.get(2)));
        act.startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act, this.f158392b.get(2), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m178407w(dd80 dd80Var, long j, View view) {
        if (vwb.m200296J(this.f158392b) || this.f158392b.size() < 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f158392b.get(0));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f158392b.get(1));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f158392b.get(2));
        zvf0.m220399u("e_batch_icebreak", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", sb.toString()));
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!ConnectivityReceiver.m81284g()) {
            lsi0.m151578h(R$string.f20719B2);
            return;
        }
        if (userM169527p9.isJailedOrRestrict() || userM169527p9.isBanned() || userM169527p9.isBannedNew()) {
            dd80Var.dismiss();
            ura.m195053e().m195057d().mo33765Vc();
            return;
        }
        CoreModule.f17545c.f19639e0.f149392i3.put(Long.valueOf(j + (((long) y19.m212146F()) * f158387g)));
        CoreModule.f17545c.f19639e0.f149384h3.put(0);
        List<Message> listM178404t = m178404t();
        for (int i = 0; i < 3; i++) {
            String str = this.f158392b.get(i);
            if (!TextUtils.isEmpty(str)) {
                m178396A(str, listM178404t.get(i));
            }
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m178408x(Act act, View view) {
        if (vwb.m200296J(this.f158392b) || this.f158392b.size() < 3) {
            return;
        }
        zvf0.m220399u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", this.f158392b.get(0)));
        act.startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act, this.f158392b.get(0), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m178409y(Act act, View view) {
        if (vwb.m200296J(this.f158392b) || this.f158392b.size() < 3) {
            return;
        }
        zvf0.m220399u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_uid", this.f158392b.get(1)));
        act.startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act, this.f158392b.get(1), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: z */
    public boolean m178410z() {
        return this.f158395e;
    }
}
