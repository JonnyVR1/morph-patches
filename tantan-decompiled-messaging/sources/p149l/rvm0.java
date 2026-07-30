package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.SVGALoader;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class rvm0 {

    /* JADX INFO: renamed from: a */
    public final xdo0 f161222a;

    /* JADX INFO: renamed from: b */
    public View f161223b;

    /* JADX INFO: renamed from: c */
    public int f161224c;

    /* JADX INFO: renamed from: d */
    public TextView f161225d;

    /* JADX INFO: renamed from: e */
    public VText f161226e;

    /* JADX INFO: renamed from: f */
    public VText f161227f;

    /* JADX INFO: renamed from: g */
    public List<VDraweeView> f161228g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public TextView f161229h;

    /* JADX INFO: renamed from: i */
    public TextView f161230i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f161231j;

    /* JADX INFO: renamed from: k */
    public PushMessageCustom f161232k;

    /* JADX INFO: renamed from: l */
    public PushMessage f161233l;

    public rvm0(xdo0 xdo0Var, View view, int i, PushMessage pushMessage) {
        this.f161224c = 0;
        this.f161222a = xdo0Var;
        this.f161223b = view;
        this.f161233l = pushMessage;
        this.f161232k = pushMessage.messageCustom;
        this.f161224c = i;
        m181307d();
        m181310g();
        PushMessageCustom pushMessageCustom = this.f161232k;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.userId;
        ovm0.m166202c(str, str2, "NA", str2.equals(pushMessageCustom.otherID), true, this.f161232k.source);
    }

    /* JADX INFO: renamed from: c */
    public final void m181306c() {
        PushMessage pushMessage = this.f161233l;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (TextUtils.isEmpty(pushMessage.link) || this.f161229h == null || pushMessageCustom == null) {
            return;
        }
        String str = this.f161233l.link;
        if (str != null && !str.contains("source=")) {
            this.f161233l.link = this.f161233l.link + "&source=start-push";
        }
        String str2 = this.f161233l.link;
        if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
            this.f161233l.link = this.f161233l.link + "&liveMode=virtualAvatar";
        }
        String str3 = this.f161233l.link;
        if (str3 != null && !str3.contains("from=")) {
            this.f161233l.link = this.f161233l.link + "&from=from_in_app_push";
        }
        this.f161222a.mo202774b(0);
        ovm0.m166200a(this.f161229h.getContext(), this.f161233l.link);
        String str4 = pushMessageCustom.liveId;
        String str5 = pushMessageCustom.userId;
        ovm0.m166201b(str4, str5, "NA", str5.equals(pushMessageCustom.otherID), true, this.f161224c, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: d */
    public final void m181307d() {
        this.f161225d = (TextView) this.f161223b.findViewById(f5c0.f95127o2);
        this.f161226e = (VText) this.f161223b.findViewById(f5c0.f95123n2);
        this.f161229h = (TextView) this.f161223b.findViewById(f5c0.f95058W1);
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95112l));
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95116m));
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95120n));
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95124o));
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95128p));
        this.f161228g.add((VDraweeView) this.f161223b.findViewById(f5c0.f95132q));
        this.f161230i = (TextView) this.f161223b.findViewById(f5c0.f95119m2);
        this.f161231j = (AnimEffectPlayer) this.f161223b.findViewById(f5c0.f95096h);
        this.f161227f = (VText) this.f161223b.findViewById(f5c0.f95103i2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m181308e(View view) {
        m181306c();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m181309f(View view) {
        m181306c();
    }

    /* JADX INFO: renamed from: g */
    public final void m181310g() {
        String[] strArrSplit = this.f161232k.avatars.split(Constants.SEPARATOR_COMMA);
        for (int i = 0; i < this.f161228g.size(); i++) {
            if (i < strArrSplit.length) {
                hxs.m133406s("context_livingAct", this.f161228g.get(i), strArrSplit[i]);
            }
        }
        this.f161225d.setText("在线聊天室");
        this.f161226e.setText(this.f161232k.text);
        this.f161229h.setText(this.f161232k.buttonText);
        this.f161230i.setText(this.f161232k.title);
        SVGALoader.with(this.f161231j.getContext()).from("https://auto.tancdn.com/v1/raw/e90eea29-f0ff-4ceb-88b8-066d6ea743bb12.pdf").into(this.f161231j);
        this.f161227f.setText(this.f161232k.subTitle);
        xdl0.m208329E0(this.f161229h, new View.OnClickListener() { // from class: l.pvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151493a.m181308e(view);
            }
        });
        xdl0.m208329E0(this.f161223b, new View.OnClickListener() { // from class: l.qvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156612a.m181309f(view);
            }
        });
    }
}
