package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAddTagsGuide;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.c3c0;
import l.et4;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.o7r;
import l.qib0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import l.zzp;
import org.spongycastle.i18n.TextBundle;
import p003l.e30;
import p003l.eb2;
import p003l.m250;
import p003l.qsz;
import p003l.w9j;
import p003l.wp1;
import p014rx.C1099c;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VPager;
import p028v.VPagerCircleIndicator;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAddTagsGuide extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemAddTagsGuide f629a;

    /* JADX INFO: renamed from: b */
    public VText f630b;

    /* JADX INFO: renamed from: c */
    public VImage f631c;

    /* JADX INFO: renamed from: d */
    public VPager f632d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f633e;

    /* JADX INFO: renamed from: f */
    public VButton f634f;

    /* JADX INFO: renamed from: g */
    public List<List<NewTags>> f635g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f636h;

    /* JADX INFO: renamed from: i */
    public Act f637i;

    /* JADX INFO: renamed from: j */
    public String f638j;

    /* JADX INFO: renamed from: k */
    public boolean f639k;

    /* JADX INFO: renamed from: l */
    public List<C0062b> f640l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$a */
    public class C0061a extends eb2 {
        public C0061a() {
        }

        public int getCount() {
            if (vwb.J(ItemAddTagsGuide.this.f635g)) {
                return 0;
            }
            return ItemAddTagsGuide.this.f635g.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: o */
        public void mo923o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo924p(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.b, viewGroup, false);
            GridView gridView = (GridView) viewInflate.findViewById(y4c0.b1);
            gridView.setNumColumns(2);
            gridView.setColumnWidth((xdl0.y0() - t100.d(110.0f)) / 2);
            gridView.setHorizontalSpacing(t100.d(6.0f));
            gridView.setVerticalSpacing(t100.d(6.0f));
            gridView.setAdapter((ListAdapter) ItemAddTagsGuide.this.f640l.get(i));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$b */
    public class C0062b extends wp1<NewTags> {

        /* JADX INFO: renamed from: c */
        public List<NewTags> f642c;

        public C0062b(List<NewTags> list) {
            new ArrayList();
            this.f642c = list;
        }

        /* JADX INFO: renamed from: A */
        public final void m1030A(View view, boolean z) {
            xdl0.A0(ItemAddTagsGuide.this.f637i, view, z ? c3c0.P4 : c3c0.O4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f642c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f642c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            return o7r.a(viewGroup.getContext()).inflate(l6c0.c, viewGroup, false);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, v.VDraweeView] */
        @Override // p003l.wp1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo1005j(final View view, final NewTags newTags, int i, int i2) {
            final ?? r5 = (VDraweeView) view.findViewById(y4c0.A5);
            AppCompatTextView appCompatTextView = (VText) view.findViewById(y4c0.w3);
            m1030A(view, vwb.m(ItemAddTagsGuide.this.f636h, new w9j() { // from class: l.vzp
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).id, newTags.id));
                }
            }));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.wzp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8724a.m1032z(newTags, view, view2);
                }
            });
            if (!TextUtils.isEmpty(newTags.icon)) {
                r5.post(new Runnable() { // from class: l.xzp
                    @Override // java.lang.Runnable
                    public final void run() {
                        qib0.G.L0(r5, newTags.icon);
                    }
                });
            }
            appCompatTextView.setText(newTags.name);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m1032z(final NewTags newTags, View view, View view2) {
            boolean zM = vwb.m(ItemAddTagsGuide.this.f636h, new w9j() { // from class: l.yzp
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).id, newTags.id));
                }
            });
            ItemAddTagsGuide itemAddTagsGuide = ItemAddTagsGuide.this;
            if (zM) {
                itemAddTagsGuide.f636h.remove(newTags);
                m1030A(view, false);
            } else if (itemAddTagsGuide.f636h.size() < 3) {
                ItemAddTagsGuide.this.f636h.add(newTags);
                m1030A(view, true);
            }
            ItemAddTagsGuide itemAddTagsGuide2 = ItemAddTagsGuide.this;
            itemAddTagsGuide2.f634f.setEnabled(itemAddTagsGuide2.f636h.size() >= 3);
            ItemAddTagsGuide itemAddTagsGuide3 = ItemAddTagsGuide.this;
            itemAddTagsGuide3.f634f.setText(String.format("发送（%s/3)", Integer.valueOf(itemAddTagsGuide3.f636h.size())));
        }
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f636h = new ArrayList();
        this.f639k = false;
        this.f640l = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1011a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m1014d(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    private List<List<NewTags>> getData() {
        List listN4 = CoreModule.P().i().N4();
        List arrayList = new ArrayList();
        if (vwb.J(listN4)) {
            return new ArrayList();
        }
        if (!vwb.J(listN4)) {
            Collections.shuffle(listN4);
            arrayList = listN4.subList(0, listN4.size() <= 20 ? listN4.size() : 20);
        }
        return Lists.p(arrayList, 4);
    }

    private Map<String, List<String>> getSendList() {
        HashMap map = new HashMap();
        for (NewTags newTags : this.f636h) {
            String str = (String) newTags.categories.get(0);
            List arrayList = map.containsKey(str) ? (List) map.get(str) : new ArrayList();
            arrayList.add(newTags.name);
            map.put(str, arrayList);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m1019i(View view) {
        zzp.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m1020j(String str) {
        return CoreModule.P().a().x4(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m1021k() {
        for (int i = 0; i < this.f635g.size(); i++) {
            this.f640l.add(new C0062b(this.f635g.get(i)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1099c m1022l(User user, Message message) {
        ArrayList arrayList = new ArrayList();
        Iterator<NewTags> it = this.f636h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().id);
        }
        User userClone = user.clone();
        userClone.profile.extensions.interest.tags = arrayList;
        List listB0 = CoreModule.P().i().B0(arrayList);
        if (NullChecker.a(listB0)) {
            userClone.profile.tags = vwb.Q(listB0.subList(0, Math.min(listB0.size(), 10)), new w9j() { // from class: l.uzp
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return ItemAddTagsGuide.m1014d((NewTags) obj);
                }
            });
        }
        User userSubtract = userClone.subtract(user);
        return NullChecker.a(userSubtract) ? CoreModule.c.e0.u9(userSubtract) : C1099c.just(roj0.a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m1023m(roj0 roj0Var) {
        CoreModule.c.f0.dh(this.f638j, MessageType.get("local_send_tags_text"));
    }

    /* JADX INFO: renamed from: n */
    public void m1024n(Act act, User user, qsz qszVar, String str) {
        if (this.f639k) {
            return;
        }
        this.f637i = act;
        this.f638j = str;
        this.f630b.setText(String.format("选择3个标签，向%s做个自我介绍", user.isFemale() ? "她" : "他"));
        List<List<NewTags>> data = getData();
        this.f635g = data;
        if (vwb.J(data)) {
            return;
        }
        this.f639k = true;
        m1021k();
        this.f632d.setAdapter(new C0061a());
        this.f633e.setViewPager(this.f632d);
        this.f634f.setEnabled(this.f636h.size() >= 3);
        this.f634f.setText(String.format("发送（%s/3)", Integer.valueOf(this.f636h.size())));
        if (!qszVar.m7030a("tag_add_tag_mv_key")) {
            qszVar.m7031b("tag_add_tag_mv_key");
            zvf0.x("e_chat_close_tag", "p_chat_view");
            zvf0.x("e_chat_send_tag", "p_chat_view");
        }
        xdl0.E0(this.f634f, this);
        xdl0.E0(this.f631c, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m1025o() {
        final User userNa = CoreModule.c.e0.na();
        if (userNa == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("简单介绍一下我的个人特点:\n");
        for (Map.Entry<String, List<String>> entry : getSendList().entrySet()) {
            sb.append("我的" + m1020j(entry.getKey()) + "：" + et4.a("、", entry.getValue()) + "\n");
        }
        sb.append("和我聊聊吧～");
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        messageNew_.value = sb.toString();
        this.f637i.duringCreated(CoreModule.c.f0.Dn(this.f638j, messageNew_, (Sticker) null).flatMap(new w9j() { // from class: l.rzp
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f7117a.m1022l(userNa, (Message) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.szp
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7371a.m1023m((roj0) obj);
            }
        }, new e30() { // from class: l.tzp
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemAddTagsGuide.m1011a((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != this.f634f) {
            if (view == this.f631c) {
                zvf0.r("e_chat_close_tag", "p_chat_view");
                tpd0 tpd0VarQ2 = CoreModule.P().i().q2();
                tpd0VarQ2.put(Integer.valueOf(((Integer) tpd0VarQ2.get()).intValue() + 1));
                CoreModule.c.f0.Pf(this.f638j, "local_add_tags_guide");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NewTags newTags : this.f636h) {
            arrayList.add(m1020j((String) newTags.categories.get(0)));
            arrayList2.add(newTags.name);
        }
        zvf0.u("e_chat_send_tag", "p_chat_view", new j760[]{vwb.Y("personal_tag_category", et4.a("，", arrayList)), vwb.Y("personal_tag_name", et4.a("，", arrayList2))});
        CoreModule.c.f0.Pf(this.f638j, "local_add_tags_guide");
        m1025o();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1019i(this);
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ItemAddTagsGuide(Context context) {
        this(context, null);
    }
}
