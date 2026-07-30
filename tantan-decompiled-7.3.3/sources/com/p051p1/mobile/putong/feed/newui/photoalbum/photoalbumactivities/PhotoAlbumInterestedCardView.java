package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.ai70;
import p153l.at0;
import p153l.bi70;
import p153l.bnl0;
import p153l.c2b0;
import p153l.cmg;
import p153l.ezq;
import p153l.jyb;
import p153l.mrb0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumInterestedCardView extends LinearLayout implements bi70 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f43103a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43104b;

    /* JADX INFO: renamed from: c */
    public TextView f43105c;

    /* JADX INFO: renamed from: d */
    public VImage f43106d;

    /* JADX INFO: renamed from: e */
    public TextView f43107e;

    /* JADX INFO: renamed from: f */
    public TextView f43108f;

    /* JADX INFO: renamed from: g */
    public TextView f43109g;

    /* JADX INFO: renamed from: h */
    public String f43110h;

    /* JADX INFO: renamed from: i */
    public int f43111i;

    /* JADX INFO: renamed from: j */
    public User f43112j;

    public PhotoAlbumInterestedCardView(Context context) {
        super(context);
        m66163o(context);
    }

    /* JADX INFO: renamed from: j */
    private void m66162j(int i) {
        m104423b(i, this.f43110h);
    }

    /* JADX INFO: renamed from: o */
    private void m66163o(Context context) {
        addView(m66165i(LayoutInflater.from(context), this));
        ezq.m123397b(this.f43103a, 16.0f);
        bnl0.m105507D0(bnl0.m105592y0() - qa00.m175859d(24.0f), this.f43103a);
    }

    /* JADX INFO: renamed from: s */
    private ArrayList<Tag> m66164s() {
        return jyb.m147522n(FeedModule.m61406H().me_().profile.tags, new qcj() { // from class: l.yh70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(("personality".equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    @Override // p153l.bi70
    public Act act() {
        return (Act) getContext();
    }

    @Override // p153l.bi70
    public String getEntranceType() {
        return "card";
    }

    /* JADX INFO: renamed from: i */
    public View m66165i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ai70.m97960b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m66166l() {
        m104426n(this.f43111i, this.f43110h);
    }

    /* JADX INFO: renamed from: m */
    public void m66167m(int i) {
        if (m104424c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m104426n(i, this.f43110h);
    }

    /* JADX INFO: renamed from: p */
    public final void m66168p(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.xh70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f194281a.m66169q(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66169q(User user, View view) {
        m66174w(user);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m66170r(int i, x20 x20Var, View view) {
        m66162j(i);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        act().startActivityForResult(new Intent(act(), cmg.m111216j0() ? FeedModule.m61406H().mo31701Jn() : FeedMyInterestPeopleAct.class), PhotoAlbumActivitiesAct.f43091i);
    }

    public void setInteractionType(String str) {
        this.f43110h = str;
    }

    /* JADX INFO: renamed from: t */
    public final ArrayList<Tag> m66171t() {
        return jyb.m147522n(this.f43112j.profile.tags, new qcj() { // from class: l.zh70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(("personality".equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m66172u(User user, final int i, final x20 x20Var) {
        this.f43112j = user;
        this.f43111i = i;
        uqb0.f180374G.m127111J0(this.f43104b, user.m61308fp().profileSize(qa00.m175859d(81.0f)), false);
        this.f43105c.setText(i + "个对你感兴趣的人");
        String str = "";
        String str2 = (mrb0.m159669w(user) || TextUtils.isEmpty(user.location.region.city) || user.location.isHideRegionCity()) ? "" : user.location.region.city;
        if (!mrb0.m159668v(user)) {
            str = "•" + user.age + FeedModule.f39700a.getString(R$string.f39822S4);
        }
        this.f43107e.setText(String.format("%s %s%s", user.name, str2, str));
        m66173v();
        m66168p(this.f43104b, user);
        this.f43106d.setOnClickListener(new View.OnClickListener() { // from class: l.uh70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.vh70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184081a.m66170r(i, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m66173v() {
        final ArrayList<Tag> arrayListM66164s = m66164s();
        ArrayList<Tag> arrayListM66171t = m66171t();
        Objects.requireNonNull(arrayListM66164s);
        ArrayList arrayListM147522n = jyb.m147522n(arrayListM66171t, new c2b0(arrayListM66164s));
        ArrayList arrayListM147522n2 = jyb.m147522n(arrayListM66171t, new qcj() { // from class: l.wh70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayListM66164s.contains((Tag) obj));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (arrayListM147522n.size() <= 3) {
            arrayList.addAll(arrayListM147522n);
        } else {
            int i = 0;
            while (i < 3) {
                Tag tag = (Tag) arrayListM147522n.get((int) Math.floor(Math.random() * ((double) arrayListM147522n.size())));
                if (!arrayList.contains(tag)) {
                    arrayList.add(tag);
                    i++;
                }
            }
        }
        if (arrayList.size() < 3 && arrayListM147522n2.size() > 0) {
            if (arrayListM147522n2.size() > 3 - arrayList.size()) {
                int size = 3 - arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Tag tag2 = (Tag) arrayListM147522n2.get((int) Math.floor(Math.random() * ((double) arrayListM147522n2.size())));
                    if (!arrayList.contains(tag2)) {
                        arrayList.add(tag2);
                        i2++;
                    }
                }
            } else {
                arrayList.addAll(arrayListM147522n2);
            }
        }
        String strConcat = (this.f43112j.isFemale() ? "她" : "他").concat("喜欢");
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Tag tag3 = (Tag) arrayList.get(i3);
            strConcat = i3 == arrayList.size() - 1 ? strConcat + tag3.value + "等" : strConcat + tag3.value + "、";
        }
        this.f43108f.setText(strConcat);
        bnl0.m105524M(this.f43108f, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m66174w(User user) {
        at0.m100014h(act(), null, user.f56859id, "from_activities_profile", false);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66163o(context);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66163o(context);
    }
}
