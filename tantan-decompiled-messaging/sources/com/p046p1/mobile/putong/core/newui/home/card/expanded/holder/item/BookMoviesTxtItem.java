package com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.item;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText_NoTopPadding;
import p149l.du2;
import p149l.f30;
import p149l.j760;
import p149l.lqa;
import p149l.r53;
import p149l.roj0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class BookMoviesTxtItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VImage f22434a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f22435b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f22436c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f22437d;

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
        this.f22437d.setText(String.format("%s的%s", str, str3));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m38158B(LiteraturesComments literaturesComments, Boolean bool, String str) {
        if (bool.booleanValue()) {
            m38165w(literaturesComments, str);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m38159C(final LiteraturesComments literaturesComments, boolean z) {
        if (literaturesComments == null || literaturesComments.localLiteratures == null) {
            return;
        }
        setBackgroundResource(lqa.m150985w() ? x2c0.f189320F6 : x2c0.f189523Lm);
        m38161F(literaturesComments.localLiteratures.category, false);
        this.f22435b.setText(literaturesComments.localLiteratures.title);
        VText_NoTopPadding vText_NoTopPadding = this.f22436c;
        boolean zEquals = "book".equals(literaturesComments.localLiteratures.category);
        Literatures literatures = literaturesComments.localLiteratures;
        vText_NoTopPadding.setText(m38164v(zEquals ? literatures.authors : literatures.kinds));
        setWatchType(literaturesComments);
        if (!TextUtils.equals(CoreModule.m29931H().userId(), literaturesComments.userID)) {
            m38160E(literaturesComments);
        }
        if (z) {
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.p53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147253a.m38166z(literaturesComments, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m38160E(LiteraturesComments literaturesComments) {
        List<LiteraturesComments> listM59449p = BookMoviesDramasHelper.m59449p(literaturesComments.localLiteratures.f20433id);
        if (!vwb.m200296J(listM59449p)) {
            xaj0<String, String, String> xaj0VarM59440g = BookMoviesDramasHelper.m59440g(listM59449p, literaturesComments.localLiteratures, literaturesComments);
            if (!TextUtils.isEmpty(xaj0VarM59440g.f191751a)) {
                this.f22437d.setText(xaj0VarM59440g.f191751a);
                this.f22437d.setTextColor(Color.parseColor(upa.m194847z() ? "#B2000000" : "#FE7E1D"));
                setBackground(getResources().getDrawable(upa.m194847z() ? x2c0.f189502L1 : x2c0.f189912Y8));
                m38161F(literaturesComments.localLiteratures.category, upa.m194847z());
                return;
            }
        }
        setWatchType(literaturesComments);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public final void m38161F(String str, boolean z) {
        int i;
        str.getClass();
        int i2 = 0;
        switch (str) {
            case "teleplay":
                if (upa.m194847z()) {
                    if (!z) {
                        i = x2c0.f189393Hg;
                    } else {
                        i = x2c0.f189424Ig;
                    }
                    break;
                } else {
                    i = x2c0.f189455Jg;
                    break;
                }
                break;
            case "book":
                if (upa.m194847z()) {
                    if (!z) {
                        i = x2c0.f190779zg;
                    } else {
                        i = x2c0.f189170Ag;
                    }
                    break;
                } else {
                    i = x2c0.f189202Bg;
                    break;
                }
                break;
            case "movie":
                if (upa.m194847z()) {
                    if (!z) {
                        i = x2c0.f189266Dg;
                    } else {
                        i = x2c0.f189298Eg;
                    }
                    break;
                } else {
                    i = x2c0.f189330Fg;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    this.f22434a.setImageDrawable(getResources().getDrawable(i2));
                }
        }
        i2 = i;
        if (i2 != 0) {
            this.f22434a.setImageDrawable(getResources().getDrawable(i2));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m38162G(final LiteraturesComments literaturesComments) {
        Act act = (Act) xdl0.m208328E(this);
        Literatures literatures = literaturesComments.localLiteratures;
        BookMoviesDramasHelper.m59443j(act, literatures.f20433id, literatures.category, new f30() { // from class: l.q53
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f152723a.m38158B(literaturesComments, (Boolean) obj, (String) obj2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38163u(this);
        if (upa.m194847z()) {
            this.f22435b.setTextColor(Color.parseColor(Constants.BLACK));
            this.f22436c.setTextColor(Color.parseColor("#B2000000"));
            this.f22437d.setTextColor(Color.parseColor("#33000000"));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m38163u(View view) {
        r53.m177880a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final String m38164v(List<String> list) {
        return vwb.m200296J(list) ? "" : TextUtils.join(" / ", list);
    }

    /* JADX INFO: renamed from: w */
    public final void m38165w(LiteraturesComments literaturesComments, String str) {
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            C4750p.f20079f0.onNext(roj0.f160388a);
        } else {
            setWatchType(literaturesComments);
        }
        du2.m113670a("[profile progress]", "delete myrecent from list");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m38166z(LiteraturesComments literaturesComments, View view) {
        zvf0.m220399u("e_artwork_guess_you_like", ((Act) xdl0.m208328E(this)).pageId(), new j760("artwork_type", literaturesComments.localLiteratures.title), new j760("artwork_title", TextUtils.equals(literaturesComments.localLiteratures.category, "teleplay") ? "tv_show" : literaturesComments.localLiteratures.category));
        m38162G(literaturesComments);
    }

    public BookMoviesTxtItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BookMoviesTxtItem(Context context) {
        this(context, null);
    }
}
