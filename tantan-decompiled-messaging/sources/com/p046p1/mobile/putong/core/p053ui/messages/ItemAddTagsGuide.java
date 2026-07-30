package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddTagsGuide;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.eb2;
import p149l.et4;
import p149l.l6c0;
import p149l.mkd0;
import p149l.o7r;
import p149l.qsz;
import p149l.roj0;
import p149l.t100;
import p149l.tpd0;
import p149l.vwb;
import p149l.w9j;
import p149l.wp1;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;
import p149l.zzp;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAddTagsGuide extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemAddTagsGuide f30738a;

    /* JADX INFO: renamed from: b */
    public VText f30739b;

    /* JADX INFO: renamed from: c */
    public VImage f30740c;

    /* JADX INFO: renamed from: d */
    public VPager f30741d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f30742e;

    /* JADX INFO: renamed from: f */
    public VButton f30743f;

    /* JADX INFO: renamed from: g */
    public List<List<NewTags>> f30744g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f30745h;

    /* JADX INFO: renamed from: i */
    public Act f30746i;

    /* JADX INFO: renamed from: j */
    public String f30747j;

    /* JADX INFO: renamed from: k */
    public boolean f30748k;

    /* JADX INFO: renamed from: l */
    public List<C8479b> f30749l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$a */
    public class C8478a extends eb2 {
        public C8478a() {
        }

        @Override // p149l.w660
        public int getCount() {
            if (vwb.m200296J(ItemAddTagsGuide.this.f30744g)) {
                return 0;
            }
            return ItemAddTagsGuide.this.f30744g.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126438b, viewGroup, false);
            GridView gridView = (GridView) viewInflate.findViewById(y4c0.f196096b1);
            gridView.setNumColumns(2);
            gridView.setColumnWidth((xdl0.m208412y0() - t100.m186890d(110.0f)) / 2);
            gridView.setHorizontalSpacing(t100.m186890d(6.0f));
            gridView.setVerticalSpacing(t100.m186890d(6.0f));
            gridView.setAdapter((ListAdapter) ItemAddTagsGuide.this.f30749l.get(i));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$b */
    public class C8479b extends wp1<NewTags> {

        /* JADX INFO: renamed from: c */
        public List<NewTags> f30751c;

        public C8479b(List<NewTags> list) {
            new ArrayList();
            this.f30751c = list;
        }

        /* JADX INFO: renamed from: A */
        public final void m47955A(View view, boolean z) {
            xdl0.m208321A0(ItemAddTagsGuide.this.f30746i, view, z ? c3c0.f78607P4 : c3c0.f78598O4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f30751c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f30751c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126445c, viewGroup, false);
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo20402j(final View view, final NewTags newTags, int i, int i2) {
            final VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f195934A5);
            VText vText = (VText) view.findViewById(y4c0.f196245w3);
            m47955A(view, vwb.m200337m(ItemAddTagsGuide.this.f30745h, new w9j() { // from class: l.vzp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).f20457id, newTags.f20457id));
                }
            }));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.wzp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f188754a.m47957z(newTags, view, view2);
                }
            });
            if (!TextUtils.isEmpty(newTags.icon)) {
                vDraweeView.post(new Runnable() { // from class: l.xzp
                    @Override // java.lang.Runnable
                    public final void run() {
                        qib0.f154691G.m102331L0(vDraweeView, newTags.icon);
                    }
                });
            }
            vText.setText(newTags.name);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m47957z(final NewTags newTags, View view, View view2) {
            boolean zM200337m = vwb.m200337m(ItemAddTagsGuide.this.f30745h, new w9j() { // from class: l.yzp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).f20457id, newTags.f20457id));
                }
            });
            ItemAddTagsGuide itemAddTagsGuide = ItemAddTagsGuide.this;
            if (zM200337m) {
                itemAddTagsGuide.f30745h.remove(newTags);
                m47955A(view, false);
            } else if (itemAddTagsGuide.f30745h.size() < 3) {
                ItemAddTagsGuide.this.f30745h.add(newTags);
                m47955A(view, true);
            }
            ItemAddTagsGuide itemAddTagsGuide2 = ItemAddTagsGuide.this;
            itemAddTagsGuide2.f30743f.setEnabled(itemAddTagsGuide2.f30745h.size() >= 3);
            ItemAddTagsGuide itemAddTagsGuide3 = ItemAddTagsGuide.this;
            itemAddTagsGuide3.f30743f.setText(String.format("发送（%s/3)", Integer.valueOf(itemAddTagsGuide3.f30745h.size())));
        }
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30745h = new ArrayList();
        this.f30748k = false;
        this.f30749l = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m47936a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m47939d(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    private List<List<NewTags>> getData() {
        List<NewTags> listMo158277N4 = CoreModule.m29935P().m94658i().mo158277N4();
        List<NewTags> arrayList = new ArrayList<>();
        if (vwb.m200296J(listMo158277N4)) {
            return new ArrayList();
        }
        if (!vwb.m200296J(listMo158277N4)) {
            Collections.shuffle(listMo158277N4);
            arrayList = listMo158277N4.subList(0, listMo158277N4.size() <= 20 ? listMo158277N4.size() : 20);
        }
        return Lists.m15929p(arrayList, 4);
    }

    private Map<String, List<String>> getSendList() {
        HashMap map = new HashMap();
        for (NewTags newTags : this.f30745h) {
            String str = newTags.categories.get(0);
            List arrayList = map.containsKey(str) ? (List) map.get(str) : new ArrayList();
            arrayList.add(newTags.name);
            map.put(str, arrayList);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m47944i(View view) {
        zzp.m221026a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m47945j(String str) {
        return CoreModule.m29935P().m94651a().mo158469x4(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m47946k() {
        for (int i = 0; i < this.f30744g.size(); i++) {
            this.f30749l.add(new C8479b(this.f30744g.get(i)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C22306c m47947l(User user, Message message) {
        ArrayList arrayList = new ArrayList();
        Iterator<NewTags> it = this.f30745h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f20457id);
        }
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.profile.extensions.interest.tags = arrayList;
        List<NewTags> listMo158205B0 = CoreModule.m29935P().m94658i().mo158205B0(arrayList);
        if (NullChecker.m81303a(listMo158205B0)) {
            userMo223809clone.profile.tags = vwb.m200303Q(listMo158205B0.subList(0, Math.min(listMo158205B0.size(), 10)), new w9j() { // from class: l.uzp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ItemAddTagsGuide.m47939d((NewTags) obj);
                }
            });
        }
        User userSubtract = userMo223809clone.subtract(user);
        return NullChecker.m81303a(userSubtract) ? CoreModule.f17545c.f19639e0.m169547u9(userSubtract) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m47948m(roj0 roj0Var) {
        CoreModule.f17545c.f19642f0.m32930dh(this.f30747j, MessageType.get(MessageType.local_send_tags_text));
    }

    /* JADX INFO: renamed from: n */
    public void m47949n(Act act, User user, qsz qszVar, String str) {
        if (this.f30748k) {
            return;
        }
        this.f30746i = act;
        this.f30747j = str;
        this.f30739b.setText(String.format("选择3个标签，向%s做个自我介绍", user.isFemale() ? "她" : "他"));
        List<List<NewTags>> data = getData();
        this.f30744g = data;
        if (vwb.m200296J(data)) {
            return;
        }
        this.f30748k = true;
        m47946k();
        this.f30741d.setAdapter(new C8478a());
        this.f30742e.setViewPager(this.f30741d);
        this.f30743f.setEnabled(this.f30745h.size() >= 3);
        this.f30743f.setText(String.format("发送（%s/3)", Integer.valueOf(this.f30745h.size())));
        if (!qszVar.m176377a("tag_add_tag_mv_key")) {
            qszVar.m176378b("tag_add_tag_mv_key");
            zvf0.m220402x("e_chat_close_tag", OMSDialogPositon.p_chat_view);
            zvf0.m220402x("e_chat_send_tag", OMSDialogPositon.p_chat_view);
        }
        xdl0.m208329E0(this.f30743f, this);
        xdl0.m208329E0(this.f30740c, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m47950o() {
        final User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("简单介绍一下我的个人特点:\n");
        for (Map.Entry<String, List<String>> entry : getSendList().entrySet()) {
            sb.append("我的" + m47945j(entry.getKey()) + "：" + et4.m117971a("、", entry.getValue()) + SignParameters.NEW_LINE);
        }
        sb.append("和我聊聊吧～");
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = sb.toString();
        this.f30746i.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32623Dn(this.f30747j, messageNew_, null).flatMap(new w9j() { // from class: l.rzp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161671a.m47947l(userM169520na, (Message) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.szp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167071a.m47948m((roj0) obj);
            }
        }, new e30() { // from class: l.tzp
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemAddTagsGuide.m47936a((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != this.f30743f) {
            if (view == this.f30740c) {
                zvf0.m220396r("e_chat_close_tag", OMSDialogPositon.p_chat_view);
                tpd0 tpd0VarMo158433q2 = CoreModule.m29935P().m94658i().mo158433q2();
                tpd0VarMo158433q2.put(Integer.valueOf(tpd0VarMo158433q2.get().intValue() + 1));
                CoreModule.f17545c.f19642f0.m32762Pf(this.f30747j, MessageType.local_add_tags_guide);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NewTags newTags : this.f30745h) {
            arrayList.add(m47945j(newTags.categories.get(0)));
            arrayList2.add(newTags.name);
        }
        zvf0.m220399u("e_chat_send_tag", OMSDialogPositon.p_chat_view, vwb.m200311Y("personal_tag_category", et4.m117971a("，", arrayList)), vwb.m200311Y("personal_tag_name", et4.m117971a("，", arrayList2)));
        CoreModule.f17545c.f19642f0.m32762Pf(this.f30747j, MessageType.local_add_tags_guide);
        m47950o();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47944i(this);
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ItemAddTagsGuide(Context context) {
        this(context, null);
    }
}
