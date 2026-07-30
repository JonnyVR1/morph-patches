package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.List;
import l.t100;
import l.xdl0;
import p007l.hlg;
import p007l.ijb0;
import p007l.p6j0;
import p007l.pv60;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedActivitiesView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f3802d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f3803e;

    /* JADX INFO: renamed from: f */
    public VText f3804f;

    /* JADX INFO: renamed from: g */
    public VImage f3805g;

    /* JADX INFO: renamed from: h */
    public List<MomentActivity> f3806h;

    /* JADX INFO: renamed from: i */
    public pv60 f3807i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f3808j;

    public FeedActivitiesView(Context context) {
        super(context);
        this.f3806h = new ArrayList();
        this.f3807i = new pv60();
        m6169z(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m6167B(View view) {
        if (!Network.isConnected(FeedModule.f313a)) {
            ijb0.m10916c();
        }
        p6j0.m12912b("e_moment_unread_notes_history", OMSDialogPositon.p_nearby, new p6j0.C2456a[0]);
        m6170H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private void m6169z(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m6171q(LayoutInflater.from(context), this));
        xdl0.M(this.f3802d, false);
        this.f3802d.setOnClickListener(new View.OnClickListener() { // from class: l.glg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8477a.m6167B(view);
            }
        });
        xdl0.X(this.f3802d, t100.d(12.0f));
    }

    /* JADX INFO: renamed from: H */
    public final void m6170H() {
        PutongFrag putongFrag = this.f3808j;
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(PhotoAlbumActivitiesAct.m6071V1(putongFrag.act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: q */
    public View m6171q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hlg.m10648b(this, layoutInflater, viewGroup);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3806h = new ArrayList();
        this.f3807i = new pv60();
        m6169z(context);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3806h = new ArrayList();
        this.f3807i = new pv60();
        m6169z(context);
    }
}
