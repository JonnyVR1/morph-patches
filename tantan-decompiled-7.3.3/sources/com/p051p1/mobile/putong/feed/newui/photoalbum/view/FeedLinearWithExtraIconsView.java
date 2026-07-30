package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.view.FeedLinearFillerMeasure;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p151v.VImage;
import p153l.lbc0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLinearWithExtraIconsView extends FeedLinearFillerMeasure {

    /* JADX INFO: renamed from: b */
    public Map<String, VImage> f43261b;

    /* JADX INFO: renamed from: c */
    public List<View> f43262c;

    public FeedLinearWithExtraIconsView(Context context) {
        super(context);
        this.f43261b = new HashMap();
        this.f43262c = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m66312d(View view, Rect rect) {
        if (m66315g(view)) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(rect.left, 0, rect.top, 0);
        frameLayout.addView(view);
        this.f43262c.add(frameLayout);
        addView(frameLayout);
    }

    /* JADX INFO: renamed from: e */
    public final VImage m66313e(String str, Act act, Rect rect) {
        VImage vImage = this.f43261b.get(str);
        if (NullChecker.m82486a(vImage)) {
            vImage.setTag("IS_CACHE");
            return vImage;
        }
        VImage vImage2 = new VImage(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        layoutParams.gravity = 16;
        vImage2.setLayoutParams(layoutParams);
        this.f43261b.put(str, vImage2);
        return vImage2;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m66314f(Rect rect) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect.right, rect.bottom);
        layoutParams.topMargin = rect.top;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(10.0f);
        textView.setPadding(qa00.m175859d(3.0f), 0, qa00.m175859d(3.0f), 0);
        textView.getPaint().setFakeBoldText(true);
        return textView;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m66315g(View view) {
        return "IS_CACHE".equals(view.getTag());
    }

    /* JADX INFO: renamed from: h */
    public FeedLinearWithExtraIconsView m66316h() {
        Iterator<View> it = this.f43262c.iterator();
        while (it.hasNext()) {
            removeView(it.next());
        }
        this.f43262c.clear();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public FeedLinearWithExtraIconsView m66317i(Act act, User user) {
        return m66318j(act, user, new Rect(qa00.m175859d(4.0f), 0, qa00.m175859d(16.0f), qa00.m175859d(16.0f)));
    }

    /* JADX INFO: renamed from: j */
    public FeedLinearWithExtraIconsView m66318j(Act act, User user, Rect rect) {
        VImage vImageM66313e = m66313e("CERTIFICATION_ICON", act, rect);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, vImageM66313e);
        m66312d(vImageM66313e, rect);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public FeedLinearWithExtraIconsView m66319k() {
        Rect rect = new Rect(qa00.m175859d(4.0f), 0, -2, qa00.m175859d(17.0f));
        TextView textViewM66314f = m66314f(rect);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1Afe7e1d"));
        gradientDrawable.setCornerRadius(qa00.m175859d(4.0f));
        textViewM66314f.setBackground(gradientDrawable);
        textViewM66314f.setTextSize(10.0f);
        textViewM66314f.getPaint().setFakeBoldText(true);
        textViewM66314f.setText("同城");
        textViewM66314f.setPadding(qa00.m175859d(4.0f), qa00.m175859d(1.5f), qa00.m175859d(4.0f), qa00.m175859d(2.5f));
        textViewM66314f.setTextColor(Color.parseColor("#fe7e1d"));
        m66312d(textViewM66314f, rect);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public FeedLinearWithExtraIconsView m66320l(int i) {
        Rect rect = new Rect(i, 0, -2, qa00.m175859d(14.0f));
        TextView textViewM66314f = m66314f(rect);
        textViewM66314f.setBackgroundResource(lbc0.f130826D3);
        textViewM66314f.setText(getContext().getString(R$string.f39929j0));
        m66312d(textViewM66314f, rect);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public FeedLinearWithExtraIconsView m66321m(int i) {
        Rect rect = new Rect(i, 0, -2, qa00.m175859d(14.0f));
        TextView textViewM66314f = m66314f(rect);
        textViewM66314f.setBackgroundResource(lbc0.f130948U);
        textViewM66314f.setText("问答");
        m66312d(textViewM66314f, rect);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public FeedLinearWithExtraIconsView m66322n(TopicMoment topicMoment, int i) {
        if (topicMoment.isQATopicType()) {
            return m66321m(i);
        }
        if (topicMoment.isTopicAnonymousType()) {
            m66320l(i);
            return this;
        }
        if (topicMoment.isTopicLinkType()) {
            m66323o(i);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public FeedLinearWithExtraIconsView m66323o(int i) {
        Rect rect = new Rect(i, 0, -2, qa00.m175859d(14.0f));
        TextView textViewM66314f = m66314f(rect);
        textViewM66314f.setBackgroundResource(lbc0.f130962W);
        textViewM66314f.setText("活动");
        m66312d(textViewM66314f, rect);
        return this;
    }

    public void setFillerIndex(int i) {
        this.f44252a = i;
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43261b = new HashMap();
        this.f43262c = new ArrayList();
    }

    public FeedLinearWithExtraIconsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43261b = new HashMap();
        this.f43262c = new ArrayList();
    }
}
