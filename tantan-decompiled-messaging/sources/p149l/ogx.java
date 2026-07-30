package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.data.Medal;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ogx extends ir2 {

    /* JADX INFO: renamed from: a */
    public j6g f143928a;

    /* JADX INFO: renamed from: b */
    public final Gson f143929b = new Gson();

    public ogx(j6g j6gVar) {
        this.f143928a = j6gVar;
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f82200d;
        return liveChatMessage != null ? m164294n(liveChatMessage, bLiveTemplateItem) : vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        ogx ogxVar;
        for (String str : list) {
            if (str.startsWith("fanbaseSplit:#")) {
                String[] strArrSplit = str.split("Split:#");
                ogxVar = this;
                jmf0Var.f118631c = ogxVar.m164299s(jmf0Var.f118629a, strArrSplit[0], jmf0Var.f118630b, (r9g) this.f143929b.fromJson(strArrSplit[1], r9g.class), jmf0Var.f118631c, bLiveTemplateItem.size);
                jmf0Var.f118630b += strArrSplit[0].length();
            } else {
                ogxVar = this;
                if (str.startsWith("familySplit:#")) {
                    ogxVar.m164298r(jmf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("voiceFanBaseSplit:#")) {
                    ogxVar.m164301u(jmf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("royalSplit:#")) {
                    String[] strArrSplit2 = str.split("Split:#");
                    jmf0Var.f118631c = ogxVar.m164292l(jmf0Var.f118629a, strArrSplit2[0], jmf0Var.f118630b, strArrSplit2[1], jmf0Var.f118631c, bLiveTemplateItem.size);
                    jmf0Var.f118630b += strArrSplit2[0].length();
                } else if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                    jmf0Var.f118631c = ogxVar.m164300t(jmf0Var, bLiveTemplateItem, str, jmf0Var.f118631c);
                } else {
                    ogxVar.m137817d(jmf0Var, bLiveTemplateItem, str);
                }
            }
            this = ogxVar;
        }
    }

    @Override // p149l.k4m
    public String getType() {
        return Medal.TYPE;
    }

    /* JADX INFO: renamed from: h */
    public final void m164288h(List<String> list, LongLinkChatMessage.Medal medal) {
        SparseArray<BLiveIntlVoiceMedal> sparseArrayM126025k = ((ggv) ypv.m215673l(fld0.f98148c)).m126025k();
        if (sparseArrayM126025k == null || sparseArrayM126025k.get((int) medal.getFamilyGrade()) == null) {
            return;
        }
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = sparseArrayM126025k.get((int) medal.getFamilyGrade());
        list.add("familySplit:#" + this.f143929b.toJson(nvp.C18786a.m161734n().m161737p(bLiveIntlVoiceMedal.borderColor).m161738q(bLiveIntlVoiceMedal.endColor).m161746y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m161745x(bLiveIntlVoiceMedal.startColor).m161742u(bLiveIntlVoiceMedal.icon).m161747z(medal.getFamilyText()).m161743v(medal.getFamilyLight()).m161740s((int) medal.getFamilyGrade()).m161735m()));
    }

    /* JADX INFO: renamed from: i */
    public final void m164289i(gm0 gm0Var, List<String> list, LongLinkChatMessage.Medal medal) {
        if (!ypv.m215672k().m195706P6() || gm0Var == null || gm0Var.f103418b == null) {
            return;
        }
        list.add("fanbaseSplit:#" + this.f143929b.toJson(r9g.m178369a().m178371b(gm0Var.f103418b.color).m178372c((int) medal.getFanbaseGrade()).m178375f(gm0Var.f103417a).m178373d(gm0Var.f103418b.icon).m178374e(gm0Var.f103418b.text).m178370a()));
    }

    /* JADX INFO: renamed from: j */
    public final void m164290j(List<String> list, LongLinkChatMessage.Medal medal) {
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM126028n = ((ggv) ypv.m215673l(fld0.f98148c)).m126028n((int) medal.getVoiceFanbaseGrade());
        if (bLiveIntlVoiceMedalM126028n == null) {
            return;
        }
        list.add("voiceFanBaseSplit:#" + this.f143929b.toJson(nvp.C18786a.m161734n().m161746y("voiceFanBase").m161740s((int) medal.getVoiceFanbaseGrade()).m161747z(medal.getVoiceFanbaseText()).m161744w(medal.getVoiceFanbaseColor()).m161742u(bLiveIntlVoiceMedalM126028n.icon).m161745x(bLiveIntlVoiceMedalM126028n.startColor).m161738q(bLiveIntlVoiceMedalM126028n.endColor).m161737p(bLiveIntlVoiceMedalM126028n.borderStartColor).m161736o(bLiveIntlVoiceMedalM126028n.borderEndColor).m161741t(t100.m186890d(20.0f)).m161735m()));
    }

    /* JADX INFO: renamed from: k */
    public final Object m164291k(SpannableStringBuilder spannableStringBuilder, String str, int i, nvp nvpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        f4g f4gVar = new f4g(ypv.f199497e, nvpVar, i2);
        if (obj != null) {
            f4gVar.m163418g(4);
        }
        spannableStringBuilder.setSpan(f4gVar, i, str.length() + i, 33);
        return f4gVar;
    }

    /* JADX INFO: renamed from: l */
    public final Object m164292l(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        ofd0 ofd0Var = new ofd0(ypv.f199497e, str2, i2);
        if (obj != null) {
            ofd0Var.m163418g(4);
        }
        spannableStringBuilder.setSpan(ofd0Var, i, str.length() + i, 33);
        return ofd0Var;
    }

    /* JADX INFO: renamed from: m */
    public final Object m164293m(SpannableStringBuilder spannableStringBuilder, String str, int i, nvp nvpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        x4n0 x4n0Var = new x4n0(ypv.f199497e, nvpVar, i2);
        if (obj != null) {
            x4n0Var.m163418g(4);
        }
        spannableStringBuilder.setSpan(x4n0Var, i, str.length() + i, 33);
        return x4n0Var;
    }

    /* JADX INFO: renamed from: n */
    public final List<String> m164294n(LongLinkChatMessage.LiveChatMessage liveChatMessage, final BLiveTemplateItem bLiveTemplateItem) {
        final LongLinkChatMessage.MedalMessage medal = liveChatMessage.getMedal();
        if (medal == null) {
            return vwb.m200324f0(new String[0]);
        }
        final gm0 gm0VarM140001A = this.f143928a.m140001A();
        List listM110720e = dck0.m110720e(medal.getSingleRoomMedalsList(), medal.getMultiRoomMedalsList());
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(listM110720e, new e30() { // from class: l.ngx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138917a.m164297q(arrayList, medal, gm0VarM140001A, bLiveTemplateItem, (LongLinkChatMessage.Medal) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m164295o(LongLinkChatMessage.Medal medal) {
        return (medal.getFamilyGrade() == 0 || TextUtils.isEmpty(medal.getFamilyText())) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m164296p(LongLinkChatMessage.Medal medal) {
        return (medal.getVoiceFanbaseGrade() == 0 || TextUtils.isEmpty(medal.getVoiceFanbaseText())) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m164297q(List list, LongLinkChatMessage.MedalMessage medalMessage, gm0 gm0Var, BLiveTemplateItem bLiveTemplateItem, LongLinkChatMessage.Medal medal) {
        if (m164295o(medal)) {
            m164288h(list, medal);
            return;
        }
        if (m164296p(medal)) {
            m164290j(list, medal);
            return;
        }
        BLiveMedal bLiveMedalM126034t = ((ggv) ypv.m215673l(fld0.f98148c)).m126034t(medal.getId(), "live", medalMessage.getVersion());
        if (bLiveMedalM126034t != null) {
            if (bLiveMedalM126034t.isFanbaseMedal()) {
                m164289i(gm0Var, list, medal);
                return;
            }
            if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                list.add(bLiveMedalM126034t.url + "voiceMedal" + bLiveMedalM126034t.jumpUrl);
                return;
            }
            if (TextUtils.isEmpty(bLiveMedalM126034t.dynamicUrl) || !bLiveMedalM126034t.dynamicUrl.endsWith("webp")) {
                list.add(bLiveMedalM126034t.url);
                return;
            }
            list.add("royalSplit:#" + bLiveMedalM126034t.dynamicUrl);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m164298r(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        jmf0Var.f118631c = m164291k(jmf0Var.f118629a, strArrSplit[0], jmf0Var.f118630b, (nvp) this.f143929b.fromJson(strArrSplit[1], nvp.class), jmf0Var.f118631c, bLiveTemplateItem.size);
        jmf0Var.f118630b += strArrSplit[0].length();
    }

    /* JADX INFO: renamed from: s */
    public final Object m164299s(SpannableStringBuilder spannableStringBuilder, String str, int i, r9g r9gVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        l4g l4gVar = new l4g(ypv.f199497e, r9gVar, i2);
        if (obj != null) {
            l4gVar.m163418g(4);
        }
        spannableStringBuilder.setSpan(l4gVar, i, str.length() + i, 33);
        return l4gVar;
    }

    /* JADX INFO: renamed from: t */
    public final Object m164300t(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        String[] strArrSplit = str.split("voiceMedal");
        if (strArrSplit.length <= 0) {
            return null;
        }
        jmf0Var.f118629a.append((CharSequence) strArrSplit[0]);
        z920 z920Var = new z920(ypv.f199497e, strArrSplit[0], bLiveTemplateItem.size);
        if (obj != null) {
            z920Var.m163418g(4);
        }
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, null);
        if (strArrSplit.length > 1) {
            z2sVar.m216991g(strArrSplit[1]);
        }
        try {
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
            int i = jmf0Var.f118630b;
            spannableStringBuilder.setSpan(z2sVar, i, strArrSplit[0].length() + i, 33);
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f118629a;
            int i2 = jmf0Var.f118630b;
            spannableStringBuilder2.setSpan(z920Var, i2, strArrSplit[0].length() + i2, 33);
            jmf0Var.f118630b += strArrSplit[0].length();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            String str2 = strArrSplit[0];
        }
        return z920Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m164301u(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        jmf0Var.f118631c = m164293m(jmf0Var.f118629a, strArrSplit[0], jmf0Var.f118630b, (nvp) this.f143929b.fromJson(strArrSplit[1], nvp.class), jmf0Var.f118631c, bLiveTemplateItem.size);
        jmf0Var.f118630b += strArrSplit[0].length();
    }
}
