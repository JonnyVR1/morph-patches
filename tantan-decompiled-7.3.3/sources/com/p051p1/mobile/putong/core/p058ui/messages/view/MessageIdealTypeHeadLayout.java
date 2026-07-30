package com.p051p1.mobile.putong.core.p058ui.messages.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bez;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.pbl;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qec0;
import p153l.wek0;
import p153l.xdz;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MessageIdealTypeHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f33236a;

    /* JADX INFO: renamed from: b */
    public VImage f33237b;

    /* JADX INFO: renamed from: c */
    public VText f33238c;

    /* JADX INFO: renamed from: d */
    public CommonLabelShowView f33239d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f33240e;

    /* JADX INFO: renamed from: f */
    public boolean f33241f;

    /* JADX INFO: renamed from: g */
    public C8755b f33242g;

    /* JADX INFO: renamed from: h */
    public List<String> f33243h;

    /* JADX INFO: renamed from: i */
    public List<String> f33244i;

    /* JADX INFO: renamed from: j */
    public boolean f33245j;

    /* JADX INFO: renamed from: k */
    public List<String> f33246k;

    /* JADX INFO: renamed from: l */
    public boolean f33247l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$a */
    public class C8754a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f33248a;

        /* JADX INFO: renamed from: b */
        public VText f33249b;

        /* JADX INFO: renamed from: c */
        public FrameLayout f33250c;

        public C8754a(View view) {
            super(view);
            this.f33248a = (AutoVDraweeView) view.findViewById(edc0.f93333b3);
            this.f33249b = (VText) view.findViewById(edc0.f93340c3);
            this.f33250c = (FrameLayout) view.findViewById(edc0.f93347d3);
        }

        /* JADX INFO: renamed from: a */
        public void m51089a(Media media, int i) {
            Picture picture;
            bnl0.m105538V(this.f33250c, i == 0 ? 0 : qa00.m175859d(8.0f));
            bnl0.m105524M(this.f33249b, false);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.m82486a(picture)) {
                this.f33248a.setImageUrl(picture.url);
            }
            if (jyb.m147479J(picture.tags)) {
                return;
            }
            NewTags newTagsMo180412V3 = CoreModule.m30933P().m143405a().mo180412V3(picture.tags.get(0));
            if (NullChecker.m82486a(newTagsMo180412V3)) {
                bnl0.m105524M(this.f33249b, true);
                this.f33249b.setText(newTagsMo180412V3.name);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout$b */
    public class C8755b extends RecyclerView.Adapter<C8754a> {

        /* JADX INFO: renamed from: a */
        public List<Media> f33252a;

        public C8755b() {
            this.f33252a = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C8754a c8754a, int i) {
            c8754a.m51089a(this.f33252a.get(i), i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8754a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(qec0.f156855G1, viewGroup, false);
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.zdz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203954a.m51094z(view);
                }
            });
            return MessageIdealTypeHeadLayout.this.new C8754a(viewInflate);
        }

        /* JADX INFO: renamed from: D */
        public void m51093D(List<Media> list) {
            this.f33252a.clear();
            this.f33252a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f33252a.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m51094z(View view) {
            MessageIdealTypeHeadLayout.this.callOnClick();
        }
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context) {
        super(context);
        this.f33241f = false;
        this.f33245j = false;
        this.f33247l = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m51080b(View view) {
        bez.m103792a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51081c(List<IdealTag> list, List<String> list2) {
        if (!jyb.m147479J(list) && !jyb.m147479J(list2)) {
            for (IdealTag idealTag : list) {
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(idealTag.f39608id, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m51082d() {
        this.f33240e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        C8755b c8755b = new C8755b();
        this.f33242g = c8755b;
        this.f33240e.setAdapter(c8755b);
        this.f33239d.setItemHeight(32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m51083e(User user, pf60 pf60Var) {
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            this.f33247l = bnl0.m105529O0(this.f33240e);
            m51084f((IdealInfo) pf60Var.f152157b, user);
            m51087i();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m51084f(IdealInfo idealInfo, User user) {
        boolean z;
        bnl0.m105524M(this.f33236a, false);
        bnl0.m105524M(this.f33239d, false);
        if (NullChecker.m82486a(idealInfo) && !jyb.m147479J(idealInfo.fitIdeals)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (IdealTag idealTag : idealInfo.fitIdeals) {
                for (String str : idealTag.fitIdealDetails) {
                    if (!TextUtils.isEmpty(str) && !hashSet.contains(str) && arrayList2.size() < 3) {
                        LabelData labelData = new LabelData();
                        labelData.name = str;
                        arrayList2.add(labelData);
                        this.f33244i.add(str);
                        hashSet.add(str);
                        arrayList.add(idealTag.name);
                        this.f33243h.add(idealTag.name);
                        break;
                    }
                }
            }
            if (!jyb.m147479J(arrayList)) {
                if (!jyb.m147479J(arrayList2)) {
                    bnl0.m105524M(this.f33239d, true);
                    this.f33239d.setLabel(arrayList2);
                }
                String strM171511a = pbl.m171511a("、", (CharSequence[]) arrayList.toArray(new String[arrayList.size()]));
                this.f33237b.setImageResource(ibc0.f113862N2);
                bnl0.m105524M(this.f33236a, true);
                String strConcat = (user.isFemale() ? "她" : "他").concat("符合你的理想型：");
                this.f33238c.setText(q8g0.m175796b0(strConcat + strM171511a, jyb.m147507f0(strM171511a), getResources().getColor(g9c0.f102815e), Typeface.DEFAULT_BOLD));
                this.f33238c.setText(strConcat + strM171511a);
                return;
            }
        }
        if (!TextUtils.isEmpty(user.description)) {
            this.f33238c.setText(user.description);
            this.f33237b.setImageResource(ibc0.f114132s2);
            bnl0.m105524M(this.f33236a, true);
            this.f33245j = true;
            return;
        }
        List arrayList3 = new ArrayList();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        String strM210501f = xdz.m210501f(user, userM116593na);
        if (!TextUtils.isEmpty(strM210501f)) {
            arrayList3.add(strM210501f);
        }
        String strM210506k = xdz.m210506k(user);
        if (!TextUtils.isEmpty(strM210506k)) {
            arrayList3.add(strM210506k);
        }
        String strM210499d = xdz.m210499d(user, userM116593na);
        if (!TextUtils.isEmpty(strM210499d)) {
            arrayList3.add(strM210499d);
        }
        String strM210509n = xdz.m210509n(user, userM116593na);
        if (!TextUtils.isEmpty(strM210509n)) {
            arrayList3.add(strM210509n);
        }
        String strM210500e = xdz.m210500e(user, userM116593na);
        if (!TextUtils.isEmpty(strM210500e)) {
            arrayList3.add(strM210500e);
        }
        String strM210507l = xdz.m210507l(user);
        if (!TextUtils.isEmpty(strM210507l)) {
            arrayList3.add(strM210507l);
        }
        String strM210502g = xdz.m210502g(user, userM116593na);
        if (TextUtils.isEmpty(strM210502g)) {
            z = false;
        } else {
            arrayList3.add(strM210502g);
            z = true;
        }
        String strM210510o = xdz.m210510o(user);
        if (!TextUtils.isEmpty(strM210510o)) {
            arrayList3.add(strM210510o);
        }
        if (userM116593na.isFemale()) {
            String strM210504i = xdz.m210504i(user);
            if (!TextUtils.isEmpty(strM210504i)) {
                arrayList3.add(strM210504i);
            }
            String strM210503h = xdz.m210503h(user);
            if (!TextUtils.isEmpty(strM210503h)) {
                arrayList3.add(strM210503h);
            }
            String strM210497b = xdz.m210497b(user);
            if (!TextUtils.isEmpty(strM210497b)) {
                arrayList3.add(strM210497b);
            }
        }
        String strM210508m = xdz.m210508m(user);
        if (!TextUtils.isEmpty(strM210508m)) {
            arrayList3.add(strM210508m);
        }
        String strM210505j = xdz.m210505j(user);
        if (!TextUtils.isEmpty(strM210505j) && !TextUtils.equals(strM210505j, "其他")) {
            arrayList3.add(strM210505j);
        }
        if (!z) {
            String strM210498c = xdz.m210498c(user);
            if (!TextUtils.isEmpty(strM210498c) && !TextUtils.equals(strM210498c, "其他")) {
                arrayList3.add(strM210498c);
            }
        }
        if (!jyb.m147479J(arrayList3)) {
            arrayList3 = arrayList3.subList(0, Math.min(5, arrayList3.size()));
        }
        if (jyb.m147479J(arrayList3)) {
            return;
        }
        this.f33246k.addAll(arrayList3);
        String strM171511a2 = pbl.m171511a("、", (CharSequence[]) arrayList3.toArray(new String[arrayList3.size()]));
        this.f33237b.setImageResource(ibc0.f114123r2);
        bnl0.m105524M(this.f33236a, true);
        String strConcat2 = (user.isFemale() ? "她" : "他").concat("的标签：");
        this.f33238c.setText(q8g0.m175796b0(strConcat2 + strM171511a2, jyb.m147507f0(strM171511a2), getResources().getColor(g9c0.f102815e), Typeface.DEFAULT_BOLD));
        bnl0.m105524M(this.f33236a, true);
        bnl0.m105524M(this.f33239d, false);
    }

    /* JADX INFO: renamed from: g */
    public void m51085g(Act act, User user) {
        m51086h();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<String> idealList = CoreModule.f18264c.f20381e0.m116593na().getIdealList();
        for (int i = 1; i < user.pictures.size(); i++) {
            Media media = user.pictures.get(i);
            if (!hashSet.contains(media.url) && m51081c(media.tagIdealInfo, idealList)) {
                hashSet.add(media.url);
                arrayList.add(user.pictures.get(i));
            }
        }
        for (int i2 = 1; i2 < user.pictures.size(); i2++) {
            Media media2 = user.pictures.get(i2);
            if (!hashSet.contains(media2.url) && !jyb.m147479J(media2.tags)) {
                hashSet.add(media2.url);
                arrayList.add(user.pictures.get(i2));
            }
        }
        for (int i3 = 1; i3 < user.pictures.size(); i3++) {
            if (!hashSet.contains(user.pictures.get(i3).url)) {
                arrayList.add(user.pictures.get(i3));
            }
        }
        this.f33242g.m51093D(arrayList);
        bnl0.m105524M(this.f33240e, !jyb.m147479J(arrayList));
        m51088j(act, user);
    }

    /* JADX INFO: renamed from: h */
    public final void m51086h() {
        this.f33243h = new ArrayList();
        this.f33244i = new ArrayList();
        this.f33246k = new ArrayList();
        this.f33245j = false;
        this.f33247l = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m51087i() {
        String strM171511a;
        String strM171511a2;
        if (this.f33241f) {
            return;
        }
        this.f33241f = true;
        String strM171511a3 = "none";
        if (jyb.m147479J(this.f33243h)) {
            strM171511a = "none";
        } else {
            List<String> list = this.f33243h;
            strM171511a = pbl.m171511a(Constants.SEPARATOR_COMMA, (CharSequence[]) list.toArray(new String[list.size()]));
        }
        pf60 pf60VarM172085a = pf60.m172085a("ideal_type", strM171511a);
        if (jyb.m147479J(this.f33244i)) {
            strM171511a2 = "none";
        } else {
            List<String> list2 = this.f33244i;
            strM171511a2 = pbl.m171511a(Constants.SEPARATOR_COMMA, (CharSequence[]) list2.toArray(new String[list2.size()]));
        }
        pf60 pf60VarM172085a2 = pf60.m172085a("ideal_type_relate_profile", strM171511a2);
        if (!jyb.m147479J(this.f33246k)) {
            List<String> list3 = this.f33246k;
            strM171511a3 = pbl.m171511a(Constants.SEPARATOR_COMMA, (CharSequence[]) list3.toArray(new String[list3.size()]));
        }
        i4g0.m138492A("e_start_chat_card", OMSDialogPositon.p_chat_view, pf60VarM172085a, pf60VarM172085a2, pf60.m172085a("profile_tag", strM171511a3), pf60.m172085a("is_sbout_me_showed", Boolean.valueOf(this.f33245j)), pf60.m172085a("is_photo_showed", Boolean.valueOf(this.f33247l)));
    }

    /* JADX INFO: renamed from: j */
    public final void m51088j(Act act, final User user) {
        act.duringCreated(wek0.m206001g().m206003f(user.f56859id).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ydz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198637a.m51083e(user, (pf60) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33241f = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51080b(this);
        m51082d();
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33241f = false;
        this.f33245j = false;
        this.f33247l = false;
    }

    public MessageIdealTypeHeadLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33241f = false;
        this.f33245j = false;
        this.f33247l = false;
    }
}
