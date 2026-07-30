package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.data.Medal;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mpx extends yr2 {

    /* JADX INFO: renamed from: a */
    public x7g f137972a;

    /* JADX INFO: renamed from: b */
    public final Gson f137973b = new Gson();

    public mpx(x7g x7gVar) {
        this.f137972a = x7gVar;
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        LongLinkChatMessage.LiveChatMessage liveChatMessage = hzc0Var.f112224d;
        return liveChatMessage != null ? m159436n(liveChatMessage, bLiveTemplateItem) : jyb.m147507f0(new String[0]);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        mpx mpxVar;
        for (String str : list) {
            if (str.startsWith("fanbaseSplit:#")) {
                String[] strArrSplit = str.split("Split:#");
                mpxVar = this;
                suf0Var.f170683c = mpxVar.m159441s(suf0Var.f170681a, strArrSplit[0], suf0Var.f170682b, (fbg) this.f137973b.fromJson(strArrSplit[1], fbg.class), suf0Var.f170683c, bLiveTemplateItem.size);
                suf0Var.f170682b += strArrSplit[0].length();
            } else {
                mpxVar = this;
                if (str.startsWith("familySplit:#")) {
                    mpxVar.m159440r(suf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("voiceFanBaseSplit:#")) {
                    mpxVar.m159443u(suf0Var, bLiveTemplateItem, str);
                } else if (str.startsWith("royalSplit:#")) {
                    String[] strArrSplit2 = str.split("Split:#");
                    suf0Var.f170683c = mpxVar.m159434l(suf0Var.f170681a, strArrSplit2[0], suf0Var.f170682b, strArrSplit2[1], suf0Var.f170683c, bLiveTemplateItem.size);
                    suf0Var.f170682b += strArrSplit2[0].length();
                } else if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                    suf0Var.f170683c = mpxVar.m159442t(suf0Var, bLiveTemplateItem, str, suf0Var.f170683c);
                } else {
                    mpxVar.m217146d(suf0Var, bLiveTemplateItem, str);
                }
            }
            this = mpxVar;
        }
    }

    @Override // p153l.b7m
    public String getType() {
        return Medal.TYPE;
    }

    /* JADX INFO: renamed from: h */
    public final void m159430h(List<String> list, LongLinkChatMessage.Medal medal) {
        SparseArray<BLiveIntlVoiceMedal> sparseArrayM135159k = ((hiv) zrv.m221194l(htd0.f111521c)).m135159k();
        if (sparseArrayM135159k == null || sparseArrayM135159k.get((int) medal.getFamilyGrade()) == null) {
            return;
        }
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = sparseArrayM135159k.get((int) medal.getFamilyGrade());
        list.add("familySplit:#" + this.f137973b.toJson(nxp.C18985a.m165234n().m165237p(bLiveIntlVoiceMedal.borderColor).m165238q(bLiveIntlVoiceMedal.endColor).m165246y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m165245x(bLiveIntlVoiceMedal.startColor).m165242u(bLiveIntlVoiceMedal.icon).m165247z(medal.getFamilyText()).m165243v(medal.getFamilyLight()).m165240s((int) medal.getFamilyGrade()).m165235m()));
    }

    /* JADX INFO: renamed from: i */
    public final void m159431i(cm0 cm0Var, List<String> list, LongLinkChatMessage.Medal medal) {
        if (!zrv.m221193k().m203493P6() || cm0Var == null || cm0Var.f82502b == null) {
            return;
        }
        list.add("fanbaseSplit:#" + this.f137973b.toJson(fbg.m124890a().m124892b(cm0Var.f82502b.color).m124893c((int) medal.getFanbaseGrade()).m124896f(cm0Var.f82501a).m124894d(cm0Var.f82502b.icon).m124895e(cm0Var.f82502b.text).m124891a()));
    }

    /* JADX INFO: renamed from: j */
    public final void m159432j(List<String> list, LongLinkChatMessage.Medal medal) {
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM135162n = ((hiv) zrv.m221194l(htd0.f111521c)).m135162n((int) medal.getVoiceFanbaseGrade());
        if (bLiveIntlVoiceMedalM135162n == null) {
            return;
        }
        list.add("voiceFanBaseSplit:#" + this.f137973b.toJson(nxp.C18985a.m165234n().m165246y("voiceFanBase").m165240s((int) medal.getVoiceFanbaseGrade()).m165247z(medal.getVoiceFanbaseText()).m165244w(medal.getVoiceFanbaseColor()).m165242u(bLiveIntlVoiceMedalM135162n.icon).m165245x(bLiveIntlVoiceMedalM135162n.startColor).m165238q(bLiveIntlVoiceMedalM135162n.endColor).m165237p(bLiveIntlVoiceMedalM135162n.borderStartColor).m165236o(bLiveIntlVoiceMedalM135162n.borderEndColor).m165241t(qa00.m175859d(20.0f)).m165235m()));
    }

    /* JADX INFO: renamed from: k */
    public final Object m159433k(SpannableStringBuilder spannableStringBuilder, String str, int i, nxp nxpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        t5g t5gVar = new t5g(zrv.f205803e, nxpVar, i2);
        if (obj != null) {
            t5gVar.m185373g(4);
        }
        spannableStringBuilder.setSpan(t5gVar, i, str.length() + i, 33);
        return t5gVar;
    }

    /* JADX INFO: renamed from: l */
    public final Object m159434l(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        rnd0 rnd0Var = new rnd0(zrv.f205803e, str2, i2);
        if (obj != null) {
            rnd0Var.m185373g(4);
        }
        spannableStringBuilder.setSpan(rnd0Var, i, str.length() + i, 33);
        return rnd0Var;
    }

    /* JADX INFO: renamed from: m */
    public final Object m159435m(SpannableStringBuilder spannableStringBuilder, String str, int i, nxp nxpVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        ben0 ben0Var = new ben0(zrv.f205803e, nxpVar, i2);
        if (obj != null) {
            ben0Var.m185373g(4);
        }
        spannableStringBuilder.setSpan(ben0Var, i, str.length() + i, 33);
        return ben0Var;
    }

    /* JADX INFO: renamed from: n */
    public final List<String> m159436n(LongLinkChatMessage.LiveChatMessage liveChatMessage, final BLiveTemplateItem bLiveTemplateItem) {
        final LongLinkChatMessage.MedalMessage medal = liveChatMessage.getMedal();
        if (medal == null) {
            return jyb.m147507f0(new String[0]);
        }
        final cm0 cm0VarM209606A = this.f137972a.m209606A();
        List listM146083e = jlk0.m146083e(medal.getSingleRoomMedalsList(), medal.getMultiRoomMedalsList());
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(listM146083e, new y20() { // from class: l.lpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133122a.m159439q(arrayList, medal, cm0VarM209606A, bLiveTemplateItem, (LongLinkChatMessage.Medal) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m159437o(LongLinkChatMessage.Medal medal) {
        return (medal.getFamilyGrade() == 0 || TextUtils.isEmpty(medal.getFamilyText())) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m159438p(LongLinkChatMessage.Medal medal) {
        return (medal.getVoiceFanbaseGrade() == 0 || TextUtils.isEmpty(medal.getVoiceFanbaseText())) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m159439q(List list, LongLinkChatMessage.MedalMessage medalMessage, cm0 cm0Var, BLiveTemplateItem bLiveTemplateItem, LongLinkChatMessage.Medal medal) {
        if (m159437o(medal)) {
            m159430h(list, medal);
            return;
        }
        if (m159438p(medal)) {
            m159432j(list, medal);
            return;
        }
        BLiveMedal bLiveMedalM135168t = ((hiv) zrv.m221194l(htd0.f111521c)).m135168t(medal.getId(), "live", medalMessage.getVersion());
        if (bLiveMedalM135168t != null) {
            if (bLiveMedalM135168t.isFanbaseMedal()) {
                m159431i(cm0Var, list, medal);
                return;
            }
            if ("medalDesc".equals(bLiveTemplateItem.scene)) {
                list.add(bLiveMedalM135168t.url + "voiceMedal" + bLiveMedalM135168t.jumpUrl);
                return;
            }
            if (TextUtils.isEmpty(bLiveMedalM135168t.dynamicUrl) || !bLiveMedalM135168t.dynamicUrl.endsWith("webp")) {
                list.add(bLiveMedalM135168t.url);
                return;
            }
            list.add("royalSplit:#" + bLiveMedalM135168t.dynamicUrl);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m159440r(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        suf0Var.f170683c = m159433k(suf0Var.f170681a, strArrSplit[0], suf0Var.f170682b, (nxp) this.f137973b.fromJson(strArrSplit[1], nxp.class), suf0Var.f170683c, bLiveTemplateItem.size);
        suf0Var.f170682b += strArrSplit[0].length();
    }

    /* JADX INFO: renamed from: s */
    public final Object m159441s(SpannableStringBuilder spannableStringBuilder, String str, int i, fbg fbgVar, Object obj, int i2) {
        if (str.length() == 0) {
            return obj;
        }
        spannableStringBuilder.append((CharSequence) str);
        z5g z5gVar = new z5g(zrv.f205803e, fbgVar, i2);
        if (obj != null) {
            z5gVar.m185373g(4);
        }
        spannableStringBuilder.setSpan(z5gVar, i, str.length() + i, 33);
        return z5gVar;
    }

    /* JADX INFO: renamed from: t */
    public final Object m159442t(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, String str, Object obj) {
        if (str.length() == 0) {
            return obj;
        }
        String[] strArrSplit = str.split("voiceMedal");
        if (strArrSplit.length <= 0) {
            return null;
        }
        suf0Var.f170681a.append((CharSequence) strArrSplit[0]);
        hi20 hi20Var = new hi20(zrv.f205803e, strArrSplit[0], bLiveTemplateItem.size);
        if (obj != null) {
            hi20Var.m185373g(4);
        }
        a5s a5sVar = new a5s(bLiveTemplateItem.scene, null);
        if (strArrSplit.length > 1) {
            a5sVar.m96249g(strArrSplit[1]);
        }
        try {
            SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
            int i = suf0Var.f170682b;
            spannableStringBuilder.setSpan(a5sVar, i, strArrSplit[0].length() + i, 33);
            SpannableStringBuilder spannableStringBuilder2 = suf0Var.f170681a;
            int i2 = suf0Var.f170682b;
            spannableStringBuilder2.setSpan(hi20Var, i2, strArrSplit[0].length() + i2, 33);
            suf0Var.f170682b += strArrSplit[0].length();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            String str2 = strArrSplit[0];
        }
        return hi20Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m159443u(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, String str) {
        String[] strArrSplit = str.split("Split:#");
        suf0Var.f170683c = m159435m(suf0Var.f170681a, strArrSplit[0], suf0Var.f170682b, (nxp) this.f137973b.fromJson(strArrSplit[1], nxp.class), suf0Var.f170683c, bLiveTemplateItem.size);
        suf0Var.f170682b += strArrSplit[0].length();
    }
}
