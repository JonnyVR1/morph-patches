package p149l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.AutoVisibleEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class n080 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f136479a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f136480b;

    /* JADX INFO: renamed from: c */
    public AutoVisibleEffectPlayer f136481c;

    /* JADX INFO: renamed from: d */
    public AutoVisibleEffectPlayer f136482d;

    /* JADX INFO: renamed from: l.n080$a */
    public class C18599a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f136483a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f136484b;

        public C18599a(View view, d30 d30Var) {
            this.f136483a = view;
            this.f136484b = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(this.f136483a, false);
            d30 d30Var = this.f136484b;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(this.f136483a, true);
        }
    }

    public n080(AutoVisibleEffectPlayer autoVisibleEffectPlayer, AutoVisibleEffectPlayer autoVisibleEffectPlayer2, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f136481c = autoVisibleEffectPlayer;
        this.f136482d = autoVisibleEffectPlayer2;
        this.f136479a = vDraweeView;
        this.f136480b = vDraweeView2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m157252b(VDraweeView vDraweeView, String str, d30 d30Var) {
        xdl0.m208344M(vDraweeView, true);
        hxs.m133406s("context_livingAct", vDraweeView, str);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public final AnimListener m157253c(View view, d30 d30Var) {
        return new C18599a(view, d30Var);
    }

    /* JADX INFO: renamed from: d */
    public void m157254d(PkData pkData) {
        if (this.f136481c == null) {
            return;
        }
        for (BLivePkOwner bLivePkOwner : pkData.f51567pk.players) {
            VDraweeView vDraweeView = TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId()) ? this.f136480b : this.f136479a;
            String str = bLivePkOwner.rankInfo.rankImage;
            xdl0.m208344M(vDraweeView, true);
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m157255e(mp70 mp70Var, PkData pkData, final d30 d30Var) {
        AutoVisibleEffectPlayer autoVisibleEffectPlayer;
        final VDraweeView vDraweeView;
        String str;
        if (this.f136481c == null) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186890d(10.0f));
        textPaint.setColor(Color.parseColor("#FFF48F"));
        textPaint.setFakeBoldText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        for (BLivePkOwner bLivePkOwner : pkData.f51567pk.players) {
            if (TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId())) {
                autoVisibleEffectPlayer = this.f136482d;
                vDraweeView = this.f136480b;
                str = "https://auto.tancdn.com/v1/raw/cb1473f4-4a7f-49b0-b647-a27c399b0b6812.svga";
            } else {
                autoVisibleEffectPlayer = this.f136481c;
                vDraweeView = this.f136479a;
                str = "https://auto.tancdn.com/v1/raw/bc8d8741-7c1f-440a-b36b-102378b383b113.svga";
            }
            final String str2 = bLivePkOwner.rankInfo.rankImage;
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankInfo.rankName, textPaint, "text01");
            if (!TextUtils.isEmpty(str2) && (str2.toLowerCase().startsWith("http") || str2.toLowerCase().startsWith("https"))) {
                sVGADynamicEntity.setDynamicImage(str2, "badge");
            }
            SVGALoader.with(mp70Var.act()).from(str).autoPlay(true).dynamic(sVGADynamicEntity).repeatCount(1).animListener(m157253c(autoVisibleEffectPlayer, new d30() { // from class: l.m080
                @Override // p149l.d30
                public final void call() {
                    n080.m157252b(vDraweeView, str2, d30Var);
                }
            })).into(autoVisibleEffectPlayer);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m157256f(mp70 mp70Var, final PkData pkData, boolean z, final PkViewInternal pkViewInternal) {
        String str;
        AutoVisibleEffectPlayer autoVisibleEffectPlayer;
        if (this.f136481c == null) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186890d(9.0f));
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(t100.f167260i);
        textPaint2.setColor(-1);
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        for (BLivePkOwner bLivePkOwner : pkData.f51567pk.players) {
            if (TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId())) {
                str = z ? "https://auto.tancdn.com/v1/raw/1ee67d2a-f2f2-4710-bb3a-088f40587b3113.svga" : "https://auto.tancdn.com/v1/raw/065fef8c-1ea2-4565-9044-1547878f9b8412.svga";
                if (pkData.f51567pk.situation.isTied) {
                    str = "https://auto.tancdn.com/v1/raw/a350d65b-c31e-4d22-bc0a-f90446e2aac613.svga";
                }
                autoVisibleEffectPlayer = this.f136482d;
            } else {
                str = z ? "https://auto.tancdn.com/v1/raw/065fef8c-1ea2-4565-9044-1547878f9b8412.svga" : "https://auto.tancdn.com/v1/raw/1ee67d2a-f2f2-4710-bb3a-088f40587b3113.svga";
                if (pkData.f51567pk.situation.isTied) {
                    str = "https://auto.tancdn.com/v1/raw/66c805a2-b2c6-4be0-82b5-e02e8f7c6dcc13.svga";
                }
                autoVisibleEffectPlayer = this.f136481c;
            }
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankWinTimesDesc, textPaint, "text01");
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankAmount, textPaint2, "text02");
            SVGALoader.with(mp70Var.act()).from(str).autoPlay(true).dynamic(sVGADynamicEntity).repeatCount(1).animListener(m157253c(autoVisibleEffectPlayer, new d30() { // from class: l.l080
                @Override // p149l.d30
                public final void call() {
                    pkViewInternal.m76100V(pkData);
                }
            })).into(autoVisibleEffectPlayer);
        }
    }

    public n080() {
    }
}
