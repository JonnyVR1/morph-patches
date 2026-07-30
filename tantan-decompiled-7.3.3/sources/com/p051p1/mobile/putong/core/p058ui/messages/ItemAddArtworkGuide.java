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
import com.google.common.collect.Lists;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.InterestLevel;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddArtworkGuide;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.dq1;
import p153l.edc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lb2;
import p153l.n100;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.q1q;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.vxd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAddArtworkGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAddArtworkGuide f31571a;

    /* JADX INFO: renamed from: b */
    public VText f31572b;

    /* JADX INFO: renamed from: c */
    public VImage f31573c;

    /* JADX INFO: renamed from: d */
    public VPager f31574d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f31575e;

    /* JADX INFO: renamed from: f */
    public Act f31576f;

    /* JADX INFO: renamed from: g */
    public String f31577g;

    /* JADX INFO: renamed from: h */
    public User f31578h;

    /* JADX INFO: renamed from: i */
    public List<List<Literatures>> f31579i;

    /* JADX INFO: renamed from: j */
    public String f31580j;

    /* JADX INFO: renamed from: k */
    public boolean f31581k;

    /* JADX INFO: renamed from: l */
    public final int f31582l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$a */
    public class C8639a extends lb2 {
        public C8639a() {
        }

        @Override // p153l.cf60
        public int getCount() {
            if (jyb.m147479J(ItemAddArtworkGuide.this.f31579i)) {
                return 0;
            }
            return ItemAddArtworkGuide.this.f31579i.size();
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
            gridView.setNumColumns(3);
            gridView.setColumnWidth(ItemAddArtworkGuide.this.f31582l / 3);
            gridView.setHorizontalSpacing(qa00.m175859d(4.5f));
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            gridView.setAdapter((ListAdapter) itemAddArtworkGuide.new C8640b((List) itemAddArtworkGuide.f31579i.get(i)));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$b */
    public class C8640b extends dq1<Literatures> {

        /* JADX INFO: renamed from: c */
        public List<Literatures> f31584c;

        public C8640b(List<Literatures> list) {
            new ArrayList();
            this.f31584c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f31584c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f31584c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156987a, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int i2 = ItemAddArtworkGuide.this.f31582l / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i2, i2);
            }
            layoutParams.height = (int) ((ItemAddArtworkGuide.this.f31582l * 4.0f) / 9.0f);
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, final Literatures literatures, int i, int i2) {
            final VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93422o1);
            VImage vImage = (VImage) view.findViewById(edc0.f93419n5);
            vDraweeView.post(new Runnable() { // from class: l.o1q
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.f180374G.m127115L0(vDraweeView, literatures.headUrl);
                }
            });
            VText vText = (VText) view.findViewById(edc0.f93503z5);
            m49118z(vImage, literatures.category);
            vText.setText(literatures.title);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.p1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f150189a.m49117y(literatures, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final String m49116w(String str) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1360205346) {
                str.equals("teleplay");
                return InterestLevel.watching;
            }
            if (iHashCode != 3029737) {
                return (iHashCode == 104087344 && str.equals("movie")) ? InterestLevel.watched : InterestLevel.watching;
            }
            return str.equals("book") ? InterestLevel.watched : InterestLevel.watching;
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m49117y(Literatures literatures, View view) {
            i4g0.m138523u("e_chat_send_artwork", OMSDialogPositon.p_chat_view, jyb.m147494Y("artwork_title", literatures.title), jyb.m147494Y("artwork_type", TextUtils.equals(ItemAddArtworkGuide.this.f31580j, "teleplay") ? "tv_show" : ItemAddArtworkGuide.this.f31580j));
            CoreModule.f18264c.f20384f0.m33765Pf(ItemAddArtworkGuide.this.f31577g, MessageType.local_add_artwork_guide);
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            itemAddArtworkGuide.m49110w(itemAddArtworkGuide.f31578h.f56859id, String.format("一起聊聊《%s》吧", literatures.title), literatures.f21175id, m49116w(literatures.category));
        }

        /* JADX INFO: renamed from: z */
        public void m49118z(VImage vImage, String str) {
            vImage.setImageDrawable(CoreModule.m30933P().m143412i().mo180554w3(ItemAddArtworkGuide.this.getContext(), str));
        }
    }

    public ItemAddArtworkGuide(Context context) {
        super(context, null);
        this.f31581k = false;
        this.f31582l = bnl0.m105592y0() - qa00.m175859d(105.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49088a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49091d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m49093f(String str, View view) {
        i4g0.m138520r("e_chat_close_artwork", OMSDialogPositon.p_chat_view);
        vxd0 vxd0Var = CoreModule.f18264c.f20424s1.f20826U;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        CoreModule.f18264c.f20384f0.m33765Pf(str, MessageType.local_add_artwork_guide);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49104q(this);
        bnl0.m105505C0(this.f31574d, (int) ((this.f31582l * 4.0f) / 9.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m49104q(View view) {
        q1q.m174927a(this, view);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final List<List<Literatures>> m49108u(CoreData coreData) {
        List<Literatures> list = CoreModule.f18264c.f20424s1.f20829X;
        if (jyb.m147479J(list)) {
            return new ArrayList();
        }
        HashMap<String, ArrayList<Literatures>> mapM147472C = jyb.m147472C(list, new qcj() { // from class: l.h1q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Literatures) obj).category;
            }
        });
        List<Literatures> list2 = coreData.literatures;
        ArrayList<Literatures> arrayList = new ArrayList();
        ArrayList<Literatures> arrayList2 = new ArrayList<>();
        ArrayList<Literatures> arrayList3 = new ArrayList<>();
        if (jyb.m147479J(list2)) {
            this.f31580j = m49106s(mapM147472C);
        } else {
            for (final Literatures literatures : list2) {
                Literatures literatures2 = (Literatures) jyb.m147529r(list, new qcj() { // from class: l.i1q
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(literatures.f21175id, ((Literatures) obj).f21175id));
                    }
                });
                if (NullChecker.m82486a(literatures2)) {
                    arrayList.add(literatures2);
                }
            }
            if (jyb.m147479J(arrayList)) {
                this.f31580j = m49106s(mapM147472C);
            } else {
                this.f31580j = ((Literatures) arrayList.get(0)).category;
                for (final Literatures literatures3 : arrayList) {
                    if (TextUtils.equals(literatures3.category, this.f31580j)) {
                        arrayList2.add(literatures3);
                        jyb.m147505e0(list, new qcj() { // from class: l.j1q
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((Literatures) obj).f21175id, literatures3.f21175id));
                            }
                        });
                    }
                }
            }
        }
        ArrayList<Literatures> arrayList4 = mapM147472C.get(this.f31580j);
        if (jyb.m147479J(arrayList4)) {
            arrayList2 = arrayList3;
        } else {
            Collections.shuffle(arrayList4);
            if (jyb.m147479J(arrayList2)) {
                arrayList2 = arrayList4;
            } else {
                arrayList2.addAll(arrayList4);
            }
        }
        return Lists.m15983p(arrayList2.subList(0, arrayList2.size() <= 15 ? arrayList2.size() : 15), 3);
    }

    /* JADX INFO: renamed from: s */
    public final String m49106s(HashMap<String, ArrayList<Literatures>> map) {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        return strArr[(int) (Math.random() * ((double) strArr.length))];
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m49107t(pf60 pf60Var) {
        CoreModule.f18264c.f20384f0.m33933dh(this.f31577g, MessageType.get(MessageType.local_send_artwork_text));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m49109v(n100 n100Var, final String str, List list) {
        this.f31579i = list;
        if (jyb.m147479J(list)) {
            return;
        }
        bnl0.m105524M(this, true);
        this.f31581k = true;
        this.f31574d.setAdapter(new C8639a());
        this.f31575e.setViewPager(this.f31574d);
        bnl0.m105525M0(this.f31575e, list.size() != 1);
        m49112y();
        if (!n100Var.m161054a("add_artwork_mv_key")) {
            n100Var.m161055b("add_artwork_mv_key");
            i4g0.m138526x("e_chat_close_artwork", OMSDialogPositon.p_chat_view);
            i4g0.m138492A("e_chat_send_artwork", OMSDialogPositon.p_chat_view, jyb.m147494Y("artwork_type", TextUtils.equals(this.f31580j, "teleplay") ? "tv_show" : this.f31580j));
        }
        bnl0.m105509E0(this.f31573c, new View.OnClickListener() { // from class: l.k1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAddArtworkGuide.m49093f(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m49110w(String str, String str2, final String str3, final String str4) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f21189id = str3;
        messageReferenceNew_.type = "literature";
        this.f31576f.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33652Fn(str, messageNew_, null, false, false).flatMap(new qcj() { // from class: l.l1q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return psd0.m173625r(CoreModule.f18264c.f20384f0.m33653Fo(), CoreModule.f18264c.f20424s1.m35376w3(str3, str4), new rcj() { // from class: l.e1q
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return new pf60((uxj0) obj2, (Boolean) obj3);
                    }
                });
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.m1q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134456a.m49107t((pf60) obj);
            }
        }, new y20() { // from class: l.n1q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemAddArtworkGuide.m49088a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m49111x(Act act, User user, final n100 n100Var, final String str) {
        this.f31576f = act;
        this.f31577g = str;
        this.f31578h = user;
        if (this.f31581k) {
            return;
        }
        act.duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116570i7(user.f56859id).map(new qcj() { // from class: l.d1q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84708a.m49108u((CoreData) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.f1q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96815a.m49109v(n100Var, str, (List) obj);
            }
        }, new y20() { // from class: l.g1q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemAddArtworkGuide.m49091d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m49112y() {
        String str;
        String str2 = this.f31580j;
        str2.getClass();
        switch (str2) {
            case "teleplay":
                str = "选择在追的剧，发给%s聊聊吧";
                break;
            case "book":
                str = "选择喜欢的书，发给%s聊聊吧";
                break;
            case "movie":
                str = "选择喜欢的电影，发给%s聊聊吧";
                break;
            default:
                str = null;
                break;
        }
        this.f31572b.setText(String.format(str, this.f31578h.isFemale() ? "她" : "他"));
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f31581k = false;
        this.f31582l = bnl0.m105592y0() - qa00.m175859d(105.0f);
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31581k = false;
        this.f31582l = bnl0.m105592y0() - qa00.m175859d(105.0f);
    }
}
