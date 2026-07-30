package p153l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.AutoVisibleEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class t880 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f172501a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f172502b;

    /* JADX INFO: renamed from: c */
    public AutoVisibleEffectPlayer f172503c;

    /* JADX INFO: renamed from: d */
    public AutoVisibleEffectPlayer f172504d;

    /* JADX INFO: renamed from: l.t880$a */
    public class C20257a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f172505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f172506b;

        public C20257a(View view, x20 x20Var) {
            this.f172505a = view;
            this.f172506b = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(this.f172505a, false);
            x20 x20Var = this.f172506b;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(this.f172505a, true);
        }
    }

    public t880(AutoVisibleEffectPlayer autoVisibleEffectPlayer, AutoVisibleEffectPlayer autoVisibleEffectPlayer2, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f172503c = autoVisibleEffectPlayer;
        this.f172504d = autoVisibleEffectPlayer2;
        this.f172501a = vDraweeView;
        this.f172502b = vDraweeView2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m189647b(VDraweeView vDraweeView, String str, x20 x20Var) {
        bnl0.m105524M(vDraweeView, true);
        izs.m142868s("context_livingAct", vDraweeView, str);
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public final AnimListener m189648c(View view, x20 x20Var) {
        return new C20257a(view, x20Var);
    }

    /* JADX INFO: renamed from: d */
    public void m189649d(PkData pkData) {
        if (this.f172503c == null) {
            return;
        }
        for (BLivePkOwner bLivePkOwner : pkData.f52415pk.players) {
            VDraweeView vDraweeView = TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId()) ? this.f172502b : this.f172501a;
            String str = bLivePkOwner.rankInfo.rankImage;
            bnl0.m105524M(vDraweeView, true);
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m189650e(sx70 sx70Var, PkData pkData, final x20 x20Var) {
        AutoVisibleEffectPlayer autoVisibleEffectPlayer;
        final VDraweeView vDraweeView;
        String str;
        if (this.f172503c == null) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175859d(10.0f));
        textPaint.setColor(Color.parseColor("#FFF48F"));
        textPaint.setFakeBoldText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        for (BLivePkOwner bLivePkOwner : pkData.f52415pk.players) {
            if (TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId())) {
                autoVisibleEffectPlayer = this.f172504d;
                vDraweeView = this.f172502b;
                str = "https://auto.tancdn.com/v1/raw/cb1473f4-4a7f-49b0-b647-a27c399b0b6812.svga";
            } else {
                autoVisibleEffectPlayer = this.f172503c;
                vDraweeView = this.f172501a;
                str = "https://auto.tancdn.com/v1/raw/bc8d8741-7c1f-440a-b36b-102378b383b113.svga";
            }
            final String str2 = bLivePkOwner.rankInfo.rankImage;
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankInfo.rankName, textPaint, "text01");
            if (!TextUtils.isEmpty(str2) && (str2.toLowerCase().startsWith("http") || str2.toLowerCase().startsWith("https"))) {
                sVGADynamicEntity.setDynamicImage(str2, "badge");
            }
            SVGALoader.with(sx70Var.act()).from(str).autoPlay(true).dynamic(sVGADynamicEntity).repeatCount(1).animListener(m189648c(autoVisibleEffectPlayer, new x20() { // from class: l.s880
                @Override // p153l.x20
                public final void call() {
                    t880.m189647b(vDraweeView, str2, x20Var);
                }
            })).into(autoVisibleEffectPlayer);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m189651f(sx70 sx70Var, final PkData pkData, boolean z, final PkViewInternal pkViewInternal) {
        String str;
        AutoVisibleEffectPlayer autoVisibleEffectPlayer;
        if (this.f172503c == null) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175859d(9.0f));
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(qa00.f156322i);
        textPaint2.setColor(-1);
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        for (BLivePkOwner bLivePkOwner : pkData.f52415pk.players) {
            if (TextUtils.equals(bLivePkOwner.userId, pkData.otherUserId())) {
                str = z ? "https://auto.tancdn.com/v1/raw/1ee67d2a-f2f2-4710-bb3a-088f40587b3113.svga" : "https://auto.tancdn.com/v1/raw/065fef8c-1ea2-4565-9044-1547878f9b8412.svga";
                if (pkData.f52415pk.situation.isTied) {
                    str = "https://auto.tancdn.com/v1/raw/a350d65b-c31e-4d22-bc0a-f90446e2aac613.svga";
                }
                autoVisibleEffectPlayer = this.f172504d;
            } else {
                str = z ? "https://auto.tancdn.com/v1/raw/065fef8c-1ea2-4565-9044-1547878f9b8412.svga" : "https://auto.tancdn.com/v1/raw/1ee67d2a-f2f2-4710-bb3a-088f40587b3113.svga";
                if (pkData.f52415pk.situation.isTied) {
                    str = "https://auto.tancdn.com/v1/raw/66c805a2-b2c6-4be0-82b5-e02e8f7c6dcc13.svga";
                }
                autoVisibleEffectPlayer = this.f172503c;
            }
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankWinTimesDesc, textPaint, "text01");
            sVGADynamicEntity.setDynamicText(bLivePkOwner.rankAmount, textPaint2, "text02");
            SVGALoader.with(sx70Var.act()).from(str).autoPlay(true).dynamic(sVGADynamicEntity).repeatCount(1).animListener(m189648c(autoVisibleEffectPlayer, new x20() { // from class: l.r880
                @Override // p153l.x20
                public final void call() {
                    pkViewInternal.m77283V(pkData);
                }
            })).into(autoVisibleEffectPlayer);
        }
    }

    public t880() {
    }
}
