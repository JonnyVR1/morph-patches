package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

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
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l.e30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.a0j0;
import p007l.c3h;
import p007l.fqg;
import p007l.l80;
import p007l.nkg;
import p007l.o6e0;
import p007l.p6j0;
import p007l.tzi0;
import p007l.v1j0;
import p007l.wyi0;
import p007l.zth;
import v.VButton;
import v.VLinear;
import v.VMenuBar;
import v.VRecyclerView;
import v.VSearchBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostSelectedCategoryTopicsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f1475a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f1476b;

    /* JADX INFO: renamed from: c */
    public VLinear f1477c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1478d;

    /* JADX INFO: renamed from: e */
    public FeedPostSelectedHeader f1479e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f1480f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f1481g;

    /* JADX INFO: renamed from: h */
    public VButton f1482h;

    /* JADX INFO: renamed from: i */
    public wyi0 f1483i;

    /* JADX INFO: renamed from: j */
    public a0j0 f1484j;

    /* JADX INFO: renamed from: k */
    public List<TopicMoment> f1485k;

    /* JADX INFO: renamed from: l */
    public List<TopicMoment> f1486l;

    /* JADX INFO: renamed from: m */
    public TopicCategorie f1487m;

    /* JADX INFO: renamed from: n */
    public fqg f1488n;

    /* JADX INFO: renamed from: o */
    public e30<List<TopicMoment>> f1489o;

    /* JADX INFO: renamed from: p */
    public List<TopicCategorie> f1490p;

    /* JADX INFO: renamed from: q */
    public ArrayList<TopicMoment> f1491q;

    /* JADX INFO: renamed from: r */
    public c3h<TopicMoment> f1492r;

    /* JADX INFO: renamed from: s */
    public v1j0 f1493s;

    /* JADX INFO: renamed from: t */
    public String f1494t;

    /* JADX INFO: renamed from: u */
    public l80 f1495u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$a */
    public class C2040a extends l80<TopicMoment> {
        public C2040a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            p6j0.m12915e("e_add_topic_pick", "p_pick_topic", j760.a("topic_id", topicMoment.f708id), j760.a("topic_attribute", TextUtils.isEmpty(FeedPostSelectedCategoryTopicsView.this.f1494t) ? "1" : "2"));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$b */
    public class C2041b extends RecyclerView.t {
        public C2041b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                FeedPostSelectedCategoryTopicsView.this.f1476b.clearFocus();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$c */
    public class C2042c extends l80<TopicCategorie> {
        public C2042c() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicCategorie topicCategorie, int i) {
            p6j0.m12915e("e_topic_category", "p_pick_topic", j760.a("topic_category_name", topicCategorie.name));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicCategorie topicCategorie, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$d */
    public class C2043d implements TextWatcher {
        public C2043d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FeedPostSelectedCategoryTopicsView.this.m2924D(charSequence);
        }
    }

    public FeedPostSelectedCategoryTopicsView(Context context) {
        super(context);
        this.f1485k = new ArrayList();
        this.f1486l = new ArrayList();
        this.f1490p = new ArrayList();
        this.f1491q = new ArrayList<>();
        this.f1495u = new C2040a();
        m2940u(context);
    }

    private void getChildTopics() {
        if (this.f1487m == null) {
            return;
        }
        this.f1485k.clear();
        for (final String str : this.f1487m.topicIds) {
            this.f1485k.add((TopicMoment) vwb.r(this.f1486l, new w9j() { // from class: l.uth
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((TopicMoment) obj).f708id));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m2921A(View view) {
        this.f1488n.dismiss();
        i0e.e(this.f1488n.f8191a);
        if (NullChecker.a(this.f1489o)) {
            this.f1489o.call(this.f1491q);
        }
        String str = "";
        for (int i = 0; i < this.f1491q.size(); i++) {
            TopicMoment topicMoment = this.f1491q.get(i);
            str = i == 0 ? topicMoment.f708id : str + "," + topicMoment.f708id;
        }
        zvf0.u("e_pick_topic_confirm", "p_pick_topic", new j760[]{j760.a("topic_id_list", str)});
    }

    /* JADX INFO: renamed from: B */
    public void m2922B(TopicCategorie topicCategorie) {
        m2932L(topicCategorie);
        getChildTopics();
        this.f1484j.m8395J(this.f1485k);
    }

    /* JADX INFO: renamed from: C */
    public boolean m2923C(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f1491q.size() + 1 > 3) {
            lsi0.z(getResources().getString(R$string.f598r1), this.f1488n.getWindow().getDecorView());
            return false;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.r(this.f1491q, new w9j() { // from class: l.oth
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
            }
        });
        if (NullChecker.a(topicMoment2)) {
            topicMoment.selected = false;
            this.f1491q.remove(topicMoment2);
            return true;
        }
        if (m2930J(topicMoment)) {
            return false;
        }
        topicMoment.selected = true;
        this.f1491q.add(topicMoment);
        zvf0.u("e_add_topic_pick", "p_pick_topic", new j760[]{j760.a("topic_id", topicMoment.f708id), j760.a("topic_attribute", TextUtils.isEmpty(this.f1494t) ? "1" : "2")});
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m2924D(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f1494t = "";
        } else {
            m2939t(charSequence);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m2925E(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, Dialog dialog, e30<List<TopicMoment>> e30Var) {
        this.f1488n = (fqg) dialog;
        this.f1489o = e30Var;
        if (j760Var == null) {
            return;
        }
        List<TopicCategorie> list = (List) j760Var.a;
        this.f1490p = list;
        if (!vwb.J(list)) {
            Iterator<TopicCategorie> it = this.f1490p.iterator();
            while (it.hasNext()) {
                it.next().selected = false;
            }
            m2932L(this.f1490p.get(0));
        }
        List<TopicMoment> list2 = (List) j760Var.b;
        this.f1486l = list2;
        for (TopicMoment topicMoment : list2) {
            if (topicMoment.selected) {
                this.f1491q.add(topicMoment);
            }
        }
        getChildTopics();
        this.f1483i.m15942J(this.f1490p);
        this.f1484j.m8395J(this.f1485k);
        m2926F();
    }

    /* JADX INFO: renamed from: F */
    public final void m2926F() {
        int size = this.f1491q.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f1479e;
        if (size > 0) {
            feedPostSelectedHeader.f1458f.setVisibility(0);
            this.f1479e.f1454b.setVisibility(0);
            ((tzi0) this.f1492r).m14703F(this.f1491q);
            this.f1492r.notifyDataSetChanged();
        } else {
            feedPostSelectedHeader.f1458f.setVisibility(8);
            this.f1479e.f1454b.setVisibility(8);
        }
        m2927G();
    }

    /* JADX INFO: renamed from: G */
    public final void m2927G() {
        if (nkg.m12216N()) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<TopicMoment> it = this.f1491q.iterator();
            while (it.hasNext()) {
                String str = it.next().group.name;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == 0) {
                this.f1479e.f1456d.setText("");
                this.f1479e.f1457e.setText("");
                return;
            }
            if (arrayList.size() == 1) {
                this.f1479e.f1456d.setText(String.format("(同步到%s", (String) arrayList.get(0)));
                this.f1479e.f1457e.setText("圈子，获得更多曝光)");
                return;
            }
            StringBuilder sb = new StringBuilder("");
            for (String str2 : arrayList) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("，");
                }
                sb.append(str2);
            }
            this.f1479e.f1456d.setText(String.format("(同步到%s", sb));
            this.f1479e.f1457e.setText("等圈子)");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2928H(o6e0<TopicMoment> o6e0Var) {
        ArrayList<TopicMoment> arrayList = new ArrayList();
        if (!NullChecker.a(o6e0Var) || !o6e0Var.m12446a() || vwb.J((Collection) o6e0Var.f11354b.b)) {
            xdl0.M(this.f1477c, true);
            xdl0.M(this.f1478d, false);
            xdl0.M(this.f1482h, false);
            return;
        }
        arrayList.addAll((Collection) o6e0Var.f11354b.b);
        for (final TopicMoment topicMoment : arrayList) {
            topicMoment.selected = vwb.m(this.f1491q, new w9j() { // from class: l.vth
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f708id, topicMoment.f708id));
                }
            });
        }
        this.f1484j.m8395J(arrayList);
        xdl0.M(this.f1477c, false);
        xdl0.M(this.f1478d, true);
        xdl0.M(this.f1479e, false);
        xdl0.M(this.f1480f, false);
        xdl0.M(this.f1482h, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m2929I() {
        xdl0.M(this.f1477c, false);
        xdl0.M(this.f1478d, false);
        xdl0.M(this.f1482h, false);
        this.f1494t = "";
    }

    /* JADX INFO: renamed from: J */
    public final boolean m2930J(TopicMoment topicMoment) {
        if (vwb.J(this.f1491q)) {
            return false;
        }
        if (this.f1491q.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.z("只能添加一条匿名话题", this.f1488n.getWindow().getDecorView());
            } else {
                boolean zM12217O = nkg.m12217O();
                fqg fqgVar = this.f1488n;
                if (zM12217O) {
                    lsi0.z("你已添加匿名话题，不可同选当前话题", fqgVar.getWindow().getDecorView());
                } else {
                    lsi0.z("添加了匿名话题，不能再添加普通话题", fqgVar.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM12217O2 = nkg.m12217O();
        fqg fqgVar2 = this.f1488n;
        if (zM12217O2) {
            lsi0.z("匿名话题与已添加话题不可同选", fqgVar2.getWindow().getDecorView());
        } else {
            lsi0.z("添加了普通话题，不能再添加匿名话题", fqgVar2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m2931K(TopicMoment topicMoment) {
        if (m2923C(topicMoment)) {
            if (!TextUtils.isEmpty(this.f1494t) && topicMoment.selected) {
                this.f1476b.getCancelText().setVisibility(8);
                this.f1476b.getClearLayout().setVisibility(8);
                this.f1476b.getEditText().setText("");
                this.f1476b.clearFocus();
                m2937r();
            }
            m2926F();
            this.f1484j.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2932L(TopicCategorie topicCategorie) {
        if (NullChecker.a(this.f1487m)) {
            this.f1487m.selected = false;
        }
        topicCategorie.selected = true;
        this.f1487m = topicCategorie;
    }

    /* JADX INFO: renamed from: M */
    public final void m2933M() {
        this.f1476b.d(new C2043d());
    }

    /* JADX INFO: renamed from: o */
    public View m2934o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zth.m17539b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final Act m2935p() {
        return getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m2936q(TopicCategorie topicCategorie) {
        if (topicCategorie.selected) {
            return;
        }
        m2922B(topicCategorie);
        this.f1481g.scrollToPosition(0);
        this.f1483i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r */
    public final void m2937r() {
        m2935p().hideInput(this.f1476b);
        for (final TopicMoment topicMoment : this.f1485k) {
            topicMoment.selected = vwb.m(this.f1491q, new w9j() { // from class: l.wth
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f708id, topicMoment.f708id));
                }
            });
        }
        this.f1484j.m8395J(this.f1485k);
        xdl0.M(this.f1477c, false);
        xdl0.M(this.f1478d, true);
        xdl0.M(this.f1479e, true);
        xdl0.M(this.f1480f, true);
        xdl0.M(this.f1482h, true);
        this.f1494t = "";
    }

    /* JADX INFO: renamed from: s */
    public void m2938s(final TopicMoment topicMoment) {
        this.f1491q.remove(topicMoment);
        TopicMoment topicMoment2 = (TopicMoment) vwb.r(this.f1486l, new w9j() { // from class: l.pth
            public final Object call(Object obj) {
                return Boolean.valueOf(topicMoment.f708id.equals(((TopicMoment) obj).f708id));
            }
        });
        if (NullChecker.a(topicMoment2)) {
            topicMoment2.selected = false;
        }
        m2926F();
        this.f1484j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m2939t(CharSequence charSequence) {
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f1494t, strReplaceAll)) {
            return;
        }
        this.f1494t = strReplaceAll;
        int length = strReplaceAll.length();
        v1j0 v1j0Var = this.f1493s;
        if (length >= 30) {
            v1j0Var.m9634i(this.f1494t.substring(0, 30));
        } else {
            v1j0Var.m9634i(this.f1494t);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2940u(Context context) {
        addView(m2934o(LayoutInflater.from(context), this));
        xdl0.M(this.f1476b, nkg.m12260q0());
        m2933M();
        this.f1476b.setCancelListener(new View.OnClickListener() { // from class: l.nth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10879a.m2942w(view);
            }
        });
        this.f1476b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.qth
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f12390a.m2943x(view, z);
            }
        });
        v1j0 v1j0Var = new v1j0();
        this.f1493s = v1j0Var;
        v1j0Var.m15278o(new e30() { // from class: l.rth
            public final void call(Object obj) {
                this.f12734a.m2944y((o6e0) obj);
            }
        });
        this.f1492r = new tzi0(this.f1485k, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f1480f.setLayoutManager(linearLayoutManager);
        a0j0 a0j0Var = new a0j0(m2935p(), this.f1495u);
        this.f1484j = a0j0Var;
        this.f1481g.setAdapter(a0j0Var);
        this.f1481g.setOnScrollListener(new C2041b());
        this.f1483i = new wyi0(m2935p(), new C2042c());
        this.f1492r.m9087t(this.f1479e.f1458f);
        this.f1480f.setAdapter(this.f1483i);
        this.f1483i.m15943K(new e30() { // from class: l.sth
            public final void call(Object obj) {
                this.f13074a.m2936q((TopicCategorie) obj);
            }
        });
        this.f1484j.m8396K(new e30() { // from class: l.tth
            public final void call(Object obj) {
                this.f13417a.m2931K((TopicMoment) obj);
            }
        });
        m2941v();
    }

    /* JADX INFO: renamed from: v */
    public final void m2941v() {
        this.f1475a.setLeftRegionClick(new View.OnClickListener() { // from class: l.xth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15151a.m2945z(view);
            }
        });
        xdl0.E0(this.f1482h, new View.OnClickListener() { // from class: l.yth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15500a.m2921A(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m2942w(View view) {
        m2937r();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m2943x(View view, boolean z) {
        this.f1476b.setPadding(t100.d(16.0f), 0, t100.d(z ? 5.0f : 16.0f), 0);
        if (!z || !TextUtils.isEmpty(this.f1494t)) {
            m2935p().hideInput(this.f1476b);
        } else {
            m2929I();
            zvf0.r("e_search_topic", "p_pick_topic");
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m2944y(o6e0 o6e0Var) {
        if (NullChecker.a(o6e0Var) && TextUtils.equals(this.f1494t, o6e0Var.f11355c)) {
            m2928H(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m2945z(View view) {
        this.f1488n.dismiss();
        i0e.e(this.f1488n.f8191a);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1485k = new ArrayList();
        this.f1486l = new ArrayList();
        this.f1490p = new ArrayList();
        this.f1491q = new ArrayList<>();
        this.f1495u = new C2040a();
        m2940u(context);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1485k = new ArrayList();
        this.f1486l = new ArrayList();
        this.f1490p = new ArrayList();
        this.f1491q = new ArrayList<>();
        this.f1495u = new C2040a();
        m2940u(context);
    }
}
