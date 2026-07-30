package com.p051p1.mobile.putong.core.newui.home.views;

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
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import com.p051p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VTexturePlayer;
import p153l.adc0;
import p153l.bnl0;
import p153l.c7y;
import p153l.cbl0;
import p153l.dbc0;
import p153l.dox;
import p153l.eam;
import p153l.fn2;
import p153l.g4a;
import p153l.ga1;
import p153l.gra;
import p153l.nwb;
import p153l.o1j0;
import p153l.oki;
import p153l.pb1;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qim;
import p153l.r1j0;
import p153l.rc80;
import p153l.uqb0;
import p153l.uqi;
import p153l.vel0;
import p153l.vm4;
import p153l.wcl0;
import p153l.wel0;
import p153l.wtq0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardPictureViewOpt extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22698b, eam {

    /* JADX INFO: renamed from: u */
    public static long f24486u;

    /* JADX INFO: renamed from: a */
    public CardDraweeViewOpt f24487a;

    /* JADX INFO: renamed from: b */
    public CardDraweeViewOpt f24488b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f24489c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f24490d;

    /* JADX INFO: renamed from: e */
    public VImage f24491e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f24492f;

    /* JADX INFO: renamed from: g */
    public VImage f24493g;

    /* JADX INFO: renamed from: h */
    public LayoutStyle f24494h;

    /* JADX INFO: renamed from: i */
    public VTexturePlayer f24495i;

    /* JADX INFO: renamed from: j */
    public Media f24496j;

    /* JADX INFO: renamed from: k */
    public long f24497k;

    /* JADX INFO: renamed from: l */
    public int f24498l;

    /* JADX INFO: renamed from: m */
    public C22507a<Boolean> f24499m;

    /* JADX INFO: renamed from: n */
    public C22507a<Boolean> f24500n;

    /* JADX INFO: renamed from: o */
    public y20<Boolean> f24501o;

    /* JADX INFO: renamed from: p */
    public y20<Boolean> f24502p;

    /* JADX INFO: renamed from: q */
    public final ga1 f24503q;

    /* JADX INFO: renamed from: r */
    public int f24504r;

    /* JADX INFO: renamed from: s */
    public float f24505s;

    /* JADX INFO: renamed from: t */
    public int f24506t;

    public enum LayoutStyle {
        HOME_CARD("头图"),
        LIFE_PHOTO("生活照");

        private String desc;

        LayoutStyle(String str) {
            this.desc = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$a */
    public class C8204a implements ga1 {
        public C8204a() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            CardPictureViewOpt.this.mo37119d();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                CardPictureViewOpt.this.m40106s();
            }
        }

        @Override // p153l.ga1
        public void success() {
            CardPictureViewOpt.this.m40106s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$b */
    public class C8205b extends fn2 {
        public C8205b() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            y20 y20Var = CardPictureViewOpt.this.f24502p;
            Boolean bool = Boolean.FALSE;
            y20Var.call(bool);
            CardPictureViewOpt.this.f24501o.call(bool);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            y20 y20Var = CardPictureViewOpt.this.f24502p;
            Boolean bool = Boolean.TRUE;
            y20Var.call(bool);
            CardPictureViewOpt.this.f24501o.call(bool);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$c */
    public class C8206c implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public long f24509a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f24510b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f24511c;

        public C8206c(String str, int i) {
            this.f24510b = str;
            this.f24511c = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            this.f24509a = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(CardPictureViewOpt.this.f24497k, System.currentTimeMillis(), this.f24510b, this.f24511c);
            CardPictureViewOpt.this.f24495i.setLooping(false);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(CoreModule.f18263b), this.f24510b, this.f24511c);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (this.f24509a == -1 || !NullChecker.m82486a(CardPictureViewOpt.this.f24496j)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f24509a;
            if (jCurrentTimeMillis - j2 >= 200) {
                TrackMediaUploadUtil.m81493h0(jCurrentTimeMillis - j2, "profile", this.f24510b);
                c7y.m108343b(this.f24509a, jCurrentTimeMillis, this.f24510b, this.f24511c);
            }
            this.f24509a = -1L;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPictureViewOpt$d */
    public class C8207d extends ViewOutlineProvider {
        public C8207d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qa00.m175859d(20.0f));
        }
    }

    public CardPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f24494h = LayoutStyle.HOME_CARD;
        this.f24497k = -1L;
        this.f24498l = -1;
        Boolean bool = Boolean.FALSE;
        this.f24499m = C22507a.m222759c(bool);
        this.f24500n = C22507a.m222759c(bool);
        this.f24501o = new y20() { // from class: l.om4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147895a.m40094x((Boolean) obj);
            }
        };
        this.f24502p = new y20() { // from class: l.pm4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153119a.m40095z((Boolean) obj);
            }
        };
        this.f24503q = new C8204a();
        this.f24504r = adc0.f70524qa;
        this.f24505s = 0.2f;
        this.f24506t = 2000;
    }

    /* JADX INFO: renamed from: J */
    private void m40077J() {
        AudioManager audioManager = (AudioManager) CoreModule.f18263b.getSystemService("audio");
        if (NullChecker.m82486a(audioManager)) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m40081f(Object obj) {
        if (Network.isConnected(CoreModule.f18263b)) {
            return;
        }
        o1j0.m165635i(R$string.f19605r4, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m40082g(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    private void m40090q(int i) {
        this.f24504r = i;
        for (int i2 = 0; i2 < this.f24490d.getChildCount(); i2++) {
            int id = this.f24490d.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f24490d;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m40091t() {
        if (this.f24495i == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f24495i = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f24495i.m224546k(true);
            this.f24495i.setId(adc0.f70240Zd);
            if (getMeasuredHeight() > 0) {
                this.f24495i.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f24495i.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f24495i, indexOfChild(this.f24487a) + 1, generateDefaultLayoutParams(), true);
            this.f24495i.getLayoutParams().height = -1;
            this.f24495i.getLayoutParams().width = -1;
            if (NullChecker.m82486a(this.f24495i)) {
                this.f24495i.setOutlineProvider(new C8207d());
                this.f24495i.setClipToOutline(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: u */
    private float m40092u(Video video) {
        Dimension dimension;
        Picture picture = video.cover;
        if (NullChecker.m82486a(video.size)) {
            dimension = video.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(picture) || !NullChecker.m82486a(picture.size)) {
                    dimension = null;
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = null;
                    }
                }
            }
        } else if (NullChecker.m82486a(picture)) {
            dimension = null;
        } else {
            dimension = null;
        }
        if (NullChecker.m82486a(dimension)) {
            return dimension.height / dimension.width;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: v */
    private static boolean m40093v() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = f24486u;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 150) {
            return true;
        }
        f24486u = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m40094x(Boolean bool) {
        this.f24500n.onNext(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m40095z(Boolean bool) {
        uqi.m197347n(TabName.Card);
        this.f24499m.onNext(bool);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m40096A() {
        if (NullChecker.m82486a(this.f24495i)) {
            this.f24495i.m224557v();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m40097C() {
        if (NullChecker.m82486a(this.f24495i)) {
            this.f24490d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f24495i.m224553r();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m40098D() {
        this.f24490d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (this.f24496j instanceof Video) {
            pb1.m171472b().mo171477f("PlayerView", AudioBusinessType.NORMAL, this.f24503q);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m40099E(Media media) {
        m40100F(media, -1);
    }

    /* JADX INFO: renamed from: F */
    public void m40100F(Media media, int i) {
        m40101G(media, i, false);
    }

    /* JADX INFO: renamed from: G */
    public void m40101G(Media media, int i, boolean z) {
        m40102H(media, i, z, false);
    }

    /* JADX INFO: renamed from: H */
    public void m40102H(Media media, int i, boolean z, boolean z2) {
        m40103I(media, i, z, z2, false);
    }

    /* JADX INFO: renamed from: I */
    public void m40103I(Media media, int i, boolean z, boolean z2, boolean z3) {
        bnl0.m105524M(this.f24487a, true);
        bnl0.m105524M(this.f24489c, false);
        this.f24498l = i;
        if (!media.equals(this.f24496j) && NullChecker.m82486a(this.f24495i)) {
            this.f24495i.setVisibility(4);
            this.f24495i.m224544i(false);
        }
        this.f24496j = media;
        if (!TEnum.equals(media.status, "raw")) {
            Picture.ImageUri imageUriM164968f = nwb.m164968f(this.f24496j);
            if (imageUriM164968f == null) {
                wtq0.m207906a("not supported yet");
                return;
            }
            C8205b c8205b = new C8205b();
            if (i < 0 || i >= 100) {
                if (z) {
                    int color = Color.parseColor("#4c000000");
                    if (z3) {
                        uqb0.f180374G.m127124Q(this.f24487a, imageUriM164968f.formatted(), 2, 16, color, c8205b);
                    } else {
                        String str = media instanceof Video ? "" : "profile";
                        imageUriM164968f.formatType = 3;
                        uqb0.f180374G.m127103F0(this.f24487a, imageUriM164968f, str, c8205b);
                    }
                } else {
                    uqb0.f180374G.m127103F0(this.f24487a, imageUriM164968f, media instanceof Video ? "" : "profile", c8205b);
                }
            } else {
                pf60<Integer, Integer> pf60VarM51467z = C8772a.m51467z(i);
                uqb0.f180374G.m127120O(this.f24487a, imageUriM164968f.formatted(), pf60VarM51467z.f152156a.intValue(), pf60VarM51467z.f152157b.intValue());
            }
        } else {
            if (!(media instanceof Video)) {
                wtq0.m207906a("not supported yet");
                return;
            }
            uqb0.f180374G.m127148k0(this.f24487a, media.url);
        }
        if (!(media instanceof Video) || z || z2) {
            this.f24490d.setVisibility(4);
        } else {
            this.f24490d.setVisibility(0);
        }
    }

    @Override // p153l.eam
    /* JADX INFO: renamed from: b */
    public void mo37118b(boolean z) {
        if (z) {
            m40105r(true);
        } else {
            m40097C();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        this.f24490d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m82486a(this.f24495i) && this.f24495i.getAlpha() != 0.0f) {
            this.f24495i.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m40090q(adc0.f70524qa);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m40090q(adc0.f69897F7);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (m40093v()) {
            return;
        }
        int i = this.f24498l;
        if (i < 0 || i >= 100) {
            int i2 = this.f24504r;
            if (i2 == adc0.f70524qa) {
                m40098D();
            } else if (i2 == adc0.f70574t9) {
                m40097C();
            } else if (i2 == adc0.f69897F7) {
                m40097C();
            }
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        this.f24495i.m224557v();
        this.f24490d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f24495i.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.qm4
            @Override // java.lang.Runnable
            public final void run() {
                this.f158299a.m40096A();
            }
        }, 400L);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("play video error true " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40104p(this);
        if (gra.m131778z()) {
            this.f24491e.setImageDrawable(getResources().getDrawable(dbc0.f86581Ss));
        }
        this.f24490d.setOnClickListener(this);
        CardDraweeViewOpt cardDraweeViewOpt = this.f24487a;
        int i = qa00.f156328o;
        cardDraweeViewOpt.m39224w(i, i, i, i);
        this.f24487a.getHierarchy().m207042E(new rc80(0.0f));
        this.f24488b.m39224w(i, i, i, i);
        this.f24488b.getHierarchy().m207042E(new rc80(0.0f));
        this.f24489c.setAspectRatio(1.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        int iM117366d2 = dox.m117366d(i2);
        LayoutStyle layoutStyle = this.f24494h;
        if (layoutStyle != LayoutStyle.HOME_CARD) {
            if (layoutStyle == LayoutStyle.LIFE_PHOTO) {
                super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(iM117366d2));
                return;
            } else {
                super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(iM117366d2));
                return;
            }
        }
        int i3 = (int) (((double) iM117366d) / 0.67d);
        if (gra.m131606N3()) {
            super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(Math.min(i3, iM117366d2)));
        } else if (i3 < iM117366d2) {
            super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(Math.min(i3, iM117366d2 - qa00.f156328o)));
        } else {
            super.onMeasure(dox.m117364b(iM117366d), dox.m117364b(iM117366d2 - qa00.f156328o));
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        CoreModule.m30934Q().mo68436Zo().mo136902f(false);
        if (g4a.m128859c() || IntlCountryCodeController.m29125v()) {
            bnl0.m105525M0(this.f24495i, false);
        }
        m40090q(adc0.f70524qa);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        this.f24490d.animate().alpha(this.f24505s).setDuration(this.f24506t).start();
        m40090q(adc0.f70574t9);
    }

    /* JADX INFO: renamed from: p */
    public final void m40104p(View view) {
        vm4.m201727a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public void m40105r(boolean z) {
        pb1.m171472b().mo171473a("PlayerView");
        pb1.m171472b().mo171476e("PlayerView");
        if (NullChecker.m82486a(this.f24495i)) {
            this.f24495i.m224544i(z);
            this.f24495i.animate().cancel();
            this.f24495i.setAlpha(0.0f);
            this.f24495i.setVisibility(4);
        }
        uqb0.f180374G.m98798o(this.f24487a);
        uqb0.f180374G.m98798o(this.f24488b);
        this.f24487a.setVisibility(0);
        m40090q(adc0.f70524qa);
        this.f24490d.animate().cancel();
        this.f24490d.setAlpha(1.0f);
        this.f24495i = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m40106s() {
        CoreModule.m30934Q().mo68436Zo().mo136902f(true);
        Video videoMo225055clone = (Video) this.f24496j;
        if (videoMo225055clone.size == null && TEnum.equals(videoMo225055clone.status, "raw")) {
            videoMo225055clone = videoMo225055clone.mo225055clone();
            wel0 wel0Var = new wel0(new vel0(oki.m168038z(videoMo225055clone.url)), false, false);
            videoMo225055clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
            videoMo225055clone.size = new Dimension(wel0Var.m206021m());
            videoMo225055clone.duration = wel0Var.f188702b;
        }
        m40091t();
        float fM40092u = m40092u(videoMo225055clone);
        final String aspectRatio = videoMo225055clone.formatAspectRatio();
        wcl0.m205822c();
        this.f24497k = System.currentTimeMillis();
        final int i = c7y.f80160a;
        boolean zM205822c = wcl0.m205822c();
        this.f24495i.setIsInABGroup(zM205822c);
        this.f24495i.setOnBufferListener(new C8206c(aspectRatio, i));
        this.f24495i.setNetErrorListener(new y20() { // from class: l.rm4
            @Override // p153l.y20
            public final void call(Object obj) {
                CardPictureViewOpt.m40081f(obj);
            }
        });
        this.f24495i.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.sm4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cbl0.m108642n().m108651u(aspectRatio));
            }
        }).compose(psd0.m173592C()), videoMo225055clone.duration);
        this.f24495i.m224554s(Uri.parse(uqb0.m197266d0(aspectRatio)), fM40092u, aspectRatio, (zM205822c || !videoMo225055clone.url.startsWith("http") || Network.isConnected(CoreModule.f18263b)) ? false : true, R$string.f19605r4, R$string.f19714uk);
        cbl0.m108642n().m108649q(aspectRatio).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.tm4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174886a.m40107w(aspectRatio, i, (Integer) obj);
            }
        }, new y20() { // from class: l.um4
            @Override // p153l.y20
            public final void call(Object obj) {
                CardPictureViewOpt.m40082g((Throwable) obj);
            }
        }));
        m40077J();
    }

    public void setBlurBackground(Drawable drawable) {
    }

    public void setBottomRoundCorner(boolean z) {
        int i = qa00.f156328o;
        if (gra.m131606N3()) {
            this.f24487a.m39224w(i, i, i, i);
            this.f24488b.m39224w(i, i, i, i);
            return;
        }
        CardDraweeViewOpt cardDraweeViewOpt = this.f24487a;
        if (z) {
            cardDraweeViewOpt.m39224w(i, i, i, i);
            this.f24488b.m39224w(i, i, i, i);
        } else {
            cardDraweeViewOpt.m39224w(i, i, 0, 0);
            this.f24488b.m39224w(i, i, 0, 0);
        }
    }

    public void setStyle(LayoutStyle layoutStyle) {
        this.f24494h = layoutStyle;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m40107w(String str, int i, Integer num) {
        c7y.m108345d(this.f24497k, num.intValue(), str, i);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        this.f24495i.setVisibility(0);
        if (this.f24495i.getAlpha() < 1.0f) {
            this.f24495i.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f24490d.animate().alpha(this.f24505s).setDuration(this.f24506t).setInterpolator(new LinearInterpolator()).start();
        m40090q(adc0.f70574t9);
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24494h = LayoutStyle.HOME_CARD;
        this.f24497k = -1L;
        this.f24498l = -1;
        Boolean bool = Boolean.FALSE;
        this.f24499m = C22507a.m222759c(bool);
        this.f24500n = C22507a.m222759c(bool);
        this.f24501o = new y20() { // from class: l.om4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147895a.m40094x((Boolean) obj);
            }
        };
        this.f24502p = new y20() { // from class: l.pm4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153119a.m40095z((Boolean) obj);
            }
        };
        this.f24503q = new C8204a();
        this.f24504r = adc0.f70524qa;
        this.f24505s = 0.2f;
        this.f24506t = 2000;
    }

    public CardPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24494h = LayoutStyle.HOME_CARD;
        this.f24497k = -1L;
        this.f24498l = -1;
        Boolean bool = Boolean.FALSE;
        this.f24499m = C22507a.m222759c(bool);
        this.f24500n = C22507a.m222759c(bool);
        this.f24501o = new y20() { // from class: l.om4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147895a.m40094x((Boolean) obj);
            }
        };
        this.f24502p = new y20() { // from class: l.pm4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153119a.m40095z((Boolean) obj);
            }
        };
        this.f24503q = new C8204a();
        this.f24504r = adc0.f70524qa;
        this.f24505s = 0.2f;
        this.f24506t = 2000;
    }
}
