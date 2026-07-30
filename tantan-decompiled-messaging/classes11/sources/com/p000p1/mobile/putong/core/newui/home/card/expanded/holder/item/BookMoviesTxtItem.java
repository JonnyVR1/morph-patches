package com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import java.util.List;
import l.du2;
import l.f30;
import l.j760;
import l.lqa;
import l.r53;
import l.roj0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BookMoviesTxtItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f1212a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f1213b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f1214c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f1215d;

    public BookMoviesTxtItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    private void setWatchType(LiteraturesComments literaturesComments) {
        byte b;
        String str;
        String str2 = literaturesComments.interestLevel;
        str2.getClass();
        switch (str2) {
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
                str = "想看";
                break;
            case 1:
                str = "在看";
                break;
            case 2:
                str = "看过";
                break;
            default:
                str = null;
                break;
        }
        Literatures literatures = literaturesComments.localLiteratures;
        if (literatures != null) {
            String str4 = literatures.category;
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
        }
        if (str == null || str3 == null) {
            return;
        }
        this.f1215d.setText(String.format("%s的%s", str, str3));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m2132B(LiteraturesComments literaturesComments, Boolean bool, String str) {
        if (bool.booleanValue()) {
            m2139w(literaturesComments, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m2133C(final LiteraturesComments literaturesComments, boolean z) {
        if (literaturesComments == null || literaturesComments.localLiteratures == null) {
            return;
        }
        setBackgroundResource(lqa.w() ? x2c0.F6 : x2c0.Lm);
        m2135F(literaturesComments.localLiteratures.category, false);
        this.f1213b.setText(literaturesComments.localLiteratures.title);
        VText_NoTopPadding vText_NoTopPadding = this.f1214c;
        boolean zEquals = "book".equals(literaturesComments.localLiteratures.category);
        Literatures literatures = literaturesComments.localLiteratures;
        vText_NoTopPadding.setText(m2138v(zEquals ? literatures.authors : literatures.kinds));
        setWatchType(literaturesComments);
        if (!TextUtils.equals(CoreModule.H().userId(), literaturesComments.userID)) {
            m2134E(literaturesComments);
        }
        if (z) {
            xdl0.E0(this, new View.OnClickListener() { // from class: l.p53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18393a.m2140z(literaturesComments, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m2134E(LiteraturesComments literaturesComments) {
        List listP = BookMoviesDramasHelper.p(literaturesComments.localLiteratures.id);
        if (!vwb.J(listP)) {
            xaj0 xaj0VarG = BookMoviesDramasHelper.g(listP, literaturesComments.localLiteratures, literaturesComments);
            if (!TextUtils.isEmpty((CharSequence) xaj0VarG.a)) {
                this.f1215d.setText((CharSequence) xaj0VarG.a);
                this.f1215d.setTextColor(Color.parseColor(upa.z() ? "#B2000000" : "#FE7E1D"));
                setBackground(getResources().getDrawable(upa.z() ? x2c0.L1 : x2c0.Y8));
                m2135F(literaturesComments.localLiteratures.category, upa.z());
                return;
            }
        }
        setWatchType(literaturesComments);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final void m2135F(String str, boolean z) {
        int i;
        str.getClass();
        int i2 = 0;
        switch (str) {
            case "teleplay":
                if (upa.z()) {
                    if (!z) {
                        i = x2c0.Hg;
                    } else {
                        i = x2c0.Ig;
                    }
                    break;
                } else {
                    i = x2c0.Jg;
                    break;
                }
                break;
            case "book":
                if (upa.z()) {
                    if (!z) {
                        i = x2c0.zg;
                    } else {
                        i = x2c0.Ag;
                    }
                    break;
                } else {
                    i = x2c0.Bg;
                    break;
                }
                break;
            case "movie":
                if (upa.z()) {
                    if (!z) {
                        i = x2c0.Dg;
                    } else {
                        i = x2c0.Eg;
                    }
                    break;
                } else {
                    i = x2c0.Fg;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    this.f1212a.setImageDrawable(getResources().getDrawable(i2));
                }
        }
        i2 = i;
        if (i2 != 0) {
            this.f1212a.setImageDrawable(getResources().getDrawable(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m2136G(final LiteraturesComments literaturesComments) {
        Act actE = xdl0.E(this);
        Literatures literatures = literaturesComments.localLiteratures;
        BookMoviesDramasHelper.j(actE, literatures.id, literatures.category, new f30() { // from class: l.q53
            public final void call(Object obj, Object obj2) {
                this.f19032a.m2132B(literaturesComments, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2137u(this);
        if (upa.z()) {
            this.f1213b.setTextColor(Color.parseColor("#000000"));
            this.f1214c.setTextColor(Color.parseColor("#B2000000"));
            this.f1215d.setTextColor(Color.parseColor("#33000000"));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2137u(View view) {
        r53.a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final String m2138v(List<String> list) {
        return vwb.J(list) ? "" : TextUtils.join(" / ", list);
    }

    /* JADX INFO: renamed from: w */
    public final void m2139w(LiteraturesComments literaturesComments, String str) {
        if ("delete".equals(str)) {
            p.f0.onNext(roj0.a);
        } else {
            setWatchType(literaturesComments);
        }
        du2.a("[profile progress]", "delete myrecent from list");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m2140z(LiteraturesComments literaturesComments, View view) {
        zvf0.u("e_artwork_guess_you_like", xdl0.E(this).pageId(), new j760[]{new j760("artwork_type", literaturesComments.localLiteratures.title), new j760("artwork_title", TextUtils.equals(literaturesComments.localLiteratures.category, "teleplay") ? "tv_show" : literaturesComments.localLiteratures.category)});
        m2136G(literaturesComments);
    }

    public BookMoviesTxtItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BookMoviesTxtItem(Context context) {
        this(context, null);
    }
}
