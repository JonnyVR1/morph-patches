package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p147v.VButton;
import p147v.VLinear;
import p147v.VMenuBar;
import p147v.VRecyclerView;
import p147v.VSearchBar;
import p149l.a0j0;
import p149l.c3h;
import p149l.e30;
import p149l.fqg;
import p149l.i0e;
import p149l.j760;
import p149l.l80;
import p149l.lsi0;
import p149l.nkg;
import p149l.o6e0;
import p149l.p6j0;
import p149l.t100;
import p149l.tzi0;
import p149l.v1j0;
import p149l.vwb;
import p149l.w9j;
import p149l.wyi0;
import p149l.xdl0;
import p149l.zth;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostSelectedCategoryTopicsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f40014a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f40015b;

    /* JADX INFO: renamed from: c */
    public VLinear f40016c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f40017d;

    /* JADX INFO: renamed from: e */
    public FeedPostSelectedHeader f40018e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f40019f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f40020g;

    /* JADX INFO: renamed from: h */
    public VButton f40021h;

    /* JADX INFO: renamed from: i */
    public wyi0 f40022i;

    /* JADX INFO: renamed from: j */
    public a0j0 f40023j;

    /* JADX INFO: renamed from: k */
    public List<TopicMoment> f40024k;

    /* JADX INFO: renamed from: l */
    public List<TopicMoment> f40025l;

    /* JADX INFO: renamed from: m */
    public TopicCategorie f40026m;

    /* JADX INFO: renamed from: n */
    public fqg f40027n;

    /* JADX INFO: renamed from: o */
    public e30<List<TopicMoment>> f40028o;

    /* JADX INFO: renamed from: p */
    public List<TopicCategorie> f40029p;

    /* JADX INFO: renamed from: q */
    public ArrayList<TopicMoment> f40030q;

    /* JADX INFO: renamed from: r */
    public c3h<TopicMoment> f40031r;

    /* JADX INFO: renamed from: s */
    public v1j0 f40032s;

    /* JADX INFO: renamed from: t */
    public String f40033t;

    /* JADX INFO: renamed from: u */
    public l80 f40034u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$a */
    public class C11196a extends l80<TopicMoment> {
        public C11196a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            p6j0.m167671e("e_add_topic_pick", "p_pick_topic", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("topic_attribute", TextUtils.isEmpty(FeedPostSelectedCategoryTopicsView.this.f40033t) ? "1" : "2"));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$b */
    public class C11197b extends RecyclerView.AbstractC0582t {
        public C11197b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                FeedPostSelectedCategoryTopicsView.this.f40015b.clearFocus();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$c */
    public class C11198c extends l80<TopicCategorie> {
        public C11198c() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicCategorie topicCategorie, int i) {
            p6j0.m167671e("e_topic_category", "p_pick_topic", j760.m140076a("topic_category_name", topicCategorie.name));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicCategorie topicCategorie, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$d */
    public class C11199d implements TextWatcher {
        public C11199d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FeedPostSelectedCategoryTopicsView.this.m61950D(charSequence);
        }
    }

    public FeedPostSelectedCategoryTopicsView(Context context) {
        super(context);
        this.f40024k = new ArrayList();
        this.f40025l = new ArrayList();
        this.f40029p = new ArrayList();
        this.f40030q = new ArrayList<>();
        this.f40034u = new C11196a();
        m61966u(context);
    }

    private void getChildTopics() {
        if (this.f40026m == null) {
            return;
        }
        this.f40024k.clear();
        for (final String str : this.f40026m.topicIds) {
            this.f40024k.add((TopicMoment) vwb.m200346r(this.f40025l, new w9j() { // from class: l.uth
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((TopicMoment) obj).f39247id));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m61947A(View view) {
        this.f40027n.dismiss();
        i0e.m133796e(this.f40027n.f98806a);
        if (NullChecker.m81303a(this.f40028o)) {
            this.f40028o.call(this.f40030q);
        }
        String str = "";
        for (int i = 0; i < this.f40030q.size(); i++) {
            TopicMoment topicMoment = this.f40030q.get(i);
            str = i == 0 ? topicMoment.f39247id : str + Constants.SEPARATOR_COMMA + topicMoment.f39247id;
        }
        zvf0.m220399u("e_pick_topic_confirm", "p_pick_topic", j760.m140076a("topic_id_list", str));
    }

    /* JADX INFO: renamed from: B */
    public void m61948B(TopicCategorie topicCategorie) {
        m61958L(topicCategorie);
        getChildTopics();
        this.f40023j.m94431J(this.f40024k);
    }

    /* JADX INFO: renamed from: C */
    public boolean m61949C(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f40030q.size() + 1 > 3) {
            lsi0.m151596z(getResources().getString(R$string.f39137r1), this.f40027n.getWindow().getDecorView());
            return false;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.m200346r(this.f40030q, new w9j() { // from class: l.oth
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
            }
        });
        if (NullChecker.m81303a(topicMoment2)) {
            topicMoment.selected = false;
            this.f40030q.remove(topicMoment2);
            return true;
        }
        if (m61956J(topicMoment)) {
            return false;
        }
        topicMoment.selected = true;
        this.f40030q.add(topicMoment);
        zvf0.m220399u("e_add_topic_pick", "p_pick_topic", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("topic_attribute", TextUtils.isEmpty(this.f40033t) ? "1" : "2"));
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m61950D(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f40033t = "";
        } else {
            m61965t(charSequence);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m61951E(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, Dialog dialog, e30<List<TopicMoment>> e30Var) {
        this.f40027n = (fqg) dialog;
        this.f40028o = e30Var;
        if (j760Var == null) {
            return;
        }
        List<TopicCategorie> list = j760Var.f116564a;
        this.f40029p = list;
        if (!vwb.m200296J(list)) {
            Iterator<TopicCategorie> it = this.f40029p.iterator();
            while (it.hasNext()) {
                it.next().selected = false;
            }
            m61958L(this.f40029p.get(0));
        }
        List<TopicMoment> list2 = j760Var.f116565b;
        this.f40025l = list2;
        for (TopicMoment topicMoment : list2) {
            if (topicMoment.selected) {
                this.f40030q.add(topicMoment);
            }
        }
        getChildTopics();
        this.f40022i.m206108J(this.f40029p);
        this.f40023j.m94431J(this.f40024k);
        m61952F();
    }

    /* JADX INFO: renamed from: F */
    public final void m61952F() {
        int size = this.f40030q.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f40018e;
        if (size > 0) {
            feedPostSelectedHeader.f39997f.setVisibility(0);
            this.f40018e.f39993b.setVisibility(0);
            ((tzi0) this.f40031r).m191199F(this.f40030q);
            this.f40031r.notifyDataSetChanged();
        } else {
            feedPostSelectedHeader.f39997f.setVisibility(8);
            this.f40018e.f39993b.setVisibility(8);
        }
        m61953G();
    }

    /* JADX INFO: renamed from: G */
    public final void m61953G() {
        if (nkg.m159857N()) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<TopicMoment> it = this.f40030q.iterator();
            while (it.hasNext()) {
                String str = it.next().group.name;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == 0) {
                this.f40018e.f39995d.setText("");
                this.f40018e.f39996e.setText("");
                return;
            }
            if (arrayList.size() == 1) {
                this.f40018e.f39995d.setText(String.format("(同步到%s", (String) arrayList.get(0)));
                this.f40018e.f39996e.setText("圈子，获得更多曝光)");
                return;
            }
            StringBuilder sb = new StringBuilder("");
            for (String str2 : arrayList) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("，");
                }
                sb.append(str2);
            }
            this.f40018e.f39995d.setText(String.format("(同步到%s", sb));
            this.f40018e.f39996e.setText("等圈子)");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m61954H(o6e0<TopicMoment> o6e0Var) {
        ArrayList<TopicMoment> arrayList = new ArrayList();
        if (!NullChecker.m81303a(o6e0Var) || !o6e0Var.m162847a() || vwb.m200296J(o6e0Var.f142341b.f116565b)) {
            xdl0.m208344M(this.f40016c, true);
            xdl0.m208344M(this.f40017d, false);
            xdl0.m208344M(this.f40021h, false);
            return;
        }
        arrayList.addAll(o6e0Var.f142341b.f116565b);
        for (final TopicMoment topicMoment : arrayList) {
            topicMoment.selected = vwb.m200337m(this.f40030q, new w9j() { // from class: l.vth
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f39247id, topicMoment.f39247id));
                }
            });
        }
        this.f40023j.m94431J(arrayList);
        xdl0.m208344M(this.f40016c, false);
        xdl0.m208344M(this.f40017d, true);
        xdl0.m208344M(this.f40018e, false);
        xdl0.m208344M(this.f40019f, false);
        xdl0.m208344M(this.f40021h, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m61955I() {
        xdl0.m208344M(this.f40016c, false);
        xdl0.m208344M(this.f40017d, false);
        xdl0.m208344M(this.f40021h, false);
        this.f40033t = "";
    }

    /* JADX INFO: renamed from: J */
    public final boolean m61956J(TopicMoment topicMoment) {
        if (vwb.m200296J(this.f40030q)) {
            return false;
        }
        if (this.f40030q.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.m151596z("只能添加一条匿名话题", this.f40027n.getWindow().getDecorView());
            } else {
                boolean zM159858O = nkg.m159858O();
                fqg fqgVar = this.f40027n;
                if (zM159858O) {
                    lsi0.m151596z("你已添加匿名话题，不可同选当前话题", fqgVar.getWindow().getDecorView());
                } else {
                    lsi0.m151596z("添加了匿名话题，不能再添加普通话题", fqgVar.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM159858O2 = nkg.m159858O();
        fqg fqgVar2 = this.f40027n;
        if (zM159858O2) {
            lsi0.m151596z("匿名话题与已添加话题不可同选", fqgVar2.getWindow().getDecorView());
        } else {
            lsi0.m151596z("添加了普通话题，不能再添加匿名话题", fqgVar2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m61957K(TopicMoment topicMoment) {
        if (m61949C(topicMoment)) {
            if (!TextUtils.isEmpty(this.f40033t) && topicMoment.selected) {
                this.f40015b.getCancelText().setVisibility(8);
                this.f40015b.getClearLayout().setVisibility(8);
                this.f40015b.getEditText().setText("");
                this.f40015b.clearFocus();
                m61963r();
            }
            m61952F();
            this.f40023j.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m61958L(TopicCategorie topicCategorie) {
        if (NullChecker.m81303a(this.f40026m)) {
            this.f40026m.selected = false;
        }
        topicCategorie.selected = true;
        this.f40026m = topicCategorie;
    }

    /* JADX INFO: renamed from: M */
    public final void m61959M() {
        this.f40015b.m223200d(new C11199d());
    }

    /* JADX INFO: renamed from: o */
    public View m61960o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zth.m220126b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final Act m61961p() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m61962q(TopicCategorie topicCategorie) {
        if (topicCategorie.selected) {
            return;
        }
        m61948B(topicCategorie);
        this.f40020g.scrollToPosition(0);
        this.f40022i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r */
    public final void m61963r() {
        m61961p().hideInput(this.f40015b);
        for (final TopicMoment topicMoment : this.f40024k) {
            topicMoment.selected = vwb.m200337m(this.f40030q, new w9j() { // from class: l.wth
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f39247id, topicMoment.f39247id));
                }
            });
        }
        this.f40023j.m94431J(this.f40024k);
        xdl0.m208344M(this.f40016c, false);
        xdl0.m208344M(this.f40017d, true);
        xdl0.m208344M(this.f40018e, true);
        xdl0.m208344M(this.f40019f, true);
        xdl0.m208344M(this.f40021h, true);
        this.f40033t = "";
    }

    /* JADX INFO: renamed from: s */
    public void m61964s(final TopicMoment topicMoment) {
        this.f40030q.remove(topicMoment);
        TopicMoment topicMoment2 = (TopicMoment) vwb.m200346r(this.f40025l, new w9j() { // from class: l.pth
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(topicMoment.f39247id.equals(((TopicMoment) obj).f39247id));
            }
        });
        if (NullChecker.m81303a(topicMoment2)) {
            topicMoment2.selected = false;
        }
        m61952F();
        this.f40023j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m61965t(CharSequence charSequence) {
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f40033t, strReplaceAll)) {
            return;
        }
        this.f40033t = strReplaceAll;
        int length = strReplaceAll.length();
        v1j0 v1j0Var = this.f40032s;
        if (length >= 30) {
            v1j0Var.m114933i(this.f40033t.substring(0, 30));
        } else {
            v1j0Var.m114933i(this.f40033t);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m61966u(Context context) {
        addView(m61960o(LayoutInflater.from(context), this));
        xdl0.m208344M(this.f40015b, nkg.m159901q0());
        m61959M();
        this.f40015b.setCancelListener(new View.OnClickListener() { // from class: l.nth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140473a.m61968w(view);
            }
        });
        this.f40015b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.qth
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f156357a.m61969x(view, z);
            }
        });
        v1j0 v1j0Var = new v1j0();
        this.f40032s = v1j0Var;
        v1j0Var.m196644o(new e30() { // from class: l.rth
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160965a.m61970y((o6e0) obj);
            }
        });
        this.f40031r = new tzi0(this.f40024k, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f40019f.setLayoutManager(linearLayoutManager);
        a0j0 a0j0Var = new a0j0(m61961p(), this.f40034u);
        this.f40023j = a0j0Var;
        this.f40020g.setAdapter(a0j0Var);
        this.f40020g.setOnScrollListener(new C11197b());
        this.f40022i = new wyi0(m61961p(), new C11198c());
        this.f40031r.m105022t(this.f40018e.f39997f);
        this.f40019f.setAdapter(this.f40022i);
        this.f40022i.m206109K(new e30() { // from class: l.sth
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166353a.m61962q((TopicCategorie) obj);
            }
        });
        this.f40023j.m94432K(new e30() { // from class: l.tth
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172027a.m61957K((TopicMoment) obj);
            }
        });
        m61967v();
    }

    /* JADX INFO: renamed from: v */
    public final void m61967v() {
        this.f40014a.setLeftRegionClick(new View.OnClickListener() { // from class: l.xth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194388a.m61971z(view);
            }
        });
        xdl0.m208329E0(this.f40021h, new View.OnClickListener() { // from class: l.yth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199926a.m61947A(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m61968w(View view) {
        m61963r();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m61969x(View view, boolean z) {
        this.f40015b.setPadding(t100.m186890d(16.0f), 0, t100.m186890d(z ? 5.0f : 16.0f), 0);
        if (!z || !TextUtils.isEmpty(this.f40033t)) {
            m61961p().hideInput(this.f40015b);
        } else {
            m61955I();
            zvf0.m220396r("e_search_topic", "p_pick_topic");
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m61970y(o6e0 o6e0Var) {
        if (NullChecker.m81303a(o6e0Var) && TextUtils.equals(this.f40033t, o6e0Var.f142342c)) {
            m61954H(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m61971z(View view) {
        this.f40027n.dismiss();
        i0e.m133796e(this.f40027n.f98806a);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40024k = new ArrayList();
        this.f40025l = new ArrayList();
        this.f40029p = new ArrayList();
        this.f40030q = new ArrayList<>();
        this.f40034u = new C11196a();
        m61966u(context);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40024k = new ArrayList();
        this.f40025l = new ArrayList();
        this.f40029p = new ArrayList();
        this.f40030q = new ArrayList<>();
        this.f40034u = new C11196a();
        m61966u(context);
    }
}
