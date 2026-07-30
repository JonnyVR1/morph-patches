package p002l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveVoiceActiveGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/uj10;", "Ll/ir2;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/live/base/data/BLiveTemplateItem;", "liveTemplateItem", "Lcom/p1/mobile/longlink/msg/template/Template$TemplateData;", "templateData", "Ll/crc0;", "param", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveTemplateItem;Lcom/p1/mobile/longlink/msg/template/Template$TemplateData;Ll/crc0;)Ljava/util/List;", "Ll/jmf0;", "spanInfo", "", "text", "", "f", "(Ll/jmf0;Lcom/p1/mobile/putong/live/base/data/BLiveTemplateItem;Ljava/util/List;Ll/crc0;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class uj10 extends ir2 {
    @Override // p002l.ir2
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(@Nullable BLiveTemplateItem liveTemplateItem, @Nullable Template.TemplateData templateData, @NotNull crc0 param) {
        param.getClass();
        ArrayList arrayList = new ArrayList();
        List<LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem> list = param.f8918h;
        if (list != null) {
            for (LongLinkLiveVoiceActiveGiftMessage.VoiceGiftItem voiceGiftItem : list) {
                String url = voiceGiftItem.getUrl();
                url.getClass();
                arrayList.add(url);
                arrayList.add(voiceGiftItem.getName() + "*" + voiceGiftItem.getCount());
            }
        }
        return arrayList;
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(@NotNull jmf0 spanInfo, @NotNull BLiveTemplateItem liveTemplateItem, @NotNull List<String> text, @Nullable crc0 param) {
        ForegroundColorSpan foregroundColorSpan;
        spanInfo.getClass();
        liveTemplateItem.getClass();
        text.getClass();
        int i = 0;
        for (String str : text) {
            int i2 = i + 1;
            if (i % 2 == 0) {
                m15310d(spanInfo, liveTemplateItem, str);
            } else {
                spanInfo.f13872a.append((CharSequence) str);
                String str2 = liveTemplateItem.color;
                if (str2 == null || str2.length() == 0) {
                    foregroundColorSpan = new ForegroundColorSpan(-1);
                } else {
                    String str3 = liveTemplateItem.color;
                    str3.getClass();
                    foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(d.F(str3, "x", "#", false, 4, (Object) null)));
                }
                SpannableStringBuilder spannableStringBuilder = spanInfo.f13872a;
                int i3 = spanInfo.f13873b;
                spannableStringBuilder.setSpan(foregroundColorSpan, i3, str.length() + i3, 33);
                spanInfo.f13873b += str.length();
            }
            i = i2;
        }
        spanInfo.f13874c = uz00.f20887b;
    }

    @Override // p002l.k4m
    @NotNull
    public String getType() {
        return "multiGift";
    }
}
