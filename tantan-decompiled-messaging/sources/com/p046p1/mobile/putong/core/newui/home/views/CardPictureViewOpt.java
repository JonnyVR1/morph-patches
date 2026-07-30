package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import com.p046p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VTexturePlayer;
import p149l.e30;
import p149l.ffx;
import p149l.fyx;
import p149l.ib1;
import p149l.j760;
import p149l.l480;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ngm;
import p149l.o7m;
import p149l.osi0;
import p149l.qib0;
import p149l.qkq0;
import p149l.r3l0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.v2a;
import p149l.wl4;
import p149l.x1l0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.ym2;
import p149l.yni;
import p149l.z91;
import p149l.zub;

/* JADX INFO: loaded from: classes11.dex */
public class CardPictureViewOpt extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22583b, o7m {

    /* JADX INFO: renamed from: u */
    public static long f23744u;

    /* JADX INFO: renamed from: a */
    public CardDraweeViewOpt f23745a;

    /* JADX INFO: renamed from: b */
    public CardDraweeViewOpt f23746b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f23747c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f23748d;

    /* JADX INFO: renamed from: e */
    public VImage f23749e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f23750f;

    /* JADX INFO: renamed from: g */
    public VImage f23751g;

    /* JADX INFO: renamed from: h */
    public LayoutStyle f23752h;

    /* JADX INFO: renamed from: i */
    public VTexturePlayer f23753i;

    /* JADX INFO: renamed from: j */
    public Media f23754j;

    /* JADX INFO: renamed from: k */
    public long f23755k;

    /* JADX INFO: renamed from: l */
    public int f23756l;

    /* JADX INFO: renamed from: m */
    public C22392a<Boolean> f23757m;

    /* JADX INFO: renamed from: n */
    public C22392a<Boolean> f23758n;

    /* JADX INFO: renamed from: o */
    public e30<Boolean> f23759o;

    /* JADX INFO: renamed from: p */
    public e30<Boolean> f23760p;

    /* JADX INFO: renamed from: q */
    public final z91 f23761q;

    /* JADX INFO: renamed from: r */
    public int f23762r;

    /* JADX INFO: renamed from: s */
    public float f23763s;

    /* JADX INFO: renamed from: t */
    public int f23764t;

    public enum LayoutStyle {
        HOME_CARD("头图"),
        LIFE_PHOTO("生活照");

        private String desc;

        LayoutStyle(String str) {
            this.desc = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$a */
    public class C8053a implements z91 {
        public C8053a() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            CardPictureViewOpt.this.mo36116d();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                CardPictureViewOpt.this.m39103s();
            }
        }

