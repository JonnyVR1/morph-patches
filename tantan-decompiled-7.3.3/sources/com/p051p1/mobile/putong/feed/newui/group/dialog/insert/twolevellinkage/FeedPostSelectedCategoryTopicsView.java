package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p151v.VButton;
import p151v.VLinear;
import p151v.VMenuBar;
import p151v.VRecyclerView;
import p151v.VSearchBar;
import p153l.a8j0;
import p153l.bnl0;
import p153l.cmg;
import p153l.e9j0;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.o1j0;
import p153l.ovh;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.r4h;
import p153l.tee0;
import p153l.tfj0;
import p153l.urg;
import p153l.w1e;
import p153l.x8j0;
import p153l.y20;
import p153l.zaj0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostSelectedCategoryTopicsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f40862a;

    /* JADX INFO: renamed from: b */
    public VSearchBar f40863b;

    /* JADX INFO: renamed from: c */
    public VLinear f40864c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f40865d;

    /* JADX INFO: renamed from: e */
    public FeedPostSelectedHeader f40866e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f40867f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f40868g;

    /* JADX INFO: renamed from: h */
    public VButton f40869h;

    /* JADX INFO: renamed from: i */
    public a8j0 f40870i;

    /* JADX INFO: renamed from: j */
    public e9j0 f40871j;

    /* JADX INFO: renamed from: k */
    public List<TopicMoment> f40872k;

    /* JADX INFO: renamed from: l */
    public List<TopicMoment> f40873l;

    /* JADX INFO: renamed from: m */
    public TopicCategorie f40874m;

    /* JADX INFO: renamed from: n */
    public urg f40875n;

    /* JADX INFO: renamed from: o */
    public y20<List<TopicMoment>> f40876o;

    /* JADX INFO: renamed from: p */
    public List<TopicCategorie> f40877p;

    /* JADX INFO: renamed from: q */
    public ArrayList<TopicMoment> f40878q;

    /* JADX INFO: renamed from: r */
    public r4h<TopicMoment> f40879r;

    /* JADX INFO: renamed from: s */
    public zaj0 f40880s;

    /* JADX INFO: renamed from: t */
    public String f40881t;

    /* JADX INFO: renamed from: u */
    public h80 f40882u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$a */
    public class C11359a extends h80<TopicMoment> {
        public C11359a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            tfj0.m190942e("e_add_topic_pick", "p_pick_topic", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("topic_attribute", TextUtils.isEmpty(FeedPostSelectedCategoryTopicsView.this.f40881t) ? "1" : "2"));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$b */
    public class C11360b extends RecyclerView.AbstractC0584t {
        public C11360b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                FeedPostSelectedCategoryTopicsView.this.f40863b.clearFocus();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$c */
    public class C11361c extends h80<TopicCategorie> {
        public C11361c() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicCategorie topicCategorie, int i) {
            tfj0.m190942e("e_topic_category", "p_pick_topic", pf60.m172085a("topic_category_name", topicCategorie.name));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicCategorie topicCategorie, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView$d */
    public class C11362d implements TextWatcher {
        public C11362d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FeedPostSelectedCategoryTopicsView.this.m63133D(charSequence);
        }
    }

    public FeedPostSelectedCategoryTopicsView(Context context) {
        super(context);
        this.f40872k = new ArrayList();
        this.f40873l = new ArrayList();
        this.f40877p = new ArrayList();
        this.f40878q = new ArrayList<>();
        this.f40882u = new C11359a();
        m63149u(context);
    }

    private void getChildTopics() {
        if (this.f40874m == null) {
            return;
        }
        this.f40872k.clear();
        for (final String str : this.f40874m.topicIds) {
            this.f40872k.add((TopicMoment) jyb.m147529r(this.f40873l, new qcj() { // from class: l.jvh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((TopicMoment) obj).f40095id));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m63130A(View view) {
        this.f40875n.dismiss();
        w1e.m204401e(this.f40875n.f180614a);
        if (NullChecker.m82486a(this.f40876o)) {
            this.f40876o.call(this.f40878q);
        }
        String str = "";
        for (int i = 0; i < this.f40878q.size(); i++) {
            TopicMoment topicMoment = this.f40878q.get(i);
            str = i == 0 ? topicMoment.f40095id : str + Constants.SEPARATOR_COMMA + topicMoment.f40095id;
        }
        i4g0.m138523u("e_pick_topic_confirm", "p_pick_topic", pf60.m172085a("topic_id_list", str));
    }

    /* JADX INFO: renamed from: B */
    public void m63131B(TopicCategorie topicCategorie) {
        m63141L(topicCategorie);
        getChildTopics();
        this.f40871j.m119927J(this.f40872k);
    }

    /* JADX INFO: renamed from: C */
    public boolean m63132C(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f40878q.size() + 1 > 3) {
            o1j0.m165652z(getResources().getString(R$string.f39985r1), this.f40875n.getWindow().getDecorView());
            return false;
        }
        TopicMoment topicMoment2 = (TopicMoment) jyb.m147529r(this.f40878q, new qcj() { // from class: l.dvh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
            }
        });
        if (NullChecker.m82486a(topicMoment2)) {
            topicMoment.selected = false;
            this.f40878q.remove(topicMoment2);
            return true;
        }
        if (m63139J(topicMoment)) {
            return false;
        }
        topicMoment.selected = true;
        this.f40878q.add(topicMoment);
        i4g0.m138523u("e_add_topic_pick", "p_pick_topic", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("topic_attribute", TextUtils.isEmpty(this.f40881t) ? "1" : "2"));
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m63133D(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f40881t = "";
        } else {
            m63148t(charSequence);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m63134E(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var, Dialog dialog, y20<List<TopicMoment>> y20Var) {
        this.f40875n = (urg) dialog;
        this.f40876o = y20Var;
        if (pf60Var == null) {
            return;
        }
        List<TopicCategorie> list = pf60Var.f152156a;
        this.f40877p = list;
        if (!jyb.m147479J(list)) {
            Iterator<TopicCategorie> it = this.f40877p.iterator();
            while (it.hasNext()) {
                it.next().selected = false;
            }
            m63141L(this.f40877p.get(0));
        }
        List<TopicMoment> list2 = pf60Var.f152157b;
        this.f40873l = list2;
        for (TopicMoment topicMoment : list2) {
            if (topicMoment.selected) {
                this.f40878q.add(topicMoment);
            }
        }
        getChildTopics();
        this.f40870i.m96478J(this.f40877p);
        this.f40871j.m119927J(this.f40872k);
        m63135F();
    }

    /* JADX INFO: renamed from: F */
    public final void m63135F() {
        int size = this.f40878q.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f40866e;
        if (size > 0) {
            feedPostSelectedHeader.f40845f.setVisibility(0);
            this.f40866e.f40841b.setVisibility(0);
            ((x8j0) this.f40879r).m209736F(this.f40878q);
            this.f40879r.notifyDataSetChanged();
        } else {
            feedPostSelectedHeader.f40845f.setVisibility(8);
            this.f40866e.f40841b.setVisibility(8);
        }
        m63136G();
    }

    /* JADX INFO: renamed from: G */
    public final void m63136G() {
        if (cmg.m111186N()) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<TopicMoment> it = this.f40878q.iterator();
            while (it.hasNext()) {
                String str = it.next().group.name;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == 0) {
                this.f40866e.f40843d.setText("");
                this.f40866e.f40844e.setText("");
                return;
            }
            if (arrayList.size() == 1) {
                this.f40866e.f40843d.setText(String.format("(同步到%s", (String) arrayList.get(0)));
                this.f40866e.f40844e.setText("圈子，获得更多曝光)");
                return;
            }
            StringBuilder sb = new StringBuilder("");
            for (String str2 : arrayList) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("，");
                }
                sb.append(str2);
            }
            this.f40866e.f40843d.setText(String.format("(同步到%s", sb));
            this.f40866e.f40844e.setText("等圈子)");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m63137H(tee0<TopicMoment> tee0Var) {
        ArrayList<TopicMoment> arrayList = new ArrayList();
        if (!NullChecker.m82486a(tee0Var) || !tee0Var.m190692a() || jyb.m147479J(tee0Var.f173806b.f152157b)) {
            bnl0.m105524M(this.f40864c, true);
            bnl0.m105524M(this.f40865d, false);
            bnl0.m105524M(this.f40869h, false);
            return;
        }
        arrayList.addAll(tee0Var.f173806b.f152157b);
        for (final TopicMoment topicMoment : arrayList) {
            topicMoment.selected = jyb.m147520m(this.f40878q, new qcj() { // from class: l.kvh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f40095id, topicMoment.f40095id));
                }
            });
        }
        this.f40871j.m119927J(arrayList);
        bnl0.m105524M(this.f40864c, false);
        bnl0.m105524M(this.f40865d, true);
        bnl0.m105524M(this.f40866e, false);
        bnl0.m105524M(this.f40867f, false);
        bnl0.m105524M(this.f40869h, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m63138I() {
        bnl0.m105524M(this.f40864c, false);
        bnl0.m105524M(this.f40865d, false);
        bnl0.m105524M(this.f40869h, false);
        this.f40881t = "";
    }

    /* JADX INFO: renamed from: J */
    public final boolean m63139J(TopicMoment topicMoment) {
        if (jyb.m147479J(this.f40878q)) {
            return false;
        }
        if (this.f40878q.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                o1j0.m165652z("只能添加一条匿名话题", this.f40875n.getWindow().getDecorView());
            } else {
                boolean zM111187O = cmg.m111187O();
                urg urgVar = this.f40875n;
                if (zM111187O) {
                    o1j0.m165652z("你已添加匿名话题，不可同选当前话题", urgVar.getWindow().getDecorView());
                } else {
                    o1j0.m165652z("添加了匿名话题，不能再添加普通话题", urgVar.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM111187O2 = cmg.m111187O();
        urg urgVar2 = this.f40875n;
        if (zM111187O2) {
            o1j0.m165652z("匿名话题与已添加话题不可同选", urgVar2.getWindow().getDecorView());
        } else {
            o1j0.m165652z("添加了普通话题，不能再添加匿名话题", urgVar2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m63140K(TopicMoment topicMoment) {
        if (m63132C(topicMoment)) {
            if (!TextUtils.isEmpty(this.f40881t) && topicMoment.selected) {
                this.f40863b.getCancelText().setVisibility(8);
                this.f40863b.getClearLayout().setVisibility(8);
                this.f40863b.getEditText().setText("");
                this.f40863b.clearFocus();
                m63146r();
            }
            m63135F();
            this.f40871j.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m63141L(TopicCategorie topicCategorie) {
        if (NullChecker.m82486a(this.f40874m)) {
            this.f40874m.selected = false;
        }
        topicCategorie.selected = true;
        this.f40874m = topicCategorie;
    }

    /* JADX INFO: renamed from: M */
    public final void m63142M() {
        this.f40863b.m224446d(new C11362d());
    }

    /* JADX INFO: renamed from: o */
    public View m63143o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ovh.m169435b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final Act m63144p() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m63145q(TopicCategorie topicCategorie) {
        if (topicCategorie.selected) {
            return;
        }
        m63131B(topicCategorie);
        this.f40868g.scrollToPosition(0);
        this.f40870i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r */
    public final void m63146r() {
        m63144p().hideInput(this.f40863b);
        for (final TopicMoment topicMoment : this.f40872k) {
            topicMoment.selected = jyb.m147520m(this.f40878q, new qcj() { // from class: l.lvh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f40095id, topicMoment.f40095id));
                }
            });
        }
        this.f40871j.m119927J(this.f40872k);
        bnl0.m105524M(this.f40864c, false);
        bnl0.m105524M(this.f40865d, true);
        bnl0.m105524M(this.f40866e, true);
        bnl0.m105524M(this.f40867f, true);
        bnl0.m105524M(this.f40869h, true);
        this.f40881t = "";
    }

    /* JADX INFO: renamed from: s */
    public void m63147s(final TopicMoment topicMoment) {
        this.f40878q.remove(topicMoment);
        TopicMoment topicMoment2 = (TopicMoment) jyb.m147529r(this.f40873l, new qcj() { // from class: l.evh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(topicMoment.f40095id.equals(((TopicMoment) obj).f40095id));
            }
        });
        if (NullChecker.m82486a(topicMoment2)) {
            topicMoment2.selected = false;
        }
        m63135F();
        this.f40871j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: t */
    public void m63148t(CharSequence charSequence) {
        String strReplaceAll = Pattern.compile("[^\\x{4e00}-\\x{9fa5}A-Za-z0-9]+").matcher(charSequence.toString()).replaceAll("");
        if (TextUtils.equals(this.f40881t, strReplaceAll)) {
            return;
        }
        this.f40881t = strReplaceAll;
        int length = strReplaceAll.length();
        zaj0 zaj0Var = this.f40880s;
        if (length >= 30) {
            zaj0Var.m102685i(this.f40881t.substring(0, 30));
        } else {
            zaj0Var.m102685i(this.f40881t);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m63149u(Context context) {
        addView(m63143o(LayoutInflater.from(context), this));
        bnl0.m105524M(this.f40863b, cmg.m111230q0());
        m63142M();
        this.f40863b.setCancelListener(new View.OnClickListener() { // from class: l.cvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84005a.m63151w(view);
            }
        });
        this.f40863b.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.fvh
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f101043a.m63152x(view, z);
            }
        });
        zaj0 zaj0Var = new zaj0();
        this.f40880s = zaj0Var;
        zaj0Var.m219128o(new y20() { // from class: l.gvh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106646a.m63153y((tee0) obj);
            }
        });
        this.f40879r = new x8j0(this.f40872k, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f40867f.setLayoutManager(linearLayoutManager);
        e9j0 e9j0Var = new e9j0(m63144p(), this.f40882u);
        this.f40871j = e9j0Var;
        this.f40868g.setAdapter(e9j0Var);
        this.f40868g.setOnScrollListener(new C11360b());
        this.f40870i = new a8j0(m63144p(), new C11361c());
        this.f40879r.m179763t(this.f40866e.f40845f);
        this.f40867f.setAdapter(this.f40870i);
        this.f40870i.m96479K(new y20() { // from class: l.hvh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111760a.m63145q((TopicCategorie) obj);
            }
        });
        this.f40871j.m119928K(new y20() { // from class: l.ivh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117069a.m63140K((TopicMoment) obj);
            }
        });
        m63150v();
    }

    /* JADX INFO: renamed from: v */
    public final void m63150v() {
        this.f40862a.setLeftRegionClick(new View.OnClickListener() { // from class: l.mvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138894a.m63154z(view);
            }
        });
        bnl0.m105509E0(this.f40869h, new View.OnClickListener() { // from class: l.nvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143800a.m63130A(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m63151w(View view) {
        m63146r();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m63152x(View view, boolean z) {
        this.f40863b.setPadding(qa00.m175859d(16.0f), 0, qa00.m175859d(z ? 5.0f : 16.0f), 0);
        if (!z || !TextUtils.isEmpty(this.f40881t)) {
            m63144p().hideInput(this.f40863b);
        } else {
            m63138I();
            i4g0.m138520r("e_search_topic", "p_pick_topic");
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m63153y(tee0 tee0Var) {
        if (NullChecker.m82486a(tee0Var) && TextUtils.equals(this.f40881t, tee0Var.f173807c)) {
            m63137H(tee0Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m63154z(View view) {
        this.f40875n.dismiss();
        w1e.m204401e(this.f40875n.f180614a);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40872k = new ArrayList();
        this.f40873l = new ArrayList();
        this.f40877p = new ArrayList();
        this.f40878q = new ArrayList<>();
        this.f40882u = new C11359a();
        m63149u(context);
    }

    public FeedPostSelectedCategoryTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40872k = new ArrayList();
        this.f40873l = new ArrayList();
        this.f40877p = new ArrayList();
        this.f40878q = new ArrayList<>();
        this.f40882u = new C11359a();
        m63149u(context);
    }
}
