package p149l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class koy {

    /* JADX INFO: renamed from: i */
    public static final int f124068i = (xdl0.m208412y0() - t100.m186890d(68.0f)) / 4;

    /* JADX INFO: renamed from: j */
    public static final int f124069j = (xdl0.m208412y0() - t100.m186890d(91.0f)) / 4;

    /* JADX INFO: renamed from: a */
    public MessagesAct f124070a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f124071b;

    /* JADX INFO: renamed from: c */
    public zny f124072c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f124073d;

    /* JADX INFO: renamed from: e */
    public int f124074e = 0;

    /* JADX INFO: renamed from: f */
    public int f124075f = 0;

    /* JADX INFO: renamed from: g */
    public int f124076g = 0;

    /* JADX INFO: renamed from: h */
    public Runnable f124077h;

    /* JADX INFO: renamed from: l.koy$a */
    public class C18054a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f124078a;

        public C18054a(int i) {
            this.f124078a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.m186890d(16.0f);
            } else {
                rect.left = t100.m186890d(12.0f);
            }
            if (childAdapterPosition == this.f124078a - 1) {
                rect.right = t100.m186890d(16.0f);
            } else {
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.koy$b */
    public class C18055b extends RecyclerView.AbstractC0576n {
        public C18055b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = 0;
            } else {
                rect.left = t100.m186890d(9.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.koy$c */
    public class C18056c extends RecyclerView.AbstractC0576n {
        public C18056c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            boolean zM146784q = koy.this.m146784q();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iM3487c = c0588z.m3487c() - 1;
            rect.set(0, 0, 0, rect.bottom);
            boolean zM212147G = y19.m212147G();
            if (childAdapterPosition == 0) {
                rect.left = (!zM212147G || zM146784q) ? t100.m186890d(16.0f) : t100.m186890d(10.0f);
            } else {
                if (zM146784q) {
                    rect.left = t100.m186890d(12.0f);
                } else {
                    rect.left = zM212147G ? t100.m186890d(8.0f) : t100.m186890d(12.0f);
                }
                if (childAdapterPosition == iM3487c) {
                    rect.right = (!zM212147G || zM146784q) ? t100.m186890d(16.0f) : t100.m186890d(10.0f);
                }
            }
            if (zM146784q) {
                rect.top = t100.m186890d(12.0f);
            } else {
                rect.top = zM212147G ? t100.m186890d(10.0f) : t100.m186890d(12.0f);
            }
        }
    }

    public koy(MessagesAct messagesAct) {
        this.f124070a = messagesAct;
        this.f124071b = messagesAct.m48980w2().f171676G0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m146764f() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m146765g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m146767i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m146769l(int i) {
        if (i == 1) {
            return "association";
        }
        if (i == 2 || i == 3 || i == 7) {
            return BreakIce.TYPE;
        }
        if (i == 4 || i == 8) {
            return "reply_breakice";
        }
        return (i == 5 || i == 9) ? "contact_again" : "";
    }

    /* JADX INFO: renamed from: r */
    public static boolean m146770r(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 10 || i == 11 || i == 12 || i == 14 || i == 13 || i == 9;
    }

    /* JADX INFO: renamed from: A */
    public void m146771A(Runnable runnable) {
        this.f124077h = runnable;
    }

    /* JADX INFO: renamed from: B */
    public void m146772B(int i) {
        this.f124074e = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m146773C(List<Sticker> list, int i) {
        boolean z = false;
        if (this.f124073d == null || this.f124072c == null) {
            m146782o();
            m146775E(list.size());
            if (!m146785s() || i == 10) {
                RecyclerView recyclerView = new RecyclerView(this.f124070a);
                this.f124073d = recyclerView;
                this.f124071b.addView(recyclerView);
                if (i == 10) {
                    xdl0.m208374f0(this.f124073d, t100.f167259h);
                    this.f124071b.setBackgroundResource(a1c0.f67146a0);
                }
            } else {
                View viewInflate = LayoutInflater.from(this.f124070a).inflate(l6c0.f126412W4, (ViewGroup) this.f124071b, false);
                this.f124071b.addView(viewInflate);
                this.f124073d = (RecyclerView) viewInflate.findViewById(y4c0.f195983I3);
                if (ura.m195053e().m195057d().mo33699I4()) {
                    VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196002L4);
                    VImage vImage2 = (VImage) viewInflate.findViewById(y4c0.f196015O);
                    VText_Medium vText_Medium = (VText_Medium) viewInflate.findViewById(y4c0.f195928A);
                    xdl0.m208346N(vImage, c3c0.f78826o7);
                    xdl0.m208346N(vImage2, c3c0.f78817n7);
                    vText_Medium.setTextColor(CoreModule.f17544b.getResources().getColor(a1c0.f67155i));
                }
                xdl0.m208329E0(viewInflate.findViewById(y4c0.f196015O), new View.OnClickListener() { // from class: l.goy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f103744a.m146788v(view);
                    }
                });
            }
            m146783p(list.size());
            zny znyVar = new zny(this.f124070a);
            this.f124072c = znyVar;
            this.f124073d.setAdapter(znyVar);
            z = true;
        }
        this.f124072c.m219530c0(list, i);
        if (z) {
            this.f124070a.m48980w2().m190301f2(this.f124074e, new Runnable() { // from class: l.hoy
                @Override // java.lang.Runnable
                public final void run() {
                    koy.m146765g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m146774D(String str, final int i, boolean z) {
        if (i == 1 && TextUtils.isEmpty(this.f124070a.m48980w2().m190314l0())) {
            return false;
        }
        if ((this.f124073d == null || this.f124074e == i) && this.f124071b.getChildCount() > 0) {
            return false;
        }
        this.f124074e = i;
        if (m146784q()) {
            this.f124073d = null;
        }
        if (i != 10) {
            if (!ConnectivityReceiver.m81284g()) {
                return false;
            }
            this.f124070a.duringCreated(m146792z(str, i, z).filter(new w9j() { // from class: l.boy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f76579a.m146789w((Pair) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.coy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81889a.m146790x(i, (Pair) obj);
                }
            }, new e30() { // from class: l.doy
                @Override // p149l.e30
                public final void call(Object obj) {
                    koy.m146767i((Throwable) obj);
                }
            }));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        List<Sticker> listM146781n = m146781n();
        if (vwb.m200296J(listM146781n)) {
            return false;
        }
        Iterator<Sticker> it = listM146781n.iterator();
        while (it.hasNext()) {
            String str2 = it.next().status;
            if (!TextUtils.isEmpty(sb)) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(str2);
        }
        zvf0.m220368A("e_shortcut", this.f124070a.pageId(), j760.m140076a("show_tag", sb.toString()));
        m146776F(listM146781n, i);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m146775E(int i) {
        xdl0.m208344M(this.f124071b, true);
        this.f124071b.removeAllViews();
        this.f124071b.setPadding(0, 0, 0, 0);
        if (m146784q() || !y19.m212147G()) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f124071b.getLayoutParams();
        layoutParams.rightMargin = t100.f167264m;
        if (i > 2) {
            layoutParams.width = t100.m186890d(176.0f);
        } else {
            layoutParams.width = -2;
        }
        layoutParams.height = this.f124076g;
        layoutParams.gravity = 85;
        this.f124071b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m146776F(List<Sticker> list, int i) {
        list.size();
        if (i == 4) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            m146778H(conversationCounterTypeSp, c4740g.f19880N0, c4740g.f19877M0);
        } else if (i == 5) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            C4740g c4740g2 = CoreModule.f17545c.f19642f0;
            m146778H(conversationCounterTypeSp2, c4740g2.f19886P0, c4740g2.f19883O0);
        } else if (i == 9) {
            ConversationCounterTypeSp conversationCounterTypeSp3 = ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit;
            conversationCounterTypeSp3.set(this.f124070a.f31640f.f96911c, conversationCounterTypeSp3.get(this.f124070a.f31640f.f96911c) + 1);
        }
        m146773C(list, i);
    }

    /* JADX INFO: renamed from: G */
    public void m146777G() {
        this.f124072c.m219530c0(m146781n(), 10);
    }

    /* JADX INFO: renamed from: H */
    public final void m146778H(ConversationCounterTypeSp conversationCounterTypeSp, tpd0 tpd0Var, zpd0 zpd0Var) {
        conversationCounterTypeSp.set(this.f124070a.f31640f.mo120828r3(), (int) (mqi0.m155944o() / 1000));
        int iIntValue = tpd0Var.get().intValue();
        long jLongValue = zpd0Var.get().longValue();
        long jM155944o = mqi0.m155944o();
        tpd0Var.put(Integer.valueOf(mqi0.m155928C(jLongValue, jM155944o) ? 1 + iIntValue : 1));
        zpd0Var.put(Long.valueOf(jM155944o));
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m146779k(int i) {
        List<String> list;
        switch (i) {
            case 2:
                list = pxe.f151669d;
                break;
            case 3:
            case 4:
                list = pxe.f151671f;
                break;
            case 5:
                list = pxe.f151670e;
                break;
            case 6:
            default:
                list = null;
                break;
            case 7:
                list = pxe.f151672g;
                break;
            case 8:
                list = pxe.f151673h;
                break;
            case 9:
                list = pxe.f151674i;
                break;
        }
        if (NullChecker.m81303a(list)) {
            return b86.m100757b(list, 4);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m146780m() {
        return this.f124074e;
    }

    /* JADX INFO: renamed from: n */
    public final List<Sticker> m146781n() {
        List<MessageIntegrationItem> listM212177l = y19.m212177l();
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(listM212177l)) {
            Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(this.f124070a.f31640f.f96911c);
            int iMin = Math.min(y19.m212184s().integration.limit, listM212177l.size());
            for (int i = 0; i < iMin; i++) {
                if (!vwb.m200296J(listM212177l.get(i).text)) {
                    MessageIntegrationItem messageIntegrationItem = listM212177l.get(i);
                    if ((!NullChecker.m81303a(conversationM33216zp) || !conversationM33216zp.localEverHasMessage || !TextUtils.equals(messageIntegrationItem.type, "prologue")) && (y19.m212158R() || !TextUtils.equals(messageIntegrationItem.type, "exchange"))) {
                        Sticker stickerNew_ = Sticker.new_();
                        stickerNew_.name = messageIntegrationItem.type;
                        stickerNew_.status = (String) b86.m100757b(messageIntegrationItem.text, 1).get(0);
                        arrayList.add(stickerNew_);
                    }
                }
            }
            if (y19.m212150J()) {
                vwb.m200322e0(arrayList, new w9j() { // from class: l.aoy
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Sticker) obj).name, "prologue"));
                    }
                });
                fcz fczVar = this.f124070a.f31640f;
                if (fczVar instanceof wmz) {
                    wmz wmzVar = (wmz) fczVar;
                    kyb0 kyb0Var = (kyb0) wmzVar.m204522uc(kyb0.class);
                    if (kyb0Var != null && !wmzVar.m120842t7().m103223b4() && NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.userMessageCount == 0 && !vwb.m200296J(kyb0Var.m147851d())) {
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
    public void m146782o() {
        if (this.f124074e == 10) {
            this.f124076g = t100.f167274w + t100.f167259h;
            return;
        }
        if (m146785s()) {
            this.f124076g = f124069j;
            return;
        }
        if (m146784q()) {
            this.f124076g = f124068i + t100.f167262k;
        } else if (y19.m212147G()) {
            this.f124076g = t100.f167232G + (t100.f167260i * 2) + t100.m186890d(7.0f);
        } else {
            this.f124076g = t100.f167235J + t100.f167262k;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m146783p(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f124070a);
        linearLayoutManager.setOrientation(0);
        this.f124073d.setLayoutManager(linearLayoutManager);
        xdl0.m208325C0(this.f124073d, this.f124076g);
        this.f124073d.setNestedScrollingEnabled(true);
        if (this.f124074e == 10) {
            this.f124073d.addItemDecoration(new C18054a(i));
            this.f124073d.setBackgroundResource(a1c0.f67143Y);
            return;
        }
        boolean zM146785s = m146785s();
        RecyclerView recyclerView = this.f124073d;
        if (zM146785s) {
            recyclerView.addItemDecoration(new C18055b());
            this.f124073d.setBackgroundResource(a1c0.f67143Y);
            return;
        }
        recyclerView.addItemDecoration(new C18056c());
        if (m146784q() || !y19.m212147G()) {
            this.f124073d.setBackgroundResource(a1c0.f67146a0);
        } else {
            this.f124073d.setBackgroundResource(c3c0.f78914y5);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m146784q() {
        return m146770r(this.f124074e);
    }

    /* JADX INFO: renamed from: s */
    public boolean m146785s() {
        return y19.m212166a() && m146784q();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m146786t(Runnable runnable) {
        this.f124073d = null;
        this.f124074e = 0;
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m146787u(List list, int i, Pair pair) {
        if (vwb.m200296J((Collection) pair.second)) {
            return;
        }
        zvf0.m220368A("e_chat_icebreak_gif", this.f124070a.pageId(), vwb.m200311Y("other_user_id", this.f124070a.f31640f.mo120828r3()), vwb.m200311Y("search_content", TextUtils.join(Constants.SEPARATOR_COMMA, list)), vwb.m200311Y("chat_source", m146769l(i)));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m146788v(View view) {
        if (NullChecker.m81303a(this.f124077h)) {
            this.f124077h.run();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m146789w(Pair pair) {
        return Boolean.valueOf(TextUtils.equals((CharSequence) pair.first, this.f124070a.m48980w2().m190314l0()));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m146790x(int i, Pair pair) {
        if (vwb.m200296J((Collection) pair.second)) {
            this.f124070a.m48980w2().mo103201Q1(false, new Runnable() { // from class: l.foy
                @Override // java.lang.Runnable
                public final void run() {
                    koy.m146764f();
                }
            });
        } else {
            m146776F((List) pair.second, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m146791y(boolean z, final Runnable runnable) {
        if (this.f124073d == null || this.f124074e == 0) {
            return;
        }
        this.f124070a.m48980w2().m190270R1(z && m146784q(), new Runnable() { // from class: l.eoy
            @Override // java.lang.Runnable
            public final void run() {
                this.f92505a.m146786t(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final C22306c<Pair<String, List<Sticker>>> m146792z(final String str, final int i, boolean z) {
        final List<String> listM146779k = null;
        String str2 = "";
        if (i == 1) {
            if (!TextUtils.isEmpty(str)) {
                listM146779k = vwb.m200299M(str);
                str2 = "chat_text_associate";
            }
        } else if (m146770r(i)) {
            listM146779k = m146779k(i);
            str2 = "chat_ice_break";
        }
        return vwb.m200296J(listM146779k) ? C22306c.just(Pair.create(str, new ArrayList())) : this.f124070a.duringCreated(CoreModule.f17545c.f19624Z.m34923o3(listM146779k, z, str2)).map(new w9j() { // from class: l.ioy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Pair.create(str, (List) obj);
            }
        }).doOnNext(new e30() { // from class: l.joy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119024a.m146787u(listM146779k, i, (Pair) obj);
            }
        });
    }
}
