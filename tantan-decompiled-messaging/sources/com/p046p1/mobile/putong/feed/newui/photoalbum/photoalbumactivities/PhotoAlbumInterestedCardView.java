package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.d30;
import p149l.exq;
import p149l.ijb0;
import p149l.nkg;
import p149l.qib0;
import p149l.t100;
import p149l.u970;
import p149l.v970;
import p149l.vs0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yta0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumInterestedCardView extends LinearLayout implements v970 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f42255a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42256b;

    /* JADX INFO: renamed from: c */
    public TextView f42257c;

    /* JADX INFO: renamed from: d */
    public VImage f42258d;

    /* JADX INFO: renamed from: e */
    public TextView f42259e;

    /* JADX INFO: renamed from: f */
    public TextView f42260f;

    /* JADX INFO: renamed from: g */
    public TextView f42261g;

    /* JADX INFO: renamed from: h */
    public String f42262h;

    /* JADX INFO: renamed from: i */
    public int f42263i;

    /* JADX INFO: renamed from: j */
    public User f42264j;

    public PhotoAlbumInterestedCardView(Context context) {
        super(context);
        m64980o(context);
    }

    /* JADX INFO: renamed from: j */
    private void m64979j(int i) {
        m197543b(i, this.f42262h);
    }

    /* JADX INFO: renamed from: o */
    private void m64980o(Context context) {
        addView(m64982i(LayoutInflater.from(context), this));
        exq.m118693b(this.f42255a, 16.0f);
        xdl0.m208327D0(xdl0.m208412y0() - t100.m186890d(24.0f), this.f42255a);
    }

    /* JADX INFO: renamed from: s */
    private ArrayList<Tag> m64981s() {
        return vwb.m200339n(FeedModule.m60222H().me_().profile.tags, new w9j() { // from class: l.s970
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(("personality".equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    @Override // p149l.v970
    public Act act() {
        return (Act) getContext();
    }

    @Override // p149l.v970
    public String getEntranceType() {
        return "card";
    }

    /* JADX INFO: renamed from: i */
    public View m64982i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u970.m192265b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m64983l() {
        m197546n(this.f42263i, this.f42262h);
    }

    /* JADX INFO: renamed from: m */
    public void m64984m(int i) {
        if (m197544c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m197546n(i, this.f42262h);
    }

    /* JADX INFO: renamed from: p */
    public final void m64985p(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.r970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f158281a.m64986q(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m64986q(User user, View view) {
        m64991w(user);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m64987r(int i, d30 d30Var, View view) {
        m64979j(i);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        act().startActivityForResult(new Intent(act(), nkg.m159887j0() ? FeedModule.m60222H().mo30698Jn() : FeedMyInterestPeopleAct.class), PhotoAlbumActivitiesAct.f42243i);
    }

    public void setInteractionType(String str) {
        this.f42262h = str;
    }

    /* JADX INFO: renamed from: t */
    public final ArrayList<Tag> m64988t() {
        return vwb.m200339n(this.f42264j.profile.tags, new w9j() { // from class: l.t970
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(("personality".equals(tag.category) || Profile.SUGGESTION_REASON.equals(tag.category) || Profile.GAMES.equals(tag.category)) ? false : true);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m64989u(User user, final int i, final d30 d30Var) {
        this.f42264j = user;
        this.f42263i = i;
        qib0.f154691G.m102327J0(this.f42256b, user.m60124fp().profileSize(t100.m186890d(81.0f)), false);
        this.f42257c.setText(i + "个对你感兴趣的人");
        String str = "";
        String str2 = (ijb0.m136583w(user) || TextUtils.isEmpty(user.location.region.city) || user.location.isHideRegionCity()) ? "" : user.location.region.city;
        if (!ijb0.m136582v(user)) {
            str = "•" + user.age + FeedModule.f38852a.getString(R$string.f38974S4);
        }
        this.f42259e.setText(String.format("%s %s%s", user.name, str2, str));
        m64990v();
        m64985p(this.f42256b, user);
        this.f42258d.setOnClickListener(new View.OnClickListener() { // from class: l.o970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.p970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147681a.m64987r(i, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m64990v() {
        final ArrayList<Tag> arrayListM64981s = m64981s();
        ArrayList<Tag> arrayListM64988t = m64988t();
        Objects.requireNonNull(arrayListM64981s);
        ArrayList arrayListM200339n = vwb.m200339n(arrayListM64988t, new yta0(arrayListM64981s));
        ArrayList arrayListM200339n2 = vwb.m200339n(arrayListM64988t, new w9j() { // from class: l.q970
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayListM64981s.contains((Tag) obj));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (arrayListM200339n.size() <= 3) {
            arrayList.addAll(arrayListM200339n);
        } else {
            int i = 0;
            while (i < 3) {
                Tag tag = (Tag) arrayListM200339n.get((int) Math.floor(Math.random() * ((double) arrayListM200339n.size())));
                if (!arrayList.contains(tag)) {
                    arrayList.add(tag);
                    i++;
                }
            }
        }
        if (arrayList.size() < 3 && arrayListM200339n2.size() > 0) {
            if (arrayListM200339n2.size() > 3 - arrayList.size()) {
                int size = 3 - arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Tag tag2 = (Tag) arrayListM200339n2.get((int) Math.floor(Math.random() * ((double) arrayListM200339n2.size())));
                    if (!arrayList.contains(tag2)) {
                        arrayList.add(tag2);
                        i2++;
                    }
                }
            } else {
                arrayList.addAll(arrayListM200339n2);
            }
        }
        String strConcat = (this.f42264j.isFemale() ? "她" : "他").concat("喜欢");
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Tag tag3 = (Tag) arrayList.get(i3);
            strConcat = i3 == arrayList.size() - 1 ? strConcat + tag3.value + "等" : strConcat + tag3.value + "、";
        }
        this.f42260f.setText(strConcat);
        xdl0.m208344M(this.f42260f, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m64991w(User user) {
        vs0.m199802h(act(), null, user.f56011id, "from_activities_profile", false);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64980o(context);
    }

    public PhotoAlbumInterestedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64980o(context);
    }
}
