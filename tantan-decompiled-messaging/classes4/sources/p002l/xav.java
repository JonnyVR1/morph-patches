package p002l;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.e30;
import l.j5h0;
import l.kvc0;
import l.p3g0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xav extends bk2<LongLinkVirtualVoice.VoiceLiveSVGAAnimation, j5h0> {
    public xav(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m25819B(SVGADynamicEntity sVGADynamicEntity, LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
        String value = voiceLiveSGVAAnimationExtra.getValue();
        if (voiceLiveSGVAAnimationExtra.getType() == 1) {
            sVGADynamicEntity.setDynamicImage(value, voiceLiveSGVAAnimationExtra.getKey());
            return;
        }
        if (voiceLiveSGVAAnimationExtra.getType() == 2) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(t100.d(voiceLiveSGVAAnimationExtra.getTextSize()));
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(kvc0.g(voiceLiveSGVAAnimationExtra.getTextColor()));
            if (voiceLiveSGVAAnimationExtra.getTextFont() == 3) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            } else if (voiceLiveSGVAAnimationExtra.getTextFont() == 1) {
                textPaint.setTypeface(Typeface.defaultFromStyle(0));
            }
            sVGADynamicEntity.setDynamicText(value, textPaint, voiceLiveSGVAAnimationExtra.getKey());
        }
    }

    /* JADX INFO: renamed from: C */
    public final j5h0 m25820C(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        final SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        vwb.z(voiceLiveSVGAAnimation.getAnimationExtrasList(), new e30() { // from class: l.wav
            public final void call(Object obj) {
                xav.m25819B(sVGADynamicEntity, (LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra) obj);
            }
        });
        return new j5h0(voiceLiveSVGAAnimation.getSvgaUrl(), sVGADynamicEntity);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public j5h0 mo9251z(String str, LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        return m25820C(voiceLiveSVGAAnimation);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceLiveSVGAAnimation> mo9244b() {
        return LongLinkVirtualVoice.VoiceLiveSVGAAnimation.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.svga.animation";
    }
}
