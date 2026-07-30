package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.ib1;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.osi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.zpd0;
import p007l.a5i;
import p007l.ijb0;
import p007l.kjb0;
import p007l.nyh;
import p007l.oe40;
import p007l.p6j0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f3954c;

    /* JADX INFO: renamed from: d */
    public VText f3955d;

    /* JADX INFO: renamed from: e */
    public VImage f3956e;

    /* JADX INFO: renamed from: f */
    public VText f3957f;

    /* JADX INFO: renamed from: g */
    public zpd0 f3958g;

    /* JADX INFO: renamed from: h */
    public TopicOperations f3959h;

    /* JADX INFO: renamed from: i */
    public boolean f3960i;

    /* JADX INFO: renamed from: j */
    public String f3961j;

    /* JADX INFO: renamed from: k */
    public Act f3962k;

    public FeedSendMomentEnterView(Context context) {
        super(context);
        this.f3958g = new zpd0("show_album_post_guide_time_" + FeedModule.m1139F().userId(), 0L);
        this.f3961j = "p_album";
        m6315Z(context);
    }

    /* JADX INFO: renamed from: Y */
    private void m6314Y() {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!NullChecker.a(audioBusinessTypeC)) {
            m6328j0();
        } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.w(R$string.f343D2);
        } else {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    private void m6315Z(Context context) {
        addView(m6318V(LayoutInflater.from(context), null));
        TextPaint paint = this.f3955d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f3962k = (Act) context;
        xdl0.E0(this.f3956e, new View.OnClickListener() { // from class: l.iyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9162a.m6317c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m6316b0() {
        return !a5i.m8412l(((Long) this.f3958g.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m6317c0(View view) {
        m6314Y();
        m6320X();
    }

    private List<j760<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("bubble_post_guide_type", this.f3960i ? OperationType.man_made : "album_empty"));
        arrayList.add(j760.a("bubble_post_guide_id", this.f3959h.f709id));
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public View m6318V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nyh.m12389b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m6319W() {
        p6j0.m12913c("e_moment_post_bubble", this.f3961j, (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: X */
    public final void m6320X() {
        p6j0.m12913c("e_moment_post", this.f3961j, new j760[0]);
    }

    /* JADX INFO: renamed from: a0 */
    public void m6321a0() {
        this.f3957f.setVisibility(8);
        this.f3957f.setMaxWidth(t100.d(166.0f));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m6322d0(e30 e30Var, View view) {
        if (e30Var != null) {
            e30Var.call("album_first_moment");
            p6j0.m12913c("e_moment_post", "p_album", j760.a("album_post_source", "album_first_moment"));
        } else {
            m6314Y();
            m6320X();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m6323e0(e30 e30Var, View view) {
        this.f3957f.setVisibility(8);
        if (e30Var != null) {
            e30Var.call("moment_post_bubble");
        } else {
            m6314Y();
        }
        m6319W();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m6324f0() {
        this.f3957f.setVisibility(8);
    }

    /* JADX INFO: renamed from: g0 */
    public void m6325g0(final e30 e30Var) {
        xdl0.E0(this.f3956e, new View.OnClickListener() { // from class: l.jyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9552a.m6322d0(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m6326h0(final e30 e30Var) {
        xdl0.E0(this.f3957f, new View.OnClickListener() { // from class: l.kyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9820a.m6323e0(e30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m6327i0(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (!NullChecker.a(xaj0Var) || vwb.J((Collection) xaj0Var.a)) {
            return;
        }
        TopicOperations topicOperations = (TopicOperations) vwb.r((Collection) xaj0Var.a, new w9j() { // from class: l.lyh
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.a(topicOperations) && m6316b0()) {
            this.f3959h = topicOperations;
            this.f3957f.setVisibility(0);
            this.f3960i = z;
            this.f3957f.setText(z ? topicOperations.postGuide.title : "发布第一条动态");
            this.f3958g.put(Long.valueOf(mqi0.o()));
            postDelayed(new Runnable() { // from class: l.myh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10603a.m6324f0();
                }
            }, 4000L);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m6328j0() {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else {
            oe40.m12583k0(this.f3962k, vwb.f0(new Media[0]), true, "myalbum");
        }
    }

    public void setPageId(String str) {
        this.f3961j = str;
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3958g = new zpd0("show_album_post_guide_time_" + FeedModule.m1139F().userId(), 0L);
        this.f3961j = "p_album";
        m6315Z(context);
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3958g = new zpd0("show_album_post_guide_time_" + FeedModule.m1139F().userId(), 0L);
        this.f3961j = "p_album";
        m6315Z(context);
    }
}
