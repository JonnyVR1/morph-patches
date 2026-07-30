package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LabelParams;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VPullUpRecyclerView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class yb30 implements s7m<pb30> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f197275a;

    /* JADX INFO: renamed from: b */
    public VPullUpRecyclerView f197276b;

    /* JADX INFO: renamed from: c */
    public VFrame f197277c;

    /* JADX INFO: renamed from: d */
    public View f197278d;

    /* JADX INFO: renamed from: e */
    public VText f197279e;

    /* JADX INFO: renamed from: f */
    public VText f197280f;

    /* JADX INFO: renamed from: g */
    public final Frag f197281g;

    /* JADX INFO: renamed from: h */
    public final Act f197282h;

    /* JADX INFO: renamed from: i */
    public C21361e f197283i;

    /* JADX INFO: renamed from: j */
    public r66 f197284j;

    /* JADX INFO: renamed from: k */
    public pb30 f197285k;

    /* JADX INFO: renamed from: o */
    public ConversationNewMatchItem f197289o;

    /* JADX INFO: renamed from: l */
    public boolean f197286l = false;

    /* JADX INFO: renamed from: m */
    public final List<Conversation> f197287m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final CountDownTimer f197288n = new CountDownTimerC21357a(1000, 100);

    /* JADX INFO: renamed from: p */
    public int f197290p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f197291q = true;

    /* JADX INFO: renamed from: l.yb30$b */
    public class C21358b extends RecyclerView.AbstractC0576n {
        public C21358b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.m186890d(12.0f);
            } else {
                rect.left = t100.m186890d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.yb30$c */
    public class C21359c extends GridLayoutManager {
        public C21359c(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.yb30$d */
    public class C21360d extends RecyclerView.AbstractC0582t {
        public C21360d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m213924b() {
            yb30.this.f197283i.m213934N(yb30.this.f197287m);
            yb30.this.f197287m.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                yb30 yb30Var = yb30.this;
                if (!yb30Var.m213909B(yb30Var.f197290p)) {
                    yb30.this.m213916K();
                }
                yb30.this.f197286l = false;
                if (vwb.m200296J(yb30.this.f197287m)) {
                    return;
                }
                yb30.this.f197282h.runOnUiThread(new Runnable() { // from class: l.zb30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202418a.m213924b();
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i == 0 && i2 == 0) {
                return;
            }
            yb30.this.f197288n.cancel();
            yb30.this.m213918M();
            yb30.this.f197286l = true;
        }
    }

    /* JADX INFO: renamed from: l.yb30$e */
    public class C21361e extends dac0<Conversation> {

        /* JADX INFO: renamed from: c */
        public boolean f197296c = false;

        /* JADX INFO: renamed from: d */
        public List<Conversation> f197297d = new ArrayList();

        public C21361e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: M */
        public void m213929M(final String str) {
            if (TextUtils.isEmpty(str) || !this.f197296c) {
                return;
            }
            e51.m114742G(new Runnable() { // from class: l.cc30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80203a.m213933L(str);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f197297d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return yb30.this.f197282h.inflater().inflate(f6c0.f95482N7, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Conversation conversation, int i, int i2) {
            ConversationNewMatchItem conversationNewMatchItem = (ConversationNewMatchItem) view;
            conversationNewMatchItem.m41244m();
            conversationNewMatchItem.m41241j(yb30.this.f197281g, this, conversation.f56011id, new e30() { // from class: l.ac30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68773a.m213929M((String) obj);
                }
            }, new e30() { // from class: l.bc30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74900a.m213932K((Conversation) obj);
                }
            }, i2);
            if (this.f197296c && i2 >= this.f197297d.size() - 3 && this.f197297d.size() > 10) {
                yb30.this.f197285k.m168132r0(true);
            }
            hj0.m131318e(conversation, CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser), i2, "p_new_match", false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            if (i < 0 || i >= this.f197297d.size()) {
                return null;
            }
            return this.f197297d.get(i);
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m213932K(Conversation conversation) {
            yb30.this.f197285k.m168126l0(conversation.mo223809clone());
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m213933L(final String str) {
            Conversation conversation = (Conversation) vwb.m200346r(this.f197297d, new w9j() { // from class: l.dc30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56011id, str));
                }
            });
            if (NullChecker.m81303a(conversation)) {
                if (yb30.this.f197286l) {
                    yb30.this.f197287m.add(conversation);
                    return;
                }
                this.f197297d.remove(conversation);
                if (vwb.m200296J(this.f197297d)) {
                    yb30.this.m213917L(new ArrayList(), this.f197296c);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public void m213934N(List<Conversation> list) {
            this.f197297d.removeAll(list);
            if (vwb.m200296J(this.f197297d)) {
                yb30.this.m213917L(new ArrayList(), this.f197296c);
            } else {
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m213935O(List<Conversation> list, boolean z) {
            this.f197296c = z;
            if (list == null) {
                return;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                this.f197297d = arrayList;
                arrayList.addAll(list);
            } else {
                this.f197297d = list;
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return getItem(i).f56011id.hashCode();
        }
    }

    public yb30(Frag frag) {
        this.f197281g = frag;
        this.f197282h = frag.act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m213887C() {
        this.f197276b.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m213888N() {
        VPullUpRecyclerView vPullUpRecyclerView = this.f197276b;
        if (vPullUpRecyclerView != null) {
            vPullUpRecyclerView.post(new Runnable() { // from class: l.vb30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180802a.m213915J();
                }
            });
        }
    }

    /* JADX INFO: renamed from: O */
    private void m213889O() {
        ConversationNewMatchItem conversationNewMatchItem = this.f197289o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m41244m();
            this.f197289o = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DbLinks m213891b() {
        return (DbLinks) qib0.f154722k0.f176630c.query(SchemeKey.conversations);
    }

    /* JADX INFO: renamed from: A */
    public final int m213908A() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f197276b.getLayoutManager();
        if (gridLayoutManager == null) {
            return -1;
        }
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int i = iFindFirstVisibleItemPosition + 2;
        return i > gridLayoutManager.findLastVisibleItemPosition() ? iFindFirstVisibleItemPosition : i;
    }

    /* JADX INFO: renamed from: B */
    public boolean m213909B(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f197276b.getLayoutManager();
        if (gridLayoutManager == null) {
            return false;
        }
        return i >= gridLayoutManager.findFirstVisibleItemPosition() && i <= gridLayoutManager.findLastVisibleItemPosition();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197282h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m213910E(String str) {
        zvf0.m220399u("e_fast_filtrate", "p_new_match", j760.m140076a("filtrate_tag", str), j760.m140076a("tag_state", Integer.valueOf(!this.f197285k.f148036a.contains(str) ? 1 : 0)));
        boolean zContains = this.f197285k.f148036a.contains(str);
        pb30 pb30Var = this.f197285k;
        if (zContains) {
            pb30Var.f148036a.remove(str);
        } else {
            pb30Var.f148036a.add(str);
        }
        zvf0.m220368A("e_fast_filtrate", "p_new_match", j760.m140076a("filtrate_tag", this.f197285k.m168127m0()));
        this.f197284j.notifyDataSetChanged();
        e51.m114741F(act(), new Runnable() { // from class: l.ub30
            @Override // java.lang.Runnable
            public final void run() {
                this.f175672a.m213887C();
            }
        });
        this.f197285k.m168132r0(false);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m213911F(String str) {
        return Boolean.valueOf(this.f197285k.f148036a.contains(str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m213912G(DbLinks dbLinks) {
        if (!NullChecker.m81303a(dbLinks) || TextUtils.isEmpty(dbLinks.links.next)) {
            this.f197291q = false;
            m213889O();
            this.f197288n.cancel();
            this.f197288n.start();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m213913H(View view) {
        ((NewMainAct) this.f197282h).m39928t3(TabName.Card, false);
        zvf0.m220396r("e_go_to_swipe", "p_new_match");
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m213914I(View view) {
        m213922z();
        m213916K();
        zvf0.m220396r("e_reset_filtrate", "p_new_match");
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m213915J() {
        GridLayoutManager gridLayoutManager;
        ConversationNewMatchItem conversationNewMatchItem;
        int iM213908A = m213908A();
        if (iM213908A < 0 || this.f197290p == iM213908A || (gridLayoutManager = (GridLayoutManager) this.f197276b.getLayoutManager()) == null || (conversationNewMatchItem = (ConversationNewMatchItem) gridLayoutManager.findViewByPosition(iM213908A)) == null) {
            return;
        }
        this.f197290p = iM213908A;
        this.f197289o = conversationNewMatchItem;
        conversationNewMatchItem.m41243l();
    }

    /* JADX INFO: renamed from: K */
    public void m213916K() {
        if (this.f197291q) {
            C22306c.fromCallable(new Callable() { // from class: l.wb30
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return yb30.m213891b();
                }
            }).take(1).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.xb30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191862a.m213912G((DbLinks) obj);
                }
            }));
            return;
        }
        m213889O();
        this.f197288n.cancel();
        this.f197288n.start();
    }

    /* JADX INFO: renamed from: L */
    public void m213917L(List<Conversation> list, boolean z) {
        Conversation item;
        int iIntValue;
        int iM186890d;
        String str;
        String str2;
        if (this.f197283i == null) {
            C21361e c21361e = new C21361e();
            this.f197283i = c21361e;
            c21361e.setHasStableIds(true);
            this.f197276b.setAdapter(this.f197283i);
        }
        this.f197283i.m213935O(list, z);
        if (vwb.m200296J(list)) {
            if (CoreModule.f17545c.f19639e0.f149408k3.get().intValue() == 0 || CoreModule.f17545c.f19639e0.f149416l3.get().intValue() == 0) {
                iIntValue = t100.m186889c().heightPixels;
                iM186890d = t100.m186890d(340.0f);
            } else {
                iIntValue = CoreModule.f17545c.f19639e0.f149408k3.get().intValue() - CoreModule.f17545c.f19639e0.f149416l3.get().intValue();
                iM186890d = t100.m186890d(44.0f);
            }
            xdl0.m208325C0(this.f197277c, iIntValue - iM186890d);
            xdl0.m208360X(this.f197277c, t100.m186890d(46.0f));
            xdl0.m208344M(this.f197277c, true);
            xdl0.m208344M(this.f197276b, false);
            int i = x2c0.f189725S7;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.sb30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163499a.m213913H(view);
                }
            };
            if (z) {
                i = x2c0.f189701Re;
                onClickListener = new View.OnClickListener() { // from class: l.tb30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f169218a.m213914I(view);
                    }
                };
                zvf0.m220402x("e_reset_filtrate", "p_new_match");
                str = "没有找到符合条件的配对好友\n你可以减少筛选项试试。";
                str2 = "重置筛选";
            } else {
                zvf0.m220402x("e_go_to_swipe", "p_new_match");
                str = "暂无新配对\n去划卡认识新朋友吧";
                str2 = "去划卡";
            }
            this.f197278d.setBackgroundResource(i);
            this.f197279e.setText(str);
            this.f197280f.setText(str2);
            xdl0.m208329E0(this.f197280f, onClickListener);
            this.f197280f.getPaint().setFakeBoldText(true);
        } else {
            xdl0.m208344M(this.f197277c, false);
            xdl0.m208344M(this.f197276b, true);
        }
        this.f197284j.notifyDataSetChanged();
        int i2 = this.f197290p;
        if (i2 >= 0 && this.f197289o != null && ((item = this.f197283i.getItem(i2)) == null || this.f197289o.m41245n() == null || !TextUtils.equals(item.f56011id, this.f197289o.m41245n().f56011id))) {
            this.f197290p = -1;
            this.f197289o = null;
        }
        m213916K();
    }

    /* JADX INFO: renamed from: M */
    public final void m213918M() {
        ConversationNewMatchItem conversationNewMatchItem = this.f197289o;
        if (conversationNewMatchItem != null) {
            conversationNewMatchItem.m41242k();
            this.f197289o = null;
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM213920x = m213920x(layoutInflater, viewGroup);
        m213919r();
        return viewM213920x;
    }

    /* JADX INFO: renamed from: r */
    public void m213919r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f197282h);
        linearLayoutManager.setOrientation(0);
        this.f197275a.setLayoutManager(linearLayoutManager);
        this.f197275a.addItemDecoration(new C21358b());
        this.f197284j = new r66(new e30() { // from class: l.qb30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153616a.m213910E((String) obj);
            }
        }, new w9j() { // from class: l.rb30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158583a.m213911F((String) obj);
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
        this.f197284j.m178047J(arrayList);
        this.f197275a.setAdapter(this.f197284j);
        this.f197276b.setLayoutManager(new C21359c(act(), 2));
        this.f197276b.addOnScrollListener(new C21360d());
    }

    /* JADX INFO: renamed from: x */
    public View m213920x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ec30.m115658b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pb30 pb30Var) {
        this.f197285k = pb30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m213922z() {
        boolean zM200296J = vwb.m200296J(this.f197285k.f148036a);
        this.f197285k.m168125k0();
        if (NullChecker.m81303a(this.f197284j)) {
            this.f197284j.notifyDataSetChanged();
        }
        this.f197285k.f148040e.onNext(roj0.f160388a);
        if (zM200296J) {
            return;
        }
        this.f197276b.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: l.yb30$a */
    public class CountDownTimerC21357a extends CountDownTimer {
        public CountDownTimerC21357a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            yb30.this.m213888N();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
