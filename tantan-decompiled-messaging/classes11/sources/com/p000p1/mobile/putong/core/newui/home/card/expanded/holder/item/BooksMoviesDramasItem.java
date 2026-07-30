package com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.du2;
import l.e30;
import l.eqh0;
import l.f30;
import l.j760;
import l.mcr;
import l.t53;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.xgc0;
import l.zvf0;
import v.AutoVDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BooksMoviesDramasItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public BooksMoviesDramasItem f1216a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f1217b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f1218c;

    /* JADX INFO: renamed from: d */
    public VImage f1219d;

    /* JADX INFO: renamed from: e */
    public VText f1220e;

    /* JADX INFO: renamed from: f */
    public VText f1221f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f1222g;

    /* JADX INFO: renamed from: h */
    public VText f1223h;

    /* JADX INFO: renamed from: i */
    public VImage f1224i;

    /* JADX INFO: renamed from: j */
    public VText f1225j;

    /* JADX INFO: renamed from: k */
    public int f1226k;

    /* JADX INFO: renamed from: l */
    public mcr f1227l;

    /* JADX INFO: renamed from: m */
    public String f1228m;

    /* JADX INFO: renamed from: n */
    public boolean f1229n;

    /* JADX INFO: renamed from: o */
    public boolean f1230o;

    /* JADX INFO: renamed from: p */
    public String f1231p;

    /* JADX INFO: renamed from: q */
    public e30<LiteraturesComments> f1232q;

    /* JADX INFO: renamed from: r */
    public Literatures f1233r;

    /* JADX INFO: renamed from: s */
    public LiteraturesComments f1234s;

    /* JADX INFO: renamed from: t */
    public xaj0<String, String, String> f1235t;

    /* JADX INFO: renamed from: u */
    public int f1236u;

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1226k = 0;
        this.f1235t = xaj0.a("", "", "");
        this.f1236u = -1;
    }

    /* JADX INFO: renamed from: c */
    public static String m2142c(List<String> list) {
        if (vwb.J(list)) {
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
    public final void m2143b(View view) {
        t53.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m2144d(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m2148h(true, str);
                du2.a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, "delete")) {
                m2148h(false, str);
                if (NullChecker.a(this.f1234s)) {
                    xdl0.M(this, false);
                    if (NullChecker.a(this.f1232q)) {
                        this.f1232q.call(this.f1234s);
                    }
                }
            } else {
                m2148h(true, str);
            }
            du2.a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2145e(mcr mcrVar, String str, boolean z, boolean z2, String str2, Literatures literatures, LiteraturesComments literaturesComments, int i, e30<LiteraturesComments> e30Var) {
        if (NullChecker.a(literatures)) {
            this.f1227l = mcrVar;
            this.f1228m = str;
            this.f1229n = z;
            this.f1230o = z2;
            this.f1231p = str2;
            this.f1226k = i;
            this.f1233r = literatures;
            this.f1234s = literaturesComments;
            xgc0.c(str);
            this.f1232q = e30Var;
            xdl0.M(this.f1220e, false);
            this.f1218c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            if (NullChecker.a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f1221f.setTypeface(eqh0.c(3), 1);
            this.f1222g.setText(literatures.title);
            if (upa.L3()) {
                this.f1222g.setTypeface(eqh0.c(3), 0);
            }
            this.f1223h.setText(m2142c(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            xdl0.M(this.f1219d, z2 && !NullChecker.a(literaturesComments));
            if (z) {
                List listP = BookMoviesDramasHelper.p(literatures.id);
                if (vwb.J(listP)) {
                    m2148h(false, "");
                } else {
                    m2148h(true, ((LiteraturesComments) listP.get(0)).interestLevel);
                }
                xdl0.E0(this, this);
            }
            if (!z && !z2) {
                m2146f(literatures, literaturesComments);
            }
            if (!z) {
                zvf0.A("e_profile_artwork_info", "p_suggest_user_profile_info_view", new j760[]{new j760("is_artwork_interactive", Boolean.FALSE), new j760("artwork_title", literatures.title), new j760("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new j760("artwork_status", (String) this.f1235t.b)});
            } else {
                if (!z || NullChecker.a(literaturesComments)) {
                    return;
                }
                zvf0.A("e_artwork_guess_you_like", "p_edit_profile_view", new j760[]{new j760("artwork_type", literatures.title), new j760("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category)});
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2146f(Literatures literatures, LiteraturesComments literaturesComments) {
        List listP = BookMoviesDramasHelper.p(literatures.id);
        if (vwb.J(listP)) {
            xdl0.M(this.f1221f, false);
            return;
        }
        xaj0<String, String, String> xaj0VarG = BookMoviesDramasHelper.g(listP, literatures, literaturesComments);
        this.f1235t = xaj0VarG;
        if (!TextUtils.isEmpty((CharSequence) xaj0VarG.a)) {
            xdl0.M(this.f1221f, true);
            this.f1221f.setText((CharSequence) this.f1235t.a);
            return;
        }
        boolean zA = NullChecker.a(literaturesComments);
        VText vText = this.f1221f;
        if (!zA) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, false);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2147g(final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.j(xdl0.E(this), literatures.id, literatures.category, new f30() { // from class: l.s53
            public final void call(Object obj, Object obj2) {
                this.f20094a.m2144d(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m2148h(boolean z, String str) {
        VImage vImage = this.f1219d;
        if (!z) {
            xdl0.M(vImage, true);
        } else {
            xdl0.M(vImage, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        zvf0.u("e_artwork_guess_you_like", xdl0.E(this).pageId(), new j760[]{new j760("artwork_type", this.f1233r.title), new j760("artwork_title", TextUtils.equals(this.f1233r.category, "teleplay") ? "tv_show" : this.f1233r.category)});
        m2147g(xdl0.O0(this.f1219d), this.f1233r);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2143b(this);
        xdl0.M(this.f1219d, false);
        xdl0.M(this.f1221f, false);
        this.f1220e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(x2c0.Gg);
                break;
            case "book":
                drawable = getResources().getDrawable(x2c0.yg);
                break;
            case "movie":
                drawable = getResources().getDrawable(x2c0.Cg);
                break;
            default:
                drawable = null;
                break;
        }
        this.f1224i.setImageDrawable(drawable);
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
        String str4 = this.f1233r.category;
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
        this.f1225j.setText(str2 + "的" + str3);
    }

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BooksMoviesDramasItem(Context context) {
        this(context, null);
    }
}
