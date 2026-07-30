package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VRelative;
import p153l.bi70;
import p153l.bnl0;
import p153l.cmg;
import p153l.nng;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAlbumInterestedEntranceView extends VRelative implements bi70 {

    /* JADX INFO: renamed from: d */
    public VFrame f43080d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43081e;

    /* JADX INFO: renamed from: f */
    public VFrame f43082f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f43083g;

    /* JADX INFO: renamed from: h */
    public VFrame f43084h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f43085i;

    /* JADX INFO: renamed from: j */
    public TextView f43086j;

    /* JADX INFO: renamed from: k */
    public int f43087k;

    /* JADX INFO: renamed from: l */
    public String f43088l;

    /* JADX INFO: renamed from: m */
    public int f43089m;

    public FeedAlbumInterestedEntranceView(Context context) {
        super(context);
        this.f43087k = 3;
        m66146I(context);
    }

    /* JADX INFO: renamed from: I */
    private void m66146I(Context context) {
        addView(m66152q(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: B */
    public void m66148B() {
        m104426n(this.f43089m, this.f43088l);
    }

    /* JADX INFO: renamed from: H */
    public void m66149H(int i) {
        if (m104424c(act()).equals("p_interactcell_detail")) {
            return;
        }
        m104426n(i, this.f43088l);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m66150L(int i, View view) {
        m66153z(i);
        act().startActivityForResult(new Intent(act(), cmg.m111216j0() ? FeedModule.m61406H().mo31701Jn() : FeedMyInterestPeopleAct.class), PhotoAlbumActivitiesAct.f43091i);
    }

    /* JADX INFO: renamed from: M */
    public void m66151M(List<User> list, final int i) {
        this.f43089m = i;
        if (list.size() >= 3) {
            bnl0.m105524M(this.f43080d, true);
            bnl0.m105524M(this.f43082f, true);
            uqb0.f180374G.m127125Q0(this.f43081e, list.get(2).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f43083g, list.get(1).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f43085i, list.get(0).m61308fp().profileSmall());
        } else if (list.size() == 2) {
            bnl0.m105524M(this.f43080d, false);
            bnl0.m105524M(this.f43082f, true);
            uqb0.f180374G.m127125Q0(this.f43083g, list.get(1).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f43085i, list.get(0).m61308fp().profileSmall());
        } else {
            int size = list.size();
            VFrame vFrame = this.f43080d;
            if (size == 1) {
                bnl0.m105524M(vFrame, false);
                bnl0.m105524M(this.f43082f, false);
                bnl0.m105524M(this.f43084h, true);
                uqb0.f180374G.m127125Q0(this.f43085i, list.get(0).m61308fp().profileSmall());
            } else {
                bnl0.m105524M(vFrame, false);
                bnl0.m105524M(this.f43082f, false);
                bnl0.m105524M(this.f43084h, false);
            }
        }
        this.f43086j.setText(i + "人");
        setOnClickListener(new View.OnClickListener() { // from class: l.mng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137696a.m66150L(i, view);
            }
        });
    }

    @Override // p153l.bi70
    public Act act() {
        return (Act) getContext();
    }

    @Override // p153l.bi70
    public String getEntranceType() {
        return "normal";
    }

    /* JADX INFO: renamed from: q */
    public View m66152q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nng.m163866b(this, layoutInflater, viewGroup);
    }

    public void setInteractionType(String str) {
        this.f43088l = str;
    }

    /* JADX INFO: renamed from: z */
    public final void m66153z(int i) {
        m104423b(i, this.f43088l);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43087k = 3;
        m66146I(context);
    }

    public FeedAlbumInterestedEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43087k = 3;
        m66146I(context);
    }
}
