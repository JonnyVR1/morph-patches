package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a5i;
import p149l.e30;
import p149l.ib1;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.lsi0;
import p149l.mqi0;
import p149l.nyh;
import p149l.oe40;
import p149l.osi0;
import p149l.p6j0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f42493c;

    /* JADX INFO: renamed from: d */
    public VText f42494d;

    /* JADX INFO: renamed from: e */
    public VImage f42495e;

    /* JADX INFO: renamed from: f */
    public VText f42496f;

    /* JADX INFO: renamed from: g */
    public zpd0 f42497g;

    /* JADX INFO: renamed from: h */
    public TopicOperations f42498h;

    /* JADX INFO: renamed from: i */
    public boolean f42499i;

    /* JADX INFO: renamed from: j */
    public String f42500j;

    /* JADX INFO: renamed from: k */
    public Act f42501k;

    public FeedSendMomentEnterView(Context context) {
        super(context);
        this.f42497g = new zpd0("show_album_post_guide_time_" + FeedModule.m60221F().userId(), 0L);
        this.f42500j = "p_album";
        m65214Z(context);
    }

    /* JADX INFO: renamed from: Y */
    private void m65213Y() {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            m65227j0();
        } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.m151593w(R$string.f38882D2);
        } else {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m65214Z(Context context) {
        addView(m65217V(LayoutInflater.from(context), null));
        TextPaint paint = this.f42494d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f42501k = (Act) context;
        xdl0.m208329E0(this.f42495e, new View.OnClickListener() { // from class: l.iyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115458a.m65216c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m65215b0() {
        return !a5i.m95036l(this.f42497g.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m65216c0(View view) {
        m65213Y();
        m65219X();
    }

    private List<j760<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("bubble_post_guide_type", this.f42499i ? OperationType.man_made : "album_empty"));
        arrayList.add(j760.m140076a("bubble_post_guide_id", this.f42498h.f39248id));
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public View m65217V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nyh.m162010b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m65218W() {
        p6j0.m167669c("e_moment_post_bubble", this.f42500j, (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: X */
    public final void m65219X() {
        p6j0.m167669c("e_moment_post", this.f42500j, new j760[0]);
    }

    /* JADX INFO: renamed from: a0 */
    public void m65220a0() {
        this.f42496f.setVisibility(8);
        this.f42496f.setMaxWidth(t100.m186890d(166.0f));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m65221d0(e30 e30Var, View view) {
        if (e30Var != null) {
            e30Var.call("album_first_moment");
            p6j0.m167669c("e_moment_post", "p_album", j760.m140076a("album_post_source", "album_first_moment"));
        } else {
            m65213Y();
            m65219X();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m65222e0(e30 e30Var, View view) {
        this.f42496f.setVisibility(8);
        if (e30Var != null) {
            e30Var.call("moment_post_bubble");
        } else {
            m65213Y();
        }
        m65218W();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m65223f0() {
        this.f42496f.setVisibility(8);
    }

    /* JADX INFO: renamed from: g0 */
    public void m65224g0(final e30 e30Var) {
        xdl0.m208329E0(this.f42495e, new View.OnClickListener() { // from class: l.jyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120307a.m65221d0(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m65225h0(final e30 e30Var) {
        xdl0.m208329E0(this.f42496f, new View.OnClickListener() { // from class: l.kyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125306a.m65222e0(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m65226i0(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (!NullChecker.m81303a(xaj0Var) || vwb.m200296J(xaj0Var.f191751a)) {
            return;
        }
        TopicOperations topicOperations = (TopicOperations) vwb.m200346r(xaj0Var.f191751a, new w9j() { // from class: l.lyh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.m81303a(topicOperations) && m65215b0()) {
            this.f42498h = topicOperations;
            this.f42496f.setVisibility(0);
            this.f42499i = z;
            this.f42496f.setText(z ? topicOperations.postGuide.title : "发布第一条动态");
            this.f42497g.put(Long.valueOf(mqi0.m155944o()));
            postDelayed(new Runnable() { // from class: l.myh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136311a.m65223f0();
                }
            }, 4000L);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m65227j0() {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else {
            oe40.m163846k0(this.f42501k, vwb.m200324f0(new Media[0]), true, "myalbum");
        }
    }

    public void setPageId(String str) {
        this.f42500j = str;
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42497g = new zpd0("show_album_post_guide_time_" + FeedModule.m60221F().userId(), 0L);
        this.f42500j = "p_album";
        m65214Z(context);
    }

    public FeedSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42497g = new zpd0("show_album_post_guide_time_" + FeedModule.m60221F().userId(), 0L);
        this.f42500j = "p_album";
        m65214Z(context);
    }
}
