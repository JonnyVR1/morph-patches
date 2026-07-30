package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.cai;
import p153l.cmg;
import p153l.itg;
import p153l.j4h;
import p153l.jyb;
import p153l.ltg;
import p153l.mtg;
import p153l.ptg;
import p153l.qa00;
import p153l.tec0;
import p153l.tfj0;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterImageView extends FeedCenterView {

    /* JADX INFO: renamed from: F */
    public static int f42665F = cai.f80595d;

    /* JADX INFO: renamed from: B */
    public int f42666B;

    /* JADX INFO: renamed from: C */
    public mtg f42667C;

    /* JADX INFO: renamed from: D */
    public ptg f42668D;

    /* JADX INFO: renamed from: E */
    public z20<Moment, Integer> f42669E;

    public FeedCenterImageView(Context context) {
        super(context);
        this.f42666B = cai.m108495c(cai.f80594c, cai.f80595d);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        mtg mtgVar = new mtg();
        this.f42667C = mtgVar;
        mtgVar.m159993A(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: G */
    public void mo65789G() {
        if (this.f42756w == null) {
            return;
        }
        if (cmg.m111174C0()) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(tec0.f173679i1, (ViewGroup) this.f42756w, false);
            if (viewInflate instanceof FeedMediaRepeatHintView) {
                this.f42758y = (FeedMediaRepeatHintView) viewInflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, qa00.f156331r);
                layoutParams.topMargin = qa00.f156321h;
                this.f42756w.addView(this.f42758y, layoutParams);
                bnl0.m105524M(this.f42758y, false);
            }
        }
        super.mo65789G();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        VText vTextM160009s = this.f42667C.m160009s();
        if (j4h.m143420d() && moment.isLive) {
            bnl0.m105524M(vTextM160009s, false);
            setFeedCenterImageState(new ltg(act(), this.f42667C, this));
            this.f42668D.mo142037c(i, moment, map);
            m65820F();
            return;
        }
        if (!NullChecker.m82487b(moment.media) || moment.media.size() == 0) {
            return;
        }
        setFeedCenterImageState(new itg(act(), this.f42667C, this));
        this.f42668D.mo142037c(i, moment, map);
        m65830X(vTextM160009s, moment);
        m65831Y(moment);
        m65829W();
        if (this.f42745l) {
            m65791m0(this.f42742i.mediaRepeatIndexList);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m65790l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f42742i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42738e.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(i2);
        this.f42738e.setLayoutParams(marginLayoutParams);
        mo65781Z(i, moment, map);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65791m0(List<Integer> list) {
        if (jyb.m147479J(list) || FeedModule.f39703d.f121351f0.containsKey(this.f42742i.f56859id)) {
            return;
        }
        FeedModule.f39703d.f121351f0.put(this.f42742i.f56859id, Boolean.TRUE);
        for (int i = 0; i < list.size(); i++) {
            tfj0.m190942e("e_moment_repeat_reminder", getTextFoldPageId(), jyb.m147494Y("picture_index", Integer.valueOf(list.get(i).intValue() + 1)), jyb.m147494Y("moment_id", this.f42742i.f56859id), jyb.m147494Y("owner_id", this.f42742i.owner));
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        this.f42734a = this.f42667C.m159997g();
        this.f42735b = this.f42667C.m160001k();
        this.f42736c = this.f42667C.m160015y();
        this.f42737d = this.f42667C.m160016z();
        this.f42738e = this.f42667C.m159995e();
        this.f42739f = this.f42667C.m160008r();
        this.f42740g = this.f42667C.m160014x();
        this.f42741h = this.f42667C.m159998h();
        this.f42756w = this.f42667C.m159999i();
    }

    public void setFeedCenterImageState(ptg ptgVar) {
        this.f42668D = ptgVar;
    }

    public void setFrom(String str) {
        this.f42744k = str;
    }

    public void setInterceptClickAction(z20<Moment, Integer> z20Var) {
        this.f42669E = z20Var;
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42666B = cai.m108495c(cai.f80594c, cai.f80595d);
    }

    public FeedCenterImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42666B = cai.m108495c(cai.f80594c, cai.f80595d);
    }
}
