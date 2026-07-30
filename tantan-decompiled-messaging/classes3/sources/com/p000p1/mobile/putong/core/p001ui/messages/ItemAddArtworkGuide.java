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
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAddArtworkGuide;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.o7r;
import l.qib0;
import l.qzp;
import l.roj0;
import l.t100;
import l.tpd0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.e30;
import p003l.eb2;
import p003l.m250;
import p003l.qsz;
import p003l.w9j;
import p003l.wp1;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VPager;
import p028v.VPagerCircleIndicator;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAddArtworkGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAddArtworkGuide f614a;

    /* JADX INFO: renamed from: b */
    public VText f615b;

    /* JADX INFO: renamed from: c */
    public VImage f616c;

    /* JADX INFO: renamed from: d */
    public VPager f617d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f618e;

    /* JADX INFO: renamed from: f */
    public Act f619f;

    /* JADX INFO: renamed from: g */
    public String f620g;

    /* JADX INFO: renamed from: h */
    public User f621h;

    /* JADX INFO: renamed from: i */
    public List<List<Literatures>> f622i;

    /* JADX INFO: renamed from: j */
    public String f623j;

    /* JADX INFO: renamed from: k */
    public boolean f624k;

    /* JADX INFO: renamed from: l */
    public final int f625l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$a */
    public class C0059a extends eb2 {
        public C0059a() {
        }

        public int getCount() {
            if (vwb.J(ItemAddArtworkGuide.this.f622i)) {
                return 0;
            }
            return ItemAddArtworkGuide.this.f622i.size();
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
            gridView.setNumColumns(3);
            gridView.setColumnWidth(ItemAddArtworkGuide.this.f625l / 3);
            gridView.setHorizontalSpacing(t100.d(4.5f));
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            gridView.setAdapter((ListAdapter) itemAddArtworkGuide.new C0060b((List) itemAddArtworkGuide.f622i.get(i)));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$b */
    public class C0060b extends wp1<Literatures> {

        /* JADX INFO: renamed from: c */
        public List<Literatures> f627c;

        public C0060b(List<Literatures> list) {
            new ArrayList();
            this.f627c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f627c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f627c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.a, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int i2 = ItemAddArtworkGuide.this.f625l / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i2, i2);
            }
            layoutParams.height = (int) ((ItemAddArtworkGuide.this.f625l * 4.0f) / 9.0f);
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, v.VDraweeView] */
        @Override // p003l.wp1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, final Literatures literatures, int i, int i2) {
            final ?? r4 = (VDraweeView) view.findViewById(y4c0.o1);
            VImage vImage = (VImage) view.findViewById(y4c0.n5);
            r4.post(new Runnable() { // from class: l.ozp
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.G.L0(r4, literatures.headUrl);
                }
            });
            AppCompatTextView appCompatTextView = (VText) view.findViewById(y4c0.z5);
            m1010z(vImage, literatures.category);
            appCompatTextView.setText(literatures.title);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.pzp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6555a.m1009y(literatures, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final String m1008w(String str) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1360205346) {
                str.equals("teleplay");
                return "watching";
            }
            if (iHashCode != 3029737) {
                return (iHashCode == 104087344 && str.equals("movie")) ? "watched" : "watching";
            }
            return str.equals("book") ? "watched" : "watching";
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m1009y(Literatures literatures, View view) {
            zvf0.u("e_chat_send_artwork", "p_chat_view", new j760[]{vwb.Y("artwork_title", literatures.title), vwb.Y("artwork_type", TextUtils.equals(ItemAddArtworkGuide.this.f623j, "teleplay") ? "tv_show" : ItemAddArtworkGuide.this.f623j)});
            CoreModule.c.f0.Pf(ItemAddArtworkGuide.this.f620g, "local_add_artwork_guide");
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            itemAddArtworkGuide.m1000w(((DbObject) itemAddArtworkGuide.f621h).id, String.format("一起聊聊《%s》吧", literatures.title), literatures.id, m1008w(literatures.category));
        }

        /* JADX INFO: renamed from: z */
        public void m1010z(VImage vImage, String str) {
            vImage.setImageDrawable(CoreModule.P().i().w3(ItemAddArtworkGuide.this.getContext(), str));
        }
    }

    public ItemAddArtworkGuide(Context context) {
        super(context, null);
        this.f624k = false;
        this.f625l = xdl0.y0() - t100.d(105.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m978a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m981d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m983f(String str, View view) {
        zvf0.r("e_chat_close_artwork", "p_chat_view");
        tpd0 tpd0Var = CoreModule.c.s1.U;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        CoreModule.c.f0.Pf(str, "local_add_artwork_guide");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m994q(this);
        xdl0.C0(this.f617d, (int) ((this.f625l * 4.0f) / 9.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m994q(View view) {
        qzp.a(this, view);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final List<List<Literatures>> m998u(CoreData coreData) {
        List list = CoreModule.c.s1.X;
        if (vwb.J(list)) {
            return new ArrayList();
        }
        HashMap<String, ArrayList<Literatures>> mapC = vwb.C(list, new w9j() { // from class: l.hzp
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ((Literatures) obj).category;
            }
        });
        List<Literatures> list2 = coreData.literatures;
        ArrayList<Literatures> arrayList = new ArrayList();
        ArrayList<Literatures> arrayList2 = new ArrayList<>();
        ArrayList<Literatures> arrayList3 = new ArrayList<>();
        if (vwb.J(list2)) {
            this.f623j = m996s(mapC);
        } else {
            for (final Literatures literatures : list2) {
                Literatures literatures2 = (Literatures) vwb.r(list, new w9j() { // from class: l.izp
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(literatures.id, ((Literatures) obj).id));
                    }
                });
                if (NullChecker.a(literatures2)) {
                    arrayList.add(literatures2);
                }
            }
            if (vwb.J(arrayList)) {
                this.f623j = m996s(mapC);
            } else {
                this.f623j = ((Literatures) arrayList.get(0)).category;
                for (final Literatures literatures3 : arrayList) {
                    if (TextUtils.equals(literatures3.category, this.f623j)) {
                        arrayList2.add(literatures3);
                        vwb.e0(list, new w9j() { // from class: l.jzp
                            @Override // p003l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((Literatures) obj).id, literatures3.id));
                            }
                        });
                    }
                }
            }
        }
        ArrayList<Literatures> arrayList4 = mapC.get(this.f623j);
        if (vwb.J(arrayList4)) {
            arrayList2 = arrayList3;
        } else {
            Collections.shuffle(arrayList4);
            if (vwb.J(arrayList2)) {
                arrayList2 = arrayList4;
            } else {
                arrayList2.addAll(arrayList4);
            }
        }
        return Lists.p(arrayList2.subList(0, arrayList2.size() <= 15 ? arrayList2.size() : 15), 3);
    }

    /* JADX INFO: renamed from: s */
    public final String m996s(HashMap<String, ArrayList<Literatures>> map) {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        return strArr[(int) (Math.random() * ((double) strArr.length))];
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m997t(j760 j760Var) {
        CoreModule.c.f0.dh(this.f620g, MessageType.get("local_send_artwork_text"));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m999v(qsz qszVar, final String str, List list) {
        this.f622i = list;
        if (vwb.J(list)) {
            return;
        }
        xdl0.M(this, true);
        this.f624k = true;
        this.f617d.setAdapter(new C0059a());
        this.f618e.setViewPager(this.f617d);
        xdl0.M0(this.f618e, list.size() != 1);
        m1002y();
        if (!qszVar.m7030a("add_artwork_mv_key")) {
            qszVar.m7031b("add_artwork_mv_key");
            zvf0.x("e_chat_close_artwork", "p_chat_view");
            zvf0.A("e_chat_send_artwork", "p_chat_view", new j760[]{vwb.Y("artwork_type", TextUtils.equals(this.f623j, "teleplay") ? "tv_show" : this.f623j)});
        }
        xdl0.E0(this.f616c, new View.OnClickListener() { // from class: l.kzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAddArtworkGuide.m983f(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m1000w(String str, String str2, final String str3, final String str4) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.id = str3;
        messageReferenceNew_.type = "literature";
        this.f619f.duringCreated(CoreModule.c.f0.Fn(str, messageNew_, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.lzp
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return mkd0.r(CoreModule.c.f0.Fo(), CoreModule.c.s1.w3(str3, str4), new x9j() { // from class: l.ezp
                    @Override // p003l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return new j760((roj0) obj2, (Boolean) obj3);
                    }
                });
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.mzp
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5811a.m997t((j760) obj);
            }
        }, new e30() { // from class: l.nzp
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemAddArtworkGuide.m978a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m1001x(Act act, User user, final qsz qszVar, final String str) {
        this.f619f = act;
        this.f620g = str;
        this.f621h = user;
        if (this.f624k) {
            return;
        }
        act.duringCreated(CoreModule.c.e0.i7(((DbObject) user).id).map(new w9j() { // from class: l.dzp
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3173a.m998u((CoreData) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.fzp
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3774a.m999v(qszVar, str, (List) obj);
            }
        }, new e30() { // from class: l.gzp
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemAddArtworkGuide.m981d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m1002y() {
        String str;
        String str2 = this.f623j;
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
        this.f615b.setText(String.format(str, this.f621h.isFemale() ? "她" : "他"));
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f624k = false;
        this.f625l = xdl0.y0() - t100.d(105.0f);
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f624k = false;
        this.f625l = xdl0.y0() - t100.d(105.0f);
    }
}
