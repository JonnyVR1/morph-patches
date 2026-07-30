package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import l.ib1;
import l.j760;
import l.lsi0;
import l.osi0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import p007l.ijb0;
import p007l.kjb0;
import p007l.oe40;
import p007l.p6j0;
import p007l.qdh;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMineTabSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f3878c;

    /* JADX INFO: renamed from: d */
    public VText f3879d;

    /* JADX INFO: renamed from: e */
    public VLinear f3880e;

    /* JADX INFO: renamed from: f */
    public TextView f3881f;

    /* JADX INFO: renamed from: g */
    public String f3882g;

    /* JADX INFO: renamed from: h */
    public Act f3883h;

    public FeedMineTabSendMomentEnterView(Context context) {
        super(context);
        this.f3882g = OMSDialogPositon.p_navigation_view;
        m6247T(context);
    }

    /* JADX INFO: renamed from: S */
    private void m6246S() {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!NullChecker.a(audioBusinessTypeC)) {
            m6251X();
        } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.w(R$string.f343D2);
        } else {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private void m6247T(Context context) {
        addView(m6249R(LayoutInflater.from(context), null));
        TextPaint paint = this.f3879d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f3883h = (Act) context;
        xdl0.E0(this.f3880e, new View.OnClickListener() { // from class: l.odh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11436a.m6248V(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m6248V(View view) {
        m6246S();
        m6252Y();
    }

    /* JADX INFO: renamed from: R */
    public View m6249R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qdh.m13505b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m6250W(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        if (!NullChecker.a(xaj0Var) || vwb.J((Collection) xaj0Var.a)) {
            this.f3881f.setText(z ? "发布一条动态吧" : "发布第一条动态");
            return;
        }
        TopicOperations topicOperations = (TopicOperations) vwb.r((Collection) xaj0Var.a, new w9j() { // from class: l.pdh
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.a(topicOperations)) {
            this.f3881f.setText(z ? topicOperations.postGuide.title : " 发布第一条动态");
        }
    }

    /* JADX INFO: renamed from: X */
    public void m6251X() {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else {
            oe40.m12583k0(this.f3883h, vwb.f0(new Media[0]), true, "myalbum");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m6252Y() {
        p6j0.m12913c("e_moment_post", this.f3882g, new j760[0]);
    }

    public void setPageId(String str) {
        this.f3882g = str;
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3882g = OMSDialogPositon.p_navigation_view;
        m6247T(context);
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3882g = OMSDialogPositon.p_navigation_view;
        m6247T(context);
    }
}
