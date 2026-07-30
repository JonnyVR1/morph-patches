package com.p046p1.mobile.putong.feed.newui.photoalbum.bookmovie;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedLiterature;
import com.p046p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;
import p149l.e1c0;
import p149l.e30;
import p149l.f30;
import p149l.f3c0;
import p149l.i7i;
import p149l.j760;
import p149l.mkd0;
import p149l.qib0;
import p149l.r43;
import p149l.t100;
import p149l.vqg;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class BookMovieTopicHeaderView extends VRelative {

    /* JADX INFO: renamed from: d */
    public BookMovieTopicHeaderView f41458d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f41459e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f41460f;

    /* JADX INFO: renamed from: g */
    public VText f41461g;

    /* JADX INFO: renamed from: h */
    public VText f41462h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f41463i;

    /* JADX INFO: renamed from: j */
    public ImageView f41464j;

    /* JADX INFO: renamed from: k */
    public VText f41465k;

    /* JADX INFO: renamed from: l */
    public VText f41466l;

    /* JADX INFO: renamed from: m */
    public Act f41467m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f41468n;

    /* JADX INFO: renamed from: o */
    public i7i f41469o;

    /* JADX INFO: renamed from: p */
    public String f41470p;

    /* JADX INFO: renamed from: q */
    public boolean f41471q;

    public BookMovieTopicHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m64039O(Throwable th) {
        xdl0.m208344M(this.f41458d, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m64043H(View view) {
        r43.m177768a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final String m64044I(FeedLiterature feedLiterature) {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            i = Integer.parseInt(feedLiterature.counter);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            i = 0;
        }
        sb.append(vqg.m199565q(i));
        sb.append("人添加");
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public final String m64045L(FeedLiterature feedLiterature) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m64046M(j760 j760Var) {
        FeedLiterature feedLiterature = (FeedLiterature) j760Var.f116564a;
        FeedLiteraturesComment feedLiteraturesComment = (FeedLiteraturesComment) j760Var.f116565b;
        BookMovieTopicHeaderView bookMovieTopicHeaderView = this.f41458d;
        if (feedLiterature == null) {
            xdl0.m208344M(bookMovieTopicHeaderView, false);
            return;
        }
        xdl0.m208344M(bookMovieTopicHeaderView, true);
        qib0.f154691G.m102325I0(this.f41459e, feedLiterature.headUrl, t100.f167231F, t100.f167236K);
        m64050S(feedLiterature);
        this.f41461g.setTypeface(Typeface.defaultFromStyle(1));
        this.f41461g.setText(feedLiterature.title);
        this.f41462h.setText(m64045L(feedLiterature));
        this.f41465k.setText(m64044I(feedLiterature));
        m64051T(feedLiterature, feedLiteraturesComment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m64047P(Boolean bool, String str) {
        if (bool.booleanValue()) {
            if (FeedLiteraturesComment.isShowArtAdd(str)) {
                this.f41470p = str;
                zvf0.m220402x("e_artwork_add", getPageId());
            }
            m64052V(true, FeedLiteraturesComment.formatInterestLevel(str));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m64048Q(FeedLiterature feedLiterature, View view) {
        if (FeedLiteraturesComment.isShowArtAdd(this.f41470p)) {
            zvf0.m220396r("e_artwork_add", getPageId());
        }
        FeedModule.m60222H().mo30786kj(this.f41467m, feedLiterature.f39220id, feedLiterature.category, new f30() { // from class: l.q43
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f152535a.m64047P((Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m64049R(Act act, TopicMoment topicMoment, i7i i7iVar) {
        this.f41467m = act;
        this.f41468n = topicMoment;
        this.f41469o = i7iVar;
        act.duringCreated(FeedModule.f38855d.m209279G7(topicMoment.source.f39249id)).subscribe(mkd0.m154956H(new e30() { // from class: l.n43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137038a.m64046M((j760) obj);
            }
        }, new e30() { // from class: l.o43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141733a.m64039O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m64050S(FeedLiterature feedLiterature) {
        if ("book".equals(feedLiterature.category)) {
            this.f41464j.setImageResource(f3c0.f94458Y);
            return;
        }
        boolean zEquals = "movie".equals(feedLiterature.category);
        ImageView imageView = this.f41464j;
        if (zEquals) {
            imageView.setImageResource(f3c0.f94465Z);
        } else {
            imageView.setImageResource(f3c0.f94473a0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m64051T(final FeedLiterature feedLiterature, FeedLiteraturesComment feedLiteraturesComment) {
        xdl0.m208345M0(this.f41466l, true);
        this.f41466l.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208329E0(this.f41466l, new View.OnClickListener() { // from class: l.p43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147031a.m64048Q(feedLiterature, view);
            }
        });
        if (!this.f41471q && (feedLiteraturesComment == null || FeedLiteraturesComment.isShowArtAdd(feedLiteraturesComment.interestLevel))) {
            this.f41471q = true;
            zvf0.m220402x("e_artwork_add", getPageId());
        }
        if (feedLiteraturesComment == null) {
            m64052V(false, FeedLiteraturesComment.formatInterestLevel(""));
            return;
        }
        this.f41470p = feedLiteraturesComment.interestLevel;
        if (feedLiteraturesComment.isToWatch() || feedLiteraturesComment.isWatching() || feedLiteraturesComment.isWatched()) {
            m64052V(true, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        } else {
            m64052V(false, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m64052V(boolean z, String str) {
        VText vText = this.f41466l;
        if (z) {
            vText.setSelected(true);
            this.f41466l.setTextColor(getResources().getColor(e1c0.f88804q));
        } else {
            vText.setSelected(false);
            this.f41466l.setTextColor(getResources().getColor(e1c0.f88803p0));
        }
        this.f41466l.setText(str);
    }

    public String getPageId() {
        i7i i7iVar = this.f41469o;
        return i7iVar == null ? "p_topic_latest" : i7iVar.m134901x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64043H(this);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
