package com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.epc0;
import p153l.gra;
import p153l.i4g0;
import p153l.j63;
import p153l.jyb;
import p153l.lyh0;
import p153l.ner;
import p153l.pf60;
import p153l.tu2;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class BooksMoviesDramasItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public BooksMoviesDramasItem f23180a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f23181b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f23182c;

    /* JADX INFO: renamed from: d */
    public VImage f23183d;

    /* JADX INFO: renamed from: e */
    public VText f23184e;

    /* JADX INFO: renamed from: f */
    public VText f23185f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f23186g;

    /* JADX INFO: renamed from: h */
    public VText f23187h;

    /* JADX INFO: renamed from: i */
    public VImage f23188i;

    /* JADX INFO: renamed from: j */
    public VText f23189j;

    /* JADX INFO: renamed from: k */
    public int f23190k;

    /* JADX INFO: renamed from: l */
    public ner f23191l;

    /* JADX INFO: renamed from: m */
    public String f23192m;

    /* JADX INFO: renamed from: n */
    public boolean f23193n;

    /* JADX INFO: renamed from: o */
    public boolean f23194o;

    /* JADX INFO: renamed from: p */
    public String f23195p;

    /* JADX INFO: renamed from: q */
    public y20<LiteraturesComments> f23196q;

    /* JADX INFO: renamed from: r */
    public Literatures f23197r;

    /* JADX INFO: renamed from: s */
    public LiteraturesComments f23198s;

    /* JADX INFO: renamed from: t */
    public bkj0<String, String, String> f23199t;

    /* JADX INFO: renamed from: u */
    public int f23200u;

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23190k = 0;
        this.f23199t = bkj0.m104818a("", "", "");
        this.f23200u = -1;
    }

    /* JADX INFO: renamed from: c */
    public static String m39171c(List<String> list) {
        if (jyb.m147479J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(" / ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m39172b(View view) {
        j63.m143602a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m39173d(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m39177h(true, str);
                tu2.m192703a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE)) {
                m39177h(false, str);
                if (NullChecker.m82486a(this.f23198s)) {
                    bnl0.m105524M(this, false);
                    if (NullChecker.m82486a(this.f23196q)) {
                        this.f23196q.call(this.f23198s);
                    }
                }
            } else {
                m39177h(true, str);
            }
            tu2.m192703a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m39174e(ner nerVar, String str, boolean z, boolean z2, String str2, Literatures literatures, LiteraturesComments literaturesComments, int i, y20<LiteraturesComments> y20Var) {
        if (NullChecker.m82486a(literatures)) {
            this.f23191l = nerVar;
            this.f23192m = str;
            this.f23193n = z;
            this.f23194o = z2;
            this.f23195p = str2;
            this.f23190k = i;
            this.f23197r = literatures;
            this.f23198s = literaturesComments;
            epc0.m121848c(str);
            this.f23196q = y20Var;
            bnl0.m105524M(this.f23184e, false);
            this.f23182c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            if (NullChecker.m82486a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f23185f.setTypeface(lyh0.m156283c(3), 1);
            this.f23186g.setText(literatures.title);
            if (gra.m131596L3()) {
                this.f23186g.setTypeface(lyh0.m156283c(3), 0);
            }
            this.f23187h.setText(m39171c(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            bnl0.m105524M(this.f23183d, z2 && !NullChecker.m82486a(literaturesComments));
            if (z) {
                List<LiteraturesComments> listM60633p = BookMoviesDramasHelper.m60633p(literatures.f21175id);
                if (jyb.m147479J(listM60633p)) {
                    m39177h(false, "");
                } else {
                    m39177h(true, listM60633p.get(0).interestLevel);
                }
                bnl0.m105509E0(this, this);
            }
            if (!z && !z2) {
                m39175f(literatures, literaturesComments);
            }
            if (!z) {
                i4g0.m138492A("e_profile_artwork_info", OMSDialogPositon.p_suggest_user_profile_info_view, new pf60("is_artwork_interactive", Boolean.FALSE), new pf60("artwork_title", literatures.title), new pf60("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new pf60("artwork_status", this.f23199t.f77082b));
            } else {
                if (!z || NullChecker.m82486a(literaturesComments)) {
                    return;
                }
                i4g0.m138492A("e_artwork_guess_you_like", "p_edit_profile_view", new pf60("artwork_type", literatures.title), new pf60("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m39175f(Literatures literatures, LiteraturesComments literaturesComments) {
        List<LiteraturesComments> listM60633p = BookMoviesDramasHelper.m60633p(literatures.f21175id);
        if (jyb.m147479J(listM60633p)) {
            bnl0.m105524M(this.f23185f, false);
            return;
        }
        bkj0<String, String, String> bkj0VarM60624g = BookMoviesDramasHelper.m60624g(listM60633p, literatures, literaturesComments);
        this.f23199t = bkj0VarM60624g;
        if (!TextUtils.isEmpty(bkj0VarM60624g.f77081a)) {
            bnl0.m105524M(this.f23185f, true);
            this.f23185f.setText(this.f23199t.f77081a);
            return;
        }
        boolean zM82486a = NullChecker.m82486a(literaturesComments);
        VText vText = this.f23185f;
        if (!zM82486a) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, false);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39176g(final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.m60627j((Act) bnl0.m105508E(this), literatures.f21175id, literatures.category, new z20() { // from class: l.i63
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f113132a.m39173d(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m39177h(boolean z, String str) {
        VImage vImage = this.f23183d;
        if (!z) {
            bnl0.m105524M(vImage, true);
        } else {
            bnl0.m105524M(vImage, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        i4g0.m138523u("e_artwork_guess_you_like", ((Act) bnl0.m105508E(this)).pageId(), new pf60("artwork_type", this.f23197r.title), new pf60("artwork_title", TextUtils.equals(this.f23197r.category, "teleplay") ? "tv_show" : this.f23197r.category));
        m39176g(bnl0.m105529O0(this.f23183d), this.f23197r);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39172b(this);
        bnl0.m105524M(this.f23183d, false);
        bnl0.m105524M(this.f23185f, false);
        this.f23184e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(dbc0.f87483uh);
                break;
            case "book":
                drawable = getResources().getDrawable(dbc0.f87219mh);
                break;
            case "movie":
                drawable = getResources().getDrawable(dbc0.f87351qh);
                break;
            default:
                drawable = null;
                break;
        }
        this.f23188i.setImageDrawable(drawable);
    }

    public void setWatchType(String str) {
        byte b;
        String str2;
        str.getClass();
        switch (str) {
            case "to_watch":
                b = 0;
                break;
            case "watching":
                b = 1;
                break;
            case "watched":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        String str3 = null;
        switch (b) {
            case 0:
                str2 = "想看";
                break;
            case 1:
                str2 = "在看";
                break;
            case 2:
                str2 = "看过";
                break;
            default:
                str2 = null;
                break;
        }
        String str4 = this.f23197r.category;
        str4.getClass();
        switch (str4) {
            case "teleplay":
                str3 = "电视剧";
                break;
            case "book":
                str3 = "书籍";
                break;
            case "movie":
                str3 = "电影";
                break;
        }
        this.f23189j.setText(str2 + "的" + str3);
    }

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BooksMoviesDramasItem(Context context) {
        this(context, null);
    }
}
