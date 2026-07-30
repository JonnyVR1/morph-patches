package p009l;

import android.content.Context;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LabelParams;
import com.p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l.dac0;
import l.e30;
import l.e51;
import l.ec30;
import l.f6c0;
import l.j760;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.VFrame;
import v.VPullUpRecyclerView;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yb30 implements s7m<pb30> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f22957a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f22958b;

    /* JADX INFO: renamed from: c */
    public VFrame f22959c;

    /* JADX INFO: renamed from: d */
    public View f22960d;

    /* JADX INFO: renamed from: e */
    public VText f22961e;

    /* JADX INFO: renamed from: f */
    public VText f22962f;

    /* JADX INFO: renamed from: g */
    public final Frag f22963g;

    /* JADX INFO: renamed from: h */
    public final Act f22964h;

    /* JADX INFO: renamed from: i */
    public C1328e f22965i;

    /* JADX INFO: renamed from: j */
    public r66 f22966j;

    /* JADX INFO: renamed from: k */
    public pb30 f22967k;

    /* JADX INFO: renamed from: o */
    public ConversationNewMatchItem f22971o;

    /* JADX INFO: renamed from: l */
    public boolean f22968l = false;

    /* JADX INFO: renamed from: m */
    public final List<Conversation> f22969m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final CountDownTimer f22970n = new CountDownTimerC1324a(1000, 100);

    /* JADX INFO: renamed from: p */
    public int f22972p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f22973q = true;

    /* JADX INFO: renamed from: l.yb30$b */
    public class C1325b extends RecyclerView.n {
        public C1325b() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.d(12.0f);
            } else {
                rect.left = t100.d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.yb30$c */
    public class C1326c extends GridLayoutManager {
        public C1326c(Context context, int i) {
            super(context, i);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.yb30$d */
    public class C1327d extends RecyclerView.t {
        public C1327d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m25251b() {
            yb30.this.f22965i.m25264N(yb30.this.f22969m);
            yb30.this.f22969m.clear();
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                yb30 yb30Var = yb30.this;
                if (!yb30Var.m25234B(yb30Var.f22972p)) {
                    yb30.this.m25242K();
                }
                yb30.this.f22968l = false;
                if (vwb.J(yb30.this.f22969m)) {
                    return;
                }
                yb30.this.f22964h.runOnUiThread(new Runnable() { // from class: l.zb30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23543a.m25251b();
                    }
                });
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            yb30.this.f22970n.cancel();
            yb30.this.m25244M();
            yb30.this.f22968l = true;
        }
    }

    /* JADX INFO: renamed from: l.yb30$e */
    public class C1328e extends dac0<Conversation> {

        /* JADX INFO: renamed from: c */
        public boolean f22978c = false;

        /* JADX INFO: renamed from: d */
        public List<Conversation> f22979d = new ArrayList();

        public C1328e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: M */
        public void m25256M(final String str) {
            if (TextUtils.isEmpty(str) || !this.f22978c) {
                return;
            }
            e51.G(new Runnable() { // from class: l.cc30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10507a.m25263L(str);
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public int m25258C() {
            return this.f22979d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m25259D(ViewGroup viewGroup, int i) {
            return yb30.this.f22964h.inflater().inflate(f6c0.N7, viewGroup, false);
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void m25257A(View view, Conversation conversation, int i, int i2) {
            ConversationNewMatchItem conversationNewMatchItem = (ConversationNewMatchItem) view;
            conversationNewMatchItem.m5350m();
            conversationNewMatchItem.m5347j(yb30.this.f22963g, this, ((DbObject) conversation).id, new e30() { // from class: l.ac30
                public final void call(Object obj) {
                    this.f9378a.m25256M((String) obj);
                }
            }, new e30() { // from class: l.bc30
                public final void call(Object obj) {
                    this.f10007a.m25262K((Conversation) obj);
                }
            }, i2);
            if (this.f22978c && i2 >= this.f22979d.size() - 3 && this.f22979d.size() > 10) {
                yb30.this.f22967k.m20120r0(true);
            }
            hj0.m15858e(conversation, CoreModule.c.e0.Pa(conversation.otherUser), i2, "p_new_match", false);
        }

        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            if (i < 0 || i >= this.f22979d.size()) {
                return null;
            }
            return this.f22979d.get(i);
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m25262K(Conversation conversation) {
            yb30.this.f22967k.m20114l0(conversation.clone());
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m25263L(final String str) {
            Conversation conversation = (Conversation) vwb.r(this.f22979d, new w9j() { // from class: l.dc30
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((DbObject) ((Conversation) obj)).id, str));
                }
            });
            if (NullChecker.a(conversation)) {
                if (yb30.this.f22968l) {
                    yb30.this.f22969m.add(conversation);
                    return;
                }
                this.f22979d.remove(conversation);
                if (vwb.J(this.f22979d)) {
                    yb30.this.m25243L(new ArrayList(), this.f22978c);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public void m25264N(List<Conversation> list) {
            this.f22979d.removeAll(list);
            if (vwb.J(this.f22979d)) {
                yb30.this.m25243L(new ArrayList(), this.f22978c);
            } else {
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m25265O(List<Conversation> list, boolean z) {
            this.f22978c = z;
            if (list == null) {
                return;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                this.f22979d = arrayList;
                arrayList.addAll(list);
            } else {
                this.f22979d = list;
            }
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return ((DbObject) getItem(i)).id.hashCode();
        }
    }

    public yb30(Frag frag) {
        this.f22963g = frag;
        this.f22964h = frag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m25212C() {
        this.f22958b.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m25213N() {
        VPullUpRecyclerView vPullUpRecyclerView = this.f22958b;
        if (vPullUpRecyclerView != null) {
            vPullUpRecyclerView.post(new Runnable() { // from class: l.vb30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21516a.m25241J();
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    private void m25214O() {
        ConversationNewMatchItem conversationNewMatchItem = this.f22971o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m5350m();
            this.f22971o = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m25233A() {
        GridLayoutManager layoutManager = this.f22958b.getLayoutManager();
        if (layoutManager == null) {
            return -1;
        }
        int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        int i = iFindFirstVisibleItemPosition + 2;
        return i > layoutManager.findLastVisibleItemPosition() ? iFindFirstVisibleItemPosition : i;
    }

    /* JADX INFO: renamed from: B */
    public boolean m25234B(int i) {
        GridLayoutManager layoutManager = this.f22958b.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        return i >= layoutManager.findFirstVisibleItemPosition() && i <= layoutManager.findLastVisibleItemPosition();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25235C0() {
        return this.f22964h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m25236E(String str) {
        zvf0.u("e_fast_filtrate", "p_new_match", new j760[]{j760.a("filtrate_tag", str), j760.a("tag_state", Integer.valueOf(!this.f22967k.f18445a.contains(str) ? 1 : 0))});
        boolean zContains = this.f22967k.f18445a.contains(str);
        pb30 pb30Var = this.f22967k;
        if (zContains) {
            pb30Var.f18445a.remove(str);
        } else {
            pb30Var.f18445a.add(str);
        }
        zvf0.A("e_fast_filtrate", "p_new_match", new j760[]{j760.a("filtrate_tag", this.f22967k.m20115m0())});
        this.f22966j.notifyDataSetChanged();
        e51.F(act(), new Runnable() { // from class: l.ub30
            @Override // java.lang.Runnable
            public final void run() {
                this.f21053a.m25212C();
            }
        });
        this.f22967k.m20120r0(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m25237F(String str) {
        return Boolean.valueOf(this.f22967k.f18445a.contains(str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m25238G(DbLinks dbLinks) {
        if (!NullChecker.a(dbLinks) || TextUtils.isEmpty(dbLinks.links.next)) {
            this.f22973q = false;
            m25214O();
            this.f22970n.cancel();
            this.f22970n.start();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m25239H(View view) {
        this.f22964h.m4005t3(TabName.Card, false);
        zvf0.r("e_go_to_swipe", "p_new_match");
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m25240I(View view) {
        m25249z();
        m25242K();
        zvf0.r("e_reset_filtrate", "p_new_match");
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m25241J() {
        GridLayoutManager layoutManager;
        ConversationNewMatchItem conversationNewMatchItem;
        int iM25233A = m25233A();
        if (iM25233A < 0 || this.f22972p == iM25233A || (layoutManager = this.f22958b.getLayoutManager()) == null || (conversationNewMatchItem = (ConversationNewMatchItem) layoutManager.findViewByPosition(iM25233A)) == null) {
            return;
        }
        this.f22972p = iM25233A;
        this.f22971o = conversationNewMatchItem;
        conversationNewMatchItem.m5349l();
    }

    /* JADX INFO: renamed from: K */
    public void m25242K() {
        if (this.f22973q) {
            c.fromCallable(new Callable() { // from class: l.wb30
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qib0.k0.c.query("conversations");
                }
            }).take(1).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.xb30
                public final void call(Object obj) {
                    this.f22495a.m25238G((DbLinks) obj);
                }
            }));
            return;
        }
        m25214O();
        this.f22970n.cancel();
        this.f22970n.start();
    }

    /* JADX INFO: renamed from: L */
    public void m25243L(List<Conversation> list, boolean z) {
        Conversation item;
        int iIntValue;
        int iD;
        String str;
        String str2;
        if (this.f22965i == null) {
            C1328e c1328e = new C1328e();
            this.f22965i = c1328e;
            c1328e.setHasStableIds(true);
            this.f22958b.setAdapter(this.f22965i);
        }
        this.f22965i.m25265O(list, z);
        if (vwb.J(list)) {
            if (((Integer) CoreModule.c.e0.k3.get()).intValue() == 0 || ((Integer) CoreModule.c.e0.l3.get()).intValue() == 0) {
                iIntValue = t100.c().heightPixels;
                iD = t100.d(340.0f);
            } else {
                iIntValue = ((Integer) CoreModule.c.e0.k3.get()).intValue() - ((Integer) CoreModule.c.e0.l3.get()).intValue();
                iD = t100.d(44.0f);
            }
            xdl0.C0(this.f22959c, iIntValue - iD);
            xdl0.X(this.f22959c, t100.d(46.0f));
            xdl0.M(this.f22959c, true);
            xdl0.M(this.f22958b, false);
            int i = x2c0.S7;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.sb30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20151a.m25239H(view);
                }
            };
            if (z) {
                i = x2c0.Re;
                onClickListener = new View.OnClickListener() { // from class: l.tb30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f20599a.m25240I(view);
                    }
                };
                zvf0.x("e_reset_filtrate", "p_new_match");
                str = "没有找到符合条件的配对好友\n你可以减少筛选项试试。";
                str2 = "重置筛选";
            } else {
                zvf0.x("e_go_to_swipe", "p_new_match");
                str = "暂无新配对\n去划卡认识新朋友吧";
                str2 = "去划卡";
            }
            this.f22960d.setBackgroundResource(i);
            this.f22961e.setText(str);
            this.f22962f.setText(str2);
            xdl0.E0(this.f22962f, onClickListener);
            this.f22962f.getPaint().setFakeBoldText(true);
        } else {
            xdl0.M(this.f22959c, false);
            xdl0.M(this.f22958b, true);
        }
        this.f22966j.notifyDataSetChanged();
        int i2 = this.f22972p;
        if (i2 >= 0 && this.f22971o != null && ((item = this.f22965i.getItem(i2)) == null || this.f22971o.m5351n() == null || !TextUtils.equals(((DbObject) item).id, ((DbObject) this.f22971o.m5351n()).id))) {
            this.f22972p = -1;
            this.f22971o = null;
        }
        m25242K();
    }

    /* JADX INFO: renamed from: M */
    public final void m25244M() {
        ConversationNewMatchItem conversationNewMatchItem = this.f22971o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m5348k();
            this.f22971o = null;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM25247x = m25247x(layoutInflater, viewGroup);
        m25246r();
        return viewM25247x;
    }

    /* JADX INFO: renamed from: r */
    public void m25246r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f22964h);
        linearLayoutManager.setOrientation(0);
        this.f22957a.setLayoutManager(linearLayoutManager);
        this.f22957a.addItemDecoration(new C1325b());
        this.f22966j = new r66(new e30() { // from class: l.qb30
            public final void call(Object obj) {
                this.f19125a.m25236E((String) obj);
            }
        }, new w9j() { // from class: l.rb30
            public final Object call(Object obj) {
                return this.f19717a.m25237F((String) obj);
            }
        });
        String[] strArr = {"nearby", "active", "picture"};
        String[] strArr2 = {"附近", "最近活跃", "头像认证"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            LabelParams labelParamsNew_ = LabelParams.new_();
            labelParamsNew_.key = strArr[i];
            labelParamsNew_.value = strArr2[i];
            arrayList.add(labelParamsNew_);
        }
        this.f22966j.m21417J(arrayList);
        this.f22957a.setAdapter(this.f22966j);
        this.f22958b.setLayoutManager(new C1326c(act(), 2));
        this.f22958b.addOnScrollListener(new C1327d());
    }

    /* JADX INFO: renamed from: x */
    public View m25247x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ec30.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m25245i1(pb30 pb30Var) {
        this.f22967k = pb30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m25249z() {
        boolean zJ = vwb.J(this.f22967k.f18445a);
        this.f22967k.m20113k0();
        if (NullChecker.a(this.f22966j)) {
            this.f22966j.notifyDataSetChanged();
        }
        this.f22967k.f18449e.onNext(roj0.a);
        if (zJ) {
            return;
        }
        this.f22958b.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: l.yb30$a */
    public class CountDownTimerC1324a extends CountDownTimer {
        public CountDownTimerC1324a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            yb30.this.m25213N();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    public void destroy() {
    }
}
