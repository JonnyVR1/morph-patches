package p153l;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class ycv extends jk2<LongLinkVirtualVoice.VoiceLiveSVGAAnimation, rdh0> {
    public ycv(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m215176B(SVGADynamicEntity sVGADynamicEntity, LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
        String value = voiceLiveSGVAAnimationExtra.getValue();
        if (voiceLiveSGVAAnimationExtra.getType() == 1) {
            sVGADynamicEntity.setDynamicImage(value, voiceLiveSGVAAnimationExtra.getKey());
            return;
        }
        if (voiceLiveSGVAAnimationExtra.getType() == 2) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(qa00.m175859d(voiceLiveSGVAAnimationExtra.getTextSize()));
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(n3d0.m161283g(voiceLiveSGVAAnimationExtra.getTextColor()));
            if (voiceLiveSGVAAnimationExtra.getTextFont() == 3) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            } else if (voiceLiveSGVAAnimationExtra.getTextFont() == 1) {
                textPaint.setTypeface(Typeface.defaultFromStyle(0));
            }
            sVGADynamicEntity.setDynamicText(value, textPaint, voiceLiveSGVAAnimationExtra.getKey());
        }
    }

    /* JADX INFO: renamed from: C */
    public final rdh0 m215177C(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        final SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        jyb.m147537z(voiceLiveSVGAAnimation.getAnimationExtrasList(), new y20() { // from class: l.xcv
            @Override // p153l.y20
            public final void call(Object obj) {
                ycv.m215176B(sVGADynamicEntity, (LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra) obj);
            }
        });
        return new rdh0(voiceLiveSVGAAnimation.getSvgaUrl(), sVGADynamicEntity);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public rdh0 mo95993z(String str, LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        return m215177C(voiceLiveSVGAAnimation);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceLiveSVGAAnimation> mo95510b() {
        return LongLinkVirtualVoice.VoiceLiveSVGAAnimation.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.svga.animation";
    }
}
