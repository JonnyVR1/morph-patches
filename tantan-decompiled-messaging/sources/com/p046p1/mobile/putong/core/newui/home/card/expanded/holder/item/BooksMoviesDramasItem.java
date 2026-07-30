package com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.du2;
import p149l.e30;
import p149l.eqh0;
import p149l.f30;
import p149l.j760;
import p149l.mcr;
import p149l.t53;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xgc0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class BooksMoviesDramasItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public BooksMoviesDramasItem f22438a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f22439b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f22440c;

    /* JADX INFO: renamed from: d */
    public VImage f22441d;

    /* JADX INFO: renamed from: e */
    public VText f22442e;

    /* JADX INFO: renamed from: f */
    public VText f22443f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f22444g;

    /* JADX INFO: renamed from: h */
    public VText f22445h;

    /* JADX INFO: renamed from: i */
    public VImage f22446i;

    /* JADX INFO: renamed from: j */
    public VText f22447j;

    /* JADX INFO: renamed from: k */
    public int f22448k;

    /* JADX INFO: renamed from: l */
    public mcr f22449l;

    /* JADX INFO: renamed from: m */
    public String f22450m;

    /* JADX INFO: renamed from: n */
    public boolean f22451n;

    /* JADX INFO: renamed from: o */
    public boolean f22452o;

    /* JADX INFO: renamed from: p */
    public String f22453p;

    /* JADX INFO: renamed from: q */
    public e30<LiteraturesComments> f22454q;

    /* JADX INFO: renamed from: r */
    public Literatures f22455r;

    /* JADX INFO: renamed from: s */
    public LiteraturesComments f22456s;

    /* JADX INFO: renamed from: t */
    public xaj0<String, String, String> f22457t;

    /* JADX INFO: renamed from: u */
    public int f22458u;

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22448k = 0;
        this.f22457t = xaj0.m207578a("", "", "");
        this.f22458u = -1;
    }

    /* JADX INFO: renamed from: c */
    public static String m38168c(List<String> list) {
        if (vwb.m200296J(list)) {
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
    public final void m38169b(View view) {
        t53.m187271a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m38170d(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m38174h(true, str);
                du2.m113670a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE)) {
                m38174h(false, str);
                if (NullChecker.m81303a(this.f22456s)) {
                    xdl0.m208344M(this, false);
                    if (NullChecker.m81303a(this.f22454q)) {
                        this.f22454q.call(this.f22456s);
                    }
                }
            } else {
                m38174h(true, str);
            }
            du2.m113670a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m38171e(mcr mcrVar, String str, boolean z, boolean z2, String str2, Literatures literatures, LiteraturesComments literaturesComments, int i, e30<LiteraturesComments> e30Var) {
        if (NullChecker.m81303a(literatures)) {
            this.f22449l = mcrVar;
            this.f22450m = str;
            this.f22451n = z;
            this.f22452o = z2;
            this.f22453p = str2;
            this.f22448k = i;
            this.f22455r = literatures;
            this.f22456s = literaturesComments;
            xgc0.m208625c(str);
            this.f22454q = e30Var;
            xdl0.m208344M(this.f22442e, false);
            this.f22440c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            if (NullChecker.m81303a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f22443f.setTypeface(eqh0.m117752c(3), 1);
            this.f22444g.setText(literatures.title);
            if (upa.m194665L3()) {
                this.f22444g.setTypeface(eqh0.m117752c(3), 0);
            }
            this.f22445h.setText(m38168c(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            xdl0.m208344M(this.f22441d, z2 && !NullChecker.m81303a(literaturesComments));
            if (z) {
                List<LiteraturesComments> listM59449p = BookMoviesDramasHelper.m59449p(literatures.f20433id);
                if (vwb.m200296J(listM59449p)) {
                    m38174h(false, "");
                } else {
                    m38174h(true, listM59449p.get(0).interestLevel);
                }
                xdl0.m208329E0(this, this);
            }
            if (!z && !z2) {
                m38172f(literatures, literaturesComments);
            }
            if (!z) {
                zvf0.m220368A("e_profile_artwork_info", OMSDialogPositon.p_suggest_user_profile_info_view, new j760("is_artwork_interactive", Boolean.FALSE), new j760("artwork_title", literatures.title), new j760("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new j760("artwork_status", this.f22457t.f191752b));
            } else {
                if (!z || NullChecker.m81303a(literaturesComments)) {
                    return;
                }
                zvf0.m220368A("e_artwork_guess_you_like", "p_edit_profile_view", new j760("artwork_type", literatures.title), new j760("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38172f(Literatures literatures, LiteraturesComments literaturesComments) {
        List<LiteraturesComments> listM59449p = BookMoviesDramasHelper.m59449p(literatures.f20433id);
        if (vwb.m200296J(listM59449p)) {
            xdl0.m208344M(this.f22443f, false);
            return;
        }
        xaj0<String, String, String> xaj0VarM59440g = BookMoviesDramasHelper.m59440g(listM59449p, literatures, literaturesComments);
        this.f22457t = xaj0VarM59440g;
        if (!TextUtils.isEmpty(xaj0VarM59440g.f191751a)) {
            xdl0.m208344M(this.f22443f, true);
            this.f22443f.setText(this.f22457t.f191751a);
            return;
        }
        boolean zM81303a = NullChecker.m81303a(literaturesComments);
        VText vText = this.f22443f;
        if (!zM81303a) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, false);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38173g(final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.m59443j((Act) xdl0.m208328E(this), literatures.f20433id, literatures.category, new f30() { // from class: l.s53
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f162482a.m38170d(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m38174h(boolean z, String str) {
        VImage vImage = this.f22441d;
        if (!z) {
            xdl0.m208344M(vImage, true);
        } else {
            xdl0.m208344M(vImage, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        zvf0.m220399u("e_artwork_guess_you_like", ((Act) xdl0.m208328E(this)).pageId(), new j760("artwork_type", this.f22455r.title), new j760("artwork_title", TextUtils.equals(this.f22455r.category, "teleplay") ? "tv_show" : this.f22455r.category));
        m38173g(xdl0.m208349O0(this.f22441d), this.f22455r);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38169b(this);
        xdl0.m208344M(this.f22441d, false);
        xdl0.m208344M(this.f22443f, false);
        this.f22442e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(x2c0.f189362Gg);
                break;
            case "book":
                drawable = getResources().getDrawable(x2c0.f190747yg);
                break;
            case "movie":
                drawable = getResources().getDrawable(x2c0.f189234Cg);
                break;
            default:
                drawable = null;
                break;
        }
        this.f22446i.setImageDrawable(drawable);
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
        String str4 = this.f22455r.category;
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
        this.f22447j.setText(str2 + "的" + str3);
    }

    public BooksMoviesDramasItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public BooksMoviesDramasItem(Context context) {
        this(context, null);
    }
}
