package p149l;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class xav extends bk2<LongLinkVirtualVoice.VoiceLiveSVGAAnimation, j5h0> {
    public xav(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m207679B(SVGADynamicEntity sVGADynamicEntity, LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra voiceLiveSGVAAnimationExtra) {
        String value = voiceLiveSGVAAnimationExtra.getValue();
        if (voiceLiveSGVAAnimationExtra.getType() == 1) {
            sVGADynamicEntity.setDynamicImage(value, voiceLiveSGVAAnimationExtra.getKey());
            return;
        }
        if (voiceLiveSGVAAnimationExtra.getType() == 2) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(t100.m186890d(voiceLiveSGVAAnimationExtra.getTextSize()));
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(kvc0.m147358g(voiceLiveSGVAAnimationExtra.getTextColor()));
            if (voiceLiveSGVAAnimationExtra.getTextFont() == 3) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            } else if (voiceLiveSGVAAnimationExtra.getTextFont() == 1) {
                textPaint.setTypeface(Typeface.defaultFromStyle(0));
            }
            sVGADynamicEntity.setDynamicText(value, textPaint, voiceLiveSGVAAnimationExtra.getKey());
        }
    }

    /* JADX INFO: renamed from: C */
    public final j5h0 m207680C(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        final SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        vwb.m200354z(voiceLiveSVGAAnimation.getAnimationExtrasList(), new e30() { // from class: l.wav
            @Override // p149l.e30
            public final void call(Object obj) {
                xav.m207679B(sVGADynamicEntity, (LongLinkVirtualVoice.VoiceLiveSGVAAnimationExtra) obj);
            }
        });
        return new j5h0(voiceLiveSVGAAnimation.getSvgaUrl(), sVGADynamicEntity);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public j5h0 mo94461z(String str, LongLinkVirtualVoice.VoiceLiveSVGAAnimation voiceLiveSVGAAnimation) {
        return m207680C(voiceLiveSVGAAnimation);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceLiveSVGAAnimation> mo94398b() {
        return LongLinkVirtualVoice.VoiceLiveSVGAAnimation.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.svga.animation";
    }
}
