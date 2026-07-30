package com.p046p1.mobile.putong.feed.newui.photoalbum.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentViewerBox;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;
import p149l.e30;
import p149l.exq;
import p149l.igh;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.m84;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.vch;
import p149l.vwb;
import p149l.w9j;
import p149l.wch;
import p149l.xck0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentViewersOperationGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f41974d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f41975e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f41976f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f41977g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f41978h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f41979i;

    /* JADX INFO: renamed from: j */
    public TextView f41980j;

    /* JADX INFO: renamed from: k */
    public VText f41981k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumBaseFrag f41982l;

    /* JADX INFO: renamed from: m */
    public String f41983m;

    /* JADX INFO: renamed from: n */
    public vch f41984n;

    /* JADX INFO: renamed from: o */
    public e30<Intent> f41985o;

    /* JADX INFO: renamed from: p */
    public PopupWindow f41986p;

    public FeedMomentViewersOperationGuideView(Context context) {
        super(context);
        this.f41984n = new wch();
        this.f41985o = xck0.m208120a(400, new e30() { // from class: l.dgh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86081a.m64730L((Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m64724M(Boolean bool) {
        FeedModule.f38855d.f193074v1.onNext(Boolean.TRUE);
        m64733R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m64725P(View view) {
        zvf0.m220399u("e_moment_post", OMSDialogPositon.p_navigation_view, new j760("post_guide_type", "5"));
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else {
            this.f41984n.mo197762a(act(), "from_mine_tab_album", null, this.f41985o);
            m84.m153429e().m153438j();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m64729I(View view) {
        igh.m135984a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m64730L(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m64731O(C4319c c4319c) {
        if (NullChecker.m81303a(this.f41986p) && this.f41986p.isShowing()) {
            this.f41986p.dismiss();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m64732Q(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentViewerBox momentViewerBox, String str) {
        this.f41982l = photoAlbumBaseFrag;
        this.f41983m = str;
        if (momentViewerBox == null) {
            m64733R();
            return;
        }
        if (vwb.m200296J(momentViewerBox.viewers)) {
            m64733R();
            return;
        }
        if (!TextUtils.equals("from_mine_tab_album", str)) {
            m64733R();
            return;
        }
        if (momentViewerBox.viewers.size() < 4) {
            m64733R();
            return;
        }
        if (DateUtils.isToday(FeedModule.f38855d.f192984E1.get().longValue()) && getVisibility() == 8) {
            m64733R();
            return;
        }
        exq.m118693b(this.f41975e, 10.0f);
        User userM209447e8 = FeedModule.f38855d.m209447e8(momentViewerBox.viewers.get(0).userId);
        User userM209447e9 = FeedModule.f38855d.m209447e8(momentViewerBox.viewers.get(1).userId);
        User userM209447e10 = FeedModule.f38855d.m209447e8(momentViewerBox.viewers.get(2).userId);
        User userM209447e11 = FeedModule.f38855d.m209447e8(momentViewerBox.viewers.get(3).userId);
        if (userM209447e8 == null || userM209447e9 == null || userM209447e10 == null || userM209447e11 == null) {
            m64733R();
            return;
        }
        setVisibility(0);
        FeedModule.f38855d.f192984E1.put(Long.valueOf(mqi0.m155944o()));
        FeedModule.f38855d.f193074v1.onNext(Boolean.FALSE);
        qib0.f154691G.m102341Q0(this.f41976f, userM209447e8.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f41977g, userM209447e9.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f41978h, userM209447e10.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f41979i, userM209447e11.m60124fp().profileSmall());
        photoAlbumBaseFrag.duringCreated(FeedModule.f38855d.f193076w1).subscribe(mkd0.m154955G(new e30() { // from class: l.egh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90944a.m64724M((Boolean) obj);
            }
        }));
        photoAlbumBaseFrag.lifecycle().filter(new w9j() { // from class: l.fgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ggh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102501a.m64731O((C4319c) obj);
            }
        }));
        this.f41980j.setText(momentViewerBox.count + "位女生浏览了你的动态");
        xdl0.m208329E0(this.f41974d, new View.OnClickListener() { // from class: l.hgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107601a.m64725P(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m64733R() {
        xdl0.m208325C0(this.f41974d, 0);
        xdl0.m208344M(this.f41974d, false);
        setVisibility(8);
        requestLayout();
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64729I(this);
        setVisibility(8);
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41984n = new wch();
        this.f41985o = xck0.m208120a(400, new e30() { // from class: l.dgh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86081a.m64730L((Intent) obj);
            }
        });
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41984n = new wch();
        this.f41985o = xck0.m208120a(400, new e30() { // from class: l.dgh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86081a.m64730L((Intent) obj);
            }
        });
    }
}
