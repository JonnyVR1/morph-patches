package p149l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.p046p1.mobile.longlink.msg.livePkRank.LongLinkSocketMessage;
import com.tantan.library.svga.compose.SVGADynamicEntity;

/* JADX INFO: loaded from: classes4.dex */
public class jat extends bk2<LongLinkSocketMessage.PkRankUpgrade, j5h0> {
    public jat(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final j5h0 m140706B(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(m140707C(String.format("恭祝%sPK段位赛升级至", pkRankUpgrade.getAnchorName()), pkRankUpgrade.getAnchorName(), "#ffe500"), "text01");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186890d(13.0f));
        textPaint.setColor(Color.parseColor("#ffe500"));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        sVGADynamicEntity.setDynamicText(pkRankUpgrade.getRankName(), textPaint, "text02");
        if (pkRankUpgrade.getStarCount() > 0) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(t100.m186890d(11.0f));
            textPaint2.setColor(Color.parseColor("#ffffff"));
            textPaint2.setTextAlign(align);
            sVGADynamicEntity.setDynamicText(String.valueOf(pkRankUpgrade.getStarCount()), textPaint2, "text03");
        }
        return new j5h0(pkRankUpgrade.getRankSvga(), sVGADynamicEntity);
    }

    /* JADX INFO: renamed from: C */
    public final StaticLayout m140707C(String str, String str2, String str3) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186890d(11.0f));
        textPaint.setColor(Color.parseColor("#ffffff"));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public j5h0 mo94461z(String str, LongLinkSocketMessage.PkRankUpgrade pkRankUpgrade) {
        return m140706B(pkRankUpgrade);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.PkRankUpgrade> mo94398b() {
        return LongLinkSocketMessage.PkRankUpgrade.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.pkRank.upgrade";
    }
}
