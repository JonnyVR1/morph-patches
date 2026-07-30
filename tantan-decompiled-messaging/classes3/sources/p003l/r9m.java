package p003l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import l.dd80;
import l.hpd0;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.mu5;
import l.qib0;
import l.roj0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zvf0;
import org.spongycastle.i18n.TextBundle;
import p014rx.subjects.C1186b;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class r9m {

    /* JADX INFO: renamed from: f */
    public static long f6810f = 604800000;

    /* JADX INFO: renamed from: g */
    public static long f6811g = 3600000;

    /* JADX INFO: renamed from: h */
    public static volatile r9m f6812h;

    /* JADX INFO: renamed from: i */
    public static hpd0 f6813i;

    /* JADX INFO: renamed from: j */
    public static hpd0 f6814j;

    /* JADX INFO: renamed from: a */
    public final C1186b<roj0> f6815a = C1186b.m9978b();

    /* JADX INFO: renamed from: b */
    public List<String> f6816b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f6817c = false;

    /* JADX INFO: renamed from: d */
    public String f6818d = "";

    /* JADX INFO: renamed from: e */
    public boolean f6819e = false;

    static {
        Boolean bool = Boolean.FALSE;
        f6813i = new hpd0("iceBreakExpEnable", bool);
        f6814j = new hpd0("iceBreakDlgShowIgnoreInterval", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7133a(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7137e(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.G.L0(vDraweeView, ((Media) user.picture(0)).url);
        if (CoreModule.c.N0.i3(user, CoreModule.P().i().W(user))) {
            xdl0.M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m7141i(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m7143k(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m7145m(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.G.L0(vDraweeView, ((Media) user.picture(0)).url);
        if (CoreModule.c.N0.i3(user, CoreModule.P().i().W(user))) {
            xdl0.M(vImage, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m7147o(VDraweeView vDraweeView, VImage vImage, User user) {
        qib0.G.L0(vDraweeView, ((Media) user.picture(0)).url);
        if (CoreModule.c.N0.i3(user, CoreModule.P().i().W(user))) {
            xdl0.M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m7148p(boolean z) {
        return String.format(((String) mu5.a.get()).contains("staging") ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r */
    public static r9m m7149r() {
        if (f6812h == null) {
            synchronized (r9m.class) {
                try {
                    if (f6812h == null) {
                        f6812h = new r9m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6812h;
    }

    /* JADX INFO: renamed from: A */
    public void m7150A(String str, Message message) {
        CoreModule.c.f0.Dn(str, message, (Sticker) null);
    }

    /* JADX INFO: renamed from: B */
    public void m7151B(List<String> list) {
        this.f6816b = list;
    }

    /* JADX INFO: renamed from: C */
    public void m7152C(boolean z) {
        this.f6817c = z;
    }

    /* JADX INFO: renamed from: D */
    public void m7153D(String str) {
        this.f6818d = str;
    }

    /* JADX INFO: renamed from: E */
    public void m7154E(boolean z) {
        this.f6819e = z;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, v.VDraweeView] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View, v.VDraweeView] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, v.VDraweeView] */
    /* JADX INFO: renamed from: F */
    public void m7155F(final Act act) {
        if (vwb.J(this.f6816b) || this.f6816b.size() < 3) {
            return;
        }
        final long jO = mqi0.o();
        final dd80 dd80VarO = act.newDialog().Q(l6c0.F0).M(false).n0(new DialogInterface.OnDismissListener() { // from class: l.c9m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f2592a.m7159u(dialogInterface);
            }
        }).O();
        dd80VarO.show();
        zvf0.A("e_batch_icebreak", "p_chat_view", new j760[]{vwb.Y("other_uid", this.f6816b.get(0) + " " + this.f6816b.get(1) + " " + this.f6816b.get(2))});
        if (((Integer) CoreModule.c.e0.h3.get()).intValue() == 1) {
            CoreModule.c.e0.h3.put(2);
            CoreModule.c.e0.i3.put(Long.valueOf(f6810f + jO));
        } else {
            CoreModule.c.e0.h3.put(1);
            CoreModule.c.e0.i3.put(Long.valueOf((((long) y19.F()) * f6811g) + jO));
        }
        View viewL = dd80VarO.L();
        final ?? r5 = (VDraweeView) viewL.findViewById(y4c0.p1);
        final VImage vImage = (VImage) viewL.findViewById(y4c0.M2);
        VButton vButton = (VButton) viewL.findViewById(y4c0.G2);
        VButton vButton2 = (VButton) viewL.findViewById(y4c0.r3);
        vButton2.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.E0(vButton, new View.OnClickListener() { // from class: l.n9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarO.dismiss();
            }
        });
        xdl0.E0(vButton2, new View.OnClickListener() { // from class: l.o9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6069a.m7161w(dd80VarO, jO, view);
            }
        });
        xdl0.E0((View) r5, new View.OnClickListener() { // from class: l.p9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6333a.m7162x(act, view);
            }
        });
        act.duringCreated(CoreModule.c.e0.Ka(this.f6816b.get(0))).filter(new w9j() { // from class: l.q9m
            @Override // p003l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.a(user) && !vwb.J(user.pictures));
            }
        }).first().subscribe((m250) mkd0.H(new e30() { // from class: l.d9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7137e(r5, vImage, (User) obj);
            }
        }, new e30() { // from class: l.e9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7141i((Throwable) obj);
            }
        }));
        final ?? r0 = (VDraweeView) viewL.findViewById(y4c0.q1);
        final VImage vImage2 = (VImage) viewL.findViewById(y4c0.N2);
        xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.f9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3469a.m7163y(act, view);
            }
        });
        act.duringCreated(CoreModule.c.e0.Ka(this.f6816b.get(1))).filter(new w9j() { // from class: l.g9m
            @Override // p003l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.a(user) && !vwb.J(user.pictures));
            }
        }).first().subscribe((m250) mkd0.H(new e30() { // from class: l.h9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7147o(r0, vImage2, (User) obj);
            }
        }, new e30() { // from class: l.i9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7133a((Throwable) obj);
            }
        }));
        final ?? r1 = (VDraweeView) viewL.findViewById(y4c0.r1);
        final VImage vImage3 = (VImage) viewL.findViewById(y4c0.O2);
        xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.j9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4595a.m7160v(act, view);
            }
        });
        act.duringCreated(CoreModule.c.e0.Ka(this.f6816b.get(2))).filter(new w9j() { // from class: l.k9m
            @Override // p003l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.a(user) && !vwb.J(user.pictures));
            }
        }).first().subscribe((m250) mkd0.H(new e30() { // from class: l.l9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7145m(r1, vImage3, (User) obj);
            }
        }, new e30() { // from class: l.m9m
            @Override // p003l.e30
            public final void call(Object obj) {
                r9m.m7143k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public boolean m7156q(long j) {
        return !this.f6817c && !vwb.J(this.f6816b) && this.f6816b.size() >= 3 && j > ((Long) CoreModule.c.e0.i3.get()).longValue();
    }

    /* JADX INFO: renamed from: s */
    public String m7157s() {
        return this.f6818d;
    }

    /* JADX INFO: renamed from: t */
    public final List<Message> m7158t() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Message messageNew_ = Message.new_();
        messageNew_.value = "hello在吗";
        messageNew_.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        arrayList2.add(messageNew_);
        Message messageNew_2 = Message.new_();
        messageNew_2.value = "你好";
        messageNew_2.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        arrayList2.add(messageNew_2);
        Message messageNew_3 = Message.new_();
        messageNew_3.value = "hi";
        messageNew_3.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        arrayList2.add(messageNew_3);
        Message message = new Message();
        message.sticker = "1";
        message.messageType = MessageType.get("sticker");
        arrayList2.add(message);
        Message messageNew_4 = Message.new_();
        messageNew_4.value = "嗨";
        messageNew_4.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        arrayList2.add(messageNew_4);
        Message messageNew_5 = Message.new_();
        messageNew_5.value = "[微笑]";
        messageNew_5.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        arrayList2.add(messageNew_5);
        Message messageNew_6 = Message.new_();
        messageNew_6.value = "认识一下吗";
        messageNew_6.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
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
    public final /* synthetic */ void m7159u(DialogInterface dialogInterface) {
        this.f6816b.clear();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7160v(Act act, View view) {
        if (vwb.J(this.f6816b) || this.f6816b.size() < 3) {
            return;
        }
        zvf0.u("e_batch_icebreak_feature", "p_chat_view", new j760[]{vwb.Y("other_uid", this.f6816b.get(2))});
        act.startActivityForResult(CoreModule.P().i().M1(act, this.f6816b.get(2), "message_ice_break_dialog", false), 16);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7161w(dd80 dd80Var, long j, View view) {
        if (vwb.J(this.f6816b) || this.f6816b.size() < 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6816b.get(0));
        sb.append(" ");
        sb.append(this.f6816b.get(1));
        sb.append(" ");
        sb.append(this.f6816b.get(2));
        zvf0.u("e_batch_icebreak", "p_chat_view", new j760[]{vwb.Y("other_uid", sb.toString())});
        User userP9 = CoreModule.c.e0.p9();
        if (!ConnectivityReceiver.g()) {
            lsi0.h(R.string.B2);
            return;
        }
        if (userP9.isJailedOrRestrict() || userP9.isBanned() || userP9.isBannedNew()) {
            dd80Var.dismiss();
            ura.e().d().Vc();
            return;
        }
        CoreModule.c.e0.i3.put(Long.valueOf(j + (((long) y19.F()) * f6811g)));
        CoreModule.c.e0.h3.put(0);
        List<Message> listM7158t = m7158t();
        for (int i = 0; i < 3; i++) {
            String str = this.f6816b.get(i);
            if (!TextUtils.isEmpty(str)) {
                m7150A(str, listM7158t.get(i));
            }
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7162x(Act act, View view) {
        if (vwb.J(this.f6816b) || this.f6816b.size() < 3) {
            return;
        }
        zvf0.u("e_batch_icebreak_feature", "p_chat_view", new j760[]{vwb.Y("other_uid", this.f6816b.get(0))});
        act.startActivityForResult(CoreModule.P().i().M1(act, this.f6816b.get(0), "message_ice_break_dialog", false), 16);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7163y(Act act, View view) {
        if (vwb.J(this.f6816b) || this.f6816b.size() < 3) {
            return;
        }
        zvf0.u("e_batch_icebreak_feature", "p_chat_view", new j760[]{vwb.Y("other_uid", this.f6816b.get(1))});
        act.startActivityForResult(CoreModule.P().i().M1(act, this.f6816b.get(1), "message_ice_break_dialog", false), 16);
    }

    /* JADX INFO: renamed from: z */
    public boolean m7164z() {
        return this.f6819e;
    }
}
