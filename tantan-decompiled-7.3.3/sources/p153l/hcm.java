package p153l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import p137rx.subjects.C22508b;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class hcm {

    /* JADX INFO: renamed from: f */
    public static long f108711f = 604800000;

    /* JADX INFO: renamed from: g */
    public static long f108712g = 3600000;

    /* JADX INFO: renamed from: h */
    public static volatile hcm f108713h;

    /* JADX INFO: renamed from: i */
    public static jxd0 f108714i;

    /* JADX INFO: renamed from: j */
    public static jxd0 f108715j;

    /* JADX INFO: renamed from: a */
    public final C22508b<uxj0> f108716a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public List<String> f108717b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f108718c = false;

    /* JADX INFO: renamed from: d */
    public String f108719d = "";

    /* JADX INFO: renamed from: e */
    public boolean f108720e = false;

    static {
        Boolean bool = Boolean.FALSE;
        f108714i = new jxd0("iceBreakExpEnable", bool);
        f108715j = new jxd0("iceBreakDlgShowIgnoreInterval", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m134456a(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m134460e(VDraweeView vDraweeView, VImage vImage, User user) {
        uqb0.f180374G.m127115L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f18264c.f20330N0.m32968i3(user, CoreModule.m30933P().m143412i().mo180415W(user))) {
            bnl0.m105524M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m134464i(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m134466k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m134468m(VDraweeView vDraweeView, VImage vImage, User user) {
        uqb0.f180374G.m127115L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f18264c.f20330N0.m32968i3(user, CoreModule.m30933P().m143412i().mo180415W(user))) {
            bnl0.m105524M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m134470o(VDraweeView vDraweeView, VImage vImage, User user) {
        uqb0.f180374G.m127115L0(vDraweeView, user.picture(0).url);
        if (CoreModule.f18264c.f20330N0.m32968i3(user, CoreModule.m30933P().m143412i().mo180415W(user))) {
            bnl0.m105524M(vImage, true);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m134471p(boolean z) {
        return String.format(qv5.f159697a.get().contains("staging") ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/opening-remarks/index.html?speed=true&_bid=1005436&hideNavigationBar=1&hideNotch=1&isFirstEnter=%s#/main", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r */
    public static hcm m134472r() {
        if (f108713h == null) {
            synchronized (hcm.class) {
                try {
                    if (f108713h == null) {
                        f108713h = new hcm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f108713h;
    }

    /* JADX INFO: renamed from: A */
    public void m134473A(String str, Message message) {
        CoreModule.f18264c.f20384f0.m33626Dn(str, message, null);
    }

    /* JADX INFO: renamed from: B */
    public void m134474B(List<String> list) {
        this.f108717b = list;
    }

    /* JADX INFO: renamed from: C */
    public void m134475C(boolean z) {
        this.f108718c = z;
    }

    /* JADX INFO: renamed from: D */
    public void m134476D(String str) {
        this.f108719d = str;
    }

    /* JADX INFO: renamed from: E */
    public void m134477E(boolean z) {
        this.f108720e = z;
    }

    /* JADX INFO: renamed from: F */
    public void m134478F(final Act act) {
        if (jyb.m147479J(this.f108717b) || this.f108717b.size() < 3) {
            return;
        }
        final long jM174454o = pzi0.m174454o();
        final jl80 jl80VarM146020O = act.newDialog().m146022Q(qec0.f156847F0).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.sbm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f167161a.m134482u(dialogInterface);
            }
        }).m146020O();
        jl80VarM146020O.show();
        i4g0.m138492A("e_batch_icebreak", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", this.f108717b.get(0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f108717b.get(1) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f108717b.get(2)));
        if (CoreModule.f18264c.f20381e0.f89241h3.get().intValue() == 1) {
            CoreModule.f18264c.f20381e0.f89241h3.put(2);
            CoreModule.f18264c.f20381e0.f89249i3.put(Long.valueOf(f108711f + jM174454o));
        } else {
            CoreModule.f18264c.f20381e0.f89241h3.put(1);
            CoreModule.f18264c.f20381e0.f89249i3.put(Long.valueOf((((long) h39.m133417F()) * f108712g) + jM174454o));
        }
        View viewM145966L = jl80VarM146020O.m145966L();
        final VDraweeView vDraweeView = (VDraweeView) viewM145966L.findViewById(edc0.f93429p1);
        final VImage vImage = (VImage) viewM145966L.findViewById(edc0.f93241M2);
        VButton vButton = (VButton) viewM145966L.findViewById(edc0.f93205G2);
        VButton vButton2 = (VButton) viewM145966L.findViewById(edc0.f93445r3);
        vButton2.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.dcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146020O.dismiss();
            }
        });
        bnl0.m105509E0(vButton2, new View.OnClickListener() { // from class: l.ecm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93078a.m134484w(jl80VarM146020O, jM174454o, view);
            }
        });
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.fcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98235a.m134485x(act, view);
            }
        });
        act.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f108717b.get(0))).filter(new qcj() { // from class: l.gcm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82486a(user) && !jyb.m147479J(user.pictures));
            }
        }).first().subscribe(psd0.m173597H(new y20() { // from class: l.tbm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134460e(vDraweeView, vImage, (User) obj);
            }
        }, new y20() { // from class: l.ubm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134464i((Throwable) obj);
            }
        }));
        final VDraweeView vDraweeView2 = (VDraweeView) viewM145966L.findViewById(edc0.f93436q1);
        final VImage vImage2 = (VImage) viewM145966L.findViewById(edc0.f93247N2);
        bnl0.m105509E0(vDraweeView2, new View.OnClickListener() { // from class: l.vbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183261a.m134486y(act, view);
            }
        });
        act.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f108717b.get(1))).filter(new qcj() { // from class: l.wbm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82486a(user) && !jyb.m147479J(user.pictures));
            }
        }).first().subscribe(psd0.m173597H(new y20() { // from class: l.xbm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134470o(vDraweeView2, vImage2, (User) obj);
            }
        }, new y20() { // from class: l.ybm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134456a((Throwable) obj);
            }
        }));
        final VDraweeView vDraweeView3 = (VDraweeView) viewM145966L.findViewById(edc0.f93443r1);
        final VImage vImage3 = (VImage) viewM145966L.findViewById(edc0.f93253O2);
        bnl0.m105509E0(vDraweeView3, new View.OnClickListener() { // from class: l.zbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203683a.m134483v(act, view);
            }
        });
        act.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f108717b.get(2))).filter(new qcj() { // from class: l.acm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82486a(user) && !jyb.m147479J(user.pictures));
            }
        }).first().subscribe(psd0.m173597H(new y20() { // from class: l.bcm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134468m(vDraweeView3, vImage3, (User) obj);
            }
        }, new y20() { // from class: l.ccm
            @Override // p153l.y20
            public final void call(Object obj) {
                hcm.m134466k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public boolean m134479q(long j) {
        return !this.f108718c && !jyb.m147479J(this.f108717b) && this.f108717b.size() >= 3 && j > CoreModule.f18264c.f20381e0.f89249i3.get().longValue();
    }

    /* JADX INFO: renamed from: s */
    public String m134480s() {
        return this.f108719d;
    }

    /* JADX INFO: renamed from: t */
    public final List<Message> m134481t() {
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
    public final /* synthetic */ void m134482u(DialogInterface dialogInterface) {
        this.f108717b.clear();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m134483v(Act act, View view) {
        if (jyb.m147479J(this.f108717b) || this.f108717b.size() < 3) {
            return;
        }
        i4g0.m138523u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", this.f108717b.get(2)));
        act.startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act, this.f108717b.get(2), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m134484w(jl80 jl80Var, long j, View view) {
        if (jyb.m147479J(this.f108717b) || this.f108717b.size() < 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f108717b.get(0));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f108717b.get(1));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f108717b.get(2));
        i4g0.m138523u("e_batch_icebreak", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", sb.toString()));
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!ConnectivityReceiver.m82467g()) {
            o1j0.m165634h(R$string.f21461B2);
            return;
        }
        if (userM116600p9.isJailedOrRestrict() || userM116600p9.isBanned() || userM116600p9.isBannedNew()) {
            jl80Var.dismiss();
            gta.m132210e().m132214d().mo34768Vc();
            return;
        }
        CoreModule.f18264c.f20381e0.f89249i3.put(Long.valueOf(j + (((long) h39.m133417F()) * f108712g)));
        CoreModule.f18264c.f20381e0.f89241h3.put(0);
        List<Message> listM134481t = m134481t();
        for (int i = 0; i < 3; i++) {
            String str = this.f108717b.get(i);
            if (!TextUtils.isEmpty(str)) {
                m134473A(str, listM134481t.get(i));
            }
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m134485x(Act act, View view) {
        if (jyb.m147479J(this.f108717b) || this.f108717b.size() < 3) {
            return;
        }
        i4g0.m138523u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", this.f108717b.get(0)));
        act.startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act, this.f108717b.get(0), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m134486y(Act act, View view) {
        if (jyb.m147479J(this.f108717b) || this.f108717b.size() < 3) {
            return;
        }
        i4g0.m138523u("e_batch_icebreak_feature", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_uid", this.f108717b.get(1)));
        act.startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act, this.f108717b.get(1), CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG, false), 16);
    }

    /* JADX INFO: renamed from: z */
    public boolean m134487z() {
        return this.f108720e;
    }
}
