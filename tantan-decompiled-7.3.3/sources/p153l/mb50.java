package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.OfficialAdvertData;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class mb50 extends o2n {
    @Override // p153l.o2n
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
        if (CoreModule.f18264c.f20301D1.getAdvertData() != null) {
            m157770m(act, viewGroup, CoreModule.f18264c.f20301D1.getAdvertData());
        } else {
            viewGroup.addView(View.inflate(act, kec0.f126113w3, null));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m157769l(String str, Act act) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            act.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m157770m(final Act act, ViewGroup viewGroup, final OfficialAdvertData officialAdvertData) {
        View viewInflate = View.inflate(act, kec0.f125336B3, null);
        viewGroup.addView(viewInflate);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70042O);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70316e5);
        TextView textView2 = (TextView) viewInflate.findViewById(adc0.f70344g);
        VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(adc0.f70666z);
        Button button = (Button) viewInflate.findViewById(adc0.f70361h);
        bnl0.m105515H0(textView, officialAdvertData.titleText);
        bnl0.m105515H0(textView2, officialAdvertData.desc);
        bnl0.m105515H0(button, officialAdvertData.buttonText);
        m157772o(vDraweeView, officialAdvertData.advertLogo);
        m157772o(vDraweeView2, officialAdvertData.advertPic);
        bnl0.m105509E0(button, new View.OnClickListener() { // from class: l.lb50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130776a.m157771n(officialAdvertData, act, view);
            }
        });
        CoreModule.f18264c.f20301D1.m184620l3(officialAdvertData.advertId);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m157771n(OfficialAdvertData officialAdvertData, Act act, View view) {
        i4g0.m138523u("e_messages_ad", "p_messages_ad", jyb.m147494Y("ixxn_ad_channel", "tantan"), jyb.m147494Y("ad_id", officialAdvertData.advertId));
        m157769l(officialAdvertData.buttonUrl, act);
    }

    /* JADX INFO: renamed from: o */
    public final void m157772o(VDraweeView vDraweeView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uqb0.f180374G.m127140Z0(vDraweeView, str);
    }
}
