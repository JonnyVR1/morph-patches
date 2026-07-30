package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VText;
import p149l.asg;
import p149l.f30;
import p149l.n8i;
import p149l.nkg;
import p149l.o6c0;
import p149l.p6j0;
import p149l.t100;
import p149l.trg;
import p149l.u2h;
import p149l.vwb;
import p149l.wrg;
import p149l.xdl0;
import p149l.xrg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterImageView extends FeedCenterView {

    /* JADX INFO: renamed from: F */
    public static int f41817F = n8i.f137648d;

    /* JADX INFO: renamed from: B */
    public int f41818B;

    /* JADX INFO: renamed from: C */
    public xrg f41819C;

    /* JADX INFO: renamed from: D */
    public asg f41820D;

    /* JADX INFO: renamed from: E */
    public f30<Moment, Integer> f41821E;

    public FeedCenterImageView(Context context) {
        super(context);
        this.f41818B = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        xrg xrgVar = new xrg();
        this.f41819C = xrgVar;
        xrgVar.m210677A(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: G */
    public void mo64606G() {
        if (this.f41908w == null) {
            return;
        }
        if (nkg.m159845C0()) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(o6c0.f142210i1, (ViewGroup) this.f41908w, false);
            if (viewInflate instanceof FeedMediaRepeatHintView) {
                this.f41910y = (FeedMediaRepeatHintView) viewInflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, t100.f167269r);
                layoutParams.topMargin = t100.f167259h;
                this.f41908w.addView(this.f41910y, layoutParams);
                xdl0.m208344M(this.f41910y, false);
            }
        }
        super.mo64606G();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        VText vTextM210693s = this.f41819C.m210693s();
        if (u2h.m191495d() && moment.isLive) {
            xdl0.m208344M(vTextM210693s, false);
            setFeedCenterImageState(new wrg(act(), this.f41819C, this));
            this.f41820D.mo98593c(i, moment, map);
            m64637F();
            return;
        }
        if (!NullChecker.m81304b(moment.media) || moment.media.size() == 0) {
            return;
        }
        setFeedCenterImageState(new trg(act(), this.f41819C, this));
        this.f41820D.mo98593c(i, moment, map);
        m64647X(vTextM210693s, moment);
        m64648Y(moment);
        m64646W();
        if (this.f41897l) {
            m64608m0(this.f41894i.mediaRepeatIndexList);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m64607l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f41894i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41890e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(i2);
        this.f41890e.setLayoutParams(marginLayoutParams);
        mo64598Z(i, moment, map);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64608m0(List<Integer> list) {
        if (vwb.m200296J(list) || FeedModule.f38855d.f193041f0.containsKey(this.f41894i.f56011id)) {
            return;
        }
        FeedModule.f38855d.f193041f0.put(this.f41894i.f56011id, Boolean.TRUE);
        for (int i = 0; i < list.size(); i++) {
            p6j0.m167671e("e_moment_repeat_reminder", getTextFoldPageId(), vwb.m200311Y("picture_index", Integer.valueOf(list.get(i).intValue() + 1)), vwb.m200311Y("moment_id", this.f41894i.f56011id), vwb.m200311Y("owner_id", this.f41894i.owner));
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        this.f41886a = this.f41819C.m210681g();
        this.f41887b = this.f41819C.m210685k();
        this.f41888c = this.f41819C.m210699y();
        this.f41889d = this.f41819C.m210700z();
        this.f41890e = this.f41819C.m210679e();
        this.f41891f = this.f41819C.m210692r();
        this.f41892g = this.f41819C.m210698x();
        this.f41893h = this.f41819C.m210682h();
        this.f41908w = this.f41819C.m210683i();
    }

    public void setFeedCenterImageState(asg asgVar) {
        this.f41820D = asgVar;
    }

    public void setFrom(String str) {
        this.f41896k = str;
    }

    public void setInterceptClickAction(f30<Moment, Integer> f30Var) {
        this.f41821E = f30Var;
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41818B = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41818B = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }
}
