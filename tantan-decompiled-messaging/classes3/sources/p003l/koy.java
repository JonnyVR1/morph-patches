package p003l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.a1c0;
import l.b86;
import l.c3c0;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.mqi0;
import l.t100;
import l.tpd0;
import l.ura;
import l.vwb;
import l.wmz;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zpd0;
import l.zvf0;
import p014rx.C1099c;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class koy {

    /* JADX INFO: renamed from: i */
    public static final int f4984i = (xdl0.y0() - t100.d(68.0f)) / 4;

    /* JADX INFO: renamed from: j */
    public static final int f4985j = (xdl0.y0() - t100.d(91.0f)) / 4;

    /* JADX INFO: renamed from: a */
    public MessagesAct f4986a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f4987b;

    /* JADX INFO: renamed from: c */
    public zny f4988c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f4989d;

    /* JADX INFO: renamed from: e */
    public int f4990e = 0;

    /* JADX INFO: renamed from: f */
    public int f4991f = 0;

    /* JADX INFO: renamed from: g */
    public int f4992g = 0;

    /* JADX INFO: renamed from: h */
    public Runnable f4993h;

    /* JADX INFO: renamed from: l.koy$a */
    public class C0380a extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4994a;

        public C0380a(int i) {
            this.f4994a = i;
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.d(16.0f);
            } else {
                rect.left = t100.d(12.0f);
            }
            if (childAdapterPosition == this.f4994a - 1) {
                rect.right = t100.d(16.0f);
            } else {
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.koy$b */
    public class C0381b extends RecyclerView.n {
        public C0381b() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = 0;
            } else {
                rect.left = t100.d(9.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.koy$c */
    public class C0382c extends RecyclerView.n {
        public C0382c() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            boolean zM5750q = koy.this.m5750q();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iC = zVar.c() - 1;
            rect.set(0, 0, 0, rect.bottom);
            boolean zG = y19.G();
            if (childAdapterPosition == 0) {
                rect.left = (!zG || zM5750q) ? t100.d(16.0f) : t100.d(10.0f);
            } else {
                if (zM5750q) {
                    rect.left = t100.d(12.0f);
                } else {
                    rect.left = zG ? t100.d(8.0f) : t100.d(12.0f);
                }
                if (childAdapterPosition == iC) {
                    rect.right = (!zG || zM5750q) ? t100.d(16.0f) : t100.d(10.0f);
                }
            }
            if (zM5750q) {
                rect.top = t100.d(12.0f);
            } else {
                rect.top = zG ? t100.d(10.0f) : t100.d(12.0f);
            }
        }
    }

    public koy(MessagesAct messagesAct) {
        this.f4986a = messagesAct;
        this.f4987b = messagesAct.m2072w2().f7608G0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5730f() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5731g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m5733i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m5735l(int i) {
        if (i == 1) {
            return "association";
        }
        if (i == 2 || i == 3 || i == 7) {
            return "breakice";
        }
        if (i == 4 || i == 8) {
            return "reply_breakice";
        }
        return (i == 5 || i == 9) ? "contact_again" : "";
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5736r(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 10 || i == 11 || i == 12 || i == 14 || i == 13 || i == 9;
    }

    /* JADX INFO: renamed from: A */
    public void m5737A(Runnable runnable) {
        this.f4993h = runnable;
    }

    /* JADX INFO: renamed from: B */
    public void m5738B(int i) {
        this.f4990e = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m5739C(List<Sticker> list, int i) {
        boolean z = false;
        if (this.f4989d == null || this.f4988c == null) {
            m5748o();
            m5741E(list.size());
            if (!m5751s() || i == 10) {
                View recyclerView = new RecyclerView(this.f4986a);
                this.f4989d = recyclerView;
                this.f4987b.addView(recyclerView);
                if (i == 10) {
                    xdl0.f0(this.f4989d, t100.h);
                    this.f4987b.setBackgroundResource(a1c0.a0);
                }
            } else {
                View viewInflate = LayoutInflater.from(this.f4986a).inflate(l6c0.W4, (ViewGroup) this.f4987b, false);
                this.f4987b.addView(viewInflate);
                this.f4989d = viewInflate.findViewById(y4c0.I3);
                if (ura.e().d().I4()) {
                    AppCompatImageView appCompatImageView = (VImage) viewInflate.findViewById(y4c0.L4);
                    AppCompatImageView appCompatImageView2 = (VImage) viewInflate.findViewById(y4c0.O);
                    VText_Medium vText_MediumFindViewById = viewInflate.findViewById(y4c0.A);
                    xdl0.N(appCompatImageView, c3c0.o7);
                    xdl0.N(appCompatImageView2, c3c0.n7);
                    vText_MediumFindViewById.setTextColor(CoreModule.b.getResources().getColor(a1c0.i));
                }
                xdl0.E0(viewInflate.findViewById(y4c0.O), new View.OnClickListener() { // from class: l.goy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3959a.m5754v(view);
                    }
                });
            }
            m5749p(list.size());
            zny znyVar = new zny(this.f4986a);
            this.f4988c = znyVar;
            this.f4989d.setAdapter(znyVar);
            z = true;
        }
        this.f4988c.m9454c0(list, i);
        if (z) {
            this.f4986a.m2072w2().m7926f2(this.f4990e, new Runnable() { // from class: l.hoy
                @Override // java.lang.Runnable
                public final void run() {
                    koy.m5731g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m5740D(String str, final int i, boolean z) {
        if (i == 1 && TextUtils.isEmpty(this.f4986a.m2072w2().m7940l0())) {
            return false;
        }
        if ((this.f4989d == null || this.f4990e == i) && this.f4987b.getChildCount() > 0) {
            return false;
        }
        this.f4990e = i;
        if (m5750q()) {
            this.f4989d = null;
        }
        if (i != 10) {
            if (!ConnectivityReceiver.g()) {
                return false;
            }
            this.f4986a.duringCreated(m5758z(str, i, z).filter(new w9j() { // from class: l.boy
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f2415a.m5755w((Pair) obj);
                }
            })).subscribe((m250) mkd0.H(new e30() { // from class: l.coy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2739a.m5756x(i, (Pair) obj);
                }
            }, new e30() { // from class: l.doy
                @Override // p003l.e30
                public final void call(Object obj) {
                    koy.m5733i((Throwable) obj);
                }
            }));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        List<Sticker> listM5747n = m5747n();
        if (vwb.J(listM5747n)) {
            return false;
        }
        Iterator<Sticker> it = listM5747n.iterator();
        while (it.hasNext()) {
            String str2 = it.next().status;
            if (!TextUtils.isEmpty(sb)) {
                sb.append(",");
            }
            sb.append(str2);
        }
        zvf0.A("e_shortcut", this.f4986a.pageId(), new j760[]{j760.a("show_tag", sb.toString())});
        m5742F(listM5747n, i);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m5741E(int i) {
        xdl0.M(this.f4987b, true);
        this.f4987b.removeAllViews();
        this.f4987b.setPadding(0, 0, 0, 0);
        if (m5750q() || !y19.G()) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4987b.getLayoutParams();
        layoutParams.rightMargin = t100.m;
        if (i > 2) {
            layoutParams.width = t100.d(176.0f);
        } else {
            layoutParams.width = -2;
        }
        layoutParams.height = this.f4992g;
        layoutParams.gravity = 85;
        this.f4987b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m5742F(List<Sticker> list, int i) {
        list.size();
        if (i == 4) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            g gVar = CoreModule.c.f0;
            m5744H(conversationCounterTypeSp, gVar.N0, gVar.M0);
        } else if (i == 5) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            g gVar2 = CoreModule.c.f0;
            m5744H(conversationCounterTypeSp2, gVar2.P0, gVar2.O0);
        } else if (i == 9) {
            ConversationCounterTypeSp conversationCounterTypeSp3 = ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit;
            conversationCounterTypeSp3.set(this.f4986a.f1531f.f3543c, conversationCounterTypeSp3.get(this.f4986a.f1531f.f3543c) + 1);
        }
        m5739C(list, i);
    }

    /* JADX INFO: renamed from: G */
    public void m5743G() {
        this.f4988c.m9454c0(m5747n(), 10);
    }

    /* JADX INFO: renamed from: H */
    public final void m5744H(ConversationCounterTypeSp conversationCounterTypeSp, tpd0 tpd0Var, zpd0 zpd0Var) {
        conversationCounterTypeSp.set(this.f4986a.f1531f.m4295r3(), (int) (mqi0.o() / 1000));
        int iIntValue = ((Integer) tpd0Var.get()).intValue();
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        long jO = mqi0.o();
        tpd0Var.put(Integer.valueOf(mqi0.C(jLongValue, jO) ? 1 + iIntValue : 1));
        zpd0Var.put(Long.valueOf(jO));
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m5745k(int i) {
        List<String> list;
        switch (i) {
            case 2:
                list = pxe.f6543d;
                break;
            case 3:
            case 4:
                list = pxe.f6545f;
                break;
            case 5:
                list = pxe.f6544e;
                break;
            case 6:
            default:
                list = null;
                break;
            case 7:
                list = pxe.f6546g;
                break;
            case 8:
                list = pxe.f6547h;
                break;
            case 9:
                list = pxe.f6548i;
                break;
        }
        if (NullChecker.a(list)) {
            return b86.b(list, 4);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m5746m() {
        return this.f4990e;
    }

    /* JADX INFO: renamed from: n */
    public final List<Sticker> m5747n() {
        List listL = y19.l();
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(listL)) {
            Conversation conversationZp = CoreModule.c.f0.zp(this.f4986a.f1531f.f3543c);
            int iMin = Math.min(y19.s().integration.limit, listL.size());
            for (int i = 0; i < iMin; i++) {
                if (!vwb.J(((MessageIntegrationItem) listL.get(i)).text)) {
                    MessageIntegrationItem messageIntegrationItem = (MessageIntegrationItem) listL.get(i);
                    if ((!NullChecker.a(conversationZp) || !conversationZp.localEverHasMessage || !TextUtils.equals(messageIntegrationItem.type, "prologue")) && (y19.R() || !TextUtils.equals(messageIntegrationItem.type, "exchange"))) {
                        Sticker stickerNew_ = Sticker.new_();
                        stickerNew_.name = messageIntegrationItem.type;
                        stickerNew_.status = (String) b86.b(messageIntegrationItem.text, 1).get(0);
                        arrayList.add(stickerNew_);
                    }
                }
            }
            if (y19.J()) {
                vwb.e0(arrayList, new w9j() { // from class: l.aoy
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Sticker) obj).name, "prologue"));
                    }
                });
                wmz wmzVar = this.f4986a.f1531f;
                if (wmzVar instanceof wmz) {
                    wmz wmzVar2 = wmzVar;
                    kyb0 kyb0Var = (kyb0) wmzVar2.uc(kyb0.class);
                    if (kyb0Var != null && !((bpz) wmzVar2.m4309t7()).m3103b4() && NullChecker.a(conversationZp) && conversationZp.userMessageCount == 0 && !vwb.J(kyb0Var.m5903d())) {
                        Sticker stickerNew_2 = Sticker.new_();
                        stickerNew_2.name = "chatPrologue";
                        stickerNew_2.status = "开场白";
                        arrayList.add(0, stickerNew_2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public void m5748o() {
        if (this.f4990e == 10) {
            this.f4992g = t100.w + t100.h;
            return;
        }
        if (m5751s()) {
            this.f4992g = f4985j;
            return;
        }
        if (m5750q()) {
            this.f4992g = f4984i + t100.k;
        } else if (y19.G()) {
            this.f4992g = t100.G + (t100.i * 2) + t100.d(7.0f);
        } else {
            this.f4992g = t100.J + t100.k;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5749p(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f4986a);
        linearLayoutManager.setOrientation(0);
        this.f4989d.setLayoutManager(linearLayoutManager);
        xdl0.C0(this.f4989d, this.f4992g);
        this.f4989d.setNestedScrollingEnabled(true);
        if (this.f4990e == 10) {
            this.f4989d.addItemDecoration(new C0380a(i));
            this.f4989d.setBackgroundResource(a1c0.Y);
            return;
        }
        boolean zM5751s = m5751s();
        RecyclerView recyclerView = this.f4989d;
        if (zM5751s) {
            recyclerView.addItemDecoration(new C0381b());
            this.f4989d.setBackgroundResource(a1c0.Y);
            return;
        }
        recyclerView.addItemDecoration(new C0382c());
        if (m5750q() || !y19.G()) {
            this.f4989d.setBackgroundResource(a1c0.a0);
        } else {
            this.f4989d.setBackgroundResource(c3c0.y5);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m5750q() {
        return m5736r(this.f4990e);
    }

    /* JADX INFO: renamed from: s */
    public boolean m5751s() {
        return y19.a() && m5750q();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m5752t(Runnable runnable) {
        this.f4989d = null;
        this.f4990e = 0;
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m5753u(List list, int i, Pair pair) {
        if (vwb.J((Collection) pair.second)) {
            return;
        }
        zvf0.A("e_chat_icebreak_gif", this.f4986a.pageId(), new j760[]{vwb.Y("other_user_id", this.f4986a.f1531f.m4295r3()), vwb.Y("search_content", TextUtils.join(",", list)), vwb.Y("chat_source", m5735l(i))});
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m5754v(View view) {
        if (NullChecker.a(this.f4993h)) {
            this.f4993h.run();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m5755w(Pair pair) {
        return Boolean.valueOf(TextUtils.equals((CharSequence) pair.first, this.f4986a.m2072w2().m7940l0()));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m5756x(int i, Pair pair) {
        if (vwb.J((Collection) pair.second)) {
            this.f4986a.m2072w2().mo3081Q1(false, new Runnable() { // from class: l.foy
                @Override // java.lang.Runnable
                public final void run() {
                    koy.m5730f();
                }
            });
        } else {
            m5742F((List) pair.second, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m5757y(boolean z, final Runnable runnable) {
        if (this.f4989d == null || this.f4990e == 0) {
            return;
        }
        this.f4986a.m2072w2().m7895R1(z && m5750q(), new Runnable() { // from class: l.eoy
            @Override // java.lang.Runnable
            public final void run() {
                this.f3347a.m5752t(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final C1099c<Pair<String, List<Sticker>>> m5758z(final String str, final int i, boolean z) {
        final List<String> listM5745k = null;
        String str2 = "";
        if (i == 1) {
            if (!TextUtils.isEmpty(str)) {
                listM5745k = vwb.M(str);
                str2 = "chat_text_associate";
            }
        } else if (m5736r(i)) {
            listM5745k = m5745k(i);
            str2 = "chat_ice_break";
        }
        return vwb.J(listM5745k) ? C1099c.just(Pair.create(str, new ArrayList())) : this.f4986a.duringCreated(CoreModule.c.Z.o3(listM5745k, z, str2)).map(new w9j() { // from class: l.ioy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Pair.create(str, (List) obj);
            }
        }).doOnNext(new e30() { // from class: l.joy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4694a.m5753u(listM5745k, i, (Pair) obj);
            }
        });
    }
}
