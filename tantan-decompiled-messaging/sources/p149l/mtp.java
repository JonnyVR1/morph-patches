package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes5.dex */
public class mtp extends byr {

    /* JADX INFO: renamed from: A */
    public final TextView f135652A;

    /* JADX INFO: renamed from: B */
    public final View f135653B;

    /* JADX INFO: renamed from: C */
    public final TextView f135654C;

    /* JADX INFO: renamed from: D */
    public final TextView f135655D;

    /* JADX INFO: renamed from: E */
    public final TextView f135656E;

    /* JADX INFO: renamed from: F */
    public final VDraweeView f135657F;

    /* JADX INFO: renamed from: G */
    public final CommonMedalView f135658G;

    /* JADX INFO: renamed from: H */
    public final HeatChallengeProgressView f135659H;

    /* JADX INFO: renamed from: I */
    public final TextView f135660I;

    /* JADX INFO: renamed from: J */
    public final VDraweeView f135661J;

    /* JADX INFO: renamed from: K */
    public final VLinear f135662K;

    /* JADX INFO: renamed from: L */
    public ArrayList<IntlVoiceFanBaseTaskItem> f135663L;

    /* JADX INFO: renamed from: M */
    public xtp f135664M;

    /* JADX INFO: renamed from: N */
    public urp f135665N;

    /* JADX INFO: renamed from: x */
    public final VDraweeView f135666x;

    /* JADX INFO: renamed from: y */
    public final VDraweeView f135667y;

    /* JADX INFO: renamed from: z */
    public final TextView f135668z;

