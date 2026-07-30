package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.szb0;
import l.vwb;
import p003l.pka;
import p003l.tka;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CorePopularMemeAct extends PutongMvpAct<pka, tka> {

    /* JADX INFO: renamed from: j */
    public static String f1748j = "is_send";

    /* JADX INFO: renamed from: k */
    public static String f1749k = "from_hot_gif";

    /* JADX INFO: renamed from: l */
    public static String f1750l = "from_favorite_gif";

    /* JADX INFO: renamed from: m */
    public static String f1751m = "from_message_gif";

    /* JADX INFO: renamed from: n */
    public static String f1752n = "";

    /* JADX INFO: renamed from: o */
    public static String f1753o = "sticker";

    /* JADX INFO: renamed from: e */
    public boolean f1754e;

    /* JADX INFO: renamed from: f */
    public String f1755f;

    /* JADX INFO: renamed from: g */
    public boolean f1756g;

    /* JADX INFO: renamed from: h */
    public boolean f1757h;

    /* JADX INFO: renamed from: i */
    public boolean f1758i;

    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public pka m2366V1() {
        return new pka(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public tka m2367X1() {
        return new tka(this);
    }

    public void finish() {
        hideInput();
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, szb0.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f1754e = getIntent().getBooleanExtra(f1748j, false);
        this.f1756g = getIntent().getBooleanExtra(f1749k, false);
        this.f1757h = getIntent().getBooleanExtra(f1751m, false);
        this.f1758i = getIntent().getBooleanExtra(f1750l, false);
        this.f1755f = getIntent().getStringExtra(f1752n);
        return super.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        String str = (NullChecker.a(getIntent()) && getIntent().getBooleanExtra(f1749k, false)) ? "hot_gifs" : "add_gifs";
        if (NullChecker.a(getIntent()) && getIntent().getBooleanExtra(f1751m, false)) {
            str = "gifs_association";
        }
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("hot_gifs_from_source", str)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        ((pka) ((PutongMvpAct) this).c).m6879H0(getIntent().getBooleanExtra(f1749k, false), getIntent().getBooleanExtra(f1750l, false), getIntent().getBooleanExtra(f1751m, false));
        super.initSubscription();
    }

    public String pageId() {
        return "p_stickers_from_suggest";
    }

    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
