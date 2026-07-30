package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes13.dex */
public class nvm0 extends hvm0 {

    /* JADX INFO: renamed from: p */
    public final gvm0 f140780p;

    public nvm0(gvm0 gvm0Var, View view, PushMessage pushMessage, int i) {
        super(view, pushMessage, i);
        this.f140780p = gvm0Var;
    }

    @Override // p149l.hvm0
    /* JADX INFO: renamed from: c */
    public void mo133194c() {
        int i;
        PushMessageCustom pushMessageCustom = this.f109671c.messageCustom;
        if (pushMessageCustom != null) {
            this.f109673e.setActualImageResource(h3c0.f105683k1);
            this.f109674f.setText("聊天室");
            this.f109675g.setText(pushMessageCustom.text);
            this.f109681m.setText(pushMessageCustom.content);
            hxs.m133406s("context_livingAct", this.f109676h, pushMessageCustom.image);
            this.f109677i.setText(pushMessageCustom.title);
            this.f109680l.setText("在线");
            this.f109678j.setVisibility(4);
            this.f109679k.setText(pushMessageCustom.ext);
            this.f109682n.setText(pushMessageCustom.buttonText);
            String str = pushMessageCustom.state;
            if (str != null) {
                str.getClass();
                switch (str) {
                    case "super_like":
                        i = h3c0.f105596A1;
                        break;
                    case "friends":
                        i = h3c0.f105725y1;
                        break;
                    case "liked":
                        i = h3c0.f105728z1;
                        break;
                    case "following":
                        i = h3c0.f105722x1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                this.f109683o.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            }
            this.f109683o.setVisibility(0);
            this.f109683o.setText(pushMessageCustom.subTitle);
            xdl0.m208329E0(this.f109682n, new View.OnClickListener() { // from class: l.lvm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130174a.m161704g(view);
                }
            });
            xdl0.m208329E0(this.f109672d, new View.OnClickListener() { // from class: l.mvm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135953a.m161705h(view);
                }
            });
        }
        String str2 = pushMessageCustom.liveId;
        String str3 = pushMessageCustom.userId;
        ovm0.m166202c(str2, str3, "NA", str3.equals(pushMessageCustom.otherID), false, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: f */
    public final void m161703f() {
        PushMessage pushMessage = this.f109671c;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (TextUtils.isEmpty(pushMessage.link) || this.f109682n == null || pushMessageCustom == null) {
            return;
        }
        String str = this.f109671c.link;
        if (str != null && !str.contains("source=")) {
            this.f109671c.link = this.f109671c.link + "&source=start-push";
        }
        String str2 = this.f109671c.link;
        if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
            this.f109671c.link = this.f109671c.link + "&liveMode=virtualAvatar";
        }
        String str3 = this.f109671c.link;
        if (str3 != null && !str3.contains("from=")) {
            this.f109671c.link = this.f109671c.link + "&from=from_in_app_push";
        }
        this.f140780p.mo123341b(0);
        ovm0.m166200a(this.f109682n.getContext(), this.f109671c.link);
        String str4 = pushMessageCustom.liveId;
        String str5 = pushMessageCustom.userId;
        ovm0.m166201b(str4, str5, "NA", str5.equals(pushMessageCustom.otherID), false, this.f109669a, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m161704g(View view) {
        m161703f();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m161705h(View view) {
        m161703f();
    }
}
