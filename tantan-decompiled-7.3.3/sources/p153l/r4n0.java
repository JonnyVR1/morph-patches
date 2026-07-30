package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes9.dex */
public class r4n0 extends l4n0 {

    /* JADX INFO: renamed from: p */
    public final k4n0 f161219p;

    public r4n0(k4n0 k4n0Var, View view, PushMessage pushMessage, int i) {
        super(view, pushMessage, i);
        this.f161219p = k4n0Var;
    }

    @Override // p153l.l4n0
    /* JADX INFO: renamed from: c */
    public void mo152812c() {
        int i;
        PushMessageCustom pushMessageCustom = this.f129992c.messageCustom;
        if (pushMessageCustom != null) {
            this.f129994e.setActualImageResource(nbc0.f141174k1);
            this.f129995f.setText("聊天室");
            this.f129996g.setText(pushMessageCustom.text);
            this.f130002m.setText(pushMessageCustom.content);
            izs.m142868s("context_livingAct", this.f129997h, pushMessageCustom.image);
            this.f129998i.setText(pushMessageCustom.title);
            this.f130001l.setText("在线");
            this.f129999j.setVisibility(4);
            this.f130000k.setText(pushMessageCustom.ext);
            this.f130003n.setText(pushMessageCustom.buttonText);
            String str = pushMessageCustom.state;
            if (str != null) {
                str.getClass();
                switch (str) {
                    case "super_like":
                        i = nbc0.f141087A1;
                        break;
                    case "friends":
                        i = nbc0.f141216y1;
                        break;
                    case "liked":
                        i = nbc0.f141219z1;
                        break;
                    case "following":
                        i = nbc0.f141213x1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                this.f130004o.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            }
            this.f130004o.setVisibility(0);
            this.f130004o.setText(pushMessageCustom.subTitle);
            bnl0.m105509E0(this.f130003n, new View.OnClickListener() { // from class: l.p4n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150551a.m179781g(view);
                }
            });
            bnl0.m105509E0(this.f129993d, new View.OnClickListener() { // from class: l.q4n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155605a.m179782h(view);
                }
            });
        }
        String str2 = pushMessageCustom.liveId;
        String str3 = pushMessageCustom.userId;
        s4n0.m184569c(str2, str3, "NA", str3.equals(pushMessageCustom.otherID), false, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: f */
    public final void m179780f() {
        PushMessage pushMessage = this.f129992c;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (TextUtils.isEmpty(pushMessage.link) || this.f130003n == null || pushMessageCustom == null) {
            return;
        }
        String str = this.f129992c.link;
        if (str != null && !str.contains("source=")) {
            this.f129992c.link = this.f129992c.link + "&source=start-push";
        }
        String str2 = this.f129992c.link;
        if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
            this.f129992c.link = this.f129992c.link + "&liveMode=virtualAvatar";
        }
        String str3 = this.f129992c.link;
        if (str3 != null && !str3.contains("from=")) {
            this.f129992c.link = this.f129992c.link + "&from=from_in_app_push";
        }
        this.f161219p.mo143443b(0);
        s4n0.m184567a(this.f130003n.getContext(), this.f129992c.link);
        String str4 = pushMessageCustom.liveId;
        String str5 = pushMessageCustom.userId;
        s4n0.m184568b(str4, str5, "NA", str5.equals(pushMessageCustom.otherID), false, this.f129990a, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m179781g(View view) {
        m179780f();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m179782h(View view) {
        m179780f();
    }
}
