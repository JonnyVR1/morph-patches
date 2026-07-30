package com.p051p1.mobile.putong.core.p058ui.profile.views;

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
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.epc0;
import p153l.fza0;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.q320;
import p153l.t3m;
import p153l.tu2;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileRecentlyNewItem extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ProfileRecentlyNewItem f35056a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f35057b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35058c;

    /* JADX INFO: renamed from: d */
    public VImage f35059d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f35060e;

    /* JADX INFO: renamed from: f */
    public VImage f35061f;

    /* JADX INFO: renamed from: g */
    public VText f35062g;

    /* JADX INFO: renamed from: h */
    public VText f35063h;

    /* JADX INFO: renamed from: i */
    public VImage f35064i;

    /* JADX INFO: renamed from: j */
    public VText f35065j;

    /* JADX INFO: renamed from: k */
    public VText f35066k;

    /* JADX INFO: renamed from: l */
    public View f35067l;

    /* JADX INFO: renamed from: m */
    public View f35068m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f35069n;

    /* JADX INFO: renamed from: o */
    public int f35070o;

    /* JADX INFO: renamed from: p */
    public t3m f35071p;

    /* JADX INFO: renamed from: q */
    public Literatures f35072q;

    /* JADX INFO: renamed from: r */
    public LiteraturesComments f35073r;

    /* JADX INFO: renamed from: s */
    public q320 f35074s;

    /* JADX INFO: renamed from: t */
    public bkj0<String, String, String> f35075t;

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35070o = 0;
        this.f35075t = bkj0.m104818a("", "", "");
    }

    /* JADX INFO: renamed from: d */
    public static String m54209d(List<String> list) {
        if (jyb.m147479J(list)) {
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
    public final void m54210c(View view) {
        fza0.m128147a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m54211e(Literatures literatures, LiteraturesComments literaturesComments, List list) {
        bkj0<String, String, String> bkj0VarM60624g = BookMoviesDramasHelper.m60624g(list, literatures, literaturesComments);
        this.f35075t = bkj0VarM60624g;
        if (!TextUtils.isEmpty(bkj0VarM60624g.f77081a)) {
            bnl0.m105524M(this.f35060e, false);
            bnl0.m105524M(this.f35063h, true);
            this.f35063h.setText(this.f35075t.f77081a);
        } else if (!NullChecker.m82486a(literaturesComments)) {
            bnl0.m105524M(this.f35060e, false);
            bnl0.m105524M(this.f35063h, false);
        } else {
            bnl0.m105524M(this.f35063h, false);
            bnl0.m105524M(this.f35060e, true);
            setWatchType(literaturesComments.interestLevel);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m54212f(boolean z, Boolean bool, String str) {
        if (z) {
            if (bool.booleanValue()) {
                m54216j(true, str);
                tu2.m192703a("[profile progress]", "add myrecent from list");
                return;
            }
            return;
        }
        if (bool.booleanValue()) {
            if (TextUtils.equals(str, RequestParameters.SUBRESOURCE_DELETE)) {
                m54216j(false, str);
                if (NullChecker.m82486a(this.f35073r)) {
                    this.f35074s.m175107I(this);
                }
            } else {
                m54216j(true, str);
            }
            tu2.m192703a("[profile progress]", "delete myrecent from list");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m54213g(t3m t3mVar, Literatures literatures, LiteraturesComments literaturesComments, int i, q320 q320Var, boolean z, Map<String, Integer> map) {
        if (NullChecker.m82486a(literatures)) {
            this.f35070o = i;
            this.f35074s = q320Var;
            this.f35071p = t3mVar;
            this.f35072q = literatures;
            this.f35073r = literaturesComments;
            epc0.m121848c(t3mVar.userId());
            this.f35058c.setImageUrl(literatures.headUrl);
            setTypeIcon(literatures.category);
            bnl0.m105524M(this.f35060e, NullChecker.m82486a(literaturesComments));
            if (NullChecker.m82486a(literaturesComments)) {
                setWatchType(literaturesComments.interestLevel);
            }
            this.f35065j.setText(literatures.title);
            this.f35066k.setText(m54209d(TextUtils.equals(literatures.category, "book") ? literatures.authors : literatures.kinds));
            bnl0.m105524M(this.f35069n, z && i == q320Var.mo29823C() - 1);
            bnl0.m105524M(this.f35059d, t3mVar.mo52258P1() && !NullChecker.m82486a(literaturesComments));
            bnl0.m105509E0(this.f35069n, this);
            bnl0.m105509E0(this, this);
            if (t3mVar.mo52302m0()) {
                List<LiteraturesComments> listM60633p = BookMoviesDramasHelper.m60633p(literatures.f21175id);
                if (jyb.m147479J(listM60633p)) {
                    m54216j(false, "");
                } else {
                    m54216j(true, listM60633p.get(0).interestLevel);
                }
            }
            if (!t3mVar.mo52302m0() && !t3mVar.mo52258P1()) {
                m54214h(t3mVar, literatures, literaturesComments);
            }
            if (!t3mVar.mo52302m0()) {
                i4g0.m138492A("e_profile_artwork_info", OMSDialogPositon.p_suggest_user_profile_info_view, new pf60("is_artwork_interactive", Boolean.FALSE), new pf60("artwork_title", literatures.title), new pf60("artwork_type", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category), new pf60("artwork_status", this.f35075t.f77082b));
            } else {
                if (!t3mVar.mo52302m0() || NullChecker.m82486a(literaturesComments)) {
                    return;
                }
                i4g0.m138492A("e_artwork_guess_you_like", "p_edit_profile_view", new pf60("artwork_type", literatures.title), new pf60("artwork_title", TextUtils.equals(literatures.category, "teleplay") ? "tv_show" : literatures.category));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54214h(t3m t3mVar, final Literatures literatures, final LiteraturesComments literaturesComments) {
        t3mVar.act().duringCreated(C22421c.just(BookMoviesDramasHelper.m60633p(literatures.f21175id))).first().subscribe(psd0.m173596G(new y20() { // from class: l.eza0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96576a.m54211e(literatures, literaturesComments, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m54215i(t3m t3mVar, final boolean z, Literatures literatures) {
        BookMoviesDramasHelper.m60627j(t3mVar.act(), literatures.f21175id, literatures.category, new z20() { // from class: l.dza0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f91337a.m54212f(z, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m54216j(boolean z, String str) {
        LinearLayout linearLayout = this.f35060e;
        if (!z) {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f35059d, true);
        } else {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f35059d, false);
            setWatchType(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f35069n) {
            if (NullChecker.m82486a(this.f35071p.act())) {
                this.f35071p.act().startActivity(MkWebViewAct.m81419b2(this.f35071p.act(), "", (!this.f35071p.mo52302m0() || this.f35074s.m175106H()) ? String.format(C4901p.m35367q3(), this.f35071p.userId(), "0", this.f35071p.from()) : C4901p.m35366p3()));
            }
        } else if (view == this && this.f35071p.mo52302m0()) {
            i4g0.m138523u("e_artwork_guess_you_like", "p_edit_profile_view", new pf60("artwork_type", this.f35072q.title), new pf60("artwork_title", TextUtils.equals(this.f35072q.category, "teleplay") ? "tv_show" : this.f35072q.category));
            m54215i(this.f35071p, bnl0.m105529O0(this.f35059d), this.f35072q);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54210c(this);
        bnl0.m105524M(this.f35060e, false);
        bnl0.m105524M(this.f35059d, false);
        bnl0.m105524M(this.f35063h, false);
    }

    public void setTypeIcon(String str) {
        Drawable drawable;
        str.getClass();
        switch (str) {
            case "teleplay":
                drawable = getResources().getDrawable(dbc0.f87617yn);
                break;
            case "book":
                drawable = getResources().getDrawable(dbc0.f87553wn);
                break;
            case "movie":
                drawable = getResources().getDrawable(dbc0.f87585xn);
                break;
            default:
                drawable = null;
                break;
        }
        this.f35064i.setImageDrawable(drawable);
    }

    public void setWatchType(String str) {
        Drawable drawable;
        String str2;
        str.getClass();
        switch (str) {
            case "to_watch":
                drawable = getResources().getDrawable(dbc0.f86416Nn);
                str2 = "想看";
                break;
            case "watching":
                drawable = getResources().getDrawable(dbc0.f86480Pn);
                str2 = "在看";
                break;
            case "watched":
                drawable = getResources().getDrawable(dbc0.f86448On);
                str2 = "看过";
                break;
            default:
                drawable = null;
                str2 = null;
                break;
        }
        this.f35061f.setImageDrawable(drawable);
        this.f35062g.setText(str2);
    }

    public ProfileRecentlyNewItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProfileRecentlyNewItem(Context context) {
        this(context, null);
    }
}
