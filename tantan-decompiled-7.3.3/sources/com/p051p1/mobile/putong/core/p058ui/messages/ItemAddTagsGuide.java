package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddTagsGuide;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.dq1;
import p153l.du4;
import p153l.edc0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.lb2;
import p153l.n100;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.y20;
import p153l.z1q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAddTagsGuide extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemAddTagsGuide f31586a;

    /* JADX INFO: renamed from: b */
    public VText f31587b;

    /* JADX INFO: renamed from: c */
    public VImage f31588c;

    /* JADX INFO: renamed from: d */
    public VPager f31589d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f31590e;

    /* JADX INFO: renamed from: f */
    public VButton f31591f;

    /* JADX INFO: renamed from: g */
    public List<List<NewTags>> f31592g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f31593h;

    /* JADX INFO: renamed from: i */
    public Act f31594i;

    /* JADX INFO: renamed from: j */
    public String f31595j;

    /* JADX INFO: renamed from: k */
    public boolean f31596k;

    /* JADX INFO: renamed from: l */
    public List<C8642b> f31597l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$a */
    public class C8641a extends lb2 {
        public C8641a() {
        }

        @Override // p153l.cf60
        public int getCount() {
            if (jyb.m147479J(ItemAddTagsGuide.this.f31592g)) {
                return 0;
            }
            return ItemAddTagsGuide.this.f31592g.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156994b, viewGroup, false);
            GridView gridView = (GridView) viewInflate.findViewById(edc0.f93331b1);
            gridView.setNumColumns(2);
            gridView.setColumnWidth((bnl0.m105592y0() - qa00.m175859d(110.0f)) / 2);
            gridView.setHorizontalSpacing(qa00.m175859d(6.0f));
            gridView.setVerticalSpacing(qa00.m175859d(6.0f));
            gridView.setAdapter((ListAdapter) ItemAddTagsGuide.this.f31597l.get(i));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide$b */
    public class C8642b extends dq1<NewTags> {

        /* JADX INFO: renamed from: c */
        public List<NewTags> f31599c;

        public C8642b(List<NewTags> list) {
            new ArrayList();
            this.f31599c = list;
        }

        /* JADX INFO: renamed from: A */
        public final void m49138A(View view, boolean z) {
            bnl0.m105501A0(ItemAddTagsGuide.this.f31594i, view, z ? ibc0.f113882P4 : ibc0.f113873O4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f31599c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f31599c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157001c, viewGroup, false);
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo21401j(final View view, final NewTags newTags, int i, int i2) {
            final VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93169A5);
            VText vText = (VText) view.findViewById(edc0.f93480w3);
            m49138A(view, jyb.m147520m(ItemAddTagsGuide.this.f31593h, new qcj() { // from class: l.v1q
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).f21199id, newTags.f21199id));
                }
            }));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.w1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f186836a.m49140z(newTags, view, view2);
                }
            });
            if (!TextUtils.isEmpty(newTags.icon)) {
                vDraweeView.post(new Runnable() { // from class: l.x1q
                    @Override // java.lang.Runnable
                    public final void run() {
                        uqb0.f180374G.m127115L0(vDraweeView, newTags.icon);
                    }
                });
            }
            vText.setText(newTags.name);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m49140z(final NewTags newTags, View view, View view2) {
            boolean zM147520m = jyb.m147520m(ItemAddTagsGuide.this.f31593h, new qcj() { // from class: l.y1q
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((NewTags) obj).f21199id, newTags.f21199id));
                }
            });
            ItemAddTagsGuide itemAddTagsGuide = ItemAddTagsGuide.this;
            if (zM147520m) {
                itemAddTagsGuide.f31593h.remove(newTags);
                m49138A(view, false);
            } else if (itemAddTagsGuide.f31593h.size() < 3) {
                ItemAddTagsGuide.this.f31593h.add(newTags);
                m49138A(view, true);
            }
            ItemAddTagsGuide itemAddTagsGuide2 = ItemAddTagsGuide.this;
            itemAddTagsGuide2.f31591f.setEnabled(itemAddTagsGuide2.f31593h.size() >= 3);
            ItemAddTagsGuide itemAddTagsGuide3 = ItemAddTagsGuide.this;
            itemAddTagsGuide3.f31591f.setText(String.format("发送（%s/3)", Integer.valueOf(itemAddTagsGuide3.f31593h.size())));
        }
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31593h = new ArrayList();
        this.f31596k = false;
        this.f31597l = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49119a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Tag m49122d(NewTags newTags) {
        return new Tag("personality", newTags.name);
    }

    private List<List<NewTags>> getData() {
        List<NewTags> listMo180369N4 = CoreModule.m30933P().m143412i().mo180369N4();
        List<NewTags> arrayList = new ArrayList<>();
        if (jyb.m147479J(listMo180369N4)) {
            return new ArrayList();
        }
        if (!jyb.m147479J(listMo180369N4)) {
            Collections.shuffle(listMo180369N4);
            arrayList = listMo180369N4.subList(0, listMo180369N4.size() <= 20 ? listMo180369N4.size() : 20);
        }
        return Lists.m15983p(arrayList, 4);
    }

    private Map<String, List<String>> getSendList() {
        HashMap map = new HashMap();
        for (NewTags newTags : this.f31593h) {
            String str = newTags.categories.get(0);
            List arrayList = map.containsKey(str) ? (List) map.get(str) : new ArrayList();
            arrayList.add(newTags.name);
            map.put(str, arrayList);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m49127i(View view) {
        z1q.m218364a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final String m49128j(String str) {
        return CoreModule.m30933P().m143405a().mo180561x4(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m49129k() {
        for (int i = 0; i < this.f31592g.size(); i++) {
            this.f31597l.add(new C8642b(this.f31592g.get(i)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C22421c m49130l(User user, Message message) {
        ArrayList arrayList = new ArrayList();
        Iterator<NewTags> it = this.f31593h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f21199id);
        }
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.profile.extensions.interest.tags = arrayList;
        List<NewTags> listMo180297B0 = CoreModule.m30933P().m143412i().mo180297B0(arrayList);
        if (NullChecker.m82486a(listMo180297B0)) {
            userMo225055clone.profile.tags = jyb.m147486Q(listMo180297B0.subList(0, Math.min(listMo180297B0.size(), 10)), new qcj() { // from class: l.u1q
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ItemAddTagsGuide.m49122d((NewTags) obj);
                }
            });
        }
        User userSubtract = userMo225055clone.subtract(user);
        return NullChecker.m82486a(userSubtract) ? CoreModule.f18264c.f20381e0.m116620u9(userSubtract) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m49131m(uxj0 uxj0Var) {
        CoreModule.f18264c.f20384f0.m33933dh(this.f31595j, MessageType.get(MessageType.local_send_tags_text));
    }

    /* JADX INFO: renamed from: n */
    public void m49132n(Act act, User user, n100 n100Var, String str) {
        if (this.f31596k) {
            return;
        }
        this.f31594i = act;
        this.f31595j = str;
        this.f31587b.setText(String.format("选择3个标签，向%s做个自我介绍", user.isFemale() ? "她" : "他"));
        List<List<NewTags>> data = getData();
        this.f31592g = data;
        if (jyb.m147479J(data)) {
            return;
        }
        this.f31596k = true;
        m49129k();
        this.f31589d.setAdapter(new C8641a());
        this.f31590e.setViewPager(this.f31589d);
        this.f31591f.setEnabled(this.f31593h.size() >= 3);
        this.f31591f.setText(String.format("发送（%s/3)", Integer.valueOf(this.f31593h.size())));
        if (!n100Var.m161054a("tag_add_tag_mv_key")) {
            n100Var.m161055b("tag_add_tag_mv_key");
            i4g0.m138526x("e_chat_close_tag", OMSDialogPositon.p_chat_view);
            i4g0.m138526x("e_chat_send_tag", OMSDialogPositon.p_chat_view);
        }
        bnl0.m105509E0(this.f31591f, this);
        bnl0.m105509E0(this.f31588c, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m49133o() {
        final User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("简单介绍一下我的个人特点:\n");
        for (Map.Entry<String, List<String>> entry : getSendList().entrySet()) {
            sb.append("我的" + m49128j(entry.getKey()) + "：" + du4.m118067a("、", entry.getValue()) + SignParameters.NEW_LINE);
        }
        sb.append("和我聊聊吧～");
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = sb.toString();
        this.f31594i.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33626Dn(this.f31595j, messageNew_, null).flatMap(new qcj() { // from class: l.r1q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160845a.m49130l(userM116593na, (Message) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.s1q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165804a.m49131m((uxj0) obj);
            }
        }, new y20() { // from class: l.t1q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemAddTagsGuide.m49119a((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != this.f31591f) {
            if (view == this.f31588c) {
                i4g0.m138520r("e_chat_close_tag", OMSDialogPositon.p_chat_view);
                vxd0 vxd0VarMo180525q2 = CoreModule.m30933P().m143412i().mo180525q2();
                vxd0VarMo180525q2.put(Integer.valueOf(vxd0VarMo180525q2.get().intValue() + 1));
                CoreModule.f18264c.f20384f0.m33765Pf(this.f31595j, MessageType.local_add_tags_guide);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NewTags newTags : this.f31593h) {
            arrayList.add(m49128j(newTags.categories.get(0)));
            arrayList2.add(newTags.name);
        }
        i4g0.m138523u("e_chat_send_tag", OMSDialogPositon.p_chat_view, jyb.m147494Y("personal_tag_category", du4.m118067a("，", arrayList)), jyb.m147494Y("personal_tag_name", du4.m118067a("，", arrayList2)));
        CoreModule.f18264c.f20384f0.m33765Pf(this.f31595j, MessageType.local_add_tags_guide);
        m49133o();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49127i(this);
    }

    public ItemAddTagsGuide(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ItemAddTagsGuide(Context context) {
        this(context, null);
    }
}
