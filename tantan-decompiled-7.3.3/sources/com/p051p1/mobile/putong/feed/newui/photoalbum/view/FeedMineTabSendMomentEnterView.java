package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cn40;
import p153l.ffh;
import p153l.jyb;
import p153l.mrb0;
import p153l.o1j0;
import p153l.orb0;
import p153l.pb1;
import p153l.pf60;
import p153l.qcj;
import p153l.r1j0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMineTabSendMomentEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f43265c;

    /* JADX INFO: renamed from: d */
    public VText f43266d;

    /* JADX INFO: renamed from: e */
    public VLinear f43267e;

    /* JADX INFO: renamed from: f */
    public TextView f43268f;

    /* JADX INFO: renamed from: g */
    public String f43269g;

    /* JADX INFO: renamed from: h */
    public Act f43270h;

    public FeedMineTabSendMomentEnterView(Context context) {
        super(context);
        this.f43269g = OMSDialogPositon.p_navigation_view;
        m66329T(context);
    }

    /* JADX INFO: renamed from: S */
    private void m66328S() {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            m66333X();
        } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            o1j0.m165649w(R$string.f39730D2);
        } else {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: T */
    private void m66329T(Context context) {
        addView(m66331R(LayoutInflater.from(context), null));
        TextPaint paint = this.f43266d.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43270h = (Act) context;
        bnl0.m105509E0(this.f43267e, new View.OnClickListener() { // from class: l.dfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88155a.m66330V(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m66330V(View view) {
        m66328S();
        m66334Y();
    }

    /* JADX INFO: renamed from: R */
    public View m66331R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ffh.m125374b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public void m66332W(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var, boolean z) {
        if (!NullChecker.m82486a(bkj0Var) || jyb.m147479J(bkj0Var.f77081a)) {
            this.f43268f.setText(z ? "发布一条动态吧" : "发布第一条动态");
            return;
        }
        TopicOperations topicOperations = (TopicOperations) jyb.m147529r(bkj0Var.f77081a, new qcj() { // from class: l.efh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
            }
        });
        if (NullChecker.m82486a(topicOperations)) {
            this.f43268f.setText(z ? topicOperations.postGuide.title : " 发布第一条动态");
        }
    }

    /* JADX INFO: renamed from: X */
    public void m66333X() {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else {
            cn40.m111396k0(this.f43270h, jyb.m147507f0(new Media[0]), true, "myalbum");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m66334Y() {
        tfj0.m190940c("e_moment_post", this.f43269g, new pf60[0]);
    }

    public void setPageId(String str) {
        this.f43269g = str;
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43269g = OMSDialogPositon.p_navigation_view;
        m66329T(context);
    }

    public FeedMineTabSendMomentEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43269g = OMSDialogPositon.p_navigation_view;
        m66329T(context);
    }
}
