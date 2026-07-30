package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LabelParams;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VPullUpRecyclerView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class mk30 implements iam<dk30> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f137197a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f137198b;

    /* JADX INFO: renamed from: c */
    public VFrame f137199c;

    /* JADX INFO: renamed from: d */
    public View f137200d;

    /* JADX INFO: renamed from: e */
    public VText f137201e;

    /* JADX INFO: renamed from: f */
    public VText f137202f;

    /* JADX INFO: renamed from: g */
    public final Frag f137203g;

    /* JADX INFO: renamed from: h */
    public final Act f137204h;

    /* JADX INFO: renamed from: i */
    public C18636e f137205i;

    /* JADX INFO: renamed from: j */
    public w76 f137206j;

    /* JADX INFO: renamed from: k */
    public dk30 f137207k;

    /* JADX INFO: renamed from: o */
    public ConversationNewMatchItem f137211o;

    /* JADX INFO: renamed from: l */
    public boolean f137208l = false;

    /* JADX INFO: renamed from: m */
    public final List<Conversation> f137209m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final CountDownTimer f137210n = new CountDownTimerC18632a(1000, 100);

    /* JADX INFO: renamed from: p */
    public int f137212p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f137213q = true;

    /* JADX INFO: renamed from: l.mk30$b */
    public class C18633b extends RecyclerView.AbstractC0578n {
        public C18633b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = qa00.m175859d(12.0f);
            } else {
                rect.left = qa00.m175859d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.mk30$c */
    public class C18634c extends GridLayoutManager {
        public C18634c(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.mk30$d */
    public class C18635d extends RecyclerView.AbstractC0584t {
        public C18635d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m158689b() {
            mk30.this.f137205i.m158699N(mk30.this.f137209m);
            mk30.this.f137209m.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                mk30 mk30Var = mk30.this;
                if (!mk30Var.m158674B(mk30Var.f137212p)) {
                    mk30.this.m158681K();
                }
                mk30.this.f137208l = false;
                if (jyb.m147479J(mk30.this.f137209m)) {
                    return;
                }
                mk30.this.f137204h.runOnUiThread(new Runnable() { // from class: l.nk30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f142429a.m158689b();
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            mk30.this.f137210n.cancel();
            mk30.this.m158683M();
            mk30.this.f137208l = true;
        }
    }

    /* JADX INFO: renamed from: l.mk30$e */
    public class C18636e extends jic0<Conversation> {

        /* JADX INFO: renamed from: c */
        public boolean f137218c = false;

        /* JADX INFO: renamed from: d */
        public List<Conversation> f137219d = new ArrayList();

        public C18636e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: M */
        public void m158694M(final String str) {
            if (TextUtils.isEmpty(str) || !this.f137218c) {
                return;
            }
            l51.m152887G(new Runnable() { // from class: l.qk30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158090a.m158698L(str);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f137219d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return mk30.this.f137204h.inflater().inflate(kec0.f125648U7, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Conversation conversation, int i, int i2) {
            ConversationNewMatchItem conversationNewMatchItem = (ConversationNewMatchItem) view;
            conversationNewMatchItem.m42255m();
            conversationNewMatchItem.m42252j(mk30.this.f137203g, this, conversation.f56859id, new y20() { // from class: l.ok30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147734a.m158694M((String) obj);
                }
            }, new y20() { // from class: l.pk30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152772a.m158697K((Conversation) obj);
                }
            }, i2);
            if (this.f137218c && i2 >= this.f137219d.size() - 3 && this.f137219d.size() > 10) {
                mk30.this.f137207k.m116203r0(true);
            }
            dj0.m116011e(conversation, CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser), i2, "p_new_match", false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            if (i < 0 || i >= this.f137219d.size()) {
                return null;
            }
            return this.f137219d.get(i);
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m158697K(Conversation conversation) {
            mk30.this.f137207k.m116197l0(conversation.mo225055clone());
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m158698L(final String str) {
            Conversation conversation = (Conversation) jyb.m147529r(this.f137219d, new qcj() { // from class: l.rk30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56859id, str));
                }
            });
            if (NullChecker.m82486a(conversation)) {
                if (mk30.this.f137208l) {
                    mk30.this.f137209m.add(conversation);
                    return;
                }
                this.f137219d.remove(conversation);
                if (jyb.m147479J(this.f137219d)) {
                    mk30.this.m158682L(new ArrayList(), this.f137218c);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public void m158699N(List<Conversation> list) {
            this.f137219d.removeAll(list);
            if (jyb.m147479J(this.f137219d)) {
                mk30.this.m158682L(new ArrayList(), this.f137218c);
            } else {
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m158700O(List<Conversation> list, boolean z) {
            this.f137218c = z;
            if (list == null) {
                return;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                this.f137219d = arrayList;
                arrayList.addAll(list);
            } else {
                this.f137219d = list;
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return getItem(i).f56859id.hashCode();
        }
    }

    public mk30(Frag frag) {
        this.f137203g = frag;
        this.f137204h = frag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m158652C() {
        this.f137198b.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m158653N() {
        VPullUpRecyclerView vPullUpRecyclerView = this.f137198b;
        if (vPullUpRecyclerView != null) {
            vPullUpRecyclerView.post(new Runnable() { // from class: l.jk30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121272a.m158680J();
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    private void m158654O() {
        ConversationNewMatchItem conversationNewMatchItem = this.f137211o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m42255m();
            this.f137211o = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DbLinks m158656b() {
        return (DbLinks) uqb0.f180405k0.f184354c.query(SchemeKey.conversations);
    }

    /* JADX INFO: renamed from: A */
    public final int m158673A() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f137198b.getLayoutManager();
        if (gridLayoutManager == null) {
            return -1;
        }
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int i = iFindFirstVisibleItemPosition + 2;
        return i > gridLayoutManager.findLastVisibleItemPosition() ? iFindFirstVisibleItemPosition : i;
    }

    /* JADX INFO: renamed from: B */
    public boolean m158674B(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f137198b.getLayoutManager();
        if (gridLayoutManager == null) {
            return false;
        }
        return i >= gridLayoutManager.findFirstVisibleItemPosition() && i <= gridLayoutManager.findLastVisibleItemPosition();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f137204h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m158675E(String str) {
        i4g0.m138523u("e_fast_filtrate", "p_new_match", pf60.m172085a("filtrate_tag", str), pf60.m172085a("tag_state", Integer.valueOf(!this.f137207k.f88964a.contains(str) ? 1 : 0)));
        boolean zContains = this.f137207k.f88964a.contains(str);
        dk30 dk30Var = this.f137207k;
        if (zContains) {
            dk30Var.f88964a.remove(str);
        } else {
            dk30Var.f88964a.add(str);
        }
        i4g0.m138492A("e_fast_filtrate", "p_new_match", pf60.m172085a("filtrate_tag", this.f137207k.m116198m0()));
        this.f137206j.notifyDataSetChanged();
        l51.m152886F(act(), new Runnable() { // from class: l.ik30
            @Override // java.lang.Runnable
            public final void run() {
                this.f115322a.m158652C();
            }
        });
        this.f137207k.m116203r0(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m158676F(String str) {
        return Boolean.valueOf(this.f137207k.f88964a.contains(str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m158677G(DbLinks dbLinks) {
        if (!NullChecker.m82486a(dbLinks) || TextUtils.isEmpty(dbLinks.links.next)) {
            this.f137213q = false;
            m158654O();
            this.f137210n.cancel();
            this.f137210n.start();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m158678H(View view) {
        ((NewMainAct) this.f137204h).m40936v3(TabName.Card, false);
        i4g0.m138520r("e_go_to_swipe", "p_new_match");
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m158679I(View view) {
        m158687z();
        m158681K();
        i4g0.m138520r("e_reset_filtrate", "p_new_match");
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m158680J() {
        GridLayoutManager gridLayoutManager;
        ConversationNewMatchItem conversationNewMatchItem;
        int iM158673A = m158673A();
        if (iM158673A < 0 || this.f137212p == iM158673A || (gridLayoutManager = (GridLayoutManager) this.f137198b.getLayoutManager()) == null || (conversationNewMatchItem = (ConversationNewMatchItem) gridLayoutManager.findViewByPosition(iM158673A)) == null) {
            return;
        }
        this.f137212p = iM158673A;
        this.f137211o = conversationNewMatchItem;
        conversationNewMatchItem.m42254l();
    }

    /* JADX INFO: renamed from: K */
    public void m158681K() {
        if (this.f137213q) {
            C22421c.fromCallable(new Callable() { // from class: l.kk30
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return mk30.m158656b();
                }
            }).take(1).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.lk30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132432a.m158677G((DbLinks) obj);
                }
            }));
            return;
        }
        m158654O();
        this.f137210n.cancel();
        this.f137210n.start();
    }

    /* JADX INFO: renamed from: L */
    public void m158682L(List<Conversation> list, boolean z) {
        Conversation item;
        int iIntValue;
        int iM175859d;
        String str;
        String str2;
        if (this.f137205i == null) {
            C18636e c18636e = new C18636e();
            this.f137205i = c18636e;
            c18636e.setHasStableIds(true);
            this.f137198b.setAdapter(this.f137205i);
        }
        this.f137205i.m158700O(list, z);
        if (jyb.m147479J(list)) {
            if (CoreModule.f18264c.f20381e0.f89265k3.get().intValue() == 0 || CoreModule.f18264c.f20381e0.f89273l3.get().intValue() == 0) {
                iIntValue = qa00.m175858c().heightPixels;
                iM175859d = qa00.m175859d(340.0f);
            } else {
                iIntValue = CoreModule.f18264c.f20381e0.f89265k3.get().intValue() - CoreModule.f18264c.f20381e0.f89273l3.get().intValue();
                iM175859d = qa00.m175859d(44.0f);
            }
            bnl0.m105505C0(this.f137199c, iIntValue - iM175859d);
            bnl0.m105540X(this.f137199c, qa00.m175859d(46.0f));
            bnl0.m105524M(this.f137199c, true);
            bnl0.m105524M(this.f137198b, false);
            int i = dbc0.f86592T7;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.gk30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104703a.m158678H(view);
                }
            };
            if (z) {
                i = dbc0.f86184Gf;
                onClickListener = new View.OnClickListener() { // from class: l.hk30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f110374a.m158679I(view);
                    }
                };
                i4g0.m138526x("e_reset_filtrate", "p_new_match");
                str = "没有找到符合条件的配对好友\n你可以减少筛选项试试。";
                str2 = "重置筛选";
            } else {
                i4g0.m138526x("e_go_to_swipe", "p_new_match");
                str = "暂无新配对\n去划卡认识新朋友吧";
                str2 = "去划卡";
            }
            this.f137200d.setBackgroundResource(i);
            this.f137201e.setText(str);
            this.f137202f.setText(str2);
            bnl0.m105509E0(this.f137202f, onClickListener);
            this.f137202f.getPaint().setFakeBoldText(true);
        } else {
            bnl0.m105524M(this.f137199c, false);
            bnl0.m105524M(this.f137198b, true);
        }
        this.f137206j.notifyDataSetChanged();
        int i2 = this.f137212p;
        if (i2 >= 0 && this.f137211o != null && ((item = this.f137205i.getItem(i2)) == null || this.f137211o.m42256n() == null || !TextUtils.equals(item.f56859id, this.f137211o.m42256n().f56859id))) {
            this.f137212p = -1;
            this.f137211o = null;
        }
        m158681K();
    }

    /* JADX INFO: renamed from: M */
    public final void m158683M() {
        ConversationNewMatchItem conversationNewMatchItem = this.f137211o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m42253k();
            this.f137211o = null;
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM158685x = m158685x(layoutInflater, viewGroup);
        m158684r();
        return viewM158685x;
    }

    /* JADX INFO: renamed from: r */
    public void m158684r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f137204h);
        linearLayoutManager.setOrientation(0);
        this.f137197a.setLayoutManager(linearLayoutManager);
        this.f137197a.addItemDecoration(new C18633b());
        this.f137206j = new w76(new y20() { // from class: l.ek30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94341a.m158675E((String) obj);
            }
        }, new qcj() { // from class: l.fk30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99482a.m158676F((String) obj);
            }
        });
        String[] strArr = {"nearby", Active.TYPE, "picture"};
        String[] strArr2 = {"附近", "最近活跃", "头像认证"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            LabelParams labelParamsNew_ = LabelParams.new_();
            labelParamsNew_.key = strArr[i];
            labelParamsNew_.value = strArr2[i];
            arrayList.add(labelParamsNew_);
        }
        this.f137206j.m205233J(arrayList);
        this.f137197a.setAdapter(this.f137206j);
        this.f137198b.setLayoutManager(new C18634c(act(), 2));
        this.f137198b.addOnScrollListener(new C18635d());
    }

    /* JADX INFO: renamed from: x */
    public View m158685x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sk30.m186399b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dk30 dk30Var) {
        this.f137207k = dk30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m158687z() {
        boolean zM147479J = jyb.m147479J(this.f137207k.f88964a);
        this.f137207k.m116196k0();
        if (NullChecker.m82486a(this.f137206j)) {
            this.f137206j.notifyDataSetChanged();
        }
        this.f137207k.f88968e.onNext(uxj0.f181467a);
        if (zM147479J) {
            return;
        }
        this.f137198b.scrollToPosition(0);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.mk30$a */
    public class CountDownTimerC18632a extends CountDownTimer {
        public CountDownTimerC18632a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            mk30.this.m158653N();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }
}
