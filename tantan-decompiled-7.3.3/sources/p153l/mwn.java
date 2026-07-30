package p153l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class mwn implements iam<kwn> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f139115a;

    /* JADX INFO: renamed from: b */
    public VText f139116b;

    /* JADX INFO: renamed from: c */
    public VText f139117c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f139118d;

    /* JADX INFO: renamed from: e */
    public VText f139119e;

    /* JADX INFO: renamed from: f */
    public VText f139120f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f139121g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f139122h;

    /* JADX INFO: renamed from: i */
    public VText f139123i;

    /* JADX INFO: renamed from: j */
    public VText f139124j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f139125k;

    /* JADX INFO: renamed from: l */
    public VText f139126l;

    /* JADX INFO: renamed from: m */
    public VText f139127m;

    /* JADX INFO: renamed from: n */
    public VLinear f139128n;

    /* JADX INFO: renamed from: o */
    public VText f139129o;

    /* JADX INFO: renamed from: p */
    public VText f139130p;

    /* JADX INFO: renamed from: q */
    public VText f139131q;

    /* JADX INFO: renamed from: r */
    public VText f139132r;

    /* JADX INFO: renamed from: s */
    public VText f139133s;

    /* JADX INFO: renamed from: t */
    public VButton f139134t;

    /* JADX INFO: renamed from: u */
    public BLiveRoom f139135u;

    /* JADX INFO: renamed from: v */
    public kwn f139136v;

    /* JADX INFO: renamed from: k */
    private void m160570k(User user) {
        this.f139119e.setText(user.name);
        izs.m142869t("context_livingAct", this.f139118d, user.m61308fp().url, qa00.m175859d(80.0f));
        izs.m142865p("context_livingAct", this.f139115a, user.m61308fp().url, 1, qa00.m175859d(20.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m160571b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nwn.m164998b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kwn kwnVar) {
        this.f139136v = kwnVar;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m160573d(String str, String str2, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String string = zrv.f205803e.getString(R$string.f47537G0);
        String string2 = zrv.f205803e.getString(R$string.f48415ue);
        String string3 = zrv.f205803e.getString(R$string.f47412A7);
        if (str2.contains(string)) {
            arrayList.add(str2.substring(0, str2.indexOf(string)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else if (str2.contains(string2)) {
            arrayList.add(str2.substring(0, str2.indexOf(string2)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string2);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else if (str2.contains(string3)) {
            arrayList.add(str2.substring(0, str2.indexOf(string3)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string3);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else {
            arrayList.add(str2);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
        }
        return q8g0.m175799e0(str, arrayList, arrayList2, lyh0.m156283c(7), arrayList3);
    }

    /* JADX INFO: renamed from: e */
    public final void m160574e(BLiveSummary bLiveSummary) {
        this.f139117c.setText(zrv.f205803e.getString(R$string.f47884W6, kdu.m149278W(bLiveSummary.duration * 1000)));
        String strM214935c = yau.m214935c(bLiveSummary.liveOrder);
        String string = zrv.f205803e.getString(R$string.f47668M0, strM214935c);
        int iM175861f = qa00.m175861f(32);
        int iM175861f2 = qa00.m175861f(14);
        this.f139123i.setText(m160573d(string, strM214935c, -1, iM175861f, iM175861f2));
        String strM214935c2 = yau.m214935c(bLiveSummary.rewardPoint);
        String string2 = zrv.f205803e.getString(vxr.m203876d().m171022s0() ? R$string.f47969a7 : R$string.f47926Y6, strM214935c2);
        htd0<civ> htd0Var = htd0.f111524f;
        if (((civ) zrv.m221194l(htd0Var)).m109970n()) {
            string2 = zrv.f205803e.getString(R$string.f47947Z6, strM214935c2);
        }
        this.f139124j.setText(m160573d(string2, strM214935c2, -824242, iM175861f, iM175861f2));
        if (!xau.m209897B()) {
            bnl0.m105524M(this.f139122h, false);
            bnl0.m105524M(this.f139125k, true);
            this.f139126l.setText(strM214935c);
            this.f139127m.setText(R$string.f47689N0);
            this.f139129o.setText(strM214935c2);
            String string3 = zrv.f205803e.getString(vxr.m203876d().m171022s0() ? R$string.f48056e6 : R$string.f48034d6);
            if (((civ) zrv.m221194l(htd0Var)).m109970n()) {
                string3 = zrv.f205803e.getString(R$string.f47828Td);
            }
            this.f139130p.setText(string3);
        }
        this.f139131q.setText(yau.m214935c(bLiveSummary.audienceCount));
        this.f139132r.setText(yau.m214935c(bLiveSummary.newFollowCount));
        this.f139133s.setText(yau.m214935c(bLiveSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    public void m160575f(BLiveRoom bLiveRoom) {
        this.f139135u = bLiveRoom;
        this.f139120f.setText(bLiveRoom.sign);
    }

    /* JADX INFO: renamed from: i */
    public void m160576i(User user, BLiveSummary bLiveSummary) {
        m160570k(user);
        m160574e(bLiveSummary);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m160571b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m160577j(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().m21503F(str).m21557u0(act.getString(R$string.f48271o2)).m21567z0();
        }
        this.f139134t.setOnClickListener(new View.OnClickListener() { // from class: l.lwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m45660g2();
            }
        });
        bnl0.m105524M(this.f139121g, false);
        bnl0.m105524M(this.f139120f, false);
        bnl0.m105540X(this.f139116b, qa00.f156297J);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
