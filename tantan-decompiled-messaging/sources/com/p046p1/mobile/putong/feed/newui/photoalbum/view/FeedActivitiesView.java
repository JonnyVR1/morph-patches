package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.hlg;
import p149l.ijb0;
import p149l.p6j0;
import p149l.pv60;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedActivitiesView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f42341d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42342e;

    /* JADX INFO: renamed from: f */
    public VText f42343f;

    /* JADX INFO: renamed from: g */
    public VImage f42344g;

    /* JADX INFO: renamed from: h */
    public List<MomentActivity> f42345h;

    /* JADX INFO: renamed from: i */
    public pv60 f42346i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f42347j;

    public FeedActivitiesView(Context context) {
        super(context);
        this.f42345h = new ArrayList();
        this.f42346i = new pv60();
        m65068z(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m65066B(View view) {
        if (!Network.isConnected(FeedModule.f38852a)) {
            ijb0.m136563c();
        }
        p6j0.m167668b("e_moment_unread_notes_history", OMSDialogPositon.p_nearby, new p6j0.C19147a[0]);
        m65069H();
    }

    /* JADX INFO: renamed from: z */
    private void m65068z(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m65070q(LayoutInflater.from(context), this));
        xdl0.m208344M(this.f42341d, false);
        this.f42341d.setOnClickListener(new View.OnClickListener() { // from class: l.glg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103318a.m65066B(view);
            }
        });
        xdl0.m208360X(this.f42341d, t100.m186890d(12.0f));
    }

    /* JADX INFO: renamed from: H */
    public final void m65069H() {
        PutongFrag putongFrag = this.f42347j;
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(PhotoAlbumActivitiesAct.m64971V1(putongFrag.act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: q */
    public View m65070q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hlg.m131654b(this, layoutInflater, viewGroup);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42345h = new ArrayList();
        this.f42346i = new pv60();
        m65068z(context);
    }

    public FeedActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42345h = new ArrayList();
        this.f42346i = new pv60();
        m65068z(context);
    }
}
