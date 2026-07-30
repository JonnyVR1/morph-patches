package p153l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class ltp extends g4s {

    /* JADX INFO: renamed from: A */
    public View f133556A;

    /* JADX INFO: renamed from: x */
    public CommonMedalView f133557x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f133558y;

    /* JADX INFO: renamed from: z */
    public TextView f133559z;

    public ltp(xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198778H2, (ViewGroup) null));
        m72943R().findViewById(mdc0.f136159e1).setOnClickListener(null);
        m72943R().setOnClickListener(new View.OnClickListener() { // from class: l.jtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122605a.m155804o0(view);
            }
        });
        this.f133558y = (VDraweeView) m72943R().findViewById(mdc0.f135919E);
        this.f133557x = (CommonMedalView) m72943R().findViewById(mdc0.f136067U3);
        this.f133559z = (TextView) m72943R().findViewById(mdc0.f136085W3);
        View viewFindViewById = m72943R().findViewById(mdc0.f136027Q);
        this.f133556A = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.ktp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128726a.m155805p0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m155804o0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m155805p0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public void m155806q0(xup xupVar, BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
        izs.m142870u("context_livingAct", this.f133558y, "https://auto.tancdn.com/v1/images/eyJpZCI6IkVER08yWTcyVkZFMkhLVkxFVDVLWU5FVlZWSEREVzE0IiwidyI6MTEyNSwiaCI6MTc0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjgwODYyMTMxMzc0MDM1MzU0ODd9.png", bnl0.m105592y0() - qa00.f156294G, qa00.m175859d(580.0f));
        String strValueOf = String.valueOf(bLiveVoiceFanBaseDetail.memberNum + 1);
        String strM209911u = xau.m209911u(R$string.f47957Zg, strValueOf);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strM209911u);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(n3d0.m161283g("#EC6CB7")), strM209911u.indexOf(strValueOf), strM209911u.indexOf(strValueOf) + strValueOf.length(), 34);
        this.f133559z.setText(spannableStringBuilder);
        a3o0 a3o0Var = new a3o0(false);
        a3o0Var.m95860t(xupVar);
        UserMedal userMedal = new UserMedal();
        userMedal.voiceFanbaseColor = OMSFontStyle.light;
        userMedal.voiceFanbaseGrade = 1;
        userMedal.voiceFanbaseText = bLiveVoiceFanBaseDetail.medalName;
        a3o0Var.m95858r(this.f133557x, userMedal);
    }
}
