package p149l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class lrp extends f2s {

    /* JADX INFO: renamed from: A */
    public View f129740A;

    /* JADX INFO: renamed from: x */
    public CommonMedalView f129741x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f129742y;

    /* JADX INFO: renamed from: z */
    public TextView f129743z;

    public lrp(xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168046H2, (ViewGroup) null));
        m71760R().findViewById(g5c0.f100914e1).setOnClickListener(null);
        m71760R().setOnClickListener(new View.OnClickListener() { // from class: l.jrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119431a.m151500o0(view);
            }
        });
        this.f129742y = (VDraweeView) m71760R().findViewById(g5c0.f100674E);
        this.f129741x = (CommonMedalView) m71760R().findViewById(g5c0.f100822U3);
        this.f129743z = (TextView) m71760R().findViewById(g5c0.f100840W3);
        View viewFindViewById = m71760R().findViewById(g5c0.f100782Q);
        this.f129740A = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.krp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124383a.m151501p0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m151500o0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m151501p0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public void m151502q0(xsp xspVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        hxs.m133408u("context_livingAct", this.f129742y, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", xdl0.m208412y0() - t100.f167232G, t100.m186890d(580.0f));
        String strValueOf = String.valueOf(bLiveVoiceFanBaseDetail.memberNum + 1);
        String strM202218u = w8u.m202218u(R$string.f47109Zg, strValueOf);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strM202218u);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(kvc0.m147358g("#EC6CB7")), strM202218u.indexOf(strValueOf), strM202218u.indexOf(strValueOf) + strValueOf.length(), 34);
        this.f129743z.setText(spannableStringBuilder);
        wtn0 wtn0Var = new wtn0(false);
        wtn0Var.m205573t(xspVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = OMSFontStyle.light;
        userMedal.voiceFanbaseGrade = 1;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        wtn0Var.m205571r(this.f129741x, userMedal);
    }
}
