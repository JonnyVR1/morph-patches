package com.p051p1.mobile.putong.feed.newui.photoalbum.bookmovie;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedLiterature;
import com.p051p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.h53;
import p153l.i4g0;
import p153l.k9c0;
import p153l.ksg;
import p153l.lbc0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x8i;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class BookMovieTopicHeaderView extends VRelative {

    /* JADX INFO: renamed from: d */
    public BookMovieTopicHeaderView f42306d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42307e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f42308f;

    /* JADX INFO: renamed from: g */
    public VText f42309g;

    /* JADX INFO: renamed from: h */
    public VText f42310h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f42311i;

    /* JADX INFO: renamed from: j */
    public ImageView f42312j;

    /* JADX INFO: renamed from: k */
    public VText f42313k;

    /* JADX INFO: renamed from: l */
    public VText f42314l;

    /* JADX INFO: renamed from: m */
    public Act f42315m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f42316n;

    /* JADX INFO: renamed from: o */
    public x8i f42317o;

    /* JADX INFO: renamed from: p */
    public String f42318p;

    /* JADX INFO: renamed from: q */
    public boolean f42319q;

    public BookMovieTopicHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m65222O(Throwable th) {
        bnl0.m105524M(this.f42306d, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m65226H(View view) {
        h53.m133623a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final String m65227I(FeedLiterature feedLiterature) {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            i = Integer.parseInt(feedLiterature.counter);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            i = 0;
        }
        sb.append(ksg.m151224q(i));
        sb.append("人添加");
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public final String m65228L(FeedLiterature feedLiterature) {
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
    public final /* synthetic */ void m65229M(pf60 pf60Var) {
        FeedLiterature feedLiterature = (FeedLiterature) pf60Var.f152156a;
        FeedLiteraturesComment feedLiteraturesComment = (FeedLiteraturesComment) pf60Var.f152157b;
        BookMovieTopicHeaderView bookMovieTopicHeaderView = this.f42306d;
        if (feedLiterature == null) {
            bnl0.m105524M(bookMovieTopicHeaderView, false);
            return;
        }
        bnl0.m105524M(bookMovieTopicHeaderView, true);
        uqb0.f180374G.m127109I0(this.f42307e, feedLiterature.headUrl, qa00.f156293F, qa00.f156298K);
        m65233S(feedLiterature);
        this.f42309g.setTypeface(Typeface.defaultFromStyle(1));
        this.f42309g.setText(feedLiterature.title);
        this.f42310h.setText(m65228L(feedLiterature));
        this.f42313k.setText(m65227I(feedLiterature));
        m65234T(feedLiterature, feedLiteraturesComment);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65230P(Boolean bool, String str) {
        if (bool.booleanValue()) {
            if (FeedLiteraturesComment.isShowArtAdd(str)) {
                this.f42318p = str;
                i4g0.m138526x("e_artwork_add", getPageId());
            }
            m65235V(true, FeedLiteraturesComment.formatInterestLevel(str));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m65231Q(FeedLiterature feedLiterature, View view) {
        if (FeedLiteraturesComment.isShowArtAdd(this.f42318p)) {
            i4g0.m138520r("e_artwork_add", getPageId());
        }
        FeedModule.m61406H().mo31789kj(this.f42315m, feedLiterature.f40068id, feedLiterature.category, new z20() { // from class: l.g53
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f102277a.m65230P((Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m65232R(Act act, TopicMoment topicMoment, x8i x8iVar) {
        this.f42315m = act;
        this.f42316n = topicMoment;
        this.f42317o = x8iVar;
        act.duringCreated(FeedModule.f39703d.m145520G7(topicMoment.source.f40097id)).subscribe(psd0.m173597H(new y20() { // from class: l.d53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85097a.m65229M((pf60) obj);
            }
        }, new y20() { // from class: l.e53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92179a.m65222O((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m65233S(FeedLiterature feedLiterature) {
        if ("book".equals(feedLiterature.category)) {
            this.f42312j.setImageResource(lbc0.f130976Y);
            return;
        }
        boolean zEquals = "movie".equals(feedLiterature.category);
        ImageView imageView = this.f42312j;
        if (zEquals) {
            imageView.setImageResource(lbc0.f130983Z);
        } else {
            imageView.setImageResource(lbc0.f130991a0);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m65234T(final FeedLiterature feedLiterature, FeedLiteraturesComment feedLiteraturesComment) {
        bnl0.m105525M0(this.f42314l, true);
        this.f42314l.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105509E0(this.f42314l, new View.OnClickListener() { // from class: l.f53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97186a.m65231Q(feedLiterature, view);
            }
        });
        if (!this.f42319q && (feedLiteraturesComment == null || FeedLiteraturesComment.isShowArtAdd(feedLiteraturesComment.interestLevel))) {
            this.f42319q = true;
            i4g0.m138526x("e_artwork_add", getPageId());
        }
        if (feedLiteraturesComment == null) {
            m65235V(false, FeedLiteraturesComment.formatInterestLevel(""));
            return;
        }
        this.f42318p = feedLiteraturesComment.interestLevel;
        if (feedLiteraturesComment.isToWatch() || feedLiteraturesComment.isWatching() || feedLiteraturesComment.isWatched()) {
            m65235V(true, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        } else {
            m65235V(false, FeedLiteraturesComment.formatInterestLevel(feedLiteraturesComment.interestLevel));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m65235V(boolean z, String str) {
        VText vText = this.f42314l;
        if (z) {
            vText.setSelected(true);
            this.f42314l.setTextColor(getResources().getColor(k9c0.f124527q));
        } else {
            vText.setSelected(false);
            this.f42314l.setTextColor(getResources().getColor(k9c0.f124526p0));
        }
        this.f42314l.setText(str);
    }

    public String getPageId() {
        x8i x8iVar = this.f42317o;
        return x8iVar == null ? "p_topic_latest" : x8iVar.m209729x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65226H(this);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BookMovieTopicHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
