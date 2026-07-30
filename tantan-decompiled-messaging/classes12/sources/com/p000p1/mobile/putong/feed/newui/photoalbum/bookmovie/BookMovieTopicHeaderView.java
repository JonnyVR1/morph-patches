package com.p000p1.mobile.putong.feed.newui.photoalbum.bookmovie;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedLiterature;
import com.p000p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.f30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.i7i;
import p007l.r43;
import p007l.vqg;
import v.VDraweeView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BookMovieTopicHeaderView extends VRelative {

    /* JADX INFO: renamed from: d */
    public BookMovieTopicHeaderView f2919d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f2920e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2921f;

    /* JADX INFO: renamed from: g */
    public VText f2922g;

    /* JADX INFO: renamed from: h */
    public VText f2923h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f2924i;

    /* JADX INFO: renamed from: j */
    public ImageView f2925j;

    /* JADX INFO: renamed from: k */
    public VText f2926k;

    /* JADX INFO: renamed from: l */
    public VText f2927l;

    /* JADX INFO: renamed from: m */
    public Act f2928m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f2929n;

    /* JADX INFO: renamed from: o */
    public i7i f2930o;

    /* JADX INFO: renamed from: p */
    public String f2931p;

    /* JADX INFO: renamed from: q */
    public boolean f2932q;

    public BookMovieTopicHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m5086O(Throwable th) {
        xdl0.M(this.f2919d, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m5090H(View view) {
        r43.m13829a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final String m5091I(FeedLiterature feedLiterature) {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            i = Integer.parseInt(feedLiterature.counter);
        } catch (Throwable th) {
            CrashHelper.c(th);
            i = 0;
        }
        sb.append(vqg.m15535q(i));
        sb.append("人添加");
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public final String m5092L(FeedLiterature feedLiterature) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.equals(feedLiterature.category, "book")) {
            for (String str : feedLiterature.authors) {
                if (sb.length() > 0) {
                    sb.append("/");
                }
                sb.append(str);
            }
        } else {
            for (String str2 : feedLiterature.kinds) {
                if (sb.length() > 0) {
                    sb.append("/");
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m5093M(j760 j760Var) {
        FeedLiterature feedLiterature = (FeedLiterature) j760Var.a;
        FeedLiteraturesComment feedLiteraturesComment = (FeedLiteraturesComment) j760Var.b;
        VRelative vRelative = this.f2919d;
        if (feedLiterature == null) {
            xdl0.M(vRelative, false);
            return;
        }
        xdl0.M(vRelative, true);
        qib0.G.I0(this.f2920e, feedLiterature.headUrl, t100.F, t100.K);
        m5097S(feedLiterature);
        this.f2922g.setTypeface(Typeface.defaultFromStyle(1));
        this.f2922g.setText(feedLiterature.title);
        this.f2923h.setText(m5092L(feedLiterature));
        this.f2926k.setText(m5091I(feedLiterature));
        m5098T(feedLiterature, feedLiteraturesComment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m5094P(Boolean bool, String str) {
        if (bool.booleanValue()) {
            if (FeedLiteraturesComment.isShowArtAdd(str)) {
                this.f2931p = str;
                zvf0.x("e_artwork_add", getPageId());
            }
            m5099V(true, FeedLiteraturesComment.formatInterestLevel(str));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m5095Q(FeedLiterature feedLiterature, View view) {
        if (FeedLiteraturesComment.isShowArtAdd(this.f2931p)) {
            zvf0.r("e_artwork_add", getPageId());
        }
        FeedModule.m1140H().kj(this.f2928m, feedLiterature.f681id, feedLiterature.category, new f30() { // from class: l.q43
            public final void call(Object obj, Object obj2) {
                this.f12078a.m5094P((Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m5096R(Act act, TopicMoment topicMoment, i7i i7iVar) {
        this.f2928m = act;
        this.f2929n = topicMoment;
        this.f2930o = i7iVar;
        act.duringCreated(FeedModule.f316d.m16460G7(topicMoment.source.f710id)).subscribe(mkd0.H(new e30() { // from class: l.n43
            public final void call(Object obj) {
                this.f10645a.m5093M((j760) obj);
            }
        }, new e30() { // from class: l.o43
            public final void call(Object obj) {
                this.f11000a.m5086O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m5097S(FeedLiterature feedLiterature) {
        if ("book".equals(feedLiterature.category)) {
            this.f2925j.setImageResource(f3c0.f7741Y);
            return;
        }
        boolean zEquals = "movie".equals(feedLiterature.category);
        ImageView imageView = this.f2925j;
        if (zEquals) {
            imageView.setImageResource(f3c0.f7748Z);
        } else {
            imageView.setImageResource(f3c0.f7756a0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m5098T(final FeedLiterature feedLiterature, FeedLiteraturesComment feedLiteraturesComment) {
        xdl0.M0(this.f2927l, true);
        this.f2927l.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.E0(this.f2927l, new View.OnClickListener() { // from class: l.p43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11686a.m5095Q(feedLiterature, view);
            }
        });
        if (!this.f2932q && (feedLiteraturesComment == null || FeedLiteraturesComment.isShowArtAdd(feedLiteraturesComment.interestLevel))) {
            this.f2932q = true;
            zvf0.x("e_artwork_add", getPageId());
        }
        if (feedLiteraturesComment == null) {
            m5099V(false, FeedLiteraturesComment.formatInterestLevel(""));
            return;
        }
        this.f2931p = feedLiteraturesComment.interestLevel;
        if (feedLiteraturesComment.isToWatch() || feedLiteraturesComment.isWatching() || feedLiteraturesComment.isWatched()) {
            m5099V(true, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        } else {
            m5099V(false, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final void m5099V(boolean z, String str) {
        VText vText = this.f2927l;
        if (z) {
            vText.setSelected(true);
            this.f2927l.setTextColor(getResources().getColor(e1c0.f7160q));
        } else {
            vText.setSelected(false);
            this.f2927l.setTextColor(getResources().getColor(e1c0.f7159p0));
        }
        this.f2927l.setText(str);
    }

    public String getPageId() {
        i7i i7iVar = this.f2930o;
        return i7iVar == null ? "p_topic_latest" : i7iVar.m10822x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5090H(this);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
