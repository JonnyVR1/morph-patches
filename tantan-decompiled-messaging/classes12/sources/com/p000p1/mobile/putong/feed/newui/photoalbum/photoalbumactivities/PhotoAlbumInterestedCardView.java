package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

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
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.Tag;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Objects;
import l.d30;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yta0;
import p007l.exq;
import p007l.ijb0;
import p007l.nkg;
import p007l.u970;
import p007l.v970;
import p007l.vs0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumInterestedCardView extends LinearLayout implements v970 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f3716a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3717b;

    /* JADX INFO: renamed from: c */
    public TextView f3718c;

    /* JADX INFO: renamed from: d */
    public VImage f3719d;

    /* JADX INFO: renamed from: e */
    public TextView f3720e;

    /* JADX INFO: renamed from: f */
    public TextView f3721f;

    /* JADX INFO: renamed from: g */
    public TextView f3722g;

    /* JADX INFO: renamed from: h */
    public String f3723h;

    /* JADX INFO: renamed from: i */
    public int f3724i;

    /* JADX INFO: renamed from: j */
    public User f3725j;

    public PhotoAlbumInterestedCardView(Context context) {
        super(context);
        m6080o(context);
    }

    /* JADX INFO: renamed from: j */
    private void m6079j(int i) {
        m15369b(i, this.f3723h);
    }

    /* JADX INFO: renamed from: o */
    private void m6080o(Context context) {
        addView(m6082i(LayoutInflater.from(context), this));
        exq.m9962b(this.f3716a, 16.0f);
        xdl0.D0(xdl0.y0() - t100.d(24.0f), new View[]{this.f3716a});
    }

    /* JADX INFO: renamed from: s */
    private ArrayList<Tag> m6081s() {
        return vwb.n(FeedModule.m1140H().me_().profile.tags, new w9j() { // from class: l.s970
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf((Profile.PERSONALITY.equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    @Override // p007l.v970
    public Act act() {
        return getContext();
    }

    @Override // p007l.v970
    public String getEntranceType() {
        return MomentMessageType.card;
    }

    /* JADX INFO: renamed from: i */
    public View m6082i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u970.m14791b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m6083l() {
        m15372n(this.f3724i, this.f3723h);
    }

    /* JADX INFO: renamed from: m */
    public void m6084m(int i) {
        if (m15370c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m15372n(i, this.f3723h);
    }

    /* JADX INFO: renamed from: p */
    public final void m6085p(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.r970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12563a.m6086q(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m6086q(User user, View view) {
        m6091w(user);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m6087r(int i, d30 d30Var, View view) {
        m6079j(i);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        act().startActivityForResult(new Intent((Context) act(), (Class<?>) (nkg.m12246j0() ? FeedModule.m1140H().Jn() : FeedMyInterestPeopleAct.class)), PhotoAlbumActivitiesAct.f3704i);
    }

    public void setInteractionType(String str) {
        this.f3723h = str;
    }

    /* JADX INFO: renamed from: t */
    public final ArrayList<Tag> m6088t() {
        return vwb.n(this.f3725j.profile.tags, new w9j() { // from class: l.t970
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf((Profile.PERSONALITY.equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m6089u(User user, final int i, final d30 d30Var) {
        this.f3725j = user;
        this.f3724i = i;
        qib0.G.J0(this.f3717b, user.m1042fp().profileSize(t100.d(81.0f)), false);
        this.f3718c.setText(i + "个对你感兴趣的人");
        String str = "";
        String str2 = (ijb0.m10936w(user) || TextUtils.isEmpty(user.location.region.city) || user.location.isHideRegionCity()) ? "" : user.location.region.city;
        if (!ijb0.m10935v(user)) {
            str = "•" + user.age + FeedModule.f313a.getString(R$string.f435S4);
        }
        this.f3720e.setText(String.format("%s %s%s", user.name, str2, str));
        m6090v();
        m6085p(this.f3717b, user);
        this.f3719d.setOnClickListener(new View.OnClickListener() { // from class: l.o970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.p970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11735a.m6087r(i, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m6090v() {
        final ArrayList<Tag> arrayListM6081s = m6081s();
        ArrayList<Tag> arrayListM6088t = m6088t();
        Objects.requireNonNull(arrayListM6081s);
        ArrayList arrayListN = vwb.n(arrayListM6088t, new yta0(arrayListM6081s));
        ArrayList arrayListN2 = vwb.n(arrayListM6088t, new w9j() { // from class: l.q970
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayListM6081s.contains((Tag) obj));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (arrayListN.size() <= 3) {
            arrayList.addAll(arrayListN);
        } else {
            int i = 0;
            while (i < 3) {
                Tag tag = (Tag) arrayListN.get((int) Math.floor(Math.random() * ((double) arrayListN.size())));
                if (!arrayList.contains(tag)) {
                    arrayList.add(tag);
                    i++;
                }
            }
        }
        if (arrayList.size() < 3 && arrayListN2.size() > 0) {
            if (arrayListN2.size() > 3 - arrayList.size()) {
                int size = 3 - arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Tag tag2 = (Tag) arrayListN2.get((int) Math.floor(Math.random() * ((double) arrayListN2.size())));
                    if (!arrayList.contains(tag2)) {
                        arrayList.add(tag2);
                        i2++;
                    }
                }
            } else {
                arrayList.addAll(arrayListN2);
            }
        }
        String strConcat = (this.f3725j.isFemale() ? "她" : "他").concat("喜欢");
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Tag tag3 = (Tag) arrayList.get(i3);
            strConcat = i3 == arrayList.size() - 1 ? strConcat + tag3.value + "等" : strConcat + tag3.value + "、";
        }
        this.f3721f.setText(strConcat);
        xdl0.M(this.f3721f, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m6091w(User user) {
        vs0.m15570h(act(), null, ((DbObject) user).id, "from_activities_profile", false);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6080o(context);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6080o(context);
    }
}
