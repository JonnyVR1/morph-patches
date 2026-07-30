package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.qib0;
import l.xdl0;
import p007l.nkg;
import p007l.v970;
import p007l.ylg;
import v.VDraweeView;
import v.VFrame;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAlbumInterestedEntranceView extends VRelative implements v970 {

    /* JADX INFO: renamed from: d */
    public VFrame f3693d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f3694e;

    /* JADX INFO: renamed from: f */
    public VFrame f3695f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3696g;

    /* JADX INFO: renamed from: h */
    public VFrame f3697h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f3698i;

    /* JADX INFO: renamed from: j */
    public TextView f3699j;

    /* JADX INFO: renamed from: k */
    public int f3700k;

    /* JADX INFO: renamed from: l */
    public String f3701l;

    /* JADX INFO: renamed from: m */
    public int f3702m;

    public FeedAlbumInterestedEntranceView(Context context) {
        super(context);
        this.f3700k = 3;
        m6063I(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private void m6063I(Context context) {
        addView(m6069q(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public void m6065B() {
        m15372n(this.f3702m, this.f3701l);
    }

    /* JADX INFO: renamed from: H */
    public void m6066H(int i) {
        if (m15370c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m15372n(i, this.f3701l);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6067L(int i, View view) {
        m6070z(i);
        act().startActivityForResult(new Intent((Context) act(), (Class<?>) (nkg.m12246j0() ? FeedModule.m1140H().Jn() : FeedMyInterestPeopleAct.class)), PhotoAlbumActivitiesAct.f3704i);
    }

    /* JADX INFO: renamed from: M */
    public void m6068M(List<User> list, final int i) {
        this.f3702m = i;
        if (list.size() >= 3) {
            xdl0.M(this.f3693d, true);
            xdl0.M(this.f3695f, true);
            qib0.G.Q0(this.f3694e, list.get(2).m1042fp().profileSmall());
            qib0.G.Q0(this.f3696g, list.get(1).m1042fp().profileSmall());
            qib0.G.Q0(this.f3698i, list.get(0).m1042fp().profileSmall());
        } else if (list.size() == 2) {
            xdl0.M(this.f3693d, false);
            xdl0.M(this.f3695f, true);
            qib0.G.Q0(this.f3696g, list.get(1).m1042fp().profileSmall());
            qib0.G.Q0(this.f3698i, list.get(0).m1042fp().profileSmall());
        } else {
            int size = list.size();
            VFrame vFrame = this.f3693d;
            if (size == 1) {
                xdl0.M(vFrame, false);
                xdl0.M(this.f3695f, false);
                xdl0.M(this.f3697h, true);
                qib0.G.Q0(this.f3698i, list.get(0).m1042fp().profileSmall());
            } else {
                xdl0.M(vFrame, false);
                xdl0.M(this.f3695f, false);
                xdl0.M(this.f3697h, false);
            }
        }
        this.f3699j.setText(i + "人");
        setOnClickListener(new View.OnClickListener() { // from class: l.xlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15034a.m6067L(i, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.v970
    public Act act() {
        return getContext();
    }

    @Override // p007l.v970
    public String getEntranceType() {
        return "normal";
    }

    /* JADX INFO: renamed from: q */
    public View m6069q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ylg.m17168b(this, layoutInflater, viewGroup);
    }

    public void setInteractionType(String str) {
        this.f3701l = str;
    }

    /* JADX INFO: renamed from: z */
    public final void m6070z(int i) {
        m15369b(i, this.f3701l);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3700k = 3;
        m6063I(context);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3700k = 3;
        m6063I(context);
    }
}
