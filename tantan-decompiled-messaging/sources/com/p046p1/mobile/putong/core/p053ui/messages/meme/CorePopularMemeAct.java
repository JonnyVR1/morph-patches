package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.pka;
import p149l.szb0;
import p149l.tka;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class CorePopularMemeAct extends PutongMvpAct<pka, tka> {

    /* JADX INFO: renamed from: j */
    public static String f31857j = "is_send";

    /* JADX INFO: renamed from: k */
    public static String f31858k = "from_hot_gif";

    /* JADX INFO: renamed from: l */
    public static String f31859l = "from_favorite_gif";

    /* JADX INFO: renamed from: m */
    public static String f31860m = "from_message_gif";

    /* JADX INFO: renamed from: n */
    public static String f31861n = "";

    /* JADX INFO: renamed from: o */
    public static String f31862o = "sticker";

    /* JADX INFO: renamed from: e */
    public boolean f31863e;

    /* JADX INFO: renamed from: f */
    public String f31864f;

    /* JADX INFO: renamed from: g */
    public boolean f31865g;

    /* JADX INFO: renamed from: h */
    public boolean f31866h;

    /* JADX INFO: renamed from: i */
    public boolean f31867i;

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public pka mo28672V1() {
        return new pka(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public tka mo28673X1() {
        return new tka(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        hideInput();
        super.m66873d2();
        overridePendingTransition(0, szb0.f167032g);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f31863e = getIntent().getBooleanExtra(f31857j, false);
        this.f31865g = getIntent().getBooleanExtra(f31858k, false);
        this.f31866h = getIntent().getBooleanExtra(f31860m, false);
        this.f31867i = getIntent().getBooleanExtra(f31859l, false);
        this.f31864f = getIntent().getStringExtra(f31861n);
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String str = (NullChecker.m81303a(getIntent()) && getIntent().getBooleanExtra(f31858k, false)) ? "hot_gifs" : "add_gifs";
        if (NullChecker.m81303a(getIntent()) && getIntent().getBooleanExtra(f31860m, false)) {
            str = "gifs_association";
        }
        this.pageHelper.m109040p(vwb.m200311Y("hot_gifs_from_source", str));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        ((pka) this.f17172c).m170010H0(getIntent().getBooleanExtra(f31858k, false), getIntent().getBooleanExtra(f31859l, false), getIntent().getBooleanExtra(f31860m, false));
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_stickers_from_suggest";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
