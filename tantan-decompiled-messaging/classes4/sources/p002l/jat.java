package p002l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.j5h0;
import l.p3g0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jat extends bk2<LongLinkSocketMessage.PkRankUpgrade, j5h0> {
    public jat(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final j5h0 m15785B(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(m15786C(String.format("恭祝%sPK段位赛升级至", pkRankUpgrade.getAnchorName()), pkRankUpgrade.getAnchorName(), "#ffe500"), "text01");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.d(13.0f));
        textPaint.setColor(Color.parseColor("#ffe500"));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        sVGADynamicEntity.setDynamicText(pkRankUpgrade.getRankName(), textPaint, "text02");
        if (pkRankUpgrade.getStarCount() > 0) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(t100.d(11.0f));
            textPaint2.setColor(Color.parseColor("#ffffff"));
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText(String.valueOf(pkRankUpgrade.getStarCount()), textPaint2, "text03");
        }
        return new j5h0(pkRankUpgrade.getRankSvga(), sVGADynamicEntity);
    }

    /* JADX INFO: renamed from: C */
    public final StaticLayout m15786C(String str, String str2, String str3) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.d(11.0f));
        textPaint.setColor(Color.parseColor("#ffffff"));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public j5h0 mo9251z(String str, LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        return m15785B(pkRankUpgrade);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PkRankUpgrade> mo9244b() {
        return LongLinkSocketMessage.PkRankUpgrade.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pkRank.upgrade";
    }
}
