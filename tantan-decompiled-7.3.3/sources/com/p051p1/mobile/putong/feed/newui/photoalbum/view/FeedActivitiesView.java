package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.mrb0;
import p153l.qa00;
import p153l.tfj0;
import p153l.v370;
import p153l.wmg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedActivitiesView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f43189d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43190e;

    /* JADX INFO: renamed from: f */
    public VText f43191f;

    /* JADX INFO: renamed from: g */
    public VImage f43192g;

    /* JADX INFO: renamed from: h */
    public List<MomentActivity> f43193h;

    /* JADX INFO: renamed from: i */
    public v370 f43194i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f43195j;

    public FeedActivitiesView(Context context) {
        super(context);
        this.f43193h = new ArrayList();
        this.f43194i = new v370();
        m66251z(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m66249B(View view) {
        if (!Network.isConnected(FeedModule.f39700a)) {
            mrb0.m159649c();
        }
        tfj0.m190939b("e_moment_unread_notes_history", OMSDialogPositon.p_nearby, new tfj0.C20302a[0]);
        m66252H();
    }

    /* JADX INFO: renamed from: z */
    private void m66251z(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m66253q(LayoutInflater.from(context), this));
        bnl0.m105524M(this.f43189d, false);
        this.f43189d.setOnClickListener(new View.OnClickListener() { // from class: l.vmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184712a.m66249B(view);
            }
        });
        bnl0.m105540X(this.f43189d, qa00.m175859d(12.0f));
    }

    /* JADX INFO: renamed from: H */
    public final void m66252H() {
        PutongFrag putongFrag = this.f43195j;
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(PhotoAlbumActivitiesAct.m66154X1(putongFrag.act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: q */
    public View m66253q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wmg.m207108b(this, layoutInflater, viewGroup);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43193h = new ArrayList();
        this.f43194i = new v370();
        m66251z(context);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43193h = new ArrayList();
        this.f43194i = new v370();
        m66251z(context);
    }
}
