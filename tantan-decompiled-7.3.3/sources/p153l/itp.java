package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseRight;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.ArrayList;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class itp extends c0s {

    /* JADX INFO: renamed from: A */
    public TextView f116860A;

    /* JADX INFO: renamed from: B */
    public TextView f116861B;

    /* JADX INFO: renamed from: C */
    public View f116862C;

    /* JADX INFO: renamed from: D */
    public TextView f116863D;

    /* JADX INFO: renamed from: E */
    public ArrayList<VDraweeView> f116864E;

    /* JADX INFO: renamed from: F */
    public ArrayList<TextView> f116865F;

    /* JADX INFO: renamed from: x */
    public CommonMedalView f116866x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f116867y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f116868z;

    public itp(xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198766G2, (ViewGroup) null));
        this.f116864E = new ArrayList<>();
        this.f116865F = new ArrayList<>();
        bnl0.m105509E0(m72943R().findViewById(mdc0.f136247n1), new View.OnClickListener() { // from class: l.htp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111573a.m142072o0(view);
            }
        });
        VDraweeView vDraweeView = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f116867y = vDraweeView;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f116868z = (VDraweeView) m72943R().findViewById(mdc0.f136299t);
        this.f116860A = (TextView) m72943R().findViewById(mdc0.f136053S7);
        this.f116866x = (CommonMedalView) m72943R().findViewById(mdc0.f136067U3);
        this.f116861B = (TextView) m72943R().findViewById(mdc0.f136085W3);
        this.f116864E.add((VDraweeView) m72943R().findViewById(mdc0.f136213j5));
        this.f116864E.add((VDraweeView) m72943R().findViewById(mdc0.f136223k5));
        this.f116864E.add((VDraweeView) m72943R().findViewById(mdc0.f136233l5));
        this.f116865F.add((TextView) m72943R().findViewById(mdc0.f136251n5));
        this.f116865F.add((TextView) m72943R().findViewById(mdc0.f136260o5));
        this.f116865F.add((TextView) m72943R().findViewById(mdc0.f136269p5));
        this.f116862C = m72943R().findViewById(mdc0.f136027Q);
        this.f116863D = (TextView) m72943R().findViewById(mdc0.f136036R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m142072o0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public void m142073p0(final xup xupVar, final BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        izs.m142870u("context_livingAct", this.f116867y, "https://auto.tancdn.com/v1/images/eyJpZCI6IkxKQjZJR0dETFM0UEsyQlRCMjdGR080RkhYNEFMTjE0IiwidyI6MTEyNSwiaCI6MTI4NywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjg2NjI2NzM4ODMyNzI0MjM2MTV9.png", bnl0.m105592y0(), qa00.m175859d(580.0f));
        izs.m142869t("context_livingAct", this.f116868z, bLiveVoiceFanBaseDetail.avatar, qa00.f156298K);
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(xupVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = bLiveVoiceFanBaseDetail.medalColor;
        userMedal.voiceFanbaseGrade = bLiveVoiceFanBaseDetail.medalGrade;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        a3o0Var.m95858r(this.f116866x, userMedal);
        this.f116860A.setText(bLiveVoiceFanBaseDetail.name);
        this.f116861B.setText(xau.m209911u(R$string.f47831Tg, Integer.valueOf(bLiveVoiceFanBaseDetail.memberNum)));
        int i = 0;
        while (i < 3) {
            VDraweeView vDraweeView = this.f116864E.get(i);
            TextView textView = this.f116865F.get(i);
            BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight = bLiveVoiceFanBaseDetail.rights.size() > i ? bLiveVoiceFanBaseDetail.rights.get(i) : null;
            if (bLiveVoiceFanBaseRight == null) {
                bnl0.m105524M(vDraweeView, false);
                bnl0.m105524M(textView, false);
            } else {
                bnl0.m105524M(vDraweeView, true);
                bnl0.m105524M(textView, true);
                izs.m142869t("context_livingAct", vDraweeView, bLiveVoiceFanBaseRight.pic, qa00.f156296I);
                textView.setText(bLiveVoiceFanBaseRight.name);
            }
            i++;
        }
        this.f116863D.setText(n3d0.m161280d(R$string.f47768Qg) + n3d0.m161280d(R$string.f47852Ug));
        bnl0.m105509E0(this.f116862C, new View.OnClickListener() { // from class: l.gtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xup xupVar2 = xupVar;
                BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail2 = bLiveVoiceFanBaseDetail;
                xupVar2.m213175g4(bLiveVoiceFanBaseDetail2, bLiveVoiceFanBaseDetail2.joinGiftId);
            }
        });
    }
}
