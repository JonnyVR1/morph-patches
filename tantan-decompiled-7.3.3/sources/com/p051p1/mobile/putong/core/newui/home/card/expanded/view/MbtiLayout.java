package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.data.MbtiInfo;
import com.p051p1.mobile.putong.core.data.MbtiMatchScore;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpTagView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.core.view.CardLabelShowView3;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.aix;
import p153l.aw90;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.qu2;
import p153l.uhx;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class MbtiLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MbtiLayout f23391a;

    /* JADX INFO: renamed from: b */
    public VLinear f23392b;

    /* JADX INFO: renamed from: c */
    public VImage f23393c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f23394d;

    /* JADX INFO: renamed from: e */
    public VImage f23395e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f23396f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f23397g;

    /* JADX INFO: renamed from: h */
    public VText f23398h;

    /* JADX INFO: renamed from: i */
    public VFrame f23399i;

    /* JADX INFO: renamed from: j */
    public VLinear f23400j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f23401k;

    /* JADX INFO: renamed from: l */
    public VText f23402l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f23403m;

    /* JADX INFO: renamed from: n */
    public VFrame_Shadow f23404n;

    /* JADX INFO: renamed from: o */
    public VImage f23405o;

    /* JADX INFO: renamed from: p */
    public FlowTagsView f23406p;

    /* JADX INFO: renamed from: q */
    public CardLabelShowView3 f23407q;

    public MbtiLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m39351b(View view) {
        aix.m98213a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m39352c(LabelData labelData) {
        ExpTagView expTagView = new ExpTagView(getContext());
        int i = bnl0.f77545f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        expTagView.m52147h(labelData.name, labelData.iconDrawableRes, labelData.highlight);
        return expTagView;
    }

    /* JADX INFO: renamed from: d */
    public List<View> m39353d(List<LabelData> list) {
        return jyb.m147486Q(jyb.m147522n(list, new qcj() { // from class: l.yhx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LabelData) obj));
            }
        }), new qcj() { // from class: l.zhx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204469a.m39352c((LabelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m39354e() {
        bnl0.m105524M(this.f23393c, false);
        bnl0.m105554f0(this.f23391a, qa00.m175859d(13.0f));
        MbtiLayout mbtiLayout = this.f23391a;
        int i = qa00.f156323j;
        bnl0.m105548c0(mbtiLayout, i);
        bnl0.m105538V(this.f23394d, 0);
        bnl0.m105554f0(this.f23392b, qa00.f156316c);
        bnl0.m105537U(this.f23392b, qa00.m175859d(11.0f));
        bnl0.m105540X(this.f23399i, i);
        bnl0.m105538V(this.f23391a, qa00.f156318e);
        MbtiLayout mbtiLayout2 = this.f23391a;
        int i2 = qa00.f156314a;
        bnl0.m105537U(mbtiLayout2, i2);
        bnl0.m105540X(this.f23391a, i2);
        this.f23394d.setTextColor(Color.parseColor("#e6000000"));
        this.f23394d.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105524M(this.f23400j, false);
    }

    /* JADX INFO: renamed from: f */
    public void m39355f(User user) {
        if (!aw90.m100564Q(user)) {
            bnl0.m105524M(this, false);
            qu2.m178128w(new IllegalStateException("mbti 数据为空，却进行了渲染"));
            return;
        }
        MbtiInfo mbtiInfoM196132a = uhx.m196132a(user.profile.extensions.basic.mbti.get(0));
        if (NullChecker.m82487b(mbtiInfoM196132a)) {
            this.f23397g.setText(String.format("%s%s", mbtiInfoM196132a.key, mbtiInfoM196132a.character));
            this.f23398h.setText(mbtiInfoM196132a.desc);
            uqb0.f180374G.m127115L0(this.f23396f, mbtiInfoM196132a.pic);
            ArrayList arrayList = new ArrayList();
            for (String str : mbtiInfoM196132a.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str;
                if (gra.m131778z()) {
                    labelData.highlight = false;
                }
                arrayList.add(labelData);
            }
            if (gra.m131778z()) {
                if (NullChecker.m82486a(this.f23406p)) {
                    this.f23406p.setTags(m39353d(arrayList));
                    qnp0.m177261d1(this.f23400j, qa00.f156322i);
                }
            } else if (NullChecker.m82486a(this.f23407q)) {
                this.f23407q.setTestKey(ProfileLikeType.mbti);
                this.f23407q.setLabel(arrayList);
            }
            bnl0.m105524M(this.f23400j, !user.isMe());
            if (user.isMe()) {
                return;
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (!aw90.m100564Q(userM116593na)) {
                this.f23401k.setText("测试我的MBTI");
                this.f23402l.setText("测试完即可查看我们的匹配程度");
                bnl0.m105524M(this.f23403m, true);
            } else {
                final String str2 = userM116593na.profile.extensions.basic.mbti.get(0);
                MbtiMatchScore mbtiMatchScore = (MbtiMatchScore) jyb.m147529r(mbtiInfoM196132a.matchScores, new qcj() { // from class: l.xhx
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((MbtiMatchScore) obj).key, str2));
                    }
                });
                this.f23401k.setText(String.format(Locale.getDefault(), "和%s匹配度%d%%", user.isFemale() ? "她" : "他", Integer.valueOf(mbtiMatchScore.matchScore)));
                this.f23402l.setText(String.format(Locale.getDefault(), "我是%s，%s", str2, aw90.m100563J(mbtiMatchScore.matchScore)));
                bnl0.m105524M(this.f23403m, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39351b(this);
        if (!gra.m131778z()) {
            this.f23393c.setImageResource(dbc0.f87357qn);
            this.f23395e.setImageResource(dbc0.f87488um);
            this.f23400j.setBackgroundResource(dbc0.f86817a8);
            this.f23405o.setImageResource(dbc0.f87062hn);
            CardLabelShowView3 cardLabelShowView3 = new CardLabelShowView3(getContext());
            this.f23407q = cardLabelShowView3;
            cardLabelShowView3.m60691e(5, 6, qa00.m175859d(12.0f));
            this.f23399i.addView(this.f23407q, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        MbtiLayout mbtiLayout = this.f23391a;
        int i = qa00.f156330q;
        bnl0.m105554f0(mbtiLayout, i);
        bnl0.m105548c0(this.f23391a, i);
        this.f23393c.setImageResource(dbc0.f86559S6);
        this.f23395e.setImageResource(dbc0.f86773Ys);
        this.f23400j.setBackgroundResource(dbc0.f86591T6);
        this.f23405o.setImageResource(dbc0.f87094in);
        FlowTagsView flowTagsView = new FlowTagsView(getContext());
        this.f23406p = flowTagsView;
        this.f23399i.addView(flowTagsView, new FrameLayout.LayoutParams(-1, -1));
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MbtiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
