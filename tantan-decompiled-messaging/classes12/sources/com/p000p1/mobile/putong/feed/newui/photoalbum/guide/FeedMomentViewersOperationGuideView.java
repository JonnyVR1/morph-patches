package com.p000p1.mobile.putong.feed.newui.photoalbum.guide;

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
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentViewerBox;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xdl0;
import l.zvf0;
import p007l.exq;
import p007l.igh;
import p007l.ijb0;
import p007l.kjb0;
import p007l.m84;
import p007l.vch;
import p007l.wch;
import v.VDraweeView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentViewersOperationGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f3435d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f3436e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3437f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3438g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3439h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f3440i;

    /* JADX INFO: renamed from: j */
    public TextView f3441j;

    /* JADX INFO: renamed from: k */
    public VText f3442k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumBaseFrag f3443l;

    /* JADX INFO: renamed from: m */
    public String f3444m;

    /* JADX INFO: renamed from: n */
    public vch f3445n;

    /* JADX INFO: renamed from: o */
    public e30<Intent> f3446o;

    /* JADX INFO: renamed from: p */
    public PopupWindow f3447p;

    public FeedMomentViewersOperationGuideView(Context context) {
        super(context);
        this.f3445n = new wch();
        this.f3446o = xck0.a(400, new e30() { // from class: l.dgh
            public final void call(Object obj) {
                this.f6926a.m5824L((Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m5818M(Boolean bool) {
        FeedModule.f316d.f15009v1.onNext(Boolean.TRUE);
        m5827R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m5819P(View view) {
        zvf0.u("e_moment_post", OMSDialogPositon.p_navigation_view, new j760[]{new j760("post_guide_type", "5")});
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else {
            this.f3445n.mo15419a(act(), "from_mine_tab_album", null, this.f3446o);
            m84.m11844e().m11853j();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m5823I(View view) {
        igh.m10871a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m5824L(Intent intent) {
        act().startActivityForResult(intent, 786);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m5825O(c cVar) {
        if (NullChecker.a(this.f3447p) && this.f3447p.isShowing()) {
            this.f3447p.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m5826Q(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentViewerBox momentViewerBox, String str) {
        this.f3443l = photoAlbumBaseFrag;
        this.f3444m = str;
        if (momentViewerBox == null) {
            m5827R();
            return;
        }
        if (vwb.J(momentViewerBox.viewers)) {
            m5827R();
            return;
        }
        if (!TextUtils.equals("from_mine_tab_album", str)) {
            m5827R();
            return;
        }
        if (momentViewerBox.viewers.size() < 4) {
            m5827R();
            return;
        }
        if (DateUtils.isToday(((Long) FeedModule.f316d.f14919E1.get()).longValue()) && getVisibility() == 8) {
            m5827R();
            return;
        }
        exq.m9962b(this.f3436e, 10.0f);
        User userM16628e8 = FeedModule.f316d.m16628e8(momentViewerBox.viewers.get(0).userId);
        User userM16628e9 = FeedModule.f316d.m16628e8(momentViewerBox.viewers.get(1).userId);
        User userM16628e10 = FeedModule.f316d.m16628e8(momentViewerBox.viewers.get(2).userId);
        User userM16628e11 = FeedModule.f316d.m16628e8(momentViewerBox.viewers.get(3).userId);
        if (userM16628e8 == null || userM16628e9 == null || userM16628e10 == null || userM16628e11 == null) {
            m5827R();
            return;
        }
        setVisibility(0);
        FeedModule.f316d.f14919E1.put(Long.valueOf(mqi0.o()));
        FeedModule.f316d.f15009v1.onNext(Boolean.FALSE);
        qib0.G.Q0(this.f3437f, userM16628e8.m1042fp().profileSmall());
        qib0.G.Q0(this.f3438g, userM16628e9.m1042fp().profileSmall());
        qib0.G.Q0(this.f3439h, userM16628e10.m1042fp().profileSmall());
        qib0.G.Q0(this.f3440i, userM16628e11.m1042fp().profileSmall());
        photoAlbumBaseFrag.duringCreated(FeedModule.f316d.f15011w1).subscribe(mkd0.G(new e30() { // from class: l.egh
            public final void call(Object obj) {
                this.f7353a.m5818M((Boolean) obj);
            }
        }));
        photoAlbumBaseFrag.lifecycle().filter(new w9j() { // from class: l.fgh
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ggh
            public final void call(Object obj) {
                this.f8449a.m5825O((c) obj);
            }
        }));
        this.f3441j.setText(momentViewerBox.count + "位女生浏览了你的动态");
        xdl0.E0(this.f3435d, new View.OnClickListener() { // from class: l.hgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8715a.m5819P(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m5827R() {
        xdl0.C0(this.f3435d, 0);
        xdl0.M(this.f3435d, false);
        setVisibility(8);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5823I(this);
        setVisibility(8);
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3445n = new wch();
        this.f3446o = xck0.a(400, new e30() { // from class: l.dgh
            public final void call(Object obj) {
                this.f6926a.m5824L((Intent) obj);
            }
        });
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3445n = new wch();
        this.f3446o = xck0.a(400, new e30() { // from class: l.dgh
            public final void call(Object obj) {
                this.f6926a.m5824L((Intent) obj);
            }
        });
    }
}
