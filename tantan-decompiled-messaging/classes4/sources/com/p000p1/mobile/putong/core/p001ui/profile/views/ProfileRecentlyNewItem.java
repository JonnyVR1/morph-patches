package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.bra0;
import l.du2;
import l.e30;
import l.f30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.xgc0;
import l.zvf0;
import p002l.a1m;
import p002l.iv10;
import rx.c;
import v.AutoVDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileRecentlyNewItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ProfileRecentlyNewItem f2030a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f2031b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f2032c;

    /* JADX INFO: renamed from: d */
    public VImage f2033d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2034e;

    /* JADX INFO: renamed from: f */
    public VImage f2035f;

    /* JADX INFO: renamed from: g */
    public VText f2036g;

    /* JADX INFO: renamed from: h */
    public VText f2037h;

    /* JADX INFO: renamed from: i */
    public VImage f2038i;

    /* JADX INFO: renamed from: j */
    public VText f2039j;

    /* JADX INFO: renamed from: k */
    public VText f2040k;

    /* JADX INFO: renamed from: l */
    public View f2041l;

    /* JADX INFO: renamed from: m */
    public View f2042m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f2043n;

    /* JADX INFO: renamed from: o */
    public int f2044o;

    /* JADX INFO: renamed from: p */
    public a1m f2045p;

    /* JADX INFO: renamed from: q */
    public Literatures f2046q;

    /* JADX INFO: renamed from: r */
    public LiteraturesComments f2047r;

    /* JADX INFO: renamed from: s */
    public iv10 f2048s;

    /* JADX INFO: renamed from: t */
    public xaj0<String, String, String> f2049t;

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2044o = 0;
        this.f2049t = xaj0.a("", "", "");
    }

    /* JADX INFO: renamed from: d */
    public static String m3584d(List<String> list) {
        if (vwb.J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append("/");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m3585c(View view) {
        bra0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m3586e(Literatures literatures, LiteraturesComments literaturesComments, List list) {
        xaj0<String, String, String> xaj0VarG = BookMoviesDramasHelper.g(list, literatures, literaturesComments);
        this.f2049t = xaj0VarG;
        if (!TextUtils.isEmpty((CharSequence) xaj0VarG.a)) {
            xdl0.M(this.f2034e, false);
            xdl0.M(this.f2037h, true);
            this.f2037h.setText((CharSequence) this.f2049t.a);
        } else if (!NullChecker.a(literaturesComments)) {
            xdl0.M(this.f2034e, false);
            xdl0.M(this.f2037h, false);
        } else {
            xdl0.M(this.f2037h, false);
            xdl0.M(this.f2034e, true);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3587f(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m3591j(true, str);
                du2.a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, "delete")) {
                m3591j(false, str);
                if (NullChecker.a(this.f2047r)) {
                    this.f2048s.m15423I(this);
                }
            } else {
                m3591j(true, str);
            }
            du2.a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3588g(a1m a1mVar, Literatures literatures, LiteraturesComments literaturesComments, int i, iv10 iv10Var, boolean z, Map<String, Integer> map) {
        if (NullChecker.a(literatures)) {
            this.f2044o = i;
            this.f2048s = iv10Var;
            this.f2045p = a1mVar;
            this.f2046q = literatures;
            this.f2047r = literaturesComments;
            xgc0.c(a1mVar.userId());
            this.f2032c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            xdl0.M(this.f2034e, NullChecker.a(literaturesComments));
            if (NullChecker.a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f2039j.setText(literatures.title);
            this.f2040k.setText(m3584d(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            xdl0.M(this.f2043n, z && i == iv10Var.m15418C() - 1);
            xdl0.M(this.f2033d, a1mVar.mo1523P1() && !NullChecker.a(literaturesComments));
            xdl0.E0(this.f2043n, this);
            xdl0.E0(this, this);
            if (a1mVar.mo1570m0()) {
                List listP = BookMoviesDramasHelper.p(literatures.id);
                if (vwb.J(listP)) {
                    m3591j(false, "");
                } else {
                    m3591j(true, ((LiteraturesComments) listP.get(0)).interestLevel);
                }
            }
            if (!a1mVar.mo1570m0() && !a1mVar.mo1523P1()) {
                m3589h(a1mVar, literatures, literaturesComments);
            }
            if (!a1mVar.mo1570m0()) {
                zvf0.A("e_profile_artwork_info", "p_suggest_user_profile_info_view", new j760[]{new j760("is_artwork_interactive", Boolean.FALSE), new j760("artwork_title", literatures.title), new j760("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new j760("artwork_status", (String) this.f2049t.b)});
            } else {
                if (!a1mVar.mo1570m0() || NullChecker.a(literaturesComments)) {
                    return;
                }
                zvf0.A("e_artwork_guess_you_like", "p_edit_profile_view", new j760[]{new j760("artwork_type", literatures.title), new j760("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category)});
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3589h(a1m a1mVar, final Literatures literatures, final LiteraturesComments literaturesComments) {
        a1mVar.act().duringCreated(c.just(BookMoviesDramasHelper.p(literatures.id))).first().subscribe(mkd0.G(new e30() { // from class: l.ara0
            public final void call(Object obj) {
                this.f7867a.m3586e(literatures, literaturesComments, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m3590i(a1m a1mVar, final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.j(a1mVar.act(), literatures.id, literatures.category, new f30() { // from class: l.zqa0
            public final void call(Object obj, Object obj2) {
                this.f23565a.m3587f(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m3591j(boolean z, String str) {
        LinearLayout linearLayout = this.f2034e;
        if (!z) {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f2033d, true);
        } else {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f2033d, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f2043n) {
            if (NullChecker.a(this.f2045p.act())) {
                this.f2045p.act().startActivity(MkWebViewAct.a2(this.f2045p.act(), "", (!this.f2045p.mo1570m0() || this.f2048s.m15422H()) ? String.format(p.q3(), this.f2045p.userId(), "0", this.f2045p.from()) : p.p3()));
            }
        } else if (view == this && this.f2045p.mo1570m0()) {
            zvf0.u("e_artwork_guess_you_like", "p_edit_profile_view", new j760[]{new j760("artwork_type", this.f2046q.title), new j760("artwork_title", TextUtils.equals(this.f2046q.category, "teleplay") ? "tv_show" : this.f2046q.category)});
            m3590i(this.f2045p, xdl0.O0(this.f2033d), this.f2046q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3585c(this);
        xdl0.M(this.f2034e, false);
        xdl0.M(this.f2033d, false);
        xdl0.M(this.f2037h, false);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(x2c0.Km);
                break;
            case "book":
                drawable = getResources().getDrawable(x2c0.Im);
                break;
            case "movie":
                drawable = getResources().getDrawable(x2c0.Jm);
                break;
            default:
                drawable = null;
                break;
        }
        this.f2038i.setImageDrawable(drawable);
    }

    public void setWatchType(String str) {
        Drawable drawable;
        String str2;
        str.getClass();
        switch (str) {
            case "to_watch":
                drawable = getResources().getDrawable(x2c0.Zm);
                str2 = "想看";
                break;
            case "watching":
                drawable = getResources().getDrawable(x2c0.bn);
                str2 = "在看";
                break;
            case "watched":
                drawable = getResources().getDrawable(x2c0.an);
                str2 = "看过";
                break;
            default:
                drawable = null;
                str2 = null;
                break;
        }
        this.f2035f.setImageDrawable(drawable);
        this.f2036g.setText(str2);
    }

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProfileRecentlyNewItem(Context context) {
        this(context, null);
    }
}
