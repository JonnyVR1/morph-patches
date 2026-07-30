package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes5.dex */
public class mvp extends c0s {

    /* JADX INFO: renamed from: A */
    public final TextView f138920A;

    /* JADX INFO: renamed from: B */
    public final View f138921B;

    /* JADX INFO: renamed from: C */
    public final TextView f138922C;

    /* JADX INFO: renamed from: D */
    public final TextView f138923D;

    /* JADX INFO: renamed from: E */
    public final TextView f138924E;

    /* JADX INFO: renamed from: F */
    public final VDraweeView f138925F;

    /* JADX INFO: renamed from: G */
    public final CommonMedalView f138926G;

    /* JADX INFO: renamed from: H */
    public final HeatChallengeProgressView f138927H;

    /* JADX INFO: renamed from: I */
    public final TextView f138928I;

    /* JADX INFO: renamed from: J */
    public final VDraweeView f138929J;

    /* JADX INFO: renamed from: K */
    public final VLinear f138930K;

    /* JADX INFO: renamed from: L */
    public ArrayList<IntlVoiceFanBaseTaskItem> f138931L;

    /* JADX INFO: renamed from: M */
    public xvp f138932M;

    /* JADX INFO: renamed from: N */
    public utp f138933N;

    /* JADX INFO: renamed from: x */
    public final VDraweeView f138934x;

    /* JADX INFO: renamed from: y */
    public final VDraweeView f138935y;

    /* JADX INFO: renamed from: z */
    public final TextView f138936z;

