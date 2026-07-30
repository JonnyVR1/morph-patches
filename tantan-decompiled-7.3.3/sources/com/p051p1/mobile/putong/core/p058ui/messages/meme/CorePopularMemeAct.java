package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.bma;
import p153l.fma;
import p153l.jyb;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class CorePopularMemeAct extends PutongMvpAct<bma, fma> {

    /* JADX INFO: renamed from: j */
    public static String f32705j = "is_send";

    /* JADX INFO: renamed from: k */
    public static String f32706k = "from_hot_gif";

    /* JADX INFO: renamed from: l */
    public static String f32707l = "from_favorite_gif";

    /* JADX INFO: renamed from: m */
    public static String f32708m = "from_message_gif";

    /* JADX INFO: renamed from: n */
    public static String f32709n = "";

    /* JADX INFO: renamed from: o */
    public static String f32710o = "sticker";

    /* JADX INFO: renamed from: e */
    public boolean f32711e;

    /* JADX INFO: renamed from: f */
    public String f32712f;

    /* JADX INFO: renamed from: g */
    public boolean f32713g;

    /* JADX INFO: renamed from: h */
    public boolean f32714h;

    /* JADX INFO: renamed from: i */
    public boolean f32715i;

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public bma mo29671X1() {
        return new bma(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public fma mo29672Y1() {
        return new fma(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        hideInput();
        super.m68056e2();
        overridePendingTransition(0, y7c0.f197769g);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f32711e = getIntent().getBooleanExtra(f32705j, false);
        this.f32713g = getIntent().getBooleanExtra(f32706k, false);
        this.f32714h = getIntent().getBooleanExtra(f32708m, false);
        this.f32715i = getIntent().getBooleanExtra(f32707l, false);
        this.f32712f = getIntent().getStringExtra(f32709n);
        return super.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String str = (NullChecker.m82486a(getIntent()) && getIntent().getBooleanExtra(f32706k, false)) ? "hot_gifs" : "add_gifs";
        if (NullChecker.m82486a(getIntent()) && getIntent().getBooleanExtra(f32708m, false)) {
            str = "gifs_association";
        }
        this.pageHelper.m152781p(jyb.m147494Y("hot_gifs_from_source", str));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        ((bma) this.f17891c).m105019H0(getIntent().getBooleanExtra(f32706k, false), getIntent().getBooleanExtra(f32707l, false), getIntent().getBooleanExtra(f32708m, false));
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_stickers_from_suggest";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
