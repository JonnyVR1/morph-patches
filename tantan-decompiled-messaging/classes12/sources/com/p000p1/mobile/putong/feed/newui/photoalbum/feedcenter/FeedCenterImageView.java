package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.f30;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.asg;
import p007l.n8i;
import p007l.nkg;
import p007l.o6c0;
import p007l.p6j0;
import p007l.trg;
import p007l.u2h;
import p007l.wrg;
import p007l.xrg;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterImageView extends FeedCenterView {

    /* JADX INFO: renamed from: F */
    public static int f3278F = n8i.f10702d;

    /* JADX INFO: renamed from: B */
    public int f3279B;

    /* JADX INFO: renamed from: C */
    public xrg f3280C;

    /* JADX INFO: renamed from: D */
    public asg f3281D;

    /* JADX INFO: renamed from: E */
    public f30<Moment, Integer> f3282E;

    public FeedCenterImageView(Context context) {
        super(context);
        this.f3279B = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        xrg xrgVar = new xrg();
        this.f3280C = xrgVar;
        xrgVar.m16816A(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: G */
    public void mo5700G() {
        if (this.f3369w == null) {
            return;
        }
        if (nkg.m12204C0()) {
            Object objInflate = LayoutInflater.from(getContext()).inflate(o6c0.f11229i1, (ViewGroup) this.f3369w, false);
            if (objInflate instanceof FeedMediaRepeatHintView) {
                this.f3371y = (FeedMediaRepeatHintView) objInflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, t100.r);
                layoutParams.topMargin = t100.h;
                this.f3369w.addView((View) this.f3371y, (ViewGroup.LayoutParams) layoutParams);
                xdl0.M(this.f3371y, false);
            }
        }
        super.mo5700G();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        VText vTextM16832s = this.f3280C.m16832s();
        if (u2h.m14719d() && moment.isLive) {
            xdl0.M(vTextM16832s, false);
            setFeedCenterImageState(new wrg(act(), this.f3280C, this));
            this.f3281D.mo8592c(i, moment, map);
            m5731F();
            return;
        }
        if (!NullChecker.b(moment.media) || moment.media.size() == 0) {
            return;
        }
        setFeedCenterImageState(new trg(act(), this.f3280C, this));
        this.f3281D.mo8592c(i, moment, map);
        m5741X(vTextM16832s, moment);
        m5742Y(moment);
        m5740W();
        if (this.f3358l) {
            m5702m0(this.f3355i.mediaRepeatIndexList);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m5701l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f3355i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3351e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(i2);
        this.f3351e.setLayoutParams(marginLayoutParams);
        mo5692Z(i, moment, map);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5702m0(List<Integer> list) {
        if (vwb.J(list) || FeedModule.f316d.f14976f0.containsKey(((DbObject) this.f3355i).id)) {
            return;
        }
        FeedModule.f316d.f14976f0.put(((DbObject) this.f3355i).id, Boolean.TRUE);
        for (int i = 0; i < list.size(); i++) {
            p6j0.m12915e("e_moment_repeat_reminder", getTextFoldPageId(), vwb.Y("picture_index", Integer.valueOf(list.get(i).intValue() + 1)), vwb.Y("moment_id", ((DbObject) this.f3355i).id), vwb.Y("owner_id", this.f3355i.owner));
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        this.f3347a = this.f3280C.m16820g();
        this.f3348b = this.f3280C.m16824k();
        this.f3349c = this.f3280C.m16838y();
        this.f3350d = this.f3280C.m16839z();
        this.f3351e = this.f3280C.m16818e();
        this.f3352f = this.f3280C.m16831r();
        this.f3353g = this.f3280C.m16837x();
        this.f3354h = this.f3280C.m16821h();
        this.f3369w = this.f3280C.m16822i();
    }

    public void setFeedCenterImageState(asg asgVar) {
        this.f3281D = asgVar;
    }

    public void setFrom(String str) {
        this.f3357k = str;
    }

    public void setInterceptClickAction(f30<Moment, Integer> f30Var) {
        this.f3282E = f30Var;
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3279B = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3279B = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }
}
