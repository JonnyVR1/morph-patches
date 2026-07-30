package com.p000p1.mobile.putong.core.p001ui.messages.view;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.view.CommonLabelShowView;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.a1c0;
import l.a5z;
import l.c3c0;
import l.e30;
import l.e5z;
import l.i0g0;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.q5k0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.z8l;
import l.zvf0;
import v.AutoVDraweeView;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageIdealTypeHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f210a;

    /* JADX INFO: renamed from: b */
    public VImage f211b;

    /* JADX INFO: renamed from: c */
    public VText f212c;

    /* JADX INFO: renamed from: d */
    public CommonLabelShowView f213d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f214e;

    /* JADX INFO: renamed from: f */
    public boolean f215f;

    /* JADX INFO: renamed from: g */
    public C0017b f216g;

    /* JADX INFO: renamed from: h */
    public List<String> f217h;

    /* JADX INFO: renamed from: i */
    public List<String> f218i;

    /* JADX INFO: renamed from: j */
    public boolean f219j;

    /* JADX INFO: renamed from: k */
    public List<String> f220k;

    /* JADX INFO: renamed from: l */
    public boolean f221l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$a */
    public class C0016a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f222a;

        /* JADX INFO: renamed from: b */
        public VText f223b;

        /* JADX INFO: renamed from: c */
        public FrameLayout f224c;

        public C0016a(View view) {
            super(view);
            this.f222a = view.findViewById(y4c0.b3);
            this.f223b = view.findViewById(y4c0.c3);
            this.f224c = (FrameLayout) view.findViewById(y4c0.d3);
        }

        /* JADX INFO: renamed from: a */
        public void m328a(Media media, int i) {
            Picture picture;
            xdl0.V(this.f224c, i == 0 ? 0 : t100.d(8.0f));
            xdl0.M(this.f223b, false);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.a(picture)) {
                this.f222a.setImageUrl(((Media) picture).url);
            }
            if (vwb.J(((Media) picture).tags)) {
                return;
            }
            NewTags newTagsV3 = CoreModule.P().a().V3((String) ((Media) picture).tags.get(0));
            if (NullChecker.a(newTagsV3)) {
                xdl0.M(this.f223b, true);
                this.f223b.setText(newTagsV3.name);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$b */
    public class C0017b extends RecyclerView.Adapter<C0016a> {

        /* JADX INFO: renamed from: a */
        public List<Media> f226a;

        public C0017b() {
            this.f226a = new ArrayList();
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C0016a c0016a, int i) {
            c0016a.m328a(this.f226a.get(i), i);
        }

        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0016a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.G1, viewGroup, false);
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.c5z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8492a.m333z(view);
                }
            });
            return MessageIdealTypeHeadLayout.this.new C0016a(viewInflate);
        }

        /* JADX INFO: renamed from: D */
        public void m332D(List<Media> list) {
            this.f226a.clear();
            this.f226a.addAll(list);
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f226a.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m333z(View view) {
            MessageIdealTypeHeadLayout.this.callOnClick();
        }
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context) {
        super(context);
        this.f215f = false;
        this.f219j = false;
        this.f221l = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m319b(View view) {
        e5z.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m320c(List<IdealTag> list, List<String> list2) {
        if (!vwb.J(list) && !vwb.J(list2)) {
            for (IdealTag idealTag : list) {
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(idealTag.id, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m321d() {
        this.f214e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        C0017b c0017b = new C0017b();
        this.f216g = c0017b;
        this.f214e.setAdapter(c0017b);
        this.f213d.setItemHeight(32);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m322e(User user, j760 j760Var) {
        if (((Boolean) j760Var.a).booleanValue()) {
            this.f221l = xdl0.O0(this.f214e);
            m323f((IdealInfo) j760Var.b, user);
            m326i();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m323f(IdealInfo idealInfo, User user) {
        boolean z;
        xdl0.M(this.f210a, false);
        xdl0.M(this.f213d, false);
        if (NullChecker.a(idealInfo) && !vwb.J(idealInfo.fitIdeals)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (IdealTag idealTag : idealInfo.fitIdeals) {
                for (String str : idealTag.fitIdealDetails) {
                    if (!TextUtils.isEmpty(str) && !hashSet.contains(str) && arrayList2.size() < 3) {
                        LabelData labelData = new LabelData();
                        labelData.name = str;
                        arrayList2.add(labelData);
                        this.f218i.add(str);
                        hashSet.add(str);
                        arrayList.add(idealTag.name);
                        this.f217h.add(idealTag.name);
                        break;
                    }
                }
            }
            if (!vwb.J(arrayList)) {
                if (!vwb.J(arrayList2)) {
                    xdl0.M(this.f213d, true);
                    this.f213d.setLabel(arrayList2);
                }
                String strA = z8l.a("、", (CharSequence[]) arrayList.toArray(new String[arrayList.size()]));
                this.f211b.setImageResource(c3c0.N2);
                xdl0.M(this.f210a, true);
                String strConcat = (user.isFemale() ? "她" : "他").concat("符合你的理想型：");
                this.f212c.setText(i0g0.b0(strConcat + strA, vwb.f0(new String[]{strA}), getResources().getColor(a1c0.e), Typeface.DEFAULT_BOLD));
                this.f212c.setText(strConcat + strA);
                return;
            }
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f212c.setText(user.description);
            this.f211b.setImageResource(c3c0.s2);
            xdl0.M(this.f210a, true);
            this.f219j = true;
            return;
        }
        List arrayList3 = new ArrayList();
        User userNa = CoreModule.c.e0.na();
        String strF = a5z.f(user, userNa);
        if (!TextUtils.isEmpty(strF)) {
            arrayList3.add(strF);
        }
        String strK = a5z.k(user);
        if (!TextUtils.isEmpty(strK)) {
            arrayList3.add(strK);
        }
        String strD = a5z.d(user, userNa);
        if (!TextUtils.isEmpty(strD)) {
            arrayList3.add(strD);
        }
        String strN = a5z.n(user, userNa);
        if (!TextUtils.isEmpty(strN)) {
            arrayList3.add(strN);
        }
        String strE = a5z.e(user, userNa);
        if (!TextUtils.isEmpty(strE)) {
            arrayList3.add(strE);
        }
        String strL = a5z.l(user);
        if (!TextUtils.isEmpty(strL)) {
            arrayList3.add(strL);
        }
        String strG = a5z.g(user, userNa);
        if (TextUtils.isEmpty(strG)) {
            z = false;
        } else {
            arrayList3.add(strG);
            z = true;
        }
        String strO = a5z.o(user);
        if (!TextUtils.isEmpty(strO)) {
            arrayList3.add(strO);
        }
        if (userNa.isFemale()) {
            String strI = a5z.i(user);
            if (!TextUtils.isEmpty(strI)) {
                arrayList3.add(strI);
            }
            String strH = a5z.h(user);
            if (!TextUtils.isEmpty(strH)) {
                arrayList3.add(strH);
            }
            String strB = a5z.b(user);
            if (!TextUtils.isEmpty(strB)) {
                arrayList3.add(strB);
            }
        }
        String strM = a5z.m(user);
        if (!TextUtils.isEmpty(strM)) {
            arrayList3.add(strM);
        }
        String strJ = a5z.j(user);
        if (!TextUtils.isEmpty(strJ) && !TextUtils.equals(strJ, "其他")) {
            arrayList3.add(strJ);
        }
        if (!z) {
            String strC = a5z.c(user);
            if (!TextUtils.isEmpty(strC) && !TextUtils.equals(strC, "其他")) {
                arrayList3.add(strC);
            }
        }
        if (!vwb.J(arrayList3)) {
            arrayList3 = arrayList3.subList(0, Math.min(5, arrayList3.size()));
        }
        if (vwb.J(arrayList3)) {
            return;
        }
        this.f220k.addAll(arrayList3);
        String strA2 = z8l.a("、", (CharSequence[]) arrayList3.toArray(new String[arrayList3.size()]));
        this.f211b.setImageResource(c3c0.r2);
        xdl0.M(this.f210a, true);
        String strConcat2 = (user.isFemale() ? "她" : "他").concat("的标签：");
        this.f212c.setText(i0g0.b0(strConcat2 + strA2, vwb.f0(new String[]{strA2}), getResources().getColor(a1c0.e), Typeface.DEFAULT_BOLD));
        xdl0.M(this.f210a, true);
        xdl0.M(this.f213d, false);
    }

    /* JADX INFO: renamed from: g */
    public void m324g(Act act, User user) {
        m325h();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<String> idealList = CoreModule.c.e0.na().getIdealList();
        for (int i = 1; i < user.pictures.size(); i++) {
            Media media = (Media) user.pictures.get(i);
            if (!hashSet.contains(media.url) && m320c(media.tagIdealInfo, idealList)) {
                hashSet.add(media.url);
                arrayList.add((Media) user.pictures.get(i));
            }
        }
        for (int i2 = 1; i2 < user.pictures.size(); i2++) {
            Media media2 = (Media) user.pictures.get(i2);
            if (!hashSet.contains(media2.url) && !vwb.J(media2.tags)) {
                hashSet.add(media2.url);
                arrayList.add((Media) user.pictures.get(i2));
            }
        }
        for (int i3 = 1; i3 < user.pictures.size(); i3++) {
            if (!hashSet.contains(((Media) user.pictures.get(i3)).url)) {
                arrayList.add((Media) user.pictures.get(i3));
            }
        }
        this.f216g.m332D(arrayList);
        xdl0.M(this.f214e, !vwb.J(arrayList));
        m327j(act, user);
    }

    /* JADX INFO: renamed from: h */
    public final void m325h() {
        this.f217h = new ArrayList();
        this.f218i = new ArrayList();
        this.f220k = new ArrayList();
        this.f219j = false;
        this.f221l = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m326i() {
        String strA;
        String strA2;
        if (this.f215f) {
            return;
        }
        this.f215f = true;
        String strA3 = "none";
        if (vwb.J(this.f217h)) {
            strA = "none";
        } else {
            List<String> list = this.f217h;
            strA = z8l.a(",", (CharSequence[]) list.toArray(new String[list.size()]));
        }
        j760 j760VarA = j760.a("ideal_type", strA);
        if (vwb.J(this.f218i)) {
            strA2 = "none";
        } else {
            List<String> list2 = this.f218i;
            strA2 = z8l.a(",", (CharSequence[]) list2.toArray(new String[list2.size()]));
        }
        j760 j760VarA2 = j760.a("ideal_type_relate_profile", strA2);
        if (!vwb.J(this.f220k)) {
            List<String> list3 = this.f220k;
            strA3 = z8l.a(",", (CharSequence[]) list3.toArray(new String[list3.size()]));
        }
        zvf0.A("e_start_chat_card", "p_chat_view", new j760[]{j760VarA, j760VarA2, j760.a("profile_tag", strA3), j760.a("is_sbout_me_showed", Boolean.valueOf(this.f219j)), j760.a("is_photo_showed", Boolean.valueOf(this.f221l))});
    }

    /* JADX INFO: renamed from: j */
    public final void m327j(Act act, final User user) {
        act.duringCreated(q5k0.g().f(((DbObject) user).id).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.b5z
            public final void call(Object obj) {
                this.f7999a.m322e(user, (j760) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f215f = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m319b(this);
        m321d();
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f215f = false;
        this.f219j = false;
        this.f221l = false;
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f215f = false;
        this.f219j = false;
        this.f221l = false;
    }
}
