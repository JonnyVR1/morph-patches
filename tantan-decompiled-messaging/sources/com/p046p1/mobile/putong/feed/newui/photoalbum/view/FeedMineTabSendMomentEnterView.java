package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.ib1;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.lsi0;
import p149l.oe40;
import p149l.osi0;
import p149l.p6j0;
import p149l.qdh;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMineTabSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f42417c;

    /* JADX INFO: renamed from: d */
    public VText f42418d;

    /* JADX INFO: renamed from: e */
    public VLinear f42419e;

    /* JADX INFO: renamed from: f */
    public TextView f42420f;

    /* JADX INFO: renamed from: g */
    public String f42421g;

    /* JADX INFO: renamed from: h */
    public Act f42422h;

    public FeedMineTabSendMomentEnterView(Context context) {
        super(context);
        this.f42421g = OMSDialogPositon.p_navigation_view;
        m65146T(context);
    }

    /* JADX INFO: renamed from: S */
    private void m65145S() {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            m65150X();
        } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.m151593w(R$string.f38882D2);
        } else {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: T */
    private void m65146T(Context context) {
        addView(m65148R(LayoutInflater.from(context), null));
        TextPaint paint = this.f42418d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f42422h = (Act) context;
        xdl0.m208329E0(this.f42419e, new View.OnClickListener() { // from class: l.odh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143205a.m65147V(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m65147V(View view) {
        m65145S();
        m65151Y();
    }

    /* JADX INFO: renamed from: R */
    public View m65148R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qdh.m174044b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m65149W(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (!NullChecker.m81303a(xaj0Var) || vwb.m200296J(xaj0Var.f191751a)) {
            this.f42420f.setText(z ? "发布一条动态吧" : "发布第一条动态");
            return;
        }
        TopicOperations topicOperations = (TopicOperations) vwb.m200346r(xaj0Var.f191751a, new w9j() { // from class: l.pdh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.m81303a(topicOperations)) {
            this.f42420f.setText(z ? topicOperations.postGuide.title : " 发布第一条动态");
        }
    }

    /* JADX INFO: renamed from: X */
    public void m65150X() {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else {
            oe40.m163846k0(this.f42422h, vwb.m200324f0(new Media[0]), true, "myalbum");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m65151Y() {
        p6j0.m167669c("e_moment_post", this.f42421g, new j760[0]);
    }

    public void setPageId(String str) {
        this.f42421g = str;
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42421g = OMSDialogPositon.p_navigation_view;
        m65146T(context);
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42421g = OMSDialogPositon.p_navigation_view;
        m65146T(context);
    }
}
