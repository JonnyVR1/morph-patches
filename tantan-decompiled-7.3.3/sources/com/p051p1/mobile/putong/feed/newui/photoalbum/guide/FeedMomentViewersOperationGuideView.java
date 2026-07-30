package com.p051p1.mobile.putong.feed.newui.photoalbum.guide;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentViewerBox;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dmk0;
import p153l.ezq;
import p153l.i4g0;
import p153l.jyb;
import p153l.keh;
import p153l.l94;
import p153l.leh;
import p153l.mrb0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.uqb0;
import p153l.xhh;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentViewersOperationGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f42822d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42823e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42824f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f42825g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f42826h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f42827i;

    /* JADX INFO: renamed from: j */
    public TextView f42828j;

    /* JADX INFO: renamed from: k */
    public VText f42829k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumBaseFrag f42830l;

    /* JADX INFO: renamed from: m */
    public String f42831m;

    /* JADX INFO: renamed from: n */
    public keh f42832n;

    /* JADX INFO: renamed from: o */
    public y20<Intent> f42833o;

    /* JADX INFO: renamed from: p */
    public PopupWindow f42834p;

    public FeedMomentViewersOperationGuideView(Context context) {
        super(context);
        this.f42832n = new leh();
        this.f42833o = dmk0.m116962a(400, new y20() { // from class: l.shh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168708a.m65913L((Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m65907M(Boolean bool) {
        FeedModule.f39703d.f121384v1.onNext(Boolean.TRUE);
        m65916R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m65908P(View view) {
        i4g0.m138523u("e_moment_post", OMSDialogPositon.p_navigation_view, new pf60("post_guide_type", "5"));
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else {
            this.f42832n.mo149319a(act(), "from_mine_tab_album", null, this.f42833o);
            l94.m153309e().m153318j();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m65912I(View view) {
        xhh.m211043a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m65913L(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m65914O(C4470c c4470c) {
        if (NullChecker.m82486a(this.f42834p) && this.f42834p.isShowing()) {
            this.f42834p.dismiss();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    public void m65915Q(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentViewerBox momentViewerBox, String str) {
        this.f42830l = photoAlbumBaseFrag;
        this.f42831m = str;
        if (momentViewerBox == null) {
            m65916R();
            return;
        }
        if (jyb.m147479J(momentViewerBox.viewers)) {
            m65916R();
            return;
        }
        if (!TextUtils.equals("from_mine_tab_album", str)) {
            m65916R();
            return;
        }
        if (momentViewerBox.viewers.size() < 4) {
            m65916R();
            return;
        }
        if (DateUtils.isToday(FeedModule.f39703d.f121294E1.get().longValue()) && getVisibility() == 8) {
            m65916R();
            return;
        }
        ezq.m123397b(this.f42823e, 10.0f);
        User userM145688e8 = FeedModule.f39703d.m145688e8(momentViewerBox.viewers.get(0).userId);
        User userM145688e9 = FeedModule.f39703d.m145688e8(momentViewerBox.viewers.get(1).userId);
        User userM145688e10 = FeedModule.f39703d.m145688e8(momentViewerBox.viewers.get(2).userId);
        User userM145688e11 = FeedModule.f39703d.m145688e8(momentViewerBox.viewers.get(3).userId);
        if (userM145688e8 == null || userM145688e9 == null || userM145688e10 == null || userM145688e11 == null) {
            m65916R();
            return;
        }
        setVisibility(0);
        FeedModule.f39703d.f121294E1.put(Long.valueOf(pzi0.m174454o()));
        FeedModule.f39703d.f121384v1.onNext(Boolean.FALSE);
        uqb0.f180374G.m127125Q0(this.f42824f, userM145688e8.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f42825g, userM145688e9.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f42826h, userM145688e10.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f42827i, userM145688e11.m61308fp().profileSmall());
        photoAlbumBaseFrag.duringCreated(FeedModule.f39703d.f121386w1).subscribe(psd0.m173596G(new y20() { // from class: l.thh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174370a.m65907M((Boolean) obj);
            }
        }));
        photoAlbumBaseFrag.lifecycle().filter(new qcj() { // from class: l.uhh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vhh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184165a.m65914O((C4470c) obj);
            }
        }));
        this.f42828j.setText(momentViewerBox.count + "位女生浏览了你的动态");
        bnl0.m105509E0(this.f42822d, new View.OnClickListener() { // from class: l.whh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189150a.m65908P(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m65916R() {
        bnl0.m105505C0(this.f42822d, 0);
        bnl0.m105524M(this.f42822d, false);
        setVisibility(8);
        requestLayout();
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65912I(this);
        setVisibility(8);
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42832n = new leh();
        this.f42833o = dmk0.m116962a(400, new y20() { // from class: l.shh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168708a.m65913L((Intent) obj);
            }
        });
    }

    public FeedMomentViewersOperationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42832n = new leh();
        this.f42833o = dmk0.m116962a(400, new y20() { // from class: l.shh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168708a.m65913L((Intent) obj);
            }
        });
    }
}
