package com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.h63;
import p153l.i4g0;
import p153l.jyb;
import p153l.pf60;
import p153l.tu2;
import p153l.uxj0;
import p153l.xra;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class BookMoviesTxtItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f23176a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f23177b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f23178c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f23179d;

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
        this.f23179d.setText(String.format("%s的%s", str, str3));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m39161B(LiteraturesComments literaturesComments, Boolean bool, String str) {
        if (bool.booleanValue()) {
            m39168w(literaturesComments, str);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m39162C(final LiteraturesComments literaturesComments, boolean z) {
        if (literaturesComments == null || literaturesComments.localLiteratures == null) {
            return;
        }
        setBackgroundResource(xra.m212804w() ? dbc0.f86175G6 : dbc0.f87649zn);
        m39164F(literaturesComments.localLiteratures.category, false);
        this.f23177b.setText(literaturesComments.localLiteratures.title);
        VText_NoTopPadding vText_NoTopPadding = this.f23178c;
        boolean zEquals = "book".equals(literaturesComments.localLiteratures.category);
        Literatures literatures = literaturesComments.localLiteratures;
        vText_NoTopPadding.setText(m39167v(zEquals ? literatures.authors : literatures.kinds));
        setWatchType(literaturesComments);
        if (!TextUtils.equals(CoreModule.m30929H().userId(), literaturesComments.userID)) {
            m39163E(literaturesComments);
        }
        if (z) {
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.f63
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97373a.m39169z(literaturesComments, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m39163E(LiteraturesComments literaturesComments) {
        List<LiteraturesComments> listM60633p = BookMoviesDramasHelper.m60633p(literaturesComments.localLiteratures.f21175id);
        if (!jyb.m147479J(listM60633p)) {
            bkj0<String, String, String> bkj0VarM60624g = BookMoviesDramasHelper.m60624g(listM60633p, literaturesComments.localLiteratures, literaturesComments);
            if (!TextUtils.isEmpty(bkj0VarM60624g.f77081a)) {
                this.f23179d.setText(bkj0VarM60624g.f77081a);
                this.f23179d.setTextColor(Color.parseColor(gra.m131778z() ? "#B2000000" : "#FE7E1D"));
                setBackground(getResources().getDrawable(gra.m131778z() ? dbc0.f86362M1 : dbc0.f86785Z8));
                m39164F(literaturesComments.localLiteratures.category, gra.m131778z());
                return;
            }
        }
        setWatchType(literaturesComments);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public final void m39164F(String str, boolean z) {
        int i;
        str.getClass();
        int i2 = 0;
        switch (str) {
            case "teleplay":
                if (gra.m131778z()) {
                    if (!z) {
                        i = dbc0.f87515vh;
                    } else {
                        i = dbc0.f87547wh;
                    }
                    break;
                } else {
                    i = dbc0.f87579xh;
                    break;
                }
                break;
            case "book":
                if (gra.m131778z()) {
                    if (!z) {
                        i = dbc0.f87252nh;
                    } else {
                        i = dbc0.f87285oh;
                    }
                    break;
                } else {
                    i = dbc0.f87318ph;
                    break;
                }
                break;
            case "movie":
                if (gra.m131778z()) {
                    if (!z) {
                        i = dbc0.f87384rh;
                    } else {
                        i = dbc0.f87417sh;
                    }
                    break;
                } else {
                    i = dbc0.f87450th;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    this.f23176a.setImageDrawable(getResources().getDrawable(i2));
                }
        }
        i2 = i;
        if (i2 != 0) {
            this.f23176a.setImageDrawable(getResources().getDrawable(i2));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m39165G(final LiteraturesComments literaturesComments) {
        Act act = (Act) bnl0.m105508E(this);
        Literatures literatures = literaturesComments.localLiteratures;
        BookMoviesDramasHelper.m60627j(act, literatures.f21175id, literatures.category, new z20() { // from class: l.g63
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f102373a.m39161B(literaturesComments, (Boolean) obj, (String) obj2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39166u(this);
        if (gra.m131778z()) {
            this.f23177b.setTextColor(Color.parseColor(Constants.BLACK));
            this.f23178c.setTextColor(Color.parseColor("#B2000000"));
            this.f23179d.setTextColor(Color.parseColor("#33000000"));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m39166u(View view) {
        h63.m133678a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final String m39167v(List<String> list) {
        return jyb.m147479J(list) ? "" : TextUtils.join(" / ", list);
    }

    /* JADX INFO: renamed from: w */
    public final void m39168w(LiteraturesComments literaturesComments, String str) {
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            C4901p.f20821f0.onNext(uxj0.f181467a);
        } else {
            setWatchType(literaturesComments);
        }
        tu2.m192703a("[profile progress]", "delete myrecent from list");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m39169z(LiteraturesComments literaturesComments, View view) {
        i4g0.m138523u("e_artwork_guess_you_like", ((Act) bnl0.m105508E(this)).pageId(), new pf60("artwork_type", literaturesComments.localLiteratures.title), new pf60("artwork_title", TextUtils.equals(literaturesComments.localLiteratures.category, "teleplay") ? "tv_show" : literaturesComments.localLiteratures.category));
        m39165G(literaturesComments);
    }

    public BookMoviesTxtItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BookMoviesTxtItem(Context context) {
        this(context, null);
    }
}
