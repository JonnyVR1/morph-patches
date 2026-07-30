package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.data.MbtiInfo;
import com.p1.mobile.putong.core.data.MbtiMatchScore;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.profile.exp.ExpTagView;
import com.p1.mobile.putong.core.ui.profile.views.FlowTagsView;
import com.p1.mobile.putong.core.view.CardLabelShowView3;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.au2;
import l.bfx;
import l.mep0;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p009l.vex;
import p009l.wn90;
import v.VFrame;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MbtiLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MbtiLayout f1427a;

    /* JADX INFO: renamed from: b */
    public VLinear f1428b;

    /* JADX INFO: renamed from: c */
    public VImage f1429c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f1430d;

    /* JADX INFO: renamed from: e */
    public VImage f1431e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f1432f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f1433g;

    /* JADX INFO: renamed from: h */
    public VText f1434h;

    /* JADX INFO: renamed from: i */
    public VFrame f1435i;

    /* JADX INFO: renamed from: j */
    public VLinear f1436j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f1437k;

    /* JADX INFO: renamed from: l */
    public VText f1438l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f1439m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f1440n;

    /* JADX INFO: renamed from: o */
    public VImage f1441o;

    /* JADX INFO: renamed from: p */
    public FlowTagsView f1442p;

    /* JADX INFO: renamed from: q */
    public CardLabelShowView3 f1443q;

    public MbtiLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2326b(View view) {
        bfx.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m2327c(LabelData labelData) {
        ExpTagView expTagView = new ExpTagView(getContext());
        int i = xdl0.f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        expTagView.h(labelData.name, labelData.iconDrawableRes, labelData.highlight);
        return expTagView;
    }

    /* JADX INFO: renamed from: d */
    public List<View> m2328d(List<LabelData> list) {
        return vwb.Q(vwb.n(list, new w9j() { // from class: l.zex
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((LabelData) obj));
            }
        }), new w9j() { // from class: l.afx
            public final Object call(Object obj) {
                return this.f9469a.m2327c((LabelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m2329e() {
        xdl0.M(this.f1429c, false);
        xdl0.f0(this.f1427a, t100.d(13.0f));
        MbtiLayout mbtiLayout = this.f1427a;
        int i = t100.j;
        xdl0.c0(mbtiLayout, i);
        xdl0.V(this.f1430d, 0);
        xdl0.f0(this.f1428b, t100.c);
        xdl0.U(this.f1428b, t100.d(11.0f));
        xdl0.X(this.f1435i, i);
        xdl0.V(this.f1427a, t100.e);
        MbtiLayout mbtiLayout2 = this.f1427a;
        int i2 = t100.a;
        xdl0.U(mbtiLayout2, i2);
        xdl0.X(this.f1427a, i2);
        this.f1430d.setTextColor(Color.parseColor("#e6000000"));
        this.f1430d.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.M(this.f1436j, false);
    }

    /* JADX INFO: renamed from: f */
    public void m2330f(User user) {
        if (!wn90.m24341Q(user)) {
            xdl0.M(this, false);
            au2.w(new IllegalStateException("mbti 数据为空，却进行了渲染"));
            return;
        }
        MbtiInfo mbtiInfoM23373a = vex.m23373a((String) user.profile.extensions.basic.mbti.get(0));
        if (NullChecker.b(mbtiInfoM23373a)) {
            this.f1433g.setText(String.format("%s%s", mbtiInfoM23373a.key, mbtiInfoM23373a.character));
            this.f1434h.setText(mbtiInfoM23373a.desc);
            qib0.G.L0(this.f1432f, mbtiInfoM23373a.pic);
            ArrayList arrayList = new ArrayList();
            for (String str : mbtiInfoM23373a.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str;
                if (upa.z()) {
                    labelData.highlight = false;
                }
                arrayList.add(labelData);
            }
            if (upa.z()) {
                if (NullChecker.a(this.f1442p)) {
                    this.f1442p.setTags(m2328d(arrayList));
                    mep0.d1(this.f1436j, t100.i);
                }
            } else if (NullChecker.a(this.f1443q)) {
                this.f1443q.setTestKey("mbti");
                this.f1443q.setLabel(arrayList);
            }
            xdl0.M(this.f1436j, !user.isMe());
            if (user.isMe()) {
                return;
            }
            User userNa = CoreModule.c.e0.na();
            if (!wn90.m24341Q(userNa)) {
                this.f1437k.setText("测试我的MBTI");
                this.f1438l.setText("测试完即可查看我们的匹配程度");
                xdl0.M(this.f1439m, true);
            } else {
                final String str2 = (String) userNa.profile.extensions.basic.mbti.get(0);
                MbtiMatchScore mbtiMatchScore = (MbtiMatchScore) vwb.r(mbtiInfoM23373a.matchScores, new w9j() { // from class: l.yex
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((MbtiMatchScore) obj).key, str2));
                    }
                });
                this.f1437k.setText(String.format(Locale.getDefault(), "和%s匹配度%d%%", user.isFemale() ? "她" : "他", Integer.valueOf(mbtiMatchScore.matchScore)));
                this.f1438l.setText(String.format(Locale.getDefault(), "我是%s，%s", str2, wn90.m24340J(mbtiMatchScore.matchScore)));
                xdl0.M(this.f1439m, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2326b(this);
        if (!upa.z()) {
            this.f1429c.setImageResource(x2c0.Cm);
            this.f1431e.setImageResource(x2c0.Gl);
            this.f1436j.setBackgroundResource(x2c0.Z7);
            this.f1441o.setImageResource(x2c0.tm);
            CardLabelShowView3 cardLabelShowView3 = new CardLabelShowView3(getContext());
            this.f1443q = cardLabelShowView3;
            cardLabelShowView3.e(5, 6, t100.d(12.0f));
            this.f1435i.addView(this.f1443q, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        MbtiLayout mbtiLayout = this.f1427a;
        int i = t100.q;
        xdl0.f0(mbtiLayout, i);
        xdl0.c0(this.f1427a, i);
        this.f1429c.setImageResource(x2c0.R6);
        this.f1431e.setImageResource(x2c0.ks);
        this.f1436j.setBackgroundResource(x2c0.S6);
        this.f1441o.setImageResource(x2c0.um);
        View flowTagsView = new FlowTagsView(getContext());
        this.f1442p = flowTagsView;
        this.f1435i.addView(flowTagsView, new FrameLayout.LayoutParams(-1, -1));
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
