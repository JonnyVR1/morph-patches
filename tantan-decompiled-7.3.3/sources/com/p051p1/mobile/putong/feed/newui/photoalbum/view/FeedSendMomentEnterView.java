package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.byd0;
import p153l.c0i;
import p153l.cn40;
import p153l.jyb;
import p153l.mrb0;
import p153l.o1j0;
import p153l.orb0;
import p153l.p6i;
import p153l.pb1;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.tfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43341c;

    /* JADX INFO: renamed from: d */
    public VText f43342d;

    /* JADX INFO: renamed from: e */
    public VImage f43343e;

    /* JADX INFO: renamed from: f */
    public VText f43344f;

    /* JADX INFO: renamed from: g */
    public byd0 f43345g;

    /* JADX INFO: renamed from: h */
    public TopicOperations f43346h;

    /* JADX INFO: renamed from: i */
    public boolean f43347i;

    /* JADX INFO: renamed from: j */
    public String f43348j;

    /* JADX INFO: renamed from: k */
    public Act f43349k;

    public FeedSendMomentEnterView(Context context) {
        super(context);
        this.f43345g = new byd0("show_album_post_guide_time_" + FeedModule.m61405F().userId(), 0L);
        this.f43348j = "p_album";
        m66397Z(context);
    }

    /* JADX INFO: renamed from: Y */
    private void m66396Y() {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            m66410j0();
        } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            o1j0.m165649w(R$string.f39730D2);
        } else {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m66397Z(Context context) {
        addView(m66400V(LayoutInflater.from(context), null));
        TextPaint paint = this.f43342d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43349k = (Act) context;
        bnl0.m105509E0(this.f43343e, new View.OnClickListener() { // from class: l.xzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196874a.m66399c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m66398b0() {
        return !p6i.m170903l(this.f43345g.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m66399c0(View view) {
        m66396Y();
        m66402X();
    }

    private List<pf60<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("bubble_post_guide_type", this.f43347i ? OperationType.man_made : "album_empty"));
        arrayList.add(pf60.m172085a("bubble_post_guide_id", this.f43346h.f40096id));
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public View m66400V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c0i.m107426b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m66401W() {
        tfj0.m190940c("e_moment_post_bubble", this.f43348j, (pf60[]) getGuideViewTrackingParis().toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: X */
    public final void m66402X() {
        tfj0.m190940c("e_moment_post", this.f43348j, new pf60[0]);
    }

    /* JADX INFO: renamed from: a0 */
    public void m66403a0() {
        this.f43344f.setVisibility(8);
        this.f43344f.setMaxWidth(qa00.m175859d(166.0f));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m66404d0(y20 y20Var, View view) {
        if (y20Var != null) {
            y20Var.call("album_first_moment");
            tfj0.m190940c("e_moment_post", "p_album", pf60.m172085a("album_post_source", "album_first_moment"));
        } else {
            m66396Y();
            m66402X();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m66405e0(y20 y20Var, View view) {
        this.f43344f.setVisibility(8);
        if (y20Var != null) {
            y20Var.call("moment_post_bubble");
        } else {
            m66396Y();
        }
        m66401W();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m66406f0() {
        this.f43344f.setVisibility(8);
    }

    /* JADX INFO: renamed from: g0 */
    public void m66407g0(final y20 y20Var) {
        bnl0.m105509E0(this.f43343e, new View.OnClickListener() { // from class: l.yzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202194a.m66404d0(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m66408h0(final y20 y20Var) {
        bnl0.m105509E0(this.f43344f, new View.OnClickListener() { // from class: l.zzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206705a.m66405e0(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m66409i0(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var, boolean z) {
        if (!NullChecker.m82486a(bkj0Var) || jyb.m147479J(bkj0Var.f77081a)) {
            return;
        }
        TopicOperations topicOperations = (TopicOperations) jyb.m147529r(bkj0Var.f77081a, new qcj() { // from class: l.a0i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.m82486a(topicOperations) && m66398b0()) {
            this.f43346h = topicOperations;
            this.f43344f.setVisibility(0);
            this.f43347i = z;
            this.f43344f.setText(z ? topicOperations.postGuide.title : "发布第一条动态");
            this.f43345g.put(Long.valueOf(pzi0.m174454o()));
            postDelayed(new Runnable() { // from class: l.b0i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74273a.m66406f0();
                }
            }, 4000L);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m66410j0() {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else {
            cn40.m111396k0(this.f43349k, jyb.m147507f0(new Media[0]), true, "myalbum");
        }
    }

    public void setPageId(String str) {
        this.f43348j = str;
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43345g = new byd0("show_album_post_guide_time_" + FeedModule.m61405F().userId(), 0L);
        this.f43348j = "p_album";
        m66397Z(context);
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43345g = new byd0("show_album_post_guide_time_" + FeedModule.m61405F().userId(), 0L);
        this.f43348j = "p_album";
        m66397Z(context);
    }
}
