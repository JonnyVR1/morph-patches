package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.a1c0;
import p149l.a5z;
import p149l.c3c0;
import p149l.e30;
import p149l.e5z;
import p149l.i0g0;
import p149l.j760;
import p149l.l6c0;
import p149l.mkd0;
import p149l.q5k0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.z8l;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageIdealTypeHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32388a;

    /* JADX INFO: renamed from: b */
    public VImage f32389b;

    /* JADX INFO: renamed from: c */
    public VText f32390c;

    /* JADX INFO: renamed from: d */
    public CommonLabelShowView f32391d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f32392e;

    /* JADX INFO: renamed from: f */
    public boolean f32393f;

    /* JADX INFO: renamed from: g */
    public C8592b f32394g;

    /* JADX INFO: renamed from: h */
    public List<String> f32395h;

    /* JADX INFO: renamed from: i */
    public List<String> f32396i;

    /* JADX INFO: renamed from: j */
    public boolean f32397j;

    /* JADX INFO: renamed from: k */
    public List<String> f32398k;

    /* JADX INFO: renamed from: l */
    public boolean f32399l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$a */
    public class C8591a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f32400a;

        /* JADX INFO: renamed from: b */
        public VText f32401b;

        /* JADX INFO: renamed from: c */
        public FrameLayout f32402c;

        public C8591a(View view) {
            super(view);
            this.f32400a = (AutoVDraweeView) view.findViewById(y4c0.f196098b3);
            this.f32401b = (VText) view.findViewById(y4c0.f196105c3);
            this.f32402c = (FrameLayout) view.findViewById(y4c0.f196112d3);
        }

        /* JADX INFO: renamed from: a */
        public void m49906a(Media media, int i) {
            Picture picture;
            xdl0.m208358V(this.f32402c, i == 0 ? 0 : t100.m186890d(8.0f));
            xdl0.m208344M(this.f32401b, false);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.m81303a(picture)) {
                this.f32400a.setImageUrl(picture.url);
            }
            if (vwb.m200296J(picture.tags)) {
                return;
            }
            NewTags newTagsMo158320V3 = CoreModule.m29935P().m94651a().mo158320V3(picture.tags.get(0));
            if (NullChecker.m81303a(newTagsMo158320V3)) {
                xdl0.m208344M(this.f32401b, true);
                this.f32401b.setText(newTagsMo158320V3.name);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$b */
    public class C8592b extends RecyclerView.Adapter<C8591a> {

        /* JADX INFO: renamed from: a */
        public List<Media> f32404a;

        public C8592b() {
            this.f32404a = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C8591a c8591a, int i) {
            c8591a.m49906a(this.f32404a.get(i), i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8591a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f126299G1, viewGroup, false);
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.c5z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79431a.m49911z(view);
                }
            });
            return MessageIdealTypeHeadLayout.this.new C8591a(viewInflate);
        }

        /* JADX INFO: renamed from: D */
        public void m49910D(List<Media> list) {
            this.f32404a.clear();
            this.f32404a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f32404a.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m49911z(View view) {
            MessageIdealTypeHeadLayout.this.callOnClick();
        }
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context) {
        super(context);
        this.f32393f = false;
        this.f32397j = false;
        this.f32399l = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m49897b(View view) {
        e5z.m114924a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49898c(List<IdealTag> list, List<String> list2) {
        if (!vwb.m200296J(list) && !vwb.m200296J(list2)) {
            for (IdealTag idealTag : list) {
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(idealTag.f38760id, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m49899d() {
        this.f32392e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        C8592b c8592b = new C8592b();
        this.f32394g = c8592b;
        this.f32392e.setAdapter(c8592b);
        this.f32391d.setItemHeight(32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49900e(User user, j760 j760Var) {
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            this.f32399l = xdl0.m208349O0(this.f32392e);
            m49901f((IdealInfo) j760Var.f116565b, user);
            m49904i();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m49901f(IdealInfo idealInfo, User user) {
        boolean z;
        xdl0.m208344M(this.f32388a, false);
        xdl0.m208344M(this.f32391d, false);
        if (NullChecker.m81303a(idealInfo) && !vwb.m200296J(idealInfo.fitIdeals)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (IdealTag idealTag : idealInfo.fitIdeals) {
                for (String str : idealTag.fitIdealDetails) {
                    if (!TextUtils.isEmpty(str) && !hashSet.contains(str) && arrayList2.size() < 3) {
                        LabelData labelData = new LabelData();
                        labelData.name = str;
                        arrayList2.add(labelData);
                        this.f32396i.add(str);
                        hashSet.add(str);
                        arrayList.add(idealTag.name);
                        this.f32395h.add(idealTag.name);
                        break;
                    }
                }
            }
            if (!vwb.m200296J(arrayList)) {
                if (!vwb.m200296J(arrayList2)) {
                    xdl0.m208344M(this.f32391d, true);
                    this.f32391d.setLabel(arrayList2);
                }
                String strM217616a = z8l.m217616a("、", (CharSequence[]) arrayList.toArray(new String[arrayList.size()]));
                this.f32389b.setImageResource(c3c0.f78587N2);
                xdl0.m208344M(this.f32388a, true);
                String strConcat = (user.isFemale() ? "她" : "他").concat("符合你的理想型：");
                this.f32390c.setText(i0g0.m133861b0(strConcat + strM217616a, vwb.m200324f0(strM217616a), getResources().getColor(a1c0.f67151e), Typeface.DEFAULT_BOLD));
                this.f32390c.setText(strConcat + strM217616a);
                return;
            }
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f32390c.setText(user.description);
            this.f32389b.setImageResource(c3c0.f78857s2);
            xdl0.m208344M(this.f32388a, true);
            this.f32397j = true;
            return;
        }
        List arrayList3 = new ArrayList();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        String strM95071f = a5z.m95071f(user, userM169520na);
        if (!TextUtils.isEmpty(strM95071f)) {
            arrayList3.add(strM95071f);
        }
        String strM95076k = a5z.m95076k(user);
        if (!TextUtils.isEmpty(strM95076k)) {
            arrayList3.add(strM95076k);
        }
        String strM95069d = a5z.m95069d(user, userM169520na);
        if (!TextUtils.isEmpty(strM95069d)) {
            arrayList3.add(strM95069d);
        }
        String strM95079n = a5z.m95079n(user, userM169520na);
        if (!TextUtils.isEmpty(strM95079n)) {
            arrayList3.add(strM95079n);
        }
        String strM95070e = a5z.m95070e(user, userM169520na);
        if (!TextUtils.isEmpty(strM95070e)) {
            arrayList3.add(strM95070e);
        }
        String strM95077l = a5z.m95077l(user);
        if (!TextUtils.isEmpty(strM95077l)) {
            arrayList3.add(strM95077l);
        }
        String strM95072g = a5z.m95072g(user, userM169520na);
        if (TextUtils.isEmpty(strM95072g)) {
            z = false;
        } else {
            arrayList3.add(strM95072g);
            z = true;
        }
        String strM95080o = a5z.m95080o(user);
        if (!TextUtils.isEmpty(strM95080o)) {
            arrayList3.add(strM95080o);
        }
        if (userM169520na.isFemale()) {
            String strM95074i = a5z.m95074i(user);
            if (!TextUtils.isEmpty(strM95074i)) {
                arrayList3.add(strM95074i);
            }
            String strM95073h = a5z.m95073h(user);
            if (!TextUtils.isEmpty(strM95073h)) {
                arrayList3.add(strM95073h);
            }
            String strM95067b = a5z.m95067b(user);
            if (!TextUtils.isEmpty(strM95067b)) {
                arrayList3.add(strM95067b);
            }
        }
        String strM95078m = a5z.m95078m(user);
        if (!TextUtils.isEmpty(strM95078m)) {
            arrayList3.add(strM95078m);
        }
        String strM95075j = a5z.m95075j(user);
        if (!TextUtils.isEmpty(strM95075j) && !TextUtils.equals(strM95075j, "其他")) {
            arrayList3.add(strM95075j);
        }
        if (!z) {
            String strM95068c = a5z.m95068c(user);
            if (!TextUtils.isEmpty(strM95068c) && !TextUtils.equals(strM95068c, "其他")) {
                arrayList3.add(strM95068c);
            }
        }
        if (!vwb.m200296J(arrayList3)) {
            arrayList3 = arrayList3.subList(0, Math.min(5, arrayList3.size()));
        }
        if (vwb.m200296J(arrayList3)) {
            return;
        }
        this.f32398k.addAll(arrayList3);
        String strM217616a2 = z8l.m217616a("、", (CharSequence[]) arrayList3.toArray(new String[arrayList3.size()]));
        this.f32389b.setImageResource(c3c0.f78848r2);
        xdl0.m208344M(this.f32388a, true);
        String strConcat2 = (user.isFemale() ? "她" : "他").concat("的标签：");
        this.f32390c.setText(i0g0.m133861b0(strConcat2 + strM217616a2, vwb.m200324f0(strM217616a2), getResources().getColor(a1c0.f67151e), Typeface.DEFAULT_BOLD));
        xdl0.m208344M(this.f32388a, true);
        xdl0.m208344M(this.f32391d, false);
    }

    /* JADX INFO: renamed from: g */
    public void m49902g(Act act, User user) {
        m49903h();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<String> idealList = CoreModule.f17545c.f19639e0.m169520na().getIdealList();
        for (int i = 1; i < user.pictures.size(); i++) {
            Media media = user.pictures.get(i);
            if (!hashSet.contains(media.url) && m49898c(media.tagIdealInfo, idealList)) {
                hashSet.add(media.url);
                arrayList.add(user.pictures.get(i));
            }
        }
        for (int i2 = 1; i2 < user.pictures.size(); i2++) {
            Media media2 = user.pictures.get(i2);
            if (!hashSet.contains(media2.url) && !vwb.m200296J(media2.tags)) {
                hashSet.add(media2.url);
                arrayList.add(user.pictures.get(i2));
            }
        }
        for (int i3 = 1; i3 < user.pictures.size(); i3++) {
            if (!hashSet.contains(user.pictures.get(i3).url)) {
                arrayList.add(user.pictures.get(i3));
            }
        }
        this.f32394g.m49910D(arrayList);
        xdl0.m208344M(this.f32392e, !vwb.m200296J(arrayList));
        m49905j(act, user);
    }

    /* JADX INFO: renamed from: h */
    public final void m49903h() {
        this.f32395h = new ArrayList();
        this.f32396i = new ArrayList();
        this.f32398k = new ArrayList();
        this.f32397j = false;
        this.f32399l = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m49904i() {
        String strM217616a;
        String strM217616a2;
        if (this.f32393f) {
            return;
        }
        this.f32393f = true;
        String strM217616a3 = "none";
        if (vwb.m200296J(this.f32395h)) {
            strM217616a = "none";
        } else {
            List<String> list = this.f32395h;
            strM217616a = z8l.m217616a(Constants.SEPARATOR_COMMA, (CharSequence[]) list.toArray(new String[list.size()]));
        }
        j760 j760VarM140076a = j760.m140076a("ideal_type", strM217616a);
        if (vwb.m200296J(this.f32396i)) {
            strM217616a2 = "none";
        } else {
            List<String> list2 = this.f32396i;
            strM217616a2 = z8l.m217616a(Constants.SEPARATOR_COMMA, (CharSequence[]) list2.toArray(new String[list2.size()]));
        }
        j760 j760VarM140076a2 = j760.m140076a("ideal_type_relate_profile", strM217616a2);
        if (!vwb.m200296J(this.f32398k)) {
            List<String> list3 = this.f32398k;
            strM217616a3 = z8l.m217616a(Constants.SEPARATOR_COMMA, (CharSequence[]) list3.toArray(new String[list3.size()]));
        }
        zvf0.m220368A("e_start_chat_card", OMSDialogPositon.p_chat_view, j760VarM140076a, j760VarM140076a2, j760.m140076a("profile_tag", strM217616a3), j760.m140076a("is_sbout_me_showed", Boolean.valueOf(this.f32397j)), j760.m140076a("is_photo_showed", Boolean.valueOf(this.f32399l)));
    }

    /* JADX INFO: renamed from: j */
    public final void m49905j(Act act, final User user) {
        act.duringCreated(q5k0.m173035g().m173037f(user.f56011id).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.b5z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73722a.m49900e(user, (j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32393f = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49897b(this);
        m49899d();
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32393f = false;
        this.f32397j = false;
        this.f32399l = false;
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32393f = false;
        this.f32397j = false;
        this.f32399l = false;
    }
}
