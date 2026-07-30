package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p151v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class hxy {

    /* JADX INFO: renamed from: i */
    public static final int f112069i = (bnl0.m105592y0() - qa00.m175859d(68.0f)) / 4;

    /* JADX INFO: renamed from: j */
    public static final int f112070j = (bnl0.m105592y0() - qa00.m175859d(91.0f)) / 4;

    /* JADX INFO: renamed from: a */
    public MessagesAct f112071a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f112072b;

    /* JADX INFO: renamed from: c */
    public wwy f112073c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f112074d;

    /* JADX INFO: renamed from: e */
    public int f112075e = 0;

    /* JADX INFO: renamed from: f */
    public int f112076f = 0;

    /* JADX INFO: renamed from: g */
    public int f112077g = 0;

    /* JADX INFO: renamed from: h */
    public Runnable f112078h;

    /* JADX INFO: renamed from: l.hxy$a */
    public class C17593a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f112079a;

        public C17593a(int i) {
            this.f112079a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = qa00.m175859d(16.0f);
            } else {
                rect.left = qa00.m175859d(12.0f);
            }
            if (childAdapterPosition == this.f112079a - 1) {
                rect.right = qa00.m175859d(16.0f);
            } else {
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: l.hxy$b */
    public class C17594b extends RecyclerView.AbstractC0578n {
        public C17594b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = 0;
            } else {
                rect.left = qa00.m175859d(9.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.hxy$c */
    public class C17595c extends RecyclerView.AbstractC0578n {
        public C17595c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            boolean zM137695q = hxy.this.m137695q();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iM3361c = c0561a0.m3361c() - 1;
            rect.set(0, 0, 0, rect.bottom);
            boolean zM133418G = h39.m133418G();
            if (childAdapterPosition == 0) {
                rect.left = (!zM133418G || zM137695q) ? qa00.m175859d(16.0f) : qa00.m175859d(10.0f);
            } else {
                if (zM137695q) {
                    rect.left = qa00.m175859d(12.0f);
                } else {
                    rect.left = zM133418G ? qa00.m175859d(8.0f) : qa00.m175859d(12.0f);
                }
                if (childAdapterPosition == iM3361c) {
                    rect.right = (!zM133418G || zM137695q) ? qa00.m175859d(16.0f) : qa00.m175859d(10.0f);
                }
            }
            if (zM137695q) {
                rect.top = qa00.m175859d(12.0f);
            } else {
                rect.top = zM133418G ? qa00.m175859d(10.0f) : qa00.m175859d(12.0f);
            }
        }
    }

    public hxy(MessagesAct messagesAct) {
        this.f112071a = messagesAct;
        this.f112072b = messagesAct.m50164y2().f160339G0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m137675f() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m137676g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m137678i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m137680l(int i) {
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
    public static boolean m137681r(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 10 || i == 11 || i == 12 || i == 14 || i == 13 || i == 9;
    }

    /* JADX INFO: renamed from: A */
    public void m137682A(Runnable runnable) {
        this.f112078h = runnable;
    }

    /* JADX INFO: renamed from: B */
    public void m137683B(int i) {
        this.f112075e = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m137684C(List<Sticker> list, int i) {
        boolean z = false;
        if (this.f112074d == null || this.f112073c == null) {
            m137693o();
            m137686E(list.size());
            if (!m137696s() || i == 10) {
                RecyclerView recyclerView = new RecyclerView(this.f112071a);
                this.f112074d = recyclerView;
                this.f112072b.addView(recyclerView);
                if (i == 10) {
                    bnl0.m105554f0(this.f112074d, qa00.f156321h);
                    this.f112072b.setBackgroundResource(g9c0.f102810a0);
                }
            } else {
                View viewInflate = LayoutInflater.from(this.f112071a).inflate(qec0.f156968W4, (ViewGroup) this.f112072b, false);
                this.f112072b.addView(viewInflate);
                this.f112074d = (RecyclerView) viewInflate.findViewById(edc0.f93218I3);
                if (gta.m132210e().m132214d().mo34702I4()) {
                    VImage vImage = (VImage) viewInflate.findViewById(edc0.f93237L4);
                    VImage vImage2 = (VImage) viewInflate.findViewById(edc0.f93250O);
                    VText_Medium vText_Medium = (VText_Medium) viewInflate.findViewById(edc0.f93163A);
                    bnl0.m105526N(vImage, ibc0.f114101o7);
                    bnl0.m105526N(vImage2, ibc0.f114092n7);
                    vText_Medium.setTextColor(CoreModule.f18263b.getResources().getColor(g9c0.f102819i));
                }
                bnl0.m105509E0(viewInflate.findViewById(edc0.f93250O), new View.OnClickListener() { // from class: l.dxy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f91124a.m137699v(view);
                    }
                });
            }
            m137694p(list.size());
            wwy wwyVar = new wwy(this.f112071a);
            this.f112073c = wwyVar;
            this.f112074d.setAdapter(wwyVar);
            z = true;
        }
        this.f112073c.m208347c0(list, i);
        if (z) {
            this.f112071a.m50164y2().m178944f2(this.f112075e, new Runnable() { // from class: l.exy
                @Override // java.lang.Runnable
                public final void run() {
                    hxy.m137676g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m137685D(String str, final int i, boolean z) {
        if (i == 1 && TextUtils.isEmpty(this.f112071a.m50164y2().m178958l0())) {
            return false;
        }
        if ((this.f112074d == null || this.f112075e == i) && this.f112072b.getChildCount() > 0) {
            return false;
        }
        this.f112075e = i;
        if (m137695q()) {
            this.f112074d = null;
        }
        if (i != 10) {
            if (!ConnectivityReceiver.m82467g()) {
                return false;
            }
            this.f112071a.duringCreated(m137703z(str, i, z).filter(new qcj() { // from class: l.ywy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f201892a.m137700w((Pair) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.zwy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206399a.m137701x(i, (Pair) obj);
                }
            }, new y20() { // from class: l.axy
                @Override // p153l.y20
                public final void call(Object obj) {
                    hxy.m137678i((Throwable) obj);
                }
            }));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        List<Sticker> listM137692n = m137692n();
        if (jyb.m147479J(listM137692n)) {
            return false;
        }
        Iterator<Sticker> it = listM137692n.iterator();
        while (it.hasNext()) {
            String str2 = it.next().status;
            if (!TextUtils.isEmpty(sb)) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(str2);
        }
        i4g0.m138492A("e_shortcut", this.f112071a.pageId(), pf60.m172085a("show_tag", sb.toString()));
        m137687F(listM137692n, i);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m137686E(int i) {
        bnl0.m105524M(this.f112072b, true);
        this.f112072b.removeAllViews();
        this.f112072b.setPadding(0, 0, 0, 0);
        if (m137695q() || !h39.m133418G()) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f112072b.getLayoutParams();
        layoutParams.rightMargin = qa00.f156326m;
        if (i > 2) {
            layoutParams.width = qa00.m175859d(176.0f);
        } else {
            layoutParams.width = -2;
        }
        layoutParams.height = this.f112077g;
        layoutParams.gravity = 85;
        this.f112072b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: F */
    public final void m137687F(List<Sticker> list, int i) {
        list.size();
        if (i == 4) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            m137689H(conversationCounterTypeSp, c4891g.f20622N0, c4891g.f20619M0);
        } else if (i == 5) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            C4891g c4891g2 = CoreModule.f18264c.f20384f0;
            m137689H(conversationCounterTypeSp2, c4891g2.f20628P0, c4891g2.f20625O0);
        } else if (i == 9) {
            ConversationCounterTypeSp conversationCounterTypeSp3 = ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit;
            conversationCounterTypeSp3.set(this.f112071a.f32488f.f82474c, conversationCounterTypeSp3.get(this.f112071a.f32488f.f82474c) + 1);
        }
        m137684C(list, i);
    }

    /* JADX INFO: renamed from: G */
    public void m137688G() {
        this.f112073c.m208347c0(m137692n(), 10);
    }

    /* JADX INFO: renamed from: H */
    public final void m137689H(ConversationCounterTypeSp conversationCounterTypeSp, vxd0 vxd0Var, byd0 byd0Var) {
        conversationCounterTypeSp.set(this.f112071a.f32488f.mo111034r3(), (int) (pzi0.m174454o() / 1000));
        int iIntValue = vxd0Var.get().intValue();
        long jLongValue = byd0Var.get().longValue();
        long jM174454o = pzi0.m174454o();
        vxd0Var.put(Integer.valueOf(pzi0.m174438C(jLongValue, jM174454o) ? 1 + iIntValue : 1));
        byd0Var.put(Long.valueOf(jM174454o));
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m137690k(int i) {
        List<String> list;
        switch (i) {
            case 2:
                list = tye.f176662d;
                break;
            case 3:
            case 4:
                list = tye.f176664f;
                break;
            case 5:
                list = tye.f176663e;
                break;
            case 6:
            default:
                list = null;
                break;
            case 7:
                list = tye.f176665g;
                break;
            case 8:
                list = tye.f176666h;
                break;
            case 9:
                list = tye.f176667i;
                break;
        }
        if (NullChecker.m82486a(list)) {
            return g96.m129515b(list, 4);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m137691m() {
        return this.f112075e;
    }

    /* JADX INFO: renamed from: n */
    public final List<Sticker> m137692n() {
        List<MessageIntegrationItem> listM133448l = h39.m133448l();
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(listM133448l)) {
            Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(this.f112071a.f32488f.f82474c);
            int iMin = Math.min(h39.m133455s().integration.limit, listM133448l.size());
            for (int i = 0; i < iMin; i++) {
                if (!jyb.m147479J(listM133448l.get(i).text)) {
                    MessageIntegrationItem messageIntegrationItem = listM133448l.get(i);
                    if ((!NullChecker.m82486a(conversationM34219zp) || !conversationM34219zp.localEverHasMessage || !TextUtils.equals(messageIntegrationItem.type, "prologue")) && (h39.m133429R() || !TextUtils.equals(messageIntegrationItem.type, "exchange"))) {
                        Sticker stickerNew_ = Sticker.new_();
                        stickerNew_.name = messageIntegrationItem.type;
                        stickerNew_.status = (String) g96.m129515b(messageIntegrationItem.text, 1).get(0);
                        arrayList.add(stickerNew_);
                    }
                }
            }
            if (h39.m133421J()) {
                jyb.m147505e0(arrayList, new qcj() { // from class: l.xwy
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Sticker) obj).name, "prologue"));
                    }
                });
                clz clzVar = this.f112071a.f32488f;
                if (clzVar instanceof tvz) {
                    tvz tvzVar = (tvz) clzVar;
                    o6c0 o6c0Var = (o6c0) tvzVar.m193310uc(o6c0.class);
                    if (o6c0Var != null && !tvzVar.m111048t7().m217865b4() && NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.userMessageCount == 0 && !jyb.m147479J(o6c0Var.m166212d())) {
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
    public void m137693o() {
        if (this.f112075e == 10) {
            this.f112077g = qa00.f156336w + qa00.f156321h;
            return;
        }
        if (m137696s()) {
            this.f112077g = f112070j;
            return;
        }
        if (m137695q()) {
            this.f112077g = f112069i + qa00.f156324k;
        } else if (h39.m133418G()) {
            this.f112077g = qa00.f156294G + (qa00.f156322i * 2) + qa00.m175859d(7.0f);
        } else {
            this.f112077g = qa00.f156297J + qa00.f156324k;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m137694p(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f112071a);
        linearLayoutManager.setOrientation(0);
        this.f112074d.setLayoutManager(linearLayoutManager);
        bnl0.m105505C0(this.f112074d, this.f112077g);
        this.f112074d.setNestedScrollingEnabled(true);
        if (this.f112075e == 10) {
            this.f112074d.addItemDecoration(new C17593a(i));
            this.f112074d.setBackgroundResource(g9c0.f102807Y);
            return;
        }
        boolean zM137696s = m137696s();
        RecyclerView recyclerView = this.f112074d;
        if (zM137696s) {
            recyclerView.addItemDecoration(new C17594b());
            this.f112074d.setBackgroundResource(g9c0.f102807Y);
            return;
        }
        recyclerView.addItemDecoration(new C17595c());
        if (m137695q() || !h39.m133418G()) {
            this.f112074d.setBackgroundResource(g9c0.f102810a0);
        } else {
            this.f112074d.setBackgroundResource(ibc0.f114189y5);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m137695q() {
        return m137681r(this.f112075e);
    }

    /* JADX INFO: renamed from: s */
    public boolean m137696s() {
        return h39.m133437a() && m137695q();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m137697t(Runnable runnable) {
        this.f112074d = null;
        this.f112075e = 0;
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m137698u(List list, int i, Pair pair) {
        if (jyb.m147479J((Collection) pair.second)) {
            return;
        }
        i4g0.m138492A("e_chat_icebreak_gif", this.f112071a.pageId(), jyb.m147494Y("other_user_id", this.f112071a.f32488f.mo111034r3()), jyb.m147494Y("search_content", TextUtils.join(Constants.SEPARATOR_COMMA, list)), jyb.m147494Y("chat_source", m137680l(i)));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m137699v(View view) {
        if (NullChecker.m82486a(this.f112078h)) {
            this.f112078h.run();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m137700w(Pair pair) {
        return Boolean.valueOf(TextUtils.equals((CharSequence) pair.first, this.f112071a.m50164y2().m178958l0()));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m137701x(int i, Pair pair) {
        if (jyb.m147479J((Collection) pair.second)) {
            this.f112071a.m50164y2().mo178911Q1(false, new Runnable() { // from class: l.cxy
                @Override // java.lang.Runnable
                public final void run() {
                    hxy.m137675f();
                }
            });
        } else {
            m137687F((List) pair.second, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m137702y(boolean z, final Runnable runnable) {
        if (this.f112074d == null || this.f112075e == 0) {
            return;
        }
        this.f112071a.m50164y2().m178913R1(z && m137695q(), new Runnable() { // from class: l.bxy
            @Override // java.lang.Runnable
            public final void run() {
                this.f78924a.m137697t(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final C22421c<Pair<String, List<Sticker>>> m137703z(final String str, final int i, boolean z) {
        final List<String> listM137690k = null;
        String str2 = "";
        if (i == 1) {
            if (!TextUtils.isEmpty(str)) {
                listM137690k = jyb.m147482M(str);
                str2 = "chat_text_associate";
            }
        } else if (m137681r(i)) {
            listM137690k = m137690k(i);
            str2 = "chat_ice_break";
        }
        return jyb.m147479J(listM137690k) ? C22421c.just(Pair.create(str, new ArrayList())) : this.f112071a.duringCreated(CoreModule.f18264c.f20366Z.m35926o3(listM137690k, z, str2)).map(new qcj() { // from class: l.fxy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Pair.create(str, (List) obj);
            }
        }).doOnNext(new y20() { // from class: l.gxy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107012a.m137698u(listM137690k, i, (Pair) obj);
            }
        });
    }
}
