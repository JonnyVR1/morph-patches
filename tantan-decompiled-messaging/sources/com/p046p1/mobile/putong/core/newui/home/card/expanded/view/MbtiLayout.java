package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.data.MbtiInfo;
import com.p046p1.mobile.putong.core.data.MbtiMatchScore;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpTagView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.core.view.CardLabelShowView3;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.au2;
import p149l.bfx;
import p149l.mep0;
import p149l.qib0;
import p149l.t100;
import p149l.upa;
import p149l.vex;
import p149l.vwb;
import p149l.w9j;
import p149l.wn90;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MbtiLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MbtiLayout f22649a;

    /* JADX INFO: renamed from: b */
    public VLinear f22650b;

    /* JADX INFO: renamed from: c */
    public VImage f22651c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f22652d;

    /* JADX INFO: renamed from: e */
    public VImage f22653e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f22654f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f22655g;

    /* JADX INFO: renamed from: h */
    public VText f22656h;

    /* JADX INFO: renamed from: i */
    public VFrame f22657i;

    /* JADX INFO: renamed from: j */
    public VLinear f22658j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f22659k;

    /* JADX INFO: renamed from: l */
    public VText f22660l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f22661m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f22662n;

    /* JADX INFO: renamed from: o */
    public VImage f22663o;

    /* JADX INFO: renamed from: p */
    public FlowTagsView f22664p;

    /* JADX INFO: renamed from: q */
    public CardLabelShowView3 f22665q;

    public MbtiLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m38348b(View view) {
        bfx.m101615a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m38349c(LabelData labelData) {
        ExpTagView expTagView = new ExpTagView(getContext());
        int i = xdl0.f192404f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        expTagView.m50964h(labelData.name, labelData.iconDrawableRes, labelData.highlight);
        return expTagView;
    }

    /* JADX INFO: renamed from: d */
    public List<View> m38350d(List<LabelData> list) {
        return vwb.m200303Q(vwb.m200339n(list, new w9j() { // from class: l.zex
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LabelData) obj));
            }
        }), new w9j() { // from class: l.afx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69231a.m38349c((LabelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m38351e() {
        xdl0.m208344M(this.f22651c, false);
        xdl0.m208374f0(this.f22649a, t100.m186890d(13.0f));
        MbtiLayout mbtiLayout = this.f22649a;
        int i = t100.f167261j;
        xdl0.m208368c0(mbtiLayout, i);
        xdl0.m208358V(this.f22652d, 0);
        xdl0.m208374f0(this.f22650b, t100.f167254c);
        xdl0.m208357U(this.f22650b, t100.m186890d(11.0f));
        xdl0.m208360X(this.f22657i, i);
        xdl0.m208358V(this.f22649a, t100.f167256e);
        MbtiLayout mbtiLayout2 = this.f22649a;
        int i2 = t100.f167252a;
        xdl0.m208357U(mbtiLayout2, i2);
        xdl0.m208360X(this.f22649a, i2);
        this.f22652d.setTextColor(Color.parseColor("#e6000000"));
        this.f22652d.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208344M(this.f22658j, false);
    }

    /* JADX INFO: renamed from: f */
    public void m38352f(User user) {
        if (!wn90.m204604Q(user)) {
            xdl0.m208344M(this, false);
            au2.m98935w(new IllegalStateException("mbti 数据为空，却进行了渲染"));
            return;
        }
        MbtiInfo mbtiInfoM198262a = vex.m198262a(user.profile.extensions.basic.mbti.get(0));
        if (NullChecker.m81304b(mbtiInfoM198262a)) {
            this.f22655g.setText(String.format("%s%s", mbtiInfoM198262a.key, mbtiInfoM198262a.character));
            this.f22656h.setText(mbtiInfoM198262a.desc);
            qib0.f154691G.m102331L0(this.f22654f, mbtiInfoM198262a.pic);
            ArrayList arrayList = new ArrayList();
            for (String str : mbtiInfoM198262a.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str;
                if (upa.m194847z()) {
                    labelData.highlight = false;
                }
                arrayList.add(labelData);
            }
            if (upa.m194847z()) {
                if (NullChecker.m81303a(this.f22664p)) {
                    this.f22664p.setTags(m38350d(arrayList));
                    mep0.m154302d1(this.f22658j, t100.f167260i);
                }
            } else if (NullChecker.m81303a(this.f22665q)) {
                this.f22665q.setTestKey(ProfileLikeType.mbti);
                this.f22665q.setLabel(arrayList);
            }
            xdl0.m208344M(this.f22658j, !user.isMe());
            if (user.isMe()) {
                return;
            }
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (!wn90.m204604Q(userM169520na)) {
                this.f22659k.setText("测试我的MBTI");
                this.f22660l.setText("测试完即可查看我们的匹配程度");
                xdl0.m208344M(this.f22661m, true);
            } else {
                final String str2 = userM169520na.profile.extensions.basic.mbti.get(0);
                MbtiMatchScore mbtiMatchScore = (MbtiMatchScore) vwb.m200346r(mbtiInfoM198262a.matchScores, new w9j() { // from class: l.yex
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((MbtiMatchScore) obj).key, str2));
                    }
                });
                this.f22659k.setText(String.format(Locale.getDefault(), "和%s匹配度%d%%", user.isFemale() ? "她" : "他", Integer.valueOf(mbtiMatchScore.matchScore)));
                this.f22660l.setText(String.format(Locale.getDefault(), "我是%s，%s", str2, wn90.m204603J(mbtiMatchScore.matchScore)));
                xdl0.m208344M(this.f22661m, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38348b(this);
        if (!upa.m194847z()) {
            this.f22651c.setImageResource(x2c0.f189240Cm);
            this.f22653e.setImageResource(x2c0.f189367Gl);
            this.f22658j.setBackgroundResource(x2c0.f189942Z7);
            this.f22663o.setImageResource(x2c0.f190593tm);
            CardLabelShowView3 cardLabelShowView3 = new CardLabelShowView3(getContext());
            this.f22665q = cardLabelShowView3;
            cardLabelShowView3.m59507e(5, 6, t100.m186890d(12.0f));
            this.f22657i.addView(this.f22665q, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        MbtiLayout mbtiLayout = this.f22649a;
        int i = t100.f167268q;
        xdl0.m208374f0(mbtiLayout, i);
        xdl0.m208368c0(this.f22649a, i);
        this.f22651c.setImageResource(x2c0.f189693R6);
        this.f22653e.setImageResource(x2c0.f190311ks);
        this.f22658j.setBackgroundResource(x2c0.f189724S6);
        this.f22663o.setImageResource(x2c0.f190625um);
        FlowTagsView flowTagsView = new FlowTagsView(getContext());
        this.f22664p = flowTagsView;
        this.f22657i.addView(flowTagsView, new FrameLayout.LayoutParams(-1, -1));
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