    public mtp(xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168106M2, (ViewGroup) null));
        this.f135663L = new ArrayList<>();
        xdl0.m208329E0(m71760R().findViewById(g5c0.f101002n1), new View.OnClickListener() { // from class: l.gtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104334a.m156344s0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f135666x = vDraweeView;
        mep0.m154301c1(vDraweeView, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f135653B = m71760R().findViewById(g5c0.f100685F1);
        this.f135667y = (VDraweeView) m71760R().findViewById(g5c0.f101054t);
        this.f135654C = (TextView) m71760R().findViewById(g5c0.f100917e4);
        this.f135661J = (VDraweeView) m71760R().findViewById(g5c0.f100877a4);
        this.f135652A = (TextView) m71760R().findViewById(g5c0.f100840W3);
        this.f135655D = (TextView) m71760R().findViewById(g5c0.f100796R4);
        this.f135656E = (TextView) m71760R().findViewById(g5c0.f100882b);
        this.f135657F = (VDraweeView) m71760R().findViewById(g5c0.f100698G5);
        this.f135668z = (TextView) m71760R().findViewById(g5c0.f100808S7);
        this.f135658G = (CommonMedalView) m71760R().findViewById(g5c0.f100822U3);
        this.f135662K = (VLinear) m71760R().findViewById(g5c0.f100927f4);
        HeatChallengeProgressView heatChallengeProgressView = (HeatChallengeProgressView) m71760R().findViewById(g5c0.f100751M4);
        this.f135659H = heatChallengeProgressView;
        heatChallengeProgressView.setStartColor(-1);
        heatChallengeProgressView.setEndColor(-1);
        this.f135660I = (TextView) m71760R().findViewById(g5c0.f101092x1);
        this.f135663L.add((IntlVoiceFanBaseTaskItem) m71760R().findViewById(g5c0.f100663C6));
        this.f135663L.add((IntlVoiceFanBaseTaskItem) m71760R().findViewById(g5c0.f100672D6));
        this.f135663L.add((IntlVoiceFanBaseTaskItem) m71760R().findViewById(g5c0.f100681E6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m156344s0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m156345t0(xsp xspVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        urp urpVar = new urp(xspVar, bLiveVoiceFanBaseDetail.rulePageUrl);
        this.f135665N = urpVar;
        urpVar.show();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        urp urpVar = this.f135665N;
        if (urpVar != null) {
            urpVar.dismiss();
        }
        xtp xtpVar = this.f135664M;
        if (xtpVar != null) {
            xtpVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m156346u0(xsp xspVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        xtp xtpVar = new xtp(xspVar, bLiveVoiceFanBaseDetail.rankRulePageUrl);
        this.f135664M = xtpVar;
        xtpVar.show();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m156347v0(final xsp xspVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        lsp lspVar = new lsp(view.getContext(), kvc0.m147355d(R$string.f46899Pg), new d30() { // from class: l.ktp
            @Override // p149l.d30
            public final void call() {
                new isp(xspVar).show();
            }
        }, kvc0.m147355d(R$string.f46878Og), new d30() { // from class: l.ltp
            @Override // p149l.d30
            public final void call() {
                xspVar.m129317w3(bLiveVoiceFanBaseDetail.rulePageUrl, t100.m186890d(600.0f), 7001, 24);
            }
        });
        lspVar.setFocusable(true);
        lspVar.m151639e(this.f135653B, true);
    }

    /* JADX INFO: renamed from: w0 */
    public void m156348w0(final xsp xspVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        hxs.m133408u("context_livingAct", this.f135666x, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0(), t100.m186890d(580.0f));
        hxs.m133407t("context_livingAct", this.f135667y, bLiveVoiceFanBaseDetail.avatar, t100.f167236K);
        hxs.m133407t("context_livingAct", this.f135661J, bLiveVoiceFanBaseDetail.bgPic, xdl0.m208412y0());
        this.f135654C.setText(bLiveVoiceFanBaseDetail.name);
        this.f135652A.setText(w8u.m202218u(R$string.f46983Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        xdl0.m208329E0(this.f135652A, new View.OnClickListener() { // from class: l.htp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109428a.m156345t0(xspVar, bLiveVoiceFanBaseDetail, view);
            }
        });
        int i = bLiveVoiceFanBaseDetail.weekRank;
        this.f135655D.setText(w8u.m202218u(R$string.f47131ah, i >= 0 ? String.valueOf(i) : "100+"));
        xdl0.m208329E0(this.f135655D, new View.OnClickListener() { // from class: l.itp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114904a.m156346u0(xspVar, bLiveVoiceFanBaseDetail, view);
            }
        });
        this.f135656E.setText(w8u.m202217t(R$string.f46749Ig) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveVoiceFanBaseDetail.accompanyNum);
        hxs.m133407t("context_livingAct", this.f135657F, bLiveVoiceFanBaseDetail.userAvatar, t100.f167275x);
        this.f135662K.setOrientation(1);
        this.f135668z.setText(bLiveVoiceFanBaseDetail.userName);
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(xspVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        wtn0Var.m205571r(this.f135658G, userMedal);
        long j = bLiveVoiceFanBaseDetail.fullExp;
        if (j != 0) {
            this.f135659H.setContentRatio(bLiveVoiceFanBaseDetail.curExp / j);
        }
        String str = bLiveVoiceFanBaseDetail.fontColor;
        if (kvc0.m147357f(str)) {
            String strConcat = "#80".concat(str.substring(1));
            this.f135660I.setTextColor(kvc0.m147358g(strConcat));
            this.f135668z.setTextColor(kvc0.m147358g(strConcat));
        }
        String str2 = "Lv." + bLiveVoiceFanBaseDetail.medalGrade;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (bLiveVoiceFanBaseDetail.medalGrade < 15) {
            String strValueOf = String.valueOf(bLiveVoiceFanBaseDetail.fullExp - bLiveVoiceFanBaseDetail.curExp);
            String str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + w8u.m202218u(R$string.f47088Yg, strValueOf);
            spannableStringBuilder.append((CharSequence) str3);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(kvc0.m147358g(str)), str3.lastIndexOf(strValueOf), str3.lastIndexOf(strValueOf) + strValueOf.length(), 34);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), str3.lastIndexOf(strValueOf), str3.lastIndexOf(strValueOf) + strValueOf.length(), 34);
        } else {
            spannableStringBuilder.append((CharSequence) str2);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(kvc0.m147358g(str)), 0, str2.length(), 34);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, str2.length(), 34);
        this.f135660I.setText(spannableStringBuilder);
        int i2 = 0;
        while (i2 < 3) {
            IntlVoiceFanBaseTaskItem intlVoiceFanBaseTaskItem = this.f135663L.get(i2);
            BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask = bLiveVoiceFanBaseDetail.tasks.size() > i2 ? bLiveVoiceFanBaseDetail.tasks.get(i2) : null;
            if (bLiveVoiceFanBaseTask == null) {
                xdl0.m208344M(intlVoiceFanBaseTaskItem, false);
            } else {
                xdl0.m208344M(intlVoiceFanBaseTaskItem, true);
                intlVoiceFanBaseTaskItem.m78139f(xspVar, this, bLiveVoiceFanBaseTask);
            }
            i2++;
        }
        xdl0.m208329E0(this.f135653B, new View.OnClickListener() { // from class: l.jtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119652a.m156347v0(xspVar, bLiveVoiceFanBaseDetail, view);
            }
        });
    }
}
