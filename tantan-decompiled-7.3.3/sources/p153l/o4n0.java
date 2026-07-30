package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceActionButton;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceBusinessInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceUser;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class o4n0 extends l4n0 {

    /* JADX INFO: renamed from: p */
    public boolean f145000p;

    public o4n0(View view, BLiveVirtualVoiceCard bLiveVirtualVoiceCard, int i) {
        super(view, bLiveVirtualVoiceCard, i);
    }

    @Override // p153l.l4n0
    /* JADX INFO: renamed from: c */
    public void mo152812c() {
        final BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton;
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser;
        String str;
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo;
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f129991b;
        if (bLiveVirtualVoiceCard != null && (bLiveVirtualVoiceBusinessInfo = bLiveVirtualVoiceCard.businessInfo) != null) {
            boolean zIsEmpty = TextUtils.isEmpty(bLiveVirtualVoiceBusinessInfo.logUrl);
            VDraweeView vDraweeView = this.f129994e;
            if (zIsEmpty) {
                vDraweeView.setActualImageResource(nbc0.f141174k1);
            } else {
                izs.m142868s("context_livingAct", vDraweeView, bLiveVirtualVoiceBusinessInfo.logUrl);
            }
            this.f129995f.setText(bLiveVirtualVoiceBusinessInfo.title);
            this.f129996g.setText(bLiveVirtualVoiceBusinessInfo.subTitle);
            this.f130002m.setText(bLiveVirtualVoiceBusinessInfo.userAreaSubTitle);
        }
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard2 = this.f129991b;
        if (bLiveVirtualVoiceCard2 != null && (bLiveVirtualVoiceUser = bLiveVirtualVoiceCard2.user) != null) {
            izs.m142868s("context_livingAct", this.f129997h, bLiveVirtualVoiceUser.profilePicture);
            this.f129998i.setText(bLiveVirtualVoiceUser.name);
            this.f130001l.setVisibility(bLiveVirtualVoiceUser.onCall ? 0 : 4);
            boolean z = bLiveVirtualVoiceUser.verificationStatus;
            if ((z && bLiveVirtualVoiceUser.verificationStatusPicture) || z) {
                this.f129999j.setVisibility(0);
                this.f129999j.setImageResource(nbc0.f141177l1);
            } else {
                boolean z2 = bLiveVirtualVoiceUser.verificationStatusPicture;
                VImage vImage = this.f129999j;
                if (z2) {
                    vImage.setVisibility(0);
                    this.f129999j.setImageResource(nbc0.f141171j1);
                } else {
                    vImage.setVisibility(4);
                }
            }
            VText vText = this.f130000k;
            Locale locale = Locale.CHINA;
            String str2 = bLiveVirtualVoiceUser.city;
            String str3 = "";
            if (TextUtils.isEmpty(bLiveVirtualVoiceUser.distance)) {
                str = "";
            } else {
                str = "(距离" + bLiveVirtualVoiceUser.distance + ")";
            }
            String str4 = bLiveVirtualVoiceUser.constellation;
            if (bLiveVirtualVoiceUser.age > 0) {
                str3 = "·" + bLiveVirtualVoiceUser.age + "岁";
            }
            vText.setText(String.format(locale, "%s%s·%s%s", str2, str, str4, str3));
        }
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard3 = this.f129991b;
        if (bLiveVirtualVoiceCard3 != null && (bLiveVirtualVoiceActionButton = bLiveVirtualVoiceCard3.actionButton) != null) {
            this.f130003n.setText(bLiveVirtualVoiceActionButton.title);
            bnl0.m105509E0(this.f130003n, new View.OnClickListener() { // from class: l.m4n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134818a.m166077h(bLiveVirtualVoiceActionButton, view);
                }
            });
            bnl0.m105509E0(this.f129993d, new View.OnClickListener() { // from class: l.n4n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140244a.m166078i(bLiveVirtualVoiceActionButton, view);
                }
            });
        }
        m166076g();
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard4 = this.f129991b;
        s4n0.m184569c(bLiveVirtualVoiceCard4.liveId, bLiveVirtualVoiceCard4.anchor.f45299id, bLiveVirtualVoiceCard4.voiceTemplate, this.f145000p, false, "NA");
    }

    /* JADX INFO: renamed from: f */
    public final void m166075f(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton) {
        s4n0.m184567a(this.f130003n.getContext(), bLiveVirtualVoiceActionButton.jump);
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f129991b;
        s4n0.m184568b(bLiveVirtualVoiceCard.liveId, bLiveVirtualVoiceCard.anchor.f45299id, bLiveVirtualVoiceCard.voiceTemplate, this.f145000p, false, this.f129990a, "NA");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m166076g() {
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser;
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f129991b;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveVirtualVoiceCard.anchor;
        if (bLiveSuggestLiveAnchor == null || (bLiveVirtualVoiceUser = bLiveVirtualVoiceCard.user) == null) {
            this.f145000p = false;
        } else {
            this.f145000p = bLiveSuggestLiveAnchor.f45299id.equals(bLiveVirtualVoiceUser.f45329id);
        }
        return this.f145000p;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m166077h(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, View view) {
        m166075f(bLiveVirtualVoiceActionButton);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m166078i(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, View view) {
        m166075f(bLiveVirtualVoiceActionButton);
    }
}
