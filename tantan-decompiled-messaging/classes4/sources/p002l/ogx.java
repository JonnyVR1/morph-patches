package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p1.mobile.putong.live.base.data.BLiveMedal;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.fld0;
import l.ggv;
import l.t100;
import l.vwb;
import l.ypv;
import l.z920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ogx extends ir2 {

    /* JADX INFO: renamed from: a */
    public j6g f16595a;

    /* JADX INFO: renamed from: b */
    public final Gson f16596b = new Gson();

    public ogx(j6g j6gVar) {
        this.f16595a = j6gVar;
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = crc0Var.f8914d;
        return liveChatMessage != null ? m19501n(liveChatMessage, bLiveTemplateItem) : vwb.f0(new String[0]);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        ogx ogxVar;
        for (String str : list) {
            if (str.startsWith("fanbaseSplit:#")) {
                String[] strArrSplit = str.split("Split:#");
                ogxVar = this;
                jmf0Var.f13874c = ogxVar.m19506s(jmf0Var.f13872a, strArrSplit[0], jmf0Var.f13873b, (r9g) this.f16596b.fromJson(strArrSplit[1], r9g.class), jmf0Var.f13874c, bLiveTemplateItem.size);
                jmf0Var.f13873b += strArrSplit[0].length();
            } else {
                ogxVar = this;
                if (str.startsWith("familySplit:#")) {
                    ogxVar.m19505r(jmf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("voiceFanBaseSplit:#")) {
                    ogxVar.m19508u(jmf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("royalSplit:#")) {
                    String[] strArrSplit2 = str.split("Split:#");
                    jmf0Var.f13874c = ogxVar.m19499l(jmf0Var.f13872a, strArrSplit2[0], jmf0Var.f13873b, strArrSplit2[1], jmf0Var.f13874c, bLiveTemplateItem.size);
                    jmf0Var.f13873b += strArrSplit2[0].length();
                } else if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                    jmf0Var.f13874c = ogxVar.m19507t(jmf0Var, bLiveTemplateItem, str, jmf0Var.f13874c);
                } else {
                    ogxVar.m15310d(jmf0Var, bLiveTemplateItem, str);
                }
            }
            this = ogxVar;
        }
    }

    @Override // p002l.k4m
    public String getType() {
        return "medal";
    }

    /* JADX INFO: renamed from: h */
    public final void m19495h(List<String> list, LongLinkChatMessage.Medal medal) {
        SparseArray sparseArrayK = ((ggv) ypv.l(fld0.c)).k();
        if (sparseArrayK == null || sparseArrayK.get((int) medal.getFamilyGrade()) == null) {
            return;
        }
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = (BLiveIntlVoiceMedal) sparseArrayK.get((int) medal.getFamilyGrade());
        list.add("familySplit:#" + this.f16596b.toJson(nvp.C0710a.m19133n().m19136p(bLiveIntlVoiceMedal.borderColor).m19137q(bLiveIntlVoiceMedal.endColor).m19145y("family").m19144x(bLiveIntlVoiceMedal.startColor).m19141u(bLiveIntlVoiceMedal.icon).m19146z(medal.getFamilyText()).m19142v(medal.getFamilyLight()).m19139s((int) medal.getFamilyGrade()).m19134m()));
    }

    /* JADX INFO: renamed from: i */
    public final void m19496i(gm0 gm0Var, List<String> list, LongLinkChatMessage.Medal medal) {
        if (!ypv.k().P6() || gm0Var == null || gm0Var.f11510b == null) {
            return;
        }
        list.add("fanbaseSplit:#" + this.f16596b.toJson(r9g.m21861a().m21863b(gm0Var.f11510b.color).m21864c((int) medal.getFanbaseGrade()).m21867f(gm0Var.f11509a).m21865d(gm0Var.f11510b.icon).m21866e(gm0Var.f11510b.text).m21862a()));
    }

    /* JADX INFO: renamed from: j */
    public final void m19497j(List<String> list, LongLinkChatMessage.Medal medal) {
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalN = ((ggv) ypv.l(fld0.c)).n((int) medal.getVoiceFanbaseGrade());
        if (bLiveIntlVoiceMedalN == null) {
            return;
        }
        list.add("voiceFanBaseSplit:#" + this.f16596b.toJson(nvp.C0710a.m19133n().m19145y("voiceFanBase").m19139s((int) medal.getVoiceFanbaseGrade()).m19146z(medal.getVoiceFanbaseText()).m19143w(medal.getVoiceFanbaseColor()).m19141u(bLiveIntlVoiceMedalN.icon).m19144x(bLiveIntlVoiceMedalN.startColor).m19137q(bLiveIntlVoiceMedalN.endColor).m19136p(bLiveIntlVoiceMedalN.borderStartColor).m19135o(bLiveIntlVoiceMedalN.borderEndColor).m19140t(t100.d(20.0f)).m19134m()));
    }

    /* JADX INFO: renamed from: k */
    public final Object m19498k(SpannableStringBuilder spannableStringBuilder, String str, int i, nvp nvpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        f4g f4gVar = new f4g(ypv.e, nvpVar, i2);
        if (obj != null) {
            f4gVar.g(4);
        }
        spannableStringBuilder.setSpan(f4gVar, i, str.length() + i, 33);
        return f4gVar;
    }

    /* JADX INFO: renamed from: l */
    public final Object m19499l(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        ofd0 ofd0Var = new ofd0(ypv.e, str2, i2);
        if (obj != null) {
            ofd0Var.g(4);
        }
        spannableStringBuilder.setSpan(ofd0Var, i, str.length() + i, 33);
        return ofd0Var;
    }

    /* JADX INFO: renamed from: m */
    public final Object m19500m(SpannableStringBuilder spannableStringBuilder, String str, int i, nvp nvpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        x4n0 x4n0Var = new x4n0(ypv.e, nvpVar, i2);
        if (obj != null) {
            x4n0Var.g(4);
        }
        spannableStringBuilder.setSpan(x4n0Var, i, str.length() + i, 33);
        return x4n0Var;
    }

    /* JADX INFO: renamed from: n */
    public final List<String> m19501n(LongLinkChatMessage.LiveChatMessage liveChatMessage, final BLiveTemplateItem bLiveTemplateItem) {
        final LongLinkChatMessage.MedalMessage medal = liveChatMessage.getMedal();
        if (medal == null) {
            return vwb.f0(new String[0]);
        }
        final gm0 gm0VarM15692A = this.f16595a.m15692A();
        List listM11737e = dck0.m11737e(medal.getSingleRoomMedalsList(), medal.getMultiRoomMedalsList());
        final ArrayList arrayList = new ArrayList();
        vwb.z(listM11737e, new e30() { // from class: l.ngx
            public final void call(Object obj) {
                this.f16026a.m19504q(arrayList, medal, gm0VarM15692A, bLiveTemplateItem, (LongLinkChatMessage.Medal) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m19502o(LongLinkChatMessage.Medal medal) {
        return (medal.getFamilyGrade() == 0 || TextUtils.isEmpty(medal.getFamilyText())) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19503p(LongLinkChatMessage.Medal medal) {
        return (medal.getVoiceFanbaseGrade() == 0 || TextUtils.isEmpty(medal.getVoiceFanbaseText())) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m19504q(List list, LongLinkChatMessage.MedalMessage medalMessage, gm0 gm0Var, BLiveTemplateItem bLiveTemplateItem, LongLinkChatMessage.Medal medal) {
        if (m19502o(medal)) {
            m19495h(list, medal);
            return;
        }
        if (m19503p(medal)) {
            m19497j(list, medal);
            return;
        }
        BLiveMedal bLiveMedalT = ((ggv) ypv.l(fld0.c)).t(medal.getId(), "live", medalMessage.getVersion());
        if (bLiveMedalT != null) {
            if (bLiveMedalT.isFanbaseMedal()) {
                m19496i(gm0Var, list, medal);
                return;
            }
            if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                list.add(bLiveMedalT.url + "voiceMedal" + bLiveMedalT.jumpUrl);
                return;
            }
            if (TextUtils.isEmpty(bLiveMedalT.dynamicUrl) || !bLiveMedalT.dynamicUrl.endsWith("webp")) {
                list.add(bLiveMedalT.url);
                return;
            }
            list.add("royalSplit:#" + bLiveMedalT.dynamicUrl);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m19505r(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        jmf0Var.f13874c = m19498k(jmf0Var.f13872a, strArrSplit[0], jmf0Var.f13873b, (nvp) this.f16596b.fromJson(strArrSplit[1], nvp.class), jmf0Var.f13874c, bLiveTemplateItem.size);
        jmf0Var.f13873b += strArrSplit[0].length();
    }

    /* JADX INFO: renamed from: s */
    public final Object m19506s(SpannableStringBuilder spannableStringBuilder, String str, int i, r9g r9gVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        l4g l4gVar = new l4g(ypv.e, r9gVar, i2);
        if (obj != null) {
            l4gVar.g(4);
        }
        spannableStringBuilder.setSpan(l4gVar, i, str.length() + i, 33);
        return l4gVar;
    }

    /* JADX INFO: renamed from: t */
    public final Object m19507t(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        String[] strArrSplit = str.split("voiceMedal");
        if (strArrSplit.length <= 0) {
            return null;
        }
        jmf0Var.f13872a.append((CharSequence) strArrSplit[0]);
        z920 z920Var = new z920(ypv.e, strArrSplit[0], bLiveTemplateItem.size);
        if (obj != null) {
            z920Var.g(4);
        }
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, null);
        if (strArrSplit.length > 1) {
            z2sVar.m27049g(strArrSplit[1]);
        }
        try {
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
            int i = jmf0Var.f13873b;
            spannableStringBuilder.setSpan(z2sVar, i, strArrSplit[0].length() + i, 33);
            SpannableStringBuilder spannableStringBuilder2 = jmf0Var.f13872a;
            int i2 = jmf0Var.f13873b;
            spannableStringBuilder2.setSpan(z920Var, i2, strArrSplit[0].length() + i2, 33);
            jmf0Var.f13873b += strArrSplit[0].length();
        } catch (Exception e) {
            CrashHelper.c(e);
            String str2 = strArrSplit[0];
        }
        return z920Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m19508u(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        jmf0Var.f13874c = m19500m(jmf0Var.f13872a, strArrSplit[0], jmf0Var.f13873b, (nvp) this.f16596b.fromJson(strArrSplit[1], nvp.class), jmf0Var.f13874c, bLiveTemplateItem.size);
        jmf0Var.f13873b += strArrSplit[0].length();
    }
}
