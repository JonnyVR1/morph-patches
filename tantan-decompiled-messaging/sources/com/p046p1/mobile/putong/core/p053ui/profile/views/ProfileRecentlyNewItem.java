package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a1m;
import p149l.bra0;
import p149l.du2;
import p149l.e30;
import p149l.f30;
import p149l.iv10;
import p149l.j760;
import p149l.mkd0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xgc0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileRecentlyNewItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ProfileRecentlyNewItem f34208a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f34209b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f34210c;

    /* JADX INFO: renamed from: d */
    public VImage f34211d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f34212e;

    /* JADX INFO: renamed from: f */
    public VImage f34213f;

    /* JADX INFO: renamed from: g */
    public VText f34214g;

    /* JADX INFO: renamed from: h */
    public VText f34215h;

    /* JADX INFO: renamed from: i */
    public VImage f34216i;

    /* JADX INFO: renamed from: j */
    public VText f34217j;

    /* JADX INFO: renamed from: k */
    public VText f34218k;

    /* JADX INFO: renamed from: l */
    public View f34219l;

    /* JADX INFO: renamed from: m */
    public View f34220m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f34221n;

    /* JADX INFO: renamed from: o */
    public int f34222o;

    /* JADX INFO: renamed from: p */
    public a1m f34223p;

    /* JADX INFO: renamed from: q */
    public Literatures f34224q;

    /* JADX INFO: renamed from: r */
    public LiteraturesComments f34225r;

    /* JADX INFO: renamed from: s */
    public iv10 f34226s;

    /* JADX INFO: renamed from: t */
    public xaj0<String, String, String> f34227t;

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34222o = 0;
        this.f34227t = xaj0.m207578a("", "", "");
    }

    /* JADX INFO: renamed from: d */
    public static String m53026d(List<String> list) {
        if (vwb.m200296J(list)) {
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
    public final void m53027c(View view) {
        bra0.m103526a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m53028e(Literatures literatures, LiteraturesComments literaturesComments, List list) {
        xaj0<String, String, String> xaj0VarM59440g = BookMoviesDramasHelper.m59440g(list, literatures, literaturesComments);
        this.f34227t = xaj0VarM59440g;
        if (!TextUtils.isEmpty(xaj0VarM59440g.f191751a)) {
            xdl0.m208344M(this.f34212e, false);
            xdl0.m208344M(this.f34215h, true);
            this.f34215h.setText(this.f34227t.f191751a);
        } else if (!NullChecker.m81303a(literaturesComments)) {
            xdl0.m208344M(this.f34212e, false);
            xdl0.m208344M(this.f34215h, false);
        } else {
            xdl0.m208344M(this.f34215h, false);
            xdl0.m208344M(this.f34212e, true);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m53029f(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m53033j(true, str);
                du2.m113670a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE)) {
                m53033j(false, str);
                if (NullChecker.m81303a(this.f34225r)) {
                    this.f34226s.m138504I(this);
                }
            } else {
                m53033j(true, str);
            }
            du2.m113670a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m53030g(a1m a1mVar, Literatures literatures, LiteraturesComments literaturesComments, int i, iv10 iv10Var, boolean z, Map<String, Integer> map) {
        if (NullChecker.m81303a(literatures)) {
            this.f34222o = i;
            this.f34226s = iv10Var;
            this.f34223p = a1mVar;
            this.f34224q = literatures;
            this.f34225r = literaturesComments;
            xgc0.m208625c(a1mVar.userId());
            this.f34210c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            xdl0.m208344M(this.f34212e, NullChecker.m81303a(literaturesComments));
            if (NullChecker.m81303a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f34217j.setText(literatures.title);
            this.f34218k.setText(m53026d(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            xdl0.m208344M(this.f34221n, z && i == iv10Var.mo28824C() - 1);
            xdl0.m208344M(this.f34211d, a1mVar.mo51075P1() && !NullChecker.m81303a(literaturesComments));
            xdl0.m208329E0(this.f34221n, this);
            xdl0.m208329E0(this, this);
            if (a1mVar.mo51119m0()) {
                List<LiteraturesComments> listM59449p = BookMoviesDramasHelper.m59449p(literatures.f20433id);
                if (vwb.m200296J(listM59449p)) {
                    m53033j(false, "");
                } else {
                    m53033j(true, listM59449p.get(0).interestLevel);
                }
            }
            if (!a1mVar.mo51119m0() && !a1mVar.mo51075P1()) {
                m53031h(a1mVar, literatures, literaturesComments);
            }
            if (!a1mVar.mo51119m0()) {
                zvf0.m220368A("e_profile_artwork_info", OMSDialogPositon.p_suggest_user_profile_info_view, new j760("is_artwork_interactive", Boolean.FALSE), new j760("artwork_title", literatures.title), new j760("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new j760("artwork_status", this.f34227t.f191752b));
            } else {
                if (!a1mVar.mo51119m0() || NullChecker.m81303a(literaturesComments)) {
                    return;
                }
                zvf0.m220368A("e_artwork_guess_you_like", "p_edit_profile_view", new j760("artwork_type", literatures.title), new j760("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m53031h(a1m a1mVar, final Literatures literatures, final LiteraturesComments literaturesComments) {
        a1mVar.act().duringCreated(C22306c.just(BookMoviesDramasHelper.m59449p(literatures.f20433id))).first().subscribe(mkd0.m154955G(new e30() { // from class: l.ara0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71242a.m53028e(literatures, literaturesComments, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m53032i(a1m a1mVar, final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.m59443j(a1mVar.act(), literatures.f20433id, literatures.category, new f30() { // from class: l.zqa0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f204367a.m53029f(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m53033j(boolean z, String str) {
        LinearLayout linearLayout = this.f34212e;
        if (!z) {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f34211d, true);
        } else {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f34211d, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f34221n) {
            if (NullChecker.m81303a(this.f34223p.act())) {
                this.f34223p.act().startActivity(MkWebViewAct.m80236a2(this.f34223p.act(), "", (!this.f34223p.mo51119m0() || this.f34226s.m138503H()) ? String.format(C4750p.m34364q3(), this.f34223p.userId(), "0", this.f34223p.from()) : C4750p.m34363p3()));
            }
        } else if (view == this && this.f34223p.mo51119m0()) {
            zvf0.m220399u("e_artwork_guess_you_like", "p_edit_profile_view", new j760("artwork_type", this.f34224q.title), new j760("artwork_title", TextUtils.equals(this.f34224q.category, "teleplay") ? "tv_show" : this.f34224q.category));
            m53032i(this.f34223p, xdl0.m208349O0(this.f34211d), this.f34224q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53027c(this);
        xdl0.m208344M(this.f34212e, false);
        xdl0.m208344M(this.f34211d, false);
        xdl0.m208344M(this.f34215h, false);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(x2c0.f189492Km);
                break;
            case "book":
                drawable = getResources().getDrawable(x2c0.f189430Im);
                break;
            case "movie":
                drawable = getResources().getDrawable(x2c0.f189461Jm);
                break;
            default:
                drawable = null;
                break;
        }
        this.f34216i.setImageDrawable(drawable);
    }

    public void setWatchType(String str) {
        Drawable drawable;
        String str2;
        str.getClass();
        switch (str) {
            case "to_watch":
                drawable = getResources().getDrawable(x2c0.f189957Zm);
                str2 = "想看";
                break;
            case "watching":
                drawable = getResources().getDrawable(x2c0.f190021bn);
                str2 = "在看";
                break;
            case "watched":
                drawable = getResources().getDrawable(x2c0.f189989an);
                str2 = "看过";
                break;
            default:
                drawable = null;
                str2 = null;
                break;
        }
        this.f34213f.setImageDrawable(drawable);
        this.f34214g.setText(str2);
    }

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProfileRecentlyNewItem(Context context) {
        this(context, null);
    }
}
