package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VRelative;
import p149l.nkg;
import p149l.qib0;
import p149l.v970;
import p149l.xdl0;
import p149l.ylg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAlbumInterestedEntranceView extends VRelative implements v970 {

    /* JADX INFO: renamed from: d */
    public VFrame f42232d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42233e;

    /* JADX INFO: renamed from: f */
    public VFrame f42234f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f42235g;

    /* JADX INFO: renamed from: h */
    public VFrame f42236h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f42237i;

    /* JADX INFO: renamed from: j */
    public TextView f42238j;

    /* JADX INFO: renamed from: k */
    public int f42239k;

    /* JADX INFO: renamed from: l */
    public String f42240l;

    /* JADX INFO: renamed from: m */
    public int f42241m;

    public FeedAlbumInterestedEntranceView(Context context) {
        super(context);
        this.f42239k = 3;
        m64963I(context);
    }

    /* JADX INFO: renamed from: I */
    private void m64963I(Context context) {
        addView(m64969q(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public void m64965B() {
        m197546n(this.f42241m, this.f42240l);
    }

    /* JADX INFO: renamed from: H */
    public void m64966H(int i) {
        if (m197544c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m197546n(i, this.f42240l);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m64967L(int i, View view) {
        m64970z(i);
        act().startActivityForResult(new Intent(act(), nkg.m159887j0() ? FeedModule.m60222H().mo30698Jn() : FeedMyInterestPeopleAct.class), PhotoAlbumActivitiesAct.f42243i);
    }

    /* JADX INFO: renamed from: M */
    public void m64968M(List<User> list, final int i) {
        this.f42241m = i;
        if (list.size() >= 3) {
            xdl0.m208344M(this.f42232d, true);
            xdl0.m208344M(this.f42234f, true);
            qib0.f154691G.m102341Q0(this.f42233e, list.get(2).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f42235g, list.get(1).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f42237i, list.get(0).m60124fp().profileSmall());
        } else if (list.size() == 2) {
            xdl0.m208344M(this.f42232d, false);
            xdl0.m208344M(this.f42234f, true);
            qib0.f154691G.m102341Q0(this.f42235g, list.get(1).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f42237i, list.get(0).m60124fp().profileSmall());
        } else {
            int size = list.size();
            VFrame vFrame = this.f42232d;
            if (size == 1) {
                xdl0.m208344M(vFrame, false);
                xdl0.m208344M(this.f42234f, false);
                xdl0.m208344M(this.f42236h, true);
                qib0.f154691G.m102341Q0(this.f42237i, list.get(0).m60124fp().profileSmall());
            } else {
                xdl0.m208344M(vFrame, false);
                xdl0.m208344M(this.f42234f, false);
                xdl0.m208344M(this.f42236h, false);
            }
        }
        this.f42238j.setText(i + "人");
        setOnClickListener(new View.OnClickListener() { // from class: l.xlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193415a.m64967L(i, view);
            }
        });
    }

    @Override // p149l.v970
    public Act act() {
        return (Act) getContext();
    }

    @Override // p149l.v970
    public String getEntranceType() {
        return "normal";
    }

    /* JADX INFO: renamed from: q */
    public View m64969q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ylg.m215266b(this, layoutInflater, viewGroup);
    }

    public void setInteractionType(String str) {
        this.f42240l = str;
    }

    /* JADX INFO: renamed from: z */
    public final void m64970z(int i) {
        m197543b(i, this.f42240l);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42239k = 3;
        m64963I(context);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42239k = 3;
        m64963I(context);
    }
}
