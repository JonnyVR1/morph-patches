package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.SVGALoader;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class v4n0 {

    /* JADX INFO: renamed from: a */
    public final bno0 f182388a;

    /* JADX INFO: renamed from: b */
    public View f182389b;

    /* JADX INFO: renamed from: c */
    public int f182390c;

    /* JADX INFO: renamed from: d */
    public TextView f182391d;

    /* JADX INFO: renamed from: e */
    public VText f182392e;

    /* JADX INFO: renamed from: f */
    public VText f182393f;

    /* JADX INFO: renamed from: g */
    public List<VDraweeView> f182394g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public TextView f182395h;

    /* JADX INFO: renamed from: i */
    public TextView f182396i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f182397j;

    /* JADX INFO: renamed from: k */
    public PushMessageCustom f182398k;

    /* JADX INFO: renamed from: l */
    public PushMessage f182399l;

    public v4n0(bno0 bno0Var, View view, int i, PushMessage pushMessage) {
        this.f182390c = 0;
        this.f182388a = bno0Var;
        this.f182389b = view;
        this.f182399l = pushMessage;
        this.f182398k = pushMessage.messageCustom;
        this.f182390c = i;
        m199715d();
        m199718g();
        PushMessageCustom pushMessageCustom = this.f182398k;
        String str = pushMessageCustom.liveId;
        String str2 = pushMessageCustom.userId;
        s4n0.m184569c(str, str2, "NA", str2.equals(pushMessageCustom.otherID), true, this.f182398k.source);
    }

    /* JADX INFO: renamed from: c */
    public final void m199714c() {
        PushMessage pushMessage = this.f182399l;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        if (TextUtils.isEmpty(pushMessage.link) || this.f182395h == null || pushMessageCustom == null) {
            return;
        }
        String str = this.f182399l.link;
        if (str != null && !str.contains("source=")) {
            this.f182399l.link = this.f182399l.link + "&source=start-push";
        }
        String str2 = this.f182399l.link;
        if (str2 != null && !str2.contains("liveMode=virtualAvatar")) {
            this.f182399l.link = this.f182399l.link + "&liveMode=virtualAvatar";
        }
        String str3 = this.f182399l.link;
        if (str3 != null && !str3.contains("from=")) {
            this.f182399l.link = this.f182399l.link + "&from=from_in_app_push";
        }
        this.f182388a.mo99019b(0);
        s4n0.m184567a(this.f182395h.getContext(), this.f182399l.link);
        String str4 = pushMessageCustom.liveId;
        String str5 = pushMessageCustom.userId;
        s4n0.m184568b(str4, str5, "NA", str5.equals(pushMessageCustom.otherID), true, this.f182390c, pushMessageCustom.source);
    }

    /* JADX INFO: renamed from: d */
    public final void m199715d() {
        this.f182391d = (TextView) this.f182389b.findViewById(ldc0.f131584o2);
        this.f182392e = (VText) this.f182389b.findViewById(ldc0.f131580n2);
        this.f182395h = (TextView) this.f182389b.findViewById(ldc0.f131515W1);
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131569l));
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131573m));
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131577n));
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131581o));
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131585p));
        this.f182394g.add((VDraweeView) this.f182389b.findViewById(ldc0.f131589q));
        this.f182396i = (TextView) this.f182389b.findViewById(ldc0.f131576m2);
        this.f182397j = (AnimEffectPlayer) this.f182389b.findViewById(ldc0.f131553h);
        this.f182393f = (VText) this.f182389b.findViewById(ldc0.f131560i2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m199716e(View view) {
        m199714c();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m199717f(View view) {
        m199714c();
    }

    /* JADX INFO: renamed from: g */
    public final void m199718g() {
        String[] strArrSplit = this.f182398k.avatars.split(Constants.SEPARATOR_COMMA);
        for (int i = 0; i < this.f182394g.size(); i++) {
            if (i < strArrSplit.length) {
                izs.m142868s("context_livingAct", this.f182394g.get(i), strArrSplit[i]);
            }
        }
        this.f182391d.setText("在线聊天室");
        this.f182392e.setText(this.f182398k.text);
        this.f182395h.setText(this.f182398k.buttonText);
        this.f182396i.setText(this.f182398k.title);
        SVGALoader.with(this.f182397j.getContext()).from("https://auto.tancdn.com/v1/raw/e90eea29-f0ff-4ceb-88b8-066d6ea743bb12.pdf").into(this.f182397j);
        this.f182393f.setText(this.f182398k.subTitle);
        bnl0.m105509E0(this.f182395h, new View.OnClickListener() { // from class: l.t4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172091a.m199716e(view);
            }
        });
        bnl0.m105509E0(this.f182389b, new View.OnClickListener() { // from class: l.u4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177477a.m199717f(view);
            }
        });
    }
}
