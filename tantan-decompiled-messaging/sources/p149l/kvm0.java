package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceActionButton;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceBusinessInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceUser;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kvm0 extends hvm0 {

    /* JADX INFO: renamed from: p */
    public boolean f124782p;

    public kvm0(View view, BLiveVirtualVoiceCard bLiveVirtualVoiceCard, int i) {
        super(view, bLiveVirtualVoiceCard, i);
    }

    @Override // p149l.hvm0
    /* JADX INFO: renamed from: c */
    public void mo133194c() {
        final BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton;
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser;
        String str;
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo;
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f109670b;
        if (bLiveVirtualVoiceCard != null && (bLiveVirtualVoiceBusinessInfo = bLiveVirtualVoiceCard.businessInfo) != null) {
            boolean zIsEmpty = TextUtils.isEmpty(bLiveVirtualVoiceBusinessInfo.logUrl);
            VDraweeView vDraweeView = this.f109673e;
            if (zIsEmpty) {
                vDraweeView.setActualImageResource(h3c0.f105683k1);
            } else {
                hxs.m133406s("context_livingAct", vDraweeView, bLiveVirtualVoiceBusinessInfo.logUrl);
            }
            this.f109674f.setText(bLiveVirtualVoiceBusinessInfo.title);
            this.f109675g.setText(bLiveVirtualVoiceBusinessInfo.subTitle);
            this.f109681m.setText(bLiveVirtualVoiceBusinessInfo.userAreaSubTitle);
        }
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard2 = this.f109670b;
        if (bLiveVirtualVoiceCard2 != null && (bLiveVirtualVoiceUser = bLiveVirtualVoiceCard2.user) != null) {
            hxs.m133406s("context_livingAct", this.f109676h, bLiveVirtualVoiceUser.profilePicture);
            this.f109677i.setText(bLiveVirtualVoiceUser.name);
            this.f109680l.setVisibility(bLiveVirtualVoiceUser.onCall ? 0 : 4);
            boolean z = bLiveVirtualVoiceUser.verificationStatus;
            if ((z && bLiveVirtualVoiceUser.verificationStatusPicture) || z) {
                this.f109678j.setVisibility(0);
                this.f109678j.setImageResource(h3c0.f105686l1);
            } else {
                boolean z2 = bLiveVirtualVoiceUser.verificationStatusPicture;
                VImage vImage = this.f109678j;
                if (z2) {
                    vImage.setVisibility(0);
                    this.f109678j.setImageResource(h3c0.f105680j1);
                } else {
                    vImage.setVisibility(4);
                }
            }
            VText vText = this.f109679k;
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
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard3 = this.f109670b;
        if (bLiveVirtualVoiceCard3 != null && (bLiveVirtualVoiceActionButton = bLiveVirtualVoiceCard3.actionButton) != null) {
            this.f109682n.setText(bLiveVirtualVoiceActionButton.title);
            xdl0.m208329E0(this.f109682n, new View.OnClickListener() { // from class: l.ivm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115183a.m147388h(bLiveVirtualVoiceActionButton, view);
                }
            });
            xdl0.m208329E0(this.f109672d, new View.OnClickListener() { // from class: l.jvm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f119959a.m147389i(bLiveVirtualVoiceActionButton, view);
                }
            });
        }
        m147387g();
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard4 = this.f109670b;
        ovm0.m166202c(bLiveVirtualVoiceCard4.liveId, bLiveVirtualVoiceCard4.anchor.f44451id, bLiveVirtualVoiceCard4.voiceTemplate, this.f124782p, false, "NA");
    }

    /* JADX INFO: renamed from: f */
    public final void m147386f(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton) {
        ovm0.m166200a(this.f109682n.getContext(), bLiveVirtualVoiceActionButton.jump);
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f109670b;
        ovm0.m166201b(bLiveVirtualVoiceCard.liveId, bLiveVirtualVoiceCard.anchor.f44451id, bLiveVirtualVoiceCard.voiceTemplate, this.f124782p, false, this.f109669a, "NA");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m147387g() {
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser;
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = this.f109670b;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveVirtualVoiceCard.anchor;
        if (bLiveSuggestLiveAnchor == null || (bLiveVirtualVoiceUser = bLiveVirtualVoiceCard.user) == null) {
            this.f124782p = false;
        } else {
            this.f124782p = bLiveSuggestLiveAnchor.f44451id.equals(bLiveVirtualVoiceUser.f44481id);
        }
        return this.f124782p;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m147388h(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, View view) {
        m147386f(bLiveVirtualVoiceActionButton);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m147389i(BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton, View view) {
        m147386f(bLiveVirtualVoiceActionButton);
    }
}