    public mvp(xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198838M2, (ViewGroup) null));
        this.f138931L = new ArrayList<>();
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.gvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106668a.m160311s0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f138934x = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f138921B = m72943R().findViewById(mdc0.f135930F1);
        this.f138935y = (VDraweeView) m72943R().findViewById(mdc0.f136299t);
        this.f138922C = (TextView) m72943R().findViewById(mdc0.f136162e4);
        this.f138929J = (VDraweeView) m72943R().findViewById(mdc0.f136122a4);
        this.f138920A = (TextView) m72943R().findViewById(mdc0.f136085W3);
        this.f138923D = (TextView) m72943R().findViewById(mdc0.f136041R4);
        this.f138924E = (TextView) m72943R().findViewById(mdc0.f136127b);
        this.f138925F = (VDraweeView) m72943R().findViewById(mdc0.f135943G5);
        this.f138936z = (TextView) m72943R().findViewById(mdc0.f136053S7);
        this.f138926G = (CommonMedalView) m72943R().findViewById(mdc0.f136067U3);
        this.f138930K = (VLinear) m72943R().findViewById(mdc0.f136172f4);
        HeatChallengeProgressView heatChallengeProgressView = (HeatChallengeProgressView) m72943R().findViewById(mdc0.f135996M4);
        this.f138927H = heatChallengeProgressView;
        heatChallengeProgressView.setStartColor(-1);
        heatChallengeProgressView.setEndColor(-1);
        this.f138928I = (TextView) m72943R().findViewById(mdc0.f136337x1);
        this.f138931L.add((IntlVoiceFanBaseTaskItem) m72943R().findViewById(mdc0.f135908C6));
        this.f138931L.add((IntlVoiceFanBaseTaskItem) m72943R().findViewById(mdc0.f135917D6));
        this.f138931L.add((IntlVoiceFanBaseTaskItem) m72943R().findViewById(mdc0.f135926E6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m160311s0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m160312t0(xup xupVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        utp utpVar = new utp(xupVar, bLiveVoiceFanBaseDetail.rulePageUrl);
        this.f138933N = utpVar;
        utpVar.show();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        utp utpVar = this.f138933N;
        if (utpVar != null) {
            utpVar.dismiss();
        }
        xvp xvpVar = this.f138932M;
        if (xvpVar != null) {
            xvpVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m160313u0(xup xupVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        xvp xvpVar = new xvp(xupVar, bLiveVoiceFanBaseDetail.rankRulePageUrl);
        this.f138932M = xvpVar;
        xvpVar.show();
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m160314v0(final xup xupVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, View view) {
        lup lupVar = new lup(view.getContext(), n3d0.m161280d(R$string.f47747Pg), new x20() { // from class: l.kvp
            @Override // p153l.x20
            public final void call() {
                new iup(xupVar).show();
            }
        }, n3d0.m161280d(R$string.f47726Og), new x20() { // from class: l.lvp
            @Override // p153l.x20
            public final void call() {
                xupVar.m138876w3(bLiveVoiceFanBaseDetail.rulePageUrl, qa00.m175859d(600.0f), 7001, 24);
            }
        });
        lupVar.setFocusable(true);
        lupVar.m155954e(this.f138921B, true);
    }

    /* JADX INFO: renamed from: w0 */
    public void m160315w0(final xup xupVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        izs.m142870u("context_livingAct", this.f138934x, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        izs.m142869t("context_livingAct", this.f138935y, bLiveVoiceFanBaseDetail.avatar, qa00.f156298K);
        izs.m142869t("context_livingAct", this.f138929J, bLiveVoiceFanBaseDetail.bgPic, bnl0.m105592y0());
        this.f138922C.setText(bLiveVoiceFanBaseDetail.name);
        this.f138920A.setText(xau.m209911u(R$string.f47831Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        bnl0.m105509E0(this.f138920A, new View.OnClickListener() { // from class: l.hvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111794a.m160312t0(xupVar, bLiveVoiceFanBaseDetail, view);
            }
        });
        int i = bLiveVoiceFanBaseDetail.weekRank;
        this.f138923D.setText(xau.m209911u(R$string.f47979ah, i >= 0 ? String.valueOf(i) : "100+"));
        bnl0.m105509E0(this.f138923D, new View.OnClickListener() { // from class: l.ivp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117101a.m160313u0(xupVar, bLiveVoiceFanBaseDetail, view);
            }
        });
        this.f138924E.setText(xau.m209910t(R$string.f47597Ig) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveVoiceFanBaseDetail.accompanyNum);
        izs.m142869t("context_livingAct", this.f138925F, bLiveVoiceFanBaseDetail.userAvatar, qa00.f156337x);
        this.f138930K.setOrientation(1);
        this.f138936z.setText(bLiveVoiceFanBaseDetail.userName);
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(xupVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        a3o0Var.m95858r(this.f138926G, userMedal);
        long j = bLiveVoiceFanBaseDetail.fullExp;
        if (j != 0) {
            this.f138927H.setContentRatio(bLiveVoiceFanBaseDetail.curExp / j);
        }
        String str = bLiveVoiceFanBaseDetail.fontColor;
        if (n3d0.m161282f(str)) {
            String strConcat = "#80".concat(str.substring(1));
            this.f138928I.setTextColor(n3d0.m161283g(strConcat));
            this.f138936z.setTextColor(n3d0.m161283g(strConcat));
        }
        String str2 = "Lv." + bLiveVoiceFanBaseDetail.medalGrade;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (bLiveVoiceFanBaseDetail.medalGrade < 15) {
            String strValueOf = String.valueOf(bLiveVoiceFanBaseDetail.fullExp - bLiveVoiceFanBaseDetail.curExp);
            String str3 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + xau.m209911u(R$string.f47936Yg, strValueOf);
            spannableStringBuilder.append((CharSequence) str3);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(n3d0.m161283g(str)), str3.lastIndexOf(strValueOf), str3.lastIndexOf(strValueOf) + strValueOf.length(), 34);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), str3.lastIndexOf(strValueOf), str3.lastIndexOf(strValueOf) + strValueOf.length(), 34);
        } else {
            spannableStringBuilder.append((CharSequence) str2);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(n3d0.m161283g(str)), 0, str2.length(), 34);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, str2.length(), 34);
        this.f138928I.setText(spannableStringBuilder);
        int i2 = 0;
        while (i2 < 3) {
            IntlVoiceFanBaseTaskItem intlVoiceFanBaseTaskItem = this.f138931L.get(i2);
            BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask = bLiveVoiceFanBaseDetail.tasks.size() > i2 ? bLiveVoiceFanBaseDetail.tasks.get(i2) : null;
            if (bLiveVoiceFanBaseTask == null) {
                bnl0.m105524M(intlVoiceFanBaseTaskItem, false);
            } else {
                bnl0.m105524M(intlVoiceFanBaseTaskItem, true);
                intlVoiceFanBaseTaskItem.m79322f(xupVar, this, bLiveVoiceFanBaseTask);
            }
            i2++;
        }
        bnl0.m105509E0(this.f138921B, new View.OnClickListener() { // from class: l.jvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122824a.m160314v0(xupVar, bLiveVoiceFanBaseDetail, view);
            }
        });
    }
}
