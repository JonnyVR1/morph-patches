package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import com.p051p1.mobile.putong.live.livingroom.other.liveend.LiveEndDataItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class das implements iam<aas> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f85905a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f85906b;

    /* JADX INFO: renamed from: c */
    public VText f85907c;

    /* JADX INFO: renamed from: d */
    public TextView f85908d;

    /* JADX INFO: renamed from: e */
    public LiveEndDataItemView f85909e;

    /* JADX INFO: renamed from: f */
    public LiveEndDataItemView f85910f;

    /* JADX INFO: renamed from: g */
    public LiveEndDataItemView f85911g;

    /* JADX INFO: renamed from: h */
    public LiveEndDataItemView f85912h;

    /* JADX INFO: renamed from: i */
    public LiveEndDataItemView f85913i;

    /* JADX INFO: renamed from: j */
    public LiveEndDataItemView f85914j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f85915k;

    /* JADX INFO: renamed from: l */
    public LiveEndDataItemView f85916l;

    /* JADX INFO: renamed from: m */
    public LiveEndDataItemView f85917m;

    /* JADX INFO: renamed from: n */
    public LiveEndDataItemView f85918n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f85919o;

    /* JADX INFO: renamed from: p */
    public LiveMarqueeTextView f85920p;

    /* JADX INFO: renamed from: q */
    public VImage f85921q;

    /* JADX INFO: renamed from: c */
    private void m115131c(BLiveSummary bLiveSummary) {
        String str;
        this.f85909e.setValueText(kdu.m149278W(bLiveSummary.duration * 1000));
        String strM214935c = yau.m214935c(bLiveSummary.rewardPoint);
        if (vxr.m203876d().m171022s0()) {
            str = strM214935c + "人气值";
        } else {
            str = strM214935c + "心动";
        }
        this.f85908d.setText(str);
        this.f85910f.setValueText(yau.m214935c(bLiveSummary.audienceCount));
        this.f85911g.setValueText(yau.m214935c(bLiveSummary.newFollowCount));
        this.f85913i.setValueText(yau.m214935c(bLiveSummary.rewarderCount));
        this.f85914j.setValueText(yau.m214935c(bLiveSummary.chatMsgCount));
        this.f85912h.setValueText(yau.m214935c(bLiveSummary.newFanbaseCount));
        bnl0.m105524M(this.f85919o, !TextUtils.isEmpty(bLiveSummary.riseDirection));
        this.f85920p.setText(bLiveSummary.riseDirection);
        BLiveOfficialShowSummary bLiveOfficialShowSummary = bLiveSummary.officialShowSummary;
        LinearLayout linearLayout = this.f85915k;
        if (bLiveOfficialShowSummary == null) {
            bnl0.m105524M(linearLayout, false);
            return;
        }
        bnl0.m105524M(linearLayout, true);
        this.f85916l.setValueText(yau.m214935c(bLiveSummary.officialShowSummary.audienceCount));
        this.f85917m.setValueText(yau.m214935c(bLiveSummary.officialShowSummary.newFollowCount));
        this.f85918n.setValueText(yau.m214935c(bLiveSummary.officialShowSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    private void m115132f(User user) {
        this.f85907c.setText(user.name);
        izs.m142869t("context_livingAct", this.f85906b, user.m61308fp().url, qa00.m175859d(80.0f));
        izs.m142865p("context_livingAct", this.f85905a, user.m61308fp().url, 1, qa00.m175859d(20.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m115134d(User user, BLiveSummary bLiveSummary) {
        m115132f(user);
        m115131c(bLiveSummary);
    }

    /* JADX INFO: renamed from: e */
    public void m115135e(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().m21503F(str).m21557u0(act.getString(R$string.f48271o2)).m21567z0();
        }
        this.f85921q.setOnClickListener(new View.OnClickListener() { // from class: l.cas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m68056e2();
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198788I0, viewGroup, false);
        this.f85905a = (VDraweeView) viewInflate.findViewById(mdc0.f135913D2);
        this.f85906b = (VDraweeView) viewInflate.findViewById(mdc0.f136299t);
        this.f85907c = (VText) viewInflate.findViewById(mdc0.f136217k);
        this.f85908d = (TextView) viewInflate.findViewById(mdc0.f136203i5);
        this.f85909e = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136189h1);
        this.f85910f = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136089W7);
        this.f85911g = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136192h4);
        this.f85912h = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136182g4);
        this.f85913i = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136304t4);
        this.f85914j = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f135976K2);
        this.f85915k = (LinearLayout) viewInflate.findViewById(mdc0.f136313u4);
        this.f85916l = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136272q);
        this.f85917m = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136322v4);
        this.f85918n = (LiveEndDataItemView) viewInflate.findViewById(mdc0.f136278q5);
        this.f85919o = (LinearLayout) viewInflate.findViewById(mdc0.f135949H2);
        this.f85920p = (LiveMarqueeTextView) viewInflate.findViewById(mdc0.f135958I2);
        this.f85921q = (VImage) viewInflate.findViewById(mdc0.f136345y0);
        this.f85909e.setTagText("直播时长");
        this.f85910f.setTagText("观看人数");
        this.f85911g.setTagText("新增粉丝");
        this.f85912h.setTagText("粉丝团新增");
        this.f85913i.setTagText("送礼人数");
        this.f85914j.setTagText("互动次数");
        this.f85916l.setTagText("观看人数");
        this.f85917m.setTagText("新增粉丝");
        this.f85918n.setTagText("送礼人数");
        return viewInflate;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(aas aasVar) {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
