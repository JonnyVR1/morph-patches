package p153l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.p051p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class kct extends jk2<LongLinkSocketMessage.PkRankUpgrade, rdh0> {
    public kct(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public final rdh0 m149129B(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(m149130C(String.format("恭祝%sPK段位赛升级至", pkRankUpgrade.getAnchorName()), pkRankUpgrade.getAnchorName(), "#ffe500"), "text01");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175859d(13.0f));
        textPaint.setColor(Color.parseColor("#ffe500"));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        sVGADynamicEntity.setDynamicText(pkRankUpgrade.getRankName(), textPaint, "text02");
        if (pkRankUpgrade.getStarCount() > 0) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(qa00.m175859d(11.0f));
            textPaint2.setColor(Color.parseColor("#ffffff"));
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText(String.valueOf(pkRankUpgrade.getStarCount()), textPaint2, "text03");
        }
        return new rdh0(pkRankUpgrade.getRankSvga(), sVGADynamicEntity);
    }

    /* JADX INFO: renamed from: C */
    public final StaticLayout m149130C(String str, String str2, String str3) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175859d(11.0f));
        textPaint.setColor(Color.parseColor("#ffffff"));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public rdh0 mo95993z(String str, LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        return m149129B(pkRankUpgrade);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PkRankUpgrade> mo95510b() {
        return LongLinkSocketMessage.PkRankUpgrade.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pkRank.upgrade";
    }
}
