package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.view.FeedLinearFillerMeasure;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.qib0;
import l.t100;
import p007l.f3c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLinearWithExtraIconsView extends FeedLinearFillerMeasure {

    /* JADX INFO: renamed from: b */
    public Map<String, VImage> f3874b;

    /* JADX INFO: renamed from: c */
    public List<View> f3875c;

    public FeedLinearWithExtraIconsView(Context context) {
        super(context);
        this.f3874b = new HashMap();
        this.f3875c = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m6230d(View view, Rect rect) {
        if (m6233g(view)) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(rect.left, 0, rect.top, 0);
        frameLayout.addView(view);
        this.f3875c.add(frameLayout);
        addView(frameLayout);
    }

    /* JADX INFO: renamed from: e */
    public final VImage m6231e(String str, Act act, Rect rect) {
        VImage vImage = this.f3874b.get(str);
        if (NullChecker.a(vImage)) {
            vImage.setTag("IS_CACHE");
            return vImage;
        }
        VImage vImage2 = new VImage(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        layoutParams.gravity = 16;
        vImage2.setLayoutParams(layoutParams);
        this.f3874b.put(str, vImage2);
        return vImage2;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m6232f(Rect rect) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(10.0f);
        textView.setPadding(t100.d(3.0f), 0, t100.d(3.0f), 0);
        textView.getPaint().setFakeBoldText(true);
        return textView;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6233g(View view) {
        return "IS_CACHE".equals(view.getTag());
    }

    /* JADX INFO: renamed from: h */
    public FeedLinearWithExtraIconsView m6234h() {
        Iterator<View> it = this.f3875c.iterator();
        while (it.hasNext()) {
            removeView(it.next());
        }
        this.f3875c.clear();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public FeedLinearWithExtraIconsView m6235i(Act act, User user) {
        return m6236j(act, user, new Rect(t100.d(4.0f), 0, t100.d(16.0f), t100.d(16.0f)));
    }

    /* JADX INFO: renamed from: j */
    public FeedLinearWithExtraIconsView m6236j(Act act, User user, Rect rect) {
        VImage vImageM6231e = m6231e("CERTIFICATION_ICON", act, rect);
        qib0.b0.b.showUserVerificationLogo(act, user, vImageM6231e);
        m6230d(vImageM6231e, rect);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public FeedLinearWithExtraIconsView m6237k() {
        Rect rect = new Rect(t100.d(4.0f), 0, -2, t100.d(17.0f));
        TextView textViewM6232f = m6232f(rect);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1Afe7e1d"));
        gradientDrawable.setCornerRadius(t100.d(4.0f));
        textViewM6232f.setBackground(gradientDrawable);
        textViewM6232f.setTextSize(10.0f);
        textViewM6232f.getPaint().setFakeBoldText(true);
        textViewM6232f.setText("同城");
        textViewM6232f.setPadding(t100.d(4.0f), t100.d(1.5f), t100.d(4.0f), t100.d(2.5f));
        textViewM6232f.setTextColor(Color.parseColor("#fe7e1d"));
        m6230d(textViewM6232f, rect);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public FeedLinearWithExtraIconsView m6238l(int i) {
        Rect rect = new Rect(i, 0, -2, t100.d(14.0f));
        TextView textViewM6232f = m6232f(rect);
        textViewM6232f.setBackgroundResource(f3c0.f7591D3);
        textViewM6232f.setText(getContext().getString(R$string.f542j0));
        m6230d(textViewM6232f, rect);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public FeedLinearWithExtraIconsView m6239m(int i) {
        Rect rect = new Rect(i, 0, -2, t100.d(14.0f));
        TextView textViewM6232f = m6232f(rect);
        textViewM6232f.setBackgroundResource(f3c0.f7713U);
        textViewM6232f.setText("问答");
        m6230d(textViewM6232f, rect);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public FeedLinearWithExtraIconsView m6240n(TopicMoment topicMoment, int i) {
        if (topicMoment.isQATopicType()) {
            return m6239m(i);
        }
        if (topicMoment.isTopicAnonymousType()) {
            m6238l(i);
            return this;
        }
        if (topicMoment.isTopicLinkType()) {
            m6241o(i);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public FeedLinearWithExtraIconsView m6241o(int i) {
        Rect rect = new Rect(i, 0, -2, t100.d(14.0f));
        TextView textViewM6232f = m6232f(rect);
        textViewM6232f.setBackgroundResource(f3c0.f7727W);
        textViewM6232f.setText("活动");
        m6230d(textViewM6232f, rect);
        return this;
    }

    public void setFillerIndex(int i) {
        this.f4865a = i;
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3874b = new HashMap();
        this.f3875c = new ArrayList();
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3874b = new HashMap();
        this.f3875c = new ArrayList();
    }
}