        @Override // p149l.z91
        public void success() {
            CardPictureViewOpt.this.m39103s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$b */
    public class C8054b extends ym2 {
        public C8054b() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            e30 e30Var = CardPictureViewOpt.this.f23760p;
            Boolean bool = Boolean.FALSE;
            e30Var.call(bool);
            CardPictureViewOpt.this.f23759o.call(bool);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            e30 e30Var = CardPictureViewOpt.this.f23760p;
            Boolean bool = Boolean.TRUE;
            e30Var.call(bool);
            CardPictureViewOpt.this.f23759o.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$c */
    public class C8055c implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public long f23767a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23768b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23769c;

        public C8055c(String str, int i) {
            this.f23768b = str;
            this.f23769c = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            this.f23767a = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(CardPictureViewOpt.this.f23755k, System.currentTimeMillis(), this.f23768b, this.f23769c);
            CardPictureViewOpt.this.f23753i.setLooping(false);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(CoreModule.f17544b), this.f23768b, this.f23769c);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (this.f23767a == -1 || !NullChecker.m81303a(CardPictureViewOpt.this.f23754j)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f23767a;
            if (jCurrentTimeMillis - j2 >= 200) {
                TrackMediaUploadUtil.m80310h0(jCurrentTimeMillis - j2, "profile", this.f23768b);
                fyx.m123808b(this.f23767a, jCurrentTimeMillis, this.f23768b, this.f23769c);
            }
            this.f23767a = -1L;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$d */
    public class C8056d extends ViewOutlineProvider {
        public C8056d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.m186890d(20.0f));
        }
    }

    public CardPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f23752h = LayoutStyle.HOME_CARD;
        this.f23755k = -1L;
        this.f23756l = -1;
        Boolean bool = Boolean.FALSE;
        this.f23757m = C22392a.m221513c(bool);
        this.f23758n = C22392a.m221513c(bool);
        this.f23759o = new e30() { // from class: l.pl4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150073a.m39091x((Boolean) obj);
            }
        };
        this.f23760p = new e30() { // from class: l.ql4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155191a.m39092z((Boolean) obj);
            }
        };
        this.f23761q = new C8053a();
        this.f23762r = u4c0.f174399oa;
        this.f23763s = 0.2f;
        this.f23764t = 2000;
    }

    /* JADX INFO: renamed from: J */
    private void m39074J() {
        AudioManager audioManager = (AudioManager) CoreModule.f17544b.getSystemService("audio");
        if (NullChecker.m81303a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m39078f(Object obj) {
        if (Network.isConnected(CoreModule.f17544b)) {
            return;
        }
        lsi0.m151579i(R$string.f18813p4, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m39079g(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    private void m39087q(int i) {
        this.f23762r = i;
        for (int i2 = 0; i2 < this.f23748d.getChildCount(); i2++) {
            int id = this.f23748d.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f23748d;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m39088t() {
        if (this.f23753i == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f23753i = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f23753i.m223300k(true);
            this.f23753i.setId(u4c0.f174101Wd);
            if (getMeasuredHeight() > 0) {
                this.f23753i.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f23753i.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f23753i, indexOfChild(this.f23745a) + 1, generateDefaultLayoutParams(), true);
            this.f23753i.getLayoutParams().height = -1;
            this.f23753i.getLayoutParams().width = -1;
            if (NullChecker.m81303a(this.f23753i)) {
                this.f23753i.setOutlineProvider(new C8056d());
                this.f23753i.setClipToOutline(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: u */
    private float m39089u(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m81303a(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(picture) || !NullChecker.m81303a(picture.size)) {
                    dimension = null;
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = null;
                    }
                }
            }
        } else if (NullChecker.m81303a(picture)) {
            dimension = null;
        } else {
            dimension = null;
        }
        if (NullChecker.m81303a(dimension)) {
            return dimension.height / dimension.width;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: v */
    private static boolean m39090v() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f23744u;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f23744u = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m39091x(Boolean bool) {
        this.f23758n.onNext(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m39092z(Boolean bool) {
        yni.m215425n(TabName.Card);
        this.f23757m.onNext(bool);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m39093A() {
        if (NullChecker.m81303a(this.f23753i)) {
            this.f23753i.m223311v();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m39094C() {
        if (NullChecker.m81303a(this.f23753i)) {
            this.f23748d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f23753i.m223307r();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m39095D() {
        this.f23748d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (this.f23754j instanceof Video) {
            ib1.m135233b().mo135238f("PlayerView", AudioBusinessType.NORMAL, this.f23761q);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m39096E(Media media) {
        m39097F(media, -1);
    }

    /* JADX INFO: renamed from: F */
    public void m39097F(Media media, int i) {
        m39098G(media, i, false);
    }

    /* JADX INFO: renamed from: G */
    public void m39098G(Media media, int i, boolean z) {
        m39099H(media, i, z, false);
    }

    /* JADX INFO: renamed from: H */
    public void m39099H(Media media, int i, boolean z, boolean z2) {
        m39100I(media, i, z, z2, false);
    }

    /* JADX INFO: renamed from: I */
    public void m39100I(Media media, int i, boolean z, boolean z2, boolean z3) {
        xdl0.m208344M(this.f23745a, true);
        xdl0.m208344M(this.f23747c, false);
        this.f23756l = i;
        if (!media.equals(this.f23754j) && NullChecker.m81303a(this.f23753i)) {
            this.f23753i.setVisibility(4);
            this.f23753i.m223298i(false);
        }
        this.f23754j = media;
        if (!TEnum.equals(media.status, "raw")) {
            Picture.ImageUri imageUriM220207f = zub.m220207f(this.f23754j);
            if (imageUriM220207f == null) {
                qkq0.m175383a("not supported yet");
                return;
            }
            C8054b c8054b = new C8054b();
            if (i < 0 || i >= 100) {
                if (z) {
                    int color = Color.parseColor("#4c000000");
                    if (z3) {
                        qib0.f154691G.m102340Q(this.f23745a, imageUriM220207f.formatted(), 2, 16, color, c8054b);
                    } else {
                        String str = media instanceof Video ? "" : "profile";
                        imageUriM220207f.formatType = 3;
                        qib0.f154691G.m102319F0(this.f23745a, imageUriM220207f, str, c8054b);
                    }
                } else {
                    qib0.f154691G.m102319F0(this.f23745a, imageUriM220207f, media instanceof Video ? "" : "profile", c8054b);
                }
            } else {
                j760<Integer, Integer> j760VarM50284z = C8609a.m50284z(i);
                qib0.f154691G.m102336O(this.f23745a, imageUriM220207f.formatted(), j760VarM50284z.f116564a.intValue(), j760VarM50284z.f116565b.intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                qkq0.m175383a("not supported yet");
                return;
            }
            qib0.f154691G.m102365k0(this.f23745a, media.url);
        }
        if (!(media instanceof Video) || z || z2) {
            this.f23748d.setVisibility(4);
        } else {
            this.f23748d.setVisibility(0);
        }
    }

    @Override // p149l.o7m
    /* JADX INFO: renamed from: b */
    public void mo36115b(boolean z) {
        if (z) {
            m39102r(true);
        } else {
            m39094C();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        this.f23748d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m81303a(this.f23753i) && this.f23753i.getAlpha() != 0.0f) {
            this.f23753i.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m39087q(u4c0.f174399oa);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m39087q(u4c0.f173775D7);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m39090v()) {
            return;
        }
        int i = this.f23756l;
        if (i < 0 || i >= 100) {
            int i2 = this.f23762r;
            if (i2 == u4c0.f174399oa) {
                m39095D();
            } else if (i2 == u4c0.f174449r9) {
                m39094C();
            } else if (i2 == u4c0.f173775D7) {
                m39094C();
            }
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        this.f23753i.m223311v();
        this.f23748d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f23753i.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.rl4
            @Override // java.lang.Runnable
            public final void run() {
                this.f159924a.m39093A();
            }
        }, 400L);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("play video error true " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39101p(this);
        if (upa.m194847z()) {
            this.f23749e.setImageDrawable(getResources().getDrawable(x2c0.f190121es));
        }
        this.f23748d.setOnClickListener(this);
        CardDraweeViewOpt cardDraweeViewOpt = this.f23745a;
        int i = t100.f167266o;
        cardDraweeViewOpt.m38221w(i, i, i, i);
        this.f23745a.getHierarchy().m112050E(new l480(0.0f));
        this.f23746b.m38221w(i, i, i, i);
        this.f23746b.getHierarchy().m112050E(new l480(0.0f));
        this.f23747c.setAspectRatio(1.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        int iM121201d2 = ffx.m121201d(i2);
        LayoutStyle layoutStyle = this.f23752h;
        if (layoutStyle != LayoutStyle.HOME_CARD) {
            if (layoutStyle == LayoutStyle.LIFE_PHOTO) {
                super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(iM121201d2));
                return;
            } else {
                super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(iM121201d2));
                return;
            }
        }
        int i3 = (int) (((double) iM121201d) / 0.67d);
        if (upa.m194675N3()) {
            super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(Math.min(i3, iM121201d2)));
        } else if (i3 < iM121201d2) {
            super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(Math.min(i3, iM121201d2 - t100.f167266o)));
        } else {
            super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b(iM121201d2 - t100.f167266o));
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        CoreModule.m29936Q().mo67253Zo().mo111895f(false);
        if (v2a.m196754c() || IntlCountryCodeController.m28126v()) {
            xdl0.m208345M0(this.f23753i, false);
        }
        m39087q(u4c0.f174399oa);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        this.f23748d.animate().alpha(this.f23763s).setDuration(this.f23764t).start();
        m39087q(u4c0.f174449r9);
    }

    /* JADX INFO: renamed from: p */
    public final void m39101p(View view) {
        wl4.m203750a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m39102r(boolean z) {
        ib1.m135233b().mo135234a("PlayerView");
        ib1.m135233b().mo135237e("PlayerView");
        if (NullChecker.m81303a(this.f23753i)) {
            this.f23753i.m223298i(z);
            this.f23753i.animate().cancel();
            this.f23753i.setAlpha(0.0f);
            this.f23753i.setVisibility(4);
        }
        qib0.f154691G.m184725o(this.f23745a);
        qib0.f154691G.m184725o(this.f23746b);
        this.f23745a.setVisibility(0);
        m39087q(u4c0.f174399oa);
        this.f23748d.animate().cancel();
        this.f23748d.setAlpha(1.0f);
        this.f23753i = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m39103s() {
        CoreModule.m29936Q().mo67253Zo().mo111895f(true);
        Video videoMo223809clone = (Video) this.f23754j;
        if (videoMo223809clone.size == null && TEnum.equals(videoMo223809clone.status, "raw")) {
            videoMo223809clone = videoMo223809clone.mo223809clone();
            s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(videoMo223809clone.url)), false, false);
            videoMo223809clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            videoMo223809clone.size = new Dimension(s5l0Var.m182364m());
            videoMo223809clone.duration = s5l0Var.f162561b;
        }
        m39088t();
        float fM39089u = m39089u(videoMo223809clone);
        final String aspectRatio = videoMo223809clone.formatAspectRatio();
        r3l0.m177674c();
        this.f23755k = System.currentTimeMillis();
        final int i = fyx.f99914a;
        boolean zM177674c = r3l0.m177674c();
        this.f23753i.setIsInABGroup(zM177674c);
        this.f23753i.setOnBufferListener(new C8055c(aspectRatio, i));
        this.f23753i.setNetErrorListener(new e30() { // from class: l.sl4
            @Override // p149l.e30
            public final void call(Object obj) {
                CardPictureViewOpt.m39078f(obj);
            }
        });
        this.f23753i.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.tl4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(x1l0.m206744n().m206753u(aspectRatio));
            }
        }).compose(mkd0.m154951C()), videoMo223809clone.duration);
        this.f23753i.m223308s(Uri.parse(qib0.m174812d0(aspectRatio)), fM39089u, aspectRatio, (zM177674c || !videoMo223809clone.url.startsWith("http") || Network.isConnected(CoreModule.f17544b)) ? false : true, R$string.f18813p4, R$string.f18306Yj);
        x1l0.m206744n().m206751q(aspectRatio).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.ul4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177010a.m39104w(aspectRatio, i, (Integer) obj);
            }
        }, new e30() { // from class: l.vl4
            @Override // p149l.e30
            public final void call(Object obj) {
                CardPictureViewOpt.m39079g((Throwable) obj);
            }
        }));
        m39074J();
    }

    public void setBlurBackground(Drawable drawable) {
    }

    public void setBottomRoundCorner(boolean z) {
        int i = t100.f167266o;
        if (upa.m194675N3()) {
            this.f23745a.m38221w(i, i, i, i);
            this.f23746b.m38221w(i, i, i, i);
            return;
        }
        CardDraweeViewOpt cardDraweeViewOpt = this.f23745a;
        if (z) {
            cardDraweeViewOpt.m38221w(i, i, i, i);
            this.f23746b.m38221w(i, i, i, i);
        } else {
            cardDraweeViewOpt.m38221w(i, i, 0, 0);
            this.f23746b.m38221w(i, i, 0, 0);
        }
    }

    public void setStyle(LayoutStyle layoutStyle) {
        this.f23752h = layoutStyle;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m39104w(String str, int i, Integer num) {
        fyx.m123810d(this.f23755k, num.intValue(), str, i);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        this.f23753i.setVisibility(0);
        if (this.f23753i.getAlpha() < 1.0f) {
            this.f23753i.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f23748d.animate().alpha(this.f23763s).setDuration(this.f23764t).setInterpolator(new LinearInterpolator()).start();
        m39087q(u4c0.f174449r9);
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23752h = LayoutStyle.HOME_CARD;
        this.f23755k = -1L;
        this.f23756l = -1;
        Boolean bool = Boolean.FALSE;
        this.f23757m = C22392a.m221513c(bool);
        this.f23758n = C22392a.m221513c(bool);
        this.f23759o = new e30() { // from class: l.pl4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150073a.m39091x((Boolean) obj);
            }
        };
        this.f23760p = new e30() { // from class: l.ql4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155191a.m39092z((Boolean) obj);
            }
        };
        this.f23761q = new C8053a();
        this.f23762r = u4c0.f174399oa;
        this.f23763s = 0.2f;
        this.f23764t = 2000;
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23752h = LayoutStyle.HOME_CARD;
        this.f23755k = -1L;
        this.f23756l = -1;
        Boolean bool = Boolean.FALSE;
        this.f23757m = C22392a.m221513c(bool);
        this.f23758n = C22392a.m221513c(bool);
        this.f23759o = new e30() { // from class: l.pl4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150073a.m39091x((Boolean) obj);
            }
        };
        this.f23760p = new e30() { // from class: l.ql4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155191a.m39092z((Boolean) obj);
            }
        };
        this.f23761q = new C8053a();
        this.f23762r = u4c0.f174399oa;
        this.f23763s = 0.2f;
        this.f23764t = 2000;
    }
}
