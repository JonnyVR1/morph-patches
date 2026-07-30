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
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.InterestLevel;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddArtworkGuide;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.e30;
import p149l.eb2;
import p149l.j760;
import p149l.l6c0;
import p149l.mkd0;
import p149l.o7r;
import p149l.qsz;
import p149l.qzp;
import p149l.t100;
import p149l.tpd0;
import p149l.vwb;
import p149l.w9j;
import p149l.wp1;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAddArtworkGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemAddArtworkGuide f30723a;

    /* JADX INFO: renamed from: b */
    public VText f30724b;

    /* JADX INFO: renamed from: c */
    public VImage f30725c;

    /* JADX INFO: renamed from: d */
    public VPager f30726d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f30727e;

    /* JADX INFO: renamed from: f */
    public Act f30728f;

    /* JADX INFO: renamed from: g */
    public String f30729g;

    /* JADX INFO: renamed from: h */
    public User f30730h;

    /* JADX INFO: renamed from: i */
    public List<List<Literatures>> f30731i;

    /* JADX INFO: renamed from: j */
    public String f30732j;

    /* JADX INFO: renamed from: k */
    public boolean f30733k;

    /* JADX INFO: renamed from: l */
    public final int f30734l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$a */
    public class C8476a extends eb2 {
        public C8476a() {
        }

        @Override // p149l.w660
        public int getCount() {
            if (vwb.m200296J(ItemAddArtworkGuide.this.f30731i)) {
                return 0;
            }
            return ItemAddArtworkGuide.this.f30731i.size();
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
            gridView.setNumColumns(3);
            gridView.setColumnWidth(ItemAddArtworkGuide.this.f30734l / 3);
            gridView.setHorizontalSpacing(t100.m186890d(4.5f));
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            gridView.setAdapter((ListAdapter) itemAddArtworkGuide.new C8477b((List) itemAddArtworkGuide.f30731i.get(i)));
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide$b */
    public class C8477b extends wp1<Literatures> {

        /* JADX INFO: renamed from: c */
        public List<Literatures> f30736c;

        public C8477b(List<Literatures> list) {
            new ArrayList();
            this.f30736c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f30736c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f30736c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126431a, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int i2 = ItemAddArtworkGuide.this.f30734l / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i2, i2);
            }
            layoutParams.height = (int) ((ItemAddArtworkGuide.this.f30734l * 4.0f) / 9.0f);
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, final Literatures literatures, int i, int i2) {
            final VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f196187o1);
            VImage vImage = (VImage) view.findViewById(y4c0.f196184n5);
            vDraweeView.post(new Runnable() { // from class: l.ozp
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f154691G.m102331L0(vDraweeView, literatures.headUrl);
                }
            });
            VText vText = (VText) view.findViewById(y4c0.f196268z5);
            m47935z(vImage, literatures.category);
            vText.setText(literatures.title);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.pzp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f151964a.m47934y(literatures, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final String m47933w(String str) {
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
        public final /* synthetic */ void m47934y(Literatures literatures, View view) {
            zvf0.m220399u("e_chat_send_artwork", OMSDialogPositon.p_chat_view, vwb.m200311Y("artwork_title", literatures.title), vwb.m200311Y("artwork_type", TextUtils.equals(ItemAddArtworkGuide.this.f30732j, "teleplay") ? "tv_show" : ItemAddArtworkGuide.this.f30732j));
            CoreModule.f17545c.f19642f0.m32762Pf(ItemAddArtworkGuide.this.f30729g, MessageType.local_add_artwork_guide);
            ItemAddArtworkGuide itemAddArtworkGuide = ItemAddArtworkGuide.this;
            itemAddArtworkGuide.m47927w(itemAddArtworkGuide.f30730h.f56011id, String.format("一起聊聊《%s》吧", literatures.title), literatures.f20433id, m47933w(literatures.category));
        }

        /* JADX INFO: renamed from: z */
        public void m47935z(VImage vImage, String str) {
            vImage.setImageDrawable(CoreModule.m29935P().m94658i().mo158462w3(ItemAddArtworkGuide.this.getContext(), str));
        }
    }

    public ItemAddArtworkGuide(Context context) {
        super(context, null);
        this.f30733k = false;
        this.f30734l = xdl0.m208412y0() - t100.m186890d(105.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m47905a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m47908d(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m47910f(String str, View view) {
        zvf0.m220396r("e_chat_close_artwork", OMSDialogPositon.p_chat_view);
        tpd0 tpd0Var = CoreModule.f17545c.f19682s1.f20084U;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        CoreModule.f17545c.f19642f0.m32762Pf(str, MessageType.local_add_artwork_guide);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47921q(this);
        xdl0.m208325C0(this.f30726d, (int) ((this.f30734l * 4.0f) / 9.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m47921q(View view) {
        qzp.m177277a(this, view);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final List<List<Literatures>> m47925u(CoreData coreData) {
        List<Literatures> list = CoreModule.f17545c.f19682s1.f20087X;
        if (vwb.m200296J(list)) {
            return new ArrayList();
        }
        HashMap<String, ArrayList<Literatures>> mapM200289C = vwb.m200289C(list, new w9j() { // from class: l.hzp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Literatures) obj).category;
            }
        });
        List<Literatures> list2 = coreData.literatures;
        ArrayList<Literatures> arrayList = new ArrayList();
        ArrayList<Literatures> arrayList2 = new ArrayList<>();
        ArrayList<Literatures> arrayList3 = new ArrayList<>();
        if (vwb.m200296J(list2)) {
            this.f30732j = m47923s(mapM200289C);
        } else {
            for (final Literatures literatures : list2) {
                Literatures literatures2 = (Literatures) vwb.m200346r(list, new w9j() { // from class: l.izp
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(literatures.f20433id, ((Literatures) obj).f20433id));
                    }
                });
                if (NullChecker.m81303a(literatures2)) {
                    arrayList.add(literatures2);
                }
            }
            if (vwb.m200296J(arrayList)) {
                this.f30732j = m47923s(mapM200289C);
            } else {
                this.f30732j = ((Literatures) arrayList.get(0)).category;
                for (final Literatures literatures3 : arrayList) {
                    if (TextUtils.equals(literatures3.category, this.f30732j)) {
                        arrayList2.add(literatures3);
                        vwb.m200322e0(list, new w9j() { // from class: l.jzp
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((Literatures) obj).f20433id, literatures3.f20433id));
                            }
                        });
                    }
                }
            }
        }
        ArrayList<Literatures> arrayList4 = mapM200289C.get(this.f30732j);
        if (vwb.m200296J(arrayList4)) {
            arrayList2 = arrayList3;
        } else {
            Collections.shuffle(arrayList4);
            if (vwb.m200296J(arrayList2)) {
                arrayList2 = arrayList4;
            } else {
                arrayList2.addAll(arrayList4);
            }
        }
        return Lists.m15929p(arrayList2.subList(0, arrayList2.size() <= 15 ? arrayList2.size() : 15), 3);
    }

    /* JADX INFO: renamed from: s */
    public final String m47923s(HashMap<String, ArrayList<Literatures>> map) {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        return strArr[(int) (Math.random() * ((double) strArr.length))];
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m47924t(j760 j760Var) {
        CoreModule.f17545c.f19642f0.m32930dh(this.f30729g, MessageType.get(MessageType.local_send_artwork_text));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m47926v(qsz qszVar, final String str, List list) {
        this.f30731i = list;
        if (vwb.m200296J(list)) {
            return;
        }
        xdl0.m208344M(this, true);
        this.f30733k = true;
        this.f30726d.setAdapter(new C8476a());
        this.f30727e.setViewPager(this.f30726d);
        xdl0.m208345M0(this.f30727e, list.size() != 1);
        m47929y();
        if (!qszVar.m176377a("add_artwork_mv_key")) {
            qszVar.m176378b("add_artwork_mv_key");
            zvf0.m220402x("e_chat_close_artwork", OMSDialogPositon.p_chat_view);
            zvf0.m220368A("e_chat_send_artwork", OMSDialogPositon.p_chat_view, vwb.m200311Y("artwork_type", TextUtils.equals(this.f30732j, "teleplay") ? "tv_show" : this.f30732j));
        }
        xdl0.m208329E0(this.f30725c, new View.OnClickListener() { // from class: l.kzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemAddArtworkGuide.m47910f(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m47927w(String str, String str2, final String str3, final String str4) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f20447id = str3;
        messageReferenceNew_.type = "literature";
        this.f30728f.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32649Fn(str, messageNew_, null, false, false).flatMap(new w9j() { // from class: l.lzp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mkd0.m154984r(CoreModule.f17545c.f19642f0.m32650Fo(), CoreModule.f17545c.f19682s1.m34373w3(str3, str4), new x9j() { // from class: l.ezp
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return new j760((roj0) obj2, (Boolean) obj3);
                    }
                });
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.mzp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136409a.m47924t((j760) obj);
            }
        }, new e30() { // from class: l.nzp
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemAddArtworkGuide.m47905a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m47928x(Act act, User user, final qsz qszVar, final String str) {
        this.f30728f = act;
        this.f30729g = str;
        this.f30730h = user;
        if (this.f30733k) {
            return;
        }
        act.duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169497i7(user.f56011id).map(new w9j() { // from class: l.dzp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88500a.m47925u((CoreData) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.fzp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99990a.m47926v(qszVar, str, (List) obj);
            }
        }, new e30() { // from class: l.gzp
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemAddArtworkGuide.m47908d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m47929y() {
        String str;
        String str2 = this.f30732j;
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
        this.f30724b.setText(String.format(str, this.f30730h.isFemale() ? "她" : "他"));
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f30733k = false;
        this.f30734l = xdl0.m208412y0() - t100.m186890d(105.0f);
    }

    public ItemAddArtworkGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30733k = false;
        this.f30734l = xdl0.m208412y0() - t100.m186890d(105.0f);
    }
}
