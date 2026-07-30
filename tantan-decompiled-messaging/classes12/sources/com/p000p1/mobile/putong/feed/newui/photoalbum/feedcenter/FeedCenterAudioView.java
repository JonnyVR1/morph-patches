package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.t100;
import l.xdl0;
import p007l.krg;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterAudioView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public VLinear f3261B;

    /* JADX INFO: renamed from: C */
    public TextView f3262C;

    /* JADX INFO: renamed from: D */
    public VText f3263D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f3264E;

    /* JADX INFO: renamed from: F */
    public VExpandableTextContainer f3265F;

    /* JADX INFO: renamed from: G */
    public VText f3266G;

    /* JADX INFO: renamed from: H */
    public FeedAudioPlayerView f3267H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f3268I;

    /* JADX INFO: renamed from: J */
    public View f3269J;

    public FeedCenterAudioView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        m5693o0(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, final Moment moment, final HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        this.f3355i = moment;
        CharSequence charSequenceM5730E = m5730E(moment.momentValue);
        this.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.irg
            /* JADX INFO: renamed from: a */
            public final void m11023a(boolean z) {
                map.put(((DbObject) moment).id, Boolean.valueOf(z));
            }
        }).M(charSequenceM5730E);
        this.f3267H.m7440Y0(moment);
        this.f3267H.m7444e1(this.f3357k, this.f3362p);
        m5694p0(charSequenceM5730E);
        m5741X(this.f3266G, moment);
        m5742Y(moment);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m5693o0(View view) {
        krg.m11515a(this, view);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: p0 */
    public void m5694p0(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ConstraintLayout constraintLayout = this.f3267H;
        if (zIsEmpty) {
            xdl0.X(constraintLayout, 0);
        } else {
            xdl0.X(constraintLayout, t100.d(12.0f));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5695q0(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        m5735O(z);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        super.mo5696r();
        this.f3347a = this.f3264E;
        VExpandableTextContainer vExpandableTextContainer = this.f3265F;
        this.f3352f = vExpandableTextContainer;
        this.f3353g = vExpandableTextContainer.getTextView();
        this.f3354h = this.f3269J;
        this.f3349c = this.f3262C;
        this.f3350d = this.f3263D;
        this.f3348b = this.f3261B;
        this.f3351e = this.f3264E;
        this.f3369w = this.f3268I;
        this.f3267H.setMaxWidth(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: r0 */
    public void m5697r0(String str, final Moment moment, final HashMap<String, Boolean> map) {
        this.f3355i = moment;
        CharSequence charSequenceM5730E = m5730E(moment.momentValue);
        this.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.jrg
            /* JADX INFO: renamed from: a */
            public final void m11323a(boolean z) {
                this.f9505a.m5695q0(map, moment, z);
            }
        }).M(charSequenceM5730E);
        this.f3267H.m7440Y0(moment);
        this.f3267H.m7444e1(str, false);
        m5694p0(charSequenceM5730E);
        m5741X(this.f3266G, moment);
        m5742Y(moment);
    }

    /* JADX INFO: renamed from: s0 */
    public void m5698s0(int i, int i2, int i3, int i4) {
        this.f3264E.setPadding(i, i2, i3, i4);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
