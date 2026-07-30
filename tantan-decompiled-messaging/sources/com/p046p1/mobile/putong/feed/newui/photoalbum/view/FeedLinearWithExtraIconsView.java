package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.view.FeedLinearFillerMeasure;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p147v.VImage;
import p149l.f3c0;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLinearWithExtraIconsView extends FeedLinearFillerMeasure {

    /* JADX INFO: renamed from: b */
    public Map<String, VImage> f42413b;

    /* JADX INFO: renamed from: c */
    public List<View> f42414c;

    public FeedLinearWithExtraIconsView(Context context) {
        super(context);
        this.f42413b = new HashMap();
        this.f42414c = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m65129d(View view, Rect rect) {
        if (m65132g(view)) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(rect.left, 0, rect.top, 0);
        frameLayout.addView(view);
        this.f42414c.add(frameLayout);
        addView(frameLayout);
    }

    /* JADX INFO: renamed from: e */
    public final VImage m65130e(String str, Act act, Rect rect) {
        VImage vImage = this.f42413b.get(str);
        if (NullChecker.m81303a(vImage)) {
            vImage.setTag("IS_CACHE");
            return vImage;
        }
        VImage vImage2 = new VImage(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        layoutParams.gravity = 16;
        vImage2.setLayoutParams(layoutParams);
        this.f42413b.put(str, vImage2);
        return vImage2;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m65131f(Rect rect) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(10.0f);
        textView.setPadding(t100.m186890d(3.0f), 0, t100.m186890d(3.0f), 0);
        textView.getPaint().setFakeBoldText(true);
        return textView;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m65132g(View view) {
        return "IS_CACHE".equals(view.getTag());
    }

    /* JADX INFO: renamed from: h */
    public FeedLinearWithExtraIconsView m65133h() {
        Iterator<View> it = this.f42414c.iterator();
        while (it.hasNext()) {
            removeView(it.next());
        }
        this.f42414c.clear();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public FeedLinearWithExtraIconsView m65134i(Act act, User user) {
        return m65135j(act, user, new Rect(t100.m186890d(4.0f), 0, t100.m186890d(16.0f), t100.m186890d(16.0f)));
    }

    /* JADX INFO: renamed from: j */
    public FeedLinearWithExtraIconsView m65135j(Act act, User user, Rect rect) {
        VImage vImageM65130e = m65130e("CERTIFICATION_ICON", act, rect);
        qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, vImageM65130e);
        m65129d(vImageM65130e, rect);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public FeedLinearWithExtraIconsView m65136k() {
        Rect rect = new Rect(t100.m186890d(4.0f), 0, -2, t100.m186890d(17.0f));
        TextView textViewM65131f = m65131f(rect);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1Afe7e1d"));
        gradientDrawable.setCornerRadius(t100.m186890d(4.0f));
        textViewM65131f.setBackground(gradientDrawable);
        textViewM65131f.setTextSize(10.0f);
        textViewM65131f.getPaint().setFakeBoldText(true);
        textViewM65131f.setText("同城");
        textViewM65131f.setPadding(t100.m186890d(4.0f), t100.m186890d(1.5f), t100.m186890d(4.0f), t100.m186890d(2.5f));
        textViewM65131f.setTextColor(Color.parseColor("#fe7e1d"));
        m65129d(textViewM65131f, rect);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public FeedLinearWithExtraIconsView m65137l(int i) {
        Rect rect = new Rect(i, 0, -2, t100.m186890d(14.0f));
        TextView textViewM65131f = m65131f(rect);
        textViewM65131f.setBackgroundResource(f3c0.f94308D3);
        textViewM65131f.setText(getContext().getString(R$string.f39081j0));
        m65129d(textViewM65131f, rect);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public FeedLinearWithExtraIconsView m65138m(int i) {
        Rect rect = new Rect(i, 0, -2, t100.m186890d(14.0f));
        TextView textViewM65131f = m65131f(rect);
        textViewM65131f.setBackgroundResource(f3c0.f94430U);
        textViewM65131f.setText("问答");
        m65129d(textViewM65131f, rect);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public FeedLinearWithExtraIconsView m65139n(TopicMoment topicMoment, int i) {
        if (topicMoment.isQATopicType()) {
            return m65138m(i);
        }
        if (topicMoment.isTopicAnonymousType()) {
            m65137l(i);
            return this;
        }
        if (topicMoment.isTopicLinkType()) {
            m65140o(i);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public FeedLinearWithExtraIconsView m65140o(int i) {
        Rect rect = new Rect(i, 0, -2, t100.m186890d(14.0f));
        TextView textViewM65131f = m65131f(rect);
        textViewM65131f.setBackgroundResource(f3c0.f94444W);
        textViewM65131f.setText("活动");
        m65129d(textViewM65131f, rect);
        return this;
    }

    public void setFillerIndex(int i) {
        this.f43404a = i;
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42413b = new HashMap();
        this.f42414c = new ArrayList();
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42413b = new HashMap();
        this.f42414c = new ArrayList();
    }
}
